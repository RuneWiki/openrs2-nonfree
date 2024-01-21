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

@OriginalClass("client!ZWUMKFUX")
public final class Class3_Sub1_Sub2_Sub4 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZWUMKFUX", name = "w", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "x", descriptor = "B")
	private byte aByte26 = 52;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "y", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "z", descriptor = "I")
	private int anInt792 = -911;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "A", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "F", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "B", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "G", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "C", descriptor = "I")
	public int anInt794;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "E", descriptor = "I")
	private int anInt796;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "D", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!ZWUMKFUX", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray209 = new int[arg0 * arg1];
		this.anInt793 = this.anInt797 = arg0;
		this.anInt794 = this.anInt798 = arg1;
		this.anInt795 = this.anInt796 = 0;
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt793 = local17.getWidth(arg1);
			this.anInt794 = local17.getHeight(arg1);
			this.anInt797 = this.anInt793;
			this.anInt798 = this.anInt794;
			this.anInt795 = 0;
			this.anInt796 = 0;
			this.anIntArray209 = new int[this.anInt793 * this.anInt794];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt793, this.anInt794, this.anIntArray209, 0, this.anInt793);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "<init>", descriptor = "(Lclient!INOFEYKQ;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub2_Sub4(@OriginalArg(0) Class14 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class3_Sub1_Sub3 local31 = new Class3_Sub1_Sub3((byte) -103, arg0.method202(arg1 + ".dat", (byte[]) null));
		@Pc(40) Class3_Sub1_Sub3 local40 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("index.dat", (byte[]) null));
		local40.anInt441 = local31.method276();
		this.anInt797 = local40.method276();
		this.anInt798 = local40.method276();
		@Pc(55) int local55 = local40.method274();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method278();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < arg2; local95++) {
			local40.anInt441 += 2;
			local31.anInt441 += local40.method276() * local40.method276();
			local40.anInt441++;
		}
		this.anInt795 = local40.method274();
		this.anInt796 = local40.method274();
		this.anInt793 = local40.method276();
		this.anInt794 = local40.method276();
		@Pc(142) int local142 = local40.method274();
		@Pc(148) int local148 = this.anInt793 * this.anInt794;
		this.anIntArray209 = new int[local148];
		@Pc(156) int local156;
		if (local142 == 0) {
			for (local156 = 0; local156 < local148; local156++) {
				this.anIntArray209[local156] = local58[local31.method274()];
			}
		} else if (local142 == 1) {
			for (local156 = 0; local156 < this.anInt793; local156++) {
				for (@Pc(180) int local180 = 0; local180 < this.anInt794; local180++) {
					this.anIntArray209[local156 + local180 * this.anInt793] = local58[local31.method274()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(B)V")
	public void method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			Class3_Sub1_Sub2.method549(this.anInt793, this.anIntArray209, this.anInt794);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("35059, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IIIB)V")
	public void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray209.length; local3++) {
				@Pc(10) int local10 = this.anIntArray209[local3];
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
					this.anIntArray209[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			@Pc(100) boolean local100 = false;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("92111, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "c", descriptor = "(I)V")
	public void method563() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt797 * this.anInt798];
			for (@Pc(10) int local10 = 0; local10 < this.anInt794; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt793; local14++) {
					local8[(local10 + this.anInt796) * this.anInt797 + local14 + this.anInt795] = this.anIntArray209[local10 * this.anInt793 + local14];
				}
			}
			this.anIntArray209 = local8;
			this.anInt793 = this.anInt797;
			this.anInt794 = this.anInt798;
			this.anInt795 = 0;
			this.anInt796 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("99671, " + 2 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(III)V")
	public void method564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt795;
			arg1 += this.anInt796;
			@Pc(24) int local24 = arg0 + arg1 * Class3_Sub1_Sub2.anInt783;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt794;
			@Pc(32) int local32 = this.anInt793;
			@Pc(36) int local36 = Class3_Sub1_Sub2.anInt783 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class3_Sub1_Sub2.anInt785) {
				local45 = Class3_Sub1_Sub2.anInt785 - arg1;
				local29 -= local45;
				arg1 = Class3_Sub1_Sub2.anInt785;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class3_Sub1_Sub2.anInt783;
			}
			if (arg1 + local29 > Class3_Sub1_Sub2.anInt786) {
				local29 -= arg1 + local29 - Class3_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt787) {
				local45 = Class3_Sub1_Sub2.anInt787 - arg0;
				local32 -= local45;
				arg0 = Class3_Sub1_Sub2.anInt787;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class3_Sub1_Sub2.anInt788) {
				local45 = arg0 + local32 - Class3_Sub1_Sub2.anInt788;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method565(local26, local29, local32, Class3_Sub1_Sub2.anIntArray208, local38, local24, this.anIntArray209, local36);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("86280, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(III[III[IIB)V")
	private void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(25) int local25 = -arg1; local25 < 0; local25++) {
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					arg3[arg5++] = arg6[arg0++];
					arg3[arg5++] = arg6[arg0++];
					arg3[arg5++] = arg6[arg0++];
					arg3[arg5++] = arg6[arg0++];
				}
				for (@Pc(68) int local68 = local11; local68 < 0; local68++) {
					arg3[arg5++] = arg6[arg0++];
				}
				arg5 += arg7;
				arg0 += arg4;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("30290, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -97 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IIB)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			@Pc(4) boolean local4 = false;
			arg0 += this.anInt795;
			arg1 += this.anInt796;
			@Pc(25) int local25 = arg0 + arg1 * Class3_Sub1_Sub2.anInt783;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt794;
			@Pc(33) int local33 = this.anInt793;
			@Pc(37) int local37 = Class3_Sub1_Sub2.anInt783 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class3_Sub1_Sub2.anInt785) {
				local46 = Class3_Sub1_Sub2.anInt785 - arg1;
				local30 -= local46;
				arg1 = Class3_Sub1_Sub2.anInt785;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class3_Sub1_Sub2.anInt783;
			}
			if (arg1 + local30 > Class3_Sub1_Sub2.anInt786) {
				local30 -= arg1 + local30 - Class3_Sub1_Sub2.anInt786;
			}
			if (arg0 < Class3_Sub1_Sub2.anInt787) {
				local46 = Class3_Sub1_Sub2.anInt787 - arg0;
				local33 -= local46;
				arg0 = Class3_Sub1_Sub2.anInt787;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class3_Sub1_Sub2.anInt788) {
				local46 = arg0 + local33 - Class3_Sub1_Sub2.anInt788;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method567(Class3_Sub1_Sub2.anIntArray208, this.anIntArray209, local27, local25, local33, local30, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("85164, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method567(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IIII)V")
	public void method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt795;
			arg0 += this.anInt796;
			@Pc(15) int local15 = arg1 + arg0 * Class3_Sub1_Sub2.anInt783;
			@Pc(17) int local17 = 0;
			@Pc(21) boolean local21 = false;
			@Pc(24) int local24 = this.anInt794;
			@Pc(27) int local27 = this.anInt793;
			@Pc(31) int local31 = Class3_Sub1_Sub2.anInt783 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class3_Sub1_Sub2.anInt785) {
				local40 = Class3_Sub1_Sub2.anInt785 - arg0;
				local24 -= local40;
				arg0 = Class3_Sub1_Sub2.anInt785;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class3_Sub1_Sub2.anInt783;
			}
			if (arg0 + local24 > Class3_Sub1_Sub2.anInt786) {
				local24 -= arg0 + local24 - Class3_Sub1_Sub2.anInt786;
			}
			if (arg1 < Class3_Sub1_Sub2.anInt787) {
				local40 = Class3_Sub1_Sub2.anInt787 - arg1;
				local27 -= local40;
				arg1 = Class3_Sub1_Sub2.anInt787;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class3_Sub1_Sub2.anInt788) {
				local40 = arg1 + local27 - Class3_Sub1_Sub2.anInt788;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method569(local24, local17, local31, 0, local27, local15, Class3_Sub1_Sub2.anIntArray208, local33, this.anIntArray209);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("29451, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IIIIIIII[II[I)V")
	private void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(12) int local12 = -arg0; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg4; local17 < 0; local17++) {
					@Pc(24) int local24 = arg8[arg1++];
					if (local24 == 0) {
						arg5++;
					} else {
						@Pc(30) int local30 = arg6[arg5];
						arg6[arg5++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg2;
				arg1 += arg7;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("13268, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 7741 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(BIIII[II[IIII)V")
	public void method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(10) int local10 = -arg0 / 2;
				@Pc(15) int local15 = -arg5 / 2;
				@Pc(24) int local24 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = local24 * arg1 >> 8;
				@Pc(45) int local45 = local33 * arg1 >> 8;
				@Pc(57) int local57 = (arg9 << 16) + local15 * local39 + local10 * local45;
				@Pc(69) int local69 = (arg8 << 16) + (local15 * local45 - local10 * local39);
				@Pc(75) int local75 = arg3 + arg7 * Class3_Sub1_Sub2.anInt783;
				for (@Pc(77) int local77 = 0; local77 < arg5; local77++) {
					@Pc(83) int local83 = arg4[local77];
					@Pc(87) int local87 = local75 + local83;
					@Pc(93) int local93 = local57 + local45 * local83;
					@Pc(99) int local99 = local69 - local39 * local83;
					for (@Pc(104) int local104 = -arg6[local77]; local104 < 0; local104++) {
						Class3_Sub1_Sub2.anIntArray208[local87++] = this.anIntArray209[(local93 >> 16) + (local99 >> 16) * this.anInt793];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class3_Sub1_Sub2.anInt783;
				}
			} catch (@Pc(152) Exception local152) {
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("27715, " + 4 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IIDIIIIII)V")
	public void method571(@OriginalArg(2) double arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2, @OriginalArg(8) int arg3) {
		try {
			if (arg2 <= 0) {
				this.aBoolean193 = !this.aBoolean193;
			}
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = -10 * local39 + -10 * local45 + 983040;
				@Pc(69) int local69 = -10 * local45 + 983040 - -10 * local39;
				@Pc(75) int local75 = arg1 + arg3 * Class3_Sub1_Sub2.anInt783;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray209[(local83 >> 16) + (local85 >> 16) * this.anInt793];
						if (local104 == 0) {
							local81++;
						} else {
							Class3_Sub1_Sub2.anIntArray208[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class3_Sub1_Sub2.anInt783;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("12369, " + 20 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + 256 + ", " + 15 + ", " + arg2 + ", " + 20 + ", " + arg3 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(IBILclient!RZWMPYWU;)V")
	public void method572(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub2_Sub2 arg3) {
		try {
			if (arg1 == this.aByte26) {
				arg0 += this.anInt795;
				arg2 += this.anInt796;
				@Pc(20) int local20 = arg0 + arg2 * Class3_Sub1_Sub2.anInt783;
				@Pc(22) int local22 = 0;
				@Pc(25) int local25 = this.anInt794;
				@Pc(28) int local28 = this.anInt793;
				@Pc(32) int local32 = Class3_Sub1_Sub2.anInt783 - local28;
				@Pc(34) int local34 = 0;
				@Pc(41) int local41;
				if (arg2 < Class3_Sub1_Sub2.anInt785) {
					local41 = Class3_Sub1_Sub2.anInt785 - arg2;
					local25 -= local41;
					arg2 = Class3_Sub1_Sub2.anInt785;
					local22 = local41 * local28 + 0;
					local20 += local41 * Class3_Sub1_Sub2.anInt783;
				}
				if (arg2 + local25 > Class3_Sub1_Sub2.anInt786) {
					local25 -= arg2 + local25 - Class3_Sub1_Sub2.anInt786;
				}
				if (arg0 < Class3_Sub1_Sub2.anInt787) {
					local41 = Class3_Sub1_Sub2.anInt787 - arg0;
					local28 -= local41;
					arg0 = Class3_Sub1_Sub2.anInt787;
					local22 += local41;
					local20 += local41;
					local34 = local41 + 0;
					local32 += local41;
				}
				if (arg0 + local28 > Class3_Sub1_Sub2.anInt788) {
					local41 = arg0 + local28 - Class3_Sub1_Sub2.anInt788;
					local28 -= local41;
					local34 += local41;
					local32 += local41;
				}
				if (local28 > 0 && local25 > 0) {
					this.method573(0, local20, this.anIntArray209, local25, local28, local34, Class3_Sub1_Sub2.anIntArray208, arg3.aByteArray13, local32, local22);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("78684, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWUMKFUX", name = "a", descriptor = "(II[IIII[I[BIII)V")
	private void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(19) int local19 = -arg3; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					local30 = arg2[arg9++];
					if (local30 != 0 && arg7[arg1] == 0) {
						arg6[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg2[arg9++];
					if (local30 != 0 && arg7[arg1] == 0) {
						arg6[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg2[arg9++];
					if (local30 != 0 && arg7[arg1] == 0) {
						arg6[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg2[arg9++];
					if (local30 != 0 && arg7[arg1] == 0) {
						arg6[arg1++] = local30;
					} else {
						arg1++;
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					local30 = arg2[arg9++];
					if (local30 != 0 && arg7[arg1] == 0) {
						arg6[arg1++] = local30;
					} else {
						arg1++;
					}
				}
				arg1 += arg8;
				arg9 += arg5;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("62189, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 18 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
