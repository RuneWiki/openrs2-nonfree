import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!lc;")
	public static Class216 aClass216_1;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!da;")
	public static Class70 aClass70_11;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_211 = new Class381(44, 0);

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_212 = new Class381(21, 8);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method7022() {
		if (Static681.aClass349_6.aBoolean601 && Static253.aClass258_3.anInt6748 != -1) {
			Static660.method9072(Static253.aClass258_3.aString78, Static253.aClass258_3.anInt6748);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	public static void method7025() {
		if (Static38.anInt631 < 102) {
			Static38.anInt631 += 6;
		}
		@Pc(31) int local31;
		if (Static204.anInt3670 != -1 && Static480.method6763() > Static442.aLong210) {
			for (local31 = Static204.anInt3670; local31 < Static421.aStringArray31.length; local31++) {
				if (Static421.aStringArray31[local31].startsWith("pause")) {
					@Pc(45) int local45 = 5;
					try {
						local45 = Integer.parseInt(Static421.aStringArray31[local31].substring(6));
					} catch (@Pc(54) Exception local54) {
					}
					Static239.method3794("Pausing for " + local45 + " seconds...");
					Static204.anInt3670 = local31 + 1;
					Static442.aLong210 = (long) (local45 * 1000) + Static480.method6763();
					return;
				}
				Static220.aString35 = Static421.aStringArray31[local31];
				Static368.method5500(false);
			}
			Static204.anInt3670 = -1;
		}
		if (Static381.anInt6412 != 0) {
			Static165.anInt3245 -= Static381.anInt6412 * 5;
			if (Static356.anInt5849 <= Static165.anInt3245) {
				Static165.anInt3245 = Static356.anInt5849 - 1;
			}
			Static381.anInt6412 = 0;
			if (Static165.anInt3245 < 0) {
				Static165.anInt3245 = 0;
			}
		}
		for (local31 = 0; local31 < Static479.anInt7781; local31++) {
			@Pc(139) Interface23 local139 = Static154.anInterface23Array1[local31];
			@Pc(145) int local145 = local139.method4633();
			@Pc(149) char local149 = local139.method4634();
			@Pc(153) int local153 = local139.method4632();
			if (local145 == 84) {
				Static368.method5500(false);
			}
			if (local145 == 80) {
				Static368.method5500(true);
			} else if (local145 == 66 && (local153 & 0x4) != 0) {
				if (Static78.aClipboard1 != null) {
					@Pc(188) String local188 = "";
					for (@Pc(193) int local193 = Static464.aStringArray33.length - 1; local193 >= 0; local193--) {
						if (Static464.aStringArray33[local193] != null && Static464.aStringArray33[local193].length() > 0) {
							local188 = local188 + Static464.aStringArray33[local193] + '\n';
						}
					}
					Static78.aClipboard1.setContents(new StringSelection(local188), (ClipboardOwner) null);
				}
			} else if (local145 == 67 && (local153 & 0x4) != 0) {
				if (Static78.aClipboard1 != null) {
					@Pc(492) Transferable local492 = Static78.aClipboard1.getContents((Object) null);
					if (local492 != null) {
						try {
							@Pc(499) String local499 = (String) local492.getTransferData(DataFlavor.stringFlavor);
							if (local499 != null) {
								@Pc(506) String[] local506 = Static350.method5156('\n', local499);
								Static584.method8038(local506);
							}
						} catch (@Pc(511) Exception local511) {
						}
					}
				}
			} else if (local145 == 85 && Static335.anInt8972 > 0) {
				Static220.aString35 = Static220.aString35.substring(0, Static335.anInt8972 - 1) + Static220.aString35.substring(Static335.anInt8972);
				Static335.anInt8972--;
			} else if (local145 == 101 && Static335.anInt8972 < Static220.aString35.length()) {
				Static220.aString35 = Static220.aString35.substring(0, Static335.anInt8972) + Static220.aString35.substring(Static335.anInt8972 + 1);
			} else if (local145 == 96 && Static335.anInt8972 > 0) {
				Static335.anInt8972--;
			} else if (local145 == 97 && Static335.anInt8972 < Static220.aString35.length()) {
				Static335.anInt8972++;
			} else if (local145 == 102) {
				Static335.anInt8972 = 0;
			} else if (local145 == 103) {
				Static335.anInt8972 = Static220.aString35.length();
			} else if (local145 == 104 && Static471.anInt7669 < Static464.aStringArray33.length) {
				Static471.anInt7669++;
				Static673.method9140();
				Static335.anInt8972 = Static220.aString35.length();
			} else if (local145 == 105 && Static471.anInt7669 > 0) {
				Static471.anInt7669--;
				Static673.method9140();
				Static335.anInt8972 = Static220.aString35.length();
			} else if (Static340.method5097(local149) || "\\/.:, _-+[]~@".indexOf(local149) != -1) {
				Static220.aString35 = Static220.aString35.substring(0, Static335.anInt8972) + Static154.anInterface23Array1[local31].method4634() + Static220.aString35.substring(Static335.anInt8972);
				Static335.anInt8972++;
			}
		}
		Static479.anInt7781 = 0;
		Static322.anInt5498 = 0;
		Static352.method5188(-116);
	}
}
