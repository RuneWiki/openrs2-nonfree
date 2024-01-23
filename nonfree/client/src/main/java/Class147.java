import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class147 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
	private int[] anIntArray545;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	private int anInt5301;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public int anInt5302;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!sh", name = "l", descriptor = "Z")
	public boolean aBoolean287;

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	public void method4161(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static161.anIntArray337[arg0];
		if (this.anIntArray545[local7] != 0 && Static281.method4663(arg1) != null) {
			this.anIntArray545[local7] = arg1 | Integer.MIN_VALUE;
			this.method4169();
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
	public void method4162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray546[arg0] = arg1;
		this.method4169();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!v;IIIIII)Lclient!lf;")
	public Class25_Sub2 method4163(@OriginalArg(1) Class163 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) arg4 | (long) arg2 << 32 | (long) (arg1 << 16);
		@Pc(24) Class25_Sub2 local24 = (Class25_Sub2) Static290.aClass155_47.method4358(local18);
		if (local24 == null) {
			@Pc(28) int local28 = 0;
			@Pc(31) Class25_Sub3[] local31 = new Class25_Sub3[3];
			if (!Static281.method4663(arg4).method388() || !Static281.method4663(arg1).method388() || !Static281.method4663(arg2).method388()) {
				return null;
			}
			@Pc(57) Class25_Sub3 local57 = Static281.method4663(arg4).method382();
			if (local57 != null) {
				local28++;
				local31[0] = local57;
			}
			local57 = Static281.method4663(arg1).method382();
			if (local57 != null) {
				local31[local28++] = local57;
			}
			local57 = Static281.method4663(arg2).method382();
			if (local57 != null) {
				local31[local28++] = local57;
			}
			local57 = new Class25_Sub3(local31, local28);
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				if (this.anIntArray546[local101] < Static202.aShortArrayArray8[local101].length) {
					local57.method2826(Static91.aShortArray43[local101], Static202.aShortArrayArray8[local101][this.anIntArray546[local101]]);
				}
				if (Static122.aShortArrayArray5[local101].length > this.anIntArray546[local101]) {
					local57.method2826(Static230.aShortArray80[local101], Static122.aShortArrayArray5[local101][this.anIntArray546[local101]]);
				}
			}
			local24 = local57.method2821(64, 768, -50, -10, -50);
			Static290.aClass155_47.method4360(local18, local24);
		}
		if (arg0 != null) {
			local24 = arg0.method4587(arg3, arg6, local24, arg5);
		}
		return local24;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	public int method4164() {
		return this.anInt5302 == -1 ? (this.anIntArray545[11] << 5) + (this.anIntArray546[0] << 25) + (this.anIntArray546[4] << 20) + (this.anIntArray545[0] << 15) + (this.anIntArray545[8] << 10) + this.anIntArray545[1] : Static38.method880(this.anInt5302).anInt5182 + 305419896;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lclient!kj;ZLclient!v;IIIIIZLclient!v;)Lclient!lf;")
	public Class25_Sub2 method4166(@OriginalArg(0) int arg0, @OriginalArg(1) Class86[] arg1, @OriginalArg(3) Class163 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class163 arg8) {
		if (this.anInt5302 != -1) {
			return Static38.method880(this.anInt5302).method4072(arg8, arg5, arg7, arg0, arg1, arg4, arg3, arg6, arg2);
		}
		@Pc(29) long local29 = this.aLong174;
		@Pc(32) int[] local32 = this.anIntArray545;
		if (arg2 != null && (arg2.anInt5924 >= 0 || arg2.anInt5902 >= 0)) {
			local32 = new int[12];
			for (@Pc(46) int local46 = 0; local46 < 12; local46++) {
				local32[local46] = this.anIntArray545[local46];
			}
			if (arg2.anInt5924 >= 0) {
				if (arg2.anInt5924 == 65535) {
					local32[5] = 0;
					local29 ^= 0xFFFFFFFF00000000L;
				} else {
					local32[5] = arg2.anInt5924 | 0x40000000;
					local29 ^= (long) local32[5] << 32;
				}
			}
			if (arg2.anInt5902 >= 0) {
				if (arg2.anInt5902 == 65535) {
					local29 ^= 0xFFFFFFFFL;
					local32[3] = 0;
				} else {
					local32[3] = arg2.anInt5902 | 0x40000000;
					local29 ^= local32[3];
				}
			}
		}
		@Pc(138) Class25_Sub2 local138 = (Class25_Sub2) Static275.aClass155_44.method4358(local29);
		@Pc(144) boolean local144;
		@Pc(344) int local344;
		@Pc(337) int local337;
		@Pc(330) int local330;
		@Pc(351) int local351;
		@Pc(358) int local358;
		@Pc(422) int local422;
		@Pc(434) int local434;
		@Pc(446) int local446;
		@Pc(452) int local452;
		@Pc(505) int local505;
		@Pc(323) int local323;
		if (local138 == null) {
			local144 = false;
			@Pc(153) int local153;
			for (@Pc(146) int local146 = 0; local146 < 12; local146++) {
				local153 = local32[local146];
				if ((local153 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local153) != 0 && !Static281.method4663(local153 & 0x3FFFFFFF).method389()) {
						local144 = true;
					}
				} else if (!Static238.method4099(local153 & 0x3FFFFFFF).method4013(this.aBoolean287)) {
					local144 = true;
				}
			}
			if (local144) {
				if (this.aLong173 != -1L) {
					local138 = (Class25_Sub2) Static275.aClass155_44.method4358(this.aLong173);
				}
				if (local138 == null) {
					return null;
				}
			}
			if (local138 == null) {
				@Pc(225) Class25_Sub3[] local225 = new Class25_Sub3[12];
				@Pc(236) int local236;
				for (local153 = 0; local153 < 12; local153++) {
					local236 = local32[local153];
					@Pc(251) Class25_Sub3 local251;
					if ((local236 & 0x40000000) != 0) {
						local251 = Static238.method4099(local236 & 0x3FFFFFFF).method4017(this.aBoolean287);
						if (local251 != null) {
							local225[local153] = local251;
						}
					} else if ((Integer.MIN_VALUE & local236) != 0) {
						local251 = Static281.method4663(local236 & 0x3FFFFFFF).method384();
						if (local251 != null) {
							local225[local153] = local251;
						}
					}
				}
				@Pc(284) Class124 local284 = null;
				if (this.anInt5301 != -1) {
					local284 = Static217.method3828(this.anInt5301);
				}
				if (local284 != null && local284.anIntArrayArray36 != null) {
					for (local236 = 0; local236 < local284.anIntArrayArray36.length; local236++) {
						if (local284.anIntArrayArray36[local236] != null && local225[local236] != null) {
							local323 = local284.anIntArrayArray36[local236][0];
							local330 = local284.anIntArrayArray36[local236][3];
							local337 = local284.anIntArrayArray36[local236][2];
							local344 = local284.anIntArrayArray36[local236][1];
							local351 = local284.anIntArrayArray36[local236][4];
							local358 = local284.anIntArrayArray36[local236][5];
							if (this.anIntArrayArray40 == null) {
								this.anIntArrayArray40 = new int[local284.anIntArrayArray36.length][];
							}
							if (this.anIntArrayArray40[local236] == null) {
								@Pc(380) int[] local380 = this.anIntArrayArray40[local236] = new int[15];
								if (local330 == 0 && local351 == 0 && local358 == 0) {
									local380[12] = -local323;
									local380[0] = local380[4] = local380[8] = 32768;
									local380[13] = -local344;
									local380[14] = -local337;
								} else {
									local422 = Class91.anIntArray320[local330] >> 1;
									@Pc(428) int local428 = Class91.anIntArray319[local351] >> 1;
									local434 = Class91.anIntArray319[local330] >> 1;
									@Pc(440) int local440 = Class91.anIntArray320[local351] >> 1;
									local446 = Class91.anIntArray320[local358] >> 1;
									local452 = Class91.anIntArray319[local358] >> 1;
									local380[4] = local422 * local446 + 16384 >> 15;
									local380[3] = local452 * local422 + 16384 >> 15;
									local380[2] = local428 * local422 + 16384 >> 15;
									local380[5] = -local434;
									local380[8] = local440 * local422 + 16384 >> 15;
									local505 = local446 * local434 + 16384 >> 15;
									local380[7] = -local452 * -local428 + local505 * local440 + 16384 >> 15;
									local380[1] = -local452 * local440 + local428 * local505 + 16384 >> 15;
									local380[13] = local380[7] * -local337 + -local323 * local380[1] + -local344 * local380[4] + 16384 >> 15;
									@Pc(572) int local572 = local452 * local434 + 16384 >> 15;
									local380[6] = local572 * local440 + -local428 * local446 + 16384 >> 15;
									local380[14] = -local337 * local380[8] + -local344 * local380[5] + local380[2] * -local323 + 16384 >> 15;
									local380[0] = local428 * local572 + local440 * local446 + 16384 >> 15;
									local380[12] = -local323 * local380[0] + local380[3] * -local344 + -local337 * local380[6] + 16384 >> 15;
								}
								local380[9] = local323;
								local380[11] = local337;
								local380[10] = local344;
							}
							if (local330 != 0 || local351 != 0 || local358 != 0) {
								local225[local236].method2805(local330, local351, local358);
							}
							if (local323 != 0 || local344 != 0 || local337 != 0) {
								local225[local236].method2823(local323, local344, local337);
							}
						}
					}
				}
				@Pc(712) Class25_Sub3 local712 = new Class25_Sub3(local225, local225.length);
				for (local323 = 0; local323 < 5; local323++) {
					if (this.anIntArray546[local323] < Static202.aShortArrayArray8[local323].length) {
						local712.method2826(Static91.aShortArray43[local323], Static202.aShortArrayArray8[local323][this.anIntArray546[local323]]);
					}
					if (Static122.aShortArrayArray5[local323].length > this.anIntArray546[local323]) {
						local712.method2826(Static230.aShortArray80[local323], Static122.aShortArrayArray5[local323][this.anIntArray546[local323]]);
					}
				}
				local138 = local712.method2821(64, 850, -30, -50, -30);
				if (Static296.aBoolean335) {
					((Class25_Sub2_Sub1) local138).method656(false, false, true, false, false, true);
				}
				Static275.aClass155_44.method4360(local29, local138);
				this.aLong173 = local29;
			}
		}
		local144 = false;
		@Pc(810) boolean local810 = false;
		@Pc(812) boolean local812 = false;
		@Pc(814) boolean local814 = false;
		local323 = arg1 == null ? 0 : arg1.length;
		@Pc(969) int local969;
		for (local344 = 0; local344 < local323; local344++) {
			if (arg1[local344] != null) {
				@Pc(842) Class163 local842 = Static115.method1895(arg1[local344].anInt3241);
				if (local842.anIntArray587 != null) {
					Static88.aClass163Array2[local344] = local842;
					local144 = true;
					local330 = arg1[local344].anInt3242;
					local351 = arg1[local344].anInt3236;
					local358 = local842.anIntArray587[local330];
					Static242.aClass1_Sub2_Sub12Array3[local344] = Static283.method4670(local358 >>> 16);
					local358 &= 0xFFFF;
					Static263.anIntArray570[local344] = local358;
					if (Static242.aClass1_Sub2_Sub12Array3[local344] != null) {
						local812 |= Static242.aClass1_Sub2_Sub12Array3[local344].method1922(local358);
						local810 |= Static242.aClass1_Sub2_Sub12Array3[local344].method1921(local358);
						local814 |= local842.aBoolean316;
					}
					if ((local842.aBoolean313 || Static18.aBoolean23) && local351 != -1 && local842.anIntArray587.length > local351) {
						Static192.anIntArray387[local344] = local842.anIntArray589[local330];
						Static24.anIntArray50[local344] = arg1[local344].anInt3239;
						local969 = local842.anIntArray587[local351];
						Static235.aClass1_Sub2_Sub12Array2[local344] = Static283.method4670(local969 >>> 16);
						@Pc(981) int local981 = local969 & 0xFFFF;
						Static99.anIntArray222[local344] = local981;
						if (Static235.aClass1_Sub2_Sub12Array2[local344] != null) {
							local812 |= Static235.aClass1_Sub2_Sub12Array2[local344].method1922(local981);
							local810 |= Static235.aClass1_Sub2_Sub12Array2[local344].method1921(local981);
						}
					} else {
						Static192.anIntArray387[local344] = 0;
						Static24.anIntArray50[local344] = 0;
						Static235.aClass1_Sub2_Sub12Array2[local344] = null;
						Static99.anIntArray222[local344] = -1;
					}
				}
			}
		}
		if (!local144 && arg2 == null && arg8 == null) {
			return local138;
		}
		local330 = 0;
		@Pc(1025) Class1_Sub2_Sub12 local1025 = null;
		local344 = -1;
		local337 = -1;
		@Pc(1031) Class1_Sub2_Sub12 local1031 = null;
		if (arg2 != null) {
			local344 = arg2.anIntArray587[arg5];
			local969 = local344 >>> 16;
			local344 &= 0xFFFF;
			local1025 = Static283.method4670(local969);
			if (local1025 != null) {
				local812 |= local1025.method1922(local344);
				local810 |= local1025.method1921(local344);
				local814 |= arg2.aBoolean316;
			}
			if ((arg2.aBoolean313 || Static18.aBoolean23) && arg3 != -1 && arg2.anIntArray587.length > arg3) {
				local330 = arg2.anIntArray589[arg5];
				local337 = arg2.anIntArray587[arg3];
				local422 = local337 >>> 16;
				local337 &= 0xFFFF;
				if (local422 == local969) {
					local1031 = local1025;
				} else {
					local1031 = Static283.method4670(local337 >>> 16);
				}
				if (local1031 != null) {
					local812 |= local1031.method1922(local337);
					local810 |= local1031.method1921(local337);
				}
			}
		}
		local434 = 0;
		local969 = -1;
		@Pc(1137) Class1_Sub2_Sub12 local1137 = null;
		@Pc(1139) Class1_Sub2_Sub12 local1139 = null;
		local422 = -1;
		if (arg8 != null) {
			local969 = arg8.anIntArray587[arg7];
			local446 = local969 >>> 16;
			local1137 = Static283.method4670(local446);
			local969 &= 0xFFFF;
			if (local1137 != null) {
				local812 |= local1137.method1922(local969);
				local810 |= local1137.method1921(local969);
				local814 |= arg8.aBoolean316;
			}
			if ((arg8.aBoolean313 || Static18.aBoolean23) && arg0 != -1 && arg0 < arg8.anIntArray587.length) {
				local434 = arg8.anIntArray589[arg7];
				local422 = arg8.anIntArray587[arg0];
				local452 = local422 >>> 16;
				local422 &= 0xFFFF;
				if (local446 == local452) {
					local1139 = local1137;
				} else {
					local1139 = Static283.method4670(local422 >>> 16);
				}
				if (local1139 != null) {
					local812 |= local1139.method1922(local422);
					local810 |= local1139.method1921(local422);
				}
			}
		}
		@Pc(1262) Class25_Sub2 local1262 = local138.method3468(!local810, !local812, !local814);
		local452 = 0;
		local505 = 1;
		while (local452 < local323) {
			if (Static242.aClass1_Sub2_Sub12Array3[local452] != null) {
				local1262.method3484(Static242.aClass1_Sub2_Sub12Array3[local452], Static263.anIntArray570[local452], Static235.aClass1_Sub2_Sub12Array2[local452], Static99.anIntArray222[local452], Static24.anIntArray50[local452] - 1, Static192.anIntArray387[local452], local505, Static88.aClass163Array2[local452].aBoolean316, this.anIntArrayArray40[local452]);
			}
			local452++;
			local505 <<= 0x1;
		}
		if (local1025 != null && local1137 != null) {
			local1262.method3477(local1025, local344, local1031, local337, arg4 - 1, local330, local1137, local969, local1139, local422, arg6 - 1, local434, arg2.aBooleanArray23, arg8.aBoolean316 | arg2.aBoolean316);
		} else if (local1025 != null) {
			local1262.method3479(local1025, local344, local1031, local337, arg4 - 1, local330, arg2.aBoolean316);
		} else if (local1137 != null) {
			local1262.method3479(local1137, local969, local1139, local422, arg6 - 1, local434, arg8.aBoolean316);
		}
		for (local452 = 0; local452 < local323; local452++) {
			Static242.aClass1_Sub2_Sub12Array3[local452] = null;
			Static235.aClass1_Sub2_Sub12Array2[local452] = null;
			Static88.aClass163Array2[local452] = null;
		}
		return local1262;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[IZ[IIZ)V")
	public void method4167(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt5301 != arg3) {
			this.anIntArrayArray40 = null;
			this.anInt5301 = arg3;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				for (@Pc(31) int local31 = 0; local31 < Static40.anInt1933; local31++) {
					@Pc(42) Class19 local42 = Static281.method4663(local31);
					if (local42 != null && !local42.aBoolean24 && (arg4 ? Static205.anIntArray466[local24] : Static80.anIntArray200[local24]) == local42.anInt467) {
						arg1[Static161.anIntArray337[local24]] = Integer.MIN_VALUE | local31;
						break;
					}
				}
			}
		}
		this.anInt5302 = arg0;
		this.aBoolean287 = arg4;
		this.anIntArray546 = arg2;
		this.anIntArray545 = arg1;
		this.method4169();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V")
	public void method4168(@OriginalArg(0) boolean arg0) {
		this.aBoolean287 = arg0;
		this.method4169();
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	private void method4169() {
		@Pc(8) long local8 = this.aLong174;
		this.aLong174 = -1L;
		@Pc(13) long[] local13 = Class1_Sub2_Sub11.aLongArray8;
		this.aLong174 = local13[(int) ((this.aLong174 ^ (long) (this.anInt5301 >> 8)) & 0xFFL)] ^ this.aLong174 >>> 8;
		this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) (((long) this.anInt5301 ^ this.aLong174) & 0xFFL)];
		@Pc(53) int local53;
		for (local53 = 0; local53 < 12; local53++) {
			this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) ((this.aLong174 ^ (long) (this.anIntArray545[local53] >> 24)) & 0xFFL)];
			this.aLong174 = local13[(int) ((this.aLong174 ^ (long) (this.anIntArray545[local53] >> 16)) & 0xFFL)] ^ this.aLong174 >>> 8;
			this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) ((this.aLong174 ^ (long) (this.anIntArray545[local53] >> 8)) & 0xFFL)];
			this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) ((this.aLong174 ^ (long) this.anIntArray545[local53]) & 0xFFL)];
		}
		for (local53 = 0; local53 < 5; local53++) {
			this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) (((long) this.anIntArray546[local53] ^ this.aLong174) & 0xFFL)];
		}
		this.aLong174 = this.aLong174 >>> 8 ^ local13[(int) ((this.aLong174 ^ (long) (this.aBoolean287 ? 1 : 0)) & 0xFFL)];
		if (local8 != 0L && this.aLong174 != local8) {
			Static275.aClass155_44.method4363(local8);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!v;II)Lclient!lf;")
	public Class25_Sub2 method4170(@OriginalArg(0) int arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt5302 != -1) {
			return Static38.method880(this.anInt5302).method4075(arg1, arg0, arg3, arg2);
		}
		@Pc(34) Class25_Sub2 local34 = (Class25_Sub2) Static290.aClass155_47.method4358(this.aLong174);
		if (local34 == null) {
			@Pc(39) boolean local39 = false;
			@Pc(49) int local49;
			for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
				local49 = this.anIntArray545[local41];
				if ((local49 & 0x40000000) == 0) {
					if ((local49 & Integer.MIN_VALUE) != 0 && !Static281.method4663(local49 & 0x3FFFFFFF).method388()) {
						local39 = true;
					}
				} else if (!Static238.method4099(local49 & 0x3FFFFFFF).method4009(this.aBoolean287)) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(98) Class25_Sub3[] local98 = new Class25_Sub3[12];
			local49 = 0;
			@Pc(110) int local110;
			for (@Pc(102) int local102 = 0; local102 < 12; local102++) {
				local110 = this.anIntArray545[local102];
				@Pc(133) Class25_Sub3 local133;
				if ((local110 & 0x40000000) != 0) {
					local133 = Static238.method4099(local110 & 0x3FFFFFFF).method4007(this.aBoolean287);
					if (local133 != null) {
						local98[local49++] = local133;
					}
				} else if ((Integer.MIN_VALUE & local110) != 0) {
					local133 = Static281.method4663(local110 & 0x3FFFFFFF).method382();
					if (local133 != null) {
						local98[local49++] = local133;
					}
				}
			}
			@Pc(170) Class25_Sub3 local170 = new Class25_Sub3(local98, local49);
			for (local110 = 0; local110 < 5; local110++) {
				if (Static202.aShortArrayArray8[local110].length > this.anIntArray546[local110]) {
					local170.method2826(Static91.aShortArray43[local110], Static202.aShortArrayArray8[local110][this.anIntArray546[local110]]);
				}
				if (this.anIntArray546[local110] < Static122.aShortArrayArray5[local110].length) {
					local170.method2826(Static230.aShortArray80[local110], Static122.aShortArrayArray5[local110][this.anIntArray546[local110]]);
				}
			}
			local34 = local170.method2821(64, 768, -50, -10, -50);
			Static290.aClass155_47.method4360(this.aLong174, local34);
		}
		if (arg1 != null) {
			local34 = arg1.method4587(arg0, arg2, local34, arg3);
		}
		return local34;
	}
}
