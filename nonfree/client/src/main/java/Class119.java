import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class119 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "[I")
	private int[] anIntArray302;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	public int anInt3701;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Z")
	public boolean aBoolean258;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	public void method3021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static265.anIntArray458[arg1];
		if (this.anIntArray302[local7] != 0 && Static194.method3155(arg0) != null) {
			this.anIntArray302[local7] = arg0 | Integer.MIN_VALUE;
			this.method3022();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	private void method3022() {
		@Pc(8) long local8 = this.aLong144;
		@Pc(10) long[] local10 = Class61.aLongArray39;
		this.aLong144 = -1L;
		this.aLong144 = local10[(int) (((long) (this.anInt3707 >> 8) ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
		this.aLong144 = this.aLong144 >>> 8 ^ local10[(int) ((this.aLong144 ^ (long) this.anInt3707) & 0xFFL)];
		@Pc(53) int local53;
		for (local53 = 0; local53 < 12; local53++) {
			this.aLong144 = this.aLong144 >>> 8 ^ local10[(int) ((this.aLong144 ^ (long) (this.anIntArray302[local53] >> 24)) & 0xFFL)];
			this.aLong144 = local10[(int) (((long) (this.anIntArray302[local53] >> 16) ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
			this.aLong144 = local10[(int) (((long) (this.anIntArray302[local53] >> 8) ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
			this.aLong144 = local10[(int) (((long) this.anIntArray302[local53] ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
		}
		for (local53 = 0; local53 < 5; local53++) {
			this.aLong144 = local10[(int) (((long) this.anIntArray303[local53] ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
		}
		this.aLong144 = local10[(int) (((long) (this.aBoolean258 ? 1 : 0) ^ this.aLong144) & 0xFFL)] ^ this.aLong144 >>> 8;
		if (local8 != 0L && this.aLong144 != local8) {
			Static272.aClass169_144.method4015(local8);
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)V")
	public void method3023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray303[arg0] = arg1;
		this.method3022();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)I")
	public int method3024() {
		return this.anInt3701 == -1 ? (this.anIntArray303[0] << 25) - (-(this.anIntArray303[4] << 20) - (this.anIntArray302[0] << 15) - (this.anIntArray302[8] << 10) + (-(this.anIntArray302[11] << 5) - this.anIntArray302[1])) : 305419896 - -Static195.method3169(this.anInt3701).anInt3514;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([IZB[III)V")
	public void method3025(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt3707 != arg4) {
			this.anInt3707 = arg4;
			this.anIntArrayArray25 = null;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(28) int local28 = 0; local28 < 8; local28++) {
				for (@Pc(33) int local33 = 0; local33 < Static19.anInt384; local33++) {
					@Pc(40) Class66 local40 = Static194.method3155(local33);
					if (local40 != null && !local40.aBoolean138 && local40.anInt1768 == (arg1 ? Static247.anIntArray445[local28] : Static241.anIntArray437[local28])) {
						arg2[Static265.anIntArray458[local28]] = Integer.MIN_VALUE | local33;
						break;
					}
				}
			}
		}
		this.aBoolean258 = arg1;
		this.anInt3701 = arg3;
		this.anIntArray303 = arg0;
		this.anIntArray302 = arg2;
		this.method3022();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!tc;IIIIII)Lclient!hc;")
	public Class22_Sub4 method3026(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) (arg4 << 16) | (long) arg5 << 32 | (long) arg6;
		@Pc(24) Class22_Sub4 local24 = (Class22_Sub4) Static296.aClass169_155.method4017(local18);
		if (local24 == null) {
			@Pc(30) Class22_Sub7[] local30 = new Class22_Sub7[3];
			@Pc(32) int local32 = 0;
			if (!Static194.method3155(arg6).method1370() || !Static194.method3155(arg4).method1370() || !Static194.method3155(arg5).method1370()) {
				return null;
			}
			@Pc(58) Class22_Sub7 local58 = Static194.method3155(arg6).method1372();
			if (local58 != null) {
				local32++;
				local30[0] = local58;
			}
			local58 = Static194.method3155(arg4).method1372();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = Static194.method3155(arg5).method1372();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = new Class22_Sub7(local30, local32);
			for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
				if (Static313.aShortArrayArray42[local102].length > this.anIntArray303[local102]) {
					local58.method4080(Static99.aShortArray21[local102], Static313.aShortArrayArray42[local102][this.anIntArray303[local102]]);
				}
				if (this.anIntArray303[local102] < Static175.aShortArrayArray23[local102].length) {
					local58.method4080(Static235.aShortArray70[local102], Static175.aShortArrayArray23[local102][this.anIntArray303[local102]]);
				}
			}
			local24 = local58.method4097(64, 768, -50, -10, -50);
			Static296.aClass169_155.method4016(local24, local18);
		}
		if (arg1 != null) {
			local24 = arg1.method3968(local24, arg3, arg2, arg0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
	public void method3028(@OriginalArg(0) boolean arg0) {
		this.aBoolean258 = arg0;
		this.method3022();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIILclient!tc;)Lclient!hc;")
	public Class22_Sub4 method3029(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3) {
		if (this.anInt3701 != -1) {
			return Static195.method3169(this.anInt3701).method2818(arg0, arg2, arg3, arg1);
		}
		@Pc(32) Class22_Sub4 local32 = (Class22_Sub4) Static296.aClass169_155.method4017(this.aLong144);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			@Pc(46) int local46;
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				local46 = this.anIntArray302[local38];
				if ((local46 & 0x40000000) == 0) {
					if ((local46 & Integer.MIN_VALUE) != 0 && !Static194.method3155(local46 & 0x3FFFFFFF).method1370()) {
						local36 = true;
					}
				} else if (!Static271.method4006(local46 & 0x3FFFFFFF).method3739(this.aBoolean258)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(92) Class22_Sub7[] local92 = new Class22_Sub7[12];
			local46 = 0;
			@Pc(104) int local104;
			for (@Pc(96) int local96 = 0; local96 < 12; local96++) {
				local104 = this.anIntArray302[local96];
				@Pc(123) Class22_Sub7 local123;
				if ((local104 & 0x40000000) != 0) {
					local123 = Static271.method4006(local104 & 0x3FFFFFFF).method3730(this.aBoolean258);
					if (local123 != null) {
						local92[local46++] = local123;
					}
				} else if ((Integer.MIN_VALUE & local104) != 0) {
					local123 = Static194.method3155(local104 & 0x3FFFFFFF).method1372();
					if (local123 != null) {
						local92[local46++] = local123;
					}
				}
			}
			@Pc(160) Class22_Sub7 local160 = new Class22_Sub7(local92, local46);
			for (local104 = 0; local104 < 5; local104++) {
				if (this.anIntArray303[local104] < Static313.aShortArrayArray42[local104].length) {
					local160.method4080(Static99.aShortArray21[local104], Static313.aShortArrayArray42[local104][this.anIntArray303[local104]]);
				}
				if (this.anIntArray303[local104] < Static175.aShortArrayArray23[local104].length) {
					local160.method4080(Static235.aShortArray70[local104], Static175.aShortArrayArray23[local104][this.anIntArray303[local104]]);
				}
			}
			local32 = local160.method4097(64, 768, -50, -10, -50);
			Static296.aClass169_155.method4016(local32, this.aLong144);
		}
		if (arg3 != null) {
			local32 = arg3.method3968(local32, arg0, arg2, arg1);
		}
		return local32;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!tc;IIIIII[Lclient!fi;IZLclient!tc;Z)Lclient!hc;")
	public Class22_Sub4 method3030(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class53[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class167 arg9, @OriginalArg(11) boolean arg10) {
		if (this.anInt3701 != -1) {
			return Static195.method3169(this.anInt3701).method2824(arg6, arg2, arg9, arg5, arg1, arg7, arg0, arg3, arg4);
		}
		@Pc(28) long local28 = this.aLong144;
		@Pc(31) int[] local31 = this.anIntArray302;
		if (arg0 != null && (arg0.anInt5133 >= 0 || arg0.anInt5132 >= 0)) {
			local31 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local31[local49] = this.anIntArray302[local49];
			}
			if (arg0.anInt5133 >= 0) {
				if (arg0.anInt5133 == 65535) {
					local28 ^= 0xFFFFFFFF00000000L;
					local31[5] = 0;
				} else {
					local31[5] = arg0.anInt5133 | 0x40000000;
					local28 ^= (long) local31[5] << 32;
				}
			}
			if (arg0.anInt5132 >= 0) {
				if (arg0.anInt5132 == 65535) {
					local31[3] = 0;
					local28 ^= 0xFFFFFFFFL;
				} else {
					local31[3] = arg0.anInt5132 | 0x40000000;
					local28 ^= local31[3];
				}
			}
		}
		@Pc(135) Class22_Sub4 local135 = (Class22_Sub4) Static272.aClass169_144.method4017(local28);
		@Pc(140) boolean local140;
		@Pc(336) int local336;
		@Pc(329) int local329;
		@Pc(343) int local343;
		@Pc(350) int local350;
		@Pc(357) int local357;
		@Pc(400) int local400;
		@Pc(406) int local406;
		@Pc(412) int local412;
		@Pc(430) int local430;
		@Pc(468) int local468;
		@Pc(322) int local322;
		if (local135 == null) {
			local140 = false;
			@Pc(151) int local151;
			for (@Pc(142) int local142 = 0; local142 < 12; local142++) {
				local151 = local31[local142];
				if ((local151 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local151) != 0 && !Static194.method3155(local151 & 0x3FFFFFFF).method1369()) {
						local140 = true;
					}
				} else if (!Static271.method4006(local151 & 0x3FFFFFFF).method3745(this.aBoolean258)) {
					local140 = true;
				}
			}
			if (local140) {
				if (this.aLong145 != -1L) {
					local135 = (Class22_Sub4) Static272.aClass169_144.method4017(this.aLong145);
				}
				if (local135 == null) {
					return null;
				}
			}
			if (local135 == null) {
				@Pc(217) Class22_Sub7[] local217 = new Class22_Sub7[12];
				@Pc(228) int local228;
				for (local151 = 0; local151 < 12; local151++) {
					local228 = local31[local151];
					@Pc(249) Class22_Sub7 local249;
					if ((local228 & 0x40000000) != 0) {
						local249 = Static271.method4006(local228 & 0x3FFFFFFF).method3735(this.aBoolean258);
						if (local249 != null) {
							local217[local151] = local249;
						}
					} else if ((Integer.MIN_VALUE & local228) != 0) {
						local249 = Static194.method3155(local228 & 0x3FFFFFFF).method1371();
						if (local249 != null) {
							local217[local151] = local249;
						}
					}
				}
				@Pc(280) Class78 local280 = null;
				if (this.anInt3707 != -1) {
					local280 = Static223.method3508(this.anInt3707);
				}
				if (local280 != null && local280.anIntArrayArray13 != null) {
					for (local228 = 0; local228 < local280.anIntArrayArray13.length; local228++) {
						if (local280.anIntArrayArray13[local228] != null && local217[local228] != null) {
							local322 = local280.anIntArrayArray13[local228][0];
							local329 = local280.anIntArrayArray13[local228][2];
							local336 = local280.anIntArrayArray13[local228][1];
							local343 = local280.anIntArrayArray13[local228][3];
							local350 = local280.anIntArrayArray13[local228][4];
							local357 = local280.anIntArrayArray13[local228][5];
							if (this.anIntArrayArray25 == null) {
								this.anIntArrayArray25 = new int[local280.anIntArrayArray13.length][];
							}
							if (this.anIntArrayArray25[local228] == null) {
								@Pc(381) int[] local381 = this.anIntArrayArray25[local228] = new int[15];
								if (local343 == 0 && local350 == 0 && local357 == 0) {
									local381[12] = -local322;
									local381[13] = -local336;
									local381[0] = local381[4] = local381[8] = 32768;
									local381[14] = -local329;
								} else {
									local400 = Class17.anIntArray24[local343] >> 1;
									local406 = Class17.anIntArray22[local343] >> 1;
									local412 = Class17.anIntArray24[local357] >> 1;
									@Pc(418) int local418 = Class17.anIntArray24[local350] >> 1;
									@Pc(424) int local424 = Class17.anIntArray22[local350] >> 1;
									local430 = Class17.anIntArray22[local357] >> 1;
									local381[8] = local418 * local400 + 16384 >> 15;
									local381[2] = local424 * local400 + 16384 >> 15;
									local381[4] = local400 * local412 + 16384 >> 15;
									local468 = local412 * local406 + 16384 >> 15;
									local381[5] = -local406;
									local381[3] = local430 * local400 + 16384 >> 15;
									local381[7] = -local430 * -local424 + local418 * local468 + 16384 >> 15;
									local381[1] = local468 * local424 + -local430 * local418 + 16384 >> 15;
									local381[14] = local381[2] * -local322 + local381[5] * -local336 + -local329 * local381[8] + 16384 >> 15;
									local381[13] = -local322 * local381[1] + local381[4] * -local336 + local381[7] * -local329 + 16384 >> 15;
									@Pc(578) int local578 = local430 * local406 + 16384 >> 15;
									local381[0] = local418 * local412 + local578 * local424 + 16384 >> 15;
									local381[6] = local412 * -local424 + local578 * local418 + 16384 >> 15;
									local381[12] = local381[6] * -local329 + local381[3] * -local336 + -local322 * local381[0] + 16384 >> 15;
								}
								local381[11] = local329;
								local381[9] = local322;
								local381[10] = local336;
							}
							if (local343 != 0 || local350 != 0 || local357 != 0) {
								local217[local228].method4092(local343, local350, local357);
							}
							if (local322 != 0 || local336 != 0 || local329 != 0) {
								local217[local228].method4079(local322, local336, local329);
							}
						}
					}
				}
				@Pc(725) Class22_Sub7 local725 = new Class22_Sub7(local217, local217.length);
				for (local322 = 0; local322 < 5; local322++) {
					if (Static313.aShortArrayArray42[local322].length > this.anIntArray303[local322]) {
						local725.method4080(Static99.aShortArray21[local322], Static313.aShortArrayArray42[local322][this.anIntArray303[local322]]);
					}
					if (this.anIntArray303[local322] < Static175.aShortArrayArray23[local322].length) {
						local725.method4080(Static235.aShortArray70[local322], Static175.aShortArrayArray23[local322][this.anIntArray303[local322]]);
					}
				}
				local135 = local725.method4097(64, 850, -30, -50, -30);
				if (Static291.aBoolean404) {
					((Class22_Sub4_Sub1) local135).method1592(false, false, true, false, false, true);
				}
				if (arg10) {
					Static272.aClass169_144.method4016(local135, local28);
					this.aLong145 = local28;
				}
			}
		}
		local140 = false;
		@Pc(821) boolean local821 = false;
		local322 = arg6 == null ? 0 : arg6.length;
		@Pc(830) boolean local830 = false;
		@Pc(832) boolean local832 = false;
		@Pc(972) int local972;
		for (local336 = 0; local336 < local322; local336++) {
			if (arg6[local336] != null) {
				@Pc(855) Class167 local855 = Static313.method4648(arg6[local336].anInt1420);
				if (local855.anIntArray461 != null) {
					local140 = true;
					Static204.aClass167Array1[local336] = local855;
					local350 = arg6[local336].anInt1421;
					local343 = arg6[local336].anInt1422;
					local357 = local855.anIntArray461[local343];
					Static183.aClass1_Sub1_Sub24Array3[local336] = Static270.method3983(local357 >>> 16);
					local357 &= 0xFFFF;
					Static267.anIntArray466[local336] = local357;
					if (Static183.aClass1_Sub1_Sub24Array3[local336] != null) {
						local832 |= Static183.aClass1_Sub1_Sub24Array3[local336].method4484(local357);
						local830 |= Static183.aClass1_Sub1_Sub24Array3[local336].method4482(local357);
						local821 |= local855.aBoolean366;
					}
					if ((local855.aBoolean367 || Static110.aBoolean163) && local350 != -1 && local350 < local855.anIntArray461.length) {
						Static4.anIntArray6[local336] = local855.anIntArray463[local343];
						Static80.anIntArray122[local336] = arg6[local336].anInt1424;
						local972 = local855.anIntArray461[local350];
						Static195.aClass1_Sub1_Sub24Array4[local336] = Static270.method3983(local972 >>> 16);
						@Pc(984) int local984 = local972 & 0xFFFF;
						Static101.anIntArray167[local336] = local984;
						if (Static195.aClass1_Sub1_Sub24Array4[local336] != null) {
							local832 |= Static195.aClass1_Sub1_Sub24Array4[local336].method4484(local984);
							local830 |= Static195.aClass1_Sub1_Sub24Array4[local336].method4482(local984);
						}
					} else {
						Static4.anIntArray6[local336] = 0;
						Static80.anIntArray122[local336] = 0;
						Static195.aClass1_Sub1_Sub24Array4[local336] = null;
						Static101.anIntArray167[local336] = -1;
					}
				}
			}
		}
		if (local140 || arg0 != null || arg9 != null) {
			local336 = -1;
			local343 = 0;
			local329 = -1;
			@Pc(1045) Class1_Sub1_Sub24 local1045 = null;
			@Pc(1047) Class1_Sub1_Sub24 local1047 = null;
			if (arg0 != null) {
				local336 = arg0.anIntArray461[arg3];
				local972 = local336 >>> 16;
				local336 &= 0xFFFF;
				local1047 = Static270.method3983(local972);
				if (local1047 != null) {
					local832 |= local1047.method4484(local336);
					local830 |= local1047.method4482(local336);
					local821 |= arg0.aBoolean366;
				}
				if ((arg0.aBoolean367 || Static110.aBoolean163) && arg1 != -1 && arg1 < arg0.anIntArray461.length) {
					local343 = arg0.anIntArray463[arg3];
					local329 = arg0.anIntArray461[arg1];
					local400 = local329 >>> 16;
					local329 &= 0xFFFF;
					if (local972 == local400) {
						local1045 = local1047;
					} else {
						local1045 = Static270.method3983(local329 >>> 16);
					}
					if (local1045 != null) {
						local832 |= local1045.method4484(local329);
						local830 |= local1045.method4482(local329);
					}
				}
			}
			@Pc(1153) Class1_Sub1_Sub24 local1153 = null;
			local972 = -1;
			local406 = 0;
			local400 = -1;
			@Pc(1161) Class1_Sub1_Sub24 local1161 = null;
			if (arg9 != null) {
				local972 = arg9.anIntArray461[arg5];
				local412 = local972 >>> 16;
				local1153 = Static270.method3983(local412);
				local972 &= 0xFFFF;
				if (local1153 != null) {
					local832 |= local1153.method4484(local972);
					local830 |= local1153.method4482(local972);
					local821 |= arg9.aBoolean366;
				}
				if ((arg9.aBoolean367 || Static110.aBoolean163) && arg7 != -1 && arg9.anIntArray461.length > arg7) {
					local400 = arg9.anIntArray461[arg7];
					local406 = arg9.anIntArray463[arg5];
					local430 = local400 >>> 16;
					local400 &= 0xFFFF;
					if (local412 == local430) {
						local1161 = local1153;
					} else {
						local1161 = Static270.method3983(local400 >>> 16);
					}
					if (local1161 != null) {
						local832 |= local1161.method4484(local400);
						local830 |= local1161.method4482(local400);
					}
				}
			}
			@Pc(1288) Class22_Sub4 local1288 = local135.method3569(!local830, !local832, !local821);
			local430 = 0;
			local468 = 1;
			while (local322 > local430) {
				if (Static183.aClass1_Sub1_Sub24Array3[local430] != null) {
					local1288.method3562(Static183.aClass1_Sub1_Sub24Array3[local430], Static267.anIntArray466[local430], Static195.aClass1_Sub1_Sub24Array4[local430], Static101.anIntArray167[local430], Static80.anIntArray122[local430] - 1, Static4.anIntArray6[local430], local468, Static204.aClass167Array1[local430].aBoolean366, this.anIntArrayArray25[local430]);
				}
				local468 <<= 0x1;
				local430++;
			}
			if (local1047 != null && local1153 != null) {
				local1288.method3561(local1047, local336, local1045, local329, arg4 - 1, local343, local1153, local972, local1161, local400, arg2 - 1, local406, arg0.aBooleanArray54, arg9.aBoolean366 | arg0.aBoolean366);
			} else if (local1047 != null) {
				local1288.method3552(local1047, local336, local1045, local329, arg4 - 1, local343, arg0.aBoolean366);
			} else if (local1153 != null) {
				local1288.method3552(local1153, local972, local1161, local400, arg2 - 1, local406, arg9.aBoolean366);
			}
			for (local430 = 0; local430 < local322; local430++) {
				Static183.aClass1_Sub1_Sub24Array3[local430] = null;
				Static195.aClass1_Sub1_Sub24Array4[local430] = null;
				Static204.aClass167Array1[local430] = null;
			}
			return local1288;
		} else if (arg8) {
			return local135.method3569(false, false, false);
		} else {
			return local135;
		}
	}
}
