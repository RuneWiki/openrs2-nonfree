import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!ma", name = "Jb", descriptor = "Z")
	private boolean aBoolean111;

	@OriginalMember(owner = "client!ma", name = "Kb", descriptor = "I")
	private int anInt2749;

	@OriginalMember(owner = "client!ma", name = "Lb", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!ma", name = "Mb", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ma", name = "Ob", descriptor = "I")
	private int anInt2750;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
	private int anInt2715 = 256;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "[I")
	private final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "[[Lclient!wf;")
	private final Class1_Sub27[][] aClass1_Sub27ArrayArray1 = new Class1_Sub27[16][128];

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "[I")
	private final int[] anIntArray319 = new int[16];

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "[I")
	private final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "[I")
	private final int[] anIntArray318 = new int[16];

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "[I")
	private final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "[I")
	public final int[] anIntArray317 = new int[16];

	@OriginalMember(owner = "client!ma", name = "yb", descriptor = "[I")
	private final int[] anIntArray323 = new int[16];

	@OriginalMember(owner = "client!ma", name = "Ab", descriptor = "[I")
	private final int[] anIntArray324 = new int[16];

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
	private final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "[I")
	private final int[] anIntArray321 = new int[16];

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "[I")
	private final int[] anIntArray320 = new int[16];

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "I")
	private final int anInt2719 = 1000000;

	@OriginalMember(owner = "client!ma", name = "Bb", descriptor = "[I")
	private final int[] anIntArray325 = new int[16];

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "[I")
	public final int[] anIntArray322 = new int[16];

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "[[Lclient!wf;")
	private final Class1_Sub27[][] aClass1_Sub27ArrayArray2 = new Class1_Sub27[16][128];

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "[I")
	public final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!ma", name = "Cb", descriptor = "Lclient!wb;")
	private final Class95 aClass95_1 = new Class95();

	@OriginalMember(owner = "client!ma", name = "Nb", descriptor = "Lclient!nh;")
	private final Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1 = new Class1_Sub6_Sub4(this);

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "Lclient!wh;")
	private final Class99 aClass99_10 = new Class99(128);

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub2() {
		this.method2049();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)I")
	public int method2047() {
		return this.anInt2715;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
	public synchronized void method2048() {
		this.aClass95_1.method3247();
		this.method2049();
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(B)V")
	private void method2049() {
		this.method2061(-1);
		this.method2069(-1);
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray314[local13] = this.anIntArray324[local13];
		}
		for (@Pc(36) int local36 = 0; local36 < 16; local36++) {
			this.anIntArray325[local36] = this.anIntArray324[local36] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)V")
	private void method2050(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray320[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IILclient!wf;II)Z")
	public boolean method2051(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub27 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt4421 = Static178.anInt4019 / 100;
		if (arg2.anInt4407 >= 0 && (arg2.aClass1_Sub6_Sub3_3 == null || arg2.aClass1_Sub6_Sub3_3.method2195())) {
			arg2.method3285();
			arg2.method3295();
			if (arg2.anInt4414 > 0 && arg2 == this.aClass1_Sub27ArrayArray2[arg2.anInt4424][arg2.anInt4414]) {
				this.aClass1_Sub27ArrayArray2[arg2.anInt4424][arg2.anInt4414] = null;
			}
			return true;
		}
		@Pc(51) int local51 = arg2.anInt4406;
		if (local51 > 0) {
			local51 -= (int) (Math.pow(2.0D, (double) this.anIntArray323[arg2.anInt4424] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local51 < 0) {
				local51 = 0;
			}
			arg2.anInt4406 = local51;
		}
		@Pc(91) boolean local91 = false;
		arg2.aClass1_Sub6_Sub3_3.method2214(this.method2073(arg2));
		arg2.anInt4417++;
		@Pc(122) double local122 = (double) ((arg2.anInt4419 - 60 << 8) + (arg2.anInt4406 * arg2.anInt4411 >> 12)) * 5.086263020833333E-6D;
		@Pc(125) Class98 local125 = arg2.aClass98_1;
		arg2.anInt4416 += local125.anInt4394;
		if (local125.anInt4391 > 0) {
			if (local125.anInt4392 > 0) {
				arg2.anInt4409 += (int) (Math.pow(2.0D, local122 * (double) local125.anInt4392) * 128.0D + 0.5D);
			} else {
				arg2.anInt4409 += 128;
			}
			if (local125.anInt4391 * arg2.anInt4409 >= 819200) {
				local91 = true;
			}
		}
		if (local125.aByteArray52 != null) {
			if (local125.anInt4388 > 0) {
				arg2.anInt4405 += (int) (Math.pow(2.0D, (double) local125.anInt4388 * local122) * 128.0D + 0.5D);
			} else {
				arg2.anInt4405 += 128;
			}
			while (local125.aByteArray52.length - 2 > arg2.anInt4420 && (local125.aByteArray52[arg2.anInt4420 + 2] & 0xFF) << 8 < arg2.anInt4405) {
				arg2.anInt4420 += 2;
			}
			if (local125.aByteArray52.length - 2 == arg2.anInt4420 && local125.aByteArray52[arg2.anInt4420 + 1] == 0) {
				local91 = true;
			}
		}
		if (arg2.anInt4407 >= 0 && local125.aByteArray53 != null && (this.anIntArray312[arg2.anInt4424] & 0x1) == 0 && (arg2.anInt4414 < 0 || this.aClass1_Sub27ArrayArray2[arg2.anInt4424][arg2.anInt4414] != arg2)) {
			if (local125.anInt4396 > 0) {
				arg2.anInt4407 += (int) (Math.pow(2.0D, (double) local125.anInt4396 * local122) * 128.0D + 0.5D);
			} else {
				arg2.anInt4407 += 128;
			}
			while (local125.aByteArray53.length - 2 > arg2.anInt4410 && arg2.anInt4407 > (local125.aByteArray53[arg2.anInt4410 + 2] & 0xFF) << 8) {
				arg2.anInt4410 += 2;
			}
			if (arg2.anInt4410 == local125.aByteArray53.length - 2) {
				local91 = true;
			}
		}
		if (!local91) {
			arg2.aClass1_Sub6_Sub3_3.method2197(arg2.anInt4421, this.method2054(arg2), this.method2076(arg2));
			return false;
		}
		arg2.aClass1_Sub6_Sub3_3.method2217(arg2.anInt4421);
		if (arg0 == null) {
			arg2.aClass1_Sub6_Sub3_3.method2373(arg1);
		} else {
			arg2.aClass1_Sub6_Sub3_3.method2371(arg0, arg3, arg1);
		}
		if (arg2.aClass1_Sub6_Sub3_3.method2191()) {
			this.aClass1_Sub6_Sub4_1.aClass1_Sub6_Sub1_2.method1995(arg2.aClass1_Sub6_Sub3_3);
		}
		arg2.method3285();
		if (arg2.anInt4407 >= 0) {
			arg2.method3295();
			if (arg2.anInt4414 > 0 && this.aClass1_Sub27ArrayArray2[arg2.anInt4424][arg2.anInt4414] == arg2) {
				this.aClass1_Sub27ArrayArray2[arg2.anInt4424][arg2.anInt4414] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BII)V")
	public synchronized void method2052() {
		this.method2056();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	private void method2053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!wf;)I")
	private int method2054(@OriginalArg(1) Class1_Sub27 arg0) {
		@Pc(6) Class98 local6 = arg0.aClass98_1;
		@Pc(22) int local22 = this.anIntArray316[arg0.anInt4424] * this.anIntArray315[arg0.anInt4424] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt4412 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt2715 + 128 >> 8;
		if (local6.anInt4391 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) local6.anInt4391 * (double) arg0.anInt4409 * 1.953125E-5D) + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(83) int local83;
		@Pc(108) int local108;
		@Pc(120) int local120;
		if (local6.aByteArray52 != null) {
			local83 = local6.aByteArray52[arg0.anInt4420 + 1];
			local86 = arg0.anInt4405;
			if (arg0.anInt4420 < local6.aByteArray52.length - 2) {
				local108 = (local6.aByteArray52[arg0.anInt4420] & 0xFF) << 8;
				local120 = (local6.aByteArray52[arg0.anInt4420 + 2] & 0xFF) << 8;
				local83 += (local86 - local108) * (local6.aByteArray52[arg0.anInt4420 + 3] - local83) / (local120 - local108);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt4407 > 0 && local6.aByteArray53 != null) {
			local86 = arg0.anInt4407;
			local83 = local6.aByteArray53[arg0.anInt4410 + 1];
			if (local6.aByteArray53.length - 2 > arg0.anInt4410) {
				local108 = (local6.aByteArray53[arg0.anInt4410] & 0xFF) << 8;
				local120 = (local6.aByteArray53[arg0.anInt4410 + 2] & 0xFF) << 8;
				local83 += (local6.aByteArray53[arg0.anInt4410 + 3] - local83) * (local86 - local108) / (local120 - local108);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
	private void method2055(@OriginalArg(1) int arg0) {
		if ((this.anIntArray312[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub27 local28 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3148(); local28 != null; local28 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3150()) {
			if (local28.anInt4424 == arg0) {
				local28.anInt4426 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	private void method2056() {
		this.anIntArray324[9] = 128;
		this.anIntArray325[9] = 128;
		this.method2060(9, 128);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!hj;IZ)V")
	public synchronized void method2057(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) boolean arg1) {
		this.method2048();
		this.aClass95_1.method3250(arg0.aByteArray25);
		this.aLong90 = 0L;
		this.aBoolean111 = arg1;
		@Pc(21) int local21 = this.aClass95_1.method3246();
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			this.aClass95_1.method3245(local23);
			this.aClass95_1.method3256(local23);
			this.aClass95_1.method3254(local23);
		}
		this.anInt2749 = this.aClass95_1.method3242();
		this.anInt2750 = this.aClass95_1.anIntArray500[this.anInt2749];
		this.aLong89 = this.aClass95_1.method3252(this.anInt2750);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)V")
	private void method2059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray313[arg0] = arg1;
		this.anIntArray322[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
	private void method2060(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray314[arg0]) {
			this.anIntArray314[arg0] = arg1;
			for (@Pc(29) int local29 = 0; local29 < 128; local29++) {
				this.aClass1_Sub27ArrayArray2[arg0][local29] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2371(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass95_1.method3249()) {
			@Pc(16) int local16 = this.aClass95_1.anInt4301 * this.anInt2719 / Static178.anInt4019;
			do {
				@Pc(25) long local25 = this.aLong90 + (long) arg2 * (long) local16;
				if (this.aLong89 - local25 >= 0L) {
					this.aLong90 = local25;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local16 + this.aLong89 - this.aLong90 - 1L) / (long) local16);
				this.aLong90 += (long) local52 * (long) local16;
				arg2 -= local52;
				this.aClass1_Sub6_Sub4_1.method2371(arg0, arg1, local52);
				this.method2067();
				arg1 += local52;
			} while (this.aClass95_1.method3249());
		}
		this.aClass1_Sub6_Sub4_1.method2371(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	private void method2061(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class1_Sub27 local6 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3148(); local6 != null; local6 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3150()) {
			if (arg0 < 0 || arg0 == local6.anInt4424) {
				if (local6.aClass1_Sub6_Sub3_3 != null) {
					local6.aClass1_Sub6_Sub3_3.method2217(Static178.anInt4019 / 100);
					if (local6.aClass1_Sub6_Sub3_3.method2191()) {
						this.aClass1_Sub6_Sub4_1.aClass1_Sub6_Sub1_2.method1995(local6.aClass1_Sub6_Sub3_3);
					}
					local6.method3285();
				}
				if (local6.anInt4407 < 0) {
					this.aClass1_Sub27ArrayArray1[local6.anInt4424][local6.anInt4419] = null;
				}
				local6.method3295();
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wf;ZZ)V")
	public void method2062(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass1_Sub19_Sub1_1.aByteArray35.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass1_Sub19_Sub1_1.aBoolean115) {
			@Pc(46) int local46 = local16 + local16 - arg0.aClass1_Sub19_Sub1_1.anInt2892;
			local35 = (int) ((long) this.anIntArray317[arg0.anInt4424] * (long) local46 >> 6);
			local16 <<= 0x8;
			if (local35 >= local16) {
				arg0.aClass1_Sub6_Sub3_3.method2220();
				local35 = local16 + local16 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) this.anIntArray317[arg0.anInt4424] * (long) local16 >> 6);
		}
		arg0.aClass1_Sub6_Sub3_3.method2209(local35);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	private void method2063(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local3 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2075(local28, local22, local16);
		} else if (local3 == 144) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method2079(local28, local22, local16);
			} else {
				this.method2075(64, local22, local16);
			}
		} else if (local3 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2053(local28, local16, local22);
		} else if (local3 == 176) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local22 == 0) {
				this.anIntArray325[local16] = (local28 << 14) + (this.anIntArray325[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray325[local16] = (local28 << 7) + (this.anIntArray325[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray321[local16] = (this.anIntArray321[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray321[local16] = (this.anIntArray321[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray323[local16] = (this.anIntArray323[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray323[local16] = local28 + (this.anIntArray323[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray316[local16] = (local28 << 7) + (this.anIntArray316[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray316[local16] = local28 + (this.anIntArray316[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray318[local16] = (this.anIntArray318[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray318[local16] = local28 + (this.anIntArray318[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray315[local16] = (local28 << 7) + (this.anIntArray315[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray315[local16] = (this.anIntArray315[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray312[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray312[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2065(local16);
					this.anIntArray312[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray312[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray311[local16] = (local28 << 7) + (this.anIntArray311[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray311[local16] = (this.anIntArray311[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray311[local16] = (this.anIntArray311[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray311[local16] = local28 + (this.anIntArray311[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2061(local16);
			}
			if (local22 == 121) {
				this.method2069(local16);
			}
			if (local22 == 123) {
				this.method2072(local16);
			}
			@Pc(491) int local491;
			if (local22 == 6) {
				local491 = this.anIntArray311[local16];
				if (local491 == 16384) {
					this.anIntArray319[local16] = (this.anIntArray319[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local491 = this.anIntArray311[local16];
				if (local491 == 16384) {
					this.anIntArray319[local16] = local28 + (this.anIntArray319[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray317[local16] = (this.anIntArray317[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray317[local16] = (this.anIntArray317[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray312[local16] |= 0x4;
				} else {
					this.method2055(local16);
					this.anIntArray312[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2059(local16, (local28 << 7) + (this.anIntArray313[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method2059(local16, local28 + (this.anIntArray313[local16] & 0xFFFFFF80));
			}
		} else if (local3 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2060(local16, local22 + this.anIntArray325[local16]);
		} else if (local3 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2064(local16, local22);
		} else if (local3 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F017F) >> 9);
			this.method2050(local16, local22);
		} else {
			local3 = arg0 & 0xFF;
			if (local3 == 255) {
				this.method2049();
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(BII)V")
	private void method2064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)V")
	private void method2065(@OriginalArg(1) int arg0) {
		if ((this.anIntArray312[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3148(); local13 != null; local13 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3150()) {
			if (arg0 == local13.anInt4424 && this.aClass1_Sub27ArrayArray1[arg0][local13.anInt4419] == null && local13.anInt4407 < 0) {
				local13.anInt4407 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(B)V")
	private void method2067() {
		@Pc(6) int local6 = this.anInt2749;
		@Pc(9) long local9 = this.aLong89;
		@Pc(12) int local12 = this.anInt2750;
		while (local12 == this.anInt2750) {
			while (this.aClass95_1.anIntArray500[local6] == local12) {
				this.aClass95_1.method3245(local6);
				@Pc(22) int local22 = this.aClass95_1.method3257(local6);
				if (local22 == 1) {
					this.aClass95_1.method3251();
					this.aClass95_1.method3254(local6);
					if (this.aClass95_1.method3253()) {
						if (!this.aBoolean111 || local12 == 0) {
							this.method2049();
							this.aClass95_1.method3247();
							return;
						}
						this.aClass95_1.method3243(local9);
					}
					break;
				}
				if ((local22 & 0x80) != 0) {
					this.method2063(local22);
				}
				this.aClass95_1.method3256(local6);
				this.aClass95_1.method3254(local6);
			}
			local6 = this.aClass95_1.method3242();
			local12 = this.aClass95_1.anIntArray500[local6];
			local9 = this.aClass95_1.method3252(local12);
		}
		this.aLong89 = local9;
		this.anInt2749 = local6;
		this.anInt2750 = local12;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public synchronized void method2068() {
		for (@Pc(9) Class1_Sub17 local9 = (Class1_Sub17) this.aClass99_10.method3288(); local9 != null; local9 = (Class1_Sub17) this.aClass99_10.method3289()) {
			local9.method3295();
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)V")
	private void method2069(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method2069(local10);
			}
			return;
		}
		this.anIntArray316[arg0] = 12800;
		this.anIntArray318[arg0] = 8192;
		this.anIntArray315[arg0] = 16383;
		this.anIntArray320[arg0] = 8192;
		this.anIntArray321[arg0] = 0;
		this.anIntArray323[arg0] = 8192;
		this.method2065(arg0);
		this.method2055(arg0);
		this.anIntArray312[arg0] = 0;
		this.anIntArray311[arg0] = 32767;
		this.anIntArray319[arg0] = 256;
		this.anIntArray317[arg0] = 0;
		this.method2059(arg0, 8192);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	public synchronized void method2070(@OriginalArg(0) int arg0) {
		this.anInt2715 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!kh;IILclient!sd;Lclient!hj;)Z")
	public synchronized boolean method2071(@OriginalArg(0) Class50 arg0, @OriginalArg(3) Class60 arg1, @OriginalArg(4) Class1_Sub11 arg2) {
		@Pc(1) boolean local1 = true;
		arg2.method1339();
		@Pc(17) int[] local17 = new int[] { 22050 };
		for (@Pc(23) Class1_Sub23 local23 = (Class1_Sub23) arg2.aClass99_4.method3288(); local23 != null; local23 = (Class1_Sub23) arg2.aClass99_4.method3289()) {
			@Pc(34) int local34 = (int) local23.aLong150;
			@Pc(42) Class1_Sub17 local42 = (Class1_Sub17) this.aClass99_10.method3292((long) local34);
			if (local42 == null) {
				local42 = Static165.method2851(local34, arg1);
				if (local42 == null) {
					local1 = false;
					continue;
				}
				this.aClass99_10.method3290(local42, (long) local34);
			}
			if (!local42.method1922(local17, local23.aByteArray45, arg0)) {
				local1 = false;
			}
		}
		if (local1) {
			arg2.method1338();
		}
		return local1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)V")
	private void method2072(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class1_Sub27 local6 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3148(); local6 != null; local6 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3150()) {
			if ((arg0 < 0 || local6.anInt4424 == arg0) && local6.anInt4407 < 0) {
				this.aClass1_Sub27ArrayArray1[local6.anInt4424][local6.anInt4419] = null;
				local6.anInt4407 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLclient!wf;)I")
	private int method2073(@OriginalArg(1) Class1_Sub27 arg0) {
		@Pc(13) Class98 local13 = arg0.aClass98_1;
		@Pc(24) int local24 = (arg0.anInt4406 * arg0.anInt4411 >> 12) + arg0.anInt4408;
		local24 += (this.anIntArray320[arg0.anInt4424] - 8192) * this.anIntArray319[arg0.anInt4424] >> 12;
		@Pc(62) int local62;
		if (local13.anInt4394 > 0 && (local13.anInt4397 > 0 || this.anIntArray321[arg0.anInt4424] > 0)) {
			local62 = local13.anInt4397 << 2;
			@Pc(67) int local67 = local13.anInt4393 << 1;
			if (arg0.anInt4417 < local67) {
				local62 = local62 * arg0.anInt4417 / local67;
			}
			local62 += this.anIntArray321[arg0.anInt4424] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt4416 & 0x1FF) * 0.01227184630308513D);
			local24 += (int) (local97 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass1_Sub19_Sub1_1.anInt2891 * 256) * Math.pow(2.0D, (double) local24 * 3.255208333333333E-4D) / (double) Static178.anInt4019 + 0.5D);
		return local62 < 1 ? 1 : local62;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2374() {
		return 0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()Lclient!d;")
	@Override
	public synchronized Class1_Sub6 method2369() {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(ILclient!wf;)Z")
	public boolean method2074(@OriginalArg(1) Class1_Sub27 arg0) {
		if (arg0.aClass1_Sub6_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt4407 >= 0) {
			arg0.method3295();
			if (arg0.anInt4414 > 0 && this.aClass1_Sub27ArrayArray2[arg0.anInt4424][arg0.anInt4414] == arg0) {
				this.aClass1_Sub27ArrayArray2[arg0.anInt4424][arg0.anInt4414] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2373(@OriginalArg(0) int arg0) {
		if (this.aClass95_1.method3249()) {
			@Pc(18) int local18 = this.aClass95_1.anInt4301 * this.anInt2719 / Static178.anInt4019;
			do {
				@Pc(27) long local27 = this.aLong90 + (long) local18 * (long) arg0;
				if (this.aLong89 - local27 >= 0L) {
					this.aLong90 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong89 - this.aLong90 - 1L) / (long) local18);
				this.aLong90 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass1_Sub6_Sub4_1.method2373(local58);
				this.method2067();
			} while (this.aClass95_1.method3249());
		}
		this.aClass1_Sub6_Sub4_1.method2373(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V")
	private void method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub27 local10 = this.aClass1_Sub27ArrayArray1[arg2][arg1];
		if (local10 == null) {
			return;
		}
		this.aClass1_Sub27ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray312[arg2] & 0x2) == 0) {
			local10.anInt4407 = 0;
			return;
		}
		for (@Pc(46) Class1_Sub27 local46 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3148(); local46 != null; local46 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3150()) {
			if (local46.anInt4424 == local10.anInt4424 && local46.anInt4407 < 0 && local10 != local46) {
				local10.anInt4407 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!wf;B)I")
	private int method2076(@OriginalArg(0) Class1_Sub27 arg0) {
		@Pc(18) int local18 = this.anIntArray318[arg0.anInt4424];
		return local18 < 8192 ? arg0.anInt4422 * local18 + 32 >> 6 : 16384 - ((128 - arg0.anInt4422) * (-local18 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()Lclient!d;")
	@Override
	public synchronized Class1_Sub6 method2368() {
		return this.aClass1_Sub6_Sub4_1;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(B)Z")
	public synchronized boolean method2077() {
		return this.aClass95_1.method3249();
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(B)V")
	public synchronized void method2078() {
		for (@Pc(17) Class1_Sub17 local17 = (Class1_Sub17) this.aClass99_10.method3288(); local17 != null; local17 = (Class1_Sub17) this.aClass99_10.method3289()) {
			local17.method1924();
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIII)V")
	private void method2079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2075(64, arg1, arg2);
		if ((this.anIntArray312[arg2] & 0x2) != 0) {
			for (@Pc(23) Class1_Sub27 local23 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3149(); local23 != null; local23 = (Class1_Sub27) this.aClass1_Sub6_Sub4_1.aClass91_12.method3142()) {
				if (local23.anInt4424 == arg2 && local23.anInt4407 < 0) {
					this.aClass1_Sub27ArrayArray1[arg2][local23.anInt4419] = null;
					this.aClass1_Sub27ArrayArray1[arg2][arg1] = local23;
					@Pc(61) int local61 = local23.anInt4408 + (local23.anInt4406 * local23.anInt4411 >> 12);
					local23.anInt4408 += arg1 - local23.anInt4419 << 8;
					local23.anInt4406 = 4096;
					local23.anInt4411 = local61 - local23.anInt4408;
					local23.anInt4419 = arg1;
					return;
				}
			}
		}
		@Pc(106) Class1_Sub17 local106 = (Class1_Sub17) this.aClass99_10.method3292((long) this.anIntArray314[arg2]);
		if (local106 == null) {
			return;
		}
		@Pc(114) Class1_Sub19_Sub1 local114 = local106.aClass1_Sub19_Sub1Array1[arg1];
		if (local114 == null) {
			return;
		}
		@Pc(121) Class1_Sub27 local121 = new Class1_Sub27();
		local121.aClass1_Sub19_Sub1_1 = local114;
		local121.aClass1_Sub17_1 = local106;
		local121.anInt4424 = arg2;
		local121.aClass98_1 = local106.aClass98Array1[arg1];
		local121.anInt4414 = local106.aByteArray31[arg1];
		local121.anInt4419 = arg1;
		local121.anInt4412 = local106.anInt2554 * arg0 * arg0 * local106.aByteArray32[arg1] + 1024 >> 11;
		local121.anInt4422 = local106.aByteArray30[arg1] & 0xFF;
		local121.anInt4408 = (arg1 << 8) - (local106.aShortArray35[arg1] & 0x7FFF);
		local121.anInt4407 = -1;
		local121.anInt4410 = 0;
		local121.anInt4420 = 0;
		local121.anInt4409 = 0;
		local121.anInt4405 = 0;
		if (this.anIntArray317[arg2] == 0) {
			local121.aClass1_Sub6_Sub3_3 = Static216.method2204(local114, this.method2073(local121), this.method2054(local121), this.method2076(local121));
		} else {
			local121.aClass1_Sub6_Sub3_3 = Static216.method2204(local114, this.method2073(local121), 0, this.method2076(local121));
			this.method2062(local121, local106.aShortArray35[arg1] < 0);
		}
		if (local106.aShortArray35[arg1] < 0) {
			local121.aClass1_Sub6_Sub3_3.method2184(-1);
		}
		if (local121.anInt4414 >= 0) {
			@Pc(271) Class1_Sub27 local271 = this.aClass1_Sub27ArrayArray2[arg2][local121.anInt4414];
			if (local271 != null && local271.anInt4407 < 0) {
				this.aClass1_Sub27ArrayArray1[arg2][local271.anInt4419] = null;
				local271.anInt4407 = 0;
			}
			this.aClass1_Sub27ArrayArray2[arg2][local121.anInt4414] = local121;
		}
		this.aClass1_Sub6_Sub4_1.aClass91_12.method3151(local121);
		this.aClass1_Sub27ArrayArray1[arg2][arg1] = local121;
	}
}
