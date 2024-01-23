import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
	public static int[] anIntArray496;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public static int anInt5693 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4286(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static123.method1977(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method4287(@OriginalArg(1) int arg0) {
		@Pc(16) Class8_Sub1_Sub6 local16 = Static181.method2779(4, arg0);
		local16.method929();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method4289(@OriginalArg(1) Class8_Sub2 arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static115.aClass57_2 != null) {
			try {
				@Pc(19) int local19 = 0;
				Static115.aClass57_2.method1347(0L);
				Static115.aClass57_2.method1343(local15);
				while (local19 < 24 && local15[local19] == 0) {
					local19++;
				}
				if (local19 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (@Pc(49) int local49 = 0; local49 < 24; local49++) {
					local15[local49] = -1;
				}
			}
		}
		arg0.method2380(24, local15);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Lclient!bi;")
	public static Class8_Sub1_Sub2 method4290(@OriginalArg(0) int arg0) {
		return (Class8_Sub1_Sub2) Static89.aClass129_7.method3043((long) arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lclient!ud;")
	public static Class8_Sub3 method4291(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class8_Sub3_Sub33();
		} else if (arg0 == 1) {
			return new Class8_Sub3_Sub20();
		} else if (arg0 == 2) {
			return new Class8_Sub3_Sub25();
		} else if (arg0 == 3) {
			return new Class8_Sub3_Sub29();
		} else if (arg0 == 4) {
			return new Class8_Sub3_Sub8();
		} else if (arg0 == 5) {
			return new Class8_Sub3_Sub38();
		} else if (arg0 == 6) {
			return new Class8_Sub3_Sub21();
		} else if (arg0 == 7) {
			return new Class8_Sub3_Sub30();
		} else if (arg0 == 8) {
			return new Class8_Sub3_Sub26();
		} else if (arg0 == 9) {
			return new Class8_Sub3_Sub19();
		} else if (arg0 == 10) {
			return new Class8_Sub3_Sub28();
		} else if (arg0 == 11) {
			return new Class8_Sub3_Sub4();
		} else if (arg0 == 12) {
			return new Class8_Sub3_Sub18();
		} else if (arg0 == 13) {
			return new Class8_Sub3_Sub6();
		} else if (arg0 == 14) {
			return new Class8_Sub3_Sub16();
		} else if (arg0 == 15) {
			return new Class8_Sub3_Sub23();
		} else if (arg0 == 16) {
			return new Class8_Sub3_Sub24();
		} else if (arg0 == 17) {
			return new Class8_Sub3_Sub39();
		} else if (arg0 == 18) {
			return new Class8_Sub3_Sub2_Sub1();
		} else if (arg0 == 19) {
			return new Class8_Sub3_Sub31();
		} else if (arg0 == 20) {
			return new Class8_Sub3_Sub7();
		} else if (arg0 == 21) {
			return new Class8_Sub3_Sub11();
		} else if (arg0 == 22) {
			return new Class8_Sub3_Sub32();
		} else if (arg0 == 23) {
			return new Class8_Sub3_Sub13();
		} else if (arg0 == 24) {
			return new Class8_Sub3_Sub14();
		} else if (arg0 == 25) {
			return new Class8_Sub3_Sub5();
		} else if (arg0 == 26) {
			return new Class8_Sub3_Sub1();
		} else if (arg0 == 27) {
			return new Class8_Sub3_Sub17();
		} else if (arg0 == 28) {
			return new Class8_Sub3_Sub3();
		} else if (arg0 == 29) {
			return new Class8_Sub3_Sub10();
		} else if (arg0 == 30) {
			return new Class8_Sub3_Sub36();
		} else if (arg0 == 31) {
			return new Class8_Sub3_Sub37();
		} else if (arg0 == 32) {
			return new Class8_Sub3_Sub27();
		} else if (arg0 == 33) {
			return new Class8_Sub3_Sub9();
		} else if (arg0 == 34) {
			return new Class8_Sub3_Sub35();
		} else if (arg0 == 35) {
			return new Class8_Sub3_Sub12();
		} else if (arg0 == 36) {
			return new Class8_Sub3_Sub34();
		} else if (arg0 == 37) {
			return new Class8_Sub3_Sub22();
		} else if (arg0 == 38) {
			return new Class8_Sub3_Sub15();
		} else if (arg0 == 39) {
			return new Class8_Sub3_Sub2();
		} else {
			return null;
		}
	}
}
