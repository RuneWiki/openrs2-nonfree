import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "n", descriptor = "[B")
	public static final byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
	public int[] anIntArray4 = new int[1];

	@OriginalMember(owner = "client!a", name = "m", descriptor = "[I")
	public int[] anIntArray3 = new int[] { -1 };

	static {
		@Pc(3) int local3 = 0;
		aByteArray1 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray1[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([IZZI[I)J")
	private long method12(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class36.aLongArray3;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg2 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg3[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg3[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local131] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!rj;IIILclient!ii;ILclient!ls;II)Lclient!dc;")
	public Class40 method15(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class177 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(7) Class136 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class40 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class118 local11 = null;
		if (arg4 != -1) {
			local11 = Static30.method504(arg4);
		}
		@Pc(21) int[] local21 = this.anIntArray3;
		if (local11 != null && local11.anIntArray290 != null) {
			local21 = new int[local11.anIntArray290.length];
			for (@Pc(33) int local33 = 0; local33 < local11.anIntArray290.length; local33++) {
				@Pc(40) int local40 = local11.anIntArray290[local33];
				if (local40 >= 0 && local40 < this.anIntArray3.length) {
					local21[local33] = this.anIntArray3[local40];
				} else {
					local21[local33] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) int local78 = -1;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = 0;
		@Pc(84) Class1_Sub2_Sub13 local84 = null;
		@Pc(86) Class1_Sub2_Sub13 local86 = null;
		if (arg1 != null) {
			local78 = arg1.anIntArray529[arg7];
			local9 = 1056;
			@Pc(101) int local101 = local78 >>> 16;
			local84 = Static327.method5522(local101);
			local78 &= 0xFFFF;
			if (local84 != null) {
				local74 = local84.method4655(local78) | false;
				local72 = local84.method4656(local78) | false;
				local76 = arg1.aBoolean451 | false;
			}
			if ((arg1.aBoolean450 || Static221.aBoolean374) && arg3 != -1 && arg3 < arg1.anIntArray529.length) {
				local80 = arg1.anIntArray529[arg3];
				local82 = arg1.anIntArray528[arg7];
				@Pc(164) int local164 = local80 >>> 16;
				local80 &= 0xFFFF;
				if (local101 == local164) {
					local86 = local84;
				} else {
					local86 = Static327.method5522(local80 >>> 16);
				}
				if (local86 != null) {
					local74 |= local86.method4655(local80);
					local72 |= local86.method4656(local80);
				}
			}
			if (local74) {
				local9 = 1184;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local76) {
				local9 |= 0x200;
			}
		}
		@Pc(227) long local227 = this.method12(arg6 == null ? null : arg6.anIntArray351, arg0, arg4, local21);
		if (Static83.aClass37_31 != null) {
			local7 = (Class40) Static83.aClass37_31.method915(local227);
		}
		if (local7 == null || arg5.method4223(local7.method4602(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method4214(local9, local7.method4602());
			}
			@Pc(256) int local256 = local9;
			@Pc(258) boolean local258 = false;
			for (@Pc(260) int local260 = 0; local260 < local21.length; local260++) {
				if (local21[local260] != -1 && !Static348.method5333(local21[local260]).method1992(arg0)) {
					local258 = true;
				}
			}
			if (local258) {
				return null;
			}
			@Pc(292) Class219[] local292 = new Class219[local21.length];
			for (@Pc(294) int local294 = 0; local294 < local21.length; local294++) {
				if (local21[local294] != -1) {
					local292[local294] = Static348.method5333(local21[local294]).method1981(arg0);
				}
			}
			@Pc(349) int local349;
			if (local11 != null && local11.anIntArrayArray26 != null) {
				for (@Pc(329) int local329 = 0; local329 < local11.anIntArrayArray26.length; local329++) {
					if (local11.anIntArrayArray26[local329] != null && local292[local329] != null) {
						local349 = local11.anIntArrayArray26[local329][0];
						@Pc(356) int local356 = local11.anIntArrayArray26[local329][1];
						@Pc(363) int local363 = local11.anIntArrayArray26[local329][2];
						@Pc(370) int local370 = local11.anIntArrayArray26[local329][3];
						@Pc(377) int local377 = local11.anIntArrayArray26[local329][4];
						@Pc(384) int local384 = local11.anIntArrayArray26[local329][5];
						if (local370 != 0 || local377 != 0 || local384 != 0) {
							local292[local329].method5845(local384, local377, local370);
						}
						if (local349 != 0 || local356 != 0 || local363 != 0) {
							local292[local329].method5854(local363, local349, local356);
						}
					}
				}
			}
			if (arg6 != null) {
				local256 = local9 | 0x2000;
			}
			@Pc(450) Class219 local450 = new Class219(local292, local292.length);
			local7 = arg5.method4301(local450, local256, Static8.anInt111, 64, 850);
			if (arg6 != null) {
				for (local349 = 0; local349 < 5; local349++) {
					if (arg6.anIntArray351[local349] < Static259.aShortArrayArray11[local349].length) {
						local7.method4579(Static325.aShortArray47[local349], Static259.aShortArrayArray11[local349][arg6.anIntArray351[local349]]);
					}
					if (arg6.anIntArray351[local349] < Static262.aShortArrayArray5[local349].length) {
						local7.method4579(Static238.aShortArray66[local349], Static262.aShortArrayArray5[local349][arg6.anIntArray351[local349]]);
					}
				}
			}
			if (Static83.aClass37_31 != null) {
				local7.method4601(local9);
				Static83.aClass37_31.method922(local227, local7);
			}
		}
		if (arg1 == null || local84 == null) {
			return local7;
		} else {
			@Pc(542) Class40 local542 = local7.method4599((byte) 1, local9, true);
			local542.method4596(local78, local82, local86, arg2 - 1, local80, 0, local84, arg1.aBoolean451);
			return local542;
		}
	}
}
