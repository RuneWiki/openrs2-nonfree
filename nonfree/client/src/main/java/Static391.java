import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	public static int anInt7118;

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
	public static int anInt7128;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
	public static int anInt7123 = -1;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "Lclient!ud;")
	public static final Class225 aClass225_4 = new Class225("WIP", 2);

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public static void method6122() {
		if (Static175.anInt3717 == 2) {
			Static199.anInt4131 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static199.anInt4131 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
	public static void method6123() {
		if (Static383.anInt6966 < 0) {
			return;
		}
		@Pc(17) long local17 = Static101.method1805();
		Static383.anInt6966 = (int) ((long) Static383.anInt6966 + Static211.aLong128 - local17);
		if (Static383.anInt6966 <= 0) {
			Static383.anInt6966 = -1;
			Static195.aFloat48 = Static279.aClass189_1.aFloat56;
			Static297.aFloat62 = Static279.aClass189_1.aFloat60;
			Static226.anInt4567 = Static279.aClass189_1.anInt5257;
			Static100.anInt2240 = Static279.aClass189_1.anInt5254;
			Static268.aFloat54 = Static279.aClass189_1.aFloat57;
			Static153.anInt3208 = Static279.aClass189_1.anInt5255;
			Static312.aFloat69 = Static279.aClass189_1.aFloat61;
			Static274.aFloat55 = Static279.aClass189_1.aFloat59;
			Static111.aFloat9 = Static279.aClass189_1.aFloat58;
			Static382.aClass10_4 = Static279.aClass189_1.aClass10_3;
		} else {
			@Pc(68) int local68 = (Static383.anInt6966 << 8) / Static372.anInt6828;
			@Pc(73) int local73 = 255 - local68;
			@Pc(78) float local78 = (float) local68 / 255.0F;
			Static153.anInt3208 = (local73 * (Static279.aClass189_1.anInt5255 & 0xFF00) + local68 * (Static59.anInt1262 & 0xFF00) & 0xFF0000) + ((Static59.anInt1262 & 0xFF00FF) * local68 + (Static279.aClass189_1.anInt5255 & 0xFF00FF) * local73 & 0xFF00FF00) >>> 8;
			@Pc(114) float local114 = 1.0F - local78;
			Static312.aFloat69 = (Static279.aClass189_1.aFloat61 - Static344.aFloat73) * local114 + Static344.aFloat73;
			Static195.aFloat48 = (Static279.aClass189_1.aFloat56 - Static251.aFloat53) * local114 + Static251.aFloat53;
			Static100.anInt2240 = local73 * Static279.aClass189_1.anInt5254 + local68 * Static335.anInt6209 >> 8;
			Static274.aFloat55 = Static47.aFloat3 + local114 * (Static279.aClass189_1.aFloat59 - Static47.aFloat3);
			Static226.anInt4567 = (local73 * (Static279.aClass189_1.anInt5257 & 0xFF00) + local68 * (Static266.anInt5035 & 0xFF00) & 0xFF0000) + (local73 * (Static279.aClass189_1.anInt5257 & 0xFF00FF) + (Static266.anInt5035 & 0xFF00FF) * local68 & 0xFF00FF00) >>> 8;
			Static297.aFloat62 = local114 * (Static279.aClass189_1.aFloat60 - Static190.aFloat47) + Static190.aFloat47;
			Static111.aFloat9 = (Static279.aClass189_1.aFloat58 - Static374.aFloat76) * local114 + Static374.aFloat76;
			Static268.aFloat54 = Static322.aFloat70 + (Static279.aClass189_1.aFloat57 - Static322.aFloat70) * local114;
			if (Static7.aClass10_1 != Static279.aClass189_1.aClass10_3) {
				Static382.aClass10_4 = Static92.aClass48_5.method2506(Static7.aClass10_1, Static279.aClass189_1.aClass10_3, local114, Static382.aClass10_4);
			}
		}
		Static211.aLong128 = local17;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I")
	public static int method6125(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}
}
