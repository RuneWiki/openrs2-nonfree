import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!bd", name = "Nb", descriptor = "[I")
	public static int[] anIntArray18 = new int[128];

	@OriginalMember(owner = "client!bd", name = "rb", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!bd", name = "vb", descriptor = "[I")
	public int[] anIntArray13;

	@OriginalMember(owner = "client!bd", name = "wb", descriptor = "S")
	public short aShort1;

	@OriginalMember(owner = "client!bd", name = "xb", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!bd", name = "yb", descriptor = "[I")
	public int[] anIntArray15;

	@OriginalMember(owner = "client!bd", name = "Ab", descriptor = "[Lclient!qc;")
	public Class63[] aClass63Array1;

	@OriginalMember(owner = "client!bd", name = "Cb", descriptor = "[Lclient!qc;")
	public Class63[] aClass63Array2;

	@OriginalMember(owner = "client!bd", name = "Db", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!bd", name = "Eb", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!bd", name = "Fb", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!bd", name = "Gb", descriptor = "[Lclient!pd;")
	private Class60[] aClass60Array1;

	@OriginalMember(owner = "client!bd", name = "Ib", descriptor = "I")
	public int anInt287;

	@OriginalMember(owner = "client!bd", name = "Jb", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bd", name = "Kb", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!bd", name = "Lb", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!bd", name = "Mb", descriptor = "I")
	public int anInt289;

	@OriginalMember(owner = "client!bd", name = "Ob", descriptor = "[I")
	public int[] anIntArray19;

	@OriginalMember(owner = "client!bd", name = "Pb", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bd", name = "Qb", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!bd", name = "Rb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bd", name = "Sb", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bd", name = "Ub", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bd", name = "Vb", descriptor = "I")
	public int anInt290;

	@OriginalMember(owner = "client!bd", name = "Wb", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!bd", name = "Xb", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!bd", name = "Yb", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bd", name = "ac", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!bd", name = "bc", descriptor = "[I")
	public int[] anIntArray25;

	@OriginalMember(owner = "client!bd", name = "Bb", descriptor = "Z")
	private boolean aBoolean16 = false;

	@OriginalMember(owner = "client!bd", name = "ub", descriptor = "I")
	public int anInt285 = 0;

	@OriginalMember(owner = "client!bd", name = "zb", descriptor = "I")
	private int anInt286 = 0;

	@OriginalMember(owner = "client!bd", name = "sb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!bd", name = "Zb", descriptor = "I")
	public int anInt291 = 0;

	static {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 248;
		while (local12 < 9) {
			anIntArray18[local12++] = 255;
		}
		while (local12 < 16) {
			anIntArray18[local12++] = local14;
			local14 -= 8;
		}
		while (local12 < 32) {
			anIntArray18[local12++] = local14;
			local14 -= 4;
		}
		while (local12 < 64) {
			anIntArray18[local12++] = local14;
			local14 -= 2;
		}
		while (local12 < 128) {
			anIntArray18[local12++] = local14--;
		}
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	private Class3_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([B)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(25) Class3_Sub2 local25 = new Class3_Sub2(arg0);
		@Pc(30) Class3_Sub2 local30 = new Class3_Sub2(arg0);
		@Pc(35) Class3_Sub2 local35 = new Class3_Sub2(arg0);
		@Pc(40) Class3_Sub2 local40 = new Class3_Sub2(arg0);
		@Pc(45) Class3_Sub2 local45 = new Class3_Sub2(arg0);
		local25.anInt413 = arg0.length - 18;
		@Pc(55) int local55 = local25.method276();
		@Pc(59) int local59 = local25.method276();
		@Pc(63) int local63 = local25.method270();
		@Pc(67) int local67 = local25.method270();
		@Pc(71) int local71 = local25.method270();
		@Pc(75) int local75 = local25.method270();
		@Pc(79) int local79 = local25.method270();
		@Pc(83) int local83 = local25.method270();
		@Pc(87) int local87 = local25.method276();
		@Pc(91) int local91 = local25.method276();
		@Pc(95) int local95 = local25.method276();
		@Pc(99) int local99 = local25.method276();
		@Pc(101) byte local101 = 0;
		@Pc(107) int local107 = local101 + local55;
		@Pc(109) int local109 = local107;
		local107 += local59;
		@Pc(115) int local115 = local107;
		if (local71 == 255) {
			local107 += local59;
		}
		@Pc(124) int local124 = local107;
		if (local79 == 1) {
			local107 += local59;
		}
		@Pc(133) int local133 = local107;
		if (local67 == 1) {
			local107 += local59;
		}
		@Pc(142) int local142 = local107;
		if (local83 == 1) {
			local107 += local55;
		}
		@Pc(151) int local151 = local107;
		if (local75 == 1) {
			local107 += local59;
		}
		@Pc(160) int local160 = local107;
		local107 += local99;
		@Pc(166) int local166 = local107;
		local107 += local59 * 2;
		@Pc(174) int local174 = local107;
		local107 += local63 * 6;
		@Pc(182) int local182 = local107;
		local107 += local87;
		@Pc(188) int local188 = local107;
		local107 += local91;
		this.anInt285 = local55;
		this.anInt291 = local59;
		this.anInt286 = local63;
		this.anIntArray15 = new int[local55];
		this.anIntArray12 = new int[local55];
		this.anIntArray19 = new int[local55];
		this.anIntArray13 = new int[local59];
		this.anIntArray25 = new int[local59];
		this.anIntArray24 = new int[local59];
		if (local63 > 0) {
			this.anIntArray20 = new int[local63];
			this.anIntArray14 = new int[local63];
			this.anIntArray21 = new int[local63];
		}
		if (local83 == 1) {
			this.anIntArray17 = new int[local55];
		}
		if (local67 == 1) {
			this.aByteArray5 = new byte[local59];
			this.aByteArray4 = new byte[local59];
		}
		if (local71 == 255) {
			this.aByteArray6 = new byte[local59];
		} else {
			this.aByte1 = (byte) local71;
		}
		if (local75 == 1) {
			this.aByteArray3 = new byte[local59];
		}
		if (local79 == 1) {
			this.anIntArray23 = new int[local59];
		}
		this.aShortArray1 = new short[local59];
		local25.anInt413 = local101;
		local30.anInt413 = local182;
		local35.anInt413 = local188;
		local40.anInt413 = local107;
		local45.anInt413 = local142;
		@Pc(310) int local310 = 0;
		@Pc(312) int local312 = 0;
		@Pc(314) int local314 = 0;
		@Pc(321) int local321;
		@Pc(323) int local323;
		@Pc(333) int local333;
		@Pc(343) int local343;
		for (@Pc(316) int local316 = 0; local316 < local55; local316++) {
			local321 = local25.method270();
			local323 = 0;
			if ((local321 & 0x1) != 0) {
				local323 = local30.method269();
			}
			local333 = 0;
			if ((local321 & 0x2) != 0) {
				local333 = local35.method269();
			}
			local343 = 0;
			if ((local321 & 0x4) != 0) {
				local343 = local40.method269();
			}
			this.anIntArray15[local316] = local310 + local323;
			this.anIntArray12[local316] = local312 + local333;
			this.anIntArray19[local316] = local314 + local343;
			local310 = this.anIntArray15[local316];
			local312 = this.anIntArray12[local316];
			local314 = this.anIntArray19[local316];
			if (local83 == 1) {
				this.anIntArray17[local316] = local45.method270();
			}
		}
		local25.anInt413 = local166;
		local30.anInt413 = local133;
		local35.anInt413 = local115;
		local40.anInt413 = local151;
		local45.anInt413 = local124;
		for (local321 = 0; local321 < local59; local321++) {
			this.aShortArray1[local321] = (short) local25.method276();
			if (local67 == 1) {
				local323 = local30.method270();
				if ((local323 & 0x1) == 1) {
					this.aByteArray5[local321] = 1;
					local20 = true;
				} else {
					this.aByteArray5[local321] = 0;
				}
				if ((local323 & 0x2) == 2) {
					this.aByteArray4[local321] = (byte) (local323 >> 2);
					local18 = true;
				} else {
					this.aByteArray4[local321] = -1;
				}
			}
			if (local71 == 255) {
				this.aByteArray6[local321] = local35.method265();
			}
			if (local75 == 1) {
				this.aByteArray3[local321] = local40.method265();
			}
			if (local79 == 1) {
				this.anIntArray23[local321] = local45.method270();
			}
		}
		local25.anInt413 = local160;
		local30.anInt413 = local109;
		local323 = 0;
		local333 = 0;
		local343 = 0;
		@Pc(521) int local521 = 0;
		@Pc(528) int local528;
		for (@Pc(523) int local523 = 0; local523 < local59; local523++) {
			local528 = local30.method270();
			if (local528 == 1) {
				local323 = local25.method269() + local521;
				local333 = local25.method269() + local323;
				local343 = local25.method269() + local333;
				local521 = local343;
				this.anIntArray13[local523] = local323;
				this.anIntArray25[local523] = local333;
				this.anIntArray24[local523] = local343;
			}
			if (local528 == 2) {
				local333 = local343;
				local343 = local25.method269() + local521;
				local521 = local343;
				this.anIntArray13[local523] = local323;
				this.anIntArray25[local523] = local333;
				this.anIntArray24[local523] = local343;
			}
			if (local528 == 3) {
				local323 = local343;
				local343 = local25.method269() + local521;
				local521 = local343;
				this.anIntArray13[local523] = local323;
				this.anIntArray25[local523] = local333;
				this.anIntArray24[local523] = local343;
			}
			if (local528 == 4) {
				@Pc(631) int local631 = local323;
				local323 = local333;
				local333 = local631;
				local343 = local25.method269() + local521;
				local521 = local343;
				this.anIntArray13[local523] = local323;
				this.anIntArray25[local523] = local631;
				this.anIntArray24[local523] = local343;
			}
		}
		local25.anInt413 = local174;
		for (local528 = 0; local528 < local63; local528++) {
			this.anIntArray20[local528] = local25.method276();
			this.anIntArray14[local528] = local25.method276();
			this.anIntArray21[local528] = local25.method276();
		}
		if (!local18) {
			this.aByteArray4 = null;
		}
		if (!local20) {
			this.aByteArray5 = null;
		}
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "([Lclient!bd;I)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) Class3_Sub1_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		this.anInt285 = 0;
		this.anInt291 = 0;
		this.anInt286 = 0;
		this.aByte1 = -1;
		for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
			@Pc(45) Class3_Sub1_Sub2_Sub1 local45 = arg0[local40];
			if (local45 != null) {
				this.anInt285 += local45.anInt285;
				this.anInt291 += local45.anInt291;
				this.anInt286 += local45.anInt286;
				if (local45.aByteArray6 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local45.aByte1;
					}
					if (this.aByte1 != local45.aByte1) {
						local20 = true;
					}
				} else {
					local20 = true;
				}
				local18 |= local45.aByteArray5 != null;
				local22 |= local45.aByteArray3 != null;
				local24 |= local45.anIntArray23 != null;
				local26 |= local45.aByteArray4 != null;
			}
		}
		this.anIntArray15 = new int[this.anInt285];
		this.anIntArray12 = new int[this.anInt285];
		this.anIntArray19 = new int[this.anInt285];
		this.anIntArray17 = new int[this.anInt285];
		this.anIntArray13 = new int[this.anInt291];
		this.anIntArray25 = new int[this.anInt291];
		this.anIntArray24 = new int[this.anInt291];
		if (this.anInt286 > 0) {
			this.anIntArray20 = new int[this.anInt286];
			this.anIntArray14 = new int[this.anInt286];
			this.anIntArray21 = new int[this.anInt286];
		}
		if (local18) {
			this.aByteArray5 = new byte[this.anInt291];
		}
		if (local20) {
			this.aByteArray6 = new byte[this.anInt291];
		}
		if (local22) {
			this.aByteArray3 = new byte[this.anInt291];
		}
		if (local26) {
			this.aByteArray4 = new byte[this.anInt291];
		}
		if (local24) {
			this.anIntArray23 = new int[this.anInt291];
		}
		this.aShortArray1 = new short[this.anInt291];
		this.anInt285 = 0;
		this.anInt291 = 0;
		this.anInt286 = 0;
		@Pc(233) int local233 = 0;
		for (@Pc(235) int local235 = 0; local235 < arg1; local235++) {
			@Pc(240) Class3_Sub1_Sub2_Sub1 local240 = arg0[local235];
			if (local240 != null) {
				for (@Pc(244) int local244 = 0; local244 < local240.anInt291; local244++) {
					if (local18 && local240.aByteArray5 != null) {
						this.aByteArray5[this.anInt291] = local240.aByteArray5[local244];
					}
					if (local20) {
						if (local240.aByteArray6 == null) {
							this.aByteArray6[this.anInt291] = local240.aByte1;
						} else {
							this.aByteArray6[this.anInt291] = local240.aByteArray6[local244];
						}
					}
					if (local22 && local240.aByteArray3 != null) {
						this.aByteArray3[this.anInt291] = local240.aByteArray3[local244];
					}
					if (local26) {
						if (local240.aByteArray4 == null || local240.aByteArray4[local244] == -1) {
							this.aByteArray4[this.anInt291] = -1;
						} else {
							this.aByteArray4[this.anInt291] = (byte) (local240.aByteArray4[local244] + local233);
						}
					}
					if (local24 && local240.anIntArray23 != null) {
						this.anIntArray23[this.anInt291] = local240.anIntArray23[local244];
					}
					this.aShortArray1[this.anInt291] = local240.aShortArray1[local244];
					this.anIntArray13[this.anInt291] = this.method221(local240, local240.anIntArray13[local244]);
					this.anIntArray25[this.anInt291] = this.method221(local240, local240.anIntArray25[local244]);
					this.anIntArray24[this.anInt291] = this.method221(local240, local240.anIntArray24[local244]);
					this.anInt291++;
				}
				for (@Pc(397) int local397 = 0; local397 < local240.anInt286; local397++) {
					this.anIntArray20[this.anInt286] = this.method221(local240, local240.anIntArray20[local397]);
					this.anIntArray14[this.anInt286] = this.method221(local240, local240.anIntArray14[local397]);
					this.anIntArray21[this.anInt286] = this.method221(local240, local240.anIntArray21[local397]);
					this.anInt286++;
				}
				local233 += local240.anInt286;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!bd;ZZZ)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		this.anInt285 = arg0.anInt285;
		this.anInt291 = arg0.anInt291;
		this.anInt286 = arg0.anInt286;
		@Pc(60) int local60;
		if (arg1) {
			this.anIntArray15 = arg0.anIntArray15;
			this.anIntArray12 = arg0.anIntArray12;
			this.anIntArray19 = arg0.anIntArray19;
		} else {
			this.anIntArray15 = new int[this.anInt285];
			this.anIntArray12 = new int[this.anInt285];
			this.anIntArray19 = new int[this.anInt285];
			for (local60 = 0; local60 < this.anInt285; local60++) {
				this.anIntArray15[local60] = arg0.anIntArray15[local60];
				this.anIntArray12[local60] = arg0.anIntArray12[local60];
				this.anIntArray19[local60] = arg0.anIntArray19[local60];
			}
		}
		if (arg2) {
			this.aShortArray1 = arg0.aShortArray1;
		} else {
			this.aShortArray1 = new short[this.anInt291];
			for (local60 = 0; local60 < this.anInt291; local60++) {
				this.aShortArray1[local60] = arg0.aShortArray1[local60];
			}
		}
		this.aByteArray3 = arg0.aByteArray3;
		this.anIntArray13 = arg0.anIntArray13;
		this.anIntArray25 = arg0.anIntArray25;
		this.anIntArray24 = arg0.anIntArray24;
		this.aByteArray5 = arg0.aByteArray5;
		this.aByteArray6 = arg0.aByteArray6;
		this.aByteArray4 = arg0.aByteArray4;
		this.aByte1 = arg0.aByte1;
		this.anIntArray20 = arg0.anIntArray20;
		this.anIntArray14 = arg0.anIntArray14;
		this.anIntArray21 = arg0.anIntArray21;
		this.anIntArray17 = arg0.anIntArray17;
		this.anIntArray23 = arg0.anIntArray23;
		this.anIntArrayArray3 = arg0.anIntArrayArray3;
		this.anIntArrayArray4 = arg0.anIntArrayArray4;
		this.aClass63Array1 = arg0.aClass63Array1;
		this.aClass60Array1 = arg0.aClass60Array1;
		this.aClass63Array2 = arg0.aClass63Array2;
		this.aShort1 = arg0.aShort1;
		this.aShort2 = arg0.aShort2;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method228();
		@Pc(16) int local16 = (int) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3 + arg4 * arg4));
		@Pc(22) int local22 = arg1 * local16 >> 8;
		@Pc(26) Class3_Sub1_Sub2_Sub6 local26 = new Class3_Sub1_Sub2_Sub6();
		local26.anIntArray238 = new int[this.anInt291];
		local26.anIntArray234 = new int[this.anInt291];
		local26.anIntArray228 = new int[this.anInt291];
		for (@Pc(43) int local43 = 0; local43 < this.anInt291; local43++) {
			@Pc(49) byte local49;
			if (this.aByteArray5 == null) {
				local49 = 0;
			} else {
				local49 = this.aByteArray5[local43];
			}
			@Pc(92) Class63 local92;
			@Pc(123) int local123;
			@Pc(253) Class60 local253;
			if (this.aByteArray4 == null || this.aByteArray4[local43] == -1) {
				if (local49 == 0) {
					@Pc(73) int local73 = this.aShortArray1[local43] & 0xFFFF;
					if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray13[local43]] == null) {
						local92 = this.aClass63Array1[this.anIntArray13[local43]];
					} else {
						local92 = this.aClass63Array2[this.anIntArray13[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
					local26.anIntArray238[local43] = Static10.method230(local73, local123);
					if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray25[local43]] == null) {
						local92 = this.aClass63Array1[this.anIntArray25[local43]];
					} else {
						local92 = this.aClass63Array2[this.anIntArray25[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
					local26.anIntArray234[local43] = Static10.method230(local73, local123);
					if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray24[local43]] == null) {
						local92 = this.aClass63Array1[this.anIntArray24[local43]];
					} else {
						local92 = this.aClass63Array2[this.anIntArray24[local43]];
					}
					local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
					local26.anIntArray228[local43] = Static10.method230(local73, local123);
				} else if (local49 == 1) {
					local253 = this.aClass60Array1[local43];
					local123 = arg0 + (arg2 * local253.anInt2371 + arg3 * local253.anInt2368 + arg4 * local253.anInt2365) / (local22 + local22 / 2);
					local26.anIntArray238[local43] = Static10.method230(this.aShortArray1[local43] & 0xFFFF, local123);
					local26.anIntArray228[local43] = -1;
				} else {
					local26.anIntArray228[local43] = -2;
				}
			} else if (local49 == 0) {
				if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray13[local43]] == null) {
					local92 = this.aClass63Array1[this.anIntArray13[local43]];
				} else {
					local92 = this.aClass63Array2[this.anIntArray13[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
				local26.anIntArray238[local43] = Static10.method216(local123);
				if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray25[local43]] == null) {
					local92 = this.aClass63Array1[this.anIntArray25[local43]];
				} else {
					local92 = this.aClass63Array2[this.anIntArray25[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
				local26.anIntArray234[local43] = Static10.method216(local123);
				if (this.aClass63Array2 == null || this.aClass63Array2[this.anIntArray24[local43]] == null) {
					local92 = this.aClass63Array1[this.anIntArray24[local43]];
				} else {
					local92 = this.aClass63Array2[this.anIntArray24[local43]];
				}
				local123 = arg0 + (arg2 * local92.anInt2437 + arg3 * local92.anInt2431 + arg4 * local92.anInt2433) / (local22 * local92.anInt2435);
				local26.anIntArray228[local43] = Static10.method216(local123);
			} else if (local49 == 1) {
				local253 = this.aClass60Array1[local43];
				local123 = arg0 + (arg2 * local253.anInt2371 + arg3 * local253.anInt2368 + arg4 * local253.anInt2365) / (local22 + local22 / 2);
				local26.anIntArray238[local43] = Static10.method216(local123);
				local26.anIntArray228[local43] = -1;
			} else {
				local26.anIntArray228[local43] = -2;
			}
		}
		this.method231();
		local26.anInt2676 = this.anInt285;
		local26.anIntArray235 = this.anIntArray15;
		local26.anIntArray233 = this.anIntArray12;
		local26.anIntArray230 = this.anIntArray19;
		local26.anInt2682 = this.anInt291;
		local26.anIntArray232 = this.anIntArray13;
		local26.anIntArray231 = this.anIntArray25;
		local26.anIntArray229 = this.anIntArray24;
		local26.aByteArray37 = this.aByteArray6;
		local26.aByteArray36 = this.aByteArray3;
		local26.aByteArray38 = this.aByteArray4;
		if (local26.aByteArray38 == null) {
			local26.aShortArray9 = null;
		} else {
			local26.aShortArray9 = this.aShortArray1;
		}
		local26.aByte5 = this.aByte1;
		local26.anInt2681 = this.anInt286;
		local26.anIntArray236 = this.anIntArray20;
		local26.anIntArray239 = this.anIntArray14;
		local26.anIntArray237 = this.anIntArray21;
		local26.anIntArrayArray22 = this.anIntArrayArray3;
		local26.anIntArrayArray23 = this.anIntArrayArray4;
		return local26;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)V")
	public void method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			this.anIntArray15[local1] = this.anIntArray15[local1] * arg0 / 128;
			this.anIntArray12[local1] = this.anIntArray12[local1] * arg1 / 128;
			this.anIntArray19[local1] = this.anIntArray19[local1] * arg2 / 128;
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method218() {
		@Pc(3) Class3_Sub1_Sub2_Sub1 local3 = new Class3_Sub1_Sub2_Sub1();
		if (this.aByteArray5 != null) {
			local3.aByteArray5 = new byte[this.anInt291];
			for (@Pc(13) int local13 = 0; local13 < this.anInt291; local13++) {
				local3.aByteArray5[local13] = this.aByteArray5[local13];
			}
		}
		local3.anInt285 = this.anInt285;
		local3.anInt291 = this.anInt291;
		local3.anInt286 = this.anInt286;
		local3.anIntArray15 = this.anIntArray15;
		local3.anIntArray12 = this.anIntArray12;
		local3.anIntArray19 = this.anIntArray19;
		local3.anIntArray13 = this.anIntArray13;
		local3.anIntArray25 = this.anIntArray25;
		local3.anIntArray24 = this.anIntArray24;
		local3.aByteArray6 = this.aByteArray6;
		local3.aByteArray3 = this.aByteArray3;
		local3.aByteArray4 = this.aByteArray4;
		local3.aShortArray1 = this.aShortArray1;
		local3.aByte1 = this.aByte1;
		local3.anIntArray20 = this.anIntArray20;
		local3.anIntArray14 = this.anIntArray14;
		local3.anIntArray21 = this.anIntArray21;
		local3.anIntArray17 = this.anIntArray17;
		local3.anIntArray23 = this.anIntArray23;
		local3.anIntArrayArray3 = this.anIntArrayArray3;
		local3.anIntArrayArray4 = this.anIntArrayArray4;
		local3.aClass63Array1 = this.aClass63Array1;
		local3.aClass60Array1 = this.aClass60Array1;
		local3.aShort1 = this.aShort1;
		local3.aShort2 = this.aShort2;
		return local3;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	public void method219() {
		if (this.aBoolean16) {
			return;
		}
		super.anInt3141 = 0;
		this.anInt287 = 0;
		this.anInt288 = 999999;
		this.anInt290 = -999999;
		this.anInt289 = -99999;
		this.anInt292 = 99999;
		for (@Pc(23) int local23 = 0; local23 < this.anInt285; local23++) {
			@Pc(29) int local29 = this.anIntArray15[local23];
			@Pc(34) int local34 = this.anIntArray12[local23];
			@Pc(39) int local39 = this.anIntArray19[local23];
			if (local29 < this.anInt288) {
				this.anInt288 = local29;
			}
			if (local29 > this.anInt290) {
				this.anInt290 = local29;
			}
			if (local39 < this.anInt292) {
				this.anInt292 = local39;
			}
			if (local39 > this.anInt289) {
				this.anInt289 = local39;
			}
			if (-local34 > super.anInt3141) {
				super.anInt3141 = -local34;
			}
			if (local34 > this.anInt287) {
				this.anInt287 = local34;
			}
		}
		this.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
	public void method220() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			this.anIntArray19[local1] = -this.anIntArray19[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt291; local18++) {
			@Pc(24) int local24 = this.anIntArray13[local18];
			this.anIntArray13[local18] = this.anIntArray24[local18];
			this.anIntArray24[local18] = local24;
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!bd;I)I")
	private int method221(@OriginalArg(0) Class3_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray15[arg1];
		@Pc(11) int local11 = arg0.anIntArray12[arg1];
		@Pc(16) int local16 = arg0.anIntArray19[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt285; local18++) {
			if (local6 == this.anIntArray15[local18] && local11 == this.anIntArray12[local18] && local16 == this.anIntArray19[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray15[this.anInt285] = local6;
			this.anIntArray12[this.anInt285] = local11;
			this.anIntArray19[this.anInt285] = local16;
			if (arg0.anIntArray17 != null) {
				this.anIntArray17[this.anInt285] = arg0.anIntArray17[arg1];
			}
			local1 = this.anInt285++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(SS)V")
	public void method223(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt291; local1++) {
			if (this.aShortArray1[local1] == arg0) {
				this.aShortArray1[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "()V")
	public void method224() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			@Pc(7) int local7 = this.anIntArray19[local1];
			this.anIntArray19[local1] = this.anIntArray15[local1];
			this.anIntArray15[local1] = -local7;
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIZ)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class3_Sub1_Sub2_Sub1 local16 = new Class3_Sub1_Sub2_Sub1();
		local16.anInt285 = this.anInt285;
		local16.anInt291 = this.anInt291;
		local16.anInt286 = this.anInt286;
		local16.anIntArray15 = this.anIntArray15;
		local16.anIntArray19 = this.anIntArray19;
		local16.anIntArray13 = this.anIntArray13;
		local16.anIntArray25 = this.anIntArray25;
		local16.anIntArray24 = this.anIntArray24;
		local16.aByteArray5 = this.aByteArray5;
		local16.aByteArray6 = this.aByteArray6;
		local16.aByteArray3 = this.aByteArray3;
		local16.aByteArray4 = this.aByteArray4;
		local16.aShortArray1 = this.aShortArray1;
		local16.aByte1 = this.aByte1;
		local16.anIntArray20 = this.anIntArray20;
		local16.anIntArray14 = this.anIntArray14;
		local16.anIntArray21 = this.anIntArray21;
		local16.anIntArray17 = this.anIntArray17;
		local16.anIntArray23 = this.anIntArray23;
		local16.anIntArrayArray3 = this.anIntArrayArray3;
		local16.anIntArrayArray4 = this.anIntArrayArray4;
		local16.aShort1 = this.aShort1;
		local16.aShort2 = this.aShort2;
		local16.anIntArray12 = new int[local16.anInt285];
		@Pc(126) int local126 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(128) int local128 = 0; local128 < local16.anInt285; local128++) {
			@Pc(134) int local134 = this.anIntArray15[local128];
			@Pc(139) int local139 = this.anIntArray12[local128];
			@Pc(144) int local144 = this.anIntArray19[local128];
			@Pc(156) int local156 = arg0 + (arg1 - arg0) * (local134 + 64) / 128;
			@Pc(168) int local168 = arg3 + (arg2 - arg3) * (local134 + 64) / 128;
			@Pc(180) int local180 = local156 + (local168 - local156) * (local144 + 64) / 128;
			local16.anIntArray12[local128] = local139 + local180 - local126;
		}
		local16.method233();
		return local16;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)V")
	public void method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			this.anIntArray15[local1] += arg0;
			this.anIntArray12[local1] += arg1;
			this.anIntArray19[local1] += arg2;
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "()V")
	public void method227() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			this.anIntArray15[local1] = -this.anIntArray15[local1];
			this.anIntArray19[local1] = -this.anIntArray19[local1];
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "()V")
	public void method228() {
		if (this.aClass63Array1 != null) {
			return;
		}
		this.aClass63Array1 = new Class63[this.anInt285];
		for (@Pc(10) int local10 = 0; local10 < this.anInt285; local10++) {
			this.aClass63Array1[local10] = new Class63();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt291; local25++) {
			@Pc(31) int local31 = this.anIntArray13[local25];
			@Pc(36) int local36 = this.anIntArray25[local25];
			@Pc(41) int local41 = this.anIntArray24[local25];
			@Pc(51) int local51 = this.anIntArray15[local36] - this.anIntArray15[local31];
			@Pc(61) int local61 = this.anIntArray12[local36] - this.anIntArray12[local31];
			@Pc(71) int local71 = this.anIntArray19[local36] - this.anIntArray19[local31];
			@Pc(81) int local81 = this.anIntArray15[local41] - this.anIntArray15[local31];
			@Pc(91) int local91 = this.anIntArray12[local41] - this.anIntArray12[local31];
			@Pc(101) int local101 = this.anIntArray19[local41] - this.anIntArray19[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray5 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray5[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class63 local211 = this.aClass63Array1[local31];
				local211.anInt2437 += local109;
				local211.anInt2431 += local117;
				local211.anInt2433 += local125;
				local211.anInt2435++;
				@Pc(240) Class63 local240 = this.aClass63Array1[local36];
				local240.anInt2437 += local109;
				local240.anInt2431 += local117;
				local240.anInt2433 += local125;
				local240.anInt2435++;
				@Pc(269) Class63 local269 = this.aClass63Array1[local41];
				local269.anInt2437 += local109;
				local269.anInt2431 += local117;
				local269.anInt2433 += local125;
				local269.anInt2435++;
			} else if (local198 == 1) {
				if (this.aClass60Array1 == null) {
					this.aClass60Array1 = new Class60[this.anInt291];
				}
				@Pc(314) Class60 local314 = this.aClass60Array1[local25] = new Class60();
				local314.anInt2371 = local109;
				local314.anInt2368 = local117;
				local314.anInt2365 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "()V")
	public void method229() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt285; local1++) {
			@Pc(7) int local7 = this.anIntArray15[local1];
			this.anIntArray15[local1] = this.anIntArray19[local1];
			this.anIntArray19[local1] = -local7;
		}
		this.method233();
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "()V")
	private void method231() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray17 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt285; local9++) {
				local15 = this.anIntArray17[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray3 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray3[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt285) {
				local65 = this.anIntArray17[local59];
				this.anIntArrayArray3[local65][local5[local65]++] = local59++;
			}
			this.anIntArray17 = null;
		}
		if (this.anIntArray23 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt291; local9++) {
			local15 = this.anIntArray23[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray4 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray4[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt291) {
			local65 = this.anIntArray23[local59];
			this.anIntArrayArray4[local65][local5[local65]++] = local59++;
		}
		this.anIntArray23 = null;
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "()V")
	private void method233() {
		this.aClass63Array1 = null;
		this.aClass63Array2 = null;
		this.aClass60Array1 = null;
		this.aBoolean16 = false;
	}
}
