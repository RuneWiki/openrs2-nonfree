import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VEIVHFHZ")
public final class Class6_Sub1_Sub3_Sub2 extends Class6_Sub1_Sub3 {

	@OriginalMember(owner = "client!VEIVHFHZ", name = "z", descriptor = "I")
	private int anInt692;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "A", descriptor = "I")
	private int anInt693 = -234;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "B", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "I", descriptor = "I")
	public int anInt698;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "J", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "D", descriptor = "[I")
	public int[] anIntArray191;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "G", descriptor = "I")
	public int anInt696;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "H", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "E", descriptor = "I")
	public int anInt694;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "F", descriptor = "I")
	public int anInt695;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "C", descriptor = "[B")
	public byte[] aByteArray18;

	@OriginalMember(owner = "client!VEIVHFHZ", name = "<init>", descriptor = "(Lclient!XOJZVVDK;Ljava/lang/String;I)V")
	public Class6_Sub1_Sub3_Sub2(@OriginalArg(0) Class43 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class6_Sub1_Sub4 local25 = new Class6_Sub1_Sub4(888, arg0.method518(arg1 + ".dat", (byte[]) null));
		@Pc(34) Class6_Sub1_Sub4 local34 = new Class6_Sub1_Sub4(888, arg0.method518("index.dat", (byte[]) null));
		local34.anInt390 = local25.method241();
		this.anInt698 = local34.method241();
		this.anInt699 = local34.method241();
		@Pc(49) int local49 = local34.method239();
		this.anIntArray191 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray191[local55 + 1] = local34.method243();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt390 += 2;
			local25.anInt390 += local34.method241() * local34.method241();
			local34.anInt390++;
		}
		this.anInt696 = local34.method239();
		this.anInt697 = local34.method239();
		this.anInt694 = local34.method241();
		this.anInt695 = local34.method241();
		@Pc(120) int local120 = local34.method239();
		@Pc(126) int local126 = this.anInt694 * this.anInt695;
		this.aByteArray18 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray18[local134] = local25.method240();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt694; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt695; local156++) {
					this.aByteArray18[local134 + local156 * this.anInt694] = local25.method240();
				}
			}
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(B)V")
	public void method462(@OriginalArg(0) byte arg0) {
		try {
			this.anInt698 /= 2;
			this.anInt699 /= 2;
			@Pc(18) boolean local18 = false;
			@Pc(28) byte[] local28 = new byte[this.anInt698 * this.anInt699];
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < this.anInt695; local32++) {
				for (@Pc(36) int local36 = 0; local36 < this.anInt694; local36++) {
					local28[(local36 + this.anInt696 >> 1) + (local32 + this.anInt697 >> 1) * this.anInt698] = this.aByteArray18[local30++];
				}
			}
			this.aByteArray18 = local28;
			this.anInt694 = this.anInt698;
			this.anInt695 = this.anInt699;
			this.anInt696 = 0;
			this.anInt697 = 0;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("49493, " + arg0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "b", descriptor = "(I)V")
	public void method463() {
		try {
			if (this.anInt694 != this.anInt698 || this.anInt695 != this.anInt699) {
				@Pc(19) byte[] local19 = new byte[this.anInt698 * this.anInt699];
				@Pc(28) int local28 = 0;
				for (@Pc(30) int local30 = 0; local30 < this.anInt695; local30++) {
					for (@Pc(34) int local34 = 0; local34 < this.anInt694; local34++) {
						local19[local34 + this.anInt696 + (local30 + this.anInt697) * this.anInt698] = this.aByteArray18[local28++];
					}
				}
				this.aByteArray18 = local19;
				this.anInt694 = this.anInt698;
				this.anInt695 = this.anInt699;
				this.anInt696 = 0;
				this.anInt697 = 0;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("47551, " + -995 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "b", descriptor = "(B)V")
	public void method464(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt694 * this.anInt695];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt695; local12++) {
				for (@Pc(19) int local19 = this.anInt694 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray18[local19 + local12 * this.anInt694];
				}
			}
			@Pc(47) boolean local47 = false;
			this.aByteArray18 = local8;
			this.anInt696 = this.anInt698 - this.anInt694 - this.anInt696;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("54765, " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "c", descriptor = "(I)V")
	public void method465(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt694 * this.anInt695];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt695 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt694; local19++) {
					local8[local10++] = this.aByteArray18[local19 + local15 * this.anInt694];
				}
			}
			@Pc(46) boolean local46 = false;
			this.aByteArray18 = local8;
			this.anInt697 = this.anInt699 - this.anInt695 - this.anInt697;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("97105, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(ZIII)V")
	public void method466(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray191.length; local8++) {
				@Pc(19) int local19 = this.anIntArray191[local8] >> 16 & 0xFF;
				local19 += arg1;
				if (local19 < 0) {
					local19 = 0;
				} else if (local19 > 255) {
					local19 = 255;
				}
				@Pc(43) int local43 = this.anIntArray191[local8] >> 8 & 0xFF;
				local43 += arg0;
				if (local43 < 0) {
					local43 = 0;
				} else if (local43 > 255) {
					local43 = 255;
				}
				@Pc(65) int local65 = this.anIntArray191[local8] & 0xFF;
				local65 += arg2;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 255) {
					local65 = 255;
				}
				this.anIntArray191[local8] = (local19 << 16) + (local43 << 8) + local65;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("74223, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(III)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt696;
			arg0 += this.anInt697;
			@Pc(15) int local15 = arg1 + arg0 * Class6_Sub1_Sub3.anInt785;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt695;
			@Pc(23) int local23 = this.anInt694;
			@Pc(27) int local27 = Class6_Sub1_Sub3.anInt785 - local23;
			@Pc(29) int local29 = 0;
			while (arg2 >= 0) {
				this.aBoolean164 = !this.aBoolean164;
			}
			@Pc(48) int local48;
			if (arg0 < Class6_Sub1_Sub3.anInt787) {
				local48 = Class6_Sub1_Sub3.anInt787 - arg0;
				local20 -= local48;
				arg0 = Class6_Sub1_Sub3.anInt787;
				local17 = 0 + local48 * local23;
				local15 += local48 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg0 + local20 > Class6_Sub1_Sub3.anInt788) {
				local20 -= arg0 + local20 - Class6_Sub1_Sub3.anInt788;
			}
			if (arg1 < Class6_Sub1_Sub3.anInt789) {
				local48 = Class6_Sub1_Sub3.anInt789 - arg1;
				local23 -= local48;
				arg1 = Class6_Sub1_Sub3.anInt789;
				local17 += local48;
				local15 += local48;
				local29 = 0 + local48;
				local27 += local48;
			}
			if (arg1 + local23 > Class6_Sub1_Sub3.anInt790) {
				local48 = arg1 + local23 - Class6_Sub1_Sub3.anInt790;
				local23 -= local48;
				local29 += local48;
				local27 += local48;
			}
			if (local23 > 0 && local20 > 0) {
				this.method468(local23, this.aByteArray18, local15, local27, Class6_Sub1_Sub3.anIntArray204, this.anIntArray191, local17, local20, local29);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("5594, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VEIVHFHZ", name = "a", descriptor = "(I[BII[I[IIIBI)V")
	private void method468(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg1[arg6++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg4[arg2++] = arg5[local25 & 0xFF];
					}
					local25 = arg1[arg6++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg4[arg2++] = arg5[local25 & 0xFF];
					}
					local25 = arg1[arg6++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg4[arg2++] = arg5[local25 & 0xFF];
					}
					local25 = arg1[arg6++];
					if (local25 == 0) {
						arg2++;
					} else {
						arg4[arg2++] = arg5[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg1[arg6++];
					if (local108 == 0) {
						arg2++;
					} else {
						arg4[arg2++] = arg5[local108 & 0xFF];
					}
				}
				arg2 += arg3;
				arg6 += arg8;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("61868, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 5 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
