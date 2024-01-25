import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
	public static int anInt9889;

	@OriginalMember(owner = "client!ur", name = "T", descriptor = "[Lclient!pi;")
	public static Class262[] aClass262Array3;

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "Lclient!kq;")
	public static final Class184 aClass184_14 = new Class184(8, 1);

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_141 = new Class90(0, 0);

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
	public static int anInt9892 = -1;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)B")
	public static byte method7592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)V")
	public static void method7593(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub6_Sub5 local16 = Static396.method6079(arg0, 6);
		local16.method2302();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class4_Sub2 method7595(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class4_Sub2_Sub39();
		} else if (arg0 == 1) {
			return new Class4_Sub2_Sub38();
		} else if (arg0 == 2) {
			return new Class4_Sub2_Sub14();
		} else if (arg0 == 3) {
			return new Class4_Sub2_Sub11();
		} else if (arg0 == 4) {
			return new Class4_Sub2_Sub8();
		} else if (arg0 == 5) {
			return new Class4_Sub2_Sub13();
		} else if (arg0 == 6) {
			return new Class4_Sub2_Sub22();
		} else if (arg0 == 7) {
			return new Class4_Sub2_Sub3();
		} else if (arg0 == 8) {
			return new Class4_Sub2_Sub30();
		} else if (arg0 == 9) {
			return new Class4_Sub2_Sub20();
		} else if (arg0 == 10) {
			return new Class4_Sub2_Sub10();
		} else if (arg0 == 11) {
			return new Class4_Sub2_Sub1();
		} else if (arg0 == 12) {
			return new Class4_Sub2_Sub19();
		} else if (arg0 == 13) {
			return new Class4_Sub2_Sub6();
		} else if (arg0 == 14) {
			return new Class4_Sub2_Sub24();
		} else if (arg0 == 15) {
			return new Class4_Sub2_Sub27();
		} else if (arg0 == 16) {
			return new Class4_Sub2_Sub37();
		} else if (arg0 == 17) {
			return new Class4_Sub2_Sub4();
		} else if (arg0 == 18) {
			return new Class4_Sub2_Sub16_Sub1();
		} else if (arg0 == 19) {
			return new Class4_Sub2_Sub28();
		} else if (arg0 == 20) {
			return new Class4_Sub2_Sub31();
		} else if (arg0 == 21) {
			return new Class4_Sub2_Sub12();
		} else if (arg0 == 22) {
			return new Class4_Sub2_Sub15();
		} else if (arg0 == 23) {
			return new Class4_Sub2_Sub5();
		} else if (arg0 == 24) {
			return new Class4_Sub2_Sub33();
		} else if (arg0 == 25) {
			return new Class4_Sub2_Sub17();
		} else if (arg0 == 26) {
			return new Class4_Sub2_Sub29();
		} else if (arg0 == 27) {
			return new Class4_Sub2_Sub35();
		} else if (arg0 == 28) {
			return new Class4_Sub2_Sub21();
		} else if (arg0 == 29) {
			return new Class4_Sub2_Sub9();
		} else if (arg0 == 30) {
			return new Class4_Sub2_Sub25();
		} else if (arg0 == 31) {
			return new Class4_Sub2_Sub7();
		} else if (arg0 == 32) {
			return new Class4_Sub2_Sub34();
		} else if (arg0 == 33) {
			return new Class4_Sub2_Sub2();
		} else if (arg0 == 34) {
			return new Class4_Sub2_Sub23();
		} else if (arg0 == 35) {
			return new Class4_Sub2_Sub36();
		} else if (arg0 == 36) {
			return new Class4_Sub2_Sub32();
		} else if (arg0 == 37) {
			return new Class4_Sub2_Sub26();
		} else if (arg0 == 38) {
			return new Class4_Sub2_Sub18();
		} else if (arg0 == 39) {
			return new Class4_Sub2_Sub16();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!at;Z)Z")
	public static boolean method7597(@OriginalArg(0) Class21_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static255.aClass115Array2 == Static140.aClass115Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7567();
		if (arg0.aShort119 < 0 || arg0.aShort121 < 0 || arg0.aShort120 >= Static10.anInt812 || arg0.aShort122 >= Static255.anInt5209) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort119; local36 <= arg0.aShort120; local36++) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class182 local47 = Static560.method7938(arg0.aByte127, local36, local40);
				if (local47 != null) {
					@Pc(53) Class192 local53 = Static335.method5122(arg0);
					@Pc(56) Class192 local56 = local47.aClass192_2;
					if (local56 == null) {
						local47.aClass192_2 = local53;
					} else {
						while (local56.aClass192_3 != null) {
							local56 = local56.aClass192_3;
						}
						local56.aClass192_3 = local53;
					}
					if (local6 && (Static511.anIntArrayArray56[local36][local40] & 0xFF000000) != 0) {
						local8 = Static511.anIntArrayArray56[local36][local40];
						local10 = Static565.aShortArrayArray14[local36][local40];
						local12 = Static254.aByteArrayArray18[local36][local40];
					}
					if (!arg1 && local47.aClass21_Sub1_Sub5_1 != null && local47.aClass21_Sub1_Sub5_1.aShort87 > local33) {
						local33 = local47.aClass21_Sub1_Sub5_1.aShort87;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort119; local40 <= arg0.aShort120; local40++) {
				for (@Pc(136) int local136 = arg0.aShort121; local136 <= arg0.aShort122; local136++) {
					if ((Static511.anIntArrayArray56[local40][local136] & 0xFF000000) == 0) {
						Static511.anIntArrayArray56[local40][local136] = local8;
						Static565.aShortArrayArray14[local40][local136] = local10;
						Static254.aByteArrayArray18[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static80.aClass21_Sub1_Sub1Array1[Static496.anInt9339++] = arg0;
		} else {
			local40 = Static255.aClass115Array2 == Static140.aClass115Array1 ? 1 : 0;
			if (!arg0.method8235()) {
				Static375.aClass21_Sub1ArrayArray3[local40][Static27.anIntArray195[local40]++] = arg0;
			} else if (arg0.method8229()) {
				Static338.aClass21_Sub1ArrayArray2[local40][Static254.anIntArray281[local40]++] = arg0;
			} else {
				Static48.aClass21_Sub1ArrayArray4[local40][Static137.anIntArray143[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt10554 -= local33;
		}
		return true;
	}
}
