import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GCURPWTI")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!GCURPWTI", name = "w", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!GCURPWTI", name = "x", descriptor = "I")
	private int anInt171 = 5;

	@OriginalMember(owner = "client!GCURPWTI", name = "y", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!GCURPWTI", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!GCURPWTI", name = "A", descriptor = "[I")
	private int[] anIntArray58 = new int[256];

	@OriginalMember(owner = "client!GCURPWTI", name = "B", descriptor = "[I")
	private int[] anIntArray59 = new int[256];

	@OriginalMember(owner = "client!GCURPWTI", name = "C", descriptor = "[I")
	private int[] anIntArray60 = new int[256];

	@OriginalMember(owner = "client!GCURPWTI", name = "D", descriptor = "[I")
	private int[] anIntArray61 = new int[256];

	@OriginalMember(owner = "client!GCURPWTI", name = "E", descriptor = "[I")
	private int[] anIntArray62 = new int[256];

	@OriginalMember(owner = "client!GCURPWTI", name = "G", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!GCURPWTI", name = "H", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!GCURPWTI", name = "F", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!GCURPWTI", name = "<init>", descriptor = "(Lclient!INOFEYKQ;IZLjava/lang/String;)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(60) Class3_Sub1_Sub3 local60 = new Class3_Sub1_Sub3((byte) -103, arg0.method202(arg3 + ".dat", (byte[]) null));
			@Pc(75) Class3_Sub1_Sub3 local75 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("index.dat", (byte[]) null));
			local75.anInt441 = local60.method276() + 4;
			@Pc(86) int local86 = local75.method274();
			if (local86 > 0) {
				local75.anInt441 += 3 * (local86 - 1);
			}
			for (@Pc(100) int local100 = 0; local100 < 256; local100++) {
				this.anIntArray60[local100] = local75.method274();
				this.anIntArray61[local100] = local75.method274();
				@Pc(124) int local124 = this.anIntArray58[local100] = local75.method276();
				@Pc(132) int local132 = this.anIntArray59[local100] = local75.method276();
				@Pc(135) int local135 = local75.method274();
				@Pc(139) int local139 = local124 * local132;
				this.aByteArrayArray1[local100] = new byte[local139];
				@Pc(149) int local149;
				@Pc(174) int local174;
				if (local135 == 0) {
					for (local149 = 0; local149 < local139; local149++) {
						this.aByteArrayArray1[local100][local149] = local60.method275();
					}
				} else if (local135 == 1) {
					for (local149 = 0; local149 < local124; local149++) {
						for (local174 = 0; local174 < local132; local174++) {
							this.aByteArrayArray1[local100][local149 + local174 * local124] = local60.method275();
						}
					}
				}
				if (local132 > this.anInt172 && local100 < 128) {
					this.anInt172 = local132;
				}
				this.anIntArray60[local100] = 1;
				this.anIntArray62[local100] = local124 + 2;
				local149 = 0;
				for (local174 = local132 / 7; local174 < local132; local174++) {
					local149 += this.aByteArrayArray1[local100][local174 * local124];
				}
				@Pc(251) int local251;
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray62[local100]--;
					this.anIntArray60[local100] = 0;
				}
				local149 = 0;
				for (@Pc(265) int local265 = local132 / 7; local265 < local132; local265++) {
					local149 += this.aByteArrayArray1[local100][local124 + local265 * local124 - 1];
				}
				if (local149 <= local132 / 7) {
					local251 = this.anIntArray62[local100]--;
				}
			}
			if (arg2) {
				this.anIntArray62[32] = this.anIntArray62[73];
			} else {
				this.anIntArray62[32] = this.anIntArray62[105];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("78694, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IZILjava/lang/String;I)V")
	public void method119(@OriginalArg(2) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method124(arg1, 507 - this.method123(arg1), arg0, arg2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("74512, " + 507 + ", " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IILjava/lang/String;BI)V")
	public void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method124(arg2, arg1 - this.method123(arg2) / 2, arg3, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("43562, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
	public void method121(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method128(arg3, arg4, arg1, arg0, arg2 - this.method122(arg4) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("50423, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method122(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray62[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("650, " + 0 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method123(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local5 += this.anIntArray62[arg0.charAt(local13)];
			}
			return local5;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("27379, " + arg0 + ", " + 2 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;IBII)V")
	public void method124(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg2 - this.anInt172;
				for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
					@Pc(15) char local15 = arg0.charAt(local9);
					if (local15 != ' ') {
						this.method131(this.aByteArrayArray1[local15], arg1 + this.anIntArray60[local15], local7 + this.anIntArray61[local15], this.anIntArray58[local15], this.anIntArray59[local15], arg3);
					}
					arg1 += this.anIntArray62[local15];
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("60594, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method123(arg4) / 2;
				@Pc(16) int local16 = arg1 - this.anInt172;
				for (@Pc(18) int local18 = 0; local18 < arg4.length(); local18++) {
					@Pc(24) char local24 = arg4.charAt(local18);
					if (local24 != ' ') {
						this.method131(this.aByteArrayArray1[local24], arg3 + this.anIntArray60[local24], local16 + this.anIntArray61[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray58[local24], this.anIntArray59[local24], arg2);
					}
					arg3 += this.anIntArray62[local24];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("35378, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -987 + ", " + arg4 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method126(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method123(arg0) / 2;
				@Pc(18) int local18 = arg2 - this.anInt172;
				for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
					@Pc(31) char local31 = arg0.charAt(local25);
					if (local31 != ' ') {
						this.method131(this.aByteArrayArray1[local31], arg1 + this.anIntArray60[local31] + (int) (Math.sin((double) local25 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local18 + this.anIntArray61[local31] + (int) (Math.sin((double) local25 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray58[local31], this.anIntArray59[local31], arg4);
					}
					arg1 += this.anIntArray62[local31];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("35709, " + arg0 + ", " + arg1 + ", " + -330 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IIIIZLjava/lang/String;I)V")
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg0 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method123(arg4) / 2;
				@Pc(29) int local29 = arg5 - this.anInt172;
				for (@Pc(34) int local34 = 0; local34 < arg4.length(); local34++) {
					@Pc(40) char local40 = arg4.charAt(local34);
					if (local40 != ' ') {
						this.method131(this.aByteArrayArray1[local40], arg2 + this.anIntArray60[local40], local29 + this.anIntArray61[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg1) * local9), this.anIntArray58[local40], this.anIntArray59[local40], arg3);
					}
					arg2 += this.anIntArray62[local40];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("26615, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(ILjava/lang/String;ZZII)V")
	public void method128(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean50 = false;
			@Pc(6) int local6 = arg4;
			if (arg1 != null) {
				@Pc(14) int local14 = arg0 - this.anInt172;
				for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
					if (arg1.charAt(local16) == '@' && local16 + 4 < arg1.length() && arg1.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method130(arg1.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg3 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg1.charAt(local16);
						if (local60 != ' ') {
							if (arg2) {
								this.method131(this.aByteArrayArray1[local60], arg4 + this.anIntArray60[local60] + 1, local14 + this.anIntArray61[local60] + 1, this.anIntArray58[local60], this.anIntArray59[local60], 0);
							}
							this.method131(this.aByteArrayArray1[local60], arg4 + this.anIntArray60[local60], local14 + this.anIntArray61[local60], this.anIntArray58[local60], this.anIntArray59[local60], arg3);
						}
						arg4 += this.anIntArray62[local60];
					}
				}
				if (this.aBoolean50) {
					Class3_Sub1_Sub2.method557(local14 + (int) ((double) this.anInt172 * 0.7D), 8388608, local6, arg4 - local6);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("93596, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(IIZIZILjava/lang/String;)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg1);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt172;
				for (@Pc(27) int local27 = 0; local27 < arg4.length(); local27++) {
					if (arg4.charAt(local27) == '@' && local27 + 4 < arg4.length() && arg4.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method130(arg4.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg2 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg4.charAt(local27);
						if (local71 != ' ') {
							this.method133(local25 + this.anIntArray61[local71] + 1, this.anIntArray59[local71], 192, this.aByteArrayArray1[local71], 0, this.anIntArray58[local71], arg3 + this.anIntArray60[local71] + 1);
							this.method133(local25 + this.anIntArray61[local71], this.anIntArray59[local71], local20, this.aByteArrayArray1[local71], arg2, this.anIntArray58[local71], arg3 + this.anIntArray60[local71]);
						}
						arg3 += this.anIntArray62[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("4838, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method130(@OriginalArg(0) String arg0) {
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
				if (arg0.equals("str")) {
					this.aBoolean50 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean50 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("79784, " + arg0 + ", " + -960 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "([BIIIII)V")
	private void method131(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub1_Sub2.anInt783;
		@Pc(9) int local9 = Class3_Sub1_Sub2.anInt783 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub1_Sub2.anInt785) {
			local20 = Class3_Sub1_Sub2.anInt785 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub1_Sub2.anInt785;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub1_Sub2.anInt783;
		}
		if (arg2 + arg4 >= Class3_Sub1_Sub2.anInt786) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub1_Sub2.anInt786;
		}
		if (arg1 < Class3_Sub1_Sub2.anInt787) {
			local20 = Class3_Sub1_Sub2.anInt787 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub1_Sub2.anInt787;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub1_Sub2.anInt788) {
			local20 = arg1 + arg3 + 1 - Class3_Sub1_Sub2.anInt788;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method132(Class3_Sub1_Sub2.anIntArray208, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method132(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(III[BBIII)V")
	private void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(9) int local9 = arg6 + arg0 * Class3_Sub1_Sub2.anInt783;
			@Pc(13) int local13 = Class3_Sub1_Sub2.anInt783 - arg5;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			if (arg0 < Class3_Sub1_Sub2.anInt785) {
				local24 = Class3_Sub1_Sub2.anInt785 - arg0;
				arg1 -= local24;
				arg0 = Class3_Sub1_Sub2.anInt785;
				local17 = local24 * arg5 + 0;
				local9 += local24 * Class3_Sub1_Sub2.anInt783;
			}
			if (arg0 + arg1 >= Class3_Sub1_Sub2.anInt786) {
				arg1 -= arg0 + arg1 + 1 - Class3_Sub1_Sub2.anInt786;
			}
			if (arg6 < Class3_Sub1_Sub2.anInt787) {
				local24 = Class3_Sub1_Sub2.anInt787 - arg6;
				arg5 -= local24;
				arg6 = Class3_Sub1_Sub2.anInt787;
				local17 += local24;
				local9 += local24;
				local15 = local24 + 0;
				local13 += local24;
			}
			if (arg6 + arg5 >= Class3_Sub1_Sub2.anInt788) {
				local24 = arg6 + arg5 + 1 - Class3_Sub1_Sub2.anInt788;
				arg5 -= local24;
				local15 += local24;
				local13 += local24;
			}
			if (arg5 > 0 && arg1 > 0) {
				this.method134(local15, local9, arg5, arg3, arg1, arg4, local13, arg2, Class3_Sub1_Sub2.anIntArray208, local17);
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("75375, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -105 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GCURPWTI", name = "a", descriptor = "(III[BIIII[IZI)V")
	private void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(28) int local28 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(32) int local32 = 256 - arg7;
			for (@Pc(35) int local35 = -arg4; local35 < 0; local35++) {
				for (@Pc(40) int local40 = -arg2; local40 < 0; local40++) {
					if (arg3[arg9++] == 0) {
						arg1++;
					} else {
						@Pc(51) int local51 = arg8[arg1];
						arg8[arg1++] = (((local51 & 0xFF00FF) * local32 & 0xFF00FF00) + ((local51 & 0xFF00) * local32 & 0xFF0000) >> 8) + local28;
					}
				}
				arg1 += arg6;
				arg9 += arg0;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("94480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + true + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
