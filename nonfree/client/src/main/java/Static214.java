import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ku", name = "Hb", descriptor = "I")
	public static int anInt4396;

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_59 = new Class212(56, -1);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	public static void method3753() {
		if (Static72.anInt1777 < 102) {
			Static72.anInt1777 += 6;
		}
		if (Static278.anInt5205 != 0) {
			Static210.anInt4285 -= Static278.anInt5205 * 5;
			if (Static210.anInt4285 >= Static15.anInt304) {
				Static210.anInt4285 = Static15.anInt304 - 1;
			}
			if (Static210.anInt4285 < 0) {
				Static210.anInt4285 = 0;
			}
			Static278.anInt5205 = 0;
		}
		for (@Pc(40) int local40 = 0; local40 < Static299.anInt5551; local40++) {
			@Pc(46) Interface5 local46 = Static433.anInterface5Array3[local40];
			@Pc(50) int local50 = local46.method2832();
			@Pc(54) char local54 = local46.method2833();
			@Pc(58) int local58 = local46.method2834();
			if (local50 == 84) {
				Static212.method3723(false);
			}
			if (local50 == 80) {
				Static212.method3723(true);
			} else if (local50 == 66 && (local58 & 0x4) != 0) {
				if (Static290.aClipboard1 != null) {
					@Pc(90) String local90 = "";
					for (@Pc(95) int local95 = Static65.aStringArray8.length - 1; local95 >= 0; local95--) {
						if (Static65.aStringArray8[local95] != null && Static65.aStringArray8[local95].length() > 0) {
							local90 = local90 + Static65.aStringArray8[local95] + '\n';
						}
					}
					Static290.aClipboard1.setContents(new StringSelection(local90), null);
				}
			} else if (local50 == 67 && (local58 & 0x4) != 0) {
				if (Static290.aClipboard1 != null) {
					@Pc(360) Transferable local360 = Static290.aClipboard1.getContents(null);
					if (local360 != null) {
						try {
							@Pc(367) String local367 = (String) local360.getTransferData(DataFlavor.stringFlavor);
							if (local367 != null) {
								@Pc(374) String[] local374 = Static399.method5642(local367, '\n');
								if (local374.length > 1) {
									for (@Pc(382) int local382 = 0; local382 < local374.length; local382++) {
										Static132.aString19 = local374[local382];
										Static212.method3723(false);
									}
								} else {
									Static132.aString19 = Static132.aString19 + local367;
								}
							}
						} catch (@Pc(413) Exception local413) {
						}
					}
				}
			} else if (local50 == 85 && Static18.anInt358 > 0) {
				Static132.aString19 = Static132.aString19.substring(0, Static18.anInt358 - 1) + Static132.aString19.substring(Static18.anInt358);
				Static18.anInt358--;
			} else if (local50 == 101 && Static18.anInt358 < Static132.aString19.length()) {
				Static132.aString19 = Static132.aString19.substring(0, Static18.anInt358) + Static132.aString19.substring(Static18.anInt358 + 1);
			} else if (local50 == 96 && Static18.anInt358 > 0) {
				Static18.anInt358--;
			} else if (local50 == 97 && Static18.anInt358 < Static132.aString19.length()) {
				Static18.anInt358++;
			} else if (local50 == 102) {
				Static18.anInt358 = 0;
			} else if (local50 == 103) {
				Static18.anInt358 = Static132.aString19.length();
			} else if (local50 == 104 && Static20.anInt7224 < Static65.aStringArray8.length) {
				Static20.anInt7224++;
				Static12.method4706();
				Static18.anInt358 = Static132.aString19.length();
			} else if (local50 == 105 && Static20.anInt7224 > 0) {
				Static20.anInt7224--;
				Static12.method4706();
				Static18.anInt358 = Static132.aString19.length();
			} else if (Static241.method4019(local54) || local54 == ':' || local54 == ',' || local54 == ' ' || local54 == '_' || local54 == '-' || local54 == '+' || local54 == '[' || local54 == ']') {
				Static132.aString19 = Static132.aString19.substring(0, Static18.anInt358) + Static433.anInterface5Array3[local40].method2833() + Static132.aString19.substring(Static18.anInt358);
				Static18.anInt358++;
			}
		}
		Static299.anInt5551 = 0;
		Static208.method3674();
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!uc;I)I")
	public static int method3757(@OriginalArg(0) Class11_Sub5_Sub2 arg0) {
		if (arg0.anInt6530 == 0) {
			return 0;
		}
		@Pc(71) int local71;
		@Pc(64) int local64;
		if (arg0.anInt6495 != -1) {
			@Pc(22) Class11_Sub5_Sub2 local22 = null;
			if (arg0.anInt6495 < 32768) {
				@Pc(36) Class4_Sub44 local36 = (Class4_Sub44) Static80.aClass96_8.method2797((long) arg0.anInt6495);
				if (local36 != null) {
					local22 = local36.aClass11_Sub5_Sub2_Sub2_2;
				}
			} else if (arg0.anInt6495 >= 32768) {
				local22 = Static39.aClass11_Sub5_Sub2_Sub1Array1[arg0.anInt6495 - 32768];
			}
			if (local22 != null) {
				local64 = arg0.anInt7514 - local22.anInt7514;
				local71 = arg0.anInt7515 - local22.anInt7515;
				if (local64 != 0 || local71 != 0) {
					arg0.method5301((int) (Math.atan2((double) local64, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(94) Class11_Sub5_Sub2_Sub1 local94 = (Class11_Sub5_Sub2_Sub1) arg0;
			if (local94.anInt4185 != -1 && (local94.anInt6549 == 0 || local94.anInt6551 > 0)) {
				local94.method5301(local94.anInt4185);
				local94.anInt4185 = -1;
			}
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(124) Class11_Sub5_Sub2_Sub2 local124 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local124.anInt6566 != -1 && (local124.anInt6549 == 0 || local124.anInt6551 > 0)) {
				local64 = local124.anInt7514 - (local124.anInt6566 - Static426.anInt7325 - Static426.anInt7325) * 64;
				local71 = local124.anInt7515 - (local124.anInt6572 - Static72.anInt1776 - Static72.anInt1776) * 64;
				if (local64 != 0 || local71 != 0) {
					local124.method5301((int) (Math.atan2((double) local64, (double) local71) * 2607.5945876176133D) & 0x3FFF);
				}
				local124.anInt6566 = -1;
			}
		}
		return arg0.method5291();
	}

	@OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)Z")
	public static boolean method3759() {
		return Static42.aClass219_1 != Static297.aClass219_2 || Static70.anInt1720 >= 2;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIJZI)Ljava/lang/String;")
	public static String method3761(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg1 < 0L) {
			local27 = true;
			arg1 = -arg1;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(50) int local50;
		if (arg0 > 0) {
			for (local50 = 0; local50 < arg0; local50++) {
				@Pc(55) int local55 = (int) arg1;
				arg1 /= 10L;
				local43.append((char) (local55 + 48 - (int) arg1 * 10));
			}
			local43.append(local7);
		}
		local50 = 0;
		while (true) {
			@Pc(97) int local97 = (int) arg1;
			arg1 /= 10L;
			local43.append((char) (local97 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg2) {
				local50++;
				if (local50 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}
}
