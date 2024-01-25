import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "Lclient!wca;")
	public static Class234_Sub1 aClass234_Sub1_1;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!ov;")
	public static Class261 aClass261_2;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method3206() {
		@Pc(7) int local7 = Static75.anInt1461;
		@Pc(9) int[] local9 = Static167.anIntArray145;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class11_Sub1_Sub1_Sub3_Sub1 local24 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt7571 > 0) {
				local24.anInt7571--;
				if (local24.anInt7571 == 0) {
					local24.aString86 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static306.anInt4911; local53++) {
			@Pc(60) long local60 = (long) Static11.anIntArray12[local53];
			@Pc(66) Class1_Sub33 local66 = (Class1_Sub33) Static372.aClass91_30.method2271(local60);
			if (local66 != null) {
				@Pc(71) Class11_Sub1_Sub1_Sub3_Sub2 local71 = local66.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				if (local71.anInt7571 > 0) {
					local71.anInt7571--;
					if (local71.anInt7571 == 0) {
						local71.aString86 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!lj;[Lclient!n;)Lclient!wba;")
	public static Class355 method3208(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) Class230[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong150 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg1.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg1[local31].aLong150);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static155.anIntArray131, 0);
		if (Static155.anIntArray131[0] == 0) {
			if (Static155.anIntArray131[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static155.anIntArray131, 1);
			if (Static155.anIntArray131[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static155.anIntArray131[1]];
				OpenGL.glGetInfoLogARB(local29, Static155.anIntArray131[1], Static155.anIntArray131, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static155.anIntArray131[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg1.length; local110++) {
					OpenGL.glDetachObjectARB(local29, arg1[local110].aLong150);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class355(arg0, local29, arg1);
	}
}
