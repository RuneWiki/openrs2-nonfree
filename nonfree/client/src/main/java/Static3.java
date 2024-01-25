import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	public static int anInt50;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lclient!h;")
	public static final Class125 aClass125_1 = new Class125(4);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Lclient!bk;")
	public static Class12_Sub4_Sub1 method191() {
		@Pc(16) Class12_Sub4_Sub1 local16 = (Class12_Sub4_Sub1) Static526.aClass280_10.method6892();
		if (local16 != null) {
			local16.method7967();
			local16.method7959();
			return local16;
		}
		do {
			local16 = (Class12_Sub4_Sub1) Static186.aClass280_7.method6892();
			if (local16 == null) {
				return null;
			}
			if (local16.method818() > Static76.method1679()) {
				return null;
			}
			local16.method7967();
			local16.method7959();
		} while ((Long.MIN_VALUE & local16.aLong247) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lclient!nd;")
	public static Class12_Sub1 method192(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class12_Sub1_Sub16();
		} else if (arg0 == 1) {
			return new Class12_Sub1_Sub5();
		} else if (arg0 == 2) {
			return new Class12_Sub1_Sub32();
		} else if (arg0 == 3) {
			return new Class12_Sub1_Sub2();
		} else if (arg0 == 4) {
			return new Class12_Sub1_Sub20();
		} else if (arg0 == 5) {
			return new Class12_Sub1_Sub26();
		} else if (arg0 == 6) {
			return new Class12_Sub1_Sub9();
		} else if (arg0 == 7) {
			return new Class12_Sub1_Sub31();
		} else if (arg0 == 8) {
			return new Class12_Sub1_Sub7();
		} else if (arg0 == 9) {
			return new Class12_Sub1_Sub18();
		} else if (arg0 == 10) {
			return new Class12_Sub1_Sub23();
		} else if (arg0 == 11) {
			return new Class12_Sub1_Sub24();
		} else if (arg0 == 12) {
			return new Class12_Sub1_Sub19();
		} else if (arg0 == 13) {
			return new Class12_Sub1_Sub21();
		} else if (arg0 == 14) {
			return new Class12_Sub1_Sub15();
		} else if (arg0 == 15) {
			return new Class12_Sub1_Sub27();
		} else if (arg0 == 16) {
			return new Class12_Sub1_Sub25();
		} else if (arg0 == 17) {
			return new Class12_Sub1_Sub28();
		} else if (arg0 == 18) {
			return new Class12_Sub1_Sub22_Sub1();
		} else if (arg0 == 19) {
			return new Class12_Sub1_Sub38();
		} else if (arg0 == 20) {
			return new Class12_Sub1_Sub35();
		} else if (arg0 == 21) {
			return new Class12_Sub1_Sub29();
		} else if (arg0 == 22) {
			return new Class12_Sub1_Sub14();
		} else if (arg0 == 23) {
			return new Class12_Sub1_Sub30();
		} else if (arg0 == 24) {
			return new Class12_Sub1_Sub34();
		} else if (arg0 == 25) {
			return new Class12_Sub1_Sub37();
		} else if (arg0 == 26) {
			return new Class12_Sub1_Sub10();
		} else if (arg0 == 27) {
			return new Class12_Sub1_Sub1();
		} else if (arg0 == 28) {
			return new Class12_Sub1_Sub4();
		} else if (arg0 == 29) {
			return new Class12_Sub1_Sub6();
		} else if (arg0 == 30) {
			return new Class12_Sub1_Sub12();
		} else if (arg0 == 31) {
			return new Class12_Sub1_Sub3();
		} else if (arg0 == 32) {
			return new Class12_Sub1_Sub36();
		} else if (arg0 == 33) {
			return new Class12_Sub1_Sub39();
		} else if (arg0 == 34) {
			return new Class12_Sub1_Sub33();
		} else if (arg0 == 35) {
			return new Class12_Sub1_Sub8();
		} else if (arg0 == 36) {
			return new Class12_Sub1_Sub11();
		} else if (arg0 == 37) {
			return new Class12_Sub1_Sub13();
		} else if (arg0 == 38) {
			return new Class12_Sub1_Sub17();
		} else if (arg0 == 39) {
			return new Class12_Sub1_Sub22();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method193(@OriginalArg(1) String arg0) {
		@Pc(15) String local15 = Static490.method7291(Static178.method3535(arg0));
		if (local15 == null) {
			local15 = "";
		}
		return local15;
	}
}
