import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
	private static int[] anIntArray212 = new int[256];

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "B")
	private byte aByte20 = -73;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt743 = 7;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
	private int[] anIntArray206 = new int[94];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray207 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray208 = new int[94];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray209 = new int[94];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray210 = new int[95];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray211 = new int[256];

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	public int anInt744;

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

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(BLclient!yb;Ljava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) byte arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(61) Class1_Sub1_Sub3 local61 = new Class1_Sub1_Sub3(699, arg1.method639(arg2 + ".dat", null));
			@Pc(86) Class1_Sub1_Sub3 local86 = new Class1_Sub1_Sub3(699, arg1.method639("index.dat", null));
			local86.anInt771 = local61.method469() + 4;
			@Pc(97) int local97 = local86.method467();
			if (local97 > 0) {
				local86.anInt771 += (local97 - 1) * 3;
			}
			@Pc(135) int local135;
			for (@Pc(111) int local111 = 0; local111 < 94; local111++) {
				this.anIntArray208[local111] = local86.method467();
				this.anIntArray209[local111] = local86.method467();
				local135 = this.anIntArray206[local111] = local86.method469();
				@Pc(143) int local143 = this.anIntArray207[local111] = local86.method469();
				@Pc(146) int local146 = local86.method467();
				@Pc(150) int local150 = local135 * local143;
				this.aByteArrayArray3[local111] = new byte[local150];
				@Pc(160) int local160;
				@Pc(185) int local185;
				if (local146 == 0) {
					for (local160 = 0; local160 < local150; local160++) {
						this.aByteArrayArray3[local111][local160] = local61.method468();
					}
				} else if (local146 == 1) {
					for (local160 = 0; local160 < local135; local160++) {
						for (local185 = 0; local185 < local143; local185++) {
							this.aByteArrayArray3[local111][local160 + local185 * local135] = local61.method468();
						}
					}
				}
				if (local143 > this.anInt744) {
					this.anInt744 = local143;
				}
				this.anIntArray208[local111] = 1;
				this.anIntArray210[local111] = local135 + 2;
				local160 = 0;
				for (local185 = local143 / 7; local185 < local143; local185++) {
					local160 += this.aByteArrayArray3[local111][local185 * local135];
				}
				@Pc(259) int local259;
				if (local160 <= local143 / 7) {
					local259 = this.anIntArray210[local111]--;
					this.anIntArray208[local111] = 0;
				}
				local160 = 0;
				for (@Pc(273) int local273 = local143 / 7; local273 < local143; local273++) {
					local160 += this.aByteArrayArray3[local111][local135 + local273 * local135 - 1];
				}
				if (local160 <= local143 / 7) {
					local259 = this.anIntArray210[local111]--;
				}
			}
			this.anIntArray210[94] = this.anIntArray210[8];
			for (local135 = 0; local135 < 256; local135++) {
				this.anIntArray211[local135] = this.anIntArray210[anIntArray212[local135]];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("14621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method440(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method443(arg1 - this.method442(arg0) / 2, arg0, this.aBoolean150, arg3, arg2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("35058, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 39475 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZILjava/lang/String;II)V")
	public void method441(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.method445(arg1, arg3, arg4, arg2, arg5 - this.method442(arg3) / 2);
			@Pc(19) boolean local19 = false;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("60697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method442(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local7 += this.anIntArray211[arg0.charAt(local14)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("25572, " + 37 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;ZII)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg4 - this.anInt744;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(17) int local17 = anIntArray212[arg1.charAt(local9)];
					if (local17 != 94) {
						this.method448(this.aByteArrayArray3[local17], arg0 + this.anIntArray208[local17], local7 + this.anIntArray209[local17], this.anIntArray206[local17], this.anIntArray207[local17], arg3);
					}
					arg0 += this.anIntArray210[local17];
				}
				if (!arg2) {
					;
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("2413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method442(arg4) / 2;
				@Pc(16) int local16 = arg1 - this.anInt744;
				for (@Pc(32) int local32 = 0; local32 < arg4.length(); local32++) {
					@Pc(40) int local40 = anIntArray212[arg4.charAt(local32)];
					if (local40 != 94) {
						this.method448(this.aByteArrayArray3[local40], arg3 + this.anIntArray208[local40], local16 + this.anIntArray209[local40] + (int) (Math.sin((double) local32 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray206[local40], this.anIntArray207[local40], arg2);
					}
					arg3 += this.anIntArray210[local40];
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("90377, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;ZIII)V")
	public void method445(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg3 - this.anInt744;
				for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
					if (arg1.charAt(local11) == '@' && local11 + 4 < arg1.length() && arg1.charAt(local11 + 4) == '@') {
						arg2 = this.method447(arg1.substring(local11 + 1, local11 + 4));
						local11 += 4;
					} else {
						@Pc(52) int local52 = anIntArray212[arg1.charAt(local11)];
						if (local52 != 94) {
							if (arg0) {
								this.method448(this.aByteArrayArray3[local52], arg4 + this.anIntArray208[local52] + 1, local9 + this.anIntArray209[local52] + 1, this.anIntArray206[local52], this.anIntArray207[local52], 0);
							}
							this.method448(this.aByteArrayArray3[local52], arg4 + this.anIntArray208[local52], local9 + this.anIntArray209[local52], this.anIntArray206[local52], this.anIntArray207[local52], arg2);
						}
						arg4 += this.anIntArray210[local52];
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("36680, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;IIZIZ)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(22) int local22 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt744;
				for (@Pc(29) int local29 = 0; local29 < arg1.length(); local29++) {
					if (arg1.charAt(local29) == '@' && local29 + 4 < arg1.length() && arg1.charAt(local29 + 4) == '@') {
						arg0 = this.method447(arg1.substring(local29 + 1, local29 + 4));
						local29 += 4;
					} else {
						@Pc(70) int local70 = anIntArray212[arg1.charAt(local29)];
						if (local70 != 94) {
							this.method450(192, this.aByteArrayArray3[local70], local27 + this.anIntArray209[local70] + 1, this.aByte20, arg3 + this.anIntArray208[local70] + 1, this.anIntArray206[local70], this.anIntArray207[local70], 0);
							this.method450(local22, this.aByteArrayArray3[local70], local27 + this.anIntArray209[local70], this.aByte20, arg3 + this.anIntArray208[local70], this.anIntArray206[local70], this.anIntArray207[local70], arg0);
						}
						arg3 += this.anIntArray210[local70];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("26358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + true + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method447(@OriginalArg(0) String arg0) {
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
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("66263, " + arg0 + ", " + -32565 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method448(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt734;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt734 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt736) {
			local20 = Class1_Sub1_Sub2.anInt736 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt736;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt734;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt737) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt737;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt738) {
			local20 = Class1_Sub1_Sub2.anInt738 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt738;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt739) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt739;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method449(Class1_Sub1_Sub2.anIntArray205, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method449(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[BIBIIII)V")
	private void method450(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg4 + arg2 * Class1_Sub1_Sub2.anInt734;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt734 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg2 < Class1_Sub1_Sub2.anInt736) {
				local20 = Class1_Sub1_Sub2.anInt736 - arg2;
				arg6 -= local20;
				arg2 = Class1_Sub1_Sub2.anInt736;
				local13 = local20 * arg5 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg2 + arg6 >= Class1_Sub1_Sub2.anInt737) {
				arg6 -= arg2 + arg6 + 1 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg4 < Class1_Sub1_Sub2.anInt738) {
				local20 = Class1_Sub1_Sub2.anInt738 - arg4;
				arg5 -= local20;
				arg4 = Class1_Sub1_Sub2.anInt738;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg4 + arg5 >= Class1_Sub1_Sub2.anInt739) {
				local20 = arg4 + arg5 + 1 - Class1_Sub1_Sub2.anInt739;
				arg5 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg5 > 0 && arg6 > 0) {
				this.method451(arg6, arg5, arg0, local13, local5, arg7, local9, local11, Class1_Sub1_Sub2.anIntArray205, arg1);
				if (arg3 != -73) {
					for (local20 = 1; local20 > 0; local20++) {
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("32914, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIII[IZ[B)V")
	private void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(19) int local19 = ((arg5 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg2 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg2;
			for (@Pc(29) int local29 = -arg0; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg1; local34 < 0; local34++) {
					if (arg9[arg3++] == 0) {
						arg4++;
					} else {
						@Pc(45) int local45 = arg8[arg4];
						arg8[arg4++] = (((local45 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local45 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg4 += arg6;
				arg3 += arg7;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("33026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + true + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
