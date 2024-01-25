import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!tca;")
	public static final Class333 aClass333_13 = new Class333(8);

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Lclient!fga;")
	public static final Class115 aClass115_2 = new Class115();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)Lclient!pha;")
	public static Class3_Sub8 method2590(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub8_Sub32();
		} else if (arg0 == 1) {
			return new Class3_Sub8_Sub28();
		} else if (arg0 == 2) {
			return new Class3_Sub8_Sub29();
		} else if (arg0 == 3) {
			return new Class3_Sub8_Sub36();
		} else if (arg0 == 4) {
			return new Class3_Sub8_Sub7();
		} else if (arg0 == 5) {
			return new Class3_Sub8_Sub8();
		} else if (arg0 == 6) {
			return new Class3_Sub8_Sub37();
		} else if (arg0 == 7) {
			return new Class3_Sub8_Sub3();
		} else if (arg0 == 8) {
			return new Class3_Sub8_Sub27();
		} else if (arg0 == 9) {
			return new Class3_Sub8_Sub4();
		} else if (arg0 == 10) {
			return new Class3_Sub8_Sub38();
		} else if (arg0 == 11) {
			return new Class3_Sub8_Sub30();
		} else if (arg0 == 12) {
			return new Class3_Sub8_Sub6();
		} else if (arg0 == 13) {
			return new Class3_Sub8_Sub11();
		} else if (arg0 == 14) {
			return new Class3_Sub8_Sub16();
		} else if (arg0 == 15) {
			return new Class3_Sub8_Sub31();
		} else if (arg0 == 16) {
			return new Class3_Sub8_Sub26();
		} else if (arg0 == 17) {
			return new Class3_Sub8_Sub9();
		} else if (arg0 == 18) {
			return new Class3_Sub8_Sub10_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub8_Sub18();
		} else if (arg0 == 20) {
			return new Class3_Sub8_Sub21();
		} else if (arg0 == 21) {
			return new Class3_Sub8_Sub23();
		} else if (arg0 == 22) {
			return new Class3_Sub8_Sub13();
		} else if (arg0 == 23) {
			return new Class3_Sub8_Sub20();
		} else if (arg0 == 24) {
			return new Class3_Sub8_Sub5();
		} else if (arg0 == 25) {
			return new Class3_Sub8_Sub24();
		} else if (arg0 == 26) {
			return new Class3_Sub8_Sub34();
		} else if (arg0 == 27) {
			return new Class3_Sub8_Sub33();
		} else if (arg0 == 28) {
			return new Class3_Sub8_Sub25();
		} else if (arg0 == 29) {
			return new Class3_Sub8_Sub35();
		} else if (arg0 == 30) {
			return new Class3_Sub8_Sub22();
		} else if (arg0 == 31) {
			return new Class3_Sub8_Sub2();
		} else if (arg0 == 32) {
			return new Class3_Sub8_Sub39();
		} else if (arg0 == 33) {
			return new Class3_Sub8_Sub17();
		} else if (arg0 == 34) {
			return new Class3_Sub8_Sub19();
		} else if (arg0 == 35) {
			return new Class3_Sub8_Sub14();
		} else if (arg0 == 36) {
			return new Class3_Sub8_Sub12();
		} else if (arg0 == 37) {
			return new Class3_Sub8_Sub15();
		} else if (arg0 == 38) {
			return new Class3_Sub8_Sub1();
		} else if (arg0 == 39) {
			return new Class3_Sub8_Sub10();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public static void method2593() {
		Static287.aClass247_1 = new Class247(8);
		Static499.anInt7887 = 0;
		for (@Pc(21) Class34_Sub7 local21 = (Class34_Sub7) Static372.aClass317_6.method6891(); local21 != null; local21 = (Class34_Sub7) Static372.aClass317_6.method6894()) {
			local21.method5098();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)Z")
	public static boolean method2600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static532.aBoolean580) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(25) int local25 = arg0 & 0xFFFF;
		if (Static270.aClass265ArrayArray2[local13] == null || Static270.aClass265ArrayArray2[local13][local25] == null) {
			return false;
		}
		@Pc(43) Class265 local43 = Static270.aClass265ArrayArray2[local13][local25];
		@Pc(54) Class3_Sub5_Sub18 local54;
		if (arg1 == -1 && local43.anInt6967 == 0) {
			for (local54 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local54 != null; local54 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				if (local54.anInt9217 == 57 || local54.anInt9217 == 1002 || local54.anInt9217 == 17 || local54.anInt9217 == 19 || local54.anInt9217 == 16) {
					for (@Pc(146) Class265 local146 = Static223.method3278(local54.anInt9213); local146 != null; local146 = Static26.method591(local146)) {
						if (local146.anInt7032 == local43.anInt7032) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local54 != null; local54 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
				if (local54.anInt9212 == arg1 && local43.anInt7032 == local54.anInt9213 && (local54.anInt9217 == 57 || local54.anInt9217 == 1002 || local54.anInt9217 == 17 || local54.anInt9217 == 19 || local54.anInt9217 == 16)) {
					return true;
				}
			}
		}
		return false;
	}
}
