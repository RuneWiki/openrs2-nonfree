import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt804;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_19 = new Class265(78, 2);

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V")
	public static void method713() {
		if (Static287.aFloat74 < 1024.0F) {
			Static287.aFloat74 = 1024.0F;
		}
		while (Static202.aFloat62 >= 16384.0F) {
			Static202.aFloat62 -= 16384.0F;
		}
		if (Static287.aFloat74 > 3072.0F) {
			Static287.aFloat74 = 3072.0F;
		}
		while (Static202.aFloat62 < 0.0F) {
			Static202.aFloat62 += 16384.0F;
		}
		@Pc(46) int local46 = Static290.anInt5208 >> 7;
		@Pc(50) int local50 = Static335.anInt941 >> 7;
		@Pc(56) int local56 = Static85.method1695(Static383.anInt6436, Static335.anInt941, Static290.anInt5208);
		@Pc(58) int local58 = 0;
		@Pc(84) int local84;
		if (local46 > 3 && local50 > 3 && local46 < Static229.anInt4427 - 4 && Static379.anInt6422 - 4 > local50) {
			for (local84 = local46 - 4; local84 <= local46 + 4; local84++) {
				for (@Pc(90) int local90 = local50 - 4; local90 <= local50 + 4; local90++) {
					@Pc(94) int local94 = Static383.anInt6436;
					if (local94 < 3 && Static40.method645(local90, local84)) {
						local94++;
					}
					@Pc(105) int local105 = 0;
					if (Static55.aClass23_Sub1_1.aByteArrayArrayArray16 != null && Static55.aClass23_Sub1_1.aByteArrayArrayArray16[local94] != null) {
						local105 = (Static55.aClass23_Sub1_1.aByteArrayArrayArray16[local94][local84][local90] & 0xFF) * 8;
					}
					@Pc(138) int local138 = local56 + local105 - Static58.aClass64Array1[local94].l(local84, local90);
					if (local58 < local138) {
						local58 = local138;
					}
				}
			}
		}
		local84 = (local58 >> 0) * 1536;
		if (local84 > 786432) {
			local84 = 786432;
		}
		if (local84 < 262144) {
			local84 = 262144;
		}
		if (local84 > Static4.anInt120) {
			Static4.anInt120 += (local84 - Static4.anInt120) / 24;
		} else if (local84 < Static4.anInt120) {
			Static4.anInt120 += (local84 - Static4.anInt120) / 80;
		}
	}
}
