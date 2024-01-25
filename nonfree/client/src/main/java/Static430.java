import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public static int anInt6771;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public static int anInt6773;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
	public static final int[] anIntArray466 = new int[8];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "Z")
	public static boolean aBoolean524 = false;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILclient!ka;ILclient!fs;Lclient!ha;IIIIIII)Lclient!ka;")
	public static Class62 method5938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class124 arg4, @OriginalArg(6) Class33 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg2 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg4 != null) {
			local11 = arg4.method2834(-1, false, arg6) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg3 << 48) + (long) ((arg7 << 24) + (arg1 << 16) + arg11) + ((long) arg12 << 32);
		@Pc(49) Class352 local49 = Static318.aClass352_43;
		@Pc(59) Class62 local59;
		synchronized (Static318.aClass352_43) {
			local59 = (Class62) Static318.aClass352_43.method7653(local47);
		}
		if (local59 == null || arg5.method8124(local59.ua(), local11) != 0) {
			if (local59 != null) {
				local11 = arg5.method8140(local11, local59.ua());
			}
			@Pc(89) byte local89;
			if (arg11 == 1) {
				local89 = 9;
			} else if (arg11 == 2) {
				local89 = 12;
			} else if (arg11 == 3) {
				local89 = 15;
			} else if (arg11 == 4) {
				local89 = 18;
			} else {
				local89 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class334 local147 = new Class334(local89 * 3 + 1, local89 * 3 * 2 - local89, 0);
			@Pc(154) int local154 = local147.method7386(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local89];
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local166 = local129[local160];
				local170 = local129[local160];
				for (local172 = 0; local172 < local89; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local89;
					@Pc(188) int local188 = Class4_Sub2_Sub26.anIntArray563[local180] * local166 >> 14;
					local196 = Class4_Sub2_Sub26.anIntArray562[local180] * local170 >> 14;
					local158[local160][local172] = local147.method7386(local188, 0, local196);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(251) byte local251 = (byte) (local172 * arg1 + local170 * arg7 >> 8);
				@Pc(296) short local296 = (short) ((local170 * (arg3 & 0x7F) + (arg12 & 0x7F) * local172 & 0x7F00) + (local170 * (arg3 & 0xFC00) + local172 * (arg12 & 0xFC00) & 0xFC0000) + ((arg12 & 0x380) * local172 + (arg3 & 0x380) * local170 & 0x38000) >> 8);
				for (local196 = 0; local196 < local89; local196++) {
					if (local166 == 0) {
						local147.method7383((byte) -1, (short) -1, local158[0][(local196 + 1) % local89], local158[0][local196], (byte) 1, local251, local154, local296);
					} else {
						local147.method7383((byte) -1, (short) -1, local158[local166 - 1][(local196 + 1) % local89], local158[local166][(local196 + 1) % local89], (byte) 1, local251, local158[local166 - 1][local196], local296);
						local147.method7383((byte) -1, (short) -1, local158[local166][(local196 + 1) % local89], local158[local166][local196], (byte) 1, local251, local158[local166 - 1][local196], local296);
					}
				}
			}
			local59 = arg5.method8072(local147, local11, Static523.anInt8091, 64, 768);
			@Pc(423) Class352 local423 = Static318.aClass352_43;
			synchronized (Static318.aClass352_43) {
				Static318.aClass352_43.method7655(local47, local59);
			}
		}
		@Pc(439) int local439 = arg2.V();
		@Pc(442) int local442 = arg2.RA();
		@Pc(464) int local464 = arg2.HA();
		@Pc(467) int local467 = arg2.G();
		@Pc(469) Class4_Sub5_Sub15 local469 = null;
		if (arg4 != null) {
			@Pc(476) int local476 = arg4.anIntArray224[arg6];
			local469 = Static99.aClass2_1.method24(local476 >> 16);
			arg6 = local476 & 0xFFFF;
		}
		if (local469 == null) {
			local59 = local59.method7329((byte) 3, local11, true);
			local59.O(local442 - local439 >> 1, 128, local467 - local464 >> 1);
			local59.H(local442 + local439 >> 1, 0, local464 + local467 >> 1);
		} else {
			local59 = local59.method7329((byte) 3, local11, true);
			local59.O(local442 - local439 >> 1, 128, local467 - local464 >> 1);
			local59.H(local442 + local439 >> 1, 0, local467 + local464 >> 1);
			local59.method7334(local469, arg6);
		}
		if (arg10 != 0) {
			local59.FA(arg10);
		}
		if (arg8 != 0) {
			local59.VA(arg8);
		}
		if (arg0 != 0) {
			local59.H(0, arg0, 0);
		}
		return local59;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	public static void method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static124.aClass4_Sub20_4.aClass8_Sub22_4.method7414() != 0 && arg3 != 0 && Static655.anInt10336 < 50 && arg1 != -1) {
			Static665.aClass129Array1[Static655.anInt10336++] = new Class129((byte) 1, arg1, arg3, arg0, arg4, 0, arg2, (Class3_Sub1) null);
		}
	}
}
