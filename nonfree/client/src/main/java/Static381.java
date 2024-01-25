import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt6279;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_4 = new Class257("LIVE", 0);

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[200];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[BII)V")
	public static void method5248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		arg1 += arg0;
		@Pc(19) int local19 = arg3 - arg0 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg3 - arg0 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg1 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!oa;ZBILclient!oa;)I")
	public static int method5250(@OriginalArg(0) Class184_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class184_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg3.anInt4767;
			local14 = arg0.anInt4767;
			if (!arg1) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static342.method4814(arg0.method4236().aString45, Static382.anInt6289, arg3.method4236().aString45);
		} else if (arg2 == 3) {
			if (arg3.aString41.equals("-")) {
				if (arg0.aString41.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString41.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static342.method4814(arg0.aString41, Static382.anInt6289, arg3.aString41);
			}
		} else if (arg2 == 4) {
			if (arg3.method4233()) {
				return arg0.method4233() ? 0 : 1;
			} else if (arg0.method4233()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg3.method4232()) {
				return arg0.method4232() ? 0 : 1;
			} else if (arg0.method4232()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg3.method4231()) {
				return arg0.method4231() ? 0 : 1;
			} else if (arg0.method4231()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg3.method4228()) {
				return arg0.method4228() ? 0 : 1;
			} else if (arg0.method4228()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg3.anInt4777;
			local14 = arg0.anInt4777;
			if (arg1) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt4776 - arg0.anInt4776;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I")
	public static int method5251() {
		return 6;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class3_Sub4 local13 = local7.aClass3_Sub4_3;
		@Pc(16) Class3_Sub4 local16 = local7.aClass3_Sub4_2;
		if (local13 != null) {
			local13.anInt4922 = local13.anInt4922 * arg3 / (0x10 << Static301.anInt2759 - 7);
			local13.anInt4920 = local13.anInt4920 * arg3 / (0x10 << Static301.anInt2759 - 7);
		}
		if (local16 != null) {
			local16.anInt4922 = local16.anInt4922 * arg3 / (0x10 << Static301.anInt2759 - 7);
			local16.anInt4920 = local16.anInt4920 * arg3 / (0x10 << Static301.anInt2759 - 7);
		}
	}
}
