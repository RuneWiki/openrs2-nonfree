import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class167 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public int anInt4863;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "[I")
	public int[] anIntArray430;

	@OriginalMember(owner = "client!tb", name = "v", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
	private int anInt4869;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIIIZILclient!ro;ILclient!ro;I[Lclient!b;I)Lclient!bf;")
	public Class15_Sub2 method4179(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class157 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class157 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class14[] arg10) {
		if (this.anInt4863 != -1) {
			return Static261.method4114(this.anInt4863).method2655(arg9, arg8, arg7, arg6, arg2, arg10, arg3, arg1, arg5);
		}
		@Pc(28) int[] local28 = this.anIntArray431;
		@Pc(31) long local31 = this.aLong179;
		if (arg8 != null && (arg8.anInt4526 >= 0 || arg8.anInt4520 >= 0)) {
			local28 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local28[local47] = this.anIntArray431[local47];
			}
			if (arg8.anInt4526 >= 0) {
				if (arg8.anInt4526 == 65535) {
					local28[5] = 0;
					local31 ^= 0xFFFFFFFF00000000L;
				} else {
					local28[5] = arg8.anInt4526 | 0x40000000;
					local31 ^= (long) local28[5] << 32;
				}
			}
			if (arg8.anInt4520 >= 0) {
				if (arg8.anInt4520 == 65535) {
					local28[3] = 0;
					local31 ^= 0xFFFFFFFFL;
				} else {
					local28[3] = arg8.anInt4520 | 0x40000000;
					local31 ^= local28[3];
				}
			}
		}
		@Pc(139) Class15_Sub2 local139 = (Class15_Sub2) Static247.aClass187_126.method4527(local31);
		@Pc(145) boolean local145;
		@Pc(334) int local334;
		@Pc(348) int local348;
		@Pc(369) int local369;
		@Pc(355) int local355;
		@Pc(362) int local362;
		@Pc(442) int local442;
		@Pc(460) int local460;
		@Pc(480) int local480;
		@Pc(466) int local466;
		@Pc(488) int local488;
		@Pc(341) int local341;
		if (local139 == null) {
			local145 = false;
			@Pc(156) int local156;
			for (@Pc(147) int local147 = 0; local147 < 12; local147++) {
				local156 = local28[local147];
				if ((local156 & 0x40000000) == 0) {
					if ((local156 & Integer.MIN_VALUE) != 0 && !Static154.method2637(local156 & 0x3FFFFFFF).method1584()) {
						local145 = true;
					}
				} else if (!Static49.method909(local156 & 0x3FFFFFFF).method2789(this.aBoolean336)) {
					local145 = true;
				}
			}
			if (local145) {
				if (this.aLong178 != -1L) {
					local139 = (Class15_Sub2) Static247.aClass187_126.method4527(this.aLong178);
				}
				if (local139 == null) {
					return null;
				}
			}
			if (local139 == null) {
				@Pc(227) Class15_Sub6[] local227 = new Class15_Sub6[12];
				@Pc(238) int local238;
				for (local156 = 0; local156 < 12; local156++) {
					local238 = local28[local156];
					@Pc(259) Class15_Sub6 local259;
					if ((local238 & 0x40000000) != 0) {
						local259 = Static49.method909(local238 & 0x3FFFFFFF).method2777(this.aBoolean336);
						if (local259 != null) {
							local227[local156] = local259;
						}
					} else if ((Integer.MIN_VALUE & local238) != 0) {
						local259 = Static154.method2637(local238 & 0x3FFFFFFF).method1579();
						if (local259 != null) {
							local227[local156] = local259;
						}
					}
				}
				@Pc(290) Class11 local290 = null;
				if (this.anInt4869 != -1) {
					local290 = Static164.method2816(this.anInt4869);
				}
				if (local290 != null && local290.anIntArrayArray3 != null) {
					for (local238 = 0; local238 < local290.anIntArrayArray3.length; local238++) {
						if (local290.anIntArrayArray3[local238] != null && local227[local238] != null) {
							local334 = local290.anIntArrayArray3[local238][1];
							local341 = local290.anIntArrayArray3[local238][0];
							local348 = local290.anIntArrayArray3[local238][2];
							local355 = local290.anIntArrayArray3[local238][4];
							local362 = local290.anIntArrayArray3[local238][5];
							local369 = local290.anIntArrayArray3[local238][3];
							if (this.anIntArrayArray38 == null) {
								this.anIntArrayArray38 = new int[local290.anIntArrayArray3.length][];
							}
							if (this.anIntArrayArray38[local238] == null) {
								@Pc(392) int[] local392 = this.anIntArrayArray38[local238] = new int[15];
								if (local369 == 0 && local355 == 0 && local362 == 0) {
									local392[0] = local392[4] = local392[8] = 32768;
									local392[14] = -local348;
									local392[13] = -local334;
									local392[12] = -local341;
								} else {
									local442 = Class135.anIntArray338[local369] >> 1;
									@Pc(448) int local448 = Class135.anIntArray338[local355] >> 1;
									@Pc(454) int local454 = Class135.anIntArray335[local355] >> 1;
									local460 = Class135.anIntArray335[local369] >> 1;
									local466 = Class135.anIntArray335[local362] >> 1;
									@Pc(474) int local474 = local460 * local466 + 16384 >> 15;
									local480 = Class135.anIntArray338[local362] >> 1;
									local488 = local460 * local480 + 16384 >> 15;
									local392[5] = -local460;
									local392[3] = local442 * local466 + 16384 >> 15;
									local392[0] = local454 * local474 + local448 * local480 + 16384 >> 15;
									local392[2] = local442 * local454 + 16384 >> 15;
									local392[6] = local474 * local448 + local480 * -local454 + 16384 >> 15;
									local392[1] = -local466 * local448 + local454 * local488 + 16384 >> 15;
									local392[4] = local442 * local480 + 16384 >> 15;
									local392[7] = -local466 * -local454 + local488 * local448 + 16384 >> 15;
									local392[13] = local392[1] * -local341 + -local334 * local392[4] + local392[7] * -local348 + 16384 >> 15;
									local392[12] = -local348 * local392[6] + local392[0] * -local341 + -local334 * local392[3] + 16384 >> 15;
									local392[8] = local442 * local448 + 16384 >> 15;
									local392[14] = -local348 * local392[8] + local392[5] * -local334 + local392[2] * -local341 + 16384 >> 15;
								}
								local392[10] = local334;
								local392[11] = local348;
								local392[9] = local341;
							}
							if (local369 != 0 || local355 != 0 || local362 != 0) {
								local227[local238].method3768(local369, local355, local362);
							}
							if (local341 != 0 || local334 != 0 || local348 != 0) {
								local227[local238].method3752(local341, local334, local348);
							}
						}
					}
				}
				@Pc(739) Class15_Sub6 local739 = new Class15_Sub6(local227, local227.length);
				for (local341 = 0; local341 < 5; local341++) {
					if (Static143.aShortArrayArray1[local341].length > this.anIntArray430[local341]) {
						local739.method3775(Static82.aShortArray30[local341], Static143.aShortArrayArray1[local341][this.anIntArray430[local341]]);
					}
					if (this.anIntArray430[local341] < Static263.aShortArrayArray8[local341].length) {
						local739.method3775(Static210.aShortArray77[local341], Static263.aShortArrayArray8[local341][this.anIntArray430[local341]]);
					}
				}
				local139 = local739.method3760(64, 850, -30, -50, -30);
				if (Static156.aBoolean211) {
					((Class15_Sub2_Sub1) local139).method856(false, false, true, false, false, true);
				}
				if (arg0) {
					Static247.aClass187_126.method4524(local31, local139);
					this.aLong178 = local31;
				}
			}
		}
		@Pc(833) boolean local833 = false;
		@Pc(835) boolean local835 = false;
		local145 = false;
		local341 = arg10 == null ? 0 : arg10.length;
		@Pc(846) boolean local846 = false;
		@Pc(966) int local966;
		for (local334 = 0; local334 < local341; local334++) {
			if (arg10[local334] != null) {
				@Pc(865) Class157 local865 = Static80.method1561(arg10[local334].anInt236);
				if (local865.anIntArray396 != null) {
					Static82.aClass157Array1[local334] = local865;
					local145 = true;
					local355 = arg10[local334].anInt234;
					local369 = arg10[local334].anInt232;
					local362 = local865.anIntArray396[local369];
					Static95.aClass1_Sub2_Sub22Array4[local334] = Static48.method901(local362 >>> 16);
					local362 &= 0xFFFF;
					Static4.anIntArray2[local334] = local362;
					if (Static95.aClass1_Sub2_Sub22Array4[local334] != null) {
						local846 |= Static95.aClass1_Sub2_Sub22Array4[local334].method4388(local362);
						local833 |= Static95.aClass1_Sub2_Sub22Array4[local334].method4391(local362);
						local835 |= local865.aBoolean308;
					}
					if ((local865.aBoolean309 || Static269.aBoolean159) && local355 != -1 && local865.anIntArray396.length > local355) {
						Static224.anIntArray347[local334] = local865.anIntArray395[local369];
						Static214.anIntArray334[local334] = arg10[local334].anInt229;
						local966 = local865.anIntArray396[local355];
						Static212.aClass1_Sub2_Sub22Array2[local334] = Static48.method901(local966 >>> 16);
						@Pc(978) int local978 = local966 & 0xFFFF;
						Static217.anIntArray341[local334] = local978;
						if (Static212.aClass1_Sub2_Sub22Array2[local334] != null) {
							local846 |= Static212.aClass1_Sub2_Sub22Array2[local334].method4388(local978);
							local833 |= Static212.aClass1_Sub2_Sub22Array2[local334].method4391(local978);
						}
					} else {
						Static224.anIntArray347[local334] = 0;
						Static214.anIntArray334[local334] = 0;
						Static212.aClass1_Sub2_Sub22Array2[local334] = null;
						Static217.anIntArray341[local334] = -1;
					}
				}
			}
		}
		if (local145 || arg8 != null || arg6 != null) {
			local334 = -1;
			local369 = 0;
			local348 = -1;
			@Pc(1059) Class1_Sub2_Sub22 local1059 = null;
			@Pc(1061) Class1_Sub2_Sub22 local1061 = null;
			if (arg8 != null) {
				local334 = arg8.anIntArray396[arg7];
				local966 = local334 >>> 16;
				local334 &= 0xFFFF;
				local1059 = Static48.method901(local966);
				if (local1059 != null) {
					local846 |= local1059.method4388(local334);
					local833 |= local1059.method4391(local334);
					local835 |= arg8.aBoolean308;
				}
				if ((arg8.aBoolean309 || Static269.aBoolean159) && arg3 != -1 && arg3 < arg8.anIntArray396.length) {
					local369 = arg8.anIntArray395[arg7];
					local348 = arg8.anIntArray396[arg3];
					local442 = local348 >>> 16;
					local348 &= 0xFFFF;
					if (local966 == local442) {
						local1061 = local1059;
					} else {
						local1061 = Static48.method901(local348 >>> 16);
					}
					if (local1061 != null) {
						local846 |= local1061.method4388(local348);
						local833 |= local1061.method4391(local348);
					}
				}
			}
			local966 = -1;
			local460 = 0;
			@Pc(1173) Class1_Sub2_Sub22 local1173 = null;
			local442 = -1;
			@Pc(1177) Class1_Sub2_Sub22 local1177 = null;
			if (arg6 != null) {
				local966 = arg6.anIntArray396[arg1];
				local480 = local966 >>> 16;
				local1173 = Static48.method901(local480);
				local966 &= 0xFFFF;
				if (local1173 != null) {
					local846 |= local1173.method4388(local966);
					local833 |= local1173.method4391(local966);
					local835 |= arg6.aBoolean308;
				}
				if ((arg6.aBoolean309 || Static269.aBoolean159) && arg9 != -1 && arg9 < arg6.anIntArray396.length) {
					local442 = arg6.anIntArray396[arg9];
					local460 = arg6.anIntArray395[arg1];
					local466 = local442 >>> 16;
					local442 &= 0xFFFF;
					if (local480 == local466) {
						local1177 = local1173;
					} else {
						local1177 = Static48.method901(local442 >>> 16);
					}
					if (local1177 != null) {
						local846 |= local1177.method4388(local442);
						local833 |= local1177.method4391(local442);
					}
				}
			}
			@Pc(1300) Class15_Sub2 local1300 = local139.method1030(!local833, !local846, !local835);
			local466 = 0;
			local488 = 1;
			while (local466 < local341) {
				if (Static95.aClass1_Sub2_Sub22Array4[local466] != null) {
					local1300.method1017(Static95.aClass1_Sub2_Sub22Array4[local466], Static4.anIntArray2[local466], Static212.aClass1_Sub2_Sub22Array2[local466], Static217.anIntArray341[local466], Static214.anIntArray334[local466] - 1, Static224.anIntArray347[local466], local488, Static82.aClass157Array1[local466].aBoolean308, this.anIntArrayArray38[local466]);
				}
				local488 <<= 0x1;
				local466++;
			}
			if (local1059 != null && local1173 != null) {
				local1300.method1019(local1059, local334, local1061, local348, arg2 - 1, local369, local1173, local966, local1177, local442, arg5 - 1, local460, arg8.aBooleanArray20, arg8.aBoolean308 | arg6.aBoolean308);
			} else if (local1059 != null) {
				local1300.method1022(local1059, local334, local1061, local348, arg2 - 1, local369, arg8.aBoolean308);
			} else if (local1173 != null) {
				local1300.method1022(local1173, local966, local1177, local442, arg5 - 1, local460, arg6.aBoolean308);
			}
			for (local466 = 0; local466 < local341; local466++) {
				Static95.aClass1_Sub2_Sub22Array4[local466] = null;
				Static212.aClass1_Sub2_Sub22Array2[local466] = null;
				Static82.aClass157Array1[local466] = null;
			}
			return local1300;
		} else if (arg4) {
			return local139.method1030(false, false, false);
		} else {
			return local139;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public void method4180(@OriginalArg(0) boolean arg0) {
		this.aBoolean336 = arg0;
		this.method4185();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZ)V")
	public void method4181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static306.anIntArray481[arg0];
		if (this.anIntArray431[local7] != 0 && Static154.method2637(arg1) != null) {
			this.anIntArray431[local7] = arg1 | Integer.MIN_VALUE;
			this.method4185();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([I[IIZII)V")
	public void method4182(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (this.anInt4869 != arg2) {
			this.anIntArrayArray38 = null;
			this.anInt4869 = arg2;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
				for (@Pc(39) int local39 = 0; local39 < Static84.anInt1666; local39++) {
					@Pc(46) Class53 local46 = Static154.method2637(local39);
					if (local46 != null && !local46.aBoolean89 && (arg3 ? Static290.anIntArray461[local32] : Static120.anIntArray214[local32]) == local46.anInt1662) {
						arg1[Static306.anIntArray481[local32]] = local39 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt4863 = arg4;
		this.aBoolean336 = arg3;
		this.anIntArray431 = arg1;
		this.anIntArray430 = arg0;
		this.method4185();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!ro;IIIII)Lclient!bf;")
	public Class15_Sub2 method4183(@OriginalArg(0) int arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(23) long local23 = (long) arg5 << 32 | (long) (arg2 << 16) | (long) arg4;
		@Pc(29) Class15_Sub2 local29 = (Class15_Sub2) Static16.aClass187_158.method4527(local23);
		if (local29 == null) {
			@Pc(34) int local34 = 0;
			@Pc(37) Class15_Sub6[] local37 = new Class15_Sub6[3];
			if (!Static154.method2637(arg4).method1583() || !Static154.method2637(arg2).method1583() || !Static154.method2637(arg5).method1583()) {
				return null;
			}
			@Pc(67) Class15_Sub6 local67 = Static154.method2637(arg4).method1582();
			if (local67 != null) {
				local34++;
				local37[0] = local67;
			}
			local67 = Static154.method2637(arg2).method1582();
			if (local67 != null) {
				local37[local34++] = local67;
			}
			local67 = Static154.method2637(arg5).method1582();
			if (local67 != null) {
				local37[local34++] = local67;
			}
			local67 = new Class15_Sub6(local37, local34);
			for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
				if (this.anIntArray430[local111] < Static143.aShortArrayArray1[local111].length) {
					local67.method3775(Static82.aShortArray30[local111], Static143.aShortArrayArray1[local111][this.anIntArray430[local111]]);
				}
				if (Static263.aShortArrayArray8[local111].length > this.anIntArray430[local111]) {
					local67.method3775(Static210.aShortArray77[local111], Static263.aShortArrayArray8[local111][this.anIntArray430[local111]]);
				}
			}
			local29 = local67.method3760(64, 768, -50, -10, -50);
			Static16.aClass187_158.method4524(local23, local29);
		}
		if (arg1 != null) {
			local29 = arg1.method3937(arg3, arg0, local29, arg6);
		}
		return local29;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V")
	public void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray430[arg0] = arg1;
		this.method4185();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	private void method4185() {
		@Pc(13) long[] local13 = Class1_Sub20.aLongArray9;
		@Pc(16) long local16 = this.aLong179;
		this.aLong179 = -1L;
		this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) ((this.aLong179 ^ (long) (this.anInt4869 >> 8)) & 0xFFL)];
		this.aLong179 = local13[(int) (((long) this.anInt4869 ^ this.aLong179) & 0xFFL)] ^ this.aLong179 >>> 8;
		@Pc(59) int local59;
		for (local59 = 0; local59 < 12; local59++) {
			this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) (((long) (this.anIntArray431[local59] >> 24) ^ this.aLong179) & 0xFFL)];
			this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) ((this.aLong179 ^ (long) (this.anIntArray431[local59] >> 16)) & 0xFFL)];
			this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) ((this.aLong179 ^ (long) (this.anIntArray431[local59] >> 8)) & 0xFFL)];
			this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) ((this.aLong179 ^ (long) this.anIntArray431[local59]) & 0xFFL)];
		}
		for (local59 = 0; local59 < 5; local59++) {
			this.aLong179 = local13[(int) ((this.aLong179 ^ (long) this.anIntArray430[local59]) & 0xFFL)] ^ this.aLong179 >>> 8;
		}
		this.aLong179 = this.aLong179 >>> 8 ^ local13[(int) (((long) (this.aBoolean336 ? 1 : 0) ^ this.aLong179) & 0xFFL)];
		if (local16 != 0L && local16 != this.aLong179) {
			Static247.aClass187_126.method4529(local16);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ro;BIII)Lclient!bf;")
	public Class15_Sub2 method4186(@OriginalArg(0) Class157 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt4863 != -1) {
			return Static261.method4114(this.anInt4863).method2645(arg1, arg2, arg3, arg0);
		}
		@Pc(28) Class15_Sub2 local28 = (Class15_Sub2) Static16.aClass187_158.method4527(this.aLong179);
		if (local28 == null) {
			@Pc(33) boolean local33 = false;
			@Pc(43) int local43;
			for (@Pc(35) int local35 = 0; local35 < 12; local35++) {
				local43 = this.anIntArray431[local35];
				if ((local43 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local43) != 0 && !Static154.method2637(local43 & 0x3FFFFFFF).method1583()) {
						local33 = true;
					}
				} else if (!Static49.method909(local43 & 0x3FFFFFFF).method2778(this.aBoolean336)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(93) Class15_Sub6[] local93 = new Class15_Sub6[12];
			local43 = 0;
			@Pc(107) int local107;
			for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
				local107 = this.anIntArray431[local97];
				@Pc(124) Class15_Sub6 local124;
				if ((local107 & 0x40000000) != 0) {
					local124 = Static49.method909(local107 & 0x3FFFFFFF).method2788(this.aBoolean336);
					if (local124 != null) {
						local93[local43++] = local124;
					}
				} else if ((local107 & Integer.MIN_VALUE) != 0) {
					local124 = Static154.method2637(local107 & 0x3FFFFFFF).method1582();
					if (local124 != null) {
						local93[local43++] = local124;
					}
				}
			}
			@Pc(163) Class15_Sub6 local163 = new Class15_Sub6(local93, local43);
			for (local107 = 0; local107 < 5; local107++) {
				if (this.anIntArray430[local107] < Static143.aShortArrayArray1[local107].length) {
					local163.method3775(Static82.aShortArray30[local107], Static143.aShortArrayArray1[local107][this.anIntArray430[local107]]);
				}
				if (Static263.aShortArrayArray8[local107].length > this.anIntArray430[local107]) {
					local163.method3775(Static210.aShortArray77[local107], Static263.aShortArrayArray8[local107][this.anIntArray430[local107]]);
				}
			}
			local28 = local163.method3760(64, 768, -50, -10, -50);
			Static16.aClass187_158.method4524(this.aLong179, local28);
		}
		if (arg0 != null) {
			local28 = arg0.method3937(arg3, arg1, local28, arg2);
		}
		return local28;
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)I")
	public int method4193() {
		return this.anInt4863 == -1 ? this.anIntArray431[1] + (this.anIntArray431[8] << 10) + (this.anIntArray430[0] << 25) + (this.anIntArray430[4] << 20) + (this.anIntArray431[0] << 15) + (this.anIntArray431[11] << 5) : Static261.method4114(this.anInt4863).anInt3039 + 305419896;
	}
}
