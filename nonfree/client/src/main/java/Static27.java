import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_166 = new Class265(22, -1);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
	public static int method5779(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z")
	public static boolean method5782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method5783() {
		if (Static50.anInt6160 < 102) {
			Static50.anInt6160 += 6;
		}
		if (Static411.anInt6846 != 0) {
			Static161.anInt6991 -= Static411.anInt6846 * 5;
			if (Static161.anInt6991 >= Static155.anInt3171) {
				Static161.anInt6991 = Static155.anInt3171 - 1;
			}
			Static411.anInt6846 = 0;
			if (Static161.anInt6991 < 0) {
				Static161.anInt6991 = 0;
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static222.anInt4305; local48++) {
			@Pc(56) int local56 = Static23.aClass141Array1[local48].method4288();
			@Pc(62) char local62 = Static23.aClass141Array1[local48].method4290();
			if (local56 == 84) {
				Static266.method3989();
			} else if (Static334.aClass226_1.method4977(82) && local56 == 66) {
				if (Static283.aClipboard2 != null) {
					@Pc(341) String local341 = "";
					for (@Pc(346) int local346 = Static311.aStringArray39.length - 1; local346 >= 0; local346--) {
						if (Static311.aStringArray39[local346] != null && Static311.aStringArray39[local346].length() > 0) {
							local341 = local341 + Static311.aStringArray39[local346] + '\n';
						}
					}
					Static283.aClipboard2.setContents(new StringSelection(local341), null);
				}
			} else if (Static334.aClass226_1.method4977(82) && local56 == 67) {
				if (Static283.aClipboard2 != null) {
					@Pc(91) Transferable local91 = Static283.aClipboard2.getContents(null);
					if (local91 != null) {
						try {
							@Pc(98) String local98 = (String) local91.getTransferData(DataFlavor.stringFlavor);
							if (local98 != null) {
								@Pc(105) String[] local105 = Static455.method4448('\n', local98);
								if (local105.length > 1) {
									for (@Pc(113) int local113 = 0; local113 < local105.length; local113++) {
										Static20.aString3 = local105[local113];
										Static266.method3989();
									}
								} else {
									Static20.aString3 = Static20.aString3 + local98;
								}
							}
						} catch (@Pc(139) Exception local139) {
						}
					}
				}
			} else if (local56 == 85 && Static174.anInt3461 > 0) {
				Static20.aString3 = Static20.aString3.substring(0, Static174.anInt3461 - 1) + Static20.aString3.substring(Static174.anInt3461);
				Static174.anInt3461--;
			} else if (local56 == 101 && Static174.anInt3461 < Static20.aString3.length()) {
				Static20.aString3 = Static20.aString3.substring(0, Static174.anInt3461) + Static20.aString3.substring(Static174.anInt3461 + 1);
			} else if (local56 == 96 && Static174.anInt3461 > 0) {
				Static174.anInt3461--;
			} else if (local56 == 97 && Static174.anInt3461 < Static20.aString3.length()) {
				Static174.anInt3461++;
			} else if (local56 == 102) {
				Static174.anInt3461 = 0;
			} else if (local56 == 103) {
				Static174.anInt3461 = Static20.aString3.length();
			} else if (local56 == 104 && Static311.aStringArray39.length > Static341.anInt2745) {
				Static341.anInt2745++;
				Static380.method5089();
				Static174.anInt3461 = Static20.aString3.length();
			} else if (local56 == 105 && Static341.anInt2745 > 0) {
				Static341.anInt2745--;
				Static380.method5089();
				Static174.anInt3461 = Static20.aString3.length();
			} else if (Static22.method465(local62) || local62 == ':' || local62 == ',' || local62 == ' ' || local62 == '_' || local62 == '-' || local62 == '+' || local62 == '[' || local62 == ']') {
				Static20.aString3 = Static20.aString3.substring(0, Static174.anInt3461) + Static23.aClass141Array1[local48].method4290() + Static20.aString3.substring(Static174.anInt3461);
				Static174.anInt3461++;
			}
		}
		Static222.anInt4305 = 0;
		Static260.method3927();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)I")
	public static int method5784(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
