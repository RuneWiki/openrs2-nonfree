import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZQSBFHWZ")
public final class Class2_Sub1_Sub2_Sub3 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "y", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "x", descriptor = "B")
	private byte aByte26 = 1;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "z", descriptor = "I")
	private int anInt769 = 279;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "G", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "H", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "B", descriptor = "[I")
	public int[] anIntArray185;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "E", descriptor = "I")
	public int anInt772;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "F", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "C", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "D", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "A", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "<init>", descriptor = "(Lclient!FUZJMGZB;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub2_Sub3(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class2_Sub1_Sub3 local25 = new Class2_Sub1_Sub3((byte) 114, arg0.method186(arg1 + ".dat", null));
		@Pc(34) Class2_Sub1_Sub3 local34 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("index.dat", null));
		local34.anInt283 = local25.method269();
		this.anInt774 = local34.method269();
		this.anInt775 = local34.method269();
		@Pc(49) int local49 = local34.method267();
		this.anIntArray185 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray185[local55 + 1] = local34.method271();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt283 += 2;
			local25.anInt283 += local34.method269() * local34.method269();
			local34.anInt283++;
		}
		this.anInt772 = local34.method267();
		this.anInt773 = local34.method267();
		this.anInt770 = local34.method269();
		this.anInt771 = local34.method269();
		@Pc(120) int local120 = local34.method267();
		@Pc(126) int local126 = this.anInt770 * this.anInt771;
		this.aByteArray19 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray19[local134] = local25.method268();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt770; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt771; local156++) {
					this.aByteArray19[local134 + local156 * this.anInt770] = local25.method268();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "b", descriptor = "(I)V")
	public void method536() {
		try {
			this.anInt774 /= 2;
			this.anInt775 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt774 * this.anInt775];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt771; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt770; local28++) {
					local20[(local28 + this.anInt772 >> 1) + (local24 + this.anInt773 >> 1) * this.anInt774] = this.aByteArray19[local22++];
				}
			}
			this.aByteArray19 = local20;
			this.anInt770 = this.anInt774;
			this.anInt771 = this.anInt775;
			this.anInt772 = 0;
			this.anInt773 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("19588, " + 0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "b", descriptor = "(Z)V")
	public void method537() {
		try {
			if (this.anInt770 != this.anInt774 || this.anInt771 != this.anInt775) {
				@Pc(19) byte[] local19 = new byte[this.anInt774 * this.anInt775];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt771; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt770; local27++) {
						local19[local27 + this.anInt772 + (local23 + this.anInt773) * this.anInt774] = this.aByteArray19[local21++];
					}
				}
				this.aByteArray19 = local19;
				this.anInt770 = this.anInt774;
				this.anInt771 = this.anInt775;
				this.anInt772 = 0;
				this.anInt773 = 0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("34654, " + true + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(B)V")
	public void method538() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt770 * this.anInt771];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt771; local12++) {
				for (@Pc(19) int local19 = this.anInt770 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray19[local19 + local12 * this.anInt770];
				}
			}
			this.aByteArray19 = local8;
			this.anInt772 = this.anInt774 - this.anInt770 - this.anInt772;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("3636, " + 8 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "c", descriptor = "(I)V")
	public void method539() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt770 * this.anInt771];
			@Pc(14) int local14 = 0;
			for (@Pc(19) int local19 = this.anInt771 - 1; local19 >= 0; local19--) {
				for (@Pc(23) int local23 = 0; local23 < this.anInt770; local23++) {
					local8[local14++] = this.aByteArray19[local23 + local19 * this.anInt770];
				}
			}
			this.aByteArray19 = local8;
			this.anInt773 = this.anInt775 - this.anInt771 - this.anInt773;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("52361, " + 33964 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(IBII)V")
	public void method540(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.aByte26 == 1) {
				@Pc(7) boolean local7 = false;
				for (@Pc(11) int local11 = 0; local11 < this.anIntArray185.length; local11++) {
					@Pc(23) int local23 = this.anIntArray185[local11] >> 16 & 0xFF;
					local23 += arg2;
					if (local23 < 0) {
						local23 = 0;
					} else if (local23 > 255) {
						local23 = 255;
					}
					@Pc(47) int local47 = this.anIntArray185[local11] >> 8 & 0xFF;
					local47 += arg0;
					if (local47 < 0) {
						local47 = 0;
					} else if (local47 > 255) {
						local47 = 255;
					}
					@Pc(69) int local69 = this.anIntArray185[local11] & 0xFF;
					local69 += arg3;
					if (local69 < 0) {
						local69 = 0;
					} else if (local69 > 255) {
						local69 = 255;
					}
					this.anIntArray185[local11] = (local23 << 16) + (local47 << 8) + local69;
				}
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("34785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(III)V")
	public void method541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt772;
			arg1 += this.anInt773;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub2.anInt783;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt771;
			@Pc(23) int local23 = this.anInt770;
			@Pc(27) int local27 = Class2_Sub1_Sub2.anInt783 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub2.anInt785) {
				local40 = Class2_Sub1_Sub2.anInt785 - arg1;
				local20 -= local40;
				arg1 = Class2_Sub1_Sub2.anInt785;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg1 + local20 > Class2_Sub1_Sub2.anInt786) {
				local20 -= arg1 + local20 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt787) {
				local40 = Class2_Sub1_Sub2.anInt787 - arg0;
				local23 -= local40;
				arg0 = Class2_Sub1_Sub2.anInt787;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class2_Sub1_Sub2.anInt788) {
				local40 = arg0 + local23 - Class2_Sub1_Sub2.anInt788;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method542(local15, local17, Class2_Sub1_Sub2.anIntArray204, this.aByteArray19, local27, this.anIntArray185, local29, local23, local20);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("68623, " + -4899 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZQSBFHWZ", name = "a", descriptor = "(II[I[BI[IIZII)V")
	private void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(16) int local16 = -(arg7 & 0x3);
			for (@Pc(19) int local19 = -arg8; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					@Pc(30) byte local30 = arg3[arg1++];
					if (local30 == 0) {
						arg0++;
					} else {
						arg2[arg0++] = arg5[local30 & 0xFF];
					}
					local30 = arg3[arg1++];
					if (local30 == 0) {
						arg0++;
					} else {
						arg2[arg0++] = arg5[local30 & 0xFF];
					}
					local30 = arg3[arg1++];
					if (local30 == 0) {
						arg0++;
					} else {
						arg2[arg0++] = arg5[local30 & 0xFF];
					}
					local30 = arg3[arg1++];
					if (local30 == 0) {
						arg0++;
					} else {
						arg2[arg0++] = arg5[local30 & 0xFF];
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					@Pc(113) byte local113 = arg3[arg1++];
					if (local113 == 0) {
						arg0++;
					} else {
						arg2[arg0++] = arg5[local113 & 0xFF];
					}
				}
				arg0 += arg4;
				arg1 += arg6;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("56256, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + false + ", " + arg7 + ", " + arg8 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
