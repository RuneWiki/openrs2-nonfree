import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ge", name = "lc", descriptor = "Lclient!bc;")
	public static Class25 aClass25_3;

	@OriginalMember(owner = "client!ge", name = "vb", descriptor = "[I")
	public static final int[] anIntArray248 = new int[3];

	@OriginalMember(owner = "client!ge", name = "Zb", descriptor = "[I")
	public static final int[] anIntArray253 = new int[2];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ep;I)Lclient!ep;")
	public static Class93 method3346(@OriginalArg(0) Class93 arg0) {
		@Pc(14) Class93 local14 = Static69.method1449(arg0);
		if (local14 == null) {
			local14 = arg0.aClass93_8;
		}
		return local14;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Lclient!kv;")
	public static Class11_Sub4 method3351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_2;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method3354() {
		Static193.aBoolean341 = false;
		Static179.anInt3992 = 0;
		Static478.anInt8743 = 2;
		Static463.anInt8569 = 1;
		Static538.anInt9265 = -1;
		Static329.aClass168_79 = null;
		Static350.anInt5888 = -1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIBIII)I")
	public static int method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static47.aClass62Array1 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(25) int local25 = arg4 >> 9;
			@Pc(29) int local29 = arg3 >> 9;
			if (arg1 < 0 || arg2 < 0 || Static228.anInt4746 - 1 < arg1 || arg2 > Static44.anInt1275 - 1) {
				return 0;
			} else if (local25 >= 1 && local29 >= 1 && local25 <= Static228.anInt4746 - 1 && local29 <= Static44.anInt1275 - 1) {
				@Pc(99) boolean local99 = (Static356.aByteArrayArrayArray17[1][arg4 >> 9][arg3 >> 9] & 0x2) != 0;
				@Pc(121) boolean local121;
				@Pc(137) boolean local137;
				if ((arg4 & 0x1FF) == 0) {
					local121 = (Static356.aByteArrayArrayArray17[1][local25 - 1][arg3 >> 9] & 0x2) != 0;
					local137 = (Static356.aByteArrayArrayArray17[1][local25][arg3 >> 9] & 0x2) != 0;
					if (local137 != local121) {
						local99 = (Static356.aByteArrayArrayArray17[1][arg1][arg2] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x1FF) == 0) {
					local121 = (Static356.aByteArrayArrayArray17[1][arg4 >> 9][local29 - 1] & 0x2) != 0;
					local137 = (Static356.aByteArrayArrayArray17[1][arg4 >> 9][local29] & 0x2) != 0;
					if (local121 != local137) {
						local99 = (Static356.aByteArrayArrayArray17[1][arg1][arg2] & 0x2) != 0;
					}
				}
				if (local99) {
					arg0++;
				}
				return Static47.aClass62Array1[arg0].sa(arg4, arg3);
			} else {
				return 0;
			}
		} else {
			return Static47.aClass62Array1[arg0].sa(arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZI)V")
	public static void method3363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg0 - arg2;
		if (local15 == 0) {
			if (local10 != 0) {
				Static518.method7590(arg4, arg3, arg2, arg1);
			}
		} else if (local10 == 0) {
			Static228.method4071(arg3, arg2, arg1, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(56) boolean local56 = local15 < local10;
			@Pc(60) int local60;
			@Pc(62) int local62;
			if (local56) {
				local60 = arg2;
				local62 = arg0;
				arg2 = arg1;
				arg1 = local60;
				arg0 = arg4;
				arg4 = local62;
			}
			if (arg0 < arg2) {
				local60 = arg2;
				local62 = arg1;
				arg2 = arg0;
				arg0 = local60;
				arg1 = arg4;
				arg4 = local62;
			}
			local60 = arg1;
			local62 = arg0 - arg2;
			@Pc(95) int local95 = arg4 - arg1;
			@Pc(105) int local105 = -(local62 >> 1);
			@Pc(112) int local112 = arg4 <= arg1 ? -1 : 1;
			if (local95 < 0) {
				local95 = -local95;
			}
			@Pc(121) int local121;
			if (local56) {
				for (local121 = arg2; local121 <= arg0; local121++) {
					Static183.anIntArrayArray26[local121][local60] = arg3;
					local105 += local95;
					if (local105 > 0) {
						local105 -= local62;
						local60 += local112;
					}
				}
			} else {
				for (local121 = arg2; local121 <= arg0; local121++) {
					local105 += local95;
					Static183.anIntArrayArray26[local60][local121] = arg3;
					if (local105 > 0) {
						local60 += local112;
						local105 -= local62;
					}
				}
			}
		}
	}
}
