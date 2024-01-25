import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aq", name = "N", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!lm;Lclient!lm;B)I")
	public static int method297(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class134 arg1) {
		@Pc(13) int local13 = 0;
		if (arg1.method3005(Static142.anInt2786)) {
			local13++;
		}
		if (arg1.method3005(Static223.anInt1488)) {
			local13++;
		}
		if (arg1.method3005(Static117.anInt2266)) {
			local13++;
		}
		if (arg0.method3005(Static142.anInt2786)) {
			local13++;
		}
		if (arg0.method3005(Static223.anInt1488)) {
			local13++;
		}
		if (arg0.method3005(Static117.anInt2266)) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(II)V")
	public static void method298(@OriginalArg(1) int arg0) {
		if (Static261.anInt5376 == arg0) {
			return;
		}
		if (Static261.anInt5376 == 0) {
			Static121.method3649();
		}
		if (arg0 == 40) {
			Static48.method954();
		}
		if (arg0 != 40 && Static148.aClass202_4 != null) {
			Static148.aClass202_4.method5477();
			Static148.aClass202_4 = null;
		}
		if (Static261.anInt5376 == 25 || Static261.anInt5376 == 28) {
			Static137.aClass134_128.anInt3576 = 2;
			Static184.aClass134_87.anInt3576 = 2;
			Static94.aClass134_41.anInt3576 = 2;
			Class10_Sub1_Sub4.lb.anInt3576 = 2;
			Static37.aClass134_18.anInt3576 = 2;
			Static233.aClass134_111.anInt3576 = 2;
			Static55.aClass134_29.anInt3576 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static37.anInt997 = 0;
			Static38.anInt3166 = 0;
			Static203.anInt4294 = 1;
			Static73.anInt957 = 0;
			Static293.anInt5898 = 1;
			Static353.method5842(true);
			Static137.aClass134_128.anInt3576 = 1;
			Static184.aClass134_87.anInt3576 = 1;
			Static94.aClass134_41.anInt3576 = 1;
			Class10_Sub1_Sub4.lb.anInt3576 = 1;
			Static37.aClass134_18.anInt3576 = 1;
			Static233.aClass134_111.anInt3576 = 1;
			Static55.aClass134_29.anInt3576 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static73.method746();
		}
		if (arg0 == 5) {
			Static120.method1952(Static217.aClass105_5, Static125.aClass134_55);
		} else {
			Static40.method852();
		}
		@Pc(145) boolean local145 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(158) boolean local158 = Static261.anInt5376 == 5 || Static261.anInt5376 == 10 || Static261.anInt5376 == 28;
		if (local145 != local158) {
			if (local145) {
				Static248.anInt28 = Static107.anInt2045;
				if (Static4.anInt39 == 0) {
					Static284.method4996();
				} else {
					Static148.method2613(Static88.aClass134_38, 255, Static107.anInt2045);
				}
				Static114.aClass154_1.method4099(false);
			} else {
				Static284.method4996();
				Static114.aClass154_1.method4099(true);
				if (Static137.aClass63_2 != null) {
					Static137.aClass63_2.method1310();
					Static137.aClass63_2 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static217.aClass105_5.method4284();
		}
		Static261.anInt5376 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)V")
	public static void method299() {
		if (Static286.anInt5734 < 0) {
			return;
		}
		@Pc(8) long local8 = Static292.method5114();
		Static286.anInt5734 = (int) ((long) Static286.anInt5734 + Static256.aLong158 - local8);
		if (Static286.anInt5734 > 0) {
			@Pc(25) int local25 = (Static286.anInt5734 << 8) / Static89.anInt1702;
			@Pc(29) int local29 = 255 - local25;
			@Pc(34) float local34 = (float) local25 / 255.0F;
			@Pc(38) float local38 = 1.0F - local34;
			Static251.anInt5192 = ((Static109.aClass172_2.anInt5227 & 0xFF00) * local29 + local25 * (Static257.anInt5266 & 0xFF00) & 0xFF0000) + ((Static109.aClass172_2.anInt5227 & 0xFF00FF) * local29 + (Static257.anInt5266 & 0xFF00FF) * local25 & 0xFF00FF00) >>> 8;
			Static266.aFloat72 = local38 * (Static109.aClass172_2.aFloat62 - Static37.aFloat2) + Static37.aFloat2;
			Static127.aFloat16 = local38 * (Static109.aClass172_2.aFloat64 - Static273.aFloat73) + Static273.aFloat73;
			Static266.aFloat71 = local38 * (Static109.aClass172_2.aFloat61 - Static280.aFloat74) + Static280.aFloat74;
			Static41.aFloat3 = Static121.aFloat56 + (Static109.aClass172_2.aFloat63 - Static121.aFloat56) * local38;
			Static97.anInt1883 = (local29 * (Static109.aClass172_2.anInt5222 & 0xFF00) + (Static153.anInt3150 & 0xFF00) * local25 & 0xFF0000) + ((Static109.aClass172_2.anInt5222 & 0xFF00FF) * local29 + local25 * (Static153.anInt3150 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static295.aFloat75 = Static50.aFloat4 + local38 * (Static109.aClass172_2.aFloat60 - Static50.aFloat4);
			Static64.anInt1438 = Static109.aClass172_2.anInt5217 * local29 + Static197.anInt4153 * local25 >> 8;
			Static37.aFloat1 = Static304.aFloat76 + (Static109.aClass172_2.aFloat59 - Static304.aFloat76) * local38;
			if (Static272.aClass78_5 != Static109.aClass172_2.aClass78_6) {
				Static183.aClass78_4 = Static152.aClass105_9.method4221(Static272.aClass78_5, Static109.aClass172_2.aClass78_6, local38, Static183.aClass78_4);
			}
		} else {
			Static266.aFloat71 = Static109.aClass172_2.aFloat61;
			Static97.anInt1883 = Static109.aClass172_2.anInt5222;
			Static37.aFloat1 = Static109.aClass172_2.aFloat59;
			Static183.aClass78_4 = Static109.aClass172_2.aClass78_6;
			Static127.aFloat16 = Static109.aClass172_2.aFloat64;
			Static286.anInt5734 = -1;
			Static295.aFloat75 = Static109.aClass172_2.aFloat60;
			Static64.anInt1438 = Static109.aClass172_2.anInt5217;
			Static266.aFloat72 = Static109.aClass172_2.aFloat62;
			Static41.aFloat3 = Static109.aClass172_2.aFloat63;
			Static251.anInt5192 = Static109.aClass172_2.anInt5227;
		}
		Static256.aLong158 = local8;
	}
}
