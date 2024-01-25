import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
	public int[] anIntArray175 = new int[1];

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[I")
	public int[] anIntArray174 = new int[] { -1 };

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!mu;ZILclient!ha;IIIILclient!vp;I)Lclient!ka;")
	public Class149 method2930(@OriginalArg(0) Class239 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class376 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class149 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class286 local11 = null;
		if (arg5 != -1) {
			local11 = Static461.aClass223_42.method5169(arg5);
		}
		@Pc(22) int[] local22 = this.anIntArray174;
		if (local11 != null && local11.anIntArray410 != null) {
			local22 = new int[local11.anIntArray410.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray410.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray410[local34];
				if (local41 >= 0 && local41 < this.anIntArray174.length) {
					local22[local34] = this.anIntArray174[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class3_Sub5_Sub3 local90 = null;
		@Pc(92) Class3_Sub5_Sub3 local92 = null;
		if (arg0 != null) {
			local84 = arg0.anIntArray339[arg7];
			local9 = 2080;
			@Pc(107) int local107 = local84 >>> 16;
			local90 = Static13.aClass213_1.method5001(local107);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local78 = local90.method769(local84) | false;
				local76 = local90.method773(local84) | false;
				local82 = local90.method770(local84) | false;
				local80 = arg0.aBoolean447 | false;
			}
			if ((arg0.aBoolean446 || Static378.aBoolean643) && arg3 != -1 && arg0.anIntArray339.length > arg3) {
				local86 = arg0.anIntArray339[arg3];
				local88 = arg0.anIntArray337[arg7];
				@Pc(172) int local172 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local107 == local172) {
					local92 = local90;
				} else {
					local92 = Static13.aClass213_1.method5001(local86 >>> 16);
				}
				if (local92 != null) {
					local78 |= local92.method769(local86);
					local76 |= local92.method773(local86);
					local82 |= local92.method770(local86);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(255) long local255 = this.method2933(arg5, local22, arg6 == null ? null : arg6.anIntArray573, arg1);
		if (Static565.aClass295_59 != null) {
			local7 = (Class149) Static565.aClass295_59.method6470(local255);
		}
		if (local7 == null || arg2.method8047(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method8012(local9, local7.ua());
			}
			@Pc(284) int local284 = local9;
			@Pc(286) boolean local286 = false;
			for (@Pc(288) int local288 = 0; local288 < local22.length; local288++) {
				if (local22[local288] != -1 && !Static117.aClass197_2.method4518(local22[local288]).method464(arg1, (Class99) null)) {
					local286 = true;
				}
			}
			if (local286) {
				return null;
			}
			@Pc(326) Class134[] local326 = new Class134[local22.length];
			for (@Pc(328) int local328 = 0; local328 < local22.length; local328++) {
				if (local22[local328] != -1) {
					local326[local328] = Static117.aClass197_2.method4518(local22[local328]).method459(arg1, (Class99) null);
				}
			}
			@Pc(387) int local387;
			@Pc(394) int local394;
			if (local11 != null && local11.anIntArrayArray43 != null) {
				for (@Pc(367) int local367 = 0; local367 < local11.anIntArrayArray43.length; local367++) {
					if (local11.anIntArrayArray43[local367] != null && local326[local367] != null) {
						local387 = local11.anIntArrayArray43[local367][0];
						local394 = local11.anIntArrayArray43[local367][1];
						@Pc(401) int local401 = local11.anIntArrayArray43[local367][2];
						@Pc(408) int local408 = local11.anIntArrayArray43[local367][3];
						@Pc(415) int local415 = local11.anIntArrayArray43[local367][4];
						@Pc(422) int local422 = local11.anIntArrayArray43[local367][5];
						if (local408 != 0 || local415 != 0 || local422 != 0) {
							local326[local367].method3055(local422, local415, local408);
						}
						if (local387 != 0 || local394 != 0 || local401 != 0) {
							local326[local367].method3058(local401, local394, local387);
						}
					}
				}
			}
			@Pc(479) Class134 local479 = new Class134(local326, local326.length);
			if (arg6 != null) {
				local284 = local9 | 0x4000;
			}
			local7 = arg2.method8021(local479, local284, Static614.anInt10205, 64, 850);
			if (arg6 != null) {
				for (local387 = 0; local387 < 5; local387++) {
					for (local394 = 0; local394 < Static332.aShortArrayArrayArray2.length; local394++) {
						if (arg6.anIntArray573[local387] < Static332.aShortArrayArrayArray2[local394][local387].length) {
							local7.ia(Static661.aShortArrayArray18[local394][local387], Static332.aShortArrayArrayArray2[local394][local387][arg6.anIntArray573[local387]]);
						}
					}
				}
			}
			if (Static565.aClass295_59 != null) {
				local7.s(local9);
				Static565.aClass295_59.method6469(local255, local7);
			}
		}
		if (arg0 == null || local90 == null) {
			return local7;
		} else {
			@Pc(568) Class149 local568 = local7.method8858((byte) 1, local9, true);
			local568.method8856(0, local84, local88, local86, local92, arg0.aBoolean447, arg4 - 1, local90);
			return local568;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB[I[IZ)J")
	private long method2933(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class3_Sub5_Sub21.aLongArray23;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg0 ^ local25) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg1.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local47] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local47] >> 16)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg1[local47] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local47] ^ local9) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
				local9 = local7[(int) ((local9 ^ (long) arg2[local128]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
