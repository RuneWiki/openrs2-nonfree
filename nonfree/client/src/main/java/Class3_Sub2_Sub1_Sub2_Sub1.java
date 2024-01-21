import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class3_Sub2_Sub1_Sub2_Sub1 extends Class3_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ng", name = "kb", descriptor = "[I")
	private int[] anIntArray261;

	@OriginalMember(owner = "client!ng", name = "lb", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!ng", name = "mb", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ng", name = "nb", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!ng", name = "ob", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ng", name = "pb", descriptor = "[I")
	private int[] anIntArray263;

	@OriginalMember(owner = "client!ng", name = "qb", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!ng", name = "rb", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ng", name = "sb", descriptor = "[I")
	private int[] anIntArray265;

	@OriginalMember(owner = "client!ng", name = "tb", descriptor = "[I")
	private int[] anIntArray266;

	@OriginalMember(owner = "client!ng", name = "vb", descriptor = "[I")
	private int[] anIntArray267;

	@OriginalMember(owner = "client!ng", name = "xb", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!ng", name = "yb", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!ng", name = "ub", descriptor = "I")
	private int anInt2607 = 0;

	@OriginalMember(owner = "client!ng", name = "wb", descriptor = "B")
	private byte aByte4 = 0;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!oe;IIIII)V")
	public Class3_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1951();
		arg0.method1940();
		super.anInt2604 = arg0.anInt2746;
		super.anIntArray257 = arg0.anIntArray304;
		super.anIntArray256 = arg0.anIntArray308;
		super.anIntArray258 = arg0.anIntArray312;
		super.anInt2606 = arg0.anInt2747;
		this.anIntArray268 = arg0.anIntArray305;
		this.anIntArray265 = arg0.anIntArray306;
		this.anIntArray262 = arg0.anIntArray307;
		this.aByteArray23 = arg0.aByteArray34;
		this.aByteArray22 = arg0.aByteArray26;
		this.aByte4 = arg0.aByte5;
		super.anIntArrayArray24 = arg0.anIntArrayArray29;
		super.anIntArrayArray25 = arg0.anIntArrayArray28;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray269 = new int[super.anInt2606];
		this.anIntArray261 = new int[super.anInt2606];
		this.anIntArray264 = new int[super.anInt2606];
		@Pc(109) int local109;
		if (arg0.aShortArray22 == null) {
			this.aShortArray16 = null;
		} else {
			this.aShortArray16 = new short[super.anInt2606];
			for (local109 = 0; local109 < super.anInt2606; local109++) {
				@Pc(115) short local115 = arg0.aShortArray22[local109];
				if (local115 != -1 && Static132.anInterface3_1.method2821(local115)) {
					this.aShortArray16[local109] = local115;
				} else {
					this.aShortArray16[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2748 > 0 && arg0.aByteArray27 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2748];
			for (@Pc(155) int local155 = 0; local155 < super.anInt2606; local155++) {
				if (arg0.aByteArray27[local155] != -1) {
					local153[arg0.aByteArray27[local155] & 0xFF]++;
				}
			}
			this.anInt2607 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2748; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray28[local184] == 0) {
					this.anInt2607++;
				}
			}
			this.anIntArray267 = new int[this.anInt2607];
			this.anIntArray263 = new int[this.anInt2607];
			this.anIntArray266 = new int[this.anInt2607];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2748; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray28[local224] == 0) {
					this.anIntArray267[local222] = arg0.aShortArray20[local224] & 0xFFFF;
					this.anIntArray263[local222] = arg0.aShortArray18[local224] & 0xFFFF;
					this.anIntArray266[local222] = arg0.aShortArray21[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray21 = new byte[super.anInt2606];
			for (local286 = 0; local286 < super.anInt2606; local286++) {
				if (arg0.aByteArray27[local286] == -1) {
					this.aByteArray21[local286] = -1;
				} else {
					this.aByteArray21[local286] = (byte) local153[arg0.aByteArray27[local286] & 0xFF];
					if (this.aByteArray21[local286] == -1 && this.aShortArray16 != null) {
						this.aShortArray16[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt2606; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray30 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray30[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray26 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray26[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray16 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray16[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class79 local408;
			@Pc(569) Class37 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray19[local109] & 0xFFFF;
					if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray268[local109]] == null) {
						local408 = arg0.aClass79Array2[this.anIntArray268[local109]];
					} else {
						local408 = arg0.aClass79Array1[this.anIntArray268[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
					this.anIntArray269[local109] = Static109.method1810(local389, local286);
					if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray265[local109]] == null) {
						local408 = arg0.aClass79Array2[this.anIntArray265[local109]];
					} else {
						local408 = arg0.aClass79Array1[this.anIntArray265[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
					this.anIntArray261[local109] = Static109.method1810(local389, local286);
					if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray262[local109]] == null) {
						local408 = arg0.aClass79Array2[this.anIntArray262[local109]];
					} else {
						local408 = arg0.aClass79Array1[this.anIntArray262[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
					this.anIntArray264[local109] = Static109.method1810(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass37Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt1767 + arg4 * local569.anInt1771 + arg5 * local569.anInt1770) / (local84 + local84 / 2);
					this.anIntArray269[local109] = Static109.method1810(arg0.aShortArray19[local109] & 0xFFFF, local286);
					this.anIntArray264[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray269[local109] = 128;
					this.anIntArray264[local109] = -1;
				} else {
					this.anIntArray264[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray268[local109]] == null) {
					local408 = arg0.aClass79Array2[this.anIntArray268[local109]];
				} else {
					local408 = arg0.aClass79Array1[this.anIntArray268[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
				this.anIntArray269[local109] = Static109.method1807(local286);
				if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray265[local109]] == null) {
					local408 = arg0.aClass79Array2[this.anIntArray265[local109]];
				} else {
					local408 = arg0.aClass79Array1[this.anIntArray265[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
				this.anIntArray261[local109] = Static109.method1807(local286);
				if (arg0.aClass79Array1 == null || arg0.aClass79Array1[this.anIntArray262[local109]] == null) {
					local408 = arg0.aClass79Array2[this.anIntArray262[local109]];
				} else {
					local408 = arg0.aClass79Array1[this.anIntArray262[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3528 + arg4 * local408.anInt3527 + arg5 * local408.anInt3529) / (local84 * local408.anInt3526);
				this.anIntArray264[local109] = Static109.method1807(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass37Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt1767 + arg4 * local569.anInt1771 + arg5 * local569.anInt1770) / (local84 + local84 / 2);
				this.anIntArray269[local109] = Static109.method1807(local286);
				this.anIntArray264[local109] = -1;
			} else {
				this.anIntArray264[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "([Lclient!ng;I)V")
	private Class3_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) Class3_Sub2_Sub1_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt2604 = 0;
		super.anInt2606 = 0;
		this.anInt2607 = 0;
		this.aByte4 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class3_Sub2_Sub1_Sub2_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt2604 += local34.anInt2604;
				super.anInt2606 += local34.anInt2606;
				this.anInt2607 += local34.anInt2607;
				if (local34.aByteArray23 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local34.aByte4;
					}
					if (this.aByte4 != local34.aByte4) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray22 != null;
				local13 |= local34.aShortArray16 != null;
				local15 |= local34.aByteArray21 != null;
			}
		}
		super.anIntArray257 = new int[super.anInt2604];
		super.anIntArray256 = new int[super.anInt2604];
		super.anIntArray258 = new int[super.anInt2604];
		this.anIntArray268 = new int[super.anInt2606];
		this.anIntArray265 = new int[super.anInt2606];
		this.anIntArray262 = new int[super.anInt2606];
		this.anIntArray269 = new int[super.anInt2606];
		this.anIntArray261 = new int[super.anInt2606];
		this.anIntArray264 = new int[super.anInt2606];
		if (local9) {
			this.aByteArray23 = new byte[super.anInt2606];
		}
		if (local11) {
			this.aByteArray22 = new byte[super.anInt2606];
		}
		if (local13) {
			this.aShortArray16 = new short[super.anInt2606];
		}
		if (local15) {
			this.aByteArray21 = new byte[super.anInt2606];
		}
		if (this.anInt2607 > 0) {
			this.anIntArray267 = new int[this.anInt2607];
			this.anIntArray263 = new int[this.anInt2607];
			this.anIntArray266 = new int[this.anInt2607];
		}
		super.anInt2604 = 0;
		super.anInt2606 = 0;
		this.anInt2607 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class3_Sub2_Sub1_Sub2_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt2606; local220++) {
					this.anIntArray268[super.anInt2606] = local216.anIntArray268[local220] + super.anInt2604;
					this.anIntArray265[super.anInt2606] = local216.anIntArray265[local220] + super.anInt2604;
					this.anIntArray262[super.anInt2606] = local216.anIntArray262[local220] + super.anInt2604;
					this.anIntArray269[super.anInt2606] = local216.anIntArray269[local220];
					this.anIntArray261[super.anInt2606] = local216.anIntArray261[local220];
					this.anIntArray264[super.anInt2606] = local216.anIntArray264[local220];
					if (local9) {
						if (local216.aByteArray23 == null) {
							this.aByteArray23[super.anInt2606] = local216.aByte4;
						} else {
							this.aByteArray23[super.anInt2606] = local216.aByteArray23[local220];
						}
					}
					if (local11 && local216.aByteArray22 != null) {
						this.aByteArray22[super.anInt2606] = local216.aByteArray22[local220];
					}
					if (local13) {
						if (local216.aShortArray16 == null) {
							this.aShortArray16[super.anInt2606] = -1;
						} else {
							this.aShortArray16[super.anInt2606] = local216.aShortArray16[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray21 == null || local216.aByteArray21[local220] == -1) {
							this.aByteArray21[super.anInt2606] = -1;
						} else {
							this.aByteArray21[super.anInt2606] = (byte) (local216.aByteArray21[local220] + this.anInt2607);
						}
					}
					super.anInt2606++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt2607; local385++) {
					this.anIntArray267[this.anInt2607] = local216.anIntArray267[local385] + super.anInt2604;
					this.anIntArray263[this.anInt2607] = local216.anIntArray263[local385] + super.anInt2604;
					this.anIntArray266[this.anInt2607] = local216.anIntArray266[local385] + super.anInt2604;
					this.anInt2607++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt2604; local435++) {
					super.anIntArray257[super.anInt2604] = local216.anIntArray257[local435];
					super.anIntArray256[super.anInt2604] = local216.anIntArray256[local435];
					super.anIntArray258[super.anInt2604] = local216.anIntArray258[local435];
					super.anInt2604++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)V")
	private void method1802(@OriginalArg(0) int arg0) {
		if (Static109.aBooleanArray14[arg0]) {
			this.method1803(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray268[arg0];
		@Pc(17) int local17 = this.anIntArray265[arg0];
		@Pc(22) int local22 = this.anIntArray262[arg0];
		Static132.aBoolean129 = Static109.aBooleanArray15[arg0];
		if (this.aByteArray22 == null) {
			Static132.anInt3098 = 0;
		} else {
			Static132.anInt3098 = this.aByteArray22[arg0] & 0xFF;
		}
		if (this.aShortArray16 != null && this.aShortArray16[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray21 == null || this.aByteArray21[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray21[arg0] & 0xFF;
				local133 = this.anIntArray267[local128];
				local138 = this.anIntArray263[local128];
				local143 = this.anIntArray266[local128];
			}
			if (this.anIntArray264[arg0] == -1) {
				Static132.method2232(Static109.anIntArray283[local12], Static109.anIntArray283[local17], Static109.anIntArray283[local22], Static109.anIntArray277[local12], Static109.anIntArray277[local17], Static109.anIntArray277[local22], this.anIntArray269[arg0], this.anIntArray269[arg0], this.anIntArray269[arg0], Static109.anIntArray278[local133], Static109.anIntArray278[local138], Static109.anIntArray278[local143], Static109.anIntArray279[local133], Static109.anIntArray279[local138], Static109.anIntArray279[local143], Static109.anIntArray284[local133], Static109.anIntArray284[local138], Static109.anIntArray284[local143], this.aShortArray16[arg0]);
			} else {
				Static132.method2232(Static109.anIntArray283[local12], Static109.anIntArray283[local17], Static109.anIntArray283[local22], Static109.anIntArray277[local12], Static109.anIntArray277[local17], Static109.anIntArray277[local22], this.anIntArray269[arg0], this.anIntArray261[arg0], this.anIntArray264[arg0], Static109.anIntArray278[local133], Static109.anIntArray278[local138], Static109.anIntArray278[local143], Static109.anIntArray279[local133], Static109.anIntArray279[local138], Static109.anIntArray279[local143], Static109.anIntArray284[local133], Static109.anIntArray284[local138], Static109.anIntArray284[local143], this.aShortArray16[arg0]);
			}
		} else if (this.anIntArray264[arg0] == -1) {
			Static132.method2239(Static109.anIntArray283[local12], Static109.anIntArray283[local17], Static109.anIntArray283[local22], Static109.anIntArray277[local12], Static109.anIntArray277[local17], Static109.anIntArray277[local22], Static109.anIntArray270[this.anIntArray269[arg0]]);
		} else {
			Static132.method2246(Static109.anIntArray283[local12], Static109.anIntArray283[local17], Static109.anIntArray283[local22], Static109.anIntArray277[local12], Static109.anIntArray277[local17], Static109.anIntArray277[local22], this.anIntArray269[arg0], this.anIntArray261[arg0], this.anIntArray264[arg0]);
		}
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(Z)Lclient!fd;")
	@Override
	public Class3_Sub2_Sub1_Sub2 method1793(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static109.aByteArray25.length < super.anInt2606) {
			Static109.aByteArray25 = new byte[super.anInt2606 + 100];
		}
		return this.method1809(arg0, Static109.aClass3_Sub2_Sub1_Sub2_Sub1_2, Static109.aByteArray25);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([[IIIIZI)Lclient!fd;")
	@Override
	public Class3_Sub2_Sub1_Sub2 method1787(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1785();
		@Pc(6) int local6 = arg1 + super.aShort18;
		@Pc(11) int local11 = arg1 + super.aShort19;
		@Pc(16) int local16 = arg3 + super.aShort23;
		@Pc(21) int local21 = arg3 + super.aShort21;
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
		@Pc(101) Class3_Sub2_Sub1_Sub2_Sub1 local101;
		if (arg4) {
			local101 = new Class3_Sub2_Sub1_Sub2_Sub1();
			local101.anInt2604 = super.anInt2604;
			local101.anInt2606 = super.anInt2606;
			local101.anInt2607 = this.anInt2607;
			local101.anIntArray257 = super.anIntArray257;
			local101.anIntArray258 = super.anIntArray258;
			local101.anIntArray268 = this.anIntArray268;
			local101.anIntArray265 = this.anIntArray265;
			local101.anIntArray262 = this.anIntArray262;
			local101.anIntArray269 = this.anIntArray269;
			local101.anIntArray261 = this.anIntArray261;
			local101.anIntArray264 = this.anIntArray264;
			local101.aByteArray23 = this.aByteArray23;
			local101.aByteArray22 = this.aByteArray22;
			local101.aByteArray21 = this.aByteArray21;
			local101.aShortArray16 = this.aShortArray16;
			local101.aByte4 = this.aByte4;
			local101.anIntArray267 = this.anIntArray267;
			local101.anIntArray263 = this.anIntArray263;
			local101.anIntArray266 = this.anIntArray266;
			local101.anIntArrayArray24 = super.anIntArrayArray24;
			local101.anIntArrayArray25 = super.anIntArrayArray25;
			local101.aBoolean110 = super.aBoolean110;
			local101.anIntArray256 = new int[local101.anInt2604];
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
			for (local201 = 0; local201 < local101.anInt2604; local201++) {
				local209 = super.anIntArray257[local201] + arg1;
				local216 = super.anIntArray258[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray256[local201] = super.anIntArray256[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2604; local201++) {
				local209 = (super.anIntArray256[local201] << 16) / super.aShort34;
				if (local209 < arg5) {
					local216 = super.anIntArray257[local201] + arg1;
					local220 = super.anIntArray258[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray256[local201] = super.anIntArray256[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray256[local201] = super.anIntArray256[local201];
				}
			}
		}
		super.aBoolean109 = false;
		return local101;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1785();
			@Pc(3) int local3 = Static132.anInt3101;
			@Pc(5) int local5 = Static132.anInt3099;
			@Pc(9) int local9 = Static109.anIntArray281[0];
			@Pc(13) int local13 = Static109.anIntArray286[0];
			@Pc(17) int local17 = Static109.anIntArray281[arg0];
			@Pc(21) int local21 = Static109.anIntArray286[arg0];
			@Pc(25) int local25 = Static109.anIntArray281[arg1];
			@Pc(29) int local29 = Static109.anIntArray286[arg1];
			@Pc(33) int local33 = Static109.anIntArray281[arg2];
			@Pc(37) int local37 = Static109.anIntArray286[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt2604; local49++) {
				@Pc(55) int local55 = super.anIntArray257[local49];
				@Pc(60) int local60 = super.anIntArray256[local49];
				@Pc(65) int local65 = super.anIntArray258[local49];
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
				Static109.anIntArray271[local49] = local65 - local47;
				Static109.anIntArray277[local49] = local3 + (local55 << 9) / arg6;
				Static109.anIntArray283[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt2607 > 0) {
					Static109.anIntArray278[local49] = local55;
					Static109.anIntArray279[local49] = local77;
					Static109.anIntArray284[local49] = local65;
				}
			}
			this.method1804(false, false, 0, super.aShort22, super.aShort22 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!super.aBoolean109) {
			this.method1785();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort20 * arg2 + super.aShort17 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort20 * arg2 + super.aShort34 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort20 << 9;
		if (local78 / local38 <= Static132.anInt3093) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort20 << 9;
		if (local91 / local38 >= Static132.anInt3100) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort20 * arg1 + super.aShort17 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static132.anInt3096) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort20 * arg1 + super.aShort34 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static132.anInt3094) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt2607 > 0;
		@Pc(172) int local172 = Static132.anInt3101;
		@Pc(174) int local174 = Static132.anInt3099;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static109.anIntArray281[arg0];
			local178 = Static109.anIntArray286[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(202) int local202;
		@Pc(221) int local221;
		@Pc(206) int local206;
		@Pc(225) int local225;
		@Pc(238) int local238;
		if (arg8 > 0 && Static45.aBoolean111 && local57 > 0) {
			if (local71 > 0) {
				local202 = local91 / local38;
				local206 = local78 / local57;
			} else {
				local202 = local91 / local57;
				local206 = local78 / local38;
			}
			if (local107 > 0) {
				local221 = local146 / local38;
				local225 = local123 / local57;
			} else {
				local221 = local146 / local57;
				local225 = local123 / local38;
			}
			local238 = Static45.anInt2603 - Static132.anInt3101;
			@Pc(242) int local242 = Static45.anInt2602 - Static132.anInt3099;
			if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
				local202 = 999999;
				local206 = -999999;
				local221 = 999999;
				local225 = -999999;
				@Pc(305) int[] local305 = new int[] { super.aShort18, super.aShort19, super.aShort18, super.aShort19, super.aShort18, super.aShort19, super.aShort18, super.aShort19 };
				@Pc(348) int[] local348 = new int[] { super.aShort23, super.aShort23, super.aShort21, super.aShort21, super.aShort23, super.aShort23, super.aShort21, super.aShort21 };
				@Pc(391) int[] local391 = new int[] { super.aShort34, super.aShort34, super.aShort34, super.aShort34, super.aShort17, super.aShort17, super.aShort17, super.aShort17 };
				for (@Pc(393) int local393 = 0; local393 < 8; local393++) {
					@Pc(398) int local398 = local305[local393];
					@Pc(402) int local402 = local391[local393];
					@Pc(406) int local406 = local348[local393];
					@Pc(418) int local418;
					if (arg0 != 0) {
						local418 = local406 * local176 + local398 * local178 >> 16;
						local406 = local406 * local178 - local398 * local176 >> 16;
						local398 = local418;
					}
					local398 += arg5;
					local402 += arg6;
					local406 += arg7;
					local418 = local406 * arg3 + local398 * arg4 >> 16;
					local406 = local406 * arg4 - local398 * arg3 >> 16;
					local398 = local418;
					local418 = local402 * arg2 - local406 * arg1 >> 16;
					local406 = local402 * arg1 + local406 * arg2 >> 16;
					if (local406 > 0) {
						@Pc(494) int local494 = (local398 << 9) / local406;
						@Pc(500) int local500 = (local418 << 9) / local406;
						if (local494 < local202) {
							local202 = local494;
						}
						if (local494 > local206) {
							local206 = local494;
						}
						if (local500 < local221) {
							local221 = local500;
						}
						if (local500 > local225) {
							local225 = local500;
						}
					}
				}
				if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
					if (super.aBoolean110) {
						Static45.anIntArray255[Static45.anInt2605++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local202 = 0; local202 < super.anInt2604; local202++) {
			local221 = super.anIntArray257[local202];
			local206 = super.anIntArray256[local202];
			local225 = super.anIntArray258[local202];
			if (arg0 != 0) {
				local238 = local225 * local176 + local221 * local178 >> 16;
				local225 = local225 * local178 - local221 * local176 >> 16;
				local221 = local238;
			}
			local221 += arg5;
			local206 += arg6;
			local225 += arg7;
			local238 = local225 * arg3 + local221 * arg4 >> 16;
			local225 = local225 * arg4 - local221 * arg3 >> 16;
			local221 = local238;
			local238 = local206 * arg2 - local225 * arg1 >> 16;
			local225 = local206 * arg1 + local225 * arg2 >> 16;
			Static109.anIntArray271[local202] = local225 - local24;
			if (local225 >= 50) {
				Static109.anIntArray277[local202] = local172 + (local221 << 9) / local225;
				Static109.anIntArray283[local202] = local174 + (local238 << 9) / local225;
			} else {
				Static109.anIntArray277[local202] = -5000;
				local154 = true;
			}
			if (local170) {
				Static109.anIntArray278[local202] = local221;
				Static109.anIntArray279[local202] = local238;
				Static109.anIntArray284[local202] = local225;
			}
		}
		try {
			this.method1804(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(718) Exception local718) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V")
	private void method1803(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static132.anInt3101;
		@Pc(3) int local3 = Static132.anInt3099;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray268[arg0];
		@Pc(15) int local15 = this.anIntArray265[arg0];
		@Pc(20) int local20 = this.anIntArray262[arg0];
		@Pc(24) int local24 = Static109.anIntArray284[local10];
		@Pc(28) int local28 = Static109.anIntArray284[local15];
		@Pc(32) int local32 = Static109.anIntArray284[local20];
		if (this.aByteArray22 == null) {
			Static132.anInt3098 = 0;
		} else {
			Static132.anInt3098 = this.aByteArray22[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static109.anIntArray272[0] = Static109.anIntArray277[local10];
			Static109.anIntArray274[0] = Static109.anIntArray283[local10];
			local5++;
			Static109.anIntArray273[0] = this.anIntArray269[arg0];
		} else {
			local73 = Static109.anIntArray278[local10];
			local77 = Static109.anIntArray279[local10];
			local82 = this.anIntArray269[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static109.anIntArray276[local32 - local24];
				Static109.anIntArray272[0] = local1 + (local73 + ((Static109.anIntArray278[local20] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[0] = local3 + (local77 + ((Static109.anIntArray279[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static109.anIntArray273[0] = local82 + ((this.anIntArray264[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static109.anIntArray276[local28 - local24];
				Static109.anIntArray272[local5] = local1 + (local73 + ((Static109.anIntArray278[local15] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[local5] = local3 + (local77 + ((Static109.anIntArray279[local15] - local77) * local95 >> 16) << 9) / 50;
				Static109.anIntArray273[local5++] = local82 + ((this.anIntArray261[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static109.anIntArray272[local5] = Static109.anIntArray277[local15];
			Static109.anIntArray274[local5] = Static109.anIntArray283[local15];
			Static109.anIntArray273[local5++] = this.anIntArray261[arg0];
		} else {
			local73 = Static109.anIntArray278[local15];
			local77 = Static109.anIntArray279[local15];
			local82 = this.anIntArray261[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static109.anIntArray276[local24 - local28];
				Static109.anIntArray272[local5] = local1 + (local73 + ((Static109.anIntArray278[local10] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[local5] = local3 + (local77 + ((Static109.anIntArray279[local10] - local77) * local95 >> 16) << 9) / 50;
				Static109.anIntArray273[local5++] = local82 + ((this.anIntArray269[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static109.anIntArray276[local32 - local28];
				Static109.anIntArray272[local5] = local1 + (local73 + ((Static109.anIntArray278[local20] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[local5] = local3 + (local77 + ((Static109.anIntArray279[local20] - local77) * local95 >> 16) << 9) / 50;
				Static109.anIntArray273[local5++] = local82 + ((this.anIntArray264[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static109.anIntArray272[local5] = Static109.anIntArray277[local20];
			Static109.anIntArray274[local5] = Static109.anIntArray283[local20];
			Static109.anIntArray273[local5++] = this.anIntArray264[arg0];
		} else {
			local73 = Static109.anIntArray278[local20];
			local77 = Static109.anIntArray279[local20];
			local82 = this.anIntArray264[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static109.anIntArray276[local28 - local32];
				Static109.anIntArray272[local5] = local1 + (local73 + ((Static109.anIntArray278[local15] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[local5] = local3 + (local77 + ((Static109.anIntArray279[local15] - local77) * local95 >> 16) << 9) / 50;
				Static109.anIntArray273[local5++] = local82 + ((this.anIntArray261[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static109.anIntArray276[local24 - local32];
				Static109.anIntArray272[local5] = local1 + (local73 + ((Static109.anIntArray278[local10] - local73) * local95 >> 16) << 9) / 50;
				Static109.anIntArray274[local5] = local3 + (local77 + ((Static109.anIntArray279[local10] - local77) * local95 >> 16) << 9) / 50;
				Static109.anIntArray273[local5++] = local82 + ((this.anIntArray269[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static109.anIntArray272[0];
		local77 = Static109.anIntArray272[1];
		local82 = Static109.anIntArray272[2];
		local95 = Static109.anIntArray274[0];
		@Pc(590) int local590 = Static109.anIntArray274[1];
		@Pc(594) int local594 = Static109.anIntArray274[2];
		Static132.aBoolean129 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static132.anInt3097 || local77 > Static132.anInt3097 || local82 > Static132.anInt3097) {
				Static132.aBoolean129 = true;
			}
			if (this.aShortArray16 != null && this.aShortArray16[arg0] != -1) {
				if (this.aByteArray21 == null || this.aByteArray21[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray21[arg0] & 0xFF;
					local683 = this.anIntArray267[local678];
					local688 = this.anIntArray263[local678];
					local693 = this.anIntArray266[local678];
				}
				if (this.anIntArray264[arg0] == -1) {
					Static132.method2232(local95, local590, local594, local73, local77, local82, this.anIntArray269[arg0], this.anIntArray269[arg0], this.anIntArray269[arg0], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], this.aShortArray16[arg0]);
				} else {
					Static132.method2232(local95, local590, local594, local73, local77, local82, Static109.anIntArray273[0], Static109.anIntArray273[1], Static109.anIntArray273[2], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], this.aShortArray16[arg0]);
				}
			} else if (this.anIntArray264[arg0] == -1) {
				Static132.method2239(local95, local590, local594, local73, local77, local82, Static109.anIntArray270[this.anIntArray269[arg0]]);
			} else {
				Static132.method2246(local95, local590, local594, local73, local77, local82, Static109.anIntArray273[0], Static109.anIntArray273[1], Static109.anIntArray273[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static132.anInt3097 || local77 > Static132.anInt3097 || local82 > Static132.anInt3097 || Static109.anIntArray272[3] < 0 || Static109.anIntArray272[3] > Static132.anInt3097) {
			Static132.aBoolean129 = true;
		}
		if (this.aShortArray16 == null || this.aShortArray16[arg0] == -1) {
			if (this.anIntArray264[arg0] == -1) {
				local683 = Static109.anIntArray270[this.anIntArray269[arg0]];
				Static132.method2239(local95, local590, local594, local73, local77, local82, local683);
				Static132.method2239(local95, local594, Static109.anIntArray274[3], local73, local82, Static109.anIntArray272[3], local683);
				return;
			}
			Static132.method2246(local95, local590, local594, local73, local77, local82, Static109.anIntArray273[0], Static109.anIntArray273[1], Static109.anIntArray273[2]);
			Static132.method2246(local95, local594, Static109.anIntArray274[3], local73, local82, Static109.anIntArray272[3], Static109.anIntArray273[0], Static109.anIntArray273[2], Static109.anIntArray273[3]);
			return;
		}
		if (this.aByteArray21 == null || this.aByteArray21[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray21[arg0] & 0xFF;
			local683 = this.anIntArray267[local678];
			local688 = this.anIntArray263[local678];
			local693 = this.anIntArray266[local678];
		}
		@Pc(956) short local956 = this.aShortArray16[arg0];
		if (this.anIntArray264[arg0] == -1) {
			Static132.method2232(local95, local590, local594, local73, local77, local82, this.anIntArray269[arg0], this.anIntArray269[arg0], this.anIntArray269[arg0], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], local956);
			Static132.method2232(local95, local594, Static109.anIntArray274[3], local73, local82, Static109.anIntArray272[3], this.anIntArray269[arg0], this.anIntArray269[arg0], this.anIntArray269[arg0], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], local956);
			return;
		}
		Static132.method2232(local95, local590, local594, local73, local77, local82, Static109.anIntArray273[0], Static109.anIntArray273[1], Static109.anIntArray273[2], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], local956);
		Static132.method2232(local95, local594, Static109.anIntArray274[3], local73, local82, Static109.anIntArray272[3], Static109.anIntArray273[0], Static109.anIntArray273[2], Static109.anIntArray273[3], Static109.anIntArray278[local683], Static109.anIntArray278[local688], Static109.anIntArray278[local693], Static109.anIntArray279[local683], Static109.anIntArray279[local688], Static109.anIntArray279[local693], Static109.anIntArray284[local683], Static109.anIntArray284[local688], Static109.anIntArray284[local693], local956);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZZIII)V")
	private void method1804(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static109.anIntArray287[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt2606; local16++) {
			if (this.anIntArray264[local16] != -2) {
				local28 = this.anIntArray268[local16];
				local33 = this.anIntArray265[local16];
				local38 = this.anIntArray262[local16];
				local42 = Static109.anIntArray277[local28];
				local46 = Static109.anIntArray277[local33];
				local50 = Static109.anIntArray277[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static109.anIntArray278[local28];
					local69 = Static109.anIntArray278[local33];
					@Pc(73) int local73 = Static109.anIntArray278[local38];
					@Pc(77) int local77 = Static109.anIntArray279[local28];
					local81 = Static109.anIntArray279[local33];
					local85 = Static109.anIntArray279[local38];
					@Pc(89) int local89 = Static109.anIntArray284[local28];
					local93 = Static109.anIntArray284[local33];
					@Pc(97) int local97 = Static109.anIntArray284[local38];
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
						Static109.aBooleanArray14[local16] = true;
						@Pc(177) int local177 = (Static109.anIntArray271[local28] + Static109.anIntArray271[local33] + Static109.anIntArray271[local38]) / 3 + arg3;
						Static109.anIntArrayArray27[local177][Static109.anIntArray287[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1808(Static45.anInt2603, Static45.anInt2602, Static109.anIntArray283[local28], Static109.anIntArray283[local33], Static109.anIntArray283[local38], local42, local46, local50)) {
						Static45.anIntArray255[Static45.anInt2605++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static109.anIntArray283[local38] - Static109.anIntArray283[local33]) - (Static109.anIntArray283[local28] - Static109.anIntArray283[local33]) * (local50 - local46) > 0) {
						Static109.aBooleanArray14[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static132.anInt3097 && local46 <= Static132.anInt3097 && local50 <= Static132.anInt3097) {
							Static109.aBooleanArray15[local16] = false;
						} else {
							Static109.aBooleanArray15[local16] = true;
						}
						local65 = (Static109.anIntArray271[local28] + Static109.anIntArray271[local33] + Static109.anIntArray271[local38]) / 3 + arg3;
						Static109.anIntArrayArray27[local65][Static109.anIntArray287[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray23 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static109.anIntArray287[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static109.anIntArrayArray27[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1802(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static109.anIntArray285[local28] = 0;
			Static109.anIntArray275[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static109.anIntArray287[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static109.anIntArrayArray27[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray23[local50];
					local69 = Static109.anIntArray285[local382]++;
					Static109.anIntArrayArray26[local382][local69] = local50;
					if (local382 < 10) {
						Static109.anIntArray275[local382] += local33;
					} else if (local382 == 10) {
						Static109.anIntArray280[local69] = local33;
					} else {
						Static109.anIntArray282[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static109.anIntArray285[1] > 0 || Static109.anIntArray285[2] > 0) {
			local38 = (Static109.anIntArray275[1] + Static109.anIntArray275[2]) / (Static109.anIntArray285[1] + Static109.anIntArray285[2]);
		}
		local42 = 0;
		if (Static109.anIntArray285[3] > 0 || Static109.anIntArray285[4] > 0) {
			local42 = (Static109.anIntArray275[3] + Static109.anIntArray275[4]) / (Static109.anIntArray285[3] + Static109.anIntArray285[4]);
		}
		local46 = 0;
		if (Static109.anIntArray285[6] > 0 || Static109.anIntArray285[8] > 0) {
			local46 = (Static109.anIntArray275[6] + Static109.anIntArray275[8]) / (Static109.anIntArray285[6] + Static109.anIntArray285[8]);
		}
		local65 = 0;
		local69 = Static109.anIntArray285[10];
		@Pc(515) int[] local515 = Static109.anIntArrayArray26[10];
		@Pc(517) int[] local517 = Static109.anIntArray280;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static109.anIntArray285[11];
			local515 = Static109.anIntArrayArray26[11];
			local517 = Static109.anIntArray282;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1802(local515[local65++]);
				if (local65 == local69 && local515 != Static109.anIntArrayArray26[11]) {
					local65 = 0;
					local69 = Static109.anIntArray285[11];
					local515 = Static109.anIntArrayArray26[11];
					local517 = Static109.anIntArray282;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1802(local515[local65++]);
				if (local65 == local69 && local515 != Static109.anIntArrayArray26[11]) {
					local65 = 0;
					local69 = Static109.anIntArray285[11];
					local515 = Static109.anIntArrayArray26[11];
					local517 = Static109.anIntArray282;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1802(local515[local65++]);
				if (local65 == local69 && local515 != Static109.anIntArrayArray26[11]) {
					local65 = 0;
					local69 = Static109.anIntArray285[11];
					local515 = Static109.anIntArrayArray26[11];
					local517 = Static109.anIntArray282;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static109.anIntArray285[local81];
			@Pc(680) int[] local680 = Static109.anIntArrayArray26[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1802(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1802(local515[local65++]);
			if (local65 == local69 && local515 != Static109.anIntArrayArray26[11]) {
				local65 = 0;
				local515 = Static109.anIntArrayArray26[11];
				local69 = Static109.anIntArray285[11];
				local517 = Static109.anIntArray282;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!fd;)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method1805(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		return new Class3_Sub2_Sub1_Sub2_Sub1(new Class3_Sub2_Sub1_Sub2_Sub1[] { this, (Class3_Sub2_Sub1_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!eg;I)V")
	@Override
	public void method1795(@OriginalArg(0) Class3_Sub2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray24 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class72 local12 = arg0.aClass72Array1[arg1];
		@Pc(15) Class3_Sub13 local15 = local12.aClass3_Sub13_1;
		Static109.anInt2608 = 0;
		Static109.anInt2609 = 0;
		Static109.anInt2610 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3283; local23++) {
			@Pc(29) int local29 = local12.anIntArray384[local23];
			this.method1811(local15.anIntArray213[local29], local15.anIntArrayArray20[local29], local12.anIntArray379[local23], local12.anIntArray383[local23], local12.anIntArray382[local23]);
		}
		super.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLclient!ng;[B)Lclient!ng;")
	private Class3_Sub2_Sub1_Sub2_Sub1 method1809(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2604 = super.anInt2604;
		arg1.anInt2606 = super.anInt2606;
		arg1.anInt2607 = this.anInt2607;
		if (arg1.anIntArray257 == null || arg1.anIntArray257.length < super.anInt2604) {
			arg1.anIntArray257 = new int[super.anInt2604 + 100];
			arg1.anIntArray256 = new int[super.anInt2604 + 100];
			arg1.anIntArray258 = new int[super.anInt2604 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt2604; local43++) {
			arg1.anIntArray257[local43] = super.anIntArray257[local43];
			arg1.anIntArray256[local43] = super.anIntArray256[local43];
			arg1.anIntArray258[local43] = super.anIntArray258[local43];
		}
		if (arg0) {
			arg1.aByteArray22 = this.aByteArray22;
		} else {
			arg1.aByteArray22 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray22 == null) {
				for (local88 = 0; local88 < super.anInt2606; local88++) {
					arg1.aByteArray22[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt2606; local88++) {
					arg1.aByteArray22[local88] = this.aByteArray22[local88];
				}
			}
		}
		arg1.anIntArray268 = this.anIntArray268;
		arg1.anIntArray265 = this.anIntArray265;
		arg1.anIntArray262 = this.anIntArray262;
		arg1.anIntArray269 = this.anIntArray269;
		arg1.anIntArray261 = this.anIntArray261;
		arg1.anIntArray264 = this.anIntArray264;
		arg1.aByteArray23 = this.aByteArray23;
		arg1.aByteArray21 = this.aByteArray21;
		arg1.aShortArray16 = this.aShortArray16;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray267 = this.anIntArray267;
		arg1.anIntArray263 = this.anIntArray263;
		arg1.anIntArray266 = this.anIntArray266;
		arg1.anIntArrayArray24 = super.anIntArrayArray24;
		arg1.anIntArrayArray25 = super.anIntArrayArray25;
		arg1.aBoolean110 = super.aBoolean110;
		arg1.aBoolean109 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!eg;ILclient!eg;I[I)V")
	@Override
	public void method1798(@OriginalArg(0) Class3_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1795(arg0, arg1);
			return;
		}
		@Pc(18) Class72 local18 = arg0.aClass72Array1[arg1];
		@Pc(23) Class72 local23 = arg2.aClass72Array1[arg3];
		@Pc(26) Class3_Sub13 local26 = local18.aClass3_Sub13_1;
		Static109.anInt2608 = 0;
		Static109.anInt2609 = 0;
		Static109.anInt2610 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3283; local41++) {
			local47 = local18.anIntArray384[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray213[local47] == 0) {
				this.method1811(local26.anIntArray213[local47], local26.anIntArrayArray20[local47], local18.anIntArray379[local41], local18.anIntArray383[local41], local18.anIntArray382[local41]);
			}
		}
		Static109.anInt2608 = 0;
		Static109.anInt2609 = 0;
		Static109.anInt2610 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt3283; local47++) {
			@Pc(112) int local112 = local23.anIntArray384[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray213[local112] == 0) {
				this.method1811(local26.anIntArray213[local112], local26.anIntArrayArray20[local112], local23.anIntArray379[local47], local23.anIntArray383[local47], local23.anIntArray382[local47]);
			}
		}
		super.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1785();
			@Pc(3) int local3 = Static132.anInt3101;
			@Pc(5) int local5 = Static132.anInt3099;
			@Pc(9) int local9 = Static109.anIntArray281[0];
			@Pc(13) int local13 = Static109.anIntArray286[0];
			@Pc(17) int local17 = Static109.anIntArray281[arg0];
			@Pc(21) int local21 = Static109.anIntArray286[arg0];
			@Pc(25) int local25 = Static109.anIntArray281[arg1];
			@Pc(29) int local29 = Static109.anIntArray286[arg1];
			@Pc(33) int local33 = Static109.anIntArray281[arg2];
			@Pc(37) int local37 = Static109.anIntArray286[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt2604; local49++) {
				@Pc(55) int local55 = super.anIntArray257[local49];
				@Pc(60) int local60 = super.anIntArray256[local49];
				@Pc(65) int local65 = super.anIntArray258[local49];
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
				Static109.anIntArray271[local49] = local65 - local47;
				Static109.anIntArray277[local49] = local3 + (local55 << 9) / local65;
				Static109.anIntArray283[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt2607 > 0) {
					Static109.anIntArray278[local49] = local55;
					Static109.anIntArray279[local49] = local77;
					Static109.anIntArray284[local49] = local65;
				}
			}
			this.method1804(false, false, 0, super.aShort22, super.aShort22 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(Z)Lclient!fd;")
	@Override
	public Class3_Sub2_Sub1_Sub2 method1789(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static109.aByteArray24.length < super.anInt2606) {
			Static109.aByteArray24 = new byte[super.anInt2606 + 100];
		}
		return this.method1809(arg0, Static109.aClass3_Sub2_Sub1_Sub2_Sub1_1, Static109.aByteArray24);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I[IIII)V")
	private void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static109.anInt2608 = 0;
			Static109.anInt2609 = 0;
			Static109.anInt2610 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray24.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray24[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static109.anInt2608 += super.anIntArray257[local36];
						Static109.anInt2609 += super.anIntArray256[local36];
						Static109.anInt2610 += super.anIntArray258[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static109.anInt2608 = Static109.anInt2608 / local6 + arg2;
				Static109.anInt2609 = Static109.anInt2609 / local6 + arg3;
				Static109.anInt2610 = Static109.anInt2610 / local6 + arg4;
			} else {
				Static109.anInt2608 = arg2;
				Static109.anInt2609 = arg3;
				Static109.anInt2610 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray24.length) {
					local115 = super.anIntArrayArray24[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray257[local31] += arg2;
						super.anIntArray256[local31] += arg3;
						super.anIntArray258[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray24.length) {
					local115 = super.anIntArrayArray24[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray257[local31] -= Static109.anInt2608;
						super.anIntArray256[local31] -= Static109.anInt2609;
						super.anIntArray258[local31] -= Static109.anInt2610;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static109.anIntArray281[local225];
							local235 = Static109.anIntArray286[local225];
							local253 = super.anIntArray256[local31] * local231 + super.anIntArray257[local31] * local235 + 32767 >> 16;
							super.anIntArray256[local31] = super.anIntArray256[local31] * local235 + 32767 - super.anIntArray257[local31] * local231 >> 16;
							super.anIntArray257[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static109.anIntArray281[local36];
							local235 = Static109.anIntArray286[local36];
							local253 = super.anIntArray256[local31] * local235 + 32767 - super.anIntArray258[local31] * local231 >> 16;
							super.anIntArray258[local31] = super.anIntArray256[local31] * local231 + super.anIntArray258[local31] * local235 + 32767 >> 16;
							super.anIntArray256[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static109.anIntArray281[local219];
							local235 = Static109.anIntArray286[local219];
							local253 = super.anIntArray258[local31] * local231 + super.anIntArray257[local31] * local235 + 32767 >> 16;
							super.anIntArray258[local31] = super.anIntArray258[local31] * local235 + 32767 - super.anIntArray257[local31] * local231 >> 16;
							super.anIntArray257[local31] = local253;
						}
						super.anIntArray257[local31] += Static109.anInt2608;
						super.anIntArray256[local31] += Static109.anInt2609;
						super.anIntArray258[local31] += Static109.anInt2610;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray24.length) {
					local115 = super.anIntArrayArray24[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray257[local31] -= Static109.anInt2608;
						super.anIntArray256[local31] -= Static109.anInt2609;
						super.anIntArray258[local31] -= Static109.anInt2610;
						super.anIntArray257[local31] = super.anIntArray257[local31] * arg2 / 128;
						super.anIntArray256[local31] = super.anIntArray256[local31] * arg3 / 128;
						super.anIntArray258[local31] = super.anIntArray258[local31] * arg4 / 128;
						super.anIntArray257[local31] += Static109.anInt2608;
						super.anIntArray256[local31] += Static109.anInt2609;
						super.anIntArray258[local31] += Static109.anInt2610;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray25 != null && this.aByteArray22 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray25.length) {
					local115 = super.anIntArrayArray25[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray22[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray22[local31] = (byte) local36;
					}
				}
			}
		}
	}
}
