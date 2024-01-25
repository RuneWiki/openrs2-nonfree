import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static331.method4435(arg0, Static155.anInt2670, Static219.anInt6125);
		@Pc(27) int local27 = Static331.method4435(arg2, Static155.anInt2670, Static219.anInt6125);
		@Pc(33) int local33 = Static331.method4435(arg4, Static215.anInt3546, Static317.anInt6670);
		@Pc(39) int local39 = Static331.method4435(arg3, Static215.anInt3546, Static317.anInt6670);
		for (@Pc(41) int local41 = local11; local41 <= local27; local41++) {
			Static216.method2862(local33, local39, arg1, Static229.anIntArrayArray26[local41]);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
	public static void method2540() {
		if (Static95.anInt2403 != 0) {
			Static157.anInt2696 -= Static95.anInt2403 * 5;
			if (Static157.anInt2696 >= Static166.anInt2851) {
				Static157.anInt2696 = Static166.anInt2851 - 1;
			}
			Static95.anInt2403 = 0;
			if (Static157.anInt2696 < 0) {
				Static157.anInt2696 = 0;
			}
		}
		if (Static238.anInt3827 < 102) {
			Static238.anInt3827 += 6;
		}
		for (@Pc(44) int local44 = 0; local44 < Static380.anInt440; local44++) {
			@Pc(54) int local54 = Static55.aClass7Array1[local44].method138();
			@Pc(60) char local60 = Static55.aClass7Array1[local44].method136();
			if (local54 == 84) {
				Static259.method3494(false);
			}
			if (local54 == 80) {
				Static259.method3494(true);
			} else if (Static218.aClass181_1.method3865(82) && local54 == 66) {
				if (Static168.aClipboard1 != null) {
					@Pc(83) String local83 = "";
					for (@Pc(88) int local88 = Static382.aStringArray35.length - 1; local88 >= 0; local88--) {
						if (Static382.aStringArray35[local88] != null && Static382.aStringArray35[local88].length() > 0) {
							local83 = local83 + Static382.aStringArray35[local88] + '\n';
						}
					}
					Static168.aClipboard1.setContents(new StringSelection(local83), null);
				}
			} else if (Static218.aClass181_1.method3865(82) && local54 == 67) {
				if (Static168.aClipboard1 != null) {
					@Pc(347) Transferable local347 = Static168.aClipboard1.getContents(null);
					if (local347 != null) {
						try {
							@Pc(354) String local354 = (String) local347.getTransferData(DataFlavor.stringFlavor);
							if (local354 != null) {
								@Pc(361) String[] local361 = Static203.method2715('\n', local354);
								if (local361.length <= 1) {
									Static93.aString56 = Static93.aString56 + local354;
								} else {
									for (@Pc(380) int local380 = 0; local380 < local361.length; local380++) {
										Static93.aString56 = local361[local380];
										Static259.method3494(false);
									}
								}
							}
						} catch (@Pc(400) Exception local400) {
						}
					}
				}
			} else if (local54 == 85 && Static63.anInt1185 > 0) {
				Static93.aString56 = Static93.aString56.substring(0, Static63.anInt1185 - 1) + Static93.aString56.substring(Static63.anInt1185);
				Static63.anInt1185--;
			} else if (local54 == 101 && Static63.anInt1185 < Static93.aString56.length()) {
				Static93.aString56 = Static93.aString56.substring(0, Static63.anInt1185) + Static93.aString56.substring(Static63.anInt1185 + 1);
			} else if (local54 == 96 && Static63.anInt1185 > 0) {
				Static63.anInt1185--;
			} else if (local54 == 97 && Static63.anInt1185 < Static93.aString56.length()) {
				Static63.anInt1185++;
			} else if (local54 == 102) {
				Static63.anInt1185 = 0;
			} else if (local54 == 103) {
				Static63.anInt1185 = Static93.aString56.length();
			} else if (local54 == 104 && Static382.aStringArray35.length > Static73.anInt1390) {
				Static73.anInt1390++;
				Static266.method3613();
				Static63.anInt1185 = Static93.aString56.length();
			} else if (local54 == 105 && Static73.anInt1390 > 0) {
				Static73.anInt1390--;
				Static266.method3613();
				Static63.anInt1185 = Static93.aString56.length();
			} else if (Static328.method4416(local60) || local60 == ':' || local60 == ',' || local60 == ' ' || local60 == '_' || local60 == '-' || local60 == '+' || local60 == '[' || local60 == ']') {
				Static93.aString56 = Static93.aString56.substring(0, Static63.anInt1185) + Static55.aClass7Array1[local44].method136() + Static93.aString56.substring(Static63.anInt1185);
				Static63.anInt1185++;
			}
		}
		Static380.anInt440 = 0;
		Static204.method2721();
	}
}
