import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class3_Sub2_Sub1_Sub1_Sub1 extends Class3_Sub2_Sub1_Sub1 {

	@OriginalMember(owner = "client!af", name = "qb", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!af", name = "ub", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!af", name = "vb", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!af", name = "wb", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!af", name = "xb", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!af", name = "yb", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!af", name = "zb", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!af", name = "Bb", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!af", name = "Cb", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!af", name = "Db", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!af", name = "Eb", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!af", name = "Fb", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!af", name = "sb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!af", name = "Ab", descriptor = "I")
	private int anInt219 = 0;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!lc;IIIII)V")
	public Class3_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) Class3_Sub2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2046();
		arg0.method2043();
		super.anInt215 = arg0.anInt2560;
		super.anIntArray54 = arg0.anIntArray428;
		super.anIntArray56 = arg0.anIntArray430;
		super.anIntArray55 = arg0.anIntArray434;
		super.anInt216 = arg0.anInt2563;
		this.anIntArray59 = arg0.anIntArray431;
		this.anIntArray60 = arg0.anIntArray432;
		this.anIntArray62 = arg0.anIntArray436;
		this.aByteArray2 = arg0.aByteArray27;
		this.aByteArray3 = arg0.aByteArray31;
		this.aByte1 = arg0.aByte6;
		super.anIntArrayArray5 = arg0.anIntArrayArray22;
		super.anIntArrayArray4 = arg0.anIntArrayArray21;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray63 = new int[super.anInt216];
		this.anIntArray64 = new int[super.anInt216];
		this.anIntArray58 = new int[super.anInt216];
		@Pc(109) int local109;
		if (arg0.aShortArray32 == null) {
			this.aShortArray2 = null;
		} else {
			this.aShortArray2 = new short[super.anInt216];
			for (local109 = 0; local109 < super.anInt216; local109++) {
				@Pc(115) short local115 = arg0.aShortArray32[local109];
				if (local115 != -1 && Static13.anInterface2_1.method1824(local115)) {
					this.aShortArray2[local109] = local115;
				} else {
					this.aShortArray2[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2562 > 0 && arg0.aByteArray25 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2562];
			for (@Pc(155) int local155 = 0; local155 < super.anInt216; local155++) {
				if (arg0.aByteArray25[local155] != -1) {
					local153[arg0.aByteArray25[local155] & 0xFF]++;
				}
			}
			this.anInt219 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2562; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray28[local184] == 0) {
					this.anInt219++;
				}
			}
			this.anIntArray57 = new int[this.anInt219];
			this.anIntArray61 = new int[this.anInt219];
			this.anIntArray65 = new int[this.anInt219];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2562; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray28[local224] == 0) {
					this.anIntArray57[local222] = arg0.aShortArray31[local224] & 0xFFFF;
					this.anIntArray61[local222] = arg0.aShortArray33[local224] & 0xFFFF;
					this.anIntArray65[local222] = arg0.aShortArray30[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray1 = new byte[super.anInt216];
			for (local286 = 0; local286 < super.anInt216; local286++) {
				if (arg0.aByteArray25[local286] == -1) {
					this.aByteArray1[local286] = -1;
				} else {
					this.aByteArray1[local286] = (byte) local153[arg0.aByteArray25[local286] & 0xFF];
					if (this.aByteArray1[local286] == -1 && this.aShortArray2 != null) {
						this.aShortArray2[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt216; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray23 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray23[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray31 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray31[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray2 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray2[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class10 local408;
			@Pc(569) Class11 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray26[local109] & 0xFFFF;
					if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray59[local109]] == null) {
						local408 = arg0.aClass10Array2[this.anIntArray59[local109]];
					} else {
						local408 = arg0.aClass10Array1[this.anIntArray59[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
					this.anIntArray63[local109] = Static6.method212(local389, local286);
					if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray60[local109]] == null) {
						local408 = arg0.aClass10Array2[this.anIntArray60[local109]];
					} else {
						local408 = arg0.aClass10Array1[this.anIntArray60[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
					this.anIntArray64[local109] = Static6.method212(local389, local286);
					if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray62[local109]] == null) {
						local408 = arg0.aClass10Array2[this.anIntArray62[local109]];
					} else {
						local408 = arg0.aClass10Array1[this.anIntArray62[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
					this.anIntArray58[local109] = Static6.method212(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass11Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt485 + arg4 * local569.anInt479 + arg5 * local569.anInt478) / (local84 + local84 / 2);
					this.anIntArray63[local109] = Static6.method212(arg0.aShortArray26[local109] & 0xFFFF, local286);
					this.anIntArray58[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray63[local109] = 128;
					this.anIntArray58[local109] = -1;
				} else {
					this.anIntArray58[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray59[local109]] == null) {
					local408 = arg0.aClass10Array2[this.anIntArray59[local109]];
				} else {
					local408 = arg0.aClass10Array1[this.anIntArray59[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
				this.anIntArray63[local109] = Static6.method213(local286);
				if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray60[local109]] == null) {
					local408 = arg0.aClass10Array2[this.anIntArray60[local109]];
				} else {
					local408 = arg0.aClass10Array1[this.anIntArray60[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
				this.anIntArray64[local109] = Static6.method213(local286);
				if (arg0.aClass10Array1 == null || arg0.aClass10Array1[this.anIntArray62[local109]] == null) {
					local408 = arg0.aClass10Array2[this.anIntArray62[local109]];
				} else {
					local408 = arg0.aClass10Array1[this.anIntArray62[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt445 + arg4 * local408.anInt446 + arg5 * local408.anInt448) / (local84 * local408.anInt447);
				this.anIntArray58[local109] = Static6.method213(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass11Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt485 + arg4 * local569.anInt479 + arg5 * local569.anInt478) / (local84 + local84 / 2);
				this.anIntArray63[local109] = Static6.method213(local286);
				this.anIntArray58[local109] = -1;
			} else {
				this.anIntArray58[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "([Lclient!af;I)V")
	private Class3_Sub2_Sub1_Sub1_Sub1(@OriginalArg(0) Class3_Sub2_Sub1_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt215 = 0;
		super.anInt216 = 0;
		this.anInt219 = 0;
		this.aByte1 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class3_Sub2_Sub1_Sub1_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt215 += local34.anInt215;
				super.anInt216 += local34.anInt216;
				this.anInt219 += local34.anInt219;
				if (local34.aByteArray2 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local34.aByte1;
					}
					if (this.aByte1 != local34.aByte1) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray3 != null;
				local13 |= local34.aShortArray2 != null;
				local15 |= local34.aByteArray1 != null;
			}
		}
		super.anIntArray54 = new int[super.anInt215];
		super.anIntArray56 = new int[super.anInt215];
		super.anIntArray55 = new int[super.anInt215];
		this.anIntArray59 = new int[super.anInt216];
		this.anIntArray60 = new int[super.anInt216];
		this.anIntArray62 = new int[super.anInt216];
		this.anIntArray63 = new int[super.anInt216];
		this.anIntArray64 = new int[super.anInt216];
		this.anIntArray58 = new int[super.anInt216];
		if (local9) {
			this.aByteArray2 = new byte[super.anInt216];
		}
		if (local11) {
			this.aByteArray3 = new byte[super.anInt216];
		}
		if (local13) {
			this.aShortArray2 = new short[super.anInt216];
		}
		if (local15) {
			this.aByteArray1 = new byte[super.anInt216];
		}
		if (this.anInt219 > 0) {
			this.anIntArray57 = new int[this.anInt219];
			this.anIntArray61 = new int[this.anInt219];
			this.anIntArray65 = new int[this.anInt219];
		}
		super.anInt215 = 0;
		super.anInt216 = 0;
		this.anInt219 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class3_Sub2_Sub1_Sub1_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt216; local220++) {
					this.anIntArray59[super.anInt216] = local216.anIntArray59[local220] + super.anInt215;
					this.anIntArray60[super.anInt216] = local216.anIntArray60[local220] + super.anInt215;
					this.anIntArray62[super.anInt216] = local216.anIntArray62[local220] + super.anInt215;
					this.anIntArray63[super.anInt216] = local216.anIntArray63[local220];
					this.anIntArray64[super.anInt216] = local216.anIntArray64[local220];
					this.anIntArray58[super.anInt216] = local216.anIntArray58[local220];
					if (local9) {
						if (local216.aByteArray2 == null) {
							this.aByteArray2[super.anInt216] = local216.aByte1;
						} else {
							this.aByteArray2[super.anInt216] = local216.aByteArray2[local220];
						}
					}
					if (local11 && local216.aByteArray3 != null) {
						this.aByteArray3[super.anInt216] = local216.aByteArray3[local220];
					}
					if (local13) {
						if (local216.aShortArray2 == null) {
							this.aShortArray2[super.anInt216] = -1;
						} else {
							this.aShortArray2[super.anInt216] = local216.aShortArray2[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray1 == null || local216.aByteArray1[local220] == -1) {
							this.aByteArray1[super.anInt216] = -1;
						} else {
							this.aByteArray1[super.anInt216] = (byte) (local216.aByteArray1[local220] + this.anInt219);
						}
					}
					super.anInt216++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt219; local385++) {
					this.anIntArray57[this.anInt219] = local216.anIntArray57[local385] + super.anInt215;
					this.anIntArray61[this.anInt219] = local216.anIntArray61[local385] + super.anInt215;
					this.anIntArray65[this.anInt219] = local216.anIntArray65[local385] + super.anInt215;
					this.anInt219++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt215; local435++) {
					super.anIntArray54[super.anInt215] = local216.anIntArray54[local435];
					super.anIntArray56[super.anInt215] = local216.anIntArray56[local435];
					super.anIntArray55[super.anInt215] = local216.anIntArray55[local435];
					super.anInt215++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!af;[B)Lclient!af;")
	private Class3_Sub2_Sub1_Sub1_Sub1 method205(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt215 = super.anInt215;
		arg1.anInt216 = super.anInt216;
		arg1.anInt219 = this.anInt219;
		if (arg1.anIntArray54 == null || arg1.anIntArray54.length < super.anInt215) {
			arg1.anIntArray54 = new int[super.anInt215 + 100];
			arg1.anIntArray56 = new int[super.anInt215 + 100];
			arg1.anIntArray55 = new int[super.anInt215 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt215; local43++) {
			arg1.anIntArray54[local43] = super.anIntArray54[local43];
			arg1.anIntArray56[local43] = super.anIntArray56[local43];
			arg1.anIntArray55[local43] = super.anIntArray55[local43];
		}
		if (arg0) {
			arg1.aByteArray3 = this.aByteArray3;
		} else {
			arg1.aByteArray3 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray3 == null) {
				for (local88 = 0; local88 < super.anInt216; local88++) {
					arg1.aByteArray3[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt216; local88++) {
					arg1.aByteArray3[local88] = this.aByteArray3[local88];
				}
			}
		}
		arg1.anIntArray59 = this.anIntArray59;
		arg1.anIntArray60 = this.anIntArray60;
		arg1.anIntArray62 = this.anIntArray62;
		arg1.anIntArray63 = this.anIntArray63;
		arg1.anIntArray64 = this.anIntArray64;
		arg1.anIntArray58 = this.anIntArray58;
		arg1.aByteArray2 = this.aByteArray2;
		arg1.aByteArray1 = this.aByteArray1;
		arg1.aShortArray2 = this.aShortArray2;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray57 = this.anIntArray57;
		arg1.anIntArray61 = this.anIntArray61;
		arg1.anIntArray65 = this.anIntArray65;
		arg1.anIntArrayArray5 = super.anIntArrayArray5;
		arg1.anIntArrayArray4 = super.anIntArrayArray4;
		arg1.aBoolean13 = super.aBoolean13;
		arg1.aBoolean15 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZZJII)V")
	private void method206(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static6.anIntArray73[local5] = 0;
		}
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(93) int local93;
		for (@Pc(16) int local16 = 0; local16 < super.anInt216; local16++) {
			if (this.anIntArray58[local16] != -2) {
				local28 = this.anIntArray59[local16];
				local33 = this.anIntArray60[local16];
				local38 = this.anIntArray62[local16];
				local42 = Static6.anIntArray69[local28];
				local46 = Static6.anIntArray69[local33];
				local50 = Static6.anIntArray69[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static6.anIntArray78[local28];
					local69 = Static6.anIntArray78[local33];
					@Pc(73) int local73 = Static6.anIntArray78[local38];
					@Pc(77) int local77 = Static6.anIntArray75[local28];
					local81 = Static6.anIntArray75[local33];
					local85 = Static6.anIntArray75[local38];
					@Pc(89) int local89 = Static6.anIntArray80[local28];
					local93 = Static6.anIntArray80[local33];
					@Pc(97) int local97 = Static6.anIntArray80[local38];
					local65 -= local69;
					@Pc(105) int local105 = local73 - local69;
					@Pc(109) int local109 = local77 - local81;
					@Pc(113) int local113 = local85 - local81;
					@Pc(117) int local117 = local89 - local93;
					@Pc(121) int local121 = local97 - local93;
					@Pc(129) int local129 = local109 * local121 - local117 * local113;
					@Pc(137) int local137 = local117 * local105 - local65 * local121;
					@Pc(145) int local145 = local65 * local113 - local109 * local105;
					if (local69 * local129 + local81 * local137 + local93 * local145 > 0) {
						Static6.aBooleanArray2[local16] = true;
						@Pc(177) int local177 = (Static6.anIntArray70[local28] + Static6.anIntArray70[local33] + Static6.anIntArray70[local38]) / 3 + arg3;
						Static6.anIntArrayArray7[local177][Static6.anIntArray73[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method207(Static25.anInt214, Static25.anInt217, Static6.anIntArray68[local28], Static6.anIntArray68[local33], Static6.anIntArray68[local38], local42, local46, local50)) {
						Static25.aLongArray2[Static25.anInt218++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static6.anIntArray68[local38] - Static6.anIntArray68[local33]) - (Static6.anIntArray68[local28] - Static6.anIntArray68[local33]) * (local50 - local46) > 0) {
						Static6.aBooleanArray2[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static13.anInt467 && local46 <= Static13.anInt467 && local50 <= Static13.anInt467) {
							Static6.aBooleanArray1[local16] = false;
						} else {
							Static6.aBooleanArray1[local16] = true;
						}
						local65 = (Static6.anIntArray70[local28] + Static6.anIntArray70[local33] + Static6.anIntArray70[local38]) / 3 + arg3;
						Static6.anIntArrayArray7[local65][Static6.anIntArray73[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray2 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static6.anIntArray73[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static6.anIntArrayArray7[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method211(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static6.anIntArray79[local28] = 0;
			Static6.anIntArray83[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static6.anIntArray73[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static6.anIntArrayArray7[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray2[local50];
					local69 = Static6.anIntArray79[local382]++;
					Static6.anIntArrayArray6[local382][local69] = local50;
					if (local382 < 10) {
						Static6.anIntArray83[local382] += local33;
					} else if (local382 == 10) {
						Static6.anIntArray77[local69] = local33;
					} else {
						Static6.anIntArray71[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static6.anIntArray79[1] > 0 || Static6.anIntArray79[2] > 0) {
			local38 = (Static6.anIntArray83[1] + Static6.anIntArray83[2]) / (Static6.anIntArray79[1] + Static6.anIntArray79[2]);
		}
		local42 = 0;
		if (Static6.anIntArray79[3] > 0 || Static6.anIntArray79[4] > 0) {
			local42 = (Static6.anIntArray83[3] + Static6.anIntArray83[4]) / (Static6.anIntArray79[3] + Static6.anIntArray79[4]);
		}
		local46 = 0;
		if (Static6.anIntArray79[6] > 0 || Static6.anIntArray79[8] > 0) {
			local46 = (Static6.anIntArray83[6] + Static6.anIntArray83[8]) / (Static6.anIntArray79[6] + Static6.anIntArray79[8]);
		}
		local65 = 0;
		local69 = Static6.anIntArray79[10];
		@Pc(515) int[] local515 = Static6.anIntArrayArray6[10];
		@Pc(517) int[] local517 = Static6.anIntArray77;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static6.anIntArray79[11];
			local515 = Static6.anIntArrayArray6[11];
			local517 = Static6.anIntArray71;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method211(local515[local65++]);
				if (local65 == local69 && local515 != Static6.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static6.anIntArray79[11];
					local515 = Static6.anIntArrayArray6[11];
					local517 = Static6.anIntArray71;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method211(local515[local65++]);
				if (local65 == local69 && local515 != Static6.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static6.anIntArray79[11];
					local515 = Static6.anIntArrayArray6[11];
					local517 = Static6.anIntArray71;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method211(local515[local65++]);
				if (local65 == local69 && local515 != Static6.anIntArrayArray6[11]) {
					local65 = 0;
					local69 = Static6.anIntArray79[11];
					local515 = Static6.anIntArrayArray6[11];
					local517 = Static6.anIntArray71;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static6.anIntArray79[local81];
			@Pc(680) int[] local680 = Static6.anIntArrayArray6[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method211(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method211(local515[local65++]);
			if (local65 == local69 && local515 != Static6.anIntArrayArray6[11]) {
				local65 = 0;
				local515 = Static6.anIntArrayArray6[11];
				local69 = Static6.anIntArray79[11];
				local517 = Static6.anIntArray71;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([[IIIIZI)Lclient!d;")
	@Override
	public Class3_Sub2_Sub1_Sub1 method195(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method191();
		@Pc(6) int local6 = arg1 + super.aShort14;
		@Pc(11) int local11 = arg1 + super.aShort15;
		@Pc(16) int local16 = arg3 + super.aShort16;
		@Pc(21) int local21 = arg3 + super.aShort12;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class3_Sub2_Sub1_Sub1_Sub1 local101;
		if (arg4) {
			local101 = new Class3_Sub2_Sub1_Sub1_Sub1();
			local101.anInt215 = super.anInt215;
			local101.anInt216 = super.anInt216;
			local101.anInt219 = this.anInt219;
			local101.anIntArray54 = super.anIntArray54;
			local101.anIntArray55 = super.anIntArray55;
			local101.anIntArray59 = this.anIntArray59;
			local101.anIntArray60 = this.anIntArray60;
			local101.anIntArray62 = this.anIntArray62;
			local101.anIntArray63 = this.anIntArray63;
			local101.anIntArray64 = this.anIntArray64;
			local101.anIntArray58 = this.anIntArray58;
			local101.aByteArray2 = this.aByteArray2;
			local101.aByteArray3 = this.aByteArray3;
			local101.aByteArray1 = this.aByteArray1;
			local101.aShortArray2 = this.aShortArray2;
			local101.aByte1 = this.aByte1;
			local101.anIntArray57 = this.anIntArray57;
			local101.anIntArray61 = this.anIntArray61;
			local101.anIntArray65 = this.anIntArray65;
			local101.anIntArrayArray5 = super.anIntArrayArray5;
			local101.anIntArrayArray4 = super.anIntArrayArray4;
			local101.aBoolean13 = super.aBoolean13;
			local101.anIntArray56 = new int[local101.anInt215];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt215; local201++) {
				local209 = super.anIntArray54[local201] + arg1;
				local216 = super.anIntArray55[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray56[local201] = super.anIntArray56[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt215; local201++) {
				local209 = (super.anIntArray56[local201] << 16) / super.aShort36;
				if (local209 < arg5) {
					local216 = super.anIntArray54[local201] + arg1;
					local220 = super.anIntArray55[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray56[local201] = super.anIntArray56[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray56[local201] = super.anIntArray56[local201];
				}
			}
		}
		super.aBoolean15 = false;
		return local101;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ma;ILclient!ma;I[I)V")
	@Override
	public void method188(@OriginalArg(0) Class3_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method196(arg0, arg1);
			return;
		}
		@Pc(18) Class50 local18 = arg0.aClass50Array1[arg1];
		@Pc(23) Class50 local23 = arg2.aClass50Array1[arg3];
		@Pc(26) Class3_Sub23 local26 = local18.aClass3_Sub23_1;
		Static6.anInt221 = 0;
		Static6.anInt222 = 0;
		Static6.anInt220 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2638; local41++) {
			local47 = local18.anIntArray459[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray665[local47] == 0) {
				this.method210(local26.anIntArray665[local47], local26.anIntArrayArray34[local47], local18.anIntArray454[local41], local18.anIntArray455[local41], local18.anIntArray456[local41]);
			}
		}
		Static6.anInt221 = 0;
		Static6.anInt222 = 0;
		Static6.anInt220 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt2638; local47++) {
			@Pc(112) int local112 = local23.anIntArray459[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray665[local112] == 0) {
				this.method210(local26.anIntArray665[local112], local26.anIntArrayArray34[local112], local23.anIntArray454[local47], local23.anIntArray455[local47], local23.anIntArray456[local47]);
			}
		}
		super.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!d;)Lclient!d;")
	public Class3_Sub2_Sub1_Sub1 method208(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		return new Class3_Sub2_Sub1_Sub1_Sub1(new Class3_Sub2_Sub1_Sub1_Sub1[] { this, (Class3_Sub2_Sub1_Sub1_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ma;I)V")
	@Override
	public void method196(@OriginalArg(0) Class3_Sub2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray5 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class50 local12 = arg0.aClass50Array1[arg1];
		@Pc(15) Class3_Sub23 local15 = local12.aClass3_Sub23_1;
		Static6.anInt221 = 0;
		Static6.anInt222 = 0;
		Static6.anInt220 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2638; local23++) {
			@Pc(29) int local29 = local12.anIntArray459[local23];
			this.method210(local15.anIntArray665[local29], local15.anIntArrayArray34[local29], local12.anIntArray454[local23], local12.anIntArray455[local23], local12.anIntArray456[local23]);
		}
		super.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)Lclient!d;")
	@Override
	public Class3_Sub2_Sub1_Sub1 method194(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static6.aByteArray4.length < super.anInt216) {
			Static6.aByteArray4 = new byte[super.anInt216 + 100];
		}
		return this.method205(arg0, Static6.aClass3_Sub2_Sub1_Sub1_Sub1_1, Static6.aByteArray4);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method191();
			@Pc(3) int local3 = Static13.anInt475;
			@Pc(5) int local5 = Static13.anInt468;
			@Pc(9) int local9 = Static6.anIntArray72[0];
			@Pc(13) int local13 = Static6.anIntArray82[0];
			@Pc(17) int local17 = Static6.anIntArray72[arg0];
			@Pc(21) int local21 = Static6.anIntArray82[arg0];
			@Pc(25) int local25 = Static6.anIntArray72[arg1];
			@Pc(29) int local29 = Static6.anIntArray82[arg1];
			@Pc(33) int local33 = Static6.anIntArray72[arg2];
			@Pc(37) int local37 = Static6.anIntArray82[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt215; local49++) {
				@Pc(55) int local55 = super.anIntArray54[local49];
				@Pc(60) int local60 = super.anIntArray56[local49];
				@Pc(65) int local65 = super.anIntArray55[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static6.anIntArray70[local49] = local65 - local47;
				Static6.anIntArray69[local49] = local3 + (local55 << 9) / arg6;
				Static6.anIntArray68[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt219 > 0) {
					Static6.anIntArray78[local49] = local55;
					Static6.anIntArray75[local49] = local77;
					Static6.anIntArray80[local49] = local65;
				}
			}
			this.method206(false, false, 0L, super.aShort17, super.aShort17 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)Lclient!d;")
	@Override
	public Class3_Sub2_Sub1_Sub1 method199(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static6.aByteArray5.length < super.anInt216) {
			Static6.aByteArray5 = new byte[super.anInt216 + 100];
		}
		return this.method205(arg0, Static6.aClass3_Sub2_Sub1_Sub1_Sub1_2, Static6.aByteArray5);
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	private void method209(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static13.anInt475;
		@Pc(3) int local3 = Static13.anInt468;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray59[arg0];
		@Pc(15) int local15 = this.anIntArray60[arg0];
		@Pc(20) int local20 = this.anIntArray62[arg0];
		@Pc(24) int local24 = Static6.anIntArray80[local10];
		@Pc(28) int local28 = Static6.anIntArray80[local15];
		@Pc(32) int local32 = Static6.anIntArray80[local20];
		if (this.aByteArray3 == null) {
			Static13.anInt472 = 0;
		} else {
			Static13.anInt472 = this.aByteArray3[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static6.anIntArray81[0] = Static6.anIntArray69[local10];
			Static6.anIntArray66[0] = Static6.anIntArray68[local10];
			local5++;
			Static6.anIntArray67[0] = this.anIntArray63[arg0];
		} else {
			local73 = Static6.anIntArray78[local10];
			local77 = Static6.anIntArray75[local10];
			local82 = this.anIntArray63[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static6.anIntArray74[local32 - local24];
				Static6.anIntArray81[0] = local1 + (local73 + ((Static6.anIntArray78[local20] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[0] = local3 + (local77 + ((Static6.anIntArray75[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static6.anIntArray67[0] = local82 + ((this.anIntArray58[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static6.anIntArray74[local28 - local24];
				Static6.anIntArray81[local5] = local1 + (local73 + ((Static6.anIntArray78[local15] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[local5] = local3 + (local77 + ((Static6.anIntArray75[local15] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray67[local5++] = local82 + ((this.anIntArray64[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static6.anIntArray81[local5] = Static6.anIntArray69[local15];
			Static6.anIntArray66[local5] = Static6.anIntArray68[local15];
			Static6.anIntArray67[local5++] = this.anIntArray64[arg0];
		} else {
			local73 = Static6.anIntArray78[local15];
			local77 = Static6.anIntArray75[local15];
			local82 = this.anIntArray64[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static6.anIntArray74[local24 - local28];
				Static6.anIntArray81[local5] = local1 + (local73 + ((Static6.anIntArray78[local10] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[local5] = local3 + (local77 + ((Static6.anIntArray75[local10] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray67[local5++] = local82 + ((this.anIntArray63[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static6.anIntArray74[local32 - local28];
				Static6.anIntArray81[local5] = local1 + (local73 + ((Static6.anIntArray78[local20] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[local5] = local3 + (local77 + ((Static6.anIntArray75[local20] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray67[local5++] = local82 + ((this.anIntArray58[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static6.anIntArray81[local5] = Static6.anIntArray69[local20];
			Static6.anIntArray66[local5] = Static6.anIntArray68[local20];
			Static6.anIntArray67[local5++] = this.anIntArray58[arg0];
		} else {
			local73 = Static6.anIntArray78[local20];
			local77 = Static6.anIntArray75[local20];
			local82 = this.anIntArray58[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static6.anIntArray74[local28 - local32];
				Static6.anIntArray81[local5] = local1 + (local73 + ((Static6.anIntArray78[local15] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[local5] = local3 + (local77 + ((Static6.anIntArray75[local15] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray67[local5++] = local82 + ((this.anIntArray64[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static6.anIntArray74[local24 - local32];
				Static6.anIntArray81[local5] = local1 + (local73 + ((Static6.anIntArray78[local10] - local73) * local95 >> 16) << 9) / 50;
				Static6.anIntArray66[local5] = local3 + (local77 + ((Static6.anIntArray75[local10] - local77) * local95 >> 16) << 9) / 50;
				Static6.anIntArray67[local5++] = local82 + ((this.anIntArray63[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static6.anIntArray81[0];
		local77 = Static6.anIntArray81[1];
		local82 = Static6.anIntArray81[2];
		local95 = Static6.anIntArray66[0];
		@Pc(590) int local590 = Static6.anIntArray66[1];
		@Pc(594) int local594 = Static6.anIntArray66[2];
		Static13.aBoolean29 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static13.anInt467 || local77 > Static13.anInt467 || local82 > Static13.anInt467) {
				Static13.aBoolean29 = true;
			}
			if (this.aShortArray2 != null && this.aShortArray2[arg0] != -1) {
				if (this.aByteArray1 == null || this.aByteArray1[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray1[arg0] & 0xFF;
					local683 = this.anIntArray57[local678];
					local688 = this.anIntArray61[local678];
					local693 = this.anIntArray65[local678];
				}
				if (this.anIntArray58[arg0] == -1) {
					Static13.method519(local95, local590, local594, local73, local77, local82, this.anIntArray63[arg0], this.anIntArray63[arg0], this.anIntArray63[arg0], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], this.aShortArray2[arg0]);
				} else {
					Static13.method519(local95, local590, local594, local73, local77, local82, Static6.anIntArray67[0], Static6.anIntArray67[1], Static6.anIntArray67[2], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], this.aShortArray2[arg0]);
				}
			} else if (this.anIntArray58[arg0] == -1) {
				Static13.method518(local95, local590, local594, local73, local77, local82, Static6.anIntArray76[this.anIntArray63[arg0]]);
			} else {
				Static13.method521(local95, local590, local594, local73, local77, local82, Static6.anIntArray67[0], Static6.anIntArray67[1], Static6.anIntArray67[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static13.anInt467 || local77 > Static13.anInt467 || local82 > Static13.anInt467 || Static6.anIntArray81[3] < 0 || Static6.anIntArray81[3] > Static13.anInt467) {
			Static13.aBoolean29 = true;
		}
		if (this.aShortArray2 == null || this.aShortArray2[arg0] == -1) {
			if (this.anIntArray58[arg0] == -1) {
				local683 = Static6.anIntArray76[this.anIntArray63[arg0]];
				Static13.method518(local95, local590, local594, local73, local77, local82, local683);
				Static13.method518(local95, local594, Static6.anIntArray66[3], local73, local82, Static6.anIntArray81[3], local683);
				return;
			}
			Static13.method521(local95, local590, local594, local73, local77, local82, Static6.anIntArray67[0], Static6.anIntArray67[1], Static6.anIntArray67[2]);
			Static13.method521(local95, local594, Static6.anIntArray66[3], local73, local82, Static6.anIntArray81[3], Static6.anIntArray67[0], Static6.anIntArray67[2], Static6.anIntArray67[3]);
			return;
		}
		if (this.aByteArray1 == null || this.aByteArray1[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray1[arg0] & 0xFF;
			local683 = this.anIntArray57[local678];
			local688 = this.anIntArray61[local678];
			local693 = this.anIntArray65[local678];
		}
		@Pc(956) short local956 = this.aShortArray2[arg0];
		if (this.anIntArray58[arg0] == -1) {
			Static13.method519(local95, local590, local594, local73, local77, local82, this.anIntArray63[arg0], this.anIntArray63[arg0], this.anIntArray63[arg0], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], local956);
			Static13.method519(local95, local594, Static6.anIntArray66[3], local73, local82, Static6.anIntArray81[3], this.anIntArray63[arg0], this.anIntArray63[arg0], this.anIntArray63[arg0], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], local956);
			return;
		}
		Static13.method519(local95, local590, local594, local73, local77, local82, Static6.anIntArray67[0], Static6.anIntArray67[1], Static6.anIntArray67[2], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], local956);
		Static13.method519(local95, local594, Static6.anIntArray66[3], local73, local82, Static6.anIntArray81[3], Static6.anIntArray67[0], Static6.anIntArray67[2], Static6.anIntArray67[3], Static6.anIntArray78[local683], Static6.anIntArray78[local688], Static6.anIntArray78[local693], Static6.anIntArray75[local683], Static6.anIntArray75[local688], Static6.anIntArray75[local693], Static6.anIntArray80[local683], Static6.anIntArray80[local688], Static6.anIntArray80[local693], local956);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean15) {
			this.method191();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort11 * arg2 + super.aShort13 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort11 * arg2 + super.aShort36 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort11 << 9;
		if (local78 / local38 <= Static13.anInt469) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort11 << 9;
		if (local91 / local38 >= Static13.anInt470) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort11 * arg1 + super.aShort13 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static13.anInt471) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort11 * arg1 + super.aShort36 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static13.anInt474) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt219 > 0;
		@Pc(172) int local172 = Static13.anInt475;
		@Pc(174) int local174 = Static13.anInt468;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static6.anIntArray72[arg0];
			local178 = Static6.anIntArray82[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static25.aBoolean14 && local57 > 0) {
			if (local71 > 0) {
				local204 = local91 / local38;
				local208 = local78 / local57;
			} else {
				local204 = local91 / local57;
				local208 = local78 / local38;
			}
			if (local107 > 0) {
				local223 = local146 / local38;
				local227 = local123 / local57;
			} else {
				local223 = local146 / local57;
				local227 = local123 / local38;
			}
			local240 = Static25.anInt214 - Static13.anInt475;
			@Pc(244) int local244 = Static25.anInt217 - Static13.anInt468;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort14, super.aShort15, super.aShort14, super.aShort15, super.aShort14, super.aShort15, super.aShort14, super.aShort15 };
				@Pc(350) int[] local350 = new int[] { super.aShort16, super.aShort16, super.aShort12, super.aShort12, super.aShort16, super.aShort16, super.aShort12, super.aShort12 };
				@Pc(393) int[] local393 = new int[] { super.aShort36, super.aShort36, super.aShort36, super.aShort36, super.aShort13, super.aShort13, super.aShort13, super.aShort13 };
				for (@Pc(395) int local395 = 0; local395 < 8; local395++) {
					@Pc(400) int local400 = local307[local395];
					@Pc(404) int local404 = local393[local395];
					@Pc(408) int local408 = local350[local395];
					@Pc(420) int local420;
					if (arg0 != 0) {
						local420 = local408 * local176 + local400 * local178 >> 16;
						local408 = local408 * local178 - local400 * local176 >> 16;
						local400 = local420;
					}
					local400 += arg5;
					local404 += arg6;
					local408 += arg7;
					local420 = local408 * arg3 + local400 * arg4 >> 16;
					local408 = local408 * arg4 - local400 * arg3 >> 16;
					local400 = local420;
					local420 = local404 * arg2 - local408 * arg1 >> 16;
					local408 = local404 * arg1 + local408 * arg2 >> 16;
					if (local408 > 0) {
						@Pc(496) int local496 = (local400 << 9) / local408;
						@Pc(502) int local502 = (local420 << 9) / local408;
						if (local496 < local204) {
							local204 = local496;
						}
						if (local496 > local208) {
							local208 = local496;
						}
						if (local502 < local223) {
							local223 = local502;
						}
						if (local502 > local227) {
							local227 = local502;
						}
					}
				}
				if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
					if (super.aBoolean13) {
						Static25.aLongArray2[Static25.anInt218++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt215; local204++) {
			local223 = super.anIntArray54[local204];
			local208 = super.anIntArray56[local204];
			local227 = super.anIntArray55[local204];
			if (arg0 != 0) {
				local240 = local227 * local176 + local223 * local178 >> 16;
				local227 = local227 * local178 - local223 * local176 >> 16;
				local223 = local240;
			}
			local223 += arg5;
			local208 += arg6;
			local227 += arg7;
			local240 = local227 * arg3 + local223 * arg4 >> 16;
			local227 = local227 * arg4 - local223 * arg3 >> 16;
			local223 = local240;
			local240 = local208 * arg2 - local227 * arg1 >> 16;
			local227 = local208 * arg1 + local227 * arg2 >> 16;
			Static6.anIntArray70[local204] = local227 - local24;
			if (local227 >= 50) {
				Static6.anIntArray69[local204] = local172 + (local223 << 9) / local227;
				Static6.anIntArray68[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static6.anIntArray69[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static6.anIntArray78[local204] = local223;
				Static6.anIntArray75[local204] = local240;
				Static6.anIntArray80[local204] = local227;
			}
		}
		try {
			this.method206(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I[IIII)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static6.anInt221 = 0;
			Static6.anInt222 = 0;
			Static6.anInt220 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray5.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray5[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static6.anInt221 += super.anIntArray54[local36];
						Static6.anInt222 += super.anIntArray56[local36];
						Static6.anInt220 += super.anIntArray55[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static6.anInt221 = Static6.anInt221 / local6 + arg2;
				Static6.anInt222 = Static6.anInt222 / local6 + arg3;
				Static6.anInt220 = Static6.anInt220 / local6 + arg4;
			} else {
				Static6.anInt221 = arg2;
				Static6.anInt222 = arg3;
				Static6.anInt220 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray5.length) {
					local115 = super.anIntArrayArray5[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray54[local31] += arg2;
						super.anIntArray56[local31] += arg3;
						super.anIntArray55[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray5.length) {
					local115 = super.anIntArrayArray5[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray54[local31] -= Static6.anInt221;
						super.anIntArray56[local31] -= Static6.anInt222;
						super.anIntArray55[local31] -= Static6.anInt220;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static6.anIntArray72[local225];
							local235 = Static6.anIntArray82[local225];
							local253 = super.anIntArray56[local31] * local231 + super.anIntArray54[local31] * local235 + 32767 >> 16;
							super.anIntArray56[local31] = super.anIntArray56[local31] * local235 + 32767 - super.anIntArray54[local31] * local231 >> 16;
							super.anIntArray54[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static6.anIntArray72[local36];
							local235 = Static6.anIntArray82[local36];
							local253 = super.anIntArray56[local31] * local235 + 32767 - super.anIntArray55[local31] * local231 >> 16;
							super.anIntArray55[local31] = super.anIntArray56[local31] * local231 + super.anIntArray55[local31] * local235 + 32767 >> 16;
							super.anIntArray56[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static6.anIntArray72[local219];
							local235 = Static6.anIntArray82[local219];
							local253 = super.anIntArray55[local31] * local231 + super.anIntArray54[local31] * local235 + 32767 >> 16;
							super.anIntArray55[local31] = super.anIntArray55[local31] * local235 + 32767 - super.anIntArray54[local31] * local231 >> 16;
							super.anIntArray54[local31] = local253;
						}
						super.anIntArray54[local31] += Static6.anInt221;
						super.anIntArray56[local31] += Static6.anInt222;
						super.anIntArray55[local31] += Static6.anInt220;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray5.length) {
					local115 = super.anIntArrayArray5[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray54[local31] -= Static6.anInt221;
						super.anIntArray56[local31] -= Static6.anInt222;
						super.anIntArray55[local31] -= Static6.anInt220;
						super.anIntArray54[local31] = super.anIntArray54[local31] * arg2 / 128;
						super.anIntArray56[local31] = super.anIntArray56[local31] * arg3 / 128;
						super.anIntArray55[local31] = super.anIntArray55[local31] * arg4 / 128;
						super.anIntArray54[local31] += Static6.anInt221;
						super.anIntArray56[local31] += Static6.anInt222;
						super.anIntArray55[local31] += Static6.anInt220;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray4 != null && this.aByteArray3 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray4.length) {
					local115 = super.anIntArrayArray4[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray3[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray3[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "(I)V")
	private void method211(@OriginalArg(0) int arg0) {
		if (Static6.aBooleanArray2[arg0]) {
			this.method209(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray59[arg0];
		@Pc(17) int local17 = this.anIntArray60[arg0];
		@Pc(22) int local22 = this.anIntArray62[arg0];
		Static13.aBoolean29 = Static6.aBooleanArray1[arg0];
		if (this.aByteArray3 == null) {
			Static13.anInt472 = 0;
		} else {
			Static13.anInt472 = this.aByteArray3[arg0] & 0xFF;
		}
		if (this.aShortArray2 != null && this.aShortArray2[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray1 == null || this.aByteArray1[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray1[arg0] & 0xFF;
				local133 = this.anIntArray57[local128];
				local138 = this.anIntArray61[local128];
				local143 = this.anIntArray65[local128];
			}
			if (this.anIntArray58[arg0] == -1) {
				Static13.method519(Static6.anIntArray68[local12], Static6.anIntArray68[local17], Static6.anIntArray68[local22], Static6.anIntArray69[local12], Static6.anIntArray69[local17], Static6.anIntArray69[local22], this.anIntArray63[arg0], this.anIntArray63[arg0], this.anIntArray63[arg0], Static6.anIntArray78[local133], Static6.anIntArray78[local138], Static6.anIntArray78[local143], Static6.anIntArray75[local133], Static6.anIntArray75[local138], Static6.anIntArray75[local143], Static6.anIntArray80[local133], Static6.anIntArray80[local138], Static6.anIntArray80[local143], this.aShortArray2[arg0]);
			} else {
				Static13.method519(Static6.anIntArray68[local12], Static6.anIntArray68[local17], Static6.anIntArray68[local22], Static6.anIntArray69[local12], Static6.anIntArray69[local17], Static6.anIntArray69[local22], this.anIntArray63[arg0], this.anIntArray64[arg0], this.anIntArray58[arg0], Static6.anIntArray78[local133], Static6.anIntArray78[local138], Static6.anIntArray78[local143], Static6.anIntArray75[local133], Static6.anIntArray75[local138], Static6.anIntArray75[local143], Static6.anIntArray80[local133], Static6.anIntArray80[local138], Static6.anIntArray80[local143], this.aShortArray2[arg0]);
			}
		} else if (this.anIntArray58[arg0] == -1) {
			Static13.method518(Static6.anIntArray68[local12], Static6.anIntArray68[local17], Static6.anIntArray68[local22], Static6.anIntArray69[local12], Static6.anIntArray69[local17], Static6.anIntArray69[local22], Static6.anIntArray76[this.anIntArray63[arg0]]);
		} else {
			Static13.method521(Static6.anIntArray68[local12], Static6.anIntArray68[local17], Static6.anIntArray68[local22], Static6.anIntArray69[local12], Static6.anIntArray69[local17], Static6.anIntArray69[local22], this.anIntArray63[arg0], this.anIntArray64[arg0], this.anIntArray58[arg0]);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method191();
			@Pc(3) int local3 = Static13.anInt475;
			@Pc(5) int local5 = Static13.anInt468;
			@Pc(9) int local9 = Static6.anIntArray72[0];
			@Pc(13) int local13 = Static6.anIntArray82[0];
			@Pc(17) int local17 = Static6.anIntArray72[arg0];
			@Pc(21) int local21 = Static6.anIntArray82[arg0];
			@Pc(25) int local25 = Static6.anIntArray72[arg1];
			@Pc(29) int local29 = Static6.anIntArray82[arg1];
			@Pc(33) int local33 = Static6.anIntArray72[arg2];
			@Pc(37) int local37 = Static6.anIntArray82[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt215; local49++) {
				@Pc(55) int local55 = super.anIntArray54[local49];
				@Pc(60) int local60 = super.anIntArray56[local49];
				@Pc(65) int local65 = super.anIntArray55[local49];
				@Pc(77) int local77;
				if (arg1 != 0) {
					local77 = local60 * local25 + local55 * local29 >> 16;
					local60 = local60 * local29 - local55 * local25 >> 16;
					local55 = local77;
				}
				if (arg0 != 0) {
					local77 = local65 * local17 + local55 * local21 >> 16;
					local65 = local65 * local21 - local55 * local17 >> 16;
					local55 = local77;
				}
				local55 += arg3;
				local60 += arg4;
				local65 += arg5;
				local77 = local60 * local37 - local65 * local33 >> 16;
				local65 = local60 * local33 + local65 * local37 >> 16;
				Static6.anIntArray70[local49] = local65 - local47;
				Static6.anIntArray69[local49] = local3 + (local55 << 9) / local65;
				Static6.anIntArray68[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt219 > 0) {
					Static6.anIntArray78[local49] = local55;
					Static6.anIntArray75[local49] = local77;
					Static6.anIntArray80[local49] = local65;
				}
			}
			this.method206(false, false, 0L, super.aShort17, super.aShort17 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}
}
