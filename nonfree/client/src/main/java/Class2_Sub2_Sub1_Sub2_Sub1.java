import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub2_Sub1_Sub2_Sub1 extends Class2_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!da", name = "Gb", descriptor = "[I")
	private int[] anIntArray114;

	@OriginalMember(owner = "client!da", name = "Hb", descriptor = "[I")
	private int[] anIntArray115;

	@OriginalMember(owner = "client!da", name = "Ib", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!da", name = "Kb", descriptor = "[I")
	private int[] anIntArray116;

	@OriginalMember(owner = "client!da", name = "Mb", descriptor = "[I")
	private int[] anIntArray117;

	@OriginalMember(owner = "client!da", name = "Nb", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!da", name = "Ob", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!da", name = "Pb", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!da", name = "Qb", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!da", name = "Sb", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!da", name = "Ub", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!da", name = "Vb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!da", name = "Wb", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!da", name = "Lb", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!da", name = "Tb", descriptor = "I")
	private int anInt863 = 0;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1_Sub2_Sub1() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!fe;IIIII)V")
	public Class2_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) Class2_Sub2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method875();
		arg0.method863();
		super.anInt861 = arg0.anInt1244;
		super.anIntArray108 = arg0.anIntArray199;
		super.anIntArray113 = arg0.anIntArray202;
		super.anIntArray112 = arg0.anIntArray200;
		super.anInt859 = arg0.anInt1243;
		this.anIntArray122 = arg0.anIntArray204;
		this.anIntArray115 = arg0.anIntArray206;
		this.anIntArray116 = arg0.anIntArray205;
		this.aByteArray3 = arg0.aByteArray16;
		this.aByteArray4 = arg0.aByteArray14;
		this.aByte2 = arg0.aByte3;
		super.anIntArrayArray5 = arg0.anIntArrayArray13;
		super.anIntArrayArray6 = arg0.anIntArrayArray12;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray119 = new int[super.anInt859];
		this.anIntArray118 = new int[super.anInt859];
		this.anIntArray121 = new int[super.anInt859];
		@Pc(109) int local109;
		if (arg0.aShortArray39 == null) {
			this.aShortArray27 = null;
		} else {
			this.aShortArray27 = new short[super.anInt859];
			for (local109 = 0; local109 < super.anInt859; local109++) {
				@Pc(115) short local115 = arg0.aShortArray39[local109];
				if (local115 != -1 && Static12.anInterface2_1.method1656(local115)) {
					this.aShortArray27[local109] = local115;
				} else {
					this.aShortArray27[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt1246 > 0 && arg0.aByteArray13 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt1246];
			for (@Pc(155) int local155 = 0; local155 < super.anInt859; local155++) {
				if (arg0.aByteArray13[local155] != -1) {
					local153[arg0.aByteArray13[local155] & 0xFF]++;
				}
			}
			this.anInt863 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt1246; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray12[local184] == 0) {
					this.anInt863++;
				}
			}
			this.anIntArray117 = new int[this.anInt863];
			this.anIntArray114 = new int[this.anInt863];
			this.anIntArray120 = new int[this.anInt863];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt1246; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray12[local224] == 0) {
					this.anIntArray117[local222] = arg0.aShortArray42[local224] & 0xFFFF;
					this.anIntArray114[local222] = arg0.aShortArray36[local224] & 0xFFFF;
					this.anIntArray120[local222] = arg0.aShortArray41[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray6 = new byte[super.anInt859];
			for (local286 = 0; local286 < super.anInt859; local286++) {
				if (arg0.aByteArray13[local286] == -1) {
					this.aByteArray6[local286] = -1;
				} else {
					this.aByteArray6[local286] = (byte) local153[arg0.aByteArray13[local286] & 0xFF];
					if (this.aByteArray6[local286] == -1 && this.aShortArray27 != null) {
						this.aShortArray27[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt859; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray18 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray18[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray14 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray14[local109];
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
			@Pc(408) Class65 local408;
			@Pc(569) Class80 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray38[local109] & 0xFFFF;
					if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray122[local109]] == null) {
						local408 = arg0.aClass65Array1[this.anIntArray122[local109]];
					} else {
						local408 = arg0.aClass65Array2[this.anIntArray122[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
					this.anIntArray119[local109] = Static29.method600(local389, local286);
					if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray115[local109]] == null) {
						local408 = arg0.aClass65Array1[this.anIntArray115[local109]];
					} else {
						local408 = arg0.aClass65Array2[this.anIntArray115[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
					this.anIntArray118[local109] = Static29.method600(local389, local286);
					if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray116[local109]] == null) {
						local408 = arg0.aClass65Array1[this.anIntArray116[local109]];
					} else {
						local408 = arg0.aClass65Array2[this.anIntArray116[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
					this.anIntArray121[local109] = Static29.method600(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass80Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt3839 + arg4 * local569.anInt3838 + arg5 * local569.anInt3841) / (local84 + local84 / 2);
					this.anIntArray119[local109] = Static29.method600(arg0.aShortArray38[local109] & 0xFFFF, local286);
					this.anIntArray121[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray119[local109] = 128;
					this.anIntArray121[local109] = -1;
				} else {
					this.anIntArray121[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray122[local109]] == null) {
					local408 = arg0.aClass65Array1[this.anIntArray122[local109]];
				} else {
					local408 = arg0.aClass65Array2[this.anIntArray122[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
				this.anIntArray119[local109] = Static29.method604(local286);
				if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray115[local109]] == null) {
					local408 = arg0.aClass65Array1[this.anIntArray115[local109]];
				} else {
					local408 = arg0.aClass65Array2[this.anIntArray115[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
				this.anIntArray118[local109] = Static29.method604(local286);
				if (arg0.aClass65Array2 == null || arg0.aClass65Array2[this.anIntArray116[local109]] == null) {
					local408 = arg0.aClass65Array1[this.anIntArray116[local109]];
				} else {
					local408 = arg0.aClass65Array2[this.anIntArray116[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3113 + arg4 * local408.anInt3115 + arg5 * local408.anInt3117) / (local84 * local408.anInt3114);
				this.anIntArray121[local109] = Static29.method604(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass80Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt3839 + arg4 * local569.anInt3838 + arg5 * local569.anInt3841) / (local84 + local84 / 2);
				this.anIntArray119[local109] = Static29.method604(local286);
				this.anIntArray121[local109] = -1;
			} else {
				this.anIntArray121[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "([Lclient!da;I)V")
	private Class2_Sub2_Sub1_Sub2_Sub1(@OriginalArg(0) Class2_Sub2_Sub1_Sub2_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt861 = 0;
		super.anInt859 = 0;
		this.anInt863 = 0;
		this.aByte2 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class2_Sub2_Sub1_Sub2_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt861 += local34.anInt861;
				super.anInt859 += local34.anInt859;
				this.anInt863 += local34.anInt863;
				if (local34.aByteArray3 == null) {
					if (this.aByte2 == -1) {
						this.aByte2 = local34.aByte2;
					}
					if (this.aByte2 != local34.aByte2) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray4 != null;
				local13 |= local34.aShortArray27 != null;
				local15 |= local34.aByteArray6 != null;
			}
		}
		super.anIntArray108 = new int[super.anInt861];
		super.anIntArray113 = new int[super.anInt861];
		super.anIntArray112 = new int[super.anInt861];
		this.anIntArray122 = new int[super.anInt859];
		this.anIntArray115 = new int[super.anInt859];
		this.anIntArray116 = new int[super.anInt859];
		this.anIntArray119 = new int[super.anInt859];
		this.anIntArray118 = new int[super.anInt859];
		this.anIntArray121 = new int[super.anInt859];
		if (local9) {
			this.aByteArray3 = new byte[super.anInt859];
		}
		if (local11) {
			this.aByteArray4 = new byte[super.anInt859];
		}
		if (local13) {
			this.aShortArray27 = new short[super.anInt859];
		}
		if (local15) {
			this.aByteArray6 = new byte[super.anInt859];
		}
		if (this.anInt863 > 0) {
			this.anIntArray117 = new int[this.anInt863];
			this.anIntArray114 = new int[this.anInt863];
			this.anIntArray120 = new int[this.anInt863];
		}
		super.anInt861 = 0;
		super.anInt859 = 0;
		this.anInt863 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class2_Sub2_Sub1_Sub2_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt859; local220++) {
					this.anIntArray122[super.anInt859] = local216.anIntArray122[local220] + super.anInt861;
					this.anIntArray115[super.anInt859] = local216.anIntArray115[local220] + super.anInt861;
					this.anIntArray116[super.anInt859] = local216.anIntArray116[local220] + super.anInt861;
					this.anIntArray119[super.anInt859] = local216.anIntArray119[local220];
					this.anIntArray118[super.anInt859] = local216.anIntArray118[local220];
					this.anIntArray121[super.anInt859] = local216.anIntArray121[local220];
					if (local9) {
						if (local216.aByteArray3 == null) {
							this.aByteArray3[super.anInt859] = local216.aByte2;
						} else {
							this.aByteArray3[super.anInt859] = local216.aByteArray3[local220];
						}
					}
					if (local11 && local216.aByteArray4 != null) {
						this.aByteArray4[super.anInt859] = local216.aByteArray4[local220];
					}
					if (local13) {
						if (local216.aShortArray27 == null) {
							this.aShortArray27[super.anInt859] = -1;
						} else {
							this.aShortArray27[super.anInt859] = local216.aShortArray27[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray6 == null || local216.aByteArray6[local220] == -1) {
							this.aByteArray6[super.anInt859] = -1;
						} else {
							this.aByteArray6[super.anInt859] = (byte) (local216.aByteArray6[local220] + this.anInt863);
						}
					}
					super.anInt859++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt863; local385++) {
					this.anIntArray117[this.anInt863] = local216.anIntArray117[local385] + super.anInt861;
					this.anIntArray114[this.anInt863] = local216.anIntArray114[local385] + super.anInt861;
					this.anIntArray120[this.anInt863] = local216.anIntArray120[local385] + super.anInt861;
					this.anInt863++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt861; local435++) {
					super.anIntArray108[super.anInt861] = local216.anIntArray108[local435];
					super.anIntArray113[super.anInt861] = local216.anIntArray113[local435];
					super.anIntArray112[super.anInt861] = local216.anIntArray112[local435];
					super.anInt861++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lclient!cd;")
	@Override
	public Class2_Sub2_Sub1_Sub2 method587(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static29.aByteArray7.length < super.anInt859) {
			Static29.aByteArray7 = new byte[super.anInt859 + 100];
		}
		return this.method599(arg0, Static29.aClass2_Sub2_Sub1_Sub2_Sub1_2, Static29.aByteArray7);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method592();
			@Pc(3) int local3 = Static12.anInt360;
			@Pc(5) int local5 = Static12.anInt363;
			@Pc(9) int local9 = Static29.anIntArray132[0];
			@Pc(13) int local13 = Static29.anIntArray140[0];
			@Pc(17) int local17 = Static29.anIntArray132[arg0];
			@Pc(21) int local21 = Static29.anIntArray140[arg0];
			@Pc(25) int local25 = Static29.anIntArray132[arg1];
			@Pc(29) int local29 = Static29.anIntArray140[arg1];
			@Pc(33) int local33 = Static29.anIntArray132[arg2];
			@Pc(37) int local37 = Static29.anIntArray140[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt861; local49++) {
				@Pc(55) int local55 = super.anIntArray108[local49];
				@Pc(60) int local60 = super.anIntArray113[local49];
				@Pc(65) int local65 = super.anIntArray112[local49];
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
				Static29.anIntArray123[local49] = local65 - local47;
				Static29.anIntArray135[local49] = local3 + (local55 << 9) / arg6;
				Static29.anIntArray133[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt863 > 0) {
					Static29.anIntArray130[local49] = local55;
					Static29.anIntArray139[local49] = local77;
					Static29.anIntArray129[local49] = local65;
				}
			}
			this.method606(false, false, 0, super.aShort16, super.aShort16 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!cd;)Lclient!cd;")
	public Class2_Sub2_Sub1_Sub2 method598(@OriginalArg(0) Class2_Sub2_Sub1_Sub2 arg0) {
		return new Class2_Sub2_Sub1_Sub2_Sub1(new Class2_Sub2_Sub1_Sub2_Sub1[] { this, (Class2_Sub2_Sub1_Sub2_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!da;[B)Lclient!da;")
	private Class2_Sub2_Sub1_Sub2_Sub1 method599(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt861 = super.anInt861;
		arg1.anInt859 = super.anInt859;
		arg1.anInt863 = this.anInt863;
		if (arg1.anIntArray108 == null || arg1.anIntArray108.length < super.anInt861) {
			arg1.anIntArray108 = new int[super.anInt861 + 100];
			arg1.anIntArray113 = new int[super.anInt861 + 100];
			arg1.anIntArray112 = new int[super.anInt861 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt861; local43++) {
			arg1.anIntArray108[local43] = super.anIntArray108[local43];
			arg1.anIntArray113[local43] = super.anIntArray113[local43];
			arg1.anIntArray112[local43] = super.anIntArray112[local43];
		}
		if (arg0) {
			arg1.aByteArray4 = this.aByteArray4;
		} else {
			arg1.aByteArray4 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray4 == null) {
				for (local88 = 0; local88 < super.anInt859; local88++) {
					arg1.aByteArray4[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt859; local88++) {
					arg1.aByteArray4[local88] = this.aByteArray4[local88];
				}
			}
		}
		arg1.anIntArray122 = this.anIntArray122;
		arg1.anIntArray115 = this.anIntArray115;
		arg1.anIntArray116 = this.anIntArray116;
		arg1.anIntArray119 = this.anIntArray119;
		arg1.anIntArray118 = this.anIntArray118;
		arg1.anIntArray121 = this.anIntArray121;
		arg1.aByteArray3 = this.aByteArray3;
		arg1.aByteArray6 = this.aByteArray6;
		arg1.aShortArray27 = this.aShortArray27;
		arg1.aByte2 = this.aByte2;
		arg1.anIntArray117 = this.anIntArray117;
		arg1.anIntArray114 = this.anIntArray114;
		arg1.anIntArray120 = this.anIntArray120;
		arg1.anIntArrayArray5 = super.anIntArrayArray5;
		arg1.anIntArrayArray6 = super.anIntArrayArray6;
		arg1.aBoolean47 = super.aBoolean47;
		arg1.aBoolean45 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lclient!cd;")
	@Override
	public Class2_Sub2_Sub1_Sub2 method582(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static29.aByteArray5.length < super.anInt859) {
			Static29.aByteArray5 = new byte[super.anInt859 + 100];
		}
		return this.method599(arg0, Static29.aClass2_Sub2_Sub1_Sub2_Sub1_1, Static29.aByteArray5);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIII)V")
	private void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static29.anInt864 = 0;
			Static29.anInt866 = 0;
			Static29.anInt865 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray5.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray5[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static29.anInt864 += super.anIntArray108[local36];
						Static29.anInt866 += super.anIntArray113[local36];
						Static29.anInt865 += super.anIntArray112[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static29.anInt864 = Static29.anInt864 / local6 + arg2;
				Static29.anInt866 = Static29.anInt866 / local6 + arg3;
				Static29.anInt865 = Static29.anInt865 / local6 + arg4;
			} else {
				Static29.anInt864 = arg2;
				Static29.anInt866 = arg3;
				Static29.anInt865 = arg4;
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
						super.anIntArray108[local31] += arg2;
						super.anIntArray113[local31] += arg3;
						super.anIntArray112[local31] += arg4;
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
						super.anIntArray108[local31] -= Static29.anInt864;
						super.anIntArray113[local31] -= Static29.anInt866;
						super.anIntArray112[local31] -= Static29.anInt865;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(253) int local253;
						if (local225 != 0) {
							local231 = Static29.anIntArray132[local225];
							local235 = Static29.anIntArray140[local225];
							local253 = super.anIntArray113[local31] * local231 + super.anIntArray108[local31] * local235 + 32767 >> 16;
							super.anIntArray113[local31] = super.anIntArray113[local31] * local235 + 32767 - super.anIntArray108[local31] * local231 >> 16;
							super.anIntArray108[local31] = local253;
						}
						if (local36 != 0) {
							local231 = Static29.anIntArray132[local36];
							local235 = Static29.anIntArray140[local36];
							local253 = super.anIntArray113[local31] * local235 + 32767 - super.anIntArray112[local31] * local231 >> 16;
							super.anIntArray112[local31] = super.anIntArray113[local31] * local231 + super.anIntArray112[local31] * local235 + 32767 >> 16;
							super.anIntArray113[local31] = local253;
						}
						if (local219 != 0) {
							local231 = Static29.anIntArray132[local219];
							local235 = Static29.anIntArray140[local219];
							local253 = super.anIntArray112[local31] * local231 + super.anIntArray108[local31] * local235 + 32767 >> 16;
							super.anIntArray112[local31] = super.anIntArray112[local31] * local235 + 32767 - super.anIntArray108[local31] * local231 >> 16;
							super.anIntArray108[local31] = local253;
						}
						super.anIntArray108[local31] += Static29.anInt864;
						super.anIntArray113[local31] += Static29.anInt866;
						super.anIntArray112[local31] += Static29.anInt865;
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
						super.anIntArray108[local31] -= Static29.anInt864;
						super.anIntArray113[local31] -= Static29.anInt866;
						super.anIntArray112[local31] -= Static29.anInt865;
						super.anIntArray108[local31] = super.anIntArray108[local31] * arg2 / 128;
						super.anIntArray113[local31] = super.anIntArray113[local31] * arg3 / 128;
						super.anIntArray112[local31] = super.anIntArray112[local31] * arg4 / 128;
						super.anIntArray108[local31] += Static29.anInt864;
						super.anIntArray113[local31] += Static29.anInt866;
						super.anIntArray112[local31] += Static29.anInt865;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray6 != null && this.aByteArray4 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray6.length) {
					local115 = super.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray4[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray4[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method592();
			@Pc(3) int local3 = Static12.anInt360;
			@Pc(5) int local5 = Static12.anInt363;
			@Pc(9) int local9 = Static29.anIntArray132[0];
			@Pc(13) int local13 = Static29.anIntArray140[0];
			@Pc(17) int local17 = Static29.anIntArray132[arg0];
			@Pc(21) int local21 = Static29.anIntArray140[arg0];
			@Pc(25) int local25 = Static29.anIntArray132[arg1];
			@Pc(29) int local29 = Static29.anIntArray140[arg1];
			@Pc(33) int local33 = Static29.anIntArray132[arg2];
			@Pc(37) int local37 = Static29.anIntArray140[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt861; local49++) {
				@Pc(55) int local55 = super.anIntArray108[local49];
				@Pc(60) int local60 = super.anIntArray113[local49];
				@Pc(65) int local65 = super.anIntArray112[local49];
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
				Static29.anIntArray123[local49] = local65 - local47;
				Static29.anIntArray135[local49] = local3 + (local55 << 9) / local65;
				Static29.anIntArray133[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt863 > 0) {
					Static29.anIntArray130[local49] = local55;
					Static29.anIntArray139[local49] = local77;
					Static29.anIntArray129[local49] = local65;
				}
			}
			this.method606(false, false, 0, super.aShort16, super.aShort16 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kf;I)V")
	@Override
	public void method590(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray5 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class22 local12 = arg0.aClass22Array1[arg1];
		@Pc(15) Class2_Sub24 local15 = local12.aClass2_Sub24_1;
		Static29.anInt864 = 0;
		Static29.anInt866 = 0;
		Static29.anInt865 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1047; local23++) {
			@Pc(29) int local29 = local12.anIntArray170[local23];
			this.method601(local15.anIntArray636[local29], local15.anIntArrayArray38[local29], local12.anIntArray169[local23], local12.anIntArray168[local23], local12.anIntArray172[local23]);
		}
		super.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!kf;ILclient!kf;I[I)V")
	@Override
	public void method596(@OriginalArg(0) Class2_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method590(arg0, arg1);
			return;
		}
		@Pc(18) Class22 local18 = arg0.aClass22Array1[arg1];
		@Pc(23) Class22 local23 = arg2.aClass22Array1[arg3];
		@Pc(26) Class2_Sub24 local26 = local18.aClass2_Sub24_1;
		Static29.anInt864 = 0;
		Static29.anInt866 = 0;
		Static29.anInt865 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1047; local41++) {
			local47 = local18.anIntArray170[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray636[local47] == 0) {
				this.method601(local26.anIntArray636[local47], local26.anIntArrayArray38[local47], local18.anIntArray169[local41], local18.anIntArray168[local41], local18.anIntArray172[local41]);
			}
		}
		Static29.anInt864 = 0;
		Static29.anInt866 = 0;
		Static29.anInt865 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1047; local47++) {
			@Pc(112) int local112 = local23.anIntArray170[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray636[local112] == 0) {
				this.method601(local26.anIntArray636[local112], local26.anIntArrayArray38[local112], local23.anIntArray169[local47], local23.anIntArray168[local47], local23.anIntArray172[local47]);
			}
		}
		super.aBoolean45 = false;
	}

	@OriginalMember(owner = "client!da", name = "j", descriptor = "(I)V")
	private void method605(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static12.anInt360;
		@Pc(3) int local3 = Static12.anInt363;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray122[arg0];
		@Pc(15) int local15 = this.anIntArray115[arg0];
		@Pc(20) int local20 = this.anIntArray116[arg0];
		@Pc(24) int local24 = Static29.anIntArray129[local10];
		@Pc(28) int local28 = Static29.anIntArray129[local15];
		@Pc(32) int local32 = Static29.anIntArray129[local20];
		if (this.aByteArray4 == null) {
			Static12.anInt359 = 0;
		} else {
			Static12.anInt359 = this.aByteArray4[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static29.anIntArray128[0] = Static29.anIntArray135[local10];
			Static29.anIntArray134[0] = Static29.anIntArray133[local10];
			local5++;
			Static29.anIntArray126[0] = this.anIntArray119[arg0];
		} else {
			local73 = Static29.anIntArray130[local10];
			local77 = Static29.anIntArray139[local10];
			local82 = this.anIntArray119[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static29.anIntArray125[local32 - local24];
				Static29.anIntArray128[0] = local1 + (local73 + ((Static29.anIntArray130[local20] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[0] = local3 + (local77 + ((Static29.anIntArray139[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static29.anIntArray126[0] = local82 + ((this.anIntArray121[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static29.anIntArray125[local28 - local24];
				Static29.anIntArray128[local5] = local1 + (local73 + ((Static29.anIntArray130[local15] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[local5] = local3 + (local77 + ((Static29.anIntArray139[local15] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray126[local5++] = local82 + ((this.anIntArray118[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static29.anIntArray128[local5] = Static29.anIntArray135[local15];
			Static29.anIntArray134[local5] = Static29.anIntArray133[local15];
			Static29.anIntArray126[local5++] = this.anIntArray118[arg0];
		} else {
			local73 = Static29.anIntArray130[local15];
			local77 = Static29.anIntArray139[local15];
			local82 = this.anIntArray118[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static29.anIntArray125[local24 - local28];
				Static29.anIntArray128[local5] = local1 + (local73 + ((Static29.anIntArray130[local10] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[local5] = local3 + (local77 + ((Static29.anIntArray139[local10] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray126[local5++] = local82 + ((this.anIntArray119[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static29.anIntArray125[local32 - local28];
				Static29.anIntArray128[local5] = local1 + (local73 + ((Static29.anIntArray130[local20] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[local5] = local3 + (local77 + ((Static29.anIntArray139[local20] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray126[local5++] = local82 + ((this.anIntArray121[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static29.anIntArray128[local5] = Static29.anIntArray135[local20];
			Static29.anIntArray134[local5] = Static29.anIntArray133[local20];
			Static29.anIntArray126[local5++] = this.anIntArray121[arg0];
		} else {
			local73 = Static29.anIntArray130[local20];
			local77 = Static29.anIntArray139[local20];
			local82 = this.anIntArray121[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static29.anIntArray125[local28 - local32];
				Static29.anIntArray128[local5] = local1 + (local73 + ((Static29.anIntArray130[local15] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[local5] = local3 + (local77 + ((Static29.anIntArray139[local15] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray126[local5++] = local82 + ((this.anIntArray118[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static29.anIntArray125[local24 - local32];
				Static29.anIntArray128[local5] = local1 + (local73 + ((Static29.anIntArray130[local10] - local73) * local95 >> 16) << 9) / 50;
				Static29.anIntArray134[local5] = local3 + (local77 + ((Static29.anIntArray139[local10] - local77) * local95 >> 16) << 9) / 50;
				Static29.anIntArray126[local5++] = local82 + ((this.anIntArray119[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static29.anIntArray128[0];
		local77 = Static29.anIntArray128[1];
		local82 = Static29.anIntArray128[2];
		local95 = Static29.anIntArray134[0];
		@Pc(590) int local590 = Static29.anIntArray134[1];
		@Pc(594) int local594 = Static29.anIntArray134[2];
		Static12.aBoolean15 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static12.anInt362 || local77 > Static12.anInt362 || local82 > Static12.anInt362) {
				Static12.aBoolean15 = true;
			}
			if (this.aShortArray27 != null && this.aShortArray27[arg0] != -1) {
				if (this.aByteArray6 == null || this.aByteArray6[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray6[arg0] & 0xFF;
					local683 = this.anIntArray117[local678];
					local688 = this.anIntArray114[local678];
					local693 = this.anIntArray120[local678];
				}
				if (this.anIntArray121[arg0] == -1) {
					Static12.method246(local95, local590, local594, local73, local77, local82, this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], this.aShortArray27[arg0]);
				} else {
					Static12.method246(local95, local590, local594, local73, local77, local82, Static29.anIntArray126[0], Static29.anIntArray126[1], Static29.anIntArray126[2], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], this.aShortArray27[arg0]);
				}
			} else if (this.anIntArray121[arg0] == -1) {
				Static12.method250(local95, local590, local594, local73, local77, local82, Static29.anIntArray127[this.anIntArray119[arg0]]);
			} else {
				Static12.method252(local95, local590, local594, local73, local77, local82, Static29.anIntArray126[0], Static29.anIntArray126[1], Static29.anIntArray126[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static12.anInt362 || local77 > Static12.anInt362 || local82 > Static12.anInt362 || Static29.anIntArray128[3] < 0 || Static29.anIntArray128[3] > Static12.anInt362) {
			Static12.aBoolean15 = true;
		}
		if (this.aShortArray27 == null || this.aShortArray27[arg0] == -1) {
			if (this.anIntArray121[arg0] == -1) {
				local683 = Static29.anIntArray127[this.anIntArray119[arg0]];
				Static12.method250(local95, local590, local594, local73, local77, local82, local683);
				Static12.method250(local95, local594, Static29.anIntArray134[3], local73, local82, Static29.anIntArray128[3], local683);
				return;
			}
			Static12.method252(local95, local590, local594, local73, local77, local82, Static29.anIntArray126[0], Static29.anIntArray126[1], Static29.anIntArray126[2]);
			Static12.method252(local95, local594, Static29.anIntArray134[3], local73, local82, Static29.anIntArray128[3], Static29.anIntArray126[0], Static29.anIntArray126[2], Static29.anIntArray126[3]);
			return;
		}
		if (this.aByteArray6 == null || this.aByteArray6[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray6[arg0] & 0xFF;
			local683 = this.anIntArray117[local678];
			local688 = this.anIntArray114[local678];
			local693 = this.anIntArray120[local678];
		}
		@Pc(956) short local956 = this.aShortArray27[arg0];
		if (this.anIntArray121[arg0] == -1) {
			Static12.method246(local95, local590, local594, local73, local77, local82, this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], local956);
			Static12.method246(local95, local594, Static29.anIntArray134[3], local73, local82, Static29.anIntArray128[3], this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], local956);
			return;
		}
		Static12.method246(local95, local590, local594, local73, local77, local82, Static29.anIntArray126[0], Static29.anIntArray126[1], Static29.anIntArray126[2], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], local956);
		Static12.method246(local95, local594, Static29.anIntArray134[3], local73, local82, Static29.anIntArray128[3], Static29.anIntArray126[0], Static29.anIntArray126[2], Static29.anIntArray126[3], Static29.anIntArray130[local683], Static29.anIntArray130[local688], Static29.anIntArray130[local693], Static29.anIntArray139[local683], Static29.anIntArray139[local688], Static29.anIntArray139[local693], Static29.anIntArray129[local683], Static29.anIntArray129[local688], Static29.anIntArray129[local693], local956);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([[IIIIZI)Lclient!cd;")
	@Override
	public Class2_Sub2_Sub1_Sub2 method593(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method592();
		@Pc(6) int local6 = arg1 + super.aShort17;
		@Pc(11) int local11 = arg1 + super.aShort13;
		@Pc(16) int local16 = arg3 + super.aShort12;
		@Pc(21) int local21 = arg3 + super.aShort14;
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
		@Pc(101) Class2_Sub2_Sub1_Sub2_Sub1 local101;
		if (arg4) {
			local101 = new Class2_Sub2_Sub1_Sub2_Sub1();
			local101.anInt861 = super.anInt861;
			local101.anInt859 = super.anInt859;
			local101.anInt863 = this.anInt863;
			local101.anIntArray108 = super.anIntArray108;
			local101.anIntArray112 = super.anIntArray112;
			local101.anIntArray122 = this.anIntArray122;
			local101.anIntArray115 = this.anIntArray115;
			local101.anIntArray116 = this.anIntArray116;
			local101.anIntArray119 = this.anIntArray119;
			local101.anIntArray118 = this.anIntArray118;
			local101.anIntArray121 = this.anIntArray121;
			local101.aByteArray3 = this.aByteArray3;
			local101.aByteArray4 = this.aByteArray4;
			local101.aByteArray6 = this.aByteArray6;
			local101.aShortArray27 = this.aShortArray27;
			local101.aByte2 = this.aByte2;
			local101.anIntArray117 = this.anIntArray117;
			local101.anIntArray114 = this.anIntArray114;
			local101.anIntArray120 = this.anIntArray120;
			local101.anIntArrayArray5 = super.anIntArrayArray5;
			local101.anIntArrayArray6 = super.anIntArrayArray6;
			local101.aBoolean47 = super.aBoolean47;
			local101.anIntArray113 = new int[local101.anInt861];
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
			for (local201 = 0; local201 < local101.anInt861; local201++) {
				local209 = super.anIntArray108[local201] + arg1;
				local216 = super.anIntArray112[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray113[local201] = super.anIntArray113[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt861; local201++) {
				local209 = (super.anIntArray113[local201] << 16) / super.aShort32;
				if (local209 < arg5) {
					local216 = super.anIntArray108[local201] + arg1;
					local220 = super.anIntArray112[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray113[local201] = super.anIntArray113[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray113[local201] = super.anIntArray113[local201];
				}
			}
		}
		super.aBoolean45 = false;
		return local101;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!super.aBoolean45) {
			this.method592();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort18 * arg2 + super.aShort15 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort18 * arg2 + super.aShort32 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort18 << 9;
		if (local78 / local38 <= Static12.anInt358) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort18 << 9;
		if (local91 / local38 >= Static12.anInt361) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort18 * arg1 + super.aShort15 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static12.anInt356) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort18 * arg1 + super.aShort32 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static12.anInt355) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt863 > 0;
		@Pc(172) int local172 = Static12.anInt360;
		@Pc(174) int local174 = Static12.anInt363;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static29.anIntArray132[arg0];
			local178 = Static29.anIntArray140[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(200) int local200;
		@Pc(219) int local219;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(236) int local236;
		if (arg8 > 0 && Static22.aBoolean46) {
			if (local71 > 0) {
				local200 = local91 / local38;
				local204 = local78 / local57;
			} else {
				local200 = local91 / local57;
				local204 = local78 / local38;
			}
			if (local107 > 0) {
				local219 = local146 / local38;
				local223 = local123 / local57;
			} else {
				local219 = local146 / local57;
				local223 = local123 / local38;
			}
			local236 = Static22.anInt862 - Static12.anInt360;
			@Pc(240) int local240 = Static22.anInt860 - Static12.anInt363;
			if (local236 >= local200 && local236 <= local204 && local240 >= local219 && local240 <= local223) {
				local200 = 999999;
				local204 = -999999;
				local219 = 999999;
				local223 = -999999;
				@Pc(303) int[] local303 = new int[] { super.aShort17, super.aShort13, super.aShort17, super.aShort13, super.aShort17, super.aShort13, super.aShort17, super.aShort13 };
				@Pc(346) int[] local346 = new int[] { super.aShort12, super.aShort12, super.aShort14, super.aShort14, super.aShort12, super.aShort12, super.aShort14, super.aShort14 };
				@Pc(389) int[] local389 = new int[] { super.aShort32, super.aShort32, super.aShort32, super.aShort32, super.aShort15, super.aShort15, super.aShort15, super.aShort15 };
				for (@Pc(391) int local391 = 0; local391 < 8; local391++) {
					@Pc(396) int local396 = local303[local391];
					@Pc(400) int local400 = local389[local391];
					@Pc(404) int local404 = local346[local391];
					@Pc(416) int local416;
					if (arg0 != 0) {
						local416 = local404 * local176 + local396 * local178 >> 16;
						local404 = local404 * local178 - local396 * local176 >> 16;
						local396 = local416;
					}
					local396 += arg5;
					local400 += arg6;
					local404 += arg7;
					local416 = local404 * arg3 + local396 * arg4 >> 16;
					local404 = local404 * arg4 - local396 * arg3 >> 16;
					local396 = local416;
					local416 = local400 * arg2 - local404 * arg1 >> 16;
					local404 = local400 * arg1 + local404 * arg2 >> 16;
					if (local404 > 0) {
						@Pc(492) int local492 = (local396 << 9) / local404;
						@Pc(498) int local498 = (local416 << 9) / local404;
						if (local492 < local200) {
							local200 = local492;
						}
						if (local492 > local204) {
							local204 = local492;
						}
						if (local498 < local219) {
							local219 = local498;
						}
						if (local498 > local223) {
							local223 = local498;
						}
					}
				}
				if (local236 >= local200 && local236 <= local204 && local240 >= local219 && local240 <= local223) {
					if (super.aBoolean47) {
						Static22.anIntArray111[Static22.anInt858++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local200 = 0; local200 < super.anInt861; local200++) {
			local219 = super.anIntArray108[local200];
			local204 = super.anIntArray113[local200];
			local223 = super.anIntArray112[local200];
			if (arg0 != 0) {
				local236 = local223 * local176 + local219 * local178 >> 16;
				local223 = local223 * local178 - local219 * local176 >> 16;
				local219 = local236;
			}
			local219 += arg5;
			local204 += arg6;
			local223 += arg7;
			local236 = local223 * arg3 + local219 * arg4 >> 16;
			local223 = local223 * arg4 - local219 * arg3 >> 16;
			local219 = local236;
			local236 = local204 * arg2 - local223 * arg1 >> 16;
			local223 = local204 * arg1 + local223 * arg2 >> 16;
			Static29.anIntArray123[local200] = local223 - local24;
			if (local223 >= 50) {
				Static29.anIntArray135[local200] = local172 + (local219 << 9) / local223;
				Static29.anIntArray133[local200] = local174 + (local236 << 9) / local223;
			} else {
				Static29.anIntArray135[local200] = -5000;
				local154 = true;
			}
			if (local170) {
				Static29.anIntArray130[local200] = local219;
				Static29.anIntArray139[local200] = local236;
				Static29.anIntArray129[local200] = local223;
			}
		}
		try {
			this.method606(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(716) Exception local716) {
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZIII)V")
	private void method606(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static29.anIntArray131[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt859; local16++) {
			if (this.anIntArray121[local16] != -2) {
				local28 = this.anIntArray122[local16];
				local33 = this.anIntArray115[local16];
				local38 = this.anIntArray116[local16];
				local42 = Static29.anIntArray135[local28];
				local46 = Static29.anIntArray135[local33];
				local50 = Static29.anIntArray135[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static29.anIntArray130[local28];
					local69 = Static29.anIntArray130[local33];
					@Pc(73) int local73 = Static29.anIntArray130[local38];
					@Pc(77) int local77 = Static29.anIntArray139[local28];
					local81 = Static29.anIntArray139[local33];
					local85 = Static29.anIntArray139[local38];
					@Pc(89) int local89 = Static29.anIntArray129[local28];
					local93 = Static29.anIntArray129[local33];
					@Pc(97) int local97 = Static29.anIntArray129[local38];
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
						Static29.aBooleanArray2[local16] = true;
						@Pc(177) int local177 = (Static29.anIntArray123[local28] + Static29.anIntArray123[local33] + Static29.anIntArray123[local38]) / 3 + arg3;
						Static29.anIntArrayArray7[local177][Static29.anIntArray131[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method603(Static22.anInt862, Static22.anInt860, Static29.anIntArray133[local28], Static29.anIntArray133[local33], Static29.anIntArray133[local38], local42, local46, local50)) {
						Static22.anIntArray111[Static22.anInt858++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static29.anIntArray133[local38] - Static29.anIntArray133[local33]) - (Static29.anIntArray133[local28] - Static29.anIntArray133[local33]) * (local50 - local46) > 0) {
						Static29.aBooleanArray2[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static12.anInt362 && local46 <= Static12.anInt362 && local50 <= Static12.anInt362) {
							Static29.aBooleanArray3[local16] = false;
						} else {
							Static29.aBooleanArray3[local16] = true;
						}
						local65 = (Static29.anIntArray123[local28] + Static29.anIntArray123[local33] + Static29.anIntArray123[local38]) / 3 + arg3;
						Static29.anIntArrayArray7[local65][Static29.anIntArray131[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray3 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static29.anIntArray131[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static29.anIntArrayArray7[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method607(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static29.anIntArray138[local28] = 0;
			Static29.anIntArray124[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static29.anIntArray131[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static29.anIntArrayArray7[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray3[local50];
					local69 = Static29.anIntArray138[local382]++;
					Static29.anIntArrayArray8[local382][local69] = local50;
					if (local382 < 10) {
						Static29.anIntArray124[local382] += local33;
					} else if (local382 == 10) {
						Static29.anIntArray137[local69] = local33;
					} else {
						Static29.anIntArray136[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static29.anIntArray138[1] > 0 || Static29.anIntArray138[2] > 0) {
			local38 = (Static29.anIntArray124[1] + Static29.anIntArray124[2]) / (Static29.anIntArray138[1] + Static29.anIntArray138[2]);
		}
		local42 = 0;
		if (Static29.anIntArray138[3] > 0 || Static29.anIntArray138[4] > 0) {
			local42 = (Static29.anIntArray124[3] + Static29.anIntArray124[4]) / (Static29.anIntArray138[3] + Static29.anIntArray138[4]);
		}
		local46 = 0;
		if (Static29.anIntArray138[6] > 0 || Static29.anIntArray138[8] > 0) {
			local46 = (Static29.anIntArray124[6] + Static29.anIntArray124[8]) / (Static29.anIntArray138[6] + Static29.anIntArray138[8]);
		}
		local65 = 0;
		local69 = Static29.anIntArray138[10];
		@Pc(515) int[] local515 = Static29.anIntArrayArray8[10];
		@Pc(517) int[] local517 = Static29.anIntArray137;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static29.anIntArray138[11];
			local515 = Static29.anIntArrayArray8[11];
			local517 = Static29.anIntArray136;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method607(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static29.anIntArray138[11];
					local515 = Static29.anIntArrayArray8[11];
					local517 = Static29.anIntArray136;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method607(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static29.anIntArray138[11];
					local515 = Static29.anIntArrayArray8[11];
					local517 = Static29.anIntArray136;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method607(local515[local65++]);
				if (local65 == local69 && local515 != Static29.anIntArrayArray8[11]) {
					local65 = 0;
					local69 = Static29.anIntArray138[11];
					local515 = Static29.anIntArrayArray8[11];
					local517 = Static29.anIntArray136;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static29.anIntArray138[local81];
			@Pc(680) int[] local680 = Static29.anIntArrayArray8[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method607(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method607(local515[local65++]);
			if (local65 == local69 && local515 != Static29.anIntArrayArray8[11]) {
				local65 = 0;
				local515 = Static29.anIntArrayArray8[11];
				local69 = Static29.anIntArray138[11];
				local517 = Static29.anIntArray136;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "k", descriptor = "(I)V")
	private void method607(@OriginalArg(0) int arg0) {
		if (Static29.aBooleanArray2[arg0]) {
			this.method605(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray122[arg0];
		@Pc(17) int local17 = this.anIntArray115[arg0];
		@Pc(22) int local22 = this.anIntArray116[arg0];
		Static12.aBoolean15 = Static29.aBooleanArray3[arg0];
		if (this.aByteArray4 == null) {
			Static12.anInt359 = 0;
		} else {
			Static12.anInt359 = this.aByteArray4[arg0] & 0xFF;
		}
		if (this.aShortArray27 != null && this.aShortArray27[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray6 == null || this.aByteArray6[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray6[arg0] & 0xFF;
				local133 = this.anIntArray117[local128];
				local138 = this.anIntArray114[local128];
				local143 = this.anIntArray120[local128];
			}
			if (this.anIntArray121[arg0] == -1) {
				Static12.method246(Static29.anIntArray133[local12], Static29.anIntArray133[local17], Static29.anIntArray133[local22], Static29.anIntArray135[local12], Static29.anIntArray135[local17], Static29.anIntArray135[local22], this.anIntArray119[arg0], this.anIntArray119[arg0], this.anIntArray119[arg0], Static29.anIntArray130[local133], Static29.anIntArray130[local138], Static29.anIntArray130[local143], Static29.anIntArray139[local133], Static29.anIntArray139[local138], Static29.anIntArray139[local143], Static29.anIntArray129[local133], Static29.anIntArray129[local138], Static29.anIntArray129[local143], this.aShortArray27[arg0]);
			} else {
				Static12.method246(Static29.anIntArray133[local12], Static29.anIntArray133[local17], Static29.anIntArray133[local22], Static29.anIntArray135[local12], Static29.anIntArray135[local17], Static29.anIntArray135[local22], this.anIntArray119[arg0], this.anIntArray118[arg0], this.anIntArray121[arg0], Static29.anIntArray130[local133], Static29.anIntArray130[local138], Static29.anIntArray130[local143], Static29.anIntArray139[local133], Static29.anIntArray139[local138], Static29.anIntArray139[local143], Static29.anIntArray129[local133], Static29.anIntArray129[local138], Static29.anIntArray129[local143], this.aShortArray27[arg0]);
			}
		} else if (this.anIntArray121[arg0] == -1) {
			Static12.method250(Static29.anIntArray133[local12], Static29.anIntArray133[local17], Static29.anIntArray133[local22], Static29.anIntArray135[local12], Static29.anIntArray135[local17], Static29.anIntArray135[local22], Static29.anIntArray127[this.anIntArray119[arg0]]);
		} else {
			Static12.method252(Static29.anIntArray133[local12], Static29.anIntArray133[local17], Static29.anIntArray133[local22], Static29.anIntArray135[local12], Static29.anIntArray135[local17], Static29.anIntArray135[local22], this.anIntArray119[arg0], this.anIntArray118[arg0], this.anIntArray121[arg0]);
		}
	}
}
