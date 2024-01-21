import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub1_Sub1_Sub4_Sub1 extends Class4_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!uc", name = "mb", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!uc", name = "nb", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!uc", name = "pb", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!uc", name = "qb", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!uc", name = "rb", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!uc", name = "sb", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!uc", name = "tb", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!uc", name = "ub", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!uc", name = "wb", descriptor = "[I")
	private int[] anIntArray382;

	@OriginalMember(owner = "client!uc", name = "xb", descriptor = "[I")
	private int[] anIntArray383;

	@OriginalMember(owner = "client!uc", name = "yb", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!uc", name = "Ib", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "B")
	private byte aByte9 = 0;

	@OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
	private int anInt3727 = 0;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1_Sub4_Sub1() {
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ff;IIIII)V")
	public Class4_Sub1_Sub1_Sub4_Sub1(@OriginalArg(0) Class4_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method995();
		arg0.method997();
		super.anInt3726 = arg0.anInt1307;
		super.anIntArray375 = arg0.anIntArray130;
		super.anIntArray371 = arg0.anIntArray135;
		super.anIntArray374 = arg0.anIntArray133;
		super.anInt3722 = arg0.anInt1309;
		this.anIntArray376 = arg0.anIntArray129;
		this.anIntArray389 = arg0.anIntArray132;
		this.anIntArray377 = arg0.anIntArray127;
		this.aByteArray44 = arg0.aByteArray16;
		this.aByteArray45 = arg0.aByteArray12;
		this.aByte9 = arg0.aByte4;
		super.anIntArrayArray30 = arg0.anIntArrayArray10;
		super.anIntArrayArray31 = arg0.anIntArrayArray11;
		@Pc(78) int local78 = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		@Pc(84) int local84 = arg2 * local78 >> 8;
		this.anIntArray381 = new int[super.anInt3722];
		this.anIntArray382 = new int[super.anInt3722];
		this.anIntArray380 = new int[super.anInt3722];
		@Pc(109) int local109;
		if (arg0.aShortArray10 == null) {
			this.aShortArray45 = null;
		} else {
			this.aShortArray45 = new short[super.anInt3722];
			for (local109 = 0; local109 < super.anInt3722; local109++) {
				@Pc(115) short local115 = arg0.aShortArray10[local109];
				if (local115 != -1 && Static171.anInterface1_2.method387(local115)) {
					this.aShortArray45[local109] = local115;
				} else {
					this.aShortArray45[local109] = -1;
				}
			}
		}
		@Pc(286) int local286;
		if (arg0.anInt1308 > 0 && arg0.aByteArray13 != null) {
			@Pc(153) int[] local153 = new int[arg0.anInt1308];
			for (@Pc(155) int local155 = 0; local155 < super.anInt3722; local155++) {
				if (arg0.aByteArray13[local155] != -1) {
					local153[arg0.aByteArray13[local155] & 0xFF]++;
				}
			}
			this.anInt3727 = 0;
			for (@Pc(184) int local184 = 0; local184 < arg0.anInt1308; local184++) {
				if (local153[local184] > 0 && arg0.aByteArray10[local184] == 0) {
					this.anInt3727++;
				}
			}
			this.anIntArray378 = new int[this.anInt3727];
			this.anIntArray383 = new int[this.anInt3727];
			this.anIntArray379 = new int[this.anInt3727];
			@Pc(222) int local222 = 0;
			for (@Pc(224) int local224 = 0; local224 < arg0.anInt1308; local224++) {
				if (local153[local224] > 0 && arg0.aByteArray10[local224] == 0) {
					this.anIntArray378[local222] = arg0.aShortArray13[local224] & 0xFFFF;
					this.anIntArray383[local222] = arg0.aShortArray8[local224] & 0xFFFF;
					this.anIntArray379[local222] = arg0.aShortArray15[local224] & 0xFFFF;
					local153[local224] = local222++;
				} else {
					local153[local224] = -1;
				}
			}
			this.aByteArray43 = new byte[super.anInt3722];
			for (local286 = 0; local286 < super.anInt3722; local286++) {
				if (arg0.aByteArray13[local286] == -1) {
					this.aByteArray43[local286] = -1;
				} else {
					this.aByteArray43[local286] = (byte) local153[arg0.aByteArray13[local286] & 0xFF];
					if (this.aByteArray43[local286] == -1 && this.aShortArray45 != null) {
						this.aShortArray45[local286] = -1;
					}
				}
			}
		}
		for (local109 = 0; local109 < super.anInt3722; local109++) {
			@Pc(339) byte local339;
			if (arg0.aByteArray14 == null) {
				local339 = 0;
			} else {
				local339 = arg0.aByteArray14[local109];
			}
			@Pc(350) byte local350;
			if (arg0.aByteArray12 == null) {
				local350 = 0;
			} else {
				local350 = arg0.aByteArray12[local109];
			}
			@Pc(361) short local361;
			if (this.aShortArray45 == null) {
				local361 = -1;
			} else {
				local361 = this.aShortArray45[local109];
			}
			if (local350 == -2) {
				local339 = 3;
			}
			if (local350 == -1) {
				local339 = 2;
			}
			@Pc(408) Class6 local408;
			@Pc(569) Class16 local569;
			if (local361 == -1) {
				if (local339 == 0) {
					@Pc(389) int local389 = arg0.aShortArray12[local109] & 0xFFFF;
					if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray376[local109]] == null) {
						local408 = arg0.aClass6Array2[this.anIntArray376[local109]];
					} else {
						local408 = arg0.aClass6Array1[this.anIntArray376[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
					this.anIntArray381[local109] = Static168.method2844(local389, local286);
					if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray389[local109]] == null) {
						local408 = arg0.aClass6Array2[this.anIntArray389[local109]];
					} else {
						local408 = arg0.aClass6Array1[this.anIntArray389[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
					this.anIntArray382[local109] = Static168.method2844(local389, local286);
					if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray377[local109]] == null) {
						local408 = arg0.aClass6Array2[this.anIntArray377[local109]];
					} else {
						local408 = arg0.aClass6Array1[this.anIntArray377[local109]];
					}
					local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
					this.anIntArray380[local109] = Static168.method2844(local389, local286);
				} else if (local339 == 1) {
					local569 = arg0.aClass16Array1[local109];
					local286 = arg1 + (arg3 * local569.anInt591 + arg4 * local569.anInt592 + arg5 * local569.anInt589) / (local84 + local84 / 2);
					this.anIntArray381[local109] = Static168.method2844(arg0.aShortArray12[local109] & 0xFFFF, local286);
					this.anIntArray380[local109] = -1;
				} else if (local339 == 3) {
					this.anIntArray381[local109] = 128;
					this.anIntArray380[local109] = -1;
				} else {
					this.anIntArray380[local109] = -2;
				}
			} else if (local339 == 0) {
				if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray376[local109]] == null) {
					local408 = arg0.aClass6Array2[this.anIntArray376[local109]];
				} else {
					local408 = arg0.aClass6Array1[this.anIntArray376[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
				this.anIntArray381[local109] = Static168.method2846(local286);
				if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray389[local109]] == null) {
					local408 = arg0.aClass6Array2[this.anIntArray389[local109]];
				} else {
					local408 = arg0.aClass6Array1[this.anIntArray389[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
				this.anIntArray382[local109] = Static168.method2846(local286);
				if (arg0.aClass6Array1 == null || arg0.aClass6Array1[this.anIntArray377[local109]] == null) {
					local408 = arg0.aClass6Array2[this.anIntArray377[local109]];
				} else {
					local408 = arg0.aClass6Array1[this.anIntArray377[local109]];
				}
				local286 = arg1 + (arg3 * local408.anInt235 + arg4 * local408.anInt228 + arg5 * local408.anInt229) / (local84 * local408.anInt234);
				this.anIntArray380[local109] = Static168.method2846(local286);
			} else if (local339 == 1) {
				local569 = arg0.aClass16Array1[local109];
				local286 = arg1 + (arg3 * local569.anInt591 + arg4 * local569.anInt592 + arg5 * local569.anInt589) / (local84 + local84 / 2);
				this.anIntArray381[local109] = Static168.method2846(local286);
				this.anIntArray380[local109] = -1;
			} else {
				this.anIntArray380[local109] = -2;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([Lclient!uc;I)V")
	private Class4_Sub1_Sub1_Sub4_Sub1(@OriginalArg(0) Class4_Sub1_Sub1_Sub4_Sub1[] arg0, @OriginalArg(1) int arg1) {
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		super.anInt3726 = 0;
		super.anInt3722 = 0;
		this.anInt3727 = 0;
		this.aByte9 = -1;
		for (@Pc(29) int local29 = 0; local29 < arg1; local29++) {
			@Pc(34) Class4_Sub1_Sub1_Sub4_Sub1 local34 = arg0[local29];
			if (local34 != null) {
				super.anInt3726 += local34.anInt3726;
				super.anInt3722 += local34.anInt3722;
				this.anInt3727 += local34.anInt3727;
				if (local34.aByteArray44 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local34.aByte9;
					}
					if (this.aByte9 != local34.aByte9) {
						local9 = true;
					}
				} else {
					local9 = true;
				}
				local11 |= local34.aByteArray45 != null;
				local13 |= local34.aShortArray45 != null;
				local15 |= local34.aByteArray43 != null;
			}
		}
		super.anIntArray375 = new int[super.anInt3726];
		super.anIntArray371 = new int[super.anInt3726];
		super.anIntArray374 = new int[super.anInt3726];
		this.anIntArray376 = new int[super.anInt3722];
		this.anIntArray389 = new int[super.anInt3722];
		this.anIntArray377 = new int[super.anInt3722];
		this.anIntArray381 = new int[super.anInt3722];
		this.anIntArray382 = new int[super.anInt3722];
		this.anIntArray380 = new int[super.anInt3722];
		if (local9) {
			this.aByteArray44 = new byte[super.anInt3722];
		}
		if (local11) {
			this.aByteArray45 = new byte[super.anInt3722];
		}
		if (local13) {
			this.aShortArray45 = new short[super.anInt3722];
		}
		if (local15) {
			this.aByteArray43 = new byte[super.anInt3722];
		}
		if (this.anInt3727 > 0) {
			this.anIntArray378 = new int[this.anInt3727];
			this.anIntArray383 = new int[this.anInt3727];
			this.anIntArray379 = new int[this.anInt3727];
		}
		super.anInt3726 = 0;
		super.anInt3722 = 0;
		this.anInt3727 = 0;
		for (@Pc(211) int local211 = 0; local211 < arg1; local211++) {
			@Pc(216) Class4_Sub1_Sub1_Sub4_Sub1 local216 = arg0[local211];
			if (local216 != null) {
				for (@Pc(220) int local220 = 0; local220 < local216.anInt3722; local220++) {
					this.anIntArray376[super.anInt3722] = local216.anIntArray376[local220] + super.anInt3726;
					this.anIntArray389[super.anInt3722] = local216.anIntArray389[local220] + super.anInt3726;
					this.anIntArray377[super.anInt3722] = local216.anIntArray377[local220] + super.anInt3726;
					this.anIntArray381[super.anInt3722] = local216.anIntArray381[local220];
					this.anIntArray382[super.anInt3722] = local216.anIntArray382[local220];
					this.anIntArray380[super.anInt3722] = local216.anIntArray380[local220];
					if (local9) {
						if (local216.aByteArray44 == null) {
							this.aByteArray44[super.anInt3722] = local216.aByte9;
						} else {
							this.aByteArray44[super.anInt3722] = local216.aByteArray44[local220];
						}
					}
					if (local11 && local216.aByteArray45 != null) {
						this.aByteArray45[super.anInt3722] = local216.aByteArray45[local220];
					}
					if (local13) {
						if (local216.aShortArray45 == null) {
							this.aShortArray45[super.anInt3722] = -1;
						} else {
							this.aShortArray45[super.anInt3722] = local216.aShortArray45[local220];
						}
					}
					if (local15) {
						if (local216.aByteArray43 == null || local216.aByteArray43[local220] == -1) {
							this.aByteArray43[super.anInt3722] = -1;
						} else {
							this.aByteArray43[super.anInt3722] = (byte) (local216.aByteArray43[local220] + this.anInt3727);
						}
					}
					super.anInt3722++;
				}
				for (@Pc(385) int local385 = 0; local385 < local216.anInt3727; local385++) {
					this.anIntArray378[this.anInt3727] = local216.anIntArray378[local385] + super.anInt3726;
					this.anIntArray383[this.anInt3727] = local216.anIntArray383[local385] + super.anInt3726;
					this.anIntArray379[this.anInt3727] = local216.anIntArray379[local385] + super.anInt3726;
					this.anInt3727++;
				}
				for (@Pc(435) int local435 = 0; local435 < local216.anInt3726; local435++) {
					super.anIntArray375[super.anInt3726] = local216.anIntArray375[local435];
					super.anIntArray371[super.anInt3726] = local216.anIntArray371[local435];
					super.anIntArray374[super.anInt3726] = local216.anIntArray374[local435];
					super.anInt3726++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Lclient!dg;")
	@Override
	public Class4_Sub1_Sub1_Sub4 method2828(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static168.aByteArray47.length < super.anInt3722) {
			Static168.aByteArray47 = new byte[super.anInt3722 + 100];
		}
		return this.method2841(arg0, Static168.aClass4_Sub1_Sub1_Sub4_Sub1_2, Static168.aByteArray47);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLclient!uc;[B)Lclient!uc;")
	private Class4_Sub1_Sub1_Sub4_Sub1 method2841(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt3726 = super.anInt3726;
		arg1.anInt3722 = super.anInt3722;
		arg1.anInt3727 = this.anInt3727;
		if (arg1.anIntArray375 == null || arg1.anIntArray375.length < super.anInt3726) {
			arg1.anIntArray375 = new int[super.anInt3726 + 100];
			arg1.anIntArray371 = new int[super.anInt3726 + 100];
			arg1.anIntArray374 = new int[super.anInt3726 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < super.anInt3726; local43++) {
			arg1.anIntArray375[local43] = super.anIntArray375[local43];
			arg1.anIntArray371[local43] = super.anIntArray371[local43];
			arg1.anIntArray374[local43] = super.anIntArray374[local43];
		}
		if (arg0) {
			arg1.aByteArray45 = this.aByteArray45;
		} else {
			arg1.aByteArray45 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray45 == null) {
				for (local88 = 0; local88 < super.anInt3722; local88++) {
					arg1.aByteArray45[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < super.anInt3722; local88++) {
					arg1.aByteArray45[local88] = this.aByteArray45[local88];
				}
			}
		}
		arg1.anIntArray376 = this.anIntArray376;
		arg1.anIntArray389 = this.anIntArray389;
		arg1.anIntArray377 = this.anIntArray377;
		arg1.anIntArray381 = this.anIntArray381;
		arg1.anIntArray382 = this.anIntArray382;
		arg1.anIntArray380 = this.anIntArray380;
		arg1.aByteArray44 = this.aByteArray44;
		arg1.aByteArray43 = this.aByteArray43;
		arg1.aShortArray45 = this.aShortArray45;
		arg1.aByte9 = this.aByte9;
		arg1.anIntArray378 = this.anIntArray378;
		arg1.anIntArray383 = this.anIntArray383;
		arg1.anIntArray379 = this.anIntArray379;
		arg1.anIntArrayArray30 = super.anIntArrayArray30;
		arg1.anIntArrayArray31 = super.anIntArrayArray31;
		arg1.aBoolean148 = super.aBoolean148;
		arg1.aBoolean147 = false;
		return arg1;
	}

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
	private void method2842(@OriginalArg(0) int arg0) {
		if (Static168.aBooleanArray16[arg0]) {
			this.method2850(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray376[arg0];
		@Pc(17) int local17 = this.anIntArray389[arg0];
		@Pc(22) int local22 = this.anIntArray377[arg0];
		Static171.aBoolean157 = Static168.aBooleanArray17[arg0];
		if (this.aByteArray45 == null) {
			Static171.anInt3850 = 0;
		} else {
			Static171.anInt3850 = this.aByteArray45[arg0] & 0xFF;
		}
		if (this.aShortArray45 != null && this.aShortArray45[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray43[arg0] & 0xFF;
				local133 = this.anIntArray378[local128];
				local138 = this.anIntArray383[local128];
				local143 = this.anIntArray379[local128];
			}
			if (this.anIntArray380[arg0] == -1) {
				Static171.method2947(Static168.anIntArray395[local12], Static168.anIntArray395[local17], Static168.anIntArray395[local22], Static168.anIntArray394[local12], Static168.anIntArray394[local17], Static168.anIntArray394[local22], this.anIntArray381[arg0], this.anIntArray381[arg0], this.anIntArray381[arg0], Static168.anIntArray390[local133], Static168.anIntArray390[local138], Static168.anIntArray390[local143], Static168.anIntArray392[local133], Static168.anIntArray392[local138], Static168.anIntArray392[local143], Static168.anIntArray391[local133], Static168.anIntArray391[local138], Static168.anIntArray391[local143], this.aShortArray45[arg0]);
			} else {
				Static171.method2947(Static168.anIntArray395[local12], Static168.anIntArray395[local17], Static168.anIntArray395[local22], Static168.anIntArray394[local12], Static168.anIntArray394[local17], Static168.anIntArray394[local22], this.anIntArray381[arg0], this.anIntArray382[arg0], this.anIntArray380[arg0], Static168.anIntArray390[local133], Static168.anIntArray390[local138], Static168.anIntArray390[local143], Static168.anIntArray392[local133], Static168.anIntArray392[local138], Static168.anIntArray392[local143], Static168.anIntArray391[local133], Static168.anIntArray391[local138], Static168.anIntArray391[local143], this.aShortArray45[arg0]);
			}
		} else if (this.anIntArray380[arg0] == -1) {
			Static171.method2960(Static168.anIntArray395[local12], Static168.anIntArray395[local17], Static168.anIntArray395[local22], Static168.anIntArray394[local12], Static168.anIntArray394[local17], Static168.anIntArray394[local22], Static168.anIntArray402[this.anIntArray381[arg0]]);
		} else {
			Static171.method2950(Static168.anIntArray395[local12], Static168.anIntArray395[local17], Static168.anIntArray395[local22], Static168.anIntArray394[local12], Static168.anIntArray394[local17], Static168.anIntArray394[local22], this.anIntArray381[arg0], this.anIntArray382[arg0], this.anIntArray380[arg0]);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2840(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			this.method2824();
			@Pc(3) int local3 = Static171.anInt3847;
			@Pc(5) int local5 = Static171.anInt3846;
			@Pc(9) int local9 = Static168.anIntArray400[0];
			@Pc(13) int local13 = Static168.anIntArray386[0];
			@Pc(17) int local17 = Static168.anIntArray400[arg0];
			@Pc(21) int local21 = Static168.anIntArray386[arg0];
			@Pc(25) int local25 = Static168.anIntArray400[arg1];
			@Pc(29) int local29 = Static168.anIntArray386[arg1];
			@Pc(33) int local33 = Static168.anIntArray400[arg2];
			@Pc(37) int local37 = Static168.anIntArray386[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3726; local49++) {
				@Pc(55) int local55 = super.anIntArray375[local49];
				@Pc(60) int local60 = super.anIntArray371[local49];
				@Pc(65) int local65 = super.anIntArray374[local49];
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
				Static168.anIntArray393[local49] = local65 - local47;
				Static168.anIntArray394[local49] = local3 + (local55 << 9) / local65;
				Static168.anIntArray395[local49] = local5 + (local77 << 9) / local65;
				if (this.anInt3727 > 0) {
					Static168.anIntArray390[local49] = local55;
					Static168.anIntArray392[local49] = local77;
					Static168.anIntArray391[local49] = local65;
				}
			}
			this.method2845(false, false, 0L, super.aShort30, super.aShort30 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ef;I)V")
	@Override
	public void method2832(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (super.anIntArrayArray30 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class59 local12 = arg0.aClass59Array1[arg1];
		@Pc(15) Class4_Sub8 local15 = local12.aClass4_Sub8_1;
		Static168.anInt3730 = 0;
		Static168.anInt3728 = 0;
		Static168.anInt3729 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt2771; local23++) {
			@Pc(29) short local29 = local12.aShortArray40[local23];
			if (local12.aShortArray34[local23] != -1) {
				this.method2848(0, local15.anIntArrayArray8[local12.aShortArray34[local23]], 0, 0, 0);
			}
			this.method2848(local15.anIntArray92[local29], local15.anIntArrayArray8[local29], local12.aShortArray36[local23], local12.aShortArray37[local23], local12.aShortArray35[local23]);
		}
		super.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	public void method2830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			this.method2824();
			@Pc(3) int local3 = Static171.anInt3847;
			@Pc(5) int local5 = Static171.anInt3846;
			@Pc(9) int local9 = Static168.anIntArray400[0];
			@Pc(13) int local13 = Static168.anIntArray386[0];
			@Pc(17) int local17 = Static168.anIntArray400[arg0];
			@Pc(21) int local21 = Static168.anIntArray386[arg0];
			@Pc(25) int local25 = Static168.anIntArray400[arg1];
			@Pc(29) int local29 = Static168.anIntArray386[arg1];
			@Pc(33) int local33 = Static168.anIntArray400[arg2];
			@Pc(37) int local37 = Static168.anIntArray386[arg2];
			@Pc(47) int local47 = arg4 * local33 + arg5 * local37 >> 16;
			for (@Pc(49) int local49 = 0; local49 < super.anInt3726; local49++) {
				@Pc(55) int local55 = super.anIntArray375[local49];
				@Pc(60) int local60 = super.anIntArray371[local49];
				@Pc(65) int local65 = super.anIntArray374[local49];
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
				Static168.anIntArray393[local49] = local65 - local47;
				Static168.anIntArray394[local49] = local3 + (local55 << 9) / arg6;
				Static168.anIntArray395[local49] = local5 + (local77 << 9) / arg6;
				if (this.anInt3727 > 0) {
					Static168.anIntArray390[local49] = local55;
					Static168.anIntArray392[local49] = local77;
					Static168.anIntArray391[local49] = local65;
				}
			}
			this.method2845(false, false, 0L, super.aShort30, super.aShort30 << 1);
		} catch (@Pc(230) RuntimeException local230) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (!super.aBoolean147) {
			this.method2824();
		}
		@Pc(14) int local14 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(24) int local24 = arg6 * arg1 + local14 * arg2 >> 16;
		@Pc(38) int local38 = local24 + (super.aShort35 * arg2 + super.aShort33 * arg1 >> 16);
		if (local38 <= 50) {
			return;
		}
		@Pc(57) int local57 = local24 + (-super.aShort35 * arg2 + super.aShort29 * arg1 >> 16);
		if (local57 >= 3500) {
			return;
		}
		@Pc(71) int local71 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(78) int local78 = local71 + super.aShort35 << 9;
		if (local78 / local38 <= Static171.anInt3845) {
			return;
		}
		@Pc(91) int local91 = local71 - super.aShort35 << 9;
		if (local91 / local38 >= Static171.anInt3848) {
			return;
		}
		@Pc(107) int local107 = arg6 * arg2 - local14 * arg1 >> 16;
		@Pc(123) int local123 = local107 + (super.aShort35 * arg1 + super.aShort33 * arg2 >> 16) << 9;
		if (local123 / local38 <= Static171.anInt3844) {
			return;
		}
		@Pc(146) int local146 = local107 + (-super.aShort35 * arg1 + super.aShort29 * arg2 >> 16) << 9;
		if (local146 / local38 >= Static171.anInt3842) {
			return;
		}
		@Pc(154) boolean local154 = false;
		@Pc(161) boolean local161 = local57 <= 50;
		@Pc(170) boolean local170 = local161 || this.anInt3727 > 0;
		@Pc(172) int local172 = Static171.anInt3847;
		@Pc(174) int local174 = Static171.anInt3846;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		if (arg0 != 0) {
			local176 = Static168.anIntArray400[arg0];
			local178 = Static168.anIntArray386[arg0];
		}
		@Pc(190) boolean local190 = false;
		@Pc(204) int local204;
		@Pc(223) int local223;
		@Pc(208) int local208;
		@Pc(227) int local227;
		@Pc(240) int local240;
		if (arg8 > 0L && Static34.aBoolean146 && local57 > 0) {
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
			local240 = Static34.anInt3724 - Static171.anInt3847;
			@Pc(244) int local244 = Static34.anInt3725 - Static171.anInt3846;
			if (local240 >= local204 && local240 <= local208 && local244 >= local223 && local244 <= local227) {
				local204 = 999999;
				local208 = -999999;
				local223 = 999999;
				local227 = -999999;
				@Pc(307) int[] local307 = new int[] { super.aShort31, super.aShort34, super.aShort31, super.aShort34, super.aShort31, super.aShort34, super.aShort31, super.aShort34 };
				@Pc(350) int[] local350 = new int[] { super.aShort36, super.aShort36, super.aShort32, super.aShort32, super.aShort36, super.aShort36, super.aShort32, super.aShort32 };
				@Pc(393) int[] local393 = new int[] { super.aShort29, super.aShort29, super.aShort29, super.aShort29, super.aShort33, super.aShort33, super.aShort33, super.aShort33 };
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
					if (super.aBoolean148) {
						Static34.aLongArray42[Static34.anInt3723++] = arg8;
					} else {
						local190 = true;
					}
				}
			}
		}
		for (local204 = 0; local204 < super.anInt3726; local204++) {
			local223 = super.anIntArray375[local204];
			local208 = super.anIntArray371[local204];
			local227 = super.anIntArray374[local204];
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
			Static168.anIntArray393[local204] = local227 - local24;
			if (local227 >= 50) {
				Static168.anIntArray394[local204] = local172 + (local223 << 9) / local227;
				Static168.anIntArray395[local204] = local174 + (local240 << 9) / local227;
			} else {
				Static168.anIntArray394[local204] = -5000;
				local154 = true;
			}
			if (local170) {
				Static168.anIntArray390[local204] = local223;
				Static168.anIntArray392[local204] = local240;
				Static168.anIntArray391[local204] = local227;
			}
		}
		try {
			this.method2845(local154, local190, arg8, local24 - local57, local38 - local57 + 2);
		} catch (@Pc(720) Exception local720) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZJII)V")
	private void method2845(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 >= 1600) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg4; local5++) {
			Static168.anIntArray401[local5] = 0;
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
		for (@Pc(16) int local16 = 0; local16 < super.anInt3722; local16++) {
			if (this.anIntArray380[local16] != -2) {
				local28 = this.anIntArray376[local16];
				local33 = this.anIntArray389[local16];
				local38 = this.anIntArray377[local16];
				local42 = Static168.anIntArray394[local28];
				local46 = Static168.anIntArray394[local33];
				local50 = Static168.anIntArray394[local38];
				if (arg0 && (local42 == -5000 || local46 == -5000 || local50 == -5000)) {
					local65 = Static168.anIntArray390[local28];
					local69 = Static168.anIntArray390[local33];
					@Pc(73) int local73 = Static168.anIntArray390[local38];
					@Pc(77) int local77 = Static168.anIntArray392[local28];
					local81 = Static168.anIntArray392[local33];
					local85 = Static168.anIntArray392[local38];
					@Pc(89) int local89 = Static168.anIntArray391[local28];
					local93 = Static168.anIntArray391[local33];
					@Pc(97) int local97 = Static168.anIntArray391[local38];
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
						Static168.aBooleanArray16[local16] = true;
						@Pc(177) int local177 = (Static168.anIntArray393[local28] + Static168.anIntArray393[local33] + Static168.anIntArray393[local38]) / 3 + arg3;
						Static168.anIntArrayArray33[local177][Static168.anIntArray401[local177]++] = local16;
					}
				} else {
					if (arg1 && this.method2849(Static34.anInt3724, Static34.anInt3725, Static168.anIntArray395[local28], Static168.anIntArray395[local33], Static168.anIntArray395[local38], local42, local46, local50)) {
						Static34.aLongArray42[Static34.anInt3723++] = arg2;
						arg1 = false;
					}
					if ((local42 - local46) * (Static168.anIntArray395[local38] - Static168.anIntArray395[local33]) - (Static168.anIntArray395[local28] - Static168.anIntArray395[local33]) * (local50 - local46) > 0) {
						Static168.aBooleanArray16[local16] = false;
						if (local42 >= 0 && local46 >= 0 && local50 >= 0 && local42 <= Static171.anInt3849 && local46 <= Static171.anInt3849 && local50 <= Static171.anInt3849) {
							Static168.aBooleanArray17[local16] = false;
						} else {
							Static168.aBooleanArray17[local16] = true;
						}
						local65 = (Static168.anIntArray393[local28] + Static168.anIntArray393[local33] + Static168.anIntArray393[local38]) / 3 + arg3;
						Static168.anIntArrayArray33[local65][Static168.anIntArray401[local65]++] = local16;
					}
				}
			}
		}
		if (this.aByteArray44 == null) {
			for (local28 = arg4 - 1; local28 >= 0; local28--) {
				local33 = Static168.anIntArray401[local28];
				if (local33 > 0) {
					@Pc(324) int[] local324 = Static168.anIntArrayArray33[local28];
					for (local42 = 0; local42 < local33; local42++) {
						this.method2842(local324[local42]);
					}
				}
			}
			return;
		}
		for (local28 = 0; local28 < 12; local28++) {
			Static168.anIntArray385[local28] = 0;
			Static168.anIntArray398[local28] = 0;
		}
		for (local33 = arg4 - 1; local33 >= 0; local33--) {
			local38 = Static168.anIntArray401[local33];
			if (local38 > 0) {
				@Pc(370) int[] local370 = Static168.anIntArrayArray33[local33];
				for (local46 = 0; local46 < local38; local46++) {
					local50 = local370[local46];
					@Pc(382) byte local382 = this.aByteArray44[local50];
					local69 = Static168.anIntArray385[local382]++;
					Static168.anIntArrayArray32[local382][local69] = local50;
					if (local382 < 10) {
						Static168.anIntArray398[local382] += local33;
					} else if (local382 == 10) {
						Static168.anIntArray387[local69] = local33;
					} else {
						Static168.anIntArray388[local69] = local33;
					}
				}
			}
		}
		local38 = 0;
		if (Static168.anIntArray385[1] > 0 || Static168.anIntArray385[2] > 0) {
			local38 = (Static168.anIntArray398[1] + Static168.anIntArray398[2]) / (Static168.anIntArray385[1] + Static168.anIntArray385[2]);
		}
		local42 = 0;
		if (Static168.anIntArray385[3] > 0 || Static168.anIntArray385[4] > 0) {
			local42 = (Static168.anIntArray398[3] + Static168.anIntArray398[4]) / (Static168.anIntArray385[3] + Static168.anIntArray385[4]);
		}
		local46 = 0;
		if (Static168.anIntArray385[6] > 0 || Static168.anIntArray385[8] > 0) {
			local46 = (Static168.anIntArray398[6] + Static168.anIntArray398[8]) / (Static168.anIntArray385[6] + Static168.anIntArray385[8]);
		}
		local65 = 0;
		local69 = Static168.anIntArray385[10];
		@Pc(515) int[] local515 = Static168.anIntArrayArray32[10];
		@Pc(517) int[] local517 = Static168.anIntArray387;
		if (local69 == 0) {
			local65 = 0;
			local69 = Static168.anIntArray385[11];
			local515 = Static168.anIntArrayArray32[11];
			local517 = Static168.anIntArray388;
		}
		if (local69 > 0) {
			local50 = local517[0];
		} else {
			local50 = -1000;
		}
		for (local81 = 0; local81 < 10; local81++) {
			while (local81 == 0 && local50 > local38) {
				this.method2842(local515[local65++]);
				if (local65 == local69 && local515 != Static168.anIntArrayArray32[11]) {
					local65 = 0;
					local69 = Static168.anIntArray385[11];
					local515 = Static168.anIntArrayArray32[11];
					local517 = Static168.anIntArray388;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 3 && local50 > local42) {
				this.method2842(local515[local65++]);
				if (local65 == local69 && local515 != Static168.anIntArrayArray32[11]) {
					local65 = 0;
					local69 = Static168.anIntArray385[11];
					local515 = Static168.anIntArrayArray32[11];
					local517 = Static168.anIntArray388;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			while (local81 == 5 && local50 > local46) {
				this.method2842(local515[local65++]);
				if (local65 == local69 && local515 != Static168.anIntArrayArray32[11]) {
					local65 = 0;
					local69 = Static168.anIntArray385[11];
					local515 = Static168.anIntArrayArray32[11];
					local517 = Static168.anIntArray388;
				}
				if (local65 < local69) {
					local50 = local517[local65];
				} else {
					local50 = -1000;
				}
			}
			local85 = Static168.anIntArray385[local81];
			@Pc(680) int[] local680 = Static168.anIntArrayArray32[local81];
			for (local93 = 0; local93 < local85; local93++) {
				this.method2842(local680[local93]);
			}
		}
		while (local50 != -1000) {
			this.method2842(local515[local65++]);
			if (local65 == local69 && local515 != Static168.anIntArrayArray32[11]) {
				local65 = 0;
				local515 = Static168.anIntArrayArray32[11];
				local69 = Static168.anIntArray385[11];
				local517 = Static168.anIntArray388;
			}
			if (local65 < local69) {
				local50 = local517[local65];
			} else {
				local50 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!dg;)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method2847(@OriginalArg(0) Class4_Sub1_Sub1_Sub4 arg0) {
		return new Class4_Sub1_Sub1_Sub4_Sub1(new Class4_Sub1_Sub1_Sub4_Sub1[] { this, (Class4_Sub1_Sub1_Sub4_Sub1) arg0 }, 2);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIII)V")
	private void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static168.anInt3730 = 0;
			Static168.anInt3728 = 0;
			Static168.anInt3729 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < super.anIntArrayArray30.length) {
					@Pc(29) int[] local29 = super.anIntArrayArray30[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static168.anInt3730 += super.anIntArray375[local36];
						Static168.anInt3728 += super.anIntArray371[local36];
						Static168.anInt3729 += super.anIntArray374[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static168.anInt3730 = Static168.anInt3730 / local6 + arg2;
				Static168.anInt3728 = Static168.anInt3728 / local6 + arg3;
				Static168.anInt3729 = Static168.anInt3729 / local6 + arg4;
			} else {
				Static168.anInt3730 = arg2;
				Static168.anInt3728 = arg3;
				Static168.anInt3729 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray30.length) {
					local115 = super.anIntArrayArray30[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray375[local31] += arg2;
						super.anIntArray371[local31] += arg3;
						super.anIntArray374[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray30.length) {
					local115 = super.anIntArrayArray30[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray375[local31] -= Static168.anInt3730;
						super.anIntArray371[local31] -= Static168.anInt3728;
						super.anIntArray374[local31] -= Static168.anInt3729;
						@Pc(217) int local217;
						@Pc(235) int local235;
						if (arg4 != 0) {
							local36 = Static168.anIntArray400[arg4];
							local217 = Static168.anIntArray386[arg4];
							local235 = super.anIntArray371[local31] * local36 + super.anIntArray375[local31] * local217 + 32767 >> 16;
							super.anIntArray371[local31] = super.anIntArray371[local31] * local217 + 32767 - super.anIntArray375[local31] * local36 >> 16;
							super.anIntArray375[local31] = local235;
						}
						if (arg2 != 0) {
							local36 = Static168.anIntArray400[arg2];
							local217 = Static168.anIntArray386[arg2];
							local235 = super.anIntArray371[local31] * local217 + 32767 - super.anIntArray374[local31] * local36 >> 16;
							super.anIntArray374[local31] = super.anIntArray371[local31] * local36 + super.anIntArray374[local31] * local217 + 32767 >> 16;
							super.anIntArray371[local31] = local235;
						}
						if (arg3 != 0) {
							local36 = Static168.anIntArray400[arg3];
							local217 = Static168.anIntArray386[arg3];
							local235 = super.anIntArray374[local31] * local36 + super.anIntArray375[local31] * local217 + 32767 >> 16;
							super.anIntArray374[local31] = super.anIntArray374[local31] * local217 + 32767 - super.anIntArray375[local31] * local36 >> 16;
							super.anIntArray375[local31] = local235;
						}
						super.anIntArray375[local31] += Static168.anInt3730;
						super.anIntArray371[local31] += Static168.anInt3728;
						super.anIntArray374[local31] += Static168.anInt3729;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray30.length) {
					local115 = super.anIntArrayArray30[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						super.anIntArray375[local31] -= Static168.anInt3730;
						super.anIntArray371[local31] -= Static168.anInt3728;
						super.anIntArray374[local31] -= Static168.anInt3729;
						super.anIntArray375[local31] = super.anIntArray375[local31] * arg2 / 128;
						super.anIntArray371[local31] = super.anIntArray371[local31] * arg3 / 128;
						super.anIntArray374[local31] = super.anIntArray374[local31] * arg4 / 128;
						super.anIntArray375[local31] += Static168.anInt3730;
						super.anIntArray371[local31] += Static168.anInt3728;
						super.anIntArray374[local31] += Static168.anInt3729;
					}
				}
			}
		} else if (arg0 == 5 && (super.anIntArrayArray31 != null && this.aByteArray45 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < super.anIntArrayArray31.length) {
					local115 = super.anIntArrayArray31[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray45[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray45[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)Lclient!dg;")
	@Override
	public Class4_Sub1_Sub1_Sub4 method2833(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static168.aByteArray46.length < super.anInt3722) {
			Static168.aByteArray46 = new byte[super.anInt3722 + 100];
		}
		return this.method2841(arg0, Static168.aClass4_Sub1_Sub1_Sub4_Sub1_1, Static168.aByteArray46);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ef;ILclient!ef;I[I)V")
	@Override
	public void method2837(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method2832(arg0, arg1);
			return;
		}
		@Pc(18) Class59 local18 = arg0.aClass59Array1[arg1];
		@Pc(23) Class59 local23 = arg2.aClass59Array1[arg3];
		@Pc(26) Class4_Sub8 local26 = local18.aClass4_Sub8_1;
		Static168.anInt3730 = 0;
		Static168.anInt3728 = 0;
		Static168.anInt3729 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		for (@Pc(41) int local41 = 0; local41 < local18.anInt2771; local41++) {
			@Pc(47) short local47 = local18.aShortArray40[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray92[local47] == 0) {
				if (local18.aShortArray34[local41] != -1) {
					this.method2848(0, local26.anIntArrayArray8[local18.aShortArray34[local41]], 0, 0, 0);
				}
				this.method2848(local26.anIntArray92[local47], local26.anIntArrayArray8[local47], local18.aShortArray36[local41], local18.aShortArray37[local41], local18.aShortArray35[local41]);
			}
		}
		Static168.anInt3730 = 0;
		Static168.anInt3728 = 0;
		Static168.anInt3729 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (@Pc(125) int local125 = 0; local125 < local23.anInt2771; local125++) {
			@Pc(131) short local131 = local23.aShortArray40[local125];
			while (local131 > local39) {
				local39 = arg4[local37++];
			}
			if (local131 == local39 || local26.anIntArray92[local131] == 0) {
				if (local23.aShortArray34[local125] != -1) {
					this.method2848(0, local26.anIntArrayArray8[local23.aShortArray34[local125]], 0, 0, 0);
				}
				this.method2848(local26.anIntArray92[local131], local26.anIntArrayArray8[local131], local23.aShortArray36[local125], local23.aShortArray37[local125], local23.aShortArray35[local125]);
			}
		}
		super.aBoolean147 = false;
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(I)V")
	private void method2850(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static171.anInt3847;
		@Pc(3) int local3 = Static171.anInt3846;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray376[arg0];
		@Pc(15) int local15 = this.anIntArray389[arg0];
		@Pc(20) int local20 = this.anIntArray377[arg0];
		@Pc(24) int local24 = Static168.anIntArray391[local10];
		@Pc(28) int local28 = Static168.anIntArray391[local15];
		@Pc(32) int local32 = Static168.anIntArray391[local20];
		if (this.aByteArray45 == null) {
			Static171.anInt3850 = 0;
		} else {
			Static171.anInt3850 = this.aByteArray45[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static168.anIntArray397[0] = Static168.anIntArray394[local10];
			Static168.anIntArray396[0] = Static168.anIntArray395[local10];
			local5++;
			Static168.anIntArray384[0] = this.anIntArray381[arg0];
		} else {
			local73 = Static168.anIntArray390[local10];
			local77 = Static168.anIntArray392[local10];
			local82 = this.anIntArray381[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static168.anIntArray399[local32 - local24];
				Static168.anIntArray397[0] = local1 + (local73 + ((Static168.anIntArray390[local20] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[0] = local3 + (local77 + ((Static168.anIntArray392[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static168.anIntArray384[0] = local82 + ((this.anIntArray380[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static168.anIntArray399[local28 - local24];
				Static168.anIntArray397[local5] = local1 + (local73 + ((Static168.anIntArray390[local15] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[local5] = local3 + (local77 + ((Static168.anIntArray392[local15] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray384[local5++] = local82 + ((this.anIntArray382[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static168.anIntArray397[local5] = Static168.anIntArray394[local15];
			Static168.anIntArray396[local5] = Static168.anIntArray395[local15];
			Static168.anIntArray384[local5++] = this.anIntArray382[arg0];
		} else {
			local73 = Static168.anIntArray390[local15];
			local77 = Static168.anIntArray392[local15];
			local82 = this.anIntArray382[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static168.anIntArray399[local24 - local28];
				Static168.anIntArray397[local5] = local1 + (local73 + ((Static168.anIntArray390[local10] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[local5] = local3 + (local77 + ((Static168.anIntArray392[local10] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray384[local5++] = local82 + ((this.anIntArray381[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static168.anIntArray399[local32 - local28];
				Static168.anIntArray397[local5] = local1 + (local73 + ((Static168.anIntArray390[local20] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[local5] = local3 + (local77 + ((Static168.anIntArray392[local20] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray384[local5++] = local82 + ((this.anIntArray380[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static168.anIntArray397[local5] = Static168.anIntArray394[local20];
			Static168.anIntArray396[local5] = Static168.anIntArray395[local20];
			Static168.anIntArray384[local5++] = this.anIntArray380[arg0];
		} else {
			local73 = Static168.anIntArray390[local20];
			local77 = Static168.anIntArray392[local20];
			local82 = this.anIntArray380[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static168.anIntArray399[local28 - local32];
				Static168.anIntArray397[local5] = local1 + (local73 + ((Static168.anIntArray390[local15] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[local5] = local3 + (local77 + ((Static168.anIntArray392[local15] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray384[local5++] = local82 + ((this.anIntArray382[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static168.anIntArray399[local24 - local32];
				Static168.anIntArray397[local5] = local1 + (local73 + ((Static168.anIntArray390[local10] - local73) * local95 >> 16) << 9) / 50;
				Static168.anIntArray396[local5] = local3 + (local77 + ((Static168.anIntArray392[local10] - local77) * local95 >> 16) << 9) / 50;
				Static168.anIntArray384[local5++] = local82 + ((this.anIntArray381[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static168.anIntArray397[0];
		local77 = Static168.anIntArray397[1];
		local82 = Static168.anIntArray397[2];
		local95 = Static168.anIntArray396[0];
		@Pc(590) int local590 = Static168.anIntArray396[1];
		@Pc(594) int local594 = Static168.anIntArray396[2];
		Static171.aBoolean157 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static171.anInt3849 || local77 > Static171.anInt3849 || local82 > Static171.anInt3849) {
				Static171.aBoolean157 = true;
			}
			if (this.aShortArray45 != null && this.aShortArray45[arg0] != -1) {
				if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray43[arg0] & 0xFF;
					local683 = this.anIntArray378[local678];
					local688 = this.anIntArray383[local678];
					local693 = this.anIntArray379[local678];
				}
				if (this.anIntArray380[arg0] == -1) {
					Static171.method2947(local95, local590, local594, local73, local77, local82, this.anIntArray381[arg0], this.anIntArray381[arg0], this.anIntArray381[arg0], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], this.aShortArray45[arg0]);
				} else {
					Static171.method2947(local95, local590, local594, local73, local77, local82, Static168.anIntArray384[0], Static168.anIntArray384[1], Static168.anIntArray384[2], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], this.aShortArray45[arg0]);
				}
			} else if (this.anIntArray380[arg0] == -1) {
				Static171.method2960(local95, local590, local594, local73, local77, local82, Static168.anIntArray402[this.anIntArray381[arg0]]);
			} else {
				Static171.method2950(local95, local590, local594, local73, local77, local82, Static168.anIntArray384[0], Static168.anIntArray384[1], Static168.anIntArray384[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static171.anInt3849 || local77 > Static171.anInt3849 || local82 > Static171.anInt3849 || Static168.anIntArray397[3] < 0 || Static168.anIntArray397[3] > Static171.anInt3849) {
			Static171.aBoolean157 = true;
		}
		if (this.aShortArray45 == null || this.aShortArray45[arg0] == -1) {
			if (this.anIntArray380[arg0] == -1) {
				local683 = Static168.anIntArray402[this.anIntArray381[arg0]];
				Static171.method2960(local95, local590, local594, local73, local77, local82, local683);
				Static171.method2960(local95, local594, Static168.anIntArray396[3], local73, local82, Static168.anIntArray397[3], local683);
				return;
			}
			Static171.method2950(local95, local590, local594, local73, local77, local82, Static168.anIntArray384[0], Static168.anIntArray384[1], Static168.anIntArray384[2]);
			Static171.method2950(local95, local594, Static168.anIntArray396[3], local73, local82, Static168.anIntArray397[3], Static168.anIntArray384[0], Static168.anIntArray384[2], Static168.anIntArray384[3]);
			return;
		}
		if (this.aByteArray43 == null || this.aByteArray43[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray43[arg0] & 0xFF;
			local683 = this.anIntArray378[local678];
			local688 = this.anIntArray383[local678];
			local693 = this.anIntArray379[local678];
		}
		@Pc(956) short local956 = this.aShortArray45[arg0];
		if (this.anIntArray380[arg0] == -1) {
			Static171.method2947(local95, local590, local594, local73, local77, local82, this.anIntArray381[arg0], this.anIntArray381[arg0], this.anIntArray381[arg0], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], local956);
			Static171.method2947(local95, local594, Static168.anIntArray396[3], local73, local82, Static168.anIntArray397[3], this.anIntArray381[arg0], this.anIntArray381[arg0], this.anIntArray381[arg0], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], local956);
			return;
		}
		Static171.method2947(local95, local590, local594, local73, local77, local82, Static168.anIntArray384[0], Static168.anIntArray384[1], Static168.anIntArray384[2], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], local956);
		Static171.method2947(local95, local594, Static168.anIntArray396[3], local73, local82, Static168.anIntArray397[3], Static168.anIntArray384[0], Static168.anIntArray384[2], Static168.anIntArray384[3], Static168.anIntArray390[local683], Static168.anIntArray390[local688], Static168.anIntArray390[local693], Static168.anIntArray392[local683], Static168.anIntArray392[local688], Static168.anIntArray392[local693], Static168.anIntArray391[local683], Static168.anIntArray391[local688], Static168.anIntArray391[local693], local956);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([[IIIIZI)Lclient!dg;")
	@Override
	public Class4_Sub1_Sub1_Sub4 method2825(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2824();
		@Pc(6) int local6 = arg1 + super.aShort31;
		@Pc(11) int local11 = arg1 + super.aShort34;
		@Pc(16) int local16 = arg3 + super.aShort36;
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
		@Pc(101) Class4_Sub1_Sub1_Sub4_Sub1 local101;
		if (arg4) {
			local101 = new Class4_Sub1_Sub1_Sub4_Sub1();
			local101.anInt3726 = super.anInt3726;
			local101.anInt3722 = super.anInt3722;
			local101.anInt3727 = this.anInt3727;
			local101.anIntArray375 = super.anIntArray375;
			local101.anIntArray374 = super.anIntArray374;
			local101.anIntArray376 = this.anIntArray376;
			local101.anIntArray389 = this.anIntArray389;
			local101.anIntArray377 = this.anIntArray377;
			local101.anIntArray381 = this.anIntArray381;
			local101.anIntArray382 = this.anIntArray382;
			local101.anIntArray380 = this.anIntArray380;
			local101.aByteArray44 = this.aByteArray44;
			local101.aByteArray45 = this.aByteArray45;
			local101.aByteArray43 = this.aByteArray43;
			local101.aShortArray45 = this.aShortArray45;
			local101.aByte9 = this.aByte9;
			local101.anIntArray378 = this.anIntArray378;
			local101.anIntArray383 = this.anIntArray383;
			local101.anIntArray379 = this.anIntArray379;
			local101.anIntArrayArray30 = super.anIntArrayArray30;
			local101.anIntArrayArray31 = super.anIntArrayArray31;
			local101.aBoolean148 = super.aBoolean148;
			local101.anIntArray371 = new int[local101.anInt3726];
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
			for (local201 = 0; local201 < local101.anInt3726; local201++) {
				local209 = super.anIntArray375[local201] + arg1;
				local216 = super.anIntArray374[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray371[local201] = super.anIntArray371[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt3726; local201++) {
				local209 = (super.anIntArray371[local201] << 16) / super.aShort29;
				if (local209 < arg5) {
					local216 = super.anIntArray375[local201] + arg1;
					local220 = super.anIntArray374[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(416) int local416 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray371[local201] = super.anIntArray371[local201] + (local416 - arg2) * (arg5 - local209) / arg5;
				} else {
					local101.anIntArray371[local201] = super.anIntArray371[local201];
				}
			}
		}
		super.aBoolean147 = false;
		return local101;
	}
}
