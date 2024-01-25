import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_197 = new Class362(20, 19);

	@OriginalMember(owner = "client!se", name = "x", descriptor = "D")
	public static double aDouble8 = -1.0D;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIBLclient!r;IILclient!wt;ILclient!da;II)Lclient!da;")
	public static Class57 method7129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class365 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class57 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg10 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg8 != null) {
			local11 = arg8.method8358(false, arg0, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(48) long local48 = ((long) arg3 << 48) + ((long) ((arg12 << 24) + (arg7 << 16) + arg9) + ((long) arg4 << 32));
		@Pc(50) Class223 local50 = Static9.aClass223_2;
		@Pc(58) Class57 local58;
		synchronized (Static9.aClass223_2) {
			local58 = (Class57) Static9.aClass223_2.method5388(local48);
		}
		if (local58 == null || arg5.method5010(local58.PA(), local11) != 0) {
			if (local58 != null) {
				local11 = arg5.method5023(local11, local58.PA());
			}
			@Pc(98) byte local98;
			if (arg9 == 1) {
				local98 = 9;
			} else if (arg9 == 2) {
				local98 = 12;
			} else if (arg9 == 3) {
				local98 = 15;
			} else if (arg9 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(127) int[] local127 = new int[] { 64, 96, 128 };
			@Pc(145) Class191 local145 = new Class191(local98 * 3 + 1, -local98 + local98 * 3 * 2, 0);
			@Pc(152) int local152 = local145.method4755(0, 0, 0);
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
					@Pc(186) int local186 = Class4_Sub27.anIntArray296[local178] * local164 >> 14;
					local194 = Class4_Sub27.anIntArray297[local178] * local168 >> 14;
					local156[local158][local170] = local145.method4755(local186, 0, local194);
				}
			}
			for (local164 = 0; local164 < 3; local164++) {
				local168 = (local164 * 256 + 128) / 3;
				local170 = 256 - local168;
				@Pc(249) byte local249 = (byte) (local168 * arg12 + arg7 * local170 >> 8);
				@Pc(294) short local294 = (short) ((local170 * (arg4 & 0x7F) + local168 * (arg3 & 0x7F) & 0x7F00) + (local168 * (arg3 & 0xFC00) + local170 * (arg4 & 0xFC00) & 0xFC0000) + ((arg3 & 0x380) * local168 + (arg4 & 0x380) * local170 & 0x38000) >> 8);
				for (local194 = 0; local194 < local98; local194++) {
					if (local164 == 0) {
						local145.method4760(local156[0][(local194 + 1) % local98], local294, (short) -1, local156[0][local194], (byte) -1, local152, local249, (byte) 1);
					} else {
						local145.method4760(local156[local164 - 1][(local194 + 1) % local98], local294, (short) -1, local156[local164][(local194 + 1) % local98], (byte) -1, local156[local164 - 1][local194], local249, (byte) 1);
						local145.method4760(local156[local164][(local194 + 1) % local98], local294, (short) -1, local156[local164][local194], (byte) -1, local156[local164 - 1][local194], local249, (byte) 1);
					}
				}
			}
			local58 = arg5.method5016(local145, local11, Static323.anInt6283, 64, 768);
			@Pc(421) Class223 local421 = Static9.aClass223_2;
			synchronized (Static9.aClass223_2) {
				Static9.aClass223_2.method5394(local58, local48);
			}
		}
		@Pc(442) int local442 = arg10.KA();
		@Pc(445) int local445 = arg10.l();
		@Pc(448) int local448 = arg10.OA();
		@Pc(451) int local451 = arg10.za();
		@Pc(453) Class4_Sub5_Sub2 local453 = null;
		if (arg8 != null) {
			@Pc(460) int local460 = arg8.anIntArray551[arg0];
			local453 = Static61.aClass48_1.method1013(local460 >> 16);
			arg0 = local460 & 0xFFFF;
		}
		if (local453 == null) {
			local58 = local58.method7912((byte) 3, local11, true);
			local58.R(local445 - local442 >> 1, 128, local451 - local448 >> 1);
			local58.oa(local442 + local445 >> 1, 0, local451 + local448 >> 1);
		} else {
			local58 = local58.method7912((byte) 3, local11, true);
			local58.R(local445 - local442 >> 1, 128, local451 - local448 >> 1);
			local58.oa(local442 + local445 >> 1, 0, local451 + local448 >> 1);
			local58.method7916(arg0, local453);
		}
		if (arg11 != 0) {
			local58.MA(arg11);
		}
		if (arg2 != 0) {
			local58.W(arg2);
		}
		if (arg1 != 0) {
			local58.oa(0, arg1, 0);
		}
		return local58;
	}
}
