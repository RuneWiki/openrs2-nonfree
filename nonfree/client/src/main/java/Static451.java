import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
	public static int anInt7533 = 100;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public static final int anInt7535 = 1400;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "[J")
	public static final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIII)V")
	public static void method6675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(27) Class89 local27 = Static63.aClass89ArrayArrayArray1[arg0][arg5][arg2];
			if (local27 == null) {
				local27 = new Class89(arg0);
			}
			if (arg3 == 1) {
				local27.aShort9 = (short) arg1;
				local27.aShort6 = (short) arg4;
			} else if (arg3 == 2) {
				local27.aShort7 = (short) arg4;
				local27.aShort8 = (short) arg1;
			}
			if (Static508.aBoolean622) {
				Static41.method673();
			}
			return;
		}
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(86) int local86;
		@Pc(90) int local90;
		@Pc(100) int local100;
		@Pc(110) int local110;
		if (arg3 != 8) {
			local77 = (arg5 << Static110.anInt1858) + Static391.anInt6813;
			local82 = local77 - Static391.anInt6813;
			local86 = arg2 << Static110.anInt1858;
			local90 = Static391.anInt6813 + local86;
			local100 = Static445.aClass159Array3[arg0].method8207(arg2, arg5 + 1);
			local110 = Static445.aClass159Array3[arg0].method8207(arg2 + 1, arg5);
			Static572.aClass393Array1[Static83.anInt1456++] = new Class393(arg3, arg0, local77, local82, local82, local77, local100, local110, local110 - arg4, local100 - arg4, local86, local90, local90, local86);
			return;
		}
		local77 = arg5 << Static110.anInt1858;
		local82 = Static391.anInt6813 + local77;
		local86 = arg2 << Static110.anInt1858;
		local90 = Static391.anInt6813 + local86;
		local100 = Static445.aClass159Array3[arg0].method8207(arg2, arg5);
		local110 = Static445.aClass159Array3[arg0].method8207(arg2 + 1, arg5 - -1);
		Static572.aClass393Array1[Static83.anInt1456++] = new Class393(arg3, arg0, local77, local82, local82, local77, local100, local110, local110 - arg4, local100 + -arg4, local86, local90, local90, local86);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIII)Lclient!uj;")
	public static Class366 method6677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(38) long local38 = 0xFFFFL << 32 & (long) arg3 << 32 | ((long) arg0 & 0xFFFFL) << 48 | ((long) arg1 & 0xFFFFL) << 16 | (long) arg2 & 0xFFFFL;
		@Pc(44) Class366 local44 = (Class366) Static571.aClass317_64.method7882(local38);
		if (local44 == null) {
			local44 = Static254.aClass142_1.method3046(arg1, arg3, Static103.aClass171_1, arg0, arg2);
			Static571.aClass317_64.method7875(local38, local44);
		}
		return local44;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IB)I")
	public static int method6678(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
