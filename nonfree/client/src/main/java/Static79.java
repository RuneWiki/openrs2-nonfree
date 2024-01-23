import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	public static int anInt1756;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
	public static int anInt1761;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIBI)V")
	public static void method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static180.method3131(arg1);
		@Pc(10) int local10 = arg1;
		@Pc(14) int local14 = arg1 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = local14;
		@Pc(38) int local38 = -1;
		@Pc(41) int local41 = -local14;
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(89) int local89;
		if (arg4 >= Static127.anInt2664 && arg4 <= Static290.anInt6021) {
			@Pc(55) int[] local55 = Static274.anIntArrayArray50[arg4];
			local63 = Static202.method3411(Static68.anInt1509, arg5 - arg1, Static43.anInt1054);
			local72 = Static202.method3411(Static68.anInt1509, arg5 + arg1, Static43.anInt1054);
			local81 = Static202.method3411(Static68.anInt1509, arg5 - local14, Static43.anInt1054);
			local89 = Static202.method3411(Static68.anInt1509, local14 + arg5, Static43.anInt1054);
			Static133.method2321(local81, local63, local55, arg3);
			Static133.method2321(local89, local81, local55, arg2);
			Static133.method2321(local72, local89, local55, arg3);
		}
		@Pc(109) int local109 = -1;
		while (local26 < local10) {
			local109 += 2;
			local41 += local109;
			local38 += 2;
			local24 += local38;
			if (local41 >= 0 && local28 >= 1) {
				local28--;
				Static261.anIntArray476[local28] = local26;
				local41 -= local28 << 1;
			}
			local26++;
			@Pc(202) int local202;
			@Pc(211) int local211;
			@Pc(218) int[] local218;
			@Pc(161) int local161;
			if (local24 >= 0) {
				local10--;
				local63 = arg4 + local10;
				local24 -= local10 << 1;
				local161 = arg4 - local10;
				if (Static127.anInt2664 <= local63 && Static290.anInt6021 >= local161) {
					if (local10 < local14) {
						local72 = Static261.anIntArray476[local10];
						local81 = Static202.method3411(Static68.anInt1509, arg5 + local26, Static43.anInt1054);
						local89 = Static202.method3411(Static68.anInt1509, arg5 - local26, Static43.anInt1054);
						local202 = Static202.method3411(Static68.anInt1509, local72 + arg5, Static43.anInt1054);
						local211 = Static202.method3411(Static68.anInt1509, arg5 - local72, Static43.anInt1054);
						if (local63 <= Static290.anInt6021) {
							local218 = Static274.anIntArrayArray50[local63];
							Static133.method2321(local211, local89, local218, arg3);
							Static133.method2321(local202, local211, local218, arg2);
							Static133.method2321(local81, local202, local218, arg3);
						}
						if (Static127.anInt2664 <= local161) {
							local218 = Static274.anIntArrayArray50[local161];
							Static133.method2321(local211, local89, local218, arg3);
							Static133.method2321(local202, local211, local218, arg2);
							Static133.method2321(local81, local202, local218, arg3);
						}
					} else {
						local72 = Static202.method3411(Static68.anInt1509, arg5 + local26, Static43.anInt1054);
						local81 = Static202.method3411(Static68.anInt1509, arg5 - local26, Static43.anInt1054);
						if (local63 <= Static290.anInt6021) {
							Static133.method2321(local72, local81, Static274.anIntArrayArray50[local63], arg3);
						}
						if (Static127.anInt2664 <= local161) {
							Static133.method2321(local72, local81, Static274.anIntArrayArray50[local161], arg3);
						}
					}
				}
			}
			local161 = arg4 - local26;
			local63 = arg4 + local26;
			if (Static127.anInt2664 <= local63 && Static290.anInt6021 >= local161) {
				local72 = arg5 + local10;
				local81 = arg5 - local10;
				if (Static68.anInt1509 <= local72 && Static43.anInt1054 >= local81) {
					local72 = Static202.method3411(Static68.anInt1509, local72, Static43.anInt1054);
					local81 = Static202.method3411(Static68.anInt1509, local81, Static43.anInt1054);
					if (local26 < local14) {
						local89 = local26 > local28 ? Static261.anIntArray476[local26] : local28;
						local202 = Static202.method3411(Static68.anInt1509, arg5 + local89, Static43.anInt1054);
						local211 = Static202.method3411(Static68.anInt1509, arg5 - local89, Static43.anInt1054);
						if (local63 <= Static290.anInt6021) {
							local218 = Static274.anIntArrayArray50[local63];
							Static133.method2321(local211, local81, local218, arg3);
							Static133.method2321(local202, local211, local218, arg2);
							Static133.method2321(local72, local202, local218, arg3);
						}
						if (Static127.anInt2664 <= local161) {
							local218 = Static274.anIntArrayArray50[local161];
							Static133.method2321(local211, local81, local218, arg3);
							Static133.method2321(local202, local211, local218, arg2);
							Static133.method2321(local72, local202, local218, arg3);
						}
					} else {
						if (local63 <= Static290.anInt6021) {
							Static133.method2321(local72, local81, Static274.anIntArrayArray50[local63], arg3);
						}
						if (Static127.anInt2664 <= local161) {
							Static133.method2321(local72, local81, Static274.anIntArrayArray50[local161], arg3);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIII)V")
	public static void method1515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class58 local3 = new Class58();
		local3.anInt1641 = arg1 / 128;
		local3.anInt1645 = arg2 / 128;
		local3.anInt1624 = arg3 / 128;
		local3.anInt1640 = arg4 / 128;
		local3.anInt1629 = arg0;
		local3.anInt1639 = arg1;
		local3.anInt1635 = arg2;
		local3.anInt1626 = arg3;
		local3.anInt1637 = arg4;
		local3.anInt1642 = arg5;
		local3.anInt1633 = arg6;
		Static173.aClass58Array2[Static72.anInt1555++] = local3;
	}
}
