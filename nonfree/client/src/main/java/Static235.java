import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hs", name = "S", descriptor = "Lclient!bn;")
	public static Class37 aClass37_5;

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B[B[[B[II[II[[B)I")
	public static int method4258(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(14) int local14 = arg4[arg5];
		@Pc(21) int local21 = local14 + arg2[arg5];
		@Pc(25) int local25 = arg4[arg3];
		@Pc(31) int local31 = arg2[arg3] + local25;
		@Pc(33) int local33 = local14;
		if (local14 < local25) {
			local33 = local25;
		}
		@Pc(44) int local44 = local21;
		if (local21 > local31) {
			local44 = local31;
		}
		@Pc(59) int local59 = arg0[arg5] & 0xFF;
		if ((arg0[arg3] & 0xFF) < local59) {
			local59 = arg0[arg3] & 0xFF;
		}
		@Pc(80) byte[] local80 = arg6[arg5];
		@Pc(84) byte[] local84 = arg1[arg3];
		@Pc(89) int local89 = local33 - local14;
		@Pc(93) int local93 = local33 - local25;
		for (@Pc(95) int local95 = local33; local95 < local44; local95++) {
			@Pc(107) int local107 = local84[local93++] + local80[local89++];
			if (local59 > local107) {
				local59 = local107;
			}
		}
		return -local59;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILclient!je;IIIIIIILclient!ha;ILclient!ka;)Lclient!ka;")
	public static Class14 method4259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class101 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class14 arg12) {
		if (arg12 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method4685(false, -1, arg4) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(49) long local49 = ((long) arg2 << 32) + (long) ((arg11 << 16) + arg5 + (arg8 << 24)) + ((long) arg9 << 48);
		@Pc(51) Class22 local51 = Static290.aClass22_36;
		@Pc(59) Class14 local59;
		synchronized (Static290.aClass22_36) {
			local59 = (Class14) Static290.aClass22_36.method462(local49);
		}
		if (local59 == null || arg10.method8083(local59.ua(), local11) != 0) {
			if (local59 != null) {
				local11 = arg10.method8095(local11, local59.ua());
			}
			@Pc(86) byte local86;
			if (arg5 == 1) {
				local86 = 9;
			} else if (arg5 == 2) {
				local86 = 12;
			} else if (arg5 == 3) {
				local86 = 15;
			} else if (arg5 == 4) {
				local86 = 18;
			} else {
				local86 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(144) Class159 local144 = new Class159(local86 * 3 + 1, local86 * 2 * 3 + -local86, 0);
			@Pc(151) int local151 = local144.method4367(0, 0, 0);
			@Pc(155) int[][] local155 = new int[3][local86];
			@Pc(163) int local163;
			@Pc(167) int local167;
			@Pc(169) int local169;
			@Pc(193) int local193;
			for (@Pc(157) int local157 = 0; local157 < 3; local157++) {
				local163 = local126[local157];
				local167 = local126[local157];
				for (local169 = 0; local169 < local86; local169++) {
					@Pc(177) int local177 = (local169 << 14) / local86;
					@Pc(185) int local185 = local163 * Class12_Sub2.anIntArray204[local177] >> 14;
					local193 = local167 * Class12_Sub2.anIntArray203[local177] >> 14;
					local155[local157][local169] = local144.method4367(local193, 0, local185);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(240) byte local240 = (byte) (local169 * arg11 + local167 * arg8 >> 8);
				@Pc(285) short local285 = (short) ((local169 * (arg2 & 0x7F) + local167 * (arg9 & 0x7F) & 0x7F00) + ((arg9 & 0x380) * local167 + local169 * (arg2 & 0x380) & 0x38000) + ((arg9 & 0xFC00) * local167 + local169 * (arg2 & 0xFC00) & 0xFC0000) >> 8);
				for (local193 = 0; local193 < local86; local193++) {
					if (local163 == 0) {
						local144.method4368(local151, local155[0][(local193 + 1) % local86], (byte) 1, (byte) -1, local155[0][local193], (short) -1, local285, local240);
					} else {
						local144.method4368(local155[local163 - 1][local193], local155[local163 - 1][(local193 + 1) % local86], (byte) 1, (byte) -1, local155[local163][(local193 + 1) % local86], (short) -1, local285, local240);
						local144.method4368(local155[local163 - 1][local193], local155[local163][(local193 + 1) % local86], (byte) 1, (byte) -1, local155[local163][local193], (short) -1, local285, local240);
					}
				}
			}
			local59 = arg10.method8064(local144, local11, Static637.anInt10986, 64, 768);
			@Pc(408) Class22 local408 = Static290.aClass22_36;
			synchronized (Static290.aClass22_36) {
				Static290.aClass22_36.method470(local49, local59);
			}
		}
		@Pc(424) int local424 = arg12.V();
		@Pc(427) int local427 = arg12.RA();
		@Pc(430) int local430 = arg12.HA();
		@Pc(433) int local433 = arg12.G();
		@Pc(435) Class2_Sub1_Sub18 local435 = null;
		if (arg3 != null) {
			@Pc(442) int local442 = arg3.anIntArray259[arg4];
			local435 = Static354.aClass40_2.method1120(local442 >> 16);
			arg4 = local442 & 0xFFFF;
		}
		if (local435 == null) {
			local59 = local59.method8622((byte) 3, local11, true);
			local59.O(local427 - local424 >> 1, 128, local433 - local430 >> 1);
			local59.H(local424 + local427 >> 1, 0, local430 + local433 >> 1);
		} else {
			local59 = local59.method8622((byte) 3, local11, true);
			local59.O(local427 - local424 >> 1, 128, local433 - local430 >> 1);
			local59.H(local424 + local427 >> 1, 0, local433 + local430 >> 1);
			local59.method8626(local435, arg4);
		}
		if (arg0 != 0) {
			local59.FA(arg0);
		}
		if (arg1 != 0) {
			local59.VA(arg1);
		}
		if (arg7 != 0) {
			local59.H(0, arg7, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)V")
	public static void method4260() {
		if (Static607.aClass101_15.method8135()) {
			Static607.aClass101_15.method8074(Static641.aCanvas13);
			Static5.method91();
			if (Static450.aBoolean606) {
				Static579.method8749(Static641.aCanvas13);
			} else {
				@Pc(31) Dimension local31 = Static641.aCanvas13.getSize();
				Static607.aClass101_15.method8119(Static641.aCanvas13, local31.width, local31.height);
			}
			Static607.aClass101_15.method8144(Static641.aCanvas13);
		} else {
			Static389.method6560(false, Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907());
		}
		Static403.method6620();
		Static207.aBoolean327 = true;
	}
}
