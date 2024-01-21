import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt642 = -407;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "B")
	private byte aByte31 = -65;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt643 = 35961;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt644 = -676;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "B")
	private byte aByte32 = 3;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt646 = -582;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	private int anInt650;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray205 = new int[arg0 * arg1];
		this.anInt647 = this.anInt651 = arg0;
		this.anInt648 = this.anInt652 = arg1;
		this.anInt649 = this.anInt650 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(32) Image local32 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(37) MediaTracker local37 = new MediaTracker(arg1);
			local37.addImage(local32, 0);
			local37.waitForAll();
			this.anInt647 = local32.getWidth(arg1);
			this.anInt648 = local32.getHeight(arg1);
			this.anInt651 = this.anInt647;
			this.anInt652 = this.anInt648;
			this.anInt649 = 0;
			this.anInt650 = 0;
			this.anIntArray205 = new int[this.anInt647 * this.anInt648];
			@Pc(91) PixelGrabber local91 = new PixelGrabber(local32, 0, 0, this.anInt647, this.anInt648, this.anIntArray205, 0, this.anInt647);
			local91.grabPixels();
		} catch (@Pc(96) Exception local96) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method659(arg1 + ".dat", null), (byte) 1);
		@Pc(55) Class1_Sub1_Sub3 local55 = new Class1_Sub1_Sub3(arg0.method659("index.dat", null), (byte) 1);
		local55.anInt743 = local46.method475();
		this.anInt651 = local55.method475();
		this.anInt652 = local55.method475();
		@Pc(70) int local70 = local55.method473();
		@Pc(73) int[] local73 = new int[local70];
		for (@Pc(75) int local75 = 0; local75 < local70 - 1; local75++) {
			local73[local75 + 1] = local55.method477();
			if (local73[local75 + 1] == 0) {
				local73[local75 + 1] = 1;
			}
		}
		for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
			local55.anInt743 += 2;
			local46.anInt743 += local55.method475() * local55.method475();
			local55.anInt743++;
		}
		this.anInt649 = local55.method473();
		this.anInt650 = local55.method473();
		this.anInt647 = local55.method475();
		this.anInt648 = local55.method475();
		@Pc(157) int local157 = local55.method473();
		@Pc(163) int local163 = this.anInt647 * this.anInt648;
		this.anIntArray205 = new int[local163];
		@Pc(171) int local171;
		if (local157 == 0) {
			for (local171 = 0; local171 < local163; local171++) {
				this.anIntArray205[local171] = local73[local46.method473()];
			}
		} else if (local157 == 1) {
			for (local171 = 0; local171 < this.anInt647; local171++) {
				for (@Pc(195) int local195 = 0; local195 < this.anInt648; local195++) {
					this.anIntArray205[local171 + local195 * this.anInt647] = local73[local46.method473()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method383(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.anInt642 = 192;
			}
			Class1_Sub1_Sub2.method431(this.anInt647, this.anInt648, this.anIntArray205);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("54528, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray205.length; local16++) {
				@Pc(23) int local23 = this.anIntArray205[local16];
				if (local23 != 0) {
					@Pc(31) int local31 = local23 >> 16 & 0xFF;
					local31 += arg1;
					if (local31 < 1) {
						local31 = 1;
					} else if (local31 > 255) {
						local31 = 255;
					}
					@Pc(53) int local53 = local23 >> 8 & 0xFF;
					local53 += arg2;
					if (local53 < 1) {
						local53 = 1;
					} else if (local53 > 255) {
						local53 = 255;
					}
					@Pc(73) int local73 = local23 & 0xFF;
					local73 += arg0;
					if (local73 < 1) {
						local73 = 1;
					} else if (local73 > 255) {
						local73 = 255;
					}
					this.anIntArray205[local16] = (local31 << 16) + (local53 << 8) + local73;
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("55973, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method385(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt651 * this.anInt652];
			for (@Pc(10) int local10 = 0; local10 < this.anInt648; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt647; local14++) {
					local8[(local10 + this.anInt650) * this.anInt651 + local14 + this.anInt649] = this.anIntArray205[local10 * this.anInt647 + local14];
				}
			}
			@Pc(54) boolean local54 = false;
			this.anIntArray205 = local8;
			this.anInt647 = this.anInt651;
			this.anInt648 = this.anInt652;
			this.anInt649 = 0;
			this.anInt650 = 0;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("46528, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt649;
			arg0 += this.anInt650;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt696;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt648;
			@Pc(26) int local26 = this.anInt647;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt696 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt698) {
				local39 = Class1_Sub1_Sub2.anInt698 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt698;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt699) {
				local23 -= arg0 + local23 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt700) {
				local39 = Class1_Sub1_Sub2.anInt700 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt700;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt701) {
				local39 = arg1 + local26 - Class1_Sub1_Sub2.anInt701;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method387(local32, local17, this.anIntArray205, this.aBoolean159, local23, local26, local30, local15, Class1_Sub1_Sub2.anIntArray210);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("96540, " + arg0 + ", " + false + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[IZIIII[I)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			if (!arg3) {
				this.anInt642 = 362;
			}
			@Pc(16) int local16 = -(arg5 & 0x3);
			for (@Pc(19) int local19 = -arg4; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					arg8[arg7++] = arg2[arg1++];
					arg8[arg7++] = arg2[arg1++];
					arg8[arg7++] = arg2[arg1++];
					arg8[arg7++] = arg2[arg1++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg8[arg7++] = arg2[arg1++];
				}
				arg7 += arg6;
				arg1 += arg0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("31657, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V")
	public void method388(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt649;
			arg2 += this.anInt650;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub1_Sub2.anInt696;
			@Pc(17) int local17 = 0;
			@Pc(22) int local22;
			if (arg0 != 7) {
				for (local22 = 1; local22 > 0; local22++) {
				}
			}
			local22 = this.anInt648;
			@Pc(33) int local33 = this.anInt647;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt696 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg2 < Class1_Sub1_Sub2.anInt698) {
				local46 = Class1_Sub1_Sub2.anInt698 - arg2;
				local22 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt698;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg2 + local22 > Class1_Sub1_Sub2.anInt699) {
				local22 -= arg2 + local22 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt700) {
				local46 = Class1_Sub1_Sub2.anInt700 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt700;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt701) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt701;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local22 > 0) {
				this.method389(Class1_Sub1_Sub2.anIntArray210, this.anIntArray205, local17, local15, local33, local22, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("82264, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method389(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) int local6 = -(arg4 >> 2);
		@Pc(11) int local11 = -(arg4 & 0x3);
		for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
			@Pc(25) int local25;
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)V")
	public void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt649;
			arg0 += this.anInt650;
			@Pc(27) int local27 = arg1 + arg0 * Class1_Sub1_Sub2.anInt696;
			@Pc(29) int local29 = 0;
			@Pc(32) int local32 = this.anInt648;
			@Pc(35) int local35 = this.anInt647;
			@Pc(39) int local39 = Class1_Sub1_Sub2.anInt696 - local35;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48;
			if (arg0 < Class1_Sub1_Sub2.anInt698) {
				local48 = Class1_Sub1_Sub2.anInt698 - arg0;
				local32 -= local48;
				arg0 = Class1_Sub1_Sub2.anInt698;
				local29 = local48 * local35 + 0;
				local27 += local48 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg0 + local32 > Class1_Sub1_Sub2.anInt699) {
				local32 -= arg0 + local32 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt700) {
				local48 = Class1_Sub1_Sub2.anInt700 - arg1;
				local35 -= local48;
				arg1 = Class1_Sub1_Sub2.anInt700;
				local29 += local48;
				local27 += local48;
				local41 = local48 + 0;
				local39 += local48;
			}
			if (arg1 + local35 > Class1_Sub1_Sub2.anInt701) {
				local48 = arg1 + local35 - Class1_Sub1_Sub2.anInt701;
				local35 -= local48;
				local41 += local48;
				local39 += local48;
			}
			if (local35 > 0 && local32 > 0) {
				this.method391(local39, local41, local35, Class1_Sub1_Sub2.anIntArray210, 0, local27, this.anInt645, local29, local32, this.anIntArray205);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("46084, " + arg0 + ", " + arg1 + ", " + -676 + ", " + 128 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[IIIIII[I)V")
	private void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			if (arg6 != 0) {
				this.aBoolean161 = !this.aBoolean161;
			}
			for (@Pc(18) int local18 = -arg8; local18 < 0; local18++) {
				for (@Pc(23) int local23 = -arg2; local23 < 0; local23++) {
					@Pc(30) int local30 = arg9[arg7++];
					if (local30 == 0) {
						arg5++;
					} else {
						@Pc(36) int local36 = arg3[arg5];
						arg3[arg5++] = ((local30 & 0xFF00FF) * 128 + (local36 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local30 & 0xFF00) * 128 + (local36 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg0;
				arg7 += arg1;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("88042, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[II[IIII)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg2 / 2;
				@Pc(14) int local14 = -arg3 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg0 >> 8;
				@Pc(44) int local44 = local32 * arg0 >> 8;
				@Pc(56) int local56 = (arg1 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg6 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg4 + arg9 * Class1_Sub1_Sub2.anInt696;
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					@Pc(82) int local82 = arg7[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg5[local76]; local103 < 0; local103++) {
						Class1_Sub1_Sub2.anIntArray210[local86++] = this.anIntArray205[(local92 >> 16) + (local98 >> 16) * this.anInt647];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt696;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("85222, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -582 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIDIBII)V")
	public void method393(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) double arg2) {
		try {
			try {
				@Pc(28) int local28 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(46) int local46 = local34 * 256 >> 8;
				@Pc(58) int local58 = local40 * -10 + local46 * -10 + 983040;
				@Pc(70) int local70 = local46 * -10 + 983040 - local40 * -10;
				@Pc(76) int local76 = arg0 + arg1 * Class1_Sub1_Sub2.anInt696;
				for (@Pc(78) int local78 = 0; local78 < 20; local78++) {
					@Pc(82) int local82 = local76;
					@Pc(84) int local84 = local58;
					@Pc(86) int local86 = local70;
					for (@Pc(89) int local89 = -20; local89 < 0; local89++) {
						@Pc(105) int local105 = this.anIntArray205[(local84 >> 16) + (local86 >> 16) * this.anInt647];
						if (local105 == 0) {
							local82++;
						} else {
							Class1_Sub1_Sub2.anIntArray210[local82++] = local105;
						}
						local84 += local46;
						local86 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt696;
				}
			} catch (@Pc(144) Exception local144) {
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("71479, " + 15 + ", " + 20 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 256 + ", " + -32 + ", " + 15 + ", " + 20 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!jb;I)V")
	public void method394(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt649;
			arg2 += this.anInt650;
			@Pc(24) int local24 = arg0 + arg2 * Class1_Sub1_Sub2.anInt696;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt648;
			@Pc(32) int local32 = this.anInt647;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt696 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg2 < Class1_Sub1_Sub2.anInt698) {
				local45 = Class1_Sub1_Sub2.anInt698 - arg2;
				local29 -= local45;
				arg2 = Class1_Sub1_Sub2.anInt698;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg2 + local29 > Class1_Sub1_Sub2.anInt699) {
				local29 -= arg2 + local29 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt700) {
				local45 = Class1_Sub1_Sub2.anInt700 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt700;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub2.anInt701) {
				local45 = arg0 + local32 - Class1_Sub1_Sub2.anInt701;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method395(Class1_Sub1_Sub2.anIntArray210, local24, local26, local29, local38, local32, 0, arg1.aByteArray7, local36, this.anIntArray205);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("11914, " + 945 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIIIII[BI[I)V")
	private void method395(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(25) int local25 = -arg3; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					local36 = arg9[arg2++];
					if (local36 != 0 && arg7[arg1] == 0) {
						arg0[arg1++] = local36;
					} else {
						arg1++;
					}
					local36 = arg9[arg2++];
					if (local36 != 0 && arg7[arg1] == 0) {
						arg0[arg1++] = local36;
					} else {
						arg1++;
					}
					local36 = arg9[arg2++];
					if (local36 != 0 && arg7[arg1] == 0) {
						arg0[arg1++] = local36;
					} else {
						arg1++;
					}
					local36 = arg9[arg2++];
					if (local36 != 0 && arg7[arg1] == 0) {
						arg0[arg1++] = local36;
					} else {
						arg1++;
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					local36 = arg9[arg2++];
					if (local36 != 0 && arg7[arg1] == 0) {
						arg0[arg1++] = local36;
					} else {
						arg1++;
					}
				}
				arg1 += arg8;
				arg2 += arg4;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("9660, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
