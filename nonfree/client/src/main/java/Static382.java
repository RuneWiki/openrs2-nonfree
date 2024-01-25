import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "Lclient!o;")
	public static Class49 aClass49_22;

	@OriginalMember(owner = "client!ss", name = "n", descriptor = "Lclient!nv;")
	public static Class177 aClass177_35;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Z")
	public static boolean method4965() {
		return Static430.aBoolean482;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public static void method4967() {
		if (Static104.anInt1776 != 0) {
			Static193.anInt3219 -= Static104.anInt1776 * 5;
			if (Static193.anInt3219 >= Static36.anInt723) {
				Static193.anInt3219 = Static36.anInt723 - 1;
			}
			Static104.anInt1776 = 0;
			if (Static193.anInt3219 < 0) {
				Static193.anInt3219 = 0;
			}
		}
		if (Static241.anInt3924 < 102) {
			Static241.anInt3924 += 6;
		}
		for (@Pc(43) int local43 = 0; local43 < Static323.anInt5038; local43++) {
			@Pc(49) Interface10 local49 = Static162.anInterface10Array2[local43];
			@Pc(53) int local53 = local49.method1255();
			@Pc(57) char local57 = local49.method1253();
			@Pc(61) int local61 = local49.method1251();
			if (local53 == 84) {
				Static109.method1496(false);
			}
			if (local53 == 80) {
				Static109.method1496(true);
			} else if (local53 == 66 && (local61 & 0x4) != 0) {
				if (Static412.aClipboard1 != null) {
					@Pc(355) String local355 = "";
					for (@Pc(360) int local360 = Static286.aStringArray33.length - 1; local360 >= 0; local360--) {
						if (Static286.aStringArray33[local360] != null && Static286.aStringArray33[local360].length() > 0) {
							local355 = local355 + Static286.aStringArray33[local360] + '\n';
						}
					}
					Static412.aClipboard1.setContents(new StringSelection(local355), null);
				}
			} else if (local53 == 67 && (local61 & 0x4) != 0) {
				if (Static412.aClipboard1 != null) {
					@Pc(296) Transferable local296 = Static412.aClipboard1.getContents(null);
					if (local296 != null) {
						try {
							@Pc(303) String local303 = (String) local296.getTransferData(DataFlavor.stringFlavor);
							if (local303 != null) {
								@Pc(310) String[] local310 = Static73.method1083('\n', local303);
								if (local310.length > 1) {
									for (@Pc(318) int local318 = 0; local318 < local310.length; local318++) {
										Static393.aString47 = local310[local318];
										Static109.method1496(false);
									}
								} else {
									Static393.aString47 = Static393.aString47 + local303;
								}
							}
						} catch (@Pc(349) Exception local349) {
						}
					}
				}
			} else if (local53 == 85 && Static191.anInt3184 > 0) {
				Static393.aString47 = Static393.aString47.substring(0, Static191.anInt3184 - 1) + Static393.aString47.substring(Static191.anInt3184);
				Static191.anInt3184--;
			} else if (local53 == 101 && Static191.anInt3184 < Static393.aString47.length()) {
				Static393.aString47 = Static393.aString47.substring(0, Static191.anInt3184) + Static393.aString47.substring(Static191.anInt3184 + 1);
			} else if (local53 == 96 && Static191.anInt3184 > 0) {
				Static191.anInt3184--;
			} else if (local53 == 97 && Static191.anInt3184 < Static393.aString47.length()) {
				Static191.anInt3184++;
			} else if (local53 == 102) {
				Static191.anInt3184 = 0;
			} else if (local53 == 103) {
				Static191.anInt3184 = Static393.aString47.length();
			} else if (local53 == 104 && Static286.aStringArray33.length > Static43.anInt5299) {
				Static43.anInt5299++;
				Static137.method1959();
				Static191.anInt3184 = Static393.aString47.length();
			} else if (local53 == 105 && Static43.anInt5299 > 0) {
				Static43.anInt5299--;
				Static137.method1959();
				Static191.anInt3184 = Static393.aString47.length();
			} else if (Static392.method5127(local57) || local57 == ':' || local57 == ',' || local57 == ' ' || local57 == '_' || local57 == '-' || local57 == '+' || local57 == '[' || local57 == ']') {
				Static393.aString47 = Static393.aString47.substring(0, Static191.anInt3184) + Static162.anInterface10Array2[local43].method1253() + Static393.aString47.substring(Static191.anInt3184);
				Static191.anInt3184++;
			}
		}
		Static323.anInt5038 = 0;
		Static251.method3223();
	}
}
