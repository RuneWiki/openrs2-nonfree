import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public static int anInt3732;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public static int anInt3733;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "[Lclient!nc;")
	public static Class106[] aClass106Array3;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!jj;")
	public static final Class108 aClass108_24 = new Class108(16);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!sr;III[Z)V")
	public static void method3663(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (aClass106Array3 == Static84.aClass106Array1) {
			return;
		}
		@Pc(9) int local9 = Static99.aClass106Array4[arg1].method5717(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class106 local22 = Static99.aClass106Array4[local11];
				if (local22 != null) {
					local22.method5724(arg0, arg2, local9 - local22.method5717(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIBLclient!bq;IZ)V")
	public static void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class24 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static284.anInt5378 >= 50 || (arg2 == null || arg2.anIntArrayArray30 == null || arg2.anIntArrayArray30.length <= arg0 || arg2.anIntArrayArray30[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray30[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(61) int local61;
		if (arg2.anIntArrayArray30[arg0].length > 1) {
			local61 = (int) (Math.random() * (double) arg2.anIntArrayArray30[arg0].length);
			if (local61 > 0) {
				local38 = arg2.anIntArrayArray30[arg0][local61];
			}
		}
		@Pc(77) int local77 = local34 & 0x1F;
		if (local77 == 0) {
			if (arg4) {
				Static103.method2102(255, 0, local44, local38);
			}
		} else if (Static243.anInt4564 != 0) {
			Static194.anIntArray433[Static284.anInt5378] = local38;
			Static194.anIntArray432[Static284.anInt5378] = local44;
			Static263.anIntArray530[Static284.anInt5378] = 0;
			Static65.aClass12Array1[Static284.anInt5378] = null;
			Static125.anIntArray307[Static284.anInt5378] = 255;
			local61 = (arg3 - 64) / 128;
			@Pc(126) int local126 = (arg1 - 64) / 128;
			Static209.anIntArray449[Static284.anInt5378] = (local61 << 16) + (local126 << 8) + local77;
			Static284.anInt5378++;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
	public static void method3668(@OriginalArg(1) int arg0) {
		Static41.anInt6386 = arg0;
		@Pc(7) Class70 local7 = Static108.aClass70_34;
		synchronized (Static108.aClass70_34) {
			Static108.aClass70_34.method1399();
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)Lclient!c;")
	public static Class27 method3669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class27 local7 = new Class27();
		local7.anInt621 = -1;
		local7.anInt631 = arg1 + 5 + 1;
		local7.anInt632 = -1;
		local7.anInt618 = arg0 + 5 + 1;
		local7.anIntArrayArray31 = new int[local7.anInt618][local7.anInt631];
		local7.method522();
		return local7;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public static void method3670() {
		for (@Pc(11) Class6_Sub30 local11 = (Class6_Sub30) Static197.aClass108_30.method2903(); local11 != null; local11 = (Class6_Sub30) Static197.aClass108_30.method2905()) {
			@Pc(16) int local16 = local11.anInt4313;
			if (Static31.method490(local16)) {
				@Pc(22) boolean local22 = true;
				@Pc(26) Class132[] local26 = Static81.aClass132ArrayArray1[local16];
				for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
					if (local26[local28] != null) {
						local22 = local26[local28].aBoolean261;
						break;
					}
				}
				if (!local22) {
					@Pc(52) int local52 = (int) local11.aLong218;
					@Pc(56) Class132 local56 = Static249.method4316(local52);
					if (local56 != null) {
						Static298.method5108(local56);
					}
				}
			}
		}
	}
}
