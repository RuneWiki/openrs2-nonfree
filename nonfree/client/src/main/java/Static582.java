import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!sj;")
	public static Class310 aClass310_23;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "[I")
	public static int[] anIntArray612;

	@OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
	public static final int[] anIntArray613 = new int[500];

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method8231(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static491.method7315(arg1, -1, arg5, arg3, arg4, arg2, arg0, null);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public static void method8232() {
		if (Static146.anInt2895 < 102) {
			Static146.anInt2895 += 6;
		}
		@Pc(28) int local28;
		if (Static234.anInt4429 != -1 && Static374.method6036() > Static479.aLong119) {
			for (local28 = Static234.anInt4429; local28 < Static541.aStringArray34.length; local28++) {
				if (Static541.aStringArray34[local28].startsWith("pause")) {
					@Pc(47) int local47 = 5;
					try {
						local47 = Integer.parseInt(Static541.aStringArray34[local28].substring(6));
					} catch (@Pc(56) Exception local56) {
					}
					Static410.method6501("Pausing for " + local47 + " seconds...");
					Static234.anInt4429 = local28 + 1;
					Static479.aLong119 = Static374.method6036() + (long) (local47 * 1000);
					return;
				}
				Static141.aString19 = Static541.aStringArray34[local28];
				Static239.method3940(false);
			}
			Static234.anInt4429 = -1;
		}
		if (Static472.anInt8271 != 0) {
			Static243.anInt4523 -= Static472.anInt8271 * 5;
			if (Static451.anInt8003 <= Static243.anInt4523) {
				Static243.anInt4523 = Static451.anInt8003 - 1;
			}
			if (Static243.anInt4523 < 0) {
				Static243.anInt4523 = 0;
			}
			Static472.anInt8271 = 0;
		}
		for (local28 = 0; local28 < Static611.anInt9889; local28++) {
			@Pc(126) Interface5 local126 = Static283.anInterface5Array5[local28];
			@Pc(130) int local130 = local126.method7864();
			@Pc(134) char local134 = local126.method7866();
			@Pc(138) int local138 = local126.method7867();
			if (local130 == 84) {
				Static239.method3940(false);
			}
			if (local130 == 80) {
				Static239.method3940(true);
			} else if (local130 == 66 && (local138 & 0x4) != 0) {
				if (Static510.aClipboard1 != null) {
					@Pc(425) String local425 = "";
					for (@Pc(430) int local430 = Static402.aStringArray27.length - 1; local430 >= 0; local430--) {
						if (Static402.aStringArray27[local430] != null && Static402.aStringArray27[local430].length() > 0) {
							local425 = local425 + Static402.aStringArray27[local430] + '\n';
						}
					}
					Static510.aClipboard1.setContents(new StringSelection(local425), null);
				}
			} else if (local130 == 67 && (local138 & 0x4) != 0) {
				if (Static510.aClipboard1 != null) {
					@Pc(176) Transferable local176 = Static510.aClipboard1.getContents(null);
					if (local176 != null) {
						try {
							@Pc(183) String local183 = (String) local176.getTransferData(DataFlavor.stringFlavor);
							if (local183 != null) {
								@Pc(190) String[] local190 = Static33.method1210('\n', local183);
								Static68.method1700(local190);
							}
						} catch (@Pc(195) Exception local195) {
						}
					}
				}
			} else if (local130 == 85 && Static577.anInt9502 > 0) {
				Static141.aString19 = Static141.aString19.substring(0, Static577.anInt9502 - 1) + Static141.aString19.substring(Static577.anInt9502);
				Static577.anInt9502--;
			} else if (local130 == 101 && Static577.anInt9502 < Static141.aString19.length()) {
				Static141.aString19 = Static141.aString19.substring(0, Static577.anInt9502) + Static141.aString19.substring(Static577.anInt9502 + 1);
			} else if (local130 == 96 && Static577.anInt9502 > 0) {
				Static577.anInt9502--;
			} else if (local130 == 97 && Static577.anInt9502 < Static141.aString19.length()) {
				Static577.anInt9502++;
			} else if (local130 == 102) {
				Static577.anInt9502 = 0;
			} else if (local130 == 103) {
				Static577.anInt9502 = Static141.aString19.length();
			} else if (local130 == 104 && Static394.anInt7317 < Static402.aStringArray27.length) {
				Static394.anInt7317++;
				Static53.method8690();
				Static577.anInt9502 = Static141.aString19.length();
			} else if (local130 == 105 && Static394.anInt7317 > 0) {
				Static394.anInt7317--;
				Static53.method8690();
				Static577.anInt9502 = Static141.aString19.length();
			} else if (Static578.method8187(local134) || local134 == '\\' || local134 == '/' || local134 == '.' || local134 == ':' || local134 == ',' || local134 == ' ' || local134 == '_' || local134 == '-' || local134 == '+' || local134 == '[' || local134 == ']') {
				Static141.aString19 = Static141.aString19.substring(0, Static577.anInt9502) + Static283.anInterface5Array5[local28].method7866() + Static141.aString19.substring(Static577.anInt9502);
				Static577.anInt9502++;
			}
		}
		Static611.anInt9889 = 0;
		Static447.anInt7968 = 0;
		Static40.method1343();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V")
	public static void method8233(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static110.aClass3_Sub4_Sub11_3 != null) {
			Static552.anInt9276 = Static110.aClass3_Sub4_Sub11_3.anInt3858;
		} else {
			Static552.anInt9276 = -1;
		}
		Static87.aClass279_3 = null;
		Static110.aClass3_Sub4_Sub11_3 = null;
		Static368.anInt6962 = 0;
		Static566.aClass223_60 = null;
		Static110.method2781();
		Static110.aClass223_15.method5862();
		Static199.aClass24_12 = null;
		Static110.aClass156_2 = null;
		Static512.aClass172_11 = null;
		Static54.aClass172_1 = null;
		Static422.aClass172_7 = null;
		Static632.anInt10105 = -1;
		Static142.aClass172_12 = null;
		Static168.aClass172_4 = null;
		Static380.anInt7101 = -1;
		Static289.aClass172_10 = null;
		Static424.aClass172_8 = null;
		Static357.aClass172_6 = null;
		if (Static110.aClass335_4 != null) {
			Static110.aClass335_4.method8124();
			Static110.aClass335_4.method8128(128, 64);
		}
		if (Static110.aClass202_3 != null) {
			Static110.aClass202_3.method5164(64, 64);
		}
		if (Static110.aClass302_3 != null) {
			Static110.aClass302_3.method7467(64);
		}
		Static169.aClass187_1.method4658(64);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;ZIZLjava/lang/String;IIJIJIIZ)V")
	public static void method8234(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!Static447.aBoolean555 && Static160.anInt3142 < 500) {
			@Pc(18) int local18 = arg7 == -1 ? Static32.anInt7819 : arg7;
			@Pc(34) Class3_Sub4_Sub13 local34 = new Class3_Sub4_Sub13(arg0, arg4, local18, arg9, arg10, arg8, arg5, arg2, arg1, arg11, arg6, arg3);
			Static186.method3213(local34);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public static boolean method8235(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 20 || arg0 == 12 || arg0 == 49 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 1004;
		}
	}
}
