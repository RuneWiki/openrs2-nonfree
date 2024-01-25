import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!rca", name = "O", descriptor = "Lclient!pj;")
	public static Class248 aClass248_84;

	@OriginalMember(owner = "client!rca", name = "y", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_123 = new Class98(79, 6);

	@OriginalMember(owner = "client!rca", name = "M", descriptor = "[I")
	public static final int[] anIntArray560 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!rca", name = "Q", descriptor = "[Lclient!hn;")
	public static final Class134[] aClass134Array1 = new Class134[4];

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "(I)V")
	public static void method6241() {
		if (Static492.aBoolean563) {
			return;
		}
		Static380.aBoolean478 = true;
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static562.aFloat14 = (int) Static562.aFloat14 + 191 & 0xFFFFFF80;
		} else {
			Static7.aFloat12 += (24.0F - Static7.aFloat12) / 2.0F;
		}
		Static492.aBoolean563 = true;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILclient!uea;I)V")
	public static void method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15_Sub2_Sub4_Sub2 arg2) {
		if (arg2.anInt8932 == arg1 && arg1 != -1) {
			@Pc(89) Class63 local89 = Static388.aClass324_2.method7265(arg1);
			@Pc(92) int local92 = local89.anInt1379;
			if (local92 == 1) {
				arg2.anInt8929 = 1;
				arg2.anInt8955 = arg0;
				arg2.anInt8969 = 0;
				arg2.anInt8944 = 0;
				arg2.anInt8975 = 0;
				Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg2, arg2.anInt8911, arg2.aByte98, local89, arg2.anInt8913, arg2.anInt8975);
			}
			if (local92 == 2) {
				arg2.anInt8969 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt8932 == -1 || Static388.aClass324_2.method7265(arg1).anInt1377 >= Static388.aClass324_2.method7265(arg2.anInt8932).anInt1377) {
			arg2.anInt8932 = arg1;
			arg2.anInt8955 = arg0;
			arg2.anInt8975 = 0;
			arg2.anInt8944 = 0;
			arg2.anInt8929 = 1;
			arg2.anInt8969 = 0;
			arg2.anInt8997 = arg2.anInt8998;
			if (arg2.anInt8932 != -1) {
				Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg2, arg2.anInt8911, arg2.aByte98, Static388.aClass324_2.method7265(arg2.anInt8932), arg2.anInt8913, arg2.anInt8975);
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)I")
	public static int method6243(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[I[I[ILclient!uea;)V")
	public static void method6245(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class15_Sub2_Sub4_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg3.aClass140Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass140Array3[local19] = null;
					} else {
						@Pc(34) Class63 local34 = Static388.aClass324_2.method7265(local9);
						@Pc(37) int local37 = local34.anInt1379;
						@Pc(42) Class140 local42 = arg3.aClass140Array3[local19];
						if (local42 != null) {
							if (local9 == local42.anInt4049) {
								if (local37 == 0) {
									local42 = arg3.aClass140Array3[local19] = null;
								} else if (local37 == 1) {
									local42.anInt4042 = 0;
									local42.anInt4048 = 0;
									local42.anInt4045 = 0;
									local42.anInt4044 = local17;
									local42.anInt4040 = 1;
									Static32.method514(arg3 == Static461.aClass15_Sub2_Sub4_Sub2_2, arg3.anInt8911, arg3.aByte98, local34, arg3.anInt8913, 0);
								} else if (local37 == 2) {
									local42.anInt4042 = 0;
								}
							} else if (local34.anInt1377 >= Static388.aClass324_2.method7265(local42.anInt4049).anInt1377) {
								local42 = arg3.aClass140Array3[local19] = null;
							}
						}
						if (local42 == null) {
							local42 = arg3.aClass140Array3[local19] = new Class140();
							local42.anInt4048 = 0;
							local42.anInt4040 = 1;
							local42.anInt4042 = 0;
							local42.anInt4049 = local9;
							local42.anInt4045 = 0;
							local42.anInt4044 = local17;
							Static32.method514(Static461.aClass15_Sub2_Sub4_Sub2_2 == arg3, arg3.anInt8911, arg3.aByte98, local34, arg3.anInt8913, 0);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
