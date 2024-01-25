import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Lclient!tj;")
	public static Class193 aClass193_5;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public static int anInt200;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
	public static int anInt192 = 127;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public static int anInt195 = 1;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLclient!tj;)V")
	public static void method187(@OriginalArg(1) Class193 arg0) {
		Static327.aClass193_102 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lclient!qn;")
	public static Class4_Sub6 method189(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub6_Sub5();
		} else if (arg0 == 1) {
			return new Class4_Sub6_Sub8();
		} else if (arg0 == 2) {
			return new Class4_Sub6_Sub2();
		} else if (arg0 == 3) {
			return new Class4_Sub6_Sub38();
		} else if (arg0 == 4) {
			return new Class4_Sub6_Sub21();
		} else if (arg0 == 5) {
			return new Class4_Sub6_Sub1();
		} else if (arg0 == 6) {
			return new Class4_Sub6_Sub7();
		} else if (arg0 == 7) {
			return new Class4_Sub6_Sub33();
		} else if (arg0 == 8) {
			return new Class4_Sub6_Sub6();
		} else if (arg0 == 9) {
			return new Class4_Sub6_Sub26();
		} else if (arg0 == 10) {
			return new Class4_Sub6_Sub20();
		} else if (arg0 == 11) {
			return new Class4_Sub6_Sub23();
		} else if (arg0 == 12) {
			return new Class4_Sub6_Sub17();
		} else if (arg0 == 13) {
			return new Class4_Sub6_Sub35();
		} else if (arg0 == 14) {
			return new Class4_Sub6_Sub4();
		} else if (arg0 == 15) {
			return new Class4_Sub6_Sub11();
		} else if (arg0 == 16) {
			return new Class4_Sub6_Sub28();
		} else if (arg0 == 17) {
			return new Class4_Sub6_Sub29();
		} else if (arg0 == 18) {
			return new Class4_Sub6_Sub3_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub6_Sub37();
		} else if (arg0 == 20) {
			return new Class4_Sub6_Sub31();
		} else if (arg0 == 21) {
			return new Class4_Sub6_Sub22();
		} else if (arg0 == 22) {
			return new Class4_Sub6_Sub30();
		} else if (arg0 == 23) {
			return new Class4_Sub6_Sub34();
		} else if (arg0 == 24) {
			return new Class4_Sub6_Sub32();
		} else if (arg0 == 25) {
			return new Class4_Sub6_Sub14();
		} else if (arg0 == 26) {
			return new Class4_Sub6_Sub10();
		} else if (arg0 == 27) {
			return new Class4_Sub6_Sub19();
		} else if (arg0 == 28) {
			return new Class4_Sub6_Sub25();
		} else if (arg0 == 29) {
			return new Class4_Sub6_Sub36();
		} else if (arg0 == 30) {
			return new Class4_Sub6_Sub12();
		} else if (arg0 == 31) {
			return new Class4_Sub6_Sub24();
		} else if (arg0 == 32) {
			return new Class4_Sub6_Sub13();
		} else if (arg0 == 33) {
			return new Class4_Sub6_Sub18();
		} else if (arg0 == 34) {
			return new Class4_Sub6_Sub9();
		} else if (arg0 == 35) {
			return new Class4_Sub6_Sub39();
		} else if (arg0 == 36) {
			return new Class4_Sub6_Sub16();
		} else if (arg0 == 37) {
			return new Class4_Sub6_Sub27();
		} else if (arg0 == 38) {
			return new Class4_Sub6_Sub15();
		} else if (arg0 == 39) {
			return new Class4_Sub6_Sub3();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BIIIII)V")
	public static void method190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg3;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static173.method3337(arg0, arg2, arg3, arg1);
			}
		} else if (local15 == 0) {
			Static245.method4360(arg1, arg4, arg0, arg3);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(60) int local60 = arg0 - (arg3 * local52 >> 12);
			@Pc(81) int local81;
			@Pc(79) int local79;
			if (arg4 < Static5.anInt2965) {
				local79 = local60 + (local52 * Static5.anInt2965 >> 12);
				local81 = Static5.anInt2965;
			} else if (arg4 > Static220.anInt6565) {
				local79 = local60 + (Static220.anInt6565 * local52 >> 12);
				local81 = Static220.anInt6565;
			} else {
				local79 = arg2;
				local81 = arg4;
			}
			@Pc(109) int local109;
			@Pc(117) int local117;
			if (arg3 < Static5.anInt2965) {
				local109 = Static5.anInt2965;
				local117 = (Static5.anInt2965 * local52 >> 12) + local60;
			} else if (Static220.anInt6565 < arg3) {
				local117 = (local52 * Static220.anInt6565 >> 12) + local60;
				local109 = Static220.anInt6565;
			} else {
				local109 = arg3;
				local117 = arg0;
			}
			if (Static349.anInt6619 > local79) {
				local81 = (Static349.anInt6619 - local60 << 12) / local52;
				local79 = Static349.anInt6619;
			} else if (Static195.anInt4097 < local79) {
				local81 = (Static195.anInt4097 - local60 << 12) / local52;
				local79 = Static195.anInt4097;
			}
			if (Static349.anInt6619 > local117) {
				local109 = (Static349.anInt6619 - local60 << 12) / local52;
				local117 = Static349.anInt6619;
			} else if (Static195.anInt4097 < local117) {
				local117 = Static195.anInt4097;
				local109 = (Static195.anInt4097 - local60 << 12) / local52;
			}
			Static129.method2645(local79, local117, local109, arg1, local81);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BZII)I")
	public static int method191(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub44 local15 = Static92.method531(arg0, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < local15.anIntArray503.length; local28++) {
				if (arg2 == local15.anIntArray502[local28]) {
					local26 += local15.anIntArray503[local28];
				}
			}
			return local26;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!br;I)Ljava/lang/String;")
	public static String method192(@OriginalArg(0) Class21 arg0) {
		if (Static44.method877(arg0).method1031() == 0) {
			return null;
		} else if (arg0.aString10 == null || arg0.aString10.trim().length() == 0) {
			return Static189.aBoolean306 ? "Hidden-use" : null;
		} else {
			return arg0.aString10;
		}
	}
}
