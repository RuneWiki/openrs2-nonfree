import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub3_Sub5_Sub7_Sub1 extends Class2_Sub3_Sub5_Sub7 {

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!sd", name = "kb", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "[I")
	private int[] anIntArray322;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
	private int[] anIntArray323;

	@OriginalMember(owner = "client!sd", name = "ob", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!sd", name = "sb", descriptor = "[I")
	private int[] anIntArray325;

	@OriginalMember(owner = "client!sd", name = "tb", descriptor = "[I")
	private int[] anIntArray326;

	@OriginalMember(owner = "client!sd", name = "wb", descriptor = "[I")
	private int[] anIntArray327;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "[I")
	private int[] anIntArray328;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
	private int anInt3497 = 0;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub5_Sub7_Sub1() {
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!mc;IIIII)V")
	public Class2_Sub3_Sub5_Sub7_Sub1(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1636();
		arg0.method1646();
		super.anInt3494 = arg0.anInt2470;
		super.anIntArray317 = arg0.anIntArray201;
		super.anIntArray315 = arg0.anIntArray196;
		super.anIntArray319 = arg0.anIntArray193;
		super.anInt3495 = arg0.anInt2469;
		this.anIntArray325 = arg0.anIntArray195;
		this.anIntArray328 = arg0.anIntArray203;
		this.anIntArray323 = arg0.anIntArray197;
		this.aByteArray42 = arg0.aByteArray20;
		this.aByteArray41 = arg0.aByteArray19;
		this.aByte8 = arg0.aByte3;
		super.anIntArrayArray63 = arg0.anIntArrayArray42;
		super.anIntArrayArray62 = arg0.anIntArrayArray43;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray320 = new int[super.anInt3495];
		this.anIntArray321 = new int[super.anInt3495];
		this.anIntArray327 = new int[super.anInt3495];
		@Pc(109) int local109;
		if (arg0.aShortArray20 == null) {
			this.aShortArray31 = null;
		} else {
			this.aShortArray31 = new short[super.anInt3495];
			for (local109 = 0; local109 < super.anInt3495; local109++) {
				@Pc(115) short local115 = arg0.aShortArray20[local109];
				if (local115 != -1 && Static100.anInterface1_2.method1715(local115)) {
					this.aShortArray31[local109] = local115;
				} else {
					this.aShortArray31[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt2468 > 0 && arg0.aByteArray21 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt2468];
			for (@Pc(155) int local155 = 0; local155 < super.anInt3495; local155++) {
				if (arg0.aByteArray21[local155] != -1) {
					local153[arg0.aByteArray21[local155] & 0xFF]++;
				}
			}
			this.anInt3497 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt2468; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray27[local184] == 0) {
					this.anInt3497++;
				}
			}
			this.anIntArray322 = new int[this.anInt3497];
			this.anIntArray326 = new int[this.anInt3497];
			this.anIntArray324 = new int[this.anInt3497];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt2468; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray27[local224] == 0) {
					this.anIntArray322[local222] = arg0.aShortArray19[local224] & 0xFFFF;
					this.anIntArray326[local222] = arg0.aShortArray21[local224] & 0xFFFF;
					this.anIntArray324[local222] = arg0.aShortArray16[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray43 = new byte[super.anInt3495];
			for (local286 = 0; local286 < super.anInt3495; local286++) {
				if (arg0.aByteArray21[local286] == -1) {
					this.aByteArray43[local286] = -1;
				} else {
					this.aByteArray43[local286] = (byte) local153[arg0.aByteArray21[local286] & 0xFF];
					if (this.aByteArray43[local286] == -1 && this.aShortArray31 != null) {
						this.aShortArray31[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt3495; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray25 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray25[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray19 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray19[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray31 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray31[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class47 local408;
			@Pc(569) Class29 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray23[local109] & 0xFFFF;
					if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray325[local109]] == null) {
						local408 = arg0.aClass47Array2[this.anIntArray325[local109]];
					} else {
						local408 = arg0.aClass47Array1[this.anIntArray325[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
					this.anIntArray320[local109] = Static150.method2323(local389, local286);
					if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray328[local109]] == null) {
						local408 = arg0.aClass47Array2[this.anIntArray328[local109]];
					} else {
						local408 = arg0.aClass47Array1[this.anIntArray328[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
					this.anIntArray321[local109] = Static150.method2323(local389, local286);
					if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray323[local109]] == null) {
						local408 = arg0.aClass47Array2[this.anIntArray323[local109]];
					} else {
						local408 = arg0.aClass47Array1[this.anIntArray323[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
					this.anIntArray327[local109] = Static150.method2323(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass29Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt1435 + arg4 * local569.anInt1436 + arg5 * local569.anInt1432) / (local84 + local84 / 2);
					this.anIntArray320[local109] = Static150.method2323(arg0.aShortArray23[local109] & 0xFFFF, local286);
					this.anIntArray327[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray320[local109] = 128;
					this.anIntArray327[local109] = -1;
				} else {
					this.anIntArray327[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray325[local109]] == null) {
					local408 = arg0.aClass47Array2[this.anIntArray325[local109]];
				} else {
					local408 = arg0.aClass47Array1[this.anIntArray325[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
				this.anIntArray320[local109] = Static150.method2315(local286);
				if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray328[local109]] == null) {
					local408 = arg0.aClass47Array2[this.anIntArray328[local109]];
				} else {
					local408 = arg0.aClass47Array1[this.anIntArray328[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
				this.anIntArray321[local109] = Static150.method2315(local286);
				if (arg0.aClass47Array1 == null || arg0.aClass47Array1[this.anIntArray323[local109]] == null) {
					local408 = arg0.aClass47Array2[this.anIntArray323[local109]];
				} else {
					local408 = arg0.aClass47Array1[this.anIntArray323[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt2210 + arg4 * local408.anInt2206 + arg5 * local408.anInt2212) / (local84 * local408.anInt2207);
				this.anIntArray327[local109] = Static150.method2315(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass29Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt1435 + arg4 * local569.anInt1436 + arg5 * local569.anInt1432) / (local84 + local84 / 2);
				this.anIntArray320[local109] = Static150.method2315(local286);
				this.anIntArray327[local109] = -1;
			} else {
				this.anIntArray327[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([Lclient!sd;I)V")
	private Class2_Sub3_Sub5_Sub7_Sub1(@OriginalArg(0) Class2_Sub3_Sub5_Sub7_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt3494 = 0;
		super.anInt3495 = 0;
		this.anInt3497 = 0;
		this.aByte8 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class2_Sub3_Sub5_Sub7_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt3494 += local34.anInt3494;
				super.anInt3495 += local34.anInt3495;
				this.anInt3497 += local34.anInt3497;
				if (local34.aByteArray42 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local34.aByte8;
					}
					if (this.aByte8 != local34.aByte8) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray41 != null;
				local13 |= local34.aShortArray31 != null;
				local15 |= local34.aByteArray43 != null;
			}
		}
		super.anIntArray317 = new int[super.anInt3494];
		super.anIntArray315 = new int[super.anInt3494];
		super.anIntArray319 = new int[super.anInt3494];
		this.anIntArray325 = new int[super.anInt3495];
		this.anIntArray328 = new int[super.anInt3495];
		this.anIntArray323 = new int[super.anInt3495];
		this.anIntArray320 = new int[super.anInt3495];
		this.anIntArray321 = new int[super.anInt3495];
		this.anIntArray327 = new int[super.anInt3495];
		if (local9) {
			this.aByteArray42 = new byte[super.anInt3495];
		}
		if (local11) {
			this.aByteArray41 = new byte[super.anInt3495];
		}
		if (local13) {
			this.aShortArray31 = new short[super.anInt3495];
		}
		if (local15) {
			this.aByteArray43 = new byte[super.anInt3495];
		}
		if (this.anInt3497 > 0) {
			this.anIntArray322 = new int[this.anInt3497];
			this.anIntArray326 = new int[this.anInt3497];
			this.anIntArray324 = new int[this.anInt3497];
		}
		super.anInt3494 = 0;
		super.anInt3495 = 0;
		this.anInt3497 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class2_Sub3_Sub5_Sub7_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt3495; local220++) {
					this.anIntArray325[super.anInt3495] = local216.anIntArray325[local220] + super.anInt3494;
					this.anIntArray328[super.anInt3495] = local216.anIntArray328[local220] + super.anInt3494;
					this.anIntArray323[super.anInt3495] = local216.anIntArray323[local220] + super.anInt3494;
					this.anIntArray320[super.anInt3495] = local216.anIntArray320[local220];
					this.anIntArray321[super.anInt3495] = local216.anIntArray321[local220];
					this.anIntArray327[super.anInt3495] = local216.anIntArray327[local220];
					if (local9) {
						if (local216.aByteArray42 == null) {
							this.aByteArray42[super.anInt3495] = local216.aByte8;
						} else {
							this.aByteArray42[super.anInt3495] = local216.aByteArray42[local220];
						}
					}
					if (local11 && local216.aByteArray41 != null) {
						this.aByteArray41[super.anInt3495] = local216.aByteArray41[local220];
					}
					if (local13) {
						if (local216.aShortArray31 == null) {
							this.aShortArray31[super.anInt3495] = -1;
						} else {
							this.aShortArray31[super.anInt3495] = local216.aShortArray31[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray43 == null || local216.aByteArray43[local220] == -1) {
							this.aByteArray43[super.anInt3495] = -1;
						} else {
							this.aByteArray43[super.anInt3495] = (byte) (local216.aByteArray43[local220] + this.anInt3497);
						}
					}
					super.anInt3495++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt3497; local385++) {
					this.anIntArray322[this.anInt3497] = local216.anIntArray322[local385] + super.anInt3494;
					this.anIntArray326[this.anInt3497] = local216.anIntArray326[local385] + super.anInt3494;
					this.anIntArray324[this.anInt3497] = local216.anIntArray324[local385] + super.anInt3494;
					this.anInt3497++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt3494; local435++) {
					super.anIntArray317[super.anInt3494] = local216.anIntArray317[local435];
					super.anIntArray315[super.anInt3494] = local216.anIntArray315[local435];
					super.anIntArray319[super.anInt3494] = local216.anIntArray319[local435];
					super.anInt3494++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)Lclient!sa;")
	@Override
	public Class2_Sub3_Sub5_Sub7 method2307(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static150.aByteArray44.length < super.anInt3495) {
			Static150.aByteArray44 = new byte[super.anInt3495 + 100];
		}
		return this.method2321(arg0, Static150.aClass2_Sub3_Sub5_Sub7_Sub1_1, Static150.aByteArray44);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method2312();
			@Pc(3) int local3 = Static100.anInt2496;
			@Pc(5) int local5 = Static100.anInt2491;
			@Pc(9) int local9 = Static150.anIntArray329[0];
			@Pc(13) int local13 = Static150.anIntArray345[0];
			@Pc(17) int local17 = Static150.anIntArray329[arg0];
			@Pc(21) int local21 = Static150.anIntArray345[arg0];
			@Pc(25) int local25 = Static150.anIntArray329[arg1];
			@Pc(29) int local29 = Static150.anIntArray345[arg1];
			@Pc(33) int local33 = Static150.anIntArray329[arg2];
			@Pc(37) int local37 = Static150.anIntArray345[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3494; local49++) {
				@Pc(55) int local55 = super.anIntArray317[local49];
				@Pc(60) int local60 = super.anIntArray315[local49];
				@Pc(65) int local65 = super.anIntArray319[local49];
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
				Static150.anIntArray332[local49] = local65 - local47;
				Static150.anIntArray338[local49] = local3 + (local55 << 9) / local65;
				Static150.anIntArray330[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt3497 > 0) {
					Static150.anIntArray340[local49] = local55;
					Static150.anIntArray335[local49] = local77;
					Static150.anIntArray346[local49] = local65;
				}
			}
			this.method2320(false, false, 0, super.aShort28, super.aShort28 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)Lclient!sa;")
	@Override
	public Class2_Sub3_Sub5_Sub7 method2306(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static150.aByteArray45.length < super.anInt3495) {
			Static150.aByteArray45 = new byte[super.anInt3495 + 100];
		}
		return this.method2321(arg0, Static150.aClass2_Sub3_Sub5_Sub7_Sub1_2, Static150.aByteArray45);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([[IIIIZI)Lclient!sa;")
	@Override
	public Class2_Sub3_Sub5_Sub7 method2310(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2312();
		@Pc(6) int local6 = arg1 + super.aShort26;
		@Pc(11) int local11 = arg1 + super.aShort27;
		@Pc(16) int local16 = arg3 + super.aShort31;
		@Pc(21) int local21 = arg3 + super.aShort32;
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
		@Pc(101) Class2_Sub3_Sub5_Sub7_Sub1 local101;
		if (arg4) {
			local101 = new Class2_Sub3_Sub5_Sub7_Sub1();
			local101.anInt3494 = super.anInt3494;
			local101.anInt3495 = super.anInt3495;
			local101.anInt3497 = this.anInt3497;
			local101.anIntArray317 = super.anIntArray317;
			local101.anIntArray319 = super.anIntArray319;
			local101.anIntArray325 = this.anIntArray325;
			local101.anIntArray328 = this.anIntArray328;
			local101.anIntArray323 = this.anIntArray323;
			local101.anIntArray320 = this.anIntArray320;
			local101.anIntArray321 = this.anIntArray321;
			local101.anIntArray327 = this.anIntArray327;
			local101.aByteArray42 = this.aByteArray42;
			local101.aByteArray41 = this.aByteArray41;
			local101.aByteArray43 = this.aByteArray43;
			local101.aShortArray31 = this.aShortArray31;
			local101.aByte8 = this.aByte8;
			local101.anIntArray322 = this.anIntArray322;
			local101.anIntArray326 = this.anIntArray326;
			local101.anIntArray324 = this.anIntArray324;
			local101.anIntArrayArray63 = super.anIntArrayArray63;
			local101.anIntArrayArray62 = super.anIntArrayArray62;
			local101.aBoolean142 = super.aBoolean142;
			local101.anIntArray315 = new int[local101.anInt3494];
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
			for (local201 = 0; local201 < local101.anInt3494; local201++) {
				local209 = super.anIntArray317[local201] + arg1;
				local216 = super.anIntArray319[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray315[local201] = super.anIntArray315[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt3494; local201++) {
				local209 = (super.anIntArray315[local201] << 16) / super.aShort25;
				if (local209 < arg5) {
					local216 = super.anIntArray317[local201] + arg1;
					local220 = super.anIntArray319[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray315[local201] = super.anIntArray315[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray315[local201] = super.anIntArray315[local201];
				}
			}
		}
		super.aBoolean144 = false;
		return local101;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!sa;)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method2316(@OriginalArg(0) Class2_Sub3_Sub5_Sub7 arg0) {
		return new Class2_Sub3_Sub5_Sub7_Sub1(new Class2_Sub3_Sub5_Sub7_Sub1[] { this, (Class2_Sub3_Sub5_Sub7_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ud;ILclient!ud;I[I)V")
	@Override
	public void method2311(@OriginalArg(0) Class2_Sub3_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2303(arg0, arg1);
			return;
		}
		@Pc(18) Class42 local18 = arg0.aClass42Array1[arg1];
		@Pc(23) Class42 local23 = arg2.aClass42Array1[arg3];
		@Pc(26) Class2_Sub20 local26 = local18.aClass2_Sub20_1;
		Static150.anInt3499 = 0;
		Static150.anInt3498 = 0;
		Static150.anInt3500 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1915; local41++) {
			local47 = local18.anIntArray127[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray311[local47] == 0) {
				this.method2324(local26.anIntArray311[local47], local26.anIntArrayArray61[local47], local18.anIntArray132[local41], local18.anIntArray131[local41], local18.anIntArray126[local41]);
			}
		}
		Static150.anInt3499 = 0;
		Static150.anInt3498 = 0;
		Static150.anInt3500 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1915; local47++) {
			@Pc(112) int local112 = local23.anIntArray127[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray311[local112] == 0) {
				this.method2324(local26.anIntArray311[local112], local26.anIntArrayArray61[local112], local23.anIntArray132[local47], local23.anIntArray131[local47], local23.anIntArray126[local47]);
			}
		}
		super.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V")
	private void method2317(@OriginalArg(0) int arg0) {
		if (Static150.aBooleanArray17[arg0]) {
			this.method2318(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray325[arg0];
		@Pc(17) int local17 = this.anIntArray328[arg0];
		@Pc(22) int local22 = this.anIntArray323[arg0];
		Static100.aBoolean100 = Static150.aBooleanArray16[arg0];
		if (this.aByteArray41 == null) {
			Static100.anInt2495 = 0;
		} else {
			Static100.anInt2495 = this.aByteArray41[arg0] & 0xFF;
		}
		if (this.aShortArray31 != null && this.aShortArray31[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray43[arg0] & 0xFF;
				local133 = this.anIntArray322[local128];
				local138 = this.anIntArray326[local128];
				local143 = this.anIntArray324[local128];
			}
			if (this.anIntArray327[arg0] == -1) {
				Static100.method1692(Static150.anIntArray330[local12], Static150.anIntArray330[local17], Static150.anIntArray330[local22], Static150.anIntArray338[local12], Static150.anIntArray338[local17], Static150.anIntArray338[local22], this.anIntArray320[arg0], this.anIntArray320[arg0], this.anIntArray320[arg0], Static150.anIntArray340[local133], Static150.anIntArray340[local138], Static150.anIntArray340[local143], Static150.anIntArray335[local133], Static150.anIntArray335[local138], Static150.anIntArray335[local143], Static150.anIntArray346[local133], Static150.anIntArray346[local138], Static150.anIntArray346[local143], this.aShortArray31[arg0]);
			} else {
				Static100.method1692(Static150.anIntArray330[local12], Static150.anIntArray330[local17], Static150.anIntArray330[local22], Static150.anIntArray338[local12], Static150.anIntArray338[local17], Static150.anIntArray338[local22], this.anIntArray320[arg0], this.anIntArray321[arg0], this.anIntArray327[arg0], Static150.anIntArray340[local133], Static150.anIntArray340[local138], Static150.anIntArray340[local143], Static150.anIntArray335[local133], Static150.anIntArray335[local138], Static150.anIntArray335[local143], Static150.anIntArray346[local133], Static150.anIntArray346[local138], Static150.anIntArray346[local143], this.aShortArray31[arg0]);
			}
		} else if (this.anIntArray327[arg0] == -1) {
			Static100.method1693(Static150.anIntArray330[local12], Static150.anIntArray330[local17], Static150.anIntArray330[local22], Static150.anIntArray338[local12], Static150.anIntArray338[local17], Static150.anIntArray338[local22], Static150.anIntArray334[this.anIntArray320[arg0]]);
		} else {
			Static100.method1679(Static150.anIntArray330[local12], Static150.anIntArray330[local17], Static150.anIntArray330[local22], Static150.anIntArray338[local12], Static150.anIntArray338[local17], Static150.anIntArray338[local22], this.anIntArray320[arg0], this.anIntArray321[arg0], this.anIntArray327[arg0]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(I)V")
	private void method2318(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static100.anInt2496;
		@Pc(3) int local3 = Static100.anInt2491;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray325[arg0];
		@Pc(15) int local15 = this.anIntArray328[arg0];
		@Pc(20) int local20 = this.anIntArray323[arg0];
		@Pc(24) int local24 = Static150.anIntArray346[local10];
		@Pc(28) int local28 = Static150.anIntArray346[local15];
		@Pc(32) int local32 = Static150.anIntArray346[local20];
		if (this.aByteArray41 == null) {
			Static100.anInt2495 = 0;
		} else {
			Static100.anInt2495 = this.aByteArray41[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static150.anIntArray342[0] = Static150.anIntArray338[local10];
			Static150.anIntArray336[0] = Static150.anIntArray330[local10];
			local5++;
			Static150.anIntArray344[0] = this.anIntArray320[arg0];
		} else {
			local73 = Static150.anIntArray340[local10];
			local77 = Static150.anIntArray335[local10];
			local82 = this.anIntArray320[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static150.anIntArray343[local32 - local24];
				Static150.anIntArray342[0] = local1 + (local73 + ((Static150.anIntArray340[local20] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[0] = local3 + (local77 + ((Static150.anIntArray335[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static150.anIntArray344[0] = local82 + ((this.anIntArray327[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static150.anIntArray343[local28 - local24];
				Static150.anIntArray342[local5] = local1 + (local73 + ((Static150.anIntArray340[local15] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[local5] = local3 + (local77 + ((Static150.anIntArray335[local15] - local77) * local95 >> 16) << 9) / 50;
				Static150.anIntArray344[local5++] = local82 + ((this.anIntArray321[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static150.anIntArray342[local5] = Static150.anIntArray338[local15];
			Static150.anIntArray336[local5] = Static150.anIntArray330[local15];
			Static150.anIntArray344[local5++] = this.anIntArray321[arg0];
		} else {
			local73 = Static150.anIntArray340[local15];
			local77 = Static150.anIntArray335[local15];
			local82 = this.anIntArray321[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static150.anIntArray343[local24 - local28];
				Static150.anIntArray342[local5] = local1 + (local73 + ((Static150.anIntArray340[local10] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[local5] = local3 + (local77 + ((Static150.anIntArray335[local10] - local77) * local95 >> 16) << 9) / 50;
				Static150.anIntArray344[local5++] = local82 + ((this.anIntArray320[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static150.anIntArray343[local32 - local28];
				Static150.anIntArray342[local5] = local1 + (local73 + ((Static150.anIntArray340[local20] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[local5] = local3 + (local77 + ((Static150.anIntArray335[local20] - local77) * local95 >> 16) << 9) / 50;
				Static150.anIntArray344[local5++] = local82 + ((this.anIntArray327[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static150.anIntArray342[local5] = Static150.anIntArray338[local20];
			Static150.anIntArray336[local5] = Static150.anIntArray330[local20];
			Static150.anIntArray344[local5++] = this.anIntArray327[arg0];
		} else {
			local73 = Static150.anIntArray340[local20];
			local77 = Static150.anIntArray335[local20];
			local82 = this.anIntArray327[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static150.anIntArray343[local28 - local32];
				Static150.anIntArray342[local5] = local1 + (local73 + ((Static150.anIntArray340[local15] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[local5] = local3 + (local77 + ((Static150.anIntArray335[local15] - local77) * local95 >> 16) << 9) / 50;
				Static150.anIntArray344[local5++] = local82 + ((this.anIntArray321[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static150.anIntArray343[local24 - local32];
				Static150.anIntArray342[local5] = local1 + (local73 + ((Static150.anIntArray340[local10] - local73) * local95 >> 16) << 9) / 50;
				Static150.anIntArray336[local5] = local3 + (local77 + ((Static150.anIntArray335[local10] - local77) * local95 >> 16) << 9) / 50;
				Static150.anIntArray344[local5++] = local82 + ((this.anIntArray320[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static150.anIntArray342[0];
		local77 = Static150.anIntArray342[1];
		local82 = Static150.anIntArray342[2];
		local95 = Static150.anIntArray336[0];
		@Pc(590) int local590 = Static150.anIntArray336[1];
		@Pc(594) int local594 = Static150.anIntArray336[2];
		Static100.aBoolean100 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static100.anInt2498 || local77 > Static100.anInt2498 || local82 > Static100.anInt2498) {
				Static100.aBoolean100 = true;
			}
			if (this.aShortArray31 != null && this.aShortArray31[arg0] != -1) {
				if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray43[arg0] & 0xFF;
					local683 = this.anIntArray322[local678];
					local688 = this.anIntArray326[local678];
					local693 = this.anIntArray324[local678];
				}
				if (this.anIntArray327[arg0] == -1) {
					Static100.method1692(local95, local590, local594, local73, local77, local82, this.anIntArray320[arg0], this.anIntArray320[arg0], this.anIntArray320[arg0], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], this.aShortArray31[arg0]);
				} else {
					Static100.method1692(local95, local590, local594, local73, local77, local82, Static150.anIntArray344[0], Static150.anIntArray344[1], Static150.anIntArray344[2], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], this.aShortArray31[arg0]);
				}
			} else if (this.anIntArray327[arg0] == -1) {
				Static100.method1693(local95, local590, local594, local73, local77, local82, Static150.anIntArray334[this.anIntArray320[arg0]]);
			} else {
				Static100.method1679(local95, local590, local594, local73, local77, local82, Static150.anIntArray344[0], Static150.anIntArray344[1], Static150.anIntArray344[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static100.anInt2498 || local77 > Static100.anInt2498 || local82 > Static100.anInt2498 || Static150.anIntArray342[3] < 0 || Static150.anIntArray342[3] > Static100.anInt2498) {
			Static100.aBoolean100 = true;
		}
		if (this.aShortArray31 == null || this.aShortArray31[arg0] == -1) {
			if (this.anIntArray327[arg0] == -1) {
				local683 = Static150.anIntArray334[this.anIntArray320[arg0]];
				Static100.method1693(local95, local590, local594, local73, local77, local82, local683);
				Static100.method1693(local95, local594, Static150.anIntArray336[3], local73, local82, Static150.anIntArray342[3], local683);
				return;
			}
			Static100.method1679(local95, local590, local594, local73, local77, local82, Static150.anIntArray344[0], Static150.anIntArray344[1], Static150.anIntArray344[2]);
			Static100.method1679(local95, local594, Static150.anIntArray336[3], local73, local82, Static150.anIntArray342[3], Static150.anIntArray344[0], Static150.anIntArray344[2], Static150.anIntArray344[3]);
			return;
		}
		if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray43[arg0] & 0xFF;
			local683 = this.anIntArray322[local678];
			local688 = this.anIntArray326[local678];
			local693 = this.anIntArray324[local678];
		}
		@Pc(956) short local956 = this.aShortArray31[arg0];
		if (this.anIntArray327[arg0] == -1) {
			Static100.method1692(local95, local590, local594, local73, local77, local82, this.anIntArray320[arg0], this.anIntArray320[arg0], this.anIntArray320[arg0], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], local956);
			Static100.method1692(local95, local594, Static150.anIntArray336[3], local73, local82, Static150.anIntArray342[3], this.anIntArray320[arg0], this.anIntArray320[arg0], this.anIntArray320[arg0], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], local956);
			return;
		}
		Static100.method1692(local95, local590, local594, local73, local77, local82, Static150.anIntArray344[0], Static150.anIntArray344[1], Static150.anIntArray344[2], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], local956);
		Static100.method1692(local95, local594, Static150.anIntArray336[3], local73, local82, Static150.anIntArray342[3], Static150.anIntArray344[0], Static150.anIntArray344[2], Static150.anIntArray344[3], Static150.anIntArray340[local683], Static150.anIntArray340[local688], Static150.anIntArray340[local693], Static150.anIntArray335[local683], Static150.anIntArray335[local688], Static150.anIntArray335[local693], Static150.anIntArray346[local683], Static150.anIntArray346[local688], Static150.anIntArray346[local693], local956);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ud;I)V")
	@Override
	public void method2303(@OriginalArg(0) Class2_Sub3_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray63 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class42 local12 = arg0.aClass42Array1[arg1];
		@Pc(15) Class2_Sub20 local15 = local12.aClass2_Sub20_1;
		Static150.anInt3499 = 0;
		Static150.anInt3498 = 0;
		Static150.anInt3500 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1915; local23++) {
			@Pc(29) int local29 = local12.anIntArray127[local23];
			this.method2324(local15.anIntArray311[local29], local15.anIntArrayArray61[local29], local12.anIntArray132[local23], local12.anIntArray131[local23], local12.anIntArray126[local23]);
		}
		super.aBoolean144 = false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZIII)V")
	private void method2320(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static150.anIntArray333[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt3495; local16++) {
			if (this.anIntArray327[local16] != -2) {
				local28 = this.anIntArray325[local16];
				local33 = this.anIntArray328[local16];
				local38 = this.anIntArray323[local16];
				local42 = Static150.anIntArray338[local28];
				local46 = Static150.anIntArray338[local33];
				local50 = Static150.anIntArray338[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static150.anIntArray340[local28];
					local69 = Static150.anIntArray340[local33];
					@Pc(73) int local73 = Static150.anIntArray340[local38];
					@Pc(77) int local77 = Static150.anIntArray335[local28];
					local81 = Static150.anIntArray335[local33];
					local85 = Static150.anIntArray335[local38];
					@Pc(89) int local89 = Static150.anIntArray346[local28];
					local93 = Static150.anIntArray346[local33];
					@Pc(97) int local97 = Static150.anIntArray346[local38];
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
						Static150.aBooleanArray17[local16] = true;
						@Pc(177) int local177 = (Static150.anIntArray332[local28] + Static150.anIntArray332[local33] + Static150.anIntArray332[local38]) / 3 + arg3;
						Static150.anIntArrayArray65[local177][Static150.anIntArray333[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2319(Static147.anInt3493, Static147.anInt3496, Static150.anIntArray330[local28], Static150.anIntArray330[local33], Static150.anIntArray330[local38], local42, local46, local50)) {
						Static147.anIntArray314[Static147.anInt3492++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static150.anIntArray330[local38] - Static150.anIntArray330[local33]) - (Static150.anIntArray330[local28] - Static150.anIntArray330[local33]) * (local50 - local46) > 0) {
						Static150.aBooleanArray17[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static100.anInt2498 && local46 <= Static100.anInt2498 && local50 <= Static100.anInt2498) {
							Static150.aBooleanArray16[local16] = false;
						} else {
							Static150.aBooleanArray16[local16] = true;
						}
						local65 = (Static150.anIntArray332[local28] + Static150.anIntArray332[local33] + Static150.anIntArray332[local38]) / 3 + arg3;
						Static150.anIntArrayArray65[local65][Static150.anIntArray333[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray42 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static150.anIntArray333[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static150.anIntArrayArray65[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2317(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static150.anIntArray331[local28] = 0;
			Static150.anIntArray339[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static150.anIntArray333[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static150.anIntArrayArray65[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray42[local50];
					local69 = Static150.anIntArray331[local382]++;
					Static150.anIntArrayArray64[local382][local69] = local50;
					if (local382 < 10) {
						Static150.anIntArray339[local382] += local33;
					} else if (local382 == 10) {
						Static150.anIntArray341[local69] = local33;
					} else {
						Static150.anIntArray337[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static150.anIntArray331[1] > 0 || Static150.anIntArray331[2] > 0) {
			local38 = (Static150.anIntArray339[1] + Static150.anIntArray339[2]) / (Static150.anIntArray331[1] + Static150.anIntArray331[2]);
		}
		local42 = 0;
		if (Static150.anIntArray331[3] > 0 || Static150.anIntArray331[4] > 0) {
			local42 = (Static150.anIntArray339[3] + Static150.anIntArray339[4]) / (Static150.anIntArray331[3] + Static150.anIntArray331[4]);
		}
		local46 = 0;
		if (Static150.anIntArray331[6] > 0 || Static150.anIntArray331[8] > 0) {
			local46 = (Static150.anIntArray339[6] + Static150.anIntArray339[8]) / (Static150.anIntArray331[6] + Static150.anIntArray331[8]);
		}
		local65 = 0;
		local69 = Static150.anIntArray331[10];
		@Pc(515) int[] local515 = Static150.anIntArrayArray64[10];
		@Pc(517) int[] local517 = Static150.anIntArray341;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static150.anIntArray331[11];
			local515 = Static150.anIntArrayArray64[11];
			local517 = Static150.anIntArray337;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2317(local515[local65++]);
				if (local65 == local69 && local515 != Static150.anIntArrayArray64[11]) {
					local65 = 0;
					local69 = Static150.anIntArray331[11];
					local515 = Static150.anIntArrayArray64[11];
					local517 = Static150.anIntArray337;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2317(local515[local65++]);
				if (local65 == local69 && local515 != Static150.anIntArrayArray64[11]) {
					local65 = 0;
					local69 = Static150.anIntArray331[11];
					local515 = Static150.anIntArrayArray64[11];
					local517 = Static150.anIntArray337;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2317(local515[local65++]);
				if (local65 == local69 && local515 != Static150.anIntArrayArray64[11]) {
					local65 = 0;
					local69 = Static150.anIntArray331[11];
					local515 = Static150.anIntArrayArray64[11];
					local517 = Static150.anIntArray337;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static150.anIntArray331[local81];
			@Pc(680) int[] local680 = Static150.anIntArrayArray64[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2317(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2317(local515[local65++]);
			if (local65 == local69 && local515 != Static150.anIntArrayArray64[11]) {
				local65 = 0;
				local515 = Static150.anIntArrayArray64[11];
				local69 = Static150.anIntArray331[11];
				local517 = Static150.anIntArray337;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!sd;[B)Lclient!sd;")
	private Class2_Sub3_Sub5_Sub7_Sub1 method2321(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub3_Sub5_Sub7_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3494 = super.anInt3494;
		arg1.anInt3495 = super.anInt3495;
		arg1.anInt3497 = this.anInt3497;
		if (arg1.anIntArray317 == null || arg1.anIntArray317.length < super.anInt3494) {
			arg1.anIntArray317 = new int[super.anInt3494 + 100];
			arg1.anIntArray315 = new int[super.anInt3494 + 100];
			arg1.anIntArray319 = new int[super.anInt3494 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt3494; local43++) {
			arg1.anIntArray317[local43] = super.anIntArray317[local43];
			arg1.anIntArray315[local43] = super.anIntArray315[local43];
			arg1.anIntArray319[local43] = super.anIntArray319[local43];
		}
		if (arg0) {
			arg1.aByteArray41 = this.aByteArray41;
		} else {
			arg1.aByteArray41 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray41 == null) {
				for (local88 = 0; local88 < super.anInt3495; local88++) {
					arg1.aByteArray41[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt3495; local88++) {
					arg1.aByteArray41[local88] = this.aByteArray41[local88];
				}
			}
		}
		arg1.anIntArray325 = this.anIntArray325;
		arg1.anIntArray328 = this.anIntArray328;
		arg1.anIntArray323 = this.anIntArray323;
		arg1.anIntArray320 = this.anIntArray320;
		arg1.anIntArray321 = this.anIntArray321;
		arg1.anIntArray327 = this.anIntArray327;
		arg1.aByteArray42 = this.aByteArray42;
		arg1.aByteArray43 = this.aByteArray43;
		arg1.aShortArray31 = this.aShortArray31;
		arg1.aByte8 = this.aByte8;
		arg1.anIntArray322 = this.anIntArray322;
		arg1.anIntArray326 = this.anIntArray326;
		arg1.anIntArray324 = this.anIntArray324;
		arg1.anIntArrayArray63 = super.anIntArrayArray63;
		arg1.anIntArrayArray62 = super.anIntArrayArray62;
		arg1.aBoolean142 = super.aBoolean142;
		arg1.aBoolean144 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method2300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method2312();
			@Pc(3) int local3 = Static100.anInt2496;
			@Pc(5) int local5 = Static100.anInt2491;
			@Pc(9) int local9 = Static150.anIntArray329[0];
			@Pc(13) int local13 = Static150.anIntArray345[0];
			@Pc(17) int local17 = Static150.anIntArray329[arg0];
			@Pc(21) int local21 = Static150.anIntArray345[arg0];
			@Pc(25) int local25 = Static150.anIntArray329[arg1];
			@Pc(29) int local29 = Static150.anIntArray345[arg1];
			@Pc(33) int local33 = Static150.anIntArray329[arg2];
			@Pc(37) int local37 = Static150.anIntArray345[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3494; local49++) {
				@Pc(55) int local55 = super.anIntArray317[local49];
				@Pc(60) int local60 = super.anIntArray315[local49];
				@Pc(65) int local65 = super.anIntArray319[local49];
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
				Static150.anIntArray332[local49] = local65 - local47;
				Static150.anIntArray338[local49] = local3 + (local55 << 9) / arg6;
				Static150.anIntArray330[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt3497 > 0) {
					Static150.anIntArray340[local49] = local55;
					Static150.anIntArray335[local49] = local77;
					Static150.anIntArray346[local49] = local65;
				}
			}
			this.method2320(false, false, 0, super.aShort28, super.aShort28 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!super.aBoolean144) {
			this.method2312();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort29 * arg2 + super.aShort30 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort29 * arg2 + super.aShort25 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort29 << 9;
		if (local78 / local38 <= Static100.anInt2493) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort29 << 9;
		if (local91 / local38 >= Static100.anInt2499) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort29 * arg1 + super.aShort30 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static100.anInt2492) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort29 * arg1 + super.aShort25 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static100.anInt2494) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3497 > 0;
		@Pc(172) int local172 = Static100.anInt2496;
		@Pc(174) int local174 = Static100.anInt2491;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static150.anIntArray329[arg0];
			local178 = Static150.anIntArray345[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(202) int local202;
		@Pc(221) int local221;
		@Pc(206) int local206;
		@Pc(225) int local225;
		@Pc(238) int local238;
		if (arg8 > 0 && Static147.aBoolean143 && local57 > 0) {
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
			local238 = Static147.anInt3493 - Static100.anInt2496;
			@Pc(242) int local242 = Static147.anInt3496 - Static100.anInt2491;
			if (local238 >= local202 && local238 <= local206 && local242 >= local221 && local242 <= local225) {
				local202 = 999999;
				local206 = -999999;
				local221 = 999999;
				local225 = -999999;
				@Pc(305) int[] local305 = new int[] { super.aShort26, super.aShort27, super.aShort26, super.aShort27, super.aShort26, super.aShort27, super.aShort26, super.aShort27 };
				@Pc(348) int[] local348 = new int[] { super.aShort31, super.aShort31, super.aShort32, super.aShort32, super.aShort31, super.aShort31, super.aShort32, super.aShort32 };
				@Pc(391) int[] local391 = new int[] { super.aShort25, super.aShort25, super.aShort25, super.aShort25, super.aShort30, super.aShort30, super.aShort30, super.aShort30 };
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
					if (super.aBoolean142) {
						Static147.anIntArray314[Static147.anInt3492++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local202 = 0; local202 < super.anInt3494; local202++) {
			local221 = super.anIntArray317[local202];
			local206 = super.anIntArray315[local202];
			local225 = super.anIntArray319[local202];
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
			Static150.anIntArray332[local202] = local225 - local24;
			if (local225 >= 50) {
				Static150.anIntArray338[local202] = local172 + (local221 << 9) / local225;
				Static150.anIntArray330[local202] = local174 + (local238 << 9) / local225;
			} else {
				Static150.anIntArray338[local202] = -5000;
				local154 = true;
			}
			if (local170) {
				Static150.anIntArray340[local202] = local221;
				Static150.anIntArray335[local202] = local238;
				Static150.anIntArray346[local202] = local225;
			}
		}
		try {
			this.method2320(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(718) Exception local718) {
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[IIII)V")
	private void method2324(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static150.anInt3499 = 0;
			Static150.anInt3498 = 0;
			Static150.anInt3500 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray63.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray63[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static150.anInt3499 += super.anIntArray317[local36];
						Static150.anInt3498 += super.anIntArray315[local36];
						Static150.anInt3500 += super.anIntArray319[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static150.anInt3499 = Static150.anInt3499 / local6 + arg2;
				Static150.anInt3498 = Static150.anInt3498 / local6 + arg3;
				Static150.anInt3500 = Static150.anInt3500 / local6 + arg4;
			} else {
				Static150.anInt3499 = arg2;
				Static150.anInt3498 = arg3;
				Static150.anInt3500 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray63.length) {
					local115 = super.anIntArrayArray63[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray317[local31] += arg2;
						super.anIntArray315[local31] += arg3;
						super.anIntArray319[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray63.length) {
					local115 = super.anIntArrayArray63[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray317[local31] -= Static150.anInt3499;
						super.anIntArray315[local31] -= Static150.anInt3498;
						super.anIntArray319[local31] -= Static150.anInt3500;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static150.anIntArray329[local225];
							local235 = Static150.anIntArray345[local225];
							local253 = super.anIntArray315[local31] * local231 + super.anIntArray317[local31] * local235 + 32767 >> 16;
							super.anIntArray315[local31] = super.anIntArray315[local31] * local235 + 32767 - super.anIntArray317[local31] * local231 >> 16;
							super.anIntArray317[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static150.anIntArray329[local36];
							local235 = Static150.anIntArray345[local36];
							local253 = super.anIntArray315[local31] * local235 + 32767 - super.anIntArray319[local31] * local231 >> 16;
							super.anIntArray319[local31] = super.anIntArray315[local31] * local231 + super.anIntArray319[local31] * local235 + 32767 >> 16;
							super.anIntArray315[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static150.anIntArray329[local219];
							local235 = Static150.anIntArray345[local219];
							local253 = super.anIntArray319[local31] * local231 + super.anIntArray317[local31] * local235 + 32767 >> 16;
							super.anIntArray319[local31] = super.anIntArray319[local31] * local235 + 32767 - super.anIntArray317[local31] * local231 >> 16;
							super.anIntArray317[local31] = local253;
						}
						super.anIntArray317[local31] += Static150.anInt3499;
						super.anIntArray315[local31] += Static150.anInt3498;
						super.anIntArray319[local31] += Static150.anInt3500;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray63.length) {
					local115 = super.anIntArrayArray63[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray317[local31] -= Static150.anInt3499;
						super.anIntArray315[local31] -= Static150.anInt3498;
						super.anIntArray319[local31] -= Static150.anInt3500;
						super.anIntArray317[local31] = super.anIntArray317[local31] * arg2 / 128;
						super.anIntArray315[local31] = super.anIntArray315[local31] * arg3 / 128;
						super.anIntArray319[local31] = super.anIntArray319[local31] * arg4 / 128;
						super.anIntArray317[local31] += Static150.anInt3499;
						super.anIntArray315[local31] += Static150.anInt3498;
						super.anIntArray319[local31] += Static150.anInt3500;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray62 != null && this.aByteArray41 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray62.length) {
					local115 = super.anIntArrayArray62[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray41[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray41[local31] = (byte) local36;
					}
				}
			}
		}
	}
}
