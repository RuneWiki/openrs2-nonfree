import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "Z")
	public static boolean aBoolean224;

	@OriginalMember(owner = "client!gea", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!gea", name = "D", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_99 = new Class235(77, -2);

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
	public static int anInt2919 = 0;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!da;IILclient!rk;IIIIIIILclient!r;II)Lclient!da;")
	public static Class63 method2367(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class290 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class134 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method6261(false, -1, arg8) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = (long) ((arg7 << 24) + arg2 + (arg5 << 16)) + ((long) arg6 << 32) + ((long) arg4 << 48);
		@Pc(49) Class222 local49 = Static218.aClass222_26;
		@Pc(57) Class63 local57;
		synchronized (Static218.aClass222_26) {
			local57 = (Class63) Static218.aClass222_26.method4430(local47);
		}
		if (local57 == null || arg10.method6915(local57.PA(), local11) != 0) {
			if (local57 != null) {
				local11 = arg10.method6967(local11, local57.PA());
			}
			@Pc(94) byte local94;
			if (arg2 == 1) {
				local94 = 9;
			} else if (arg2 == 2) {
				local94 = 12;
			} else if (arg2 == 3) {
				local94 = 15;
			} else if (arg2 == 4) {
				local94 = 18;
			} else {
				local94 = 21;
			}
			@Pc(131) int[] local131 = new int[] { 64, 96, 128 };
			@Pc(148) Class210 local148 = new Class210(local94 * 3 + 1, 2 * 3 * local94 - local94, 0);
			@Pc(155) int local155 = local148.method4267(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local94];
			@Pc(167) int local167;
			@Pc(171) int local171;
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (@Pc(161) int local161 = 0; local161 < 3; local161++) {
				local167 = local131[local161];
				local171 = local131[local161];
				for (local173 = 0; local173 < local94; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local94;
					@Pc(189) int local189 = local167 * Class1_Sub6_Sub2.anIntArray675[local181] >> 14;
					local197 = local171 * Class1_Sub6_Sub2.anIntArray676[local181] >> 14;
					local159[local161][local173] = local148.method4267(local189, 0, local197);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(252) byte local252 = (byte) (arg7 * local171 + arg5 * local173 >> 8);
				@Pc(297) short local297 = (short) ((local173 * (arg6 & 0x380) + local171 * (arg4 & 0x380) & 0x38000) + (local171 * (arg4 & 0xFC00) + (arg6 & 0xFC00) * local173 & 0xFC0000) + ((arg6 & 0x7F) * local173 + (arg4 & 0x7F) * local171 & 0x7F00) >> 8);
				for (local197 = 0; local197 < local94; local197++) {
					if (local167 == 0) {
						local148.method4261((short) -1, local159[0][(local197 + 1) % local94], (byte) -1, local159[0][local197], local297, local252, local155, (byte) 1);
					} else {
						local148.method4261((short) -1, local159[local167 - 1][(local197 + 1) % local94], (byte) -1, local159[local167][(local197 + 1) % local94], local297, local252, local159[local167 - 1][local197], (byte) 1);
						local148.method4261((short) -1, local159[local167][(local197 + 1) % local94], (byte) -1, local159[local167][local197], local297, local252, local159[local167 - 1][local197], (byte) 1);
					}
				}
			}
			local57 = arg10.method6910(local148, local11, Static197.anInt6253, 64, 768);
			@Pc(416) Class222 local416 = Static218.aClass222_26;
			synchronized (Static218.aClass222_26) {
				Static218.aClass222_26.method4434(local57, local47);
			}
		}
		@Pc(432) int local432 = arg0.KA();
		@Pc(435) int local435 = arg0.l();
		@Pc(438) int local438 = arg0.OA();
		@Pc(441) int local441 = arg0.za();
		@Pc(443) Class1_Sub6_Sub1 local443 = null;
		if (arg3 != null) {
			@Pc(450) int local450 = arg3.anIntArray604[arg8];
			local443 = Static192.aClass211_1.method4272(local450 >> 16);
			arg8 = local450 & 0xFFFF;
		}
		if (local443 == null) {
			local57 = local57.method7417((byte) 3, local11, true);
			local57.R(local435 - local432 >> 1, 128, local441 - local438 >> 1);
			local57.oa(local432 + local435 >> 1, 0, local441 + local438 >> 1);
		} else {
			local57 = local57.method7417((byte) 3, local11, true);
			local57.R(local435 - local432 >> 1, 128, local441 - local438 >> 1);
			local57.oa(local435 + local432 >> 1, 0, local441 + local438 >> 1);
			local57.method7426(arg8, local443);
		}
		if (arg1 != 0) {
			local57.MA(arg1);
		}
		if (arg12 != 0) {
			local57.W(arg12);
		}
		if (arg11 != 0) {
			local57.oa(0, arg11, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIII)I")
	public static int method2369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(26) int local26 = 65536 - Class1_Sub6_Sub2.anIntArray676[arg0 * 8192 / arg1] >> 1;
		return (arg2 * (65536 - local26) >> 16) + (arg3 * local26 >> 16);
	}
}
