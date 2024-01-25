import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
	public static int anInt9914 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public static void method8366() {
		if (Static406.anInt7522 < 102) {
			Static406.anInt7522 += 6;
		}
		@Pc(28) int local28;
		if (Static603.anInt10033 != -1 && Static560.aLong247 < Static32.method595()) {
			for (local28 = Static603.anInt10033; local28 < Static422.aStringArray53.length; local28++) {
				if (Static422.aStringArray53[local28].startsWith("pause")) {
					@Pc(38) int local38 = 5;
					try {
						local38 = Integer.parseInt(Static422.aStringArray53[local28].substring(6));
					} catch (@Pc(47) Exception local47) {
					}
					Static97.method1576("Pausing for " + local38 + " seconds...");
					Static603.anInt10033 = local28 + 1;
					Static560.aLong247 = (long) (local38 * 1000) + Static32.method595();
					return;
				}
				Static489.aString98 = Static422.aStringArray53[local28];
				Static253.method4541(false);
			}
			Static603.anInt10033 = -1;
		}
		if (Static3.anInt51 != 0) {
			Static276.anInt5428 -= Static3.anInt51 * 5;
			if (Static162.anInt3372 <= Static276.anInt5428) {
				Static276.anInt5428 = Static162.anInt3372 - 1;
			}
			Static3.anInt51 = 0;
			if (Static276.anInt5428 < 0) {
				Static276.anInt5428 = 0;
			}
		}
		for (local28 = 0; local28 < Static519.anInt9082; local28++) {
			@Pc(132) Interface18 local132 = Static191.anInterface18Array1[local28];
			@Pc(136) int local136 = local132.method4141();
			@Pc(140) char local140 = local132.method4142();
			@Pc(144) int local144 = local132.method4138();
			if (local136 == 84) {
				Static253.method4541(false);
			}
			if (local136 == 80) {
				Static253.method4541(true);
			} else if (local136 == 66 && (local144 & 0x4) != 0) {
				if (Static590.aClipboard3 != null) {
					@Pc(429) String local429 = "";
					for (@Pc(434) int local434 = Static85.aStringArray17.length - 1; local434 >= 0; local434--) {
						if (Static85.aStringArray17[local434] != null && Static85.aStringArray17[local434].length() > 0) {
							local429 = local429 + Static85.aStringArray17[local434] + '\n';
						}
					}
					Static590.aClipboard3.setContents(new StringSelection(local429), (ClipboardOwner) null);
				}
			} else if (local136 == 67 && (local144 & 0x4) != 0) {
				if (Static590.aClipboard3 != null) {
					@Pc(183) Transferable local183 = Static590.aClipboard3.getContents((Object) null);
					if (local183 != null) {
						try {
							@Pc(190) String local190 = (String) local183.getTransferData(DataFlavor.stringFlavor);
							if (local190 != null) {
								@Pc(197) String[] local197 = Static513.method7614(local190, '\n');
								Static553.method8004(local197);
							}
						} catch (@Pc(202) Exception local202) {
						}
					}
				}
			} else if (local136 == 85 && Static44.anInt872 > 0) {
				Static489.aString98 = Static489.aString98.substring(0, Static44.anInt872 - 1) + Static489.aString98.substring(Static44.anInt872);
				Static44.anInt872--;
			} else if (local136 == 101 && Static44.anInt872 < Static489.aString98.length()) {
				Static489.aString98 = Static489.aString98.substring(0, Static44.anInt872) + Static489.aString98.substring(Static44.anInt872 + 1);
			} else if (local136 == 96 && Static44.anInt872 > 0) {
				Static44.anInt872--;
			} else if (local136 == 97 && Static44.anInt872 < Static489.aString98.length()) {
				Static44.anInt872++;
			} else if (local136 == 102) {
				Static44.anInt872 = 0;
			} else if (local136 == 103) {
				Static44.anInt872 = Static489.aString98.length();
			} else if (local136 == 104 && Static85.aStringArray17.length > Static180.anInt3707) {
				Static180.anInt3707++;
				Static234.method4072();
				Static44.anInt872 = Static489.aString98.length();
			} else if (local136 == 105 && Static180.anInt3707 > 0) {
				Static180.anInt3707--;
				Static234.method4072();
				Static44.anInt872 = Static489.aString98.length();
			} else if (Static214.method3650(local140) || local140 == '\\' || local140 == '/' || local140 == '.' || local140 == ':' || local140 == ',' || local140 == ' ' || local140 == '_' || local140 == '-' || local140 == '+' || local140 == '[' || local140 == ']') {
				Static489.aString98 = Static489.aString98.substring(0, Static44.anInt872) + Static191.anInterface18Array1[local28].method4142() + Static489.aString98.substring(Static44.anInt872);
				Static44.anInt872++;
			}
		}
		Static298.anInt6415 = 0;
		Static519.anInt9082 = 0;
		Static643.method8977();
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Z")
	public static boolean method8369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V")
	public static void method8371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static606.anInt8651 + arg1;
		@Pc(13) int local13 = Static195.anInt3961 + arg2;
		if (Static272.aClass97ArrayArrayArray3 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static442.anInt7975 || arg2 >= Static284.anInt7916 || Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0 && arg0 != Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) {
			return;
		}
		@Pc(56) long local56 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(62) Class6_Sub41 local62 = (Class6_Sub41) Static333.aClass128_46.method3560(local56);
		if (local62 == null) {
			Static549.method7974(arg0, arg1, arg2);
			return;
		}
		@Pc(76) Class6_Sub14 local76 = (Class6_Sub14) local62.aClass8_57.method149();
		if (local76 == null) {
			Static549.method7974(arg0, arg1, arg2);
			return;
		}
		@Pc(90) Class20_Sub2_Sub4_Sub1 local90 = (Class20_Sub2_Sub4_Sub1) Static549.method7974(arg0, arg1, arg2);
		if (local90 == null) {
			local90 = new Class20_Sub2_Sub4_Sub1(arg1 << 9, Static195.aClass199Array1[arg0].method8532(arg1, arg2), arg2 << 9, arg0, arg0);
		} else {
			local90.anInt6463 = local90.anInt6454 = -1;
		}
		local90.anInt6456 = local76.anInt2255;
		local90.anInt6462 = local76.anInt2253;
		label56: while (true) {
			@Pc(133) Class6_Sub14 local133 = (Class6_Sub14) local62.aClass8_57.method155();
			if (local133 == null) {
				break;
			}
			if (local133.anInt2255 != local90.anInt6456) {
				local90.anInt6463 = local133.anInt2255;
				local90.anInt6449 = local133.anInt2253;
				while (true) {
					@Pc(154) Class6_Sub14 local154 = (Class6_Sub14) local62.aClass8_57.method155();
					if (local154 == null) {
						break label56;
					}
					if (local154.anInt2255 != local90.anInt6456 && local154.anInt2255 != local90.anInt6463) {
						local90.anInt6454 = local154.anInt2255;
						local90.anInt6461 = local154.anInt2253;
					}
				}
			}
		}
		@Pc(198) int local198 = Static138.method2248((arg1 << 9) + 256, arg0, (arg2 << 9) + 256);
		local90.anInt10724 = local198;
		local90.anInt10725 = arg1 << 9;
		local90.anInt10729 = arg2 << 9;
		local90.aByte131 = (byte) arg0;
		local90.anInt6455 = 0;
		local90.aByte130 = (byte) arg0;
		if (Static492.method7384(arg1, arg2)) {
			local90.aByte130++;
		}
		Static86.method1739(arg0, arg1, arg2, local198, local90);
	}
}
