import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!qb;")
	public static Class142 aClass142_13 = new Class142(512);

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
	public static int anInt3036 = 0;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)Lclient!fm;")
	public static Class53 method2637(@OriginalArg(1) int arg0) {
		@Pc(6) Class53 local6 = (Class53) Static313.aClass187_80.method4527((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static312.aClass121_136.method3115(3, arg0);
		local6 = new Class53();
		if (local21 != null) {
			local6.method1585(new Class1_Sub14(local21));
		}
		Static313.aClass187_80.method4524((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Z")
	public static boolean method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static60.anInt1160; local1++) {
			@Pc(8) Class91 local8 = Static145.aClass91Array1[local1];
			@Pc(17) int local17;
			@Pc(29) int local29;
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(59) int local59;
			if (local8.anInt2879 == 1) {
				local17 = local8.anInt2878 - arg0;
				if (local17 > 0) {
					local29 = local8.anInt2877 + (local8.anInt2890 * local17 >> 8);
					local39 = local8.anInt2888 + (local8.anInt2881 * local17 >> 8);
					local49 = local8.anInt2887 + (local8.anInt2871 * local17 >> 8);
					local59 = local8.anInt2884 + (local8.anInt2889 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2879 == 2) {
				local17 = arg0 - local8.anInt2878;
				if (local17 > 0) {
					local29 = local8.anInt2877 + (local8.anInt2890 * local17 >> 8);
					local39 = local8.anInt2888 + (local8.anInt2881 * local17 >> 8);
					local49 = local8.anInt2887 + (local8.anInt2871 * local17 >> 8);
					local59 = local8.anInt2884 + (local8.anInt2889 * local17 >> 8);
					if (arg2 >= local29 && arg2 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2879 == 3) {
				local17 = local8.anInt2877 - arg2;
				if (local17 > 0) {
					local29 = local8.anInt2878 + (local8.anInt2880 * local17 >> 8);
					local39 = local8.anInt2873 + (local8.anInt2870 * local17 >> 8);
					local49 = local8.anInt2887 + (local8.anInt2871 * local17 >> 8);
					local59 = local8.anInt2884 + (local8.anInt2889 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2879 == 4) {
				local17 = arg2 - local8.anInt2877;
				if (local17 > 0) {
					local29 = local8.anInt2878 + (local8.anInt2880 * local17 >> 8);
					local39 = local8.anInt2873 + (local8.anInt2870 * local17 >> 8);
					local49 = local8.anInt2887 + (local8.anInt2871 * local17 >> 8);
					local59 = local8.anInt2884 + (local8.anInt2889 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg1 >= local49 && arg1 <= local59) {
						return true;
					}
				}
			} else if (local8.anInt2879 == 5) {
				local17 = arg1 - local8.anInt2887;
				if (local17 > 0) {
					local29 = local8.anInt2878 + (local8.anInt2880 * local17 >> 8);
					local39 = local8.anInt2873 + (local8.anInt2870 * local17 >> 8);
					local49 = local8.anInt2877 + (local8.anInt2890 * local17 >> 8);
					local59 = local8.anInt2888 + (local8.anInt2881 * local17 >> 8);
					if (arg0 >= local29 && arg0 <= local39 && arg2 >= local49 && arg2 <= local59) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)[Lclient!je;")
	public static Class83[] method2640() {
		if (Static217.aClass83Array1 == null) {
			@Pc(14) Class83[] local14 = Static217.method3413(Static26.aClass154_1);
			@Pc(16) int local16 = 0;
			@Pc(20) Class83[] local20 = new Class83[local14.length];
			label53: for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
				@Pc(34) Class83 local34 = local14[local22];
				if ((local34.anInt2584 <= 0 || local34.anInt2584 >= 24) && local34.anInt2590 >= 800 && local34.anInt2586 >= 600) {
					for (@Pc(60) int local60 = 0; local60 < local16; local60++) {
						@Pc(67) Class83 local67 = local20[local60];
						if (local34.anInt2590 == local67.anInt2590 && local67.anInt2586 == local34.anInt2586) {
							if (local67.anInt2584 < local34.anInt2584) {
								local20[local60] = local34;
							}
							continue label53;
						}
					}
					local20[local16] = local34;
					local16++;
				}
			}
			Static217.aClass83Array1 = new Class83[local16];
			Static319.method1772(local20, 0, Static217.aClass83Array1, 0, local16);
			@Pc(121) int[] local121 = new int[Static217.aClass83Array1.length];
			for (@Pc(123) int local123 = 0; local123 < Static217.aClass83Array1.length; local123++) {
				@Pc(131) Class83 local131 = Static217.aClass83Array1[local123];
				local121[local123] = local131.anInt2586 * local131.anInt2590;
			}
			Static13.method171(local121, Static217.aClass83Array1);
		}
		return Static217.aClass83Array1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBI)I")
	public static int method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 >> 2 << 10) + (arg2 >> 1));
	}
}
