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

@OriginalClass("client!XANVNPIN")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!XANVNPIN", name = "x", descriptor = "Z")
	private static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!XANVNPIN", name = "F", descriptor = "I")
	private int anInt698;

	@OriginalMember(owner = "client!XANVNPIN", name = "y", descriptor = "B")
	private byte aByte37 = 3;

	@OriginalMember(owner = "client!XANVNPIN", name = "z", descriptor = "B")
	private byte aByte38 = 9;

	@OriginalMember(owner = "client!XANVNPIN", name = "A", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!XANVNPIN", name = "B", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!XANVNPIN", name = "C", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!XANVNPIN", name = "D", descriptor = "Z")
	private boolean aBoolean205 = false;

	@OriginalMember(owner = "client!XANVNPIN", name = "E", descriptor = "I")
	private int anInt697 = -45332;

	@OriginalMember(owner = "client!XANVNPIN", name = "G", descriptor = "I")
	private int anInt699 = 5;

	@OriginalMember(owner = "client!XANVNPIN", name = "H", descriptor = "[I")
	public int[] anIntArray190;

	@OriginalMember(owner = "client!XANVNPIN", name = "M", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!XANVNPIN", name = "I", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!XANVNPIN", name = "N", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!XANVNPIN", name = "J", descriptor = "I")
	public int anInt701;

	@OriginalMember(owner = "client!XANVNPIN", name = "L", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!XANVNPIN", name = "K", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!XANVNPIN", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray190 = new int[arg0 * arg1];
		this.anInt700 = this.anInt704 = arg0;
		this.anInt701 = this.anInt705 = arg1;
		this.anInt702 = this.anInt703 = 0;
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt700 = local29.getWidth(arg1);
			this.anInt701 = local29.getHeight(arg1);
			this.anInt704 = this.anInt700;
			this.anInt705 = this.anInt701;
			this.anInt702 = 0;
			this.anInt703 = 0;
			this.anIntArray190 = new int[this.anInt700 * this.anInt701];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt700, this.anInt701, this.anIntArray190, 0, this.anInt700);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "<init>", descriptor = "(Lclient!FNOQZAYQ;Ljava/lang/String;I)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) Class8 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class2_Sub1_Sub4 local43 = new Class2_Sub1_Sub4(arg0.method165(arg1 + ".dat", null), aBoolean201);
		@Pc(52) Class2_Sub1_Sub4 local52 = new Class2_Sub1_Sub4(arg0.method165("index.dat", null), aBoolean201);
		local52.anInt166 = local43.method96();
		this.anInt704 = local52.method96();
		this.anInt705 = local52.method96();
		@Pc(67) int local67 = local52.method94();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method98();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt166 += 2;
			local43.anInt166 += local52.method96() * local52.method96();
			local52.anInt166++;
		}
		this.anInt702 = local52.method94();
		this.anInt703 = local52.method94();
		this.anInt700 = local52.method96();
		this.anInt701 = local52.method96();
		@Pc(154) int local154 = local52.method94();
		@Pc(160) int local160 = this.anInt700 * this.anInt701;
		this.anIntArray190 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray190[local168] = local70[local43.method94()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt700; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt701; local192++) {
					this.anIntArray190[local168 + local192 * this.anInt700] = local70[local43.method94()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "b", descriptor = "(I)V")
	public void method492() {
		try {
			Class2_Sub1_Sub1.method480(this.anIntArray190, this.anInt701, this.anInt700);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("92678, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(IIII)V")
	public void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray190.length; local13++) {
				@Pc(20) int local20 = this.anIntArray190[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg0;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg2;
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
					this.anIntArray190[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("25323, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "c", descriptor = "(I)V")
	public void method494(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt704 * this.anInt705];
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < this.anInt701; local14++) {
				for (@Pc(18) int local18 = 0; local18 < this.anInt700; local18++) {
					local8[(local14 + this.anInt703) * this.anInt704 + local18 + this.anInt702] = this.anIntArray190[local14 * this.anInt700 + local18];
				}
			}
			this.anIntArray190 = local8;
			this.anInt700 = this.anInt704;
			this.anInt701 = this.anInt705;
			this.anInt702 = 0;
			this.anInt703 = 0;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("47628, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(BII)V")
	public void method495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt702;
			arg1 += this.anInt703;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub1.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt701;
			@Pc(23) int local23 = this.anInt700;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt690) {
				local40 = Class2_Sub1_Sub1.anInt690 - arg1;
				local20 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt690;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg1 + local20 > Class2_Sub1_Sub1.anInt691) {
				local20 -= arg1 + local20 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt692) {
				local40 = Class2_Sub1_Sub1.anInt692 - arg0;
				local23 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt692;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt693) {
				local40 = arg0 + local23 - Class2_Sub1_Sub1.anInt693;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method496(local27, Class2_Sub1_Sub1.anIntArray189, local20, local29, local17, this.anIntArray190, local15, local23, (byte) 5);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("60734, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(I[IIII[IIIB)V")
	private void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg1[arg6++] = arg5[arg4++];
					arg1[arg6++] = arg5[arg4++];
					arg1[arg6++] = arg5[arg4++];
					arg1[arg6++] = arg5[arg4++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg1[arg6++] = arg5[arg4++];
				}
				arg6 += arg0;
				arg4 += arg3;
			}
			@Pc(86) boolean local86 = false;
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "b", descriptor = "(BII)V")
	public void method497(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt702;
			arg1 += this.anInt703;
			@Pc(19) int local19 = arg0 + arg1 * Class2_Sub1_Sub1.anInt688;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt701;
			@Pc(27) int local27 = this.anInt700;
			@Pc(31) int local31 = Class2_Sub1_Sub1.anInt688 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt690) {
				local40 = Class2_Sub1_Sub1.anInt690 - arg1;
				local24 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt690;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg1 + local24 > Class2_Sub1_Sub1.anInt691) {
				local24 -= arg1 + local24 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt692) {
				local40 = Class2_Sub1_Sub1.anInt692 - arg0;
				local27 -= local40;
				arg0 = Class2_Sub1_Sub1.anInt692;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class2_Sub1_Sub1.anInt693) {
				local40 = arg0 + local27 - Class2_Sub1_Sub1.anInt693;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method498(Class2_Sub1_Sub1.anIntArray189, this.anIntArray190, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("65946, " + 50 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method498(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(ZIII)V")
	public void method499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt702;
			arg1 += this.anInt703;
			@Pc(15) int local15 = arg0 + arg1 * Class2_Sub1_Sub1.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt701;
			@Pc(23) int local23 = this.anInt700;
			@Pc(27) int local27 = Class2_Sub1_Sub1.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class2_Sub1_Sub1.anInt690) {
				local36 = Class2_Sub1_Sub1.anInt690 - arg1;
				local20 -= local36;
				arg1 = Class2_Sub1_Sub1.anInt690;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg1 + local20 > Class2_Sub1_Sub1.anInt691) {
				local20 -= arg1 + local20 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg0 < Class2_Sub1_Sub1.anInt692) {
				local36 = Class2_Sub1_Sub1.anInt692 - arg0;
				local23 -= local36;
				arg0 = Class2_Sub1_Sub1.anInt692;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class2_Sub1_Sub1.anInt693) {
				local36 = arg0 + local23 - Class2_Sub1_Sub1.anInt693;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method500(local20, local27, local23, this.anIntArray190, this.aByte38, local15, local17, local29, Class2_Sub1_Sub1.anIntArray189, 0);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("88228, " + true + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(III[IIBIII[II)V")
	private void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(13) int local13;
			for (@Pc(8) int local8 = -arg0; local8 < 0; local8++) {
				for (local13 = -arg2; local13 < 0; local13++) {
					@Pc(20) int local20 = arg3[arg6++];
					if (local20 == 0) {
						arg5++;
					} else {
						@Pc(26) int local26 = arg8[arg5];
						arg8[arg5++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg1;
				arg6 += arg7;
			}
			if (arg4 == 9) {
				@Pc(81) boolean local81 = false;
			} else {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("67267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(IIIII[I[IIIII)V")
	public void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			try {
				@Pc(19) int local19 = -arg0 / 2;
				@Pc(24) int local24 = -arg9 / 2;
				@Pc(33) int local33 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
				@Pc(42) int local42 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
				@Pc(48) int local48 = local33 * arg2 >> 8;
				@Pc(54) int local54 = local42 * arg2 >> 8;
				@Pc(66) int local66 = (arg4 << 16) + local24 * local48 + local19 * local54;
				@Pc(78) int local78 = (arg1 << 16) + (local24 * local54 - local19 * local48);
				@Pc(84) int local84 = arg7 + arg8 * Class2_Sub1_Sub1.anInt688;
				for (@Pc(86) int local86 = 0; local86 < arg9; local86++) {
					@Pc(92) int local92 = arg6[local86];
					@Pc(96) int local96 = local84 + local92;
					@Pc(102) int local102 = local66 + local54 * local92;
					@Pc(108) int local108 = local78 - local48 * local92;
					for (@Pc(113) int local113 = -arg5[local86]; local113 < 0; local113++) {
						Class2_Sub1_Sub1.anIntArray189[local96++] = this.anIntArray190[(local102 >> 16) + (local108 >> 16) * this.anInt700];
						local102 += local54;
						local108 -= local48;
					}
					local66 += local48;
					local78 += local54;
					local84 += Class2_Sub1_Sub1.anInt688;
				}
			} catch (@Pc(161) Exception local161) {
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("80756, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 2 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(IIIIIBDII)V")
	public void method502(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg0 + arg1 * Class2_Sub1_Sub1.anInt688;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray190[(local77 >> 16) + (local79 >> 16) * this.anInt700];
						if (local98 == 0) {
							local75++;
						} else {
							Class2_Sub1_Sub1.anIntArray189[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class2_Sub1_Sub1.anInt688;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("45186, " + 256 + ", " + 15 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + 21 + ", " + arg2 + ", " + 20 + ", " + 20 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(Lclient!PQKEJITK;III)V")
	public void method503(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt702;
			arg1 += this.anInt703;
			@Pc(19) int local19 = arg2 + arg1 * Class2_Sub1_Sub1.anInt688;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt701;
			@Pc(27) int local27 = this.anInt700;
			@Pc(31) int local31 = Class2_Sub1_Sub1.anInt688 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class2_Sub1_Sub1.anInt690) {
				local40 = Class2_Sub1_Sub1.anInt690 - arg1;
				local24 -= local40;
				arg1 = Class2_Sub1_Sub1.anInt690;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class2_Sub1_Sub1.anInt688;
			}
			if (arg1 + local24 > Class2_Sub1_Sub1.anInt691) {
				local24 -= arg1 + local24 - Class2_Sub1_Sub1.anInt691;
			}
			if (arg2 < Class2_Sub1_Sub1.anInt692) {
				local40 = Class2_Sub1_Sub1.anInt692 - arg2;
				local27 -= local40;
				arg2 = Class2_Sub1_Sub1.anInt692;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class2_Sub1_Sub1.anInt693) {
				local40 = arg2 + local27 - Class2_Sub1_Sub1.anInt693;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method504(0, this.anInt697, local24, local27, arg0.aByteArray13, Class2_Sub1_Sub1.anIntArray189, local21, local19, local33, this.anIntArray190, local31);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("74021, " + arg0 + ", " + -29874 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XANVNPIN", name = "a", descriptor = "(IIII[B[IIII[II)V")
	private void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			if (arg1 != -45332) {
				this.anInt698 = -391;
			}
			for (@Pc(20) int local20 = -arg2; local20 < 0; local20++) {
				@Pc(31) int local31;
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					local31 = arg9[arg6++];
					if (local31 != 0 && arg4[arg7] == 0) {
						arg5[arg7++] = local31;
					} else {
						arg7++;
					}
					local31 = arg9[arg6++];
					if (local31 != 0 && arg4[arg7] == 0) {
						arg5[arg7++] = local31;
					} else {
						arg7++;
					}
					local31 = arg9[arg6++];
					if (local31 != 0 && arg4[arg7] == 0) {
						arg5[arg7++] = local31;
					} else {
						arg7++;
					}
					local31 = arg9[arg6++];
					if (local31 != 0 && arg4[arg7] == 0) {
						arg5[arg7++] = local31;
					} else {
						arg7++;
					}
				}
				for (@Pc(107) int local107 = local11; local107 < 0; local107++) {
					local31 = arg9[arg6++];
					if (local31 != 0 && arg4[arg7] == 0) {
						arg5[arg7++] = local31;
					} else {
						arg7++;
					}
				}
				arg7 += arg10;
				arg6 += arg8;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("39543, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
