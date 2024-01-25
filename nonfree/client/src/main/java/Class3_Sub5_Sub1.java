import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!li", name = "Ib", descriptor = "I")
	private int anInt4453;

	@OriginalMember(owner = "client!li", name = "Lb", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!li", name = "Mb", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!li", name = "Ob", descriptor = "I")
	private int anInt4455;

	@OriginalMember(owner = "client!li", name = "Pb", descriptor = "Z")
	private boolean aBoolean337;

	@OriginalMember(owner = "client!li", name = "Qb", descriptor = "Lclient!mf;")
	private Class3_Sub29 aClass3_Sub29_2;

	@OriginalMember(owner = "client!li", name = "Rb", descriptor = "Z")
	private boolean aBoolean338;

	@OriginalMember(owner = "client!li", name = "Sb", descriptor = "I")
	private int anInt4456;

	@OriginalMember(owner = "client!li", name = "y", descriptor = "[I")
	private final int[] anIntArray333 = new int[16];

	@OriginalMember(owner = "client!li", name = "F", descriptor = "[I")
	private final int[] anIntArray335 = new int[16];

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
	private final int[] anIntArray332 = new int[16];

	@OriginalMember(owner = "client!li", name = "W", descriptor = "[I")
	private final int[] anIntArray339 = new int[16];

	@OriginalMember(owner = "client!li", name = "L", descriptor = "I")
	private final int anInt4423 = 1000000;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "[I")
	public final int[] anIntArray334 = new int[16];

	@OriginalMember(owner = "client!li", name = "gb", descriptor = "[I")
	private final int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!li", name = "bb", descriptor = "[I")
	public final int[] anIntArray340 = new int[16];

	@OriginalMember(owner = "client!li", name = "J", descriptor = "[[Lclient!ld;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray1 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!li", name = "rb", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!li", name = "ib", descriptor = "[I")
	private final int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!li", name = "V", descriptor = "[I")
	private final int[] anIntArray338 = new int[16];

	@OriginalMember(owner = "client!li", name = "kb", descriptor = "[I")
	private final int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!li", name = "mb", descriptor = "[I")
	private final int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!li", name = "P", descriptor = "[I")
	private final int[] anIntArray337 = new int[16];

	@OriginalMember(owner = "client!li", name = "xb", descriptor = "[[Lclient!ld;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray2 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!li", name = "N", descriptor = "[I")
	private final int[] anIntArray336 = new int[16];

	@OriginalMember(owner = "client!li", name = "tb", descriptor = "I")
	private int anInt4444 = 256;

	@OriginalMember(owner = "client!li", name = "Eb", descriptor = "[I")
	private final int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!li", name = "Db", descriptor = "[I")
	public final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!li", name = "Ab", descriptor = "Lclient!ik;")
	private final Class110 aClass110_1 = new Class110();

	@OriginalMember(owner = "client!li", name = "Jb", descriptor = "Lclient!ol;")
	private final Class3_Sub5_Sub2 aClass3_Sub5_Sub2_1 = new Class3_Sub5_Sub2(this);

	@OriginalMember(owner = "client!li", name = "yb", descriptor = "Lclient!jr;")
	private final Class127 aClass127_25 = new Class127(128);

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class3_Sub5_Sub1() {
		this.method3623();
		this.method3602(true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZ)V")
	private void method3602(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method3608(-1);
		} else {
			this.method3605(-1);
		}
		this.method3617(-1);
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			this.anIntArray344[local28] = this.anIntArray348[local28];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray346[local43] = this.anIntArray348[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	private void method3603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray332[arg1] = arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)V")
	private void method3604() {
		this.anIntArray348[9] = 128;
		this.anIntArray346[9] = 128;
		this.method3632(128, 9);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(ZI)V")
	private void method3605(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5328(); local15 != null; local15 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5325()) {
			if ((arg0 < 0 || arg0 == local15.anInt4374) && local15.anInt4364 < 0) {
				this.aClass3_Sub28ArrayArray2[local15.anInt4374][local15.anInt4369] = null;
				local15.anInt4364 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)V")
	private void method3606(@OriginalArg(0) int arg0) {
		if ((this.anIntArray334[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class3_Sub28 local16 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5328(); local16 != null; local16 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5325()) {
			if (local16.anInt4374 == arg0 && this.aClass3_Sub28ArrayArray2[arg0][local16.anInt4369] == null && local16.anInt4364 < 0) {
				local16.anInt4364 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)I")
	public int method3607() {
		return this.anInt4444;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	private void method3608(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class3_Sub28 local6 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5328(); local6 != null; local6 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5325()) {
			if (arg0 < 0 || arg0 == local6.anInt4374) {
				if (local6.aClass3_Sub5_Sub3_2 != null) {
					local6.aClass3_Sub5_Sub3_2.method4346(Static94.anInt2028 / 100);
					if (local6.aClass3_Sub5_Sub3_2.method4332()) {
						this.aClass3_Sub5_Sub2_1.aClass3_Sub5_Sub4_2.method5197(local6.aClass3_Sub5_Sub3_2);
					}
					local6.method3572();
				}
				if (local6.anInt4364 < 0) {
					this.aClass3_Sub28ArrayArray2[local6.anInt4374][local6.anInt4369] = null;
				}
				local6.method5987();
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5190(@OriginalArg(0) int arg0) {
		if (this.aClass110_1.method2987()) {
			@Pc(18) int local18 = this.aClass110_1.anInt3605 * this.anInt4423 / Static94.anInt2028;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong138;
				if (this.aLong137 - local27 >= 0L) {
					this.aLong138 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong137 - this.aLong138 - 1L) / (long) local18);
				this.aLong138 += (long) local18 * (long) local55;
				arg0 -= local55;
				this.aClass3_Sub5_Sub2_1.method5190(local55);
				this.method3624();
			} while (this.aClass110_1.method2987());
		}
		this.aClass3_Sub5_Sub2_1.method5190(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[IILclient!ld;)Z")
	public boolean method3609(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub28 arg3) {
		arg3.anInt4384 = Static94.anInt2028 / 100;
		if (arg3.anInt4364 >= 0 && (arg3.aClass3_Sub5_Sub3_2 == null || arg3.aClass3_Sub5_Sub3_2.method4366())) {
			arg3.method3572();
			arg3.method5987();
			if (arg3.anInt4379 > 0 && this.aClass3_Sub28ArrayArray1[arg3.anInt4374][arg3.anInt4379] == arg3) {
				this.aClass3_Sub28ArrayArray1[arg3.anInt4374][arg3.anInt4379] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg3.anInt4365;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray337[arg3.anInt4374] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg3.anInt4365 = local61;
		}
		arg3.aClass3_Sub5_Sub3_2.method4342(this.method3618(arg3));
		@Pc(104) Class20 local104 = arg3.aClass20_1;
		arg3.anInt4368 += local104.anInt797;
		arg3.anInt4372++;
		@Pc(119) boolean local119 = false;
		@Pc(137) double local137 = (double) ((arg3.anInt4365 * arg3.anInt4371 >> 12) + (arg3.anInt4369 - 60 << 8)) * 5.086263020833333E-6D;
		if (local104.anInt790 > 0) {
			if (local104.anInt791 <= 0) {
				arg3.anInt4376 += 128;
			} else {
				arg3.anInt4376 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt791) * 128.0D + 0.5D);
			}
			if (arg3.anInt4376 * local104.anInt790 >= 819200) {
				local119 = true;
			}
		}
		if (local104.aByteArray8 != null) {
			if (local104.anInt795 <= 0) {
				arg3.anInt4380 += 128;
			} else {
				arg3.anInt4380 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt795) * 128.0D + 0.5D);
			}
			while (local104.aByteArray8.length - 2 > arg3.anInt4382 && arg3.anInt4380 > (local104.aByteArray8[arg3.anInt4382 + 2] & 0xFF) << 8) {
				arg3.anInt4382 += 2;
			}
			if (arg3.anInt4382 == local104.aByteArray8.length - 2 && local104.aByteArray8[arg3.anInt4382 + 1] == 0) {
				local119 = true;
			}
		}
		if (arg3.anInt4364 >= 0 && local104.aByteArray7 != null && (this.anIntArray334[arg3.anInt4374] & 0x1) == 0 && (arg3.anInt4379 < 0 || arg3 != this.aClass3_Sub28ArrayArray1[arg3.anInt4374][arg3.anInt4379])) {
			if (local104.anInt794 > 0) {
				arg3.anInt4364 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt794) * 128.0D + 0.5D);
			} else {
				arg3.anInt4364 += 128;
			}
			while (local104.aByteArray7.length - 2 > arg3.anInt4375 && arg3.anInt4364 > (local104.aByteArray7[arg3.anInt4375 + 2] & 0xFF) << 8) {
				arg3.anInt4375 += 2;
			}
			if (arg3.anInt4375 == local104.aByteArray7.length - 2) {
				local119 = true;
			}
		}
		if (!local119) {
			arg3.aClass3_Sub5_Sub3_2.method4368(arg3.anInt4384, this.method3629(arg3), this.method3626(arg3));
			return false;
		}
		arg3.aClass3_Sub5_Sub3_2.method4346(arg3.anInt4384);
		if (arg1 == null) {
			arg3.aClass3_Sub5_Sub3_2.method5190(arg2);
		} else {
			arg3.aClass3_Sub5_Sub3_2.method5189(arg1, arg0, arg2);
		}
		if (arg3.aClass3_Sub5_Sub3_2.method4332()) {
			this.aClass3_Sub5_Sub2_1.aClass3_Sub5_Sub4_2.method5197(arg3.aClass3_Sub5_Sub3_2);
		}
		arg3.method3572();
		if (arg3.anInt4364 >= 0) {
			arg3.method5987();
			if (arg3.anInt4379 > 0 && arg3 == this.aClass3_Sub28ArrayArray1[arg3.anInt4374][arg3.anInt4379]) {
				this.aClass3_Sub28ArrayArray1[arg3.anInt4374][arg3.anInt4379] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
	public synchronized void method3610(@OriginalArg(0) int arg0) {
		this.anInt4444 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZB)V")
	private synchronized void method3611(@OriginalArg(0) boolean arg0) {
		this.aClass110_1.method2989();
		this.aClass3_Sub29_2 = null;
		this.method3602(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZI)V")
	private void method3612(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray338[arg0] = arg1;
		this.anIntArray340[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIII)V")
	private void method3613(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(II)V")
	private void method3614(@OriginalArg(0) int arg0) {
		if ((this.anIntArray334[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class3_Sub28 local20 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5328(); local20 != null; local20 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5325()) {
			if (local20.anInt4374 == arg0) {
				local20.anInt4366 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BII)V")
	public synchronized void method3615() {
		this.method3604();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!mf;Lclient!wh;Lclient!dn;BI)Z")
	public synchronized boolean method3616(@OriginalArg(0) Class3_Sub29 arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) Class56 arg2) {
		arg0.method3800();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub10 local26 = (Class3_Sub10) arg0.aClass127_26.method3248(); local26 != null; local26 = (Class3_Sub10) arg0.aClass127_26.method3252()) {
			@Pc(32) int local32 = (int) local26.aLong227;
			@Pc(40) Class3_Sub18 local40 = (Class3_Sub18) this.aClass127_25.method3246((long) local32);
			if (local40 == null) {
				local40 = Static345.method4949(arg2, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass127_25.method3257((long) local32, local40);
			}
			if (!local40.method2114(arg1, local26.aByteArray17, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method3799();
		}
		return local9;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)V")
	private void method3617(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
				this.method3617(local16);
			}
			return;
		}
		this.anIntArray333[arg0] = 12800;
		this.anIntArray342[arg0] = 8192;
		this.anIntArray343[arg0] = 16383;
		this.anIntArray332[arg0] = 8192;
		this.anIntArray336[arg0] = 0;
		this.anIntArray337[arg0] = 8192;
		this.method3606(arg0);
		this.method3614(arg0);
		this.anIntArray334[arg0] = 0;
		this.anIntArray345[arg0] = 32767;
		this.anIntArray339[arg0] = 256;
		this.anIntArray347[arg0] = 0;
		this.method3612(arg0, 8192);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLclient!ld;)I")
	private int method3618(@OriginalArg(1) Class3_Sub28 arg0) {
		@Pc(14) int local14 = (arg0.anInt4371 * arg0.anInt4365 >> 12) + arg0.anInt4381;
		local14 += this.anIntArray339[arg0.anInt4374] * (this.anIntArray332[arg0.anInt4374] - 8192) >> 12;
		@Pc(44) Class20 local44 = arg0.aClass20_1;
		@Pc(64) int local64;
		if (local44.anInt797 > 0 && (local44.anInt793 > 0 || this.anIntArray336[arg0.anInt4374] > 0)) {
			local64 = local44.anInt793 << 2;
			@Pc(69) int local69 = local44.anInt792 << 1;
			if (local69 > arg0.anInt4372) {
				local64 = local64 * arg0.anInt4372 / local69;
			}
			local64 += this.anIntArray336[arg0.anInt4374] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt4368 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local99 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub13_Sub1_2.anInt1849 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static94.anInt2028 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLclient!mf;ZI)V")
	private synchronized void method3619(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub29 arg1, @OriginalArg(2) boolean arg2) {
		this.method3611(arg2);
		this.aClass110_1.method2988(arg1.aByteArray54);
		this.aLong138 = 0L;
		this.aBoolean337 = arg0;
		@Pc(30) int local30 = this.aClass110_1.method2979();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass110_1.method2977(local32);
			this.aClass110_1.method2984(local32);
			this.aClass110_1.method2990(local32);
		}
		this.anInt4455 = this.aClass110_1.method2992();
		this.anInt4453 = this.aClass110_1.anIntArray276[this.anInt4455];
		this.aLong137 = this.aClass110_1.method2986(this.anInt4453);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(IB)V")
	private void method3620(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3636(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method3627(local28, local22, local16);
			} else {
				this.method3636(local22, 64, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3613(local28, local16, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray346[local16] = (local28 << 14) + (this.anIntArray346[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray346[local16] = (this.anIntArray346[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray336[local16] = (this.anIntArray336[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray336[local16] = local28 + (this.anIntArray336[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray337[local16] = (this.anIntArray337[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray337[local16] = (this.anIntArray337[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray333[local16] = (this.anIntArray333[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray333[local16] = (this.anIntArray333[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray342[local16] = (local28 << 7) + (this.anIntArray342[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray342[local16] = (this.anIntArray342[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray343[local16] = (this.anIntArray343[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray343[local16] = (this.anIntArray343[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray334[local16] |= 0x1;
				} else {
					this.anIntArray334[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray334[local16] |= 0x2;
				} else {
					this.method3606(local16);
					this.anIntArray334[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray345[local16] = (local28 << 7) + (this.anIntArray345[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray345[local16] = local28 + (this.anIntArray345[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray345[local16] = (local28 << 7) + (this.anIntArray345[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray345[local16] = (this.anIntArray345[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method3608(local16);
			}
			if (local22 == 121) {
				this.method3617(local16);
			}
			if (local22 == 123) {
				this.method3605(local16);
			}
			@Pc(501) int local501;
			if (local22 == 6) {
				local501 = this.anIntArray345[local16];
				if (local501 == 16384) {
					this.anIntArray339[local16] = (local28 << 7) + (this.anIntArray339[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local501 = this.anIntArray345[local16];
				if (local501 == 16384) {
					this.anIntArray339[local16] = local28 + (this.anIntArray339[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray347[local16] = (local28 << 7) + (this.anIntArray347[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray347[local16] = local28 + (this.anIntArray347[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method3614(local16);
					this.anIntArray334[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray334[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method3612(local16, (this.anIntArray338[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method3612(local16, (this.anIntArray338[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3632(local22 + this.anIntArray346[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3628(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method3603(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3602(true);
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5185() {
		return 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public synchronized void method3621() {
		this.method3611(true);
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "()Lclient!ar;")
	@Override
	public synchronized Class3_Sub5 method5188() {
		return null;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5189(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass110_1.method2987()) {
			@Pc(18) int local18 = this.aClass110_1.anInt3605 * this.anInt4423 / Static94.anInt2028;
			do {
				@Pc(27) long local27 = this.aLong138 + (long) local18 * (long) arg2;
				if (this.aLong137 - local27 >= 0L) {
					this.aLong138 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong137 - this.aLong138 - 1L) / (long) local18);
				this.aLong138 += (long) local56 * (long) local18;
				this.aClass3_Sub5_Sub2_1.method5189(arg0, arg1, local56);
				arg1 += local56;
				arg2 -= local56;
				this.method3624();
			} while (this.aClass110_1.method2987());
		}
		this.aClass3_Sub5_Sub2_1.method5189(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
	public synchronized void method3622() {
		for (@Pc(5) Class3_Sub18 local5 = (Class3_Sub18) this.aClass127_25.method3248(); local5 != null; local5 = (Class3_Sub18) this.aClass127_25.method3252()) {
			local5.method5987();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZII)V")
	private synchronized void method3623() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray335[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)V")
	private void method3624() {
		@Pc(8) int local8 = this.anInt4455;
		@Pc(11) int local11 = this.anInt4453;
		@Pc(14) long local14 = this.aLong137;
		if (this.aClass3_Sub29_2 != null && this.anInt4456 == local11) {
			this.method3619(this.aBoolean337, this.aClass3_Sub29_2, this.aBoolean338);
			this.method3624();
			return;
		}
		while (local11 == this.anInt4453) {
			while (local11 == this.aClass110_1.anIntArray276[local8]) {
				this.aClass110_1.method2977(local8);
				@Pc(43) int local43 = this.aClass110_1.method2985(local8);
				if (local43 == 1) {
					this.aClass110_1.method2978();
					this.aClass110_1.method2990(local8);
					if (this.aClass110_1.method2983()) {
						if (this.aClass3_Sub29_2 != null) {
							this.method3635(this.aBoolean337, this.aClass3_Sub29_2);
							this.method3624();
							return;
						}
						if (!this.aBoolean337 || local11 == 0) {
							this.method3602(true);
							this.aClass110_1.method2989();
							return;
						}
						this.aClass110_1.method2980(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method3620(local43);
				}
				this.aClass110_1.method2984(local8);
				this.aClass110_1.method2990(local8);
			}
			local8 = this.aClass110_1.method2992();
			local11 = this.aClass110_1.anIntArray276[local8];
			local14 = this.aClass110_1.method2986(local11);
		}
		this.anInt4455 = local8;
		this.aLong137 = local14;
		this.anInt4453 = local11;
		if (this.aClass3_Sub29_2 != null && this.anInt4456 < local11) {
			this.anInt4455 = -1;
			this.anInt4453 = this.anInt4456;
			this.aLong137 = this.aClass110_1.method2986(this.anInt4453);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ld;I)I")
	private int method3626(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(14) int local14 = this.anIntArray342[arg0.anInt4374];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt4373) * (16384 - local14) + 32 >> 6) : local14 * arg0.anInt4373 - -32 >> 6;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BIII)V")
	private void method3627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3636(arg1, 64, arg2);
		if ((this.anIntArray334[arg2] & 0x2) != 0) {
			for (@Pc(23) Class3_Sub28 local23 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5318(); local23 != null; local23 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5329()) {
				if (local23.anInt4374 == arg2 && local23.anInt4364 < 0) {
					this.aClass3_Sub28ArrayArray2[arg2][local23.anInt4369] = null;
					this.aClass3_Sub28ArrayArray2[arg2][arg1] = local23;
					@Pc(57) int local57 = (local23.anInt4371 * local23.anInt4365 >> 12) + local23.anInt4381;
					local23.anInt4381 += arg1 - local23.anInt4369 << 8;
					local23.anInt4365 = 4096;
					local23.anInt4369 = arg1;
					local23.anInt4371 = local57 - local23.anInt4381;
					return;
				}
			}
		}
		@Pc(103) Class3_Sub18 local103 = (Class3_Sub18) this.aClass127_25.method3246((long) this.anIntArray344[arg2]);
		if (local103 == null) {
			return;
		}
		@Pc(111) Class3_Sub13_Sub1 local111 = local103.aClass3_Sub13_Sub1Array1[arg1];
		if (local111 == null) {
			return;
		}
		@Pc(118) Class3_Sub28 local118 = new Class3_Sub28();
		local118.aClass3_Sub13_Sub1_2 = local111;
		local118.aClass3_Sub18_1 = local103;
		local118.anInt4374 = arg2;
		local118.aClass20_1 = local103.aClass20Array1[arg1];
		local118.anInt4379 = local103.aByteArray32[arg1];
		local118.anInt4369 = arg1;
		local118.anInt4378 = local103.aByteArray31[arg1] * local103.anInt2554 * arg0 * arg0 + 1024 >> 11;
		local118.anInt4373 = local103.aByteArray33[arg1] & 0xFF;
		local118.anInt4381 = (arg1 << 8) - (local103.aShortArray40[arg1] & 0x7FFF);
		local118.anInt4382 = 0;
		local118.anInt4376 = 0;
		local118.anInt4380 = 0;
		local118.anInt4375 = 0;
		local118.anInt4364 = -1;
		if (this.anIntArray347[arg2] == 0) {
			local118.aClass3_Sub5_Sub3_2 = Static461.method4339(local111, this.method3618(local118), this.method3629(local118), this.method3626(local118));
		} else {
			local118.aClass3_Sub5_Sub3_2 = Static461.method4339(local111, this.method3618(local118), 0, this.method3626(local118));
			this.method3631(local118, local103.aShortArray40[arg1] < 0);
		}
		if (local103.aShortArray40[arg1] < 0) {
			local118.aClass3_Sub5_Sub3_2.method4360(-1);
		}
		if (local118.anInt4379 >= 0) {
			@Pc(271) Class3_Sub28 local271 = this.aClass3_Sub28ArrayArray1[arg2][local118.anInt4379];
			if (local271 != null && local271.anInt4364 < 0) {
				this.aClass3_Sub28ArrayArray2[arg2][local271.anInt4369] = null;
				local271.anInt4364 = 0;
			}
			this.aClass3_Sub28ArrayArray1[arg2][local118.anInt4379] = local118;
		}
		this.aClass3_Sub5_Sub2_1.aClass229_34.method5321(local118);
		this.aClass3_Sub28ArrayArray2[arg2][arg1] = local118;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public synchronized Class3_Sub5 method5187() {
		return this.aClass3_Sub5_Sub2_1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(BII)V")
	private void method3628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ld;B)I")
	private int method3629(@OriginalArg(0) Class3_Sub28 arg0) {
		if (this.anIntArray335[arg0.anInt4374] == 0) {
			return 0;
		}
		@Pc(21) Class20 local21 = arg0.aClass20_1;
		@Pc(37) int local37 = this.anIntArray333[arg0.anInt4374] * this.anIntArray343[arg0.anInt4374] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = arg0.anInt4378 * local45 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt4444 + 128 >> 8;
		local37 = local63 * this.anIntArray335[arg0.anInt4374] + 128 >> 8;
		if (local21.anInt790 > 0) {
			local37 = (int) (Math.pow(0.5D, (double) arg0.anInt4376 * 1.953125E-5D * (double) local21.anInt790) * (double) local37 + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local21.aByteArray8 != null) {
			local102 = arg0.anInt4380;
			local110 = local21.aByteArray8[arg0.anInt4382 + 1];
			if (arg0.anInt4382 < local21.aByteArray8.length - 2) {
				local128 = (local21.aByteArray8[arg0.anInt4382] & 0xFF) << 8;
				local140 = (local21.aByteArray8[arg0.anInt4382 + 2] & 0xFF) << 8;
				local110 += (local21.aByteArray8[arg0.anInt4382 + 3] - local110) * (-local128 + local102) / (local140 - local128);
			}
			local37 = local110 * local37 + 32 >> 6;
		}
		if (arg0.anInt4364 > 0 && local21.aByteArray7 != null) {
			local102 = arg0.anInt4364;
			local110 = local21.aByteArray7[arg0.anInt4375 + 1];
			if (arg0.anInt4375 < local21.aByteArray7.length - 2) {
				local128 = (local21.aByteArray7[arg0.anInt4375] & 0xFF) << 8;
				local140 = (local21.aByteArray7[arg0.anInt4375 + 2] & 0xFF) << 8;
				local110 += (local102 - local128) * (-local110 + local21.aByteArray7[arg0.anInt4375 + 3]) / (local140 - local128);
			}
			local37 = local37 * local110 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Lclient!ld;I)Z")
	public boolean method3630(@OriginalArg(0) Class3_Sub28 arg0) {
		if (arg0.aClass3_Sub5_Sub3_2 != null) {
			return false;
		}
		if (arg0.anInt4364 >= 0) {
			arg0.method5987();
			if (arg0.anInt4379 > 0 && this.aClass3_Sub28ArrayArray1[arg0.anInt4374][arg0.anInt4379] == arg0) {
				this.aClass3_Sub28ArrayArray1[arg0.anInt4374][arg0.anInt4379] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ld;IZ)V")
	public void method3631(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub13_Sub1_2.aByteArray24.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass3_Sub13_Sub1_2.aBoolean152) {
			@Pc(37) int local37 = local8 + local8 - arg0.aClass3_Sub13_Sub1_2.anInt1850;
			local27 = (int) ((long) local37 * (long) this.anIntArray347[arg0.anInt4374] >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				arg0.aClass3_Sub5_Sub3_2.method4349();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray347[arg0.anInt4374] * (long) local8 >> 6);
		}
		arg0.aClass3_Sub5_Sub3_2.method4336(local27);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IBI)V")
	private void method3632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray344[arg1] != arg0) {
			this.anIntArray344[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub28ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	public synchronized void method3633() {
		for (@Pc(19) Class3_Sub18 local19 = (Class3_Sub18) this.aClass127_25.method3248(); local19 != null; local19 = (Class3_Sub18) this.aClass127_25.method3252()) {
			local19.method2115();
		}
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(I)Z")
	public synchronized boolean method3634() {
		return this.aClass110_1.method2987();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZLclient!mf;I)V")
	public synchronized void method3635(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub29 arg1) {
		this.method3619(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIBI)V")
	private void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class3_Sub28 local16 = this.aClass3_Sub28ArrayArray2[arg2][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass3_Sub28ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray334[arg2] & 0x2) == 0) {
			local16.anInt4364 = 0;
			return;
		}
		for (@Pc(40) Class3_Sub28 local40 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5328(); local40 != null; local40 = (Class3_Sub28) this.aClass3_Sub5_Sub2_1.aClass229_34.method5325()) {
			if (local40.anInt4374 == local16.anInt4374 && local40.anInt4364 < 0 && local40 != local16) {
				local16.anInt4364 = 0;
				return;
			}
		}
	}
}
