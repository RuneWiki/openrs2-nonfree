import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
	public static int anInt4675;

	@OriginalMember(owner = "client!of", name = "vb", descriptor = "Lclient!am;")
	public static Class11 aClass11_88;

	@OriginalMember(owner = "client!of", name = "wb", descriptor = "I")
	public static int anInt4687;

	@OriginalMember(owner = "client!of", name = "V", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_72 = new Class154(64);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!lb;IIIIIIILclient!vm;IILclient!jn;IIZ)Lclient!jn;")
	public static Class5 method3840(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class92 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class5 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg11 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg0 != null) {
			local11 = arg0.method3177(arg3, -1, false) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg7 << 48) + (long) ((arg1 << 24) + (arg6 << 16) + arg9) + ((long) arg2 << 32);
		@Pc(50) Class154 local50 = Static36.aClass154_8;
		@Pc(58) Class5 local58;
		synchronized (Static36.aClass154_8) {
			local58 = (Class5) Static36.aClass154_8.method4222(local48);
		}
		@Pc(148) int local148;
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(164) int local164;
		if (local58 == null || arg8.method4501(local58.method3992(), local11) != 0) {
			if (local58 != null) {
				local11 = arg8.method4477(local11, local58.method3992());
			}
			@Pc(91) byte local91;
			if (arg9 == 1) {
				local91 = 9;
			} else if (arg9 == 2) {
				local91 = 12;
			} else if (arg9 == 3) {
				local91 = 15;
			} else if (arg9 == 4) {
				local91 = 18;
			} else {
				local91 = 21;
			}
			@Pc(123) int[] local123 = new int[] { 64, 96, 128 };
			@Pc(141) Class153 local141 = new Class153(local91 * 3 + 1, local91 * 2 * 3 - local91, 0);
			local148 = local141.method4174(0, 0, 0);
			@Pc(152) int[][] local152 = new int[3][local91];
			@Pc(166) int local166;
			@Pc(190) int local190;
			for (local154 = 0; local154 < 3; local154++) {
				local160 = local123[local154];
				local164 = local123[local154];
				for (local166 = 0; local166 < local91; local166++) {
					@Pc(174) int local174 = (local166 << 14) / local91;
					@Pc(182) int local182 = local160 * Class4_Sub4_Sub25.anIntArray384[local174] >> 15;
					local190 = Class4_Sub4_Sub25.anIntArray383[local174] * local164 >> 15;
					local152[local154][local166] = local141.method4174(0, local190, local182);
				}
			}
			for (local160 = 0; local160 < 3; local160++) {
				local164 = (local160 * 256 + 128) / 3;
				local166 = 256 - local164;
				@Pc(236) byte local236 = (byte) (local164 * arg1 + local166 * arg6 >> 8);
				@Pc(281) short local281 = (short) ((local164 * (arg7 & 0xFC00) + local166 * (arg2 & 0xFC00) & 0xFC0000) + ((arg2 & 0x380) * local166 + local164 * (arg7 & 0x380) & 0x38000) + (local166 * (arg2 & 0x7F) + (arg7 & 0x7F) * local164 & 0x7F00) >> 8);
				for (local190 = 0; local190 < local91; local190++) {
					if (local160 == 0) {
						local141.method4176((short) -1, (byte) -1, local281, (byte) 1, local236, local152[0][(local190 + 1) % local91], local152[0][local190], local148);
					} else {
						local141.method4176((short) -1, (byte) -1, local281, (byte) 1, local236, local152[local160 - 1][(local190 + 1) % local91], local152[local160][(local190 + 1) % local91], local152[local160 - 1][local190]);
						local141.method4176((short) -1, (byte) -1, local281, (byte) 1, local236, local152[local160][(local190 + 1) % local91], local152[local160][local190], local152[local160 - 1][local190]);
					}
				}
			}
			local58 = arg8.method4513(local141, local11, Static94.anInt2087, 64, 768);
			@Pc(400) Class154 local400 = Static36.aClass154_8;
			synchronized (Static36.aClass154_8) {
				Static36.aClass154_8.method4221(local48, local58);
			}
		}
		@Pc(419) int local419 = arg9 * 64 - 1;
		@Pc(422) int local422 = -local419;
		@Pc(425) int local425 = -local419;
		@Pc(427) int local427 = local419;
		local148 = local419;
		if (arg13) {
			if (arg10 > 9216 && arg10 < 15360) {
				local427 = local419 + 128;
			}
			if (arg10 > 13312 || arg10 < 3072) {
				local425 -= 128;
			}
			if (arg10 > 5120 && arg10 < 11264) {
				local148 = local419 + 128;
			}
			if (arg10 > 1024 && arg10 < 7168) {
				local422 -= 128;
			}
		}
		@Pc(470) int local470 = arg11.method4010();
		local154 = arg11.method4025();
		local160 = arg11.method3980();
		if (local425 > local160) {
			local160 = local425;
		}
		local164 = arg11.method3990();
		if (local154 > local427) {
			local154 = local427;
		}
		if (local470 < local422) {
			local470 = local422;
		}
		if (local164 > local148) {
			local164 = local148;
		}
		@Pc(510) Class4_Sub1_Sub16 local510 = null;
		if (arg0 != null) {
			@Pc(517) int local517 = arg0.anIntArray330[arg3];
			local510 = Static194.method3524(local517 >> 16);
			arg3 = local517 & 0xFFFF;
		}
		if (local510 == null) {
			local58 = local58.method4018((byte) 3, local11, true);
			local58.method4015((local154 - local470) / 2, 128, (local164 - local160) / 2);
			local58.method4026((local154 + local470) / 2, 0, (local164 + local160) / 2);
		} else {
			local58 = local58.method4018((byte) 3, local11, true);
			local58.method4015((local154 - local470) / 2, 128, (local164 - local160) / 2);
			local58.method4026((local154 + local470) / 2, 0, (local160 + local164) / 2);
			local58.method4000(arg3, local510);
		}
		if (arg12 != 0) {
			local58.method4003(arg12);
		}
		if (arg5 != 0) {
			local58.method3987(arg5);
		}
		if (arg4 != 0) {
			local58.method4026(0, arg4, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILclient!aa;Lclient!aa;)V")
	public static void method3844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1 arg3, @OriginalArg(4) Class2_Sub1 arg4) {
		if (Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static333.method78(arg0, arg1, arg2);
		}
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub1_1 = arg3;
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub1_2 = arg4;
	}
}
