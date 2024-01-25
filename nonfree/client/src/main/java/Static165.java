import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lclient!ig;")
	public static Class1_Sub6_Sub8 method2423(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub6_Sub8 local10 = (Class1_Sub6_Sub8) Static82.aClass219_2.method4799((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(29) byte[] local29;
		if (arg0 < 32768) {
			local29 = Static366.aClass230_82.method4985(arg0, 0);
		} else {
			local29 = Static163.aClass230_46.method4985(arg0 & 0x7FFF, 0);
		}
		local10 = new Class1_Sub6_Sub8();
		if (local29 != null) {
			local10.method2302(new Class1_Sub33(local29));
		}
		if (arg0 >= 32768) {
			local10.method2305();
		}
		Static82.aClass219_2.method4801((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)Lclient!pa;")
	public static Class1_Sub2 method2424(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub2_Sub18();
		} else if (arg0 == 1) {
			return new Class1_Sub2_Sub30();
		} else if (arg0 == 2) {
			return new Class1_Sub2_Sub24();
		} else if (arg0 == 3) {
			return new Class1_Sub2_Sub31();
		} else if (arg0 == 4) {
			return new Class1_Sub2_Sub13();
		} else if (arg0 == 5) {
			return new Class1_Sub2_Sub29();
		} else if (arg0 == 6) {
			return new Class1_Sub2_Sub5();
		} else if (arg0 == 7) {
			return new Class1_Sub2_Sub19();
		} else if (arg0 == 8) {
			return new Class1_Sub2_Sub14();
		} else if (arg0 == 9) {
			return new Class1_Sub2_Sub4();
		} else if (arg0 == 10) {
			return new Class1_Sub2_Sub25();
		} else if (arg0 == 11) {
			return new Class1_Sub2_Sub32();
		} else if (arg0 == 12) {
			return new Class1_Sub2_Sub38();
		} else if (arg0 == 13) {
			return new Class1_Sub2_Sub2();
		} else if (arg0 == 14) {
			return new Class1_Sub2_Sub15();
		} else if (arg0 == 15) {
			return new Class1_Sub2_Sub28();
		} else if (arg0 == 16) {
			return new Class1_Sub2_Sub11();
		} else if (arg0 == 17) {
			return new Class1_Sub2_Sub35();
		} else if (arg0 == 18) {
			return new Class1_Sub2_Sub27_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub2_Sub26();
		} else if (arg0 == 20) {
			return new Class1_Sub2_Sub36();
		} else if (arg0 == 21) {
			return new Class1_Sub2_Sub39();
		} else if (arg0 == 22) {
			return new Class1_Sub2_Sub16();
		} else if (arg0 == 23) {
			return new Class1_Sub2_Sub34();
		} else if (arg0 == 24) {
			return new Class1_Sub2_Sub7();
		} else if (arg0 == 25) {
			return new Class1_Sub2_Sub21();
		} else if (arg0 == 26) {
			return new Class1_Sub2_Sub1();
		} else if (arg0 == 27) {
			return new Class1_Sub2_Sub9();
		} else if (arg0 == 28) {
			return new Class1_Sub2_Sub17();
		} else if (arg0 == 29) {
			return new Class1_Sub2_Sub12();
		} else if (arg0 == 30) {
			return new Class1_Sub2_Sub33();
		} else if (arg0 == 31) {
			return new Class1_Sub2_Sub22();
		} else if (arg0 == 32) {
			return new Class1_Sub2_Sub3();
		} else if (arg0 == 33) {
			return new Class1_Sub2_Sub10();
		} else if (arg0 == 34) {
			return new Class1_Sub2_Sub6();
		} else if (arg0 == 35) {
			return new Class1_Sub2_Sub8();
		} else if (arg0 == 36) {
			return new Class1_Sub2_Sub23();
		} else if (arg0 == 37) {
			return new Class1_Sub2_Sub20();
		} else if (arg0 == 38) {
			return new Class1_Sub2_Sub37();
		} else if (arg0 == 39) {
			return new Class1_Sub2_Sub27();
		} else {
			return null;
		}
	}
}
