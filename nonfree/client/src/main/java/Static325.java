import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
	public static int anInt5630;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_140 = new Class251(56, -1);

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "[I")
	public static final int[] anIntArray317 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
	public static int anInt5631 = -1;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[[[Lclient!dv;)V")
	public static void method5095(@OriginalArg(1) Class89[][][] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			@Pc(18) Class89[][] local18 = arg0[local5];
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				for (@Pc(23) int local23 = 0; local23 < local18[local20].length; local23++) {
					@Pc(30) Class89 local30 = local18[local20][local23];
					if (local30 != null) {
						if (local30.aClass4_Sub3_Sub2_1 instanceof Interface16) {
							((Interface16) local30.aClass4_Sub3_Sub2_1).method9500();
						}
						if (local30.aClass4_Sub3_Sub5_1 instanceof Interface16) {
							((Interface16) local30.aClass4_Sub3_Sub5_1).method9500();
						}
						if (local30.aClass4_Sub3_Sub5_2 instanceof Interface16) {
							((Interface16) local30.aClass4_Sub3_Sub5_2).method9500();
						}
						if (local30.aClass4_Sub3_Sub1_1 instanceof Interface16) {
							((Interface16) local30.aClass4_Sub3_Sub1_1).method9500();
						}
						if (local30.aClass4_Sub3_Sub1_2 instanceof Interface16) {
							((Interface16) local30.aClass4_Sub3_Sub1_2).method9500();
						}
						for (@Pc(92) Class58 local92 = local30.aClass58_2; local92 != null; local92 = local92.aClass58_1) {
							@Pc(96) Class4_Sub3_Sub3 local96 = local92.aClass4_Sub3_Sub3_1;
							if (local96 instanceof Interface16) {
								((Interface16) local96).method9500();
							}
						}
					}
				}
			}
		}
	}
}
