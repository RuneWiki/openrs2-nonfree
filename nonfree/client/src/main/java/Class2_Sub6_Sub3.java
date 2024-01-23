import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pg", name = "Mb", descriptor = "J")
	private long aLong109;

	@OriginalMember(owner = "client!pg", name = "Nb", descriptor = "I")
	private int anInt3550;

	@OriginalMember(owner = "client!pg", name = "Ob", descriptor = "J")
	private long aLong110;

	@OriginalMember(owner = "client!pg", name = "Pb", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!pg", name = "Qb", descriptor = "I")
	private int anInt3551;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "[I")
	public int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "[I")
	private int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "[I")
	private int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!pg", name = "V", descriptor = "[I")
	private int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "[I")
	private int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "[I")
	private int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!pg", name = "lb", descriptor = "[I")
	private int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "[I")
	private int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
	private int anInt3519 = 1000000;

	@OriginalMember(owner = "client!pg", name = "fb", descriptor = "[I")
	public int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Cb", descriptor = "[I")
	private int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!pg", name = "R", descriptor = "[I")
	private int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Hb", descriptor = "[I")
	private int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!pg", name = "wb", descriptor = "[[Lclient!lg;")
	private Class2_Sub15[][] aClass2_Sub15ArrayArray2 = new Class2_Sub15[16][128];

	@OriginalMember(owner = "client!pg", name = "Gb", descriptor = "[I")
	private int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!pg", name = "sb", descriptor = "[[Lclient!lg;")
	private Class2_Sub15[][] aClass2_Sub15ArrayArray1 = new Class2_Sub15[16][128];

	@OriginalMember(owner = "client!pg", name = "jb", descriptor = "[I")
	public int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Jb", descriptor = "[I")
	private int[] anIntArray370 = new int[16];

	@OriginalMember(owner = "client!pg", name = "Kb", descriptor = "I")
	private int anInt3549 = 256;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!df;")
	private Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!pg", name = "Lb", descriptor = "Lclient!jg;")
	private Class2_Sub6_Sub1 aClass2_Sub6_Sub1_1 = new Class2_Sub6_Sub1(this);

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "Lclient!ob;")
	private Class70 aClass70_14 = new Class70(128);

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub3() {
		this.method2457();
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public synchronized Class2_Sub6 method3091() {
		return this.aClass2_Sub6_Sub1_1;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public synchronized void method2439() {
		for (@Pc(11) Class2_Sub25 local11 = (Class2_Sub25) this.aClass70_14.method2203(); local11 != null; local11 = (Class2_Sub25) this.aClass70_14.method2204()) {
			local11.method3314();
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	private void method2440(@OriginalArg(1) int arg0) {
		if ((this.anIntArray356[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub15 local24 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3322(); local24 != null; local24 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3331()) {
			if (arg0 == local24.anInt2708) {
				local24.anInt2712 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!nj;Lclient!ic;ILclient!nb;)Z")
	public synchronized boolean method2441(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class2_Sub14 arg1, @OriginalArg(4) Class15 arg2) {
		arg1.method1459();
		@Pc(11) boolean local11 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class2_Sub17 local27 = (Class2_Sub17) arg1.aClass70_4.method2203(); local27 != null; local27 = (Class2_Sub17) arg1.aClass70_4.method2204()) {
			@Pc(33) int local33 = (int) local27.aLong150;
			@Pc(41) Class2_Sub25 local41 = (Class2_Sub25) this.aClass70_14.method2205((long) local33);
			if (local41 == null) {
				local41 = Static158.method2573(arg2, local33);
				if (local41 == null) {
					local11 = false;
					continue;
				}
				this.aClass70_14.method2208((long) local33, local41);
			}
			if (!local41.method2875(local21, arg0, local27.aByteArray45)) {
				local11 = false;
			}
		}
		if (local11) {
			arg1.method1460();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIILclient!lg;)Z")
	public boolean method2442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub15 arg3) {
		arg3.anInt2695 = Static10.anInt374 / 100;
		if (arg3.anInt2709 >= 0 && (arg3.aClass2_Sub6_Sub2_1 == null || arg3.aClass2_Sub6_Sub2_1.method2303())) {
			arg3.method1911();
			arg3.method3314();
			if (arg3.anInt2707 > 0 && arg3 == this.aClass2_Sub15ArrayArray2[arg3.anInt2708][arg3.anInt2707]) {
				this.aClass2_Sub15ArrayArray2[arg3.anInt2708][arg3.anInt2707] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt2710;
		@Pc(58) boolean local58 = false;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray360[arg3.anInt2708] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt2710 = local56;
		}
		arg3.aClass2_Sub6_Sub2_1.method2288(this.method2455(arg3));
		@Pc(100) Class57 local100 = arg3.aClass57_1;
		arg3.anInt2711++;
		@Pc(124) double local124 = (double) ((arg3.anInt2710 * arg3.anInt2713 >> 12) + (arg3.anInt2704 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt2703 += local100.anInt2594;
		if (local100.anInt2593 > 0) {
			if (local100.anInt2592 > 0) {
				arg3.anInt2699 += (int) (Math.pow(2.0D, local124 * (double) local100.anInt2592) * 128.0D + 0.5D);
			} else {
				arg3.anInt2699 += 128;
			}
			if (local100.anInt2593 * arg3.anInt2699 >= 819200) {
				local58 = true;
			}
		}
		if (local100.aByteArray34 != null) {
			if (local100.anInt2600 <= 0) {
				arg3.anInt2705 += 128;
			} else {
				arg3.anInt2705 += (int) (Math.pow(2.0D, local124 * (double) local100.anInt2600) * 128.0D + 0.5D);
			}
			while (local100.aByteArray34.length - 2 > arg3.anInt2702 && arg3.anInt2705 > (local100.aByteArray34[arg3.anInt2702 + 2] & 0xFF) << 8) {
				arg3.anInt2702 += 2;
			}
			if (arg3.anInt2702 == local100.aByteArray34.length - 2 && local100.aByteArray34[arg3.anInt2702 + 1] == 0) {
				local58 = true;
			}
		}
		if (arg3.anInt2709 >= 0 && local100.aByteArray33 != null && (this.anIntArray356[arg3.anInt2708] & 0x1) == 0 && (arg3.anInt2707 < 0 || arg3 != this.aClass2_Sub15ArrayArray2[arg3.anInt2708][arg3.anInt2707])) {
			if (local100.anInt2597 > 0) {
				arg3.anInt2709 += (int) (Math.pow(2.0D, local124 * (double) local100.anInt2597) * 128.0D + 0.5D);
			} else {
				arg3.anInt2709 += 128;
			}
			while (local100.aByteArray33.length - 2 > arg3.anInt2700 && (local100.aByteArray33[arg3.anInt2700 + 2] & 0xFF) << 8 < arg3.anInt2709) {
				arg3.anInt2700 += 2;
			}
			if (local100.aByteArray33.length - 2 == arg3.anInt2700) {
				local58 = true;
			}
		}
		if (!local58) {
			arg3.aClass2_Sub6_Sub2_1.method2275(arg3.anInt2695, this.method2450(arg3), this.method2448(arg3));
			return false;
		}
		arg3.aClass2_Sub6_Sub2_1.method2269(arg3.anInt2695);
		if (arg0 == null) {
			arg3.aClass2_Sub6_Sub2_1.method3090(arg1);
		} else {
			arg3.aClass2_Sub6_Sub2_1.method3085(arg0, arg2, arg1);
		}
		if (arg3.aClass2_Sub6_Sub2_1.method2304()) {
			this.aClass2_Sub6_Sub1_1.aClass2_Sub6_Sub4_1.method3094(arg3.aClass2_Sub6_Sub2_1);
		}
		arg3.method1911();
		if (arg3.anInt2709 >= 0) {
			arg3.method3314();
			if (arg3.anInt2707 > 0 && arg3 == this.aClass2_Sub15ArrayArray2[arg3.anInt2708][arg3.anInt2707]) {
				this.aClass2_Sub15ArrayArray2[arg3.anInt2708][arg3.anInt2707] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	private void method2443() {
		@Pc(15) int local15 = this.anInt3550;
		@Pc(18) int local18 = this.anInt3551;
		@Pc(21) long local21 = this.aLong110;
		while (local15 == this.anInt3550) {
			while (this.aClass25_1.anIntArray72[local18] == local15) {
				this.aClass25_1.method700(local18);
				@Pc(32) int local32 = this.aClass25_1.method710(local18);
				if (local32 == 1) {
					this.aClass25_1.method712();
					this.aClass25_1.method698(local18);
					if (this.aClass25_1.method699()) {
						if (!this.aBoolean202 || local15 == 0) {
							this.method2457();
							this.aClass25_1.method704();
							return;
						}
						this.aClass25_1.method703(local21);
					}
					break;
				}
				if ((local32 & 0x80) != 0) {
					this.method2452(local32);
				}
				this.aClass25_1.method713(local18);
				this.aClass25_1.method698(local18);
			}
			local18 = this.aClass25_1.method711();
			local15 = this.aClass25_1.anIntArray72[local18];
			local21 = this.aClass25_1.method701(local15);
		}
		this.anInt3551 = local18;
		this.anInt3550 = local15;
		this.aLong110 = local21;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ic;Z)V")
	public synchronized void method2444(@OriginalArg(1) Class2_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		this.method2467();
		this.aClass25_1.method709(arg0.aByteArray28);
		this.aLong109 = 0;
		this.aBoolean202 = arg1;
		@Pc(24) int local24 = this.aClass25_1.method705();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass25_1.method700(local26);
			this.aClass25_1.method713(local26);
			this.aClass25_1.method698(local26);
		}
		this.anInt3551 = this.aClass25_1.method711();
		this.anInt3550 = this.aClass25_1.anIntArray72[this.anInt3551];
		this.aLong110 = this.aClass25_1.method701(this.anInt3550);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public synchronized Class2_Sub6 method3086() {
		return null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)V")
	public synchronized void method2445(@OriginalArg(1) int arg0) {
		this.anInt3549 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)V")
	public synchronized void method2446() {
		for (@Pc(7) Class2_Sub25 local7 = (Class2_Sub25) this.aClass70_14.method2203(); local7 != null; local7 = (Class2_Sub25) this.aClass70_14.method2204()) {
			local7.method2879();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	private void method2447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray358[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!lg;Z)I")
	private int method2448(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(17) int local17 = this.anIntArray366[arg0.anInt2708];
		return local17 >= 8192 ? 16384 - ((16384 - local17) * (-arg0.anInt2714 + 128) + 32 >> 6) : local17 * arg0.anInt2714 + 32 >> 6;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V")
	private void method2449(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub15 local12 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3322(); local12 != null; local12 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3331()) {
			if ((arg0 < 0 || local12.anInt2708 == arg0) && local12.anInt2709 < 0) {
				this.aClass2_Sub15ArrayArray1[local12.anInt2708][local12.anInt2704] = null;
				local12.anInt2709 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3090(@OriginalArg(0) int arg0) {
		if (this.aClass25_1.method702()) {
			@Pc(14) int local14 = this.aClass25_1.anInt956 * this.anInt3519 / Static10.anInt374;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong109;
				if (this.aLong110 - local23 >= 0L) {
					this.aLong109 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong110 - this.aLong109 - 1L) / (long) local14);
				this.aLong109 += (long) local14 * (long) local52;
				arg0 -= local52;
				this.aClass2_Sub6_Sub1_1.method3090(local52);
				this.method2443();
			} while (this.aClass25_1.method702());
		}
		this.aClass2_Sub6_Sub1_1.method3090(arg0);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!lg;I)I")
	private int method2450(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(6) Class57 local6 = arg0.aClass57_1;
		@Pc(22) int local22 = this.anIntArray359[arg0.anInt2708] * this.anIntArray368[arg0.anInt2708] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(46) int local46 = local30 * arg0.anInt2706 + 16384 >> 15;
		local22 = this.anInt3549 * local46 + 128 >> 8;
		if (local6.anInt2593 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) local6.anInt2593 * (double) arg0.anInt2699 * 1.953125E-5D) + 0.5D);
		}
		@Pc(85) int local85;
		@Pc(93) int local93;
		@Pc(115) int local115;
		@Pc(127) int local127;
		if (local6.aByteArray34 != null) {
			local85 = arg0.anInt2705;
			local93 = local6.aByteArray34[arg0.anInt2702 + 1];
			if (arg0.anInt2702 < local6.aByteArray34.length - 2) {
				local115 = (local6.aByteArray34[arg0.anInt2702] & 0xFF) << 8;
				local127 = (local6.aByteArray34[arg0.anInt2702 + 2] & 0xFF) << 8;
				local93 += (local6.aByteArray34[arg0.anInt2702 + 3] - local93) * (local85 - local115) / (local127 - local115);
			}
			local22 = local93 * local22 + 32 >> 6;
		}
		if (arg0.anInt2709 > 0 && local6.aByteArray33 != null) {
			local93 = local6.aByteArray33[arg0.anInt2700 + 1];
			local85 = arg0.anInt2709;
			if (arg0.anInt2700 < local6.aByteArray33.length - 2) {
				local127 = (local6.aByteArray33[arg0.anInt2700 + 2] & 0xFF) << 8;
				local115 = (local6.aByteArray33[arg0.anInt2700] & 0xFF) << 8;
				local93 += (local6.aByteArray33[arg0.anInt2700 + 3] - local93) * (local85 - local115) / (local127 - local115);
			}
			local22 = local93 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(II)V")
	private void method2452(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(20) int local20;
		if (local5 == 128) {
			local20 = arg0 >> 16 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method2460(local20, local30, local24);
		} else if (local5 == 144) {
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local20 = arg0 >> 16 & 0x7F;
			if (local20 > 0) {
				this.method2466(local20, local24, local30);
			} else {
				this.method2460(64, local30, local24);
			}
		} else if (local5 == 160) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 16 & 0x7F;
			local30 = arg0 >> 8 & 0x7F;
			this.method2465(local20, local30, local24);
		} else if (local5 == 176) {
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local20 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray369[local24] = (this.anIntArray369[local24] & 0xFFE03FFF) + (local20 << 14);
			}
			if (local30 == 32) {
				this.anIntArray369[local24] = (this.anIntArray369[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 1) {
				this.anIntArray357[local24] = (local20 << 7) + (this.anIntArray357[local24] & 0xFFFFC07F);
			}
			if (local30 == 33) {
				this.anIntArray357[local24] = local20 + (this.anIntArray357[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray360[local24] = (local20 << 7) + (this.anIntArray360[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray360[local24] = (this.anIntArray360[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 7) {
				this.anIntArray368[local24] = (local20 << 7) + (this.anIntArray368[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray368[local24] = (this.anIntArray368[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 10) {
				this.anIntArray366[local24] = (local20 << 7) + (this.anIntArray366[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray366[local24] = local20 + (this.anIntArray366[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray359[local24] = (local20 << 7) + (this.anIntArray359[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray359[local24] = (this.anIntArray359[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 64) {
				if (local20 < 64) {
					this.anIntArray356[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray356[local24] |= 0x1;
				}
			}
			if (local30 == 65) {
				if (local20 >= 64) {
					this.anIntArray356[local24] |= 0x2;
				} else {
					this.method2463(local24);
					this.anIntArray356[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray370[local24] = (this.anIntArray370[local24] & 0x7F) + (local20 << 7);
			}
			if (local30 == 98) {
				this.anIntArray370[local24] = local20 + (this.anIntArray370[local24] & 0x3F80);
			}
			if (local30 == 101) {
				this.anIntArray370[local24] = (local20 << 7) + (this.anIntArray370[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray370[local24] = (this.anIntArray370[local24] & 0x3F80) + local20 + 16384;
			}
			if (local30 == 120) {
				this.method2462(local24);
			}
			if (local30 == 121) {
				this.method2461(local24);
			}
			if (local30 == 123) {
				this.method2449(local24);
			}
			@Pc(515) int local515;
			if (local30 == 6) {
				local515 = this.anIntArray370[local24];
				if (local515 == 16384) {
					this.anIntArray362[local24] = (local20 << 7) + (this.anIntArray362[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local515 = this.anIntArray370[local24];
				if (local515 == 16384) {
					this.anIntArray362[local24] = local20 + (this.anIntArray362[local24] & 0xFFFFFF80);
				}
			}
			if (local30 == 16) {
				this.anIntArray365[local24] = (this.anIntArray365[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 48) {
				this.anIntArray365[local24] = (this.anIntArray365[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 81) {
				if (local20 >= 64) {
					this.anIntArray356[local24] |= 0x4;
				} else {
					this.method2440(local24);
					this.anIntArray356[local24] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method2469((this.anIntArray363[local24] & 0xFFFFC07F) + (local20 << 7), local24);
			}
			if (local30 == 49) {
				this.method2469((this.anIntArray363[local24] & 0xFFFFFF80) + local20, local24);
			}
		} else if (local5 == 192) {
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			this.method2454(local24, this.anIntArray369[local24] + local30);
		} else if (local5 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method2464(local30, local24);
		} else if (local5 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F018F) >> 9);
			this.method2447(local24, local30);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method2457();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	private void method2453() {
		this.anIntArray361[9] = 128;
		this.anIntArray369[9] = 128;
		this.method2454(9, 128);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
	private void method2454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray367[arg0]) {
			this.anIntArray367[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass2_Sub15ArrayArray2[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!lg;I)I")
	private int method2455(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(14) int local14 = arg0.anInt2715 + (arg0.anInt2713 * arg0.anInt2710 >> 12);
		local14 += this.anIntArray362[arg0.anInt2708] * (this.anIntArray358[arg0.anInt2708] - 8192) >> 12;
		@Pc(35) Class57 local35 = arg0.aClass57_1;
		@Pc(55) int local55;
		if (local35.anInt2594 > 0 && (local35.anInt2596 > 0 || this.anIntArray357[arg0.anInt2708] > 0)) {
			local55 = local35.anInt2596 << 2;
			@Pc(60) int local60 = local35.anInt2595 << 1;
			if (local60 > arg0.anInt2711) {
				local55 = local55 * arg0.anInt2711 / local60;
			}
			local55 += this.anIntArray357[arg0.anInt2708] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt2703 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local55 * local90);
		}
		local55 = (int) ((double) (arg0.aClass2_Sub9_Sub1_1.anInt4357 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static10.anInt374 + 0.5D);
		return local55 >= 1 ? local55 : 1;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(B)I")
	public int method2456() {
		return this.anInt3549;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	private void method2457() {
		this.method2462(-1);
		this.method2461(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray367[local15] = this.anIntArray361[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray369[local33] = this.anIntArray361[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)Z")
	public synchronized boolean method2458() {
		return this.aClass25_1.method702();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BLclient!lg;)Z")
	public boolean method2459(@OriginalArg(1) Class2_Sub15 arg0) {
		if (arg0.aClass2_Sub6_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2709 >= 0) {
			arg0.method3314();
			if (arg0.anInt2707 > 0 && arg0 == this.aClass2_Sub15ArrayArray2[arg0.anInt2708][arg0.anInt2707]) {
				this.aClass2_Sub15ArrayArray2[arg0.anInt2708][arg0.anInt2707] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
	private void method2460(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub15 local16 = this.aClass2_Sub15ArrayArray1[arg2][arg1];
		if (local16 == null) {
			return;
		}
		this.aClass2_Sub15ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray356[arg2] & 0x2) == 0) {
			local16.anInt2709 = 0;
			return;
		}
		for (@Pc(40) Class2_Sub15 local40 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3322(); local40 != null; local40 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3331()) {
			if (local40.anInt2708 == local16.anInt2708 && local40.anInt2709 < 0 && local16 != local40) {
				local16.anInt2709 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(II)V")
	private void method2461(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2461(local9);
			}
			return;
		}
		this.anIntArray368[arg0] = 12800;
		this.anIntArray366[arg0] = 8192;
		this.anIntArray359[arg0] = 16383;
		this.anIntArray358[arg0] = 8192;
		this.anIntArray357[arg0] = 0;
		this.anIntArray360[arg0] = 8192;
		this.method2463(arg0);
		this.method2440(arg0);
		this.anIntArray356[arg0] = 0;
		this.anIntArray370[arg0] = 32767;
		this.anIntArray362[arg0] = 256;
		this.anIntArray365[arg0] = 0;
		this.method2469(8192, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(ZI)V")
	private void method2462(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub15 local12 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3322(); local12 != null; local12 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3331()) {
			if (arg0 < 0 || local12.anInt2708 == arg0) {
				if (local12.aClass2_Sub6_Sub2_1 != null) {
					local12.aClass2_Sub6_Sub2_1.method2269(Static10.anInt374 / 100);
					if (local12.aClass2_Sub6_Sub2_1.method2304()) {
						this.aClass2_Sub6_Sub1_1.aClass2_Sub6_Sub4_1.method3094(local12.aClass2_Sub6_Sub2_1);
					}
					local12.method1911();
				}
				if (local12.anInt2709 < 0) {
					this.aClass2_Sub15ArrayArray1[local12.anInt2708][local12.anInt2704] = null;
				}
				local12.method3314();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(II)V")
	private void method2463(@OriginalArg(0) int arg0) {
		if ((this.anIntArray356[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class2_Sub15 local27 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3322(); local27 != null; local27 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3331()) {
			if (local27.anInt2708 == arg0 && this.aClass2_Sub15ArrayArray1[arg0][local27.anInt2704] == null && local27.anInt2709 < 0) {
				local27.anInt2709 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass25_1.method702()) {
			@Pc(18) int local18 = this.aClass25_1.anInt956 * this.anInt3519 / Static10.anInt374;
			do {
				@Pc(28) long local28 = this.aLong109 + (long) arg2 * (long) local18;
				if (this.aLong110 - local28 >= 0L) {
					this.aLong109 = local28;
					break;
				}
				@Pc(60) int local60 = (int) ((this.aLong110 + (long) local18 - this.aLong109 - 1L) / (long) local18);
				this.aLong109 += (long) local18 * (long) local60;
				this.aClass2_Sub6_Sub1_1.method3085(arg0, arg1, local60);
				arg1 += local60;
				arg2 -= local60;
				this.method2443();
			} while (this.aClass25_1.method702());
		}
		this.aClass2_Sub6_Sub1_1.method3085(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(III)V")
	private void method2464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIZ)V")
	private void method2465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIII)V")
	private void method2466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2460(64, arg2, arg1);
		if ((this.anIntArray356[arg1] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub15 local25 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3324(); local25 != null; local25 = (Class2_Sub15) this.aClass2_Sub6_Sub1_1.aClass108_9.method3329()) {
				if (local25.anInt2708 == arg1 && local25.anInt2709 < 0) {
					this.aClass2_Sub15ArrayArray1[arg1][local25.anInt2704] = null;
					this.aClass2_Sub15ArrayArray1[arg1][arg2] = local25;
					@Pc(68) int local68 = local25.anInt2715 + (local25.anInt2710 * local25.anInt2713 >> 12);
					local25.anInt2710 = 4096;
					local25.anInt2715 += arg2 - local25.anInt2704 << 8;
					local25.anInt2704 = arg2;
					local25.anInt2713 = local68 - local25.anInt2715;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub25 local116 = (Class2_Sub25) this.aClass70_14.method2205((long) this.anIntArray367[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class2_Sub9_Sub1 local124 = local116.aClass2_Sub9_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class2_Sub15 local131 = new Class2_Sub15();
		local131.aClass2_Sub25_1 = local116;
		local131.anInt2708 = arg1;
		local131.aClass2_Sub9_Sub1_1 = local124;
		local131.aClass57_1 = local116.aClass57Array1[arg2];
		local131.anInt2707 = local116.aByteArray58[arg2];
		local131.anInt2704 = arg2;
		local131.anInt2706 = arg0 * arg0 * local116.anInt4181 * local116.aByteArray59[arg2] + 1024 >> 11;
		local131.anInt2714 = local116.aByteArray60[arg2] & 0xFF;
		local131.anInt2715 = (arg2 << 8) - (local116.aShortArray137[arg2] & 0x7FFF);
		local131.anInt2709 = -1;
		local131.anInt2699 = 0;
		local131.anInt2700 = 0;
		local131.anInt2705 = 0;
		local131.anInt2702 = 0;
		if (this.anIntArray365[arg1] == 0) {
			local131.aClass2_Sub6_Sub2_1 = Static226.method2281(local124, this.method2455(local131), this.method2450(local131), this.method2448(local131));
		} else {
			local131.aClass2_Sub6_Sub2_1 = Static226.method2281(local124, this.method2455(local131), 0, this.method2448(local131));
			this.method2470(local131, local116.aShortArray137[arg2] < 0);
		}
		if (local116.aShortArray137[arg2] < 0) {
			local131.aClass2_Sub6_Sub2_1.method2302(-1);
		}
		if (local131.anInt2707 >= 0) {
			@Pc(285) Class2_Sub15 local285 = this.aClass2_Sub15ArrayArray2[arg1][local131.anInt2707];
			if (local285 != null && local285.anInt2709 < 0) {
				this.aClass2_Sub15ArrayArray1[arg1][local285.anInt2704] = null;
				local285.anInt2709 = 0;
			}
			this.aClass2_Sub15ArrayArray2[arg1][local131.anInt2707] = local131;
		}
		this.aClass2_Sub6_Sub1_1.aClass108_9.method3334(local131);
		this.aClass2_Sub15ArrayArray1[arg1][arg2] = local131;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
	public synchronized void method2467() {
		this.aClass25_1.method704();
		this.method2457();
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(III)V")
	public synchronized void method2468() {
		this.method2453();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIZ)V")
	private void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray363[arg1] = arg0;
		this.anIntArray364[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!lg;ZI)V")
	public void method2470(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) int local10 = arg0.aClass2_Sub9_Sub1_1.aByteArray61.length;
		@Pc(46) int local46;
		if (arg1 && arg0.aClass2_Sub9_Sub1_1.aBoolean271) {
			@Pc(29) int local29 = local10 + local10 - arg0.aClass2_Sub9_Sub1_1.anInt4359;
			local10 <<= 0x8;
			local46 = (int) ((long) local29 * (long) this.anIntArray365[arg0.anInt2708] >> 6);
			if (local10 <= local46) {
				arg0.aClass2_Sub6_Sub2_1.method2294();
				local46 = local10 + local10 - local46 - 1;
			}
		} else {
			local46 = (int) ((long) this.anIntArray365[arg0.anInt2708] * (long) local10 >> 6);
		}
		arg0.aClass2_Sub6_Sub2_1.method2291(local46);
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
	@Override
	public synchronized int method3089() {
		return 0;
	}
}
