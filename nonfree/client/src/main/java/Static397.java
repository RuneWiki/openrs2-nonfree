import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_100 = new Class276(116, -2);

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "[F")
	public static final float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	public static void method6330() {
		@Pc(7) int local7 = Static89.aClass3_Sub7_Sub1_2.method6535();
		@Pc(18) boolean local18 = Static89.aClass3_Sub7_Sub1_2.method6538() == 1;
		@Pc(22) int local22 = Static89.aClass3_Sub7_Sub1_2.method6538();
		@Pc(26) int local26 = Static89.aClass3_Sub7_Sub1_2.method6541();
		Static39.anInt1074 = Static89.aClass3_Sub7_Sub1_2.method6505();
		Static481.method7377();
		Static505.method7608(local22);
		Static89.aClass3_Sub7_Sub1_2.method1500();
		@Pc(43) int local43;
		@Pc(46) int local46;
		@Pc(52) int local52;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local43 = 0; local43 < Static460.anInt8640 >> 3; local43++) {
				for (local46 = 0; local46 < Static292.anInt7682 >> 3; local46++) {
					local52 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
					if (local52 == 1) {
						Static270.anIntArrayArrayArray7[local40][local43][local46] = Static89.aClass3_Sub7_Sub1_2.method1499(26);
					} else {
						Static270.anIntArrayArrayArray7[local40][local43][local46] = -1;
					}
				}
			}
		}
		Static89.aClass3_Sub7_Sub1_2.method1491();
		local43 = (Static79.anInt10464 - Static89.aClass3_Sub7_Sub1_2.anInt7869) / 16;
		Static261.anIntArrayArray34 = new int[local43][4];
		for (local46 = 0; local46 < local43; local46++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static261.anIntArrayArray34[local46][local52] = Static89.aClass3_Sub7_Sub1_2.method6497();
			}
		}
		Static511.anIntArray616 = null;
		Static256.aByteArrayArray19 = new byte[local43][];
		Static422.anIntArray504 = new int[local43];
		Static523.aByteArrayArray30 = new byte[local43][];
		Static558.aByteArrayArray26 = new byte[local43][];
		Static537.anIntArray654 = new int[local43];
		Static478.anIntArray584 = new int[local43];
		Static215.anIntArray376 = new int[local43];
		Static577.anIntArray661 = new int[local43];
		Static349.aByteArrayArray17 = new byte[local43][];
		Static177.aByteArrayArray16 = null;
		local43 = 0;
		for (local52 = 0; local52 < 4; local52++) {
			for (@Pc(177) int local177 = 0; local177 < Static460.anInt8640 >> 3; local177++) {
				for (@Pc(180) int local180 = 0; local180 < Static292.anInt7682 >> 3; local180++) {
					@Pc(189) int local189 = Static270.anIntArrayArrayArray7[local52][local177][local180];
					if (local189 != -1) {
						@Pc(199) int local199 = local189 >> 14 & 0x3FF;
						@Pc(205) int local205 = local189 >> 3 & 0x7FF;
						@Pc(215) int local215 = local205 / 8 + (local199 / 8 << 8);
						for (@Pc(217) int local217 = 0; local217 < local43; local217++) {
							if (local215 == Static478.anIntArray584[local217]) {
								local215 = -1;
								break;
							}
						}
						if (local215 != -1) {
							Static478.anIntArray584[local43] = local215;
							@Pc(247) int local247 = local215 >> 8 & 0xFF;
							@Pc(251) int local251 = local215 & 0xFF;
							Static537.anIntArray654[local43] = Static136.aClass254_43.method6414("m" + local247 + "_" + local251);
							Static422.anIntArray504[local43] = Static136.aClass254_43.method6414("l" + local247 + "_" + local251);
							Static215.anIntArray376[local43] = Static136.aClass254_43.method6414("um" + local247 + "_" + local251);
							Static577.anIntArray661[local43] = Static136.aClass254_43.method6414("ul" + local247 + "_" + local251);
							local43++;
						}
					}
				}
			}
		}
		Static430.method6817(11, local26, local7, local18);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public static void method6331() {
		if (Static480.aClass326_3.aBoolean803) {
			Static188.anInt3749 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static188.anInt3749 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
