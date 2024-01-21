import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	private int anInt720;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(22) Class1_Sub1_Sub3 local22 = new Class1_Sub1_Sub3(arg0.method678(arg1 + ".dat", null), (byte) 3);
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method678("index.dat", null), (byte) 3);
		local31.anInt777 = local22.method500();
		this.anInt719 = local31.method500();
		this.anInt720 = local31.method500();
		@Pc(46) int local46 = local31.method498();
		this.anIntArray212 = new int[local46];
		for (@Pc(52) int local52 = 0; local52 < local46 - 1; local52++) {
			this.anIntArray212[local52 + 1] = local31.method502();
		}
		for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
			local31.anInt777 += 2;
			local22.anInt777 += local31.method500() * local31.method500();
			local31.anInt777++;
		}
		this.anInt717 = local31.method498();
		this.anInt718 = local31.method498();
		this.anInt715 = local31.method500();
		this.anInt716 = local31.method500();
		@Pc(117) int local117 = local31.method498();
		@Pc(123) int local123 = this.anInt715 * this.anInt716;
		this.aByteArray7 = new byte[local123];
		@Pc(131) int local131;
		if (local117 == 0) {
			for (local131 = 0; local131 < local123; local131++) {
				this.aByteArray7[local131] = local22.method499();
			}
		} else if (local117 == 1) {
			for (local131 = 0; local131 < this.anInt715; local131++) {
				for (@Pc(153) int local153 = 0; local153 < this.anInt716; local153++) {
					this.aByteArray7[local131 + local153 * this.anInt715] = local22.method499();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method440() {
		try {
			this.anInt719 /= 2;
			this.anInt720 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt719 * this.anInt720];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt716; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt715; local28++) {
					local20[(local28 + this.anInt717 >> 1) + (local24 + this.anInt718 >> 1) * this.anInt719] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt715 = this.anInt719;
			this.anInt716 = this.anInt720;
			this.anInt717 = 0;
			this.anInt718 = 0;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("34606, " + true + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method441() {
		try {
			if (this.anInt715 != this.anInt719 || this.anInt716 != this.anInt720) {
				@Pc(19) byte[] local19 = new byte[this.anInt719 * this.anInt720];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt716; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt715; local27++) {
						local19[local27 + this.anInt717 + (local23 + this.anInt718) * this.anInt719] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt715 = this.anInt719;
				this.anInt716 = this.anInt720;
				this.anInt717 = 0;
				this.anInt718 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("32973, " + -86 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	public void method442() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt715 * this.anInt716];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt716; local12++) {
				for (@Pc(19) int local19 = this.anInt715 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt715];
				}
			}
			this.aByteArray7 = local8;
			this.anInt717 = this.anInt719 - this.anInt715 - this.anInt717;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("96552, " + 15 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
	public void method443() {
		try {
			@Pc(17) byte[] local17 = new byte[this.anInt715 * this.anInt716];
			@Pc(19) int local19 = 0;
			for (@Pc(24) int local24 = this.anInt716 - 1; local24 >= 0; local24--) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt715; local28++) {
					local17[local19++] = this.aByteArray7[local28 + local24 * this.anInt715];
				}
			}
			this.aByteArray7 = local17;
			this.anInt718 = this.anInt720 - this.anInt716 - this.anInt718;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("17906, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray212.length; local3++) {
				@Pc(14) int local14 = this.anIntArray212[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray212[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray212[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray212[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("65195, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt717;
			arg1 += this.anInt718;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt738;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt716;
			@Pc(23) int local23 = this.anInt715;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt738 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt740) {
				local36 = Class1_Sub1_Sub2.anInt740 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt740;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt741) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt742) {
				local36 = Class1_Sub1_Sub2.anInt742 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt742;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt743) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt743;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method446(this.aByteArray7, Class1_Sub1_Sub2.anIntArray213, local17, local29, this.anIntArray212, local20, local23, local27, local15);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("33718, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI[III[IIIII)V")
	private void method446(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(11) int local11 = -(arg6 >> 2);
			@Pc(16) int local16 = -(arg6 & 0x3);
			for (@Pc(19) int local19 = -arg5; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg0[arg2++];
					if (local30 == 0) {
						arg8++;
					} else {
						arg1[arg8++] = arg4[local30 & 0xFF];
					}
					local30 = arg0[arg2++];
					if (local30 == 0) {
						arg8++;
					} else {
						arg1[arg8++] = arg4[local30 & 0xFF];
					}
					local30 = arg0[arg2++];
					if (local30 == 0) {
						arg8++;
					} else {
						arg1[arg8++] = arg4[local30 & 0xFF];
					}
					local30 = arg0[arg2++];
					if (local30 == 0) {
						arg8++;
					} else {
						arg1[arg8++] = arg4[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg0[arg2++];
					if (local113 == 0) {
						arg8++;
					} else {
						arg1[arg8++] = arg4[local113 & 0xFF];
					}
				}
				arg8 += arg7;
				arg2 += arg3;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("43704, " + arg0 + ", " + -107 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
