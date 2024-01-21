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

@OriginalClass("client!CXGZMTJK")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!CXGZMTJK", name = "z", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!CXGZMTJK", name = "x", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!CXGZMTJK", name = "y", descriptor = "I")
	private int anInt181 = 24869;

	@OriginalMember(owner = "client!CXGZMTJK", name = "A", descriptor = "I")
	private int anInt183 = -32357;

	@OriginalMember(owner = "client!CXGZMTJK", name = "B", descriptor = "B")
	private byte aByte2 = 3;

	@OriginalMember(owner = "client!CXGZMTJK", name = "C", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!CXGZMTJK", name = "D", descriptor = "I")
	private int anInt184 = -388;

	@OriginalMember(owner = "client!CXGZMTJK", name = "E", descriptor = "Z")
	private boolean aBoolean42 = false;

	@OriginalMember(owner = "client!CXGZMTJK", name = "F", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!CXGZMTJK", name = "G", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!CXGZMTJK", name = "H", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!CXGZMTJK", name = "I", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!CXGZMTJK", name = "N", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!CXGZMTJK", name = "J", descriptor = "I")
	public int anInt185;

	@OriginalMember(owner = "client!CXGZMTJK", name = "O", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!CXGZMTJK", name = "K", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!CXGZMTJK", name = "M", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!CXGZMTJK", name = "L", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray39 = new int[arg0 * arg1];
		this.anInt185 = this.anInt189 = arg0;
		this.anInt186 = this.anInt190 = arg1;
		this.anInt187 = this.anInt188 = 0;
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(35) Image local35 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(40) MediaTracker local40 = new MediaTracker(arg1);
			local40.addImage(local35, 0);
			local40.waitForAll();
			this.anInt185 = local35.getWidth(arg1);
			this.anInt186 = local35.getHeight(arg1);
			this.anInt189 = this.anInt185;
			this.anInt190 = this.anInt186;
			this.anInt187 = 0;
			this.anInt188 = 0;
			this.anIntArray39 = new int[this.anInt185 * this.anInt186];
			@Pc(94) PixelGrabber local94 = new PixelGrabber(local35, 0, 0, this.anInt185, this.anInt186, this.anIntArray39, 0, this.anInt185);
			local94.grabPixels();
		} catch (@Pc(99) Exception local99) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "<init>", descriptor = "(Lclient!XTGLDHGX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Class44 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(arg0.method484(arg1 + ".dat", null), 891);
		@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(arg0.method484("index.dat", null), 891);
		local58.anInt468 = local49.method270();
		this.anInt189 = local58.method270();
		this.anInt190 = local58.method270();
		@Pc(73) int local73 = local58.method268();
		@Pc(76) int[] local76 = new int[local73];
		for (@Pc(78) int local78 = 0; local78 < local73 - 1; local78++) {
			local76[local78 + 1] = local58.method272();
			if (local76[local78 + 1] == 0) {
				local76[local78 + 1] = 1;
			}
		}
		for (@Pc(113) int local113 = 0; local113 < arg2; local113++) {
			local58.anInt468 += 2;
			local49.anInt468 += local58.method270() * local58.method270();
			local58.anInt468++;
		}
		this.anInt187 = local58.method268();
		this.anInt188 = local58.method268();
		this.anInt185 = local58.method270();
		this.anInt186 = local58.method270();
		@Pc(160) int local160 = local58.method268();
		@Pc(166) int local166 = this.anInt185 * this.anInt186;
		this.anIntArray39 = new int[local166];
		@Pc(174) int local174;
		if (local160 == 0) {
			for (local174 = 0; local174 < local166; local174++) {
				this.anIntArray39[local174] = local76[local49.method268()];
			}
		} else if (local160 == 1) {
			for (local174 = 0; local174 < this.anInt185; local174++) {
				for (@Pc(198) int local198 = 0; local198 < this.anInt186; local198++) {
					this.anIntArray39[local174 + local198 * this.anInt185] = local76[local49.method268()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(I)V")
	public void method98() {
		try {
			Class1_Sub1_Sub1.method487(this.anInt186, this.anInt185, this.anIntArray39);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("12951, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIII)V")
	public void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray39.length; local8++) {
				@Pc(15) int local15 = this.anIntArray39[local8];
				if (local15 != 0) {
					@Pc(23) int local23 = local15 >> 16 & 0xFF;
					local23 += arg0;
					if (local23 < 1) {
						local23 = 1;
					} else if (local23 > 255) {
						local23 = 255;
					}
					@Pc(45) int local45 = local15 >> 8 & 0xFF;
					local45 += arg1;
					if (local45 < 1) {
						local45 = 1;
					} else if (local45 > 255) {
						local45 = 255;
					}
					@Pc(65) int local65 = local15 & 0xFF;
					local65 += arg2;
					if (local65 < 1) {
						local65 = 1;
					} else if (local65 > 255) {
						local65 = 255;
					}
					this.anIntArray39[local8] = (local23 << 16) + (local45 << 8) + local65;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("66849, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "c", descriptor = "(I)V")
	public void method100() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt189 * this.anInt190];
			for (@Pc(16) int local16 = 0; local16 < this.anInt186; local16++) {
				for (@Pc(20) int local20 = 0; local20 < this.anInt185; local20++) {
					local8[(local16 + this.anInt188) * this.anInt189 + local20 + this.anInt187] = this.anIntArray39[local16 * this.anInt185 + local20];
				}
			}
			this.anIntArray39 = local8;
			this.anInt185 = this.anInt189;
			this.anInt186 = this.anInt190;
			this.anInt187 = 0;
			this.anInt188 = 0;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("76028, " + 5059 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(III)V")
	public void method101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt187;
			arg1 += this.anInt188;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub1.anInt729;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt186;
			@Pc(23) int local23 = this.anInt185;
			@Pc(27) int local27 = Class1_Sub1_Sub1.anInt729 - local23;
			@Pc(29) int local29 = 0;
			if (this.anInt183 != -32357) {
				this.aBoolean45 = !this.aBoolean45;
			}
			@Pc(48) int local48;
			if (arg1 < Class1_Sub1_Sub1.anInt731) {
				local48 = Class1_Sub1_Sub1.anInt731 - arg1;
				local20 -= local48;
				arg1 = Class1_Sub1_Sub1.anInt731;
				local17 = local48 * local23 + 0;
				local15 += local48 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg1 + local20 > Class1_Sub1_Sub1.anInt732) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt733) {
				local48 = Class1_Sub1_Sub1.anInt733 - arg0;
				local23 -= local48;
				arg0 = Class1_Sub1_Sub1.anInt733;
				local17 += local48;
				local15 += local48;
				local29 = local48 + 0;
				local27 += local48;
			}
			if (arg0 + local23 > Class1_Sub1_Sub1.anInt734) {
				local48 = arg0 + local23 - Class1_Sub1_Sub1.anInt734;
				local23 -= local48;
				local29 += local48;
				local27 += local48;
			}
			if (local23 > 0 && local20 > 0) {
				this.method102(local15, local23, local20, local29, local17, local27, this.anIntArray39, Class1_Sub1_Sub1.anIntArray155);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("6343, " + arg0 + ", " + arg1 + ", " + -32357 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIIIII[I[I)V")
	private void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg7[arg0++] = arg6[arg4++];
					arg7[arg0++] = arg6[arg4++];
					arg7[arg0++] = arg6[arg4++];
					arg7[arg0++] = arg6[arg4++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg7[arg0++] = arg6[arg4++];
				}
				arg0 += arg5;
				arg4 += arg3;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("6170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 28339 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(III)V")
	public void method103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt187;
			arg1 += this.anInt188;
			@Pc(19) int local19 = arg0 + arg1 * Class1_Sub1_Sub1.anInt729;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt186;
			@Pc(27) int local27 = this.anInt185;
			@Pc(31) int local31 = Class1_Sub1_Sub1.anInt729 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub1.anInt731) {
				local40 = Class1_Sub1_Sub1.anInt731 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub1.anInt731;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg1 + local24 > Class1_Sub1_Sub1.anInt732) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt733) {
				local40 = Class1_Sub1_Sub1.anInt733 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub1.anInt733;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub1.anInt734) {
				local40 = arg0 + local27 - Class1_Sub1_Sub1.anInt734;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method104(Class1_Sub1_Sub1.anIntArray155, this.anIntArray39, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("50442, " + arg0 + ", " + 16083 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method104(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIZ)V")
	public void method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		try {
			arg0 += this.anInt187;
			@Pc(8) int local8;
			if (arg2) {
				for (local8 = 1; local8 > 0; local8++) {
				}
			}
			arg1 += this.anInt188;
			local8 = arg0 + arg1 * Class1_Sub1_Sub1.anInt729;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt186;
			@Pc(32) int local32 = this.anInt185;
			@Pc(36) int local36 = Class1_Sub1_Sub1.anInt729 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub1.anInt731) {
				local45 = Class1_Sub1_Sub1.anInt731 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub1.anInt731;
				local26 = local45 * local32 + 0;
				local8 += local45 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg1 + local29 > Class1_Sub1_Sub1.anInt732) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt733) {
				local45 = Class1_Sub1_Sub1.anInt733 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub1.anInt733;
				local26 += local45;
				local8 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub1.anInt734) {
				local45 = arg0 + local32 - Class1_Sub1_Sub1.anInt734;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method106(local26, local32, Class1_Sub1_Sub1.anIntArray155, 0, this.anIntArray39, local38, local29, local36, local8);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("91057, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(II[II[IIIIIII)V")
	private void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg6; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg1; local13 < 0; local13++) {
					@Pc(20) int local20 = arg4[arg0++];
					if (local20 == 0) {
						arg8++;
					} else {
						@Pc(26) int local26 = arg2[arg8];
						arg2[arg8++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg7;
				arg0 += arg5;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("76998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + 8 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "b", descriptor = "(II[II[IIIIIII)V")
	public void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(13) int local13 = -arg8 / 2;
				@Pc(18) int local18 = -arg0 / 2;
				@Pc(27) int local27 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
				@Pc(36) int local36 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
				@Pc(42) int local42 = local27 * arg3 >> 8;
				@Pc(48) int local48 = local36 * arg3 >> 8;
				@Pc(60) int local60 = (arg9 << 16) + local18 * local42 + local13 * local48;
				@Pc(72) int local72 = (arg5 << 16) + (local18 * local48 - local13 * local42);
				@Pc(78) int local78 = arg7 + arg6 * Class1_Sub1_Sub1.anInt729;
				for (@Pc(80) int local80 = 0; local80 < arg0; local80++) {
					@Pc(86) int local86 = arg4[local80];
					@Pc(90) int local90 = local78 + local86;
					@Pc(96) int local96 = local60 + local48 * local86;
					@Pc(102) int local102 = local72 - local42 * local86;
					for (@Pc(107) int local107 = -arg2[local80]; local107 < 0; local107++) {
						Class1_Sub1_Sub1.anIntArray155[local90++] = this.anIntArray39[(local96 >> 16) + (local102 >> 16) * this.anInt185];
						local96 += local48;
						local102 -= local42;
					}
					local60 += local42;
					local72 += local48;
					local78 += Class1_Sub1_Sub1.anInt729;
				}
			} catch (@Pc(155) Exception local155) {
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("8964, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -236 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(IIIIIIIDI)V")
	public void method108(@OriginalArg(0) int arg0, @OriginalArg(7) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg2 + arg0 * Class1_Sub1_Sub1.anInt729;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray39[(local77 >> 16) + (local79 >> 16) * this.anInt185];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub1.anIntArray155[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub1.anInt729;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("71953, " + arg0 + ", " + 15 + ", " + 20 + ", " + 15 + ", " + 41960 + ", " + 256 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "(Lclient!DSMJIEPN;ZII)V")
	public void method109(@OriginalArg(0) Class1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt187;
			arg1 += this.anInt188;
			@Pc(15) int local15 = arg2 + arg1 * Class1_Sub1_Sub1.anInt729;
			@Pc(17) int local17 = 0;
			@Pc(25) int local25 = this.anInt186;
			@Pc(28) int local28 = this.anInt185;
			@Pc(32) int local32 = Class1_Sub1_Sub1.anInt729 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub1.anInt731) {
				local41 = Class1_Sub1_Sub1.anInt731 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub1.anInt731;
				local17 = local41 * local28 + 0;
				local15 += local41 * Class1_Sub1_Sub1.anInt729;
			}
			if (arg1 + local25 > Class1_Sub1_Sub1.anInt732) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub1.anInt732;
			}
			if (arg2 < Class1_Sub1_Sub1.anInt733) {
				local41 = Class1_Sub1_Sub1.anInt733 - arg2;
				local28 -= local41;
				arg2 = Class1_Sub1_Sub1.anInt733;
				local17 += local41;
				local15 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg2 + local28 > Class1_Sub1_Sub1.anInt734) {
				local41 = arg2 + local28 - Class1_Sub1_Sub1.anInt734;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method110(this.anIntArray39, local28, arg0.aByteArray3, local25, Class1_Sub1_Sub1.anIntArray155, 0, this.aBoolean43, local32, local15, local34, local17);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("70668, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXGZMTJK", name = "a", descriptor = "([II[BI[IIZIIII)V")
	private void method110(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(10) int local10;
			if (!arg6) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			@Pc(20) int local20 = -(arg1 & 0x3);
			for (local10 = -arg3; local10 < 0; local10++) {
				@Pc(34) int local34;
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					local34 = arg0[arg10++];
					if (local34 != 0 && arg2[arg8] == 0) {
						arg4[arg8++] = local34;
					} else {
						arg8++;
					}
					local34 = arg0[arg10++];
					if (local34 != 0 && arg2[arg8] == 0) {
						arg4[arg8++] = local34;
					} else {
						arg8++;
					}
					local34 = arg0[arg10++];
					if (local34 != 0 && arg2[arg8] == 0) {
						arg4[arg8++] = local34;
					} else {
						arg8++;
					}
					local34 = arg0[arg10++];
					if (local34 != 0 && arg2[arg8] == 0) {
						arg4[arg8++] = local34;
					} else {
						arg8++;
					}
				}
				for (@Pc(110) int local110 = local20; local110 < 0; local110++) {
					local34 = arg0[arg10++];
					if (local34 != 0 && arg2[arg8] == 0) {
						arg4[arg8++] = local34;
					} else {
						arg8++;
					}
				}
				arg8 += arg7;
				arg10 += arg9;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("37704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
