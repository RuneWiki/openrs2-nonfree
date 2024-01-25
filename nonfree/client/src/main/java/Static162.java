import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "Lclient!bb;")
	public static Class5_Sub6 aClass5_Sub6_2;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[200];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)Lclient!i;")
	public static Class89 method2849(@OriginalArg(1) int arg0) {
		@Pc(5) Class109 local5 = Static155.aClass109_36;
		@Pc(14) Class89 local14;
		synchronized (Static155.aClass109_36) {
			local14 = (Class89) Static155.aClass109_36.method2857((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static123.aClass93_49.method2410(Static311.method3262(arg0), Static184.method5032(arg0));
		local14 = new Class89();
		local14.anInt2467 = arg0;
		if (local34 != null) {
			local14.method2268(new Class5_Sub12(local34));
		}
		local14.method2267();
		@Pc(63) Class109 local63 = Static155.aClass109_36;
		synchronized (Static155.aClass109_36) {
			Static155.aClass109_36.method2855((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public static void method2851() {
		if (Static156.anInt3027 != 0) {
			Static175.anInt2812 -= Static156.anInt3027 * 5;
			if (Static247.anInt4947 <= Static175.anInt2812) {
				Static175.anInt2812 = Static247.anInt4947 - 1;
			}
			if (Static175.anInt2812 < 0) {
				Static175.anInt2812 = 0;
			}
			Static156.anInt3027 = 0;
		}
		if (Static54.anInt1001 < 102) {
			Static54.anInt1001 += 6;
		}
		@Pc(56) int local56;
		for (@Pc(48) int local48 = 0; local48 < Static258.anInt5091; local48++) {
			local56 = Static55.aClass19Array3[local48].method429();
			@Pc(62) char local62 = Static55.aClass19Array3[local48].method427();
			if (local56 == 84) {
				Static54.method858();
			} else if (Static174.aClass2_1.method1425(82) && local56 == 66) {
				if (Static11.aClipboard1 != null) {
					@Pc(77) String local77 = "";
					for (@Pc(82) int local82 = Static17.aStringArray4.length - 1; local82 >= 0; local82--) {
						if (Static17.aStringArray4[local82] != null && Static17.aStringArray4[local82].length() > 0) {
							local77 = local77 + Static17.aStringArray4[local82] + '\n';
						}
					}
					Static11.aClipboard1.setContents(new StringSelection(local77), null);
				}
			} else if (Static174.aClass2_1.method1425(82) && local56 == 67) {
				if (Static11.aClipboard1 != null) {
					@Pc(335) Transferable local335 = Static11.aClipboard1.getContents(null);
					if (local335 != null) {
						try {
							@Pc(342) String local342 = (String) local335.getTransferData(DataFlavor.stringFlavor);
							if (local342 != null) {
								@Pc(349) String[] local349 = Static172.method4047(local342, '\n');
								if (local349.length > 1) {
									for (@Pc(355) int local355 = 0; local355 < local349.length; local355++) {
										Static163.aString20 = local349[local355];
										Static54.method858();
									}
								} else {
									Static163.aString20 = Static163.aString20 + local342;
								}
							}
						} catch (@Pc(381) Exception local381) {
						}
					}
				}
			} else if (local56 == 85 && Static93.anInt1788 > 0) {
				Static163.aString20 = Static163.aString20.substring(0, Static93.anInt1788 - 1) + Static163.aString20.substring(Static93.anInt1788);
				Static93.anInt1788--;
			} else if (local56 == 101 && Static93.anInt1788 < Static163.aString20.length()) {
				Static163.aString20 = Static163.aString20.substring(0, Static93.anInt1788) + Static163.aString20.substring(Static93.anInt1788 + 1);
			} else if (local56 == 96 && Static93.anInt1788 > 0) {
				Static93.anInt1788--;
			} else if (local56 == 97 && Static93.anInt1788 < Static163.aString20.length()) {
				Static93.anInt1788++;
			} else if (local56 == 102) {
				Static93.anInt1788 = 0;
			} else if (local56 == 103) {
				Static93.anInt1788 = Static163.aString20.length();
			} else if (local56 == 104 && Static229.anInt4634 < Static17.aStringArray4.length) {
				Static229.anInt4634++;
				Static75.method1398();
				Static93.anInt1788 = Static163.aString20.length();
			} else if (local56 == 105 && Static229.anInt4634 > 0) {
				Static229.anInt4634--;
				Static75.method1398();
				Static93.anInt1788 = Static163.aString20.length();
			} else if (Static42.method646(local62) || local62 == ':' || local62 == ',' || local62 == ' ' || local62 == '_' || local62 == '-' || local62 == '+') {
				Static163.aString20 = Static163.aString20.substring(0, Static93.anInt1788) + Static55.aClass19Array3[local48].method427() + Static163.aString20.substring(Static93.anInt1788);
				Static93.anInt1788++;
			}
		}
		Static258.anInt5091 = 0;
		for (local56 = 0; local56 < 100; local56++) {
			@Pc(407) int local407;
			if (Static207.aBooleanArray16[local56]) {
				local407 = Static192.anIntArray382[local56]++;
				if (Static192.anIntArray382[local56] > 102) {
					Static207.aBooleanArray16[local56] = false;
				}
			} else {
				local407 = Static192.anIntArray382[local56]--;
				if (Static192.anIntArray382[local56] < 0) {
					Static125.anIntArray239[local56] = (int) (Math.random() * (double) Static168.anInt3376);
					Static183.anIntArray365[local56] = (int) (Math.random() * 350.0D);
					Static192.anIntArray382[local56] = 0;
					Static207.aBooleanArray16[local56] = true;
				}
			}
		}
		Static300.method5274();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)S")
	public static short method2852(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(42) int local42 = local38 + local19;
		@Pc(48) int local48;
		if (local42 == 0) {
			local48 = local38 << 1;
		} else {
			local48 = (local38 << 8) / local42;
		}
		return (short) (local48 >> 4 << 7 | local9 << 10 | local42);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)I")
	public static int method2856(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method2860() {
		if (Static222.aClass136_1 == null) {
			return;
		}
		while (true) {
			while (Static241.aClass6_Sub1Array2.length > Static168.anInt3378) {
				@Pc(25) Class6_Sub1 local25 = Static241.aClass6_Sub1Array2[Static168.anInt3378];
				if (local25 != null && local25.anInt86 == -1) {
					if (Static128.aClass5_Sub40_3 == null) {
						Static128.aClass5_Sub40_3 = Static222.aClass136_1.method3755(local25.aString1);
					}
					@Pc(48) int local48 = Static128.aClass5_Sub40_3.anInt6005;
					if (local48 == -1) {
						return;
					}
					Static168.anInt3378++;
					local25.anInt86 = local48;
					Static128.aClass5_Sub40_3 = null;
				} else {
					Static168.anInt3378++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!ij;Lclient!ij;)V")
	public static void method2861(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class93 arg1) {
		Static343.aClass93_125 = arg1;
		Static346.aClass93_131 = arg0;
	}
}
