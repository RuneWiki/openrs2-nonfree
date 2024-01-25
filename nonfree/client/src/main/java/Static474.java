import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
	public static int anInt7575 = 0;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBI)V")
	public static void method6313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub5_Sub20 local14 = Static447.method6065((long) arg1, 5);
		local14.method8832();
		local14.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public static void method6314() {
		if (Static137.anInt2624 < 102) {
			Static137.anInt2624 += 6;
		}
		@Pc(28) int local28;
		if (Static299.anInt5078 != -1 && Static15.method380() > Static631.aLong287) {
			for (local28 = Static299.anInt5078; local28 < Static200.aStringArray70.length; local28++) {
				if (Static200.aStringArray70[local28].startsWith("pause")) {
					@Pc(47) int local47 = 5;
					try {
						local47 = Integer.parseInt(Static200.aStringArray70[local28].substring(6));
					} catch (@Pc(56) Exception local56) {
					}
					Static85.method1345("Pausing for " + local47 + " seconds...");
					Static299.anInt5078 = local28 + 1;
					Static631.aLong287 = (long) (local47 * 1000) + Static15.method380();
					return;
				}
				Static89.aString26 = Static200.aStringArray70[local28];
				Static654.method8758(false);
			}
			Static299.anInt5078 = -1;
		}
		if (Static565.anInt9132 != 0) {
			Static76.anInt1484 -= Static565.anInt9132 * 5;
			if (Static76.anInt1484 >= Class14_Sub26.anInt9540) {
				Static76.anInt1484 = Class14_Sub26.anInt9540 - 1;
			}
			Static565.anInt9132 = 0;
			if (Static76.anInt1484 < 0) {
				Static76.anInt1484 = 0;
			}
		}
		for (local28 = 0; local28 < Static310.anInt5197; local28++) {
			@Pc(122) Interface18 local122 = Static54.anInterface18Array1[local28];
			@Pc(128) int local128 = local122.method3023();
			@Pc(132) char local132 = local122.method3024();
			@Pc(136) int local136 = local122.method3025();
			if (local128 == 84) {
				Static654.method8758(false);
			}
			if (local128 == 80) {
				Static654.method8758(true);
			} else if (local128 == 66 && (local136 & 0x4) != 0) {
				if (Static390.aClipboard1 != null) {
					@Pc(418) String local418 = "";
					for (@Pc(423) int local423 = Static239.aStringArray27.length - 1; local423 >= 0; local423--) {
						if (Static239.aStringArray27[local423] != null && Static239.aStringArray27[local423].length() > 0) {
							local418 = local418 + Static239.aStringArray27[local423] + '\n';
						}
					}
					Static390.aClipboard1.setContents(new StringSelection(local418), (ClipboardOwner) null);
				}
			} else if (local128 == 67 && (local136 & 0x4) != 0) {
				if (Static390.aClipboard1 != null) {
					@Pc(391) Transferable local391 = Static390.aClipboard1.getContents((Object) null);
					if (local391 != null) {
						try {
							@Pc(398) String local398 = (String) local391.getTransferData(DataFlavor.stringFlavor);
							if (local398 != null) {
								@Pc(405) String[] local405 = Static120.method1814(local398, '\n');
								Static488.method6445(local405);
							}
						} catch (@Pc(412) Exception local412) {
						}
					}
				}
			} else if (local128 == 85 && Static610.anInt10155 > 0) {
				Static89.aString26 = Static89.aString26.substring(0, Static610.anInt10155 - 1) + Static89.aString26.substring(Static610.anInt10155);
				Static610.anInt10155--;
			} else if (local128 == 101 && Static610.anInt10155 < Static89.aString26.length()) {
				Static89.aString26 = Static89.aString26.substring(0, Static610.anInt10155) + Static89.aString26.substring(Static610.anInt10155 + 1);
			} else if (local128 == 96 && Static610.anInt10155 > 0) {
				Static610.anInt10155--;
			} else if (local128 == 97 && Static610.anInt10155 < Static89.aString26.length()) {
				Static610.anInt10155++;
			} else if (local128 == 102) {
				Static610.anInt10155 = 0;
			} else if (local128 == 103) {
				Static610.anInt10155 = Static89.aString26.length();
			} else if (local128 == 104 && Static6.anInt84 < Static239.aStringArray27.length) {
				Static6.anInt84++;
				Static469.method6287();
				Static610.anInt10155 = Static89.aString26.length();
			} else if (local128 == 105 && Static6.anInt84 > 0) {
				Static6.anInt84--;
				Static469.method6287();
				Static610.anInt10155 = Static89.aString26.length();
			} else if (Static669.method8387(local132) || local132 == '\' || local132 == '/' || local132 == '.' || local132 == ':' || local132 == ',' || local132 == ' ' || local132 == '_' || local132 == '-' || local132 == '+' || local132 == '[' || local132 == ']') {
				Static89.aString26 = Static89.aString26.substring(0, Static610.anInt10155) + Static54.anInterface18Array1[local28].method3024() + Static89.aString26.substring(Static610.anInt10155);
				Static610.anInt10155++;
			}
		}
		Static310.anInt5197 = 0;
		Static273.anInt4689 = 0;
		Static184.method2885();
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I")
	public static int method6315() {
		return Static74.aClass191_1.method4362();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!ofa;)Lclient!ofa;")
	public static Class265 method6317(@OriginalArg(1) Class265 arg0) {
		@Pc(11) Class265 local11 = Static86.method1374(arg0);
		if (local11 == null) {
			local11 = arg0.aClass265_10;
		}
		return local11;
	}
}
