import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "[I")
	public int[] anIntArray269 = new int[1];

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "[I")
	public int[] anIntArray270 = new int[] { -1 };

	static {
		new Class93("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qe;IIILclient!kb;ZIILclient!ae;I)Lclient!bk;")
	public Class7 method2981(@OriginalArg(0) Class160 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class107 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class4 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class7 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class180 local11 = null;
		if (arg5 != -1) {
			local11 = Static283.method5089(arg5);
		}
		@Pc(27) int[] local27 = this.anIntArray270;
		if (local11 != null && local11.anIntArray420 != null) {
			local27 = new int[local11.anIntArray420.length];
			for (@Pc(39) int local39 = 0; local39 < local11.anIntArray420.length; local39++) {
				@Pc(46) int local46 = local11.anIntArray420[local39];
				if (local46 >= 0 && local46 < this.anIntArray270.length) {
					local27[local39] = this.anIntArray270[local46];
				} else {
					local27[local39] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = 0;
		@Pc(86) Class2_Sub11_Sub1 local86 = null;
		@Pc(88) Class2_Sub11_Sub1 local88 = null;
		if (arg3 != null) {
			local80 = arg3.anIntArray280[arg1];
			local9 = 1056;
			@Pc(103) int local103 = local80 >>> 16;
			local80 &= 0xFFFF;
			local86 = Static99.method2234(local103);
			if (local86 != null) {
				local76 = local86.method1342(local80) | false;
				local74 = local86.method1346(local80) | false;
				local78 = arg3.aBoolean291 | false;
			}
			if ((arg3.aBoolean293 || Static70.aBoolean144) && arg2 != -1 && arg3.anIntArray280.length > arg2) {
				local84 = arg3.anIntArray279[arg1];
				local82 = arg3.anIntArray280[arg2];
				@Pc(159) int local159 = local82 >>> 16;
				local82 &= 0xFFFF;
				if (local103 == local159) {
					local88 = local86;
				} else {
					local88 = Static99.method2234(local82 >>> 16);
				}
				if (local88 != null) {
					local76 |= local88.method1342(local82);
					local74 |= local88.method1346(local82);
				}
			}
			if (local76) {
				local9 = 1184;
			}
			if (local74) {
				local9 |= 0x100;
			}
			if (local78) {
				local9 |= 0x200;
			}
		}
		@Pc(226) long local226 = this.method2984(arg0 == null ? null : arg0.anIntArray379, arg5, local27, arg4);
		if (Static122.aClass119_139 != null) {
			local7 = (Class7) Static122.aClass119_139.method3311(local226);
		}
		if (local7 == null || arg6.method4276(local7.method1435(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method4256(local9, local7.method1435());
			}
			@Pc(254) int local254 = local9;
			@Pc(256) boolean local256 = false;
			for (@Pc(258) int local258 = 0; local258 < local27.length; local258++) {
				if (local27[local258] != -1 && !Static282.method5080(local27[local258]).method5868(arg4)) {
					local256 = true;
				}
			}
			if (local256) {
				return null;
			}
			@Pc(294) Class192[] local294 = new Class192[local27.length];
			for (@Pc(296) int local296 = 0; local296 < local27.length; local296++) {
				if (local27[local296] != -1) {
					local294[local296] = Static282.method5080(local27[local296]).method5866(arg4);
				}
			}
			@Pc(349) int local349;
			if (local11 != null && local11.anIntArrayArray149 != null) {
				for (@Pc(329) int local329 = 0; local329 < local11.anIntArrayArray149.length; local329++) {
					if (local11.anIntArrayArray149[local329] != null && local294[local329] != null) {
						local349 = local11.anIntArrayArray149[local329][0];
						@Pc(356) int local356 = local11.anIntArrayArray149[local329][1];
						@Pc(363) int local363 = local11.anIntArrayArray149[local329][2];
						@Pc(370) int local370 = local11.anIntArrayArray149[local329][3];
						@Pc(377) int local377 = local11.anIntArrayArray149[local329][4];
						@Pc(384) int local384 = local11.anIntArrayArray149[local329][5];
						if (local370 != 0 || local377 != 0 || local384 != 0) {
							local294[local329].method5465(local370, local384, local377);
						}
						if (local349 != 0 || local356 != 0 || local363 != 0) {
							local294[local329].method5471(local363, local356, local349);
						}
					}
				}
			}
			@Pc(444) Class192 local444 = new Class192(local294, local294.length);
			if (arg0 != null) {
				local254 = local9 | 0x2000;
			}
			local7 = arg6.method4237(local444, local254, Static133.anInt2775, 64, 850);
			if (arg0 != null) {
				for (local349 = 0; local349 < 5; local349++) {
					if (Static282.aShortArrayArray7[local349].length > arg0.anIntArray379[local349]) {
						local7.method1417(Static262.aShortArray78[local349], Static282.aShortArrayArray7[local349][arg0.anIntArray379[local349]]);
					}
					if (arg0.anIntArray379[local349] < Static276.aShortArrayArray6[local349].length) {
						local7.method1417(Static96.aShortArray52[local349], Static276.aShortArrayArray6[local349][arg0.anIntArray379[local349]]);
					}
				}
			}
			if (Static122.aClass119_139 != null) {
				local7.method1412(local9);
				Static122.aClass119_139.method3308(local7, local226);
			}
		}
		if (arg3 == null || local86 == null) {
			return local7;
		} else {
			@Pc(540) Class7 local540 = local7.method1436((byte) 1, local9, true);
			local540.method1409(local86, arg3.aBoolean291, local88, arg7 - 1, 0, local82, local80, local84);
			return local540;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "([IIZ[IZ)J")
	private long method2984(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class2_Sub2_Sub34.aLongArray7;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) (((long) arg1 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local7[(int) (((long) (arg2[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg2[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(125) int local125 = 0; local125 < 5; local125++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local125] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}
}
