import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!fc;")
	public static Class71 aClass71_41;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public static int anInt2982 = -1;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!km;)V")
	public static void method2721(@OriginalArg(0) Class82 arg0) {
		for (@Pc(1) int local1 = Static201.anInt4804; local1 < Static32.anInt6037; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static166.anInt2967; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static244.anInt1024; local7++) {
					@Pc(16) Class227 local16 = Static297.aClass227ArrayArrayArray7[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class12_Sub2 local21 = local16.aClass12_Sub2_2;
						@Pc(24) Class12_Sub2 local24 = local16.aClass12_Sub2_3;
						if (local21 != null && local21.method5455()) {
							Static304.method2119(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5455()) {
								Static304.method2119(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5454(0, arg0, 0, false, 0, local21);
								local24.method5456();
							}
							local21.method5456();
						}
						for (@Pc(70) Class164 local70 = local16.aClass164_25; local70 != null; local70 = local70.aClass164_19) {
							@Pc(74) Class12_Sub1 local74 = local70.aClass12_Sub1_2;
							if (local74 != null && local74.method5455()) {
								Static304.method2119(arg0, local74, local1, local4, local7, local74.aShort96 + 1 - local74.aShort97, local74.aShort95 - local74.aShort94 + 1);
								local74.method5456();
							}
						}
						@Pc(111) Class12_Sub5 local111 = local16.aClass12_Sub5_2;
						if (local111 != null && local111.method5455()) {
							Static245.method3906(arg0, local111, local1, local4, local7);
							local111.method5456();
						}
					}
				}
			}
		}
	}
}
