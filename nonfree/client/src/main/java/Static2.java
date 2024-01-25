import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	public static int anInt57;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_5 = new Class221(78, 4);

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
	public static int anInt54 = 765;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_6 = new Class221(94, 15);

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
	public static void method54() {
		if (Static123.anInt2610 < 102) {
			Static123.anInt2610 += 6;
		}
		if (Static184.anInt4075 != 0) {
			Static250.anInt5225 -= Static184.anInt4075 * 5;
			if (Static250.anInt5225 >= Static128.anInt2757) {
				Static250.anInt5225 = Static128.anInt2757 - 1;
			}
			if (Static250.anInt5225 < 0) {
				Static250.anInt5225 = 0;
			}
			Static184.anInt4075 = 0;
		}
		@Pc(53) int local53;
		for (@Pc(45) int local45 = 0; local45 < Static304.anInt6075; local45++) {
			local53 = Static255.aClass50Array1[local45].method1162();
			@Pc(59) char local59 = Static255.aClass50Array1[local45].method1165();
			if (local53 == 84) {
				Static66.method1359();
			} else if (Static166.aClass25_1.method398(82) && local53 == 66) {
				if (Static346.aClipboard2 != null) {
					@Pc(82) String local82 = "";
					for (@Pc(87) int local87 = Static81.aStringArray8.length - 1; local87 >= 0; local87--) {
						if (Static81.aStringArray8[local87] != null && Static81.aStringArray8[local87].length() > 0) {
							local82 = local82 + Static81.aStringArray8[local87] + '\n';
						}
					}
					Static346.aClipboard2.setContents(new StringSelection(local82), null);
				}
			} else if (Static166.aClass25_1.method398(82) && local53 == 67) {
				if (Static346.aClipboard2 != null) {
					@Pc(146) Transferable local146 = Static346.aClipboard2.getContents(null);
					if (local146 != null) {
						try {
							@Pc(153) String local153 = (String) local146.getTransferData(DataFlavor.stringFlavor);
							if (local153 != null) {
								@Pc(160) String[] local160 = Static137.method2633('\n', local153);
								if (local160.length > 1) {
									for (@Pc(168) int local168 = 0; local168 < local160.length; local168++) {
										Class139.lb = local160[local168];
										Static66.method1359();
									}
								} else {
									Class139.lb = Class139.lb + local153;
								}
							}
						} catch (@Pc(194) Exception local194) {
						}
					}
				}
			} else if (local53 == 85 && Static28.anInt436 > 0) {
				Class139.lb = Class139.lb.substring(0, Static28.anInt436 - 1) + Class139.lb.substring(Static28.anInt436);
				Static28.anInt436--;
			} else if (local53 == 101 && Static28.anInt436 < Class139.lb.length()) {
				Class139.lb = Class139.lb.substring(0, Static28.anInt436) + Class139.lb.substring(Static28.anInt436 + 1);
			} else if (local53 == 96 && Static28.anInt436 > 0) {
				Static28.anInt436--;
			} else if (local53 == 97 && Static28.anInt436 < Class139.lb.length()) {
				Static28.anInt436++;
			} else if (local53 == 102) {
				Static28.anInt436 = 0;
			} else if (local53 == 103) {
				Static28.anInt436 = Class139.lb.length();
			} else if (local53 == 104 && Static81.aStringArray8.length > Static353.anInt5913) {
				Static353.anInt5913++;
				Static65.method2535();
				Static28.anInt436 = Class139.lb.length();
			} else if (local53 == 105 && Static353.anInt5913 > 0) {
				Static353.anInt5913--;
				Static65.method2535();
				Static28.anInt436 = Class139.lb.length();
			} else if (Static32.method439(local59) || local59 == ':' || local59 == ',' || local59 == ' ' || local59 == '_' || local59 == '-' || local59 == '+' || local59 == '[' || local59 == ']') {
				Class139.lb = Class139.lb.substring(0, Static28.anInt436) + Static255.aClass50Array1[local45].method1165() + Class139.lb.substring(Static28.anInt436);
				Static28.anInt436++;
			}
		}
		Static304.anInt6075 = 0;
		for (local53 = 0; local53 < 100; local53++) {
			@Pc(417) int local417;
			if (Static351.aBooleanArray30[local53]) {
				local417 = Static63.anIntArray102[local53]++;
				if (Static63.anIntArray102[local53] > 102) {
					Static351.aBooleanArray30[local53] = false;
				}
			} else {
				local417 = Static63.anIntArray102[local53]--;
				if (Static63.anIntArray102[local53] < 0) {
					Static220.anIntArray355[local53] = (int) (Math.random() * (double) Static335.anInt6496);
					Static81.anIntArray127[local53] = (int) (Math.random() * 350.0D);
					Static63.anIntArray102[local53] = 0;
					Static351.aBooleanArray30[local53] = true;
				}
			}
		}
		Static35.method5765();
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
	public static void method55() {
		if (Static17.aClass26_1 == null) {
			return;
		}
		if (Static17.aClass26_1.anInt484 == 1) {
			Static17.aClass26_1 = null;
			return;
		}
		if (Static17.aClass26_1.anInt484 == 2) {
			Static360.method5741(Static126.aString27, Static43.aClass179_3, 2);
			Static17.aClass26_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method56(@OriginalArg(1) long arg0) {
		Static53.aCalendar1.setTime(new Date(arg0));
		@Pc(20) int local20 = Static53.aCalendar1.get(7);
		@Pc(24) int local24 = Static53.aCalendar1.get(5);
		@Pc(28) int local28 = Static53.aCalendar1.get(2);
		@Pc(32) int local32 = Static53.aCalendar1.get(1);
		@Pc(36) int local36 = Static53.aCalendar1.get(11);
		@Pc(40) int local40 = Static53.aCalendar1.get(12);
		@Pc(44) int local44 = Static53.aCalendar1.get(13);
		return Static250.aStringArray34[local20 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static108.aStringArray15[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!je;B[I[I[I)V")
	public static void method57(@OriginalArg(0) Class1_Sub2_Sub3_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg3[local11];
			for (@Pc(27) int local27 = 0; local21 != 0 && local27 < arg0.aClass212Array3.length; local27++) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg0.aClass212Array3[local27] = null;
					} else {
						@Pc(40) Class84 local40 = Static91.method1822(local17);
						@Pc(43) int local43 = local40.anInt2456;
						@Pc(48) Class212 local48 = arg0.aClass212Array3[local27];
						if (local48 != null) {
							if (local48.anInt6755 == local17) {
								if (local43 == 0) {
									local48 = arg0.aClass212Array3[local27] = null;
								} else if (local43 == 1) {
									local48.anInt6759 = 0;
									local48.anInt6753 = local25;
									local48.anInt6757 = 1;
									local48.anInt6752 = 0;
									local48.anInt6756 = 0;
									Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, 0, arg0.anInt6888, arg0.anInt6893, local40, arg0.aByte77);
								} else if (local43 == 2) {
									local48.anInt6759 = 0;
								}
							} else if (local40.anInt2459 >= Static91.method1822(local48.anInt6755).anInt2459) {
								local48 = arg0.aClass212Array3[local27] = null;
							}
						}
						if (local48 == null) {
							local48 = arg0.aClass212Array3[local27] = new Class212();
							local48.anInt6755 = local17;
							local48.anInt6759 = 0;
							local48.anInt6756 = 0;
							local48.anInt6752 = 0;
							local48.anInt6753 = local25;
							local48.anInt6757 = 1;
							Static41.method4705(arg0 == Static177.aClass1_Sub2_Sub3_Sub1_1, 0, arg0.anInt6888, arg0.anInt6893, local40, arg0.aByte77);
						}
					}
				}
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	public static boolean method59(@OriginalArg(1) int arg0) {
		if (arg0 == 23 || arg0 == 44 || arg0 == 12 || arg0 == 46 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 51 || arg0 == 1009;
		}
	}
}
