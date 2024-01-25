import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "Lclient!el;")
	public static final Class109 aClass109_49 = new Class109(6, -1);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1643() {
		if (Static258.anInt4452 < 102) {
			Static258.anInt4452 += 6;
		}
		@Pc(33) int local33;
		if (Static553.anInt9325 != -1 && Static515.method7499(116) > Static61.aLong28) {
			for (local33 = Static553.anInt9325; local33 < Static107.aStringArray14.length; local33++) {
				if (Static107.aStringArray14[local33].startsWith("pause")) {
					@Pc(58) int local58 = 5;
					try {
						local58 = Integer.parseInt(Static107.aStringArray14[local33].substring(6));
					} catch (@Pc(67) Exception local67) {
					}
					Static619.method3013("Pausing for " + local58 + " seconds...");
					Static553.anInt9325 = local33 + 1;
					Static61.aLong28 = Static515.method7499(96) + (long) (local58 * 1000);
					return;
				}
				Static497.aString134 = Static107.aStringArray14[local33];
				Static566.method8155(false);
			}
			Static553.anInt9325 = -1;
		}
		if (Static659.anInt10600 != 0) {
			Static154.anInt2438 -= Static659.anInt10600 * 5;
			if (Static503.anInt8655 <= Static154.anInt2438) {
				Static154.anInt2438 = Static503.anInt8655 - 1;
			}
			if (Static154.anInt2438 < 0) {
				Static154.anInt2438 = 0;
			}
			Static659.anInt10600 = 0;
		}
		for (local33 = 0; local33 < Static643.anInt10457; local33++) {
			@Pc(150) Interface12 local150 = Static538.anInterface12Array2[local33];
			@Pc(154) int local154 = local150.method6718();
			@Pc(158) char local158 = local150.method6714();
			@Pc(162) int local162 = local150.method6716();
			if (local154 == 84) {
				Static566.method8155(false);
			}
			if (local154 == 80) {
				Static566.method8155(true);
			} else if (local154 == 66 && (local162 & 0x4) != 0) {
				if (Static210.aClipboard5 != null) {
					@Pc(458) String local458 = "";
					for (@Pc(463) int local463 = Static117.aStringArray15.length - 1; local463 >= 0; local463--) {
						if (Static117.aStringArray15[local463] != null && Static117.aStringArray15[local463].length() > 0) {
							local458 = local458 + Static117.aStringArray15[local463] + '\n';
						}
					}
					Static210.aClipboard5.setContents(new StringSelection(local458), (ClipboardOwner) null);
				}
			} else if (local154 == 67 && (local162 & 0x4) != 0) {
				if (Static210.aClipboard5 != null) {
					@Pc(205) Transferable local205 = Static210.aClipboard5.getContents((Object) null);
					if (local205 != null) {
						try {
							@Pc(212) String local212 = (String) local205.getTransferData(DataFlavor.stringFlavor);
							if (local212 != null) {
								@Pc(219) String[] local219 = Static439.method6502(local212, '\n');
								Static201.method2887(local219);
							}
						} catch (@Pc(224) Exception local224) {
						}
					}
				}
			} else if (local154 == 85 && Static287.anInt5059 > 0) {
				Static497.aString134 = Static497.aString134.substring(0, Static287.anInt5059 - 1) + Static497.aString134.substring(Static287.anInt5059);
				Static287.anInt5059--;
			} else if (local154 == 101 && Static287.anInt5059 < Static497.aString134.length()) {
				Static497.aString134 = Static497.aString134.substring(0, Static287.anInt5059) + Static497.aString134.substring(Static287.anInt5059 + 1);
			} else if (local154 == 96 && Static287.anInt5059 > 0) {
				Static287.anInt5059--;
			} else if (local154 == 97 && Static287.anInt5059 < Static497.aString134.length()) {
				Static287.anInt5059++;
			} else if (local154 == 102) {
				Static287.anInt5059 = 0;
			} else if (local154 == 103) {
				Static287.anInt5059 = Static497.aString134.length();
			} else if (local154 == 104 && Static117.aStringArray15.length > Static440.anInt7528) {
				Static440.anInt7528++;
				Static630.method8823();
				Static287.anInt5059 = Static497.aString134.length();
			} else if (local154 == 105 && Static440.anInt7528 > 0) {
				Static440.anInt7528--;
				Static630.method8823();
				Static287.anInt5059 = Static497.aString134.length();
			} else if (Static469.method6848(local158) || "\\/.:, _-+[]~@".indexOf(local158) != -1) {
				Static497.aString134 = Static497.aString134.substring(0, Static287.anInt5059) + Static538.anInterface12Array2[local33].method6714() + Static497.aString134.substring(Static287.anInt5059);
				Static287.anInt5059++;
			}
		}
		Static643.anInt10457 = 0;
		Static357.anInt6272 = 0;
		Static437.method6493();
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public static void method1644() {
		@Pc(5) int local5 = 0;
		if (Static637.aClass5_Sub20_31 != null) {
			local5 = Static637.aClass5_Sub20_31.aClass24_Sub27_1.method8302();
		}
		@Pc(40) int local40;
		@Pc(48) int local48;
		if (local5 == 2) {
			local40 = Static340.anInt6053 <= 800 ? Static340.anInt6053 : 800;
			Static211.anInt3445 = (Static340.anInt6053 - local40) / 2;
			local48 = Static584.anInt9793 > 600 ? 600 : Static584.anInt9793;
			Static70.anInt1125 = local40;
			Static631.anInt10283 = local48;
			Static228.anInt3709 = 0;
		} else if (local5 == 1) {
			local40 = Static340.anInt6053 <= 1024 ? Static340.anInt6053 : 1024;
			local48 = Static584.anInt9793 <= 768 ? Static584.anInt9793 : 768;
			Static70.anInt1125 = local40;
			Static211.anInt3445 = (Static340.anInt6053 - local40) / 2;
			Static228.anInt3709 = 0;
			Static631.anInt10283 = local48;
		} else {
			Static228.anInt3709 = 0;
			Static631.anInt10283 = Static584.anInt9793;
			Static211.anInt3445 = 0;
			Static70.anInt1125 = Static340.anInt6053;
		}
	}
}
