import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "Z")
	public static boolean aBoolean258;

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "Lclient!hh;")
	public static Class35 aClass35_2;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_132 = new Class288(48, 4);

	@OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
	public static int anInt3639 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!hg;I)V")
	public static void method3043(@OriginalArg(0) Class13_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anIntArray302 == null && arg0.anIntArray301 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray302.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray302 != null) {
				local20 = arg0.anIntArray302[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(76) int local76;
				@Pc(89) int local89;
				@Pc(57) int local57;
				if ((local20 & -1073741824) == -1073741824) {
					local57 = local20 & 0xFFFFFFF;
					@Pc(61) int local61 = local57 >> 14;
					@Pc(65) int local65 = local57 & 0x3FFF;
					local76 = arg0.anInt10090 - (local61 - Static132.anInt2246) * 512 - 256;
					local89 = arg0.anInt10089 - (local65 - Static123.anInt2176) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(105) Class2_Sub43 local105 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local20);
					if (local105 == null) {
						arg0.method3966(-1, local16);
						continue;
					}
					@Pc(110) Class13_Sub1_Sub1_Sub1_Sub1 local110 = local105.aClass13_Sub1_Sub1_Sub1_Sub1_2;
					local76 = arg0.anInt10090 - local110.anInt10090;
					local89 = arg0.anInt10089 - local110.anInt10089;
				} else {
					local57 = local20 & 0x7FFF;
					@Pc(144) Class13_Sub1_Sub1_Sub1_Sub2 local144 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local57];
					if (local144 == null) {
						arg0.method3966(-1, local16);
						continue;
					}
					local89 = arg0.anInt10089 - local144.anInt10089;
					local76 = arg0.anInt10090 - local144.anInt10090;
				}
				if (local76 != 0 || local89 != 0) {
					arg0.method3966((int) (Math.atan2((double) local76, (double) local89) * 2607.5945876176133D) & 0x3FFF, local16);
				}
			} else if (!arg0.method3966(-1, local16)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray302 = null;
			arg0.anIntArray301 = null;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIII)V")
	public static void method3044(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static379.anInt5914 <= arg2 && arg2 <= Static624.anInt10032) {
			@Pc(15) int local15 = Static414.method5547(arg1, Static257.anInt4068, Static67.anInt1214);
			@Pc(21) int local21 = Static414.method5547(arg3, Static257.anInt4068, Static67.anInt1214);
			Static246.method3382(local15, arg2, local21, arg0);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)Lclient!eia;")
	public static Class2_Sub6 method3045(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub6_Sub2();
		} else if (arg0 == 1) {
			return new Class2_Sub6_Sub24();
		} else if (arg0 == 2) {
			return new Class2_Sub6_Sub8();
		} else if (arg0 == 3) {
			return new Class2_Sub6_Sub16();
		} else if (arg0 == 4) {
			return new Class2_Sub6_Sub5();
		} else if (arg0 == 5) {
			return new Class2_Sub6_Sub32();
		} else if (arg0 == 6) {
			return new Class2_Sub6_Sub37();
		} else if (arg0 == 7) {
			return new Class2_Sub6_Sub20();
		} else if (arg0 == 8) {
			return new Class2_Sub6_Sub14();
		} else if (arg0 == 9) {
			return new Class2_Sub6_Sub22();
		} else if (arg0 == 10) {
			return new Class2_Sub6_Sub17();
		} else if (arg0 == 11) {
			return new Class2_Sub6_Sub34();
		} else if (arg0 == 12) {
			return new Class2_Sub6_Sub10();
		} else if (arg0 == 13) {
			return new Class2_Sub6_Sub36();
		} else if (arg0 == 14) {
			return new Class2_Sub6_Sub25();
		} else if (arg0 == 15) {
			return new Class2_Sub6_Sub13();
		} else if (arg0 == 16) {
			return new Class2_Sub6_Sub4();
		} else if (arg0 == 17) {
			return new Class2_Sub6_Sub38();
		} else if (arg0 == 18) {
			return new Class2_Sub6_Sub3_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub6_Sub23();
		} else if (arg0 == 20) {
			return new Class2_Sub6_Sub9();
		} else if (arg0 == 21) {
			return new Class2_Sub6_Sub26();
		} else if (arg0 == 22) {
			return new Class2_Sub6_Sub1();
		} else if (arg0 == 23) {
			return new Class2_Sub6_Sub31();
		} else if (arg0 == 24) {
			return new Class2_Sub6_Sub30();
		} else if (arg0 == 25) {
			return new Class2_Sub6_Sub15();
		} else if (arg0 == 26) {
			return new Class2_Sub6_Sub28();
		} else if (arg0 == 27) {
			return new Class2_Sub6_Sub29();
		} else if (arg0 == 28) {
			return new Class2_Sub6_Sub33();
		} else if (arg0 == 29) {
			return new Class2_Sub6_Sub18();
		} else if (arg0 == 30) {
			return new Class2_Sub6_Sub7();
		} else if (arg0 == 31) {
			return new Class2_Sub6_Sub35();
		} else if (arg0 == 32) {
			return new Class2_Sub6_Sub39();
		} else if (arg0 == 33) {
			return new Class2_Sub6_Sub12();
		} else if (arg0 == 34) {
			return new Class2_Sub6_Sub27();
		} else if (arg0 == 35) {
			return new Class2_Sub6_Sub19();
		} else if (arg0 == 36) {
			return new Class2_Sub6_Sub11();
		} else if (arg0 == 37) {
			return new Class2_Sub6_Sub21();
		} else if (arg0 == 38) {
			return new Class2_Sub6_Sub6();
		} else if (arg0 == 39) {
			return new Class2_Sub6_Sub3();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZII)Z")
	public static boolean method3048(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static220.aBoolean257 || !Static436.aBoolean530) {
			return false;
		} else if (Static29.anInt690 < 100) {
			return false;
		} else {
			@Pc(24) int local24 = Static195.anIntArrayArrayArray9[arg2][arg1][arg0];
			if (-Static153.anInt2750 == local24) {
				return false;
			} else if (local24 == Static153.anInt2750) {
				return true;
			} else if (Static313.aClass76Array1 == Static314.aClass76Array2) {
				return false;
			} else {
				@Pc(49) int local49 = arg1 << Static609.anInt9827;
				@Pc(53) int local53 = arg0 << Static609.anInt9827;
				if (Static260.method3556(local49 + 1, local49 + 1, Static192.anInt3298 + local53 - 1, Static314.aClass76Array2[arg2].method7396(arg0 + 1, arg1 + 1), Static192.anInt3298 + local53 - 1, Static314.aClass76Array2[arg2].method7396(arg0, arg1), Static192.anInt3298 + local49 - 1, local53 + 1, Static314.aClass76Array2[arg2].method7396(arg0 + 1, arg1)) && Static260.method3556(Static192.anInt3298 + local49 - 1, local49 + 1, local53 + 1, Static314.aClass76Array2[arg2].method7396(arg0, arg1 + 1), Static192.anInt3298 + local53 - 1, Static314.aClass76Array2[arg2].method7396(arg0, arg1), Static192.anInt3298 + local49 - 1, local53 + 1, Static314.aClass76Array2[arg2].method7396(arg0 + 1, arg1 + 1))) {
					Static536.anInt8797++;
					Static195.anIntArrayArrayArray9[arg2][arg1][arg0] = Static153.anInt2750;
					return true;
				} else {
					Static195.anIntArrayArrayArray9[arg2][arg1][arg0] = -Static153.anInt2750;
					return false;
				}
			}
		}
	}
}
