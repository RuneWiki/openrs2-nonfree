import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public static int anInt404 = 0;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
	public static boolean aBoolean33 = true;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method252(@OriginalArg(0) Class26 arg0) {
		for (@Pc(1) int local1 = Static351.anInt6183; local1 < Static58.anInt1578; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static86.anInt2009; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static360.anInt6340; local7++) {
					@Pc(16) Class113 local16 = Static176.aClass113ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub4 local21 = local16.aClass4_Sub4_2;
						@Pc(24) Class4_Sub4 local24 = local16.aClass4_Sub4_1;
						if (local21 != null && local21.method5891()) {
							Static220.method3392(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5891()) {
								Static220.method3392(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5892(0, arg0, local21, 0, 0, false);
								local24.method5889();
							}
							local21.method5889();
						}
						for (@Pc(70) Class134 local70 = local16.aClass134_1; local70 != null; local70 = local70.aClass134_2) {
							@Pc(74) Class4_Sub2 local74 = local70.aClass4_Sub2_1;
							if (local74 != null && local74.method5891()) {
								Static220.method3392(arg0, local74, local1, local4, local7, local74.aShort87 + 1 - local74.aShort88, local74.aShort86 - local74.aShort89 + 1);
								local74.method5889();
							}
						}
						@Pc(111) Class4_Sub3 local111 = local16.aClass4_Sub3_1;
						if (local111 != null && local111.method5891()) {
							Static323.method4621(arg0, local111, local1, local4, local7);
							local111.method5889();
						}
					}
				}
			}
		}
	}
}
