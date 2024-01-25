import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
	public static int anInt1944 = -1;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_78 = new Class56(56, 3);

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_79 = new Class56(42, 3);

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method1580() {
		if (Static157.anInt2901 != 0) {
			Static278.anInt4618 -= Static157.anInt2901 * 5;
			if (Static278.anInt4618 >= Static197.anInt3567) {
				Static278.anInt4618 = Static197.anInt3567 - 1;
			}
			Static157.anInt2901 = 0;
			if (Static278.anInt4618 < 0) {
				Static278.anInt4618 = 0;
			}
		}
		if (Static5.anInt89 < 102) {
			Static5.anInt89 += 6;
		}
		for (@Pc(35) int local35 = 0; local35 < Static306.anInt5006; local35++) {
			@Pc(43) int local43 = Static167.aClass36Array1[local35].method576();
			@Pc(49) char local49 = Static167.aClass36Array1[local35].method577();
			if (local43 == 84) {
				Static446.method5931();
			} else if (Static180.aClass107_1.method2003(82) && local43 == 66) {
				if (Static142.aClipboard1 != null) {
					@Pc(345) String local345 = "";
					for (@Pc(350) int local350 = Static307.aStringArray35.length - 1; local350 >= 0; local350--) {
						if (Static307.aStringArray35[local350] != null && Static307.aStringArray35[local350].length() > 0) {
							local345 = local345 + Static307.aStringArray35[local350] + '\n';
						}
					}
					Static142.aClipboard1.setContents(new StringSelection(local345), null);
				}
			} else if (Static180.aClass107_1.method2003(82) && local43 == 67) {
				if (Static142.aClipboard1 != null) {
					@Pc(287) Transferable local287 = Static142.aClipboard1.getContents(null);
					if (local287 != null) {
						try {
							@Pc(294) String local294 = (String) local287.getTransferData(DataFlavor.stringFlavor);
							if (local294 != null) {
								@Pc(301) String[] local301 = Static15.method181(local294, '\n');
								if (local301.length <= 1) {
									Static406.aString70 = Static406.aString70 + local294;
								} else {
									for (@Pc(320) int local320 = 0; local320 < local301.length; local320++) {
										Static406.aString70 = local301[local320];
										Static446.method5931();
									}
								}
							}
						} catch (@Pc(339) Exception local339) {
						}
					}
				}
			} else if (local43 == 85 && Static396.anInt6462 > 0) {
				Static406.aString70 = Static406.aString70.substring(0, Static396.anInt6462 - 1) + Static406.aString70.substring(Static396.anInt6462);
				Static396.anInt6462--;
			} else if (local43 == 101 && Static396.anInt6462 < Static406.aString70.length()) {
				Static406.aString70 = Static406.aString70.substring(0, Static396.anInt6462) + Static406.aString70.substring(Static396.anInt6462 + 1);
			} else if (local43 == 96 && Static396.anInt6462 > 0) {
				Static396.anInt6462--;
			} else if (local43 == 97 && Static396.anInt6462 < Static406.aString70.length()) {
				Static396.anInt6462++;
			} else if (local43 == 102) {
				Static396.anInt6462 = 0;
			} else if (local43 == 103) {
				Static396.anInt6462 = Static406.aString70.length();
			} else if (local43 == 104 && Static330.anInt5369 < Static307.aStringArray35.length) {
				Static330.anInt5369++;
				Static52.method683();
				Static396.anInt6462 = Static406.aString70.length();
			} else if (local43 == 105 && Static330.anInt5369 > 0) {
				Static330.anInt5369--;
				Static52.method683();
				Static396.anInt6462 = Static406.aString70.length();
			} else if (Static148.method2082(local49) || local49 == ':' || local49 == ',' || local49 == ' ' || local49 == '_' || local49 == '-' || local49 == '+' || local49 == '[' || local49 == ']') {
				Static406.aString70 = Static406.aString70.substring(0, Static396.anInt6462) + Static167.aClass36Array1[local35].method577() + Static406.aString70.substring(Static396.anInt6462);
				Static396.anInt6462++;
			}
		}
		Static306.anInt5006 = 0;
		Static194.method5772();
	}
}
