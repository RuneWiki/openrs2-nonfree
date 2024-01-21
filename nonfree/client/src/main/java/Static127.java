import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!bg;")
	public static Class11 aClass11_100;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt2757 = 0;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1249 = Static32.method683("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1250 = Static32.method683("T");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method2155() {
		Static61.aClass2_Sub14_Sub3_1.method2577();
		Static15.aClass11_16 = null;
		Static78.anInt1631 = 1;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method2156() {
		for (@Pc(12) int local12 = 0; local12 < Static88.anInt1850; local12++) {
			@Pc(18) int local18 = Static90.anIntArray192[local12];
			@Pc(22) Class2_Sub2_Sub3_Sub7_Sub1 local22 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local18];
			@Pc(26) int local26 = Static86.aClass2_Sub13_Sub1_13.method2962();
			@Pc(36) int local36;
			@Pc(47) int local47;
			if ((local26 & 0x8) != 0) {
				local36 = Static86.aClass2_Sub13_Sub1_13.method2958();
				if (local36 == 65535) {
					local36 = -1;
				}
				local47 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (local36 == local22.anInt3568 && local36 != -1) {
					@Pc(59) int local59 = Static29.method543(local36).anInt406;
					if (local59 == 1) {
						local22.anInt3538 = 0;
						local22.anInt3566 = 0;
						local22.anInt3548 = local47;
						local22.anInt3565 = 0;
					}
					if (local59 == 2) {
						local22.anInt3565 = 0;
					}
				} else if (local36 == -1 || local22.anInt3568 == -1 || Static29.method543(local36).anInt411 >= Static29.method543(local22.anInt3568).anInt411) {
					local22.anInt3538 = 0;
					local22.anInt3566 = 0;
					local22.anInt3548 = local47;
					local22.anInt3565 = 0;
					local22.anInt3568 = local36;
					local22.anInt3540 = local22.anInt3543;
				}
			}
			if ((local26 & 0x1) != 0) {
				local22.aClass49_1602 = Static86.aClass2_Sub13_Sub1_13.method2926();
				local22.anInt3570 = 100;
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt3567 = Static86.aClass2_Sub13_Sub1_13.method2917();
				local22.anInt3561 = Static86.aClass2_Sub13_Sub1_13.method2933();
			}
			if ((local26 & 0x2) != 0) {
				local36 = Static86.aClass2_Sub13_Sub1_13.method2957();
				local47 = Static86.aClass2_Sub13_Sub1_13.method2954();
				local22.method2738(local47, local36, anInt2757);
			}
			if ((local26 & 0x40) != 0) {
				local22.aClass2_Sub2_Sub15_1 = Static169.method2802(Static86.aClass2_Sub13_Sub1_13.method2917());
				local22.anInt3525 = local22.aClass2_Sub2_Sub15_1.anInt3217;
				local22.anInt3528 = local22.aClass2_Sub2_Sub15_1.anInt3208;
				local22.anInt3585 = local22.aClass2_Sub2_Sub15_1.anInt3205;
				local22.anInt3545 = local22.aClass2_Sub2_Sub15_1.anInt3216;
				local22.anInt3547 = local22.aClass2_Sub2_Sub15_1.anInt3196;
				local22.anInt3551 = local22.aClass2_Sub2_Sub15_1.anInt3203;
				local22.anInt3539 = local22.aClass2_Sub2_Sub15_1.anInt3207;
				local22.anInt3573 = local22.aClass2_Sub2_Sub15_1.anInt3213;
				local22.anInt3581 = local22.aClass2_Sub2_Sub15_1.anInt3209;
			}
			if ((local26 & 0x10) != 0) {
				local22.anInt3556 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local22.anInt3556 == 65535) {
					local22.anInt3556 = -1;
				}
			}
			if ((local26 & 0x80) != 0) {
				local36 = Static86.aClass2_Sub13_Sub1_13.method2954();
				local47 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local22.method2738(local47, local36, anInt2757);
				local22.anInt3575 = anInt2757 + 300;
				local22.anInt3564 = Static86.aClass2_Sub13_Sub1_13.method2937();
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt3557 = Static86.aClass2_Sub13_Sub1_13.method2958();
				local36 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local22.anInt3577 = local36 >> 16;
				local22.anInt3569 = 0;
				local22.anInt3534 = 0;
				if (local22.anInt3557 == 65535) {
					local22.anInt3557 = -1;
				}
				local22.anInt3584 = anInt2757 + (local36 & 0xFFFF);
				if (local22.anInt3584 > anInt2757) {
					local22.anInt3569 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method2157(@OriginalArg(1) Component arg0) {
		@Pc(14) Method local14 = Static89.aMethod2;
		if (local14 != null) {
			try {
				local14.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(28) Throwable local28) {
			}
		}
		arg0.addKeyListener(Static181.aClass39_1);
		arg0.addFocusListener(Static181.aClass39_1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method2158() {
		anIntArray263 = null;
		aClass11_100 = null;
		anIntArray262 = null;
		aByteArrayArray10 = null;
		aClass49_1250 = null;
		aClass49_1249 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lf;I)I")
	public static int method2159(@OriginalArg(0) Class49 arg0) {
		if (Static45.anInt1056 == 1) {
			return 7;
		} else if (arg0.method1660(Static136.aClass49_1321)) {
			return 1;
		} else if (arg0.method1660(Static51.aClass49_586)) {
			return 1;
		} else if (arg0.method1660(Static128.aClass49_1252)) {
			return 2;
		} else if (arg0.method1660(Static65.aClass49_1747)) {
			return 2;
		} else if (arg0.method1660(Static27.aClass49_332)) {
			return 3;
		} else if (arg0.method1660(Static23.aClass49_296)) {
			return 4;
		} else if (arg0.method1660(Static123.aClass49_1230)) {
			return 4;
		} else if (arg0.method1660(Static3.aClass49_43)) {
			return 5;
		} else if (arg0.method1660(Static22.aClass49_283)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!u;BI)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub3_Sub7_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1 == arg2 || Static133.anInt3713 >= 400) {
			return;
		}
		@Pc(52) Class49 local52;
		if (arg2.anInt3608 == 0) {
			local52 = Static33.method692(new Class49[] { arg2.aClass49_1606, Static18.method347(arg2.anInt3599, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599), Static27.aClass49_334, Static84.aClass49_898, Static48.method882(arg2.anInt3599), Static64.aClass49_714 });
		} else {
			local52 = Static33.method692(new Class49[] { arg2.aClass49_1606, Static27.aClass49_334, Static157.aClass49_1544, Static48.method882(arg2.anInt3608), Static64.aClass49_714 });
		}
		@Pc(172) int local172;
		if (Static124.anInt2746 == 1) {
			Static11.method162(arg3, arg1, Static64.aClass49_696, (short) 1, (long) arg0, Static33.method692(new Class49[] { Static180.aClass49_1728, Static95.aClass49_975, local52 }));
		} else if (!Static108.aBoolean93) {
			for (local172 = 7; local172 >= 0; local172--) {
				if (Static182.aClass49Array24[local172] != null) {
					@Pc(180) short local180 = 0;
					if (Static182.aClass49Array24[local172].method1645(Static83.aClass49_885)) {
						if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599 < arg2.anInt3599) {
							local180 = 2000;
						}
						if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3592 != 0 && arg2.anInt3592 != 0) {
							if (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3592 == arg2.anInt3592) {
								local180 = 2000;
							} else {
								local180 = 0;
							}
						}
					} else if (Static6.aBooleanArray1[local172]) {
						local180 = 2000;
					}
					@Pc(232) short local232 = Static156.aShortArray38[local172];
					@Pc(237) short local237 = (short) (local232 + local180);
					Static11.method162(arg3, arg1, Static182.aClass49Array24[local172], local237, (long) arg0, Static33.method692(new Class49[] { Static103.aClass49_1031, local52 }));
				}
			}
		} else if ((Static138.anInt2937 & 0x8) == 8) {
			Static11.method162(arg3, arg1, Static103.aClass49_1026, (short) 12, (long) arg0, Static33.method692(new Class49[] { Static150.aClass49_1450, Static95.aClass49_975, local52 }));
		}
		for (local172 = 0; local172 < Static133.anInt3713; local172++) {
			if (Static30.aShortArray1[local172] == 25) {
				Static161.aClass49Array19[local172] = Static33.method692(new Class49[] { Static103.aClass49_1031, local52 });
				return;
			}
		}
	}
}
