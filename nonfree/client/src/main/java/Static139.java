import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1166 = Static120.method1824("Please use a different world)3");

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1164 = aClass80_1166;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1169 = Static120.method1824("This world is full)3");

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1165 = aClass80_1169;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[8];

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1167 = Static120.method1824("cross");

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1168 = Static120.method1824(" GMT");

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1170 = Static120.method1824("null");

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1171 = aClass80_1166;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IB[Lclient!di;I[I)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class21[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(12) int local12 = arg3 - 1;
		@Pc(16) int local16 = arg0 + 1;
		@Pc(22) int local22 = (arg0 + arg3) / 2;
		@Pc(26) Class21 local26 = arg2[local22];
		arg2[local22] = arg2[arg3];
		arg2[arg3] = local26;
		while (local12 < local16) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(80) int local80;
			@Pc(62) int local62;
			do {
				local16--;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg4[local43] == 2) {
						local80 = arg2[local16].anInt829;
						local62 = local26.anInt829;
					} else if (arg4[local43] == 1) {
						local62 = local26.anInt831;
						if (local62 == -1 && arg1[local43] == 1) {
							local62 = 2001;
						}
						local80 = arg2[local16].anInt831;
						if (local80 == -1 && arg1[local43] == 1) {
							local80 = 2001;
						}
					} else if (arg4[local43] == 3) {
						local62 = local26.aBoolean39 ? 1 : 0;
						local80 = arg2[local16].aBoolean39 ? 1 : 0;
					} else {
						local80 = arg2[local16].anInt826;
						local62 = local26.anInt826;
					}
					if (local80 != local62) {
						if ((arg1[local43] != 1 || local62 >= local80) && (arg1[local43] != 0 || local62 <= local80)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local12++;
				for (local43 = 0; local43 < 4; local43++) {
					if (arg4[local43] == 2) {
						local62 = local26.anInt829;
						local80 = arg2[local12].anInt829;
					} else if (arg4[local43] == 1) {
						local80 = arg2[local12].anInt831;
						local62 = local26.anInt831;
						if (local80 == -1 && arg1[local43] == 1) {
							local80 = 2001;
						}
						if (local62 == -1 && arg1[local43] == 1) {
							local62 = 2001;
						}
					} else if (arg4[local43] == 3) {
						local62 = local26.aBoolean39 ? 1 : 0;
						local80 = arg2[local12].aBoolean39 ? 1 : 0;
					} else {
						local62 = local26.anInt826;
						local80 = arg2[local12].anInt826;
					}
					if (local62 != local80) {
						if ((arg1[local43] != 1 || local62 <= local80) && (arg1[local43] != 0 || local62 >= local80)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local12 < local16) {
				@Pc(338) Class21 local338 = arg2[local12];
				arg2[local12] = arg2[local16];
				arg2[local16] = local338;
			}
		}
		method2159(local16, arg1, arg2, arg3, arg4);
		method2159(arg0, arg1, arg2, local16 + 1, arg4);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!oh;)V")
	public static void method2160(@OriginalArg(1) Class3_Sub1_Sub5_Sub4 arg0) {
		if (arg0.anInt4282 == Static193.anInt4411 || arg0.anInt4323 == -1 || arg0.anInt4286 != 0 || arg0.anInt4305 + 1 > Static148.method2368(arg0.anInt4323).anIntArray440[arg0.anInt4275]) {
			@Pc(31) int local31 = arg0.anInt4282 - arg0.anInt4325;
			@Pc(41) int local41 = arg0.anInt4277 * 64 + arg0.anInt4319 * 128;
			@Pc(47) int local47 = Static193.anInt4411 - arg0.anInt4325;
			@Pc(57) int local57 = arg0.anInt4277 * 64 + arg0.anInt4316 * 128;
			@Pc(67) int local67 = arg0.anInt4294 * 128 + arg0.anInt4277 * 64;
			@Pc(77) int local77 = arg0.anInt4277 * 64 + arg0.anInt4284 * 128;
			arg0.anInt4329 = (local41 * (local31 - local47) + local67 * local47) / local31;
			arg0.anInt4315 = (local47 * local77 + local57 * (local31 - local47)) / local31;
		}
		arg0.anInt4293 = 0;
		if (arg0.anInt4274 == 0) {
			arg0.anInt4309 = 1024;
		}
		if (arg0.anInt4274 == 1) {
			arg0.anInt4309 = 1536;
		}
		if (arg0.anInt4274 == 2) {
			arg0.anInt4309 = 0;
		}
		if (arg0.anInt4274 == 3) {
			arg0.anInt4309 = 512;
		}
		arg0.anInt4301 = arg0.anInt4309;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(JB)V")
	public static void method2161(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static146.aClass3_Sub17_Sub1_3.method2146(71);
			Static146.aClass3_Sub17_Sub1_3.method2112(arg0);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)I")
	public static int method2162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg0; local9 < arg1; local9++) {
			local7 = Class3_Sub1_Sub14.anIntArray360[(arg2[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
