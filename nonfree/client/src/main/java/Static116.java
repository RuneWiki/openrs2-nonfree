import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
	public static int anInt3103 = 0;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "[S")
	public static short[] aShortArray31 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)Lclient!fb;")
	public static Class19 method2218() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	public static void method2219() {
		Static1.aClass1_Sub8_Sub1_1.method1654(49);
		Static1.aClass1_Sub8_Sub1_1.method1625((long) 0);
	}

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V")
	public static void method2220() {
		aShortArray31 = null;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	public static void method2221() {
		@Pc(11) int local11;
		if (Static16.anInt696 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static16.anInt696 > 768) {
					Static19.anIntArray102[local11] = Static6.method272(Static8.anIntArray34[local11], Static65.anIntArray200[local11], 1024 - Static16.anInt696);
				} else if (Static16.anInt696 > 256) {
					Static19.anIntArray102[local11] = Static8.anIntArray34[local11];
				} else {
					Static19.anIntArray102[local11] = Static6.method272(Static65.anIntArray200[local11], Static8.anIntArray34[local11], 256 - Static16.anInt696);
				}
			}
		} else if (Static170.anInt3826 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static170.anInt3826 > 768) {
					Static19.anIntArray102[local11] = Static6.method272(Static10.anIntArray47[local11], Static65.anIntArray200[local11], 1024 - Static170.anInt3826);
				} else if (Static170.anInt3826 <= 256) {
					Static19.anIntArray102[local11] = Static6.method272(Static65.anIntArray200[local11], Static10.anIntArray47[local11], 256 - Static170.anInt3826);
				} else {
					Static19.anIntArray102[local11] = Static10.anIntArray47[local11];
				}
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				Static19.anIntArray102[local11] = Static65.anIntArray200[local11];
			}
		}
		@Pc(145) int local145 = 0;
		local11 = 0;
		@Pc(152) int local152 = Static3.aClass1_Sub2_Sub1_Sub3_1.anInt358 * 9;
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(193) int local193;
		@Pc(188) int local188;
		@Pc(205) int local205;
		@Pc(209) int local209;
		for (@Pc(154) int local154 = 1; local154 < 255; local154++) {
			local170 = (256 - local154) * Static93.anIntArray261[local154] / 256 + 22;
			if (local170 < 0) {
				local170 = 0;
			}
			local11 += local170;
			for (local180 = local170; local180 < 128; local180++) {
				local188 = Static3.aClass1_Sub2_Sub1_Sub3_1.anIntArray45[local152++];
				local193 = Static68.anIntArray208[local11++];
				if (local193 == 0) {
					Static38.aClass1_Sub2_Sub1_Sub3_3.anIntArray45[local145++] = local188;
				} else {
					local205 = local193;
					local209 = 256 - local193;
					local193 = Static19.anIntArray102[local193];
					Static38.aClass1_Sub2_Sub1_Sub3_3.anIntArray45[local145++] = (local209 * (local188 & 0xFF00) + (local193 & 0xFF00) * local205 & 0xFF0000) + ((local193 & 0xFF00FF) * local205 + local209 * (local188 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local193 = 0; local193 < local170; local193++) {
				Static38.aClass1_Sub2_Sub1_Sub3_3.anIntArray45[local145++] = Static3.aClass1_Sub2_Sub1_Sub3_1.anIntArray45[local152++];
			}
			local152 += Static3.aClass1_Sub2_Sub1_Sub3_1.anInt358 - 128;
		}
		local11 = 0;
		local145 = 0;
		Static38.aClass1_Sub2_Sub1_Sub3_3.method400(0, 9);
		local152 = Static3.aClass1_Sub2_Sub1_Sub3_1.anInt358 * 9 + 128;
		for (local170 = 1; local170 < 255; local170++) {
			local180 = Static93.anIntArray261[local170] * (256 - local170) / 256 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			for (local193 = 0; local193 < local180; local193++) {
				@Pc(337) int local337 = local145++;
				local152--;
				Static138.aClass1_Sub2_Sub1_Sub3_7.anIntArray45[local337] = Static3.aClass1_Sub2_Sub1_Sub3_1.anIntArray45[local152];
			}
			for (local188 = local180; local188 < 128; local188++) {
				local152--;
				local209 = Static3.aClass1_Sub2_Sub1_Sub3_1.anIntArray45[local152];
				local205 = Static68.anIntArray208[local11++];
				if (local205 == 0) {
					Static138.aClass1_Sub2_Sub1_Sub3_7.anIntArray45[local145++] = local209;
				} else {
					@Pc(370) int local370 = local205;
					@Pc(374) int local374 = 256 - local205;
					local205 = Static19.anIntArray102[local205];
					Static138.aClass1_Sub2_Sub1_Sub3_7.anIntArray45[local145++] = ((local209 & 0xFF00FF) * local374 + local370 * (local205 & 0xFF00FF) & 0xFF00FF00) + (local370 * (local205 & 0xFF00) + (local209 & 0xFF00) * local374 & 0xFF0000) >> 8;
				}
			}
			local11 += local180;
			local152 += Static3.aClass1_Sub2_Sub1_Sub3_1.anInt358 + 128;
		}
		Static138.aClass1_Sub2_Sub1_Sub3_7.method400(637, 9);
	}
}
