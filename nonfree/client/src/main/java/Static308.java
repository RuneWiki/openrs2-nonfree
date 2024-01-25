import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([[[Lclient!q;B)V")
	public static void method5062(@OriginalArg(0) Class291[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class291[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class291 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass15_Sub3_Sub5_1 instanceof Interface23) {
							((Interface23) local31.aClass15_Sub3_Sub5_1).method9453();
						}
						if (local31.aClass15_Sub3_Sub1_1 instanceof Interface23) {
							((Interface23) local31.aClass15_Sub3_Sub1_1).method9453();
						}
						if (local31.aClass15_Sub3_Sub1_2 instanceof Interface23) {
							((Interface23) local31.aClass15_Sub3_Sub1_2).method9453();
						}
						if (local31.aClass15_Sub3_Sub4_1 instanceof Interface23) {
							((Interface23) local31.aClass15_Sub3_Sub4_1).method9453();
						}
						if (local31.aClass15_Sub3_Sub4_2 instanceof Interface23) {
							((Interface23) local31.aClass15_Sub3_Sub4_2).method9453();
						}
						for (@Pc(81) Class27 local81 = local31.aClass27_3; local81 != null; local81 = local81.aClass27_1) {
							@Pc(86) Class15_Sub3_Sub3 local86 = local81.aClass15_Sub3_Sub3_1;
							if (local86 instanceof Interface23) {
								((Interface23) local86).method9453();
							}
						}
					}
				}
			}
		}
	}
}
