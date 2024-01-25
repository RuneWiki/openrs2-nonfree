import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
	public static int[] anIntArray762;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "[I")
	public static int[] anIntArray763;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_87 = new Class205(62, -2);

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
	public static final int[] anIntArray761 = new int[25];

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!vh;")
	public static final Class2_Sub16_Sub2 aClass2_Sub16_Sub2_1 = new Class2_Sub16_Sub2(5000);

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method3575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local21;
		@Pc(35) Object local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg0; local47++) {
			if (local21 + (local47 & 0x1) > arg3[local47]) {
				@Pc(67) int local67 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17] = local67;
				@Pc(81) Object local81 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local81;
			}
		}
		arg3[arg0] = arg3[local17];
		arg3[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method3575(local17 - 1, arg1, arg2, arg3);
		method3575(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)V")
	public static void method3576() {
		if (Static379.aClass63_10 != null) {
			Static379.aClass63_10.method2050();
			Static201.aClass9_2 = null;
			Static379.aClass63_10 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I")
	public static int method3577(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I")
	public static int method3578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static335.anIntArray1167[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	public static void method3579() {
		if (Static303.anInt5140 != 0) {
			Static337.anInt5767 -= Static303.anInt5140 * 5;
			if (Static89.anInt1712 <= Static337.anInt5767) {
				Static337.anInt5767 = Static89.anInt1712 - 1;
			}
			Static303.anInt5140 = 0;
			if (Static337.anInt5767 < 0) {
				Static337.anInt5767 = 0;
			}
		}
		if (Static366.anInt6204 < 102) {
			Static366.anInt6204 += 6;
		}
		@Pc(48) int local48;
		for (@Pc(40) int local40 = 0; local40 < Static184.anInt3459; local40++) {
			local48 = Static360.aClass162Array1[local40].method4027();
			@Pc(56) char local56 = Static360.aClass162Array1[local40].method4033();
			if (local48 == 84) {
				Static55.method920();
			} else if (Static48.aClass69_1.method2261(82) && local48 == 66) {
				if (Static309.aClipboard1 != null) {
					@Pc(71) String local71 = "";
					for (@Pc(76) int local76 = Static79.aStringArray120.length - 1; local76 >= 0; local76--) {
						if (Static79.aStringArray120[local76] != null && Static79.aStringArray120[local76].length() > 0) {
							local71 = local71 + Static79.aStringArray120[local76] + '\n';
						}
					}
					Static309.aClipboard1.setContents(new StringSelection(local71), null);
				}
			} else if (Static48.aClass69_1.method2261(82) && local48 == 67) {
				if (Static309.aClipboard1 != null) {
					@Pc(342) Transferable local342 = Static309.aClipboard1.getContents(null);
					if (local342 != null) {
						try {
							@Pc(349) String local349 = (String) local342.getTransferData(DataFlavor.stringFlavor);
							if (local349 != null) {
								@Pc(356) String[] local356 = Static104.method2176('\n', local349);
								if (local356.length > 1) {
									for (@Pc(362) int local362 = 0; local362 < local356.length; local362++) {
										Static250.aString52 = local356[local362];
										Static55.method920();
									}
								} else {
									Static250.aString52 = Static250.aString52 + local349;
								}
							}
						} catch (@Pc(388) Exception local388) {
						}
					}
				}
			} else if (local48 == 85 && Static98.anInt2060 > 0) {
				Static250.aString52 = Static250.aString52.substring(0, Static98.anInt2060 - 1) + Static250.aString52.substring(Static98.anInt2060);
				Static98.anInt2060--;
			} else if (local48 == 101 && Static98.anInt2060 < Static250.aString52.length()) {
				Static250.aString52 = Static250.aString52.substring(0, Static98.anInt2060) + Static250.aString52.substring(Static98.anInt2060 + 1);
			} else if (local48 == 96 && Static98.anInt2060 > 0) {
				Static98.anInt2060--;
			} else if (local48 == 97 && Static98.anInt2060 < Static250.aString52.length()) {
				Static98.anInt2060++;
			} else if (local48 == 102) {
				Static98.anInt2060 = 0;
			} else if (local48 == 103) {
				Static98.anInt2060 = Static250.aString52.length();
			} else if (local48 == 104 && Static263.anInt4604 < Static79.aStringArray120.length) {
				Static263.anInt4604++;
				Static285.method4328();
				Static98.anInt2060 = Static250.aString52.length();
			} else if (local48 == 105 && Static263.anInt4604 > 0) {
				Static263.anInt4604--;
				Static285.method4328();
				Static98.anInt2060 = Static250.aString52.length();
			} else if (Static131.method2584(local56) || local56 == ':' || local56 == ',' || local56 == ' ' || local56 == '_' || local56 == '-' || local56 == '+' || local56 == '[' || local56 == ']') {
				Static250.aString52 = Static250.aString52.substring(0, Static98.anInt2060) + Static360.aClass162Array1[local40].method4033() + Static250.aString52.substring(Static98.anInt2060);
				Static98.anInt2060++;
			}
		}
		Static184.anInt3459 = 0;
		for (local48 = 0; local48 < 100; local48++) {
			@Pc(421) int local421;
			if (Static16.aBooleanArray6[local48]) {
				local421 = Static217.anIntArray772[local48]++;
				if (Static217.anIntArray772[local48] > 102) {
					Static16.aBooleanArray6[local48] = false;
				}
			} else {
				local421 = Static217.anIntArray772[local48]--;
				if (Static217.anIntArray772[local48] < 0) {
					Static210.anIntArray754[local48] = (int) (Math.random() * (double) Static253.anInt4467);
					Static263.anIntArray893[local48] = (int) (Math.random() * 350.0D);
					Static217.anIntArray772[local48] = 0;
					Static16.aBooleanArray6[local48] = true;
				}
			}
		}
		Static240.method3873();
	}
}
