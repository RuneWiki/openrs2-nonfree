import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub24_Sub4 extends Class1_Sub24 {

	@OriginalMember(owner = "client!wd", name = "Hb", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!wd", name = "Ib", descriptor = "I")
	private int anInt5476;

	@OriginalMember(owner = "client!wd", name = "Jb", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!wd", name = "Lb", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!wd", name = "Mb", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!wd", name = "Ob", descriptor = "I")
	private int anInt5479;

	@OriginalMember(owner = "client!wd", name = "Pb", descriptor = "Lclient!se;")
	private Class1_Sub26 aClass1_Sub26_2;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "[I")
	private int[] anIntArray484 = new int[16];

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "[I")
	private int[] anIntArray488 = new int[16];

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "[I")
	private int[] anIntArray487 = new int[16];

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "[I")
	private int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "[I")
	private int[] anIntArray489 = new int[16];

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "[I")
	private int[] anIntArray486 = new int[16];

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
	private int[] anIntArray485 = new int[16];

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "[[Lclient!e;")
	private Class1_Sub11[][] aClass1_Sub11ArrayArray1 = new Class1_Sub11[16][128];

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	private int anInt5431 = 256;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "[I")
	private int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
	public int[] anIntArray483 = new int[16];

	@OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
	private int anInt5456 = 1000000;

	@OriginalMember(owner = "client!wd", name = "vb", descriptor = "[I")
	public int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!wd", name = "wb", descriptor = "[I")
	private int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "[I")
	private int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "[I")
	private int[] anIntArray494 = new int[16];

	@OriginalMember(owner = "client!wd", name = "sb", descriptor = "[[Lclient!e;")
	private Class1_Sub11[][] aClass1_Sub11ArrayArray2 = new Class1_Sub11[16][128];

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
	private int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "[I")
	private int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!wd", name = "qb", descriptor = "[I")
	public int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "Lclient!lj;")
	private Class101 aClass101_1 = new Class101();

	@OriginalMember(owner = "client!wd", name = "Kb", descriptor = "Lclient!oi;")
	private Class1_Sub24_Sub1 aClass1_Sub24_Sub1_1 = new Class1_Sub24_Sub1(this);

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!qb;")
	private Class142 aClass142_28 = new Class142(128);

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class1_Sub24_Sub4() {
		this.method4645();
		this.method4632(true);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZLclient!e;)V")
	public void method4625(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub5_Sub1_1.aByteArray21.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass1_Sub5_Sub1_1.aBoolean90) {
			@Pc(27) int local27 = local8 + local8 - arg1.aClass1_Sub5_Sub1_1.anInt1674;
			local40 = (int) ((long) local27 * (long) this.anIntArray496[arg1.anInt1069] >> 6);
			local8 <<= 0x8;
			if (local8 <= local40) {
				local40 = local8 + local8 - local40 - 1;
				arg1.aClass1_Sub24_Sub2_3.method3705();
			}
		} else {
			local40 = (int) ((long) local8 * (long) this.anIntArray496[arg1.anInt1069] >> 6);
		}
		arg1.aClass1_Sub24_Sub2_3.method3704(local40);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	private void method4626(@OriginalArg(0) int arg0) {
		if ((this.anIntArray497[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub11 local22 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1704(); local22 != null; local22 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1701()) {
			if (local22.anInt1069 == arg0) {
				local22.anInt1052 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)V")
	private void method4627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	private void method4628(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
				this.method4628(local20);
			}
			return;
		}
		this.anIntArray487[arg0] = 12800;
		this.anIntArray486[arg0] = 8192;
		this.anIntArray494[arg0] = 16383;
		this.anIntArray488[arg0] = 8192;
		this.anIntArray495[arg0] = 0;
		this.anIntArray493[arg0] = 8192;
		this.method4658(arg0);
		this.method4626(arg0);
		this.anIntArray497[arg0] = 0;
		this.anIntArray498[arg0] = 32767;
		this.anIntArray489[arg0] = 256;
		this.anIntArray496[arg0] = 0;
		this.method4638(arg0, 8192);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	private void method4629(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(29) int local29;
		if (local9 == 128) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 8 & 0x7F;
			local29 = arg0 >> 16 & 0x7F;
			this.method4635(local23, local17, local29);
		} else if (local9 == 144) {
			local23 = arg0 >> 8 & 0x7F;
			local17 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			if (local29 <= 0) {
				this.method4635(local23, local17, 64);
			} else {
				this.method4655(local29, local17, local23);
			}
		} else if (local9 == 160) {
			local17 = arg0 & 0xF;
			local29 = arg0 >> 16 & 0x7F;
			local23 = arg0 >> 8 & 0x7F;
			this.method4627(local23, local29, local17);
		} else if (local9 == 176) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 8 & 0x7F;
			local29 = arg0 >> 16 & 0x7F;
			if (local23 == 0) {
				this.anIntArray491[local17] = (this.anIntArray491[local17] & 0xFFE03FFF) + (local29 << 14);
			}
			if (local23 == 32) {
				this.anIntArray491[local17] = (local29 << 7) + (this.anIntArray491[local17] & 0xFFFFC07F);
			}
			if (local23 == 1) {
				this.anIntArray495[local17] = (this.anIntArray495[local17] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local23 == 33) {
				this.anIntArray495[local17] = local29 + (this.anIntArray495[local17] & 0xFFFFFF80);
			}
			if (local23 == 5) {
				this.anIntArray493[local17] = (local29 << 7) + (this.anIntArray493[local17] & 0xFFFFC07F);
			}
			if (local23 == 37) {
				this.anIntArray493[local17] = (this.anIntArray493[local17] & 0xFFFFFF80) + local29;
			}
			if (local23 == 7) {
				this.anIntArray487[local17] = (this.anIntArray487[local17] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local23 == 39) {
				this.anIntArray487[local17] = (this.anIntArray487[local17] & 0xFFFFFF80) + local29;
			}
			if (local23 == 10) {
				this.anIntArray486[local17] = (local29 << 7) + (this.anIntArray486[local17] & 0xFFFFC07F);
			}
			if (local23 == 42) {
				this.anIntArray486[local17] = (this.anIntArray486[local17] & 0xFFFFFF80) + local29;
			}
			if (local23 == 11) {
				this.anIntArray494[local17] = (this.anIntArray494[local17] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local23 == 43) {
				this.anIntArray494[local17] = (this.anIntArray494[local17] & 0xFFFFFF80) + local29;
			}
			if (local23 == 64) {
				if (local29 < 64) {
					this.anIntArray497[local17] &= 0xFFFFFFFE;
				} else {
					this.anIntArray497[local17] |= 0x1;
				}
			}
			if (local23 == 65) {
				if (local29 >= 64) {
					this.anIntArray497[local17] |= 0x2;
				} else {
					this.method4658(local17);
					this.anIntArray497[local17] &= 0xFFFFFFFD;
				}
			}
			if (local23 == 99) {
				this.anIntArray498[local17] = (this.anIntArray498[local17] & 0x7F) + (local29 << 7);
			}
			if (local23 == 98) {
				this.anIntArray498[local17] = local29 + (this.anIntArray498[local17] & 0x3F80);
			}
			if (local23 == 101) {
				this.anIntArray498[local17] = (local29 << 7) + (this.anIntArray498[local17] & 0x7F) + 16384;
			}
			if (local23 == 100) {
				this.anIntArray498[local17] = (this.anIntArray498[local17] & 0x3F80) + local29 + 16384;
			}
			if (local23 == 120) {
				this.method4646(local17);
			}
			if (local23 == 121) {
				this.method4628(local17);
			}
			if (local23 == 123) {
				this.method4656(local17);
			}
			@Pc(503) int local503;
			if (local23 == 6) {
				local503 = this.anIntArray498[local17];
				if (local503 == 16384) {
					this.anIntArray489[local17] = (this.anIntArray489[local17] & 0xFFFFC07F) + (local29 << 7);
				}
			}
			if (local23 == 38) {
				local503 = this.anIntArray498[local17];
				if (local503 == 16384) {
					this.anIntArray489[local17] = local29 + (this.anIntArray489[local17] & 0xFFFFFF80);
				}
			}
			if (local23 == 16) {
				this.anIntArray496[local17] = (this.anIntArray496[local17] & 0xFFFFC07F) + (local29 << 7);
			}
			if (local23 == 48) {
				this.anIntArray496[local17] = local29 + (this.anIntArray496[local17] & 0xFFFFFF80);
			}
			if (local23 == 81) {
				if (local29 < 64) {
					this.method4626(local17);
					this.anIntArray497[local17] &= 0xFFFFFFFB;
				} else {
					this.anIntArray497[local17] |= 0x4;
				}
			}
			if (local23 == 17) {
				this.method4638(local17, (this.anIntArray490[local17] & 0xFFFFC07F) + (local29 << 7));
			}
			if (local23 == 49) {
				this.method4638(local17, (this.anIntArray490[local17] & 0xFFFFFF80) + local29);
			}
		} else if (local9 == 192) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 8 & 0x7F;
			this.method4639(local23 + this.anIntArray491[local17], local17);
		} else if (local9 == 208) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 8 & 0x7F;
			this.method4630(local23, local17);
		} else if (local9 == 224) {
			local17 = arg0 & 0xF;
			local23 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FBF) >> 8);
			this.method4633(local17, local23);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4632(true);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	private void method4630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4623() {
		return 0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()Lclient!qd;")
	@Override
	public synchronized Class1_Sub24 method4622() {
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!se;Lclient!fi;BLclient!nk;I)Z")
	public synchronized boolean method4631(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(3) boolean local3 = true;
		arg0.method4044();
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub16 local29 = (Class1_Sub16) arg0.aClass142_24.method3534(); local29 != null; local29 = (Class1_Sub16) arg0.aClass142_24.method3530()) {
			@Pc(42) int local42 = (int) local29.aLong214;
			@Pc(50) Class1_Sub23 local50 = (Class1_Sub23) this.aClass142_28.method3543((long) local42);
			if (local50 == null) {
				local50 = Static41.method745(arg2, local42);
				if (local50 == null) {
					local3 = false;
					continue;
				}
				this.aClass142_28.method3537(local50, (long) local42);
			}
			if (!local50.method3104(arg1, local23, local29.aByteArray20)) {
				local3 = false;
			}
		}
		if (local3) {
			arg0.method4045();
		}
		return local3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZ)V")
	private void method4632(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method4646(-1);
		} else {
			this.method4656(-1);
		}
		this.method4628(-1);
		@Pc(29) int local29;
		for (local29 = 0; local29 < 16; local29++) {
			this.anIntArray485[local29] = this.anIntArray484[local29];
		}
		for (local29 = 0; local29 < 16; local29++) {
			this.anIntArray491[local29] = this.anIntArray484[local29] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	private void method4633(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray488[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!e;Z)I")
	private int method4634(@OriginalArg(0) Class1_Sub11 arg0) {
		if (this.anIntArray492[arg0.anInt1069] == 0) {
			return 0;
		}
		@Pc(34) int local34 = this.anIntArray494[arg0.anInt1069] * this.anIntArray487[arg0.anInt1069] + 4096 >> 13;
		@Pc(37) Class168 local37 = arg0.aClass168_1;
		@Pc(45) int local45 = local34 * local34 + 16384 >> 15;
		@Pc(54) int local54 = local45 * arg0.anInt1066 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt5431 + 128 >> 8;
		local34 = this.anIntArray492[arg0.anInt1069] * local63 + 128 >> 8;
		if (local37.anInt4877 > 0) {
			local34 = (int) (Math.pow(0.5D, (double) local37.anInt4877 * 1.953125E-5D * (double) arg0.anInt1067) * (double) local34 + 0.5D);
		}
		@Pc(113) int local113;
		@Pc(110) int local110;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local37.aByteArray71 != null) {
			local110 = local37.aByteArray71[arg0.anInt1072 + 1];
			local113 = arg0.anInt1061;
			if (arg0.anInt1072 < local37.aByteArray71.length - 2) {
				local136 = (local37.aByteArray71[arg0.anInt1072] & 0xFF) << 8;
				local148 = (local37.aByteArray71[arg0.anInt1072 + 2] & 0xFF) << 8;
				local110 += (local37.aByteArray71[arg0.anInt1072 + 3] - local110) * (-local136 + local113) / (local148 - local136);
			}
			local34 = local34 * local110 + 32 >> 6;
		}
		if (arg0.anInt1071 > 0 && local37.aByteArray70 != null) {
			local113 = arg0.anInt1071;
			local110 = local37.aByteArray70[arg0.anInt1050 + 1];
			if (local37.aByteArray70.length - 2 > arg0.anInt1050) {
				local136 = (local37.aByteArray70[arg0.anInt1050] & 0xFF) << 8;
				local148 = (local37.aByteArray70[arg0.anInt1050 + 2] & 0xFF) << 8;
				local110 += (local113 - local136) * (-local110 + local37.aByteArray70[arg0.anInt1050 - -3]) / (local148 - local136);
			}
			local34 = local110 * local34 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int arg0) {
		if (this.aClass101_1.method2775()) {
			@Pc(14) int local14 = this.anInt5456 * this.aClass101_1.anInt3165 / Static303.anInt5383;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong207;
				if (this.aLong208 - local23 >= 0L) {
					this.aLong207 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong208 + (long) local14 - this.aLong207 - 1L) / (long) local14);
				this.aLong207 += (long) local14 * (long) local55;
				arg0 -= local55;
				this.aClass1_Sub24_Sub1_1.method4619(local55);
				this.method4648();
			} while (this.aClass101_1.method2775());
		}
		this.aClass1_Sub24_Sub1_1.method4619(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	private void method4635(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub11 local12 = this.aClass1_Sub11ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub11ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray497[arg1] & 0x2) == 0) {
			local12.anInt1071 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub11 local43 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1704(); local43 != null; local43 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1701()) {
			if (local43.anInt1069 == local12.anInt1069 && local43.anInt1071 < 0 && local12 != local43) {
				local12.anInt1071 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Lclient!e;Z)I")
	private int method4637(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(20) int local20 = arg0.anInt1056 + (arg0.anInt1064 * arg0.anInt1070 >> 12);
		local20 += this.anIntArray489[arg0.anInt1069] * (this.anIntArray488[arg0.anInt1069] - 8192) >> 12;
		@Pc(41) Class168 local41 = arg0.aClass168_1;
		@Pc(67) int local67;
		if (local41.anInt4876 > 0 && (local41.anInt4872 > 0 || this.anIntArray495[arg0.anInt1069] > 0)) {
			@Pc(62) int local62 = local41.anInt4873 << 1;
			local67 = local41.anInt4872 << 2;
			if (local62 > arg0.anInt1062) {
				local67 = local67 * arg0.anInt1062 / local62;
			}
			local67 += this.anIntArray495[arg0.anInt1069] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt1049 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local101 * (double) local67);
		}
		local67 = (int) ((double) (arg0.aClass1_Sub5_Sub1_1.anInt1672 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static303.anInt5383 + 0.5D);
		return local67 >= 1 ? local67 : 1;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
	private void method4638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray490[arg0] = arg1;
		this.anIntArray483[arg0] = (int) ((double) 2097152 * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)V")
	private void method4639(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray485[arg1]) {
			this.anIntArray485[arg1] = arg0;
			for (@Pc(34) int local34 = 0; local34 < 128; local34++) {
				this.aClass1_Sub11ArrayArray1[arg1][local34] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!e;I[IBI)Z")
	public boolean method4641(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1053 = Static303.anInt5383 / 100;
		if (arg0.anInt1071 >= 0 && (arg0.aClass1_Sub24_Sub2_3 == null || arg0.aClass1_Sub24_Sub2_3.method3726())) {
			arg0.method984();
			arg0.method4779();
			if (arg0.anInt1051 > 0 && arg0 == this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051]) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051] = null;
			}
			return true;
		}
		@Pc(64) int local64 = arg0.anInt1070;
		if (local64 > 0) {
			local64 -= (int) (Math.pow(2.0D, (double) this.anIntArray493[arg0.anInt1069] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local64 < 0) {
				local64 = 0;
			}
			arg0.anInt1070 = local64;
		}
		@Pc(98) boolean local98 = false;
		arg0.aClass1_Sub24_Sub2_3.method3714(this.method4637(arg0));
		arg0.anInt1062++;
		@Pc(129) double local129 = (double) ((arg0.anInt1055 - 60 << 8) + (arg0.anInt1070 * arg0.anInt1064 >> 12)) * 5.086263020833333E-6D;
		@Pc(132) Class168 local132 = arg0.aClass168_1;
		arg0.anInt1049 += local132.anInt4876;
		if (local132.anInt4877 > 0) {
			if (local132.anInt4871 > 0) {
				arg0.anInt1067 += (int) (Math.pow(2.0D, (double) local132.anInt4871 * local129) * 128.0D + 0.5D);
			} else {
				arg0.anInt1067 += 128;
			}
			if (local132.anInt4877 * arg0.anInt1067 >= 819200) {
				local98 = true;
			}
		}
		if (local132.aByteArray71 != null) {
			if (local132.anInt4874 > 0) {
				arg0.anInt1061 += (int) (Math.pow(2.0D, local129 * (double) local132.anInt4874) * 128.0D + 0.5D);
			} else {
				arg0.anInt1061 += 128;
			}
			while (local132.aByteArray71.length - 2 > arg0.anInt1072 && (local132.aByteArray71[arg0.anInt1072 + 2] & 0xFF) << 8 < arg0.anInt1061) {
				arg0.anInt1072 += 2;
			}
			if (local132.aByteArray71.length - 2 == arg0.anInt1072 && local132.aByteArray71[arg0.anInt1072 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg0.anInt1071 >= 0 && local132.aByteArray70 != null && (this.anIntArray497[arg0.anInt1069] & 0x1) == 0 && (arg0.anInt1051 < 0 || arg0 != this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051])) {
			if (local132.anInt4875 <= 0) {
				arg0.anInt1071 += 128;
			} else {
				arg0.anInt1071 += (int) (Math.pow(2.0D, (double) local132.anInt4875 * local129) * 128.0D + 0.5D);
			}
			while (arg0.anInt1050 < local132.aByteArray70.length - 2 && (local132.aByteArray70[arg0.anInt1050 + 2] & 0xFF) << 8 < arg0.anInt1071) {
				arg0.anInt1050 += 2;
			}
			if (local132.aByteArray70.length - 2 == arg0.anInt1050) {
				local98 = true;
			}
		}
		if (!local98) {
			arg0.aClass1_Sub24_Sub2_3.method3710(arg0.anInt1053, this.method4634(arg0), this.method4650(arg0));
			return false;
		}
		arg0.aClass1_Sub24_Sub2_3.method3723(arg0.anInt1053);
		if (arg2 == null) {
			arg0.aClass1_Sub24_Sub2_3.method4619(arg1);
		} else {
			arg0.aClass1_Sub24_Sub2_3.method4624(arg2, arg3, arg1);
		}
		if (arg0.aClass1_Sub24_Sub2_3.method3735()) {
			this.aClass1_Sub24_Sub1_1.aClass1_Sub24_Sub3_2.method4514(arg0.aClass1_Sub24_Sub2_3);
		}
		arg0.method984();
		if (arg0.anInt1071 >= 0) {
			arg0.method4779();
			if (arg0.anInt1051 > 0 && this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051] == arg0) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	private synchronized void method4642(@OriginalArg(1) boolean arg0) {
		this.aClass101_1.method2761();
		this.aClass1_Sub26_2 = null;
		this.method4632(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public synchronized void method4644() {
		for (@Pc(7) Class1_Sub23 local7 = (Class1_Sub23) this.aClass142_28.method3534(); local7 != null; local7 = (Class1_Sub23) this.aClass142_28.method3530()) {
			local7.method3103();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()Lclient!qd;")
	@Override
	public synchronized Class1_Sub24 method4618() {
		return this.aClass1_Sub24_Sub1_1;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(III)V")
	private synchronized void method4645() {
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray492[local27] = 256;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	private void method4646(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1704(); local15 != null; local15 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1701()) {
			if (arg0 < 0 || arg0 == local15.anInt1069) {
				if (local15.aClass1_Sub24_Sub2_3 != null) {
					local15.aClass1_Sub24_Sub2_3.method3723(Static303.anInt5383 / 100);
					if (local15.aClass1_Sub24_Sub2_3.method3735()) {
						this.aClass1_Sub24_Sub1_1.aClass1_Sub24_Sub3_2.method4514(local15.aClass1_Sub24_Sub2_3);
					}
					local15.method984();
				}
				if (local15.anInt1071 < 0) {
					this.aClass1_Sub11ArrayArray2[local15.anInt1069][local15.anInt1055] = null;
				}
				local15.method4779();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!se;ZZB)V")
	private synchronized void method4647(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method4642(arg2);
		this.aClass101_1.method2765(arg0.aByteArray67);
		this.aLong207 = 0L;
		this.aBoolean368 = arg1;
		@Pc(32) int local32 = this.aClass101_1.method2769();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass101_1.method2771(local34);
			this.aClass101_1.method2764(local34);
			this.aClass101_1.method2767(local34);
		}
		this.anInt5476 = this.aClass101_1.method2774();
		this.anInt5477 = this.aClass101_1.anIntArray270[this.anInt5476];
		this.aLong208 = this.aClass101_1.method2768(this.anInt5477);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	private void method4648() {
		@Pc(21) int local21 = this.anInt5477;
		@Pc(24) int local24 = this.anInt5476;
		@Pc(27) long local27 = this.aLong208;
		if (this.aClass1_Sub26_2 != null && local21 == this.anInt5479) {
			this.method4647(this.aClass1_Sub26_2, this.aBoolean368, this.aBoolean369);
			this.method4648();
			return;
		}
		while (this.anInt5477 == local21) {
			while (local21 == this.aClass101_1.anIntArray270[local24]) {
				this.aClass101_1.method2771(local24);
				@Pc(79) int local79 = this.aClass101_1.method2766(local24);
				if (local79 == 1) {
					this.aClass101_1.method2763();
					this.aClass101_1.method2767(local24);
					if (this.aClass101_1.method2772()) {
						if (this.aClass1_Sub26_2 != null) {
							this.method4657(this.aBoolean368, this.aClass1_Sub26_2);
							this.method4648();
							return;
						}
						if (!this.aBoolean368 || local21 == 0) {
							this.method4632(true);
							this.aClass101_1.method2761();
							return;
						}
						this.aClass101_1.method2773(local27);
					}
					break;
				}
				if ((local79 & 0x80) != 0) {
					this.method4629(local79);
				}
				this.aClass101_1.method2764(local24);
				this.aClass101_1.method2767(local24);
			}
			local24 = this.aClass101_1.method2774();
			local21 = this.aClass101_1.anIntArray270[local24];
			local27 = this.aClass101_1.method2768(local21);
		}
		this.aLong208 = local27;
		this.anInt5477 = local21;
		this.anInt5476 = local24;
		if (this.aClass1_Sub26_2 != null && local21 > this.anInt5479) {
			this.anInt5476 = -1;
			this.anInt5477 = this.anInt5479;
			this.aLong208 = this.aClass101_1.method2768(this.anInt5477);
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
	public synchronized void method4649() {
		for (@Pc(18) Class1_Sub23 local18 = (Class1_Sub23) this.aClass142_28.method3534(); local18 != null; local18 = (Class1_Sub23) this.aClass142_28.method3530()) {
			local18.method4779();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!e;)I")
	private int method4650(@OriginalArg(1) Class1_Sub11 arg0) {
		@Pc(18) int local18 = this.anIntArray486[arg0.anInt1069];
		return local18 >= 8192 ? 16384 - ((16384 - local18) * (128 - arg0.anInt1060) + 32 >> 6) : arg0.anInt1060 * local18 + 32 >> 6;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
	public synchronized void method4652() {
		this.method4642(true);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4624(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass101_1.method2775()) {
			@Pc(15) int local15 = this.aClass101_1.anInt3165 * this.anInt5456 / Static303.anInt5383;
			do {
				@Pc(24) long local24 = (long) local15 * (long) arg2 + this.aLong207;
				if (this.aLong208 - local24 >= 0L) {
					this.aLong207 = local24;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong208 + (long) local15 - this.aLong207 - 1L) / (long) local15);
				arg2 -= local56;
				this.aLong207 += (long) local15 * (long) local56;
				this.aClass1_Sub24_Sub1_1.method4624(arg0, arg1, local56);
				this.method4648();
				arg1 += local56;
			} while (this.aClass101_1.method2775());
		}
		this.aClass1_Sub24_Sub1_1.method4624(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBI)V")
	private void method4653() {
		this.anIntArray484[9] = 128;
		this.anIntArray491[9] = 128;
		this.method4639(128, 9);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBI)V")
	private void method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4635(arg2, arg1, 64);
		if ((this.anIntArray497[arg1] & 0x2) != 0) {
			for (@Pc(29) Class1_Sub11 local29 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1708(); local29 != null; local29 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1710()) {
				if (local29.anInt1069 == arg1 && local29.anInt1071 < 0) {
					this.aClass1_Sub11ArrayArray2[arg1][local29.anInt1055] = null;
					this.aClass1_Sub11ArrayArray2[arg1][arg2] = local29;
					@Pc(68) int local68 = (local29.anInt1070 * local29.anInt1064 >> 12) + local29.anInt1056;
					local29.anInt1070 = 4096;
					local29.anInt1056 += arg2 - local29.anInt1055 << 8;
					local29.anInt1064 = local68 - local29.anInt1056;
					local29.anInt1055 = arg2;
					return;
				}
			}
		}
		@Pc(114) Class1_Sub23 local114 = (Class1_Sub23) this.aClass142_28.method3543((long) this.anIntArray485[arg1]);
		if (local114 == null) {
			return;
		}
		@Pc(123) Class1_Sub5_Sub1 local123 = local114.aClass1_Sub5_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(131) Class1_Sub11 local131 = new Class1_Sub11();
		local131.anInt1069 = arg1;
		local131.aClass1_Sub5_Sub1_1 = local123;
		local131.aClass1_Sub23_1 = local114;
		local131.aClass168_1 = local114.aClass168Array1[arg2];
		local131.anInt1051 = local114.aByteArray41[arg2];
		local131.anInt1055 = arg2;
		local131.anInt1066 = local114.anInt3629 * arg0 * arg0 * local114.aByteArray43[arg2] + 1024 >> 11;
		local131.anInt1060 = local114.aByteArray42[arg2] & 0xFF;
		local131.anInt1056 = (arg2 << 8) - (local114.aShortArray65[arg2] & 0x7FFF);
		local131.anInt1061 = 0;
		local131.anInt1067 = 0;
		local131.anInt1050 = 0;
		local131.anInt1071 = -1;
		local131.anInt1072 = 0;
		if (this.anIntArray496[arg1] == 0) {
			local131.aClass1_Sub24_Sub2_3 = Static323.method3724(local123, this.method4637(local131), this.method4634(local131), this.method4650(local131));
		} else {
			local131.aClass1_Sub24_Sub2_3 = Static323.method3724(local123, this.method4637(local131), 0, this.method4650(local131));
			this.method4625(local114.aShortArray65[arg2] < 0, local131);
		}
		if (local114.aShortArray65[arg2] < 0) {
			local131.aClass1_Sub24_Sub2_3.method3722(-1);
		}
		if (local131.anInt1051 >= 0) {
			@Pc(285) Class1_Sub11 local285 = this.aClass1_Sub11ArrayArray1[arg1][local131.anInt1051];
			if (local285 != null && local285.anInt1071 < 0) {
				this.aClass1_Sub11ArrayArray2[arg1][local285.anInt1055] = null;
				local285.anInt1071 = 0;
			}
			this.aClass1_Sub11ArrayArray1[arg1][local131.anInt1051] = local131;
		}
		this.aClass1_Sub24_Sub1_1.aClass59_30.method1706(local131);
		this.aClass1_Sub11ArrayArray2[arg1][arg2] = local131;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)V")
	private void method4656(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1704(); local16 != null; local16 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1701()) {
			if ((arg0 < 0 || local16.anInt1069 == arg0) && local16.anInt1071 < 0) {
				this.aClass1_Sub11ArrayArray2[local16.anInt1069][local16.anInt1055] = null;
				local16.anInt1071 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZLclient!se;)V")
	public synchronized void method4657(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub26 arg1) {
		this.method4647(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(II)V")
	private void method4658(@OriginalArg(1) int arg0) {
		if ((this.anIntArray497[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub11 local23 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1704(); local23 != null; local23 = (Class1_Sub11) this.aClass1_Sub24_Sub1_1.aClass59_30.method1701()) {
			if (arg0 == local23.anInt1069 && this.aClass1_Sub11ArrayArray2[arg0][local23.anInt1055] == null && local23.anInt1071 < 0) {
				local23.anInt1071 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method4659() {
		return this.aClass101_1.method2775();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BLclient!e;)Z")
	public boolean method4660(@OriginalArg(1) Class1_Sub11 arg0) {
		if (arg0.aClass1_Sub24_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt1071 >= 0) {
			arg0.method4779();
			if (arg0.anInt1051 > 0 && this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051] == arg0) {
				this.aClass1_Sub11ArrayArray1[arg0.anInt1069][arg0.anInt1051] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public synchronized void method4661() {
		this.method4653();
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(II)V")
	public synchronized void method4663(@OriginalArg(1) int arg0) {
		this.anInt5431 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)I")
	public int method4664() {
		return this.anInt5431;
	}
}
