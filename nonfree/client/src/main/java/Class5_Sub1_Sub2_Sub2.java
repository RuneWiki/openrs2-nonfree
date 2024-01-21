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

@OriginalClass("client!PDMJJHOP")
public final class Class5_Sub1_Sub2_Sub2 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!PDMJJHOP", name = "x", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!PDMJJHOP", name = "y", descriptor = "I")
	private int anInt574 = 936;

	@OriginalMember(owner = "client!PDMJJHOP", name = "z", descriptor = "I")
	private int anInt575 = 3;

	@OriginalMember(owner = "client!PDMJJHOP", name = "A", descriptor = "I")
	private int anInt576 = -46326;

	@OriginalMember(owner = "client!PDMJJHOP", name = "B", descriptor = "I")
	private int anInt577 = -34;

	@OriginalMember(owner = "client!PDMJJHOP", name = "C", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!PDMJJHOP", name = "H", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!PDMJJHOP", name = "D", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!PDMJJHOP", name = "I", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!PDMJJHOP", name = "E", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!PDMJJHOP", name = "G", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!PDMJJHOP", name = "F", descriptor = "I")
	private int anInt580;

	@OriginalMember(owner = "client!PDMJJHOP", name = "<init>", descriptor = "(II)V")
	public Class5_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray112 = new int[arg0 * arg1];
		this.anInt578 = this.anInt582 = arg0;
		this.anInt579 = this.anInt583 = arg1;
		this.anInt580 = this.anInt581 = 0;
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class5_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt578 = local20.getWidth(arg1);
			this.anInt579 = local20.getHeight(arg1);
			this.anInt582 = this.anInt578;
			this.anInt583 = this.anInt579;
			this.anInt580 = 0;
			this.anInt581 = 0;
			this.anIntArray112 = new int[this.anInt578 * this.anInt579];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt578, this.anInt579, this.anIntArray112, 0, this.anInt578);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "<init>", descriptor = "(Lclient!MJLXHQTQ;Ljava/lang/String;I)V")
	public Class5_Sub1_Sub2_Sub2(@OriginalArg(0) Class31 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class5_Sub1_Sub4 local34 = new Class5_Sub1_Sub4(arg0.method227(arg1 + ".dat", null), -82);
		@Pc(43) Class5_Sub1_Sub4 local43 = new Class5_Sub1_Sub4(arg0.method227("index.dat", null), -82);
		local43.anInt755 = local34.method439();
		this.anInt582 = local43.method439();
		this.anInt583 = local43.method439();
		@Pc(58) int local58 = local43.method437();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method441();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt755 += 2;
			local34.anInt755 += local43.method439() * local43.method439();
			local43.anInt755++;
		}
		this.anInt580 = local43.method437();
		this.anInt581 = local43.method437();
		this.anInt578 = local43.method439();
		this.anInt579 = local43.method439();
		@Pc(139) int local139 = local43.method437();
		@Pc(145) int local145 = this.anInt578 * this.anInt579;
		this.anIntArray112 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray112[local153] = local61[local34.method437()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt578; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt579; local177++) {
					this.anIntArray112[local153 + local177 * this.anInt578] = local61[local34.method437()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "b", descriptor = "(I)V")
	public void method271() {
		try {
			Class5_Sub1_Sub2.method330(this.anIntArray112, this.anInt578, this.anInt579);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("35713, " + 2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(IZII)V")
	public void method272(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray112.length; local3++) {
				@Pc(10) int local10 = this.anIntArray112[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg1;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg2;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg0;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray112[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("9932, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "c", descriptor = "(I)V")
	public void method273() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt582 * this.anInt583];
			for (@Pc(10) int local10 = 0; local10 < this.anInt579; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt578; local14++) {
					local8[(local10 + this.anInt581) * this.anInt582 + local14 + this.anInt580] = this.anIntArray112[local10 * this.anInt578 + local14];
				}
			}
			this.anIntArray112 = local8;
			this.anInt578 = this.anInt582;
			this.anInt579 = this.anInt583;
			this.anInt580 = 0;
			this.anInt581 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("35333, " + 18860 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(III)V")
	public void method274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt580;
			arg0 += this.anInt581;
			@Pc(15) int local15 = arg1 + arg0 * Class5_Sub1_Sub2.anInt622;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt579;
			@Pc(23) int local23 = this.anInt578;
			@Pc(27) int local27 = Class5_Sub1_Sub2.anInt622 - local23;
			@Pc(29) int local29 = 0;
			@Pc(46) int local46;
			if (arg0 < Class5_Sub1_Sub2.anInt624) {
				local46 = Class5_Sub1_Sub2.anInt624 - arg0;
				local20 -= local46;
				arg0 = Class5_Sub1_Sub2.anInt624;
				local17 = local46 * local23 + 0;
				local15 += local46 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg0 + local20 > Class5_Sub1_Sub2.anInt625) {
				local20 -= arg0 + local20 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg1 < Class5_Sub1_Sub2.anInt626) {
				local46 = Class5_Sub1_Sub2.anInt626 - arg1;
				local23 -= local46;
				arg1 = Class5_Sub1_Sub2.anInt626;
				local17 += local46;
				local15 += local46;
				local29 = local46 + 0;
				local27 += local46;
			}
			if (arg1 + local23 > Class5_Sub1_Sub2.anInt627) {
				local46 = arg1 + local23 - Class5_Sub1_Sub2.anInt627;
				local23 -= local46;
				local29 += local46;
				local27 += local46;
			}
			if (local23 > 0 && local20 > 0) {
				this.method275(local15, local27, local20, local29, local17, Class5_Sub1_Sub2.anIntArray117, this.anIntArray112, local23);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("3964, " + arg0 + ", " + arg1 + ", " + 936 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(IIIIBI[I[II)V")
	private void method275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(22) int local22 = -(arg7 & 0x3);
			for (@Pc(25) int local25 = -arg2; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					arg5[arg0++] = arg6[arg4++];
					arg5[arg0++] = arg6[arg4++];
					arg5[arg0++] = arg6[arg4++];
					arg5[arg0++] = arg6[arg4++];
				}
				for (@Pc(68) int local68 = local22; local68 < 0; local68++) {
					arg5[arg0++] = arg6[arg4++];
				}
				arg0 += arg1;
				arg4 += arg3;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("47952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 55 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(IZI)V")
	public void method276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt580;
			arg0 += this.anInt581;
			@Pc(15) int local15 = arg1 + arg0 * Class5_Sub1_Sub2.anInt622;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt579;
			@Pc(26) int local26 = this.anInt578;
			@Pc(30) int local30 = Class5_Sub1_Sub2.anInt622 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class5_Sub1_Sub2.anInt624) {
				local39 = Class5_Sub1_Sub2.anInt624 - arg0;
				local23 -= local39;
				arg0 = Class5_Sub1_Sub2.anInt624;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg0 + local23 > Class5_Sub1_Sub2.anInt625) {
				local23 -= arg0 + local23 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg1 < Class5_Sub1_Sub2.anInt626) {
				local39 = Class5_Sub1_Sub2.anInt626 - arg1;
				local26 -= local39;
				arg1 = Class5_Sub1_Sub2.anInt626;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class5_Sub1_Sub2.anInt627) {
				local39 = arg1 + local26 - Class5_Sub1_Sub2.anInt627;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method277(Class5_Sub1_Sub2.anIntArray117, this.anIntArray112, local17, local15, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("37529, " + arg0 + ", " + false + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method277(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(IIII)V")
	public void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt580;
			arg0 += this.anInt581;
			@Pc(13) boolean local13 = false;
			@Pc(19) int local19 = arg2 + arg0 * Class5_Sub1_Sub2.anInt622;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt579;
			@Pc(27) int local27 = this.anInt578;
			@Pc(31) int local31 = Class5_Sub1_Sub2.anInt622 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class5_Sub1_Sub2.anInt624) {
				local40 = Class5_Sub1_Sub2.anInt624 - arg0;
				local24 -= local40;
				arg0 = Class5_Sub1_Sub2.anInt624;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg0 + local24 > Class5_Sub1_Sub2.anInt625) {
				local24 -= arg0 + local24 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg2 < Class5_Sub1_Sub2.anInt626) {
				local40 = Class5_Sub1_Sub2.anInt626 - arg2;
				local27 -= local40;
				arg2 = Class5_Sub1_Sub2.anInt626;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class5_Sub1_Sub2.anInt627) {
				local40 = arg2 + local27 - Class5_Sub1_Sub2.anInt627;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method279(Class5_Sub1_Sub2.anIntArray117, 0, local21, local24, local19, this.anIntArray112, local27, local31, local33);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("31350, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "([IIIII[IIIIIB)V")
	private void method279(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(12) int local12 = -arg3; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg6; local17 < 0; local17++) {
					@Pc(24) int local24 = arg5[arg2++];
					if (local24 == 0) {
						arg4++;
					} else {
						@Pc(30) int local30 = arg0[arg4];
						arg0[arg4++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg7;
				arg2 += arg8;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + 21 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(III[IIIIIII[I)V")
	public void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(7) int local7;
			if (this.anInt576 != -46326) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			try {
				local7 = -arg5 / 2;
				@Pc(22) int local22 = -arg0 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg7 >> 8;
				@Pc(52) int local52 = local40 * arg7 >> 8;
				@Pc(64) int local64 = (arg2 << 16) + local22 * local46 + local7 * local52;
				@Pc(76) int local76 = (arg1 << 16) + (local22 * local52 - local7 * local46);
				@Pc(82) int local82 = arg4 + arg6 * Class5_Sub1_Sub2.anInt622;
				for (@Pc(84) int local84 = 0; local84 < arg0; local84++) {
					@Pc(90) int local90 = arg3[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg9[local84]; local111 < 0; local111++) {
						Class5_Sub1_Sub2.anIntArray117[local94++] = this.anIntArray112[(local100 >> 16) + (local106 >> 16) * this.anInt578];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class5_Sub1_Sub2.anInt622;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("24236, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -46326 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(IIIIIZDII)V")
	public void method281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) double arg2) {
		try {
			try {
				@Pc(20) int local20 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(26) int local26 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(32) int local32 = local20 * 256 >> 8;
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(50) int local50 = local32 * -10 + local38 * -10 + 983040;
				@Pc(62) int local62 = local38 * -10 + 983040 - local32 * -10;
				@Pc(68) int local68 = arg1 + arg0 * Class5_Sub1_Sub2.anInt622;
				for (@Pc(70) int local70 = 0; local70 < 20; local70++) {
					@Pc(74) int local74 = local68;
					@Pc(76) int local76 = local50;
					@Pc(78) int local78 = local62;
					for (@Pc(81) int local81 = -20; local81 < 0; local81++) {
						@Pc(97) int local97 = this.anIntArray112[(local76 >> 16) + (local78 >> 16) * this.anInt578];
						if (local97 == 0) {
							local74++;
						} else {
							Class5_Sub1_Sub2.anIntArray117[local74++] = local97;
						}
						local76 += local38;
						local78 -= local32;
					}
					local50 += local32;
					local62 += local38;
					local68 += Class5_Sub1_Sub2.anInt622;
				}
			} catch (@Pc(136) Exception local136) {
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("24428, " + arg0 + ", " + 20 + ", " + arg1 + ", " + 15 + ", " + 256 + ", " + true + ", " + arg2 + ", " + 20 + ", " + 15 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(ILclient!VSJQVIFL;II)V")
	public void method282(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt580;
			arg0 += this.anInt581;
			@Pc(20) int local20 = arg2 + arg0 * Class5_Sub1_Sub2.anInt622;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt579;
			@Pc(28) int local28 = this.anInt578;
			@Pc(32) int local32 = Class5_Sub1_Sub2.anInt622 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg0 < Class5_Sub1_Sub2.anInt624) {
				local41 = Class5_Sub1_Sub2.anInt624 - arg0;
				local25 -= local41;
				arg0 = Class5_Sub1_Sub2.anInt624;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class5_Sub1_Sub2.anInt622;
			}
			if (arg0 + local25 > Class5_Sub1_Sub2.anInt625) {
				local25 -= arg0 + local25 - Class5_Sub1_Sub2.anInt625;
			}
			if (arg2 < Class5_Sub1_Sub2.anInt626) {
				local41 = Class5_Sub1_Sub2.anInt626 - arg2;
				local28 -= local41;
				arg2 = Class5_Sub1_Sub2.anInt626;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg2 + local28 > Class5_Sub1_Sub2.anInt627) {
				local41 = arg2 + local28 - Class5_Sub1_Sub2.anInt627;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method283(local22, local25, local20, this.anIntArray112, local34, Class5_Sub1_Sub2.anIntArray117, local28, arg1.aByteArray13, local32, 0);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("5870, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDMJJHOP", name = "a", descriptor = "(III[II[II[BIIB)V")
	private void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(15) int local15 = -(arg6 & 0x3);
			for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					local29 = arg3[arg0++];
					if (local29 != 0 && arg7[arg2] == 0) {
						arg5[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg3[arg0++];
					if (local29 != 0 && arg7[arg2] == 0) {
						arg5[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg3[arg0++];
					if (local29 != 0 && arg7[arg2] == 0) {
						arg5[arg2++] = local29;
					} else {
						arg2++;
					}
					local29 = arg3[arg0++];
					if (local29 != 0 && arg7[arg2] == 0) {
						arg5[arg2++] = local29;
					} else {
						arg2++;
					}
				}
				for (@Pc(105) int local105 = local15; local105 < 0; local105++) {
					local29 = arg3[arg0++];
					if (local29 != 0 && arg7[arg2] == 0) {
						arg5[arg2++] = local29;
					} else {
						arg2++;
					}
				}
				arg2 += arg8;
				arg0 += arg4;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("94947, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + -102 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
