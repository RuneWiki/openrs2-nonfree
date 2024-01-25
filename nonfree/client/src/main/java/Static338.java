import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!rh;")
	public static Class308 aClass308_2;

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[Lclient!c;")
	public static final Class48[] aClass48Array2 = new Class48[14];

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Lclient!eaa;")
	public static final Class92 aClass92_9 = new Class92();

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!gj;)V")
	public static void method5146(@OriginalArg(1) Class143 arg0) {
		Static200.anInt3602 = arg0.method3131("hitmarks");
		Static538.anInt8818 = arg0.method3131("hitbar_default");
		Static521.anInt8695 = arg0.method3131("timerbar_default");
		Static109.anInt2253 = arg0.method3131("headicons_pk");
		Static302.anInt5504 = arg0.method3131("headicons_prayer");
		Static635.anInt9807 = arg0.method3131("hint_headicons");
		Static453.anInt7752 = arg0.method3131("hint_mapmarkers");
		Static137.anInt2536 = arg0.method3131("mapflag");
		Static304.anInt5557 = arg0.method3131("cross");
		Static173.anInt3297 = arg0.method3131("mapdots");
		Static616.anInt9561 = arg0.method3131("scrollbar");
		Static626.anInt9695 = arg0.method3131("name_icons");
		Static486.anInt8257 = arg0.method3131("floorshadows");
		Static610.anInt9524 = arg0.method3131("compass");
		Static140.anInt2654 = arg0.method3131("otherlevel");
		Static512.anInt8559 = arg0.method3131("hint_mapedge");
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method5147() {
		if (Static424.aClass370Array1 == null) {
			Static424.aClass370Array1 = Static627.method8273();
			Static137.aClass370_1 = Static424.aClass370Array1[0];
			Static489.aLong243 = Static131.method2268();
		}
		if (Static12.aClass124_1 == null) {
			Static482.method6862();
		}
		@Pc(30) Class370 local30 = Static137.aClass370_1;
		@Pc(35) int local35 = Static504.method8344();
		if (local30 == Static137.aClass370_1) {
			Static464.aString102 = Static137.aClass370_1.aClass335_65.method7694(Static319.anInt5939);
			if (Static137.aClass370_1.aBoolean718) {
				Static86.anInt1916 = local35 * (Static137.aClass370_1.anInt9713 - Static137.aClass370_1.anInt9706) / 100 + Static137.aClass370_1.anInt9706;
			}
			if (Static137.aClass370_1.aBoolean717) {
				Static464.aString102 = Static464.aString102 + Static86.anInt1916 + "%";
			}
		} else if (Static627.aClass370_23 == Static137.aClass370_1) {
			Static12.aClass124_1 = null;
			Static482.method6863(3);
		} else {
			Static464.aString102 = local30.aClass335_64.method7694(Static319.anInt5939);
			Static86.anInt1916 = local30.anInt9713;
			if (Static137.aClass370_1.aBoolean717) {
				Static464.aString102 = Static464.aString102 + local30.anInt9713 + "%";
			}
			if (Static137.aClass370_1.aBoolean718 || local30.aBoolean718) {
				Static489.aLong243 = Static131.method2268();
			}
		}
		if (Static12.aClass124_1 == null) {
			return;
		}
		Static12.aClass124_1.method2769(Static464.aString102, Static137.aClass370_1, Static489.aLong243, Static86.anInt1916);
		if (Static62.anInterface27Array1 == null) {
			return;
		}
		for (@Pc(135) int local135 = Static549.anInt5053 + 1; local135 < Static62.anInterface27Array1.length; local135++) {
			if (Static62.anInterface27Array1[local135].method7909() >= 100 && local135 - 1 == Static549.anInt5053 && Static520.anInt6836 >= 1 && Static12.aClass124_1.method2779()) {
				try {
					Static62.anInterface27Array1[local135].method7912();
				} catch (@Pc(169) Exception local169) {
					Static62.anInterface27Array1 = null;
					return;
				}
				Static12.aClass124_1.method2776(Static62.anInterface27Array1[local135]);
				Static549.anInt5053++;
				if (Static549.anInt5053 >= Static62.anInterface27Array1.length - 1 && Static62.anInterface27Array1.length > 1) {
					Static549.anInt5053 = Static577.aClass235_1.method5379() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method5150(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg2 + arg0;
		while (local21 > local17) {
			@Pc(30) int local30 = arg1[local17++] & 0xFF;
			@Pc(53) int local53;
			if (local30 >= 128) {
				if (local30 < 192) {
					local53 = 65533;
				} else if (local30 < 224) {
					if (local21 > local17 && (arg1[local17] & 0xC0) == 128) {
						local53 = (local30 & 0x1F) << 6 | arg1[local17++] & 0x3F;
						if (local53 < 128) {
							local53 = 65533;
						}
					} else {
						local53 = 65533;
					}
				} else if (local30 < 240) {
					if (local17 + 1 < local21 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128) {
						local53 = (local30 & 0xF) << 12 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
						if (local53 < 2048) {
							local53 = 65533;
						}
					} else {
						local53 = 65533;
					}
				} else if (local30 >= 248) {
					local53 = 65533;
				} else if (local21 > local17 + 2 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128 && (arg1[local17 + 2] & 0xC0) == 128) {
					local53 = (local30 & 0x7) << 18 | arg1[local17++] << 12 & 0x3F000 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
					if (local53 >= 65536 && local53 <= 1114111) {
						local53 = 65533;
					} else {
						local53 = 65533;
					}
				} else {
					local53 = 65533;
				}
			} else if (local30 == 0) {
				local53 = 65533;
			} else {
				local53 = local30;
			}
			local8[local10++] = (char) local53;
		}
		return new String(local8, 0, local10);
	}
}
