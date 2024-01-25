import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_108 = new Class73(100, 16);

	@OriginalMember(owner = "client!me", name = "H", descriptor = "[B")
	public static final byte[] aByteArray66 = new byte[2048];

	@OriginalMember(owner = "client!me", name = "I", descriptor = "I")
	public static int anInt5659 = 0;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_92 = new Class47(53, 12);

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Lclient!qba;")
	public static Class6_Sub4 method4869(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub4_Sub25();
		} else if (arg0 == 1) {
			return new Class6_Sub4_Sub5();
		} else if (arg0 == 2) {
			return new Class6_Sub4_Sub35();
		} else if (arg0 == 3) {
			return new Class6_Sub4_Sub29();
		} else if (arg0 == 4) {
			return new Class6_Sub4_Sub15();
		} else if (arg0 == 5) {
			return new Class6_Sub4_Sub39();
		} else if (arg0 == 6) {
			return new Class6_Sub4_Sub20();
		} else if (arg0 == 7) {
			return new Class6_Sub4_Sub30();
		} else if (arg0 == 8) {
			return new Class6_Sub4_Sub24();
		} else if (arg0 == 9) {
			return new Class6_Sub4_Sub17();
		} else if (arg0 == 10) {
			return new Class6_Sub4_Sub23();
		} else if (arg0 == 11) {
			return new Class6_Sub4_Sub14();
		} else if (arg0 == 12) {
			return new Class6_Sub4_Sub16();
		} else if (arg0 == 13) {
			return new Class6_Sub4_Sub37();
		} else if (arg0 == 14) {
			return new Class6_Sub4_Sub19();
		} else if (arg0 == 15) {
			return new Class6_Sub4_Sub27();
		} else if (arg0 == 16) {
			return new Class6_Sub4_Sub1();
		} else if (arg0 == 17) {
			return new Class6_Sub4_Sub12();
		} else if (arg0 == 18) {
			return new Class6_Sub4_Sub6_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub4_Sub2();
		} else if (arg0 == 20) {
			return new Class6_Sub4_Sub3();
		} else if (arg0 == 21) {
			return new Class6_Sub4_Sub21();
		} else if (arg0 == 22) {
			return new Class6_Sub4_Sub10();
		} else if (arg0 == 23) {
			return new Class6_Sub4_Sub4();
		} else if (arg0 == 24) {
			return new Class6_Sub4_Sub32();
		} else if (arg0 == 25) {
			return new Class6_Sub4_Sub18();
		} else if (arg0 == 26) {
			return new Class6_Sub4_Sub8();
		} else if (arg0 == 27) {
			return new Class6_Sub4_Sub11();
		} else if (arg0 == 28) {
			return new Class6_Sub4_Sub34();
		} else if (arg0 == 29) {
			return new Class6_Sub4_Sub33();
		} else if (arg0 == 30) {
			return new Class6_Sub4_Sub28();
		} else if (arg0 == 31) {
			return new Class6_Sub4_Sub26();
		} else if (arg0 == 32) {
			return new Class6_Sub4_Sub36();
		} else if (arg0 == 33) {
			return new Class6_Sub4_Sub22();
		} else if (arg0 == 34) {
			return new Class6_Sub4_Sub7();
		} else if (arg0 == 35) {
			return new Class6_Sub4_Sub38();
		} else if (arg0 == 36) {
			return new Class6_Sub4_Sub13();
		} else if (arg0 == 37) {
			return new Class6_Sub4_Sub31();
		} else if (arg0 == 38) {
			return new Class6_Sub4_Sub9();
		} else if (arg0 == 39) {
			return new Class6_Sub4_Sub6();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IIB)Z")
	public static boolean method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static160.method2952(arg1, arg0) || Static569.method7618(arg1, arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BIIIII)V")
	public static void method4871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg2;
		@Pc(14) int local14 = arg0 - arg4;
		if (local10 == 0) {
			if (local14 != 0) {
				Static575.method7409(arg0, arg2, arg1, arg4);
			}
		} else if (local14 == 0) {
			Static291.method4688(arg3, arg1, arg2, arg4);
		} else {
			@Pc(49) int local49 = (local14 << 12) / local10;
			@Pc(58) int local58 = arg4 - (local49 * arg2 >> 12);
			@Pc(63) int local63;
			@Pc(71) int local71;
			if (arg2 < Static13.anInt7634) {
				local63 = Static13.anInt7634;
				local71 = local58 + (Static13.anInt7634 * local49 >> 12);
			} else if (arg2 > Static461.anInt7899) {
				local63 = Static461.anInt7899;
				local71 = (Static461.anInt7899 * local49 >> 12) + local58;
			} else {
				local71 = arg4;
				local63 = arg2;
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (arg3 < Static13.anInt7634) {
				local112 = Static13.anInt7634;
				local110 = (Static13.anInt7634 * local49 >> 12) + local58;
			} else if (Static461.anInt7899 < arg3) {
				local110 = (local49 * Static461.anInt7899 >> 12) + local58;
				local112 = Static461.anInt7899;
			} else {
				local112 = arg3;
				local110 = arg0;
			}
			if (Static583.anInt9478 > local110) {
				local110 = Static583.anInt9478;
				local112 = (Static583.anInt9478 - local58 << 12) / local49;
			} else if (local110 > Static415.anInt9494) {
				local110 = Static415.anInt9494;
				local112 = (Static415.anInt9494 - local58 << 12) / local49;
			}
			if (local71 < Static583.anInt9478) {
				local71 = Static583.anInt9478;
				local63 = (Static583.anInt9478 - local58 << 12) / local49;
			} else if (local71 > Static415.anInt9494) {
				local71 = Static415.anInt9494;
				local63 = (Static415.anInt9494 - local58 << 12) / local49;
			}
			Static188.method3420(local110, local63, arg1, local112, local71);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!ji;)Lclient!ve;")
	public static Class79_Sub4 method4872(@OriginalArg(1) Class6_Sub21 arg0) {
		return new Class79_Sub4(arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6058(), arg0.method6031(), arg0.method6031(), arg0.method6069());
	}
}
