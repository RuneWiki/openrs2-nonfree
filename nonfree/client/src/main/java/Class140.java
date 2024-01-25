import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class140 {

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "[I")
	public static final int[] anIntArray329 = new int[16384];

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "[I")
	public static final int[] anIntArray330 = new int[16384];

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "J")
	private long aLong121;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	private int anInt4277;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	public int anInt4279 = -1;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray330[local11] = (int) (Math.sin(local9 * (double) local11) * 32768.0D);
			anIntArray329[local11] = (int) (Math.cos(local9 * (double) local11) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	public void method3751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static350.anIntArray546[arg0];
		if (this.anIntArray327[local7] != 0 && Static32.method460(arg1) != null) {
			this.anIntArray327[local7] = arg1 | Integer.MIN_VALUE;
			this.method3755();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!jm;I[Lclient!fg;IILclient!uo;IIIZLclient!jm;)Lclient!mj;")
	public Class126 method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class72[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class129 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class111 arg10) {
		if (this.anInt4279 != -1) {
			return Static156.method2516(this.anInt4279).method1572(arg3, arg4, arg1, arg10, arg6, arg5, arg8, arg0, arg9, arg7, arg2);
		}
		@Pc(30) int local30 = arg1;
		@Pc(33) long local33 = this.aLong122;
		@Pc(36) int[] local36 = this.anIntArray327;
		if (arg2 != null && (arg2.anInt2724 >= 0 || arg2.anInt2708 >= 0)) {
			local36 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local36[local52] = this.anIntArray327[local52];
			}
			if (arg2.anInt2724 >= 0) {
				if (arg2.anInt2724 == 65535) {
					local36[5] = 0;
					local33 ^= 0xFFFFFFFF00000000L;
				} else {
					local36[5] = arg2.anInt2724 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg2.anInt2708 >= 0) {
				if (arg2.anInt2708 == 65535) {
					local36[3] = 0;
					local33 ^= 0xFFFFFFFFL;
				} else {
					local36[3] = arg2.anInt2708 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(145) boolean local145 = arg2 != null || arg10 != null;
		@Pc(152) int local152 = arg4 == null ? 0 : arg4.length;
		@Pc(185) int local185;
		@Pc(190) int local190;
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			Static13.aClass11_Sub4_Sub14Array1[local154] = null;
			if (arg4[local154] != null) {
				@Pc(171) Class111 local171 = Static306.method5143(arg4[local154].anInt1550);
				if (local171.anIntArray191 != null) {
					local145 = true;
					Static69.aClass111Array1[local154] = local171;
					local185 = arg4[local154].anInt1552;
					local190 = arg4[local154].anInt1545;
					@Pc(195) int local195 = local171.anIntArray191[local185];
					Static13.aClass11_Sub4_Sub14Array1[local154] = Static36.method537(local195 >>> 16);
					@Pc(207) int local207 = local195 & 0xFFFF;
					Static119.anIntArray157[local154] = local207;
					if (Static13.aClass11_Sub4_Sub14Array1[local154] != null) {
						local137 |= Static13.aClass11_Sub4_Sub14Array1[local154].method4230(local207);
						local135 |= Static13.aClass11_Sub4_Sub14Array1[local154].method4229(local207);
					}
					if ((local171.aBoolean188 || Static256.aBoolean339) && local190 != -1 && local171.anIntArray191.length > local190) {
						Static288.anIntArray444[local154] = local171.anIntArray190[local185];
						Static275.anIntArray422[local154] = arg4[local154].anInt1544;
						@Pc(283) int local283 = local171.anIntArray191[local190];
						Static178.aClass11_Sub4_Sub14Array4[local154] = Static36.method537(local283 >>> 16);
						@Pc(295) int local295 = local283 & 0xFFFF;
						Static235.anIntArray373[local154] = local295;
						if (Static178.aClass11_Sub4_Sub14Array4[local154] != null) {
							local137 |= Static178.aClass11_Sub4_Sub14Array4[local154].method4230(local295);
							local135 |= Static178.aClass11_Sub4_Sub14Array4[local154].method4229(local295);
						}
					} else {
						Static288.anIntArray444[local154] = 0;
						Static275.anIntArray422[local154] = 0;
						Static178.aClass11_Sub4_Sub14Array4[local154] = null;
						Static235.anIntArray373[local154] = -1;
					}
				}
			}
		}
		@Pc(331) int local331 = -1;
		local185 = -1;
		local190 = 0;
		@Pc(337) Class11_Sub4_Sub14 local337 = null;
		@Pc(339) Class11_Sub4_Sub14 local339 = null;
		@Pc(341) int local341 = -1;
		@Pc(343) int local343 = -1;
		@Pc(345) int local345 = 0;
		@Pc(347) Class11_Sub4_Sub14 local347 = null;
		@Pc(349) Class11_Sub4_Sub14 local349 = null;
		if (local145) {
			local30 = arg1 | 0x20;
			@Pc(366) int local366;
			@Pc(420) int local420;
			if (arg2 != null) {
				local331 = arg2.anIntArray191[arg5];
				local366 = local331 >>> 16;
				local331 &= 0xFFFF;
				local337 = Static36.method537(local366);
				if (local337 != null) {
					local137 |= local337.method4230(local331);
					local135 |= local337.method4229(local331);
				}
				if ((arg2.aBoolean188 || Static256.aBoolean339) && arg0 != -1 && arg0 < arg2.anIntArray191.length) {
					local185 = arg2.anIntArray191[arg0];
					local190 = arg2.anIntArray190[arg5];
					local420 = local185 >>> 16;
					local339 = local366 == local420 ? local337 : Static36.method537(local420);
					local185 &= 0xFFFF;
					if (local339 != null) {
						local137 |= local339.method4230(local185);
						local135 |= local339.method4229(local185);
					}
				}
			}
			if (arg10 != null) {
				local341 = arg10.anIntArray191[arg7];
				local366 = local341 >>> 16;
				local341 &= 0xFFFF;
				local347 = Static36.method537(local366);
				if (local347 != null) {
					local137 |= local347.method4230(local341);
					local135 |= local347.method4229(local341);
				}
				if ((arg10.aBoolean188 || Static256.aBoolean339) && arg3 != -1 && arg3 < arg10.anIntArray191.length) {
					local345 = arg10.anIntArray190[arg7];
					local343 = arg10.anIntArray191[arg3];
					local420 = local343 >>> 16;
					local343 &= 0xFFFF;
					local349 = local366 == local420 ? local347 : Static36.method537(local420);
					if (local349 != null) {
						local137 |= local349.method4230(local343);
						local135 |= local349.method4229(local343);
					}
				}
			}
			if (local137) {
				local30 |= 0x80;
			}
			if (local135) {
				local30 |= 0x100;
			}
		}
		@Pc(563) Class26 local563 = Static196.aClass26_38;
		@Pc(571) Class126 local571;
		synchronized (Static196.aClass26_38) {
			local571 = (Class126) Static196.aClass26_38.method332(local33);
		}
		@Pc(579) Class55 local579 = null;
		if (this.anInt4277 != -1) {
			local579 = Static157.method2529(this.anInt4277);
		}
		@Pc(618) int local618;
		@Pc(624) int local624;
		if (local571 == null || arg6.method4938(local571.method3142(), local30) != 0 || local579 != null && local579.anIntArrayArray5 != null && this.anIntArrayArray49 == null) {
			if (local571 != null) {
				local30 = arg6.method4989(local30, local571.method3142());
			}
			@Pc(616) boolean local616 = false;
			local618 = 0;
			while (true) {
				if (local618 >= 12) {
					if (local616) {
						if (this.aLong121 != -1L) {
							@Pc(1237) Class26 local1237 = Static196.aClass26_38;
							synchronized (Static196.aClass26_38) {
								local571 = (Class126) Static196.aClass26_38.method332(this.aLong121);
							}
						}
						if (local571 == null || arg6.method4938(local571.method3142(), local30) != 0 || local579 != null && local579.anIntArrayArray5 != null && this.anIntArrayArray49 == null) {
							return null;
						}
					} else {
						@Pc(667) Class31[] local667 = new Class31[12];
						@Pc(675) int local675;
						for (@Pc(669) int local669 = 0; local669 < 12; local669++) {
							local675 = local36[local669];
							@Pc(692) Class31 local692;
							if ((local675 & 0x40000000) != 0) {
								local692 = Static283.method4717(local675 & 0x3FFFFFFF).method4541(this.aBoolean288);
								if (local692 != null) {
									local667[local669] = local692;
								}
							} else if ((local675 & Integer.MIN_VALUE) != 0) {
								local692 = Static32.method460(local675 & 0x3FFFFFFF).method25();
								if (local692 != null) {
									local667[local669] = local692;
								}
							}
						}
						@Pc(751) int local751;
						if (local579 != null && local579.anIntArrayArray5 != null) {
							for (local675 = 0; local675 < local579.anIntArrayArray5.length; local675++) {
								if (local579.anIntArrayArray5[local675] != null && local667[local675] != null) {
									local751 = local579.anIntArrayArray5[local675][0];
									@Pc(758) int local758 = local579.anIntArrayArray5[local675][1];
									@Pc(765) int local765 = local579.anIntArrayArray5[local675][2];
									@Pc(774) int local774 = local579.anIntArrayArray5[local675][3] << 3;
									@Pc(783) int local783 = local579.anIntArrayArray5[local675][4] << 3;
									@Pc(792) int local792 = local579.anIntArrayArray5[local675][5] << 3;
									if (this.anIntArrayArray49 == null) {
										this.anIntArrayArray49 = new int[local579.anIntArrayArray5.length][];
									}
									if (this.anIntArrayArray49[local675] == null) {
										@Pc(814) int[] local814 = this.anIntArrayArray49[local675] = new int[15];
										if (local774 == 0 && local783 == 0 && local792 == 0) {
											local814[0] = local814[4] = local814[8] = 32768;
											local814[13] = -local758;
											local814[14] = -local765;
											local814[12] = -local751;
										} else {
											@Pc(824) int local824 = anIntArray329[local774];
											@Pc(828) int local828 = anIntArray330[local774];
											@Pc(832) int local832 = anIntArray329[local783];
											@Pc(836) int local836 = anIntArray330[local783];
											@Pc(840) int local840 = anIntArray329[local792];
											@Pc(844) int local844 = anIntArray330[local792];
											@Pc(852) int local852 = local828 * local840 + 16384 >> 15;
											@Pc(860) int local860 = local828 * local844 + 16384 >> 15;
											local814[2] = local836 * local824 + 16384 >> 15;
											local814[0] = local832 * local840 + local836 * local860 + 16384 >> 15;
											local814[6] = local860 * local832 + -local836 * local840 + 16384 >> 15;
											local814[7] = -local844 * -local836 + local852 * local832 + 16384 >> 15;
											local814[4] = local824 * local840 + 16384 >> 15;
											local814[5] = -local828;
											local814[8] = local824 * local832 + 16384 >> 15;
											local814[1] = -local844 * local832 + local836 * local852 + 16384 >> 15;
											local814[3] = local844 * local824 + 16384 >> 15;
											local814[14] = local814[2] * -local751 + -local758 * local814[5] + local814[8] * -local765 + 16384 >> 15;
											local814[13] = local814[1] * -local751 + -local758 * local814[4] + local814[7] * -local765 + 16384 >> 15;
											local814[12] = local814[6] * -local765 + -local758 * local814[3] + -local751 * local814[0] + 16384 >> 15;
										}
										local814[11] = local765;
										local814[9] = local751;
										local814[10] = local758;
									}
									if (local774 != 0 || local783 != 0 || local792 != 0) {
										local667[local675].method437(local783, local774, local792);
									}
									if (local751 != 0 || local758 != 0 || local765 != 0) {
										local667[local675].method436(local758, local765, local751);
									}
								}
							}
						}
						@Pc(1131) Class31 local1131 = new Class31(local667, local667.length);
						@Pc(1135) int local1135 = local30 | 0x2000;
						local571 = arg6.method4929(local1131, local1135, Static235.anInt4734, 64, 850);
						for (local751 = 0; local751 < 5; local751++) {
							if (Static229.aShortArrayArray12[local751].length > this.anIntArray328[local751]) {
								local571.method3162(Static307.aShortArray92[local751], Static229.aShortArrayArray12[local751][this.anIntArray328[local751]]);
							}
							if (Static169.aShortArrayArray16[local751].length > this.anIntArray328[local751]) {
								local571.method3162(Static45.aShortArray38[local751], Static169.aShortArrayArray16[local751][this.anIntArray328[local751]]);
							}
						}
						local571.method3143(local30);
						@Pc(1210) Class26 local1210 = Static196.aClass26_38;
						synchronized (Static196.aClass26_38) {
							Static196.aClass26_38.method330(local33, local571);
						}
						this.aLong121 = local33;
					}
					break;
				}
				local624 = local36[local618];
				if ((local624 & 0x40000000) == 0) {
					if ((local624 & Integer.MIN_VALUE) != 0 && !Static32.method460(local624 & 0x3FFFFFFF).method21()) {
						local616 = true;
					}
				} else if (!Static283.method4717(local624 & 0x3FFFFFFF).method4526(this.aBoolean288)) {
					local616 = true;
				}
				local618++;
			}
		}
		@Pc(1279) Class126 local1279 = local571.method3158((byte) 1, local30, true);
		if (!local145) {
			return local1279;
		}
		@Pc(1285) int local1285 = 0;
		local618 = 1;
		while (local1285 < local152) {
			if (Static13.aClass11_Sub4_Sub14Array1[local1285] != null) {
				local1279.method3132(Static119.anIntArray157[local1285], Static178.aClass11_Sub4_Sub14Array4[local1285], Static13.aClass11_Sub4_Sub14Array1[local1285], Static275.anIntArray422[local1285] - 1, Static288.anIntArray444[local1285], Static235.anIntArray373[local1285], this.anIntArrayArray49 == null ? null : this.anIntArrayArray49[local1285], false, local618);
			}
			local1285++;
			local618 <<= 0x1;
		}
		if (local337 != null && local347 != null) {
			local1279.method3123(arg2.aBooleanArray15, local331, local341, local347, arg9 - 1, local343, local337, local349, local185, local339, arg8 - 1, local190, local345, false);
		} else if (local337 != null) {
			local1279.method3144(local185, local337, false, local331, local339, 0, local190, arg9 - 1);
		} else if (local347 != null) {
			local1279.method3144(local343, local347, false, local341, local349, 0, local345, arg8 - 1);
		}
		for (local624 = 0; local624 < local152; local624++) {
			Static13.aClass11_Sub4_Sub14Array1[local624] = null;
			Static178.aClass11_Sub4_Sub14Array4[local624] = null;
			Static69.aClass111Array1[local624] = null;
		}
		return local1279;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	private void method3755() {
		this.aLong122 = -1L;
		@Pc(10) long[] local10 = Class27_Sub4.aLongArray9;
		this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) ((this.aLong122 ^ (long) (this.anInt4277 >> 8)) & 0xFFL)];
		this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) ((this.aLong122 ^ (long) this.anInt4277) & 0xFFL)];
		for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
			this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) ((this.aLong122 ^ (long) (this.anIntArray327[local55] >> 24)) & 0xFFL)];
			this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) (((long) (this.anIntArray327[local55] >> 16) ^ this.aLong122) & 0xFFL)];
			this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) ((this.aLong122 ^ (long) (this.anIntArray327[local55] >> 8)) & 0xFFL)];
			this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) ((this.aLong122 ^ (long) this.anIntArray327[local55]) & 0xFFL)];
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong122 = local10[(int) (((long) this.anIntArray328[local149] ^ this.aLong122) & 0xFFL)] ^ this.aLong122 >>> 8;
		}
		this.aLong122 = this.aLong122 >>> 8 ^ local10[(int) (((long) (this.aBoolean288 ? 1 : 0) ^ this.aLong122) & 0xFFL)];
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILclient!jm;IILclient!uo;I)Lclient!mj;")
	public Class126 method3756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class111 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class129 arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg5.anIntArray191[arg2];
			local36 = local32 >>> 16;
			@Pc(40) int local40 = local32 & 0xFFFF;
			@Pc(44) Class11_Sub4_Sub14 local44 = Static36.method537(local36);
			if (local44 != null) {
				local13 = local44.method4230(local40) | false;
				local11 = local44.method4229(local40) | false;
				local15 = arg5.aBoolean186 | false;
			}
			if ((arg5.aBoolean188 || Static256.aBoolean339) && arg6 != -1 && arg5.anIntArray191.length > arg6) {
				@Pc(84) int local84 = arg5.anIntArray191[arg6];
				@Pc(88) int local88 = local84 >>> 16;
				@Pc(92) int local92 = local84 & 0xFFFF;
				@Pc(101) Class11_Sub4_Sub14 local101;
				if (local88 == local36) {
					local101 = local44;
				} else {
					local101 = Static36.method537(local92 >>> 16);
				}
				if (local101 != null) {
					local13 |= local101.method4230(local92);
					local11 |= local101.method4229(local92);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(151) long local151 = (long) (arg1 << 16) | (long) arg3 << 32 | (long) arg0;
		@Pc(153) Class26 local153 = Static281.aClass26_51;
		@Pc(180) Class126 local180;
		synchronized (Static281.aClass26_51) {
			local180 = (Class126) Static281.aClass26_51.method332(local151);
		}
		if (local180 == null || arg7.method4938(local180.method3142(), local7) != 0) {
			if (local180 != null) {
				local7 = arg7.method4989(local7, local180.method3142());
			}
			@Pc(210) Class31[] local210 = new Class31[3];
			@Pc(212) int local212 = 0;
			if (!Static32.method460(arg0).method24() || !Static32.method460(arg1).method24() || !Static32.method460(arg3).method24()) {
				return null;
			}
			@Pc(240) Class31 local240 = Static32.method460(arg0).method27();
			if (local240 != null) {
				local212++;
				local210[0] = local240;
			}
			local240 = Static32.method460(arg1).method27();
			if (local240 != null) {
				local210[local212++] = local240;
			}
			local240 = Static32.method460(arg3).method27();
			if (local240 != null) {
				local210[local212++] = local240;
			}
			local32 = local7 | 0x2000;
			local240 = new Class31(local210, local212);
			local180 = arg7.method4929(local240, local32, Static235.anInt4734, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray328[local36] < Static229.aShortArrayArray12[local36].length) {
					local180.method3162(Static307.aShortArray92[local36], Static229.aShortArrayArray12[local36][this.anIntArray328[local36]]);
				}
				if (Static169.aShortArrayArray16[local36].length > this.anIntArray328[local36]) {
					local180.method3162(Static45.aShortArray38[local36], Static169.aShortArrayArray16[local36][this.anIntArray328[local36]]);
				}
			}
			local180.method3143(local7);
			@Pc(356) Class26 local356 = Static281.aClass26_51;
			synchronized (Static281.aClass26_51) {
				Static281.aClass26_51.method330(local151, local180);
			}
		}
		if (arg5 == null) {
			return local180;
		} else {
			local180 = local180.method3158((byte) 1, local7, true);
			return arg5.method2272(1024, arg4, arg2, arg6, local180);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!jm;ILclient!uo;IB)Lclient!mj;")
	public Class126 method3758(@OriginalArg(1) int arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class129 arg3, @OriginalArg(5) int arg4) {
		if (this.anInt4279 != -1) {
			return Static156.method2516(this.anInt4279).method1565(arg2, arg1, arg3, arg4, arg0);
		}
		@Pc(29) int local29 = 1024;
		@Pc(37) boolean local37;
		@Pc(48) int local48;
		@Pc(105) int local105;
		@Pc(58) int local58;
		@Pc(109) int local109;
		if (arg1 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			local48 = arg1.anIntArray191[arg2];
			local29 = 1056;
			local58 = local48 >>> 16;
			@Pc(62) Class11_Sub4_Sub14 local62 = Static36.method537(local58);
			@Pc(66) int local66 = local48 & 0xFFFF;
			if (local62 != null) {
				local35 = local62.method4230(local66) | false;
				local33 = local62.method4229(local66) | false;
				local37 = arg1.aBoolean186 | false;
			}
			if ((arg1.aBoolean188 || Static256.aBoolean339) && arg4 != -1 && arg1.anIntArray191.length > arg4) {
				local105 = arg1.anIntArray191[arg4];
				local109 = local105 >>> 16;
				@Pc(118) Class11_Sub4_Sub14 local118 = local109 == local58 ? local62 : Static36.method537(local109);
				@Pc(122) int local122 = local105 & 0xFFFF;
				if (local118 != null) {
					local35 |= local118.method4230(local122);
					local33 |= local118.method4229(local122);
				}
			}
			if (local35) {
				local29 = 1184;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
		}
		@Pc(158) Class26 local158 = Static281.aClass26_51;
		@Pc(167) Class126 local167;
		synchronized (Static281.aClass26_51) {
			local167 = (Class126) Static281.aClass26_51.method332(this.aLong122);
		}
		if (local167 == null || arg3.method4938(local167.method3142(), local29) != 0) {
			if (local167 != null) {
				local29 = arg3.method4989(local29, local167.method3142());
			}
			local37 = false;
			for (local48 = 0; local48 < 12; local48++) {
				local105 = this.anIntArray327[local48];
				if ((local105 & 0x40000000) == 0) {
					if ((local105 & Integer.MIN_VALUE) != 0 && !Static32.method460(local105 & 0x3FFFFFFF).method24()) {
						local37 = true;
					}
				} else if (!Static283.method4717(local105 & 0x3FFFFFFF).method4531(this.aBoolean288)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(251) Class31[] local251 = new Class31[12];
			@Pc(253) int local253 = 0;
			for (@Pc(255) int local255 = 0; local255 < 12; local255++) {
				local58 = this.anIntArray327[local255];
				@Pc(281) Class31 local281;
				if ((local58 & 0x40000000) != 0) {
					local281 = Static283.method4717(local58 & 0x3FFFFFFF).method4542(this.aBoolean288);
					if (local281 != null) {
						local251[local253++] = local281;
					}
				} else if ((local58 & Integer.MIN_VALUE) != 0) {
					local281 = Static32.method460(local58 & 0x3FFFFFFF).method27();
					if (local281 != null) {
						local251[local253++] = local281;
					}
				}
			}
			@Pc(321) Class31 local321 = new Class31(local251, local253);
			@Pc(325) int local325 = local29 | 0x2000;
			local167 = arg3.method4929(local321, local325, Static235.anInt4734, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (Static229.aShortArrayArray12[local109].length > this.anIntArray328[local109]) {
					local167.method3162(Static307.aShortArray92[local109], Static229.aShortArrayArray12[local109][this.anIntArray328[local109]]);
				}
				if (Static169.aShortArrayArray16[local109].length > this.anIntArray328[local109]) {
					local167.method3162(Static45.aShortArray38[local109], Static169.aShortArrayArray16[local109][this.anIntArray328[local109]]);
				}
			}
			local167.method3143(local29);
			@Pc(398) Class26 local398 = Static281.aClass26_51;
			synchronized (Static281.aClass26_51) {
				Static281.aClass26_51.method330(this.aLong122, local167);
			}
		}
		if (arg1 == null) {
			return local167;
		} else {
			local167.method3158((byte) 1, local29, true);
			return arg1.method2272(1024, arg0, arg2, arg4, local167);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V")
	public void method3759(@OriginalArg(1) boolean arg0) {
		this.aBoolean288 = arg0;
		this.method3755();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BII)V")
	public void method3760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray328[arg1] = arg0;
		this.method3755();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([II[IZII)V")
	public void method3762(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg4 != this.anInt4277) {
			this.anInt4277 = arg4;
			this.anIntArrayArray49 = null;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static124.anInt2297; local30++) {
					@Pc(36) Class6 local36 = Static32.method460(local30);
					if (local36 != null && !local36.aBoolean1 && local36.anInt25 == (arg3 ? Static345.anIntArray544[local26] : Static349.anIntArray545[local26])) {
						arg2[Static350.anIntArray546[local26]] = local30 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.aBoolean288 = arg3;
		this.anInt4279 = arg1;
		this.anIntArray328 = arg0;
		this.anIntArray327 = arg2;
		this.method3755();
	}
}
