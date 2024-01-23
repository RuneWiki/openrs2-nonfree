import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!ec;")
	public static Class46 aClass46_35 = new Class46(50);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "I")
	public static int anInt5432 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZII)V")
	public static void method4341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg3 - arg1;
		if (local10 == 0) {
			if (local15 != 0) {
				Static71.method1328(arg1, arg3, arg2, arg4);
			}
		} else if (local15 == 0) {
			Static143.method2542(arg2, arg4, arg1, arg0);
		} else {
			@Pc(53) int local53 = (local15 << 12) / local10;
			@Pc(62) int local62 = arg1 - (local53 * arg2 >> 12);
			@Pc(70) int local70;
			@Pc(78) int local78;
			if (arg2 < Static68.anInt1509) {
				local70 = Static68.anInt1509;
				local78 = (Static68.anInt1509 * local53 >> 12) + local62;
			} else if (arg2 > Static43.anInt1054) {
				local70 = Static43.anInt1054;
				local78 = (local53 * Static43.anInt1054 >> 12) + local62;
			} else {
				local78 = arg1;
				local70 = arg2;
			}
			@Pc(101) int local101;
			@Pc(109) int local109;
			if (Static68.anInt1509 > arg0) {
				local101 = Static68.anInt1509;
				local109 = (local53 * Static68.anInt1509 >> 12) + local62;
			} else if (Static43.anInt1054 < arg0) {
				local101 = Static43.anInt1054;
				local109 = (local53 * Static43.anInt1054 >> 12) + local62;
			} else {
				local101 = arg0;
				local109 = arg3;
			}
			if (local109 < Static127.anInt2664) {
				local101 = (Static127.anInt2664 - local62 << 12) / local53;
				local109 = Static127.anInt2664;
			} else if (Static290.anInt6021 < local109) {
				local109 = Static290.anInt6021;
				local101 = (Static290.anInt6021 - local62 << 12) / local53;
			}
			if (local78 < Static127.anInt2664) {
				local78 = Static127.anInt2664;
				local70 = (Static127.anInt2664 - local62 << 12) / local53;
			} else if (local78 > Static290.anInt6021) {
				local78 = Static290.anInt6021;
				local70 = (Static290.anInt6021 - local62 << 12) / local53;
			}
			Static10.method248(local109, local78, local70, arg4, local101);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[[ILclient!uh;II[[F[[F[I[[FILclient!k;)V")
	public static void method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) float[][] arg8, @OriginalArg(10) Class90 arg9) {
		@Pc(11) int[] local11 = new int[arg7.length / 2];
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(27) int local27 = arg7[local13 + local13];
			@Pc(35) int local35 = arg7[local13 + local13 + 1];
			@Pc(47) int local47;
			if (arg3 == 1) {
				local47 = local27;
				local27 = local35;
				local35 = 128 - local47;
			} else if (arg3 == 2) {
				local35 = 128 - local35;
				local27 = 128 - local27;
			} else if (arg3 == 3) {
				local47 = local27;
				local27 = 128 - local35;
				local35 = local47;
			}
			@Pc(122) float local122;
			@Pc(114) float local114;
			@Pc(130) float local130;
			if (local27 == 0 && local35 == 0) {
				local122 = arg6[arg0][arg4];
				local130 = arg5[arg0][arg4];
				local114 = arg8[arg0][arg4];
			} else if (local27 == 128 && local35 == 0) {
				local130 = arg5[arg0 + 1][arg4];
				local122 = arg6[arg0 + 1][arg4];
				local114 = arg8[arg0 + 1][arg4];
			} else if (local27 == 128 && local35 == 128) {
				local114 = arg8[arg0 + 1][arg4 + 1];
				local122 = arg6[arg0 + 1][arg4 + 1];
				local130 = arg5[arg0 + 1][arg4 + 1];
			} else if (local27 == 0 && local35 == 128) {
				local114 = arg8[arg0][arg4 + 1];
				local122 = arg6[arg0][arg4 + 1];
				local130 = arg5[arg0][arg4 + 1];
			} else {
				local130 = arg5[arg0][arg4];
				local114 = arg8[arg0][arg4];
				local122 = arg6[arg0][arg4];
				@Pc(155) float local155 = (float) local27 / 128.0F;
				@Pc(163) float local163 = arg5[arg0][arg4 + 1];
				@Pc(178) float local178 = local122 + local155 * (arg6[arg0 + 1][arg4] - local122);
				@Pc(192) float local192 = local114 + local155 * (arg8[arg0 + 1][arg4] - local114);
				@Pc(197) float local197 = (float) local35 / 128.0F;
				@Pc(214) float local214 = local163 + local155 * (arg5[arg0 + 1][arg4 + 1] - local163);
				@Pc(222) float local222 = arg8[arg0][arg4 + 1];
				@Pc(237) float local237 = local130 + (arg5[arg0 + 1][arg4] - local130) * local155;
				@Pc(245) float local245 = arg6[arg0][arg4 + 1];
				@Pc(262) float local262 = local245 + local155 * (arg6[arg0 + 1][arg4 + 1] - local245);
				local130 = local237 + (local214 - local237) * local197;
				@Pc(287) float local287 = local222 + local155 * (arg8[arg0 + 1][arg4 + 1] - local222);
				local114 = local192 + (local287 - local192) * local197;
				local122 = local178 + local197 * (local262 - local178);
			}
			@Pc(388) int local388 = local27 + (arg0 << 7);
			@Pc(396) int local396 = Static17.method362(arg1, local27, arg0, local35, arg4);
			@Pc(402) int local402 = (arg4 << 7) + local35;
			local11[local13] = arg2.method4438(arg9, local388, local396, local402, local130, local122, local114);
		}
		arg2.method4436(local11);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public static void method4344() {
		Static277.anInt5762 = 0;
		Static216.anInt4481 = 0;
		Static21.anInt508 = -1;
		Static126.anInt2647 = -1;
		Static197.anInt4129 = 0;
		Static257.anInt5358 = -1;
		Static294.anInt6108 = 0;
		Static47.anInt1117 = -1;
		Static299.aBoolean203 = false;
		Static4.anInt151 = 0;
		Static95.aClass2_Sub26_Sub1_1.anInt5328 = 0;
		Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
		Static110.anInt2374 = 0;
		@Pc(39) int local39;
		for (local39 = 0; local39 < Static212.aClass36_Sub3_Sub2Array1.length; local39++) {
			if (Static212.aClass36_Sub3_Sub2Array1[local39] != null) {
				Static212.aClass36_Sub3_Sub2Array1[local39].anInt5061 = -1;
			}
		}
		for (local39 = 0; local39 < Static201.aClass36_Sub3_Sub1Array1.length; local39++) {
			if (Static201.aClass36_Sub3_Sub1Array1[local39] != null) {
				Static201.aClass36_Sub3_Sub1Array1[local39].anInt5061 = -1;
			}
		}
		Static145.method2561();
		Static101.anInt6027 = 1;
		Static21.method453(30);
		for (local39 = 0; local39 < 100; local39++) {
			Static165.aBooleanArray16[local39] = true;
		}
		Static181.method3133();
	}
}
