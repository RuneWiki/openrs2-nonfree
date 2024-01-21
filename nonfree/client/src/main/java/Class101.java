import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class101 {

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	private int anInt4248;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIB[I[I)V")
	public void method3308(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static1.anInt1793; local12++) {
					@Pc(18) Class3_Sub3_Sub14 local18 = Static12.method259(local12);
					if (local18 != null && !local18.aBoolean88 && local8 + (arg0 ? 7 : 0) == local18.anInt1520) {
						arg3[Static197.anIntArray355[local8]] = Integer.MIN_VALUE | local12;
						break;
					}
				}
			}
		}
		this.anIntArray382 = arg2;
		this.anInt4248 = arg1;
		this.anIntArray381 = arg3;
		this.aBoolean189 = arg0;
		this.method3311();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	private void method3311() {
		@Pc(2) long local2 = this.aLong146;
		this.aLong146 = -1L;
		@Pc(7) long[] local7 = Class3_Sub2_Sub29.aLongArray7;
		for (@Pc(13) int local13 = 0; local13 < 12; local13++) {
			this.aLong146 = this.aLong146 >>> 8 ^ local7[(int) (((long) (this.anIntArray381[local13] >> 24) ^ this.aLong146) & 0xFFL)];
			this.aLong146 = this.aLong146 >>> 8 ^ local7[(int) (((long) (this.anIntArray381[local13] >> 16) ^ this.aLong146) & 0xFFL)];
			this.aLong146 = local7[(int) (((long) (this.anIntArray381[local13] >> 8) ^ this.aLong146) & 0xFFL)] ^ this.aLong146 >>> 8;
			this.aLong146 = this.aLong146 >>> 8 ^ local7[(int) (((long) this.anIntArray381[local13] ^ this.aLong146) & 0xFFL)];
		}
		for (@Pc(106) int local106 = 0; local106 < 5; local106++) {
			this.aLong146 = local7[(int) (((long) this.anIntArray382[local106] ^ this.aLong146) & 0xFFL)] ^ this.aLong146 >>> 8;
		}
		this.aLong146 = this.aLong146 >>> 8 ^ local7[(int) (((long) (this.aBoolean189 ? 1 : 0) ^ this.aLong146) & 0xFFL)];
		if (local2 != 0L && local2 != this.aLong146) {
			Static192.aClass94_12.method3155(local2);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBLclient!nd;)Lclient!wa;")
	public Class26_Sub6 method3312(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub17 arg1) {
		if (this.anInt4248 != -1) {
			return Static37.method2344(this.anInt4248).method3054(arg1, arg0);
		}
		@Pc(24) Class26_Sub6 local24 = (Class26_Sub6) Static188.aClass94_11.method3153(this.aLong146);
		if (local24 == null) {
			@Pc(28) boolean local28 = false;
			for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
				@Pc(36) int local36 = this.anIntArray381[local30];
				if ((local36 & 0x40000000) == 0) {
					if ((local36 & Integer.MIN_VALUE) != 0 && !Static12.method259(local36 & 0x3FFFFFFF).method1117()) {
						local28 = true;
					}
				} else if (!Static14.method275(local36 & 0x3FFFFFFF).method911(this.aBoolean189)) {
					local28 = true;
				}
			}
			if (local28) {
				return null;
			}
			@Pc(80) Class26_Sub5[] local80 = new Class26_Sub5[12];
			@Pc(82) int local82 = 0;
			for (@Pc(84) int local84 = 0; local84 < 12; local84++) {
				@Pc(90) int local90 = this.anIntArray381[local84];
				@Pc(106) Class26_Sub5 local106;
				if ((local90 & 0x40000000) != 0) {
					local106 = Static14.method275(local90 & 0x3FFFFFFF).method907(this.aBoolean189);
					if (local106 != null) {
						local80[local82++] = local106;
					}
				} else if ((local90 & Integer.MIN_VALUE) != 0) {
					local106 = Static12.method259(local90 & 0x3FFFFFFF).method1116();
					if (local106 != null) {
						local80[local82++] = local106;
					}
				}
			}
			@Pc(141) Class26_Sub5 local141 = new Class26_Sub5(local80, local82);
			for (@Pc(143) int local143 = 0; local143 < 5; local143++) {
				if (Static4.aShortArrayArray1[local143].length > this.anIntArray382[local143]) {
					local141.method1779(Static97.aShortArray25[local143], Static4.aShortArrayArray1[local143][this.anIntArray382[local143]]);
				}
				if (Static122.aShortArrayArray6[local143].length > this.anIntArray382[local143]) {
					local141.method1779(Static134.aShortArray41[local143], Static122.aShortArrayArray6[local143][this.anIntArray382[local143]]);
				}
			}
			local24 = local141.method1798(64, 768, -50, -10, -50);
			Static188.aClass94_11.method3154(this.aLong146, local24);
		}
		if (arg1 != null) {
			local24 = arg1.method1926(local24, arg0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	public void method3313(@OriginalArg(0) boolean arg0) {
		this.aBoolean189 = arg0;
		this.method3311();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static197.anIntArray355[arg0];
		if (this.anIntArray381[local7] != 0 && Static12.method259(arg1) != null) {
			this.anIntArray381[local7] = arg1 | Integer.MIN_VALUE;
			this.method3311();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)V")
	public void method3315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray382[arg1] = arg0;
		this.method3311();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!nd;ILclient!nd;)Lclient!wa;")
	public Class26_Sub6 method3316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub17 arg2, @OriginalArg(4) Class3_Sub3_Sub17 arg3) {
		if (this.anInt4248 != -1) {
			return Static37.method2344(this.anInt4248).method3060(arg1, arg0, arg3, arg2);
		}
		@Pc(26) int[] local26 = this.anIntArray381;
		@Pc(29) long local29 = this.aLong146;
		if (arg3 != null && (arg3.anInt2743 >= 0 || arg3.anInt2749 >= 0)) {
			local26 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local26[local48] = this.anIntArray381[local48];
			}
			if (arg3.anInt2743 >= 0) {
				if (arg3.anInt2743 == 65535) {
					local26[5] = 0;
					local29 ^= 0xFFFFFFFF00000000L;
				} else {
					local26[5] = arg3.anInt2743 | 0x40000000;
					local29 ^= (long) local26[5] << 32;
				}
			}
			if (arg3.anInt2749 >= 0) {
				if (arg3.anInt2749 == 65535) {
					local26[3] = 0;
					local29 ^= 0xFFFFFFFFL;
				} else {
					local26[3] = arg3.anInt2749 | 0x40000000;
					local29 ^= local26[3];
				}
			}
		}
		@Pc(131) Class26_Sub6 local131 = (Class26_Sub6) Static192.aClass94_12.method3153(local29);
		if (local131 == null) {
			@Pc(135) boolean local135 = false;
			for (@Pc(137) int local137 = 0; local137 < 12; local137++) {
				@Pc(142) int local142 = local26[local137];
				if ((local142 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local142) != 0 && !Static12.method259(local142 & 0x3FFFFFFF).method1118()) {
						local135 = true;
					}
				} else if (!Static14.method275(local142 & 0x3FFFFFFF).method904(this.aBoolean189)) {
					local135 = true;
				}
			}
			if (local135) {
				if (this.aLong145 != -1L) {
					local131 = (Class26_Sub6) Static192.aClass94_12.method3153(this.aLong145);
				}
				if (local131 == null) {
					return null;
				}
			}
			if (local131 == null) {
				@Pc(203) Class26_Sub5[] local203 = new Class26_Sub5[12];
				@Pc(205) int local205 = 0;
				for (@Pc(207) int local207 = 0; local207 < 12; local207++) {
					@Pc(212) int local212 = local26[local207];
					@Pc(228) Class26_Sub5 local228;
					if ((local212 & 0x40000000) != 0) {
						local228 = Static14.method275(local212 & 0x3FFFFFFF).method909(this.aBoolean189);
						if (local228 != null) {
							local203[local205++] = local228;
						}
					} else if ((Integer.MIN_VALUE & local212) != 0) {
						local228 = Static12.method259(local212 & 0x3FFFFFFF).method1119();
						if (local228 != null) {
							local203[local205++] = local228;
						}
					}
				}
				@Pc(265) Class26_Sub5 local265 = new Class26_Sub5(local203, local205);
				for (@Pc(267) int local267 = 0; local267 < 5; local267++) {
					if (Static4.aShortArrayArray1[local267].length > this.anIntArray382[local267]) {
						local265.method1779(Static97.aShortArray25[local267], Static4.aShortArrayArray1[local267][this.anIntArray382[local267]]);
					}
					if (Static122.aShortArrayArray6[local267].length > this.anIntArray382[local267]) {
						local265.method1779(Static134.aShortArray41[local267], Static122.aShortArrayArray6[local267][this.anIntArray382[local267]]);
					}
				}
				local131 = local265.method1798(64, 850, -30, -50, -30);
				Static192.aClass94_12.method3154(local29, local131);
				this.aLong145 = local29;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local131;
		}
		@Pc(358) Class26_Sub6 local358;
		if (arg3 != null && arg2 != null) {
			local358 = arg3.method1928(arg0, arg1, arg2, local131);
		} else if (arg3 == null) {
			local358 = arg2.method1924(local131, arg0);
		} else {
			local358 = arg3.method1924(local131, arg1);
		}
		return local358;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)I")
	public int method3319() {
		return this.anInt4248 == -1 ? this.anIntArray381[1] + (this.anIntArray381[0] << 15) + (this.anIntArray382[4] << 20) + (this.anIntArray382[0] << 25) + (this.anIntArray381[8] << 10) + (this.anIntArray381[11] << 5) : Static37.method2344(this.anInt4248).anInt3976 + 305419896;
	}
}
