import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!ui;")
	public static Class230 aClass230_49;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_111 = new Class48(12, 6);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method2659() {
		if (Static258.anInt4474 < 0) {
			return;
		}
		@Pc(11) long local11 = Static378.method5293();
		Static258.anInt4474 = (int) ((long) Static258.anInt4474 + Static163.aLong92 - local11);
		if (Static258.anInt4474 <= 0) {
			Static123.aFloat62 = Static299.aClass161_4.aFloat31;
			Static192.aFloat23 = Static299.aClass161_4.aFloat29;
			Static196.anInt3485 = Static299.aClass161_4.anInt3907;
			Static382.aFloat81 = Static299.aClass161_4.aFloat26;
			Static240.aFloat32 = Static299.aClass161_4.aFloat28;
			Static34.aClass16_1 = Static299.aClass161_4.aClass16_4;
			Static251.aFloat55 = Static299.aClass161_4.aFloat30;
			Static188.anInt3286 = Static299.aClass161_4.anInt3901;
			Static258.anInt4474 = -1;
			Static344.aFloat64 = Static299.aClass161_4.aFloat27;
			Static1.anInt7 = Static299.aClass161_4.anInt3904;
		} else {
			@Pc(62) int local62 = (Static258.anInt4474 << 8) / Static25.anInt393;
			@Pc(67) int local67 = 255 - local62;
			@Pc(72) float local72 = (float) local62 / 255.0F;
			Static1.anInt7 = ((Static299.aClass161_4.anInt3904 & 0xFF00) * local67 + (Static209.anInt3637 & 0xFF00) * local62 & 0xFF0000) + ((Static299.aClass161_4.anInt3904 & 0xFF00FF) * local67 + (Static209.anInt3637 & 0xFF00FF) * local62 & 0xFF00FF00) >>> 8;
			@Pc(109) float local109 = 1.0F - local72;
			Static192.aFloat23 = (Static299.aClass161_4.aFloat29 - Static251.aFloat56) * local109 + Static251.aFloat56;
			Static123.aFloat62 = local109 * (Static299.aClass161_4.aFloat31 - Static130.aFloat12) + Static130.aFloat12;
			Static196.anInt3485 = ((Static299.aClass161_4.anInt3907 & 0xFF00FF) * local67 + local62 * (Static312.anInt5339 & 0xFF00FF) & 0xFF00FF00) + (local67 * (Static299.aClass161_4.anInt3907 & 0xFF00) + (Static312.anInt5339 & 0xFF00) * local62 & 0xFF0000) >>> 8;
			Static240.aFloat32 = (Static299.aClass161_4.aFloat28 - Static317.aFloat63) * local109 + Static317.aFloat63;
			Static251.aFloat55 = Static253.aFloat57 + local109 * (Static299.aClass161_4.aFloat30 - Static253.aFloat57);
			Static382.aFloat81 = Static113.aFloat10 + local109 * (Static299.aClass161_4.aFloat26 - Static113.aFloat10);
			Static344.aFloat64 = local109 * (Static299.aClass161_4.aFloat27 - Static60.aFloat3) + Static60.aFloat3;
			Static188.anInt3286 = local67 * Static299.aClass161_4.anInt3901 + Static61.anInt1235 * local62 >> 8;
			if (Static151.aClass16_3 != Static299.aClass161_4.aClass16_4) {
				Static34.aClass16_1 = Static330.aClass164_8.method5342(Static151.aClass16_3, Static299.aClass161_4.aClass16_4, local109, Static34.aClass16_1);
			}
		}
		Static163.aLong92 = local11;
	}
}
