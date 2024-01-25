import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "[[[Lclient!bt;")
	public static Class39[][][] aClass39ArrayArrayArray3;

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "Lclient!li;")
	public static Class209 aClass209_2;

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_54 = new Class70(19, 3);

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "J")
	public static volatile long aLong156 = 0L;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([ILclient!pu;ILclient!pu;)V")
	public static void method4118(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(3) Class270 arg2) {
		Static267.aClass270_53 = arg1;
		Static576.aClass270_119 = arg2;
		if (arg0 != null) {
			Static480.anIntArray622 = arg0;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
	public static void method4120() {
		if (Static299.anInt5150 < 102) {
			Static299.anInt5150 += 6;
		}
		@Pc(30) int local30;
		if (Static376.anInt6280 != -1 && Static428.aLong224 < Static413.method5668()) {
			for (local30 = Static376.anInt6280; local30 < Static144.aStringArray36.length; local30++) {
				if (Static144.aStringArray36[local30].startsWith("pause")) {
					@Pc(40) int local40 = 5;
					try {
						local40 = Integer.parseInt(Static144.aStringArray36[local30].substring(6));
					} catch (@Pc(49) Exception local49) {
					}
					Static165.method2388("Pausing for " + local40 + " seconds...");
					Static376.anInt6280 = local30 + 1;
					Static428.aLong224 = (long) (local40 * 1000) + Static413.method5668();
					return;
				}
				Static356.aString59 = Static144.aStringArray36[local30];
				Static356.method4855(false);
			}
			Static376.anInt6280 = -1;
		}
		if (Static587.anInt9589 != 0) {
			Static156.anInt2829 -= Static587.anInt9589 * 5;
			if (Static156.anInt2829 >= Static32.anInt511) {
				Static156.anInt2829 = Static32.anInt511 - 1;
			}
			Static587.anInt9589 = 0;
			if (Static156.anInt2829 < 0) {
				Static156.anInt2829 = 0;
			}
		}
		for (local30 = 0; local30 < Static594.anInt9654; local30++) {
			@Pc(120) Interface22 local120 = Static398.anInterface22Array1[local30];
			@Pc(124) int local124 = local120.method4450();
			@Pc(128) char local128 = local120.method4453();
			@Pc(132) int local132 = local120.method4449();
			if (local124 == 84) {
				Static356.method4855(false);
			}
			if (local124 == 80) {
				Static356.method4855(true);
			} else if (local124 == 66 && (local132 & 0x4) != 0) {
				if (Static314.aClipboard1 != null) {
					@Pc(474) String local474 = "";
					for (@Pc(479) int local479 = Static514.aStringArray35.length - 1; local479 >= 0; local479--) {
						if (Static514.aStringArray35[local479] != null && Static514.aStringArray35[local479].length() > 0) {
							local474 = local474 + Static514.aStringArray35[local479] + '\n';
						}
					}
					Static314.aClipboard1.setContents(new StringSelection(local474), null);
				}
			} else if (local124 == 67 && (local132 & 0x4) != 0) {
				if (Static314.aClipboard1 != null) {
					@Pc(174) Transferable local174 = Static314.aClipboard1.getContents(null);
					if (local174 != null) {
						try {
							@Pc(181) String local181 = (String) local174.getTransferData(DataFlavor.stringFlavor);
							if (local181 != null) {
								@Pc(188) String[] local188 = Static500.method7455('\n', local181);
								if (local188.length <= 1) {
									Static356.aString59 = Static356.aString59 + local181;
								} else {
									for (@Pc(205) int local205 = 0; local205 < local188.length; local205++) {
										if (local188[local205].startsWith("pause")) {
											@Pc(224) int local224 = 5;
											try {
												local224 = Integer.parseInt(local188[local205].substring(6));
											} catch (@Pc(233) Exception local233) {
											}
											Static165.method2388("Pausing for " + local224 + " seconds...");
											Static144.aStringArray36 = local188;
											Static376.anInt6280 = local205 + 1;
											Static428.aLong224 = (long) (local224 * 1000) + Static413.method5668();
											return;
										}
										Static356.aString59 = local188[local205];
										Static356.method4855(false);
									}
								}
							}
						} catch (@Pc(266) Exception local266) {
						}
					}
				}
			} else if (local124 == 85 && Static184.anInt3252 > 0) {
				Static356.aString59 = Static356.aString59.substring(0, Static184.anInt3252 - 1) + Static356.aString59.substring(Static184.anInt3252);
				Static184.anInt3252--;
			} else if (local124 == 101 && Static184.anInt3252 < Static356.aString59.length()) {
				Static356.aString59 = Static356.aString59.substring(0, Static184.anInt3252) + Static356.aString59.substring(Static184.anInt3252 + 1);
			} else if (local124 == 96 && Static184.anInt3252 > 0) {
				Static184.anInt3252--;
			} else if (local124 == 97 && Static184.anInt3252 < Static356.aString59.length()) {
				Static184.anInt3252++;
			} else if (local124 == 102) {
				Static184.anInt3252 = 0;
			} else if (local124 == 103) {
				Static184.anInt3252 = Static356.aString59.length();
			} else if (local124 == 104 && Static514.aStringArray35.length > Static133.anInt4003) {
				Static133.anInt4003++;
				Static221.method3417();
				Static184.anInt3252 = Static356.aString59.length();
			} else if (local124 == 105 && Static133.anInt4003 > 0) {
				Static133.anInt4003--;
				Static221.method3417();
				Static184.anInt3252 = Static356.aString59.length();
			} else if (Static535.method7314(local128) || local128 == ':' || local128 == ',' || local128 == ' ' || local128 == '_' || local128 == '-' || local128 == '+' || local128 == '[' || local128 == ']') {
				Static356.aString59 = Static356.aString59.substring(0, Static184.anInt3252) + Static398.anInterface22Array1[local30].method4453() + Static356.aString59.substring(Static184.anInt3252);
				Static184.anInt3252++;
			}
		}
		Static19.anInt242 = 0;
		Static594.anInt9654 = 0;
		Static164.method7470();
	}
}
