import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	public static int anInt3111;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "[[[Lclient!ce;")
	public static Class36[][][] aClass36ArrayArrayArray1;

	@OriginalMember(owner = "client!ih", name = "Q", descriptor = "Lclient!ek;")
	public static Class69 aClass69_1;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_75 = new Class25(104, 4);

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "[I")
	public static final int[] anIntArray262 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	public static void method2561() {
		if (Static300.anInt5409 < 102) {
			Static300.anInt5409 += 6;
		}
		if (Static72.anInt1221 != 0) {
			Static142.anInt2604 -= Static72.anInt1221 * 5;
			if (Static275.anInt4981 <= Static142.anInt2604) {
				Static142.anInt2604 = Static275.anInt4981 - 1;
			}
			Static72.anInt1221 = 0;
			if (Static142.anInt2604 < 0) {
				Static142.anInt2604 = 0;
			}
		}
		for (@Pc(42) int local42 = 0; local42 < Static210.anInt3599; local42++) {
			@Pc(50) Interface2 local50 = Static127.anInterface2Array1[local42];
			@Pc(54) int local54 = local50.method2885();
			@Pc(58) char local58 = local50.method2883();
			@Pc(62) int local62 = local50.method2881();
			if (local54 == 84) {
				Static153.method2302(false);
			}
			if (local54 == 80) {
				Static153.method2302(true);
			} else if (local54 == 66 && (local62 & 0x4) != 0) {
				if (Static38.aClipboard1 != null) {
					@Pc(89) String local89 = "";
					for (@Pc(94) int local94 = Static20.aStringArray8.length - 1; local94 >= 0; local94--) {
						if (Static20.aStringArray8[local94] != null && Static20.aStringArray8[local94].length() > 0) {
							local89 = local89 + Static20.aStringArray8[local94] + '\n';
						}
					}
					Static38.aClipboard1.setContents(new StringSelection(local89), null);
				}
			} else if (local54 == 67 && (local62 & 0x4) != 0) {
				if (Static38.aClipboard1 != null) {
					@Pc(152) Transferable local152 = Static38.aClipboard1.getContents(null);
					if (local152 != null) {
						try {
							@Pc(159) String local159 = (String) local152.getTransferData(DataFlavor.stringFlavor);
							if (local159 != null) {
								@Pc(166) String[] local166 = Static305.method172(local159, '\n');
								if (local166.length > 1) {
									for (@Pc(172) int local172 = 0; local172 < local166.length; local172++) {
										Static216.aString73 = local166[local172];
										Static153.method2302(false);
									}
								} else {
									Static216.aString73 = Static216.aString73 + local159;
								}
							}
						} catch (@Pc(199) Exception local199) {
						}
					}
				}
			} else if (local54 == 85 && Static243.anInt4160 > 0) {
				Static216.aString73 = Static216.aString73.substring(0, Static243.anInt4160 - 1) + Static216.aString73.substring(Static243.anInt4160);
				Static243.anInt4160--;
			} else if (local54 == 101 && Static243.anInt4160 < Static216.aString73.length()) {
				Static216.aString73 = Static216.aString73.substring(0, Static243.anInt4160) + Static216.aString73.substring(Static243.anInt4160 + 1);
			} else if (local54 == 96 && Static243.anInt4160 > 0) {
				Static243.anInt4160--;
			} else if (local54 == 97 && Static243.anInt4160 < Static216.aString73.length()) {
				Static243.anInt4160++;
			} else if (local54 == 102) {
				Static243.anInt4160 = 0;
			} else if (local54 == 103) {
				Static243.anInt4160 = Static216.aString73.length();
			} else if (local54 == 104 && Static20.aStringArray8.length > Static286.anInt5137) {
				Static286.anInt5137++;
				Static134.method2135();
				Static243.anInt4160 = Static216.aString73.length();
			} else if (local54 == 105 && Static286.anInt5137 > 0) {
				Static286.anInt5137--;
				Static134.method2135();
				Static243.anInt4160 = Static216.aString73.length();
			} else if (Static194.method2778(local58) || local58 == ':' || local58 == ',' || local58 == ' ' || local58 == '_' || local58 == '-' || local58 == '+' || local58 == '[' || local58 == ']') {
				Static216.aString73 = Static216.aString73.substring(0, Static243.anInt4160) + Static127.anInterface2Array1[local42].method2883() + Static216.aString73.substring(Static243.anInt4160);
				Static243.anInt4160++;
			}
		}
		Static210.anInt3599 = 0;
		Static323.method4576();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!gi;II)V")
	public static void method2563(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static11.aBoolean7) {
			@Pc(182) Class198 local182 = Static456.anInt7598 == -1 ? null : Static275.aClass235_1.method5382(Static456.anInt7598);
			if (!Static53.method860(arg0).method5902() || (Static331.anInt5940 & 0x20) == 0) {
				return;
			}
			if (local182 == null || arg0.method2118(local182.anInt5653, Static456.anInt7598) != local182.anInt5653) {
				Static202.method2833(0L, arg0.anInt2508, true, false, Static359.aString66 + " -> " + arg0.aString21, arg0.anInt2488, arg0.anInt2424, Static88.aString38, 13, Static252.anInt4355);
			}
			return;
		}
		@Pc(21) String local21;
		for (@Pc(14) int local14 = 9; local14 >= 5; local14--) {
			local21 = Static241.method3326(local14, arg0);
			if (local21 != null) {
				Static202.method2833((long) (local14 + 1), arg0.anInt2508, true, false, arg0.aString21, arg0.anInt2488, arg0.anInt2424, local21, 1012, Static336.method4765(arg0, local14));
			}
		}
		local21 = Static332.method4735(arg0);
		if (local21 != null) {
			Static202.method2833(0L, arg0.anInt2508, true, false, arg0.aString21, arg0.anInt2488, arg0.anInt2424, local21, 5, arg0.anInt2503);
		}
		for (@Pc(84) int local84 = 4; local84 >= 0; local84--) {
			@Pc(91) String local91 = Static241.method3326(local84, arg0);
			if (local91 != null) {
				Static202.method2833((long) (local84 + 1), arg0.anInt2508, true, false, arg0.aString21, arg0.anInt2488, arg0.anInt2424, local91, 59, Static336.method4765(arg0, local84));
			}
		}
		if (!Static53.method860(arg0).method5899()) {
			return;
		}
		if (arg0.aString23 != null) {
			Static202.method2833(0L, arg0.anInt2508, true, false, "", arg0.anInt2488, arg0.anInt2424, arg0.aString23, 8, -1);
			return;
		}
		Static202.method2833(0L, arg0.anInt2508, true, false, "", arg0.anInt2488, arg0.anInt2424, Static153.aClass231_53.method5261(Static80.anInt6195), 8, -1);
		return;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Lclient!ii;")
	public static Class2_Sub1_Sub6 method2564() {
		@Pc(16) Class2_Sub1_Sub6 local16 = (Class2_Sub1_Sub6) Static429.aClass71_10.method1431();
		if (local16 != null) {
			local16.method6260();
			local16.method5838();
			return local16;
		}
		do {
			local16 = (Class2_Sub1_Sub6) Static57.aClass71_1.method1431();
			if (local16 == null) {
				return null;
			}
			if (local16.method2580() > Static432.method5870()) {
				return null;
			}
			local16.method6260();
			local16.method5838();
		} while ((Long.MIN_VALUE & local16.aLong378) == 0L);
		return local16;
	}
}
