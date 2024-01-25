import java.awt.Canvas;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!pg;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)I")
	public static int method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static285.aClass60Array8 == null) {
			return 0;
		} else if (arg1 < 3) {
			@Pc(21) int local21 = arg4 >> 9;
			@Pc(25) int local25 = arg0 >> 9;
			if (arg2 < 0 || arg3 < 0 || Static301.anInt4912 - 1 < arg2 || arg3 > Static473.anInt7969 - 1) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && local21 <= Static301.anInt4912 - 1 && local25 <= Static473.anInt7969 - 1) {
				@Pc(84) boolean local84 = (Static303.aByteArrayArrayArray13[1][arg4 >> 9][arg0 >> 9] & 0x2) != 0;
				@Pc(112) boolean local112;
				@Pc(128) boolean local128;
				if ((arg4 & 0x1FF) == 0) {
					local112 = (Static303.aByteArrayArrayArray13[1][local21 - 1][arg0 >> 9] & 0x2) != 0;
					local128 = (Static303.aByteArrayArrayArray13[1][local21][arg0 >> 9] & 0x2) != 0;
					if (local128 != local112) {
						local84 = (Static303.aByteArrayArrayArray13[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if ((arg0 & 0x1FF) == 0) {
					local112 = (Static303.aByteArrayArrayArray13[1][arg4 >> 9][local25 - 1] & 0x2) != 0;
					local128 = (Static303.aByteArrayArrayArray13[1][arg4 >> 9][local25] & 0x2) != 0;
					if (local128 != local112) {
						local84 = (Static303.aByteArrayArrayArray13[1][arg2][arg3] & 0x2) != 0;
					}
				}
				if (local84) {
					arg1++;
				}
				return Static285.aClass60Array8[arg1].sa(arg4, arg0);
			} else {
				return 0;
			}
		} else {
			return Static285.aClass60Array8[arg1].sa(arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method456() {
		if (Static146.anInt2581 == 3) {
			Static99.method1593(4);
		} else if (Static146.anInt2581 == 7) {
			Static99.method1593(8);
		} else if (Static146.anInt2581 == 10) {
			Static99.method1593(11);
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public static void method457() {
		if (Static130.aClass287_1 != Static376.aClass287_6) {
			try {
				Static587.method3349(Static153.aClient1, "tbrefresh");
			} catch (@Pc(20) Throwable local20) {
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	public static void method459() {
		if (Static501.anInt8338 < 102) {
			Static501.anInt8338 += 6;
		}
		if (Static563.anInt9404 != 0) {
			Static537.anInt9110 -= Static563.anInt9404 * 5;
			if (Static537.anInt9110 >= Static444.anInt7729) {
				Static537.anInt9110 = Static444.anInt7729 - 1;
			}
			if (Static537.anInt9110 < 0) {
				Static537.anInt9110 = 0;
			}
			Static563.anInt9404 = 0;
		}
		for (@Pc(41) int local41 = 0; local41 < Static71.anInt1181; local41++) {
			@Pc(49) Interface16 local49 = Static142.anInterface16Array1[local41];
			@Pc(53) int local53 = local49.method944();
			@Pc(57) char local57 = local49.method947();
			@Pc(61) int local61 = local49.method946();
			if (local53 == 84) {
				Static175.method2694(false);
			}
			if (local53 == 80) {
				Static175.method2694(true);
			} else if (local53 == 66 && (local61 & 0x4) != 0) {
				if (Static505.aClipboard1 != null) {
					@Pc(357) String local357 = "";
					for (@Pc(362) int local362 = Static316.aStringArray22.length - 1; local362 >= 0; local362--) {
						if (Static316.aStringArray22[local362] != null && Static316.aStringArray22[local362].length() > 0) {
							local357 = local357 + Static316.aStringArray22[local362] + '\n';
						}
					}
					Static505.aClipboard1.setContents(new StringSelection(local357), null);
				}
			} else if (local53 == 67 && (local61 & 0x4) != 0) {
				if (Static505.aClipboard1 != null) {
					@Pc(302) Transferable local302 = Static505.aClipboard1.getContents(null);
					if (local302 != null) {
						try {
							@Pc(309) String local309 = (String) local302.getTransferData(DataFlavor.stringFlavor);
							if (local309 != null) {
								@Pc(316) String[] local316 = Static128.method1936(local309, '\n');
								if (local316.length > 1) {
									for (@Pc(324) int local324 = 0; local324 < local316.length; local324++) {
										Static298.aString68 = local316[local324];
										Static175.method2694(false);
									}
								} else {
									Static298.aString68 = Static298.aString68 + local309;
								}
							}
						} catch (@Pc(351) Exception local351) {
						}
					}
				}
			} else if (local53 == 85 && Static133.anInt4719 > 0) {
				Static298.aString68 = Static298.aString68.substring(0, Static133.anInt4719 - 1) + Static298.aString68.substring(Static133.anInt4719);
				Static133.anInt4719--;
			} else if (local53 == 101 && Static133.anInt4719 < Static298.aString68.length()) {
				Static298.aString68 = Static298.aString68.substring(0, Static133.anInt4719) + Static298.aString68.substring(Static133.anInt4719 + 1);
			} else if (local53 == 96 && Static133.anInt4719 > 0) {
				Static133.anInt4719--;
			} else if (local53 == 97 && Static133.anInt4719 < Static298.aString68.length()) {
				Static133.anInt4719++;
			} else if (local53 == 102) {
				Static133.anInt4719 = 0;
			} else if (local53 == 103) {
				Static133.anInt4719 = Static298.aString68.length();
			} else if (local53 == 104 && Static398.anInt7032 < Static316.aStringArray22.length) {
				Static398.anInt7032++;
				Static554.method7611();
				Static133.anInt4719 = Static298.aString68.length();
			} else if (local53 == 105 && Static398.anInt7032 > 0) {
				Static398.anInt7032--;
				Static554.method7611();
				Static133.anInt4719 = Static298.aString68.length();
			} else if (Static83.method1316(local57) || local57 == ':' || local57 == ',' || local57 == ' ' || local57 == '_' || local57 == '-' || local57 == '+' || local57 == '[' || local57 == ']') {
				Static298.aString68 = Static298.aString68.substring(0, Static133.anInt4719) + Static142.anInterface16Array1[local41].method947() + Static298.aString68.substring(Static133.anInt4719);
				Static133.anInt4719++;
			}
		}
		Static71.anInt1181 = 0;
		Static39.anInt679 = 0;
		Static260.method3643();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBLjava/awt/Canvas;Lclient!e;)Lclient!oa;")
	public static Class121 method461(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class121_Sub3(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method462(@OriginalArg(1) Class121 arg0) {
		for (@Pc(18) Class102_Sub6 local18 = (Class102_Sub6) Static430.aClass249_5.method5817(); local18 != null; local18 = (Class102_Sub6) Static430.aClass249_5.method5815()) {
			if (local18.aBoolean570) {
				local18.method6846(arg0);
			}
		}
	}
}
