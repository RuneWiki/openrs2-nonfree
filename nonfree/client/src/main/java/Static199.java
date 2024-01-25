import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!id", name = "e", descriptor = "I")
	public static int anInt4472;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt4475;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
	public static boolean aBoolean327 = false;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method3745() {
		@Pc(1) Class125 local1 = Static145.aClass125_24;
		synchronized (Static145.aClass125_24) {
			Static145.aClass125_24.method3521();
		}
		local1 = Static388.aClass125_57;
		synchronized (Static388.aClass125_57) {
			Static388.aClass125_57.method3521();
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method3746() {
		if (Static343.aFloat198 < 1024.0F) {
			Static343.aFloat198 = 1024.0F;
		}
		if (Static343.aFloat198 > 3072.0F) {
			Static343.aFloat198 = 3072.0F;
		}
		while (Static487.aFloat258 >= 16384.0F) {
			Static487.aFloat258 -= 16384.0F;
		}
		while (Static487.aFloat258 < 0.0F) {
			Static487.aFloat258 += 16384.0F;
		}
		@Pc(41) int local41 = Static8.anInt583 >> 9;
		@Pc(50) int local50 = Static366.anInt6836 >> 9;
		@Pc(56) int local56 = Static58.method1166(Static366.anInt6836, Static8.anInt583, Static420.anInt7829);
		@Pc(58) int local58 = 0;
		@Pc(84) int local84;
		if (local41 > 3 && local50 > 3 && local41 < Static118.anInt2527 - 4 && local50 < Static549.anInt9482 - 4) {
			for (local84 = local41 - 4; local84 <= local41 + 4; local84++) {
				for (@Pc(90) int local90 = local50 - 4; local90 <= local50 + 4; local90++) {
					@Pc(94) int local94 = Static420.anInt7829;
					if (local94 < 3 && Static307.method4073(local84, local90)) {
						local94++;
					}
					@Pc(105) int local105 = 0;
					if (Static143.aClass85_Sub1_1.aByteArrayArrayArray11 != null && Static143.aClass85_Sub1_1.aByteArrayArrayArray11[local94] != null) {
						local105 = (Static143.aClass85_Sub1_1.aByteArrayArrayArray11[local94][local84][local90] & 0xFF) * 8;
					}
					@Pc(138) int local138 = local56 + local105 - Static511.aClass52Array3[local94].JA(local84, local90);
					if (local138 > local58) {
						local58 = local138;
					}
				}
			}
		}
		local84 = (local58 >> 2) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (local84 > Static70.anInt577) {
			Static70.anInt577 += (local84 - Static70.anInt577) / 24;
		} else if (Static70.anInt577 > local84) {
			Static70.anInt577 += (local84 - Static70.anInt577) / 80;
		}
	}
}
