import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!qs", name = "y", descriptor = "Lclient!iba;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!qs", name = "A", descriptor = "I")
	public static int anInt6964;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!h;")
	public static final Class114 aClass114_136 = new Class114("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_95 = new Class186(32, -1);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILclient!r;ILclient!tt;IIIIIIILclient!qa;IZI)Lclient!r;")
	public static Class19 method5998(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class280 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class9 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == null) {
			return null;
		}
		@Pc(9) int local9 = 2055;
		if (arg3 != null) {
			local9 = arg3.method6876(-1, arg0, false) | 0x807;
			local9 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg12 << 32) + ((long) ((arg5 << 16) + arg10 + (arg4 << 24)) + ((long) arg8 << 48));
		@Pc(54) Class316 local54 = Static538.aClass316_64;
		@Pc(62) Class19 local62;
		synchronized (Static538.aClass316_64) {
			local62 = (Class19) Static538.aClass316_64.method7799(local47);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(165) int local165;
		@Pc(169) int local169;
		if (local62 == null || arg11.method7607(local62.ba(), local9) != 0) {
			if (local62 != null) {
				local9 = arg11.method7606(local9, local62.ba());
			}
			@Pc(89) byte local89;
			if (arg10 == 1) {
				local89 = 9;
			} else if (arg10 == 2) {
				local89 = 12;
			} else if (arg10 == 3) {
				local89 = 15;
			} else if (arg10 == 4) {
				local89 = 18;
			} else {
				local89 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class86 local147 = new Class86(local89 * 3 + 1, local89 * 2 * 3 - local89, 0);
			local154 = local147.method2805(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local89];
			@Pc(171) int local171;
			@Pc(194) int local194;
			for (local160 = 0; local160 < 3; local160++) {
				local165 = local129[local160];
				local169 = local129[local160];
				for (local171 = 0; local171 < local89; local171++) {
					@Pc(178) int local178 = (local171 << 14) / local89;
					@Pc(186) int local186 = Class307.anIntArray744[local178] * local165 >> 15;
					local194 = local169 * Class307.anIntArray743[local178] >> 15;
					local158[local160][local171] = local147.method2805(local194, local186, 0);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(248) byte local248 = (byte) (local169 * arg4 + arg5 * local171 >> 8);
				@Pc(293) short local293 = (short) (((arg12 & 0x380) * local171 + local169 * (arg8 & 0x380) & 0x38000) + (local169 * (arg8 & 0xFC00) + local171 * (arg12 & 0xFC00) & 0xFC0000) + ((arg8 & 0x7F) * local169 + (arg12 & 0x7F) * local171 & 0x7F00) >> 8);
				for (local194 = 0; local194 < local89; local194++) {
					if (local165 == 0) {
						local147.method2806(local158[0][local194], (short) -1, local293, (byte) 1, (byte) -1, local154, local248, local158[0][(local194 + 1) % local89]);
					} else {
						local147.method2806(local158[local165][(local194 + 1) % local89], (short) -1, local293, (byte) 1, (byte) -1, local158[local165 - 1][local194], local248, local158[local165 - 1][(local194 + 1) % local89]);
						local147.method2806(local158[local165][local194], (short) -1, local293, (byte) 1, (byte) -1, local158[local165 - 1][local194], local248, local158[local165][(local194 + 1) % local89]);
					}
				}
			}
			local62 = arg11.method7635(local147, local9, Static340.anInt6354, 64, 768);
			@Pc(415) Class316 local415 = Static538.aClass316_64;
			synchronized (Static538.aClass316_64) {
				Static538.aClass316_64.method7792(local47, local62);
			}
		}
		@Pc(434) int local434 = (arg10 << 6) - 1;
		@Pc(437) int local437 = -local434;
		@Pc(440) int local440 = -local434;
		@Pc(442) int local442 = local434;
		local154 = local434;
		if (arg2 != 0) {
			if ((arg2 & 0x1) != 0) {
				local154 = local434 + 128;
			}
			if ((arg2 & 0x2) != 0) {
				local440 -= 128;
			}
			if ((arg2 & 0x4) != 0) {
				local442 = local434 + 128;
			}
			if ((arg2 & 0x8) != 0) {
				local437 -= 128;
			}
		}
		@Pc(475) int local475 = arg1.wa();
		local160 = arg1.va();
		local165 = arg1.Q();
		if (local160 > local442) {
			local160 = local442;
		}
		local169 = arg1.U();
		if (local165 < local440) {
			local165 = local440;
		}
		if (local475 < local437) {
			local475 = local437;
		}
		if (local169 > local154) {
			local169 = local154;
		}
		@Pc(518) Class1_Sub1_Sub8 local518 = null;
		if (arg3 != null) {
			@Pc(525) int local525 = arg3.anIntArray629[arg0];
			local518 = Static6.aClass126_1.method3573(local525 >> 16);
			arg0 = local525 & 0xFFFF;
		}
		if (local518 == null) {
			local62 = local62.method7260((byte) 3, local9, true);
			local62.V(local160 - local475 >> 1, 128, local169 - local165 >> 1);
			local62.ca(local475 + local160 >> 1, 0, local169 + local165 >> 1);
		} else {
			local62 = local62.method7260((byte) 3, local9, true);
			local62.V(local160 - local475 >> 1, 128, local169 - local165 >> 1);
			local62.ca(local475 + local160 >> 1, 0, local169 + local165 >> 1);
			local62.method7255(local518, arg0);
		}
		if (arg13 != 0) {
			local62.D(arg13);
		}
		if (arg6 != 0) {
			local62.b(arg6);
		}
		if (arg9 != 0) {
			local62.ca(0, arg9, 0);
		}
		return local62;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!gw;B)Ljava/lang/String;")
	public static String method5999(@OriginalArg(0) Class1_Sub13 arg0) {
		return Static181.method3469(arg0);
	}
}
