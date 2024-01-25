import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	public static void method6002() {
		if (Static311.aFrame2 != null) {
			return;
		}
		@Pc(14) Container local14;
		if (Static92.aFrame1 != null) {
			local14 = Static92.aFrame1;
		} else if (Static533.anApplet4 == null) {
			local14 = Static498.anApplet_Sub1_1;
		} else {
			local14 = Static533.anApplet4;
		}
		Static56.anInt1315 = local14.getSize().width;
		Static224.anInt4385 = local14.getSize().height;
		@Pc(36) Insets local36;
		if (local14 == Static92.aFrame1) {
			local36 = Static92.aFrame1.getInsets();
			Static224.anInt4385 -= local36.bottom + local36.top;
			Static56.anInt1315 -= local36.right + local36.left;
		}
		if (Static294.method4660() == 1) {
			Static26.anInt8939 = (Static56.anInt1315 - Static1.anInt7) / 2;
			Static447.anInt7372 = Static283.anInt2480;
			Static212.anInt4225 = 0;
			Static318.anInt5754 = Static1.anInt7;
		} else {
			Static435.method6111();
		}
		if (Static559.aClass173_9 != Static555.aClass173_8) {
			@Pc(85) boolean local85;
			if (Static318.anInt5754 < 1024 && Static447.anInt7372 < 768) {
				local85 = true;
			} else {
				local85 = false;
			}
		}
		Static347.aCanvas9.setSize(Static318.anInt5754, Static447.anInt7372);
		if (Static4.aClass43_1 != null) {
			Static4.aClass43_1.method7209(Static347.aCanvas9);
		}
		if (Static92.aFrame1 == local14) {
			local36 = Static92.aFrame1.getInsets();
			Static347.aCanvas9.setLocation(Static26.anInt8939 + local36.left, local36.top + Static212.anInt4225);
		} else {
			Static347.aCanvas9.setLocation(Static26.anInt8939, Static212.anInt4225);
		}
		if (Static307.anInt5578 != -1) {
			Static517.method6895(true);
		}
		Static572.method6782();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!cd;Lclient!r;IILclient!qj;I)Z")
	public static boolean method6007(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(4) Class3_Sub41 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray104 != null) {
			local7 = (Static284.anInt7866 - Static284.anInt7857) * (arg0.anInt1407 + arg2.anInt7165 - Static284.anInt7861) / (Static284.anInt7860 - Static284.anInt7861) + Static284.anInt7857;
			local13 = Static284.anInt7862 - (arg2.anInt7161 + arg0.anInt1406 - Static284.anInt7856) * (Static284.anInt7862 - Static284.anInt7859) / (Static284.anInt7864 - Static284.anInt7856);
			local9 = (arg2.anInt7165 + arg0.anInt1391 - Static284.anInt7861) * (Static284.anInt7866 - Static284.anInt7857) / (Static284.anInt7860 - Static284.anInt7861) + Static284.anInt7857;
			local11 = Static284.anInt7862 - (arg2.anInt7161 + arg0.anInt1386 - Static284.anInt7856) * (-Static284.anInt7859 + Static284.anInt7862) / (Static284.anInt7864 - Static284.anInt7856);
		}
		@Pc(101) Class46 local101 = null;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (arg0.anInt1385 != -1) {
			if (arg2.aBoolean566 && arg0.anInt1402 != -1) {
				local101 = arg0.method1118(arg1, true);
			} else {
				local101 = arg0.method1118(arg1, false);
			}
			if (local101 != null) {
				local103 = arg2.anInt7157 - (local101.A() + 1 >> 1);
				local105 = arg2.anInt7157 + (local101.A() + 1 >> 1);
				if (local103 < local7) {
					local7 = local103;
				}
				if (local105 > local9) {
					local9 = local105;
				}
				local107 = arg2.anInt7158 - (local101.ca() + 1 >> 1);
				local109 = arg2.anInt7158 + (local101.ca() + 1 >> 1);
				if (local107 < local11) {
					local11 = local107;
				}
				if (local109 > local13) {
					local13 = local109;
				}
			}
		}
		@Pc(203) Class106 local203 = null;
		@Pc(205) int local205 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(271) int local271;
		@Pc(294) int local294;
		if (arg0.aString25 != null) {
			local203 = Static26.method7434(arg0.anInt1380);
			if (local203 != null) {
				local205 = Static519.aClass58_13.method1778(Static106.aStringArray10, null, null, arg0.aString25);
				local212 = arg2.anInt7158;
				if (local101 == null) {
					local212 -= local203.method2830() * local205 / 2;
				} else {
					local212 -= (local101.ca() >> 1) + local205 * local203.method2829();
				}
				for (local271 = 0; local271 < local205; local271++) {
					@Pc(277) String local277 = Static106.aStringArray10[local271];
					if (local271 < local205 - 1) {
						local277 = local277.substring(0, local277.length() - 4);
					}
					local294 = local203.method2834(local277);
					if (local294 > local214) {
						local214 = local294;
					}
				}
				local216 = arg2.anInt7157 - local214 / 2;
				local218 = local214 / 2 + arg2.anInt7157;
				if (local7 > local216) {
					local7 = local216;
				}
				local220 = local212;
				if (local218 > local9) {
					local9 = local218;
				}
				if (local11 > local220) {
					local11 = local220;
				}
				local222 = local203.method2829() * local205 + local212;
				if (local13 < local222) {
					local13 = local222;
				}
			}
		}
		if (Static284.anInt7857 > local9 || Static284.anInt7866 < local7 || local13 < Static284.anInt7859 || Static284.anInt7862 < local11) {
			return true;
		}
		@Pc(406) int local406;
		if (arg0.anIntArray104 != null) {
			@Pc(404) int[] local404 = new int[arg0.anIntArray104.length];
			for (local406 = 0; local406 < local404.length / 2; local406++) {
				local294 = arg2.anInt7165 + arg0.anIntArray104[local406 * 2];
				@Pc(430) int local430 = arg2.anInt7161 + arg0.anIntArray104[local406 * 2 + 1];
				local404[local406 * 2] = Static284.anInt7857 + (Static284.anInt7866 - Static284.anInt7857) * (-Static284.anInt7861 + local294) / (Static284.anInt7860 - Static284.anInt7861);
				local404[local406 * 2 + 1] = Static284.anInt7862 - (local430 - Static284.anInt7856) * (-Static284.anInt7859 + Static284.anInt7862) / (Static284.anInt7864 - Static284.anInt7856);
			}
			Static38.method661(arg1, local404, arg0.anInt1383);
			for (local294 = 0; local294 < local404.length / 2 - 1; local294++) {
				arg1.method7174(local404[(local294 + 1) * 2], local404[local294 * 2 + 1 + 2], local404[local294 * 2 + 1], local404[local294 * 2], arg0.anInt1398);
			}
			arg1.method7174(local404[0], local404[1], local404[local404.length - 1], local404[local404.length - 2], arg0.anInt1398);
		}
		if (local101 != null) {
			if (Static440.anInt4098 > 0 && (Static112.anInt2609 != -1 && Static112.anInt2609 == arg2.anInt7163 || Static412.anInt6932 != -1 && Static412.anInt6932 == arg0.anInt1395)) {
				if (Static474.anInt7705 > 50) {
					local271 = (100 - Static474.anInt7705) * 2;
				} else {
					local271 = Static474.anInt7705 * 2;
				}
				local406 = local271 << 24 | 0xFFFF00;
				arg1.method7151(arg2.anInt7157, local406, arg2.anInt7158, local101.E() / 2 + 7);
				arg1.method7151(arg2.anInt7157, local406, arg2.anInt7158, local101.E() / 2 + 5);
				arg1.method7151(arg2.anInt7157, local406, arg2.anInt7158, local101.E() / 2 + 3);
				arg1.method7151(arg2.anInt7157, local406, arg2.anInt7158, local101.E() / 2 + 1);
				arg1.method7151(arg2.anInt7157, local406, arg2.anInt7158, local101.E() / 2);
			}
			local101.method7606(arg2.anInt7157 - (local101.A() >> 1), arg2.anInt7158 + -(local101.ca() >> 1));
		}
		if (arg0.aString25 != null && local203 != null) {
			Static419.method7099(arg2, arg1, arg0, local212, local205, local214, local203);
		}
		if (arg0.anInt1385 != -1 || arg0.aString25 != null) {
			@Pc(720) Class3_Sub50 local720 = new Class3_Sub50(arg2);
			local720.anInt9381 = local107;
			local720.anInt9387 = local218;
			local720.anInt9391 = local103;
			local720.anInt9383 = local216;
			local720.anInt9389 = local222;
			local720.anInt9390 = local105;
			local720.anInt9380 = local220;
			local720.anInt9392 = local109;
			Static552.aClass130_63.method3548(local720);
		}
		return false;
	}
}
