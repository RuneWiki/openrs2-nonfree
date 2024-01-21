import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt717 = 626;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt718 = 68;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	public int[] anIntArray211;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class46 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method674(arg1 + ".dat", null), false);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method674("index.dat", null), false);
		local40.anInt778 = local31.method498();
		this.anInt723 = local40.method498();
		this.anInt724 = local40.method498();
		@Pc(55) int local55 = local40.method496();
		this.anIntArray211 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray211[local61 + 1] = local40.method500();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt778 += 2;
			local31.anInt778 += local40.method498() * local40.method498();
			local40.anInt778++;
		}
		this.anInt721 = local40.method496();
		this.anInt722 = local40.method496();
		this.anInt719 = local40.method498();
		this.anInt720 = local40.method498();
		@Pc(126) int local126 = local40.method496();
		@Pc(132) int local132 = this.anInt719 * this.anInt720;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method497();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt719; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt720; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt719] = local31.method497();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method438() {
		try {
			this.anInt723 /= 2;
			this.anInt724 /= 2;
			@Pc(25) byte[] local25 = new byte[this.anInt723 * this.anInt724];
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < this.anInt720; local29++) {
				for (@Pc(33) int local33 = 0; local33 < this.anInt719; local33++) {
					local25[(local33 + this.anInt721 >> 1) + (local29 + this.anInt722 >> 1) * this.anInt723] = this.aByteArray7[local27++];
				}
			}
			this.aByteArray7 = local25;
			this.anInt719 = this.anInt723;
			this.anInt720 = this.anInt724;
			this.anInt721 = 0;
			this.anInt722 = 0;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("23206, " + -172 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method439() {
		try {
			if (this.anInt719 != this.anInt723 || this.anInt720 != this.anInt724) {
				@Pc(19) byte[] local19 = new byte[this.anInt723 * this.anInt724];
				@Pc(27) int local27 = 0;
				for (@Pc(29) int local29 = 0; local29 < this.anInt720; local29++) {
					for (@Pc(33) int local33 = 0; local33 < this.anInt719; local33++) {
						local19[local33 + this.anInt721 + (local29 + this.anInt722) * this.anInt723] = this.aByteArray7[local27++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt719 = this.anInt723;
				this.anInt720 = this.anInt724;
				this.anInt721 = 0;
				this.anInt722 = 0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("89162, " + 3 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method440() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt719 * this.anInt720];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt720; local12++) {
				for (@Pc(19) int local19 = this.anInt719 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt719];
				}
			}
			this.aByteArray7 = local8;
			this.anInt721 = this.anInt723 - this.anInt719 - this.anInt721;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("21646, " + 626 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method441() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt719 * this.anInt720];
			@Pc(20) int local20 = 0;
			for (@Pc(25) int local25 = this.anInt720 - 1; local25 >= 0; local25--) {
				for (@Pc(29) int local29 = 0; local29 < this.anInt719; local29++) {
					local8[local20++] = this.aByteArray7[local29 + local25 * this.anInt719];
				}
			}
			this.aByteArray7 = local8;
			this.anInt722 = this.anInt724 - this.anInt720 - this.anInt722;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("47716, " + 0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII)V")
	public void method442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray211.length; local8++) {
				@Pc(19) int local19 = this.anIntArray211[local8] >> 16 & 0xFF;
				local19 += arg0;
				if (local19 < 0) {
					local19 = 0;
				} else if (local19 > 255) {
					local19 = 255;
				}
				@Pc(43) int local43 = this.anIntArray211[local8] >> 8 & 0xFF;
				local43 += arg1;
				if (local43 < 0) {
					local43 = 0;
				} else if (local43 > 255) {
					local43 = 255;
				}
				@Pc(65) int local65 = this.anIntArray211[local8] & 0xFF;
				local65 += arg2;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 255) {
					local65 = 255;
				}
				this.anIntArray211[local8] = (local19 << 16) + (local43 << 8) + local65;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("43785, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt721;
			arg2 += this.anInt722;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt743;
			@Pc(17) int local17 = 0;
			@Pc(21) boolean local21 = false;
			@Pc(24) int local24 = this.anInt720;
			@Pc(27) int local27 = this.anInt719;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt743 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class1_Sub1_Sub2.anInt745) {
				local40 = Class1_Sub1_Sub2.anInt745 - arg2;
				local24 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt745;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg2 + local24 > Class1_Sub1_Sub2.anInt746) {
				local24 -= arg2 + local24 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt747) {
				local40 = Class1_Sub1_Sub2.anInt747 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt747;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt748) {
				local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt748;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method444(this.anIntArray211, local24, this.aByteArray7, Class1_Sub1_Sub2.anIntArray212, local33, local15, local17, local27, local31);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("30333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([II[B[IIIIIII)V")
	private void method444(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg2[arg6++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg3[arg5++] = arg0[local25 & 0xFF];
					}
					local25 = arg2[arg6++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg3[arg5++] = arg0[local25 & 0xFF];
					}
					local25 = arg2[arg6++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg3[arg5++] = arg0[local25 & 0xFF];
					}
					local25 = arg2[arg6++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg3[arg5++] = arg0[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg2[arg6++];
					if (local108 == 0) {
						arg5++;
					} else {
						arg3[arg5++] = arg0[local108 & 0xFF];
					}
				}
				arg5 += arg8;
				arg6 += arg4;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("91322, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 68 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
