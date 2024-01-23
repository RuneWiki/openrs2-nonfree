import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class94 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
	private int[] anIntArray280;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
	private int anInt3804;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BZ)V")
	public void method2816(@OriginalArg(1) boolean arg0) {
		this.aBoolean191 = arg0;
		this.method2821();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILclient!gj;IIII)Lclient!gh;")
	public Class9_Sub5 method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class49 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) (arg4 << 16) | (long) arg6 << 32 | (long) arg1;
		@Pc(29) Class9_Sub5 local29 = (Class9_Sub5) Static96.aClass79_14.method2483(local18);
		if (local29 == null) {
			@Pc(34) Class9_Sub3[] local34 = new Class9_Sub3[3];
			@Pc(36) int local36 = 0;
			if (!Static140.method2550(arg1).method403() || !Static140.method2550(arg4).method403() || !Static140.method2550(arg6).method403()) {
				return null;
			}
			@Pc(64) Class9_Sub3 local64 = Static140.method2550(arg1).method402();
			if (local64 != null) {
				local36++;
				local34[0] = local64;
			}
			local64 = Static140.method2550(arg4).method402();
			if (local64 != null) {
				local34[local36++] = local64;
			}
			local64 = Static140.method2550(arg6).method402();
			if (local64 != null) {
				local34[local36++] = local64;
			}
			local64 = new Class9_Sub3(local34, local36);
			for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
				if (Static73.aShortArrayArray2[local107].length > this.anIntArray282[local107]) {
					local64.method528(Static88.aShortArray33[local107], Static73.aShortArrayArray2[local107][this.anIntArray282[local107]]);
				}
				if (Static262.aShortArrayArray8[local107].length > this.anIntArray282[local107]) {
					local64.method528(Static108.aShortArray44[local107], Static262.aShortArrayArray8[local107][this.anIntArray282[local107]]);
				}
			}
			local29 = local64.method526(64, 768, -50, -10, -50);
			Static96.aClass79_14.method2486(local29, local18);
		}
		if (arg2 != null) {
			local29 = arg2.method1637(arg3, arg5, arg0, local29);
		}
		return local29;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!gj;II)Lclient!gh;")
	public Class9_Sub5 method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3806 != -1) {
			return Static155.method2756(this.anInt3806).method1465(arg1, arg2, arg0, arg3);
		}
		@Pc(27) Class9_Sub5 local27 = (Class9_Sub5) Static96.aClass79_14.method2483(this.aLong120);
		if (local27 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				@Pc(45) int local45 = this.anIntArray280[local38];
				if ((local45 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local45) != 0 && !Static140.method2550(local45 & 0x3FFFFFFF).method403()) {
						local36 = true;
					}
				} else if (!Static93.method2006(local45 & 0x3FFFFFFF).method2737(this.aBoolean191)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(95) int local95 = 0;
			@Pc(98) Class9_Sub3[] local98 = new Class9_Sub3[12];
			for (@Pc(100) int local100 = 0; local100 < 12; local100++) {
				@Pc(107) int local107 = this.anIntArray280[local100];
				@Pc(121) Class9_Sub3 local121;
				if ((local107 & 0x40000000) != 0) {
					local121 = Static93.method2006(local107 & 0x3FFFFFFF).method2731(this.aBoolean191);
					if (local121 != null) {
						local98[local95++] = local121;
					}
				} else if ((Integer.MIN_VALUE & local107) != 0) {
					local121 = Static140.method2550(local107 & 0x3FFFFFFF).method402();
					if (local121 != null) {
						local98[local95++] = local121;
					}
				}
			}
			@Pc(161) Class9_Sub3 local161 = new Class9_Sub3(local98, local95);
			for (@Pc(163) int local163 = 0; local163 < 5; local163++) {
				if (Static73.aShortArrayArray2[local163].length > this.anIntArray282[local163]) {
					local161.method528(Static88.aShortArray33[local163], Static73.aShortArrayArray2[local163][this.anIntArray282[local163]]);
				}
				if (this.anIntArray282[local163] < Static262.aShortArrayArray8[local163].length) {
					local161.method528(Static108.aShortArray44[local163], Static262.aShortArrayArray8[local163][this.anIntArray282[local163]]);
				}
			}
			local27 = local161.method526(64, 768, -50, -10, -50);
			Static96.aClass79_14.method2486(local27, this.aLong120);
		}
		if (arg2 != null) {
			local27 = arg2.method1637(arg1, arg0, arg3, local27);
		}
		return local27;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([IIZ[III)V")
	public void method2819(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt3804 != arg4) {
			this.anIntArrayArray26 = null;
			this.anInt3804 = arg4;
		}
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static115.anInt3016; local30++) {
					@Pc(36) Class16 local36 = Static140.method2550(local30);
					if (local36 != null && !local36.aBoolean39 && local36.anInt741 == (arg1 ? Static211.anIntArray386[local26] : Static238.anIntArray449[local26])) {
						arg0[Static116.anIntArray217[local26]] = local30 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt3806 = arg3;
		this.anIntArray280 = arg0;
		this.aBoolean191 = arg1;
		this.anIntArray282 = arg2;
		this.method2821();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
	public void method2820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray282[arg1] = arg0;
		this.method2821();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	private void method2821() {
		@Pc(8) long local8 = this.aLong120;
		@Pc(10) long[] local10 = Class137.aLongArray36;
		this.aLong120 = -1L;
		this.aLong120 = local10[(int) ((this.aLong120 ^ (long) (this.anInt3804 >> 8)) & 0xFFL)] ^ this.aLong120 >>> 8;
		this.aLong120 = this.aLong120 >>> 8 ^ local10[(int) ((this.aLong120 ^ (long) this.anInt3804) & 0xFFL)];
		for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
			this.aLong120 = local10[(int) ((this.aLong120 ^ (long) (this.anIntArray280[local53] >> 24)) & 0xFFL)] ^ this.aLong120 >>> 8;
			this.aLong120 = local10[(int) ((this.aLong120 ^ (long) (this.anIntArray280[local53] >> 16)) & 0xFFL)] ^ this.aLong120 >>> 8;
			this.aLong120 = local10[(int) (((long) (this.anIntArray280[local53] >> 8) ^ this.aLong120) & 0xFFL)] ^ this.aLong120 >>> 8;
			this.aLong120 = this.aLong120 >>> 8 ^ local10[(int) ((this.aLong120 ^ (long) this.anIntArray280[local53]) & 0xFFL)];
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong120 = local10[(int) ((this.aLong120 ^ (long) this.anIntArray282[local149]) & 0xFFL)] ^ this.aLong120 >>> 8;
		}
		this.aLong120 = local10[(int) ((this.aLong120 ^ (long) (this.aBoolean191 ? 1 : 0)) & 0xFFL)] ^ this.aLong120 >>> 8;
		if (local8 != 0L && this.aLong120 != local8) {
			Static157.aClass79_20.method2482(local8);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)I")
	public int method2822() {
		return this.anInt3806 == -1 ? (this.anIntArray280[8] << 10) + ((this.anIntArray282[0] << 25) + (this.anIntArray282[4] << 20)) + (this.anIntArray280[0] << 15) + (this.anIntArray280[11] << 5) + this.anIntArray280[1] : Static155.method2756(this.anInt3806).anInt2009 + 305419896;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
	public void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static116.anIntArray217[arg1];
		if (this.anIntArray280[local7] != 0 && Static140.method2550(arg0) != null) {
			this.anIntArray280[local7] = arg0 | Integer.MIN_VALUE;
			this.method2821();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIILclient!gj;Lclient!gj;[Lclient!ll;ZIII)Lclient!gh;")
	public Class9_Sub5 method2825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) Class83[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (this.anInt3806 != -1) {
			return Static155.method2756(this.anInt3806).method1470(arg2, arg1, arg0, arg5, arg8, arg4, arg3, arg6, arg7);
		}
		@Pc(29) long local29 = this.aLong120;
		@Pc(32) int[] local32 = this.anIntArray280;
		if (arg3 != null && (arg3.anInt2182 >= 0 || arg3.anInt2181 >= 0)) {
			local32 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local32[local51] = this.anIntArray280[local51];
			}
			if (arg3.anInt2182 >= 0) {
				if (arg3.anInt2182 == 65535) {
					local32[5] = 0;
					local29 ^= 0xFFFFFFFF00000000L;
				} else {
					local32[5] = arg3.anInt2182 | 0x40000000;
					local29 ^= (long) local32[5] << 32;
				}
			}
			if (arg3.anInt2181 >= 0) {
				if (arg3.anInt2181 == 65535) {
					local32[3] = 0;
					local29 ^= 0xFFFFFFFFL;
				} else {
					local32[3] = arg3.anInt2181 | 0x40000000;
					local29 ^= local32[3];
				}
			}
		}
		@Pc(138) Class9_Sub5 local138 = (Class9_Sub5) Static157.aClass79_20.method2483(local29);
		@Pc(142) boolean local142;
		@Pc(229) int local229;
		@Pc(319) int local319;
		@Pc(333) int local333;
		@Pc(326) int local326;
		@Pc(347) int local347;
		@Pc(340) int local340;
		@Pc(354) int local354;
		@Pc(447) int local447;
		@Pc(453) int local453;
		@Pc(435) int local435;
		@Pc(441) int local441;
		@Pc(466) int local466;
		@Pc(299) int local299;
		if (local138 == null) {
			local142 = false;
			for (@Pc(144) int local144 = 0; local144 < 12; local144++) {
				@Pc(150) int local150 = local32[local144];
				if ((local150 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local150) != 0 && !Static140.method2550(local150 & 0x3FFFFFFF).method415()) {
						local142 = true;
					}
				} else if (!Static93.method2006(local150 & 0x3FFFFFFF).method2734(this.aBoolean191)) {
					local142 = true;
				}
			}
			if (local142) {
				if (this.aLong119 != -1L) {
					local138 = (Class9_Sub5) Static157.aClass79_20.method2483(this.aLong119);
				}
				if (local138 == null) {
					return null;
				}
			}
			if (local138 == null) {
				@Pc(221) Class9_Sub3[] local221 = new Class9_Sub3[12];
				@Pc(248) Class9_Sub3 local248;
				for (@Pc(223) int local223 = 0; local223 < 12; local223++) {
					local229 = local32[local223];
					if ((local229 & 0x40000000) != 0) {
						local248 = Static93.method2006(local229 & 0x3FFFFFFF).method2727(this.aBoolean191);
						if (local248 != null) {
							local221[local223] = local248;
						}
					} else if ((local229 & Integer.MIN_VALUE) != 0) {
						local248 = Static140.method2550(local229 & 0x3FFFFFFF).method411();
						if (local248 != null) {
							local221[local223] = local248;
						}
					}
				}
				@Pc(282) Class59 local282 = null;
				if (this.anInt3804 != -1) {
					local282 = Static128.method2422(this.anInt3804);
				}
				if (local282 != null && local282.anIntArrayArray18 != null) {
					for (local299 = 0; local299 < local282.anIntArrayArray18.length; local299++) {
						if (local282.anIntArrayArray18[local299] != null && local221[local299] != null) {
							local319 = local282.anIntArrayArray18[local299][0];
							local326 = local282.anIntArrayArray18[local299][2];
							local333 = local282.anIntArrayArray18[local299][1];
							local340 = local282.anIntArrayArray18[local299][4];
							local347 = local282.anIntArrayArray18[local299][3];
							local354 = local282.anIntArrayArray18[local299][5];
							if (this.anIntArrayArray26 == null) {
								this.anIntArrayArray26 = new int[local282.anIntArrayArray18.length][];
							}
							if (this.anIntArrayArray26[local299] == null) {
								@Pc(376) int[] local376 = this.anIntArrayArray26[local299] = new int[15];
								if (local347 == 0 && local340 == 0 && local354 == 0) {
									local376[12] = -local319;
									local376[0] = local376[4] = local376[8] = 32768;
									local376[14] = -local326;
									local376[13] = -local333;
								} else {
									@Pc(423) int local423 = Class132.anIntArray440[local347] >> 1;
									@Pc(429) int local429 = Class132.anIntArray439[local340] >> 1;
									local435 = Class132.anIntArray439[local354] >> 1;
									local441 = Class132.anIntArray440[local354] >> 1;
									local447 = Class132.anIntArray439[local347] >> 1;
									local453 = Class132.anIntArray440[local340] >> 1;
									local376[5] = -local423;
									local466 = local423 * local435 + 16384 >> 15;
									@Pc(474) int local474 = local441 * local423 + 16384 >> 15;
									local376[3] = local441 * local447 + 16384 >> 15;
									local376[6] = -local453 * local435 + local474 * local429 + 16384 >> 15;
									local376[0] = local474 * local453 + local429 * local435 + 16384 >> 15;
									local376[4] = local447 * local435 + 16384 >> 15;
									local376[8] = local429 * local447 + 16384 >> 15;
									local376[2] = local453 * local447 + 16384 >> 15;
									local376[14] = local376[8] * -local326 + local376[2] * -local319 + -local333 * local376[5] + 16384 >> 15;
									local376[7] = local429 * local466 + -local453 * -local441 + 16384 >> 15;
									local376[1] = local453 * local466 + local429 * -local441 + 16384 >> 15;
									local376[13] = -local319 * local376[1] + -local333 * local376[4] + local376[7] * -local326 + 16384 >> 15;
									local376[12] = -local333 * local376[3] + -local319 * local376[0] + -local326 * local376[6] + 16384 >> 15;
								}
								local376[9] = local319;
								local376[10] = local333;
								local376[11] = local326;
							}
							if (local347 != 0 || local340 != 0 || local354 != 0) {
								local221[local299].method546(local347, local340, local354);
							}
							if (local319 != 0 || local333 != 0 || local326 != 0) {
								local221[local299].method524(local319, local333, local326);
							}
						}
					}
				}
				local248 = new Class9_Sub3(local221, local221.length);
				for (local319 = 0; local319 < 5; local319++) {
					if (this.anIntArray282[local319] < Static73.aShortArrayArray2[local319].length) {
						local248.method528(Static88.aShortArray33[local319], Static73.aShortArrayArray2[local319][this.anIntArray282[local319]]);
					}
					if (this.anIntArray282[local319] < Static262.aShortArrayArray8[local319].length) {
						local248.method528(Static108.aShortArray44[local319], Static262.aShortArrayArray8[local319][this.anIntArray282[local319]]);
					}
				}
				local138 = local248.method526(64, 850, -30, -50, -30);
				Static157.aClass79_20.method2486(local138, local29);
				this.aLong119 = local29;
			}
		}
		local142 = false;
		@Pc(796) boolean local796 = false;
		@Pc(798) boolean local798 = false;
		local229 = arg5 == null ? 0 : arg5.length;
		@Pc(807) boolean local807 = false;
		for (local299 = 0; local299 < local229; local299++) {
			if (arg5[local299] != null) {
				@Pc(822) Class49 local822 = Static131.method697(arg5[local299].anInt3390);
				if (local822.anIntArray168 != null) {
					Static70.aClass49Array3[local299] = local822;
					local142 = true;
					local326 = arg5[local299].anInt3391;
					local333 = arg5[local299].anInt3385;
					local347 = local822.anIntArray168[local333];
					Static107.aClass1_Sub2_Sub8Array53[local299] = Static210.method3478(local347 >>> 16);
					local347 &= 0xFFFF;
					Static174.anIntArray301[local299] = local347;
					if (Static107.aClass1_Sub2_Sub8Array53[local299] != null) {
						local798 |= Static107.aClass1_Sub2_Sub8Array53[local299].method1660(local347);
						local796 |= Static107.aClass1_Sub2_Sub8Array53[local299].method1657(local347);
						local807 |= local822.aBoolean132;
					}
					if ((local822.aBoolean130 || Static33.aBoolean265) && local326 != -1 && local822.anIntArray168.length > local326) {
						Static133.anIntArray253[local299] = local822.anIntArray170[local333];
						Static70.anIntArray146[local299] = arg5[local299].anInt3384;
						local340 = local822.anIntArray168[local326];
						Static113.aClass1_Sub2_Sub8Array107[local299] = Static210.method3478(local340 >>> 16);
						local340 &= 0xFFFF;
						Static73.anIntArray150[local299] = local340;
						if (Static113.aClass1_Sub2_Sub8Array107[local299] != null) {
							local798 |= Static113.aClass1_Sub2_Sub8Array107[local299].method1660(local340);
							local796 |= Static113.aClass1_Sub2_Sub8Array107[local299].method1657(local340);
						}
					} else {
						Static133.anIntArray253[local299] = 0;
						Static70.anIntArray146[local299] = 0;
						Static113.aClass1_Sub2_Sub8Array107[local299] = null;
						Static73.anIntArray150[local299] = -1;
					}
				}
			}
		}
		if (!local142 && arg3 == null && arg4 == null) {
			return local138;
		}
		local333 = -1;
		local319 = -1;
		local326 = 0;
		@Pc(1007) Class1_Sub2_Sub8 local1007 = null;
		@Pc(1009) Class1_Sub2_Sub8 local1009 = null;
		@Pc(1079) int local1079;
		if (arg3 != null) {
			local319 = arg3.anIntArray168[arg7];
			local354 = local319 >>> 16;
			local319 &= 0xFFFF;
			local1009 = Static210.method3478(local354);
			if (local1009 != null) {
				local798 |= local1009.method1660(local319);
				local796 |= local1009.method1657(local319);
				local807 |= arg3.aBoolean132;
			}
			if ((arg3.aBoolean130 || Static33.aBoolean265) && arg1 != -1 && arg3.anIntArray168.length > arg1) {
				local333 = arg3.anIntArray168[arg1];
				local326 = arg3.anIntArray170[arg7];
				local1079 = local333 >>> 16;
				local333 &= 0xFFFF;
				if (local1079 == local354) {
					local1007 = local1009;
				} else {
					local1007 = Static210.method3478(local333 >>> 16);
				}
				if (local1007 != null) {
					local798 |= local1007.method1660(local333);
					local796 |= local1007.method1657(local333);
				}
			}
		}
		local1079 = -1;
		local447 = 0;
		local354 = -1;
		@Pc(1121) Class1_Sub2_Sub8 local1121 = null;
		@Pc(1123) Class1_Sub2_Sub8 local1123 = null;
		if (arg4 != null) {
			local354 = arg4.anIntArray168[arg2];
			local453 = local354 >>> 16;
			local354 &= 0xFFFF;
			local1123 = Static210.method3478(local453);
			if (local1123 != null) {
				local798 |= local1123.method1660(local354);
				local796 |= local1123.method1657(local354);
				local807 |= arg4.aBoolean132;
			}
			if ((arg4.aBoolean130 || Static33.aBoolean265) && arg8 != -1 && arg4.anIntArray168.length > arg8) {
				local1079 = arg4.anIntArray168[arg8];
				local435 = local1079 >>> 16;
				local447 = arg4.anIntArray170[arg2];
				local1079 &= 0xFFFF;
				if (local453 == local435) {
					local1121 = local1123;
				} else {
					local1121 = Static210.method3478(local1079 >>> 16);
				}
				if (local1121 != null) {
					local798 |= local1121.method1660(local1079);
					local796 |= local1121.method1657(local1079);
				}
			}
		}
		@Pc(1245) Class9_Sub5 local1245 = local138.method3610(!local796, !local798, !local807);
		local435 = 0;
		local441 = 1;
		while (local229 > local435) {
			if (Static107.aClass1_Sub2_Sub8Array53[local435] != null) {
				local1245.method3617(Static107.aClass1_Sub2_Sub8Array53[local435], Static174.anIntArray301[local435], Static113.aClass1_Sub2_Sub8Array107[local435], Static73.anIntArray150[local435], Static70.anIntArray146[local435] - 1, Static133.anIntArray253[local435], local441, Static70.aClass49Array3[local435].aBoolean132, this.anIntArrayArray26[local435]);
			}
			local435++;
			local441 <<= 0x1;
		}
		if (local1009 != null && local1123 != null) {
			local1245.method3607(local1009, local319, local1007, local333, arg0 - 1, local326, local1123, local354, local1121, local1079, arg6 - 1, local447, arg3.aBooleanArray5, arg3.aBoolean132 | arg4.aBoolean132);
		} else if (local1009 != null) {
			local1245.method3601(local1009, local319, local1007, local333, arg0 - 1, local326, arg3.aBoolean132);
		} else if (local1123 != null) {
			local1245.method3601(local1123, local354, local1121, local1079, arg6 - 1, local447, arg4.aBoolean132);
		}
		for (local466 = 0; local466 < local229; local466++) {
			Static107.aClass1_Sub2_Sub8Array53[local466] = null;
			Static113.aClass1_Sub2_Sub8Array107[local466] = null;
			Static70.aClass49Array3[local466] = null;
		}
		return local1245;
	}
}
