import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	public static int anInt2136;

	@OriginalMember(owner = "client!nc", name = "Bb", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!nc", name = "cc", descriptor = "Z")
	public static boolean aBoolean117;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_8 = null;

	@OriginalMember(owner = "client!nc", name = "Lb", descriptor = "I")
	public static int anInt2162 = 1;

	@OriginalMember(owner = "client!nc", name = "Wc", descriptor = "Lclient!he;")
	public static Class26 aClass26_1116 = Static6.method100("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	public static void method1378(@OriginalArg(0) int arg0) {
		Static38.anInt1240 += arg0 * 128;
		@Pc(31) int local31;
		if (Static38.anInt1240 > Static106.anIntArray340.length) {
			Static38.anInt1240 -= Static106.anIntArray340.length;
			local31 = (int) (Math.random() * 12.0D);
			Static4.method70(Static131.aClass3_Sub1_Sub4_Sub1Array11[local31]);
		}
		local31 = 0;
		@Pc(44) int local44 = (256 - arg0) * 128;
		@Pc(48) int local48 = arg0 * 128;
		@Pc(74) int local74;
		for (@Pc(50) int local50 = 0; local50 < local44; local50++) {
			local74 = Static124.anIntArray384[local31 + local48] - Static106.anIntArray340[Static106.anIntArray340.length - 1 & local31 - -Static38.anInt1240] * arg0 / 6;
			if (local74 < 0) {
				local74 = 0;
			}
			Static124.anIntArray384[local31++] = local74;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local74 = 256 - arg0; local74 < 256; local74++) {
			local105 = local74 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static124.anIntArray384[local107 + local105] = 255;
				} else {
					Static124.anIntArray384[local107 + local105] = 0;
				}
			}
		}
		if (Static76.anInt2098 > 0) {
			Static76.anInt2098 -= arg0 * 4;
		}
		if (Static69.anInt2515 > 0) {
			Static69.anInt2515 -= arg0 * 4;
		}
		if (Static69.anInt2515 == 0 && Static76.anInt2098 == 0) {
			local105 = (int) ((double) (2000 / arg0) * Math.random());
			if (local105 == 0) {
				Static69.anInt2515 = 1024;
			}
			if (local105 == 1) {
				Static76.anInt2098 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static6.anIntArray12[local105] = Static6.anIntArray12[local105 + arg0];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static6.anIntArray12[local107] = (int) (Math.sin((double) Static49.anInt1584 / 14.0D) * 16.0D + Math.sin((double) Static49.anInt1584 / 15.0D) * 14.0D + Math.sin((double) Static49.anInt1584 / 16.0D) * 12.0D);
			Static49.anInt1584++;
		}
		Static102.anInt2775 += arg0;
		local114 = ((Static4.anInt136 & 0x1) + arg0) / 2;
		if (local114 <= 0) {
			return;
		}
		@Pc(297) int local297;
		@Pc(290) int local290;
		for (@Pc(281) int local281 = 0; local281 < Static102.anInt2775 * 100; local281++) {
			local290 = (int) (Math.random() * 128.0D) + 128;
			local297 = (int) (Math.random() * 124.0D) + 2;
			Static124.anIntArray384[local297 + (local290 << 7)] = 192;
		}
		Static102.anInt2775 = 0;
		@Pc(325) int local325;
		@Pc(330) int local330;
		for (local297 = 0; local297 < 256; local297++) {
			local325 = local297 * 128;
			local290 = 0;
			for (local330 = -local114; local330 < 128; local330++) {
				if (local114 + local330 < 128) {
					local290 += Static124.anIntArray384[local325 + local330 + local114];
				}
				if (local330 - local114 - 1 >= 0) {
					local290 -= Static124.anIntArray384[local330 + local325 - local114 - 1];
				}
				if (local330 >= 0) {
					Static118.anIntArray376[local330 + local325] = local290 / (local114 * 2 + 1);
				}
			}
		}
		for (local290 = 0; local290 < 128; local290++) {
			local325 = 0;
			for (local330 = -local114; local330 < 256; local330++) {
				@Pc(415) int local415 = local330 * 128;
				if (local330 + local114 < 256) {
					local325 += Static118.anIntArray376[local290 + local415 + local114 * 128];
				}
				if (local330 - local114 - 1 >= 0) {
					local325 -= Static118.anIntArray376[local415 + local290 - local114 * 128 - 128];
				}
				if (local330 >= 0) {
					Static124.anIntArray384[local415 + local290] = local325 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBLclient!ef;)Lclient!ub;")
	public static Class3_Sub23 method1382(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1) {
		@Pc(13) byte[] local13 = arg1.method560(arg0);
		return local13 == null ? null : new Class3_Sub23(local13);
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1388() {
		aClass26_1116 = null;
		aClass3_Sub14_8 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)I")
	public static int method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = 256 - arg1;
		return ((arg2 & 0xFF00) * arg1 + (arg0 & 0xFF00) * local12 & 0xFF0000) + (local12 * (arg0 & 0xFF00FF) + ((arg2 & 0xFF00FF) * arg1) & 0xFF00FF00) >> 8;
	}
}
