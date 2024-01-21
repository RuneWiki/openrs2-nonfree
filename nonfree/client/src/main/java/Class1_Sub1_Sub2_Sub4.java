import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "[I")
	private static int[] anIntArray212 = new int[256];

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
	private int anInt751 = 33317;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private int anInt753 = -251;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray206 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray207 = new int[94];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray208 = new int[94];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray209 = new int[94];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray210 = new int[95];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
	private int[] anIntArray211 = new int[256];

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
	public int anInt754;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray212[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(BLjava/lang/String;Lclient!yb;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class45 arg2) {
		try {
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(arg2.method644(arg1 + ".dat", null), true);
			@Pc(70) Class1_Sub1_Sub3 local70 = new Class1_Sub1_Sub3(arg2.method644("index.dat", null), true);
			local70.anInt777 = local61.method470() + 4;
			@Pc(81) int local81 = local70.method468();
			if (local81 > 0) {
				local70.anInt777 += (local81 - 1) * 3;
			}
			@Pc(126) int local126;
			for (@Pc(102) int local102 = 0; local102 < 94; local102++) {
				this.anIntArray208[local102] = local70.method468();
				this.anIntArray209[local102] = local70.method468();
				local126 = this.anIntArray206[local102] = local70.method470();
				@Pc(134) int local134 = this.anIntArray207[local102] = local70.method470();
				@Pc(137) int local137 = local70.method468();
				@Pc(141) int local141 = local126 * local134;
				this.aByteArrayArray3[local102] = new byte[local141];
				@Pc(151) int local151;
				@Pc(176) int local176;
				if (local137 == 0) {
					for (local151 = 0; local151 < local141; local151++) {
						this.aByteArrayArray3[local102][local151] = local61.method469();
					}
				} else if (local137 == 1) {
					for (local151 = 0; local151 < local126; local151++) {
						for (local176 = 0; local176 < local134; local176++) {
							this.aByteArrayArray3[local102][local151 + local176 * local126] = local61.method469();
						}
					}
				}
				if (local134 > this.anInt754) {
					this.anInt754 = local134;
				}
				this.anIntArray208[local102] = 1;
				this.anIntArray210[local102] = local126 + 2;
				local151 = 0;
				for (local176 = local134 / 7; local176 < local134; local176++) {
					local151 += this.aByteArrayArray3[local102][local176 * local126];
				}
				@Pc(250) int local250;
				if (local151 <= local134 / 7) {
					local250 = this.anIntArray210[local102]--;
					this.anIntArray208[local102] = 0;
				}
				local151 = 0;
				for (@Pc(264) int local264 = local134 / 7; local264 < local134; local264++) {
					local151 += this.aByteArrayArray3[local102][local126 + local264 * local126 - 1];
				}
				if (local151 <= local134 / 7) {
					local250 = this.anIntArray210[local102]--;
				}
			}
			this.anIntArray210[94] = this.anIntArray210[8];
			for (local126 = 0; local126 < 256; local126++) {
				this.anIntArray211[local126] = this.anIntArray210[anIntArray212[local126]];
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("20231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;III)V")
	public void method441(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.method444(arg4, arg2 - this.method443((byte) 2, arg1) / 2, arg3, arg1);
			if (arg0 == -53) {
				;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("56428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIILjava/lang/String;)V")
	public void method442(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method446(arg0, arg3, arg4, arg1, arg2 - this.method443((byte) 2, arg4) / 2);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("48017, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -400 + ", " + arg4 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method443(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
				if (arg1.charAt(local9) == '@' && local9 + 4 < arg1.length() && arg1.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray211[arg1.charAt(local9)];
				}
			}
			@Pc(51) boolean local51 = false;
			return local7;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("71351, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg2 - this.anInt754;
				for (@Pc(9) int local9 = 0; local9 < arg3.length(); local9++) {
					@Pc(17) int local17 = anIntArray212[arg3.charAt(local9)];
					if (local17 != 94) {
						this.method449(this.aByteArrayArray3[local17], arg1 + this.anIntArray208[local17], local7 + this.anIntArray209[local17], this.anIntArray206[local17], this.anIntArray207[local17], arg0);
					}
					arg1 += this.anIntArray210[local17];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("36266, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
	public void method445(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != 117) {
				this.anInt751 = 29;
			}
			if (arg1 != null) {
				arg5 -= this.method443((byte) 2, arg1) / 2;
				@Pc(22) int local22 = arg3 - this.anInt754;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					@Pc(32) int local32 = anIntArray212[arg1.charAt(local24)];
					if (local32 != 94) {
						this.method449(this.aByteArrayArray3[local32], arg5 + this.anIntArray208[local32], local22 + this.anIntArray209[local32] + (int) (Math.sin((double) local24 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray206[local32], this.anIntArray207[local32], arg2);
					}
					arg5 += this.anIntArray210[local32];
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("29666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZLjava/lang/String;ZI)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(9) int local9 = arg1 - this.anInt754;
				for (@Pc(16) int local16 = 0; local16 < arg2.length(); local16++) {
					if (arg2.charAt(local16) == '@' && local16 + 4 < arg2.length() && arg2.charAt(local16 + 4) == '@') {
						arg0 = this.method448(arg2.substring(local16 + 1, local16 + 4));
						local16 += 4;
					} else {
						@Pc(57) int local57 = anIntArray212[arg2.charAt(local16)];
						if (local57 != 94) {
							if (arg3) {
								this.method449(this.aByteArrayArray3[local57], arg4 + this.anIntArray208[local57] + 1, local9 + this.anIntArray209[local57] + 1, this.anIntArray206[local57], this.anIntArray207[local57], 0);
							}
							this.method449(this.aByteArrayArray3[local57], arg4 + this.anIntArray208[local57], local9 + this.anIntArray209[local57], this.anIntArray206[local57], this.anIntArray207[local57], arg0);
						}
						arg4 += this.anIntArray210[local57];
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("71490, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZLjava/lang/String;IZI)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg1);
				@Pc(22) int local22 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt754;
				for (@Pc(29) int local29 = 0; local29 < arg2.length(); local29++) {
					if (arg2.charAt(local29) == '@' && local29 + 4 < arg2.length() && arg2.charAt(local29 + 4) == '@') {
						arg4 = this.method448(arg2.substring(local29 + 1, local29 + 4));
						local29 += 4;
					} else {
						@Pc(70) int local70 = anIntArray212[arg2.charAt(local29)];
						if (local70 != 94) {
							this.method451(this.anIntArray207[local70], this.anIntArray206[local70], this.aByteArrayArray3[local70], 0, arg3 + this.anIntArray208[local70] + 1, local27 + this.anIntArray209[local70] + 1, 192);
							this.method451(this.anIntArray207[local70], this.anIntArray206[local70], this.aByteArrayArray3[local70], arg4, arg3 + this.anIntArray208[local70], local27 + this.anIntArray209[local70], local22);
						}
						arg3 += this.anIntArray210[local70];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("40768, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method448(@OriginalArg(0) String arg0) {
		try {
			if (arg0.equals("red")) {
				return 16711680;
			} else if (arg0.equals("gre")) {
				return 65280;
			} else if (arg0.equals("blu")) {
				return 255;
			} else if (arg0.equals("yel")) {
				return 16776960;
			} else if (arg0.equals("cya")) {
				return 65535;
			} else if (arg0.equals("mag")) {
				return 16711935;
			} else if (arg0.equals("whi")) {
				return 16777215;
			} else if (arg0.equals("bla")) {
				return 0;
			} else if (arg0.equals("lre")) {
				return 16748608;
			} else if (arg0.equals("dre")) {
				return 8388608;
			} else if (arg0.equals("dbl")) {
				return 128;
			} else if (arg0.equals("or1")) {
				return 16756736;
			} else if (arg0.equals("or2")) {
				return 16740352;
			} else if (arg0.equals("or3")) {
				return 16723968;
			} else if (arg0.equals("gr1")) {
				return 12648192;
			} else if (arg0.equals("gr2")) {
				return 8453888;
			} else if (arg0.equals("gr3")) {
				return 4259584;
			} else {
				return 0;
			}
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("22569, " + arg0 + ", " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method449(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt742;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt742 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt744) {
			local20 = Class1_Sub1_Sub2.anInt744 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt744;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt742;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt745) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt745;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt746) {
			local20 = Class1_Sub1_Sub2.anInt746 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt746;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt747) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt747;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method450(Class1_Sub1_Sub2.anIntArray205, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method450(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) int local6 = -(arg5 >> 2);
		@Pc(11) int local11 = -(arg5 & 0x3);
		for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(77) int local77 = local11; local77 < 0; local77++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III[BIIII)V")
	private void method451(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg4 + arg5 * Class1_Sub1_Sub2.anInt742;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt742 - arg1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg5 < Class1_Sub1_Sub2.anInt744) {
				local20 = Class1_Sub1_Sub2.anInt744 - arg5;
				arg0 -= local20;
				arg5 = Class1_Sub1_Sub2.anInt744;
				local13 = local20 * arg1 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg5 + arg0 >= Class1_Sub1_Sub2.anInt745) {
				arg0 -= arg5 + arg0 + 1 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg4 < Class1_Sub1_Sub2.anInt746) {
				local20 = Class1_Sub1_Sub2.anInt746 - arg4;
				arg1 -= local20;
				arg4 = Class1_Sub1_Sub2.anInt746;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg4 + arg1 >= Class1_Sub1_Sub2.anInt747) {
				local20 = arg4 + arg1 + 1 - Class1_Sub1_Sub2.anInt747;
				arg1 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg1 > 0 && arg0 > 0) {
				this.method452(Class1_Sub1_Sub2.anIntArray205, local9, arg2, local5, arg6, arg1, arg0, arg3, local13, local11);
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("69687, " + arg0 + ", " + -251 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([II[BIIIIIIII)V")
	private void method452(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg4;
			for (@Pc(35) int local35 = -arg6; local35 < 0; local35++) {
				for (@Pc(40) int local40 = -arg5; local40 < 0; local40++) {
					if (arg2[arg8++] == 0) {
						arg3++;
					} else {
						@Pc(51) int local51 = arg0[arg3];
						arg0[arg3++] = (((local51 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local51 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg3 += arg1;
				arg8 += arg9;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("33855, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 385 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
