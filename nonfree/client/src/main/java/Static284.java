import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "B")
	public static byte aByte69;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_1 = new Class126(14, 0);

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_2 = new Class126(15, 4);

	@OriginalMember(owner = "client!k", name = "v", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_3 = new Class126(16, -2);

	@OriginalMember(owner = "client!k", name = "x", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_4 = new Class126(17, 0);

	@OriginalMember(owner = "client!k", name = "y", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_5 = new Class126(18, -2);

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_6 = new Class126(19, -2);

	@OriginalMember(owner = "client!k", name = "A", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_7 = new Class126(22, -2);

	@OriginalMember(owner = "client!k", name = "B", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_8 = new Class126(23, 4);

	@OriginalMember(owner = "client!k", name = "C", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_9 = new Class126(24, -1);

	@OriginalMember(owner = "client!k", name = "D", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_10 = new Class126(26, 0);

	@OriginalMember(owner = "client!k", name = "E", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_11 = new Class126(27, 0);

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!gga;")
	public static final Class126 aClass126_12 = new Class126(28, -2);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[BIB)Ljava/lang/String;")
	public static String method4606(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg0; local20++) {
			@Pc(30) int local30 = arg1[local20 + arg2] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(51) char local51 = Static22.aCharArray4[local30 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local30 = local51;
				}
				local8[local18++] = (char) local30;
			}
		}
		return new String(local8, 0, local18);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JZ)V")
	public static void method4609(@OriginalArg(0) long arg0) {
		@Pc(15) int local15 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 + Static255.anInt4976;
		@Pc(20) int local20 = Static465.anInt7960 + Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158;
		if (Static454.anInt7698 - local15 < -2000 || Static454.anInt7698 - local15 > 2000 || Static94.anInt1851 - local20 < -2000 || Static94.anInt1851 - local20 > 2000) {
			Static94.anInt1851 = local20;
			Static454.anInt7698 = local15;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (local15 != Static454.anInt7698) {
			local60 = local15 - Static454.anInt7698;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 > 0) {
				if (local68 == 0) {
					local68 = 1;
				} else if (local68 > local60) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = -1;
			} else if (local60 > local68) {
				local68 = local60;
			}
			Static454.anInt7698 += local68;
		}
		Static509.aFloat152 += (float) arg0 * Static642.aFloat200 / 6.0F;
		Static170.aFloat71 += (float) arg0 * Static202.aFloat79 / 6.0F;
		if (Static94.anInt1851 != local20) {
			local60 = local20 - Static94.anInt1851;
			local68 = (int) (arg0 * (long) local60 / 320L);
			if (local60 > 0) {
				if (local68 == 0) {
					local68 = 1;
				} else if (local60 < local68) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = -1;
			} else if (local60 > local68) {
				local68 = local60;
			}
			Static94.anInt1851 += local68;
		}
		Static549.method7848();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method4610() {
		if (Static321.anInt6143 < 102) {
			Static321.anInt6143 += 6;
		}
		@Pc(28) int local28;
		if (Static337.anInt6290 != -1 && Static580.aLong259 < Static191.method3071()) {
			for (local28 = Static337.anInt6290; local28 < Static619.aStringArray79.length; local28++) {
				if (Static619.aStringArray79[local28].startsWith("pause")) {
					@Pc(38) int local38 = 5;
					try {
						local38 = Integer.parseInt(Static619.aStringArray79[local28].substring(6));
					} catch (@Pc(47) Exception local47) {
					}
					Static8.method147("Pausing for " + local38 + " seconds...");
					Static337.anInt6290 = local28 + 1;
					Static580.aLong259 = Static191.method3071() + (long) (local38 * 1000);
					return;
				}
				Static73.aString8 = Static619.aStringArray79[local28];
				Static422.method6656(false);
			}
			Static337.anInt6290 = -1;
		}
		if (Static548.anInt9874 != 0) {
			Static505.anInt8524 -= Static548.anInt9874 * 5;
			if (Static505.anInt8524 >= Static214.anInt4424) {
				Static505.anInt8524 = Static214.anInt4424 - 1;
			}
			if (Static505.anInt8524 < 0) {
				Static505.anInt8524 = 0;
			}
			Static548.anInt9874 = 0;
		}
		for (local28 = 0; local28 < Static227.anInt4609; local28++) {
			@Pc(124) Interface26 local124 = Static512.anInterface26Array1[local28];
			@Pc(128) int local128 = local124.method214();
			@Pc(132) char local132 = local124.method211();
			@Pc(136) int local136 = local124.method215();
			if (local128 == 84) {
				Static422.method6656(false);
			}
			if (local128 == 80) {
				Static422.method6656(true);
			} else if (local128 == 66 && (local136 & 0x4) != 0) {
				if (Static472.aClipboard1 != null) {
					@Pc(416) String local416 = "";
					for (@Pc(421) int local421 = Static469.aStringArray66.length - 1; local421 >= 0; local421--) {
						if (Static469.aStringArray66[local421] != null && Static469.aStringArray66[local421].length() > 0) {
							local416 = local416 + Static469.aStringArray66[local421] + '\n';
						}
					}
					Static472.aClipboard1.setContents(new StringSelection(local416), (ClipboardOwner) null);
				}
			} else if (local128 == 67 && (local136 & 0x4) != 0) {
				if (Static472.aClipboard1 != null) {
					@Pc(177) Transferable local177 = Static472.aClipboard1.getContents((Object) null);
					if (local177 != null) {
						try {
							@Pc(184) String local184 = (String) local177.getTransferData(DataFlavor.stringFlavor);
							if (local184 != null) {
								@Pc(193) String[] local193 = Static557.method7916('\n', local184);
								Static440.method6626(local193);
							}
						} catch (@Pc(198) Exception local198) {
						}
					}
				}
			} else if (local128 == 85 && Static412.anInt7257 > 0) {
				Static73.aString8 = Static73.aString8.substring(0, Static412.anInt7257 - 1) + Static73.aString8.substring(Static412.anInt7257);
				Static412.anInt7257--;
			} else if (local128 == 101 && Static412.anInt7257 < Static73.aString8.length()) {
				Static73.aString8 = Static73.aString8.substring(0, Static412.anInt7257) + Static73.aString8.substring(Static412.anInt7257 + 1);
			} else if (local128 == 96 && Static412.anInt7257 > 0) {
				Static412.anInt7257--;
			} else if (local128 == 97 && Static412.anInt7257 < Static73.aString8.length()) {
				Static412.anInt7257++;
			} else if (local128 == 102) {
				Static412.anInt7257 = 0;
			} else if (local128 == 103) {
				Static412.anInt7257 = Static73.aString8.length();
			} else if (local128 == 104 && Static11.anInt200 < Static469.aStringArray66.length) {
				Static11.anInt200++;
				Static432.method6573();
				Static412.anInt7257 = Static73.aString8.length();
			} else if (local128 == 105 && Static11.anInt200 > 0) {
				Static11.anInt200--;
				Static432.method6573();
				Static412.anInt7257 = Static73.aString8.length();
			} else if (Static374.method5189(local132) || local132 == '\\' || local132 == '/' || local132 == '.' || local132 == ':' || local132 == ',' || local132 == ' ' || local132 == '_' || local132 == '-' || local132 == '+' || local132 == '[' || local132 == ']') {
				Static73.aString8 = Static73.aString8.substring(0, Static412.anInt7257) + Static512.anInterface26Array1[local28].method211() + Static73.aString8.substring(Static412.anInt7257);
				Static412.anInt7257++;
			}
		}
		Static435.anInt7561 = 0;
		Static227.anInt4609 = 0;
		Static647.method8677();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)V")
	public static void method4611(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static528.anInt8950 != -1) {
				Static494.method7222(Static528.anInt8950);
			}
			for (@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) Static128.aClass25_7.method435(); local18 != null; local18 = (Class3_Sub1) Static128.aClass25_7.method432()) {
				if (!local18.method8683()) {
					local18 = (Class3_Sub1) Static128.aClass25_7.method435();
					if (local18 == null) {
						break;
					}
				}
				Static69.method1233(local18, true, false);
			}
			Static528.anInt8950 = -1;
			Static128.aClass25_7 = new Class25(8);
			Static483.method7126();
			Static528.anInt8950 = Static154.anInt3151;
			Static228.method3952(false);
			Static647.method8677();
			Static400.method6287(Static528.anInt8950);
		}
		Static465.aString71 = "";
		Static265.aString40 = "";
		Static207.aBoolean269 = false;
		Static430.method6551();
		Static80.anInt1600 = -1;
		Static232.method3991(Static111.anInt2222);
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 = new Class9_Sub2_Sub1_Sub2_Sub1();
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0] = Static399.anInt7121 / 2;
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 = Static399.anInt7121 * 512 / 2;
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 = Static24.anInt345 * 512 / 2;
		Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0] = Static24.anInt345 / 2;
		Static522.anInt8849 = 0;
		Static419.anInt7345 = 0;
		if (Static471.anInt8064 == 2) {
			Static522.anInt8849 = Static397.anInt7107 << 9;
			Static419.anInt7345 = Static221.anInt10164 << 9;
		} else {
			Static637.method8309();
		}
		Static183.method2986();
	}
}
