import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[S")
	public static final short[] aShortArray125 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[S")
	private static final short[] aShortArray126 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!qd", name = "z", descriptor = "[S")
	private static final short[] aShortArray128 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "[S")
	private static final short[] aShortArray127 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "[[S")
	public static final short[][] aShortArrayArray26 = new short[][] { aShortArray128, aShortArray126, aShortArray125, aShortArray127 };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([JI[Ljava/lang/Object;II)V")
	public static void method7674(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) Object local30 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg1; local50 < arg3; local50++) {
			if (arg0[local50] < (long) (local50 & local48) + local16) {
				@Pc(71) long local71 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local71;
				@Pc(85) Object local85 = arg2[local50];
				arg2[local50] = arg2[local12];
				arg2[local12++] = local85;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg3] = arg2[local12];
		arg2[local12] = local30;
		method7674(arg0, arg1, arg2, local12 - 1);
		method7674(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public static void method7676() {
		for (@Pc(5) int local5 = 0; local5 < Static207.anInt4335; local5++) {
			@Pc(15) int local15 = Static438.method6516(local5 + Static260.anInt5098, Static207.anInt4335) * Static466.anInt4483;
			for (@Pc(17) int local17 = 0; local17 < Static466.anInt4483; local17++) {
				@Pc(28) int local28 = Static438.method6516(local17 + Static78.anInt1695, Static466.anInt4483) + local15;
				if (Static315.anIntArray429[local28] == Static250.anInt8281) {
					Static5.anInterface24Array1[local28].method8382(0, 0, Static531.anInt8888, Static155.anInt3544, local17 * Static531.anInt8888, local5 * Static155.anInt3544);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIII)Lclient!vg;")
	public static Class11_Sub1_Sub1_Sub2 method7679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class217 local11 = Static440.aClass217ArrayArrayArray3[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class11_Sub1_Sub1_Sub2 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class61 local22 = local11.aClass61_2; local22 != null; local22 = local22.aClass61_1) {
			@Pc(26) Class11_Sub1_Sub1 local26 = local22.aClass11_Sub1_Sub1_1;
			if (local26 instanceof Class11_Sub1_Sub1_Sub2) {
				@Pc(32) Class11_Sub1_Sub1_Sub2 local32 = (Class11_Sub1_Sub1_Sub2) local26;
				@Pc(40) int local40 = local32.method2778() * 256 - 4;
				@Pc(48) int local48 = local32.anInt9925 - local40 >> 9;
				@Pc(56) int local56 = local32.anInt9929 - local40 >> 9;
				@Pc(63) int local63 = local32.anInt9925 + local40 >> 9;
				@Pc(71) int local71 = local32.anInt9929 + local40 >> 9;
				if (arg2 >= local48 && local56 <= arg1 && arg2 <= local63 && arg1 <= local71) {
					@Pc(108) int local108 = (local63 + 1 - arg2) * (-arg1 + (local71 - -1));
					if (local19 < local108) {
						local17 = local32;
						local19 = local108;
					}
				}
			}
		}
		return local17;
	}
}
