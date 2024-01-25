import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
	public static final int[] anIntArray284 = new int[13];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V")
	public static void method2894(@OriginalArg(0) boolean arg0) {
		Static77.method1347(arg0, Static207.anInt3842, Static255.anInt4574, Static273.anInt4878);
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method2896() {
		if (Static415.anInt7240 < 102) {
			Static415.anInt7240 += 6;
		}
		if (Static257.anInt4626 != 0) {
			Static381.anInt5293 -= Static257.anInt4626 * 5;
			if (Static241.anInt4308 <= Static381.anInt5293) {
				Static381.anInt5293 = Static241.anInt4308 - 1;
			}
			Static257.anInt4626 = 0;
			if (Static381.anInt5293 < 0) {
				Static381.anInt5293 = 0;
			}
		}
		for (@Pc(55) int local55 = 0; local55 < Static242.anInt4339; local55++) {
			@Pc(63) int local63 = Static148.aClass21Array1[local55].method3182();
			@Pc(69) char local69 = Static148.aClass21Array1[local55].method3180();
			if (local63 == 84) {
				Static239.method3548();
			} else if (Static102.aClass163_1.method3809(82) && local63 == 66) {
				if (Static251.aClipboard1 != null) {
					@Pc(368) String local368 = "";
					for (@Pc(373) int local373 = Static35.aStringArray21.length - 1; local373 >= 0; local373--) {
						if (Static35.aStringArray21[local373] != null && Static35.aStringArray21[local373].length() > 0) {
							local368 = local368 + Static35.aStringArray21[local373] + '\n';
						}
					}
					Static251.aClipboard1.setContents(new StringSelection(local368), null);
				}
			} else if (Static102.aClass163_1.method3809(82) && local63 == 67) {
				if (Static251.aClipboard1 != null) {
					@Pc(102) Transferable local102 = Static251.aClipboard1.getContents(null);
					if (local102 != null) {
						try {
							@Pc(109) String local109 = (String) local102.getTransferData(DataFlavor.stringFlavor);
							if (local109 != null) {
								@Pc(116) String[] local116 = Static326.method4592(local109, '\n');
								if (local116.length <= 1) {
									Static295.aString39 = Static295.aString39 + local109;
								} else {
									for (@Pc(133) int local133 = 0; local133 < local116.length; local133++) {
										Static295.aString39 = local116[local133];
										Static239.method3548();
									}
								}
							}
						} catch (@Pc(152) Exception local152) {
						}
					}
				}
			} else if (local63 == 85 && Static27.anInt561 > 0) {
				Static295.aString39 = Static295.aString39.substring(0, Static27.anInt561 - 1) + Static295.aString39.substring(Static27.anInt561);
				Static27.anInt561--;
			} else if (local63 == 101 && Static27.anInt561 < Static295.aString39.length()) {
				Static295.aString39 = Static295.aString39.substring(0, Static27.anInt561) + Static295.aString39.substring(Static27.anInt561 + 1);
			} else if (local63 == 96 && Static27.anInt561 > 0) {
				Static27.anInt561--;
			} else if (local63 == 97 && Static27.anInt561 < Static295.aString39.length()) {
				Static27.anInt561++;
			} else if (local63 == 102) {
				Static27.anInt561 = 0;
			} else if (local63 == 103) {
				Static27.anInt561 = Static295.aString39.length();
			} else if (local63 == 104 && Static162.anInt2970 < Static35.aStringArray21.length) {
				Static162.anInt2970++;
				Static140.method1962();
				Static27.anInt561 = Static295.aString39.length();
			} else if (local63 == 105 && Static162.anInt2970 > 0) {
				Static162.anInt2970--;
				Static140.method1962();
				Static27.anInt561 = Static295.aString39.length();
			} else if (Static241.method3554(local69) || local69 == ':' || local69 == ',' || local69 == ' ' || local69 == '_' || local69 == '-' || local69 == '+' || local69 == '[' || local69 == ']') {
				Static295.aString39 = Static295.aString39.substring(0, Static27.anInt561) + Static148.aClass21Array1[local55].method3180() + Static295.aString39.substring(Static27.anInt561);
				Static27.anInt561++;
			}
		}
		Static242.anInt4339 = 0;
		Static353.method4882();
	}
}
