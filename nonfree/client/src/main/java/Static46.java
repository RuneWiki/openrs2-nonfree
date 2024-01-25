import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "S")
	public static short aShort5 = 205;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "[I")
	public static final int[] anIntArray61 = new int[200];

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "F")
	public static float aFloat2 = 1024.0F;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ps;I)I")
	public static int method772(@OriginalArg(0) Class5_Sub4_Sub4 arg0) {
		if (arg0.anInt4931 == 0) {
			return 0;
		}
		@Pc(31) int local31;
		@Pc(38) int local38;
		if (arg0.anInt4942 != -1 && arg0.anInt4942 < 32768) {
			@Pc(22) Class5_Sub4_Sub4_Sub2 local22 = Static244.aClass5_Sub4_Sub4_Sub2Array1[arg0.anInt4942];
			if (local22 != null) {
				local31 = arg0.anInt5901 - local22.anInt5901;
				local38 = arg0.anInt5905 - local22.anInt5905;
				if (local31 != 0 || local38 != 0) {
					arg0.method4200((int) (Math.atan2((double) local31, (double) local38) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		@Pc(72) int local72;
		if (arg0.anInt4942 >= 32768) {
			local72 = arg0.anInt4942 - 32768;
			if (Static312.anInt6280 == local72) {
				local72 = 2047;
			}
			@Pc(81) Class5_Sub4_Sub4_Sub1 local81 = Static254.aClass5_Sub4_Sub4_Sub1Array1[local72];
			if (local81 != null) {
				local38 = arg0.anInt5901 - local81.anInt5901;
				@Pc(96) int local96 = arg0.anInt5905 - local81.anInt5905;
				if (local38 != 0 || local96 != 0) {
					arg0.method4200((int) (Math.atan2((double) local38, (double) local96) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if ((arg0.anInt4904 != 0 || arg0.anInt4882 != 0) && (arg0.anInt4958 == 0 || arg0.anInt4956 > 0)) {
			local72 = arg0.anInt5901 - (arg0.anInt4904 - Static186.anInt3094 - Static186.anInt3094) * 64;
			local31 = arg0.anInt5905 - (arg0.anInt4882 - Static296.anInt5889 - Static296.anInt5889) * 64;
			if (local72 != 0 || local31 != 0) {
				arg0.method4200((int) (Math.atan2((double) local72, (double) local31) * 2607.5945876176133D) & 0x3FFF);
			}
			arg0.anInt4904 = 0;
			arg0.anInt4882 = 0;
		}
		return arg0.method4215();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public static void method773() {
		Static172.anInt3608 = 0;
		@Pc(17) int local17 = Static186.anInt3094 + (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7);
		@Pc(24) int local24 = Static296.anInt5889 + (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7);
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static172.anInt3608 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static172.anInt3608 = 1;
		}
		if (Static172.anInt3608 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static172.anInt3608 = 0;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V")
	public static void method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg4 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static306.method5120(arg0, arg2, arg4, arg3);
			}
		} else if (local15 == 0) {
			Static114.method1967(arg0, arg3, arg1, arg2);
		} else {
			@Pc(47) int local47 = (local15 << 12) / local10;
			@Pc(56) int local56 = arg3 - (arg0 * local47 >> 12);
			@Pc(64) int local64;
			@Pc(66) int local66;
			if (Static19.anInt533 > arg1) {
				local66 = (local47 * Static19.anInt533 >> 12) + local56;
				local64 = Static19.anInt533;
			} else if (arg1 <= Static4.anInt75) {
				local64 = arg1;
				local66 = arg4;
			} else {
				local64 = Static4.anInt75;
				local66 = local56 + (local47 * Static4.anInt75 >> 12);
			}
			@Pc(102) int local102;
			@Pc(110) int local110;
			if (Static19.anInt533 > arg0) {
				local102 = Static19.anInt533;
				local110 = local56 + (Static19.anInt533 * local47 >> 12);
			} else if (arg0 > Static4.anInt75) {
				local102 = Static4.anInt75;
				local110 = (Static4.anInt75 * local47 >> 12) + local56;
			} else {
				local110 = arg3;
				local102 = arg0;
			}
			if (Static236.anInt4721 > local66) {
				local64 = (Static236.anInt4721 - local56 << 12) / local47;
				local66 = Static236.anInt4721;
			} else if (local66 > Static73.anInt1425) {
				local64 = (Static73.anInt1425 - local56 << 12) / local47;
				local66 = Static73.anInt1425;
			}
			if (Static236.anInt4721 > local110) {
				local102 = (Static236.anInt4721 - local56 << 12) / local47;
				local110 = Static236.anInt4721;
			} else if (local110 > Static73.anInt1425) {
				local110 = Static73.anInt1425;
				local102 = (Static73.anInt1425 - local56 << 12) / local47;
			}
			Static145.method2369(local64, local66, local102, arg2, local110);
		}
	}
}
