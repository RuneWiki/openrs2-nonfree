import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_107 = new Class130();

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
	public static int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_76 = new Class154(64);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIB)V")
	public static void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 - arg0;
		@Pc(13) int local13 = arg2 - arg1;
		if (local13 == 0) {
			if (local9 != 0) {
				Static68.method1269(arg3, arg4, arg0, arg1);
			}
		} else if (local9 == 0) {
			Static292.method4981(arg1, arg0, arg2, arg4);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(62) boolean local62 = local13 < local9;
			@Pc(66) int local66;
			@Pc(70) int local70;
			if (local62) {
				local66 = arg1;
				arg1 = arg0;
				local70 = arg2;
				arg0 = local66;
				arg2 = arg3;
				arg3 = local70;
			}
			if (arg1 > arg2) {
				local66 = arg1;
				arg1 = arg2;
				local70 = arg0;
				arg2 = local66;
				arg0 = arg3;
				arg3 = local70;
			}
			local66 = arg0;
			local70 = arg2 - arg1;
			@Pc(106) int local106 = arg3 - arg0;
			@Pc(111) int local111 = -(local70 >> 1);
			@Pc(122) int local122 = arg3 > arg0 ? 1 : -1;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(131) int local131;
			if (local62) {
				for (local131 = arg1; local131 <= arg2; local131++) {
					local111 += local106;
					Static30.anIntArrayArray10[local131][local66] = arg4;
					if (local111 > 0) {
						local66 += local122;
						local111 -= local70;
					}
				}
			} else {
				for (local131 = arg1; local131 <= arg2; local131++) {
					Static30.anIntArrayArray10[local66][local131] = arg4;
					local111 += local106;
					if (local111 > 0) {
						local66 += local122;
						local111 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V")
	public static void method4096(@OriginalArg(1) int arg0) {
		if (Static177.anInt5898 == 0) {
			Static129.aClass4_Sub13_Sub3_1.method4894(arg0);
		} else {
			Static138.anInt3121 = arg0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!fd;B)V")
	public static void method4097(@OriginalArg(0) Class72 arg0) {
		if (arg0.anInt1831 == Static249.anInt5198) {
			Static60.aBooleanArray8[arg0.anInt1856] = true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
	public static int method4099() {
		if (Static173.aBoolean319 || Static282.anInt5713 <= 0) {
			@Pc(14) int local14 = Static38.anInt830;
			@Pc(16) int local16 = Static184.anInt4055;
			@Pc(18) int local18 = Static111.anInt2449;
			@Pc(20) int local20 = Static87.anInt1931;
			@Pc(22) int local22 = Static111.anInt2450;
			if (local18 < local14 && local22 + local18 > local14) {
				@Pc(32) int local32 = -1;
				@Pc(50) int local50;
				for (@Pc(34) int local34 = 0; local34 < Static282.anInt5713; local34++) {
					if (Static104.aBoolean594) {
						local50 = local20 + (Static282.anInt5713 + -1 - local34) * 16 + 33;
						if (local50 - 13 < local16 && local16 <= local50 + 3) {
							local32 = local34;
						}
					} else {
						local50 = (Static282.anInt5713 - local34 - 1) * 16 + local20 + 31;
						if (local50 - 13 < local16 && local50 + 3 >= local16) {
							local32 = local34;
						}
					}
				}
				if (local32 != -1) {
					local50 = 0;
					@Pc(114) Class140 local114 = new Class140(Static248.aClass130_112);
					for (@Pc(121) Class4_Sub18 local121 = (Class4_Sub18) local114.method3687(); local121 != null; local121 = (Class4_Sub18) local114.method3688()) {
						if (local50++ == local32) {
							return local121.anInt2900;
						}
					}
				}
			}
			return -1;
		} else if (Static106.aBoolean205 && Static77.aBooleanArray13[81] && Static282.anInt5713 > 2) {
			return ((Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248.aClass4_248).anInt2900;
		} else {
			return ((Class4_Sub18) Static248.aClass130_112.aClass4_144.aClass4_248).anInt2900;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lclient!dn;")
	public static Class17_Sub2 method4100(@OriginalArg(1) int arg0) {
		@Pc(7) Class204[] local7 = Class63.aClass204Array6;
		synchronized (Class63.aClass204Array6) {
			@Pc(33) Class17_Sub2 local33;
			if (Class63.aClass204Array6.length <= arg0 || Class63.aClass204Array6[arg0].method5358()) {
				local33 = new Class17_Sub2();
				local33.aClass17_Sub6Array1 = new Class17_Sub6[arg0];
				for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
					local33.aClass17_Sub6Array1[local39] = new Class17_Sub6();
				}
			} else {
				local33 = (Class17_Sub2) Class63.aClass204Array6[arg0].method5363();
				local33.method5473();
				@Pc(72) int local72 = Static162.anIntArray314[arg0]--;
			}
			return local33;
		}
	}
}
