import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!lp", name = "Db", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!lp", name = "Fb", descriptor = "J")
	private long aLong196;

	@OriginalMember(owner = "client!lp", name = "Gb", descriptor = "J")
	private long aLong197;

	@OriginalMember(owner = "client!lp", name = "Hb", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!lp", name = "Ib", descriptor = "I")
	private int anInt4100;

	@OriginalMember(owner = "client!lp", name = "Jb", descriptor = "Z")
	private boolean aBoolean270;

	@OriginalMember(owner = "client!lp", name = "Kb", descriptor = "Lclient!hn;")
	private Class2_Sub15 aClass2_Sub15_3;

	@OriginalMember(owner = "client!lp", name = "Lb", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "[I")
	private final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "[I")
	public final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "[I")
	public final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
	private final int anInt4069 = 1000000;

	@OriginalMember(owner = "client!lp", name = "db", descriptor = "[I")
	private final int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
	private int anInt4079 = 256;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!lp", name = "W", descriptor = "[[Lclient!nd;")
	private final Class2_Sub27[][] aClass2_Sub27ArrayArray1 = new Class2_Sub27[16][128];

	@OriginalMember(owner = "client!lp", name = "vb", descriptor = "[I")
	private final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!lp", name = "jb", descriptor = "[I")
	private final int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!lp", name = "gb", descriptor = "[I")
	private final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!lp", name = "Ab", descriptor = "[I")
	public final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!lp", name = "cb", descriptor = "[I")
	private final int[] anIntArray370 = new int[16];

	@OriginalMember(owner = "client!lp", name = "T", descriptor = "[I")
	private final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!lp", name = "Cb", descriptor = "[[Lclient!nd;")
	private final Class2_Sub27[][] aClass2_Sub27ArrayArray2 = new Class2_Sub27[16][128];

	@OriginalMember(owner = "client!lp", name = "qb", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!lp", name = "zb", descriptor = "[I")
	private final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!lp", name = "sb", descriptor = "Lclient!ai;")
	private final Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!lp", name = "Eb", descriptor = "Lclient!og;")
	private final Class2_Sub8_Sub3 aClass2_Sub8_Sub3_1 = new Class2_Sub8_Sub3(this);

	@OriginalMember(owner = "client!lp", name = "rb", descriptor = "Lclient!ru;")
	private final Class220 aClass220_22 = new Class220(128);

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class2_Sub8_Sub2() {
		this.method3291();
		this.method3313(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	private synchronized void method3291() {
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			this.anIntArray370[local9] = 256;
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)V")
	private void method3292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray374[arg1] = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)V")
	public synchronized void method3293() {
		this.method3298();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!nd;Z)I")
	private int method3294(@OriginalArg(0) Class2_Sub27 arg0) {
		@Pc(14) int local14 = (arg0.anInt4944 * arg0.anInt4937 >> 12) + arg0.anInt4942;
		local14 += this.anIntArray375[arg0.anInt4933] * (this.anIntArray374[arg0.anInt4933] - 8192) >> 12;
		@Pc(40) Class228 local40 = arg0.aClass228_1;
		@Pc(60) int local60;
		if (local40.anInt6590 > 0 && (local40.anInt6589 > 0 || this.anIntArray373[arg0.anInt4933] > 0)) {
			local60 = local40.anInt6589 << 2;
			@Pc(65) int local65 = local40.anInt6584 << 1;
			if (arg0.anInt4941 < local65) {
				local60 = local60 * arg0.anInt4941 / local65;
			}
			local60 += this.anIntArray373[arg0.anInt4933] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt4939 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local60 * local99);
		}
		local60 = (int) ((double) (arg0.aClass2_Sub14_Sub1_1.anInt3845 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static150.anInt7358 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	private void method3296() {
		@Pc(8) int local8 = this.anInt4100;
		@Pc(11) int local11 = this.anInt4099;
		@Pc(14) long local14 = this.aLong196;
		if (this.aClass2_Sub15_3 != null && this.anInt4101 == local11) {
			this.method3297(this.aBoolean269, this.aBoolean270, this.aClass2_Sub15_3);
			this.method3296();
			return;
		}
		while (this.anInt4099 == local11) {
			while (local11 == this.aClass9_1.anIntArray15[local8]) {
				this.aClass9_1.method101(local8);
				@Pc(47) int local47 = this.aClass9_1.method95(local8);
				if (local47 == 1) {
					this.aClass9_1.method99();
					this.aClass9_1.method96(local8);
					if (this.aClass9_1.method107()) {
						if (this.aClass2_Sub15_3 != null) {
							this.method3323(this.aBoolean269, this.aClass2_Sub15_3);
							this.method3296();
							return;
						}
						if (!this.aBoolean269 || local11 == 0) {
							this.method3313(true);
							this.aClass9_1.method105();
							return;
						}
						this.aClass9_1.method104(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method3309(local47);
				}
				this.aClass9_1.method109(local8);
				this.aClass9_1.method96(local8);
			}
			local8 = this.aClass9_1.method110();
			local11 = this.aClass9_1.anIntArray15[local8];
			local14 = this.aClass9_1.method98(local11);
		}
		this.aLong196 = local14;
		this.anInt4100 = local8;
		this.anInt4099 = local11;
		if (this.aClass2_Sub15_3 != null && local11 > this.anInt4101) {
			this.anInt4100 = -1;
			this.anInt4099 = this.anInt4101;
			this.aLong196 = this.aClass9_1.method98(this.anInt4099);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZZLclient!hn;)V")
	private synchronized void method3297(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub15 arg2) {
		this.method3305(arg1);
		this.aClass9_1.method106(arg2.aByteArray37);
		this.aLong197 = 0L;
		this.aBoolean269 = arg0;
		@Pc(31) int local31 = this.aClass9_1.method100();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass9_1.method101(local33);
			this.aClass9_1.method109(local33);
			this.aClass9_1.method96(local33);
		}
		this.anInt4100 = this.aClass9_1.method110();
		this.anInt4099 = this.aClass9_1.anIntArray15[this.anInt4100];
		this.aLong196 = this.aClass9_1.method98(this.anInt4099);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "()Lclient!nu;")
	@Override
	public synchronized Class2_Sub8 method5285() {
		return this.aClass2_Sub8_Sub3_1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZ)V")
	private void method3298() {
		this.anIntArray362[9] = 128;
		this.anIntArray372[9] = 128;
		this.method3320(128, 9);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
	private void method3300(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub27 local6 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3972(); local6 != null; local6 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3975()) {
			if ((arg0 < 0 || arg0 == local6.anInt4933) && local6.anInt4948 < 0) {
				this.aClass2_Sub27ArrayArray2[local6.anInt4933][local6.anInt4936] = null;
				local6.anInt4948 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)V")
	private void method3301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray376[arg1] = arg0;
		this.anIntArray377[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	private void method3302(@OriginalArg(0) int arg0) {
		if ((this.anIntArray368[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) Class2_Sub27 local17 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3972(); local17 != null; local17 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3975()) {
			if (local17.anInt4933 == arg0) {
				local17.anInt4932 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
	public synchronized void method3303() {
		for (@Pc(5) Class2_Sub46 local5 = (Class2_Sub46) this.aClass220_22.method5096(); local5 != null; local5 = (Class2_Sub46) this.aClass220_22.method5098()) {
			local5.method6043();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[ILclient!nd;I)Z")
	public boolean method3304(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub27 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt4934 = Static150.anInt7358 / 100;
		if (arg2.anInt4948 >= 0 && (arg2.aClass2_Sub8_Sub4_3 == null || arg2.aClass2_Sub8_Sub4_3.method5326())) {
			arg2.method3910();
			arg2.method6260();
			if (arg2.anInt4938 > 0 && arg2 == this.aClass2_Sub27ArrayArray1[arg2.anInt4933][arg2.anInt4938]) {
				this.aClass2_Sub27ArrayArray1[arg2.anInt4933][arg2.anInt4938] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg2.anInt4937;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray363[arg2.anInt4933] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg2.anInt4937 = local61;
		}
		arg2.aClass2_Sub8_Sub4_3.method5316(this.method3294(arg2));
		@Pc(101) Class228 local101 = arg2.aClass228_1;
		arg2.anInt4941++;
		@Pc(109) boolean local109 = false;
		arg2.anInt4939 += local101.anInt6590;
		@Pc(134) double local134 = (double) ((arg2.anInt4937 * arg2.anInt4944 >> 12) + (arg2.anInt4936 - 60 << 8)) * 5.086263020833333E-6D;
		if (local101.anInt6593 > 0) {
			if (local101.anInt6591 <= 0) {
				arg2.anInt4945 += 128;
			} else {
				arg2.anInt4945 += (int) (Math.pow(2.0D, local134 * (double) local101.anInt6591) * 128.0D + 0.5D);
			}
			if (arg2.anInt4945 * local101.anInt6593 >= 819200) {
				local109 = true;
			}
		}
		if (local101.aByteArray71 != null) {
			if (local101.anInt6592 <= 0) {
				arg2.anInt4950 += 128;
			} else {
				arg2.anInt4950 += (int) (Math.pow(2.0D, (double) local101.anInt6592 * local134) * 128.0D + 0.5D);
			}
			while (local101.aByteArray71.length - 2 > arg2.anInt4949 && (local101.aByteArray71[arg2.anInt4949 + 2] & 0xFF) << 8 < arg2.anInt4950) {
				arg2.anInt4949 += 2;
			}
			if (local101.aByteArray71.length - 2 == arg2.anInt4949 && local101.aByteArray71[arg2.anInt4949 + 1] == 0) {
				local109 = true;
			}
		}
		if (arg2.anInt4948 >= 0 && local101.aByteArray72 != null && (this.anIntArray368[arg2.anInt4933] & 0x1) == 0 && (arg2.anInt4938 < 0 || this.aClass2_Sub27ArrayArray1[arg2.anInt4933][arg2.anInt4938] != arg2)) {
			if (local101.anInt6583 <= 0) {
				arg2.anInt4948 += 128;
			} else {
				arg2.anInt4948 += (int) (Math.pow(2.0D, (double) local101.anInt6583 * local134) * 128.0D + 0.5D);
			}
			while (arg2.anInt4943 < local101.aByteArray72.length - 2 && (local101.aByteArray72[arg2.anInt4943 + 2] & 0xFF) << 8 < arg2.anInt4948) {
				arg2.anInt4943 += 2;
			}
			if (arg2.anInt4943 == local101.aByteArray72.length - 2) {
				local109 = true;
			}
		}
		if (!local109) {
			arg2.aClass2_Sub8_Sub4_3.method5293(arg2.anInt4934, this.method3319(arg2), this.method3318(arg2));
			return false;
		}
		arg2.aClass2_Sub8_Sub4_3.method5325(arg2.anInt4934);
		if (arg1 == null) {
			arg2.aClass2_Sub8_Sub4_3.method5284(arg3);
		} else {
			arg2.aClass2_Sub8_Sub4_3.method5281(arg1, arg0, arg3);
		}
		if (arg2.aClass2_Sub8_Sub4_3.method5315()) {
			this.aClass2_Sub8_Sub3_1.aClass2_Sub8_Sub1_1.method1039(arg2.aClass2_Sub8_Sub4_3);
		}
		arg2.method3910();
		if (arg2.anInt4948 >= 0) {
			arg2.method6260();
			if (arg2.anInt4938 > 0 && this.aClass2_Sub27ArrayArray1[arg2.anInt4933][arg2.anInt4938] == arg2) {
				this.aClass2_Sub27ArrayArray1[arg2.anInt4933][arg2.anInt4938] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZ)V")
	private synchronized void method3305(@OriginalArg(1) boolean arg0) {
		this.aClass9_1.method105();
		this.aClass2_Sub15_3 = null;
		this.method3313(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5284(@OriginalArg(0) int arg0) {
		if (this.aClass9_1.method108()) {
			@Pc(14) int local14 = this.aClass9_1.anInt115 * this.anInt4069 / Static150.anInt7358;
			do {
				@Pc(24) long local24 = this.aLong197 + (long) local14 * (long) arg0;
				if (this.aLong196 - local24 >= 0L) {
					this.aLong197 = local24;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong196 - this.aLong197 - 1L) / (long) local14);
				this.aLong197 += (long) local14 * (long) local52;
				this.aClass2_Sub8_Sub3_1.method5284(local52);
				arg0 -= local52;
				this.method3296();
			} while (this.aClass9_1.method108());
		}
		this.aClass2_Sub8_Sub3_1.method5284(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(III)V")
	private void method3306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5286() {
		return 0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IB)V")
	private void method3307(@OriginalArg(0) int arg0) {
		if ((this.anIntArray368[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub27 local15 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3972(); local15 != null; local15 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3975()) {
			if (arg0 == local15.anInt4933 && this.aClass2_Sub27ArrayArray2[arg0][local15.anInt4936] == null && local15.anInt4948 < 0) {
				local15.anInt4948 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(BI)V")
	public synchronized void method3308(@OriginalArg(1) int arg0) {
		this.anInt4079 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V")
	private void method3309(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method3322(local36, local24, local30);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method3317(local30, local24, local36);
			} else {
				this.method3322(64, local24, local30);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method3312(local36, local30, local24);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray372[local24] = (local36 << 14) + (this.anIntArray372[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray372[local24] = (this.anIntArray372[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.anIntArray373[local24] = (this.anIntArray373[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray373[local24] = local36 + (this.anIntArray373[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray363[local24] = (this.anIntArray363[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 37) {
				this.anIntArray363[local24] = (this.anIntArray363[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray371[local24] = (this.anIntArray371[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 39) {
				this.anIntArray371[local24] = (this.anIntArray371[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray364[local24] = (this.anIntArray364[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 42) {
				this.anIntArray364[local24] = local36 + (this.anIntArray364[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray369[local24] = (local36 << 7) + (this.anIntArray369[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray369[local24] = (this.anIntArray369[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 64) {
				if (local36 < 64) {
					this.anIntArray368[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray368[local24] |= 0x1;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray368[local24] |= 0x2;
				} else {
					this.method3307(local24);
					this.anIntArray368[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray367[local24] = (local36 << 7) + (this.anIntArray367[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray367[local24] = (this.anIntArray367[local24] & 0x3F80) + local36;
			}
			if (local30 == 101) {
				this.anIntArray367[local24] = (local36 << 7) + (this.anIntArray367[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray367[local24] = (this.anIntArray367[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method3310(local24);
			}
			if (local30 == 121) {
				this.method3316(local24);
			}
			if (local30 == 123) {
				this.method3300(local24);
			}
			@Pc(521) int local521;
			if (local30 == 6) {
				local521 = this.anIntArray367[local24];
				if (local521 == 16384) {
					this.anIntArray375[local24] = (local36 << 7) + (this.anIntArray375[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local521 = this.anIntArray367[local24];
				if (local521 == 16384) {
					this.anIntArray375[local24] = local36 + (this.anIntArray375[local24] & 0xFFFFFF80);
				}
			}
			if (local30 == 16) {
				this.anIntArray366[local24] = (local36 << 7) + (this.anIntArray366[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray366[local24] = (this.anIntArray366[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method3302(local24);
					this.anIntArray368[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray368[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method3301((local36 << 7) + (this.anIntArray376[local24] & 0xFFFFC07F), local24);
			}
			if (local30 == 49) {
				this.method3301((this.anIntArray376[local24] & 0xFFFFFF80) + local36, local24);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method3320(local30 + this.anIntArray372[local24], local24);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method3306(local30, local24);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method3292(local30, local24);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method3313(true);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(IB)V")
	private void method3310(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class2_Sub27 local6 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3972(); local6 != null; local6 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3975()) {
			if (arg0 < 0 || arg0 == local6.anInt4933) {
				if (local6.aClass2_Sub8_Sub4_3 != null) {
					local6.aClass2_Sub8_Sub4_3.method5325(Static150.anInt7358 / 100);
					if (local6.aClass2_Sub8_Sub4_3.method5315()) {
						this.aClass2_Sub8_Sub3_1.aClass2_Sub8_Sub1_1.method1039(local6.aClass2_Sub8_Sub4_3);
					}
					local6.method3910();
				}
				if (local6.anInt4948 < 0) {
					this.aClass2_Sub27ArrayArray2[local6.anInt4933][local6.anInt4936] = null;
				}
				local6.method6260();
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!nd;Z)Z")
	public boolean method3311(@OriginalArg(0) Class2_Sub27 arg0) {
		if (arg0.aClass2_Sub8_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt4948 >= 0) {
			arg0.method6260();
			if (arg0.anInt4938 > 0 && arg0 == this.aClass2_Sub27ArrayArray1[arg0.anInt4933][arg0.anInt4938]) {
				this.aClass2_Sub27ArrayArray1[arg0.anInt4933][arg0.anInt4938] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	private void method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
	private void method3313(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3310(-1);
		} else {
			this.method3300(-1);
		}
		this.method3316(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray365[local20] = this.anIntArray362[local20];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray372[local41] = this.anIntArray362[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)V")
	public synchronized void method3314() {
		for (@Pc(17) Class2_Sub46 local17 = (Class2_Sub46) this.aClass220_22.method5096(); local17 != null; local17 = (Class2_Sub46) this.aClass220_22.method5098()) {
			local17.method6260();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ek;Lclient!mn;Lclient!hn;II)Z")
	public synchronized boolean method3315(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class2_Sub15 arg2) {
		arg2.method2356();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class2_Sub39 local29 = (Class2_Sub39) arg2.aClass220_19.method5096(); local29 != null; local29 = (Class2_Sub39) arg2.aClass220_19.method5098()) {
			@Pc(35) int local35 = (int) local29.aLong401;
			@Pc(43) Class2_Sub46 local43 = (Class2_Sub46) this.aClass220_22.method5099((long) local35);
			if (local43 == null) {
				local43 = Static12.method227(local35, arg1);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass220_22.method5104(local43, (long) local35);
			}
			if (!local43.method6042(local29.aByteArray70, local23, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2357();
		}
		return local9;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(BI)V")
	private void method3316(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method3316(local10);
			}
			return;
		}
		this.anIntArray371[arg0] = 12800;
		this.anIntArray364[arg0] = 8192;
		this.anIntArray369[arg0] = 16383;
		this.anIntArray374[arg0] = 8192;
		this.anIntArray373[arg0] = 0;
		this.anIntArray363[arg0] = 8192;
		this.method3307(arg0);
		this.method3302(arg0);
		this.anIntArray368[arg0] = 0;
		this.anIntArray367[arg0] = 32767;
		this.anIntArray375[arg0] = 256;
		this.anIntArray366[arg0] = 0;
		this.method3301(8192, arg0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)V")
	private void method3317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3322(64, arg1, arg0);
		if ((this.anIntArray368[arg1] & 0x2) != 0) {
			for (@Pc(27) Class2_Sub27 local27 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3974(); local27 != null; local27 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3966()) {
				if (local27.anInt4933 == arg1 && local27.anInt4948 < 0) {
					this.aClass2_Sub27ArrayArray2[arg1][local27.anInt4936] = null;
					this.aClass2_Sub27ArrayArray2[arg1][arg0] = local27;
					@Pc(66) int local66 = local27.anInt4942 + (local27.anInt4937 * local27.anInt4944 >> 12);
					local27.anInt4942 += arg0 - local27.anInt4936 << 8;
					local27.anInt4936 = arg0;
					local27.anInt4937 = 4096;
					local27.anInt4944 = local66 - local27.anInt4942;
					return;
				}
			}
		}
		@Pc(112) Class2_Sub46 local112 = (Class2_Sub46) this.aClass220_22.method5099((long) this.anIntArray365[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class2_Sub14_Sub1 local120 = local112.aClass2_Sub14_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class2_Sub27 local127 = new Class2_Sub27();
		local127.aClass2_Sub46_1 = local112;
		local127.anInt4933 = arg1;
		local127.aClass2_Sub14_Sub1_1 = local120;
		local127.aClass228_1 = local112.aClass228Array1[arg0];
		local127.anInt4938 = local112.aByteArray92[arg0];
		local127.anInt4936 = arg0;
		local127.anInt4946 = local112.anInt7435 * arg2 * arg2 * local112.aByteArray93[arg0] + 1024 >> 11;
		local127.anInt4947 = local112.aByteArray91[arg0] & 0xFF;
		local127.anInt4942 = (arg0 << 8) - (local112.aShortArray118[arg0] & 0x7FFF);
		local127.anInt4950 = 0;
		local127.anInt4948 = -1;
		local127.anInt4949 = 0;
		local127.anInt4945 = 0;
		local127.anInt4943 = 0;
		if (this.anIntArray366[arg1] == 0) {
			local127.aClass2_Sub8_Sub4_3 = Static473.method5289(local120, this.method3294(local127), this.method3319(local127), this.method3318(local127));
		} else {
			local127.aClass2_Sub8_Sub4_3 = Static473.method5289(local120, this.method3294(local127), 0, this.method3318(local127));
			this.method3325(local127, local112.aShortArray118[arg0] < 0);
		}
		if (local112.aShortArray118[arg0] < 0) {
			local127.aClass2_Sub8_Sub4_3.method5298(-1);
		}
		if (local127.anInt4938 >= 0) {
			@Pc(277) Class2_Sub27 local277 = this.aClass2_Sub27ArrayArray1[arg1][local127.anInt4938];
			if (local277 != null && local277.anInt4948 < 0) {
				this.aClass2_Sub27ArrayArray2[arg1][local277.anInt4936] = null;
				local277.anInt4948 = 0;
			}
			this.aClass2_Sub27ArrayArray1[arg1][local127.anInt4938] = local127;
		}
		this.aClass2_Sub8_Sub3_1.aClass181_28.method3973(local127);
		this.aClass2_Sub27ArrayArray2[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!nd;I)I")
	private int method3318(@OriginalArg(0) Class2_Sub27 arg0) {
		@Pc(9) int local9 = this.anIntArray364[arg0.anInt4933];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt4947) * (-local9 + 16384) + 32 >> 6) : arg0.anInt4947 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!nd;B)I")
	private int method3319(@OriginalArg(0) Class2_Sub27 arg0) {
		if (this.anIntArray370[arg0.anInt4933] == 0) {
			return 0;
		}
		@Pc(20) Class228 local20 = arg0.aClass228_1;
		@Pc(36) int local36 = this.anIntArray371[arg0.anInt4933] * this.anIntArray369[arg0.anInt4933] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt4946 * local44 + 16384 >> 15;
		@Pc(62) int local62 = local53 * this.anInt4079 + 128 >> 8;
		local36 = local62 * this.anIntArray370[arg0.anInt4933] + 128 >> 8;
		if (local20.anInt6593 > 0) {
			local36 = (int) ((double) local36 * Math.pow(0.5D, (double) local20.anInt6593 * 1.953125E-5D * (double) arg0.anInt4945) + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local20.aByteArray71 != null) {
			local101 = arg0.anInt4950;
			local109 = local20.aByteArray71[arg0.anInt4949 + 1];
			if (arg0.anInt4949 < local20.aByteArray71.length - 2) {
				local131 = (local20.aByteArray71[arg0.anInt4949] & 0xFF) << 8;
				local143 = (local20.aByteArray71[arg0.anInt4949 + 2] & 0xFF) << 8;
				local109 += (local20.aByteArray71[arg0.anInt4949 + 3] - local109) * (-local131 + local101) / (local143 - local131);
			}
			local36 = local36 * local109 + 32 >> 6;
		}
		if (arg0.anInt4948 > 0 && local20.aByteArray72 != null) {
			local101 = arg0.anInt4948;
			local109 = local20.aByteArray72[arg0.anInt4943 + 1];
			if (local20.aByteArray72.length - 2 > arg0.anInt4943) {
				local131 = (local20.aByteArray72[arg0.anInt4943] & 0xFF) << 8;
				local143 = (local20.aByteArray72[arg0.anInt4943 + 2] & 0xFF) << 8;
				local109 += (local20.aByteArray72[arg0.anInt4943 + 3] - local109) * (local101 - local131) / (local143 - local131);
			}
			local36 = local109 * local36 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "(III)V")
	private void method3320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray365[arg1] != arg0) {
			this.anIntArray365[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass2_Sub27ArrayArray1[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "()Lclient!nu;")
	@Override
	public synchronized Class2_Sub8 method5287() {
		return null;
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)I")
	public int method3321() {
		return this.anInt4079;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(IIII)V")
	private void method3322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub27 local16 = this.aClass2_Sub27ArrayArray2[arg1][arg2];
		if (local16 == null) {
			return;
		}
		this.aClass2_Sub27ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray368[arg1] & 0x2) == 0) {
			local16.anInt4948 = 0;
			return;
		}
		for (@Pc(44) Class2_Sub27 local44 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3972(); local44 != null; local44 = (Class2_Sub27) this.aClass2_Sub8_Sub3_1.aClass181_28.method3975()) {
			if (local44.anInt4933 == local16.anInt4933 && local44.anInt4948 < 0 && local16 != local44) {
				local16.anInt4948 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZILclient!hn;)V")
	public synchronized void method3323(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub15 arg1) {
		this.method3297(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)Z")
	public synchronized boolean method3324() {
		return this.aClass9_1.method108();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!nd;ZI)V")
	public void method3325(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub14_Sub1_1.aByteArray50.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass2_Sub14_Sub1_1.aBoolean257) {
			@Pc(38) int local38 = local8 + local8 - arg0.aClass2_Sub14_Sub1_1.anInt3844;
			local27 = (int) ((long) this.anIntArray366[arg0.anInt4933] * (long) local38 >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg0.aClass2_Sub8_Sub4_3.method5313();
			}
		} else {
			local27 = (int) ((long) this.anIntArray366[arg0.anInt4933] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub8_Sub4_3.method5292(local27);
	}

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "(I)V")
	public synchronized void method3327() {
		this.method3305(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5281(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass9_1.method108()) {
			@Pc(18) int local18 = this.anInt4069 * this.aClass9_1.anInt115 / Static150.anInt7358;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong197;
				if (this.aLong196 - local27 >= 0L) {
					this.aLong197 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong196 + (long) local18 - this.aLong197 - 1L) / (long) local18);
				this.aLong197 += (long) local18 * (long) local56;
				this.aClass2_Sub8_Sub3_1.method5281(arg0, arg1, local56);
				arg2 -= local56;
				arg1 += local56;
				this.method3296();
			} while (this.aClass9_1.method108());
		}
		this.aClass2_Sub8_Sub3_1.method5281(arg0, arg1, arg2);
	}
}
