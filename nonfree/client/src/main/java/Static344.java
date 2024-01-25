import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public static int anInt5509;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
	public static final int anInt5515 = 1403;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!vaa;[BII)Lclient!bea;")
	public static Class32 method4898(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static297.anIntArray346, 0);
		if (Static297.anIntArray346[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class32(arg0, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B[[[Lclient!tr;)V")
	public static void method4899(@OriginalArg(1) Class364[][][] arg0) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class364[][] local16 = arg0[local10];
			for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
				for (@Pc(22) int local22 = 0; local22 < local16[local18].length; local22++) {
					@Pc(30) Class364 local30 = local16[local18][local22];
					if (local30 != null) {
						if (local30.aClass9_Sub1_Sub4_1 instanceof Interface9) {
							((Interface9) local30.aClass9_Sub1_Sub4_1).method9103();
						}
						if (local30.aClass9_Sub1_Sub3_2 instanceof Interface9) {
							((Interface9) local30.aClass9_Sub1_Sub3_2).method9103();
						}
						if (local30.aClass9_Sub1_Sub3_1 instanceof Interface9) {
							((Interface9) local30.aClass9_Sub1_Sub3_1).method9103();
						}
						if (local30.aClass9_Sub1_Sub2_2 instanceof Interface9) {
							((Interface9) local30.aClass9_Sub1_Sub2_2).method9103();
						}
						if (local30.aClass9_Sub1_Sub2_1 instanceof Interface9) {
							((Interface9) local30.aClass9_Sub1_Sub2_1).method9103();
						}
						for (@Pc(92) Class181 local92 = local30.aClass181_3; local92 != null; local92 = local92.aClass181_2) {
							@Pc(97) Class9_Sub1_Sub1 local97 = local92.aClass9_Sub1_Sub1_1;
							if (local97 instanceof Interface9) {
								((Interface9) local97).method9103();
							}
						}
					}
				}
			}
		}
	}
}
