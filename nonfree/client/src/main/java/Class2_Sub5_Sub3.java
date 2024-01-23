import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class2_Sub5_Sub3 extends Class2_Sub5 {

	@OriginalMember(owner = "client!mg", name = "Ib", descriptor = "J")
	private long aLong171;

	@OriginalMember(owner = "client!mg", name = "Jb", descriptor = "I")
	private int anInt3382;

	@OriginalMember(owner = "client!mg", name = "Nb", descriptor = "I")
	private int anInt3385;

	@OriginalMember(owner = "client!mg", name = "Ob", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!mg", name = "Pb", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!mg", name = "Qb", descriptor = "Lclient!rl;")
	private Class2_Sub24 aClass2_Sub24_2;

	@OriginalMember(owner = "client!mg", name = "Rb", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!mg", name = "Sb", descriptor = "I")
	private int anInt3386;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "[[Lclient!wi;")
	private Class2_Sub33[][] aClass2_Sub33ArrayArray2 = new Class2_Sub33[16][128];

	@OriginalMember(owner = "client!mg", name = "J", descriptor = "[I")
	private int[] anIntArray243 = new int[16];

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "[I")
	private int[] anIntArray241 = new int[16];

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "[I")
	public int[] anIntArray244 = new int[16];

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	private int anInt3345 = 256;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "[[Lclient!wi;")
	private Class2_Sub33[][] aClass2_Sub33ArrayArray1 = new Class2_Sub33[16][128];

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "[I")
	private int[] anIntArray239 = new int[16];

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "[I")
	private int[] anIntArray242 = new int[16];

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "[I")
	private int[] anIntArray246 = new int[16];

	@OriginalMember(owner = "client!mg", name = "db", descriptor = "[I")
	private int[] anIntArray247 = new int[16];

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "[I")
	private int[] anIntArray238 = new int[16];

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[I")
	private int[] anIntArray237 = new int[16];

	@OriginalMember(owner = "client!mg", name = "sb", descriptor = "[I")
	public int[] anIntArray249 = new int[16];

	@OriginalMember(owner = "client!mg", name = "kb", descriptor = "[I")
	private int[] anIntArray248 = new int[16];

	@OriginalMember(owner = "client!mg", name = "vb", descriptor = "I")
	private int anInt3372 = 1000000;

	@OriginalMember(owner = "client!mg", name = "zb", descriptor = "[I")
	private int[] anIntArray251 = new int[16];

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "[I")
	private int[] anIntArray240 = new int[16];

	@OriginalMember(owner = "client!mg", name = "Ab", descriptor = "[I")
	private int[] anIntArray252 = new int[16];

	@OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
	public int[] anIntArray245 = new int[16];

	@OriginalMember(owner = "client!mg", name = "yb", descriptor = "[I")
	private int[] anIntArray250 = new int[16];

	@OriginalMember(owner = "client!mg", name = "lb", descriptor = "Lclient!na;")
	private Class117 aClass117_1 = new Class117();

	@OriginalMember(owner = "client!mg", name = "Lb", descriptor = "Lclient!q;")
	private Class2_Sub5_Sub4 aClass2_Sub5_Sub4_1 = new Class2_Sub5_Sub4(this);

	@OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lclient!ii;")
	private Class79 aClass79_15 = new Class79(128);

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
	public Class2_Sub5_Sub3() {
		this.method2743();
		this.method2755(true);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method2737() {
		return this.aClass117_1.method2875();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZI)V")
	private void method2738() {
		this.anIntArray243[9] = 128;
		this.anIntArray242[9] = 128;
		this.method2740(9, 128);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	private void method2739(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub33 local8 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method13(); local8 != null; local8 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method9()) {
			if (arg0 < 0 || local8.anInt6124 == arg0) {
				if (local8.aClass2_Sub5_Sub2_3 != null) {
					local8.aClass2_Sub5_Sub2_3.method1808(Static110.anInt2380 / 100);
					if (local8.aClass2_Sub5_Sub2_3.method1810()) {
						this.aClass2_Sub5_Sub4_1.aClass2_Sub5_Sub1_2.method403(local8.aClass2_Sub5_Sub2_3);
					}
					local8.method4872();
				}
				if (local8.anInt6117 < 0) {
					this.aClass2_Sub33ArrayArray2[local8.anInt6124][local8.anInt6102] = null;
				}
				local8.method4926();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)V")
	private void method2740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray248[arg0]) {
			this.anIntArray248[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub33ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZIZLclient!rl;)V")
	private synchronized void method2741(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub24 arg2) {
		this.method2765(arg1);
		this.aClass117_1.method2884(arg2.aByteArray58);
		this.aLong171 = 0L;
		this.aBoolean273 = arg0;
		@Pc(28) int local28 = this.aClass117_1.method2879();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass117_1.method2882(local30);
			this.aClass117_1.method2881(local30);
			this.aClass117_1.method2885(local30);
		}
		this.anInt3382 = this.aClass117_1.method2888();
		this.anInt3385 = this.aClass117_1.anIntArray287[this.anInt3382];
		this.aLong172 = this.aClass117_1.method2889(this.anInt3385);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	private void method2742(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub33 local10 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method13(); local10 != null; local10 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method9()) {
			if ((arg0 < 0 || local10.anInt6124 == arg0) && local10.anInt6117 < 0) {
				this.aClass2_Sub33ArrayArray2[local10.anInt6124][local10.anInt6102] = null;
				local10.anInt6117 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)V")
	private synchronized void method2743() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray252[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!rl;ZZ)V")
	public synchronized void method2744(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) boolean arg1) {
		this.method2741(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3549() {
		return 0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V")
	private void method2745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2746(arg1, arg2, 64);
		if ((this.anIntArray245[arg1] & 0x2) != 0) {
			for (@Pc(29) Class2_Sub33 local29 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method4(); local29 != null; local29 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method2()) {
				if (local29.anInt6124 == arg1 && local29.anInt6117 < 0) {
					this.aClass2_Sub33ArrayArray2[arg1][local29.anInt6102] = null;
					this.aClass2_Sub33ArrayArray2[arg1][arg2] = local29;
					@Pc(69) int local69 = (local29.anInt6114 * local29.anInt6113 >> 12) + local29.anInt6119;
					local29.anInt6119 += arg2 - local29.anInt6102 << 8;
					local29.anInt6114 = 4096;
					local29.anInt6102 = arg2;
					local29.anInt6113 = local69 - local29.anInt6119;
					return;
				}
			}
		}
		@Pc(115) Class2_Sub14 local115 = (Class2_Sub14) this.aClass79_15.method2002((long) this.anIntArray248[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(124) Class2_Sub9_Sub1 local124 = local115.aClass2_Sub9_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(132) Class2_Sub33 local132 = new Class2_Sub33();
		local132.anInt6124 = arg1;
		local132.aClass2_Sub14_1 = local115;
		local132.aClass2_Sub9_Sub1_1 = local124;
		local132.aClass170_1 = local115.aClass170Array1[arg2];
		local132.anInt6123 = local115.aByteArray19[arg2];
		local132.anInt6102 = arg2;
		local132.anInt6103 = local115.aByteArray20[arg2] * local115.anInt1992 * arg0 * arg0 + 1024 >> 11;
		local132.anInt6110 = local115.aByteArray18[arg2] & 0xFF;
		local132.anInt6119 = (arg2 << 8) - (local115.aShortArray38[arg2] & 0x7FFF);
		local132.anInt6109 = 0;
		local132.anInt6117 = -1;
		local132.anInt6122 = 0;
		local132.anInt6105 = 0;
		local132.anInt6104 = 0;
		if (this.anIntArray244[arg1] == 0) {
			local132.aClass2_Sub5_Sub2_3 = Static306.method1815(local124, this.method2760(local132), this.method2763(local132), this.method2764(local132));
		} else {
			local132.aClass2_Sub5_Sub2_3 = Static306.method1815(local124, this.method2760(local132), 0, this.method2764(local132));
			this.method2750(local115.aShortArray38[arg2] < 0, local132);
		}
		if (local115.aShortArray38[arg2] < 0) {
			local132.aClass2_Sub5_Sub2_3.method1794(-1);
		}
		if (local132.anInt6123 >= 0) {
			@Pc(291) Class2_Sub33 local291 = this.aClass2_Sub33ArrayArray1[arg1][local132.anInt6123];
			if (local291 != null && local291.anInt6117 < 0) {
				this.aClass2_Sub33ArrayArray2[arg1][local291.anInt6102] = null;
				local291.anInt6117 = 0;
			}
			this.aClass2_Sub33ArrayArray1[arg1][local132.anInt6123] = local132;
		}
		this.aClass2_Sub5_Sub4_1.aClass1_16.method11(local132);
		this.aClass2_Sub33ArrayArray2[arg1][arg2] = local132;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()Lclient!md;")
	@Override
	public synchronized Class2_Sub5 method3548() {
		return this.aClass2_Sub5_Sub4_1;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IIII)V")
	private void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub33 local12 = this.aClass2_Sub33ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub33ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray245[arg0] & 0x2) == 0) {
			local12.anInt6117 = 0;
			return;
		}
		for (@Pc(36) Class2_Sub33 local36 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method13(); local36 != null; local36 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method9()) {
			if (local12.anInt6124 == local36.anInt6124 && local36.anInt6117 < 0 && local12 != local36) {
				local12.anInt6117 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V")
	private void method2747(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(32) int local32;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local13 == 128) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local32 = arg0 & 0xF;
			this.method2746(local32, local22, local28);
		} else if (local13 == 144) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2746(local32, local22, 64);
			} else {
				this.method2745(local28, local32, local22);
			}
		} else if (local13 == 160) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2751(local22, local32, local28);
		} else if (local13 == 176) {
			local32 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local22 == 0) {
				this.anIntArray242[local32] = (this.anIntArray242[local32] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray242[local32] = (this.anIntArray242[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray237[local32] = (local28 << 7) + (this.anIntArray237[local32] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray237[local32] = (this.anIntArray237[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray238[local32] = (local28 << 7) + (this.anIntArray238[local32] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray238[local32] = local28 + (this.anIntArray238[local32] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray250[local32] = (this.anIntArray250[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray250[local32] = (this.anIntArray250[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray239[local32] = (local28 << 7) + (this.anIntArray239[local32] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray239[local32] = (this.anIntArray239[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray240[local32] = (local28 << 7) + (this.anIntArray240[local32] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray240[local32] = local28 + (this.anIntArray240[local32] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray245[local32] |= 0x1;
				} else {
					this.anIntArray245[local32] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray245[local32] |= 0x2;
				} else {
					this.method2757(local32);
					this.anIntArray245[local32] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray241[local32] = (local28 << 7) + (this.anIntArray241[local32] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray241[local32] = (this.anIntArray241[local32] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray241[local32] = (this.anIntArray241[local32] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray241[local32] = local28 + (this.anIntArray241[local32] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2739(local32);
			}
			if (local22 == 121) {
				this.method2771(local32);
			}
			if (local22 == 123) {
				this.method2742(local32);
			}
			@Pc(514) int local514;
			if (local22 == 6) {
				local514 = this.anIntArray241[local32];
				if (local514 == 16384) {
					this.anIntArray251[local32] = (local28 << 7) + (this.anIntArray251[local32] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local514 = this.anIntArray241[local32];
				if (local514 == 16384) {
					this.anIntArray251[local32] = (this.anIntArray251[local32] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray244[local32] = (this.anIntArray244[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray244[local32] = local28 + (this.anIntArray244[local32] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray245[local32] |= 0x4;
				} else {
					this.method2772(local32);
					this.anIntArray245[local32] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2770((local28 << 7) + (this.anIntArray247[local32] & 0xFFFFC07F), local32);
			}
			if (local22 == 49) {
				this.method2770(local28 + (this.anIntArray247[local32] & 0xFFFFFF80), local32);
			}
		} else if (local13 == 192) {
			local22 = arg0 >> 8 & 0x7F;
			local32 = arg0 & 0xF;
			this.method2740(local32, local22 + this.anIntArray242[local32]);
		} else if (local13 == 208) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2754(local22, local32);
		} else if (local13 == 224) {
			local32 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00B5) >> 9);
			this.method2748(local32, local22);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method2755(true);
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)V")
	private void method2748(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray246[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
	public synchronized void method2749() {
		for (@Pc(15) Class2_Sub14 local15 = (Class2_Sub14) this.aClass79_15.method1992(); local15 != null; local15 = (Class2_Sub14) this.aClass79_15.method1991()) {
			local15.method4926();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZLclient!wi;)V")
	public void method2750(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub33 arg1) {
		@Pc(17) int local17 = arg1.aClass2_Sub9_Sub1_1.aByteArray22.length;
		@Pc(49) int local49;
		if (arg0 && arg1.aClass2_Sub9_Sub1_1.aBoolean179) {
			@Pc(32) int local32 = local17 + local17 - arg1.aClass2_Sub9_Sub1_1.anInt2256;
			local17 <<= 0x8;
			local49 = (int) ((long) this.anIntArray244[arg1.anInt6124] * (long) local32 >> 6);
			if (local49 >= local17) {
				arg1.aClass2_Sub5_Sub2_3.method1801();
				local49 = local17 + local17 - local49 - 1;
			}
		} else {
			local49 = (int) ((long) this.anIntArray244[arg1.anInt6124] * (long) local17 >> 6);
		}
		arg1.aClass2_Sub5_Sub2_3.method1789(local49);
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3546(@OriginalArg(0) int arg0) {
		if (this.aClass117_1.method2875()) {
			@Pc(14) int local14 = this.anInt3372 * this.aClass117_1.anInt3562 / Static110.anInt2380;
			do {
				@Pc(24) long local24 = this.aLong171 + (long) local14 * (long) arg0;
				if (this.aLong172 - local24 >= 0L) {
					this.aLong171 = local24;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local14 + this.aLong172 - this.aLong171 - 1L) / (long) local14);
				arg0 -= local55;
				this.aLong171 += (long) local14 * (long) local55;
				this.aClass2_Sub5_Sub4_1.method3546(local55);
				this.method2768();
			} while (this.aClass117_1.method2875());
		}
		this.aClass2_Sub5_Sub4_1.method3546(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZIII)V")
	private void method2751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILclient!wi;[I)Z")
	public boolean method2752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub33 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt6112 = Static110.anInt2380 / 100;
		if (arg2.anInt6117 >= 0 && (arg2.aClass2_Sub5_Sub2_3 == null || arg2.aClass2_Sub5_Sub2_3.method1816())) {
			arg2.method4872();
			arg2.method4926();
			if (arg2.anInt6123 > 0 && this.aClass2_Sub33ArrayArray1[arg2.anInt6124][arg2.anInt6123] == arg2) {
				this.aClass2_Sub33ArrayArray1[arg2.anInt6124][arg2.anInt6123] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt6114;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray238[arg2.anInt6124] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt6114 = local59;
		}
		@Pc(96) boolean local96 = false;
		arg2.aClass2_Sub5_Sub2_3.method1806(this.method2760(arg2));
		arg2.anInt6106++;
		@Pc(127) double local127 = (double) ((arg2.anInt6113 * arg2.anInt6114 >> 12) + (arg2.anInt6102 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(130) Class170 local130 = arg2.aClass170_1;
		arg2.anInt6121 += local130.anInt5504;
		if (local130.anInt5496 > 0) {
			if (local130.anInt5499 <= 0) {
				arg2.anInt6109 += 128;
			} else {
				arg2.anInt6109 += (int) (Math.pow(2.0D, (double) local130.anInt5499 * local127) * 128.0D + 0.5D);
			}
			if (arg2.anInt6109 * local130.anInt5496 >= 819200) {
				local96 = true;
			}
		}
		if (local130.aByteArray73 != null) {
			if (local130.anInt5493 <= 0) {
				arg2.anInt6105 += 128;
			} else {
				arg2.anInt6105 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt5493) * 128.0D + 0.5D);
			}
			while (local130.aByteArray73.length - 2 > arg2.anInt6104 && (local130.aByteArray73[arg2.anInt6104 + 2] & 0xFF) << 8 < arg2.anInt6105) {
				arg2.anInt6104 += 2;
			}
			if (arg2.anInt6104 == local130.aByteArray73.length - 2 && local130.aByteArray73[arg2.anInt6104 + 1] == 0) {
				local96 = true;
			}
		}
		if (arg2.anInt6117 >= 0 && local130.aByteArray74 != null && (this.anIntArray245[arg2.anInt6124] & 0x1) == 0 && (arg2.anInt6123 < 0 || this.aClass2_Sub33ArrayArray1[arg2.anInt6124][arg2.anInt6123] != arg2)) {
			if (local130.anInt5495 <= 0) {
				arg2.anInt6117 += 128;
			} else {
				arg2.anInt6117 += (int) (Math.pow(2.0D, local127 * (double) local130.anInt5495) * 128.0D + 0.5D);
			}
			while (arg2.anInt6122 < local130.aByteArray74.length - 2 && (local130.aByteArray74[arg2.anInt6122 + 2] & 0xFF) << 8 < arg2.anInt6117) {
				arg2.anInt6122 += 2;
			}
			if (arg2.anInt6122 == local130.aByteArray74.length - 2) {
				local96 = true;
			}
		}
		if (!local96) {
			arg2.aClass2_Sub5_Sub2_3.method1802(arg2.anInt6112, this.method2763(arg2), this.method2764(arg2));
			return false;
		}
		arg2.aClass2_Sub5_Sub2_3.method1808(arg2.anInt6112);
		if (arg3 == null) {
			arg2.aClass2_Sub5_Sub2_3.method3546(arg0);
		} else {
			arg2.aClass2_Sub5_Sub2_3.method3550(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub5_Sub2_3.method1810()) {
			this.aClass2_Sub5_Sub4_1.aClass2_Sub5_Sub1_2.method403(arg2.aClass2_Sub5_Sub2_3);
		}
		arg2.method4872();
		if (arg2.anInt6117 >= 0) {
			arg2.method4926();
			if (arg2.anInt6123 > 0 && this.aClass2_Sub33ArrayArray1[arg2.anInt6124][arg2.anInt6123] == arg2) {
				this.aClass2_Sub33ArrayArray1[arg2.anInt6124][arg2.anInt6123] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	public synchronized void method2753() {
		for (@Pc(25) Class2_Sub14 local25 = (Class2_Sub14) this.aClass79_15.method1992(); local25 != null; local25 = (Class2_Sub14) this.aClass79_15.method1991()) {
			local25.method1685();
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(III)V")
	private void method2754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	private void method2755(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2739(-1);
		} else {
			this.method2742(-1);
		}
		this.method2771(-1);
		@Pc(25) int local25;
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray248[local25] = this.anIntArray243[local25];
		}
		for (local25 = 0; local25 < 16; local25++) {
			this.anIntArray242[local25] = this.anIntArray243[local25] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!jd;Lclient!rl;Lclient!ed;II)Z")
	public synchronized boolean method2756(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class2_Sub24 arg1, @OriginalArg(2) Class47 arg2) {
		@Pc(3) boolean local3 = true;
		arg1.method3881();
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(30) Class2_Sub19 local30 = (Class2_Sub19) arg1.aClass79_19.method1992(); local30 != null; local30 = (Class2_Sub19) arg1.aClass79_19.method1991()) {
			@Pc(37) int local37 = (int) local30.aLong315;
			@Pc(47) Class2_Sub14 local47 = (Class2_Sub14) this.aClass79_15.method2002((long) local37);
			if (local47 == null) {
				local47 = Static246.method4090(arg0, local37);
				if (local47 == null) {
					local3 = false;
					continue;
				}
				this.aClass79_15.method1994((long) local37, local47);
			}
			if (!local47.method1686(local30.aByteArray33, arg2, local24)) {
				local3 = false;
			}
		}
		if (local3) {
			arg1.method3883();
		}
		return local3;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)V")
	private void method2757(@OriginalArg(0) int arg0) {
		if ((this.anIntArray245[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(31) Class2_Sub33 local31 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method13(); local31 != null; local31 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method9()) {
			if (arg0 == local31.anInt6124 && this.aClass2_Sub33ArrayArray2[arg0][local31.anInt6102] == null && local31.anInt6117 < 0) {
				local31.anInt6117 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
	public synchronized void method2758() {
		this.method2765(true);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBI)V")
	public synchronized void method2759() {
		this.method2738();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!wi;)I")
	private int method2760(@OriginalArg(1) Class2_Sub33 arg0) {
		@Pc(6) Class170 local6 = arg0.aClass170_1;
		@Pc(17) int local17 = arg0.anInt6119 + (arg0.anInt6113 * arg0.anInt6114 >> 12);
		local17 += (this.anIntArray246[arg0.anInt6124] - 8192) * this.anIntArray251[arg0.anInt6124] >> 12;
		@Pc(56) int local56;
		if (local6.anInt5504 > 0 && (local6.anInt5497 > 0 || this.anIntArray237[arg0.anInt6124] > 0)) {
			local56 = local6.anInt5497 << 2;
			@Pc(61) int local61 = local6.anInt5501 << 1;
			if (local61 > arg0.anInt6106) {
				local56 = arg0.anInt6106 * local56 / local61;
			}
			local56 += this.anIntArray237[arg0.anInt6124] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt6121 & 0x1FF) * 0.01227184630308513D);
			local17 += (int) (local95 * (double) local56);
		}
		local56 = (int) ((double) (arg0.aClass2_Sub9_Sub1_1.anInt2254 * 256) * Math.pow(2.0D, (double) local17 * 3.255208333333333E-4D) / (double) Static110.anInt2380 + 0.5D);
		return local56 < 1 ? 1 : local56;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(II)V")
	public synchronized void method2761(@OriginalArg(0) int arg0) {
		this.anInt3345 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I")
	public int method2762() {
		return this.anInt3345;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!wi;B)I")
	private int method2763(@OriginalArg(0) Class2_Sub33 arg0) {
		if (this.anIntArray252[arg0.anInt6124] == 0) {
			return 0;
		}
		@Pc(30) int local30 = this.anIntArray250[arg0.anInt6124] * this.anIntArray240[arg0.anInt6124] + 4096 >> 13;
		@Pc(33) Class170 local33 = arg0.aClass170_1;
		@Pc(41) int local41 = local30 * local30 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt6103 * local41 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt3345 + 128 >> 8;
		local30 = local59 * this.anIntArray252[arg0.anInt6124] + 128 >> 8;
		if (local33.anInt5496 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local33.anInt5496 * 1.953125E-5D * (double) arg0.anInt6109) + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local33.aByteArray73 != null) {
			local104 = arg0.anInt6105;
			local112 = local33.aByteArray73[arg0.anInt6104 + 1];
			if (local33.aByteArray73.length - 2 > arg0.anInt6104) {
				local134 = (local33.aByteArray73[arg0.anInt6104] & 0xFF) << 8;
				local146 = (local33.aByteArray73[arg0.anInt6104 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local33.aByteArray73[arg0.anInt6104 + 3] + -local112) / (local146 - local134);
			}
			local30 = local30 * local112 + 32 >> 6;
		}
		if (arg0.anInt6117 > 0 && local33.aByteArray74 != null) {
			local104 = arg0.anInt6117;
			local112 = local33.aByteArray74[arg0.anInt6122 + 1];
			if (local33.aByteArray74.length - 2 > arg0.anInt6122) {
				local134 = (local33.aByteArray74[arg0.anInt6122] & 0xFF) << 8;
				local146 = (local33.aByteArray74[arg0.anInt6122 + 2] & 0xFF) << 8;
				local112 += (local33.aByteArray74[arg0.anInt6122 + 3] - local112) * (local104 + -local134) / (local146 - local134);
			}
			local30 = local30 * local112 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass117_1.method2875()) {
			@Pc(19) int local19 = this.aClass117_1.anInt3562 * this.anInt3372 / Static110.anInt2380;
			do {
				@Pc(28) long local28 = (long) local19 * (long) arg2 + this.aLong171;
				if (this.aLong172 - local28 >= 0L) {
					this.aLong171 = local28;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong172 + (long) local19 - this.aLong171 - 1L) / (long) local19);
				arg2 -= local57;
				this.aLong171 += (long) local57 * (long) local19;
				this.aClass2_Sub5_Sub4_1.method3550(arg0, arg1, local57);
				this.method2768();
				arg1 += local57;
			} while (this.aClass117_1.method2875());
		}
		this.aClass2_Sub5_Sub4_1.method3550(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!wi;I)I")
	private int method2764(@OriginalArg(0) Class2_Sub33 arg0) {
		@Pc(14) int local14 = this.anIntArray239[arg0.anInt6124];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt6110 + 128) + 32 >> 6) : arg0.anInt6110 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(ZI)V")
	private synchronized void method2765(@OriginalArg(0) boolean arg0) {
		this.aClass117_1.method2878();
		this.aClass2_Sub24_2 = null;
		this.method2755(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "()Lclient!md;")
	@Override
	public synchronized Class2_Sub5 method3551() {
		return null;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Lclient!wi;I)Z")
	public boolean method2767(@OriginalArg(0) Class2_Sub33 arg0) {
		if (arg0.aClass2_Sub5_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt6117 >= 0) {
			arg0.method4926();
			if (arg0.anInt6123 > 0 && arg0 == this.aClass2_Sub33ArrayArray1[arg0.anInt6124][arg0.anInt6123]) {
				this.aClass2_Sub33ArrayArray1[arg0.anInt6124][arg0.anInt6123] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(B)V")
	private void method2768() {
		@Pc(4) int local4 = this.anInt3382;
		@Pc(15) int local15 = this.anInt3385;
		@Pc(18) long local18 = this.aLong172;
		if (this.aClass2_Sub24_2 != null && local15 == this.anInt3386) {
			this.method2741(this.aBoolean273, this.aBoolean274, this.aClass2_Sub24_2);
			this.method2768();
			return;
		}
		while (local15 == this.anInt3385) {
			while (local15 == this.aClass117_1.anIntArray287[local4]) {
				this.aClass117_1.method2882(local4);
				@Pc(63) int local63 = this.aClass117_1.method2883(local4);
				if (local63 == 1) {
					this.aClass117_1.method2890();
					this.aClass117_1.method2885(local4);
					if (this.aClass117_1.method2877()) {
						if (this.aClass2_Sub24_2 != null) {
							this.method2744(this.aClass2_Sub24_2, this.aBoolean273);
							this.method2768();
							return;
						}
						if (!this.aBoolean273 || local15 == 0) {
							this.method2755(true);
							this.aClass117_1.method2878();
							return;
						}
						this.aClass117_1.method2880(local18);
					}
					break;
				}
				if ((local63 & 0x80) != 0) {
					this.method2747(local63);
				}
				this.aClass117_1.method2881(local4);
				this.aClass117_1.method2885(local4);
			}
			local4 = this.aClass117_1.method2888();
			local15 = this.aClass117_1.anIntArray287[local4];
			local18 = this.aClass117_1.method2889(local15);
		}
		this.anInt3382 = local4;
		this.anInt3385 = local15;
		this.aLong172 = local18;
		if (this.aClass2_Sub24_2 != null && local15 > this.anInt3386) {
			this.anInt3385 = this.anInt3386;
			this.anInt3382 = -1;
			this.aLong172 = this.aClass117_1.method2889(this.anInt3385);
		}
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(III)V")
	private void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray247[arg1] = arg0;
		this.anIntArray249[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(II)V")
	private void method2771(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2771(local9);
			}
			return;
		}
		this.anIntArray250[arg0] = 12800;
		this.anIntArray239[arg0] = 8192;
		this.anIntArray240[arg0] = 16383;
		this.anIntArray246[arg0] = 8192;
		this.anIntArray237[arg0] = 0;
		this.anIntArray238[arg0] = 8192;
		this.method2757(arg0);
		this.method2772(arg0);
		this.anIntArray245[arg0] = 0;
		this.anIntArray241[arg0] = 32767;
		this.anIntArray251[arg0] = 256;
		this.anIntArray244[arg0] = 0;
		this.method2770(8192, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(II)V")
	private void method2772(@OriginalArg(1) int arg0) {
		if ((this.anIntArray245[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class2_Sub33 local27 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method13(); local27 != null; local27 = (Class2_Sub33) this.aClass2_Sub5_Sub4_1.aClass1_16.method9()) {
			if (arg0 == local27.anInt6124) {
				local27.anInt6107 = 0;
			}
		}
	}
}
