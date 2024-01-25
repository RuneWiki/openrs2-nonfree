import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[S")
	public static short[] aShortArray9;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[Lclient!tb;")
	public static Class234[] aClass234Array1;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Lclient!ni;")
	public static final Class169 aClass169_2 = new Class169();

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_2 = new Class229("", 16);

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method603() {
		if (Static217.anInt3861 != 0) {
			Static68.anInt1324 -= Static217.anInt3861 * 5;
			if (Static72.anInt1377 <= Static68.anInt1324) {
				Static68.anInt1324 = Static72.anInt1377 - 1;
			}
			if (Static68.anInt1324 < 0) {
				Static68.anInt1324 = 0;
			}
			Static217.anInt3861 = 0;
		}
		if (Static55.anInt939 < 102) {
			Static55.anInt939 += 6;
		}
		for (@Pc(45) int local45 = 0; local45 < Static425.anInt7000; local45++) {
			@Pc(53) int local53 = Static42.aClass16Array1[local45].method5108();
			@Pc(59) char local59 = Static42.aClass16Array1[local45].method5102();
			if (local53 == 84) {
				Static130.method2094(false);
			}
			if (local53 == 80) {
				Static130.method2094(true);
			} else if (Static310.aClass130_1.method5069(82) && local53 == 66) {
				if (Static403.aClipboard2 != null) {
					@Pc(368) String local368 = "";
					for (@Pc(373) int local373 = Static231.aStringArray52.length - 1; local373 >= 0; local373--) {
						if (Static231.aStringArray52[local373] != null && Static231.aStringArray52[local373].length() > 0) {
							local368 = local368 + Static231.aStringArray52[local373] + '\n';
						}
					}
					Static403.aClipboard2.setContents(new StringSelection(local368), null);
				}
			} else if (Static310.aClass130_1.method5069(82) && local53 == 67) {
				if (Static403.aClipboard2 != null) {
					@Pc(98) Transferable local98 = Static403.aClipboard2.getContents(null);
					if (local98 != null) {
						try {
							@Pc(105) String local105 = (String) local98.getTransferData(DataFlavor.stringFlavor);
							if (local105 != null) {
								@Pc(112) String[] local112 = Static295.method3893(local105, '\n');
								if (local112.length <= 1) {
									Static223.aString46 = Static223.aString46 + local105;
								} else {
									for (@Pc(131) int local131 = 0; local131 < local112.length; local131++) {
										Static223.aString46 = local112[local131];
										Static130.method2094(false);
									}
								}
							}
						} catch (@Pc(151) Exception local151) {
						}
					}
				}
			} else if (local53 == 85 && Static422.anInt6912 > 0) {
				Static223.aString46 = Static223.aString46.substring(0, Static422.anInt6912 - 1) + Static223.aString46.substring(Static422.anInt6912);
				Static422.anInt6912--;
			} else if (local53 == 101 && Static422.anInt6912 < Static223.aString46.length()) {
				Static223.aString46 = Static223.aString46.substring(0, Static422.anInt6912) + Static223.aString46.substring(Static422.anInt6912 + 1);
			} else if (local53 == 96 && Static422.anInt6912 > 0) {
				Static422.anInt6912--;
			} else if (local53 == 97 && Static422.anInt6912 < Static223.aString46.length()) {
				Static422.anInt6912++;
			} else if (local53 == 102) {
				Static422.anInt6912 = 0;
			} else if (local53 == 103) {
				Static422.anInt6912 = Static223.aString46.length();
			} else if (local53 == 104 && Static231.aStringArray52.length > Static267.anInt4535) {
				Static267.anInt4535++;
				Static33.method462();
				Static422.anInt6912 = Static223.aString46.length();
			} else if (local53 == 105 && Static267.anInt4535 > 0) {
				Static267.anInt4535--;
				Static33.method462();
				Static422.anInt6912 = Static223.aString46.length();
			} else if (Static247.method4214(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Static223.aString46 = Static223.aString46.substring(0, Static422.anInt6912) + Static42.aClass16Array1[local45].method5102() + Static223.aString46.substring(Static422.anInt6912);
				Static422.anInt6912++;
			}
		}
		Static425.anInt7000 = 0;
		Static193.method2788();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class28_Sub7 local7 = new Class28_Sub7();
		local7.anInt5877 = arg5;
		local7.anInt5879 = Static274.anInt4617 + arg1;
		local7.anInt5881 = arg0;
		local7.aString58 = arg6;
		local7.anInt5882 = arg3;
		local7.anInt5878 = arg2;
		local7.anInt5876 = arg4;
		Static335.aClass169_7.method3603(local7);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)Z")
	public static boolean method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static40.method2438(arg1, arg0) | Static282.method3734(arg0, arg1) | Static256.method3399(arg0, arg1)) & Static273.method3654(arg0, arg1);
	}
}
