import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
	public static int anInt4478;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[I")
	public static final int[] anIntArray322 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_79 = new Class66(256);

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_80 = new Class66(64);

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)Lclient!cf;")
	public static Class31 method3934(@OriginalArg(1) int arg0) {
		@Pc(5) Class66 local5 = Static222.aClass66_76;
		@Pc(14) Class31 local14;
		synchronized (Static222.aClass66_76) {
			local14 = (Class31) Static222.aClass66_76.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(38) byte[] local38 = Static347.aClass170_122.method4584(3, arg0);
		local14 = new Class31();
		if (local38 != null) {
			local14.method867(new Class5_Sub1(local38));
		}
		@Pc(53) Class66 local53 = Static222.aClass66_76;
		synchronized (Static222.aClass66_76) {
			Static222.aClass66_76.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
	public static void method3935() {
		if (Static109.anInt2324 == 5) {
			Static109.anInt2324 = 6;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg8 && arg0 == arg3 && arg6 == arg1 && arg7 == arg5) {
			Static116.method2288(arg1, arg4, arg0, arg5, arg2);
			return;
		}
		@Pc(23) int local23 = arg2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg2 * 3;
		@Pc(33) int local33 = arg0 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg3 * 3;
		@Pc(45) int local45 = arg6 * 3;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(59) int local59 = local37 + arg1 - arg2 - local45;
		@Pc(69) int local69 = local41 + arg5 - arg0 - local49;
		@Pc(78) int local78 = local29 + local45 - local37 - local37;
		@Pc(89) int local89 = local49 + local33 - local41 - local41;
		@Pc(94) int local94 = local37 - local29;
		@Pc(99) int local99 = local41 - local33;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local109 * local101 >> 12;
			@Pc(119) int local119 = local115 * local59;
			@Pc(123) int local123 = local69 * local115;
			@Pc(127) int local127 = local78 * local109;
			@Pc(131) int local131 = local109 * local89;
			@Pc(135) int local135 = local101 * local94;
			@Pc(139) int local139 = local99 * local101;
			@Pc(149) int local149 = (local127 + local119 + local135 >> 12) + arg2;
			@Pc(159) int local159 = (local139 + local131 + local123 >> 12) + arg0;
			Static116.method2288(local149, arg4, local25, local159, local23);
			local23 = local149;
			local25 = local159;
		}
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V")
	public static void method3937() {
		for (@Pc(19) Class5_Sub40 local19 = (Class5_Sub40) Static265.aClass42_53.method1060(); local19 != null; local19 = (Class5_Sub40) Static265.aClass42_53.method1055()) {
			@Pc(24) int local24 = local19.anInt6233;
			if (Static323.method5433(local24)) {
				@Pc(30) boolean local30 = true;
				@Pc(34) Class96[] local34 = Static348.aClass96ArrayArray1[local24];
				for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
					if (local34[local36] != null) {
						local30 = local34[local36].aBoolean197;
						break;
					}
				}
				if (!local30) {
					@Pc(64) int local64 = (int) local19.aLong218;
					@Pc(68) Class96 local68 = Static121.method2396(local64);
					if (local68 != null) {
						Static336.method4719(local68);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIIII)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static186.anInt6011 / (float) Static186.anInt6008;
		@Pc(11) int local11 = arg2;
		@Pc(18) int local18 = arg3;
		if (local9 < 1.0F) {
			local18 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(45) int local45 = arg0 - (arg2 - local11) / 2;
		@Pc(54) int local54 = arg1 - (arg3 - local18) / 2;
		Static55.anInt1337 = -1;
		Static9.anInt302 = Static186.anInt6011 - local54 * Static186.anInt6011 / local18;
		Static321.anInt6091 = -1;
		Static180.anInt3602 = Static186.anInt6008 * local45 / local11;
		Static228.method3919();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method3939(@OriginalArg(1) Class170 arg0) {
		Static24.aClass170_37 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(BI)V")
	public static void method3940() {
		@Pc(9) Class66 local9 = Static261.aClass66_88;
		synchronized (Static261.aClass66_88) {
			Static261.aClass66_88.method1944(5);
		}
	}
}
