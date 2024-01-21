import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OCPHNIUN")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!OCPHNIUN", name = "y", descriptor = "I")
	private static int anInt521 = 536;

	@OriginalMember(owner = "client!OCPHNIUN", name = "z", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!OCPHNIUN", name = "A", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!OCPHNIUN", name = "H", descriptor = "I")
	public int anInt526;

	@OriginalMember(owner = "client!OCPHNIUN", name = "I", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!OCPHNIUN", name = "C", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!OCPHNIUN", name = "F", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!OCPHNIUN", name = "G", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!OCPHNIUN", name = "D", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!OCPHNIUN", name = "E", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!OCPHNIUN", name = "B", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!OCPHNIUN", name = "<init>", descriptor = "(Lclient!UUIGNTAD;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class38 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(arg0.method512(arg1 + ".dat", null), anInt521);
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method512("index.dat", null), anInt521);
		local34.anInt78 = local25.method57();
		this.anInt526 = local34.method57();
		this.anInt527 = local34.method57();
		@Pc(49) int local49 = local34.method55();
		this.anIntArray145 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray145[local55 + 1] = local34.method59();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt78 += 2;
			local25.anInt78 += local34.method57() * local34.method57();
			local34.anInt78++;
		}
		this.anInt524 = local34.method55();
		this.anInt525 = local34.method55();
		this.anInt522 = local34.method57();
		this.anInt523 = local34.method57();
		@Pc(120) int local120 = local34.method55();
		@Pc(126) int local126 = this.anInt522 * this.anInt523;
		this.aByteArray12 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray12[local134] = local25.method56();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt522; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt523; local156++) {
					this.aByteArray12[local134 + local156 * this.anInt522] = local25.method56();
				}
			}
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "c", descriptor = "(I)V")
	public void method366() {
		try {
			this.anInt526 /= 2;
			this.anInt527 /= 2;
			@Pc(24) byte[] local24 = new byte[this.anInt526 * this.anInt527];
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < this.anInt523; local28++) {
				for (@Pc(32) int local32 = 0; local32 < this.anInt522; local32++) {
					local24[(local32 + this.anInt524 >> 1) + (local28 + this.anInt525 >> 1) * this.anInt526] = this.aByteArray12[local26++];
				}
			}
			this.aByteArray12 = local24;
			this.anInt522 = this.anInt526;
			this.anInt523 = this.anInt527;
			this.anInt524 = 0;
			this.anInt525 = 0;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("71318, " + -49186 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "d", descriptor = "(I)V")
	public void method367() {
		try {
			if (this.anInt522 != this.anInt526 || this.anInt523 != this.anInt527) {
				@Pc(22) byte[] local22 = new byte[this.anInt526 * this.anInt527];
				@Pc(24) int local24 = 0;
				for (@Pc(26) int local26 = 0; local26 < this.anInt523; local26++) {
					for (@Pc(30) int local30 = 0; local30 < this.anInt522; local30++) {
						local22[local30 + this.anInt524 + (local26 + this.anInt525) * this.anInt526] = this.aByteArray12[local24++];
					}
				}
				this.aByteArray12 = local22;
				this.anInt522 = this.anInt526;
				this.anInt523 = this.anInt527;
				this.anInt524 = 0;
				this.anInt525 = 0;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("99548, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "e", descriptor = "(I)V")
	public void method368() {
		try {
			@Pc(11) byte[] local11 = new byte[this.anInt522 * this.anInt523];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < this.anInt523; local15++) {
				for (@Pc(22) int local22 = this.anInt522 - 1; local22 >= 0; local22--) {
					local11[local13++] = this.aByteArray12[local22 + local15 * this.anInt522];
				}
			}
			this.aByteArray12 = local11;
			this.anInt524 = this.anInt526 - this.anInt522 - this.anInt524;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("42167, " + -623 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(B)V")
	public void method369(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt522 * this.anInt523];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt523 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt522; local19++) {
					local8[local10++] = this.aByteArray12[local19 + local15 * this.anInt522];
				}
			}
			this.aByteArray12 = local8;
			@Pc(50) boolean local50 = false;
			this.anInt525 = this.anInt527 - this.anInt523 - this.anInt525;
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("56030, " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IZII)V")
	public void method370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray145.length; local3++) {
				@Pc(14) int local14 = this.anIntArray145[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray145[local3] >> 8 & 0xFF;
				local38 += arg0;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray145[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray145[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("68163, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IBI)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt524;
			arg2 += this.anInt525;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt653;
			@Pc(17) int local17 = 0;
			if (arg1 == 2) {
				@Pc(24) int local24 = this.anInt523;
				@Pc(27) int local27 = this.anInt522;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt653 - local27;
				@Pc(33) int local33 = 0;
				@Pc(40) int local40;
				if (arg2 < Class1_Sub1_Sub2.anInt655) {
					local40 = Class1_Sub1_Sub2.anInt655 - arg2;
					local24 -= local40;
					arg2 = Class1_Sub1_Sub2.anInt655;
					local17 = local40 * local27 + 0;
					local15 += local40 * Class1_Sub1_Sub2.anInt653;
				}
				if (arg2 + local24 > Class1_Sub1_Sub2.anInt656) {
					local24 -= arg2 + local24 - Class1_Sub1_Sub2.anInt656;
				}
				if (arg0 < Class1_Sub1_Sub2.anInt657) {
					local40 = Class1_Sub1_Sub2.anInt657 - arg0;
					local27 -= local40;
					arg0 = Class1_Sub1_Sub2.anInt657;
					local17 += local40;
					local15 += local40;
					local33 = local40 + 0;
					local31 += local40;
				}
				if (arg0 + local27 > Class1_Sub1_Sub2.anInt658) {
					local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt658;
					local27 -= local40;
					local33 += local40;
					local31 += local40;
				}
				if (local27 > 0 && local24 > 0) {
					this.method372(local17, this.anIntArray145, local27, local33, local15, Class1_Sub1_Sub2.anIntArray170, local31, local24, this.aByteArray12);
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("25999, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OCPHNIUN", name = "a", descriptor = "(IB[IIII[III[B)V")
	private void method372(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(24) int local24 = -arg7; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					@Pc(35) byte local35 = arg8[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg1[local35 & 0xFF];
					}
					local35 = arg8[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg1[local35 & 0xFF];
					}
					local35 = arg8[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg1[local35 & 0xFF];
					}
					local35 = arg8[arg0++];
					if (local35 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg1[local35 & 0xFF];
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					@Pc(118) byte local118 = arg8[arg0++];
					if (local118 == 0) {
						arg4++;
					} else {
						arg5[arg4++] = arg1[local118 & 0xFF];
					}
				}
				arg4 += arg6;
				arg0 += arg3;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("34091, " + arg0 + ", " + 105 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
