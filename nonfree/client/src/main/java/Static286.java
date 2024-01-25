import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
	public static int anInt5104 = 0;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_156 = new Class41(18, -1);

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_135 = new Class77(4, -1);

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_16 = new Class17(2, 4);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method4394(@OriginalArg(1) int arg0) {
		Static259.method4042();
		@Pc(19) int local19 = Static235.aClass25_1.method681(arg0).anInt2252;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static248.aClass125_1.anIntArray338[arg0];
		if (local19 == 5) {
			Static334.anInt5856 = local27;
		}
		if (local19 == 6) {
			Static356.anInt6258 = local27;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZII)I")
	public static int method4395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static16.anIntArray79[arg1 & 0x3] : Static168.anIntArray336[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)I")
	public static int method4397(@OriginalArg(0) int arg0) {
		if (Static169.aClass124_3 != null) {
			Static169.aClass124_3.method2714();
			Static169.aClass124_3 = null;
		}
		Static146.anInt2671++;
		if (Static146.anInt2671 > 4) {
			Static146.anInt2671 = 0;
			Static99.anInt1958 = 0;
			return arg0;
		}
		Static99.anInt1958 = 0;
		if (Static109.anInt2177 == Static314.anInt5577) {
			Static109.anInt2177 = Static225.anInt4150;
		} else {
			Static109.anInt2177 = Static314.anInt5577;
		}
		return -1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Z")
	public static boolean method4398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static50.anInt1032; local1++) {
			@Pc(6) Class242 local6 = Static219.aClass242Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6511 == 1) {
				local15 = local6.anInt6517 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6516 + (local6.anInt6519 * local15 >> 8);
					local37 = local6.anInt6503 + (local6.anInt6507 * local15 >> 8);
					local47 = local6.anInt6510 + (local6.anInt6513 * local15 >> 8);
					local57 = local6.anInt6512 + (local6.anInt6514 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6511 == 2) {
				local15 = arg0 - local6.anInt6517;
				if (local15 > 0) {
					local27 = local6.anInt6516 + (local6.anInt6519 * local15 >> 8);
					local37 = local6.anInt6503 + (local6.anInt6507 * local15 >> 8);
					local47 = local6.anInt6510 + (local6.anInt6513 * local15 >> 8);
					local57 = local6.anInt6512 + (local6.anInt6514 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6511 == 3) {
				local15 = local6.anInt6516 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6517 + (local6.anInt6518 * local15 >> 8);
					local37 = local6.anInt6506 + (local6.anInt6508 * local15 >> 8);
					local47 = local6.anInt6510 + (local6.anInt6513 * local15 >> 8);
					local57 = local6.anInt6512 + (local6.anInt6514 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6511 == 4) {
				local15 = arg2 - local6.anInt6516;
				if (local15 > 0) {
					local27 = local6.anInt6517 + (local6.anInt6518 * local15 >> 8);
					local37 = local6.anInt6506 + (local6.anInt6508 * local15 >> 8);
					local47 = local6.anInt6510 + (local6.anInt6513 * local15 >> 8);
					local57 = local6.anInt6512 + (local6.anInt6514 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6511 == 5) {
				local15 = arg1 - local6.anInt6510;
				if (local15 > 0) {
					local27 = local6.anInt6517 + (local6.anInt6518 * local15 >> 8);
					local37 = local6.anInt6506 + (local6.anInt6508 * local15 >> 8);
					local47 = local6.anInt6516 + (local6.anInt6519 * local15 >> 8);
					local57 = local6.anInt6503 + (local6.anInt6507 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)[Lclient!ll;")
	public static Class143[] method4399() {
		return new Class143[] { Static337.aClass143_27, Static6.aClass143_1, Static384.aClass143_29, Static228.aClass143_20, Static186.aClass143_28 };
	}
}
