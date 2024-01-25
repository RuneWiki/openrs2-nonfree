import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "[I")
	public int[] anIntArray230 = new int[] { -1 };

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[I")
	public int[] anIntArray229 = new int[1];

	static {
		new Class83("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZBILclient!lp;IILclient!cj;ILclient!ya;)Lclient!t;")
	public Class110 method2929(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class138 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class37 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class19 arg7) {
		@Pc(7) Class110 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class151 local11 = null;
		if (arg4 != -1) {
			local11 = Static222.aClass249_1.method5325(arg4);
		}
		@Pc(23) int[] local23 = this.anIntArray230;
		if (local11 != null && local11.anIntArray306 != null) {
			local23 = new int[local11.anIntArray306.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray306.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray306[local35];
				if (local42 >= 0 && local42 < this.anIntArray230.length) {
					local23[local35] = this.anIntArray230[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = 0;
		@Pc(93) Class4_Sub1_Sub17 local93 = null;
		@Pc(95) Class4_Sub1_Sub17 local95 = null;
		if (arg2 != null) {
			local9 = 2080;
			local87 = arg2.anIntArray295[arg6];
			@Pc(110) int local110 = local87 >>> 16;
			local87 &= 0xFFFF;
			local93 = Static182.aClass55_1.method1391(local110);
			if (local93 != null) {
				local76 = local93.method4207(local87) | false;
				local74 = local93.method4214(local87) | false;
				local85 = local93.method4215(local87) | false;
				local78 = arg2.aBoolean406 | false;
			}
			if ((arg2.aBoolean405 || Static127.aBoolean244) && arg1 != -1 && arg2.anIntArray295.length > arg1) {
				local89 = arg2.anIntArray295[arg1];
				local91 = arg2.anIntArray296[arg6];
				@Pc(176) int local176 = local89 >>> 16;
				local89 &= 0xFFFF;
				if (local176 == local110) {
					local95 = local93;
				} else {
					local95 = Static182.aClass55_1.method1391(local89 >>> 16);
				}
				if (local95 != null) {
					local76 |= local95.method4207(local89);
					local74 |= local95.method4214(local89);
					local85 |= local95.method4215(local89);
				}
			}
			if (local76) {
				local9 = 2208;
			}
			if (local74) {
				local9 |= 0x100;
			}
			if (local78) {
				local9 |= 0x200;
			}
			if (local85) {
				local9 |= 0x400;
			}
		}
		@Pc(259) long local259 = this.method2931(local23, arg4, arg0, arg5 == null ? null : arg5.anIntArray52);
		if (Static172.aClass68_18 != null) {
			local7 = (Class110) Static172.aClass68_18.method1787(local259);
		}
		if (local7 == null || arg7.method4269(local7.P(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method4282(local9, local7.P());
			}
			@Pc(288) int local288 = local9;
			@Pc(290) boolean local290 = false;
			for (@Pc(292) int local292 = 0; local292 < local23.length; local292++) {
				if (local23[local292] != -1 && !Static444.aClass206_3.method4703(local23[local292]).method4784(arg0)) {
					local290 = true;
				}
			}
			if (local290) {
				return null;
			}
			@Pc(329) Class122[] local329 = new Class122[local23.length];
			for (@Pc(331) int local331 = 0; local331 < local23.length; local331++) {
				if (local23[local331] != -1) {
					local329[local331] = Static444.aClass206_3.method4703(local23[local331]).method4783(arg0);
				}
			}
			@Pc(389) int local389;
			if (local11 != null && local11.anIntArrayArray38 != null) {
				for (@Pc(369) int local369 = 0; local369 < local11.anIntArrayArray38.length; local369++) {
					if (local11.anIntArrayArray38[local369] != null && local329[local369] != null) {
						local389 = local11.anIntArrayArray38[local369][0];
						@Pc(396) int local396 = local11.anIntArrayArray38[local369][1];
						@Pc(403) int local403 = local11.anIntArrayArray38[local369][2];
						@Pc(410) int local410 = local11.anIntArrayArray38[local369][3];
						@Pc(417) int local417 = local11.anIntArrayArray38[local369][4];
						@Pc(424) int local424 = local11.anIntArrayArray38[local369][5];
						if (local410 != 0 || local417 != 0 || local424 != 0) {
							local329[local369].method3053(local410, local417, local424);
						}
						if (local389 != 0 || local396 != 0 || local403 != 0) {
							local329[local369].method3041(local396, local389, local403);
						}
					}
				}
			}
			@Pc(477) Class122 local477 = new Class122(local329, local329.length);
			if (arg5 != null) {
				local288 = local9 | 0x4000;
			}
			local7 = arg7.method4254(local477, local288, Static349.anInt5986, 64, 850);
			if (arg5 != null) {
				for (local389 = 0; local389 < 5; local389++) {
					if (Static26.aShortArrayArray2[local389].length > arg5.anIntArray52[local389]) {
						local7.BA(Static299.aShortArray179[local389], Static26.aShortArrayArray2[local389][arg5.anIntArray52[local389]]);
					}
					if (Static15.aShortArrayArray1[local389].length > arg5.anIntArray52[local389]) {
						local7.BA(Static434.aShortArray252[local389], Static15.aShortArrayArray1[local389][arg5.anIntArray52[local389]]);
					}
				}
			}
			if (Static172.aClass68_18 != null) {
				local7.UA(local9);
				Static172.aClass68_18.method1779(local259, local7);
			}
		}
		if (arg2 == null || local93 == null) {
			return local7;
		} else {
			@Pc(571) Class110 local571 = local7.method4887((byte) 1, local9, true);
			local571.method4883(0, local91, arg2.aBoolean406, local87, local89, local93, local95, arg3 - 1);
			return local571;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([IIZI[I)J")
	private long method2931(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class80.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg0[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) ((local9 ^ (long) arg3[local122]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
