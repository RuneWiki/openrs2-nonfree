import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt5968;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_180 = new Class196(49, 3);

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public static int anInt5974 = 2;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method5089() {
		if (!Static479.aBoolean593) {
			Static479.aBoolean593 = true;
			Static147.aFloat198 += (12.0F - Static147.aFloat198) / 2.0F;
			Static550.aBoolean649 = true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!ha;Lclient!co;IIIIIIIIILclient!ka;)Lclient!ka;")
	public static Class114 method5091(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class114 arg12) {
		if (arg12 == null) {
			return null;
		}
		@Pc(9) int local9 = 2055;
		if (arg2 != null) {
			local9 = arg2.method1297(-1, arg11, false) | 0x807;
			local9 &= 0xFFFFFDFF;
		}
		@Pc(46) long local46 = ((long) arg5 << 32) + (long) ((arg9 << 16) + arg0 + (arg8 << 24)) + ((long) arg4 << 48);
		@Pc(48) Class265 local48 = Static540.aClass265_59;
		@Pc(58) Class114 local58;
		synchronized (Static540.aClass265_59) {
			local58 = (Class114) Static540.aClass265_59.method6577(local46);
		}
		if (local58 == null || arg1.method6226(local58.ua(), local9) != 0) {
			if (local58 != null) {
				local9 = arg1.method6204(local9, local58.ua());
			}
			@Pc(87) byte local87;
			if (arg0 == 1) {
				local87 = 9;
			} else if (arg0 == 2) {
				local87 = 12;
			} else if (arg0 == 3) {
				local87 = 15;
			} else if (arg0 == 4) {
				local87 = 18;
			} else {
				local87 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class156 local147 = new Class156(local87 * 3 + 1, 2 * 3 * local87 + -local87, 0);
			@Pc(154) int local154 = local147.method3285(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local87];
			@Pc(165) int local165;
			@Pc(169) int local169;
			@Pc(171) int local171;
			@Pc(194) int local194;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local165 = local129[local160];
				local169 = local129[local160];
				for (local171 = 0; local171 < local87; local171++) {
					@Pc(178) int local178 = (local171 << 14) / local87;
					@Pc(186) int local186 = local165 * Class242.anIntArray384[local178] >> 14;
					local194 = Class242.anIntArray383[local178] * local169 >> 14;
					local158[local160][local171] = local147.method3285(local194, local186, 0);
				}
			}
			for (local165 = 0; local165 < 3; local165++) {
				local169 = (local165 * 256 + 128) / 3;
				local171 = 256 - local169;
				@Pc(250) byte local250 = (byte) (arg8 * local169 + arg9 * local171 >> 8);
				@Pc(295) short local295 = (short) (((arg5 & 0xFC00) * local171 + (arg4 & 0xFC00) * local169 & 0xFC0000) + (local169 * (arg4 & 0x380) + local171 * (arg5 & 0x380) & 0x38000) + ((arg4 & 0x7F) * local169 + (arg5 & 0x7F) * local171 & 0x7F00) >> 8);
				for (local194 = 0; local194 < local87; local194++) {
					if (local165 == 0) {
						local147.method3283(local250, (short) -1, local154, (byte) -1, local158[0][(local194 + 1) % local87], local295, local158[0][local194], (byte) 1);
					} else {
						local147.method3283(local250, (short) -1, local158[local165 - 1][local194], (byte) -1, local158[local165 - 1][(local194 + 1) % local87], local295, local158[local165][(local194 + 1) % local87], (byte) 1);
						local147.method3283(local250, (short) -1, local158[local165 - 1][local194], (byte) -1, local158[local165][(local194 + 1) % local87], local295, local158[local165][local194], (byte) 1);
					}
				}
			}
			local58 = arg1.method6203(local147, local9, Static430.anInt8829, 64, 768);
			@Pc(416) Class265 local416 = Static540.aClass265_59;
			synchronized (Static540.aClass265_59) {
				Static540.aClass265_59.method6566(local58, local46);
			}
		}
		@Pc(434) int local434 = arg12.V();
		@Pc(437) int local437 = arg12.RA();
		@Pc(440) int local440 = arg12.HA();
		@Pc(443) int local443 = arg12.G();
		@Pc(445) Class5_Sub2_Sub20 local445 = null;
		if (arg2 != null) {
			@Pc(452) int local452 = arg2.anIntArray75[arg11];
			local445 = Static459.aClass128_2.method2690(local452 >> 16);
			arg11 = local452 & 0xFFFF;
		}
		if (local445 == null) {
			local58 = local58.method8810((byte) 3, local9, true);
			local58.O(local437 - local434 >> 1, 128, local443 - local440 >> 1);
			local58.H(local434 + local437 >> 1, 0, local440 + local443 >> 1);
		} else {
			local58 = local58.method8810((byte) 3, local9, true);
			local58.O(local437 - local434 >> 1, 128, local443 - local440 >> 1);
			local58.H(local434 + local437 >> 1, 0, local440 + local443 >> 1);
			local58.method8812(arg11, local445);
		}
		if (arg6 != 0) {
			local58.FA(arg6);
		}
		if (arg7 != 0) {
			local58.VA(arg7);
		}
		if (arg3 != 0) {
			local58.H(0, arg3, 0);
		}
		return local58;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZ[Lclient!wq;II)V")
	public static void method5092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class394[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg3.length; local1++) {
			@Pc(6) Class394 local6 = arg3[local1];
			if (local6 != null && arg4 == local6.anInt10530) {
				Static179.method2637(arg2, arg1, arg0, local6);
				Static583.method7975(local6, arg1, arg0);
				if (local6.anInt10512 - local6.anInt10536 < local6.anInt10506) {
					local6.anInt10506 = local6.anInt10512 - local6.anInt10536;
				}
				if (local6.anInt10448 > local6.anInt10470 - local6.anInt10532) {
					local6.anInt10448 = local6.anInt10470 - local6.anInt10532;
				}
				if (local6.anInt10506 < 0) {
					local6.anInt10506 = 0;
				}
				if (local6.anInt10448 < 0) {
					local6.anInt10448 = 0;
				}
				if (local6.anInt10479 == 0) {
					Static547.method7542(arg2, local6);
				}
			}
		}
	}
}
