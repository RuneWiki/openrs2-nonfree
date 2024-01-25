import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class5_Sub16_Sub4 extends Class5_Sub16 {

	@OriginalMember(owner = "client!ot", name = "zb", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!ot", name = "sb", descriptor = "I")
	private int anInt7424;

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!ot", name = "F", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!ot", name = "Mb", descriptor = "I")
	private int anInt7425;

	@OriginalMember(owner = "client!ot", name = "G", descriptor = "Lclient!hp;")
	private Class5_Sub21 aClass5_Sub21_2;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private int anInt7426;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Z")
	private boolean aBoolean570;

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "[I")
	private final int[] anIntArray438 = new int[16];

	@OriginalMember(owner = "client!ot", name = "Bb", descriptor = "I")
	private final int anInt7392 = 1000000;

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "[I")
	public final int[] anIntArray437 = new int[16];

	@OriginalMember(owner = "client!ot", name = "qb", descriptor = "I")
	private int anInt7399 = 256;

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "[I")
	private final int[] anIntArray439 = new int[16];

	@OriginalMember(owner = "client!ot", name = "pb", descriptor = "[I")
	private final int[] anIntArray443 = new int[16];

	@OriginalMember(owner = "client!ot", name = "L", descriptor = "[I")
	private final int[] anIntArray442 = new int[16];

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "[I")
	private final int[] anIntArray441 = new int[16];

	@OriginalMember(owner = "client!ot", name = "Eb", descriptor = "[I")
	public final int[] anIntArray445 = new int[16];

	@OriginalMember(owner = "client!ot", name = "Fb", descriptor = "[I")
	private final int[] anIntArray447 = new int[16];

	@OriginalMember(owner = "client!ot", name = "ab", descriptor = "[I")
	private final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!ot", name = "ub", descriptor = "[I")
	private final int[] anIntArray440 = new int[16];

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "[I")
	private final int[] anIntArray446 = new int[16];

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "[[Lclient!lba;")
	private final Class5_Sub33[][] aClass5_Sub33ArrayArray2 = new Class5_Sub33[16][128];

	@OriginalMember(owner = "client!ot", name = "Gb", descriptor = "[[Lclient!lba;")
	private final Class5_Sub33[][] aClass5_Sub33ArrayArray1 = new Class5_Sub33[16][128];

	@OriginalMember(owner = "client!ot", name = "W", descriptor = "[I")
	public final int[] anIntArray449 = new int[16];

	@OriginalMember(owner = "client!ot", name = "tb", descriptor = "[I")
	private final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!ot", name = "Kb", descriptor = "[I")
	private final int[] anIntArray444 = new int[16];

	@OriginalMember(owner = "client!ot", name = "S", descriptor = "[I")
	private final int[] anIntArray450 = new int[16];

	@OriginalMember(owner = "client!ot", name = "vb", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "Lclient!nn;")
	private final Class252 aClass252_1 = new Class252();

	@OriginalMember(owner = "client!ot", name = "Ab", descriptor = "Lclient!ut;")
	private final Class5_Sub16_Sub5 aClass5_Sub16_Sub5_1 = new Class5_Sub16_Sub5(this);

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Lclient!qha;")
	private final Class291 aClass291_29;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class5_Sub16_Sub4() {
		this.aClass291_29 = new Class291(128);
		this.method6400(-1, 256);
		this.method6406(true);
	}

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!ot;)V")
	public Class5_Sub16_Sub4(@OriginalArg(0) Class5_Sub16_Sub4 arg0) {
		this.aClass291_29 = arg0.aClass291_29;
		this.method6400(-1, 256);
		this.method6406(true);
	}

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "(I)Z")
	public synchronized boolean method6376() {
		return this.aClass252_1.method5879();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!lba;B)I")
	private int method6377(@OriginalArg(0) Class5_Sub33 arg0) {
		@Pc(17) int local17 = this.anIntArray442[arg0.anInt5901];
		return local17 < 8192 ? arg0.anInt5889 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt5889) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8740(@OriginalArg(0) int arg0) {
		if (this.aClass252_1.method5879()) {
			@Pc(14) int local14 = this.anInt7392 * this.aClass252_1.anInt6878 / Static608.anInt10099;
			do {
				@Pc(24) long local24 = this.aLong222 + (long) local14 * (long) arg0;
				if (this.aLong221 - local24 >= 0L) {
					this.aLong222 = local24;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong221 - this.aLong222 - 1L) / (long) local14);
				this.aLong222 += (long) local14 * (long) local54;
				arg0 -= local54;
				this.aClass5_Sub16_Sub5_1.method8740(local54);
				this.method6410();
			} while (this.aClass252_1.method5879());
		}
		this.aClass5_Sub16_Sub5_1.method8740(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)V")
	public synchronized void method6378() {
		for (@Pc(19) Class5_Sub54 local19 = (Class5_Sub54) this.aClass291_29.method6987(); local19 != null; local19 = (Class5_Sub54) this.aClass291_29.method6989()) {
			local19.method9141();
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIB)V")
	private void method6379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray443[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!lba;I)I")
	private int method6380(@OriginalArg(0) Class5_Sub33 arg0) {
		@Pc(20) int local20 = (arg0.anInt5898 * arg0.anInt5895 >> 12) + arg0.anInt5887;
		local20 += (this.anIntArray443[arg0.anInt5901] - 8192) * this.anIntArray436[arg0.anInt5901] >> 12;
		@Pc(41) Class159 local41 = arg0.aClass159_1;
		@Pc(71) int local71;
		if (local41.anInt3618 > 0 && (local41.anInt3616 > 0 || this.anIntArray439[arg0.anInt5901] > 0)) {
			local71 = local41.anInt3616 << 2;
			@Pc(76) int local76 = local41.anInt3622 << 1;
			if (local76 > arg0.anInt5883) {
				local71 = arg0.anInt5883 * local71 / local76;
			}
			local71 += this.anIntArray439[arg0.anInt5901] >> 7;
			@Pc(110) double local110 = Math.sin((double) (arg0.anInt5885 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local110 * (double) local71);
		}
		local71 = (int) ((double) (arg0.aClass5_Sub24_Sub1_4.anInt7869 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static608.anInt10099 + 0.5D);
		return local71 >= 1 ? local71 : 1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)V")
	public synchronized void method6381() {
		this.method6394();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!lba;)I")
	private int method6382(@OriginalArg(1) Class5_Sub33 arg0) {
		if (this.anIntArray446[arg0.anInt5901] == 0) {
			return 0;
		}
		@Pc(18) Class159 local18 = arg0.aClass159_1;
		@Pc(34) int local34 = this.anIntArray444[arg0.anInt5901] * this.anIntArray438[arg0.anInt5901] + 4096 >> 13;
		@Pc(50) int local50 = local34 * local34 + 16384 >> 15;
		@Pc(59) int local59 = arg0.anInt5892 * local50 + 16384 >> 15;
		@Pc(68) int local68 = this.anInt7399 * local59 + 128 >> 8;
		local34 = this.anIntArray446[arg0.anInt5901] * local68 + 128 >> 8;
		if (local18.anInt3624 > 0) {
			local34 = (int) ((double) local34 * Math.pow(0.5D, (double) local18.anInt3624 * (double) arg0.anInt5896 * 1.953125E-5D) + 0.5D);
		}
		@Pc(110) int local110;
		@Pc(118) int local118;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local18.aByteArray18 != null) {
			local110 = arg0.anInt5890;
			local118 = local18.aByteArray18[arg0.anInt5886 + 1];
			if (arg0.anInt5886 < local18.aByteArray18.length - 2) {
				local136 = (local18.aByteArray18[arg0.anInt5886] & 0xFF) << 8;
				local148 = (local18.aByteArray18[arg0.anInt5886 + 2] & 0xFF) << 8;
				local118 += (local110 - local136) * (-local118 + local18.aByteArray18[arg0.anInt5886 + 3]) / (local148 - local136);
			}
			local34 = local34 * local118 + 32 >> 6;
		}
		if (arg0.anInt5900 > 0 && local18.aByteArray19 != null) {
			local110 = arg0.anInt5900;
			local118 = local18.aByteArray19[arg0.anInt5888 + 1];
			if (local18.aByteArray19.length - 2 > arg0.anInt5888) {
				local136 = (local18.aByteArray19[arg0.anInt5888] & 0xFF) << 8;
				local148 = (local18.aByteArray19[arg0.anInt5888 + 2] & 0xFF) << 8;
				local118 += (local110 - local136) * (local18.aByteArray19[arg0.anInt5888 + 3] - local118) / (local148 - local136);
			}
			local34 = local118 * local34 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IZ)V")
	private void method6383(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub33 local12 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1916(); local12 != null; local12 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1915()) {
			if ((arg0 < 0 || local12.anInt5901 == arg0) && local12.anInt5900 < 0) {
				this.aClass5_Sub33ArrayArray2[local12.anInt5901][local12.anInt5894] = null;
				local12.anInt5900 = 0;
			}
		}
		if (false) {
			this.aLong222 = -90L;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BI)V")
	public synchronized void method6384(@OriginalArg(1) int arg0) {
		this.anInt7399 = arg0;
	}

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "(II)V")
	private void method6385(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local9 == 128) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method6408(local31, local37, local25);
		} else if (local9 == 144) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local37 > 0) {
				this.method6414(local31, local25, local37);
			} else {
				this.method6408(local31, 64, local25);
			}
		} else if (local9 == 160) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method6404(local37, local25, local31);
		} else if (local9 == 176) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local31 == 0) {
				this.anIntArray441[local25] = (this.anIntArray441[local25] & 0xFFE03FFF) + (local37 << 14);
			}
			if (local31 == 32) {
				this.anIntArray441[local25] = (local37 << 7) + (this.anIntArray441[local25] & 0xFFFFC07F);
			}
			if (local31 == 1) {
				this.anIntArray439[local25] = (this.anIntArray439[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 33) {
				this.anIntArray439[local25] = local37 + (this.anIntArray439[local25] & 0xFFFFFF80);
			}
			if (local31 == 5) {
				this.anIntArray435[local25] = (this.anIntArray435[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 37) {
				this.anIntArray435[local25] = local37 + (this.anIntArray435[local25] & 0xFFFFFF80);
			}
			if (local31 == 7) {
				this.anIntArray438[local25] = (this.anIntArray438[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 39) {
				this.anIntArray438[local25] = (this.anIntArray438[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 10) {
				this.anIntArray442[local25] = (local37 << 7) + (this.anIntArray442[local25] & 0xFFFFC07F);
			}
			if (local31 == 42) {
				this.anIntArray442[local25] = local37 + (this.anIntArray442[local25] & 0xFFFFFF80);
			}
			if (local31 == 11) {
				this.anIntArray444[local25] = (this.anIntArray444[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 43) {
				this.anIntArray444[local25] = local37 + (this.anIntArray444[local25] & 0xFFFFFF80);
			}
			if (local31 == 64) {
				if (local37 < 64) {
					this.anIntArray437[local25] &= 0xFFFFFFFE;
				} else {
					this.anIntArray437[local25] |= 0x1;
				}
			}
			if (local31 == 65) {
				if (local37 < 64) {
					this.method6412(local25);
					this.anIntArray437[local25] &= 0xFFFFFFFD;
				} else {
					this.anIntArray437[local25] |= 0x2;
				}
			}
			if (local31 == 99) {
				this.anIntArray448[local25] = (this.anIntArray448[local25] & 0x7F) + (local37 << 7);
			}
			if (local31 == 98) {
				this.anIntArray448[local25] = (this.anIntArray448[local25] & 0x3F80) + local37;
			}
			if (local31 == 101) {
				this.anIntArray448[local25] = (this.anIntArray448[local25] & 0x7F) + (local37 << 7) + 16384;
			}
			if (local31 == 100) {
				this.anIntArray448[local25] = local37 + (this.anIntArray448[local25] & 0x3F80) + 16384;
			}
			if (local31 == 120) {
				this.method6397(local25);
			}
			if (local31 == 121) {
				this.method6402(local25);
			}
			if (local31 == 123) {
				this.method6383(local25);
			}
			@Pc(570) int local570;
			if (local31 == 6) {
				local570 = this.anIntArray448[local25];
				if (local570 == 16384) {
					this.anIntArray436[local25] = (local37 << 7) + (this.anIntArray436[local25] & 0xFFFFC07F);
				}
			}
			if (local31 == 38) {
				local570 = this.anIntArray448[local25];
				if (local570 == 16384) {
					this.anIntArray436[local25] = (this.anIntArray436[local25] & 0xFFFFFF80) + local37;
				}
			}
			if (local31 == 16) {
				this.anIntArray449[local25] = (this.anIntArray449[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 48) {
				this.anIntArray449[local25] = (this.anIntArray449[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 81) {
				if (local37 >= 64) {
					this.anIntArray437[local25] |= 0x4;
				} else {
					this.method6396(local25);
					this.anIntArray437[local25] &= 0xFFFFFFFB;
				}
			}
			if (local31 == 17) {
				this.method6407((local37 << 7) + (this.anIntArray450[local25] & 0xFFFFC07F), local25);
			}
			if (local31 == 49) {
				this.method6407(local37 + (this.anIntArray450[local25] & 0xFFFFFF80), local25);
			}
		} else if (local9 == 192) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method6395(local25, local31 + this.anIntArray441[local25]);
		} else if (local9 == 208) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method6386(local25, local31);
		} else if (local9 == 224) {
			local25 = arg0 & 0xF;
			local31 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F26) >> 8);
			this.method6379(local31, local25);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6406(true);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BII)V")
	private void method6386(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "()Lclient!fq;")
	@Override
	public synchronized Class5_Sub16 method8735() {
		return null;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[ILclient!lba;IB)Z")
	public boolean method6387(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class5_Sub33 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5884 = Static608.anInt10099 / 100;
		if (arg2.anInt5900 >= 0 && (arg2.aClass5_Sub16_Sub3_4 == null || arg2.aClass5_Sub16_Sub3_4.method6155())) {
			arg2.method5026();
			arg2.method9327(1);
			if (arg2.anInt5893 > 0 && arg2 == this.aClass5_Sub33ArrayArray1[arg2.anInt5901][arg2.anInt5893]) {
				this.aClass5_Sub33ArrayArray1[arg2.anInt5901][arg2.anInt5893] = null;
			}
			return true;
		}
		@Pc(66) int local66 = arg2.anInt5898;
		if (local66 > 0) {
			local66 -= (int) (Math.pow(2.0D, (double) this.anIntArray435[arg2.anInt5901] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local66 < 0) {
				local66 = 0;
			}
			arg2.anInt5898 = local66;
		}
		arg2.aClass5_Sub16_Sub3_4.method6154(this.method6380(arg2));
		@Pc(106) Class159 local106 = arg2.aClass159_1;
		@Pc(108) boolean local108 = false;
		arg2.anInt5883++;
		arg2.anInt5885 += local106.anInt3618;
		@Pc(139) double local139 = (double) ((arg2.anInt5898 * arg2.anInt5895 >> 12) + (arg2.anInt5894 - 60 << 8)) * 5.086263020833333E-6D;
		if (local106.anInt3624 > 0) {
			if (local106.anInt3619 <= 0) {
				arg2.anInt5896 += 128;
			} else {
				arg2.anInt5896 += (int) (Math.pow(2.0D, (double) local106.anInt3619 * local139) * 128.0D + 0.5D);
			}
			if (arg2.anInt5896 * local106.anInt3624 >= 819200) {
				local108 = true;
			}
		}
		if (local106.aByteArray18 != null) {
			if (local106.anInt3621 <= 0) {
				arg2.anInt5890 += 128;
			} else {
				arg2.anInt5890 += (int) (Math.pow(2.0D, local139 * (double) local106.anInt3621) * 128.0D + 0.5D);
			}
			while (local106.aByteArray18.length - 2 > arg2.anInt5886 && (local106.aByteArray18[arg2.anInt5886 + 2] & 0xFF) << 8 < arg2.anInt5890) {
				arg2.anInt5886 += 2;
			}
			if (arg2.anInt5886 == local106.aByteArray18.length - 2 && local106.aByteArray18[arg2.anInt5886 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg2.anInt5900 >= 0 && local106.aByteArray19 != null && (this.anIntArray437[arg2.anInt5901] & 0x1) == 0 && (arg2.anInt5893 < 0 || arg2 != this.aClass5_Sub33ArrayArray1[arg2.anInt5901][arg2.anInt5893])) {
			if (local106.anInt3620 <= 0) {
				arg2.anInt5900 += 128;
			} else {
				arg2.anInt5900 += (int) (Math.pow(2.0D, (double) local106.anInt3620 * local139) * 128.0D + 0.5D);
			}
			while (local106.aByteArray19.length - 2 > arg2.anInt5888 && arg2.anInt5900 > (local106.aByteArray19[arg2.anInt5888 + 2] & 0xFF) << 8) {
				arg2.anInt5888 += 2;
			}
			if (arg2.anInt5888 == local106.aByteArray19.length - 2) {
				local108 = true;
			}
		}
		if (!local108) {
			arg2.aClass5_Sub16_Sub3_4.method6157(arg2.anInt5884, this.method6382(arg2), this.method6377(arg2));
			return false;
		}
		arg2.aClass5_Sub16_Sub3_4.method6150(arg2.anInt5884);
		if (arg1 == null) {
			arg2.aClass5_Sub16_Sub3_4.method8740(arg3);
		} else {
			arg2.aClass5_Sub16_Sub3_4.method8738(arg1, arg0, arg3);
		}
		if (arg2.aClass5_Sub16_Sub3_4.method6147()) {
			this.aClass5_Sub16_Sub5_1.aClass5_Sub16_Sub1_2.method2555(arg2.aClass5_Sub16_Sub3_4);
		}
		arg2.method5026();
		if (arg2.anInt5900 >= 0) {
			arg2.method9327(1);
			if (arg2.anInt5893 > 0 && this.aClass5_Sub33ArrayArray1[arg2.anInt5901][arg2.anInt5893] == arg2) {
				this.aClass5_Sub33ArrayArray1[arg2.anInt5901][arg2.anInt5893] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V")
	public synchronized void method6389() {
		this.method6411(true);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "()Lclient!fq;")
	@Override
	public synchronized Class5_Sub16 method8737() {
		return this.aClass5_Sub16_Sub5_1;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IJ)V")
	private void method6390(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong221) {
			@Pc(19) int local19 = this.anInt7424;
			@Pc(22) int local22 = this.anInt7425;
			@Pc(25) long local25 = this.aLong221;
			while (local22 == this.anInt7425) {
				while (local22 == this.aClass252_1.anIntArray391[local19]) {
					this.aClass252_1.method5890(local19);
					@Pc(38) int local38 = this.aClass252_1.method5884(local19);
					if (local38 == 1) {
						this.aClass252_1.method5888();
						this.aClass252_1.method5889(local19);
						if (this.aClass252_1.method5882()) {
							if (!this.aBoolean569 || local22 == 0) {
								this.method6406(true);
								this.aClass252_1.method5881();
								return;
							}
							this.aClass252_1.method5883(local25);
						}
						break;
					}
					if ((local38 & 0x80) != 0 && (local38 & 0xF0) != 144) {
						this.method6385(local38);
					}
					this.aClass252_1.method5876(local19);
					this.aClass252_1.method5889(local19);
				}
				this.aLong222 = local25;
				local19 = this.aClass252_1.method5877();
				local22 = this.aClass252_1.anIntArray391[local19];
				local25 = this.aClass252_1.method5887(local22);
			}
			this.anInt7424 = local19;
			this.aLong221 = local25;
			this.anInt7425 = local22;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!fia;BLclient!hp;Lclient!la;)Z")
	public synchronized boolean method6391(@OriginalArg(1) Class126 arg0, @OriginalArg(3) Class5_Sub21 arg1, @OriginalArg(4) Class208 arg2) {
		arg1.method3368();
		@Pc(9) boolean local9 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class5_Sub28 local35 = (Class5_Sub28) arg1.aClass291_17.method6987(); local35 != null; local35 = (Class5_Sub28) arg1.aClass291_17.method6989()) {
			@Pc(43) int local43 = (int) local35.aLong314;
			@Pc(51) Class5_Sub54 local51 = (Class5_Sub54) this.aClass291_29.method6993((long) local43, 1);
			if (local51 == null) {
				local51 = Static185.method2697(arg2, local43);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass291_29.method6984((long) local43, local51);
			}
			if (!local51.method9142(local29, local35.aByteArray36, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3366();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!lba;Z)V")
	public void method6392(@OriginalArg(1) Class5_Sub33 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) int local17 = arg0.aClass5_Sub24_Sub1_4.aByteArray77.length;
		@Pc(38) int local38;
		if (arg1 && arg0.aClass5_Sub24_Sub1_4.aBoolean594) {
			@Pc(49) int local49 = local17 + local17 - arg0.aClass5_Sub24_Sub1_4.anInt7870;
			local38 = (int) ((long) local49 * (long) this.anIntArray449[arg0.anInt5901] >> 6);
			local17 <<= 0x8;
			if (local38 >= local17) {
				arg0.aClass5_Sub16_Sub3_4.method6133();
				local38 = local17 + local17 - local38 - 1;
			}
		} else {
			local38 = (int) ((long) local17 * (long) this.anIntArray449[arg0.anInt5901] >> 6);
		}
		arg0.aClass5_Sub16_Sub3_4.method6128(local38);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIB)V")
	private void method6394() {
		this.anIntArray440[9] = 128;
		this.anIntArray441[9] = 128;
		this.method6395(9, 128);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)V")
	private void method6395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray447[arg0]) {
			this.anIntArray447[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass5_Sub33ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)V")
	private void method6396(@OriginalArg(0) int arg0) {
		if ((this.anIntArray437[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub33 local18 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1916(); local18 != null; local18 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1915()) {
			if (local18.anInt5901 == arg0) {
				local18.anInt5891 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZ)V")
	private void method6397(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub33 local12 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1916(); local12 != null; local12 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1915()) {
			if (arg0 < 0 || arg0 == local12.anInt5901) {
				if (local12.aClass5_Sub16_Sub3_4 != null) {
					local12.aClass5_Sub16_Sub3_4.method6150(Static608.anInt10099 / 100);
					if (local12.aClass5_Sub16_Sub3_4.method6147()) {
						this.aClass5_Sub16_Sub5_1.aClass5_Sub16_Sub1_2.method2555(local12.aClass5_Sub16_Sub3_4);
					}
					local12.method5026();
				}
				if (local12.anInt5900 < 0) {
					this.aClass5_Sub33ArrayArray2[local12.anInt5901][local12.anInt5894] = null;
				}
				local12.method9327(1);
			}
		}
		if (false) {
			Static432.anInt7421 = 12;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIZLclient!hp;)V")
	private synchronized void method6398(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class5_Sub21 arg2) {
		this.method6411(arg1);
		this.aClass252_1.method5886(arg2.aByteArray22);
		this.aLong222 = 0L;
		this.aBoolean569 = arg0;
		@Pc(34) int local34 = this.aClass252_1.method5880();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			this.aClass252_1.method5890(local36);
			this.aClass252_1.method5876(local36);
			this.aClass252_1.method5889(local36);
		}
		this.anInt7424 = this.aClass252_1.method5877();
		this.anInt7425 = this.aClass252_1.anIntArray391[this.anInt7424];
		this.aLong221 = this.aClass252_1.method5887(this.anInt7425);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!lba;)Z")
	public boolean method6399(@OriginalArg(1) Class5_Sub33 arg0) {
		if (arg0.aClass5_Sub16_Sub3_4 != null) {
			return false;
		}
		if (arg0.anInt5900 >= 0) {
			arg0.method9327(1);
			if (arg0.anInt5893 > 0 && arg0 == this.aClass5_Sub33ArrayArray1[arg0.anInt5901][arg0.anInt5893]) {
				this.aClass5_Sub33ArrayArray1[arg0.anInt5901][arg0.anInt5893] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "()I")
	@Override
	public synchronized int method8739() {
		return 0;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBI)V")
	public synchronized void method6400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray446[arg0] = arg1;
		} else {
			for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
				this.anIntArray446[local17] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZLclient!hp;JZZ)V")
	public synchronized void method6401(@OriginalArg(1) Class5_Sub21 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2) {
		this.method6398(arg2, true, arg0);
		this.method6390(arg1 * (long) this.aClass252_1.anInt6878);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
	private void method6402(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6402(local12);
			}
			return;
		}
		this.anIntArray438[arg0] = 12800;
		this.anIntArray442[arg0] = 8192;
		this.anIntArray444[arg0] = 16383;
		this.anIntArray443[arg0] = 8192;
		this.anIntArray439[arg0] = 0;
		this.anIntArray435[arg0] = 8192;
		this.method6412(arg0);
		this.method6396(arg0);
		this.anIntArray437[arg0] = 0;
		this.anIntArray448[arg0] = 32767;
		this.anIntArray436[arg0] = 256;
		this.anIntArray449[arg0] = 0;
		this.method6407(8192, arg0);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIII)V")
	private void method6404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)V")
	public synchronized void method6405() {
		for (@Pc(7) Class5_Sub54 local7 = (Class5_Sub54) this.aClass291_29.method6987(); local7 != null; local7 = (Class5_Sub54) this.aClass291_29.method6989()) {
			local7.method9327(1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(BZ)V")
	private void method6406(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method6397(-1);
		} else {
			this.method6383(-1);
		}
		this.method6402(-1);
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			this.anIntArray447[local32] = this.anIntArray440[local32];
		}
		for (@Pc(50) int local50 = 0; local50 < 16; local50++) {
			this.anIntArray441[local50] = this.anIntArray440[local50] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(III)V")
	private void method6407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray450[arg1] = arg0;
		this.anIntArray445[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIII)V")
	private void method6408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class5_Sub33 local24 = this.aClass5_Sub33ArrayArray2[arg2][arg0];
		if (local24 == null) {
			return;
		}
		this.aClass5_Sub33ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray437[arg2] & 0x2) == 0) {
			local24.anInt5900 = 0;
			return;
		}
		for (@Pc(57) Class5_Sub33 local57 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1916(); local57 != null; local57 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1915()) {
			if (local24.anInt5901 == local57.anInt5901 && local57.anInt5900 < 0 && local57 != local24) {
				local24.anInt5900 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass252_1.method5879()) {
			@Pc(14) int local14 = this.anInt7392 * this.aClass252_1.anInt6878 / Static608.anInt10099;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong222;
				if (this.aLong221 - local23 >= 0L) {
					this.aLong222 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong221 - this.aLong222 - 1L) / (long) local14);
				this.aLong222 += (long) local14 * (long) local51;
				this.aClass5_Sub16_Sub5_1.method8738(arg0, arg1, local51);
				arg2 -= local51;
				arg1 += local51;
				this.method6410();
			} while (this.aClass252_1.method5879());
		}
		this.aClass5_Sub16_Sub5_1.method8738(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)I")
	public int method6409() {
		return this.anInt7399;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
	private void method6410() {
		@Pc(8) int local8 = this.anInt7424;
		@Pc(11) int local11 = this.anInt7425;
		@Pc(14) long local14 = this.aLong221;
		if (this.aClass5_Sub21_2 != null && local11 == this.anInt7426) {
			this.method6398(this.aBoolean569, this.aBoolean570, this.aClass5_Sub21_2);
			this.method6410();
			return;
		}
		while (local11 == this.anInt7425) {
			while (this.aClass252_1.anIntArray391[local8] == local11) {
				this.aClass252_1.method5890(local8);
				@Pc(56) int local56 = this.aClass252_1.method5884(local8);
				if (local56 == 1) {
					this.aClass252_1.method5888();
					this.aClass252_1.method5889(local8);
					if (this.aClass252_1.method5882()) {
						if (this.aClass5_Sub21_2 != null) {
							this.method6413(this.aBoolean569, this.aClass5_Sub21_2);
							this.method6410();
							return;
						}
						if (!this.aBoolean569 || local11 == 0) {
							this.method6406(true);
							this.aClass252_1.method5881();
							return;
						}
						this.aClass252_1.method5883(local14);
					}
					break;
				}
				if ((local56 & 0x80) != 0) {
					this.method6385(local56);
				}
				this.aClass252_1.method5876(local8);
				this.aClass252_1.method5889(local8);
			}
			local8 = this.aClass252_1.method5877();
			local11 = this.aClass252_1.anIntArray391[local8];
			local14 = this.aClass252_1.method5887(local11);
		}
		this.anInt7424 = local8;
		this.anInt7425 = local11;
		this.aLong221 = local14;
		if (this.aClass5_Sub21_2 != null && this.anInt7426 < local11) {
			this.anInt7424 = -1;
			this.anInt7425 = this.anInt7426;
			this.aLong221 = this.aClass252_1.method5887(this.anInt7425);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BZ)V")
	private synchronized void method6411(@OriginalArg(1) boolean arg0) {
		this.aClass252_1.method5881();
		this.aClass5_Sub21_2 = null;
		this.method6406(arg0);
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
	private void method6412(@OriginalArg(0) int arg0) {
		if ((this.anIntArray437[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class5_Sub33 local27 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1916(); local27 != null; local27 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1915()) {
			if (arg0 == local27.anInt5901 && this.aClass5_Sub33ArrayArray2[arg0][local27.anInt5894] == null && local27.anInt5900 < 0) {
				local27.anInt5900 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZZLclient!hp;)V")
	public synchronized void method6413(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub21 arg1) {
		this.method6398(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIII)V")
	private void method6414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6408(arg0, 64, arg1);
		if ((this.anIntArray437[arg1] & 0x2) != 0) {
			for (@Pc(28) Class5_Sub33 local28 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1924(); local28 != null; local28 = (Class5_Sub33) this.aClass5_Sub16_Sub5_1.aClass102_72.method1922()) {
				if (local28.anInt5901 == arg1 && local28.anInt5900 < 0) {
					this.aClass5_Sub33ArrayArray2[arg1][local28.anInt5894] = null;
					this.aClass5_Sub33ArrayArray2[arg1][arg0] = local28;
					@Pc(67) int local67 = local28.anInt5887 + (local28.anInt5895 * local28.anInt5898 >> 12);
					local28.anInt5887 += arg0 - local28.anInt5894 << 8;
					local28.anInt5898 = 4096;
					local28.anInt5895 = local67 - local28.anInt5887;
					local28.anInt5894 = arg0;
					return;
				}
			}
		}
		@Pc(112) Class5_Sub54 local112 = (Class5_Sub54) this.aClass291_29.method6993((long) this.anIntArray447[arg1], 1);
		if (local112 == null) {
			return;
		}
		@Pc(128) Class5_Sub24_Sub1 local128 = local112.aClass5_Sub24_Sub1Array1[arg0];
		if (local128 == null) {
			return;
		}
		@Pc(136) Class5_Sub33 local136 = new Class5_Sub33();
		local136.aClass5_Sub54_1 = local112;
		local136.aClass5_Sub24_Sub1_4 = local128;
		local136.anInt5901 = arg1;
		local136.aClass159_1 = local112.aClass159Array1[arg0];
		local136.anInt5893 = local112.aByteArray110[arg0];
		local136.anInt5894 = arg0;
		local136.anInt5892 = arg2 * arg2 * local112.anInt10606 * local112.aByteArray111[arg0] + 1024 >> 11;
		local136.anInt5889 = local112.aByteArray112[arg0] & 0xFF;
		local136.anInt5887 = (arg0 << 8) - (local112.aShortArray157[arg0] & 0x7FFF);
		local136.anInt5896 = 0;
		local136.anInt5890 = 0;
		local136.anInt5888 = 0;
		local136.anInt5900 = -1;
		local136.anInt5886 = 0;
		if (this.anIntArray449[arg1] == 0) {
			local136.aClass5_Sub16_Sub3_4 = Static688.method6163(local128, this.method6380(local136), this.method6382(local136), this.method6377(local136));
		} else {
			local136.aClass5_Sub16_Sub3_4 = Static688.method6163(local128, this.method6380(local136), 0, this.method6377(local136));
			this.method6392(local136, local112.aShortArray157[arg0] < 0);
		}
		if (local112.aShortArray157[arg0] < 0) {
			local136.aClass5_Sub16_Sub3_4.method6140(-1);
		}
		if (local136.anInt5893 >= 0) {
			@Pc(297) Class5_Sub33 local297 = this.aClass5_Sub33ArrayArray1[arg1][local136.anInt5893];
			if (local297 != null && local297.anInt5900 < 0) {
				this.aClass5_Sub33ArrayArray2[arg1][local297.anInt5894] = null;
				local297.anInt5900 = 0;
			}
			this.aClass5_Sub33ArrayArray1[arg1][local136.anInt5893] = local136;
		}
		this.aClass5_Sub16_Sub5_1.aClass102_72.method1921(local136);
		this.aClass5_Sub33ArrayArray2[arg1][arg0] = local136;
	}
}
