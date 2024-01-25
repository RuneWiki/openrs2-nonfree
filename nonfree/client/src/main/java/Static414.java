import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!f;")
	public static Class3 aClass3_24;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!qo;")
	public static final Class196 aClass196_39 = new Class196(8);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
	public static final int[] anIntArray621 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static int anInt7043 = 0;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_247 = new Class186(61, 7);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method5432() {
		if (Static430.anInt7165 != 0) {
			Static331.anInt5817 -= Static430.anInt7165 * 5;
			if (Static331.anInt5817 >= Static130.anInt2598) {
				Static331.anInt5817 = Static130.anInt2598 - 1;
			}
			Static430.anInt7165 = 0;
			if (Static331.anInt5817 < 0) {
				Static331.anInt5817 = 0;
			}
		}
		if (Static278.anInt7279 < 102) {
			Static278.anInt7279 += 6;
		}
		for (@Pc(50) int local50 = 0; local50 < Static83.anInt1892; local50++) {
			@Pc(58) int local58 = Static344.aClass150Array1[local50].method3231();
			@Pc(64) char local64 = Static344.aClass150Array1[local50].method3230();
			if (local58 == 84) {
				Static253.method3468();
			} else if (Static23.aClass14_1.method1510(82) && local58 == 66) {
				if (Static311.aClipboard1 != null) {
					@Pc(362) String local362 = "";
					for (@Pc(367) int local367 = Static76.aStringArray10.length - 1; local367 >= 0; local367--) {
						if (Static76.aStringArray10[local367] != null && Static76.aStringArray10[local367].length() > 0) {
							local362 = local362 + Static76.aStringArray10[local367] + '\n';
						}
					}
					Static311.aClipboard1.setContents(new StringSelection(local362), null);
				}
			} else if (Static23.aClass14_1.method1510(82) && local58 == 67) {
				if (Static311.aClipboard1 != null) {
					@Pc(93) Transferable local93 = Static311.aClipboard1.getContents(null);
					if (local93 != null) {
						try {
							@Pc(100) String local100 = (String) local93.getTransferData(DataFlavor.stringFlavor);
							if (local100 != null) {
								@Pc(109) String[] local109 = Static220.method4275('\n', local100);
								if (local109.length > 1) {
									for (@Pc(117) int local117 = 0; local117 < local109.length; local117++) {
										Static127.aString23 = local109[local117];
										Static253.method3468();
									}
								} else {
									Static127.aString23 = Static127.aString23 + local100;
								}
							}
						} catch (@Pc(147) Exception local147) {
						}
					}
				}
			} else if (local58 == 85 && Static10.anInt350 > 0) {
				Static127.aString23 = Static127.aString23.substring(0, Static10.anInt350 - 1) + Static127.aString23.substring(Static10.anInt350);
				Static10.anInt350--;
			} else if (local58 == 101 && Static10.anInt350 < Static127.aString23.length()) {
				Static127.aString23 = Static127.aString23.substring(0, Static10.anInt350) + Static127.aString23.substring(Static10.anInt350 + 1);
			} else if (local58 == 96 && Static10.anInt350 > 0) {
				Static10.anInt350--;
			} else if (local58 == 97 && Static10.anInt350 < Static127.aString23.length()) {
				Static10.anInt350++;
			} else if (local58 == 102) {
				Static10.anInt350 = 0;
			} else if (local58 == 103) {
				Static10.anInt350 = Static127.aString23.length();
			} else if (local58 == 104 && Static121.anInt2513 < Static76.aStringArray10.length) {
				Static121.anInt2513++;
				Static86.method4900();
				Static10.anInt350 = Static127.aString23.length();
			} else if (local58 == 105 && Static121.anInt2513 > 0) {
				Static121.anInt2513--;
				Static86.method4900();
				Static10.anInt350 = Static127.aString23.length();
			} else if (Static167.method2480(local64) || local64 == ':' || local64 == ',' || local64 == ' ' || local64 == '_' || local64 == '-' || local64 == '+' || local64 == '[' || local64 == ']') {
				Static127.aString23 = Static127.aString23.substring(0, Static10.anInt350) + Static344.aClass150Array1[local50].method3230() + Static127.aString23.substring(Static10.anInt350);
				Static10.anInt350++;
			}
		}
		Static83.anInt1892 = 0;
		Static262.method3574();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)C")
	public static char method5433(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local12, 16) + " provided");
		}
		if (local12 >= 128 && local12 < 160) {
			@Pc(43) char local43 = Static49.aCharArray3[local12 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local12 = local43;
		}
		return (char) local12;
	}
}
