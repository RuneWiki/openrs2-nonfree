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

@OriginalClass("client!TFHGRYAS")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!TFHGRYAS", name = "A", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!TFHGRYAS", name = "C", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!TFHGRYAS", name = "y", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!TFHGRYAS", name = "z", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!TFHGRYAS", name = "B", descriptor = "I")
	private int anInt522 = -224;

	@OriginalMember(owner = "client!TFHGRYAS", name = "D", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!TFHGRYAS", name = "E", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!TFHGRYAS", name = "J", descriptor = "I")
	public int anInt528;

	@OriginalMember(owner = "client!TFHGRYAS", name = "F", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!TFHGRYAS", name = "K", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!TFHGRYAS", name = "G", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!TFHGRYAS", name = "I", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!TFHGRYAS", name = "H", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray156 = new int[arg0 * arg1];
		this.anInt524 = this.anInt528 = arg0;
		this.anInt525 = this.anInt529 = arg1;
		this.anInt526 = this.anInt527 = 0;
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt524 = local17.getWidth(arg1);
			this.anInt525 = local17.getHeight(arg1);
			this.anInt528 = this.anInt524;
			this.anInt529 = this.anInt525;
			this.anInt526 = 0;
			this.anInt527 = 0;
			this.anIntArray156 = new int[this.anInt524 * this.anInt525];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt524, this.anInt525, this.anIntArray156, 0, this.anInt524);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "<init>", descriptor = "(Lclient!MAARFNGV;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class2_Sub1_Sub3 local31 = new Class2_Sub1_Sub3(arg0.method218(arg1 + ".dat", null), true);
		@Pc(40) Class2_Sub1_Sub3 local40 = new Class2_Sub1_Sub3(arg0.method218("index.dat", null), true);
		local40.anInt136 = local31.method99();
		this.anInt528 = local40.method99();
		this.anInt529 = local40.method99();
		@Pc(55) int local55 = local40.method97();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method101();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			local40.anInt136 += 2;
			local31.anInt136 += local40.method99() * local40.method99();
			local40.anInt136++;
		}
		this.anInt526 = local40.method97();
		this.anInt527 = local40.method97();
		this.anInt524 = local40.method99();
		this.anInt525 = local40.method99();
		@Pc(136) int local136 = local40.method97();
		@Pc(142) int local142 = this.anInt524 * this.anInt525;
		this.anIntArray156 = new int[local142];
		@Pc(150) int local150;
		if (local136 == 0) {
			for (local150 = 0; local150 < local142; local150++) {
				this.anIntArray156[local150] = local58[local31.method97()];
			}
		} else if (local136 == 1) {
			for (local150 = 0; local150 < this.anInt524; local150++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt525; local174++) {
					this.anIntArray156[local150 + local174 * this.anInt524] = local58[local31.method97()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "b", descriptor = "(I)V")
	public void method355() {
		try {
			Class2_Sub1_Sub1.method431(this.anInt524, this.anInt525, this.anIntArray156);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("9229, " + 422 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIZI)V")
	public void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray156.length; local3++) {
				@Pc(10) int local10 = this.anIntArray156[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg0;
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
					local60 += arg1;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray156[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("43825, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(B)V")
	public void method357(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(16) int[] local16 = new int[this.anInt528 * this.anInt529];
			for (@Pc(18) int local18 = 0; local18 < this.anInt525; local18++) {
				for (@Pc(22) int local22 = 0; local22 < this.anInt524; local22++) {
					local16[(local18 + this.anInt527) * this.anInt528 + local22 + this.anInt526] = this.anIntArray156[local18 * this.anInt524 + local22];
				}
			}
			this.anIntArray156 = local16;
			this.anInt524 = this.anInt528;
			this.anInt525 = this.anInt529;
			this.anInt526 = 0;
			this.anInt527 = 0;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("19477, " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(III)V")
	public void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg0 <= 0) {
				this.anInt523 = -153;
			}
			arg1 += this.anInt526;
			arg2 += this.anInt527;
			@Pc(20) int local20 = arg1 + arg2 * Class2_Sub1_Sub1.anInt637;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt525;
			@Pc(28) int local28 = this.anInt524;
			@Pc(32) int local32 = Class2_Sub1_Sub1.anInt637 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg2 < Class2_Sub1_Sub1.anInt639) {
				local41 = Class2_Sub1_Sub1.anInt639 - arg2;
				local25 -= local41;
				arg2 = Class2_Sub1_Sub1.anInt639;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg2 + local25 > Class2_Sub1_Sub1.anInt640) {
				local25 -= arg2 + local25 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg1 < Class2_Sub1_Sub1.anInt641) {
				local41 = Class2_Sub1_Sub1.anInt641 - arg1;
				local28 -= local41;
				arg1 = Class2_Sub1_Sub1.anInt641;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class2_Sub1_Sub1.anInt642) {
				local41 = arg1 + local28 - Class2_Sub1_Sub1.anInt642;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method359(Class2_Sub1_Sub1.anIntArray172, local28, local22, this.anIntArray156, local25, local32, local34, local20);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("46115, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "([III[IIIIII)V")
	private void method359(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(24) int local24 = -arg4; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg0[arg7++] = arg3[arg2++];
					arg0[arg7++] = arg3[arg2++];
					arg0[arg7++] = arg3[arg2++];
					arg0[arg7++] = arg3[arg2++];
				}
				for (@Pc(67) int local67 = local11; local67 < 0; local67++) {
					arg0[arg7++] = arg3[arg2++];
				}
				arg7 += arg5;
				arg2 += arg6;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("19625, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -18757 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "b", descriptor = "(III)V")
	public void method360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt526;
			arg1 += this.anInt527;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub1.anInt637;
			@Pc(17) int local17 = 0;
			@Pc(26) int local26 = this.anInt525;
			@Pc(29) int local29 = this.anInt524;
			@Pc(33) int local33 = Class2_Sub1_Sub1.anInt637 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg1 < Class2_Sub1_Sub1.anInt639) {
				local42 = Class2_Sub1_Sub1.anInt639 - arg1;
				local26 -= local42;
				arg1 = Class2_Sub1_Sub1.anInt639;
				local17 = local42 * local29 + 0;
				local15 += local42 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg1 + local26 > Class2_Sub1_Sub1.anInt640) {
				local26 -= arg1 + local26 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt641) {
				local42 = Class2_Sub1_Sub1.anInt641 - arg0;
				local29 -= local42;
				arg0 = Class2_Sub1_Sub1.anInt641;
				local17 += local42;
				local15 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg0 + local29 > Class2_Sub1_Sub1.anInt642) {
				local42 = arg0 + local29 - Class2_Sub1_Sub1.anInt642;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method361(Class2_Sub1_Sub1.anIntArray172, this.anIntArray156, local17, local15, local29, local26, local33, local35);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("898, " + -24669 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method361(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIBI)V")
	public void method362(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt526;
			arg1 += this.anInt527;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub1.anInt637;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt525;
			@Pc(23) int local23 = this.anInt524;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt637 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt639) {
				local40 = Class2_Sub1_Sub1.anInt639 - arg1;
				local20 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt639;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg1 + local20 > Class2_Sub1_Sub1.anInt640) {
				local20 -= arg1 + local20 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt641) {
				local40 = Class2_Sub1_Sub1.anInt641 - arg0;
				local23 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt641;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt642) {
				local40 = arg0 + local23 - Class2_Sub1_Sub1.anInt642;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method363(local17, 0, local20, this.anIntArray156, local23, local15, Class2_Sub1_Sub1.anIntArray172, local29, local27);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("23584, " + arg0 + ", " + 128 + ", " + 5 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIII[III[IIZI)V")
	private void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg2; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg4; local16 < 0; local16++) {
					@Pc(23) int local23 = arg3[arg0++];
					if (local23 == 0) {
						arg5++;
					} else {
						@Pc(29) int local29 = arg6[arg5];
						arg6[arg5++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg8;
				arg0 += arg7;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("81298, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + false + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIII[IIIIBI[I)V")
	public void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(16) int local16 = -arg3 / 2;
				@Pc(21) int local21 = -arg5 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg9 >> 8;
				@Pc(51) int local51 = local39 * arg9 >> 8;
				@Pc(63) int local63 = (arg6 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg2 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg7 + arg1 * Class2_Sub1_Sub1.anInt637;
				for (@Pc(83) int local83 = 0; local83 < arg5; local83++) {
					@Pc(89) int local89 = arg4[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg10[local83]; local110 < 0; local110++) {
						Class2_Sub1_Sub1.anIntArray172[local93++] = this.anIntArray156[(local99 >> 16) + (local105 >> 16) * this.anInt524];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class2_Sub1_Sub1.anInt637;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("2969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIIIIIIDI)V")
	public void method365(@OriginalArg(5) int arg0, @OriginalArg(7) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(22) int local22 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(28) int local28 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(34) int local34 = local22 * 256 >> 8;
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
				@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
				@Pc(70) int local70 = arg0 + arg2 * Class2_Sub1_Sub1.anInt637;
				for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
					@Pc(76) int local76 = local70;
					@Pc(78) int local78 = local52;
					@Pc(80) int local80 = local64;
					for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
						@Pc(99) int local99 = this.anIntArray156[(local78 >> 16) + (local80 >> 16) * this.anInt524];
						if (local99 == 0) {
							local76++;
						} else {
							Class2_Sub1_Sub1.anIntArray172[local76++] = local99;
						}
						local78 += local40;
						local80 -= local34;
					}
					local52 += local34;
					local64 += local40;
					local70 += Class2_Sub1_Sub1.anInt637;
				}
			} catch (@Pc(138) Exception local138) {
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("25267, " + 15 + ", " + 15 + ", " + 0 + ", " + 20 + ", " + 256 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IILclient!CMELCUKG;I)V")
	public void method366(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt526;
			arg2 += this.anInt527;
			@Pc(15) int local15 = arg0 + arg2 * Class2_Sub1_Sub1.anInt637;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt525;
			@Pc(23) int local23 = this.anInt524;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt637 - local23;
			@Pc(29) int local29 = 0;
			@Pc(41) int local41;
			if (arg2 < Class2_Sub1_Sub1.anInt639) {
				local41 = Class2_Sub1_Sub1.anInt639 - arg2;
				local20 -= local41;
				arg2 = Class2_Sub1_Sub1.anInt639;
				local17 = local41 * local23 + 0;
				local15 += local41 * Class2_Sub1_Sub1.anInt637;
			}
			if (arg2 + local20 > Class2_Sub1_Sub1.anInt640) {
				local20 -= arg2 + local20 - Class2_Sub1_Sub1.anInt640;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt641) {
				local41 = Class2_Sub1_Sub1.anInt641 - arg0;
				local23 -= local41;
				arg0 = Class2_Sub1_Sub1.anInt641;
				local17 += local41;
				local15 += local41;
				local29 = local41 + 0;
				local27 += local41;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt642) {
				local41 = arg0 + local23 - Class2_Sub1_Sub1.anInt642;
				local23 -= local41;
				local29 += local41;
				local27 += local41;
			}
			if (local23 > 0 && local20 > 0) {
				this.method367(local17, local20, local23, local15, local27, Class2_Sub1_Sub1.anIntArray172, 0, local29, arg1.aByteArray9, this.anIntArray156);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("4753, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFHGRYAS", name = "a", descriptor = "(IIIIII[III[B[I)V")
	private void method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg9[arg0++];
					if (local25 != 0 && arg8[arg3] == 0) {
						arg5[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg9[arg0++];
					if (local25 != 0 && arg8[arg3] == 0) {
						arg5[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg9[arg0++];
					if (local25 != 0 && arg8[arg3] == 0) {
						arg5[arg3++] = local25;
					} else {
						arg3++;
					}
					local25 = arg9[arg0++];
					if (local25 != 0 && arg8[arg3] == 0) {
						arg5[arg3++] = local25;
					} else {
						arg3++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg9[arg0++];
					if (local25 != 0 && arg8[arg3] == 0) {
						arg5[arg3++] = local25;
					} else {
						arg3++;
					}
				}
				arg3 += arg4;
				arg0 += arg7;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("86093, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
