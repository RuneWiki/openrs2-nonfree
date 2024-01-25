import jaggl.OpenGL;
import java.awt.Point;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Lclient!pj;Lclient!nv;)Lclient!ct;")
	public static Class52 method3603(@OriginalArg(1) Class284[] arg0, @OriginalArg(2) Class33_Sub2_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong214 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong214);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static283.anIntArray347, 0);
		if (Static283.anIntArray347[0] == 0) {
			if (Static283.anIntArray347[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static283.anIntArray347, 1);
			if (Static283.anIntArray347[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static283.anIntArray347[1]];
				OpenGL.glGetInfoLogARB(local33, Static283.anIntArray347[1], Static283.anIntArray347, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static283.anIntArray347[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg0.length; local110++) {
					OpenGL.glDetachObjectARB(local33, arg0[local110].aLong214);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class52(arg1, local33, arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!de;I)Z")
	public static boolean method3604(@OriginalArg(0) Class60 arg0) {
		return arg0 == Static596.aClass60_11 || Static342.aClass60_10 == arg0 || arg0 == Static495.aClass60_8 || Static677.aClass60_12 == arg0 || Static423.aClass60_7 == arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	public static void method3606(@OriginalArg(0) int arg0) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub4_1.method2973() == 0) {
			arg0 = -1;
		}
		if (Static308.anInt9935 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(36) Class258 local36 = Static87.aClass32_1.method1025(arg0);
			@Pc(40) Class51 local40 = local36.method5763();
			if (local40 == null) {
				arg0 = -1;
			} else {
				Static239.aClass207_2.method4576(local40.method1658(), Static17.aCanvas1, new Point(local36.anInt6619, local36.anInt6621), local40.method1663(), local40.method1653());
				Static308.anInt9935 = arg0;
			}
		}
		if (arg0 == -1 && Static308.anInt9935 != -1) {
			Static239.aClass207_2.method4576((int[]) null, Static17.aCanvas1, new Point(), -1, -1);
			Static308.anInt9935 = -1;
		}
	}
}
