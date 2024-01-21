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

@OriginalClass("client!VZJVQLEE")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!VZJVQLEE", name = "x", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!VZJVQLEE", name = "y", descriptor = "B")
	private byte aByte19 = 1;

	@OriginalMember(owner = "client!VZJVQLEE", name = "z", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!VZJVQLEE", name = "A", descriptor = "I")
	private int anInt632 = -462;

	@OriginalMember(owner = "client!VZJVQLEE", name = "B", descriptor = "I")
	private int anInt633 = 231;

	@OriginalMember(owner = "client!VZJVQLEE", name = "C", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!VZJVQLEE", name = "D", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!VZJVQLEE", name = "I", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!VZJVQLEE", name = "E", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!VZJVQLEE", name = "J", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!VZJVQLEE", name = "F", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!VZJVQLEE", name = "H", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!VZJVQLEE", name = "G", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray164 = new int[arg0 * arg1];
		this.anInt634 = this.anInt638 = arg0;
		this.anInt635 = this.anInt639 = arg1;
		this.anInt636 = this.anInt637 = 0;
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt634 = local20.getWidth(arg1);
			this.anInt635 = local20.getHeight(arg1);
			this.anInt638 = this.anInt634;
			this.anInt639 = this.anInt635;
			this.anInt636 = 0;
			this.anInt637 = 0;
			this.anIntArray164 = new int[this.anInt634 * this.anInt635];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt634, this.anInt635, this.anIntArray164, 0, this.anInt634);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "(Lclient!FUZJMGZB;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class2_Sub1_Sub3 local34 = new Class2_Sub1_Sub3((byte) 114, arg0.method186(arg1 + ".dat", null));
		@Pc(43) Class2_Sub1_Sub3 local43 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("index.dat", null));
		local43.anInt283 = local34.method269();
		this.anInt638 = local43.method269();
		this.anInt639 = local43.method269();
		@Pc(58) int local58 = local43.method267();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method271();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt283 += 2;
			local34.anInt283 += local43.method269() * local43.method269();
			local43.anInt283++;
		}
		this.anInt636 = local43.method267();
		this.anInt637 = local43.method267();
		this.anInt634 = local43.method269();
		this.anInt635 = local43.method269();
		@Pc(139) int local139 = local43.method267();
		@Pc(145) int local145 = this.anInt634 * this.anInt635;
		this.anIntArray164 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray164[local153] = local61[local34.method267()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt634; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt635; local177++) {
					this.anIntArray164[local153 + local177 * this.anInt634] = local61[local34.method267()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "b", descriptor = "(I)V")
	public void method477() {
		try {
			Class2_Sub1_Sub2.method545(this.anInt635, this.anInt634, this.anIntArray164);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("88786, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IBII)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray164.length; local3++) {
				@Pc(10) int local10 = this.anIntArray164[local3];
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
					this.anIntArray164[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			if (this.aByte19 != 1) {
				this.aBoolean153 = !this.aBoolean153;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("95362, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "c", descriptor = "(I)V")
	public void method479() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt638 * this.anInt639];
			for (@Pc(10) int local10 = 0; local10 < this.anInt635; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt634; local14++) {
					local8[(local10 + this.anInt637) * this.anInt638 + local14 + this.anInt636] = this.anIntArray164[local10 * this.anInt634 + local14];
				}
			}
			this.anIntArray164 = local8;
			this.anInt634 = this.anInt638;
			this.anInt635 = this.anInt639;
			this.anInt636 = 0;
			this.anInt637 = 0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("17689, " + -668 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(III)V")
	public void method480(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt636;
			arg1 += this.anInt637;
			@Pc(25) int local25 = arg0 + arg1 * Class2_Sub1_Sub2.anInt783;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt635;
			@Pc(33) int local33 = this.anInt634;
			@Pc(37) int local37 = Class2_Sub1_Sub2.anInt783 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class2_Sub1_Sub2.anInt785) {
				local46 = Class2_Sub1_Sub2.anInt785 - arg1;
				local30 -= local46;
				arg1 = Class2_Sub1_Sub2.anInt785;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg1 + local30 > Class2_Sub1_Sub2.anInt786) {
				local30 -= arg1 + local30 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt787) {
				local46 = Class2_Sub1_Sub2.anInt787 - arg0;
				local33 -= local46;
				arg0 = Class2_Sub1_Sub2.anInt787;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class2_Sub1_Sub2.anInt788) {
				local46 = arg0 + local33 - Class2_Sub1_Sub2.anInt788;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method481(this.anIntArray164, local39, 611, local25, local30, Class2_Sub1_Sub2.anIntArray204, local27, local33, local37);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("21841, " + 143 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "([IIIII[IIII)V")
	private void method481(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			@Pc(15) boolean local15 = false;
			for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg5[arg3++] = arg0[arg6++];
					arg5[arg3++] = arg0[arg6++];
					arg5[arg3++] = arg0[arg6++];
					arg5[arg3++] = arg0[arg6++];
				}
				for (@Pc(61) int local61 = local11; local61 < 0; local61++) {
					arg5[arg3++] = arg0[arg6++];
				}
				arg3 += arg8;
				arg6 += arg1;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("95686, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "b", descriptor = "(III)V")
	public void method482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt636;
			arg1 += this.anInt637;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub2.anInt783;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt635;
			@Pc(27) int local27 = this.anInt634;
			@Pc(31) int local31 = Class2_Sub1_Sub2.anInt783 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub2.anInt785) {
				local40 = Class2_Sub1_Sub2.anInt785 - arg1;
				local24 -= local40;
				arg1 = Class2_Sub1_Sub2.anInt785;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg1 + local24 > Class2_Sub1_Sub2.anInt786) {
				local24 -= arg1 + local24 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt787) {
				local40 = Class2_Sub1_Sub2.anInt787 - arg0;
				local27 -= local40;
				arg0 = Class2_Sub1_Sub2.anInt787;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class2_Sub1_Sub2.anInt788) {
				local40 = arg0 + local27 - Class2_Sub1_Sub2.anInt788;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method483(Class2_Sub1_Sub2.anIntArray204, this.anIntArray164, local17, local15, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("87378, " + -4899 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method483(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIII)V")
	public void method484(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt636;
			arg1 += this.anInt637;
			@Pc(18) int local18 = arg0 + arg1 * Class2_Sub1_Sub2.anInt783;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt635;
			@Pc(26) int local26 = this.anInt634;
			@Pc(30) int local30 = Class2_Sub1_Sub2.anInt783 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class2_Sub1_Sub2.anInt785) {
				local39 = Class2_Sub1_Sub2.anInt785 - arg1;
				local23 -= local39;
				arg1 = Class2_Sub1_Sub2.anInt785;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg1 + local23 > Class2_Sub1_Sub2.anInt786) {
				local23 -= arg1 + local23 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class2_Sub1_Sub2.anInt787) {
				local39 = Class2_Sub1_Sub2.anInt787 - arg0;
				local26 -= local39;
				arg0 = Class2_Sub1_Sub2.anInt787;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class2_Sub1_Sub2.anInt788) {
				local39 = arg0 + local26 - Class2_Sub1_Sub2.anInt788;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method485(local20, local26, local18, Class2_Sub1_Sub2.anIntArray204, local23, 0, local30, this.anIntArray164, local32);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("54448, " + 228 + ", " + 128 + ", " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(III[IIIII[IBI)V")
	private void method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg4; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg1; local13 < 0; local13++) {
					@Pc(20) int local20 = arg7[arg0++];
					if (local20 == 0) {
						arg2++;
					} else {
						@Pc(26) int local26 = arg3[arg2];
						arg3[arg2++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg6;
				arg0 += arg8;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("54927, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 3 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IZIII[II[IIII)V")
	public void method486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg7 / 2;
				@Pc(14) int local14 = -arg2 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg3 >> 8;
				@Pc(44) int local44 = local32 * arg3 >> 8;
				@Pc(56) int local56 = (arg8 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg1 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg9 + arg5 * Class2_Sub1_Sub2.anInt783;
				for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
					@Pc(82) int local82 = arg4[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg6[local76]; local103 < 0; local103++) {
						Class2_Sub1_Sub2.anIntArray204[local86++] = this.anIntArray164[(local92 >> 16) + (local98 >> 16) * this.anInt634];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class2_Sub1_Sub2.anInt783;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("9977, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIIIDIIII)V")
	public void method487(@OriginalArg(4) double arg0, @OriginalArg(7) int arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(20) int local20 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(26) int local26 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(32) int local32 = local20 * 256 >> 8;
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(50) int local50 = local32 * -10 + local38 * -10 + 983040;
				@Pc(62) int local62 = local38 * -10 + 983040 - local32 * -10;
				@Pc(68) int local68 = arg2 + arg1 * Class2_Sub1_Sub2.anInt783;
				for (@Pc(70) int local70 = 0; local70 < 20; local70++) {
					@Pc(74) int local74 = local68;
					@Pc(76) int local76 = local50;
					@Pc(78) int local78 = local62;
					for (@Pc(81) int local81 = -20; local81 < 0; local81++) {
						@Pc(97) int local97 = this.anIntArray164[(local76 >> 16) + (local78 >> 16) * this.anInt634];
						if (local97 == 0) {
							local74++;
						} else {
							Class2_Sub1_Sub2.anIntArray204[local74++] = local97;
						}
						local76 += local38;
						local78 -= local32;
					}
					local50 += local32;
					local62 += local38;
					local68 += Class2_Sub1_Sub2.anInt783;
				}
			} catch (@Pc(136) Exception local136) {
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("41816, " + 15 + ", " + 20 + ", " + 15 + ", " + 20 + ", " + arg0 + ", " + 460 + ", " + 256 + ", " + arg1 + ", " + arg2 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIBLclient!ZQSBFHWZ;)V")
	public void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub2_Sub3 arg2) {
		try {
			arg1 += this.anInt636;
			arg0 += this.anInt637;
			@Pc(19) int local19 = arg1 + arg0 * Class2_Sub1_Sub2.anInt783;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt635;
			@Pc(27) int local27 = this.anInt634;
			@Pc(31) int local31 = Class2_Sub1_Sub2.anInt783 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class2_Sub1_Sub2.anInt785) {
				local40 = Class2_Sub1_Sub2.anInt785 - arg0;
				local24 -= local40;
				arg0 = Class2_Sub1_Sub2.anInt785;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg0 + local24 > Class2_Sub1_Sub2.anInt786) {
				local24 -= arg0 + local24 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg1 < Class2_Sub1_Sub2.anInt787) {
				local40 = Class2_Sub1_Sub2.anInt787 - arg1;
				local27 -= local40;
				arg1 = Class2_Sub1_Sub2.anInt787;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class2_Sub1_Sub2.anInt788) {
				local40 = arg1 + local27 - Class2_Sub1_Sub2.anInt788;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method489(local31, this.anIntArray164, arg2.aByteArray19, 0, local21, local33, Class2_Sub1_Sub2.anIntArray204, local19, local24, local27);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("34400, " + arg0 + ", " + arg1 + ", " + -9 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(I[I[BIIIZ[IIII)V")
	private void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg9 >> 2);
			@Pc(11) int local11 = -(arg9 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg1[arg4++];
					if (local25 != 0 && arg2[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg1[arg4++];
					if (local25 != 0 && arg2[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg1[arg4++];
					if (local25 != 0 && arg2[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg1[arg4++];
					if (local25 != 0 && arg2[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg1[arg4++];
					if (local25 != 0 && arg2[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				arg7 += arg0;
				arg4 += arg5;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("10599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
