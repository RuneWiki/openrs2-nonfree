import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array25;

	@OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
	public static int anInt8593 = 0;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IB)Z")
	public static boolean method7064(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class4_Sub18 local18 = (Class4_Sub18) Static354.aClass124_32.method3267(); local18 != null; local18 = (Class4_Sub18) Static354.aClass124_32.method3273()) {
			if (Static543.method7528(local18.anInt3158) && local18.aLong74 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BI)Lclient!qp;")
	public static Class4_Sub4 method7065(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub4_Sub38();
		} else if (arg0 == 1) {
			return new Class4_Sub4_Sub31();
		} else if (arg0 == 2) {
			return new Class4_Sub4_Sub24();
		} else if (arg0 == 3) {
			return new Class4_Sub4_Sub11();
		} else if (arg0 == 4) {
			return new Class4_Sub4_Sub2();
		} else if (arg0 == 5) {
			return new Class4_Sub4_Sub37();
		} else if (arg0 == 6) {
			return new Class4_Sub4_Sub19();
		} else if (arg0 == 7) {
			return new Class4_Sub4_Sub18();
		} else if (arg0 == 8) {
			return new Class4_Sub4_Sub35();
		} else if (arg0 == 9) {
			return new Class4_Sub4_Sub4();
		} else if (arg0 == 10) {
			return new Class4_Sub4_Sub21();
		} else if (arg0 == 11) {
			return new Class4_Sub4_Sub22();
		} else if (arg0 == 12) {
			return new Class4_Sub4_Sub33();
		} else if (arg0 == 13) {
			return new Class4_Sub4_Sub23();
		} else if (arg0 == 14) {
			return new Class4_Sub4_Sub26();
		} else if (arg0 == 15) {
			return new Class4_Sub4_Sub29();
		} else if (arg0 == 16) {
			return new Class4_Sub4_Sub8();
		} else if (arg0 == 17) {
			return new Class4_Sub4_Sub14();
		} else if (arg0 == 18) {
			return new Class4_Sub4_Sub25_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub4_Sub15();
		} else if (arg0 == 20) {
			return new Class4_Sub4_Sub16();
		} else if (arg0 == 21) {
			return new Class4_Sub4_Sub39();
		} else if (arg0 == 22) {
			return new Class4_Sub4_Sub27();
		} else if (arg0 == 23) {
			return new Class4_Sub4_Sub3();
		} else if (arg0 == 24) {
			return new Class4_Sub4_Sub20();
		} else if (arg0 == 25) {
			return new Class4_Sub4_Sub6();
		} else if (arg0 == 26) {
			return new Class4_Sub4_Sub30();
		} else if (arg0 == 27) {
			return new Class4_Sub4_Sub9();
		} else if (arg0 == 28) {
			return new Class4_Sub4_Sub12();
		} else if (arg0 == 29) {
			return new Class4_Sub4_Sub5();
		} else if (arg0 == 30) {
			return new Class4_Sub4_Sub13();
		} else if (arg0 == 31) {
			return new Class4_Sub4_Sub36();
		} else if (arg0 == 32) {
			return new Class4_Sub4_Sub10();
		} else if (arg0 == 33) {
			return new Class4_Sub4_Sub32();
		} else if (arg0 == 34) {
			return new Class4_Sub4_Sub28();
		} else if (arg0 == 35) {
			return new Class4_Sub4_Sub7();
		} else if (arg0 == 36) {
			return new Class4_Sub4_Sub17();
		} else if (arg0 == 37) {
			return new Class4_Sub4_Sub1();
		} else if (arg0 == 38) {
			return new Class4_Sub4_Sub34();
		} else if (arg0 == 39) {
			return new Class4_Sub4_Sub25();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method7066(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static602.method1586(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
