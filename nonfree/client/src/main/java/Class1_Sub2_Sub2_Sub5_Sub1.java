import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub2_Sub2_Sub5_Sub1 extends Class1_Sub2_Sub2_Sub5 {

	@OriginalMember(owner = "client!sg", name = "vb", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!sg", name = "wb", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!sg", name = "xb", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!sg", name = "yb", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!sg", name = "zb", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!sg", name = "Bb", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!sg", name = "Cb", descriptor = "[I")
	private int[] anIntArray402;

	@OriginalMember(owner = "client!sg", name = "Db", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!sg", name = "Fb", descriptor = "[I")
	private int[] anIntArray404;

	@OriginalMember(owner = "client!sg", name = "Gb", descriptor = "[I")
	private int[] anIntArray405;

	@OriginalMember(owner = "client!sg", name = "Ib", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!sg", name = "Kb", descriptor = "[I")
	private int[] anIntArray406;

	@OriginalMember(owner = "client!sg", name = "Mb", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!sg", name = "Hb", descriptor = "I")
	private int anInt3752 = 0;

	@OriginalMember(owner = "client!sg", name = "Eb", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub2_Sub5_Sub1() {
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!be;IIIII)V")
	public Class1_Sub2_Sub2_Sub5_Sub1(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method507();
		arg0.method502();
		super.anInt3747 = arg0.anInt465;
		super.anIntArray397 = arg0.anIntArray61;
		super.anIntArray394 = arg0.anIntArray69;
		super.anIntArray396 = arg0.anIntArray70;
		super.anInt3750 = arg0.anInt467;
		this.anIntArray402 = arg0.anIntArray72;
		this.anIntArray406 = arg0.anIntArray64;
		this.anIntArray399 = arg0.anIntArray71;
		this.aByteArray39 = arg0.aByteArray13;
		this.aByteArray41 = arg0.aByteArray15;
		this.aByte9 = arg0.aByte1;
		super.anIntArrayArray32 = arg0.anIntArrayArray5;
		super.anIntArrayArray33 = arg0.anIntArrayArray6;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray400 = new int[super.anInt3750];
		this.anIntArray398 = new int[super.anInt3750];
		this.anIntArray405 = new int[super.anInt3750];
		@Pc(109) int local109;
		if (arg0.aShortArray6 == null) {
			this.aShortArray43 = null;
		} else {
			this.aShortArray43 = new short[super.anInt3750];
			for (local109 = 0; local109 < super.anInt3750; local109++) {
				@Pc(115) short local115 = arg0.aShortArray6[local109];
				if (local115 != -1 && Static9.anInterface3_1.method2052(local115)) {
					this.aShortArray43[local109] = local115;
				} else {
					this.aShortArray43[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt466 > 0 && arg0.aByteArray9 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt466];
			for (@Pc(155) int local155 = 0; local155 < super.anInt3750; local155++) {
				if (arg0.aByteArray9[local155] != -1) {
					local153[arg0.aByteArray9[local155] & 0xFF]++;
				}
			}
			this.anInt3752 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt466; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray8[local184] == 0) {
					this.anInt3752++;
				}
			}
			this.anIntArray403 = new int[this.anInt3752];
			this.anIntArray404 = new int[this.anInt3752];
			this.anIntArray401 = new int[this.anInt3752];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt466; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray8[local224] == 0) {
					this.anIntArray403[local222] = arg0.aShortArray2[local224] & 0xFFFF;
					this.anIntArray404[local222] = arg0.aShortArray5[local224] & 0xFFFF;
					this.anIntArray401[local222] = arg0.aShortArray8[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray38 = new byte[super.anInt3750];
			for (local286 = 0; local286 < super.anInt3750; local286++) {
				if (arg0.aByteArray9[local286] == -1) {
					this.aByteArray38[local286] = -1;
				} else {
					this.aByteArray38[local286] = (byte) local153[arg0.aByteArray9[local286] & 0xFF];
					if (this.aByteArray38[local286] == -1 && this.aShortArray43 != null) {
						this.aShortArray43[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt3750; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray14 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray14[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray15 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray15[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray43 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray43[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class89 local408;
			@Pc(569) Class29 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray7[local109] & 0xFFFF;
					if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray402[local109]] == null) {
						local408 = arg0.aClass89Array1[this.anIntArray402[local109]];
					} else {
						local408 = arg0.aClass89Array2[this.anIntArray402[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
					this.anIntArray400[local109] = Static158.method2729(local389, local286);
					if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray406[local109]] == null) {
						local408 = arg0.aClass89Array1[this.anIntArray406[local109]];
					} else {
						local408 = arg0.aClass89Array2[this.anIntArray406[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
					this.anIntArray398[local109] = Static158.method2729(local389, local286);
					if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray399[local109]] == null) {
						local408 = arg0.aClass89Array1[this.anIntArray399[local109]];
					} else {
						local408 = arg0.aClass89Array2[this.anIntArray399[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
					this.anIntArray405[local109] = Static158.method2729(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass29Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt1945 + arg4 * local569.anInt1947 + arg5 * local569.anInt1946) / (local84 + local84 / 2);
					this.anIntArray400[local109] = Static158.method2729(arg0.aShortArray7[local109] & 0xFFFF, local286);
					this.anIntArray405[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray400[local109] = 128;
					this.anIntArray405[local109] = -1;
				} else {
					this.anIntArray405[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray402[local109]] == null) {
					local408 = arg0.aClass89Array1[this.anIntArray402[local109]];
				} else {
					local408 = arg0.aClass89Array2[this.anIntArray402[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
				this.anIntArray400[local109] = Static158.method2734(local286);
				if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray406[local109]] == null) {
					local408 = arg0.aClass89Array1[this.anIntArray406[local109]];
				} else {
					local408 = arg0.aClass89Array2[this.anIntArray406[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
				this.anIntArray398[local109] = Static158.method2734(local286);
				if (arg0.aClass89Array2 == null || arg0.aClass89Array2[this.anIntArray399[local109]] == null) {
					local408 = arg0.aClass89Array1[this.anIntArray399[local109]];
				} else {
					local408 = arg0.aClass89Array2[this.anIntArray399[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt3999 + arg4 * local408.anInt4002 + arg5 * local408.anInt4000) / (local84 * local408.anInt4001);
				this.anIntArray405[local109] = Static158.method2734(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass29Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt1945 + arg4 * local569.anInt1947 + arg5 * local569.anInt1946) / (local84 + local84 / 2);
				this.anIntArray400[local109] = Static158.method2734(local286);
				this.anIntArray405[local109] = -1;
			} else {
				this.anIntArray405[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([Lclient!sg;I)V")
	private Class1_Sub2_Sub2_Sub5_Sub1(@OriginalArg(0) Class1_Sub2_Sub2_Sub5_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt3747 = 0;
		super.anInt3750 = 0;
		this.anInt3752 = 0;
		this.aByte9 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class1_Sub2_Sub2_Sub5_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt3747 += local34.anInt3747;
				super.anInt3750 += local34.anInt3750;
				this.anInt3752 += local34.anInt3752;
				if (local34.aByteArray39 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local34.aByte9;
					}
					if (this.aByte9 != local34.aByte9) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray41 != null;
				local13 |= local34.aShortArray43 != null;
				local15 |= local34.aByteArray38 != null;
			}
		}
		super.anIntArray397 = new int[super.anInt3747];
		super.anIntArray394 = new int[super.anInt3747];
		super.anIntArray396 = new int[super.anInt3747];
		this.anIntArray402 = new int[super.anInt3750];
		this.anIntArray406 = new int[super.anInt3750];
		this.anIntArray399 = new int[super.anInt3750];
		this.anIntArray400 = new int[super.anInt3750];
		this.anIntArray398 = new int[super.anInt3750];
		this.anIntArray405 = new int[super.anInt3750];
		if (local9) {
			this.aByteArray39 = new byte[super.anInt3750];
		}
		if (local11) {
			this.aByteArray41 = new byte[super.anInt3750];
		}
		if (local13) {
			this.aShortArray43 = new short[super.anInt3750];
		}
		if (local15) {
			this.aByteArray38 = new byte[super.anInt3750];
		}
		if (this.anInt3752 > 0) {
			this.anIntArray403 = new int[this.anInt3752];
			this.anIntArray404 = new int[this.anInt3752];
			this.anIntArray401 = new int[this.anInt3752];
		}
		super.anInt3747 = 0;
		super.anInt3750 = 0;
		this.anInt3752 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class1_Sub2_Sub2_Sub5_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt3750; local220++) {
					this.anIntArray402[super.anInt3750] = local216.anIntArray402[local220] + super.anInt3747;
					this.anIntArray406[super.anInt3750] = local216.anIntArray406[local220] + super.anInt3747;
					this.anIntArray399[super.anInt3750] = local216.anIntArray399[local220] + super.anInt3747;
					this.anIntArray400[super.anInt3750] = local216.anIntArray400[local220];
					this.anIntArray398[super.anInt3750] = local216.anIntArray398[local220];
					this.anIntArray405[super.anInt3750] = local216.anIntArray405[local220];
					if (local9) {
						if (local216.aByteArray39 == null) {
							this.aByteArray39[super.anInt3750] = local216.aByte9;
						} else {
							this.aByteArray39[super.anInt3750] = local216.aByteArray39[local220];
						}
					}
					if (local11 && local216.aByteArray41 != null) {
						this.aByteArray41[super.anInt3750] = local216.aByteArray41[local220];
					}
					if (local13) {
						if (local216.aShortArray43 == null) {
							this.aShortArray43[super.anInt3750] = -1;
						} else {
							this.aShortArray43[super.anInt3750] = local216.aShortArray43[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray38 == null || local216.aByteArray38[local220] == -1) {
							this.aByteArray38[super.anInt3750] = -1;
						} else {
							this.aByteArray38[super.anInt3750] = (byte) (local216.aByteArray38[local220] + this.anInt3752);
						}
					}
					super.anInt3750++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt3752; local385++) {
					this.anIntArray403[this.anInt3752] = local216.anIntArray403[local385] + super.anInt3747;
					this.anIntArray404[this.anInt3752] = local216.anIntArray404[local385] + super.anInt3747;
					this.anIntArray401[this.anInt3752] = local216.anIntArray401[local385] + super.anInt3747;
					this.anInt3752++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt3747; local435++) {
					super.anIntArray397[super.anInt3747] = local216.anIntArray397[local435];
					super.anIntArray394[super.anInt3747] = local216.anIntArray394[local435];
					super.anIntArray396[super.anInt3747] = local216.anIntArray396[local435];
					super.anInt3747++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLclient!sg;[B)Lclient!sg;")
	private Class1_Sub2_Sub2_Sub5_Sub1 method2727(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub5_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3747 = super.anInt3747;
		arg1.anInt3750 = super.anInt3750;
		arg1.anInt3752 = this.anInt3752;
		if (arg1.anIntArray397 == null || arg1.anIntArray397.length < super.anInt3747) {
			arg1.anIntArray397 = new int[super.anInt3747 + 100];
			arg1.anIntArray394 = new int[super.anInt3747 + 100];
			arg1.anIntArray396 = new int[super.anInt3747 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt3747; local43++) {
			arg1.anIntArray397[local43] = super.anIntArray397[local43];
			arg1.anIntArray394[local43] = super.anIntArray394[local43];
			arg1.anIntArray396[local43] = super.anIntArray396[local43];
		}
		if (arg0) {
			arg1.aByteArray41 = this.aByteArray41;
		} else {
			arg1.aByteArray41 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray41 == null) {
				for (local88 = 0; local88 < super.anInt3750; local88++) {
					arg1.aByteArray41[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt3750; local88++) {
					arg1.aByteArray41[local88] = this.aByteArray41[local88];
				}
			}
		}
		arg1.anIntArray402 = this.anIntArray402;
		arg1.anIntArray406 = this.anIntArray406;
		arg1.anIntArray399 = this.anIntArray399;
		arg1.anIntArray400 = this.anIntArray400;
		arg1.anIntArray398 = this.anIntArray398;
		arg1.anIntArray405 = this.anIntArray405;
		arg1.aByteArray39 = this.aByteArray39;
		arg1.aByteArray38 = this.aByteArray38;
		arg1.aShortArray43 = this.aShortArray43;
		arg1.aByte9 = this.aByte9;
		arg1.anIntArray403 = this.anIntArray403;
		arg1.anIntArray404 = this.anIntArray404;
		arg1.anIntArray401 = this.anIntArray401;
		arg1.anIntArrayArray32 = super.anIntArrayArray32;
		arg1.anIntArrayArray33 = super.anIntArrayArray33;
		arg1.aBoolean287 = super.aBoolean287;
		arg1.aBoolean286 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZJII)V")
	private void method2728(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static158.anIntArray407[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt3750; local16++) {
			if (this.anIntArray405[local16] != -2) {
				local28 = this.anIntArray402[local16];
				local33 = this.anIntArray406[local16];
				local38 = this.anIntArray399[local16];
				local42 = Static158.anIntArray413[local28];
				local46 = Static158.anIntArray413[local33];
				local50 = Static158.anIntArray413[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static158.anIntArray419[local28];
					local69 = Static158.anIntArray419[local33];
					@Pc(73) int local73 = Static158.anIntArray419[local38];
					@Pc(77) int local77 = Static158.anIntArray422[local28];
					local81 = Static158.anIntArray422[local33];
					local85 = Static158.anIntArray422[local38];
					@Pc(89) int local89 = Static158.anIntArray411[local28];
					local93 = Static158.anIntArray411[local33];
					@Pc(97) int local97 = Static158.anIntArray411[local38];
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
						Static158.aBooleanArray49[local16] = true;
						@Pc(177) int local177 = (Static158.anIntArray412[local28] + Static158.anIntArray412[local33] + Static158.anIntArray412[local38]) / 3 + arg3;
						Static158.anIntArrayArray34[local177][Static158.anIntArray407[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2732(Static72.anInt3751, Static72.anInt3749, Static158.anIntArray421[local28], Static158.anIntArray421[local33], Static158.anIntArray421[local38], local42, local46, local50)) {
						Static72.aLongArray9[Static72.anInt3748++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static158.anIntArray421[local38] - Static158.anIntArray421[local33]) - (Static158.anIntArray421[local28] - Static158.anIntArray421[local33]) * (local50 - local46) > 0) {
						Static158.aBooleanArray49[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static9.anInt334 && local46 <= Static9.anInt334 && local50 <= Static9.anInt334) {
							Static158.aBooleanArray50[local16] = false;
						} else {
							Static158.aBooleanArray50[local16] = true;
						}
						local65 = (Static158.anIntArray412[local28] + Static158.anIntArray412[local33] + Static158.anIntArray412[local38]) / 3 + arg3;
						Static158.anIntArrayArray34[local65][Static158.anIntArray407[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray39 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static158.anIntArray407[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static158.anIntArrayArray34[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2733(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static158.anIntArray409[local28] = 0;
			Static158.anIntArray420[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static158.anIntArray407[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static158.anIntArrayArray34[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray39[local50];
					local69 = Static158.anIntArray409[local382]++;
					Static158.anIntArrayArray35[local382][local69] = local50;
					if (local382 < 10) {
						Static158.anIntArray420[local382] += local33;
					} else if (local382 == 10) {
						Static158.anIntArray416[local69] = local33;
					} else {
						Static158.anIntArray414[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static158.anIntArray409[1] > 0 || Static158.anIntArray409[2] > 0) {
			local38 = (Static158.anIntArray420[1] + Static158.anIntArray420[2]) / (Static158.anIntArray409[1] + Static158.anIntArray409[2]);
		}
		local42 = 0;
		if (Static158.anIntArray409[3] > 0 || Static158.anIntArray409[4] > 0) {
			local42 = (Static158.anIntArray420[3] + Static158.anIntArray420[4]) / (Static158.anIntArray409[3] + Static158.anIntArray409[4]);
		}
		local46 = 0;
		if (Static158.anIntArray409[6] > 0 || Static158.anIntArray409[8] > 0) {
			local46 = (Static158.anIntArray420[6] + Static158.anIntArray420[8]) / (Static158.anIntArray409[6] + Static158.anIntArray409[8]);
		}
		local65 = 0;
		local69 = Static158.anIntArray409[10];
		@Pc(515) int[] local515 = Static158.anIntArrayArray35[10];
		@Pc(517) int[] local517 = Static158.anIntArray416;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static158.anIntArray409[11];
			local515 = Static158.anIntArrayArray35[11];
			local517 = Static158.anIntArray414;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2733(local515[local65++]);
				if (local65 == local69 && local515 != Static158.anIntArrayArray35[11]) {
					local65 = 0;
					local69 = Static158.anIntArray409[11];
					local515 = Static158.anIntArrayArray35[11];
					local517 = Static158.anIntArray414;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2733(local515[local65++]);
				if (local65 == local69 && local515 != Static158.anIntArrayArray35[11]) {
					local65 = 0;
					local69 = Static158.anIntArray409[11];
					local515 = Static158.anIntArrayArray35[11];
					local517 = Static158.anIntArray414;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2733(local515[local65++]);
				if (local65 == local69 && local515 != Static158.anIntArrayArray35[11]) {
					local65 = 0;
					local69 = Static158.anIntArray409[11];
					local515 = Static158.anIntArrayArray35[11];
					local517 = Static158.anIntArray414;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static158.anIntArray409[local81];
			@Pc(680) int[] local680 = Static158.anIntArrayArray35[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2733(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2733(local515[local65++]);
			if (local65 == local69 && local515 != Static158.anIntArrayArray35[11]) {
				local65 = 0;
				local515 = Static158.anIntArrayArray35[11];
				local69 = Static158.anIntArray409[11];
				local517 = Static158.anIntArray414;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)Lclient!ia;")
	@Override
	public Class1_Sub2_Sub2_Sub5 method2721(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static158.aByteArray40.length < super.anInt3750) {
			Static158.aByteArray40 = new byte[super.anInt3750 + 100];
		}
		return this.method2727(arg0, Static158.aClass1_Sub2_Sub2_Sub5_Sub1_1, Static158.aByteArray40);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method2725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method2714();
			@Pc(3) int local3 = Static9.anInt332;
			@Pc(5) int local5 = Static9.anInt333;
			@Pc(9) int local9 = Static158.anIntArray408[0];
			@Pc(13) int local13 = Static158.anIntArray418[0];
			@Pc(17) int local17 = Static158.anIntArray408[arg0];
			@Pc(21) int local21 = Static158.anIntArray418[arg0];
			@Pc(25) int local25 = Static158.anIntArray408[arg1];
			@Pc(29) int local29 = Static158.anIntArray418[arg1];
			@Pc(33) int local33 = Static158.anIntArray408[arg2];
			@Pc(37) int local37 = Static158.anIntArray418[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3747; local49++) {
				@Pc(55) int local55 = super.anIntArray397[local49];
				@Pc(60) int local60 = super.anIntArray394[local49];
				@Pc(65) int local65 = super.anIntArray396[local49];
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
				Static158.anIntArray412[local49] = local65 - local47;
				Static158.anIntArray413[local49] = local3 + (local55 << 9) / arg6;
				Static158.anIntArray421[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt3752 > 0) {
					Static158.anIntArray419[local49] = local55;
					Static158.anIntArray422[local49] = local77;
					Static158.anIntArray411[local49] = local65;
				}
			}
			this.method2728(false, false, 0L, super.aShort28, super.aShort28 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!f;ILclient!f;I[I)V")
	@Override
	public void method2722(@OriginalArg(0) Class1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2720(arg0, arg1);
			return;
		}
		@Pc(18) Class48 local18 = arg0.aClass48Array1[arg1];
		@Pc(23) Class48 local23 = arg2.aClass48Array1[arg3];
		@Pc(26) Class1_Sub3 local26 = local18.aClass1_Sub3_1;
		Static158.anInt3755 = 0;
		Static158.anInt3754 = 0;
		Static158.anInt3753 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2785; local41++) {
			@Pc(47) short local47 = local18.aShortArray27[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray27[local47] == 0) {
				if (local18.aShortArray28[local41] != -1) {
					this.method2735(0, local26.anIntArrayArray2[local18.aShortArray28[local41]], 0, 0, 0);
				}
				this.method2735(local26.anIntArray27[local47], local26.anIntArrayArray2[local47], local18.aShortArray26[local41], local18.aShortArray30[local41], local18.aShortArray29[local41]);
			}
		}
		Static158.anInt3755 = 0;
		Static158.anInt3754 = 0;
		Static158.anInt3753 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2785; local125++) {
			@Pc(131) short local131 = local23.aShortArray27[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray27[local131] == 0) {
				if (local23.aShortArray28[local125] != -1) {
					this.method2735(0, local26.anIntArrayArray2[local23.aShortArray28[local125]], 0, 0, 0);
				}
				this.method2735(local26.anIntArray27[local131], local26.anIntArrayArray2[local131], local23.aShortArray26[local125], local23.aShortArray30[local125], local23.aShortArray29[local125]);
			}
		}
		super.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!f;I)V")
	@Override
	public void method2720(@OriginalArg(0) Class1_Sub2_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray32 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class48 local12 = arg0.aClass48Array1[arg1];
		@Pc(15) Class1_Sub3 local15 = local12.aClass1_Sub3_1;
		Static158.anInt3755 = 0;
		Static158.anInt3754 = 0;
		Static158.anInt3753 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2785; local23++) {
			@Pc(29) short local29 = local12.aShortArray27[local23];
			if (local12.aShortArray28[local23] != -1) {
				this.method2735(0, local15.anIntArrayArray2[local12.aShortArray28[local23]], 0, 0, 0);
			}
			this.method2735(local15.anIntArray27[local29], local15.anIntArrayArray2[local29], local12.aShortArray26[local23], local12.aShortArray30[local23], local12.aShortArray29[local23]);
		}
		super.aBoolean286 = false;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lclient!ia;")
	@Override
	public Class1_Sub2_Sub2_Sub5 method2713(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static158.aByteArray42.length < super.anInt3750) {
			Static158.aByteArray42 = new byte[super.anInt3750 + 100];
		}
		return this.method2727(arg0, Static158.aClass1_Sub2_Sub2_Sub5_Sub1_2, Static158.aByteArray42);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2723(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method2714();
			@Pc(3) int local3 = Static9.anInt332;
			@Pc(5) int local5 = Static9.anInt333;
			@Pc(9) int local9 = Static158.anIntArray408[0];
			@Pc(13) int local13 = Static158.anIntArray418[0];
			@Pc(17) int local17 = Static158.anIntArray408[arg0];
			@Pc(21) int local21 = Static158.anIntArray418[arg0];
			@Pc(25) int local25 = Static158.anIntArray408[arg1];
			@Pc(29) int local29 = Static158.anIntArray418[arg1];
			@Pc(33) int local33 = Static158.anIntArray408[arg2];
			@Pc(37) int local37 = Static158.anIntArray418[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3747; local49++) {
				@Pc(55) int local55 = super.anIntArray397[local49];
				@Pc(60) int local60 = super.anIntArray394[local49];
				@Pc(65) int local65 = super.anIntArray396[local49];
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
				Static158.anIntArray412[local49] = local65 - local47;
				Static158.anIntArray413[local49] = local3 + (local55 << 9) / local65;
				Static158.anIntArray421[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt3752 > 0) {
					Static158.anIntArray419[local49] = local55;
					Static158.anIntArray422[local49] = local77;
					Static158.anIntArray411[local49] = local65;
				}
			}
			this.method2728(false, false, 0L, super.aShort28, super.aShort28 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean286) {
			this.method2714();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort34 * arg2 + super.aShort32 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort34 * arg2 + super.aShort27 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort34 << 9;
		if (local78 / local38 <= Static9.anInt329) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort34 << 9;
		if (local91 / local38 >= Static9.anInt335) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort34 * arg1 + super.aShort32 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static9.anInt336) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort34 * arg1 + super.aShort27 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static9.anInt337) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3752 > 0;
		@Pc(172) int local172 = Static9.anInt332;
		@Pc(174) int local174 = Static9.anInt333;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static158.anIntArray408[arg0];
			local178 = Static158.anIntArray418[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static72.aBoolean285 && local57 > 0) {
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
			local240 = Static72.anInt3751 - Static9.anInt332;
			@Pc(244) int local244 = Static72.anInt3749 - Static9.anInt333;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort29, super.aShort30, super.aShort29, super.aShort30, super.aShort29, super.aShort30, super.aShort29, super.aShort30 };
				@Pc(350) int[] local350 = new int[] { super.aShort33, super.aShort33, super.aShort31, super.aShort31, super.aShort33, super.aShort33, super.aShort31, super.aShort31 };
				@Pc(393) int[] local393 = new int[] { super.aShort27, super.aShort27, super.aShort27, super.aShort27, super.aShort32, super.aShort32, super.aShort32, super.aShort32 };
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
					if (super.aBoolean287) {
						Static72.aLongArray9[Static72.anInt3748++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt3747; local204++) {
			local223 = super.anIntArray397[local204];
			local208 = super.anIntArray394[local204];
			local227 = super.anIntArray396[local204];
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
			Static158.anIntArray412[local204] = local227 - local24;
			if (local227 >= 50) {
				Static158.anIntArray413[local204] = local172 + (local223 << 9) / local227;
				Static158.anIntArray421[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static158.anIntArray413[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static158.anIntArray419[local204] = local223;
				Static158.anIntArray422[local204] = local240;
				Static158.anIntArray411[local204] = local227;
			}
		}
		try {
			this.method2728(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ia;)Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 method2731(@OriginalArg(0) Class1_Sub2_Sub2_Sub5 arg0) {
		return new Class1_Sub2_Sub2_Sub5_Sub1(new Class1_Sub2_Sub2_Sub5_Sub1[] { this, (Class1_Sub2_Sub2_Sub5_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([[IIIIZI)Lclient!ia;")
	@Override
	public Class1_Sub2_Sub2_Sub5 method2712(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2714();
		@Pc(6) int local6 = arg1 + super.aShort29;
		@Pc(11) int local11 = arg1 + super.aShort30;
		@Pc(16) int local16 = arg3 + super.aShort33;
		@Pc(21) int local21 = arg3 + super.aShort31;
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
		@Pc(101) Class1_Sub2_Sub2_Sub5_Sub1 local101;
		if (arg4) {
			local101 = new Class1_Sub2_Sub2_Sub5_Sub1();
			local101.anInt3747 = super.anInt3747;
			local101.anInt3750 = super.anInt3750;
			local101.anInt3752 = this.anInt3752;
			local101.anIntArray397 = super.anIntArray397;
			local101.anIntArray396 = super.anIntArray396;
			local101.anIntArray402 = this.anIntArray402;
			local101.anIntArray406 = this.anIntArray406;
			local101.anIntArray399 = this.anIntArray399;
			local101.anIntArray400 = this.anIntArray400;
			local101.anIntArray398 = this.anIntArray398;
			local101.anIntArray405 = this.anIntArray405;
			local101.aByteArray39 = this.aByteArray39;
			local101.aByteArray41 = this.aByteArray41;
			local101.aByteArray38 = this.aByteArray38;
			local101.aShortArray43 = this.aShortArray43;
			local101.aByte9 = this.aByte9;
			local101.anIntArray403 = this.anIntArray403;
			local101.anIntArray404 = this.anIntArray404;
			local101.anIntArray401 = this.anIntArray401;
			local101.anIntArrayArray32 = super.anIntArrayArray32;
			local101.anIntArrayArray33 = super.anIntArrayArray33;
			local101.aBoolean287 = super.aBoolean287;
			local101.anIntArray394 = new int[local101.anInt3747];
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
			for (local201 = 0; local201 < local101.anInt3747; local201++) {
				local209 = super.anIntArray397[local201] + arg1;
				local216 = super.anIntArray396[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray394[local201] = super.anIntArray394[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt3747; local201++) {
				local209 = (super.anIntArray394[local201] << 16) / super.aShort27;
				if (local209 < arg5) {
					local216 = super.anIntArray397[local201] + arg1;
					local220 = super.anIntArray396[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray394[local201] = super.anIntArray394[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray394[local201] = super.anIntArray394[local201];
				}
			}
		}
		super.aBoolean286 = false;
		return local101;
	}

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V")
	private void method2733(@OriginalArg(0) int arg0) {
		if (Static158.aBooleanArray49[arg0]) {
			this.method2736(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray402[arg0];
		@Pc(17) int local17 = this.anIntArray406[arg0];
		@Pc(22) int local22 = this.anIntArray399[arg0];
		Static9.aBoolean31 = Static158.aBooleanArray50[arg0];
		if (this.aByteArray41 == null) {
			Static9.anInt330 = 0;
		} else {
			Static9.anInt330 = this.aByteArray41[arg0] & 0xFF;
		}
		if (this.aShortArray43 != null && this.aShortArray43[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray38 == null || this.aByteArray38[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray38[arg0] & 0xFF;
				local133 = this.anIntArray403[local128];
				local138 = this.anIntArray404[local128];
				local143 = this.anIntArray401[local128];
			}
			if (this.anIntArray405[arg0] == -1) {
				Static9.method364(Static158.anIntArray421[local12], Static158.anIntArray421[local17], Static158.anIntArray421[local22], Static158.anIntArray413[local12], Static158.anIntArray413[local17], Static158.anIntArray413[local22], this.anIntArray400[arg0], this.anIntArray400[arg0], this.anIntArray400[arg0], Static158.anIntArray419[local133], Static158.anIntArray419[local138], Static158.anIntArray419[local143], Static158.anIntArray422[local133], Static158.anIntArray422[local138], Static158.anIntArray422[local143], Static158.anIntArray411[local133], Static158.anIntArray411[local138], Static158.anIntArray411[local143], this.aShortArray43[arg0]);
			} else {
				Static9.method364(Static158.anIntArray421[local12], Static158.anIntArray421[local17], Static158.anIntArray421[local22], Static158.anIntArray413[local12], Static158.anIntArray413[local17], Static158.anIntArray413[local22], this.anIntArray400[arg0], this.anIntArray398[arg0], this.anIntArray405[arg0], Static158.anIntArray419[local133], Static158.anIntArray419[local138], Static158.anIntArray419[local143], Static158.anIntArray422[local133], Static158.anIntArray422[local138], Static158.anIntArray422[local143], Static158.anIntArray411[local133], Static158.anIntArray411[local138], Static158.anIntArray411[local143], this.aShortArray43[arg0]);
			}
		} else if (this.anIntArray405[arg0] == -1) {
			Static9.method357(Static158.anIntArray421[local12], Static158.anIntArray421[local17], Static158.anIntArray421[local22], Static158.anIntArray413[local12], Static158.anIntArray413[local17], Static158.anIntArray413[local22], Static158.anIntArray417[this.anIntArray400[arg0]]);
		} else {
			Static9.method361(Static158.anIntArray421[local12], Static158.anIntArray421[local17], Static158.anIntArray421[local22], Static158.anIntArray413[local12], Static158.anIntArray413[local17], Static158.anIntArray413[local22], this.anIntArray400[arg0], this.anIntArray398[arg0], this.anIntArray405[arg0]);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[IIII)V")
	private void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static158.anInt3755 = 0;
			Static158.anInt3754 = 0;
			Static158.anInt3753 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray32.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray32[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static158.anInt3755 += super.anIntArray397[local36];
						Static158.anInt3754 += super.anIntArray394[local36];
						Static158.anInt3753 += super.anIntArray396[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static158.anInt3755 = Static158.anInt3755 / local6 + arg2;
				Static158.anInt3754 = Static158.anInt3754 / local6 + arg3;
				Static158.anInt3753 = Static158.anInt3753 / local6 + arg4;
			} else {
				Static158.anInt3755 = arg2;
				Static158.anInt3754 = arg3;
				Static158.anInt3753 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray32.length) {
					local115 = super.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray397[local31] += arg2;
						super.anIntArray394[local31] += arg3;
						super.anIntArray396[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray32.length) {
					local115 = super.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray397[local31] -= Static158.anInt3755;
						super.anIntArray394[local31] -= Static158.anInt3754;
						super.anIntArray396[local31] -= Static158.anInt3753;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Static158.anIntArray408[arg4];
							local217 = Static158.anIntArray418[arg4];
							local235 = super.anIntArray394[local31] * local36 + super.anIntArray397[local31] * local217 + 32767 >> 16;
							super.anIntArray394[local31] = super.anIntArray394[local31] * local217 + 32767 - super.anIntArray397[local31] * local36 >> 16;
							super.anIntArray397[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Static158.anIntArray408[arg2];
							local217 = Static158.anIntArray418[arg2];
							local235 = super.anIntArray394[local31] * local217 + 32767 - super.anIntArray396[local31] * local36 >> 16;
							super.anIntArray396[local31] = super.anIntArray394[local31] * local36 + super.anIntArray396[local31] * local217 + 32767 >> 16;
							super.anIntArray394[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Static158.anIntArray408[arg3];
							local217 = Static158.anIntArray418[arg3];
							local235 = super.anIntArray396[local31] * local36 + super.anIntArray397[local31] * local217 + 32767 >> 16;
							super.anIntArray396[local31] = super.anIntArray396[local31] * local217 + 32767 - super.anIntArray397[local31] * local36 >> 16;
							super.anIntArray397[local31] = local235;
						}
						super.anIntArray397[local31] += Static158.anInt3755;
						super.anIntArray394[local31] += Static158.anInt3754;
						super.anIntArray396[local31] += Static158.anInt3753;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray32.length) {
					local115 = super.anIntArrayArray32[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray397[local31] -= Static158.anInt3755;
						super.anIntArray394[local31] -= Static158.anInt3754;
						super.anIntArray396[local31] -= Static158.anInt3753;
						super.anIntArray397[local31] = super.anIntArray397[local31] * arg2 / 128;
						super.anIntArray394[local31] = super.anIntArray394[local31] * arg3 / 128;
						super.anIntArray396[local31] = super.anIntArray396[local31] * arg4 / 128;
						super.anIntArray397[local31] += Static158.anInt3755;
						super.anIntArray394[local31] += Static158.anInt3754;
						super.anIntArray396[local31] += Static158.anInt3753;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray33 != null && this.aByteArray41 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray33.length) {
					local115 = super.anIntArrayArray33[local14];
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

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "(I)V")
	private void method2736(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static9.anInt332;
		@Pc(3) int local3 = Static9.anInt333;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray402[arg0];
		@Pc(15) int local15 = this.anIntArray406[arg0];
		@Pc(20) int local20 = this.anIntArray399[arg0];
		@Pc(24) int local24 = Static158.anIntArray411[local10];
		@Pc(28) int local28 = Static158.anIntArray411[local15];
		@Pc(32) int local32 = Static158.anIntArray411[local20];
		if (this.aByteArray41 == null) {
			Static9.anInt330 = 0;
		} else {
			Static9.anInt330 = this.aByteArray41[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static158.anIntArray415[0] = Static158.anIntArray413[local10];
			Static158.anIntArray424[0] = Static158.anIntArray421[local10];
			local5++;
			Static158.anIntArray423[0] = this.anIntArray400[arg0];
		} else {
			local73 = Static158.anIntArray419[local10];
			local77 = Static158.anIntArray422[local10];
			local82 = this.anIntArray400[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static158.anIntArray410[local32 - local24];
				Static158.anIntArray415[0] = local1 + (local73 + ((Static158.anIntArray419[local20] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[0] = local3 + (local77 + ((Static158.anIntArray422[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static158.anIntArray423[0] = local82 + ((this.anIntArray405[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static158.anIntArray410[local28 - local24];
				Static158.anIntArray415[local5] = local1 + (local73 + ((Static158.anIntArray419[local15] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[local5] = local3 + (local77 + ((Static158.anIntArray422[local15] - local77) * local95 >> 16) << 9) / 50;
				Static158.anIntArray423[local5++] = local82 + ((this.anIntArray398[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static158.anIntArray415[local5] = Static158.anIntArray413[local15];
			Static158.anIntArray424[local5] = Static158.anIntArray421[local15];
			Static158.anIntArray423[local5++] = this.anIntArray398[arg0];
		} else {
			local73 = Static158.anIntArray419[local15];
			local77 = Static158.anIntArray422[local15];
			local82 = this.anIntArray398[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static158.anIntArray410[local24 - local28];
				Static158.anIntArray415[local5] = local1 + (local73 + ((Static158.anIntArray419[local10] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[local5] = local3 + (local77 + ((Static158.anIntArray422[local10] - local77) * local95 >> 16) << 9) / 50;
				Static158.anIntArray423[local5++] = local82 + ((this.anIntArray400[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static158.anIntArray410[local32 - local28];
				Static158.anIntArray415[local5] = local1 + (local73 + ((Static158.anIntArray419[local20] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[local5] = local3 + (local77 + ((Static158.anIntArray422[local20] - local77) * local95 >> 16) << 9) / 50;
				Static158.anIntArray423[local5++] = local82 + ((this.anIntArray405[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static158.anIntArray415[local5] = Static158.anIntArray413[local20];
			Static158.anIntArray424[local5] = Static158.anIntArray421[local20];
			Static158.anIntArray423[local5++] = this.anIntArray405[arg0];
		} else {
			local73 = Static158.anIntArray419[local20];
			local77 = Static158.anIntArray422[local20];
			local82 = this.anIntArray405[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static158.anIntArray410[local28 - local32];
				Static158.anIntArray415[local5] = local1 + (local73 + ((Static158.anIntArray419[local15] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[local5] = local3 + (local77 + ((Static158.anIntArray422[local15] - local77) * local95 >> 16) << 9) / 50;
				Static158.anIntArray423[local5++] = local82 + ((this.anIntArray398[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static158.anIntArray410[local24 - local32];
				Static158.anIntArray415[local5] = local1 + (local73 + ((Static158.anIntArray419[local10] - local73) * local95 >> 16) << 9) / 50;
				Static158.anIntArray424[local5] = local3 + (local77 + ((Static158.anIntArray422[local10] - local77) * local95 >> 16) << 9) / 50;
				Static158.anIntArray423[local5++] = local82 + ((this.anIntArray400[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static158.anIntArray415[0];
		local77 = Static158.anIntArray415[1];
		local82 = Static158.anIntArray415[2];
		local95 = Static158.anIntArray424[0];
		@Pc(590) int local590 = Static158.anIntArray424[1];
		@Pc(594) int local594 = Static158.anIntArray424[2];
		Static9.aBoolean31 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static9.anInt334 || local77 > Static9.anInt334 || local82 > Static9.anInt334) {
				Static9.aBoolean31 = true;
			}
			if (this.aShortArray43 != null && this.aShortArray43[arg0] != -1) {
				if (this.aByteArray38 == null || this.aByteArray38[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray38[arg0] & 0xFF;
					local683 = this.anIntArray403[local678];
					local688 = this.anIntArray404[local678];
					local693 = this.anIntArray401[local678];
				}
				if (this.anIntArray405[arg0] == -1) {
					Static9.method364(local95, local590, local594, local73, local77, local82, this.anIntArray400[arg0], this.anIntArray400[arg0], this.anIntArray400[arg0], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], this.aShortArray43[arg0]);
				} else {
					Static9.method364(local95, local590, local594, local73, local77, local82, Static158.anIntArray423[0], Static158.anIntArray423[1], Static158.anIntArray423[2], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], this.aShortArray43[arg0]);
				}
			} else if (this.anIntArray405[arg0] == -1) {
				Static9.method357(local95, local590, local594, local73, local77, local82, Static158.anIntArray417[this.anIntArray400[arg0]]);
			} else {
				Static9.method361(local95, local590, local594, local73, local77, local82, Static158.anIntArray423[0], Static158.anIntArray423[1], Static158.anIntArray423[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static9.anInt334 || local77 > Static9.anInt334 || local82 > Static9.anInt334 || Static158.anIntArray415[3] < 0 || Static158.anIntArray415[3] > Static9.anInt334) {
			Static9.aBoolean31 = true;
		}
		if (this.aShortArray43 == null || this.aShortArray43[arg0] == -1) {
			if (this.anIntArray405[arg0] == -1) {
				local683 = Static158.anIntArray417[this.anIntArray400[arg0]];
				Static9.method357(local95, local590, local594, local73, local77, local82, local683);
				Static9.method357(local95, local594, Static158.anIntArray424[3], local73, local82, Static158.anIntArray415[3], local683);
				return;
			}
			Static9.method361(local95, local590, local594, local73, local77, local82, Static158.anIntArray423[0], Static158.anIntArray423[1], Static158.anIntArray423[2]);
			Static9.method361(local95, local594, Static158.anIntArray424[3], local73, local82, Static158.anIntArray415[3], Static158.anIntArray423[0], Static158.anIntArray423[2], Static158.anIntArray423[3]);
			return;
		}
		if (this.aByteArray38 == null || this.aByteArray38[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray38[arg0] & 0xFF;
			local683 = this.anIntArray403[local678];
			local688 = this.anIntArray404[local678];
			local693 = this.anIntArray401[local678];
		}
		@Pc(956) short local956 = this.aShortArray43[arg0];
		if (this.anIntArray405[arg0] == -1) {
			Static9.method364(local95, local590, local594, local73, local77, local82, this.anIntArray400[arg0], this.anIntArray400[arg0], this.anIntArray400[arg0], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], local956);
			Static9.method364(local95, local594, Static158.anIntArray424[3], local73, local82, Static158.anIntArray415[3], this.anIntArray400[arg0], this.anIntArray400[arg0], this.anIntArray400[arg0], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], local956);
			return;
		}
		Static9.method364(local95, local590, local594, local73, local77, local82, Static158.anIntArray423[0], Static158.anIntArray423[1], Static158.anIntArray423[2], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], local956);
		Static9.method364(local95, local594, Static158.anIntArray424[3], local73, local82, Static158.anIntArray415[3], Static158.anIntArray423[0], Static158.anIntArray423[2], Static158.anIntArray423[3], Static158.anIntArray419[local683], Static158.anIntArray419[local688], Static158.anIntArray419[local693], Static158.anIntArray422[local683], Static158.anIntArray422[local688], Static158.anIntArray422[local693], Static158.anIntArray411[local683], Static158.anIntArray411[local688], Static158.anIntArray411[local693], local956);
	}
}
