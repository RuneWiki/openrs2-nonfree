import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt3958;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public static int anInt3960;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "Lclient!qj;")
	public static Class165 aClass165_61;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public static int anInt3963;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt3964 = -1;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int anInt3965 = 0;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString159 = "Prepared sound engine";

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!qj;ZLclient!qj;)V")
	public static void method3675(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static82.aClass165_28 = arg0;
		Static216.aClass165_65 = arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I")
	public static int method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lclient!b;")
	public static Class16 method3678(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static342.aFloat37 == 3.0D) {
				return Static85.aClass16_7;
			}
			if ((double) Static342.aFloat37 == 4.0D) {
				return Static253.aClass16_18;
			}
			if ((double) Static342.aFloat37 == 6.0D) {
				return Static281.aClass16_22;
			}
			if ((double) Static342.aFloat37 >= 8.0D) {
				return Static251.aClass16_27;
			}
		} else if (arg0 == 1) {
			if ((double) Static342.aFloat37 == 3.0D) {
				return Static281.aClass16_22;
			}
			if ((double) Static342.aFloat37 == 4.0D) {
				return Static251.aClass16_27;
			}
			if ((double) Static342.aFloat37 == 6.0D) {
				return Static177.aClass16_15;
			}
			if ((double) Static342.aFloat37 >= 8.0D) {
				return Static311.aClass16_24;
			}
		} else if (arg0 == 2) {
			if ((double) Static342.aFloat37 == 3.0D) {
				return Static177.aClass16_15;
			}
			if ((double) Static342.aFloat37 == 4.0D) {
				return Static311.aClass16_24;
			}
			if ((double) Static342.aFloat37 == 6.0D) {
				return Static258.aClass16_20;
			}
			if ((double) Static342.aFloat37 >= 8.0D) {
				return Static215.aClass16_16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public static void method3679() {
		Static125.anInt2470 = 0;
		Static253.anInt4863 = 0;
		Static255.method4554();
		Static128.method2431();
		Static334.method5571();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static253.anInt4863; local17++) {
			local23 = Static192.anIntArray812[local17];
			if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local23].anInt4932 != Static215.anInt4246) {
				if (Static169.aClass5_Sub3_Sub3_Sub2Array2[local23].aClass122_1.method3570()) {
					Static235.method4218(Static169.aClass5_Sub3_Sub3_Sub2Array2[local23]);
				}
				Static169.aClass5_Sub3_Sub3_Sub2Array2[local23].method4549(null);
				Static169.aClass5_Sub3_Sub3_Sub2Array2[local23] = null;
			}
		}
		if (Static232.aClass1_Sub7_Sub1_4.anInt3368 != Static230.anInt4529) {
			throw new RuntimeException("gnp1 pos:" + Static232.aClass1_Sub7_Sub1_4.anInt3368 + " psize:" + Static230.anInt4529);
		}
		for (local23 = 0; local23 < Static338.anInt6419; local23++) {
			if (Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static338.anInt6419);
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)Lclient!fm;")
	public static Class1_Sub2 method3680(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub2_Sub19();
		} else if (arg0 == 1) {
			return new Class1_Sub2_Sub11();
		} else if (arg0 == 2) {
			return new Class1_Sub2_Sub21();
		} else if (arg0 == 3) {
			return new Class1_Sub2_Sub27();
		} else if (arg0 == 4) {
			return new Class1_Sub2_Sub33();
		} else if (arg0 == 5) {
			return new Class1_Sub2_Sub14();
		} else if (arg0 == 6) {
			return new Class1_Sub2_Sub22();
		} else if (arg0 == 7) {
			return new Class1_Sub2_Sub38();
		} else if (arg0 == 8) {
			return new Class1_Sub2_Sub7();
		} else if (arg0 == 9) {
			return new Class1_Sub2_Sub3();
		} else if (arg0 == 10) {
			return new Class1_Sub2_Sub13();
		} else if (arg0 == 11) {
			return new Class1_Sub2_Sub25();
		} else if (arg0 == 12) {
			return new Class1_Sub2_Sub24();
		} else if (arg0 == 13) {
			return new Class1_Sub2_Sub36();
		} else if (arg0 == 14) {
			return new Class1_Sub2_Sub30();
		} else if (arg0 == 15) {
			return new Class1_Sub2_Sub1();
		} else if (arg0 == 16) {
			return new Class1_Sub2_Sub37();
		} else if (arg0 == 17) {
			return new Class1_Sub2_Sub31();
		} else if (arg0 == 18) {
			return new Class1_Sub2_Sub23_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub2_Sub28();
		} else if (arg0 == 20) {
			return new Class1_Sub2_Sub35();
		} else if (arg0 == 21) {
			return new Class1_Sub2_Sub26();
		} else if (arg0 == 22) {
			return new Class1_Sub2_Sub12();
		} else if (arg0 == 23) {
			return new Class1_Sub2_Sub32();
		} else if (arg0 == 24) {
			return new Class1_Sub2_Sub2();
		} else if (arg0 == 25) {
			return new Class1_Sub2_Sub9();
		} else if (arg0 == 26) {
			return new Class1_Sub2_Sub20();
		} else if (arg0 == 27) {
			return new Class1_Sub2_Sub4();
		} else if (arg0 == 28) {
			return new Class1_Sub2_Sub29();
		} else if (arg0 == 29) {
			return new Class1_Sub2_Sub18();
		} else if (arg0 == 30) {
			return new Class1_Sub2_Sub6();
		} else if (arg0 == 31) {
			return new Class1_Sub2_Sub16();
		} else if (arg0 == 32) {
			return new Class1_Sub2_Sub17();
		} else if (arg0 == 33) {
			return new Class1_Sub2_Sub15();
		} else if (arg0 == 34) {
			return new Class1_Sub2_Sub39();
		} else if (arg0 == 35) {
			return new Class1_Sub2_Sub8();
		} else if (arg0 == 36) {
			return new Class1_Sub2_Sub10();
		} else if (arg0 == 37) {
			return new Class1_Sub2_Sub34();
		} else if (arg0 == 38) {
			return new Class1_Sub2_Sub5();
		} else if (arg0 == 39) {
			return new Class1_Sub2_Sub23();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
	public static void method3681(@OriginalArg(1) int arg0) {
		if (!Static198.method3725(arg0)) {
			return;
		}
		@Pc(22) Class177[] local22 = Static314.aClass177ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class177 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt5238 = 1;
				local30.anInt5187 = 0;
				local30.anInt5176 = 0;
			}
		}
	}
}
