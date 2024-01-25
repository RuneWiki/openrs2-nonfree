import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!t", name = "h", descriptor = "Lclient!ri;")
	public static Class214 aClass214_229;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_228 = new Class214(100, -2);

	@OriginalMember(owner = "client!t", name = "m", descriptor = "[I")
	public static final int[] anIntArray386 = new int[1000];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIII)I")
	public static int method4847(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static357.aByteArrayArrayArray11[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static357.aByteArrayArrayArray11[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)Z")
	public static boolean method4849() {
		try {
			return Static318.method4106();
		} catch (@Pc(13) IOException local13) {
			Static362.method4701();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(78) String local78 = "T2 - " + (Static175.aClass214_107 == null ? -1 : Static175.aClass214_107.method4416()) + "," + (Static418.aClass214_243 == null ? -1 : Static418.aClass214_243.method4416()) + "," + (aClass214_229 == null ? -1 : aClass214_229.method4416()) + " - " + Static329.anInt5393 + "," + (Static101.anInt6646 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray370[0]) + "," + (Static278.anInt4392 + Static239.aClass20_Sub3_Sub3_Sub1_1.anIntArray369[0]) + " - ";
			for (@Pc(80) int local80 = 0; Static329.anInt5393 > local80 && local80 < 50; local80++) {
				local78 = local78 + Static154.aClass1_Sub11_Sub1_3.aByteArray64[local80] + ",";
			}
			Static211.method2815(local18, local78);
			Static252.method2868();
			return true;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BBIIII)V")
	public static void method4850(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(15) int local15 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg3 - arg1 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(24) int local24 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg0[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			arg2 = local34 + 1;
			arg0[local34] = 1;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/lang/String;Lclient!od;IB)Lclient!lv;")
	public static Class153 method4853(@OriginalArg(0) String arg0, @OriginalArg(1) Class128_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static229.anIntArray197, 0);
		if (Static229.anIntArray197[0] == 0) {
			if (Static229.anIntArray197[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static229.anIntArray197, 1);
			if (Static229.anIntArray197[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static229.anIntArray197[1]];
				OpenGL.glGetInfoLogARB(local6, Static229.anIntArray197[1], Static229.anIntArray197, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static229.anIntArray197[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class153(arg1, local6, arg2);
	}
}
