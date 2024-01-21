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

@OriginalClass("client!OGPNACTP")
public final class Class3_Sub3_Sub3_Sub1 extends Class3_Sub3_Sub3 {

	@OriginalMember(owner = "client!OGPNACTP", name = "w", descriptor = "I")
	private int anInt432 = -215;

	@OriginalMember(owner = "client!OGPNACTP", name = "x", descriptor = "I")
	private int anInt433 = 684;

	@OriginalMember(owner = "client!OGPNACTP", name = "y", descriptor = "I")
	private int anInt434 = -25668;

	@OriginalMember(owner = "client!OGPNACTP", name = "z", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!OGPNACTP", name = "A", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!OGPNACTP", name = "B", descriptor = "I")
	private int anInt435 = 1612;

	@OriginalMember(owner = "client!OGPNACTP", name = "C", descriptor = "I")
	private int anInt436 = 9;

	@OriginalMember(owner = "client!OGPNACTP", name = "D", descriptor = "[I")
	public int[] anIntArray119;

	@OriginalMember(owner = "client!OGPNACTP", name = "I", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!OGPNACTP", name = "E", descriptor = "I")
	public int anInt437;

	@OriginalMember(owner = "client!OGPNACTP", name = "J", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!OGPNACTP", name = "F", descriptor = "I")
	public int anInt438;

	@OriginalMember(owner = "client!OGPNACTP", name = "H", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!OGPNACTP", name = "G", descriptor = "I")
	private int anInt439;

	@OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "(II)V")
	public Class3_Sub3_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray119 = new int[arg0 * arg1];
		this.anInt437 = this.anInt441 = arg0;
		this.anInt438 = this.anInt442 = arg1;
		this.anInt439 = this.anInt440 = 0;
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub3_Sub3_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt437 = local26.getWidth(arg1);
			this.anInt438 = local26.getHeight(arg1);
			this.anInt441 = this.anInt437;
			this.anInt442 = this.anInt438;
			this.anInt439 = 0;
			this.anInt440 = 0;
			this.anIntArray119 = new int[this.anInt437 * this.anInt438];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt437, this.anInt438, this.anIntArray119, 0, this.anInt437);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "(Lclient!LKPVZAQN;Ljava/lang/String;I)V")
	public Class3_Sub3_Sub3_Sub1(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class3_Sub3_Sub4 local40 = new Class3_Sub3_Sub4((byte) -115, arg0.method207(arg1 + ".dat", null));
		@Pc(49) Class3_Sub3_Sub4 local49 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("index.dat", null));
		local49.anInt738 = local40.method470();
		this.anInt441 = local49.method470();
		this.anInt442 = local49.method470();
		@Pc(64) int local64 = local49.method468();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method472();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt738 += 2;
			local40.anInt738 += local49.method470() * local49.method470();
			local49.anInt738++;
		}
		this.anInt439 = local49.method468();
		this.anInt440 = local49.method468();
		this.anInt437 = local49.method470();
		this.anInt438 = local49.method470();
		@Pc(151) int local151 = local49.method468();
		@Pc(157) int local157 = this.anInt437 * this.anInt438;
		this.anIntArray119 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray119[local165] = local67[local40.method468()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt437; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt438; local189++) {
					this.anIntArray119[local165 + local189 * this.anInt437] = local67[local40.method468()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "b", descriptor = "(I)V")
	public void method253() {
		try {
			Class3_Sub3_Sub3.method547(this.anInt437, this.anInt438, this.anIntArray119);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("34764, " + 1 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIBI)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray119.length; local13++) {
				@Pc(20) int local20 = this.anIntArray119[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg0;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg3;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg1;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray119[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("22431, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "c", descriptor = "(I)V")
	public void method255() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt441 * this.anInt442];
			for (@Pc(10) int local10 = 0; local10 < this.anInt438; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt437; local14++) {
					local8[(local10 + this.anInt440) * this.anInt441 + local14 + this.anInt439] = this.anIntArray119[local10 * this.anInt437 + local14];
				}
			}
			this.anIntArray119 = local8;
			this.anInt437 = this.anInt441;
			this.anInt438 = this.anInt442;
			this.anInt439 = 0;
			this.anInt440 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("68909, " + 684 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(III)V")
	public void method256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt439;
			arg1 += this.anInt440;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub3_Sub3.anInt815;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt438;
			@Pc(27) int local27 = this.anInt437;
			@Pc(31) int local31 = Class3_Sub3_Sub3.anInt815 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class3_Sub3_Sub3.anInt817) {
				local40 = Class3_Sub3_Sub3.anInt817 - arg1;
				local24 -= local40;
				arg1 = Class3_Sub3_Sub3.anInt817;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg1 + local24 > Class3_Sub3_Sub3.anInt818) {
				local24 -= arg1 + local24 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg0 < Class3_Sub3_Sub3.anInt819) {
				local40 = Class3_Sub3_Sub3.anInt819 - arg0;
				local27 -= local40;
				arg0 = Class3_Sub3_Sub3.anInt819;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class3_Sub3_Sub3.anInt820) {
				local40 = arg0 + local27 - Class3_Sub3_Sub3.anInt820;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method257(local15, local33, local27, local24, 722, local31, this.anIntArray119, local17, Class3_Sub3_Sub3.anIntArray204);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("58090, " + arg0 + ", " + 8 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIIII[II[I)V")
	private void method257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			@Pc(15) boolean local15 = false;
			for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg8[arg0++] = arg6[arg7++];
					arg8[arg0++] = arg6[arg7++];
					arg8[arg0++] = arg6[arg7++];
					arg8[arg0++] = arg6[arg7++];
				}
				for (@Pc(61) int local61 = local11; local61 < 0; local61++) {
					arg8[arg0++] = arg6[arg7++];
				}
				arg0 += arg5;
				arg7 += arg1;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("62295, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "b", descriptor = "(III)V")
	public void method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt439;
			arg1 += this.anInt440;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub3_Sub3.anInt815;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt438;
			@Pc(23) int local23 = this.anInt437;
			@Pc(27) int local27 = Class3_Sub3_Sub3.anInt815 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class3_Sub3_Sub3.anInt817) {
				local36 = Class3_Sub3_Sub3.anInt817 - arg1;
				local20 -= local36;
				arg1 = Class3_Sub3_Sub3.anInt817;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg1 + local20 > Class3_Sub3_Sub3.anInt818) {
				local20 -= arg1 + local20 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg0 < Class3_Sub3_Sub3.anInt819) {
				local36 = Class3_Sub3_Sub3.anInt819 - arg0;
				local23 -= local36;
				arg0 = Class3_Sub3_Sub3.anInt819;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class3_Sub3_Sub3.anInt820) {
				local36 = arg0 + local23 - Class3_Sub3_Sub3.anInt820;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method259(Class3_Sub3_Sub3.anIntArray204, this.anIntArray119, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("36744, " + arg0 + ", " + arg1 + ", " + -973 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method259(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIB)V")
	public void method260(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt439;
			arg0 += this.anInt440;
			@Pc(25) int local25 = arg1 + arg0 * Class3_Sub3_Sub3.anInt815;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt438;
			@Pc(33) int local33 = this.anInt437;
			@Pc(37) int local37 = Class3_Sub3_Sub3.anInt815 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class3_Sub3_Sub3.anInt817) {
				local46 = Class3_Sub3_Sub3.anInt817 - arg0;
				local30 -= local46;
				arg0 = Class3_Sub3_Sub3.anInt817;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg0 + local30 > Class3_Sub3_Sub3.anInt818) {
				local30 -= arg0 + local30 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg1 < Class3_Sub3_Sub3.anInt819) {
				local46 = Class3_Sub3_Sub3.anInt819 - arg1;
				local33 -= local46;
				arg1 = Class3_Sub3_Sub3.anInt819;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class3_Sub3_Sub3.anInt820) {
				local46 = arg1 + local33 - Class3_Sub3_Sub3.anInt820;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method261(this.anIntArray119, 0, local25, local33, Class3_Sub3_Sub3.anIntArray204, local27, local39, local37, local30);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("91873, " + 128 + ", " + arg0 + ", " + arg1 + ", " + -33 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "([IIIIB[IIIIII)V")
	private void method261(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(19) int local19 = -arg8; local19 < 0; local19++) {
				for (@Pc(24) int local24 = -arg3; local24 < 0; local24++) {
					@Pc(31) int local31 = arg0[arg5++];
					if (local31 == 0) {
						arg2++;
					} else {
						@Pc(37) int local37 = arg4[arg2];
						arg4[arg2++] = ((local31 & 0xFF00FF) * 128 + (local37 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local31 & 0xFF00) * 128 + (local37 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg7;
				arg5 += arg6;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("41333, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -111 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIII[I[IIIII)V")
	public void method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg3 / 2;
				@Pc(14) int local14 = -arg8 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg0 >> 8;
				@Pc(44) int local44 = local32 * arg0 >> 8;
				@Pc(56) int local56 = (arg7 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg4 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg1 + arg9 * Class3_Sub3_Sub3.anInt815;
				for (@Pc(76) int local76 = 0; local76 < arg8; local76++) {
					@Pc(82) int local82 = arg5[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg6[local76]; local103 < 0; local103++) {
						Class3_Sub3_Sub3.anIntArray204[local86++] = this.anIntArray119[(local92 >> 16) + (local98 >> 16) * this.anInt437];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class3_Sub3_Sub3.anInt815;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("68149, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 0 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIDIIIII)V")
	public void method263(@OriginalArg(2) int arg0, @OriginalArg(3) double arg1, @OriginalArg(7) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg0 + arg2 * Class3_Sub3_Sub3.anInt815;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray119[(local83 >> 16) + (local85 >> 16) * this.anInt437];
						if (local104 == 0) {
							local81++;
						} else {
							Class3_Sub3_Sub3.anIntArray204[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class3_Sub3_Sub3.anInt815;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("98813, " + 0 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + 20 + ", " + 15 + ", " + 20 + ", " + arg2 + ", " + 256 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IILclient!OSRLSEOB;Z)V")
	public void method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub3_Sub2 arg2) {
		try {
			arg0 += this.anInt439;
			arg1 += this.anInt440;
			@Pc(20) int local20 = arg0 + arg1 * Class3_Sub3_Sub3.anInt815;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt438;
			@Pc(28) int local28 = this.anInt437;
			@Pc(32) int local32 = Class3_Sub3_Sub3.anInt815 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class3_Sub3_Sub3.anInt817) {
				local41 = Class3_Sub3_Sub3.anInt817 - arg1;
				local25 -= local41;
				arg1 = Class3_Sub3_Sub3.anInt817;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg1 + local25 > Class3_Sub3_Sub3.anInt818) {
				local25 -= arg1 + local25 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg0 < Class3_Sub3_Sub3.anInt819) {
				local41 = Class3_Sub3_Sub3.anInt819 - arg0;
				local28 -= local41;
				arg0 = Class3_Sub3_Sub3.anInt819;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class3_Sub3_Sub3.anInt820) {
				local41 = arg0 + local28 - Class3_Sub3_Sub3.anInt820;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method265(local32, local34, arg2.aByteArray17, this.anIntArray119, local20, local25, Class3_Sub3_Sub3.anIntArray204, local22, local28, 0);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("63775, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(III[B[III[IIII)V")
	private void method265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg3[arg7++];
					if (local25 != 0 && arg2[arg4] == 0) {
						arg6[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg3[arg7++];
					if (local25 != 0 && arg2[arg4] == 0) {
						arg6[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg3[arg7++];
					if (local25 != 0 && arg2[arg4] == 0) {
						arg6[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg3[arg7++];
					if (local25 != 0 && arg2[arg4] == 0) {
						arg6[arg4++] = local25;
					} else {
						arg4++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg3[arg7++];
					if (local25 != 0 && arg2[arg4] == 0) {
						arg6[arg4++] = local25;
					} else {
						arg4++;
					}
				}
				arg4 += arg0;
				arg7 += arg1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("98382, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
