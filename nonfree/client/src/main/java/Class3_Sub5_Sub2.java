import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!qh", name = "Hb", descriptor = "I")
	private int anInt3181;

	@OriginalMember(owner = "client!qh", name = "Ib", descriptor = "Z")
	private boolean aBoolean133;

	@OriginalMember(owner = "client!qh", name = "Kb", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!qh", name = "Lb", descriptor = "I")
	private int anInt3182;

	@OriginalMember(owner = "client!qh", name = "Mb", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "[I")
	public final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[I")
	public final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "[[Lclient!t;")
	private final Class3_Sub23[][] aClass3_Sub23ArrayArray1 = new Class3_Sub23[16][128];

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!qh", name = "rb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!qh", name = "gb", descriptor = "[I")
	public final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "[[Lclient!t;")
	private final Class3_Sub23[][] aClass3_Sub23ArrayArray2 = new Class3_Sub23[16][128];

	@OriginalMember(owner = "client!qh", name = "zb", descriptor = "[I")
	private final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!qh", name = "pb", descriptor = "I")
	private final int anInt3172 = 1000000;

	@OriginalMember(owner = "client!qh", name = "xb", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	private int anInt3149 = 256;

	@OriginalMember(owner = "client!qh", name = "Db", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!qh", name = "Gb", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!qh", name = "lb", descriptor = "Lclient!ud;")
	private final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!qh", name = "Jb", descriptor = "Lclient!bh;")
	private final Class3_Sub5_Sub1 aClass3_Sub5_Sub1_1 = new Class3_Sub5_Sub1(this);

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "Lclient!md;")
	private final Class54 aClass54_11 = new Class54(128);

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class3_Sub5_Sub2() {
		this.method2292();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	private void method2283(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2309(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method2312(local18, local24, local30);
			} else {
				this.method2309(local18, 64, local24);
			}
		} else if (local9 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method2314(local18, local30, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray365[local18] = (local30 << 14) + (this.anIntArray365[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray355[local18] = (local30 << 7) + (this.anIntArray355[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray355[local18] = (this.anIntArray355[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray359[local18] = (local30 << 7) + (this.anIntArray359[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray359[local18] = local30 + (this.anIntArray359[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray358[local18] = (local30 << 7) + (this.anIntArray358[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray358[local18] = local30 + (this.anIntArray358[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray356[local18] = (local30 << 7) + (this.anIntArray356[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray356[local18] = local30 + (this.anIntArray356[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray362[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray362[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray362[local18] |= 0x2;
				} else {
					this.method2308(local18);
					this.anIntArray362[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray364[local18] = (local30 << 7) + (this.anIntArray364[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray364[local18] = local30 + (this.anIntArray364[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray364[local18] = (local30 << 7) + (this.anIntArray364[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray364[local18] = local30 + (this.anIntArray364[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method2300(local18);
			}
			if (local24 == 121) {
				this.method2303(local18);
			}
			if (local24 == 123) {
				this.method2297(local18);
			}
			@Pc(509) int local509;
			if (local24 == 6) {
				local509 = this.anIntArray364[local18];
				if (local509 == 16384) {
					this.anIntArray366[local18] = (this.anIntArray366[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local509 = this.anIntArray364[local18];
				if (local509 == 16384) {
					this.anIntArray366[local18] = (this.anIntArray366[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray357[local18] = (local30 << 7) + (this.anIntArray357[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray357[local18] = local30 + (this.anIntArray357[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray362[local18] |= 0x4;
				} else {
					this.method2291(local18);
					this.anIntArray362[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2304((this.anIntArray354[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method2304(local30 + (this.anIntArray354[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2302(local24 + this.anIntArray365[local18], local18);
		} else if (local9 == 208) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method2301(local24, local18);
		} else if (local9 == 224) {
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			local18 = arg0 & 0xF;
			this.method2307(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2292();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!t;)I")
	private int method2284(@OriginalArg(1) Class3_Sub23 arg0) {
		@Pc(11) Class66 local11 = arg0.aClass66_1;
		@Pc(22) int local22 = (arg0.anInt3425 * arg0.anInt3417 >> 12) + arg0.anInt3419;
		local22 += this.anIntArray366[arg0.anInt3418] * (this.anIntArray368[arg0.anInt3418] - 8192) >> 12;
		@Pc(60) int local60;
		if (local11.anInt3011 > 0 && (local11.anInt3017 > 0 || this.anIntArray355[arg0.anInt3418] > 0)) {
			local60 = local11.anInt3017 << 2;
			@Pc(65) int local65 = local11.anInt3018 << 1;
			if (arg0.anInt3414 < local65) {
				local60 = arg0.anInt3414 * local60 / local65;
			}
			local60 += this.anIntArray355[arg0.anInt3418] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt3415 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local95 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass3_Sub9_Sub1_1.anInt3892 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static149.anInt3584 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public synchronized void method2285() {
		for (@Pc(13) Class3_Sub22 local13 = (Class3_Sub22) this.aClass54_11.method1598(); local13 != null; local13 = (Class3_Sub22) this.aClass54_11.method1609()) {
			local13.method2409();
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method2287() {
		return this.aClass81_1.method2627();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int arg0) {
		if (this.aClass81_1.method2627()) {
			@Pc(18) int local18 = this.aClass81_1.anInt3631 * this.anInt3172 / Static149.anInt3584;
			do {
				@Pc(28) long local28 = this.aLong107 + (long) arg0 * (long) local18;
				if (this.aLong106 - local28 >= 0L) {
					this.aLong107 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong106 - this.aLong107 - 1L) / (long) local18);
				arg0 -= local57;
				this.aLong107 += (long) local18 * (long) local57;
				this.aClass3_Sub5_Sub1_1.method2769(local57);
				this.method2313();
			} while (this.aClass81_1.method2627());
		}
		this.aClass3_Sub5_Sub1_1.method2769(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!t;I)I")
	private int method2288(@OriginalArg(0) Class3_Sub23 arg0) {
		@Pc(12) Class66 local12 = arg0.aClass66_1;
		@Pc(28) int local28 = this.anIntArray359[arg0.anInt3418] * this.anIntArray356[arg0.anInt3418] + 4096 >> 13;
		@Pc(36) int local36 = local28 * local28 + 16384 >> 15;
		@Pc(45) int local45 = local36 * arg0.anInt3427 + 16384 >> 15;
		local28 = this.anInt3149 * local45 + 128 >> 8;
		if (local12.anInt3015 > 0) {
			local28 = (int) (Math.pow(0.5D, (double) arg0.anInt3429 * 1.953125E-5D * (double) local12.anInt3015) * (double) local28 + 0.5D);
		}
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(107) int local107;
		@Pc(119) int local119;
		if (local12.aByteArray36 != null) {
			local81 = arg0.anInt3421;
			local89 = local12.aByteArray36[arg0.anInt3428 + 1];
			if (local12.aByteArray36.length - 2 > arg0.anInt3428) {
				local107 = (local12.aByteArray36[arg0.anInt3428] & 0xFF) << 8;
				local119 = (local12.aByteArray36[arg0.anInt3428 + 2] & 0xFF) << 8;
				local89 += (local12.aByteArray36[arg0.anInt3428 + 3] - local89) * (local81 - local107) / (local119 - local107);
			}
			local28 = local28 * local89 + 32 >> 6;
		}
		if (arg0.anInt3433 > 0 && local12.aByteArray37 != null) {
			local81 = arg0.anInt3433;
			local89 = local12.aByteArray37[arg0.anInt3431 + 1];
			if (local12.aByteArray37.length - 2 > arg0.anInt3431) {
				local107 = (local12.aByteArray37[arg0.anInt3431] & 0xFF) << 8;
				local119 = (local12.aByteArray37[arg0.anInt3431 + 2] & 0xFF) << 8;
				local89 += (local12.aByteArray37[arg0.anInt3431 + 3] - local89) * (local81 - local107) / (local119 - local107);
			}
			local28 = local28 * local89 + 32 >> 6;
		}
		return local28;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!t;I[IIB)Z")
	public boolean method2289(@OriginalArg(0) Class3_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0.anInt3430 = Static149.anInt3584 / 100;
		if (arg0.anInt3433 >= 0 && (arg0.aClass3_Sub5_Sub4_3 == null || arg0.aClass3_Sub5_Sub4_3.method2783())) {
			arg0.method2489();
			arg0.method2900();
			if (arg0.anInt3420 > 0 && arg0 == this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420]) {
				this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt3425;
		@Pc(66) boolean local66 = false;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray353[arg0.anInt3418] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt3425 = local56;
		}
		arg0.aClass3_Sub5_Sub4_3.method2776(this.method2284(arg0));
		arg0.anInt3414++;
		@Pc(127) double local127 = (double) ((arg0.anInt3425 * arg0.anInt3417 >> 12) + (arg0.anInt3422 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(130) Class66 local130 = arg0.aClass66_1;
		arg0.anInt3415 += local130.anInt3011;
		if (local130.anInt3015 > 0) {
			if (local130.anInt3022 > 0) {
				arg0.anInt3429 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt3022) * 128.0D + 0.5D);
			} else {
				arg0.anInt3429 += 128;
			}
			if (local130.anInt3015 * arg0.anInt3429 >= 819200) {
				local66 = true;
			}
		}
		if (local130.aByteArray36 != null) {
			if (local130.anInt3016 <= 0) {
				arg0.anInt3421 += 128;
			} else {
				arg0.anInt3421 += (int) (Math.pow(2.0D, (double) local130.anInt3016 * local127) * 128.0D + 0.5D);
			}
			while (arg0.anInt3428 < local130.aByteArray36.length - 2 && (local130.aByteArray36[arg0.anInt3428 + 2] & 0xFF) << 8 < arg0.anInt3421) {
				arg0.anInt3428 += 2;
			}
			if (arg0.anInt3428 == local130.aByteArray36.length - 2 && local130.aByteArray36[arg0.anInt3428 + 1] == 0) {
				local66 = true;
			}
		}
		if (arg0.anInt3433 >= 0 && local130.aByteArray37 != null && (this.anIntArray362[arg0.anInt3418] & 0x1) == 0 && (arg0.anInt3420 < 0 || arg0 != this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420])) {
			if (local130.anInt3019 <= 0) {
				arg0.anInt3433 += 128;
			} else {
				arg0.anInt3433 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt3019) * 128.0D + 0.5D);
			}
			while (local130.aByteArray37.length - 2 > arg0.anInt3431 && arg0.anInt3433 > (local130.aByteArray37[arg0.anInt3431 + 2] & 0xFF) << 8) {
				arg0.anInt3431 += 2;
			}
			if (arg0.anInt3431 == local130.aByteArray37.length - 2) {
				local66 = true;
			}
		}
		if (!local66) {
			arg0.aClass3_Sub5_Sub4_3.method2810(arg0.anInt3430, this.method2288(arg0), this.method2290(arg0));
			return false;
		}
		arg0.aClass3_Sub5_Sub4_3.method2790(arg0.anInt3430);
		if (arg2 == null) {
			arg0.aClass3_Sub5_Sub4_3.method2769(arg1);
		} else {
			arg0.aClass3_Sub5_Sub4_3.method2773(arg2, arg3, arg1);
		}
		if (arg0.aClass3_Sub5_Sub4_3.method2796()) {
			this.aClass3_Sub5_Sub1_1.aClass3_Sub5_Sub3_1.method2455(arg0.aClass3_Sub5_Sub4_3);
		}
		arg0.method2489();
		if (arg0.anInt3433 >= 0) {
			arg0.method2900();
			if (arg0.anInt3420 > 0 && arg0 == this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420]) {
				this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2770() {
		return 0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!t;Z)I")
	private int method2290(@OriginalArg(0) Class3_Sub23 arg0) {
		@Pc(15) int local15 = this.anIntArray358[arg0.anInt3418];
		return local15 < 8192 ? local15 * arg0.anInt3413 + 32 >> 6 : 16384 - ((128 - arg0.anInt3413) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	private void method2291(@OriginalArg(0) int arg0) {
		if ((this.anIntArray362[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(30) Class3_Sub23 local30 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1731(); local30 != null; local30 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1734()) {
			if (local30.anInt3418 == arg0) {
				local30.anInt3426 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V")
	private void method2292() {
		this.method2300(-1);
		this.method2303(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray367[local21] = this.anIntArray361[local21];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray365[local37] = this.anIntArray361[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Lclient!t;I)Z")
	public boolean method2293(@OriginalArg(0) Class3_Sub23 arg0) {
		if (arg0.aClass3_Sub5_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt3433 >= 0) {
			arg0.method2900();
			if (arg0.anInt3420 > 0 && arg0 == this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420]) {
				this.aClass3_Sub23ArrayArray2[arg0.anInt3418][arg0.anInt3420] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!jg;Lclient!of;ZILclient!sa;)Z")
	public synchronized boolean method2294(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(4) Class3_Sub21 arg2) {
		arg2.method2400();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class3_Sub19 local29 = (Class3_Sub19) arg2.aClass54_12.method1598(); local29 != null; local29 = (Class3_Sub19) arg2.aClass54_12.method1609()) {
			@Pc(35) int local35 = (int) local29.aLong143;
			@Pc(43) Class3_Sub22 local43 = (Class3_Sub22) this.aClass54_11.method1602((long) local35);
			if (local43 == null) {
				local43 = Static28.method485(arg0, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass54_11.method1603((long) local35, local43);
			}
			if (!local43.method2408(arg1, local23, local29.aByteArray38)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2401();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "()Lclient!le;")
	@Override
	public synchronized Class3_Sub5 method2774() {
		return this.aClass3_Sub5_Sub1_1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILclient!t;)V")
	public void method2295(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		@Pc(12) int local12 = arg1.aClass3_Sub9_Sub1_1.aByteArray48.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass3_Sub9_Sub1_1.aBoolean169) {
			@Pc(42) int local42 = local12 + local12 - arg1.aClass3_Sub9_Sub1_1.anInt3890;
			local31 = (int) ((long) local42 * (long) this.anIntArray357[arg1.anInt3418] >> 6);
			local12 <<= 0x8;
			if (local31 >= local12) {
				local31 = local12 + local12 - local31 - 1;
				arg1.aClass3_Sub5_Sub4_3.method2782();
			}
		} else {
			local31 = (int) ((long) this.anIntArray357[arg1.anInt3418] * (long) local12 >> 6);
		}
		arg1.aClass3_Sub5_Sub4_3.method2798(local31);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!sa;ZI)V")
	public synchronized void method2296(@OriginalArg(0) Class3_Sub21 arg0, @OriginalArg(1) boolean arg1) {
		this.method2310();
		this.aClass81_1.method2628(arg0.aByteArray40);
		this.aLong107 = 0L;
		this.aBoolean133 = arg1;
		@Pc(23) int local23 = this.aClass81_1.method2621();
		for (@Pc(29) int local29 = 0; local29 < local23; local29++) {
			this.aClass81_1.method2619(local29);
			this.aClass81_1.method2613(local29);
			this.aClass81_1.method2626(local29);
		}
		this.anInt3182 = this.aClass81_1.method2615();
		this.anInt3181 = this.aClass81_1.anIntArray410[this.anInt3182];
		this.aLong106 = this.aClass81_1.method2624(this.anInt3181);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	private void method2297(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub23 local12 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1731(); local12 != null; local12 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1734()) {
			if ((arg0 < 0 || local12.anInt3418 == arg0) && local12.anInt3433 < 0) {
				this.aClass3_Sub23ArrayArray1[local12.anInt3418][local12.anInt3422] = null;
				local12.anInt3433 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
	public synchronized void method2298() {
		for (@Pc(11) Class3_Sub22 local11 = (Class3_Sub22) this.aClass54_11.method1598(); local11 != null; local11 = (Class3_Sub22) this.aClass54_11.method1609()) {
			local11.method2900();
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public synchronized void method2299() {
		this.method2305();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(ZI)V")
	private void method2300(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub23 local16 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1731(); local16 != null; local16 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1734()) {
			if (arg0 < 0 || local16.anInt3418 == arg0) {
				if (local16.aClass3_Sub5_Sub4_3 != null) {
					local16.aClass3_Sub5_Sub4_3.method2790(Static149.anInt3584 / 100);
					if (local16.aClass3_Sub5_Sub4_3.method2796()) {
						this.aClass3_Sub5_Sub1_1.aClass3_Sub5_Sub3_1.method2455(local16.aClass3_Sub5_Sub4_3);
					}
					local16.method2489();
				}
				if (local16.anInt3433 < 0) {
					this.aClass3_Sub23ArrayArray1[local16.anInt3418][local16.anInt3422] = null;
				}
				local16.method2900();
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
	private void method2301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBI)V")
	private void method2302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray367[arg1]) {
			this.anIntArray367[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub23ArrayArray2[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)V")
	private void method2303(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2303(local12);
			}
			return;
		}
		this.anIntArray359[arg0] = 12800;
		this.anIntArray358[arg0] = 8192;
		this.anIntArray356[arg0] = 16383;
		this.anIntArray368[arg0] = 8192;
		this.anIntArray355[arg0] = 0;
		this.anIntArray353[arg0] = 8192;
		this.method2308(arg0);
		this.method2291(arg0);
		this.anIntArray362[arg0] = 0;
		this.anIntArray364[arg0] = 32767;
		this.anIntArray366[arg0] = 256;
		this.anIntArray357[arg0] = 0;
		this.method2304(8192, arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)V")
	private void method2304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray354[arg1] = arg0;
		this.anIntArray360[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(III)V")
	private void method2305() {
		this.anIntArray361[9] = 128;
		this.anIntArray365[9] = 128;
		this.method2302(128, 9);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(Z)I")
	public int method2306() {
		return this.anInt3149;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(III)V")
	private void method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray368[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass81_1.method2627()) {
			@Pc(14) int local14 = this.aClass81_1.anInt3631 * this.anInt3172 / Static149.anInt3584;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong107;
				if (this.aLong106 - local23 >= 0L) {
					this.aLong107 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong106 + (long) local14 - this.aLong107 - 1L) / (long) local14);
				arg2 -= local55;
				this.aLong107 += (long) local55 * (long) local14;
				this.aClass3_Sub5_Sub1_1.method2773(arg0, arg1, local55);
				this.method2313();
				arg1 += local55;
			} while (this.aClass81_1.method2627());
		}
		this.aClass3_Sub5_Sub1_1.method2773(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)V")
	private void method2308(@OriginalArg(1) int arg0) {
		if ((this.anIntArray362[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub23 local22 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1731(); local22 != null; local22 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1734()) {
			if (arg0 == local22.anInt3418 && this.aClass3_Sub23ArrayArray1[arg0][local22.anInt3422] == null && local22.anInt3433 < 0) {
				local22.anInt3433 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZII)V")
	private void method2309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class3_Sub23 local18 = this.aClass3_Sub23ArrayArray1[arg0][arg2];
		if (local18 == null) {
			return;
		}
		this.aClass3_Sub23ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray362[arg0] & 0x2) == 0) {
			local18.anInt3433 = 0;
			return;
		}
		for (@Pc(45) Class3_Sub23 local45 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1731(); local45 != null; local45 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1734()) {
			if (local18.anInt3418 == local45.anInt3418 && local45.anInt3433 < 0 && local18 != local45) {
				local18.anInt3433 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(B)V")
	public synchronized void method2310() {
		this.aClass81_1.method2618();
		this.method2292();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	private void method2312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2309(arg0, 64, arg1);
		if ((this.anIntArray362[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub23 local25 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1737(); local25 != null; local25 = (Class3_Sub23) this.aClass3_Sub5_Sub1_1.aClass59_2.method1732()) {
				if (local25.anInt3418 == arg0 && local25.anInt3433 < 0) {
					this.aClass3_Sub23ArrayArray1[arg0][local25.anInt3422] = null;
					this.aClass3_Sub23ArrayArray1[arg0][arg1] = local25;
					@Pc(60) int local60 = local25.anInt3419 + (local25.anInt3417 * local25.anInt3425 >> 12);
					local25.anInt3425 = 4096;
					local25.anInt3419 += arg1 - local25.anInt3422 << 8;
					local25.anInt3417 = local60 - local25.anInt3419;
					local25.anInt3422 = arg1;
					return;
				}
			}
		}
		@Pc(105) Class3_Sub22 local105 = (Class3_Sub22) this.aClass54_11.method1602((long) this.anIntArray367[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class3_Sub9_Sub1 local113 = local105.aClass3_Sub9_Sub1Array1[arg1];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class3_Sub23 local120 = new Class3_Sub23();
		local120.anInt3418 = arg0;
		local120.aClass3_Sub9_Sub1_1 = local113;
		local120.aClass3_Sub22_1 = local105;
		local120.aClass66_1 = local105.aClass66Array1[arg1];
		local120.anInt3420 = local105.aByteArray42[arg1];
		local120.anInt3422 = arg1;
		local120.anInt3427 = local105.aByteArray43[arg1] * local105.anInt3296 * arg2 * arg2 + 1024 >> 11;
		local120.anInt3413 = local105.aByteArray41[arg1] & 0xFF;
		local120.anInt3419 = (arg1 << 8) - (local105.aShortArray30[arg1] & 0x7FFF);
		local120.anInt3421 = 0;
		local120.anInt3433 = -1;
		local120.anInt3429 = 0;
		local120.anInt3428 = 0;
		local120.anInt3431 = 0;
		if (this.anIntArray357[arg0] == 0) {
			local120.aClass3_Sub5_Sub4_3 = Static189.method2794(local113, this.method2284(local120), this.method2288(local120), this.method2290(local120));
		} else {
			local120.aClass3_Sub5_Sub4_3 = Static189.method2794(local113, this.method2284(local120), 0, this.method2290(local120));
			this.method2295(local105.aShortArray30[arg1] < 0, local120);
		}
		if (local105.aShortArray30[arg1] < 0) {
			local120.aClass3_Sub5_Sub4_3.method2785(-1);
		}
		if (local120.anInt3420 >= 0) {
			@Pc(279) Class3_Sub23 local279 = this.aClass3_Sub23ArrayArray2[arg0][local120.anInt3420];
			if (local279 != null && local279.anInt3433 < 0) {
				this.aClass3_Sub23ArrayArray1[arg0][local279.anInt3422] = null;
				local279.anInt3433 = 0;
			}
			this.aClass3_Sub23ArrayArray2[arg0][local120.anInt3420] = local120;
		}
		this.aClass3_Sub5_Sub1_1.aClass59_2.method1730(local120);
		this.aClass3_Sub23ArrayArray1[arg0][arg1] = local120;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	private void method2313() {
		@Pc(8) long local8 = this.aLong106;
		@Pc(11) int local11 = this.anInt3181;
		@Pc(14) int local14 = this.anInt3182;
		while (local11 == this.anInt3181) {
			while (local11 == this.aClass81_1.anIntArray410[local14]) {
				this.aClass81_1.method2619(local14);
				@Pc(25) int local25 = this.aClass81_1.method2623(local14);
				if (local25 == 1) {
					this.aClass81_1.method2617();
					this.aClass81_1.method2626(local14);
					if (this.aClass81_1.method2620()) {
						if (!this.aBoolean133 || local11 == 0) {
							this.method2292();
							this.aClass81_1.method2618();
							return;
						}
						this.aClass81_1.method2616(local8);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2283(local25);
				}
				this.aClass81_1.method2613(local14);
				this.aClass81_1.method2626(local14);
			}
			local14 = this.aClass81_1.method2615();
			local11 = this.aClass81_1.anIntArray410[local14];
			local8 = this.aClass81_1.method2624(local11);
		}
		this.anInt3181 = local11;
		this.aLong106 = local8;
		this.anInt3182 = local14;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "()Lclient!le;")
	@Override
	public synchronized Class3_Sub5 method2775() {
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIB)V")
	private void method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(II)V")
	public synchronized void method2315(@OriginalArg(1) int arg0) {
		this.anInt3149 = arg0;
	}
}
