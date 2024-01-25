import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_19 = new Class286(53, -1);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!da;IIIILclient!r;IIIZILclient!dr;)Lclient!da;")
	public static Class66 method964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class100 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class84 arg12) {
		if (arg2 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method1508(-1, false, arg11) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = (long) ((arg0 << 24) + (arg3 << 16) + arg5) + ((long) arg8 << 32) + ((long) arg4 << 48);
		@Pc(50) Class313 local50 = Static210.aClass313_25;
		@Pc(58) Class66 local58;
		synchronized (Static210.aClass313_25) {
			local58 = (Class66) Static210.aClass313_25.method6989(local48);
		}
		if (local58 == null || arg7.method6216(local58.PA(), local11) != 0) {
			if (local58 != null) {
				local11 = arg7.method6215(local11, local58.PA());
			}
			@Pc(98) byte local98;
			if (arg5 == 1) {
				local98 = 9;
			} else if (arg5 == 2) {
				local98 = 12;
			} else if (arg5 == 3) {
				local98 = 15;
			} else if (arg5 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class93 local145 = new Class93(local98 * 3 + 1, -local98 + 2 * 3 * local98, 0);
			@Pc(152) int local152 = local145.method1753(0, 0, 0);
			@Pc(156) int[][] local156 = new int[3][local98];
			@Pc(164) int local164;
			@Pc(168) int local168;
			@Pc(170) int local170;
			@Pc(194) int local194;
			for (@Pc(158) int local158 = 0; local158 < 3; local158++) {
				local164 = local127[local158];
				local168 = local127[local158];
				for (local170 = 0; local170 < local98; local170++) {
					@Pc(178) int local178 = (local170 << 14) / local98;
					@Pc(186) int local186 = Class363.anIntArray697[local178] * local164 >> 14;
					local194 = Class363.anIntArray698[local178] * local168 >> 14;
					local156[local158][local170] = local145.method1753(local186, local194, 0);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(245) byte local245 = (byte) (arg0 * local168 + local170 * arg3 >> 8);
				@Pc(290) short local290 = (short) (((arg8 & 0x7F) * local170 + (arg4 & 0x7F) * local168 & 0x7F00) + ((arg8 & 0x380) * local170 + (arg4 & 0x380) * local168 & 0x38000) + (local170 * (arg8 & 0xFC00) + (arg4 & 0xFC00) * local168 & 0xFC0000) >> 8);
				for (local194 = 0; local194 < local98; local194++) {
					if (local164 == 0) {
						local145.method1759(local156[0][local194], local290, (byte) -1, local245, local156[0][(local194 + 1) % local98], (short) -1, local152, (byte) 1);
					} else {
						local145.method1759(local156[local164][(local194 + 1) % local98], local290, (byte) -1, local245, local156[local164 - 1][(local194 + 1) % local98], (short) -1, local156[local164 - 1][local194], (byte) 1);
						local145.method1759(local156[local164][local194], local290, (byte) -1, local245, local156[local164][(local194 + 1) % local98], (short) -1, local156[local164 - 1][local194], (byte) 1);
					}
				}
			}
			local58 = arg7.method6191(local145, local11, Static388.anInt6824, 64, 768);
			@Pc(413) Class313 local413 = Static210.aClass313_25;
			synchronized (Static210.aClass313_25) {
				Static210.aClass313_25.method6980(local48, local58);
			}
		}
		@Pc(429) int local429 = arg2.KA();
		@Pc(432) int local432 = arg2.l();
		@Pc(435) int local435 = arg2.OA();
		@Pc(438) int local438 = arg2.za();
		@Pc(440) Class2_Sub3_Sub19 local440 = null;
		if (arg12 != null) {
			@Pc(447) int local447 = arg12.anIntArray108[arg11];
			local440 = Static116.aClass140_2.method3286(local447 >> 16);
			arg11 = local447 & 0xFFFF;
		}
		if (local440 == null) {
			local58 = local58.method7551((byte) 3, local11, true);
			local58.R(local432 - local429 >> 1, 128, local438 - local435 >> 1);
			local58.oa(local429 + local432 >> 1, 0, local435 + local438 >> 1);
		} else {
			local58 = local58.method7551((byte) 3, local11, true);
			local58.R(local432 - local429 >> 1, 128, local438 - local435 >> 1);
			local58.oa(local432 + local429 >> 1, 0, local438 + local435 >> 1);
			local58.method7544(local440, arg11);
		}
		if (arg9 != 0) {
			local58.MA(arg9);
		}
		if (arg6 != 0) {
			local58.W(arg6);
		}
		if (arg10 != 0) {
			local58.oa(0, arg10, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[I[Ljava/lang/Object;II)V")
	public static void method967(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg0];
		arg1[arg0] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg3; local53 < arg0; local53++) {
			if (arg1[local53] < local20 + (local51 & local53)) {
				@Pc(68) int local68 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local68;
				@Pc(82) Object local82 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16++] = local82;
			}
		}
		arg1[arg0] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method967(local16 - 1, arg1, arg2, arg3);
		method967(arg0, arg1, arg2, local16 + 1);
	}
}
