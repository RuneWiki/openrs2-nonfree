import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
	public static int anInt6349;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Lclient!bu;")
	public static Class32 aClass32_80;

	@OriginalMember(owner = "client!ss", name = "o", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
	public static final int anInt6352 = 1406;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public static void method4935(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 14);
		local8.method3244();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	public static void method4936() {
		if (Static316.anInt5563 != 0) {
			Static183.anInt3946 -= Static316.anInt5563 * 5;
			if (Static213.anInt4089 <= Static183.anInt3946) {
				Static183.anInt3946 = Static213.anInt4089 - 1;
			}
			if (Static183.anInt3946 < 0) {
				Static183.anInt3946 = 0;
			}
			Static316.anInt5563 = 0;
		}
		if (Static323.anInt1153 < 102) {
			Static323.anInt1153 += 6;
		}
		for (@Pc(47) int local47 = 0; local47 < Static43.anInt1138; local47++) {
			@Pc(55) int local55 = Static188.aClass60Array1[local47].method3174();
			@Pc(61) char local61 = Static188.aClass60Array1[local47].method3179();
			if (local55 == 84) {
				Static337.method4503();
			} else if (Static263.aClass10_1.method301(82) && local55 == 66) {
				if (Static96.aClipboard1 != null) {
					@Pc(360) String local360 = "";
					for (@Pc(365) int local365 = Static271.aStringArray36.length - 1; local365 >= 0; local365--) {
						if (Static271.aStringArray36[local365] != null && Static271.aStringArray36[local365].length() > 0) {
							local360 = local360 + Static271.aStringArray36[local365] + '\n';
						}
					}
					Static96.aClipboard1.setContents(new StringSelection(local360), null);
				}
			} else if (Static263.aClass10_1.method301(82) && local55 == 67) {
				if (Static96.aClipboard1 != null) {
					@Pc(90) Transferable local90 = Static96.aClipboard1.getContents(null);
					if (local90 != null) {
						try {
							@Pc(97) String local97 = (String) local90.getTransferData(DataFlavor.stringFlavor);
							if (local97 != null) {
								@Pc(104) String[] local104 = Static379.method4945(local97, '\n');
								if (local104.length > 1) {
									for (@Pc(110) int local110 = 0; local110 < local104.length; local110++) {
										Static392.aString57 = local104[local110];
										Static337.method4503();
									}
								} else {
									Static392.aString57 = Static392.aString57 + local97;
								}
							}
						} catch (@Pc(136) Exception local136) {
						}
					}
				}
			} else if (local55 == 85 && Static73.anInt1828 > 0) {
				Static392.aString57 = Static392.aString57.substring(0, Static73.anInt1828 - 1) + Static392.aString57.substring(Static73.anInt1828);
				Static73.anInt1828--;
			} else if (local55 == 101 && Static73.anInt1828 < Static392.aString57.length()) {
				Static392.aString57 = Static392.aString57.substring(0, Static73.anInt1828) + Static392.aString57.substring(Static73.anInt1828 + 1);
			} else if (local55 == 96 && Static73.anInt1828 > 0) {
				Static73.anInt1828--;
			} else if (local55 == 97 && Static73.anInt1828 < Static392.aString57.length()) {
				Static73.anInt1828++;
			} else if (local55 == 102) {
				Static73.anInt1828 = 0;
			} else if (local55 == 103) {
				Static73.anInt1828 = Static392.aString57.length();
			} else if (local55 == 104 && Static271.aStringArray36.length > Static98.anInt2238) {
				Static98.anInt2238++;
				Static453.method5973();
				Static73.anInt1828 = Static392.aString57.length();
			} else if (local55 == 105 && Static98.anInt2238 > 0) {
				Static98.anInt2238--;
				Static453.method5973();
				Static73.anInt1828 = Static392.aString57.length();
			} else if (Static25.method590(local61) || local61 == ':' || local61 == ',' || local61 == ' ' || local61 == '_' || local61 == '-' || local61 == '+' || local61 == '[' || local61 == ']') {
				Static392.aString57 = Static392.aString57.substring(0, Static73.anInt1828) + Static188.aClass60Array1[local47].method3179() + Static392.aString57.substring(Static73.anInt1828);
				Static73.anInt1828++;
			}
		}
		Static43.anInt1138 = 0;
		Static36.method725();
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V")
	public static void method4937() {
		if (Static10.aClass182_1 != Static205.aClass182_7) {
			try {
				Static456.method852("tbrefresh", Static332.aClient1);
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
