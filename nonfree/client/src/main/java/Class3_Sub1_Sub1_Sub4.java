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

@OriginalClass("client!YHASUFYG")
public final class Class3_Sub1_Sub1_Sub4 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!YHASUFYG", name = "z", descriptor = "I")
	private int anInt769 = 99;

	@OriginalMember(owner = "client!YHASUFYG", name = "A", descriptor = "I")
	private int anInt770 = 2239;

	@OriginalMember(owner = "client!YHASUFYG", name = "B", descriptor = "I")
	private int anInt771 = 46583;

	@OriginalMember(owner = "client!YHASUFYG", name = "C", descriptor = "I")
	private int anInt772 = 6;

	@OriginalMember(owner = "client!YHASUFYG", name = "D", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!YHASUFYG", name = "E", descriptor = "Z")
	private boolean aBoolean236 = true;

	@OriginalMember(owner = "client!YHASUFYG", name = "F", descriptor = "I")
	private int anInt773 = -13016;

	@OriginalMember(owner = "client!YHASUFYG", name = "G", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!YHASUFYG", name = "H", descriptor = "[I")
	public int[] anIntArray204;

	@OriginalMember(owner = "client!YHASUFYG", name = "M", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!YHASUFYG", name = "I", descriptor = "I")
	public int anInt774;

	@OriginalMember(owner = "client!YHASUFYG", name = "N", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!YHASUFYG", name = "J", descriptor = "I")
	public int anInt775;

	@OriginalMember(owner = "client!YHASUFYG", name = "L", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!YHASUFYG", name = "K", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!YHASUFYG", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray204 = new int[arg0 * arg1];
		this.anInt774 = this.anInt778 = arg0;
		this.anInt775 = this.anInt779 = arg1;
		this.anInt776 = this.anInt777 = 0;
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt774 = local29.getWidth(arg1);
			this.anInt775 = local29.getHeight(arg1);
			this.anInt778 = this.anInt774;
			this.anInt779 = this.anInt775;
			this.anInt776 = 0;
			this.anInt777 = 0;
			this.anIntArray204 = new int[this.anInt774 * this.anInt775];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt774, this.anInt775, this.anIntArray204, 0, this.anInt774);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "<init>", descriptor = "(Lclient!BYZSQZUF;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub1_Sub4(@OriginalArg(0) Class5 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class3_Sub1_Sub3 local43 = new Class3_Sub1_Sub3(0, arg0.method66(arg1 + ".dat", null));
		@Pc(52) Class3_Sub1_Sub3 local52 = new Class3_Sub1_Sub3(0, arg0.method66("index.dat", null));
		local52.anInt243 = local43.method148();
		this.anInt778 = local52.method148();
		this.anInt779 = local52.method148();
		@Pc(67) int local67 = local52.method146();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method150();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt243 += 2;
			local43.anInt243 += local52.method148() * local52.method148();
			local52.anInt243++;
		}
		this.anInt776 = local52.method146();
		this.anInt777 = local52.method146();
		this.anInt774 = local52.method148();
		this.anInt775 = local52.method148();
		@Pc(154) int local154 = local52.method146();
		@Pc(160) int local160 = this.anInt774 * this.anInt775;
		this.anIntArray204 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray204[local168] = local70[local43.method146()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt774; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt775; local192++) {
					this.anIntArray204[local168 + local192 * this.anInt774] = local70[local43.method146()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "b", descriptor = "(I)V")
	public void method549() {
		try {
			Class3_Sub1_Sub1.method537(this.anIntArray204, this.anInt774, this.anInt775);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("51516, " + 9133 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(IIII)V")
	public void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray204.length; local3++) {
				@Pc(10) int local10 = this.anIntArray204[local3];
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
					this.anIntArray204[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("37438, " + arg0 + ", " + arg1 + ", " + 47 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "c", descriptor = "(I)V")
	public void method551() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt778 * this.anInt779];
			for (@Pc(10) int local10 = 0; local10 < this.anInt775; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt774; local14++) {
					local8[(local10 + this.anInt777) * this.anInt778 + local14 + this.anInt776] = this.anIntArray204[local10 * this.anInt774 + local14];
				}
			}
			this.anIntArray204 = local8;
			this.anInt774 = this.anInt778;
			this.anInt775 = this.anInt779;
			this.anInt776 = 0;
			this.anInt777 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("63437, " + 38485 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(III)V")
	public void method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt776;
			arg1 += this.anInt777;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub1.anInt760;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt775;
			@Pc(23) int local23 = this.anInt774;
			@Pc(27) int local27 = Class3_Sub1_Sub1.anInt760 - local23;
			@Pc(29) int local29 = 0;
			@Pc(47) int local47;
			if (arg1 < Class3_Sub1_Sub1.anInt762) {
				local47 = Class3_Sub1_Sub1.anInt762 - arg1;
				local20 -= local47;
				arg1 = Class3_Sub1_Sub1.anInt762;
				local17 = local47 * local23 + 0;
				local15 += local47 * Class3_Sub1_Sub1.anInt760;
			}
			if (arg1 + local20 > Class3_Sub1_Sub1.anInt763) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub1.anInt763;
			}
			if (arg0 < Class3_Sub1_Sub1.anInt764) {
				local47 = Class3_Sub1_Sub1.anInt764 - arg0;
				local23 -= local47;
				arg0 = Class3_Sub1_Sub1.anInt764;
				local17 += local47;
				local15 += local47;
				local29 = local47 + 0;
				local27 += local47;
			}
			if (arg0 + local23 > Class3_Sub1_Sub1.anInt765) {
				local47 = arg0 + local23 - Class3_Sub1_Sub1.anInt765;
				local23 -= local47;
				local29 += local47;
				local27 += local47;
			}
			if (local23 > 0 && local20 > 0) {
				this.method553(local17, this.anIntArray204, local29, local23, local15, Class3_Sub1_Sub1.anIntArray203, local27, local20);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("92632, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(I[IIIII[III)V")
	private void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(16) int local16 = -(arg3 & 0x3);
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					arg5[arg4++] = arg1[arg0++];
					arg5[arg4++] = arg1[arg0++];
					arg5[arg4++] = arg1[arg0++];
					arg5[arg4++] = arg1[arg0++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg5[arg4++] = arg1[arg0++];
				}
				arg4 += arg6;
				arg0 += arg2;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("57628, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "b", descriptor = "(III)V")
	public void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt776;
			arg1 += this.anInt777;
			@Pc(19) int local19 = arg0 + arg1 * Class3_Sub1_Sub1.anInt760;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt775;
			@Pc(27) int local27 = this.anInt774;
			@Pc(31) int local31 = Class3_Sub1_Sub1.anInt760 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class3_Sub1_Sub1.anInt762) {
				local40 = Class3_Sub1_Sub1.anInt762 - arg1;
				local24 -= local40;
				arg1 = Class3_Sub1_Sub1.anInt762;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class3_Sub1_Sub1.anInt760;
			}
			if (arg1 + local24 > Class3_Sub1_Sub1.anInt763) {
				local24 -= arg1 + local24 - Class3_Sub1_Sub1.anInt763;
			}
			if (arg0 < Class3_Sub1_Sub1.anInt764) {
				local40 = Class3_Sub1_Sub1.anInt764 - arg0;
				local27 -= local40;
				arg0 = Class3_Sub1_Sub1.anInt764;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class3_Sub1_Sub1.anInt765) {
				local40 = arg0 + local27 - Class3_Sub1_Sub1.anInt765;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method555(Class3_Sub1_Sub1.anIntArray203, this.anIntArray204, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("70518, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(IIIB)V")
	public void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt776;
			arg0 += this.anInt777;
			@Pc(15) int local15 = arg1 + arg0 * Class3_Sub1_Sub1.anInt760;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt775;
			@Pc(23) int local23 = this.anInt774;
			@Pc(27) int local27 = Class3_Sub1_Sub1.anInt760 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class3_Sub1_Sub1.anInt762) {
				local36 = Class3_Sub1_Sub1.anInt762 - arg0;
				local20 -= local36;
				arg0 = Class3_Sub1_Sub1.anInt762;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub1_Sub1.anInt760;
			}
			if (arg0 + local20 > Class3_Sub1_Sub1.anInt763) {
				local20 -= arg0 + local20 - Class3_Sub1_Sub1.anInt763;
			}
			if (arg1 < Class3_Sub1_Sub1.anInt764) {
				local36 = Class3_Sub1_Sub1.anInt764 - arg1;
				local23 -= local36;
				arg1 = Class3_Sub1_Sub1.anInt764;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class3_Sub1_Sub1.anInt765) {
				local36 = arg1 + local23 - Class3_Sub1_Sub1.anInt765;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method557(local17, local15, Class3_Sub1_Sub1.anIntArray203, local27, local20, 0, local29, local23, this.anIntArray204);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("33859, " + arg0 + ", " + arg1 + ", " + 128 + ", " + 2 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(IIII[IIIIII[I)V")
	private void method557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(8) int local8 = -arg4; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg7; local13 < 0; local13++) {
					@Pc(20) int local20 = arg8[arg0++];
					if (local20 == 0) {
						arg1++;
					} else {
						@Pc(26) int local26 = arg2[arg1];
						arg2[arg1++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg3;
				arg0 += arg6;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("38903, " + arg0 + ", " + 544 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(III[IIIIII[II)V")
	public void method558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg6 / 2;
				@Pc(14) int local14 = -arg1 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg7 >> 8;
				@Pc(44) int local44 = local32 * arg7 >> 8;
				@Pc(56) int local56 = (arg3 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg9 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg5 + arg4 * Class3_Sub1_Sub1.anInt760;
				for (@Pc(76) int local76 = 0; local76 < arg1; local76++) {
					@Pc(82) int local82 = arg8[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg2[local76]; local103 < 0; local103++) {
						Class3_Sub1_Sub1.anIntArray203[local86++] = this.anIntArray204[(local92 >> 16) + (local98 >> 16) * this.anInt774];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class3_Sub1_Sub1.anInt760;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("36203, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(IIDIIIIII)V")
	public void method559(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(22) int local22 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(28) int local28 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(34) int local34 = local22 * 256 >> 8;
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
				@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
				@Pc(70) int local70 = arg0 + arg2 * Class3_Sub1_Sub1.anInt760;
				for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
					@Pc(76) int local76 = local70;
					@Pc(78) int local78 = local52;
					@Pc(80) int local80 = local64;
					for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
						@Pc(99) int local99 = this.anIntArray204[(local78 >> 16) + (local80 >> 16) * this.anInt774];
						if (local99 == 0) {
							local76++;
						} else {
							Class3_Sub1_Sub1.anIntArray203[local76++] = local99;
						}
						local78 += local40;
						local80 -= local34;
					}
					local52 += local34;
					local64 += local40;
					local70 += Class3_Sub1_Sub1.anInt760;
				}
			} catch (@Pc(138) Exception local138) {
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("90683, " + arg0 + ", " + 20 + ", " + arg1 + ", " + -542 + ", " + 15 + ", " + 15 + ", " + 256 + ", " + 20 + ", " + arg2 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "(ILclient!AGTHLVTI;IB)V")
	public void method560(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			arg2 += this.anInt776;
			if (arg3 == -121) {
				arg0 += this.anInt777;
				@Pc(19) int local19 = arg2 + arg0 * Class3_Sub1_Sub1.anInt760;
				@Pc(21) int local21 = 0;
				@Pc(24) int local24 = this.anInt775;
				@Pc(27) int local27 = this.anInt774;
				@Pc(31) int local31 = Class3_Sub1_Sub1.anInt760 - local27;
				@Pc(33) int local33 = 0;
				@Pc(40) int local40;
				if (arg0 < Class3_Sub1_Sub1.anInt762) {
					local40 = Class3_Sub1_Sub1.anInt762 - arg0;
					local24 -= local40;
					arg0 = Class3_Sub1_Sub1.anInt762;
					local21 = local40 * local27 + 0;
					local19 += local40 * Class3_Sub1_Sub1.anInt760;
				}
				if (arg0 + local24 > Class3_Sub1_Sub1.anInt763) {
					local24 -= arg0 + local24 - Class3_Sub1_Sub1.anInt763;
				}
				if (arg2 < Class3_Sub1_Sub1.anInt764) {
					local40 = Class3_Sub1_Sub1.anInt764 - arg2;
					local27 -= local40;
					arg2 = Class3_Sub1_Sub1.anInt764;
					local21 += local40;
					local19 += local40;
					local33 = local40 + 0;
					local31 += local40;
				}
				if (arg2 + local27 > Class3_Sub1_Sub1.anInt765) {
					local40 = arg2 + local27 - Class3_Sub1_Sub1.anInt765;
					local27 -= local40;
					local33 += local40;
					local31 += local40;
				}
				if (local27 > 0 && local24 > 0) {
					this.method561(this.anIntArray204, local21, local24, local27, local33, local31, 0, Class3_Sub1_Sub1.anIntArray203, arg1.aByteArray1, local19);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("64071, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YHASUFYG", name = "a", descriptor = "([IIIIIIII[I[BI)V")
	private void method561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg0[arg1++];
					if (local25 != 0 && arg8[arg9] == 0) {
						arg7[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg0[arg1++];
					if (local25 != 0 && arg8[arg9] == 0) {
						arg7[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg0[arg1++];
					if (local25 != 0 && arg8[arg9] == 0) {
						arg7[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg0[arg1++];
					if (local25 != 0 && arg8[arg9] == 0) {
						arg7[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg0[arg1++];
					if (local25 != 0 && arg8[arg9] == 0) {
						arg7[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				arg9 += arg5;
				arg1 += arg4;
			}
			if (this.anInt772 == 6) {
				;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("66671, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 6 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
