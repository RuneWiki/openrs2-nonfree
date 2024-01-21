import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!wc;")
	public static Class1_Sub1_Sub12_Sub3_Sub1 aClass1_Sub1_Sub12_Sub3_Sub1_7;

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
	public static int anInt2811;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "Lclient!ob;")
	public static Class60 aClass60_9;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!ob;")
	public static Class60 aClass60_10;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1070 = Static169.method2903("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1071 = Static169.method2903(")4l");

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
	public static int anInt2813 = 0;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1072 = Static169.method2903("(U1");

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
	public static int anInt2819 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method1949() {
		aClass23_1070 = null;
		aClass1_Sub1_Sub12_Sub3_Sub1_7 = null;
		aClass23_1072 = null;
		aClass60_9 = null;
		aClass60_10 = null;
		aClass23_1071 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
	public static void method1950(@OriginalArg(0) boolean arg0) {
		Static38.method622();
		Static19.anInt606++;
		if (Static19.anInt606 < 50 && !arg0) {
			return;
		}
		Static19.anInt606 = 0;
		if (Static37.aBoolean47 || Static43.aClass44_4 == null) {
			return;
		}
		Static25.aClass1_Sub8_Sub1_1.method919(221);
		try {
			Static43.aClass44_4.method1419(Static25.aClass1_Sub8_Sub1_1.aByteArray12, Static25.aClass1_Sub8_Sub1_1.anInt1357);
			Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
		} catch (@Pc(49) IOException local49) {
			Static37.aBoolean47 = true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1951() {
		@Pc(11) int local11;
		if (Static93.anInt2446 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static93.anInt2446 > 768) {
					Static25.anIntArray105[local11] = Static93.method1624(1024 - Static93.anInt2446, Static57.anIntArray224[local11], Static68.anIntArray242[local11]);
				} else if (Static93.anInt2446 <= 256) {
					Static25.anIntArray105[local11] = Static93.method1624(256 - Static93.anInt2446, Static68.anIntArray242[local11], Static57.anIntArray224[local11]);
				} else {
					Static25.anIntArray105[local11] = Static57.anIntArray224[local11];
				}
			}
		} else if (Static32.anInt944 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static32.anInt944 > 768) {
					Static25.anIntArray105[local11] = Static93.method1624(1024 - Static32.anInt944, Static127.anIntArray442[local11], Static68.anIntArray242[local11]);
				} else if (Static32.anInt944 > 256) {
					Static25.anIntArray105[local11] = Static127.anIntArray442[local11];
				} else {
					Static25.anIntArray105[local11] = Static93.method1624(256 - Static32.anInt944, Static68.anIntArray242[local11], Static127.anIntArray442[local11]);
				}
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				Static25.anIntArray105[local11] = Static68.anIntArray242[local11];
			}
		}
		@Pc(147) int local147 = Static169.aClass1_Sub1_Sub12_Sub1_7.anInt2798 * 9;
		local11 = 0;
		@Pc(151) int local151 = 0;
		@Pc(180) int local180;
		@Pc(187) int local187;
		@Pc(193) int local193;
		@Pc(210) int local210;
		@Pc(208) int local208;
		for (@Pc(153) int local153 = 1; local153 < 255; local153++) {
			@Pc(167) int local167 = Static139.anIntArray472[local153] * (256 - local153) / 256 + 22;
			if (local167 < 0) {
				local167 = 0;
			}
			local11 += local167;
			for (local180 = local167; local180 < 128; local180++) {
				local187 = Static14.anIntArray64[local11++];
				local193 = Static169.aClass1_Sub1_Sub12_Sub1_7.anIntArray374[local147++];
				if (local187 == 0) {
					Static44.aClass1_Sub1_Sub12_Sub1_3.anIntArray374[local151++] = local193;
				} else {
					local208 = 256 - local187;
					local210 = local187;
					local187 = Static25.anIntArray105[local187];
					Static44.aClass1_Sub1_Sub12_Sub1_3.anIntArray374[local151++] = ((local187 & 0xFF00) * local210 + (local193 & 0xFF00) * local208 & 0xFF0000) + (local210 * (local187 & 0xFF00FF) + (local208 * (local193 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			for (local187 = 0; local187 < local167; local187++) {
				Static44.aClass1_Sub1_Sub12_Sub1_3.anIntArray374[local151++] = Static169.aClass1_Sub1_Sub12_Sub1_7.anIntArray374[local147++];
			}
			local147 += Static169.aClass1_Sub1_Sub12_Sub1_7.anInt2798 - 128;
		}
		Static44.aClass1_Sub1_Sub12_Sub1_3.method1941(0, 9);
		local11 = 0;
		local147 = Static169.aClass1_Sub1_Sub12_Sub1_7.anInt2798 * 9 + 128;
		local151 = 0;
		for (local180 = 1; local180 < 255; local180++) {
			local187 = Static139.anIntArray472[local180] * (256 - local180) / 256 + 22;
			if (local187 < 0) {
				local187 = 0;
			}
			for (local193 = 0; local193 < local187; local193++) {
				@Pc(344) int local344 = local151++;
				local147--;
				Static93.aClass1_Sub1_Sub12_Sub1_4.anIntArray374[local344] = Static169.aClass1_Sub1_Sub12_Sub1_7.anIntArray374[local147];
			}
			for (local210 = local187; local210 < 128; local210++) {
				local208 = Static14.anIntArray64[local11++];
				local147--;
				@Pc(374) int local374 = Static169.aClass1_Sub1_Sub12_Sub1_7.anIntArray374[local147];
				if (local208 == 0) {
					Static93.aClass1_Sub1_Sub12_Sub1_4.anIntArray374[local151++] = local374;
				} else {
					@Pc(381) int local381 = 256 - local208;
					@Pc(383) int local383 = local208;
					local208 = Static25.anIntArray105[local208];
					Static93.aClass1_Sub1_Sub12_Sub1_4.anIntArray374[local151++] = ((local208 & 0xFF00) * local383 + local381 * (local374 & 0xFF00) & 0xFF0000) + ((local208 & 0xFF00FF) * local383 + (local374 & 0xFF00FF) * local381 & 0xFF00FF00) >> 8;
				}
			}
			local11 += local187;
			local147 += Static169.aClass1_Sub1_Sub12_Sub1_7.anInt2798 + 128;
		}
		Static93.aClass1_Sub1_Sub12_Sub1_4.method1941(637, 9);
	}
}
