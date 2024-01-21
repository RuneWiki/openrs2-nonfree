import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class2_Sub1_Sub3_Sub3_Sub1 extends Class2_Sub1_Sub3_Sub3 {

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!eh", name = "fb", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "[I")
	private int[] anIntArray88;

	@OriginalMember(owner = "client!eh", name = "ib", descriptor = "[B")
	private byte[] aByteArray13;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!eh", name = "nb", descriptor = "[I")
	private int[] anIntArray91;

	@OriginalMember(owner = "client!eh", name = "pb", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!eh", name = "qb", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!eh", name = "sb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!eh", name = "lb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!eh", name = "rb", descriptor = "I")
	private int anInt1010 = 0;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3_Sub3_Sub1() {
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!v;IIIII)V")
	public Class2_Sub1_Sub3_Sub3_Sub1(@OriginalArg(0) Class2_Sub1_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2549();
		arg0.method2552();
		super.anInt1008 = arg0.anInt3618;
		super.anIntArray83 = arg0.anIntArray391;
		super.anIntArray80 = arg0.anIntArray384;
		super.anIntArray84 = arg0.anIntArray388;
		super.anInt1004 = arg0.anInt3616;
		this.anIntArray90 = arg0.anIntArray392;
		this.anIntArray92 = arg0.anIntArray389;
		this.anIntArray88 = arg0.anIntArray383;
		this.aByteArray13 = arg0.aByteArray45;
		this.aByteArray12 = arg0.aByteArray41;
		this.aByte2 = arg0.aByte8;
		super.anIntArrayArray11 = arg0.anIntArrayArray37;
		super.anIntArrayArray10 = arg0.anIntArrayArray38;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray86 = new int[super.anInt1004];
		this.anIntArray85 = new int[super.anInt1004];
		this.anIntArray87 = new int[super.anInt1004];
		@Pc(109) int local109;
		if (arg0.aShortArray32 == null) {
			this.aShortArray11 = null;
		} else {
			this.aShortArray11 = new short[super.anInt1004];
			for (local109 = 0; local109 < super.anInt1004; local109++) {
				@Pc(115) short local115 = arg0.aShortArray32[local109];
				if (local115 != -1 && Static125.anInterface2_1.method255(local115)) {
					this.aShortArray11[local109] = local115;
				} else {
					this.aShortArray11[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt3623 > 0 && arg0.aByteArray43 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt3623];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1004; local155++) {
				if (arg0.aByteArray43[local155] != -1) {
					local153[arg0.aByteArray43[local155] & 0xFF]++;
				}
			}
			this.anInt1010 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt3623; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray39[local184] == 0) {
					this.anInt1010++;
				}
			}
			this.anIntArray91 = new int[this.anInt1010];
			this.anIntArray93 = new int[this.anInt1010];
			this.anIntArray89 = new int[this.anInt1010];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt3623; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray39[local224] == 0) {
					this.anIntArray91[local222] = arg0.aShortArray35[local224] & 0xFFFF;
					this.anIntArray93[local222] = arg0.aShortArray37[local224] & 0xFFFF;
					this.anIntArray89[local222] = arg0.aShortArray34[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray14 = new byte[super.anInt1004];
			for (local286 = 0; local286 < super.anInt1004; local286++) {
				if (arg0.aByteArray43[local286] == -1) {
					this.aByteArray14[local286] = -1;
				} else {
					this.aByteArray14[local286] = (byte) local153[arg0.aByteArray43[local286] & 0xFF];
					if (this.aByteArray14[local286] == -1 && this.aShortArray11 != null) {
						this.aShortArray11[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1004; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray48 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray48[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray41 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray41[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray11 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray11[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class44 local408;
			@Pc(569) Class58 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray36[local109] & 0xFFFF;
					if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray90[local109]] == null) {
						local408 = arg0.aClass44Array1[this.anIntArray90[local109]];
					} else {
						local408 = arg0.aClass44Array2[this.anIntArray90[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
					this.anIntArray86[local109] = Static42.method835(local389, local286);
					if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray92[local109]] == null) {
						local408 = arg0.aClass44Array1[this.anIntArray92[local109]];
					} else {
						local408 = arg0.aClass44Array2[this.anIntArray92[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
					this.anIntArray85[local109] = Static42.method835(local389, local286);
					if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray88[local109]] == null) {
						local408 = arg0.aClass44Array1[this.anIntArray88[local109]];
					} else {
						local408 = arg0.aClass44Array2[this.anIntArray88[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
					this.anIntArray87[local109] = Static42.method835(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass58Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt2517 + arg4 * local569.anInt2516 + arg5 * local569.anInt2513) / (local84 + local84 / 2);
					this.anIntArray86[local109] = Static42.method835(arg0.aShortArray36[local109] & 0xFFFF, local286);
					this.anIntArray87[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray86[local109] = 128;
					this.anIntArray87[local109] = -1;
				} else {
					this.anIntArray87[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray90[local109]] == null) {
					local408 = arg0.aClass44Array1[this.anIntArray90[local109]];
				} else {
					local408 = arg0.aClass44Array2[this.anIntArray90[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
				this.anIntArray86[local109] = Static42.method829(local286);
				if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray92[local109]] == null) {
					local408 = arg0.aClass44Array1[this.anIntArray92[local109]];
				} else {
					local408 = arg0.aClass44Array2[this.anIntArray92[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
				this.anIntArray85[local109] = Static42.method829(local286);
				if (arg0.aClass44Array2 == null || arg0.aClass44Array2[this.anIntArray88[local109]] == null) {
					local408 = arg0.aClass44Array1[this.anIntArray88[local109]];
				} else {
					local408 = arg0.aClass44Array2[this.anIntArray88[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt1871 + arg4 * local408.anInt1872 + arg5 * local408.anInt1875) / (local84 * local408.anInt1869);
				this.anIntArray87[local109] = Static42.method829(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass58Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt2517 + arg4 * local569.anInt2516 + arg5 * local569.anInt2513) / (local84 + local84 / 2);
				this.anIntArray86[local109] = Static42.method829(local286);
				this.anIntArray87[local109] = -1;
			} else {
				this.anIntArray87[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([Lclient!eh;I)V")
	private Class2_Sub1_Sub3_Sub3_Sub1(@OriginalArg(0) Class2_Sub1_Sub3_Sub3_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1008 = 0;
		super.anInt1004 = 0;
		this.anInt1010 = 0;
		this.aByte2 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class2_Sub1_Sub3_Sub3_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1008 += local34.anInt1008;
				super.anInt1004 += local34.anInt1004;
				this.anInt1010 += local34.anInt1010;
				if (local34.aByteArray13 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local34.aByte2;
					}
					if (this.aByte2 != local34.aByte2) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray12 != null;
				local13 |= local34.aShortArray11 != null;
				local15 |= local34.aByteArray14 != null;
			}
		}
		super.anIntArray83 = new int[super.anInt1008];
		super.anIntArray80 = new int[super.anInt1008];
		super.anIntArray84 = new int[super.anInt1008];
		this.anIntArray90 = new int[super.anInt1004];
		this.anIntArray92 = new int[super.anInt1004];
		this.anIntArray88 = new int[super.anInt1004];
		this.anIntArray86 = new int[super.anInt1004];
		this.anIntArray85 = new int[super.anInt1004];
		this.anIntArray87 = new int[super.anInt1004];
		if (local9) {
			this.aByteArray13 = new byte[super.anInt1004];
		}
		if (local11) {
			this.aByteArray12 = new byte[super.anInt1004];
		}
		if (local13) {
			this.aShortArray11 = new short[super.anInt1004];
		}
		if (local15) {
			this.aByteArray14 = new byte[super.anInt1004];
		}
		if (this.anInt1010 > 0) {
			this.anIntArray91 = new int[this.anInt1010];
			this.anIntArray93 = new int[this.anInt1010];
			this.anIntArray89 = new int[this.anInt1010];
		}
		super.anInt1008 = 0;
		super.anInt1004 = 0;
		this.anInt1010 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class2_Sub1_Sub3_Sub3_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1004; local220++) {
					this.anIntArray90[super.anInt1004] = local216.anIntArray90[local220] + super.anInt1008;
					this.anIntArray92[super.anInt1004] = local216.anIntArray92[local220] + super.anInt1008;
					this.anIntArray88[super.anInt1004] = local216.anIntArray88[local220] + super.anInt1008;
					this.anIntArray86[super.anInt1004] = local216.anIntArray86[local220];
					this.anIntArray85[super.anInt1004] = local216.anIntArray85[local220];
					this.anIntArray87[super.anInt1004] = local216.anIntArray87[local220];
					if (local9) {
						if (local216.aByteArray13 == null) {
							this.aByteArray13[super.anInt1004] = local216.aByte2;
						} else {
							this.aByteArray13[super.anInt1004] = local216.aByteArray13[local220];
						}
					}
					if (local11 && local216.aByteArray12 != null) {
						this.aByteArray12[super.anInt1004] = local216.aByteArray12[local220];
					}
					if (local13) {
						if (local216.aShortArray11 == null) {
							this.aShortArray11[super.anInt1004] = -1;
						} else {
							this.aShortArray11[super.anInt1004] = local216.aShortArray11[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray14 == null || local216.aByteArray14[local220] == -1) {
							this.aByteArray14[super.anInt1004] = -1;
						} else {
							this.aByteArray14[super.anInt1004] = (byte) (local216.aByteArray14[local220] + this.anInt1010);
						}
					}
					super.anInt1004++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1010; local385++) {
					this.anIntArray91[this.anInt1010] = local216.anIntArray91[local385] + super.anInt1008;
					this.anIntArray93[this.anInt1010] = local216.anIntArray93[local385] + super.anInt1008;
					this.anIntArray89[this.anInt1010] = local216.anIntArray89[local385] + super.anInt1008;
					this.anInt1010++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1008; local435++) {
					super.anIntArray83[super.anInt1008] = local216.anIntArray83[local435];
					super.anIntArray80[super.anInt1008] = local216.anIntArray80[local435];
					super.anIntArray84[super.anInt1008] = local216.anIntArray84[local435];
					super.anInt1008++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!eh;[B)Lclient!eh;")
	private Class2_Sub1_Sub3_Sub3_Sub1 method827(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub1_Sub3_Sub3_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1008 = super.anInt1008;
		arg1.anInt1004 = super.anInt1004;
		arg1.anInt1010 = this.anInt1010;
		if (arg1.anIntArray83 == null || arg1.anIntArray83.length < super.anInt1008) {
			arg1.anIntArray83 = new int[super.anInt1008 + 100];
			arg1.anIntArray80 = new int[super.anInt1008 + 100];
			arg1.anIntArray84 = new int[super.anInt1008 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1008; local43++) {
			arg1.anIntArray83[local43] = super.anIntArray83[local43];
			arg1.anIntArray80[local43] = super.anIntArray80[local43];
			arg1.anIntArray84[local43] = super.anIntArray84[local43];
		}
		if (arg0) {
			arg1.aByteArray12 = this.aByteArray12;
		} else {
			arg1.aByteArray12 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray12 == null) {
				for (local88 = 0; local88 < super.anInt1004; local88++) {
					arg1.aByteArray12[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1004; local88++) {
					arg1.aByteArray12[local88] = this.aByteArray12[local88];
				}
			}
		}
		arg1.anIntArray90 = this.anIntArray90;
		arg1.anIntArray92 = this.anIntArray92;
		arg1.anIntArray88 = this.anIntArray88;
		arg1.anIntArray86 = this.anIntArray86;
		arg1.anIntArray85 = this.anIntArray85;
		arg1.anIntArray87 = this.anIntArray87;
		arg1.aByteArray13 = this.aByteArray13;
		arg1.aByteArray14 = this.aByteArray14;
		arg1.aShortArray11 = this.aShortArray11;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray91 = this.anIntArray91;
		arg1.anIntArray93 = this.anIntArray93;
		arg1.anIntArray89 = this.anIntArray89;
		arg1.anIntArrayArray11 = super.anIntArrayArray11;
		arg1.anIntArrayArray10 = super.anIntArrayArray10;
		arg1.aBoolean34 = super.aBoolean34;
		arg1.anInt1007 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)V")
	private void method828(@OriginalArg(0) int arg0) {
		if (Static42.aBooleanArray3[arg0]) {
			this.method834(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray90[arg0];
		@Pc(17) int local17 = this.anIntArray92[arg0];
		@Pc(22) int local22 = this.anIntArray88[arg0];
		Static125.aBoolean126 = Static42.aBooleanArray4[arg0];
		if (this.aByteArray12 == null) {
			Static125.anInt2840 = 0;
		} else {
			Static125.anInt2840 = this.aByteArray12[arg0] & 0xFF;
		}
		if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray14[arg0] & 0xFF;
				local133 = this.anIntArray91[local128];
				local138 = this.anIntArray93[local128];
				local143 = this.anIntArray89[local128];
			}
			if (this.anIntArray87[arg0] == -1) {
				Static125.method2041(Static42.anIntArray110[local12], Static42.anIntArray110[local17], Static42.anIntArray110[local22], Static42.anIntArray107[local12], Static42.anIntArray107[local17], Static42.anIntArray107[local22], this.anIntArray86[arg0], this.anIntArray86[arg0], this.anIntArray86[arg0], Static42.anIntArray100[local133], Static42.anIntArray100[local138], Static42.anIntArray100[local143], Static42.anIntArray96[local133], Static42.anIntArray96[local138], Static42.anIntArray96[local143], Static42.anIntArray106[local133], Static42.anIntArray106[local138], Static42.anIntArray106[local143], this.aShortArray11[arg0]);
			} else {
				Static125.method2041(Static42.anIntArray110[local12], Static42.anIntArray110[local17], Static42.anIntArray110[local22], Static42.anIntArray107[local12], Static42.anIntArray107[local17], Static42.anIntArray107[local22], this.anIntArray86[arg0], this.anIntArray85[arg0], this.anIntArray87[arg0], Static42.anIntArray100[local133], Static42.anIntArray100[local138], Static42.anIntArray100[local143], Static42.anIntArray96[local133], Static42.anIntArray96[local138], Static42.anIntArray96[local143], Static42.anIntArray106[local133], Static42.anIntArray106[local138], Static42.anIntArray106[local143], this.aShortArray11[arg0]);
			}
		} else if (this.anIntArray87[arg0] == -1) {
			Static125.method2036(Static42.anIntArray110[local12], Static42.anIntArray110[local17], Static42.anIntArray110[local22], Static42.anIntArray107[local12], Static42.anIntArray107[local17], Static42.anIntArray107[local22], Static42.anIntArray97[this.anIntArray86[arg0]]);
		} else {
			Static125.method2039(Static42.anIntArray110[local12], Static42.anIntArray110[local17], Static42.anIntArray110[local22], Static42.anIntArray107[local12], Static42.anIntArray107[local17], Static42.anIntArray107[local22], this.anIntArray86[arg0], this.anIntArray85[arg0], this.anIntArray87[arg0]);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!bh;)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method824(@OriginalArg(0) Class2_Sub1_Sub3_Sub3 arg0) {
		return new Class2_Sub1_Sub3_Sub3_Sub1(new Class2_Sub1_Sub3_Sub3_Sub1[] { this, (Class2_Sub1_Sub3_Sub3_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZZI)V")
	private void method831(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (super.anInt1003 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < super.anInt1003; local6++) {
			Static42.anIntArray102[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < super.anInt1004; local18++) {
			if (this.anIntArray87[local18] != -2) {
				local30 = this.anIntArray90[local18];
				local35 = this.anIntArray92[local18];
				local40 = this.anIntArray88[local18];
				local44 = Static42.anIntArray107[local30];
				local48 = Static42.anIntArray107[local35];
				local52 = Static42.anIntArray107[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static42.anIntArray100[local30];
					local71 = Static42.anIntArray100[local35];
					@Pc(75) int local75 = Static42.anIntArray100[local40];
					@Pc(79) int local79 = Static42.anIntArray96[local30];
					local83 = Static42.anIntArray96[local35];
					local87 = Static42.anIntArray96[local40];
					@Pc(91) int local91 = Static42.anIntArray106[local30];
					local95 = Static42.anIntArray106[local35];
					@Pc(99) int local99 = Static42.anIntArray106[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static42.aBooleanArray3[local18] = true;
						@Pc(180) int local180 = (Static42.anIntArray101[local30] + Static42.anIntArray101[local35] + Static42.anIntArray101[local40]) / 3 + super.anInt1009;
						Static42.anIntArrayArray12[local180][Static42.anIntArray102[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method832(Static42.anInt1011, Static42.anInt1012, Static42.anIntArray110[local30], Static42.anIntArray110[local35], Static42.anIntArray110[local40], local44, local48, local52)) {
						Static42.anIntArray98[Static42.anInt1013++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static42.anIntArray110[local40] - Static42.anIntArray110[local35]) - (Static42.anIntArray110[local30] - Static42.anIntArray110[local35]) * (local52 - local48) > 0) {
						Static42.aBooleanArray3[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static125.anInt2834 && local48 <= Static125.anInt2834 && local52 <= Static125.anInt2834) {
							Static42.aBooleanArray4[local18] = false;
						} else {
							Static42.aBooleanArray4[local18] = true;
						}
						local67 = (Static42.anIntArray101[local30] + Static42.anIntArray101[local35] + Static42.anIntArray101[local40]) / 3 + super.anInt1009;
						Static42.anIntArrayArray12[local67][Static42.anIntArray102[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray13 == null) {
			for (local30 = super.anInt1003 - 1; local30 >= 0; local30--) {
				local35 = Static42.anIntArray102[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static42.anIntArrayArray12[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method828(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static42.anIntArray112[local30] = 0;
			Static42.anIntArray95[local30] = 0;
		}
		for (local35 = super.anInt1003 - 1; local35 >= 0; local35--) {
			local40 = Static42.anIntArray102[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static42.anIntArrayArray12[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray13[local52];
					local71 = Static42.anIntArray112[local388]++;
					Static42.anIntArrayArray13[local388][local71] = local52;
					if (local388 < 10) {
						Static42.anIntArray95[local388] += local35;
					} else if (local388 == 10) {
						Static42.anIntArray109[local71] = local35;
					} else {
						Static42.anIntArray94[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static42.anIntArray112[1] > 0 || Static42.anIntArray112[2] > 0) {
			local40 = (Static42.anIntArray95[1] + Static42.anIntArray95[2]) / (Static42.anIntArray112[1] + Static42.anIntArray112[2]);
		}
		local44 = 0;
		if (Static42.anIntArray112[3] > 0 || Static42.anIntArray112[4] > 0) {
			local44 = (Static42.anIntArray95[3] + Static42.anIntArray95[4]) / (Static42.anIntArray112[3] + Static42.anIntArray112[4]);
		}
		local48 = 0;
		if (Static42.anIntArray112[6] > 0 || Static42.anIntArray112[8] > 0) {
			local48 = (Static42.anIntArray95[6] + Static42.anIntArray95[8]) / (Static42.anIntArray112[6] + Static42.anIntArray112[8]);
		}
		local67 = 0;
		local71 = Static42.anIntArray112[10];
		@Pc(521) int[] local521 = Static42.anIntArrayArray13[10];
		@Pc(523) int[] local523 = Static42.anIntArray109;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static42.anIntArray112[11];
			local521 = Static42.anIntArrayArray13[11];
			local523 = Static42.anIntArray94;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method828(local521[local67++]);
				if (local67 == local71 && local521 != Static42.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static42.anIntArray112[11];
					local521 = Static42.anIntArrayArray13[11];
					local523 = Static42.anIntArray94;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method828(local521[local67++]);
				if (local67 == local71 && local521 != Static42.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static42.anIntArray112[11];
					local521 = Static42.anIntArrayArray13[11];
					local523 = Static42.anIntArray94;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method828(local521[local67++]);
				if (local67 == local71 && local521 != Static42.anIntArrayArray13[11]) {
					local67 = 0;
					local71 = Static42.anIntArray112[11];
					local521 = Static42.anIntArrayArray13[11];
					local523 = Static42.anIntArray94;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static42.anIntArray112[local83];
			@Pc(686) int[] local686 = Static42.anIntArrayArray13[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method828(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method828(local521[local67++]);
			if (local67 == local71 && local521 != Static42.anIntArrayArray13[11]) {
				local67 = 0;
				local521 = Static42.anIntArrayArray13[11];
				local71 = Static42.anIntArray112[11];
				local523 = Static42.anIntArray94;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static42.anIntArray102[0] = -1;
		if (super.anInt1007 != 2 && super.anInt1007 != 1) {
			this.method813();
		}
		@Pc(15) int local15 = Static125.anInt2838;
		@Pc(17) int local17 = Static125.anInt2841;
		@Pc(21) int local21 = Static42.anIntArray108[0];
		@Pc(25) int local25 = Static42.anIntArray111[0];
		@Pc(29) int local29 = Static42.anIntArray108[arg0];
		@Pc(33) int local33 = Static42.anIntArray111[arg0];
		@Pc(37) int local37 = Static42.anIntArray108[arg1];
		@Pc(41) int local41 = Static42.anIntArray111[arg1];
		@Pc(45) int local45 = Static42.anIntArray108[arg2];
		@Pc(49) int local49 = Static42.anIntArray111[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < super.anInt1008; local61++) {
			@Pc(67) int local67 = super.anIntArray83[local61];
			@Pc(72) int local72 = super.anIntArray80[local61];
			@Pc(77) int local77 = super.anIntArray84[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static42.anIntArray101[local61] = local77 - local59;
			Static42.anIntArray107[local61] = local15 + (local67 << 9) / arg6;
			Static42.anIntArray110[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt1010 > 0) {
				Static42.anIntArray100[local61] = local67;
				Static42.anIntArray96[local61] = local89;
				Static42.anIntArray106[local61] = local77;
			}
		}
		try {
			this.method831(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method809(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static42.aByteArray15.length < super.anInt1004) {
			Static42.aByteArray15 = new byte[super.anInt1004 + 100];
		}
		return this.method827(arg0, Static42.aClass2_Sub1_Sub3_Sub3_Sub1_1, Static42.aByteArray15);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([[IIIIZI)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method814(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method825();
		@Pc(6) int local6 = arg1 - super.anInt1006;
		@Pc(11) int local11 = arg1 + super.anInt1006;
		@Pc(16) int local16 = arg3 - super.anInt1006;
		@Pc(21) int local21 = arg3 + super.anInt1006;
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
		@Pc(101) Class2_Sub1_Sub3_Sub3_Sub1 local101;
		if (arg4) {
			local101 = new Class2_Sub1_Sub3_Sub3_Sub1();
			local101.anInt1008 = super.anInt1008;
			local101.anInt1004 = super.anInt1004;
			local101.anInt1010 = this.anInt1010;
			local101.anIntArray83 = super.anIntArray83;
			local101.anIntArray84 = super.anIntArray84;
			local101.anIntArray90 = this.anIntArray90;
			local101.anIntArray92 = this.anIntArray92;
			local101.anIntArray88 = this.anIntArray88;
			local101.anIntArray86 = this.anIntArray86;
			local101.anIntArray85 = this.anIntArray85;
			local101.anIntArray87 = this.anIntArray87;
			local101.aByteArray13 = this.aByteArray13;
			local101.aByteArray12 = this.aByteArray12;
			local101.aByteArray14 = this.aByteArray14;
			local101.aShortArray11 = this.aShortArray11;
			local101.aByte2 = this.aByte2;
			local101.anIntArray91 = this.anIntArray91;
			local101.anIntArray93 = this.anIntArray93;
			local101.anIntArray89 = this.anIntArray89;
			local101.anIntArrayArray11 = super.anIntArrayArray11;
			local101.anIntArrayArray10 = super.anIntArrayArray10;
			local101.aBoolean34 = super.aBoolean34;
			local101.anIntArray80 = new int[local101.anInt1008];
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
			for (local201 = 0; local201 < local101.anInt1008; local201++) {
				local209 = super.anIntArray83[local201] + arg1;
				local216 = super.anIntArray84[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray80[local201] = super.anIntArray80[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1008; local201++) {
				local209 = (-super.anIntArray80[local201] << 16) / super.anInt3614;
				if (local209 < arg5) {
					local216 = super.anIntArray83[local201] + arg1;
					local220 = super.anIntArray84[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray80[local201] = super.anIntArray80[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt1007 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static42.anIntArray102[0] = -1;
		if (super.anInt1007 != 1) {
			this.method825();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = super.anInt1006 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - super.anInt1006 << 9;
		if (local64 / local40 >= Static125.anInt2835) {
			return;
		}
		@Pc(77) int local77 = local57 + super.anInt1006 << 9;
		if (local77 / local40 <= Static125.anInt2842) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = super.anInt1006 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static125.anInt2839) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt3614 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static125.anInt2836) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt3614 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt1010 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static42.aBoolean35) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static42.anInt1011 - Static125.anInt2838;
			local223 = Static42.anInt1012 - Static125.anInt2841;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (super.aBoolean34) {
					Static42.anIntArray98[Static42.anInt1013++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static125.anInt2838;
		local219 = Static125.anInt2841;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static42.anIntArray108[arg0];
			local257 = Static42.anIntArray111[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < super.anInt1008; local269++) {
			@Pc(275) int local275 = super.anIntArray83[local269];
			@Pc(280) int local280 = super.anIntArray80[local269];
			@Pc(285) int local285 = super.anIntArray84[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static42.anIntArray101[local269] = local285 - local29;
			if (local285 >= 50) {
				Static42.anIntArray107[local269] = local172 + (local275 << 9) / local285;
				Static42.anIntArray110[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static42.anIntArray107[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static42.anIntArray100[local269] = local275;
				Static42.anIntArray96[local269] = local297;
				Static42.anIntArray106[local269] = local285;
			}
		}
		try {
			this.method831(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[IIII)V")
	private void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static42.anInt1014 = 0;
			Static42.anInt1015 = 0;
			Static42.anInt1016 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray11.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray11[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static42.anInt1014 += super.anIntArray83[local36];
						Static42.anInt1015 += super.anIntArray80[local36];
						Static42.anInt1016 += super.anIntArray84[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static42.anInt1014 = Static42.anInt1014 / local6 + arg2;
				Static42.anInt1015 = Static42.anInt1015 / local6 + arg3;
				Static42.anInt1016 = Static42.anInt1016 / local6 + arg4;
			} else {
				Static42.anInt1014 = arg2;
				Static42.anInt1015 = arg3;
				Static42.anInt1016 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray11.length) {
					local115 = super.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray83[local31] += arg2;
						super.anIntArray80[local31] += arg3;
						super.anIntArray84[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray11.length) {
					local115 = super.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray83[local31] -= Static42.anInt1014;
						super.anIntArray80[local31] -= Static42.anInt1015;
						super.anIntArray84[local31] -= Static42.anInt1016;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static42.anIntArray108[local225];
							local235 = Static42.anIntArray111[local225];
							local251 = super.anIntArray80[local31] * local231 + super.anIntArray83[local31] * local235 >> 16;
							super.anIntArray80[local31] = super.anIntArray80[local31] * local235 - super.anIntArray83[local31] * local231 >> 16;
							super.anIntArray83[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static42.anIntArray108[local36];
							local235 = Static42.anIntArray111[local36];
							local251 = super.anIntArray80[local31] * local235 - super.anIntArray84[local31] * local231 >> 16;
							super.anIntArray84[local31] = super.anIntArray80[local31] * local231 + super.anIntArray84[local31] * local235 >> 16;
							super.anIntArray80[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static42.anIntArray108[local219];
							local235 = Static42.anIntArray111[local219];
							local251 = super.anIntArray84[local31] * local231 + super.anIntArray83[local31] * local235 >> 16;
							super.anIntArray84[local31] = super.anIntArray84[local31] * local235 - super.anIntArray83[local31] * local231 >> 16;
							super.anIntArray83[local31] = local251;
						}
						super.anIntArray83[local31] += Static42.anInt1014;
						super.anIntArray80[local31] += Static42.anInt1015;
						super.anIntArray84[local31] += Static42.anInt1016;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray11.length) {
					local115 = super.anIntArrayArray11[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray83[local31] -= Static42.anInt1014;
						super.anIntArray80[local31] -= Static42.anInt1015;
						super.anIntArray84[local31] -= Static42.anInt1016;
						super.anIntArray83[local31] = super.anIntArray83[local31] * arg2 / 128;
						super.anIntArray80[local31] = super.anIntArray80[local31] * arg3 / 128;
						super.anIntArray84[local31] = super.anIntArray84[local31] * arg4 / 128;
						super.anIntArray83[local31] += Static42.anInt1014;
						super.anIntArray80[local31] += Static42.anInt1015;
						super.anIntArray84[local31] += Static42.anInt1016;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray10 != null && this.aByteArray12 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray10.length) {
					local115 = super.anIntArrayArray10[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray12[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray12[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!aa;I)V")
	@Override
	public void method816(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray11 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class45 local12 = arg0.aClass45Array1[arg1];
		@Pc(15) Class2_Sub9 local15 = local12.aClass2_Sub9_1;
		Static42.anInt1014 = 0;
		Static42.anInt1015 = 0;
		Static42.anInt1016 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1879; local23++) {
			@Pc(29) int local29 = local12.anIntArray205[local23];
			this.method833(local15.anIntArray166[local29], local15.anIntArrayArray21[local29], local12.anIntArray200[local23], local12.anIntArray198[local23], local12.anIntArray204[local23]);
		}
		super.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method819(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static42.aByteArray16.length < super.anInt1004) {
			Static42.aByteArray16 = new byte[super.anInt1004 + 100];
		}
		return this.method827(arg0, Static42.aClass2_Sub1_Sub3_Sub3_Sub1_2, Static42.aByteArray16);
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
	private void method834(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static125.anInt2838;
		@Pc(3) int local3 = Static125.anInt2841;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray90[arg0];
		@Pc(15) int local15 = this.anIntArray92[arg0];
		@Pc(20) int local20 = this.anIntArray88[arg0];
		@Pc(24) int local24 = Static42.anIntArray106[local10];
		@Pc(28) int local28 = Static42.anIntArray106[local15];
		@Pc(32) int local32 = Static42.anIntArray106[local20];
		if (this.aByteArray12 == null) {
			Static125.anInt2840 = 0;
		} else {
			Static125.anInt2840 = this.aByteArray12[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static42.anIntArray104[0] = Static42.anIntArray107[local10];
			Static42.anIntArray105[0] = Static42.anIntArray110[local10];
			local5++;
			Static42.anIntArray99[0] = this.anIntArray86[arg0];
		} else {
			local73 = Static42.anIntArray100[local10];
			local77 = Static42.anIntArray96[local10];
			local82 = this.anIntArray86[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static42.anIntArray103[local32 - local24];
				Static42.anIntArray104[0] = local1 + (local73 + ((Static42.anIntArray100[local20] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[0] = local3 + (local77 + ((Static42.anIntArray96[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static42.anIntArray99[0] = local82 + ((this.anIntArray87[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static42.anIntArray103[local28 - local24];
				Static42.anIntArray104[local5] = local1 + (local73 + ((Static42.anIntArray100[local15] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[local5] = local3 + (local77 + ((Static42.anIntArray96[local15] - local77) * local95 >> 16) << 9) / 50;
				Static42.anIntArray99[local5++] = local82 + ((this.anIntArray85[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static42.anIntArray104[local5] = Static42.anIntArray107[local15];
			Static42.anIntArray105[local5] = Static42.anIntArray110[local15];
			Static42.anIntArray99[local5++] = this.anIntArray85[arg0];
		} else {
			local73 = Static42.anIntArray100[local15];
			local77 = Static42.anIntArray96[local15];
			local82 = this.anIntArray85[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static42.anIntArray103[local24 - local28];
				Static42.anIntArray104[local5] = local1 + (local73 + ((Static42.anIntArray100[local10] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[local5] = local3 + (local77 + ((Static42.anIntArray96[local10] - local77) * local95 >> 16) << 9) / 50;
				Static42.anIntArray99[local5++] = local82 + ((this.anIntArray86[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static42.anIntArray103[local32 - local28];
				Static42.anIntArray104[local5] = local1 + (local73 + ((Static42.anIntArray100[local20] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[local5] = local3 + (local77 + ((Static42.anIntArray96[local20] - local77) * local95 >> 16) << 9) / 50;
				Static42.anIntArray99[local5++] = local82 + ((this.anIntArray87[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static42.anIntArray104[local5] = Static42.anIntArray107[local20];
			Static42.anIntArray105[local5] = Static42.anIntArray110[local20];
			Static42.anIntArray99[local5++] = this.anIntArray87[arg0];
		} else {
			local73 = Static42.anIntArray100[local20];
			local77 = Static42.anIntArray96[local20];
			local82 = this.anIntArray87[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static42.anIntArray103[local28 - local32];
				Static42.anIntArray104[local5] = local1 + (local73 + ((Static42.anIntArray100[local15] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[local5] = local3 + (local77 + ((Static42.anIntArray96[local15] - local77) * local95 >> 16) << 9) / 50;
				Static42.anIntArray99[local5++] = local82 + ((this.anIntArray85[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static42.anIntArray103[local24 - local32];
				Static42.anIntArray104[local5] = local1 + (local73 + ((Static42.anIntArray100[local10] - local73) * local95 >> 16) << 9) / 50;
				Static42.anIntArray105[local5] = local3 + (local77 + ((Static42.anIntArray96[local10] - local77) * local95 >> 16) << 9) / 50;
				Static42.anIntArray99[local5++] = local82 + ((this.anIntArray86[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static42.anIntArray104[0];
		local77 = Static42.anIntArray104[1];
		local82 = Static42.anIntArray104[2];
		local95 = Static42.anIntArray105[0];
		@Pc(590) int local590 = Static42.anIntArray105[1];
		@Pc(594) int local594 = Static42.anIntArray105[2];
		Static125.aBoolean126 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static125.anInt2834 || local77 > Static125.anInt2834 || local82 > Static125.anInt2834) {
				Static125.aBoolean126 = true;
			}
			if (this.aShortArray11 != null && this.aShortArray11[arg0] != -1) {
				if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray14[arg0] & 0xFF;
					local683 = this.anIntArray91[local678];
					local688 = this.anIntArray93[local678];
					local693 = this.anIntArray89[local678];
				}
				if (this.anIntArray87[arg0] == -1) {
					Static125.method2041(local95, local590, local594, local73, local77, local82, this.anIntArray86[arg0], this.anIntArray86[arg0], this.anIntArray86[arg0], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], this.aShortArray11[arg0]);
				} else {
					Static125.method2041(local95, local590, local594, local73, local77, local82, Static42.anIntArray99[0], Static42.anIntArray99[1], Static42.anIntArray99[2], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], this.aShortArray11[arg0]);
				}
			} else if (this.anIntArray87[arg0] == -1) {
				Static125.method2036(local95, local590, local594, local73, local77, local82, Static42.anIntArray97[this.anIntArray86[arg0]]);
			} else {
				Static125.method2039(local95, local590, local594, local73, local77, local82, Static42.anIntArray99[0], Static42.anIntArray99[1], Static42.anIntArray99[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static125.anInt2834 || local77 > Static125.anInt2834 || local82 > Static125.anInt2834 || Static42.anIntArray104[3] < 0 || Static42.anIntArray104[3] > Static125.anInt2834) {
			Static125.aBoolean126 = true;
		}
		if (this.aShortArray11 == null || this.aShortArray11[arg0] == -1) {
			if (this.anIntArray87[arg0] == -1) {
				local683 = Static42.anIntArray97[this.anIntArray86[arg0]];
				Static125.method2036(local95, local590, local594, local73, local77, local82, local683);
				Static125.method2036(local95, local594, Static42.anIntArray105[3], local73, local82, Static42.anIntArray104[3], local683);
				return;
			}
			Static125.method2039(local95, local590, local594, local73, local77, local82, Static42.anIntArray99[0], Static42.anIntArray99[1], Static42.anIntArray99[2]);
			Static125.method2039(local95, local594, Static42.anIntArray105[3], local73, local82, Static42.anIntArray104[3], Static42.anIntArray99[0], Static42.anIntArray99[2], Static42.anIntArray99[3]);
			return;
		}
		if (this.aByteArray14 == null || this.aByteArray14[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray14[arg0] & 0xFF;
			local683 = this.anIntArray91[local678];
			local688 = this.anIntArray93[local678];
			local693 = this.anIntArray89[local678];
		}
		@Pc(956) short local956 = this.aShortArray11[arg0];
		if (this.anIntArray87[arg0] == -1) {
			Static125.method2041(local95, local590, local594, local73, local77, local82, this.anIntArray86[arg0], this.anIntArray86[arg0], this.anIntArray86[arg0], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], local956);
			Static125.method2041(local95, local594, Static42.anIntArray105[3], local73, local82, Static42.anIntArray104[3], this.anIntArray86[arg0], this.anIntArray86[arg0], this.anIntArray86[arg0], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], local956);
			return;
		}
		Static125.method2041(local95, local590, local594, local73, local77, local82, Static42.anIntArray99[0], Static42.anIntArray99[1], Static42.anIntArray99[2], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], local956);
		Static125.method2041(local95, local594, Static42.anIntArray105[3], local73, local82, Static42.anIntArray104[3], Static42.anIntArray99[0], Static42.anIntArray99[2], Static42.anIntArray99[3], Static42.anIntArray100[local683], Static42.anIntArray100[local688], Static42.anIntArray100[local693], Static42.anIntArray96[local683], Static42.anIntArray96[local688], Static42.anIntArray96[local693], Static42.anIntArray106[local683], Static42.anIntArray106[local688], Static42.anIntArray106[local693], local956);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static42.anIntArray102[0] = -1;
		if (super.anInt1007 != 2 && super.anInt1007 != 1) {
			this.method813();
		}
		@Pc(15) int local15 = Static125.anInt2838;
		@Pc(17) int local17 = Static125.anInt2841;
		@Pc(21) int local21 = Static42.anIntArray108[0];
		@Pc(25) int local25 = Static42.anIntArray111[0];
		@Pc(29) int local29 = Static42.anIntArray108[arg0];
		@Pc(33) int local33 = Static42.anIntArray111[arg0];
		@Pc(37) int local37 = Static42.anIntArray108[arg1];
		@Pc(41) int local41 = Static42.anIntArray111[arg1];
		@Pc(45) int local45 = Static42.anIntArray108[arg2];
		@Pc(49) int local49 = Static42.anIntArray111[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < super.anInt1008; local61++) {
			@Pc(67) int local67 = super.anIntArray83[local61];
			@Pc(72) int local72 = super.anIntArray80[local61];
			@Pc(77) int local77 = super.anIntArray84[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static42.anIntArray101[local61] = local77 - local59;
			Static42.anIntArray107[local61] = local15 + (local67 << 9) / local77;
			Static42.anIntArray110[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt1010 > 0) {
				Static42.anIntArray100[local61] = local67;
				Static42.anIntArray96[local61] = local89;
				Static42.anIntArray106[local61] = local77;
			}
		}
		try {
			this.method831(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!aa;ILclient!aa;I[I)V")
	@Override
	public void method810(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method816(arg0, arg1);
			return;
		}
		@Pc(18) Class45 local18 = arg0.aClass45Array1[arg1];
		@Pc(23) Class45 local23 = arg2.aClass45Array1[arg3];
		@Pc(26) Class2_Sub9 local26 = local18.aClass2_Sub9_1;
		Static42.anInt1014 = 0;
		Static42.anInt1015 = 0;
		Static42.anInt1016 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1879; local41++) {
			local47 = local18.anIntArray205[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray166[local47] == 0) {
				this.method833(local26.anIntArray166[local47], local26.anIntArrayArray21[local47], local18.anIntArray200[local41], local18.anIntArray198[local41], local18.anIntArray204[local41]);
			}
		}
		Static42.anInt1014 = 0;
		Static42.anInt1015 = 0;
		Static42.anInt1016 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1879; local47++) {
			@Pc(112) int local112 = local23.anIntArray205[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray166[local112] == 0) {
				this.method833(local26.anIntArray166[local112], local26.anIntArrayArray21[local112], local23.anIntArray200[local47], local23.anIntArray198[local47], local23.anIntArray204[local47]);
			}
		}
		super.anInt1007 = 0;
	}
}
