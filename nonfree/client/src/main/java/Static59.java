import java.awt.Graphics;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!nb;")
	public static Class24 aClass24_14;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_771 = Static38.method736("0(U");

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!vc;")
	private static Class71 aClass71_773 = Static38.method736("Unexpected server response");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_772 = aClass71_773;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!vc;")
	public static Class71 aClass71_774 = Static38.method736("l");

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_775 = Static38.method736("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!vc;")
	private static Class71 aClass71_776 = Static38.method736("flash1:");

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_777 = Static38.method736("leuchten3:");

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_778 = Static38.method736(" ");

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_779 = aClass71_776;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public static int anInt1539 = 0;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2 = new byte[4][104][104];

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!vc;")
	public static Class71 aClass71_780 = Static38.method736("Benutzen");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!r;I)V")
	public static void method1033(@OriginalArg(1) Class5_Sub11_Sub1 arg0) {
		while (true) {
			@Pc(18) Class5_Sub9 local18 = (Class5_Sub9) Static18.aClass52_4.method1358();
			if (local18 == null) {
				return;
			}
			@Pc(23) boolean local23 = false;
			for (@Pc(25) int local25 = 0; local25 < local18.anInt1886; local25++) {
				if (local18.aClass70Array1[local25] != null) {
					if (local18.aClass70Array1[local25].anInt2692 == 2) {
						local18.anIntArray234[local25] = -5;
					}
					if (local18.aClass70Array1[local25].anInt2692 == 0) {
						local23 = true;
					}
				}
				if (local18.aClass70Array2[local25] != null) {
					if (local18.aClass70Array2[local25].anInt2692 == 2) {
						local18.anIntArray234[local25] = -6;
					}
					if (local18.aClass70Array2[local25].anInt2692 == 0) {
						local23 = true;
					}
				}
			}
			if (local23) {
				return;
			}
			arg0.method1553(224);
			arg0.method1545(0);
			@Pc(108) int local108 = arg0.anInt2233;
			arg0.method1525(local18.anInt1879);
			for (@Pc(115) int local115 = 0; local115 < local18.anInt1886; local115++) {
				if (local18.anIntArray234[local115] == 0) {
					try {
						@Pc(139) int local139 = local18.anIntArray232[local115];
						@Pc(158) Field local158;
						@Pc(161) int local161;
						if (local139 == 0) {
							local158 = (Field) local18.aClass70Array1[local115].anObject3;
							local161 = local158.getInt(null);
							arg0.method1545(0);
							arg0.method1525(local161);
						} else if (local139 == 1) {
							local158 = (Field) local18.aClass70Array1[local115].anObject3;
							local158.setInt(null, local18.anIntArray235[local115]);
							arg0.method1545(0);
						} else if (local139 == 2) {
							local158 = (Field) local18.aClass70Array1[local115].anObject3;
							local161 = local158.getModifiers();
							arg0.method1545(0);
							arg0.method1525(local161);
						}
						@Pc(225) Method local225;
						if (local139 == 3) {
							@Pc(243) byte[][] local243 = local18.aByteArrayArrayArray5[local115];
							local225 = (Method) local18.aClass70Array2[local115].anObject3;
							@Pc(254) Object[] local254 = new Object[local243.length];
							for (@Pc(256) int local256 = 0; local256 < local243.length; local256++) {
								@Pc(268) ObjectInputStream local268 = new ObjectInputStream(new ByteArrayInputStream(local243[local256]));
								local254[local256] = local268.readObject();
							}
							@Pc(283) Object local283 = local225.invoke(null, local254);
							if (local283 == null) {
								arg0.method1545(0);
							} else if (local283 instanceof Number) {
								arg0.method1545(1);
								arg0.method1548(((Number) local283).longValue());
							} else if (local283 instanceof Class71) {
								arg0.method1545(2);
								arg0.method1534((Class71) local283);
							} else {
								arg0.method1545(4);
							}
						} else if (local139 == 4) {
							local225 = (Method) local18.aClass70Array2[local115].anObject3;
							local161 = local225.getModifiers();
							arg0.method1545(0);
							arg0.method1525(local161);
						}
					} catch (@Pc(326) ClassNotFoundException local326) {
						arg0.method1545(-10);
					} catch (@Pc(332) InvalidClassException local332) {
						arg0.method1545(-11);
					} catch (@Pc(338) StreamCorruptedException local338) {
						arg0.method1545(-12);
					} catch (@Pc(344) OptionalDataException local344) {
						arg0.method1545(-13);
					} catch (@Pc(350) IllegalAccessException local350) {
						arg0.method1545(-14);
					} catch (@Pc(356) IllegalArgumentException local356) {
						arg0.method1545(-15);
					} catch (@Pc(362) InvocationTargetException local362) {
						arg0.method1545(-16);
					} catch (@Pc(368) SecurityException local368) {
						arg0.method1545(-17);
					} catch (@Pc(374) IOException local374) {
						arg0.method1545(-18);
					} catch (@Pc(380) NullPointerException local380) {
						arg0.method1545(-19);
					} catch (@Pc(386) Exception local386) {
						arg0.method1545(-20);
					} catch (@Pc(392) Throwable local392) {
						arg0.method1545(-21);
					}
				} else {
					arg0.method1545(local18.anIntArray234[local115]);
				}
			}
			arg0.method1504(local108);
			arg0.method1518(arg0.anInt2233 - local108);
			local18.method2002();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method1034() {
		aByteArrayArrayArray2 = null;
		aClass71_774 = null;
		aClass71_776 = null;
		aClass71_772 = null;
		aClass71_775 = null;
		aClass71_779 = null;
		aClass71_780 = null;
		aClass71_771 = null;
		aClass71_777 = null;
		anIntArrayArray15 = null;
		aClass71_778 = null;
		aClass24_14 = null;
		aClass71_773 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!we;BI)V")
	public static void method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub10_Sub4 arg2, @OriginalArg(4) int arg3) {
		Static78.aClass7_31.method699();
		Static82.aClass5_Sub1_Sub10_Sub1_20.method921(0, 0);
		arg2.method2040(Static78.aClass71_524, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method2040(Static95.aClass71_1117, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method2040(Static81.aClass71_980, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method2040(Static72.aClass71_883, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg2.method2040(Static39.aClass71_576, 55, 41, 65535, true);
		}
		arg2.method2040(Static19.aClass71_357, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method2040(Static95.aClass71_1117, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method2040(Static81.aClass71_980, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method2040(Static72.aClass71_883, 184, 41, 16711680, true);
		}
		arg2.method2040(Static89.aClass71_1044, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method2040(Static95.aClass71_1117, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method2040(Static81.aClass71_980, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method2040(Static72.aClass71_883, 324, 41, 16711680, true);
		}
		arg2.method2036(Static39.aClass71_582, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(149) Graphics local149 = Static105.aCanvas1.getGraphics();
			Static78.aClass7_31.method697(0, local149, 453);
		} catch (@Pc(165) Exception local165) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1036() {
		try {
			@Pc(6) Graphics local6 = Static105.aCanvas1.getGraphics();
			Static90.aClass7_90.method697(0, local6, 4);
			Static62.aClass7_49.method697(0, local6, 357);
			Static42.aClass7_34.method697(722, local6, 4);
			Static10.aClass7_15.method697(743, local6, 205);
			Static101.aClass7_73.method697(0, local6, 0);
			Static88.aClass7_63.method697(516, local6, 4);
			Static86.aClass7_89.method697(516, local6, 205);
			Static14.aClass7_20.method697(496, local6, 357);
			Static99.aClass7_69.method697(0, local6, 338);
		} catch (@Pc(66) Exception local66) {
			Static105.aCanvas1.repaint();
		}
	}
}
