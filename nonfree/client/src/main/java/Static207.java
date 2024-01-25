import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	public static int anInt3632 = 100;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	public static void method2903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(16, arg0);
		local8.method5529();
		local8.anInt6873 = arg1;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public static void method2904() {
		@Pc(5) int local5 = 0;
		if (Static413.aClass49_Sub1_1.method2481(Static341.anInt5549)) {
			local5 = 55;
		}
		if (!Static413.aClass49_Sub1_1.aBoolean237) {
			local5 |= 0x40;
		}
		Static336.method4433(local5);
		Static51.aClass151_1.method2914(local5);
		Static416.aClass64_2.method1365(local5);
		Static120.aClass115_2.method2204(local5);
		Static452.aClass246_2.method5326(local5);
		Static163.method2287(local5);
		Static65.method2870(local5);
		Static457.method6055(local5);
		Static240.method3215(local5);
		Static84.method4130();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lclient!mm;")
	public static Class4_Sub4 method2906(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub4_Sub8();
		} else if (arg0 == 1) {
			return new Class4_Sub4_Sub22();
		} else if (arg0 == 2) {
			return new Class4_Sub4_Sub6();
		} else if (arg0 == 3) {
			return new Class4_Sub4_Sub15();
		} else if (arg0 == 4) {
			return new Class4_Sub4_Sub12();
		} else if (arg0 == 5) {
			return new Class4_Sub4_Sub4();
		} else if (arg0 == 6) {
			return new Class4_Sub4_Sub38();
		} else if (arg0 == 7) {
			return new Class4_Sub4_Sub2();
		} else if (arg0 == 8) {
			return new Class4_Sub4_Sub31();
		} else if (arg0 == 9) {
			return new Class4_Sub4_Sub37();
		} else if (arg0 == 10) {
			return new Class4_Sub4_Sub35();
		} else if (arg0 == 11) {
			return new Class4_Sub4_Sub17();
		} else if (arg0 == 12) {
			return new Class4_Sub4_Sub7();
		} else if (arg0 == 13) {
			return new Class4_Sub4_Sub29();
		} else if (arg0 == 14) {
			return new Class4_Sub4_Sub28();
		} else if (arg0 == 15) {
			return new Class4_Sub4_Sub19();
		} else if (arg0 == 16) {
			return new Class4_Sub4_Sub20();
		} else if (arg0 == 17) {
			return new Class4_Sub4_Sub14();
		} else if (arg0 == 18) {
			return new Class4_Sub4_Sub30_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub4_Sub13();
		} else if (arg0 == 20) {
			return new Class4_Sub4_Sub9();
		} else if (arg0 == 21) {
			return new Class4_Sub4_Sub11();
		} else if (arg0 == 22) {
			return new Class4_Sub4_Sub39();
		} else if (arg0 == 23) {
			return new Class4_Sub4_Sub23();
		} else if (arg0 == 24) {
			return new Class4_Sub4_Sub21();
		} else if (arg0 == 25) {
			return new Class4_Sub4_Sub18();
		} else if (arg0 == 26) {
			return new Class4_Sub4_Sub16();
		} else if (arg0 == 27) {
			return new Class4_Sub4_Sub27();
		} else if (arg0 == 28) {
			return new Class4_Sub4_Sub36();
		} else if (arg0 == 29) {
			return new Class4_Sub4_Sub25();
		} else if (arg0 == 30) {
			return new Class4_Sub4_Sub5();
		} else if (arg0 == 31) {
			return new Class4_Sub4_Sub26();
		} else if (arg0 == 32) {
			return new Class4_Sub4_Sub32();
		} else if (arg0 == 33) {
			return new Class4_Sub4_Sub34();
		} else if (arg0 == 34) {
			return new Class4_Sub4_Sub10();
		} else if (arg0 == 35) {
			return new Class4_Sub4_Sub3();
		} else if (arg0 == 36) {
			return new Class4_Sub4_Sub1();
		} else if (arg0 == 37) {
			return new Class4_Sub4_Sub24();
		} else if (arg0 == 38) {
			return new Class4_Sub4_Sub33();
		} else if (arg0 == 39) {
			return new Class4_Sub4_Sub30();
		} else {
			return null;
		}
	}
}
