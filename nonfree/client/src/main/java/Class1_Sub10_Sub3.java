import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub10_Sub3 extends Class1_Sub10 {

	@OriginalMember(owner = "client!of", name = "Qb", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!of", name = "Sb", descriptor = "I")
	private int anInt4338;

	@OriginalMember(owner = "client!of", name = "Tb", descriptor = "I")
	private int anInt4339;

	@OriginalMember(owner = "client!of", name = "Ub", descriptor = "Z")
	private boolean aBoolean266;

	@OriginalMember(owner = "client!of", name = "Vb", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!of", name = "Wb", descriptor = "Z")
	private boolean aBoolean267;

	@OriginalMember(owner = "client!of", name = "Xb", descriptor = "I")
	private int anInt4340;

	@OriginalMember(owner = "client!of", name = "Yb", descriptor = "Lclient!sg;")
	private Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "[I")
	public int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!of", name = "I", descriptor = "[I")
	private int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!of", name = "x", descriptor = "[I")
	private int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!of", name = "L", descriptor = "[I")
	private int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!of", name = "B", descriptor = "I")
	private int anInt4293 = 1000000;

	@OriginalMember(owner = "client!of", name = "W", descriptor = "[I")
	private int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!of", name = "R", descriptor = "[I")
	private int[] anIntArray378 = new int[16];

	@OriginalMember(owner = "client!of", name = "E", descriptor = "[I")
	private int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!of", name = "s", descriptor = "[I")
	private int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!of", name = "rb", descriptor = "[[Lclient!sa;")
	private Class1_Sub23[][] aClass1_Sub23ArrayArray2 = new Class1_Sub23[16][128];

	@OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
	private int anInt4315 = 256;

	@OriginalMember(owner = "client!of", name = "ub", descriptor = "[I")
	private int[] anIntArray382 = new int[16];

	@OriginalMember(owner = "client!of", name = "tb", descriptor = "[I")
	public int[] anIntArray381 = new int[16];

	@OriginalMember(owner = "client!of", name = "Jb", descriptor = "[I")
	private int[] anIntArray385 = new int[16];

	@OriginalMember(owner = "client!of", name = "Ib", descriptor = "[I")
	private int[] anIntArray384 = new int[16];

	@OriginalMember(owner = "client!of", name = "Lb", descriptor = "[I")
	private int[] anIntArray387 = new int[16];

	@OriginalMember(owner = "client!of", name = "J", descriptor = "[I")
	private int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!of", name = "jb", descriptor = "[[Lclient!sa;")
	private Class1_Sub23[][] aClass1_Sub23ArrayArray1 = new Class1_Sub23[16][128];

	@OriginalMember(owner = "client!of", name = "zb", descriptor = "[I")
	public int[] anIntArray383 = new int[16];

	@OriginalMember(owner = "client!of", name = "Kb", descriptor = "[I")
	private int[] anIntArray386 = new int[16];

	@OriginalMember(owner = "client!of", name = "gb", descriptor = "Lclient!dm;")
	private Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!of", name = "Rb", descriptor = "Lclient!ge;")
	private Class1_Sub10_Sub1 aClass1_Sub10_Sub1_1 = new Class1_Sub10_Sub1(this);

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "Lclient!vl;")
	private Class186 aClass186_18 = new Class186(128);

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub10_Sub3() {
		this.method3169();
		this.method3170(true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)V")
	private void method3142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray382[arg1] = arg0;
		this.anIntArray383[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4343() {
		return 0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!sa;I)I")
	private int method3143(@OriginalArg(0) Class1_Sub23 arg0) {
		if (this.anIntArray386[arg0.anInt5087] == 0) {
			return 0;
		}
		@Pc(16) Class20 local16 = arg0.aClass20_1;
		@Pc(42) int local42 = this.anIntArray375[arg0.anInt5087] * this.anIntArray385[arg0.anInt5087] + 4096 >> 13;
		@Pc(50) int local50 = local42 * local42 + 16384 >> 15;
		@Pc(59) int local59 = arg0.anInt5089 * local50 + 16384 >> 15;
		@Pc(68) int local68 = this.anInt4315 * local59 + 128 >> 8;
		local42 = local68 * this.anIntArray386[arg0.anInt5087] + 128 >> 8;
		if (local16.anInt546 > 0) {
			local42 = (int) ((double) local42 * Math.pow(0.5D, (double) arg0.anInt5094 * 1.953125E-5D * (double) local16.anInt546) + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(147) int local147;
		@Pc(137) int local137;
		if (local16.aByteArray16 != null) {
			local109 = arg0.anInt5084;
			local117 = local16.aByteArray16[arg0.anInt5086 + 1];
			if (arg0.anInt5086 < local16.aByteArray16.length - 2) {
				local137 = (local16.aByteArray16[arg0.anInt5086 + 2] & 0xFF) << 8;
				local147 = (local16.aByteArray16[arg0.anInt5086] & 0xFF) << 8;
				local117 += (local109 - local147) * (local16.aByteArray16[arg0.anInt5086 - -3] - local117) / (local137 - local147);
			}
			local42 = local42 * local117 + 32 >> 6;
		}
		if (arg0.anInt5085 > 0 && local16.aByteArray17 != null) {
			local109 = arg0.anInt5085;
			local117 = local16.aByteArray17[arg0.anInt5098 + 1];
			if (arg0.anInt5098 < local16.aByteArray17.length - 2) {
				local147 = (local16.aByteArray17[arg0.anInt5098] & 0xFF) << 8;
				local137 = (local16.aByteArray17[arg0.anInt5098 + 2] & 0xFF) << 8;
				local117 += (local109 - local147) * (-local117 + local16.aByteArray17[arg0.anInt5098 + 3]) / (local137 - local147);
			}
			local42 = local117 * local42 + 32 >> 6;
		}
		return local42;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)I")
	public int method3144() {
		return this.anInt4315;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZI)V")
	private void method3145() {
		this.anIntArray378[9] = 128;
		this.anIntArray380[9] = 128;
		this.method3177(128, 9);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	private void method3146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3156(arg1, arg0, 64);
		if ((this.anIntArray373[arg1] & 0x2) != 0) {
			for (@Pc(29) Class1_Sub23 local29 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method677(); local29 != null; local29 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method670()) {
				if (local29.anInt5087 == arg1 && local29.anInt5085 < 0) {
					this.aClass1_Sub23ArrayArray2[arg1][local29.anInt5079] = null;
					this.aClass1_Sub23ArrayArray2[arg1][arg0] = local29;
					@Pc(69) int local69 = local29.anInt5083 + (local29.anInt5081 * local29.anInt5088 >> 12);
					local29.anInt5083 += arg0 - local29.anInt5079 << 8;
					local29.anInt5081 = local69 - local29.anInt5083;
					local29.anInt5079 = arg0;
					local29.anInt5088 = 4096;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub8 local115 = (Class1_Sub8) this.aClass186_18.method4570((long) this.anIntArray384[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class1_Sub11_Sub1 local123 = local115.aClass1_Sub11_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(132) Class1_Sub23 local132 = new Class1_Sub23();
		local132.aClass1_Sub11_Sub1_1 = local123;
		local132.aClass1_Sub8_1 = local115;
		local132.anInt5087 = arg1;
		local132.aClass20_1 = local115.aClass20Array1[arg0];
		local132.anInt5080 = local115.aByteArray45[arg0];
		local132.anInt5079 = arg0;
		local132.anInt5089 = arg2 * arg2 * local115.anInt1386 * local115.aByteArray43[arg0] + 1024 >> 11;
		local132.anInt5097 = local115.aByteArray44[arg0] & 0xFF;
		local132.anInt5083 = (arg0 << 8) - (local115.aShortArray54[arg0] & 0x7FFF);
		local132.anInt5094 = 0;
		local132.anInt5084 = 0;
		local132.anInt5085 = -1;
		local132.anInt5086 = 0;
		local132.anInt5098 = 0;
		if (this.anIntArray381[arg1] == 0) {
			local132.aClass1_Sub10_Sub4_3 = Static327.method4374(local123, this.method3165(local132), this.method3143(local132), this.method3180(local132));
		} else {
			local132.aClass1_Sub10_Sub4_3 = Static327.method4374(local123, this.method3165(local132), 0, this.method3180(local132));
			this.method3152(local132, local115.aShortArray54[arg0] < 0);
		}
		if (local115.aShortArray54[arg0] < 0) {
			local132.aClass1_Sub10_Sub4_3.method4382(-1);
		}
		if (local132.anInt5080 >= 0) {
			@Pc(287) Class1_Sub23 local287 = this.aClass1_Sub23ArrayArray1[arg1][local132.anInt5080];
			if (local287 != null && local287.anInt5085 < 0) {
				this.aClass1_Sub23ArrayArray2[arg1][local287.anInt5079] = null;
				local287.anInt5085 = 0;
			}
			this.aClass1_Sub23ArrayArray1[arg1][local132.anInt5080] = local132;
		}
		this.aClass1_Sub10_Sub1_1.aClass26_15.method668(local132);
		this.aClass1_Sub23ArrayArray2[arg1][arg0] = local132;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZLclient!sg;Z)V")
	private synchronized void method3147(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub26 arg1, @OriginalArg(3) boolean arg2) {
		this.method3162(arg2);
		this.aClass39_1.method1006(arg1.aByteArray67);
		this.aLong157 = 0L;
		this.aBoolean266 = arg0;
		@Pc(24) int local24 = this.aClass39_1.method995();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass39_1.method1002(local34);
			this.aClass39_1.method994(local34);
			this.aClass39_1.method1004(local34);
		}
		this.anInt4339 = this.aClass39_1.method996();
		this.anInt4338 = this.aClass39_1.anIntArray152[this.anInt4339];
		this.aLong156 = this.aClass39_1.method1005(this.anInt4338);
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V")
	public synchronized void method3148() {
		for (@Pc(11) Class1_Sub8 local11 = (Class1_Sub8) this.aClass186_18.method4567(); local11 != null; local11 = (Class1_Sub8) this.aClass186_18.method4579()) {
			local11.method4767();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
	private void method3149(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(19) int local19;
		@Pc(29) int local29;
		if (local9 == 128) {
			local19 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			this.method3156(local23, local19, local29);
		} else if (local9 == 144) {
			local23 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			local29 = arg0 >> 16 & 0x7F;
			if (local29 <= 0) {
				this.method3156(local23, local19, 64);
			} else {
				this.method3146(local19, local23, local29);
			}
		} else if (local9 == 160) {
			local23 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			local29 = arg0 >> 16 & 0x7F;
			this.method3151(local29, local23, local19);
		} else if (local9 == 176) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			local19 = arg0 >> 8 & 0x7F;
			if (local19 == 0) {
				this.anIntArray380[local23] = (local29 << 14) + (this.anIntArray380[local23] & 0xFFE03FFF);
			}
			if (local19 == 32) {
				this.anIntArray380[local23] = (this.anIntArray380[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local19 == 1) {
				this.anIntArray387[local23] = (local29 << 7) + (this.anIntArray387[local23] & 0xFFFFC07F);
			}
			if (local19 == 33) {
				this.anIntArray387[local23] = (this.anIntArray387[local23] & 0xFFFFFF80) + local29;
			}
			if (local19 == 5) {
				this.anIntArray376[local23] = (this.anIntArray376[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local19 == 37) {
				this.anIntArray376[local23] = local29 + (this.anIntArray376[local23] & 0xFFFFFF80);
			}
			if (local19 == 7) {
				this.anIntArray375[local23] = (this.anIntArray375[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local19 == 39) {
				this.anIntArray375[local23] = local29 + (this.anIntArray375[local23] & 0xFFFFFF80);
			}
			if (local19 == 10) {
				this.anIntArray374[local23] = (this.anIntArray374[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local19 == 42) {
				this.anIntArray374[local23] = (this.anIntArray374[local23] & 0xFFFFFF80) + local29;
			}
			if (local19 == 11) {
				this.anIntArray385[local23] = (this.anIntArray385[local23] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local19 == 43) {
				this.anIntArray385[local23] = local29 + (this.anIntArray385[local23] & 0xFFFFFF80);
			}
			if (local19 == 64) {
				if (local29 >= 64) {
					this.anIntArray373[local23] |= 0x1;
				} else {
					this.anIntArray373[local23] &= 0xFFFFFFFE;
				}
			}
			if (local19 == 65) {
				if (local29 >= 64) {
					this.anIntArray373[local23] |= 0x2;
				} else {
					this.method3159(local23);
					this.anIntArray373[local23] &= 0xFFFFFFFD;
				}
			}
			if (local19 == 99) {
				this.anIntArray377[local23] = (this.anIntArray377[local23] & 0x7F) + (local29 << 7);
			}
			if (local19 == 98) {
				this.anIntArray377[local23] = local29 + (this.anIntArray377[local23] & 0x3F80);
			}
			if (local19 == 101) {
				this.anIntArray377[local23] = (this.anIntArray377[local23] & 0x7F) + (local29 << 7) + 16384;
			}
			if (local19 == 100) {
				this.anIntArray377[local23] = (this.anIntArray377[local23] & 0x3F80) + local29 + 16384;
			}
			if (local19 == 120) {
				this.method3155(local23);
			}
			if (local19 == 121) {
				this.method3182(local23);
			}
			if (local19 == 123) {
				this.method3171(local23);
			}
			@Pc(516) int local516;
			if (local19 == 6) {
				local516 = this.anIntArray377[local23];
				if (local516 == 16384) {
					this.anIntArray372[local23] = (this.anIntArray372[local23] & 0xFFFFC07F) + (local29 << 7);
				}
			}
			if (local19 == 38) {
				local516 = this.anIntArray377[local23];
				if (local516 == 16384) {
					this.anIntArray372[local23] = local29 + (this.anIntArray372[local23] & 0xFFFFFF80);
				}
			}
			if (local19 == 16) {
				this.anIntArray381[local23] = (local29 << 7) + (this.anIntArray381[local23] & 0xFFFFC07F);
			}
			if (local19 == 48) {
				this.anIntArray381[local23] = local29 + (this.anIntArray381[local23] & 0xFFFFFF80);
			}
			if (local19 == 81) {
				if (local29 < 64) {
					this.method3174(local23);
					this.anIntArray373[local23] &= 0xFFFFFFFB;
				} else {
					this.anIntArray373[local23] |= 0x4;
				}
			}
			if (local19 == 17) {
				this.method3142((local29 << 7) + (this.anIntArray382[local23] & 0xFFFFC07F), local23);
			}
			if (local19 == 49) {
				this.method3142((this.anIntArray382[local23] & 0xFFFFFF80) + local29, local23);
			}
		} else if (local9 == 192) {
			local23 = arg0 & 0xF;
			local19 = arg0 >> 8 & 0x7F;
			this.method3177(local19 + this.anIntArray380[local23], local23);
		} else if (local9 == 208) {
			local19 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method3160(local29, local19);
		} else if (local9 == 224) {
			local29 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			local19 = arg0 & 0xF;
			this.method3164(local29, local19);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3170(true);
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public synchronized void method3150() {
		this.method3145();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IIII)V")
	private void method3151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!sa;IZ)V")
	public void method3152(@OriginalArg(0) Class1_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass1_Sub11_Sub1_1.aByteArray51.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass1_Sub11_Sub1_1.aBoolean144) {
			@Pc(46) int local46 = local4 + local4 - arg0.aClass1_Sub11_Sub1_1.anInt2188;
			local35 = (int) ((long) this.anIntArray381[arg0.anInt5087] * (long) local46 >> 6);
			local4 <<= 0x8;
			if (local4 <= local35) {
				local35 = local4 + local4 - local35 - 1;
				arg0.aClass1_Sub10_Sub4_3.method4378();
			}
		} else {
			local35 = (int) ((long) this.anIntArray381[arg0.anInt5087] * (long) local4 >> 6);
		}
		arg0.aClass1_Sub10_Sub4_3.method4370(local35);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V")
	private void method3153() {
		@Pc(8) int local8 = this.anInt4339;
		@Pc(11) long local11 = this.aLong156;
		@Pc(14) int local14 = this.anInt4338;
		if (this.aClass1_Sub26_1 != null && this.anInt4340 == local14) {
			this.method3147(this.aBoolean266, this.aClass1_Sub26_1, this.aBoolean267);
			this.method3153();
			return;
		}
		while (local14 == this.anInt4338) {
			while (local14 == this.aClass39_1.anIntArray152[local8]) {
				this.aClass39_1.method1002(local8);
				@Pc(63) int local63 = this.aClass39_1.method1001(local8);
				if (local63 == 1) {
					this.aClass39_1.method998();
					this.aClass39_1.method1004(local8);
					if (this.aClass39_1.method1007()) {
						if (this.aClass1_Sub26_1 != null) {
							this.method3158(this.aBoolean266, this.aClass1_Sub26_1);
							this.method3153();
							return;
						}
						if (!this.aBoolean266 || local14 == 0) {
							this.method3170(true);
							this.aClass39_1.method1003();
							return;
						}
						this.aClass39_1.method1000(local11);
					}
					break;
				}
				if ((local63 & 0x80) != 0) {
					this.method3149(local63);
				}
				this.aClass39_1.method994(local8);
				this.aClass39_1.method1004(local8);
			}
			local8 = this.aClass39_1.method996();
			local14 = this.aClass39_1.anIntArray152[local8];
			local11 = this.aClass39_1.method1005(local14);
		}
		this.anInt4338 = local14;
		this.anInt4339 = local8;
		this.aLong156 = local11;
		if (this.aClass1_Sub26_1 != null && local14 > this.anInt4340) {
			this.anInt4338 = this.anInt4340;
			this.anInt4339 = -1;
			this.aLong156 = this.aClass39_1.method1005(this.anInt4338);
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)V")
	private void method3155(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method666(); local8 != null; local8 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method672()) {
			if (arg0 < 0 || local8.anInt5087 == arg0) {
				if (local8.aClass1_Sub10_Sub4_3 != null) {
					local8.aClass1_Sub10_Sub4_3.method4367(Static230.anInt3026 / 100);
					if (local8.aClass1_Sub10_Sub4_3.method4380()) {
						this.aClass1_Sub10_Sub1_1.aClass1_Sub10_Sub2_3.method1863(local8.aClass1_Sub10_Sub4_3);
					}
					local8.method3845();
				}
				if (local8.anInt5085 < 0) {
					this.aClass1_Sub23ArrayArray2[local8.anInt5087][local8.anInt5079] = null;
				}
				local8.method4767();
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IIII)V")
	private void method3156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub23 local12 = this.aClass1_Sub23ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub23ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray373[arg0] & 0x2) == 0) {
			local12.anInt5085 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub23 local47 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method666(); local47 != null; local47 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method672()) {
			if (local12.anInt5087 == local47.anInt5087 && local47.anInt5085 < 0 && local12 != local47) {
				local12.anInt5085 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public synchronized void method3157() {
		for (@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) this.aClass186_18.method4567(); local17 != null; local17 = (Class1_Sub8) this.aClass186_18.method4579()) {
			local17.method1136();
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BZLclient!sg;)V")
	public synchronized void method3158(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		this.method3147(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	private void method3159(@OriginalArg(0) int arg0) {
		if ((this.anIntArray373[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(21) Class1_Sub23 local21 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method666(); local21 != null; local21 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method672()) {
			if (arg0 == local21.anInt5087 && this.aClass1_Sub23ArrayArray2[arg0][local21.anInt5079] == null && local21.anInt5085 < 0) {
				local21.anInt5085 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(III)V")
	private void method3160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IILclient!sa;IB)Z")
	public boolean method3161(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub23 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5082 = Static230.anInt3026 / 100;
		if (arg2.anInt5085 >= 0 && (arg2.aClass1_Sub10_Sub4_3 == null || arg2.aClass1_Sub10_Sub4_3.method4350())) {
			arg2.method3845();
			arg2.method4767();
			if (arg2.anInt5080 > 0 && arg2 == this.aClass1_Sub23ArrayArray1[arg2.anInt5087][arg2.anInt5080]) {
				this.aClass1_Sub23ArrayArray1[arg2.anInt5087][arg2.anInt5080] = null;
			}
			return true;
		}
		@Pc(66) int local66 = arg2.anInt5088;
		@Pc(68) boolean local68 = false;
		if (local66 > 0) {
			local66 -= (int) (Math.pow(2.0D, (double) this.anIntArray376[arg2.anInt5087] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local66 < 0) {
				local66 = 0;
			}
			arg2.anInt5088 = local66;
		}
		arg2.aClass1_Sub10_Sub4_3.method4348(this.method3165(arg2));
		@Pc(111) Class20 local111 = arg2.aClass20_1;
		@Pc(129) double local129 = (double) ((arg2.anInt5079 - 60 << 8) + (arg2.anInt5088 * arg2.anInt5081 >> 12)) * 5.086263020833333E-6D;
		arg2.anInt5092 += local111.anInt542;
		arg2.anInt5095++;
		if (local111.anInt546 > 0) {
			if (local111.anInt539 <= 0) {
				arg2.anInt5094 += 128;
			} else {
				arg2.anInt5094 += (int) (Math.pow(2.0D, (double) local111.anInt539 * local129) * 128.0D + 0.5D);
			}
			if (local111.anInt546 * arg2.anInt5094 >= 819200) {
				local68 = true;
			}
		}
		if (local111.aByteArray16 != null) {
			if (local111.anInt545 > 0) {
				arg2.anInt5084 += (int) (Math.pow(2.0D, (double) local111.anInt545 * local129) * 128.0D + 0.5D);
			} else {
				arg2.anInt5084 += 128;
			}
			while (local111.aByteArray16.length - 2 > arg2.anInt5086 && arg2.anInt5084 > (local111.aByteArray16[arg2.anInt5086 + 2] & 0xFF) << 8) {
				arg2.anInt5086 += 2;
			}
			if (local111.aByteArray16.length - 2 == arg2.anInt5086 && local111.aByteArray16[arg2.anInt5086 + 1] == 0) {
				local68 = true;
			}
		}
		if (arg2.anInt5085 >= 0 && local111.aByteArray17 != null && (this.anIntArray373[arg2.anInt5087] & 0x1) == 0 && (arg2.anInt5080 < 0 || arg2 != this.aClass1_Sub23ArrayArray1[arg2.anInt5087][arg2.anInt5080])) {
			if (local111.anInt544 > 0) {
				arg2.anInt5085 += (int) (Math.pow(2.0D, local129 * (double) local111.anInt544) * 128.0D + 0.5D);
			} else {
				arg2.anInt5085 += 128;
			}
			while (arg2.anInt5098 < local111.aByteArray17.length - 2 && arg2.anInt5085 > (local111.aByteArray17[arg2.anInt5098 + 2] & 0xFF) << 8) {
				arg2.anInt5098 += 2;
			}
			if (local111.aByteArray17.length - 2 == arg2.anInt5098) {
				local68 = true;
			}
		}
		if (!local68) {
			arg2.aClass1_Sub10_Sub4_3.method4354(arg2.anInt5082, this.method3143(arg2), this.method3180(arg2));
			return false;
		}
		arg2.aClass1_Sub10_Sub4_3.method4367(arg2.anInt5082);
		if (arg0 == null) {
			arg2.aClass1_Sub10_Sub4_3.method4341(arg1);
		} else {
			arg2.aClass1_Sub10_Sub4_3.method4345(arg0, arg3, arg1);
		}
		if (arg2.aClass1_Sub10_Sub4_3.method4380()) {
			this.aClass1_Sub10_Sub1_1.aClass1_Sub10_Sub2_3.method1863(arg2.aClass1_Sub10_Sub4_3);
		}
		arg2.method3845();
		if (arg2.anInt5085 >= 0) {
			arg2.method4767();
			if (arg2.anInt5080 > 0 && this.aClass1_Sub23ArrayArray1[arg2.anInt5087][arg2.anInt5080] == arg2) {
				this.aClass1_Sub23ArrayArray1[arg2.anInt5087][arg2.anInt5080] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V")
	private synchronized void method3162(@OriginalArg(0) boolean arg0) {
		this.aClass39_1.method1003();
		this.aClass1_Sub26_1 = null;
		this.method3170(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!sg;ILclient!jo;Lclient!th;)Z")
	public synchronized boolean method3163(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(3) Class90 arg1, @OriginalArg(4) Class168 arg2) {
		arg0.method3871();
		@Pc(9) boolean local9 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(30) Class1_Sub5 local30 = (Class1_Sub5) arg0.aClass186_21.method4567(); local30 != null; local30 = (Class1_Sub5) arg0.aClass186_21.method4579()) {
			@Pc(36) int local36 = (int) local30.aLong247;
			@Pc(44) Class1_Sub8 local44 = (Class1_Sub8) this.aClass186_18.method4570((long) local36);
			if (local44 == null) {
				local44 = Static119.method1933(local36, arg2);
				if (local44 == null) {
					local9 = false;
					continue;
				}
				this.aClass186_18.method4575((long) local36, local44);
			}
			if (!local44.method1131(local30.aByteArray37, local24, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method3870();
		}
		return local9;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	private void method3164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray371[arg1] = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()Lclient!jk;")
	@Override
	public synchronized Class1_Sub10 method4339() {
		return null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!sa;Z)I")
	private int method3165(@OriginalArg(0) Class1_Sub23 arg0) {
		@Pc(10) int local10 = (arg0.anInt5081 * arg0.anInt5088 >> 12) + arg0.anInt5083;
		local10 += this.anIntArray372[arg0.anInt5087] * (this.anIntArray371[arg0.anInt5087] - 8192) >> 12;
		@Pc(38) Class20 local38 = arg0.aClass20_1;
		@Pc(58) int local58;
		if (local38.anInt542 > 0 && (local38.anInt543 > 0 || this.anIntArray387[arg0.anInt5087] > 0)) {
			local58 = local38.anInt543 << 2;
			@Pc(63) int local63 = local38.anInt548 << 1;
			if (local63 > arg0.anInt5095) {
				local58 = arg0.anInt5095 * local58 / local63;
			}
			local58 += this.anIntArray387[arg0.anInt5087] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt5092 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) (local98 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass1_Sub11_Sub1_1.anInt2189 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static230.anInt3026 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)Z")
	public synchronized boolean method3166() {
		return this.aClass39_1.method1008();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4345(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass39_1.method1008()) {
			@Pc(14) int local14 = this.anInt4293 * this.aClass39_1.anInt1199 / Static230.anInt3026;
			do {
				@Pc(23) long local23 = this.aLong157 + (long) arg2 * (long) local14;
				if (this.aLong156 - local23 >= 0L) {
					this.aLong157 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong156 - this.aLong157 - 1L) / (long) local14);
				this.aLong157 += (long) local54 * (long) local14;
				this.aClass1_Sub10_Sub1_1.method4345(arg0, arg1, local54);
				arg2 -= local54;
				this.method3153();
				arg1 += local54;
			} while (this.aClass39_1.method1008());
		}
		this.aClass1_Sub10_Sub1_1.method4345(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()Lclient!jk;")
	@Override
	public synchronized Class1_Sub10 method4342() {
		return this.aClass1_Sub10_Sub1_1;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "(III)V")
	private synchronized void method3169() {
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray386[local20] = 256;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	private void method3170(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method3155(-1);
		} else {
			this.method3171(-1);
		}
		this.method3182(-1);
		@Pc(32) int local32;
		for (local32 = 0; local32 < 16; local32++) {
			this.anIntArray384[local32] = this.anIntArray378[local32];
		}
		for (local32 = 0; local32 < 16; local32++) {
			this.anIntArray380[local32] = this.anIntArray378[local32] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(II)V")
	private void method3171(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub23 local16 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method666(); local16 != null; local16 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method672()) {
			if ((arg0 < 0 || local16.anInt5087 == arg0) && local16.anInt5085 < 0) {
				this.aClass1_Sub23ArrayArray2[local16.anInt5087][local16.anInt5079] = null;
				local16.anInt5085 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4341(@OriginalArg(0) int arg0) {
		if (this.aClass39_1.method1008()) {
			@Pc(14) int local14 = this.anInt4293 * this.aClass39_1.anInt1199 / Static230.anInt3026;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong157;
				if (this.aLong156 - local23 >= 0L) {
					this.aLong157 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong156 + (long) local14 - this.aLong157 - 1L) / (long) local14);
				this.aLong157 += (long) local14 * (long) local55;
				this.aClass1_Sub10_Sub1_1.method4341(local55);
				arg0 -= local55;
				this.method3153();
			} while (this.aClass39_1.method1008());
		}
		this.aClass1_Sub10_Sub1_1.method4341(arg0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ZI)V")
	private void method3174(@OriginalArg(1) int arg0) {
		if ((this.anIntArray373[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(21) Class1_Sub23 local21 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method666(); local21 != null; local21 = (Class1_Sub23) this.aClass1_Sub10_Sub1_1.aClass26_15.method672()) {
			if (local21.anInt5087 == arg0) {
				local21.anInt5096 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
	public synchronized void method3175() {
		this.method3162(true);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BII)V")
	private void method3177(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray384[arg1]) {
			this.anIntArray384[arg1] = arg0;
			for (@Pc(23) int local23 = 0; local23 < 128; local23++) {
				this.aClass1_Sub23ArrayArray1[arg1][local23] = null;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)V")
	public synchronized void method3179(@OriginalArg(0) int arg0) {
		this.anInt4315 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!sa;)I")
	private int method3180(@OriginalArg(1) Class1_Sub23 arg0) {
		@Pc(9) int local9 = this.anIntArray374[arg0.anInt5087];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt5097) * (-local9 + 16384) + 32 >> 6) : arg0.anInt5097 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BLclient!sa;)Z")
	public boolean method3181(@OriginalArg(1) Class1_Sub23 arg0) {
		if (arg0.aClass1_Sub10_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt5085 >= 0) {
			arg0.method4767();
			if (arg0.anInt5080 > 0 && arg0 == this.aClass1_Sub23ArrayArray1[arg0.anInt5087][arg0.anInt5080]) {
				this.aClass1_Sub23ArrayArray1[arg0.anInt5087][arg0.anInt5080] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(IB)V")
	private void method3182(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.method3182(local13);
			}
			return;
		}
		this.anIntArray375[arg0] = 12800;
		this.anIntArray374[arg0] = 8192;
		this.anIntArray385[arg0] = 16383;
		this.anIntArray371[arg0] = 8192;
		this.anIntArray387[arg0] = 0;
		this.anIntArray376[arg0] = 8192;
		this.method3159(arg0);
		this.method3174(arg0);
		this.anIntArray373[arg0] = 0;
		this.anIntArray377[arg0] = 32767;
		this.anIntArray372[arg0] = 256;
		this.anIntArray381[arg0] = 0;
		this.method3142(8192, arg0);
	}
}
