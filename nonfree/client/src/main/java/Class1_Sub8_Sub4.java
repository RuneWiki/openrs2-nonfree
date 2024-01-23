import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class1_Sub8_Sub4 extends Class1_Sub8 {

	@OriginalMember(owner = "client!un", name = "Kb", descriptor = "J")
	private long aLong176;

	@OriginalMember(owner = "client!un", name = "Lb", descriptor = "I")
	private int anInt5529;

	@OriginalMember(owner = "client!un", name = "Mb", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!un", name = "Ob", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!un", name = "Pb", descriptor = "I")
	private int anInt5530;

	@OriginalMember(owner = "client!un", name = "Qb", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!un", name = "Rb", descriptor = "I")
	private int anInt5531;

	@OriginalMember(owner = "client!un", name = "Sb", descriptor = "Lclient!wk;")
	private Class1_Sub33 aClass1_Sub33_2;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "[I")
	private int[] anIntArray637 = new int[16];

	@OriginalMember(owner = "client!un", name = "E", descriptor = "[I")
	private int[] anIntArray640 = new int[16];

	@OriginalMember(owner = "client!un", name = "F", descriptor = "[I")
	private int[] anIntArray641 = new int[16];

	@OriginalMember(owner = "client!un", name = "M", descriptor = "[I")
	private int[] anIntArray642 = new int[16];

	@OriginalMember(owner = "client!un", name = "x", descriptor = "[I")
	private int[] anIntArray638 = new int[16];

	@OriginalMember(owner = "client!un", name = "Y", descriptor = "[I")
	private int[] anIntArray646 = new int[16];

	@OriginalMember(owner = "client!un", name = "ab", descriptor = "[I")
	private int[] anIntArray647 = new int[16];

	@OriginalMember(owner = "client!un", name = "pb", descriptor = "[[Lclient!te;")
	private Class1_Sub29[][] aClass1_Sub29ArrayArray2 = new Class1_Sub29[16][128];

	@OriginalMember(owner = "client!un", name = "gb", descriptor = "[I")
	private int[] anIntArray649 = new int[16];

	@OriginalMember(owner = "client!un", name = "W", descriptor = "[I")
	private int[] anIntArray645 = new int[16];

	@OriginalMember(owner = "client!un", name = "O", descriptor = "[I")
	public int[] anIntArray643 = new int[16];

	@OriginalMember(owner = "client!un", name = "wb", descriptor = "[I")
	private int[] anIntArray651 = new int[16];

	@OriginalMember(owner = "client!un", name = "Ab", descriptor = "[I")
	public int[] anIntArray652 = new int[16];

	@OriginalMember(owner = "client!un", name = "U", descriptor = "[[Lclient!te;")
	private Class1_Sub29[][] aClass1_Sub29ArrayArray1 = new Class1_Sub29[16][128];

	@OriginalMember(owner = "client!un", name = "eb", descriptor = "[I")
	private int[] anIntArray648 = new int[16];

	@OriginalMember(owner = "client!un", name = "L", descriptor = "I")
	private int anInt5496 = 1000000;

	@OriginalMember(owner = "client!un", name = "Cb", descriptor = "[I")
	public int[] anIntArray653 = new int[16];

	@OriginalMember(owner = "client!un", name = "T", descriptor = "[I")
	private int[] anIntArray644 = new int[16];

	@OriginalMember(owner = "client!un", name = "Z", descriptor = "I")
	private int anInt5504 = 256;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "[I")
	private int[] anIntArray639 = new int[16];

	@OriginalMember(owner = "client!un", name = "Fb", descriptor = "Lclient!qh;")
	private Class139 aClass139_1 = new Class139();

	@OriginalMember(owner = "client!un", name = "Nb", descriptor = "Lclient!ff;")
	private Class1_Sub8_Sub2 aClass1_Sub8_Sub2_1 = new Class1_Sub8_Sub2(this);

	@OriginalMember(owner = "client!un", name = "hb", descriptor = "Lclient!cd;")
	private Class22 aClass22_20 = new Class22(128);

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub4() {
		this.method4216();
		this.method4234(true);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
	private void method4210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(III)V")
	private void method4211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray648[arg1] = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIB)V")
	private void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray651[arg1]) {
			this.anIntArray651[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub29ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4207() {
		return 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)V")
	private void method4213(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub29 local8 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1636(); local8 != null; local8 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1631()) {
			if ((arg0 < 0 || local8.anInt5150 == arg0) && local8.anInt5165 < 0) {
				this.aClass1_Sub29ArrayArray2[local8.anInt5150][local8.anInt5151] = null;
				local8.anInt5165 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	private void method4214(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(17) int local17;
		@Pc(29) int local29;
		@Pc(23) int local23;
		if (local9 == 128) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 16 & 0x7F;
			local29 = arg0 >> 8 & 0x7F;
			this.method4229(local17, local23, local29);
		} else if (local9 == 144) {
			local17 = arg0 & 0xF;
			local23 = arg0 >> 16 & 0x7F;
			local29 = arg0 >> 8 & 0x7F;
			if (local23 > 0) {
				this.method4217(local17, local23, local29);
			} else {
				this.method4229(local17, 64, local29);
			}
		} else if (local9 == 160) {
			local17 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local23 = arg0 >> 16 & 0x7F;
			this.method4239(local17, local29, local23);
		} else if (local9 == 176) {
			local17 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local23 = arg0 >> 16 & 0x7F;
			if (local29 == 0) {
				this.anIntArray649[local17] = (this.anIntArray649[local17] & 0xFFE03FFF) + (local23 << 14);
			}
			if (local29 == 32) {
				this.anIntArray649[local17] = (local23 << 7) + (this.anIntArray649[local17] & 0xFFFFC07F);
			}
			if (local29 == 1) {
				this.anIntArray646[local17] = (local23 << 7) + (this.anIntArray646[local17] & 0xFFFFC07F);
			}
			if (local29 == 33) {
				this.anIntArray646[local17] = (this.anIntArray646[local17] & 0xFFFFFF80) + local23;
			}
			if (local29 == 5) {
				this.anIntArray637[local17] = (this.anIntArray637[local17] & 0xFFFFC07F) + (local23 << 7);
			}
			if (local29 == 37) {
				this.anIntArray637[local17] = local23 + (this.anIntArray637[local17] & 0xFFFFFF80);
			}
			if (local29 == 7) {
				this.anIntArray642[local17] = (this.anIntArray642[local17] & 0xFFFFC07F) + (local23 << 7);
			}
			if (local29 == 39) {
				this.anIntArray642[local17] = (this.anIntArray642[local17] & 0xFFFFFF80) + local23;
			}
			if (local29 == 10) {
				this.anIntArray641[local17] = (local23 << 7) + (this.anIntArray641[local17] & 0xFFFFC07F);
			}
			if (local29 == 42) {
				this.anIntArray641[local17] = (this.anIntArray641[local17] & 0xFFFFFF80) + local23;
			}
			if (local29 == 11) {
				this.anIntArray645[local17] = (this.anIntArray645[local17] & 0xFFFFC07F) + (local23 << 7);
			}
			if (local29 == 43) {
				this.anIntArray645[local17] = local23 + (this.anIntArray645[local17] & 0xFFFFFF80);
			}
			if (local29 == 64) {
				if (local23 < 64) {
					this.anIntArray653[local17] &= 0xFFFFFFFE;
				} else {
					this.anIntArray653[local17] |= 0x1;
				}
			}
			if (local29 == 65) {
				if (local23 < 64) {
					this.method4224(local17);
					this.anIntArray653[local17] &= 0xFFFFFFFD;
				} else {
					this.anIntArray653[local17] |= 0x2;
				}
			}
			if (local29 == 99) {
				this.anIntArray647[local17] = (local23 << 7) + (this.anIntArray647[local17] & 0x7F);
			}
			if (local29 == 98) {
				this.anIntArray647[local17] = (this.anIntArray647[local17] & 0x3F80) + local23;
			}
			if (local29 == 101) {
				this.anIntArray647[local17] = (this.anIntArray647[local17] & 0x7F) + (local23 << 7) + 16384;
			}
			if (local29 == 100) {
				this.anIntArray647[local17] = (this.anIntArray647[local17] & 0x3F80) + local23 + 16384;
			}
			if (local29 == 120) {
				this.method4226(local17);
			}
			if (local29 == 121) {
				this.method4244(local17);
			}
			if (local29 == 123) {
				this.method4213(local17);
			}
			@Pc(511) int local511;
			if (local29 == 6) {
				local511 = this.anIntArray647[local17];
				if (local511 == 16384) {
					this.anIntArray639[local17] = (this.anIntArray639[local17] & 0xFFFFC07F) + (local23 << 7);
				}
			}
			if (local29 == 38) {
				local511 = this.anIntArray647[local17];
				if (local511 == 16384) {
					this.anIntArray639[local17] = local23 + (this.anIntArray639[local17] & 0xFFFFFF80);
				}
			}
			if (local29 == 16) {
				this.anIntArray652[local17] = (local23 << 7) + (this.anIntArray652[local17] & 0xFFFFC07F);
			}
			if (local29 == 48) {
				this.anIntArray652[local17] = local23 + (this.anIntArray652[local17] & 0xFFFFFF80);
			}
			if (local29 == 81) {
				if (local23 >= 64) {
					this.anIntArray653[local17] |= 0x4;
				} else {
					this.method4221(local17);
					this.anIntArray653[local17] &= 0xFFFFFFFB;
				}
			}
			if (local29 == 17) {
				this.method4219(local17, (local23 << 7) + (this.anIntArray640[local17] & 0xFFFFC07F));
			}
			if (local29 == 49) {
				this.method4219(local17, local23 + (this.anIntArray640[local17] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local17 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method4212(local29 + this.anIntArray649[local17], local17);
		} else if (local9 == 208) {
			local17 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method4210(local17, local29);
		} else if (local9 == 224) {
			local29 = arg0 & 0xF;
			local23 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method4211(local23, local29);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4234(true);
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IIB)V")
	private synchronized void method4216() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray638[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)V")
	private void method4217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4229(arg0, 64, arg2);
		if ((this.anIntArray653[arg0] & 0x2) != 0) {
			for (@Pc(26) Class1_Sub29 local26 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1632(); local26 != null; local26 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1635()) {
				if (local26.anInt5150 == arg0 && local26.anInt5165 < 0) {
					this.aClass1_Sub29ArrayArray2[arg0][local26.anInt5151] = null;
					this.aClass1_Sub29ArrayArray2[arg0][arg2] = local26;
					@Pc(66) int local66 = local26.anInt5162 + (local26.anInt5148 * local26.anInt5163 >> 12);
					local26.anInt5162 += arg2 - local26.anInt5151 << 8;
					local26.anInt5163 = 4096;
					local26.anInt5148 = local66 - local26.anInt5162;
					local26.anInt5151 = arg2;
					return;
				}
			}
		}
		@Pc(112) Class1_Sub7 local112 = (Class1_Sub7) this.aClass22_20.method633((long) this.anIntArray651[arg0]);
		if (local112 == null) {
			return;
		}
		@Pc(121) Class1_Sub22_Sub1 local121 = local112.aClass1_Sub22_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class1_Sub29 local128 = new Class1_Sub29();
		local128.anInt5150 = arg0;
		local128.aClass1_Sub7_1 = local112;
		local128.aClass1_Sub22_Sub1_1 = local121;
		local128.aClass33_1 = local112.aClass33Array1[arg2];
		local128.anInt5158 = local112.aByteArray19[arg2];
		local128.anInt5151 = arg2;
		local128.anInt5154 = local112.aByteArray20[arg2] * local112.anInt1424 * arg1 * arg1 + 1024 >> 11;
		local128.anInt5161 = local112.aByteArray18[arg2] & 0xFF;
		local128.anInt5162 = (arg2 << 8) - (local112.aShortArray23[arg2] & 0x7FFF);
		local128.anInt5156 = 0;
		local128.anInt5165 = -1;
		local128.anInt5160 = 0;
		local128.anInt5145 = 0;
		local128.anInt5149 = 0;
		if (this.anIntArray652[arg0] == 0) {
			local128.aClass1_Sub8_Sub1_3 = Static305.method1236(local121, this.method4227(local128), this.method4231(local128), this.method4236(local128));
		} else {
			local128.aClass1_Sub8_Sub1_3 = Static305.method1236(local121, this.method4227(local128), 0, this.method4236(local128));
			this.method4243(local128, local112.aShortArray23[arg2] < 0);
		}
		if (local112.aShortArray23[arg2] < 0) {
			local128.aClass1_Sub8_Sub1_3.method1252(-1);
		}
		if (local128.anInt5158 >= 0) {
			@Pc(278) Class1_Sub29 local278 = this.aClass1_Sub29ArrayArray1[arg0][local128.anInt5158];
			if (local278 != null && local278.anInt5165 < 0) {
				this.aClass1_Sub29ArrayArray2[arg0][local278.anInt5151] = null;
				local278.anInt5165 = 0;
			}
			this.aClass1_Sub29ArrayArray1[arg0][local128.anInt5158] = local128;
		}
		this.aClass1_Sub8_Sub2_1.aClass69_7.method1628(local128);
		this.aClass1_Sub29ArrayArray2[arg0][arg2] = local128;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V")
	public synchronized void method4218(@OriginalArg(1) int arg0) {
		this.anInt5504 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(III)V")
	private void method4219(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray640[arg0] = arg1;
		this.anIntArray643[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)V")
	public synchronized void method4220() {
		for (@Pc(11) Class1_Sub7 local11 = (Class1_Sub7) this.aClass22_20.method640(); local11 != null; local11 = (Class1_Sub7) this.aClass22_20.method637()) {
			local11.method1181();
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	private void method4221(@OriginalArg(0) int arg0) {
		if ((this.anIntArray653[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class1_Sub29 local27 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1636(); local27 != null; local27 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1631()) {
			if (arg0 == local27.anInt5150) {
				local27.anInt5147 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZILclient!wk;)V")
	public synchronized void method4222(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		this.method4242(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4204(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass139_1.method3405()) {
			@Pc(19) int local19 = this.aClass139_1.anInt4250 * this.anInt5496 / Static234.anInt4892;
			do {
				@Pc(28) long local28 = (long) local19 * (long) arg2 + this.aLong176;
				if (this.aLong177 - local28 >= 0L) {
					this.aLong176 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local19 + this.aLong177 - this.aLong176 - 1L) / (long) local19);
				arg2 -= local58;
				this.aLong176 += (long) local19 * (long) local58;
				this.aClass1_Sub8_Sub2_1.method4204(arg0, arg1, local58);
				this.method4240();
				arg1 += local58;
			} while (this.aClass139_1.method3405());
		}
		this.aClass1_Sub8_Sub2_1.method4204(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	public synchronized void method4223() {
		this.method4230(true);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V")
	private void method4224(@OriginalArg(0) int arg0) {
		if ((this.anIntArray653[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class1_Sub29 local30 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1636(); local30 != null; local30 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1631()) {
			if (arg0 == local30.anInt5150 && this.aClass1_Sub29ArrayArray2[arg0][local30.anInt5151] == null && local30.anInt5165 < 0) {
				local30.anInt5165 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(B)Z")
	public synchronized boolean method4225() {
		return this.aClass139_1.method3405();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)V")
	private void method4226(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub29 local16 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1636(); local16 != null; local16 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1631()) {
			if (arg0 < 0 || local16.anInt5150 == arg0) {
				if (local16.aClass1_Sub8_Sub1_3 != null) {
					local16.aClass1_Sub8_Sub1_3.method1257(Static234.anInt4892 / 100);
					if (local16.aClass1_Sub8_Sub1_3.method1222()) {
						this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub3_2.method2410(local16.aClass1_Sub8_Sub1_3);
					}
					local16.method3971();
				}
				if (local16.anInt5165 < 0) {
					this.aClass1_Sub29ArrayArray2[local16.anInt5150][local16.anInt5151] = null;
				}
				local16.method4534();
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()Lclient!sm;")
	@Override
	public synchronized Class1_Sub8 method4208() {
		return this.aClass1_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!te;I)I")
	private int method4227(@OriginalArg(0) Class1_Sub29 arg0) {
		@Pc(22) int local22 = (arg0.anInt5163 * arg0.anInt5148 >> 12) + arg0.anInt5162;
		@Pc(25) Class33 local25 = arg0.aClass33_1;
		local22 += this.anIntArray639[arg0.anInt5150] * (this.anIntArray648[arg0.anInt5150] - 8192) >> 12;
		@Pc(69) int local69;
		if (local25.anInt1069 > 0 && (local25.anInt1068 > 0 || this.anIntArray646[arg0.anInt5150] > 0)) {
			local69 = local25.anInt1068 << 2;
			@Pc(74) int local74 = local25.anInt1076 << 1;
			if (local74 > arg0.anInt5157) {
				local69 = local69 * arg0.anInt5157 / local74;
			}
			local69 += this.anIntArray646[arg0.anInt5150] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt5152 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local105 * (double) local69);
		}
		local69 = (int) ((double) (arg0.aClass1_Sub22_Sub1_1.anInt3755 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static234.anInt4892 + 0.5D);
		return local69 >= 1 ? local69 : 1;
	}

	@OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V")
	public synchronized void method4228() {
		for (@Pc(20) Class1_Sub7 local20 = (Class1_Sub7) this.aClass22_20.method640(); local20 != null; local20 = (Class1_Sub7) this.aClass22_20.method637()) {
			local20.method4534();
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()Lclient!sm;")
	@Override
	public synchronized Class1_Sub8 method4206() {
		return null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBI)V")
	private void method4229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub29 local12 = this.aClass1_Sub29ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub29ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray653[arg0] & 0x2) == 0) {
			local12.anInt5165 = 0;
			return;
		}
		for (@Pc(51) Class1_Sub29 local51 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1636(); local51 != null; local51 = (Class1_Sub29) this.aClass1_Sub8_Sub2_1.aClass69_7.method1631()) {
			if (local51.anInt5150 == local12.anInt5150 && local51.anInt5165 < 0 && local51 != local12) {
				local12.anInt5165 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)V")
	private synchronized void method4230(@OriginalArg(1) boolean arg0) {
		this.aClass139_1.method3399();
		this.aClass1_Sub33_2 = null;
		this.method4234(arg0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!te;)I")
	private int method4231(@OriginalArg(1) Class1_Sub29 arg0) {
		if (this.anIntArray638[arg0.anInt5150] == 0) {
			return 0;
		}
		@Pc(15) Class33 local15 = arg0.aClass33_1;
		@Pc(31) int local31 = this.anIntArray645[arg0.anInt5150] * this.anIntArray642[arg0.anInt5150] + 4096 >> 13;
		@Pc(39) int local39 = local31 * local31 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt5154 * local39 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt5504 * local56 + 128 >> 8;
		local31 = this.anIntArray638[arg0.anInt5150] * local65 + 128 >> 8;
		if (local15.anInt1073 > 0) {
			local31 = (int) (Math.pow(0.5D, (double) arg0.anInt5156 * 1.953125E-5D * (double) local15.anInt1073) * (double) local31 + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local15.aByteArray14 != null) {
			local105 = arg0.anInt5160;
			local113 = local15.aByteArray14[arg0.anInt5149 + 1];
			if (arg0.anInt5149 < local15.aByteArray14.length - 2) {
				local135 = (local15.aByteArray14[arg0.anInt5149] & 0xFF) << 8;
				local147 = (local15.aByteArray14[arg0.anInt5149 + 2] & 0xFF) << 8;
				local113 += (local15.aByteArray14[arg0.anInt5149 + 3] - local113) * (local105 - local135) / (local147 - local135);
			}
			local31 = local31 * local113 + 32 >> 6;
		}
		if (arg0.anInt5165 > 0 && local15.aByteArray13 != null) {
			local105 = arg0.anInt5165;
			local113 = local15.aByteArray13[arg0.anInt5145 + 1];
			if (local15.aByteArray13.length - 2 > arg0.anInt5145) {
				local135 = (local15.aByteArray13[arg0.anInt5145] & 0xFF) << 8;
				local147 = (local15.aByteArray13[arg0.anInt5145 + 2] & 0xFF) << 8;
				local113 += (local105 - local135) * (local15.aByteArray13[arg0.anInt5145 + 3] + -local113) / (local147 - local135);
			}
			local31 = local31 * local113 + 32 >> 6;
		}
		return local31;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIZ)V")
	private void method4232() {
		this.anIntArray644[9] = 128;
		this.anIntArray649[9] = 128;
		this.method4212(128, 9);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BZ)V")
	private void method4234(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method4226(-1);
		} else {
			this.method4213(-1);
		}
		this.method4244(-1);
		@Pc(23) int local23;
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray651[local23] = this.anIntArray644[local23];
		}
		for (local23 = 0; local23 < 16; local23++) {
			this.anIntArray649[local23] = this.anIntArray644[local23] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!te;I[III)Z")
	public boolean method4235(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt5146 = Static234.anInt4892 / 100;
		if (arg0.anInt5165 >= 0 && (arg0.aClass1_Sub8_Sub1_3 == null || arg0.aClass1_Sub8_Sub1_3.method1235())) {
			arg0.method3971();
			arg0.method4534();
			if (arg0.anInt5158 > 0 && arg0 == this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158]) {
				this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158] = null;
			}
			return true;
		}
		@Pc(57) int local57 = arg0.anInt5163;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray637[arg0.anInt5150] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg0.anInt5163 = local57;
		}
		@Pc(91) boolean local91 = false;
		arg0.aClass1_Sub8_Sub1_3.method1250(this.method4227(arg0));
		@Pc(117) double local117 = (double) ((arg0.anInt5151 - 60 << 8) + (arg0.anInt5163 * arg0.anInt5148 >> 12)) * 5.086263020833333E-6D;
		@Pc(120) Class33 local120 = arg0.aClass33_1;
		arg0.anInt5152 += local120.anInt1069;
		arg0.anInt5157++;
		if (local120.anInt1073 > 0) {
			if (local120.anInt1070 <= 0) {
				arg0.anInt5156 += 128;
			} else {
				arg0.anInt5156 += (int) (Math.pow(2.0D, local117 * (double) local120.anInt1070) * 128.0D + 0.5D);
			}
			if (local120.anInt1073 * arg0.anInt5156 >= 819200) {
				local91 = true;
			}
		}
		if (local120.aByteArray14 != null) {
			if (local120.anInt1072 > 0) {
				arg0.anInt5160 += (int) (Math.pow(2.0D, local117 * (double) local120.anInt1072) * 128.0D + 0.5D);
			} else {
				arg0.anInt5160 += 128;
			}
			while (arg0.anInt5149 < local120.aByteArray14.length - 2 && (local120.aByteArray14[arg0.anInt5149 + 2] & 0xFF) << 8 < arg0.anInt5160) {
				arg0.anInt5149 += 2;
			}
			if (arg0.anInt5149 == local120.aByteArray14.length - 2 && local120.aByteArray14[arg0.anInt5149 + 1] == 0) {
				local91 = true;
			}
		}
		if (arg0.anInt5165 >= 0 && local120.aByteArray13 != null && (this.anIntArray653[arg0.anInt5150] & 0x1) == 0 && (arg0.anInt5158 < 0 || arg0 != this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158])) {
			if (local120.anInt1074 <= 0) {
				arg0.anInt5165 += 128;
			} else {
				arg0.anInt5165 += (int) (Math.pow(2.0D, (double) local120.anInt1074 * local117) * 128.0D + 0.5D);
			}
			while (local120.aByteArray13.length - 2 > arg0.anInt5145 && arg0.anInt5165 > (local120.aByteArray13[arg0.anInt5145 + 2] & 0xFF) << 8) {
				arg0.anInt5145 += 2;
			}
			if (local120.aByteArray13.length - 2 == arg0.anInt5145) {
				local91 = true;
			}
		}
		if (!local91) {
			arg0.aClass1_Sub8_Sub1_3.method1254(arg0.anInt5146, this.method4231(arg0), this.method4236(arg0));
			return false;
		}
		arg0.aClass1_Sub8_Sub1_3.method1257(arg0.anInt5146);
		if (arg2 == null) {
			arg0.aClass1_Sub8_Sub1_3.method4209(arg1);
		} else {
			arg0.aClass1_Sub8_Sub1_3.method4204(arg2, arg3, arg1);
		}
		if (arg0.aClass1_Sub8_Sub1_3.method1222()) {
			this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub3_2.method2410(arg0.aClass1_Sub8_Sub1_3);
		}
		arg0.method3971();
		if (arg0.anInt5165 >= 0) {
			arg0.method4534();
			if (arg0.anInt5158 > 0 && arg0 == this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158]) {
				this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Lclient!te;I)I")
	private int method4236(@OriginalArg(0) Class1_Sub29 arg0) {
		@Pc(15) int local15 = this.anIntArray641[arg0.anInt5150];
		return local15 < 8192 ? arg0.anInt5161 * local15 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt5161 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ea;Lclient!wk;ILclient!ak;I)Z")
	public synchronized boolean method4237(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class1_Sub33 arg1, @OriginalArg(3) Class7 arg2) {
		arg1.method4541();
		@Pc(9) boolean local9 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(37) Class1_Sub17 local37 = (Class1_Sub17) arg1.aClass22_23.method640(); local37 != null; local37 = (Class1_Sub17) arg1.aClass22_23.method637()) {
			@Pc(43) int local43 = (int) local37.aLong202;
			@Pc(51) Class1_Sub7 local51 = (Class1_Sub7) this.aClass22_20.method633((long) local43);
			if (local51 == null) {
				local51 = Static250.method3899(local43, arg2);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass22_20.method643((long) local43, local51);
			}
			if (!local51.method1182(arg0, local37.aByteArray46, local24)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method4540();
		}
		return local9;
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(I)I")
	public int method4238() {
		return this.anInt5504;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIZ)V")
	private void method4239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	private void method4240() {
		@Pc(8) int local8 = this.anInt5530;
		@Pc(15) long local15 = this.aLong177;
		@Pc(18) int local18 = this.anInt5529;
		if (this.aClass1_Sub33_2 != null && local18 == this.anInt5531) {
			this.method4242(this.aClass1_Sub33_2, this.aBoolean421, this.aBoolean420);
			this.method4240();
			return;
		}
		while (this.anInt5529 == local18) {
			while (local18 == this.aClass139_1.anIntArray496[local8]) {
				this.aClass139_1.method3398(local8);
				@Pc(62) int local62 = this.aClass139_1.method3392(local8);
				if (local62 == 1) {
					this.aClass139_1.method3394();
					this.aClass139_1.method3393(local8);
					if (this.aClass139_1.method3395()) {
						if (this.aClass1_Sub33_2 != null) {
							this.method4222(this.aBoolean420, this.aClass1_Sub33_2);
							this.method4240();
							return;
						}
						if (!this.aBoolean420 || local18 == 0) {
							this.method4234(true);
							this.aClass139_1.method3399();
							return;
						}
						this.aClass139_1.method3406(local15);
					}
					break;
				}
				if ((local62 & 0x80) != 0) {
					this.method4214(local62);
				}
				this.aClass139_1.method3401(local8);
				this.aClass139_1.method3393(local8);
			}
			local8 = this.aClass139_1.method3396();
			local18 = this.aClass139_1.anIntArray496[local8];
			local15 = this.aClass139_1.method3391(local18);
		}
		this.anInt5529 = local18;
		this.anInt5530 = local8;
		this.aLong177 = local15;
		if (this.aClass1_Sub33_2 != null && this.anInt5531 < local18) {
			this.anInt5530 = -1;
			this.anInt5529 = this.anInt5531;
			this.aLong177 = this.aClass139_1.method3391(this.anInt5529);
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(III)V")
	public synchronized void method4241() {
		this.method4232();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!wk;ZZ)V")
	private synchronized void method4242(@OriginalArg(1) Class1_Sub33 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method4230(arg1);
		this.aClass139_1.method3402(arg0.aByteArray81);
		this.aLong176 = 0L;
		this.aBoolean420 = arg2;
		@Pc(24) int local24 = this.aClass139_1.method3404();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass139_1.method3398(local26);
			this.aClass139_1.method3401(local26);
			this.aClass139_1.method3393(local26);
		}
		this.anInt5530 = this.aClass139_1.method3396();
		this.anInt5529 = this.aClass139_1.anIntArray496[this.anInt5530];
		this.aLong177 = this.aClass139_1.method3391(this.anInt5529);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!te;ZZ)V")
	public void method4243(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass1_Sub22_Sub1_1.aByteArray70.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass1_Sub22_Sub1_1.aBoolean291) {
			@Pc(44) int local44 = local8 + local8 - arg0.aClass1_Sub22_Sub1_1.anInt3754;
			local33 = (int) ((long) local44 * (long) this.anIntArray652[arg0.anInt5150] >> 6);
			local8 <<= 0x8;
			if (local33 >= local8) {
				arg0.aClass1_Sub8_Sub1_3.method1228();
				local33 = local8 + local8 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray652[arg0.anInt5150] * (long) local8 >> 6);
		}
		arg0.aClass1_Sub8_Sub1_3.method1238(local33);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4209(@OriginalArg(0) int arg0) {
		if (this.aClass139_1.method3405()) {
			@Pc(15) int local15 = this.aClass139_1.anInt4250 * this.anInt5496 / Static234.anInt4892;
			do {
				@Pc(24) long local24 = (long) arg0 * (long) local15 + this.aLong176;
				if (this.aLong177 - local24 >= 0L) {
					this.aLong176 = local24;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong177 + (long) local15 - this.aLong176 - 1L) / (long) local15);
				arg0 -= local55;
				this.aLong176 += (long) local55 * (long) local15;
				this.aClass1_Sub8_Sub2_1.method4209(local55);
				this.method4240();
			} while (this.aClass139_1.method3405());
		}
		this.aClass1_Sub8_Sub2_1.method4209(arg0);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(IZ)V")
	private void method4244(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method4244(local9);
			}
			return;
		}
		this.anIntArray642[arg0] = 12800;
		this.anIntArray641[arg0] = 8192;
		this.anIntArray645[arg0] = 16383;
		this.anIntArray648[arg0] = 8192;
		this.anIntArray646[arg0] = 0;
		this.anIntArray637[arg0] = 8192;
		this.method4224(arg0);
		this.method4221(arg0);
		this.anIntArray653[arg0] = 0;
		this.anIntArray647[arg0] = 32767;
		this.anIntArray639[arg0] = 256;
		this.anIntArray652[arg0] = 0;
		this.method4219(arg0, 8192);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!te;B)Z")
	public boolean method4246(@OriginalArg(0) Class1_Sub29 arg0) {
		if (arg0.aClass1_Sub8_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt5165 >= 0) {
			arg0.method4534();
			if (arg0.anInt5158 > 0 && arg0 == this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158]) {
				this.aClass1_Sub29ArrayArray1[arg0.anInt5150][arg0.anInt5158] = null;
			}
		}
		return true;
	}
}
