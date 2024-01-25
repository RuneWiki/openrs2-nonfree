import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pu", name = "U", descriptor = "Lclient!pc;")
	public static Class188 aClass188_82;

	@OriginalMember(owner = "client!pu", name = "L", descriptor = "Lclient!cr;")
	public static Class41 aClass41_11 = null;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "Lclient!mm;")
	public static Class2_Sub20_Sub2 aClass2_Sub20_Sub2_2 = new Class2_Sub20_Sub2(8192);

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "(I)V")
	public static void method4416() {
		if (Static328.aFloat179 < 1024.0F) {
			Static328.aFloat179 = 1024.0F;
		}
		while (Static203.aFloat130 >= 16384.0F) {
			Static203.aFloat130 -= 16384.0F;
		}
		if (Static328.aFloat179 > 3072.0F) {
			Static328.aFloat179 = 3072.0F;
		}
		while (Static203.aFloat130 < 0.0F) {
			Static203.aFloat130 += 16384.0F;
		}
		@Pc(41) int local41 = Static349.anInt6145 >> 7;
		@Pc(45) int local45 = Static177.anInt3430 >> 7;
		@Pc(51) int local51 = Static66.method1200(Static301.anInt5383, Static349.anInt6145, Static177.anInt3430);
		@Pc(53) int local53 = 0;
		@Pc(77) int local77;
		if (local41 > 3 && local45 > 3 && Static81.anInt1950 - 4 > local41 && Static171.anInt3288 - 4 > local45) {
			for (local77 = local41 - 4; local77 <= local41 + 4; local77++) {
				for (@Pc(83) int local83 = local45 - 4; local83 <= local45 + 4; local83++) {
					@Pc(87) int local87 = Static301.anInt5383;
					if (local87 < 3 && Static173.method2713(local83, local77)) {
						local87++;
					}
					@Pc(98) int local98 = 0;
					if (Static123.aClass33_Sub1_1.aByteArrayArrayArray9 != null && Static123.aClass33_Sub1_1.aByteArrayArrayArray9[local87] != null) {
						local98 = (Static123.aClass33_Sub1_1.aByteArrayArrayArray9[local87][local77][local83] & 0xFF) * 8;
					}
					@Pc(131) int local131 = local51 + local98 - Static372.aClass106Array11[local87].I(local77, local83);
					if (local131 > local53) {
						local53 = local131;
					}
				}
			}
		}
		local77 = (local53 >> 0) * 1536;
		if (local77 > 786432) {
			local77 = 786432;
		}
		if (local77 < 262144) {
			local77 = 262144;
		}
		if (local77 > Static153.anInt2938) {
			Static153.anInt2938 += (local77 - Static153.anInt2938) / 24;
		} else if (local77 < Static153.anInt2938) {
			Static153.anInt2938 += (local77 - Static153.anInt2938) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!hq;IB)V")
	public static void method4417(@OriginalArg(0) Class2_Sub20_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static390.anInt6850 = 0;
		Static441.aBoolean660 = false;
		Static126.method1844(arg0);
		Static388.method5359(arg0);
		if (Static441.aBoolean660) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt4608 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4608 + " psize:" + arg1);
		}
	}
}
