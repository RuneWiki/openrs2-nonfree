import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "[I")
	public static final int[] anIntArray442 = new int[16];

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!rb;")
	public static final Class283 aClass283_5 = new Class283();

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIILclient!ka;BLclient!ha;IIIILclient!fba;III)Lclient!ka;")
	public static Class83 method6806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class97 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg9 != null) {
			local11 = arg9.method2971(false, arg5, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(57) long local57 = ((long) arg1 << 48) + ((long) arg12 << 32) + (long) (arg2 - -(arg11 << 16) - -(arg6 << 24));
		@Pc(59) Class236 local59 = Static505.aClass236_85;
		@Pc(67) Class83 local67;
		synchronized (Static505.aClass236_85) {
			local67 = (Class83) Static505.aClass236_85.method6242(local57);
		}
		if (local67 == null || arg4.method6121(local67.ua(), local11) != 0) {
			if (local67 != null) {
				local11 = arg4.method6109(local11, local67.ua());
			}
			@Pc(97) byte local97;
			if (arg2 == 1) {
				local97 = 9;
			} else if (arg2 == 2) {
				local97 = 12;
			} else if (arg2 == 3) {
				local97 = 15;
			} else if (arg2 == 4) {
				local97 = 18;
			} else {
				local97 = 21;
			}
			@Pc(135) int[] local135 = new int[] { 64, 96, 128 };
			@Pc(153) Class344 local153 = new Class344(local97 * 3 + 1, -local97 + local97 * 6, 0);
			@Pc(160) int local160 = local153.method8056(0, 0, 0);
			@Pc(164) int[][] local164 = new int[3][local97];
			@Pc(172) int local172;
			@Pc(176) int local176;
			@Pc(178) int local178;
			@Pc(202) int local202;
			for (@Pc(166) int local166 = 0; local166 < 3; local166++) {
				local172 = local135[local166];
				local176 = local135[local166];
				for (local178 = 0; local178 < local97; local178++) {
					@Pc(186) int local186 = (local178 << 14) / local97;
					@Pc(194) int local194 = Class344.anIntArray579[local186] * local172 >> 14;
					local202 = Class344.anIntArray578[local186] * local176 >> 14;
					local164[local166][local178] = local153.method8056(local194, 0, local202);
				}
			}
			for (local172 = 0; local172 < 3; local172++) {
				local176 = (local172 * 256 + 128) / 3;
				local178 = 256 - local176;
				@Pc(253) byte local253 = (byte) (arg11 * local178 + arg6 * local176 >> 8);
				@Pc(298) short local298 = (short) ((local178 * (arg12 & 0x7F) + local176 * (arg1 & 0x7F) & 0x7F00) + ((arg1 & 0x380) * local176 + local178 * (arg12 & 0x380) & 0x38000) + (local178 * (arg12 & 0xFC00) + (arg1 & 0xFC00) * local176 & 0xFC0000) >> 8);
				for (local202 = 0; local202 < local97; local202++) {
					if (local172 == 0) {
						local153.method8054(local164[0][local202], local160, (byte) -1, (short) -1, local164[0][(local202 + 1) % local97], local298, (byte) 1, local253);
					} else {
						local153.method8054(local164[local172][(local202 + 1) % local97], local164[local172 - 1][local202], (byte) -1, (short) -1, local164[local172 - 1][(local202 + 1) % local97], local298, (byte) 1, local253);
						local153.method8054(local164[local172][local202], local164[local172 - 1][local202], (byte) -1, (short) -1, local164[local172][(local202 + 1) % local97], local298, (byte) 1, local253);
					}
				}
			}
			local67 = arg4.method6094(local153, local11, Static535.anInt9213, 64, 768);
			@Pc(418) Class236 local418 = Static505.aClass236_85;
			synchronized (Static505.aClass236_85) {
				Static505.aClass236_85.method6241(local57, local67);
			}
		}
		@Pc(434) int local434 = arg3.V();
		@Pc(437) int local437 = arg3.RA();
		@Pc(440) int local440 = arg3.HA();
		@Pc(443) int local443 = arg3.G();
		@Pc(445) Class8_Sub5_Sub21 local445 = null;
		if (arg9 != null) {
			@Pc(452) int local452 = arg9.anIntArray182[arg5];
			local445 = Static28.aClass220_1.method5668(local452 >> 16);
			arg5 = local452 & 0xFFFF;
		}
		if (local445 == null) {
			local67 = local67.method7993((byte) 3, local11, true);
			local67.O(local437 - local434 >> 1, 128, local443 - local440 >> 1);
			local67.H(local437 + local434 >> 1, 0, local443 + local440 >> 1);
		} else {
			local67 = local67.method7993((byte) 3, local11, true);
			local67.O(local437 - local434 >> 1, 128, local443 - local440 >> 1);
			local67.H(local437 + local434 >> 1, 0, local443 + local440 >> 1);
			local67.method8015(arg5, local445);
		}
		if (arg0 != 0) {
			local67.FA(arg0);
		}
		if (arg7 != 0) {
			local67.VA(arg7);
		}
		if (arg10 != 0) {
			local67.H(0, arg10, 0);
		}
		return local67;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
	public static int method6807(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(BI)V")
	public static void method6808(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(5, arg0);
		local8.method3512();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
	public static void method6809() throws IOException {
		if (Static319.aClass240_2 == null || Static404.anInt7725 <= 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		while (true) {
			@Pc(19) Class8_Sub31 local19 = (Class8_Sub31) Static528.aClass43_59.method1422();
			if (local19 == null) {
				Static337.anInt6641 += local14;
				Static271.anInt5723 = 0;
				break;
			}
			Static319.aClass240_2.method6378(local19.aClass8_Sub8_Sub2_1.aByteArray107, local19.anInt5971);
			local14 += local19.anInt5971;
			Static404.anInt7725 -= local19.anInt5971;
			local19.method8640();
			local19.aClass8_Sub8_Sub2_1.method8577();
			local19.method4901();
		}
	}
}
