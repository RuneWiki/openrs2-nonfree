import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!gg", name = "ub", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!gg", name = "vb", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!gg", name = "wb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!gg", name = "xb", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!gg", name = "zb", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!gg", name = "Ab", descriptor = "[I")
	private int[] anIntArray200;

	@OriginalMember(owner = "client!gg", name = "Bb", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!gg", name = "Eb", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!gg", name = "Fb", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!gg", name = "Gb", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!gg", name = "Ib", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!gg", name = "Kb", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!gg", name = "Lb", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!gg", name = "Db", descriptor = "I")
	private int anInt1625 = 0;

	@OriginalMember(owner = "client!gg", name = "Cb", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!sf;IIIII)V")
	public Class1_Sub1_Sub1_Sub2_Sub1(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method2595();
		arg0.method2591();
		super.anInt1623 = arg0.anInt3774;
		super.anIntArray195 = arg0.anIntArray497;
		super.anIntArray193 = arg0.anIntArray505;
		super.anIntArray191 = arg0.anIntArray500;
		super.anInt1622 = arg0.anInt3771;
		this.anIntArray202 = arg0.anIntArray494;
		this.anIntArray204 = arg0.anIntArray501;
		this.anIntArray198 = arg0.anIntArray502;
		this.aByteArray14 = arg0.aByteArray41;
		this.aByteArray17 = arg0.aByteArray42;
		this.aByte3 = arg0.aByte8;
		super.anIntArrayArray16 = arg0.anIntArrayArray34;
		super.anIntArrayArray15 = arg0.anIntArrayArray35;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray197 = new int[super.anInt1622];
		this.anIntArray201 = new int[super.anInt1622];
		this.anIntArray199 = new int[super.anInt1622];
		@Pc(109) int local109;
		if (arg0.aShortArray40 == null) {
			this.aShortArray27 = null;
		} else {
			this.aShortArray27 = new short[super.anInt1622];
			for (local109 = 0; local109 < super.anInt1622; local109++) {
				@Pc(115) short local115 = arg0.aShortArray40[local109];
				if (local115 != -1 && Static121.anInterface1_1.method104(local115)) {
					this.aShortArray27[local109] = local115;
				} else {
					this.aShortArray27[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt3773 > 0 && arg0.aByteArray38 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt3773];
			for (@Pc(155) int local155 = 0; local155 < super.anInt1622; local155++) {
				if (arg0.aByteArray38[local155] != -1) {
					local153[arg0.aByteArray38[local155] & 0xFF]++;
				}
			}
			this.anInt1625 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt3773; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray35[local184] == 0) {
					this.anInt1625++;
				}
			}
			this.anIntArray200 = new int[this.anInt1625];
			this.anIntArray203 = new int[this.anInt1625];
			this.anIntArray205 = new int[this.anInt1625];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt3773; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray35[local224] == 0) {
					this.anIntArray200[local222] = arg0.aShortArray36[local224] & 0xFFFF;
					this.anIntArray203[local222] = arg0.aShortArray39[local224] & 0xFFFF;
					this.anIntArray205[local222] = arg0.aShortArray41[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray15 = new byte[super.anInt1622];
			for (local286 = 0; local286 < super.anInt1622; local286++) {
				if (arg0.aByteArray38[local286] == -1) {
					this.aByteArray15[local286] = -1;
				} else {
					this.aByteArray15[local286] = (byte) local153[arg0.aByteArray38[local286] & 0xFF];
					if (this.aByteArray15[local286] == -1 && this.aShortArray27 != null) {
						this.aShortArray27[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt1622; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray39 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray39[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray42 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray42[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray27 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray27[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class83 local408;
			@Pc(569) Class49 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray42[local109] & 0xFFFF;
					if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray202[local109]] == null) {
						local408 = arg0.aClass83Array2[this.anIntArray202[local109]];
					} else {
						local408 = arg0.aClass83Array1[this.anIntArray202[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
					this.anIntArray197[local109] = Static56.method1089(local389, local286);
					if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray204[local109]] == null) {
						local408 = arg0.aClass83Array2[this.anIntArray204[local109]];
					} else {
						local408 = arg0.aClass83Array1[this.anIntArray204[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
					this.anIntArray201[local109] = Static56.method1089(local389, local286);
					if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray198[local109]] == null) {
						local408 = arg0.aClass83Array2[this.anIntArray198[local109]];
					} else {
						local408 = arg0.aClass83Array1[this.anIntArray198[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
					this.anIntArray199[local109] = Static56.method1089(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass49Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt2456 + arg4 * local569.anInt2460 + arg5 * local569.anInt2461) / (local84 + local84 / 2);
					this.anIntArray197[local109] = Static56.method1089(arg0.aShortArray42[local109] & 0xFFFF, local286);
					this.anIntArray199[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray197[local109] = 128;
					this.anIntArray199[local109] = -1;
				} else {
					this.anIntArray199[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray202[local109]] == null) {
					local408 = arg0.aClass83Array2[this.anIntArray202[local109]];
				} else {
					local408 = arg0.aClass83Array1[this.anIntArray202[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
				this.anIntArray197[local109] = Static56.method1092(local286);
				if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray204[local109]] == null) {
					local408 = arg0.aClass83Array2[this.anIntArray204[local109]];
				} else {
					local408 = arg0.aClass83Array1[this.anIntArray204[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
				this.anIntArray201[local109] = Static56.method1092(local286);
				if (arg0.aClass83Array1 == null || arg0.aClass83Array1[this.anIntArray198[local109]] == null) {
					local408 = arg0.aClass83Array2[this.anIntArray198[local109]];
				} else {
					local408 = arg0.aClass83Array1[this.anIntArray198[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt4015 + arg4 * local408.anInt4021 + arg5 * local408.anInt4017) / (local84 * local408.anInt4019);
				this.anIntArray199[local109] = Static56.method1092(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass49Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt2456 + arg4 * local569.anInt2460 + arg5 * local569.anInt2461) / (local84 + local84 / 2);
				this.anIntArray197[local109] = Static56.method1092(local286);
				this.anIntArray199[local109] = -1;
			} else {
				this.anIntArray199[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "([Lclient!gg;I)V")
	private Class1_Sub1_Sub1_Sub2_Sub1(@OriginalArg(0) Class1_Sub1_Sub1_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt1623 = 0;
		super.anInt1622 = 0;
		this.anInt1625 = 0;
		this.aByte3 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class1_Sub1_Sub1_Sub2_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt1623 += local34.anInt1623;
				super.anInt1622 += local34.anInt1622;
				this.anInt1625 += local34.anInt1625;
				if (local34.aByteArray14 == null) {
					if (this.aByte3 == -1) {
						this.aByte3 = local34.aByte3;
					}
					if (this.aByte3 != local34.aByte3) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray17 != null;
				local13 |= local34.aShortArray27 != null;
				local15 |= local34.aByteArray15 != null;
			}
		}
		super.anIntArray195 = new int[super.anInt1623];
		super.anIntArray193 = new int[super.anInt1623];
		super.anIntArray191 = new int[super.anInt1623];
		this.anIntArray202 = new int[super.anInt1622];
		this.anIntArray204 = new int[super.anInt1622];
		this.anIntArray198 = new int[super.anInt1622];
		this.anIntArray197 = new int[super.anInt1622];
		this.anIntArray201 = new int[super.anInt1622];
		this.anIntArray199 = new int[super.anInt1622];
		if (local9) {
			this.aByteArray14 = new byte[super.anInt1622];
		}
		if (local11) {
			this.aByteArray17 = new byte[super.anInt1622];
		}
		if (local13) {
			this.aShortArray27 = new short[super.anInt1622];
		}
		if (local15) {
			this.aByteArray15 = new byte[super.anInt1622];
		}
		if (this.anInt1625 > 0) {
			this.anIntArray200 = new int[this.anInt1625];
			this.anIntArray203 = new int[this.anInt1625];
			this.anIntArray205 = new int[this.anInt1625];
		}
		super.anInt1623 = 0;
		super.anInt1622 = 0;
		this.anInt1625 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class1_Sub1_Sub1_Sub2_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt1622; local220++) {
					this.anIntArray202[super.anInt1622] = local216.anIntArray202[local220] + super.anInt1623;
					this.anIntArray204[super.anInt1622] = local216.anIntArray204[local220] + super.anInt1623;
					this.anIntArray198[super.anInt1622] = local216.anIntArray198[local220] + super.anInt1623;
					this.anIntArray197[super.anInt1622] = local216.anIntArray197[local220];
					this.anIntArray201[super.anInt1622] = local216.anIntArray201[local220];
					this.anIntArray199[super.anInt1622] = local216.anIntArray199[local220];
					if (local9) {
						if (local216.aByteArray14 == null) {
							this.aByteArray14[super.anInt1622] = local216.aByte3;
						} else {
							this.aByteArray14[super.anInt1622] = local216.aByteArray14[local220];
						}
					}
					if (local11 && local216.aByteArray17 != null) {
						this.aByteArray17[super.anInt1622] = local216.aByteArray17[local220];
					}
					if (local13) {
						if (local216.aShortArray27 == null) {
							this.aShortArray27[super.anInt1622] = -1;
						} else {
							this.aShortArray27[super.anInt1622] = local216.aShortArray27[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray15 == null || local216.aByteArray15[local220] == -1) {
							this.aByteArray15[super.anInt1622] = -1;
						} else {
							this.aByteArray15[super.anInt1622] = (byte) (local216.aByteArray15[local220] + this.anInt1625);
						}
					}
					super.anInt1622++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt1625; local385++) {
					this.anIntArray200[this.anInt1625] = local216.anIntArray200[local385] + super.anInt1623;
					this.anIntArray203[this.anInt1625] = local216.anIntArray203[local385] + super.anInt1623;
					this.anIntArray205[this.anInt1625] = local216.anIntArray205[local385] + super.anInt1623;
					this.anInt1625++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt1623; local435++) {
					super.anIntArray195[super.anInt1623] = local216.anIntArray195[local435];
					super.anIntArray193[super.anInt1623] = local216.anIntArray193[local435];
					super.anIntArray191[super.anInt1623] = local216.anIntArray191[local435];
					super.anInt1623++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Lclient!w;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1076(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static56.aByteArray18.length < super.anInt1622) {
			Static56.aByteArray18 = new byte[super.anInt1622 + 100];
		}
		return this.method1087(arg0, Static56.aClass1_Sub1_Sub1_Sub2_Sub1_2, Static56.aByteArray18);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!gg;[B)Lclient!gg;")
	private Class1_Sub1_Sub1_Sub2_Sub1 method1087(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt1623 = super.anInt1623;
		arg1.anInt1622 = super.anInt1622;
		arg1.anInt1625 = this.anInt1625;
		if (arg1.anIntArray195 == null || arg1.anIntArray195.length < super.anInt1623) {
			arg1.anIntArray195 = new int[super.anInt1623 + 100];
			arg1.anIntArray193 = new int[super.anInt1623 + 100];
			arg1.anIntArray191 = new int[super.anInt1623 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt1623; local43++) {
			arg1.anIntArray195[local43] = super.anIntArray195[local43];
			arg1.anIntArray193[local43] = super.anIntArray193[local43];
			arg1.anIntArray191[local43] = super.anIntArray191[local43];
		}
		if (arg0) {
			arg1.aByteArray17 = this.aByteArray17;
		} else {
			arg1.aByteArray17 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray17 == null) {
				for (local88 = 0; local88 < super.anInt1622; local88++) {
					arg1.aByteArray17[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt1622; local88++) {
					arg1.aByteArray17[local88] = this.aByteArray17[local88];
				}
			}
		}
		arg1.anIntArray202 = this.anIntArray202;
		arg1.anIntArray204 = this.anIntArray204;
		arg1.anIntArray198 = this.anIntArray198;
		arg1.anIntArray197 = this.anIntArray197;
		arg1.anIntArray201 = this.anIntArray201;
		arg1.anIntArray199 = this.anIntArray199;
		arg1.aByteArray14 = this.aByteArray14;
		arg1.aByteArray15 = this.aByteArray15;
		arg1.aShortArray27 = this.aShortArray27;
		arg1.aByte3 = this.aByte3;
		arg1.anIntArray200 = this.anIntArray200;
		arg1.anIntArray203 = this.anIntArray203;
		arg1.anIntArray205 = this.anIntArray205;
		arg1.anIntArrayArray16 = super.anIntArrayArray16;
		arg1.anIntArrayArray15 = super.anIntArrayArray15;
		arg1.aBoolean79 = super.aBoolean79;
		arg1.aBoolean78 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([[IIIIZI)Lclient!w;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1072(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1085();
		@Pc(6) int local6 = arg1 + super.aShort22;
		@Pc(11) int local11 = arg1 + super.aShort21;
		@Pc(16) int local16 = arg3 + super.aShort20;
		@Pc(21) int local21 = arg3 + super.aShort19;
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
		@Pc(101) Class1_Sub1_Sub1_Sub2_Sub1 local101;
		if (arg4) {
			local101 = new Class1_Sub1_Sub1_Sub2_Sub1();
			local101.anInt1623 = super.anInt1623;
			local101.anInt1622 = super.anInt1622;
			local101.anInt1625 = this.anInt1625;
			local101.anIntArray195 = super.anIntArray195;
			local101.anIntArray191 = super.anIntArray191;
			local101.anIntArray202 = this.anIntArray202;
			local101.anIntArray204 = this.anIntArray204;
			local101.anIntArray198 = this.anIntArray198;
			local101.anIntArray197 = this.anIntArray197;
			local101.anIntArray201 = this.anIntArray201;
			local101.anIntArray199 = this.anIntArray199;
			local101.aByteArray14 = this.aByteArray14;
			local101.aByteArray17 = this.aByteArray17;
			local101.aByteArray15 = this.aByteArray15;
			local101.aShortArray27 = this.aShortArray27;
			local101.aByte3 = this.aByte3;
			local101.anIntArray200 = this.anIntArray200;
			local101.anIntArray203 = this.anIntArray203;
			local101.anIntArray205 = this.anIntArray205;
			local101.anIntArrayArray16 = super.anIntArrayArray16;
			local101.anIntArrayArray15 = super.anIntArrayArray15;
			local101.aBoolean79 = super.aBoolean79;
			local101.anIntArray193 = new int[local101.anInt1623];
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
			for (local201 = 0; local201 < local101.anInt1623; local201++) {
				local209 = super.anIntArray195[local201] + arg1;
				local216 = super.anIntArray191[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray193[local201] = super.anIntArray193[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt1623; local201++) {
				local209 = (super.anIntArray193[local201] << 16) / super.aShort36;
				if (local209 < arg5) {
					local216 = super.anIntArray195[local201] + arg1;
					local220 = super.anIntArray191[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray193[local201] = super.anIntArray193[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray193[local201] = super.anIntArray193[local201];
				}
			}
		}
		super.aBoolean78 = false;
		return local101;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method1075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method1085();
			@Pc(3) int local3 = Static121.anInt3151;
			@Pc(5) int local5 = Static121.anInt3145;
			@Pc(9) int local9 = Static56.anIntArray220[0];
			@Pc(13) int local13 = Static56.anIntArray208[0];
			@Pc(17) int local17 = Static56.anIntArray220[arg0];
			@Pc(21) int local21 = Static56.anIntArray208[arg0];
			@Pc(25) int local25 = Static56.anIntArray220[arg1];
			@Pc(29) int local29 = Static56.anIntArray208[arg1];
			@Pc(33) int local33 = Static56.anIntArray220[arg2];
			@Pc(37) int local37 = Static56.anIntArray208[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1623; local49++) {
				@Pc(55) int local55 = super.anIntArray195[local49];
				@Pc(60) int local60 = super.anIntArray193[local49];
				@Pc(65) int local65 = super.anIntArray191[local49];
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
				Static56.anIntArray209[local49] = local65 - local47;
				Static56.anIntArray214[local49] = local3 + (local55 << 9) / arg6;
				Static56.anIntArray210[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt1625 > 0) {
					Static56.anIntArray215[local49] = local55;
					Static56.anIntArray223[local49] = local77;
					Static56.anIntArray207[local49] = local65;
				}
			}
			this.method1093(false, false, 0, super.aShort18, super.aShort18 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!w;)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method1088(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0) {
		return new Class1_Sub1_Sub1_Sub2_Sub1(new Class1_Sub1_Sub1_Sub2_Sub1[] { this, (Class1_Sub1_Sub1_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!la;I)V")
	@Override
	public void method1077(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray16 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class65 local12 = arg0.aClass65Array1[arg1];
		@Pc(15) Class1_Sub18 local15 = local12.aClass1_Sub18_1;
		Static56.anInt1626 = 0;
		Static56.anInt1627 = 0;
		Static56.anInt1628 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt3408; local23++) {
			@Pc(29) int local29 = local12.anIntArray452[local23];
			this.method1095(local15.anIntArray448[local29], local15.anIntArrayArray31[local29], local12.anIntArray451[local23], local12.anIntArray449[local23], local12.anIntArray456[local23]);
		}
		super.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "(I)V")
	private void method1090(@OriginalArg(0) int arg0) {
		if (Static56.aBooleanArray8[arg0]) {
			this.method1094(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray202[arg0];
		@Pc(17) int local17 = this.anIntArray204[arg0];
		@Pc(22) int local22 = this.anIntArray198[arg0];
		Static121.aBoolean162 = Static56.aBooleanArray7[arg0];
		if (this.aByteArray17 == null) {
			Static121.anInt3150 = 0;
		} else {
			Static121.anInt3150 = this.aByteArray17[arg0] & 0xFF;
		}
		if (this.aShortArray27 != null && this.aShortArray27[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray15[arg0] & 0xFF;
				local133 = this.anIntArray200[local128];
				local138 = this.anIntArray203[local128];
				local143 = this.anIntArray205[local128];
			}
			if (this.anIntArray199[arg0] == -1) {
				Static121.method2147(Static56.anIntArray210[local12], Static56.anIntArray210[local17], Static56.anIntArray210[local22], Static56.anIntArray214[local12], Static56.anIntArray214[local17], Static56.anIntArray214[local22], this.anIntArray197[arg0], this.anIntArray197[arg0], this.anIntArray197[arg0], Static56.anIntArray215[local133], Static56.anIntArray215[local138], Static56.anIntArray215[local143], Static56.anIntArray223[local133], Static56.anIntArray223[local138], Static56.anIntArray223[local143], Static56.anIntArray207[local133], Static56.anIntArray207[local138], Static56.anIntArray207[local143], this.aShortArray27[arg0]);
			} else {
				Static121.method2147(Static56.anIntArray210[local12], Static56.anIntArray210[local17], Static56.anIntArray210[local22], Static56.anIntArray214[local12], Static56.anIntArray214[local17], Static56.anIntArray214[local22], this.anIntArray197[arg0], this.anIntArray201[arg0], this.anIntArray199[arg0], Static56.anIntArray215[local133], Static56.anIntArray215[local138], Static56.anIntArray215[local143], Static56.anIntArray223[local133], Static56.anIntArray223[local138], Static56.anIntArray223[local143], Static56.anIntArray207[local133], Static56.anIntArray207[local138], Static56.anIntArray207[local143], this.aShortArray27[arg0]);
			}
		} else if (this.anIntArray199[arg0] == -1) {
			Static121.method2150(Static56.anIntArray210[local12], Static56.anIntArray210[local17], Static56.anIntArray210[local22], Static56.anIntArray214[local12], Static56.anIntArray214[local17], Static56.anIntArray214[local22], Static56.anIntArray221[this.anIntArray197[arg0]]);
		} else {
			Static121.method2149(Static56.anIntArray210[local12], Static56.anIntArray210[local17], Static56.anIntArray210[local22], Static56.anIntArray214[local12], Static56.anIntArray214[local17], Static56.anIntArray214[local22], this.anIntArray197[arg0], this.anIntArray201[arg0], this.anIntArray199[arg0]);
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!la;ILclient!la;I[I)V")
	@Override
	public void method1086(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1077(arg0, arg1);
			return;
		}
		@Pc(18) Class65 local18 = arg0.aClass65Array1[arg1];
		@Pc(23) Class65 local23 = arg2.aClass65Array1[arg3];
		@Pc(26) Class1_Sub18 local26 = local18.aClass1_Sub18_1;
		Static56.anInt1626 = 0;
		Static56.anInt1627 = 0;
		Static56.anInt1628 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt3408; local41++) {
			local47 = local18.anIntArray452[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray448[local47] == 0) {
				this.method1095(local26.anIntArray448[local47], local26.anIntArrayArray31[local47], local18.anIntArray451[local41], local18.anIntArray449[local41], local18.anIntArray456[local41]);
			}
		}
		Static56.anInt1626 = 0;
		Static56.anInt1627 = 0;
		Static56.anInt1628 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt3408; local47++) {
			@Pc(112) int local112 = local23.anIntArray452[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray448[local112] == 0) {
				this.method1095(local26.anIntArray448[local112], local26.anIntArrayArray31[local112], local23.anIntArray451[local47], local23.anIntArray449[local47], local23.anIntArray456[local47]);
			}
		}
		super.aBoolean78 = false;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method1082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method1085();
			@Pc(3) int local3 = Static121.anInt3151;
			@Pc(5) int local5 = Static121.anInt3145;
			@Pc(9) int local9 = Static56.anIntArray220[0];
			@Pc(13) int local13 = Static56.anIntArray208[0];
			@Pc(17) int local17 = Static56.anIntArray220[arg0];
			@Pc(21) int local21 = Static56.anIntArray208[arg0];
			@Pc(25) int local25 = Static56.anIntArray220[arg1];
			@Pc(29) int local29 = Static56.anIntArray208[arg1];
			@Pc(33) int local33 = Static56.anIntArray220[arg2];
			@Pc(37) int local37 = Static56.anIntArray208[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt1623; local49++) {
				@Pc(55) int local55 = super.anIntArray195[local49];
				@Pc(60) int local60 = super.anIntArray193[local49];
				@Pc(65) int local65 = super.anIntArray191[local49];
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
				Static56.anIntArray209[local49] = local65 - local47;
				Static56.anIntArray214[local49] = local3 + (local55 << 9) / local65;
				Static56.anIntArray210[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt1625 > 0) {
					Static56.anIntArray215[local49] = local55;
					Static56.anIntArray223[local49] = local77;
					Static56.anIntArray207[local49] = local65;
				}
			}
			this.method1093(false, false, 0, super.aShort18, super.aShort18 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(Z)Lclient!w;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1083(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static56.aByteArray16.length < super.anInt1622) {
			Static56.aByteArray16 = new byte[super.anInt1622 + 100];
		}
		return this.method1087(arg0, Static56.aClass1_Sub1_Sub1_Sub2_Sub1_1, Static56.aByteArray16);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZZIII)V")
	private void method1093(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static56.anIntArray213[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt1622; local16++) {
			if (this.anIntArray199[local16] != -2) {
				local28 = this.anIntArray202[local16];
				local33 = this.anIntArray204[local16];
				local38 = this.anIntArray198[local16];
				local42 = Static56.anIntArray214[local28];
				local46 = Static56.anIntArray214[local33];
				local50 = Static56.anIntArray214[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static56.anIntArray215[local28];
					local69 = Static56.anIntArray215[local33];
					@Pc(73) int local73 = Static56.anIntArray215[local38];
					@Pc(77) int local77 = Static56.anIntArray223[local28];
					local81 = Static56.anIntArray223[local33];
					local85 = Static56.anIntArray223[local38];
					@Pc(89) int local89 = Static56.anIntArray207[local28];
					local93 = Static56.anIntArray207[local33];
					@Pc(97) int local97 = Static56.anIntArray207[local38];
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
						Static56.aBooleanArray8[local16] = true;
						@Pc(177) int local177 = (Static56.anIntArray209[local28] + Static56.anIntArray209[local33] + Static56.anIntArray209[local38]) / 3 + arg3;
						Static56.anIntArrayArray17[local177][Static56.anIntArray213[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method1091(Static175.anInt1620, Static175.anInt1624, Static56.anIntArray210[local28], Static56.anIntArray210[local33], Static56.anIntArray210[local38], local42, local46, local50)) {
						Static175.anIntArray196[Static175.anInt1621++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static56.anIntArray210[local38] - Static56.anIntArray210[local33]) - (Static56.anIntArray210[local28] - Static56.anIntArray210[local33]) * (local50 - local46) > 0) {
						Static56.aBooleanArray8[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static121.anInt3146 && local46 <= Static121.anInt3146 && local50 <= Static121.anInt3146) {
							Static56.aBooleanArray7[local16] = false;
						} else {
							Static56.aBooleanArray7[local16] = true;
						}
						local65 = (Static56.anIntArray209[local28] + Static56.anIntArray209[local33] + Static56.anIntArray209[local38]) / 3 + arg3;
						Static56.anIntArrayArray17[local65][Static56.anIntArray213[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray14 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static56.anIntArray213[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static56.anIntArrayArray17[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method1090(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static56.anIntArray217[local28] = 0;
			Static56.anIntArray219[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static56.anIntArray213[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static56.anIntArrayArray17[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray14[local50];
					local69 = Static56.anIntArray217[local382]++;
					Static56.anIntArrayArray18[local382][local69] = local50;
					if (local382 < 10) {
						Static56.anIntArray219[local382] += local33;
					} else if (local382 == 10) {
						Static56.anIntArray216[local69] = local33;
					} else {
						Static56.anIntArray212[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static56.anIntArray217[1] > 0 || Static56.anIntArray217[2] > 0) {
			local38 = (Static56.anIntArray219[1] + Static56.anIntArray219[2]) / (Static56.anIntArray217[1] + Static56.anIntArray217[2]);
		}
		local42 = 0;
		if (Static56.anIntArray217[3] > 0 || Static56.anIntArray217[4] > 0) {
			local42 = (Static56.anIntArray219[3] + Static56.anIntArray219[4]) / (Static56.anIntArray217[3] + Static56.anIntArray217[4]);
		}
		local46 = 0;
		if (Static56.anIntArray217[6] > 0 || Static56.anIntArray217[8] > 0) {
			local46 = (Static56.anIntArray219[6] + Static56.anIntArray219[8]) / (Static56.anIntArray217[6] + Static56.anIntArray217[8]);
		}
		local65 = 0;
		local69 = Static56.anIntArray217[10];
		@Pc(515) int[] local515 = Static56.anIntArrayArray18[10];
		@Pc(517) int[] local517 = Static56.anIntArray216;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static56.anIntArray217[11];
			local515 = Static56.anIntArrayArray18[11];
			local517 = Static56.anIntArray212;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method1090(local515[local65++]);
				if (local65 == local69 && local515 != Static56.anIntArrayArray18[11]) {
					local65 = 0;
					local69 = Static56.anIntArray217[11];
					local515 = Static56.anIntArrayArray18[11];
					local517 = Static56.anIntArray212;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method1090(local515[local65++]);
				if (local65 == local69 && local515 != Static56.anIntArrayArray18[11]) {
					local65 = 0;
					local69 = Static56.anIntArray217[11];
					local515 = Static56.anIntArrayArray18[11];
					local517 = Static56.anIntArray212;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method1090(local515[local65++]);
				if (local65 == local69 && local515 != Static56.anIntArrayArray18[11]) {
					local65 = 0;
					local69 = Static56.anIntArray217[11];
					local515 = Static56.anIntArrayArray18[11];
					local517 = Static56.anIntArray212;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static56.anIntArray217[local81];
			@Pc(680) int[] local680 = Static56.anIntArrayArray18[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method1090(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method1090(local515[local65++]);
			if (local65 == local69 && local515 != Static56.anIntArrayArray18[11]) {
				local65 = 0;
				local515 = Static56.anIntArrayArray18[11];
				local69 = Static56.anIntArray217[11];
				local517 = Static56.anIntArray212;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "(I)V")
	private void method1094(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static121.anInt3151;
		@Pc(3) int local3 = Static121.anInt3145;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray202[arg0];
		@Pc(15) int local15 = this.anIntArray204[arg0];
		@Pc(20) int local20 = this.anIntArray198[arg0];
		@Pc(24) int local24 = Static56.anIntArray207[local10];
		@Pc(28) int local28 = Static56.anIntArray207[local15];
		@Pc(32) int local32 = Static56.anIntArray207[local20];
		if (this.aByteArray17 == null) {
			Static121.anInt3150 = 0;
		} else {
			Static121.anInt3150 = this.aByteArray17[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static56.anIntArray211[0] = Static56.anIntArray214[local10];
			Static56.anIntArray218[0] = Static56.anIntArray210[local10];
			local5++;
			Static56.anIntArray206[0] = this.anIntArray197[arg0];
		} else {
			local73 = Static56.anIntArray215[local10];
			local77 = Static56.anIntArray223[local10];
			local82 = this.anIntArray197[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static56.anIntArray222[local32 - local24];
				Static56.anIntArray211[0] = local1 + (local73 + ((Static56.anIntArray215[local20] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[0] = local3 + (local77 + ((Static56.anIntArray223[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static56.anIntArray206[0] = local82 + ((this.anIntArray199[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static56.anIntArray222[local28 - local24];
				Static56.anIntArray211[local5] = local1 + (local73 + ((Static56.anIntArray215[local15] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[local5] = local3 + (local77 + ((Static56.anIntArray223[local15] - local77) * local95 >> 16) << 9) / 50;
				Static56.anIntArray206[local5++] = local82 + ((this.anIntArray201[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static56.anIntArray211[local5] = Static56.anIntArray214[local15];
			Static56.anIntArray218[local5] = Static56.anIntArray210[local15];
			Static56.anIntArray206[local5++] = this.anIntArray201[arg0];
		} else {
			local73 = Static56.anIntArray215[local15];
			local77 = Static56.anIntArray223[local15];
			local82 = this.anIntArray201[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static56.anIntArray222[local24 - local28];
				Static56.anIntArray211[local5] = local1 + (local73 + ((Static56.anIntArray215[local10] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[local5] = local3 + (local77 + ((Static56.anIntArray223[local10] - local77) * local95 >> 16) << 9) / 50;
				Static56.anIntArray206[local5++] = local82 + ((this.anIntArray197[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static56.anIntArray222[local32 - local28];
				Static56.anIntArray211[local5] = local1 + (local73 + ((Static56.anIntArray215[local20] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[local5] = local3 + (local77 + ((Static56.anIntArray223[local20] - local77) * local95 >> 16) << 9) / 50;
				Static56.anIntArray206[local5++] = local82 + ((this.anIntArray199[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static56.anIntArray211[local5] = Static56.anIntArray214[local20];
			Static56.anIntArray218[local5] = Static56.anIntArray210[local20];
			Static56.anIntArray206[local5++] = this.anIntArray199[arg0];
		} else {
			local73 = Static56.anIntArray215[local20];
			local77 = Static56.anIntArray223[local20];
			local82 = this.anIntArray199[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static56.anIntArray222[local28 - local32];
				Static56.anIntArray211[local5] = local1 + (local73 + ((Static56.anIntArray215[local15] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[local5] = local3 + (local77 + ((Static56.anIntArray223[local15] - local77) * local95 >> 16) << 9) / 50;
				Static56.anIntArray206[local5++] = local82 + ((this.anIntArray201[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static56.anIntArray222[local24 - local32];
				Static56.anIntArray211[local5] = local1 + (local73 + ((Static56.anIntArray215[local10] - local73) * local95 >> 16) << 9) / 50;
				Static56.anIntArray218[local5] = local3 + (local77 + ((Static56.anIntArray223[local10] - local77) * local95 >> 16) << 9) / 50;
				Static56.anIntArray206[local5++] = local82 + ((this.anIntArray197[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static56.anIntArray211[0];
		local77 = Static56.anIntArray211[1];
		local82 = Static56.anIntArray211[2];
		local95 = Static56.anIntArray218[0];
		@Pc(590) int local590 = Static56.anIntArray218[1];
		@Pc(594) int local594 = Static56.anIntArray218[2];
		Static121.aBoolean162 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static121.anInt3146 || local77 > Static121.anInt3146 || local82 > Static121.anInt3146) {
				Static121.aBoolean162 = true;
			}
			if (this.aShortArray27 != null && this.aShortArray27[arg0] != -1) {
				if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray15[arg0] & 0xFF;
					local683 = this.anIntArray200[local678];
					local688 = this.anIntArray203[local678];
					local693 = this.anIntArray205[local678];
				}
				if (this.anIntArray199[arg0] == -1) {
					Static121.method2147(local95, local590, local594, local73, local77, local82, this.anIntArray197[arg0], this.anIntArray197[arg0], this.anIntArray197[arg0], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], this.aShortArray27[arg0]);
				} else {
					Static121.method2147(local95, local590, local594, local73, local77, local82, Static56.anIntArray206[0], Static56.anIntArray206[1], Static56.anIntArray206[2], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], this.aShortArray27[arg0]);
				}
			} else if (this.anIntArray199[arg0] == -1) {
				Static121.method2150(local95, local590, local594, local73, local77, local82, Static56.anIntArray221[this.anIntArray197[arg0]]);
			} else {
				Static121.method2149(local95, local590, local594, local73, local77, local82, Static56.anIntArray206[0], Static56.anIntArray206[1], Static56.anIntArray206[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static121.anInt3146 || local77 > Static121.anInt3146 || local82 > Static121.anInt3146 || Static56.anIntArray211[3] < 0 || Static56.anIntArray211[3] > Static121.anInt3146) {
			Static121.aBoolean162 = true;
		}
		if (this.aShortArray27 == null || this.aShortArray27[arg0] == -1) {
			if (this.anIntArray199[arg0] == -1) {
				local683 = Static56.anIntArray221[this.anIntArray197[arg0]];
				Static121.method2150(local95, local590, local594, local73, local77, local82, local683);
				Static121.method2150(local95, local594, Static56.anIntArray218[3], local73, local82, Static56.anIntArray211[3], local683);
				return;
			}
			Static121.method2149(local95, local590, local594, local73, local77, local82, Static56.anIntArray206[0], Static56.anIntArray206[1], Static56.anIntArray206[2]);
			Static121.method2149(local95, local594, Static56.anIntArray218[3], local73, local82, Static56.anIntArray211[3], Static56.anIntArray206[0], Static56.anIntArray206[2], Static56.anIntArray206[3]);
			return;
		}
		if (this.aByteArray15 == null || this.aByteArray15[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray15[arg0] & 0xFF;
			local683 = this.anIntArray200[local678];
			local688 = this.anIntArray203[local678];
			local693 = this.anIntArray205[local678];
		}
		@Pc(956) short local956 = this.aShortArray27[arg0];
		if (this.anIntArray199[arg0] == -1) {
			Static121.method2147(local95, local590, local594, local73, local77, local82, this.anIntArray197[arg0], this.anIntArray197[arg0], this.anIntArray197[arg0], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], local956);
			Static121.method2147(local95, local594, Static56.anIntArray218[3], local73, local82, Static56.anIntArray211[3], this.anIntArray197[arg0], this.anIntArray197[arg0], this.anIntArray197[arg0], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], local956);
			return;
		}
		Static121.method2147(local95, local590, local594, local73, local77, local82, Static56.anIntArray206[0], Static56.anIntArray206[1], Static56.anIntArray206[2], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], local956);
		Static121.method2147(local95, local594, Static56.anIntArray218[3], local73, local82, Static56.anIntArray211[3], Static56.anIntArray206[0], Static56.anIntArray206[2], Static56.anIntArray206[3], Static56.anIntArray215[local683], Static56.anIntArray215[local688], Static56.anIntArray215[local693], Static56.anIntArray223[local683], Static56.anIntArray223[local688], Static56.anIntArray223[local693], Static56.anIntArray207[local683], Static56.anIntArray207[local688], Static56.anIntArray207[local693], local956);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I[IIII)V")
	private void method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static56.anInt1626 = 0;
			Static56.anInt1627 = 0;
			Static56.anInt1628 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray16.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray16[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static56.anInt1626 += super.anIntArray195[local36];
						Static56.anInt1627 += super.anIntArray193[local36];
						Static56.anInt1628 += super.anIntArray191[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static56.anInt1626 = Static56.anInt1626 / local6 + arg2;
				Static56.anInt1627 = Static56.anInt1627 / local6 + arg3;
				Static56.anInt1628 = Static56.anInt1628 / local6 + arg4;
			} else {
				Static56.anInt1626 = arg2;
				Static56.anInt1627 = arg3;
				Static56.anInt1628 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray16.length) {
					local115 = super.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray195[local31] += arg2;
						super.anIntArray193[local31] += arg3;
						super.anIntArray191[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray16.length) {
					local115 = super.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray195[local31] -= Static56.anInt1626;
						super.anIntArray193[local31] -= Static56.anInt1627;
						super.anIntArray191[local31] -= Static56.anInt1628;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static56.anIntArray220[local225];
							local235 = Static56.anIntArray208[local225];
							local253 = super.anIntArray193[local31] * local231 + super.anIntArray195[local31] * local235 + 32767 >> 16;
							super.anIntArray193[local31] = super.anIntArray193[local31] * local235 + 32767 - super.anIntArray195[local31] * local231 >> 16;
							super.anIntArray195[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static56.anIntArray220[local36];
							local235 = Static56.anIntArray208[local36];
							local253 = super.anIntArray193[local31] * local235 + 32767 - super.anIntArray191[local31] * local231 >> 16;
							super.anIntArray191[local31] = super.anIntArray193[local31] * local231 + super.anIntArray191[local31] * local235 + 32767 >> 16;
							super.anIntArray193[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static56.anIntArray220[local219];
							local235 = Static56.anIntArray208[local219];
							local253 = super.anIntArray191[local31] * local231 + super.anIntArray195[local31] * local235 + 32767 >> 16;
							super.anIntArray191[local31] = super.anIntArray191[local31] * local235 + 32767 - super.anIntArray195[local31] * local231 >> 16;
							super.anIntArray195[local31] = local253;
						}
						super.anIntArray195[local31] += Static56.anInt1626;
						super.anIntArray193[local31] += Static56.anInt1627;
						super.anIntArray191[local31] += Static56.anInt1628;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray16.length) {
					local115 = super.anIntArrayArray16[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray195[local31] -= Static56.anInt1626;
						super.anIntArray193[local31] -= Static56.anInt1627;
						super.anIntArray191[local31] -= Static56.anInt1628;
						super.anIntArray195[local31] = super.anIntArray195[local31] * arg2 / 128;
						super.anIntArray193[local31] = super.anIntArray193[local31] * arg3 / 128;
						super.anIntArray191[local31] = super.anIntArray191[local31] * arg4 / 128;
						super.anIntArray195[local31] += Static56.anInt1626;
						super.anIntArray193[local31] += Static56.anInt1627;
						super.anIntArray191[local31] += Static56.anInt1628;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray15 != null && this.aByteArray17 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray15.length) {
					local115 = super.anIntArrayArray15[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray17[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray17[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!super.aBoolean78) {
			this.method1085();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort17 * arg2 + super.aShort23 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort17 * arg2 + super.aShort36 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort17 << 9;
		if (local78 / local38 <= Static121.anInt3144) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort17 << 9;
		if (local91 / local38 >= Static121.anInt3148) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort17 * arg1 + super.aShort23 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static121.anInt3152) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort17 * arg1 + super.aShort36 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static121.anInt3149) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt1625 > 0;
		@Pc(172) int local172 = Static121.anInt3151;
		@Pc(174) int local174 = Static121.anInt3145;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static56.anIntArray220[arg0];
			local178 = Static56.anIntArray208[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(202) int local202;
		@Pc(221) int local221;
		@Pc(206) int local206;
		@Pc(225) int local225;
		@Pc(238) int local238;
		if (arg8 > 0 && Static175.aBoolean80 && local57 > 0) {
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
			local238 = Static175.anInt1620 - Static121.anInt3151;
			@Pc(242) int local242 = Static175.anInt1624 - Static121.anInt3145;
			if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
				local202 = 999999;
				local206 = -999999;
				local221 = 999999;
				local225 = -999999;
				@Pc(305) int[] local305 = new int[] { super.aShort22, super.aShort21, super.aShort22, super.aShort21, super.aShort22, super.aShort21, super.aShort22, super.aShort21 };
				@Pc(348) int[] local348 = new int[] { super.aShort20, super.aShort20, super.aShort19, super.aShort19, super.aShort20, super.aShort20, super.aShort19, super.aShort19 };
				@Pc(391) int[] local391 = new int[] { super.aShort36, super.aShort36, super.aShort36, super.aShort36, super.aShort23, super.aShort23, super.aShort23, super.aShort23 };
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
					if (super.aBoolean79) {
						Static175.anIntArray196[Static175.anInt1621++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local202 = 0; local202 < super.anInt1623; local202++) {
			local221 = super.anIntArray195[local202];
			local206 = super.anIntArray193[local202];
			local225 = super.anIntArray191[local202];
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
			Static56.anIntArray209[local202] = local225 - local24;
			if (local225 >= 50) {
				Static56.anIntArray214[local202] = local172 + (local221 << 9) / local225;
				Static56.anIntArray210[local202] = local174 + (local238 << 9) / local225;
			} else {
				Static56.anIntArray214[local202] = -5000;
				local154 = true;
			}
			if (local170) {
				Static56.anIntArray215[local202] = local221;
				Static56.anIntArray223[local202] = local238;
				Static56.anIntArray207[local202] = local225;
			}
		}
		try {
			this.method1093(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(718) Exception local718) {
		}
	}
}
