import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub1_Sub4_Sub1_Sub1 extends Class1_Sub1_Sub4_Sub1 {

	@OriginalMember(owner = "client!ci", name = "qb", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!ci", name = "sb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ci", name = "tb", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!ci", name = "ub", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!ci", name = "vb", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!ci", name = "wb", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!ci", name = "xb", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!ci", name = "yb", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!ci", name = "Bb", descriptor = "[I")
	private int[] anIntArray77;

	@OriginalMember(owner = "client!ci", name = "Db", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!ci", name = "Eb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ci", name = "Fb", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!ci", name = "Xb", descriptor = "[I")
	private int[] anIntArray92;

	@OriginalMember(owner = "client!ci", name = "zb", descriptor = "B")
	private byte aByte1 = 0;

	@OriginalMember(owner = "client!ci", name = "Tb", descriptor = "I")
	private int anInt920 = 0;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!ei;IIIII)V")
	public Class1_Sub1_Sub4_Sub1_Sub1(@OriginalArg(0) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method1150();
		arg0.method1132();
		super.anInt915 = arg0.anInt1506;
		super.anIntArray67 = arg0.anIntArray162;
		super.anIntArray66 = arg0.anIntArray158;
		super.anIntArray68 = arg0.anIntArray161;
		super.anInt917 = arg0.anInt1508;
		this.anIntArray78 = arg0.anIntArray153;
		this.anIntArray72 = arg0.anIntArray159;
		this.anIntArray74 = arg0.anIntArray160;
		this.aByteArray8 = arg0.aByteArray23;
		this.aByteArray11 = arg0.aByteArray18;
		this.aByte1 = arg0.aByte3;
		super.anIntArrayArray7 = arg0.anIntArrayArray13;
		super.anIntArrayArray6 = arg0.anIntArrayArray14;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray92 = new int[super.anInt917];
		this.anIntArray76 = new int[super.anInt917];
		this.anIntArray73 = new int[super.anInt917];
		@Pc(109) int local109;
		if (arg0.aShortArray17 == null) {
			this.aShortArray8 = null;
		} else {
			this.aShortArray8 = new short[super.anInt917];
			for (local109 = 0; local109 < super.anInt917; local109++) {
				@Pc(115) short local115 = arg0.aShortArray17[local109];
				if (local115 != -1 && Static1.anInterface2_1.method3420(local115)) {
					this.aShortArray8[local109] = local115;
				} else {
					this.aShortArray8[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt1509 > 0 && arg0.aByteArray19 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt1509];
			for (@Pc(155) int local155 = 0; local155 < super.anInt917; local155++) {
				if (arg0.aByteArray19[local155] != -1) {
					local153[arg0.aByteArray19[local155] & 0xFF]++;
				}
			}
			this.anInt920 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt1509; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray21[local184] == 0) {
					this.anInt920++;
				}
			}
			this.anIntArray75 = new int[this.anInt920];
			this.anIntArray77 = new int[this.anInt920];
			this.anIntArray71 = new int[this.anInt920];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt1509; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray21[local224] == 0) {
					this.anIntArray75[local222] = arg0.aShortArray15[local224] & 0xFFFF;
					this.anIntArray77[local222] = arg0.aShortArray14[local224] & 0xFFFF;
					this.anIntArray71[local222] = arg0.aShortArray18[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray10 = new byte[super.anInt917];
			for (local286 = 0; local286 < super.anInt917; local286++) {
				if (arg0.aByteArray19[local286] == -1) {
					this.aByteArray10[local286] = -1;
				} else {
					this.aByteArray10[local286] = (byte) local153[arg0.aByteArray19[local286] & 0xFF];
					if (this.aByteArray10[local286] == -1 && this.aShortArray8 != null) {
						this.aShortArray8[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt917; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray17 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray17[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray18 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray18[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray8 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray8[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class13 local408;
			@Pc(569) Class60 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray16[local109] & 0xFFFF;
					if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray78[local109]] == null) {
						local408 = arg0.aClass13Array1[this.anIntArray78[local109]];
					} else {
						local408 = arg0.aClass13Array2[this.anIntArray78[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
					this.anIntArray92[local109] = Static29.method744(local389, local286);
					if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray72[local109]] == null) {
						local408 = arg0.aClass13Array1[this.anIntArray72[local109]];
					} else {
						local408 = arg0.aClass13Array2[this.anIntArray72[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
					this.anIntArray76[local109] = Static29.method744(local389, local286);
					if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray74[local109]] == null) {
						local408 = arg0.aClass13Array1[this.anIntArray74[local109]];
					} else {
						local408 = arg0.aClass13Array2[this.anIntArray74[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
					this.anIntArray73[local109] = Static29.method744(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass60Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt3343 + arg4 * local569.anInt3342 + arg5 * local569.anInt3346) / (local84 + local84 / 2);
					this.anIntArray92[local109] = Static29.method744(arg0.aShortArray16[local109] & 0xFFFF, local286);
					this.anIntArray73[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray92[local109] = 128;
					this.anIntArray73[local109] = -1;
				} else {
					this.anIntArray73[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray78[local109]] == null) {
					local408 = arg0.aClass13Array1[this.anIntArray78[local109]];
				} else {
					local408 = arg0.aClass13Array2[this.anIntArray78[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
				this.anIntArray92[local109] = Static29.method740(local286);
				if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray72[local109]] == null) {
					local408 = arg0.aClass13Array1[this.anIntArray72[local109]];
				} else {
					local408 = arg0.aClass13Array2[this.anIntArray72[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
				this.anIntArray76[local109] = Static29.method740(local286);
				if (arg0.aClass13Array2 == null || arg0.aClass13Array2[this.anIntArray74[local109]] == null) {
					local408 = arg0.aClass13Array1[this.anIntArray74[local109]];
				} else {
					local408 = arg0.aClass13Array2[this.anIntArray74[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt702 + arg4 * local408.anInt700 + arg5 * local408.anInt705) / (local84 * local408.anInt703);
				this.anIntArray73[local109] = Static29.method740(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass60Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt3343 + arg4 * local569.anInt3342 + arg5 * local569.anInt3346) / (local84 + local84 / 2);
				this.anIntArray92[local109] = Static29.method740(local286);
				this.anIntArray73[local109] = -1;
			} else {
				this.anIntArray73[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([Lclient!ci;I)V")
	private Class1_Sub1_Sub4_Sub1_Sub1(@OriginalArg(0) Class1_Sub1_Sub4_Sub1_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt915 = 0;
		super.anInt917 = 0;
		this.anInt920 = 0;
		this.aByte1 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class1_Sub1_Sub4_Sub1_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt915 += local34.anInt915;
				super.anInt917 += local34.anInt917;
				this.anInt920 += local34.anInt920;
				if (local34.aByteArray8 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local34.aByte1;
					}
					if (this.aByte1 != local34.aByte1) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray11 != null;
				local13 |= local34.aShortArray8 != null;
				local15 |= local34.aByteArray10 != null;
			}
		}
		super.anIntArray67 = new int[super.anInt915];
		super.anIntArray66 = new int[super.anInt915];
		super.anIntArray68 = new int[super.anInt915];
		this.anIntArray78 = new int[super.anInt917];
		this.anIntArray72 = new int[super.anInt917];
		this.anIntArray74 = new int[super.anInt917];
		this.anIntArray92 = new int[super.anInt917];
		this.anIntArray76 = new int[super.anInt917];
		this.anIntArray73 = new int[super.anInt917];
		if (local9) {
			this.aByteArray8 = new byte[super.anInt917];
		}
		if (local11) {
			this.aByteArray11 = new byte[super.anInt917];
		}
		if (local13) {
			this.aShortArray8 = new short[super.anInt917];
		}
		if (local15) {
			this.aByteArray10 = new byte[super.anInt917];
		}
		if (this.anInt920 > 0) {
			this.anIntArray75 = new int[this.anInt920];
			this.anIntArray77 = new int[this.anInt920];
			this.anIntArray71 = new int[this.anInt920];
		}
		super.anInt915 = 0;
		super.anInt917 = 0;
		this.anInt920 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class1_Sub1_Sub4_Sub1_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt917; local220++) {
					this.anIntArray78[super.anInt917] = local216.anIntArray78[local220] + super.anInt915;
					this.anIntArray72[super.anInt917] = local216.anIntArray72[local220] + super.anInt915;
					this.anIntArray74[super.anInt917] = local216.anIntArray74[local220] + super.anInt915;
					this.anIntArray92[super.anInt917] = local216.anIntArray92[local220];
					this.anIntArray76[super.anInt917] = local216.anIntArray76[local220];
					this.anIntArray73[super.anInt917] = local216.anIntArray73[local220];
					if (local9) {
						if (local216.aByteArray8 == null) {
							this.aByteArray8[super.anInt917] = local216.aByte1;
						} else {
							this.aByteArray8[super.anInt917] = local216.aByteArray8[local220];
						}
					}
					if (local11 && local216.aByteArray11 != null) {
						this.aByteArray11[super.anInt917] = local216.aByteArray11[local220];
					}
					if (local13) {
						if (local216.aShortArray8 == null) {
							this.aShortArray8[super.anInt917] = -1;
						} else {
							this.aShortArray8[super.anInt917] = local216.aShortArray8[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray10 == null || local216.aByteArray10[local220] == -1) {
							this.aByteArray10[super.anInt917] = -1;
						} else {
							this.aByteArray10[super.anInt917] = (byte) (local216.aByteArray10[local220] + this.anInt920);
						}
					}
					super.anInt917++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt920; local385++) {
					this.anIntArray75[this.anInt920] = local216.anIntArray75[local385] + super.anInt915;
					this.anIntArray77[this.anInt920] = local216.anIntArray77[local385] + super.anInt915;
					this.anIntArray71[this.anInt920] = local216.anIntArray71[local385] + super.anInt915;
					this.anInt920++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt915; local435++) {
					super.anIntArray67[super.anInt915] = local216.anIntArray67[local435];
					super.anIntArray66[super.anInt915] = local216.anIntArray66[local435];
					super.anIntArray68[super.anInt915] = local216.anIntArray68[local435];
					super.anInt915++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method723();
			@Pc(3) int local3 = Static1.anInt72;
			@Pc(5) int local5 = Static1.anInt73;
			@Pc(9) int local9 = Static29.anIntArray79[0];
			@Pc(13) int local13 = Static29.anIntArray84[0];
			@Pc(17) int local17 = Static29.anIntArray79[arg0];
			@Pc(21) int local21 = Static29.anIntArray84[arg0];
			@Pc(25) int local25 = Static29.anIntArray79[arg1];
			@Pc(29) int local29 = Static29.anIntArray84[arg1];
			@Pc(33) int local33 = Static29.anIntArray79[arg2];
			@Pc(37) int local37 = Static29.anIntArray84[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt915; local49++) {
				@Pc(55) int local55 = super.anIntArray67[local49];
				@Pc(60) int local60 = super.anIntArray66[local49];
				@Pc(65) int local65 = super.anIntArray68[local49];
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
				Static29.anIntArray87[local49] = local65 - local47;
				Static29.anIntArray83[local49] = local3 + (local55 << 9) / local65;
				Static29.anIntArray81[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt920 > 0) {
					Static29.anIntArray94[local49] = local55;
					Static29.anIntArray80[local49] = local77;
					Static29.anIntArray93[local49] = local65;
				}
			}
			this.method736(false, false, 0L, super.aShort12, super.aShort12 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!j;ILclient!j;I[I)V")
	@Override
	public void method732(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method718(arg0, arg1);
			return;
		}
		@Pc(18) Class83 local18 = arg0.aClass83Array1[arg1];
		@Pc(23) Class83 local23 = arg2.aClass83Array1[arg3];
		@Pc(26) Class1_Sub22 local26 = local18.aClass1_Sub22_1;
		Static29.anInt923 = 0;
		Static29.anInt922 = 0;
		Static29.anInt921 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt4471; local41++) {
			@Pc(47) short local47 = local18.aShortArray39[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray362[local47] == 0) {
				if (local18.aShortArray41[local41] != -1) {
					this.method737(0, local26.anIntArrayArray32[local18.aShortArray41[local41]], 0, 0, 0);
				}
				this.method737(local26.anIntArray362[local47], local26.anIntArrayArray32[local47], local18.aShortArray43[local41], local18.aShortArray44[local41], local18.aShortArray40[local41]);
			}
		}
		Static29.anInt923 = 0;
		Static29.anInt922 = 0;
		Static29.anInt921 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt4471; local125++) {
			@Pc(131) short local131 = local23.aShortArray39[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray362[local131] == 0) {
				if (local23.aShortArray41[local125] != -1) {
					this.method737(0, local26.anIntArrayArray32[local23.aShortArray41[local125]], 0, 0, 0);
				}
				this.method737(local26.anIntArray362[local131], local26.anIntArrayArray32[local131], local23.aShortArray43[local125], local23.aShortArray44[local125], local23.aShortArray40[local125]);
			}
		}
		super.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)Lclient!je;")
	@Override
	public Class1_Sub1_Sub4_Sub1 method724(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static29.aByteArray12.length < super.anInt917) {
			Static29.aByteArray12 = new byte[super.anInt917 + 100];
		}
		return this.method738(arg0, Static29.aClass1_Sub1_Sub4_Sub1_Sub1_2, Static29.aByteArray12);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZZJII)V")
	private void method736(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static29.anIntArray86[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt917; local16++) {
			if (this.anIntArray73[local16] != -2) {
				local28 = this.anIntArray78[local16];
				local33 = this.anIntArray72[local16];
				local38 = this.anIntArray74[local16];
				local42 = Static29.anIntArray83[local28];
				local46 = Static29.anIntArray83[local33];
				local50 = Static29.anIntArray83[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static29.anIntArray94[local28];
					local69 = Static29.anIntArray94[local33];
					@Pc(73) int local73 = Static29.anIntArray94[local38];
					@Pc(77) int local77 = Static29.anIntArray80[local28];
					local81 = Static29.anIntArray80[local33];
					local85 = Static29.anIntArray80[local38];
					@Pc(89) int local89 = Static29.anIntArray93[local28];
					local93 = Static29.anIntArray93[local33];
					@Pc(97) int local97 = Static29.anIntArray93[local38];
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
						Static29.aBooleanArray7[local16] = true;
						@Pc(177) int local177 = (Static29.anIntArray87[local28] + Static29.anIntArray87[local33] + Static29.anIntArray87[local38]) / 3 + arg3;
						Static29.anIntArrayArray8[local177][Static29.anIntArray86[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method739(Static84.anInt916, Static84.anInt918, Static29.anIntArray81[local28], Static29.anIntArray81[local33], Static29.anIntArray81[local38], local42, local46, local50)) {
						Static84.aLongArray2[Static84.anInt919++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static29.anIntArray81[local38] - Static29.anIntArray81[local33]) - (Static29.anIntArray81[local28] - Static29.anIntArray81[local33]) * (local50 - local46) > 0) {
						Static29.aBooleanArray7[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static1.anInt69 && local46 <= Static1.anInt69 && local50 <= Static1.anInt69) {
							Static29.aBooleanArray6[local16] = false;
						} else {
							Static29.aBooleanArray6[local16] = true;
						}
						local65 = (Static29.anIntArray87[local28] + Static29.anIntArray87[local33] + Static29.anIntArray87[local38]) / 3 + arg3;
						Static29.anIntArrayArray8[local65][Static29.anIntArray86[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray8 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static29.anIntArray86[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static29.anIntArrayArray8[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method743(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static29.anIntArray88[local28] = 0;
			Static29.anIntArray89[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static29.anIntArray86[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static29.anIntArrayArray8[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray8[local50];
					local69 = Static29.anIntArray88[local382]++;
					Static29.anIntArrayArray9[local382][local69] = local50;
					if (local382 < 10) {
						Static29.anIntArray89[local382] += local33;
					} else if (local382 == 10) {
						Static29.anIntArray91[local69] = local33;
					} else {
						Static29.anIntArray82[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static29.anIntArray88[1] > 0 || Static29.anIntArray88[2] > 0) {
			local38 = (Static29.anIntArray89[1] + Static29.anIntArray89[2]) / (Static29.anIntArray88[1] + Static29.anIntArray88[2]);
		}
		local42 = 0;
		if (Static29.anIntArray88[3] > 0 || Static29.anIntArray88[4] > 0) {
			local42 = (Static29.anIntArray89[3] + Static29.anIntArray89[4]) / (Static29.anIntArray88[3] + Static29.anIntArray88[4]);
		}
		local46 = 0;
		if (Static29.anIntArray88[6] > 0 || Static29.anIntArray88[8] > 0) {
			local46 = (Static29.anIntArray89[6] + Static29.anIntArray89[8]) / (Static29.anIntArray88[6] + Static29.anIntArray88[8]);
		}
		local65 = 0;
		local69 = Static29.anIntArray88[10];
		@Pc(515) int[] local515 = Static29.anIntArrayArray9[10];
		@Pc(517) int[] local517 = Static29.anIntArray91;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static29.anIntArray88[11];
			local515 = Static29.anIntArrayArray9[11];
			local517 = Static29.anIntArray82;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method743(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray9[11]) {
					local65 = 0;
					local69 = Static29.anIntArray88[11];
					local515 = Static29.anIntArrayArray9[11];
					local517 = Static29.anIntArray82;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method743(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray9[11]) {
					local65 = 0;
					local69 = Static29.anIntArray88[11];
					local515 = Static29.anIntArrayArray9[11];
					local517 = Static29.anIntArray82;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method743(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray9[11]) {
					local65 = 0;
					local69 = Static29.anIntArray88[11];
					local515 = Static29.anIntArrayArray9[11];
					local517 = Static29.anIntArray82;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static29.anIntArray88[local81];
			@Pc(680) int[] local680 = Static29.anIntArrayArray9[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method743(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method743(local515[local65++]);
			if (local65 == local69 && local515 != Static29.anIntArrayArray9[11]) {
				local65 = 0;
				local515 = Static29.anIntArrayArray9[11];
				local69 = Static29.anIntArray88[11];
				local517 = Static29.anIntArray82;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(Z)Lclient!je;")
	@Override
	public Class1_Sub1_Sub4_Sub1 method733(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static29.aByteArray9.length < super.anInt917) {
			Static29.aByteArray9 = new byte[super.anInt917 + 100];
		}
		return this.method738(arg0, Static29.aClass1_Sub1_Sub4_Sub1_Sub1_1, Static29.aByteArray9);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIII)V")
	private void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static29.anInt923 = 0;
			Static29.anInt922 = 0;
			Static29.anInt921 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray7.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray7[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static29.anInt923 += super.anIntArray67[local36];
						Static29.anInt922 += super.anIntArray66[local36];
						Static29.anInt921 += super.anIntArray68[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static29.anInt923 = Static29.anInt923 / local6 + arg2;
				Static29.anInt922 = Static29.anInt922 / local6 + arg3;
				Static29.anInt921 = Static29.anInt921 / local6 + arg4;
			} else {
				Static29.anInt923 = arg2;
				Static29.anInt922 = arg3;
				Static29.anInt921 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray7.length) {
					local115 = super.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray67[local31] += arg2;
						super.anIntArray66[local31] += arg3;
						super.anIntArray68[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray7.length) {
					local115 = super.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray67[local31] -= Static29.anInt923;
						super.anIntArray66[local31] -= Static29.anInt922;
						super.anIntArray68[local31] -= Static29.anInt921;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static29.anIntArray79[local225];
							local235 = Static29.anIntArray84[local225];
							local253 = super.anIntArray66[local31] * local231 + super.anIntArray67[local31] * local235 + 32767 >> 16;
							super.anIntArray66[local31] = super.anIntArray66[local31] * local235 + 32767 - super.anIntArray67[local31] * local231 >> 16;
							super.anIntArray67[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static29.anIntArray79[local36];
							local235 = Static29.anIntArray84[local36];
							local253 = super.anIntArray66[local31] * local235 + 32767 - super.anIntArray68[local31] * local231 >> 16;
							super.anIntArray68[local31] = super.anIntArray66[local31] * local231 + super.anIntArray68[local31] * local235 + 32767 >> 16;
							super.anIntArray66[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static29.anIntArray79[local219];
							local235 = Static29.anIntArray84[local219];
							local253 = super.anIntArray68[local31] * local231 + super.anIntArray67[local31] * local235 + 32767 >> 16;
							super.anIntArray68[local31] = super.anIntArray68[local31] * local235 + 32767 - super.anIntArray67[local31] * local231 >> 16;
							super.anIntArray67[local31] = local253;
						}
						super.anIntArray67[local31] += Static29.anInt923;
						super.anIntArray66[local31] += Static29.anInt922;
						super.anIntArray68[local31] += Static29.anInt921;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray7.length) {
					local115 = super.anIntArrayArray7[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray67[local31] -= Static29.anInt923;
						super.anIntArray66[local31] -= Static29.anInt922;
						super.anIntArray68[local31] -= Static29.anInt921;
						super.anIntArray67[local31] = super.anIntArray67[local31] * arg2 / 128;
						super.anIntArray66[local31] = super.anIntArray66[local31] * arg3 / 128;
						super.anIntArray68[local31] = super.anIntArray68[local31] * arg4 / 128;
						super.anIntArray67[local31] += Static29.anInt923;
						super.anIntArray66[local31] += Static29.anInt922;
						super.anIntArray68[local31] += Static29.anInt921;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray6 != null && this.aByteArray11 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray6.length) {
					local115 = super.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray11[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray11[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!ci;[B)Lclient!ci;")
	private Class1_Sub1_Sub4_Sub1_Sub1 method738(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub4_Sub1_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt915 = super.anInt915;
		arg1.anInt917 = super.anInt917;
		arg1.anInt920 = this.anInt920;
		if (arg1.anIntArray67 == null || arg1.anIntArray67.length < super.anInt915) {
			arg1.anIntArray67 = new int[super.anInt915 + 100];
			arg1.anIntArray66 = new int[super.anInt915 + 100];
			arg1.anIntArray68 = new int[super.anInt915 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt915; local43++) {
			arg1.anIntArray67[local43] = super.anIntArray67[local43];
			arg1.anIntArray66[local43] = super.anIntArray66[local43];
			arg1.anIntArray68[local43] = super.anIntArray68[local43];
		}
		if (arg0) {
			arg1.aByteArray11 = this.aByteArray11;
		} else {
			arg1.aByteArray11 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray11 == null) {
				for (local88 = 0; local88 < super.anInt917; local88++) {
					arg1.aByteArray11[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt917; local88++) {
					arg1.aByteArray11[local88] = this.aByteArray11[local88];
				}
			}
		}
		arg1.anIntArray78 = this.anIntArray78;
		arg1.anIntArray72 = this.anIntArray72;
		arg1.anIntArray74 = this.anIntArray74;
		arg1.anIntArray92 = this.anIntArray92;
		arg1.anIntArray76 = this.anIntArray76;
		arg1.anIntArray73 = this.anIntArray73;
		arg1.aByteArray8 = this.aByteArray8;
		arg1.aByteArray10 = this.aByteArray10;
		arg1.aShortArray8 = this.aShortArray8;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray75 = this.anIntArray75;
		arg1.anIntArray77 = this.anIntArray77;
		arg1.anIntArray71 = this.anIntArray71;
		arg1.anIntArrayArray7 = super.anIntArrayArray7;
		arg1.anIntArrayArray6 = super.anIntArrayArray6;
		arg1.aBoolean35 = super.aBoolean35;
		arg1.aBoolean36 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean36) {
			this.method723();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort16 * arg2 + super.aShort13 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort16 * arg2 + super.aShort36 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort16 << 9;
		if (local78 / local38 <= Static1.anInt68) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort16 << 9;
		if (local91 / local38 >= Static1.anInt70) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort16 * arg1 + super.aShort13 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static1.anInt76) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort16 * arg1 + super.aShort36 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static1.anInt71) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt920 > 0;
		@Pc(172) int local172 = Static1.anInt72;
		@Pc(174) int local174 = Static1.anInt73;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static29.anIntArray79[arg0];
			local178 = Static29.anIntArray84[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static84.aBoolean37 && local57 > 0) {
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
			local240 = Static84.anInt916 - Static1.anInt72;
			@Pc(244) int local244 = Static84.anInt918 - Static1.anInt73;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort15, super.aShort11, super.aShort15, super.aShort11, super.aShort15, super.aShort11, super.aShort15, super.aShort11 };
				@Pc(350) int[] local350 = new int[] { super.aShort14, super.aShort14, super.aShort17, super.aShort17, super.aShort14, super.aShort14, super.aShort17, super.aShort17 };
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
					if (super.aBoolean35) {
						Static84.aLongArray2[Static84.anInt919++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt915; local204++) {
			local223 = super.anIntArray67[local204];
			local208 = super.anIntArray66[local204];
			local227 = super.anIntArray68[local204];
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
			Static29.anIntArray87[local204] = local227 - local24;
			if (local227 >= 50) {
				Static29.anIntArray83[local204] = local172 + (local223 << 9) / local227;
				Static29.anIntArray81[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static29.anIntArray83[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static29.anIntArray94[local204] = local223;
				Static29.anIntArray80[local204] = local240;
				Static29.anIntArray93[local204] = local227;
			}
		}
		try {
			this.method736(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!je;)Lclient!je;")
	public Class1_Sub1_Sub4_Sub1 method741(@OriginalArg(0) Class1_Sub1_Sub4_Sub1 arg0) {
		return new Class1_Sub1_Sub4_Sub1_Sub1(new Class1_Sub1_Sub4_Sub1_Sub1[] { this, (Class1_Sub1_Sub4_Sub1_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!j;I)V")
	@Override
	public void method718(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray7 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class83 local12 = arg0.aClass83Array1[arg1];
		@Pc(15) Class1_Sub22 local15 = local12.aClass1_Sub22_1;
		Static29.anInt923 = 0;
		Static29.anInt922 = 0;
		Static29.anInt921 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt4471; local23++) {
			@Pc(29) short local29 = local12.aShortArray39[local23];
			if (local12.aShortArray41[local23] != -1) {
				this.method737(0, local15.anIntArrayArray32[local12.aShortArray41[local23]], 0, 0, 0);
			}
			this.method737(local15.anIntArray362[local29], local15.anIntArrayArray32[local29], local12.aShortArray43[local23], local12.aShortArray44[local23], local12.aShortArray40[local23]);
		}
		super.aBoolean36 = false;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([[IIIIZI)Lclient!je;")
	@Override
	public Class1_Sub1_Sub4_Sub1 method731(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method723();
		@Pc(6) int local6 = arg1 + super.aShort15;
		@Pc(11) int local11 = arg1 + super.aShort11;
		@Pc(16) int local16 = arg3 + super.aShort14;
		@Pc(21) int local21 = arg3 + super.aShort17;
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
		@Pc(101) Class1_Sub1_Sub4_Sub1_Sub1 local101;
		if (arg4) {
			local101 = new Class1_Sub1_Sub4_Sub1_Sub1();
			local101.anInt915 = super.anInt915;
			local101.anInt917 = super.anInt917;
			local101.anInt920 = this.anInt920;
			local101.anIntArray67 = super.anIntArray67;
			local101.anIntArray68 = super.anIntArray68;
			local101.anIntArray78 = this.anIntArray78;
			local101.anIntArray72 = this.anIntArray72;
			local101.anIntArray74 = this.anIntArray74;
			local101.anIntArray92 = this.anIntArray92;
			local101.anIntArray76 = this.anIntArray76;
			local101.anIntArray73 = this.anIntArray73;
			local101.aByteArray8 = this.aByteArray8;
			local101.aByteArray11 = this.aByteArray11;
			local101.aByteArray10 = this.aByteArray10;
			local101.aShortArray8 = this.aShortArray8;
			local101.aByte1 = this.aByte1;
			local101.anIntArray75 = this.anIntArray75;
			local101.anIntArray77 = this.anIntArray77;
			local101.anIntArray71 = this.anIntArray71;
			local101.anIntArrayArray7 = super.anIntArrayArray7;
			local101.anIntArrayArray6 = super.anIntArrayArray6;
			local101.aBoolean35 = super.aBoolean35;
			local101.anIntArray66 = new int[local101.anInt915];
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
			for (local201 = 0; local201 < local101.anInt915; local201++) {
				local209 = super.anIntArray67[local201] + arg1;
				local216 = super.anIntArray68[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray66[local201] = super.anIntArray66[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt915; local201++) {
				local209 = (super.anIntArray66[local201] << 16) / super.aShort36;
				if (local209 < arg5) {
					local216 = super.anIntArray67[local201] + arg1;
					local220 = super.anIntArray68[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray66[local201] = super.anIntArray66[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray66[local201] = super.anIntArray66[local201];
				}
			}
		}
		super.aBoolean36 = false;
		return local101;
	}

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V")
	private void method742(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static1.anInt72;
		@Pc(3) int local3 = Static1.anInt73;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray78[arg0];
		@Pc(15) int local15 = this.anIntArray72[arg0];
		@Pc(20) int local20 = this.anIntArray74[arg0];
		@Pc(24) int local24 = Static29.anIntArray93[local10];
		@Pc(28) int local28 = Static29.anIntArray93[local15];
		@Pc(32) int local32 = Static29.anIntArray93[local20];
		if (this.aByteArray11 == null) {
			Static1.anInt74 = 0;
		} else {
			Static1.anInt74 = this.aByteArray11[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static29.anIntArray96[0] = Static29.anIntArray83[local10];
			Static29.anIntArray95[0] = Static29.anIntArray81[local10];
			local5++;
			Static29.anIntArray90[0] = this.anIntArray92[arg0];
		} else {
			local73 = Static29.anIntArray94[local10];
			local77 = Static29.anIntArray80[local10];
			local82 = this.anIntArray92[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static29.anIntArray97[local32 - local24];
				Static29.anIntArray96[0] = local1 + (local73 + ((Static29.anIntArray94[local20] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[0] = local3 + (local77 + ((Static29.anIntArray80[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static29.anIntArray90[0] = local82 + ((this.anIntArray73[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static29.anIntArray97[local28 - local24];
				Static29.anIntArray96[local5] = local1 + (local73 + ((Static29.anIntArray94[local15] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[local5] = local3 + (local77 + ((Static29.anIntArray80[local15] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray90[local5++] = local82 + ((this.anIntArray76[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static29.anIntArray96[local5] = Static29.anIntArray83[local15];
			Static29.anIntArray95[local5] = Static29.anIntArray81[local15];
			Static29.anIntArray90[local5++] = this.anIntArray76[arg0];
		} else {
			local73 = Static29.anIntArray94[local15];
			local77 = Static29.anIntArray80[local15];
			local82 = this.anIntArray76[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static29.anIntArray97[local24 - local28];
				Static29.anIntArray96[local5] = local1 + (local73 + ((Static29.anIntArray94[local10] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[local5] = local3 + (local77 + ((Static29.anIntArray80[local10] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray90[local5++] = local82 + ((this.anIntArray92[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static29.anIntArray97[local32 - local28];
				Static29.anIntArray96[local5] = local1 + (local73 + ((Static29.anIntArray94[local20] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[local5] = local3 + (local77 + ((Static29.anIntArray80[local20] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray90[local5++] = local82 + ((this.anIntArray73[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static29.anIntArray96[local5] = Static29.anIntArray83[local20];
			Static29.anIntArray95[local5] = Static29.anIntArray81[local20];
			Static29.anIntArray90[local5++] = this.anIntArray73[arg0];
		} else {
			local73 = Static29.anIntArray94[local20];
			local77 = Static29.anIntArray80[local20];
			local82 = this.anIntArray73[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static29.anIntArray97[local28 - local32];
				Static29.anIntArray96[local5] = local1 + (local73 + ((Static29.anIntArray94[local15] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[local5] = local3 + (local77 + ((Static29.anIntArray80[local15] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray90[local5++] = local82 + ((this.anIntArray76[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static29.anIntArray97[local24 - local32];
				Static29.anIntArray96[local5] = local1 + (local73 + ((Static29.anIntArray94[local10] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray95[local5] = local3 + (local77 + ((Static29.anIntArray80[local10] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray90[local5++] = local82 + ((this.anIntArray92[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static29.anIntArray96[0];
		local77 = Static29.anIntArray96[1];
		local82 = Static29.anIntArray96[2];
		local95 = Static29.anIntArray95[0];
		@Pc(590) int local590 = Static29.anIntArray95[1];
		@Pc(594) int local594 = Static29.anIntArray95[2];
		Static1.aBoolean2 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static1.anInt69 || local77 > Static1.anInt69 || local82 > Static1.anInt69) {
				Static1.aBoolean2 = true;
			}
			if (this.aShortArray8 != null && this.aShortArray8[arg0] != -1) {
				if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray10[arg0] & 0xFF;
					local683 = this.anIntArray75[local678];
					local688 = this.anIntArray77[local678];
					local693 = this.anIntArray71[local678];
				}
				if (this.anIntArray73[arg0] == -1) {
					Static1.method107(local95, local590, local594, local73, local77, local82, this.anIntArray92[arg0], this.anIntArray92[arg0], this.anIntArray92[arg0], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], this.aShortArray8[arg0]);
				} else {
					Static1.method107(local95, local590, local594, local73, local77, local82, Static29.anIntArray90[0], Static29.anIntArray90[1], Static29.anIntArray90[2], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], this.aShortArray8[arg0]);
				}
			} else if (this.anIntArray73[arg0] == -1) {
				Static1.method99(local95, local590, local594, local73, local77, local82, Static29.anIntArray85[this.anIntArray92[arg0]]);
			} else {
				Static1.method94(local95, local590, local594, local73, local77, local82, Static29.anIntArray90[0], Static29.anIntArray90[1], Static29.anIntArray90[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static1.anInt69 || local77 > Static1.anInt69 || local82 > Static1.anInt69 || Static29.anIntArray96[3] < 0 || Static29.anIntArray96[3] > Static1.anInt69) {
			Static1.aBoolean2 = true;
		}
		if (this.aShortArray8 == null || this.aShortArray8[arg0] == -1) {
			if (this.anIntArray73[arg0] == -1) {
				local683 = Static29.anIntArray85[this.anIntArray92[arg0]];
				Static1.method99(local95, local590, local594, local73, local77, local82, local683);
				Static1.method99(local95, local594, Static29.anIntArray95[3], local73, local82, Static29.anIntArray96[3], local683);
				return;
			}
			Static1.method94(local95, local590, local594, local73, local77, local82, Static29.anIntArray90[0], Static29.anIntArray90[1], Static29.anIntArray90[2]);
			Static1.method94(local95, local594, Static29.anIntArray95[3], local73, local82, Static29.anIntArray96[3], Static29.anIntArray90[0], Static29.anIntArray90[2], Static29.anIntArray90[3]);
			return;
		}
		if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray10[arg0] & 0xFF;
			local683 = this.anIntArray75[local678];
			local688 = this.anIntArray77[local678];
			local693 = this.anIntArray71[local678];
		}
		@Pc(956) short local956 = this.aShortArray8[arg0];
		if (this.anIntArray73[arg0] == -1) {
			Static1.method107(local95, local590, local594, local73, local77, local82, this.anIntArray92[arg0], this.anIntArray92[arg0], this.anIntArray92[arg0], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], local956);
			Static1.method107(local95, local594, Static29.anIntArray95[3], local73, local82, Static29.anIntArray96[3], this.anIntArray92[arg0], this.anIntArray92[arg0], this.anIntArray92[arg0], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], local956);
			return;
		}
		Static1.method107(local95, local590, local594, local73, local77, local82, Static29.anIntArray90[0], Static29.anIntArray90[1], Static29.anIntArray90[2], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], local956);
		Static1.method107(local95, local594, Static29.anIntArray95[3], local73, local82, Static29.anIntArray96[3], Static29.anIntArray90[0], Static29.anIntArray90[2], Static29.anIntArray90[3], Static29.anIntArray94[local683], Static29.anIntArray94[local688], Static29.anIntArray94[local693], Static29.anIntArray80[local683], Static29.anIntArray80[local688], Static29.anIntArray80[local693], Static29.anIntArray93[local683], Static29.anIntArray93[local688], Static29.anIntArray93[local693], local956);
	}

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "(I)V")
	private void method743(@OriginalArg(0) int arg0) {
		if (Static29.aBooleanArray7[arg0]) {
			this.method742(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray78[arg0];
		@Pc(17) int local17 = this.anIntArray72[arg0];
		@Pc(22) int local22 = this.anIntArray74[arg0];
		Static1.aBoolean2 = Static29.aBooleanArray6[arg0];
		if (this.aByteArray11 == null) {
			Static1.anInt74 = 0;
		} else {
			Static1.anInt74 = this.aByteArray11[arg0] & 0xFF;
		}
		if (this.aShortArray8 != null && this.aShortArray8[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray10 == null || this.aByteArray10[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray10[arg0] & 0xFF;
				local133 = this.anIntArray75[local128];
				local138 = this.anIntArray77[local128];
				local143 = this.anIntArray71[local128];
			}
			if (this.anIntArray73[arg0] == -1) {
				Static1.method107(Static29.anIntArray81[local12], Static29.anIntArray81[local17], Static29.anIntArray81[local22], Static29.anIntArray83[local12], Static29.anIntArray83[local17], Static29.anIntArray83[local22], this.anIntArray92[arg0], this.anIntArray92[arg0], this.anIntArray92[arg0], Static29.anIntArray94[local133], Static29.anIntArray94[local138], Static29.anIntArray94[local143], Static29.anIntArray80[local133], Static29.anIntArray80[local138], Static29.anIntArray80[local143], Static29.anIntArray93[local133], Static29.anIntArray93[local138], Static29.anIntArray93[local143], this.aShortArray8[arg0]);
			} else {
				Static1.method107(Static29.anIntArray81[local12], Static29.anIntArray81[local17], Static29.anIntArray81[local22], Static29.anIntArray83[local12], Static29.anIntArray83[local17], Static29.anIntArray83[local22], this.anIntArray92[arg0], this.anIntArray76[arg0], this.anIntArray73[arg0], Static29.anIntArray94[local133], Static29.anIntArray94[local138], Static29.anIntArray94[local143], Static29.anIntArray80[local133], Static29.anIntArray80[local138], Static29.anIntArray80[local143], Static29.anIntArray93[local133], Static29.anIntArray93[local138], Static29.anIntArray93[local143], this.aShortArray8[arg0]);
			}
		} else if (this.anIntArray73[arg0] == -1) {
			Static1.method99(Static29.anIntArray81[local12], Static29.anIntArray81[local17], Static29.anIntArray81[local22], Static29.anIntArray83[local12], Static29.anIntArray83[local17], Static29.anIntArray83[local22], Static29.anIntArray85[this.anIntArray92[arg0]]);
		} else {
			Static1.method94(Static29.anIntArray81[local12], Static29.anIntArray81[local17], Static29.anIntArray81[local22], Static29.anIntArray83[local12], Static29.anIntArray83[local17], Static29.anIntArray83[local22], this.anIntArray92[arg0], this.anIntArray76[arg0], this.anIntArray73[arg0]);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method723();
			@Pc(3) int local3 = Static1.anInt72;
			@Pc(5) int local5 = Static1.anInt73;
			@Pc(9) int local9 = Static29.anIntArray79[0];
			@Pc(13) int local13 = Static29.anIntArray84[0];
			@Pc(17) int local17 = Static29.anIntArray79[arg0];
			@Pc(21) int local21 = Static29.anIntArray84[arg0];
			@Pc(25) int local25 = Static29.anIntArray79[arg1];
			@Pc(29) int local29 = Static29.anIntArray84[arg1];
			@Pc(33) int local33 = Static29.anIntArray79[arg2];
			@Pc(37) int local37 = Static29.anIntArray84[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt915; local49++) {
				@Pc(55) int local55 = super.anIntArray67[local49];
				@Pc(60) int local60 = super.anIntArray66[local49];
				@Pc(65) int local65 = super.anIntArray68[local49];
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
				Static29.anIntArray87[local49] = local65 - local47;
				Static29.anIntArray83[local49] = local3 + (local55 << 9) / arg6;
				Static29.anIntArray81[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt920 > 0) {
					Static29.anIntArray94[local49] = local55;
					Static29.anIntArray80[local49] = local77;
					Static29.anIntArray93[local49] = local65;
				}
			}
			this.method736(false, false, 0L, super.aShort12, super.aShort12 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}
}
