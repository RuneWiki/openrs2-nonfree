import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class1_Sub12_Sub3 extends Class1_Sub12 {

	@OriginalMember(owner = "client!ok", name = "Gb", descriptor = "Z")
	private boolean aBoolean137;

	@OriginalMember(owner = "client!ok", name = "Hb", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!ok", name = "Kb", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!ok", name = "Lb", descriptor = "I")
	private int anInt3268;

	@OriginalMember(owner = "client!ok", name = "Mb", descriptor = "I")
	private int anInt3269;

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "[I")
	private int[] anIntArray334 = new int[16];

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
	private int anInt3232 = 256;

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "[I")
	private int[] anIntArray335 = new int[16];

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "[[Lclient!ng;")
	private Class1_Sub20[][] aClass1_Sub20ArrayArray1 = new Class1_Sub20[16][128];

	@OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
	private int anInt3233 = 1000000;

	@OriginalMember(owner = "client!ok", name = "P", descriptor = "[I")
	public int[] anIntArray340 = new int[16];

	@OriginalMember(owner = "client!ok", name = "W", descriptor = "[I")
	private int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!ok", name = "N", descriptor = "[I")
	private int[] anIntArray339 = new int[16];

	@OriginalMember(owner = "client!ok", name = "hb", descriptor = "[I")
	public int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!ok", name = "ib", descriptor = "[I")
	public int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "[I")
	private int[] anIntArray338 = new int[16];

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "[I")
	private int[] anIntArray336 = new int[16];

	@OriginalMember(owner = "client!ok", name = "mb", descriptor = "[I")
	private int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!ok", name = "pb", descriptor = "[I")
	private int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!ok", name = "Y", descriptor = "[[Lclient!ng;")
	private Class1_Sub20[][] aClass1_Sub20ArrayArray2 = new Class1_Sub20[16][128];

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "[I")
	private int[] anIntArray337 = new int[16];

	@OriginalMember(owner = "client!ok", name = "rb", descriptor = "[I")
	private int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!ok", name = "ob", descriptor = "[I")
	private int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!ok", name = "Cb", descriptor = "[I")
	private int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "Lclient!r;")
	private Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!ok", name = "Ib", descriptor = "Lclient!mk;")
	private Class1_Sub12_Sub2 aClass1_Sub12_Sub2_1 = new Class1_Sub12_Sub2(this);

	@OriginalMember(owner = "client!ok", name = "wb", descriptor = "Lclient!qc;")
	private Class90 aClass90_18 = new Class90(128);

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class1_Sub12_Sub3() {
		this.method2617();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V")
	private void method2599(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray344[arg1]) {
			this.anIntArray344[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass1_Sub20ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
	private void method2600(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub20 local16 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2239(); local16 != null; local16 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2238()) {
			if (arg0 < 0 || arg0 == local16.anInt2893) {
				if (local16.aClass1_Sub12_Sub4_3 != null) {
					local16.aClass1_Sub12_Sub4_3.method3079(Static50.anInt1044 / 100);
					if (local16.aClass1_Sub12_Sub4_3.method3068()) {
						this.aClass1_Sub12_Sub2_1.aClass1_Sub12_Sub1_1.method895(local16.aClass1_Sub12_Sub4_3);
					}
					local16.method2357();
				}
				if (local16.anInt2907 < 0) {
					this.aClass1_Sub20ArrayArray1[local16.anInt2893][local16.anInt2902] = null;
				}
				local16.method3525();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V")
	private void method2601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()I")
	@Override
	public synchronized int method3033() {
		return 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	private void method2604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub20 local12 = this.aClass1_Sub20ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub20ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray342[arg0] & 0x2) == 0) {
			local12.anInt2907 = 0;
			return;
		}
		for (@Pc(51) Class1_Sub20 local51 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2239(); local51 != null; local51 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2238()) {
			if (local12.anInt2893 == local51.anInt2893 && local51.anInt2907 < 0 && local12 != local51) {
				local12.anInt2907 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V")
	public synchronized void method2605() {
		for (@Pc(11) Class1_Sub7 local11 = (Class1_Sub7) this.aClass90_18.method2823(); local11 != null; local11 = (Class1_Sub7) this.aClass90_18.method2821()) {
			local11.method392();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBII)V")
	private void method2606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2604(arg1, arg2, 64);
		if ((this.anIntArray342[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub20 local28 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2244(); local28 != null; local28 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2235()) {
				if (local28.anInt2893 == arg1 && local28.anInt2907 < 0) {
					this.aClass1_Sub20ArrayArray1[arg1][local28.anInt2902] = null;
					this.aClass1_Sub20ArrayArray1[arg1][arg2] = local28;
					@Pc(71) int local71 = local28.anInt2903 + (local28.anInt2896 * local28.anInt2899 >> 12);
					local28.anInt2899 = 4096;
					local28.anInt2903 += arg2 - local28.anInt2902 << 8;
					local28.anInt2902 = arg2;
					local28.anInt2896 = local71 - local28.anInt2903;
					return;
				}
			}
		}
		@Pc(117) Class1_Sub7 local117 = (Class1_Sub7) this.aClass90_18.method2819((long) this.anIntArray344[arg1]);
		if (local117 == null) {
			return;
		}
		@Pc(129) Class1_Sub15_Sub1 local129 = local117.aClass1_Sub15_Sub1Array1[arg2];
		if (local129 == null) {
			return;
		}
		@Pc(136) Class1_Sub20 local136 = new Class1_Sub20();
		local136.aClass1_Sub15_Sub1_1 = local129;
		local136.anInt2893 = arg1;
		local136.aClass1_Sub7_1 = local117;
		local136.aClass12_1 = local117.aClass12Array1[arg2];
		local136.anInt2911 = local117.aByteArray6[arg2];
		local136.anInt2902 = arg2;
		local136.anInt2901 = arg0 * arg0 * local117.anInt535 * local117.aByteArray7[arg2] + 1024 >> 11;
		local136.anInt2900 = local117.aByteArray5[arg2] & 0xFF;
		local136.anInt2903 = (arg2 << 8) - (local117.aShortArray3[arg2] & 0x7FFF);
		local136.anInt2904 = 0;
		local136.anInt2894 = 0;
		local136.anInt2914 = 0;
		local136.anInt2907 = -1;
		local136.anInt2895 = 0;
		if (this.anIntArray343[arg1] == 0) {
			local136.aClass1_Sub12_Sub4_3 = Static245.method3056(local129, this.method2631(local136), this.method2619(local136), this.method2618(local136));
		} else {
			local136.aClass1_Sub12_Sub4_3 = Static245.method3056(local129, this.method2631(local136), 0, this.method2618(local136));
			this.method2625(local136, local117.aShortArray3[arg2] < 0);
		}
		if (local117.aShortArray3[arg2] < 0) {
			local136.aClass1_Sub12_Sub4_3.method3041(-1);
		}
		if (local136.anInt2911 >= 0) {
			@Pc(289) Class1_Sub20 local289 = this.aClass1_Sub20ArrayArray2[arg1][local136.anInt2911];
			if (local289 != null && local289.anInt2907 < 0) {
				this.aClass1_Sub20ArrayArray1[arg1][local289.anInt2902] = null;
				local289.anInt2907 = 0;
			}
			this.aClass1_Sub20ArrayArray2[arg1][local136.anInt2911] = local136;
		}
		this.aClass1_Sub12_Sub2_1.aClass75_13.method2240(local136);
		this.aClass1_Sub20ArrayArray1[arg1][arg2] = local136;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	private void method2607(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2604(local16, local22, local28);
		} else if (local9 == 144) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2604(local16, local22, 64);
			} else {
				this.method2606(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method2629(local28, local22, local16);
		} else if (local9 == 176) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			if (local22 == 0) {
				this.anIntArray348[local16] = (this.anIntArray348[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray348[local16] = (local28 << 7) + (this.anIntArray348[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray337[local16] = (local28 << 7) + (this.anIntArray337[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray337[local16] = (this.anIntArray337[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray335[local16] = (local28 << 7) + (this.anIntArray335[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray335[local16] = local28 + (this.anIntArray335[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray338[local16] = (this.anIntArray338[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray338[local16] = local28 + (this.anIntArray338[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray347[local16] = (local28 << 7) + (this.anIntArray347[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray347[local16] = local28 + (this.anIntArray347[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray345[local16] = (this.anIntArray345[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray345[local16] = local28 + (this.anIntArray345[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray342[local16] |= 0x1;
				} else {
					this.anIntArray342[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray342[local16] |= 0x2;
				} else {
					this.method2615(local16);
					this.anIntArray342[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray336[local16] = (local28 << 7) + (this.anIntArray336[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray336[local16] = local28 + (this.anIntArray336[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray336[local16] = (local28 << 7) + (this.anIntArray336[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray336[local16] = (this.anIntArray336[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2600(local16);
			}
			if (local22 == 121) {
				this.method2627(local16);
			}
			if (local22 == 123) {
				this.method2628(local16);
			}
			@Pc(510) int local510;
			if (local22 == 6) {
				local510 = this.anIntArray336[local16];
				if (local510 == 16384) {
					this.anIntArray341[local16] = (this.anIntArray341[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local510 = this.anIntArray336[local16];
				if (local510 == 16384) {
					this.anIntArray341[local16] = local28 + (this.anIntArray341[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray343[local16] = (local28 << 7) + (this.anIntArray343[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray343[local16] = (this.anIntArray343[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method2624(local16);
					this.anIntArray342[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray342[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method2623(local16, (local28 << 7) + (this.anIntArray346[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method2623(local16, local28 + (this.anIntArray346[local16] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2599(this.anIntArray348[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2601(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2621(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2617();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLclient!kk;Lclient!pa;ILclient!qg;)Z")
	public synchronized boolean method2608(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(4) Class1_Sub24 arg2) {
		arg2.method2888();
		@Pc(16) boolean local16 = true;
		@Pc(27) int[] local27 = new int[] { 22050 };
		for (@Pc(33) Class1_Sub21 local33 = (Class1_Sub21) arg2.aClass90_20.method2823(); local33 != null; local33 = (Class1_Sub21) arg2.aClass90_20.method2821()) {
			@Pc(39) int local39 = (int) local33.aLong173;
			@Pc(47) Class1_Sub7 local47 = (Class1_Sub7) this.aClass90_18.method2819((long) local39);
			if (local47 == null) {
				local47 = Static120.method1920(local39, arg1);
				if (local47 == null) {
					local16 = false;
					continue;
				}
				this.aClass90_18.method2817(local47, (long) local39);
			}
			if (!local47.method391(local27, local33.aByteArray45, arg0)) {
				local16 = false;
			}
		}
		if (local16) {
			arg2.method2889();
		}
		return local16;
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)Z")
	public synchronized boolean method2609() {
		return this.aClass96_1.method2934();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
	public synchronized void method2610(@OriginalArg(1) int arg0) {
		this.anInt3232 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
	public synchronized void method2611() {
		for (@Pc(11) Class1_Sub7 local11 = (Class1_Sub7) this.aClass90_18.method2823(); local11 != null; local11 = (Class1_Sub7) this.aClass90_18.method2821()) {
			local11.method3525();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIILclient!ng;I)Z")
	public boolean method2612(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub20 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt2898 = Static50.anInt1044 / 100;
		if (arg2.anInt2907 >= 0 && (arg2.aClass1_Sub12_Sub4_3 == null || arg2.aClass1_Sub12_Sub4_3.method3055())) {
			arg2.method2357();
			arg2.method3525();
			if (arg2.anInt2911 > 0 && this.aClass1_Sub20ArrayArray2[arg2.anInt2893][arg2.anInt2911] == arg2) {
				this.aClass1_Sub20ArrayArray2[arg2.anInt2893][arg2.anInt2911] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt2899;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray335[arg2.anInt2893] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt2899 = local56;
		}
		arg2.aClass1_Sub12_Sub4_3.method3064(this.method2631(arg2));
		arg2.anInt2908++;
		@Pc(106) boolean local106 = false;
		@Pc(109) Class12 local109 = arg2.aClass12_1;
		@Pc(127) double local127 = (double) ((arg2.anInt2896 * arg2.anInt2899 >> 12) + (arg2.anInt2902 - 60 << 8)) * 5.086263020833333E-6D;
		arg2.anInt2897 += local109.anInt432;
		if (local109.anInt431 > 0) {
			if (local109.anInt429 > 0) {
				arg2.anInt2914 += (int) (Math.pow(2.0D, (double) local109.anInt429 * local127) * 128.0D + 0.5D);
			} else {
				arg2.anInt2914 += 128;
			}
			if (local109.anInt431 * arg2.anInt2914 >= 819200) {
				local106 = true;
			}
		}
		if (local109.aByteArray4 != null) {
			if (local109.anInt425 <= 0) {
				arg2.anInt2894 += 128;
			} else {
				arg2.anInt2894 += (int) (Math.pow(2.0D, local127 * (double) local109.anInt425) * 128.0D + 0.5D);
			}
			while (arg2.anInt2904 < local109.aByteArray4.length - 2 && arg2.anInt2894 > (local109.aByteArray4[arg2.anInt2904 + 2] & 0xFF) << 8) {
				arg2.anInt2904 += 2;
			}
			if (arg2.anInt2904 == local109.aByteArray4.length - 2 && local109.aByteArray4[arg2.anInt2904 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg2.anInt2907 >= 0 && local109.aByteArray3 != null && (this.anIntArray342[arg2.anInt2893] & 0x1) == 0 && (arg2.anInt2911 < 0 || this.aClass1_Sub20ArrayArray2[arg2.anInt2893][arg2.anInt2911] != arg2)) {
			if (local109.anInt428 <= 0) {
				arg2.anInt2907 += 128;
			} else {
				arg2.anInt2907 += (int) (Math.pow(2.0D, local127 * (double) local109.anInt428) * 128.0D + 0.5D);
			}
			while (arg2.anInt2895 < local109.aByteArray3.length - 2 && arg2.anInt2907 > (local109.aByteArray3[arg2.anInt2895 + 2] & 0xFF) << 8) {
				arg2.anInt2895 += 2;
			}
			if (local109.aByteArray3.length - 2 == arg2.anInt2895) {
				local106 = true;
			}
		}
		if (!local106) {
			arg2.aClass1_Sub12_Sub4_3.method3062(arg2.anInt2898, this.method2619(arg2), this.method2618(arg2));
			return false;
		}
		arg2.aClass1_Sub12_Sub4_3.method3079(arg2.anInt2898);
		if (arg0 == null) {
			arg2.aClass1_Sub12_Sub4_3.method3037(arg1);
		} else {
			arg2.aClass1_Sub12_Sub4_3.method3036(arg0, arg3, arg1);
		}
		if (arg2.aClass1_Sub12_Sub4_3.method3068()) {
			this.aClass1_Sub12_Sub2_1.aClass1_Sub12_Sub1_1.method895(arg2.aClass1_Sub12_Sub4_3);
		}
		arg2.method2357();
		if (arg2.anInt2907 >= 0) {
			arg2.method3525();
			if (arg2.anInt2911 > 0 && arg2 == this.aClass1_Sub20ArrayArray2[arg2.anInt2893][arg2.anInt2911]) {
				this.aClass1_Sub20ArrayArray2[arg2.anInt2893][arg2.anInt2911] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)I")
	public int method2614() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)V")
	private void method2615(@OriginalArg(1) int arg0) {
		if ((this.anIntArray342[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub20 local15 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2239(); local15 != null; local15 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2238()) {
			if (arg0 == local15.anInt2893 && this.aClass1_Sub20ArrayArray1[arg0][local15.anInt2902] == null && local15.anInt2907 < 0) {
				local15.anInt2907 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!qg;Z)V")
	public synchronized void method2616(@OriginalArg(1) Class1_Sub24 arg0, @OriginalArg(2) boolean arg1) {
		this.method2626();
		this.aClass96_1.method2928(arg0.aByteArray50);
		this.aBoolean137 = arg1;
		this.aLong130 = 0L;
		@Pc(23) int local23 = this.aClass96_1.method2926();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass96_1.method2925(local25);
			this.aClass96_1.method2921(local25);
			this.aClass96_1.method2924(local25);
		}
		this.anInt3269 = this.aClass96_1.method2922();
		this.anInt3268 = this.aClass96_1.anIntArray404[this.anInt3269];
		this.aLong129 = this.aClass96_1.method2920(this.anInt3268);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3036(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass96_1.method2934()) {
			@Pc(14) int local14 = this.anInt3233 * this.aClass96_1.anInt3719 / Static50.anInt1044;
			do {
				@Pc(23) long local23 = this.aLong130 + (long) local14 * (long) arg2;
				if (this.aLong129 - local23 >= 0L) {
					this.aLong130 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong129 - this.aLong130 - 1L) / (long) local14);
				this.aLong130 += (long) local52 * (long) local14;
				this.aClass1_Sub12_Sub2_1.method3036(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method2634();
			} while (this.aClass96_1.method2934());
		}
		this.aClass1_Sub12_Sub2_1.method3036(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)V")
	private void method2617() {
		this.method2600(-1);
		this.method2627(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray344[local19] = this.anIntArray334[local19];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray348[local35] = this.anIntArray334[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ng;)I")
	private int method2618(@OriginalArg(1) Class1_Sub20 arg0) {
		@Pc(9) int local9 = this.anIntArray347[arg0.anInt2893];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt2900) * (-local9 + 16384) + 32 >> 6) : local9 * arg0.anInt2900 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ng;B)I")
	private int method2619(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(2) Class12 local2 = arg0.aClass12_1;
		@Pc(22) int local22 = this.anIntArray345[arg0.anInt2893] * this.anIntArray338[arg0.anInt2893] + 4096 >> 13;
		@Pc(38) int local38 = local22 * local22 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt2901 * local38 + 16384 >> 15;
		local22 = local47 * this.anInt3232 + 128 >> 8;
		if (local2.anInt431 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) arg0.anInt2914 * 1.953125E-5D * (double) local2.anInt431) * (double) local22 + 0.5D);
		}
		@Pc(91) int local91;
		@Pc(88) int local88;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local2.aByteArray4 != null) {
			local88 = local2.aByteArray4[arg0.anInt2904 + 1];
			local91 = arg0.anInt2894;
			if (local2.aByteArray4.length - 2 > arg0.anInt2904) {
				local109 = (local2.aByteArray4[arg0.anInt2904] & 0xFF) << 8;
				local121 = (local2.aByteArray4[arg0.anInt2904 + 2] & 0xFF) << 8;
				local88 += (local91 - local109) * (local2.aByteArray4[arg0.anInt2904 + 3] - local88) / (local121 - local109);
			}
			local22 = local22 * local88 + 32 >> 6;
		}
		if (arg0.anInt2907 > 0 && local2.aByteArray3 != null) {
			local91 = arg0.anInt2907;
			local88 = local2.aByteArray3[arg0.anInt2895 + 1];
			if (arg0.anInt2895 < local2.aByteArray3.length - 2) {
				local109 = (local2.aByteArray3[arg0.anInt2895] & 0xFF) << 8;
				local121 = (local2.aByteArray3[arg0.anInt2895 + 2] & 0xFF) << 8;
				local88 += (local91 - local109) * (local2.aByteArray3[arg0.anInt2895 + 3] - local88) / (local121 - local109);
			}
			local22 = local22 * local88 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method3037(@OriginalArg(0) int arg0) {
		if (this.aClass96_1.method2934()) {
			@Pc(14) int local14 = this.anInt3233 * this.aClass96_1.anInt3719 / Static50.anInt1044;
			do {
				@Pc(23) long local23 = this.aLong130 + (long) local14 * (long) arg0;
				if (this.aLong129 - local23 >= 0L) {
					this.aLong130 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong129 - this.aLong130 - 1L) / (long) local14);
				this.aLong130 += (long) local14 * (long) local52;
				this.aClass1_Sub12_Sub2_1.method3037(local52);
				arg0 -= local52;
				this.method2634();
			} while (this.aClass96_1.method2934());
		}
		this.aClass1_Sub12_Sub2_1.method3037(arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BII)V")
	private void method2621(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray339[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V")
	public synchronized void method2622() {
		this.method2633();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(III)V")
	private void method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray346[arg0] = arg1;
		this.anIntArray340[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	private void method2624(@OriginalArg(0) int arg0) {
		if ((this.anIntArray342[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class1_Sub20 local27 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2239(); local27 != null; local27 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2238()) {
			if (arg0 == local27.anInt2893) {
				local27.anInt2909 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ng;BZ)V")
	public void method2625(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub15_Sub1_1.aByteArray49.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub15_Sub1_1.aBoolean148) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub15_Sub1_1.anInt3460;
			local31 = (int) ((long) this.anIntArray343[arg0.anInt2893] * (long) local42 >> 6);
			local12 <<= 0x8;
			if (local31 >= local12) {
				local31 = local12 + local12 - local31 - 1;
				arg0.aClass1_Sub12_Sub4_3.method3067();
			}
		} else {
			local31 = (int) ((long) this.anIntArray343[arg0.anInt2893] * (long) local12 >> 6);
		}
		arg0.aClass1_Sub12_Sub4_3.method3078(local31);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "()Lclient!ge;")
	@Override
	public synchronized Class1_Sub12 method3038() {
		return this.aClass1_Sub12_Sub2_1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	public synchronized void method2626() {
		this.aClass96_1.method2933();
		this.method2617();
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)V")
	private void method2627(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2627(local12);
			}
			return;
		}
		this.anIntArray338[arg0] = 12800;
		this.anIntArray347[arg0] = 8192;
		this.anIntArray345[arg0] = 16383;
		this.anIntArray339[arg0] = 8192;
		this.anIntArray337[arg0] = 0;
		this.anIntArray335[arg0] = 8192;
		this.method2615(arg0);
		this.method2624(arg0);
		this.anIntArray342[arg0] = 0;
		this.anIntArray336[arg0] = 32767;
		this.anIntArray341[arg0] = 256;
		this.anIntArray343[arg0] = 0;
		this.method2623(arg0, 8192);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)V")
	private void method2628(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub20 local12 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2239(); local12 != null; local12 = (Class1_Sub20) this.aClass1_Sub12_Sub2_1.aClass75_13.method2238()) {
			if ((arg0 < 0 || local12.anInt2893 == arg0) && local12.anInt2907 < 0) {
				this.aClass1_Sub20ArrayArray1[local12.anInt2893][local12.anInt2902] = null;
				local12.anInt2907 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(IBII)V")
	private void method2629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ng;Z)I")
	private int method2631(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(14) int local14 = arg0.anInt2903 + (arg0.anInt2896 * arg0.anInt2899 >> 12);
		local14 += (this.anIntArray339[arg0.anInt2893] - 8192) * this.anIntArray341[arg0.anInt2893] >> 12;
		@Pc(35) Class12 local35 = arg0.aClass12_1;
		@Pc(63) int local63;
		if (local35.anInt432 > 0 && (local35.anInt426 > 0 || this.anIntArray337[arg0.anInt2893] > 0)) {
			local63 = local35.anInt426 << 2;
			@Pc(68) int local68 = local35.anInt424 << 1;
			if (arg0.anInt2908 < local68) {
				local63 = local63 * arg0.anInt2908 / local68;
			}
			local63 += this.anIntArray337[arg0.anInt2893] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt2897 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local98 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass1_Sub15_Sub1_1.anInt3458 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static50.anInt1044 + 0.5D);
		return local63 >= 1 ? local63 : 1;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()Lclient!ge;")
	@Override
	public synchronized Class1_Sub12 method3035() {
		return null;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILclient!ng;)Z")
	public boolean method2632(@OriginalArg(1) Class1_Sub20 arg0) {
		if (arg0.aClass1_Sub12_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt2907 >= 0) {
			arg0.method3525();
			if (arg0.anInt2911 > 0 && this.aClass1_Sub20ArrayArray2[arg0.anInt2893][arg0.anInt2911] == arg0) {
				this.aClass1_Sub20ArrayArray2[arg0.anInt2893][arg0.anInt2911] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZI)V")
	private void method2633() {
		this.anIntArray334[9] = 128;
		this.anIntArray348[9] = 128;
		this.method2599(128, 9);
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
	private void method2634() {
		@Pc(4) int local4 = this.anInt3269;
		@Pc(7) int local7 = this.anInt3268;
		@Pc(14) long local14 = this.aLong129;
		while (local7 == this.anInt3268) {
			while (this.aClass96_1.anIntArray404[local4] == local7) {
				this.aClass96_1.method2925(local4);
				@Pc(33) int local33 = this.aClass96_1.method2927(local4);
				if (local33 == 1) {
					this.aClass96_1.method2932();
					this.aClass96_1.method2924(local4);
					if (this.aClass96_1.method2931()) {
						if (!this.aBoolean137 || local7 == 0) {
							this.method2617();
							this.aClass96_1.method2933();
							return;
						}
						this.aClass96_1.method2929(local14);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method2607(local33);
				}
				this.aClass96_1.method2921(local4);
				this.aClass96_1.method2924(local4);
			}
			local4 = this.aClass96_1.method2922();
			local7 = this.aClass96_1.anIntArray404[local4];
			local14 = this.aClass96_1.method2920(local7);
		}
		this.anInt3269 = local4;
		this.anInt3268 = local7;
		this.aLong129 = local14;
	}
}
