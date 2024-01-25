import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I")
	public static int method1082(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static636.method8900(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIII)I")
	public static int method1083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & 0x3;
		if (local9 == 0) {
			return arg1;
		} else if (local9 == 1) {
			return arg2;
		} else if (local9 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method1084() {
		if (Static417.anInt7162 < 102) {
			Static417.anInt7162 += 6;
		}
		@Pc(37) int local37;
		if (Static82.anInt1435 != -1 && Static213.aLong166 < Static26.method382()) {
			for (local37 = Static82.anInt1435; local37 < Static434.aStringArray30.length; local37++) {
				if (Static434.aStringArray30[local37].startsWith("pause")) {
					@Pc(51) int local51 = 5;
					try {
						local51 = Integer.parseInt(Static434.aStringArray30[local37].substring(6));
					} catch (@Pc(60) Exception local60) {
					}
					Static590.method8398("Pausing for " + local51 + " seconds...");
					Static82.anInt1435 = local37 + 1;
					Static213.aLong166 = Static26.method382() + (long) (local51 * 1000);
					return;
				}
				Static434.aString85 = Static434.aStringArray30[local37];
				Static302.method4909(false);
			}
			Static82.anInt1435 = -1;
		}
		if (Static438.anInt7390 != 0) {
			Static411.anInt7100 -= Static438.anInt7390 * 5;
			if (Static411.anInt7100 >= Static46.anInt765) {
				Static411.anInt7100 = Static46.anInt765 - 1;
			}
			Static438.anInt7390 = 0;
			if (Static411.anInt7100 < 0) {
				Static411.anInt7100 = 0;
			}
		}
		for (local37 = 0; local37 < Static563.anInt4938; local37++) {
			@Pc(148) Interface17 local148 = Static340.anInterface17Array1[local37];
			@Pc(157) int local157 = local148.method647();
			@Pc(161) char local161 = local148.method650();
			@Pc(165) int local165 = local148.method646();
			if (local157 == 84) {
				Static302.method4909(false);
			}
			if (local157 == 80) {
				Static302.method4909(true);
			} else if (local157 == 66 && (local165 & 0x4) != 0) {
				if (Static661.aClipboard1 != null) {
					@Pc(202) String local202 = "";
					for (@Pc(207) int local207 = Static658.aStringArray47.length - 1; local207 >= 0; local207--) {
						if (Static658.aStringArray47[local207] != null && Static658.aStringArray47[local207].length() > 0) {
							local202 = local202 + Static658.aStringArray47[local207] + '\n';
						}
					}
					Static661.aClipboard1.setContents(new StringSelection(local202), (ClipboardOwner) null);
				}
			} else if (local157 == 67 && (local165 & 0x4) != 0) {
				if (Static661.aClipboard1 != null) {
					try {
						@Pc(273) Transferable local273 = Static661.aClipboard1.getContents((Object) null);
						if (local273 != null) {
							@Pc(280) String local280 = (String) local273.getTransferData(DataFlavor.stringFlavor);
							if (local280 != null) {
								@Pc(287) String[] local287 = Static407.method2868(local280, '\n');
								Static23.method345(local287);
							}
						}
					} catch (@Pc(292) Exception local292) {
					}
				}
			} else if (local157 == 85 && Static340.anInt5803 > 0) {
				Static434.aString85 = Static434.aString85.substring(0, Static340.anInt5803 - 1) + Static434.aString85.substring(Static340.anInt5803);
				Static340.anInt5803--;
			} else if (local157 == 101 && Static340.anInt5803 < Static434.aString85.length()) {
				Static434.aString85 = Static434.aString85.substring(0, Static340.anInt5803) + Static434.aString85.substring(Static340.anInt5803 + 1);
			} else if (local157 == 96 && Static340.anInt5803 > 0) {
				Static340.anInt5803--;
			} else if (local157 == 97 && Static340.anInt5803 < Static434.aString85.length()) {
				Static340.anInt5803++;
			} else if (local157 == 102) {
				Static340.anInt5803 = 0;
			} else if (local157 == 103) {
				Static340.anInt5803 = Static434.aString85.length();
			} else if (local157 == 104 && Static658.aStringArray47.length > Static663.anInt10804) {
				Static663.anInt10804++;
				Static658.method9180();
				Static340.anInt5803 = Static434.aString85.length();
			} else if (local157 == 105 && Static663.anInt10804 > 0) {
				Static663.anInt10804--;
				Static658.method9180();
				Static340.anInt5803 = Static434.aString85.length();
			} else if (Static237.method3983(local161) || "\\/.:, _-+[]~@".indexOf(local161) != -1) {
				Static434.aString85 = Static434.aString85.substring(0, Static340.anInt5803) + Static340.anInterface17Array1[local37].method650() + Static434.aString85.substring(Static340.anInt5803);
				Static340.anInt5803++;
			}
		}
		Static563.anInt4938 = 0;
		Static200.anInt9878 = 0;
		Static438.method6532();
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lclient!lha;")
	public static Class14_Sub26 method1085() {
		@Pc(7) Class345 local7 = null;
		@Pc(13) Class14_Sub26 local13 = new Class14_Sub26(Static161.aClass80_6, 0);
		try {
			@Pc(19) Class230 local19 = Static344.aClass173_5.method4249("");
			while (local19.anInt6256 == 0) {
				Static548.method7968(1L);
			}
			if (local19.anInt6256 == 1) {
				local7 = (Class345) local19.anObject12;
				@Pc(45) byte[] local45 = new byte[(int) local7.method8254()];
				@Pc(60) int local60;
				for (@Pc(47) int local47 = 0; local47 < local45.length; local47 += local60) {
					local60 = local7.method8256(local45.length - local47, local45, local47);
					if (local60 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class14_Sub26(new Class14_Sub21(local45), Static161.aClass80_6, 0);
			}
		} catch (@Pc(96) Exception local96) {
		}
		try {
			if (local7 != null) {
				local7.method8253();
			}
		} catch (@Pc(110) Exception local110) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public static void method1086() {
		Static556.aClass14_Sub1_Sub3_4 = null;
		Static316.anInt5540 = -1;
		Static625.anInt11174 = 1;
		Static270.aBoolean372 = false;
		Static431.aClass310_93 = null;
		Static338.anInt5769 = 2;
		Static485.anInt8392 = -1;
		Static210.anInt3677 = 0;
	}
}
