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

@OriginalClass("client!WSNKRVXZ")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!WSNKRVXZ", name = "C", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "z", descriptor = "I")
	private int anInt767 = 6;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "A", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "B", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "D", descriptor = "I")
	private int anInt769 = 44;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "E", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "J", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "F", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "K", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "G", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "I", descriptor = "I")
	private int anInt773;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "H", descriptor = "I")
	private int anInt772;

	@OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray182 = new int[arg0 * arg1];
		this.anInt770 = this.anInt774 = arg0;
		this.anInt771 = this.anInt775 = arg1;
		this.anInt772 = this.anInt773 = 0;
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt770 = local17.getWidth(arg1);
			this.anInt771 = local17.getHeight(arg1);
			this.anInt774 = this.anInt770;
			this.anInt775 = this.anInt771;
			this.anInt772 = 0;
			this.anInt773 = 0;
			this.anIntArray182 = new int[this.anInt770 * this.anInt771];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt770, this.anInt771, this.anIntArray182, 0, this.anInt770);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "(Lclient!RPFMUSNN;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class3_Sub1_Sub4 local31 = new Class3_Sub1_Sub4((byte) -58, arg0.method341(arg1 + ".dat", null));
		@Pc(40) Class3_Sub1_Sub4 local40 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("index.dat", null));
		local40.anInt666 = local31.method460();
		this.anInt774 = local40.method460();
		this.anInt775 = local40.method460();
		@Pc(55) int local55 = local40.method458();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method462();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			local40.anInt666 += 2;
			local31.anInt666 += local40.method460() * local40.method460();
			local40.anInt666++;
		}
		this.anInt772 = local40.method458();
		this.anInt773 = local40.method458();
		this.anInt770 = local40.method460();
		this.anInt771 = local40.method460();
		@Pc(136) int local136 = local40.method458();
		@Pc(142) int local142 = this.anInt770 * this.anInt771;
		this.anIntArray182 = new int[local142];
		@Pc(150) int local150;
		if (local136 == 0) {
			for (local150 = 0; local150 < local142; local150++) {
				this.anIntArray182[local150] = local58[local31.method458()];
			}
		} else if (local136 == 1) {
			for (local150 = 0; local150 < this.anInt770; local150++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt771; local174++) {
					this.anIntArray182[local150 + local174 * this.anInt770] = local58[local31.method458()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(Z)V")
	public void method528(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				Class3_Sub1_Sub2.method516(this.anIntArray182, this.anInt770, this.anInt771);
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("47329, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIII)V")
	public void method529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray182.length; local3++) {
				@Pc(10) int local10 = this.anIntArray182[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg1;
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
					this.anIntArray182[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("15705, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "c", descriptor = "(I)V")
	public void method530() {
		try {
			@Pc(18) int[] local18 = new int[this.anInt774 * this.anInt775];
			for (@Pc(20) int local20 = 0; local20 < this.anInt771; local20++) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt770; local24++) {
					local18[(local20 + this.anInt773) * this.anInt774 + local24 + this.anInt772] = this.anIntArray182[local20 * this.anInt770 + local24];
				}
			}
			this.anIntArray182 = local18;
			this.anInt770 = this.anInt774;
			this.anInt771 = this.anInt775;
			this.anInt772 = 0;
			this.anInt773 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("11266, " + 6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(III)V")
	public void method531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt772;
			arg0 += this.anInt773;
			@Pc(28) int local28 = arg1 + arg0 * Class3_Sub1_Sub2.anInt758;
			@Pc(30) int local30 = 0;
			@Pc(33) int local33 = this.anInt771;
			@Pc(36) int local36 = this.anInt770;
			@Pc(40) int local40 = Class3_Sub1_Sub2.anInt758 - local36;
			@Pc(42) int local42 = 0;
			@Pc(49) int local49;
			if (arg0 < Class3_Sub1_Sub2.anInt760) {
				local49 = Class3_Sub1_Sub2.anInt760 - arg0;
				local33 -= local49;
				arg0 = Class3_Sub1_Sub2.anInt760;
				local30 = local49 * local36 + 0;
				local28 += local49 * Class3_Sub1_Sub2.anInt758;
			}
			if (arg0 + local33 > Class3_Sub1_Sub2.anInt761) {
				local33 -= arg0 + local33 - Class3_Sub1_Sub2.anInt761;
			}
			if (arg1 < Class3_Sub1_Sub2.anInt762) {
				local49 = Class3_Sub1_Sub2.anInt762 - arg1;
				local36 -= local49;
				arg1 = Class3_Sub1_Sub2.anInt762;
				local30 += local49;
				local28 += local49;
				local42 = local49 + 0;
				local40 += local49;
			}
			if (arg1 + local36 > Class3_Sub1_Sub2.anInt763) {
				local49 = arg1 + local36 - Class3_Sub1_Sub2.anInt763;
				local36 -= local49;
				local42 += local49;
				local40 += local49;
			}
			if (local36 > 0 && local33 > 0) {
				this.method532(this.anIntArray182, Class3_Sub1_Sub2.anIntArray181, local28, local30, local40, local42, local36, local33);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("3269, " + 6 + ", " + arg0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([II[IIIIIII)V")
	private void method532(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					arg1[arg2++] = arg0[arg3++];
					arg1[arg2++] = arg0[arg3++];
					arg1[arg2++] = arg0[arg3++];
					arg1[arg2++] = arg0[arg3++];
				}
				for (@Pc(62) int local62 = local11; local62 < 0; local62++) {
					arg1[arg2++] = arg0[arg3++];
				}
				arg2 += arg4;
				arg3 += arg5;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("96039, " + arg0 + ", " + -639 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(ZII)V")
	public void method533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt772;
			arg1 += this.anInt773;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub2.anInt758;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt771;
			@Pc(23) int local23 = this.anInt770;
			@Pc(27) int local27 = Class3_Sub1_Sub2.anInt758 - local23;
			@Pc(29) int local29 = 0;
			@Pc(41) int local41;
			if (arg1 < Class3_Sub1_Sub2.anInt760) {
				local41 = Class3_Sub1_Sub2.anInt760 - arg1;
				local20 -= local41;
				arg1 = Class3_Sub1_Sub2.anInt760;
				local17 = local41 * local23 + 0;
				local15 += local41 * Class3_Sub1_Sub2.anInt758;
			}
			if (arg1 + local20 > Class3_Sub1_Sub2.anInt761) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt762) {
				local41 = Class3_Sub1_Sub2.anInt762 - arg0;
				local23 -= local41;
				arg0 = Class3_Sub1_Sub2.anInt762;
				local17 += local41;
				local15 += local41;
				local29 = local41 + 0;
				local27 += local41;
			}
			if (arg0 + local23 > Class3_Sub1_Sub2.anInt763) {
				local41 = arg0 + local23 - Class3_Sub1_Sub2.anInt763;
				local23 -= local41;
				local29 += local41;
				local27 += local41;
			}
			if (local23 > 0 && local20 > 0) {
				this.method534(Class3_Sub1_Sub2.anIntArray181, this.anIntArray182, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("4882, " + false + ", " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method534(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IBII)V")
	public void method535(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt772;
			arg2 += this.anInt773;
			@Pc(17) int local17 = arg1 + arg2 * Class3_Sub1_Sub2.anInt758;
			@Pc(19) int local19 = 0;
			@Pc(22) int local22 = this.anInt771;
			@Pc(25) int local25 = this.anInt770;
			@Pc(29) int local29 = Class3_Sub1_Sub2.anInt758 - local25;
			@Pc(31) int local31 = 0;
			@Pc(36) boolean local36 = false;
			@Pc(52) int local52;
			if (arg2 < Class3_Sub1_Sub2.anInt760) {
				local52 = Class3_Sub1_Sub2.anInt760 - arg2;
				local22 -= local52;
				arg2 = Class3_Sub1_Sub2.anInt760;
				local19 = local52 * local25 + 0;
				local17 += local52 * Class3_Sub1_Sub2.anInt758;
			}
			if (arg2 + local22 > Class3_Sub1_Sub2.anInt761) {
				local22 -= arg2 + local22 - Class3_Sub1_Sub2.anInt761;
			}
			if (arg1 < Class3_Sub1_Sub2.anInt762) {
				local52 = Class3_Sub1_Sub2.anInt762 - arg1;
				local25 -= local52;
				arg1 = Class3_Sub1_Sub2.anInt762;
				local19 += local52;
				local17 += local52;
				local31 = local52 + 0;
				local29 += local52;
			}
			if (arg1 + local25 > Class3_Sub1_Sub2.anInt763) {
				local52 = arg1 + local25 - Class3_Sub1_Sub2.anInt763;
				local25 -= local52;
				local31 += local52;
				local29 += local52;
			}
			if (local25 > 0 && local22 > 0) {
				this.method536(local29, this.anIntArray182, local19, local25, 0, local17, Class3_Sub1_Sub2.anIntArray181, local31, local22);
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("35380, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(II[IIIII[IIII)V")
	private void method536(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg8; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg1[arg2++];
					if (local20 == 0) {
						arg5++;
					} else {
						@Pc(26) int local26 = arg6[arg5];
						arg6[arg5++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg0;
				arg2 += arg7;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("79438, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -38 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([IIIIIIIII[II)V")
	public void method537(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(13) int local13 = -arg6 / 2;
				@Pc(18) int local18 = -arg7 / 2;
				@Pc(27) int local27 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
				@Pc(36) int local36 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
				@Pc(42) int local42 = local27 * arg4 >> 8;
				@Pc(48) int local48 = local36 * arg4 >> 8;
				@Pc(60) int local60 = (arg9 << 16) + local18 * local42 + local13 * local48;
				@Pc(72) int local72 = (arg1 << 16) + (local18 * local48 - local13 * local42);
				@Pc(78) int local78 = arg2 + arg5 * Class3_Sub1_Sub2.anInt758;
				for (@Pc(80) int local80 = 0; local80 < arg7; local80++) {
					@Pc(86) int local86 = arg8[local80];
					@Pc(90) int local90 = local78 + local86;
					@Pc(96) int local96 = local60 + local48 * local86;
					@Pc(102) int local102 = local72 - local42 * local86;
					for (@Pc(107) int local107 = -arg0[local80]; local107 < 0; local107++) {
						Class3_Sub1_Sub2.anIntArray181[local90++] = this.anIntArray182[(local96 >> 16) + (local102 >> 16) * this.anInt770];
						local96 += local48;
						local102 -= local42;
					}
					local60 += local42;
					local72 += local48;
					local78 += Class3_Sub1_Sub2.anInt758;
				}
			} catch (@Pc(155) Exception local155) {
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("85215, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 1 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIIIIDIIZ)V")
	public void method538(@OriginalArg(4) int arg0, @OriginalArg(5) double arg1, @OriginalArg(6) int arg2) {
		try {
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg0 + arg2 * Class3_Sub1_Sub2.anInt758;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray182[(local82 >> 16) + (local84 >> 16) * this.anInt770];
						if (local103 == 0) {
							local80++;
						} else {
							Class3_Sub1_Sub2.anIntArray181[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class3_Sub1_Sub2.anInt758;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("45618, " + 15 + ", " + 20 + ", " + 20 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 256 + ", " + false + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(ILclient!SSCICQYX;ZI)V")
	public void method539(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt772;
			arg2 += this.anInt773;
			@Pc(24) int local24 = arg0 + arg2 * Class3_Sub1_Sub2.anInt758;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt771;
			@Pc(32) int local32 = this.anInt770;
			@Pc(36) int local36 = Class3_Sub1_Sub2.anInt758 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg2 < Class3_Sub1_Sub2.anInt760) {
				local45 = Class3_Sub1_Sub2.anInt760 - arg2;
				local29 -= local45;
				arg2 = Class3_Sub1_Sub2.anInt760;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class3_Sub1_Sub2.anInt758;
			}
			if (arg2 + local29 > Class3_Sub1_Sub2.anInt761) {
				local29 -= arg2 + local29 - Class3_Sub1_Sub2.anInt761;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt762) {
				local45 = Class3_Sub1_Sub2.anInt762 - arg0;
				local32 -= local45;
				arg0 = Class3_Sub1_Sub2.anInt762;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class3_Sub1_Sub2.anInt763) {
				local45 = arg0 + local32 - Class3_Sub1_Sub2.anInt763;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method540(local26, 0, local32, this.anIntArray182, arg1.aByteArray16, local36, Class3_Sub1_Sub2.anIntArray181, local29, local38, local24);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("51638, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIIB[I[BI[IIII)V")
	private void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg3[arg0++];
					if (local25 != 0 && arg4[arg9] == 0) {
						arg6[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg3[arg0++];
					if (local25 != 0 && arg4[arg9] == 0) {
						arg6[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg3[arg0++];
					if (local25 != 0 && arg4[arg9] == 0) {
						arg6[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg3[arg0++];
					if (local25 != 0 && arg4[arg9] == 0) {
						arg6[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg3[arg0++];
					if (local25 != 0 && arg4[arg9] == 0) {
						arg6[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				arg9 += arg5;
				arg0 += arg8;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("57700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
