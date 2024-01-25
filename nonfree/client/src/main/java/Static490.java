import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sq", name = "O", descriptor = "I")
	public static int anInt8280;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "F")
	public static float aFloat210 = 1.0F;

	@OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
	public static int anInt8273 = 0;

	@OriginalMember(owner = "client!sq", name = "R", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(B)V")
	public static void method6894() {
		for (@Pc(11) int local11 = 0; local11 < Static113.anInt2286; local11++) {
			@Pc(17) Class177 local17 = Static450.aClass177Array1[local11];
			if (local17.aByte67 == 3) {
				if (local17.aClass1_Sub8_Sub1_1 == null) {
					local17.anInt4726 = Integer.MIN_VALUE;
				} else {
					Static298.aClass1_Sub8_Sub4_2.method6033(local17.aClass1_Sub8_Sub1_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "(I)V")
	public static void method6895(@OriginalArg(0) int arg0) {
		Static195.anInt3996 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static446.anInt7725; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static218.anInt4229; local6++) {
				if (Static118.aClass293ArrayArrayArray14[arg0][local3][local6] == null) {
					Static118.aClass293ArrayArrayArray14[arg0][local3][local6] = new Class293(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(BLclient!ag;[Lclient!vk;)Lclient!te;")
	public static Class309 method6896(@OriginalArg(1) Class12_Sub1 arg0, @OriginalArg(2) Class344[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong402 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg1.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg1[local33].aLong402);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static187.anIntArray434, 0);
		if (Static187.anIntArray434[0] == 0) {
			if (Static187.anIntArray434[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static187.anIntArray434, 1);
			if (Static187.anIntArray434[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static187.anIntArray434[1]];
				OpenGL.glGetInfoLogARB(local31, Static187.anIntArray434[1], Static187.anIntArray434, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static187.anIntArray434[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg1.length; local110++) {
					OpenGL.glDetachObjectARB(local31, arg1[local110].aLong402);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class309(arg0, local31, arg1);
	}
}
