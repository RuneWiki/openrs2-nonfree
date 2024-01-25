import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!nr", name = "Jb", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!nr", name = "Kb", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "client!nr", name = "Lb", descriptor = "I")
	private int anInt4420;

	@OriginalMember(owner = "client!nr", name = "Ob", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!nr", name = "Pb", descriptor = "I")
	private int anInt4421;

	@OriginalMember(owner = "client!nr", name = "Qb", descriptor = "Lclient!oa;")
	private Class1_Sub31 aClass1_Sub31_3;

	@OriginalMember(owner = "client!nr", name = "Sb", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!nr", name = "Ub", descriptor = "I")
	private int anInt4423;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!nr", name = "N", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "[I")
	private final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "[I")
	public final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!nr", name = "W", descriptor = "[I")
	private final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
	private int anInt4384 = 256;

	@OriginalMember(owner = "client!nr", name = "mb", descriptor = "[I")
	private final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!nr", name = "J", descriptor = "[I")
	public final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!nr", name = "sb", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!nr", name = "kb", descriptor = "[I")
	public final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!nr", name = "db", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!nr", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!nr", name = "fb", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!nr", name = "vb", descriptor = "[[Lclient!wh;")
	private final Class1_Sub43[][] aClass1_Sub43ArrayArray1 = new Class1_Sub43[16][128];

	@OriginalMember(owner = "client!nr", name = "yb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!nr", name = "wb", descriptor = "[[Lclient!wh;")
	private final Class1_Sub43[][] aClass1_Sub43ArrayArray2 = new Class1_Sub43[16][128];

	@OriginalMember(owner = "client!nr", name = "ob", descriptor = "I")
	private final int anInt4405 = 1000000;

	@OriginalMember(owner = "client!nr", name = "Fb", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!nr", name = "M", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!nr", name = "Ib", descriptor = "[I")
	private final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Lclient!go;")
	private final Class72 aClass72_1 = new Class72();

	@OriginalMember(owner = "client!nr", name = "Mb", descriptor = "Lclient!gf;")
	private final Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(this);

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "Lclient!dq;")
	private final Class38 aClass38_23 = new Class38(128);

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub4() {
		this.method4062();
		this.method4077(true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)V")
	private void method4058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray356[arg1] = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	private void method4059(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (local15 == 128) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method4067(local28, local34, local22);
		} else if (local15 == 144) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local34 <= 0) {
				this.method4067(local28, 64, local22);
			} else {
				this.method4087(local28, local22, local34);
			}
		} else if (local15 == 160) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method4075(local28, local34, local22);
		} else if (local15 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray360[local22] = (local34 << 14) + (this.anIntArray360[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray360[local22] = (this.anIntArray360[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 1) {
				this.anIntArray366[local22] = (local34 << 7) + (this.anIntArray366[local22] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray366[local22] = local34 + (this.anIntArray366[local22] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray362[local22] = (local34 << 7) + (this.anIntArray362[local22] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray362[local22] = (this.anIntArray362[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 7) {
				this.anIntArray354[local22] = (local34 << 7) + (this.anIntArray354[local22] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray354[local22] = local34 + (this.anIntArray354[local22] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.lb[local22] = (this.lb[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 42) {
				this.lb[local22] = local34 + (this.lb[local22] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.anIntArray358[local22] = (this.anIntArray358[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 43) {
				this.anIntArray358[local22] = (this.anIntArray358[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 64) {
				if (local34 >= 64) {
					this.anIntArray353[local22] |= 0x1;
				} else {
					this.anIntArray353[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local34 < 64) {
					this.method4093(local22);
					this.anIntArray353[local22] &= 0xFFFFFFFD;
				} else {
					this.anIntArray353[local22] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray365[local22] = (local34 << 7) + (this.anIntArray365[local22] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray365[local22] = (this.anIntArray365[local22] & 0x3F80) + local34;
			}
			if (local28 == 101) {
				this.anIntArray365[local22] = (local34 << 7) + (this.anIntArray365[local22] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray365[local22] = (this.anIntArray365[local22] & 0x3F80) + local34 + 16384;
			}
			if (local28 == 120) {
				this.method4085(local22);
			}
			if (local28 == 121) {
				this.method4070(local22);
			}
			if (local28 == 123) {
				this.method4086(local22);
			}
			@Pc(508) int local508;
			if (local28 == 6) {
				local508 = this.anIntArray365[local22];
				if (local508 == 16384) {
					this.anIntArray364[local22] = (local34 << 7) + (this.anIntArray364[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local508 = this.anIntArray365[local22];
				if (local508 == 16384) {
					this.anIntArray364[local22] = local34 + (this.anIntArray364[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray361[local22] = (local34 << 7) + (this.anIntArray361[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray361[local22] = (this.anIntArray361[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 81) {
				if (local34 < 64) {
					this.method4064(local22);
					this.anIntArray353[local22] &= 0xFFFFFFFB;
				} else {
					this.anIntArray353[local22] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method4091((local34 << 7) + (this.anIntArray359[local22] & 0xFFFFC07F), local22);
			}
			if (local28 == 49) {
				this.method4091(local34 + (this.anIntArray359[local22] & 0xFFFFFF80), local22);
			}
		} else if (local15 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4076(local22, this.anIntArray360[local22] + local28);
		} else if (local15 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4071(local28, local22);
		} else if (local15 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00DF) >> 9);
			this.method4058(local28, local22);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method4077(true);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
	public synchronized void method4060(@OriginalArg(1) int arg0) {
		this.anInt4384 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!wh;)I")
	private int method4061(@OriginalArg(1) Class1_Sub43 arg0) {
		@Pc(19) int local19 = (arg0.anInt6889 * arg0.anInt6881 >> 12) + arg0.anInt6888;
		local19 += (this.anIntArray356[arg0.anInt6874] - 8192) * this.anIntArray364[arg0.anInt6874] >> 12;
		@Pc(40) Class5 local40 = arg0.aClass5_1;
		@Pc(63) int local63;
		if (local40.anInt202 > 0 && (local40.anInt204 > 0 || this.anIntArray366[arg0.anInt6874] > 0)) {
			local63 = local40.anInt204 << 2;
			@Pc(68) int local68 = local40.anInt201 << 1;
			if (arg0.anInt6869 < local68) {
				local63 = local63 * arg0.anInt6869 / local68;
			}
			local63 += this.anIntArray366[arg0.anInt6874] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt6885 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) (local102 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass1_Sub39_Sub1_1.anInt6076 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static14.anInt4962 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)V")
	private synchronized void method4062() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray363[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public synchronized void method4063() {
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) this.aClass38_23.method1474(); local15 != null; local15 = (Class1_Sub10) this.aClass38_23.method1470()) {
			local15.method650();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V")
	private void method4064(@OriginalArg(0) int arg0) {
		if ((this.anIntArray353[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class1_Sub43 local20 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1543(); local20 != null; local20 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1551()) {
			if (local20.anInt6874 == arg0) {
				local20.anInt6884 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
	private void method4066() {
		@Pc(8) int local8 = this.anInt4420;
		@Pc(11) int local11 = this.anInt4421;
		@Pc(14) long local14 = this.aLong159;
		if (this.aClass1_Sub31_3 != null && local11 == this.anInt4423) {
			this.method4090(this.aClass1_Sub31_3, this.aBoolean326, this.aBoolean327);
			this.method4066();
			return;
		}
		while (local11 == this.anInt4421) {
			while (local11 == this.aClass72_1.anIntArray182[local8]) {
				this.aClass72_1.method2291(local8);
				@Pc(47) int local47 = this.aClass72_1.method2298(local8);
				if (local47 == 1) {
					this.aClass72_1.method2300();
					this.aClass72_1.method2293(local8);
					if (this.aClass72_1.method2297()) {
						if (this.aClass1_Sub31_3 != null) {
							this.method4088(this.aClass1_Sub31_3, this.aBoolean326);
							this.method4066();
							return;
						}
						if (!this.aBoolean326 || local11 == 0) {
							this.method4077(true);
							this.aClass72_1.method2290();
							return;
						}
						this.aClass72_1.method2303(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4059(local47);
				}
				this.aClass72_1.method2289(local8);
				this.aClass72_1.method2293(local8);
			}
			local8 = this.aClass72_1.method2301();
			local11 = this.aClass72_1.anIntArray182[local8];
			local14 = this.aClass72_1.method2299(local11);
		}
		this.anInt4420 = local8;
		this.anInt4421 = local11;
		this.aLong159 = local14;
		if (this.aClass1_Sub31_3 != null && this.anInt4423 < local11) {
			this.anInt4421 = this.anInt4423;
			this.anInt4420 = -1;
			this.aLong159 = this.aClass72_1.method2299(this.anInt4421);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4055(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass72_1.method2295()) {
			@Pc(14) int local14 = this.anInt4405 * this.aClass72_1.anInt2417 / Static14.anInt4962;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong158;
				if (this.aLong159 - local23 >= 0L) {
					this.aLong158 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong159 - this.aLong158 - 1L) / (long) local14);
				this.aLong158 += (long) local14 * (long) local52;
				this.aClass1_Sub6_Sub1_1.method4055(arg0, arg1, local52);
				arg2 -= local52;
				this.method4066();
				arg1 += local52;
			} while (this.aClass72_1.method2295());
		}
		this.aClass1_Sub6_Sub1_1.method4055(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIII)V")
	private void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class1_Sub43 local12 = this.aClass1_Sub43ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub43ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray353[arg2] & 0x2) == 0) {
			local12.anInt6876 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub43 local43 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1543(); local43 != null; local43 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1551()) {
			if (local43.anInt6874 == local12.anInt6874 && local43.anInt6876 < 0 && local12 != local43) {
				local12.anInt6876 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "(I)V")
	public synchronized void method4068() {
		this.method4080(true);
	}

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "(I)I")
	public int method4069() {
		return this.anInt4384;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4057() {
		return 0;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
	private void method4070(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
				this.method4070(local14);
			}
			return;
		}
		this.anIntArray354[arg0] = 12800;
		this.lb[arg0] = 8192;
		this.anIntArray358[arg0] = 16383;
		this.anIntArray356[arg0] = 8192;
		this.anIntArray366[arg0] = 0;
		this.anIntArray362[arg0] = 8192;
		this.method4093(arg0);
		this.method4064(arg0);
		this.anIntArray353[arg0] = 0;
		this.anIntArray365[arg0] = 32767;
		this.anIntArray364[arg0] = 256;
		this.anIntArray361[arg0] = 0;
		this.method4091(8192, arg0);
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method4051(@OriginalArg(0) int arg0) {
		if (this.aClass72_1.method2295()) {
			@Pc(18) int local18 = this.anInt4405 * this.aClass72_1.anInt2417 / Static14.anInt4962;
			do {
				@Pc(28) long local28 = this.aLong158 + (long) arg0 * (long) local18;
				if (this.aLong159 - local28 >= 0L) {
					this.aLong158 = local28;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong159 + (long) local18 - this.aLong158 - 1L) / (long) local18);
				this.aLong158 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass1_Sub6_Sub1_1.method4051(local57);
				this.method4066();
			} while (this.aClass72_1.method2295());
		}
		this.aClass1_Sub6_Sub1_1.method4051(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IZI)V")
	private void method4071(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!ct;ZLclient!oq;Lclient!oa;)Z")
	public synchronized boolean method4073(@OriginalArg(1) Class30 arg0, @OriginalArg(3) Class158 arg1, @OriginalArg(4) Class1_Sub31 arg2) {
		arg2.method4128();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class1_Sub37 local31 = (Class1_Sub37) arg2.aClass38_24.method1474(); local31 != null; local31 = (Class1_Sub37) arg2.aClass38_24.method1470()) {
			@Pc(37) int local37 = (int) local31.aLong217;
			@Pc(45) Class1_Sub10 local45 = (Class1_Sub10) this.aClass38_23.method1475((long) local37);
			if (local45 == null) {
				local45 = Static15.method347(local37, arg0);
				if (local45 == null) {
					local14 = false;
					continue;
				}
				this.aClass38_23.method1472(local45, (long) local37);
			}
			if (!local45.method649(arg1, local25, local31.aByteArray84)) {
				local14 = false;
			}
		}
		if (local14) {
			arg2.method4129();
		}
		return local14;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(ILclient!wh;)I")
	private int method4074(@OriginalArg(1) Class1_Sub43 arg0) {
		if (this.anIntArray363[arg0.anInt6874] == 0) {
			return 0;
		}
		@Pc(17) Class5 local17 = arg0.aClass5_1;
		@Pc(33) int local33 = this.anIntArray354[arg0.anInt6874] * this.anIntArray358[arg0.anInt6874] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt6880 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt4384 + 128 >> 8;
		local33 = this.anIntArray363[arg0.anInt6874] * local59 + 128 >> 8;
		if (local17.anInt200 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt200 * 1.953125E-5D * (double) arg0.anInt6865) * (double) local33 + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local17.aByteArray6 != null) {
			local109 = arg0.anInt6878;
			local117 = local17.aByteArray6[arg0.anInt6864 + 1];
			if (local17.aByteArray6.length - 2 > arg0.anInt6864) {
				local135 = (local17.aByteArray6[arg0.anInt6864] & 0xFF) << 8;
				local147 = (local17.aByteArray6[arg0.anInt6864 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray6[arg0.anInt6864 + 3] - local117) * (-local135 + local109) / (local147 - local135);
			}
			local33 = local33 * local117 + 32 >> 6;
		}
		if (arg0.anInt6876 > 0 && local17.aByteArray5 != null) {
			local109 = arg0.anInt6876;
			local117 = local17.aByteArray5[arg0.anInt6867 + 1];
			if (local17.aByteArray5.length - 2 > arg0.anInt6867) {
				local135 = (local17.aByteArray5[arg0.anInt6867] & 0xFF) << 8;
				local147 = (local17.aByteArray5[arg0.anInt6867 + 2] & 0xFF) << 8;
				local117 += (local17.aByteArray5[arg0.anInt6867 + 3] - local117) * (local109 - local135) / (local147 - local135);
			}
			local33 = local33 * local117 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIII)V")
	private void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
	private void method4076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray357[arg0]) {
			this.anIntArray357[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub43ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "()Lclient!ar;")
	@Override
	public synchronized Class1_Sub6 method4056() {
		return null;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "()Lclient!ar;")
	@Override
	public synchronized Class1_Sub6 method4054() {
		return this.aClass1_Sub6_Sub1_1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V")
	private void method4077(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method4085(-1);
		} else {
			this.method4086(-1);
		}
		this.method4070(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray357[local29] = this.anIntArray352[local29];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray360[local45] = this.anIntArray352[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ILclient!wh;ZI[I)Z")
	public boolean method4078(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub43 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt6887 = Static14.anInt4962 / 100;
		if (arg1.anInt6876 >= 0 && (arg1.aClass1_Sub6_Sub2_3 == null || arg1.aClass1_Sub6_Sub2_3.method2490())) {
			arg1.method5939();
			arg1.method6045();
			if (arg1.anInt6872 > 0 && arg1 == this.aClass1_Sub43ArrayArray1[arg1.anInt6874][arg1.anInt6872]) {
				this.aClass1_Sub43ArrayArray1[arg1.anInt6874][arg1.anInt6872] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt6889;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray362[arg1.anInt6874] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt6889 = local56;
		}
		arg1.aClass1_Sub6_Sub2_3.method2511(this.method4061(arg1));
		@Pc(93) Class5 local93 = arg1.aClass5_1;
		arg1.anInt6869++;
		@Pc(101) boolean local101 = false;
		arg1.anInt6885 += local93.anInt202;
		@Pc(127) double local127 = (double) ((arg1.anInt6866 - 60 << 8) + (arg1.anInt6889 * arg1.anInt6881 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt200 > 0) {
			if (local93.anInt199 > 0) {
				arg1.anInt6865 += (int) (Math.pow(2.0D, local127 * (double) local93.anInt199) * 128.0D + 0.5D);
			} else {
				arg1.anInt6865 += 128;
			}
			if (local93.anInt200 * arg1.anInt6865 >= 819200) {
				local101 = true;
			}
		}
		if (local93.aByteArray6 != null) {
			if (local93.anInt203 <= 0) {
				arg1.anInt6878 += 128;
			} else {
				arg1.anInt6878 += (int) (Math.pow(2.0D, (double) local93.anInt203 * local127) * 128.0D + 0.5D);
			}
			while (arg1.anInt6864 < local93.aByteArray6.length - 2 && arg1.anInt6878 > (local93.aByteArray6[arg1.anInt6864 + 2] & 0xFF) << 8) {
				arg1.anInt6864 += 2;
			}
			if (local93.aByteArray6.length - 2 == arg1.anInt6864 && local93.aByteArray6[arg1.anInt6864 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg1.anInt6876 >= 0 && local93.aByteArray5 != null && (this.anIntArray353[arg1.anInt6874] & 0x1) == 0 && (arg1.anInt6872 < 0 || arg1 != this.aClass1_Sub43ArrayArray1[arg1.anInt6874][arg1.anInt6872])) {
			if (local93.anInt196 > 0) {
				arg1.anInt6876 += (int) (Math.pow(2.0D, (double) local93.anInt196 * local127) * 128.0D + 0.5D);
			} else {
				arg1.anInt6876 += 128;
			}
			while (local93.aByteArray5.length - 2 > arg1.anInt6867 && arg1.anInt6876 > (local93.aByteArray5[arg1.anInt6867 + 2] & 0xFF) << 8) {
				arg1.anInt6867 += 2;
			}
			if (arg1.anInt6867 == local93.aByteArray5.length - 2) {
				local101 = true;
			}
		}
		if (!local101) {
			arg1.aClass1_Sub6_Sub2_3.method2494(arg1.anInt6887, this.method4074(arg1), this.method4095(arg1));
			return false;
		}
		arg1.aClass1_Sub6_Sub2_3.method2527(arg1.anInt6887);
		if (arg3 == null) {
			arg1.aClass1_Sub6_Sub2_3.method4051(arg2);
		} else {
			arg1.aClass1_Sub6_Sub2_3.method4055(arg3, arg0, arg2);
		}
		if (arg1.aClass1_Sub6_Sub2_3.method2496()) {
			this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub3_1.method3785(arg1.aClass1_Sub6_Sub2_3);
		}
		arg1.method5939();
		if (arg1.anInt6876 >= 0) {
			arg1.method6045();
			if (arg1.anInt6872 > 0 && arg1 == this.aClass1_Sub43ArrayArray1[arg1.anInt6874][arg1.anInt6872]) {
				this.aClass1_Sub43ArrayArray1[arg1.anInt6874][arg1.anInt6872] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4079() {
		this.method4094();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZZ)V")
	private synchronized void method4080(@OriginalArg(0) boolean arg0) {
		this.aClass72_1.method2290();
		this.aClass1_Sub31_3 = null;
		this.method4077(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V")
	public synchronized void method4082() {
		for (@Pc(7) Class1_Sub10 local7 = (Class1_Sub10) this.aClass38_23.method1474(); local7 != null; local7 = (Class1_Sub10) this.aClass38_23.method1470()) {
			local7.method6045();
		}
	}

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "(I)Z")
	public synchronized boolean method4083() {
		return this.aClass72_1.method2295();
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(II)V")
	private void method4085(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub43 local16 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1543(); local16 != null; local16 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1551()) {
			if (arg0 < 0 || local16.anInt6874 == arg0) {
				if (local16.aClass1_Sub6_Sub2_3 != null) {
					local16.aClass1_Sub6_Sub2_3.method2527(Static14.anInt4962 / 100);
					if (local16.aClass1_Sub6_Sub2_3.method2496()) {
						this.aClass1_Sub6_Sub1_1.aClass1_Sub6_Sub3_1.method3785(local16.aClass1_Sub6_Sub2_3);
					}
					local16.method5939();
				}
				if (local16.anInt6876 < 0) {
					this.aClass1_Sub43ArrayArray2[local16.anInt6874][local16.anInt6866] = null;
				}
				local16.method6045();
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(II)V")
	private void method4086(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class1_Sub43 local6 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1543(); local6 != null; local6 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1551()) {
			if ((arg0 < 0 || local6.anInt6874 == arg0) && local6.anInt6876 < 0) {
				this.aClass1_Sub43ArrayArray2[local6.anInt6874][local6.anInt6866] = null;
				local6.anInt6876 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(IIII)V")
	private void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4067(arg0, 64, arg1);
		if ((this.anIntArray353[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub43 local28 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1544(); local28 != null; local28 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1547()) {
				if (local28.anInt6874 == arg1 && local28.anInt6876 < 0) {
					this.aClass1_Sub43ArrayArray2[arg1][local28.anInt6866] = null;
					this.aClass1_Sub43ArrayArray2[arg1][arg0] = local28;
					@Pc(63) int local63 = local28.anInt6888 + (local28.anInt6889 * local28.anInt6881 >> 12);
					local28.anInt6888 += arg0 - local28.anInt6866 << 8;
					local28.anInt6889 = 4096;
					local28.anInt6881 = local63 - local28.anInt6888;
					local28.anInt6866 = arg0;
					return;
				}
			}
		}
		@Pc(118) Class1_Sub10 local118 = (Class1_Sub10) this.aClass38_23.method1475((long) this.anIntArray357[arg1]);
		if (local118 == null) {
			return;
		}
		@Pc(126) Class1_Sub39_Sub1 local126 = local118.aClass1_Sub39_Sub1Array1[arg0];
		if (local126 == null) {
			return;
		}
		@Pc(133) Class1_Sub43 local133 = new Class1_Sub43();
		local133.anInt6874 = arg1;
		local133.aClass1_Sub10_1 = local118;
		local133.aClass1_Sub39_Sub1_1 = local126;
		local133.aClass5_1 = local118.aClass5Array1[arg0];
		local133.anInt6872 = local118.aByteArray11[arg0];
		local133.anInt6866 = arg0;
		local133.anInt6880 = arg2 * arg2 * local118.anInt618 * local118.aByteArray12[arg0] + 1024 >> 11;
		local133.anInt6882 = local118.aByteArray13[arg0] & 0xFF;
		local133.anInt6888 = (arg0 << 8) - (local118.aShortArray14[arg0] & 0x7FFF);
		local133.anInt6865 = 0;
		local133.anInt6864 = 0;
		local133.anInt6867 = 0;
		local133.anInt6876 = -1;
		local133.anInt6878 = 0;
		if (this.anIntArray361[arg1] == 0) {
			local133.aClass1_Sub6_Sub2_3 = Static372.method2508(local126, this.method4061(local133), this.method4074(local133), this.method4095(local133));
		} else {
			local133.aClass1_Sub6_Sub2_3 = Static372.method2508(local126, this.method4061(local133), 0, this.method4095(local133));
			this.method4089(local118.aShortArray14[arg0] < 0, local133);
		}
		if (local118.aShortArray14[arg0] < 0) {
			local133.aClass1_Sub6_Sub2_3.method2529(-1);
		}
		if (local133.anInt6872 >= 0) {
			@Pc(291) Class1_Sub43 local291 = this.aClass1_Sub43ArrayArray1[arg1][local133.anInt6872];
			if (local291 != null && local291.anInt6876 < 0) {
				this.aClass1_Sub43ArrayArray2[arg1][local291.anInt6866] = null;
				local291.anInt6876 = 0;
			}
			this.aClass1_Sub43ArrayArray1[arg1][local133.anInt6872] = local133;
		}
		this.aClass1_Sub6_Sub1_1.aClass42_12.method1549(local133);
		this.aClass1_Sub43ArrayArray2[arg1][arg0] = local133;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!oa;Z)V")
	public synchronized void method4088(@OriginalArg(1) Class1_Sub31 arg0, @OriginalArg(2) boolean arg1) {
		this.method4090(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLclient!wh;B)V")
	public void method4089(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub43 arg1) {
		@Pc(14) int local14 = arg1.aClass1_Sub39_Sub1_1.aByteArray89.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass1_Sub39_Sub1_1.aBoolean453) {
			@Pc(45) int local45 = local14 + local14 - arg1.aClass1_Sub39_Sub1_1.anInt6077;
			local33 = (int) ((long) local45 * (long) this.anIntArray361[arg1.anInt6874] >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				local33 = local14 + local14 - local33 - 1;
				arg1.aClass1_Sub6_Sub2_3.method2514();
			}
		} else {
			local33 = (int) ((long) local14 * (long) this.anIntArray361[arg1.anInt6874] >> 6);
		}
		arg1.aClass1_Sub6_Sub2_3.method2507(local33);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!oa;ZZI)V")
	private synchronized void method4090(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method4080(arg2);
		this.aClass72_1.method2302(arg0.aByteArray76);
		this.aBoolean326 = arg1;
		this.aLong158 = 0L;
		@Pc(30) int local30 = this.aClass72_1.method2288();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass72_1.method2291(local32);
			this.aClass72_1.method2289(local32);
			this.aClass72_1.method2293(local32);
		}
		this.anInt4420 = this.aClass72_1.method2301();
		this.anInt4421 = this.aClass72_1.anIntArray182[this.anInt4420];
		this.aLong159 = this.aClass72_1.method2299(this.anInt4421);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)V")
	private void method4091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray359[arg1] = arg0;
		this.anIntArray355[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!wh;)Z")
	public boolean method4092(@OriginalArg(1) Class1_Sub43 arg0) {
		if (arg0.aClass1_Sub6_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt6876 >= 0) {
			arg0.method6045();
			if (arg0.anInt6872 > 0 && arg0 == this.aClass1_Sub43ArrayArray1[arg0.anInt6874][arg0.anInt6872]) {
				this.aClass1_Sub43ArrayArray1[arg0.anInt6874][arg0.anInt6872] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(IB)V")
	private void method4093(@OriginalArg(0) int arg0) {
		if ((this.anIntArray353[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class1_Sub43 local23 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1543(); local23 != null; local23 = (Class1_Sub43) this.aClass1_Sub6_Sub1_1.aClass42_12.method1551()) {
			if (arg0 == local23.anInt6874 && this.aClass1_Sub43ArrayArray2[arg0][local23.anInt6866] == null && local23.anInt6876 < 0) {
				local23.anInt6876 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIB)V")
	private void method4094() {
		this.anIntArray352[9] = 128;
		this.anIntArray360[9] = 128;
		this.method4076(9, 128);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!wh;B)I")
	private int method4095(@OriginalArg(0) Class1_Sub43 arg0) {
		@Pc(14) int local14 = this.lb[arg0.anInt6874];
		return local14 < 8192 ? arg0.anInt6882 * local14 + 32 >> 6 : 16384 - ((128 - arg0.anInt6882) * (16384 - local14) + 32 >> 6);
	}
}
