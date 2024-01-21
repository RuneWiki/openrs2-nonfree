import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VUMXQDFQ")
public final class Class8_Sub1_Sub1_Sub4 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!VUMXQDFQ", name = "C", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "D", descriptor = "I")
	private int anInt743 = 1;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "E", descriptor = "I")
	private int anInt744 = -613;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "F", descriptor = "I")
	private int anInt745 = 491;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "G", descriptor = "B")
	private byte aByte33 = 3;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "N", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "O", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "I", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "L", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "M", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "J", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "K", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "H", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!VUMXQDFQ", name = "<init>", descriptor = "(Lclient!XRWUKRPO;Ljava/lang/String;I)V")
	public Class8_Sub1_Sub1_Sub4(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class8_Sub1_Sub3 local34 = new Class8_Sub1_Sub3(arg0.method553(arg1 + ".dat", null), -49015);
		@Pc(43) Class8_Sub1_Sub3 local43 = new Class8_Sub1_Sub3(arg0.method553("index.dat", null), -49015);
		local43.anInt253 = local34.method167();
		this.anInt750 = local43.method167();
		this.anInt751 = local43.method167();
		@Pc(58) int local58 = local43.method165();
		this.anIntArray158 = new int[local58];
		for (@Pc(64) int local64 = 0; local64 < local58 - 1; local64++) {
			this.anIntArray158[local64 + 1] = local43.method169();
		}
		for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
			local43.anInt253 += 2;
			local34.anInt253 += local43.method167() * local43.method167();
			local43.anInt253++;
		}
		this.anInt748 = local43.method165();
		this.anInt749 = local43.method165();
		this.anInt746 = local43.method167();
		this.anInt747 = local43.method167();
		@Pc(129) int local129 = local43.method165();
		@Pc(135) int local135 = this.anInt746 * this.anInt747;
		this.aByteArray18 = new byte[local135];
		@Pc(143) int local143;
		if (local129 == 0) {
			for (local143 = 0; local143 < local135; local143++) {
				this.aByteArray18[local143] = local34.method166();
			}
		} else if (local129 == 1) {
			for (local143 = 0; local143 < this.anInt746; local143++) {
				for (@Pc(165) int local165 = 0; local165 < this.anInt747; local165++) {
					this.aByteArray18[local143 + local165 * this.anInt746] = local34.method166();
				}
			}
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "c", descriptor = "(I)V")
	public void method514() {
		try {
			this.anInt750 /= 2;
			this.anInt751 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt750 * this.anInt751];
			@Pc(22) int local22 = 0;
			@Pc(28) int local28;
			for (@Pc(24) int local24 = 0; local24 < this.anInt747; local24++) {
				for (local28 = 0; local28 < this.anInt746; local28++) {
					local20[(local28 + this.anInt748 >> 1) + (local24 + this.anInt749 >> 1) * this.anInt750] = this.aByteArray18[local22++];
				}
			}
			this.aByteArray18 = local20;
			if (this.anInt743 != 1) {
				for (local28 = 1; local28 > 0; local28++) {
				}
			}
			this.anInt746 = this.anInt750;
			this.anInt747 = this.anInt751;
			this.anInt748 = 0;
			this.anInt749 = 0;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("57842, " + 1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "d", descriptor = "(I)V")
	public void method515(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < 0 && (this.anInt746 != this.anInt750 || this.anInt747 != this.anInt751)) {
				@Pc(24) byte[] local24 = new byte[this.anInt750 * this.anInt751];
				@Pc(26) int local26 = 0;
				for (@Pc(28) int local28 = 0; local28 < this.anInt747; local28++) {
					for (@Pc(32) int local32 = 0; local32 < this.anInt746; local32++) {
						local24[local32 + this.anInt748 + (local28 + this.anInt749) * this.anInt750] = this.aByteArray18[local26++];
					}
				}
				this.aByteArray18 = local24;
				this.anInt746 = this.anInt750;
				this.anInt747 = this.anInt751;
				this.anInt748 = 0;
				this.anInt749 = 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("89468, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "e", descriptor = "(I)V")
	public void method516() {
		try {
			@Pc(11) byte[] local11 = new byte[this.anInt746 * this.anInt747];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt747; local15++) {
				for (@Pc(22) int local22 = this.anInt746 - 1; local22 >= 0; local22--) {
					local11[local13++] = this.aByteArray18[local22 + local15 * this.anInt746];
				}
			}
			this.aByteArray18 = local11;
			this.anInt748 = this.anInt750 - this.anInt746 - this.anInt748;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("7169, " + 107 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "a", descriptor = "(B)V")
	public void method517(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt746 * this.anInt747];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt747 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt746; local19++) {
					local8[local10++] = this.aByteArray18[local19 + local15 * this.anInt746];
				}
			}
			this.aByteArray18 = local8;
			this.anInt749 = this.anInt751 - this.anInt747 - this.anInt749;
			@Pc(60) boolean local60 = false;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("95182, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "a", descriptor = "(IIIB)V")
	public void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray158.length; local3++) {
				@Pc(14) int local14 = this.anIntArray158[local3] >> 16 & 0xFF;
				local14 += arg2;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray158[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray158[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray158[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("59348, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -77 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "a", descriptor = "(III)V")
	public void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt748;
			arg2 += this.anInt749;
			@Pc(15) int local15 = arg0 + arg2 * Class8_Sub1_Sub1.anInt734;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt747;
			@Pc(23) int local23 = this.anInt746;
			@Pc(27) int local27 = Class8_Sub1_Sub1.anInt734 - local23;
			@Pc(29) int local29 = 0;
			@Pc(33) boolean local33 = false;
			@Pc(40) int local40;
			if (arg2 < Class8_Sub1_Sub1.anInt736) {
				local40 = Class8_Sub1_Sub1.anInt736 - arg2;
				local20 -= local40;
				arg2 = Class8_Sub1_Sub1.anInt736;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg2 + local20 > Class8_Sub1_Sub1.anInt737) {
				local20 -= arg2 + local20 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg0 < Class8_Sub1_Sub1.anInt738) {
				local40 = Class8_Sub1_Sub1.anInt738 - arg0;
				local23 -= local40;
				arg0 = Class8_Sub1_Sub1.anInt738;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class8_Sub1_Sub1.anInt739) {
				local40 = arg0 + local23 - Class8_Sub1_Sub1.anInt739;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method520(local17, local15, local29, local20, local23, this.aByteArray18, Class8_Sub1_Sub1.anIntArray157, local27, this.anIntArray158);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("17724, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VUMXQDFQ", name = "a", descriptor = "(IIIII[B[II[II)V")
	private void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(14) int local14 = -arg3; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg5[arg0++];
					if (local25 == 0) {
						arg1++;
					} else {
						arg6[arg1++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg0++];
					if (local25 == 0) {
						arg1++;
					} else {
						arg6[arg1++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg0++];
					if (local25 == 0) {
						arg1++;
					} else {
						arg6[arg1++] = arg8[local25 & 0xFF];
					}
					local25 = arg5[arg0++];
					if (local25 == 0) {
						arg1++;
					} else {
						arg6[arg1++] = arg8[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg5[arg0++];
					if (local108 == 0) {
						arg1++;
					} else {
						arg6[arg1++] = arg8[local108 & 0xFF];
					}
				}
				arg1 += arg7;
				arg0 += arg2;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("92896, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -3950 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
