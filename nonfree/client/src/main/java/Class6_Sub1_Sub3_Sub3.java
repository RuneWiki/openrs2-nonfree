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

@OriginalClass("client!WQACZBNG")
public final class Class6_Sub1_Sub3_Sub3 extends Class6_Sub1_Sub3 {

	@OriginalMember(owner = "client!WQACZBNG", name = "z", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!WQACZBNG", name = "A", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!WQACZBNG", name = "B", descriptor = "I")
	private int anInt722 = -32312;

	@OriginalMember(owner = "client!WQACZBNG", name = "C", descriptor = "B")
	private byte aByte51 = -8;

	@OriginalMember(owner = "client!WQACZBNG", name = "D", descriptor = "I")
	private int anInt723 = -234;

	@OriginalMember(owner = "client!WQACZBNG", name = "E", descriptor = "I")
	private int anInt724 = -877;

	@OriginalMember(owner = "client!WQACZBNG", name = "F", descriptor = "I")
	private int anInt725 = 2;

	@OriginalMember(owner = "client!WQACZBNG", name = "G", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!WQACZBNG", name = "L", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!WQACZBNG", name = "H", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!WQACZBNG", name = "M", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!WQACZBNG", name = "I", descriptor = "I")
	public int anInt727;

	@OriginalMember(owner = "client!WQACZBNG", name = "K", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!WQACZBNG", name = "J", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "(II)V")
	public Class6_Sub1_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray193 = new int[arg0 * arg1];
		this.anInt726 = this.anInt730 = arg0;
		this.anInt727 = this.anInt731 = arg1;
		this.anInt728 = this.anInt729 = 0;
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class6_Sub1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt726 = local26.getWidth(arg1);
			this.anInt727 = local26.getHeight(arg1);
			this.anInt730 = this.anInt726;
			this.anInt731 = this.anInt727;
			this.anInt728 = 0;
			this.anInt729 = 0;
			this.anIntArray193 = new int[this.anInt726 * this.anInt727];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt726, this.anInt727, this.anIntArray193, 0, this.anInt726);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "(Lclient!XOJZVVDK;Ljava/lang/String;I)V")
	public Class6_Sub1_Sub3_Sub3(@OriginalArg(0) Class43 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class6_Sub1_Sub4 local40 = new Class6_Sub1_Sub4(888, arg0.method518(arg1 + ".dat", (byte[]) null));
		@Pc(49) Class6_Sub1_Sub4 local49 = new Class6_Sub1_Sub4(888, arg0.method518("index.dat", (byte[]) null));
		local49.anInt390 = local40.method241();
		this.anInt730 = local49.method241();
		this.anInt731 = local49.method241();
		@Pc(64) int local64 = local49.method239();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method243();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt390 += 2;
			local40.anInt390 += local49.method241() * local49.method241();
			local49.anInt390++;
		}
		this.anInt728 = local49.method239();
		this.anInt729 = local49.method239();
		this.anInt726 = local49.method241();
		this.anInt727 = local49.method241();
		@Pc(151) int local151 = local49.method239();
		@Pc(157) int local157 = this.anInt726 * this.anInt727;
		this.anIntArray193 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray193[local165] = local67[local40.method239()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt726; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt727; local189++) {
					this.anIntArray193[local165 + local189 * this.anInt726] = local67[local40.method239()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "b", descriptor = "(I)V")
	public void method501() {
		try {
			Class6_Sub1_Sub3.method544(this.anInt727, this.anInt726, this.anIntArray193);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("83185, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(ZIII)V")
	public void method502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray193.length; local3++) {
				@Pc(10) int local10 = this.anIntArray193[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg1;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg0;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg2;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray193[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("76866, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "b", descriptor = "(Z)V")
	public void method503() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt730 * this.anInt731];
			for (@Pc(10) int local10 = 0; local10 < this.anInt727; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt726; local14++) {
					local8[(local10 + this.anInt729) * this.anInt730 + local14 + this.anInt728] = this.anIntArray193[local10 * this.anInt726 + local14];
				}
			}
			this.anIntArray193 = local8;
			this.anInt726 = this.anInt730;
			this.anInt727 = this.anInt731;
			this.anInt728 = 0;
			this.anInt729 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("51571, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(BII)V")
	public void method504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt728;
			arg1 += this.anInt729;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub1_Sub3.anInt785;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt727;
			@Pc(23) int local23 = this.anInt726;
			@Pc(27) int local27 = Class6_Sub1_Sub3.anInt785 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class6_Sub1_Sub3.anInt787) {
				local36 = Class6_Sub1_Sub3.anInt787 - arg1;
				local20 -= local36;
				arg1 = Class6_Sub1_Sub3.anInt787;
				local17 = 0 + local36 * local23;
				local15 += local36 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg1 + local20 > Class6_Sub1_Sub3.anInt788) {
				local20 -= arg1 + local20 - Class6_Sub1_Sub3.anInt788;
			}
			if (arg0 < Class6_Sub1_Sub3.anInt789) {
				local36 = Class6_Sub1_Sub3.anInt789 - arg0;
				local23 -= local36;
				arg0 = Class6_Sub1_Sub3.anInt789;
				local17 += local36;
				local15 += local36;
				local29 = 0 + local36;
				local27 += local36;
			}
			if (arg0 + local23 > Class6_Sub1_Sub3.anInt790) {
				local36 = arg0 + local23 - Class6_Sub1_Sub3.anInt790;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method505(local20, local15, local17, this.anIntArray193, local27, local23, this.aByte51, local29, Class6_Sub1_Sub3.anIntArray204);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("88663, " + -49 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(III[IIIBI[I)V")
	private void method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			if (arg6 != -8) {
				this.anInt725 = -127;
			}
			@Pc(12) int local12 = -(arg5 >> 2);
			@Pc(17) int local17 = -(arg5 & 0x3);
			for (@Pc(20) int local20 = -arg0; local20 < 0; local20++) {
				for (@Pc(24) int local24 = local12; local24 < 0; local24++) {
					arg8[arg1++] = arg3[arg2++];
					arg8[arg1++] = arg3[arg2++];
					arg8[arg1++] = arg3[arg2++];
					arg8[arg1++] = arg3[arg2++];
				}
				for (@Pc(63) int local63 = local17; local63 < 0; local63++) {
					arg8[arg1++] = arg3[arg2++];
				}
				arg1 += arg4;
				arg2 += arg7;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("91973, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(III)V")
	public void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt728;
			arg0 += this.anInt729;
			@Pc(15) int local15 = arg1 + arg0 * Class6_Sub1_Sub3.anInt785;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt727;
			@Pc(23) int local23 = this.anInt726;
			@Pc(27) int local27 = Class6_Sub1_Sub3.anInt785 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class6_Sub1_Sub3.anInt787) {
				local36 = Class6_Sub1_Sub3.anInt787 - arg0;
				local20 -= local36;
				arg0 = Class6_Sub1_Sub3.anInt787;
				local17 = 0 + local36 * local23;
				local15 += local36 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg0 + local20 > Class6_Sub1_Sub3.anInt788) {
				local20 -= arg0 + local20 - Class6_Sub1_Sub3.anInt788;
			}
			if (arg1 < Class6_Sub1_Sub3.anInt789) {
				local36 = Class6_Sub1_Sub3.anInt789 - arg1;
				local23 -= local36;
				arg1 = Class6_Sub1_Sub3.anInt789;
				local17 += local36;
				local15 += local36;
				local29 = 0 + local36;
				local27 += local36;
			}
			if (arg1 + local23 > Class6_Sub1_Sub3.anInt790) {
				local36 = arg1 + local23 - Class6_Sub1_Sub3.anInt790;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method507(Class6_Sub1_Sub3.anIntArray204, this.anIntArray193, local17, local15, local23, local20, local27, local29);
				if (arg2 >= 0) {
					for (local36 = 1; local36 > 0; local36++) {
					}
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("37141, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method507(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IIIZ)V")
	public void method508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt728;
			arg1 += this.anInt729;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub1_Sub3.anInt785;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt727;
			@Pc(23) int local23 = this.anInt726;
			@Pc(27) int local27 = Class6_Sub1_Sub3.anInt785 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class6_Sub1_Sub3.anInt787) {
				local36 = Class6_Sub1_Sub3.anInt787 - arg1;
				local20 -= local36;
				arg1 = Class6_Sub1_Sub3.anInt787;
				local17 = 0 + local36 * local23;
				local15 += local36 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg1 + local20 > Class6_Sub1_Sub3.anInt788) {
				local20 -= arg1 + local20 - Class6_Sub1_Sub3.anInt788;
			}
			if (arg0 < Class6_Sub1_Sub3.anInt789) {
				local36 = Class6_Sub1_Sub3.anInt789 - arg0;
				local23 -= local36;
				arg0 = Class6_Sub1_Sub3.anInt789;
				local17 += local36;
				local15 += local36;
				local29 = 0 + local36;
				local27 += local36;
			}
			if (arg0 + local23 > Class6_Sub1_Sub3.anInt790) {
				local36 = arg0 + local23 - Class6_Sub1_Sub3.anInt790;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method509(0, local20, Class6_Sub1_Sub3.anIntArray204, local15, local27, local29, local17, local23, this.anIntArray193);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("8961, " + arg0 + ", " + 128 + ", " + arg1 + ", " + false + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(II[IIIIIII[II)V")
	private void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			for (@Pc(17) int local17 = -arg1; local17 < 0; local17++) {
				for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
					@Pc(29) int local29 = arg8[arg6++];
					if (local29 == 0) {
						arg3++;
					} else {
						@Pc(35) int local35 = arg2[arg3];
						arg2[arg3++] = ((local29 & 0xFF00FF) * 128 + (local35 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local29 & 0xFF00) * 128 + (local35 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg3 += arg4;
				arg6 += arg5;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("8965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(II[IIIII[IIII)V")
	public void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(13) int local13 = -arg4 / 2;
				@Pc(18) int local18 = -arg7 / 2;
				@Pc(27) int local27 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
				@Pc(36) int local36 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
				@Pc(42) int local42 = local27 * arg1 >> 8;
				@Pc(48) int local48 = local36 * arg1 >> 8;
				@Pc(60) int local60 = (arg5 << 16) + local18 * local42 + local13 * local48;
				@Pc(72) int local72 = (arg9 << 16) + (local18 * local48 - local13 * local42);
				@Pc(78) int local78 = arg8 + arg0 * Class6_Sub1_Sub3.anInt785;
				for (@Pc(80) int local80 = 0; local80 < arg7; local80++) {
					@Pc(86) int local86 = arg2[local80];
					@Pc(90) int local90 = local78 + local86;
					@Pc(96) int local96 = local60 + local48 * local86;
					@Pc(102) int local102 = local72 - local42 * local86;
					for (@Pc(107) int local107 = -arg6[local80]; local107 < 0; local107++) {
						Class6_Sub1_Sub3.anIntArray204[local90++] = this.anIntArray193[(local96 >> 16) + (local102 >> 16) * this.anInt726];
						local96 += local48;
						local102 -= local42;
					}
					local60 += local42;
					local72 += local48;
					local78 += Class6_Sub1_Sub3.anInt785;
				}
			} catch (@Pc(155) Exception local155) {
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("14843, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 1 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IIIIDIIII)V")
	public void method511(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = 983040 + -10 * local33 + -10 * local39;
				@Pc(63) int local63 = 983040 + (-10 * local39 - -10 * local33);
				@Pc(69) int local69 = arg1 + arg0 * Class6_Sub1_Sub3.anInt785;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray193[(local77 >> 16) + (local79 >> 16) * this.anInt726];
						if (local98 == 0) {
							local75++;
						} else {
							Class6_Sub1_Sub3.anIntArray204[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class6_Sub1_Sub3.anInt785;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("66421, " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + 256 + ", " + -19836 + ", " + 15 + ", " + 20 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IZILclient!VEIVHFHZ;)V")
	public void method512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1_Sub3_Sub2 arg2) {
		try {
			arg1 += this.anInt728;
			arg0 += this.anInt729;
			@Pc(15) int local15 = arg1 + arg0 * Class6_Sub1_Sub3.anInt785;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt727;
			@Pc(26) int local26 = this.anInt726;
			@Pc(30) int local30 = Class6_Sub1_Sub3.anInt785 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class6_Sub1_Sub3.anInt787) {
				local39 = Class6_Sub1_Sub3.anInt787 - arg0;
				local23 -= local39;
				arg0 = Class6_Sub1_Sub3.anInt787;
				local17 = 0 + local39 * local26;
				local15 += local39 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg0 + local23 > Class6_Sub1_Sub3.anInt788) {
				local23 -= arg0 + local23 - Class6_Sub1_Sub3.anInt788;
			}
			if (arg1 < Class6_Sub1_Sub3.anInt789) {
				local39 = Class6_Sub1_Sub3.anInt789 - arg1;
				local26 -= local39;
				arg1 = Class6_Sub1_Sub3.anInt789;
				local17 += local39;
				local15 += local39;
				local32 = 0 + local39;
				local30 += local39;
			}
			if (arg1 + local26 > Class6_Sub1_Sub3.anInt790) {
				local39 = arg1 + local26 - Class6_Sub1_Sub3.anInt790;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method513(local32, this.anIntArray193, Class6_Sub1_Sub3.anIntArray204, arg2.aByteArray18, 0, local17, local15, local26, local30, local23);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("13498, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(I[I[I[BIIIIIII)V")
	private void method513(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(18) int local18 = -(arg7 >> 2);
			@Pc(23) int local23 = -(arg7 & 0x3);
			for (@Pc(26) int local26 = -arg9; local26 < 0; local26++) {
				@Pc(37) int local37;
				for (@Pc(30) int local30 = local18; local30 < 0; local30++) {
					local37 = arg1[arg5++];
					if (local37 != 0 && arg3[arg6] == 0) {
						arg2[arg6++] = local37;
					} else {
						arg6++;
					}
					local37 = arg1[arg5++];
					if (local37 != 0 && arg3[arg6] == 0) {
						arg2[arg6++] = local37;
					} else {
						arg6++;
					}
					local37 = arg1[arg5++];
					if (local37 != 0 && arg3[arg6] == 0) {
						arg2[arg6++] = local37;
					} else {
						arg6++;
					}
					local37 = arg1[arg5++];
					if (local37 != 0 && arg3[arg6] == 0) {
						arg2[arg6++] = local37;
					} else {
						arg6++;
					}
				}
				for (@Pc(113) int local113 = local23; local113 < 0; local113++) {
					local37 = arg1[arg5++];
					if (local37 != 0 && arg3[arg6] == 0) {
						arg2[arg6++] = local37;
					} else {
						arg6++;
					}
				}
				arg6 += arg8;
				arg5 += arg0;
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("45502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -416 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}
}
