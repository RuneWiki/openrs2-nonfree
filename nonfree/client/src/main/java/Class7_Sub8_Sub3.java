import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class7_Sub8_Sub3 extends Class7_Sub8 {

	@OriginalMember(owner = "client!rl", name = "Ab", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!rl", name = "Bb", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!rl", name = "Cb", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!rl", name = "Db", descriptor = "I")
	private int anInt5601;

	@OriginalMember(owner = "client!rl", name = "Eb", descriptor = "I")
	private int anInt5602;

	@OriginalMember(owner = "client!rl", name = "Fb", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!rl", name = "Gb", descriptor = "I")
	private int anInt5603;

	@OriginalMember(owner = "client!rl", name = "Hb", descriptor = "Lclient!pu;")
	private Class7_Sub36 aClass7_Sub36_2;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "[I")
	private final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
	private int anInt5569 = 256;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "[[Lclient!cj;")
	private final Class7_Sub10[][] aClass7_Sub10ArrayArray1 = new Class7_Sub10[16][128];

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "[I")
	private final int[] anIntArray505 = new int[16];

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "[I")
	public final int[] anIntArray503 = new int[16];

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
	public final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "[I")
	private final int[] anIntArray506 = new int[16];

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!rl", name = "jb", descriptor = "[I")
	private final int[] anIntArray510 = new int[16];

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "[[Lclient!cj;")
	private final Class7_Sub10[][] aClass7_Sub10ArrayArray2 = new Class7_Sub10[16][128];

	@OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
	private final int anInt5576 = 1000000;

	@OriginalMember(owner = "client!rl", name = "V", descriptor = "[I")
	private final int[] anIntArray508 = new int[16];

	@OriginalMember(owner = "client!rl", name = "pb", descriptor = "[I")
	private final int[] anIntArray513 = new int[16];

	@OriginalMember(owner = "client!rl", name = "kb", descriptor = "[I")
	private final int[] anIntArray511 = new int[16];

	@OriginalMember(owner = "client!rl", name = "mb", descriptor = "[I")
	private final int[] anIntArray512 = new int[16];

	@OriginalMember(owner = "client!rl", name = "fb", descriptor = "[I")
	public final int[] anIntArray509 = new int[16];

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "[I")
	private final int[] anIntArray504 = new int[16];

	@OriginalMember(owner = "client!rl", name = "rb", descriptor = "[I")
	private final int[] anIntArray514 = new int[16];

	@OriginalMember(owner = "client!rl", name = "T", descriptor = "[I")
	private final int[] anIntArray507 = new int[16];

	@OriginalMember(owner = "client!rl", name = "xb", descriptor = "[I")
	private final int[] anIntArray515 = new int[16];

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lclient!sb;")
	private final Class226 aClass226_1 = new Class226();

	@OriginalMember(owner = "client!rl", name = "zb", descriptor = "Lclient!ji;")
	private final Class7_Sub8_Sub2 aClass7_Sub8_Sub2_1 = new Class7_Sub8_Sub2(this);

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Lclient!mt;")
	private final Class164 aClass164_35 = new Class164(128);

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class7_Sub8_Sub3() {
		this.method4479();
		this.method4502(true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZII)V")
	private synchronized void method4479() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray515[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	private void method4480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray506[arg1] = arg0;
		this.anIntArray500[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
	private void method4481() {
		this.anIntArray505[9] = 128;
		this.anIntArray502[9] = 128;
		this.method4491(128, 9);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!cj;I)I")
	private int method4482(@OriginalArg(0) Class7_Sub10 arg0) {
		@Pc(15) int local15 = arg0.anInt770 + (arg0.anInt765 * arg0.anInt756 >> 12);
		local15 += this.anIntArray504[arg0.anInt759] * (this.anIntArray511[arg0.anInt759] - 8192) >> 12;
		@Pc(44) Class106 local44 = arg0.aClass106_1;
		@Pc(64) int local64;
		if (local44.anInt2917 > 0 && (local44.anInt2919 > 0 || this.anIntArray507[arg0.anInt759] > 0)) {
			local64 = local44.anInt2919 << 2;
			@Pc(69) int local69 = local44.anInt2915 << 1;
			if (arg0.anInt761 < local69) {
				local64 = local64 * arg0.anInt761 / local69;
			}
			local64 += this.anIntArray507[arg0.anInt759] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt768 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local99 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass7_Sub31_Sub1_1.anInt4158 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static208.anInt3680 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)I")
	public int method4483() {
		return this.anInt5569;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIB)V")
	private void method4484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class7_Sub10 local18 = this.aClass7_Sub10ArrayArray2[arg0][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass7_Sub10ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray503[arg0] & 0x2) == 0) {
			local18.anInt757 = 0;
			return;
		}
		for (@Pc(45) Class7_Sub10 local45 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2010(); local45 != null; local45 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2000()) {
			if (local18.anInt759 == local45.anInt759 && local45.anInt757 < 0 && local45 != local18) {
				local18.anInt757 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4870(@OriginalArg(0) int arg0) {
		if (this.aClass226_1.method4596()) {
			@Pc(14) int local14 = this.aClass226_1.anInt5708 * this.anInt5576 / Static208.anInt3680;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong174;
				if (this.aLong175 - local23 >= 0L) {
					this.aLong174 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong175 + (long) local14 - this.aLong174 - 1L) / (long) local14);
				this.aLong174 += (long) local53 * (long) local14;
				this.aClass7_Sub8_Sub2_1.method4870(local53);
				arg0 -= local53;
				this.method4504();
			} while (this.aClass226_1.method4596());
		}
		this.aClass7_Sub8_Sub2_1.method4870(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
	public synchronized void method4486(@OriginalArg(0) int arg0) {
		this.anInt5569 = arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILclient!ok;Lclient!pu;Lclient!fg;)Z")
	public synchronized boolean method4487(@OriginalArg(2) Class178 arg0, @OriginalArg(3) Class7_Sub36 arg1, @OriginalArg(4) Class77 arg2) {
		arg1.method4114();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class7_Sub41 local26 = (Class7_Sub41) arg1.aClass164_29.method3514(); local26 != null; local26 = (Class7_Sub41) arg1.aClass164_29.method3519()) {
			@Pc(32) int local32 = (int) local26.aLong230;
			@Pc(42) Class7_Sub1 local42 = (Class7_Sub1) this.aClass164_35.method3512((long) local32);
			if (local42 == null) {
				local42 = Static291.method3867(local32, arg0);
				if (local42 == null) {
					local9 = false;
					continue;
				}
				this.aClass164_35.method3508((long) local32, local42);
			}
			if (!local42.method41(local26.aByteArray88, local20, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method4115();
		}
		return local9;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "()Lclient!bs;")
	@Override
	public synchronized Class7_Sub8 method4872() {
		return null;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!cj;)I")
	private int method4488(@OriginalArg(1) Class7_Sub10 arg0) {
		@Pc(14) int local14 = this.anIntArray510[arg0.anInt759];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt773 + 128) + 32 >> 6) : arg0.anInt773 * local14 - -32 >> 6;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
	private void method4489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray511[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(III)V")
	private void method4490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)V")
	private void method4491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray508[arg1]) {
			this.anIntArray508[arg1] = arg0;
			for (@Pc(30) int local30 = 0; local30 < 128; local30++) {
				this.aClass7_Sub10ArrayArray1[arg1][local30] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(II)V")
	private void method4492(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class7_Sub10 local14 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2010(); local14 != null; local14 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2000()) {
			if ((arg0 < 0 || arg0 == local14.anInt759) && local14.anInt757 < 0) {
				this.aClass7_Sub10ArrayArray2[local14.anInt759][local14.anInt767] = null;
				local14.anInt757 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(III)V")
	public synchronized void method4493() {
		this.method4481();
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)V")
	private void method4494(@OriginalArg(1) int arg0) {
		if ((this.anIntArray503[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class7_Sub10 local18 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2010(); local18 != null; local18 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2000()) {
			if (local18.anInt759 == arg0 && this.aClass7_Sub10ArrayArray2[arg0][local18.anInt767] == null && local18.anInt757 < 0) {
				local18.anInt757 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()Lclient!bs;")
	@Override
	public synchronized Class7_Sub8 method4866() {
		return this.aClass7_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZ)V")
	private synchronized void method4495(@OriginalArg(0) boolean arg0) {
		this.aClass226_1.method4593();
		this.aClass7_Sub36_2 = null;
		this.method4502(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!pu;ZZ)V")
	public synchronized void method4496(@OriginalArg(0) Class7_Sub36 arg0, @OriginalArg(2) boolean arg1) {
		this.method4511(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(II)V")
	private void method4497(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4484(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method4484(local18, local24, 64);
			} else {
				this.method4514(local24, local18, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4510(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray502[local18] = (local30 << 14) + (this.anIntArray502[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray502[local18] = (local30 << 7) + (this.anIntArray502[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray507[local18] = (this.anIntArray507[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray507[local18] = local30 + (this.anIntArray507[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray513[local18] = (local30 << 7) + (this.anIntArray513[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray513[local18] = (this.anIntArray513[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray501[local18] = (this.anIntArray501[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray501[local18] = local30 + (this.anIntArray501[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray510[local18] = (this.anIntArray510[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray510[local18] = local30 + (this.anIntArray510[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray514[local18] = (this.anIntArray514[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray514[local18] = (this.anIntArray514[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray503[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray503[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method4494(local18);
					this.anIntArray503[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray503[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray512[local18] = (this.anIntArray512[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray512[local18] = (this.anIntArray512[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray512[local18] = (local30 << 7) + (this.anIntArray512[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray512[local18] = (this.anIntArray512[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method4512(local18);
			}
			if (local24 == 121) {
				this.method4503(local18);
			}
			if (local24 == 123) {
				this.method4492(local18);
			}
			@Pc(490) int local490;
			if (local24 == 6) {
				local490 = this.anIntArray512[local18];
				if (local490 == 16384) {
					this.anIntArray504[local18] = (local30 << 7) + (this.anIntArray504[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local490 = this.anIntArray512[local18];
				if (local490 == 16384) {
					this.anIntArray504[local18] = (this.anIntArray504[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray509[local18] = (this.anIntArray509[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray509[local18] = (this.anIntArray509[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method4513(local18);
					this.anIntArray503[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray503[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method4480((local30 << 7) + (this.anIntArray506[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method4480(local30 + (this.anIntArray506[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4491(local24 + this.anIntArray502[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4490(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4489(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4502(true);
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILclient!cj;)I")
	private int method4498(@OriginalArg(1) Class7_Sub10 arg0) {
		if (this.anIntArray515[arg0.anInt759] == 0) {
			return 0;
		}
		@Pc(14) Class106 local14 = arg0.aClass106_1;
		@Pc(30) int local30 = this.anIntArray501[arg0.anInt759] * this.anIntArray514[arg0.anInt759] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt763 * local38 + 16384 >> 15;
		@Pc(61) int local61 = local47 * this.anInt5569 + 128 >> 8;
		local30 = this.anIntArray515[arg0.anInt759] * local61 + 128 >> 8;
		if (local14.anInt2916 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt764 * 1.953125E-5D * (double) local14.anInt2916) + 0.5D);
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(126) int local126;
		@Pc(138) int local138;
		if (local14.aByteArray44 != null) {
			local100 = arg0.anInt771;
			local108 = local14.aByteArray44[arg0.anInt762 + 1];
			if (arg0.anInt762 < local14.aByteArray44.length - 2) {
				local126 = (local14.aByteArray44[arg0.anInt762] & 0xFF) << 8;
				local138 = (local14.aByteArray44[arg0.anInt762 + 2] & 0xFF) << 8;
				local108 += (local14.aByteArray44[arg0.anInt762 + 3] - local108) * (local100 - local126) / (local138 - local126);
			}
			local30 = local30 * local108 + 32 >> 6;
		}
		if (arg0.anInt757 > 0 && local14.aByteArray45 != null) {
			local100 = arg0.anInt757;
			local108 = local14.aByteArray45[arg0.anInt774 + 1];
			if (local14.aByteArray45.length - 2 > arg0.anInt774) {
				local126 = (local14.aByteArray45[arg0.anInt774] & 0xFF) << 8;
				local138 = (local14.aByteArray45[arg0.anInt774 + 2] & 0xFF) << 8;
				local108 += (local100 - local126) * (local14.aByteArray45[arg0.anInt774 + 3] - local108) / (local138 - local126);
			}
			local30 = local108 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)Z")
	public synchronized boolean method4500() {
		return this.aClass226_1.method4596();
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
	public synchronized void method4501() {
		this.method4495(true);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V")
	private void method4502(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4512(-1);
		} else {
			this.method4492(-1);
		}
		this.method4503(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray508[local31] = this.anIntArray505[local31];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray502[local49] = this.anIntArray505[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(II)V")
	private void method4503(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4503(local12);
			}
			return;
		}
		this.anIntArray501[arg0] = 12800;
		this.anIntArray510[arg0] = 8192;
		this.anIntArray514[arg0] = 16383;
		this.anIntArray511[arg0] = 8192;
		this.anIntArray507[arg0] = 0;
		this.anIntArray513[arg0] = 8192;
		this.method4494(arg0);
		this.method4513(arg0);
		this.anIntArray503[arg0] = 0;
		this.anIntArray512[arg0] = 32767;
		this.anIntArray504[arg0] = 256;
		this.anIntArray509[arg0] = 0;
		this.method4480(8192, arg0);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	private void method4504() {
		@Pc(8) int local8 = this.anInt5601;
		@Pc(11) int local11 = this.anInt5602;
		@Pc(14) long local14 = this.aLong175;
		if (this.aClass7_Sub36_2 != null && this.anInt5603 == local11) {
			this.method4511(this.aBoolean376, this.aBoolean375, this.aClass7_Sub36_2);
			this.method4504();
			return;
		}
		while (this.anInt5602 == local11) {
			while (this.aClass226_1.anIntArray528[local8] == local11) {
				this.aClass226_1.method4605(local8);
				@Pc(47) int local47 = this.aClass226_1.method4595(local8);
				if (local47 == 1) {
					this.aClass226_1.method4602();
					this.aClass226_1.method4603(local8);
					if (this.aClass226_1.method4597()) {
						if (this.aClass7_Sub36_2 != null) {
							this.method4496(this.aClass7_Sub36_2, this.aBoolean375);
							this.method4504();
							return;
						}
						if (!this.aBoolean375 || local11 == 0) {
							this.method4502(true);
							this.aClass226_1.method4593();
							return;
						}
						this.aClass226_1.method4594(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4497(local47);
				}
				this.aClass226_1.method4601(local8);
				this.aClass226_1.method4603(local8);
			}
			local8 = this.aClass226_1.method4600();
			local11 = this.aClass226_1.anIntArray528[local8];
			local14 = this.aClass226_1.method4606(local11);
		}
		this.anInt5602 = local11;
		this.anInt5601 = local8;
		this.aLong175 = local14;
		if (this.aClass7_Sub36_2 != null && local11 > this.anInt5603) {
			this.anInt5602 = this.anInt5603;
			this.anInt5601 = -1;
			this.aLong175 = this.aClass226_1.method4606(this.anInt5602);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[ILclient!cj;)Z")
	public boolean method4505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class7_Sub10 arg3) {
		arg3.anInt777 = Static208.anInt3680 / 100;
		if (arg3.anInt757 >= 0 && (arg3.aClass7_Sub8_Sub4_1 == null || arg3.aClass7_Sub8_Sub4_1.method4901())) {
			arg3.method624();
			arg3.method5802();
			if (arg3.anInt772 > 0 && arg3 == this.aClass7_Sub10ArrayArray1[arg3.anInt759][arg3.anInt772]) {
				this.aClass7_Sub10ArrayArray1[arg3.anInt759][arg3.anInt772] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg3.anInt765;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray513[arg3.anInt759] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg3.anInt765 = local61;
		}
		arg3.aClass7_Sub8_Sub4_1.method4909(this.method4482(arg3));
		@Pc(101) Class106 local101 = arg3.aClass106_1;
		arg3.anInt761++;
		arg3.anInt768 += local101.anInt2917;
		@Pc(116) boolean local116 = false;
		@Pc(135) double local135 = (double) ((arg3.anInt767 - 60 << 8) + (arg3.anInt756 * arg3.anInt765 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt2916 > 0) {
			if (local101.anInt2914 <= 0) {
				arg3.anInt764 += 128;
			} else {
				arg3.anInt764 += (int) (Math.pow(2.0D, local135 * (double) local101.anInt2914) * 128.0D + 0.5D);
			}
			if (local101.anInt2916 * arg3.anInt764 >= 819200) {
				local116 = true;
			}
		}
		if (local101.aByteArray44 != null) {
			if (local101.anInt2918 <= 0) {
				arg3.anInt771 += 128;
			} else {
				arg3.anInt771 += (int) (Math.pow(2.0D, local135 * (double) local101.anInt2918) * 128.0D + 0.5D);
			}
			while (arg3.anInt762 < local101.aByteArray44.length - 2 && arg3.anInt771 > (local101.aByteArray44[arg3.anInt762 + 2] & 0xFF) << 8) {
				arg3.anInt762 += 2;
			}
			if (arg3.anInt762 == local101.aByteArray44.length - 2 && local101.aByteArray44[arg3.anInt762 + 1] == 0) {
				local116 = true;
			}
		}
		if (arg3.anInt757 >= 0 && local101.aByteArray45 != null && (this.anIntArray503[arg3.anInt759] & 0x1) == 0 && (arg3.anInt772 < 0 || this.aClass7_Sub10ArrayArray1[arg3.anInt759][arg3.anInt772] != arg3)) {
			if (local101.anInt2921 > 0) {
				arg3.anInt757 += (int) (Math.pow(2.0D, (double) local101.anInt2921 * local135) * 128.0D + 0.5D);
			} else {
				arg3.anInt757 += 128;
			}
			while (arg3.anInt774 < local101.aByteArray45.length - 2 && (local101.aByteArray45[arg3.anInt774 + 2] & 0xFF) << 8 < arg3.anInt757) {
				arg3.anInt774 += 2;
			}
			if (arg3.anInt774 == local101.aByteArray45.length - 2) {
				local116 = true;
			}
		}
		if (!local116) {
			arg3.aClass7_Sub8_Sub4_1.method4874(arg3.anInt777, this.method4498(arg3), this.method4488(arg3));
			return false;
		}
		arg3.aClass7_Sub8_Sub4_1.method4885(arg3.anInt777);
		if (arg2 == null) {
			arg3.aClass7_Sub8_Sub4_1.method4870(arg0);
		} else {
			arg3.aClass7_Sub8_Sub4_1.method4871(arg2, arg1, arg0);
		}
		if (arg3.aClass7_Sub8_Sub4_1.method4912()) {
			this.aClass7_Sub8_Sub2_1.aClass7_Sub8_Sub1_1.method2432(arg3.aClass7_Sub8_Sub4_1);
		}
		arg3.method624();
		if (arg3.anInt757 >= 0) {
			arg3.method5802();
			if (arg3.anInt772 > 0 && arg3 == this.aClass7_Sub10ArrayArray1[arg3.anInt759][arg3.anInt772]) {
				this.aClass7_Sub10ArrayArray1[arg3.anInt759][arg3.anInt772] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZBLclient!cj;)V")
	public void method4506(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class7_Sub10 arg1) {
		@Pc(8) int local8 = arg1.aClass7_Sub31_Sub1_1.aByteArray56.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass7_Sub31_Sub1_1.aBoolean253) {
			@Pc(46) int local46 = local8 + local8 - arg1.aClass7_Sub31_Sub1_1.anInt4157;
			local8 <<= 0x8;
			local35 = (int) ((long) this.anIntArray509[arg1.anInt759] * (long) local46 >> 6);
			if (local8 <= local35) {
				arg1.aClass7_Sub8_Sub4_1.method4876();
				local35 = local8 + local8 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) local8 * (long) this.anIntArray509[arg1.anInt759] >> 6);
		}
		arg1.aClass7_Sub8_Sub4_1.method4891(local35);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!cj;B)Z")
	public boolean method4507(@OriginalArg(0) Class7_Sub10 arg0) {
		if (arg0.aClass7_Sub8_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt757 >= 0) {
			arg0.method5802();
			if (arg0.anInt772 > 0 && this.aClass7_Sub10ArrayArray1[arg0.anInt759][arg0.anInt772] == arg0) {
				this.aClass7_Sub10ArrayArray1[arg0.anInt759][arg0.anInt772] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V")
	public synchronized void method4508() {
		for (@Pc(7) Class7_Sub1 local7 = (Class7_Sub1) this.aClass164_35.method3514(); local7 != null; local7 = (Class7_Sub1) this.aClass164_35.method3519()) {
			local7.method5802();
		}
	}

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "(B)V")
	public synchronized void method4509() {
		for (@Pc(15) Class7_Sub1 local15 = (Class7_Sub1) this.aClass164_35.method3514(); local15 != null; local15 = (Class7_Sub1) this.aClass164_35.method3519()) {
			local15.method40();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZI)V")
	private void method4510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZILclient!pu;)V")
	private synchronized void method4511(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class7_Sub36 arg2) {
		this.method4495(arg0);
		this.aClass226_1.method4604(arg2.aByteArray79);
		this.aBoolean375 = arg1;
		this.aLong174 = 0L;
		@Pc(24) int local24 = this.aClass226_1.method4599();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass226_1.method4605(local26);
			this.aClass226_1.method4601(local26);
			this.aClass226_1.method4603(local26);
		}
		this.anInt5601 = this.aClass226_1.method4600();
		this.anInt5602 = this.aClass226_1.anIntArray528[this.anInt5601];
		this.aLong175 = this.aClass226_1.method4606(this.anInt5602);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4871(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass226_1.method4596()) {
			@Pc(14) int local14 = this.aClass226_1.anInt5708 * this.anInt5576 / Static208.anInt3680;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong174;
				if (this.aLong175 - local23 >= 0L) {
					this.aLong174 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong175 + (long) local14 - this.aLong174 - 1L) / (long) local14);
				this.aLong174 += (long) local14 * (long) local52;
				this.aClass7_Sub8_Sub2_1.method4871(arg0, arg1, local52);
				this.method4504();
				arg1 += local52;
				arg2 -= local52;
			} while (this.aClass226_1.method4596());
		}
		this.aClass7_Sub8_Sub2_1.method4871(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(II)V")
	private void method4512(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class7_Sub10 local14 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2010(); local14 != null; local14 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2000()) {
			if (arg0 < 0 || arg0 == local14.anInt759) {
				if (local14.aClass7_Sub8_Sub4_1 != null) {
					local14.aClass7_Sub8_Sub4_1.method4885(Static208.anInt3680 / 100);
					if (local14.aClass7_Sub8_Sub4_1.method4912()) {
						this.aClass7_Sub8_Sub2_1.aClass7_Sub8_Sub1_1.method2432(local14.aClass7_Sub8_Sub4_1);
					}
					local14.method624();
				}
				if (local14.anInt757 < 0) {
					this.aClass7_Sub10ArrayArray2[local14.anInt759][local14.anInt767] = null;
				}
				local14.method5802();
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V")
	private void method4513(@OriginalArg(0) int arg0) {
		if ((this.anIntArray503[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class7_Sub10 local19 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2010(); local19 != null; local19 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2000()) {
			if (local19.anInt759 == arg0) {
				local19.anInt760 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4869() {
		return 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)V")
	private void method4514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4484(arg1, arg0, 64);
		if ((this.anIntArray503[arg1] & 0x2) != 0) {
			for (@Pc(25) Class7_Sub10 local25 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2002(); local25 != null; local25 = (Class7_Sub10) this.aClass7_Sub8_Sub2_1.aClass85_19.method2012()) {
				if (local25.anInt759 == arg1 && local25.anInt757 < 0) {
					this.aClass7_Sub10ArrayArray2[arg1][local25.anInt767] = null;
					this.aClass7_Sub10ArrayArray2[arg1][arg0] = local25;
					@Pc(60) int local60 = (local25.anInt756 * local25.anInt765 >> 12) + local25.anInt770;
					local25.anInt770 += arg0 - local25.anInt767 << 8;
					local25.anInt767 = arg0;
					local25.anInt756 = local60 - local25.anInt770;
					local25.anInt765 = 4096;
					return;
				}
			}
		}
		@Pc(106) Class7_Sub1 local106 = (Class7_Sub1) this.aClass164_35.method3512((long) this.anIntArray508[arg1]);
		if (local106 == null) {
			return;
		}
		@Pc(114) Class7_Sub31_Sub1 local114 = local106.aClass7_Sub31_Sub1Array1[arg0];
		if (local114 == null) {
			return;
		}
		@Pc(121) Class7_Sub10 local121 = new Class7_Sub10();
		local121.aClass7_Sub31_Sub1_1 = local114;
		local121.aClass7_Sub1_1 = local106;
		local121.anInt759 = arg1;
		local121.aClass106_1 = local106.aClass106Array1[arg0];
		local121.anInt772 = local106.aByteArray4[arg0];
		local121.anInt767 = arg0;
		local121.anInt763 = arg2 * arg2 * local106.anInt45 * local106.aByteArray3[arg0] + 1024 >> 11;
		local121.anInt773 = local106.aByteArray5[arg0] & 0xFF;
		local121.anInt770 = (arg0 << 8) - (local106.aShortArray1[arg0] & 0x7FFF);
		local121.anInt764 = 0;
		local121.anInt774 = 0;
		local121.anInt757 = -1;
		local121.anInt771 = 0;
		local121.anInt762 = 0;
		if (this.anIntArray509[arg1] == 0) {
			local121.aClass7_Sub8_Sub4_1 = Static467.method4882(local114, this.method4482(local121), this.method4498(local121), this.method4488(local121));
		} else {
			local121.aClass7_Sub8_Sub4_1 = Static467.method4882(local114, this.method4482(local121), 0, this.method4488(local121));
			this.method4506(local106.aShortArray1[arg0] < 0, local121);
		}
		if (local106.aShortArray1[arg0] < 0) {
			local121.aClass7_Sub8_Sub4_1.method4883(-1);
		}
		if (local121.anInt772 >= 0) {
			@Pc(278) Class7_Sub10 local278 = this.aClass7_Sub10ArrayArray1[arg1][local121.anInt772];
			if (local278 != null && local278.anInt757 < 0) {
				this.aClass7_Sub10ArrayArray2[arg1][local278.anInt767] = null;
				local278.anInt757 = 0;
			}
			this.aClass7_Sub10ArrayArray1[arg1][local121.anInt772] = local121;
		}
		this.aClass7_Sub8_Sub2_1.aClass85_19.method2011(local121);
		this.aClass7_Sub10ArrayArray2[arg1][arg0] = local121;
	}
}
