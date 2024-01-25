import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!cn;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZIII)Lclient!vo;")
	public static Class348 method2515(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(10) Class346 local10 = null;
		if (Static64.aClass283_1 != null) {
			local10 = new Class346(arg1, Static64.aClass283_1, Static141.aClass283Array33[arg1], 1000000);
		}
		Static519.aClass240_Sub1Array2[arg1] = Static497.aClass109_1.method2511(arg1, local10, Static206.aClass346_8);
		Static519.aClass240_Sub1Array2[arg1].method5500();
		return new Class348(Static519.aClass240_Sub1Array2[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLclient!ufa;)I")
	public static int method2519(@OriginalArg(1) Class21_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt4255 == 0) {
			return 0;
		}
		@Pc(62) int local62;
		@Pc(55) int local55;
		if (arg0.anInt4263 != -1) {
			@Pc(17) Class21_Sub1_Sub1_Sub1 local17 = null;
			if (arg0.anInt4263 < 32768) {
				@Pc(29) Class4_Sub29 local29 = (Class4_Sub29) Static144.aClass221_6.method5075((long) arg0.anInt4263);
				if (local29 != null) {
					local17 = local29.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				}
			} else if (arg0.anInt4263 >= 32768) {
				local17 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt4263 - 32768];
			}
			if (local17 != null) {
				local55 = arg0.anInt10551 - local17.anInt10551;
				local62 = arg0.anInt10550 - local17.anInt10550;
				if (local55 != 0 || local62 != 0) {
					arg0.method3325((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class21_Sub1_Sub1_Sub1_Sub2) {
			@Pc(96) Class21_Sub1_Sub1_Sub1_Sub2 local96 = (Class21_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local96.anInt4323 != -1 && (local96.anInt4277 == 0 || local96.anInt4279 > 0)) {
				local96.method3325(local96.anInt4323);
				local96.anInt4323 = -1;
			}
		} else if (arg0 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
			@Pc(128) Class21_Sub1_Sub1_Sub1_Sub1 local128 = (Class21_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local128.anInt2171 != -1 && (local128.anInt4277 == 0 || local128.anInt4279 > 0)) {
				local55 = local128.anInt10551 - (local128.anInt2171 - Static242.anInt10133 - Static242.anInt10133) * 256;
				local62 = local128.anInt10550 - (local128.anInt2168 - Static157.anInt3323 - Static157.anInt3323) * 256;
				if (local55 != 0 || local62 != 0) {
					local128.method3325((int) (Math.atan2((double) local55, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local128.anInt2171 = -1;
			}
		}
		return arg0.method3323();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILclient!is;)V")
	public static void method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2) {
		if (arg2.aByte76 == 0) {
			arg2.anInt4799 = arg2.anInt4770;
		} else if (arg2.aByte76 == 1) {
			arg2.anInt4799 = (arg0 - arg2.anInt4831) / 2 + arg2.anInt4770;
		} else if (arg2.aByte76 == 2) {
			arg2.anInt4799 = arg0 - arg2.anInt4770 - arg2.anInt4831;
		} else if (arg2.aByte76 == 3) {
			arg2.anInt4799 = arg2.anInt4770 * arg0 >> 14;
		} else if (arg2.aByte76 == 4) {
			arg2.anInt4799 = (arg2.anInt4770 * arg0 >> 14) + (arg0 - arg2.anInt4831) / 2;
		} else {
			arg2.anInt4799 = arg0 - (arg0 * arg2.anInt4770 >> 14) - arg2.anInt4831;
		}
		if (arg2.aByte77 == 0) {
			arg2.anInt4795 = arg2.anInt4819;
		} else if (arg2.aByte77 == 1) {
			arg2.anInt4795 = arg2.anInt4819 + (arg1 - arg2.anInt4806) / 2;
		} else if (arg2.aByte77 == 2) {
			arg2.anInt4795 = arg1 - arg2.anInt4806 - arg2.anInt4819;
		} else if (arg2.aByte77 == 3) {
			arg2.anInt4795 = arg1 * arg2.anInt4819 >> 14;
		} else if (arg2.aByte77 == 4) {
			arg2.anInt4795 = (arg1 * arg2.anInt4819 >> 14) + (arg1 - arg2.anInt4806) / 2;
		} else {
			arg2.anInt4795 = arg1 - (arg1 * arg2.anInt4819 >> 14) - arg2.anInt4806;
		}
		if (!Static80.aBoolean170 || Static70.method1542(arg2).anInt8126 == 0 && arg2.anInt4796 != 0) {
			return;
		}
		if (arg2.anInt4795 < 0) {
			arg2.anInt4795 = 0;
		} else if (arg2.anInt4806 + arg2.anInt4795 > arg1) {
			arg2.anInt4795 = arg1 - arg2.anInt4806;
		}
		if (arg2.anInt4799 < 0) {
			arg2.anInt4799 = 0;
		} else if (arg2.anInt4799 + arg2.anInt4831 > arg0) {
			arg2.anInt4799 = arg0 - arg2.anInt4831;
		}
	}
}
