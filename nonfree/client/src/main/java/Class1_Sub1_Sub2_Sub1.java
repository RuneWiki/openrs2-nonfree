import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CWXRTTYV")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!CWXRTTYV", name = "y", descriptor = "I")
	private int anInt97 = 536;

	@OriginalMember(owner = "client!CWXRTTYV", name = "z", descriptor = "I")
	private int anInt98 = -400;

	@OriginalMember(owner = "client!CWXRTTYV", name = "A", descriptor = "I")
	private int anInt99 = -703;

	@OriginalMember(owner = "client!CWXRTTYV", name = "B", descriptor = "I")
	private int anInt100 = -12929;

	@OriginalMember(owner = "client!CWXRTTYV", name = "C", descriptor = "I")
	private int anInt101 = 7;

	@OriginalMember(owner = "client!CWXRTTYV", name = "D", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!CWXRTTYV", name = "E", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!CWXRTTYV", name = "F", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!CWXRTTYV", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!CWXRTTYV", name = "H", descriptor = "[I")
	private int[] anIntArray17 = new int[256];

	@OriginalMember(owner = "client!CWXRTTYV", name = "I", descriptor = "[I")
	private int[] anIntArray18 = new int[256];

	@OriginalMember(owner = "client!CWXRTTYV", name = "J", descriptor = "[I")
	private int[] anIntArray19 = new int[256];

	@OriginalMember(owner = "client!CWXRTTYV", name = "K", descriptor = "[I")
	private int[] anIntArray20 = new int[256];

	@OriginalMember(owner = "client!CWXRTTYV", name = "L", descriptor = "[I")
	private int[] anIntArray21 = new int[256];

	@OriginalMember(owner = "client!CWXRTTYV", name = "N", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!CWXRTTYV", name = "O", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!CWXRTTYV", name = "M", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!CWXRTTYV", name = "<init>", descriptor = "(ZLjava/lang/String;ZLclient!UUIGNTAD;)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class38 arg3) {
		try {
			@Pc(76) Class1_Sub1_Sub3 local76 = new Class1_Sub1_Sub3(arg3.method512(arg1 + ".dat", null), this.anInt97);
			@Pc(101) Class1_Sub1_Sub3 local101 = new Class1_Sub1_Sub3(arg3.method512("index.dat", null), this.anInt97);
			local101.anInt78 = local76.method57() + 4;
			@Pc(112) int local112 = local101.method55();
			if (local112 > 0) {
				local101.anInt78 += (local112 - 1) * 3;
			}
			for (@Pc(126) int local126 = 0; local126 < 256; local126++) {
				this.anIntArray19[local126] = local101.method55();
				this.anIntArray20[local126] = local101.method55();
				@Pc(150) int local150 = this.anIntArray17[local126] = local101.method57();
				@Pc(158) int local158 = this.anIntArray18[local126] = local101.method57();
				@Pc(161) int local161 = local101.method55();
				@Pc(165) int local165 = local150 * local158;
				this.aByteArrayArray2[local126] = new byte[local165];
				@Pc(175) int local175;
				@Pc(200) int local200;
				if (local161 == 0) {
					for (local175 = 0; local175 < local165; local175++) {
						this.aByteArrayArray2[local126][local175] = local76.method56();
					}
				} else if (local161 == 1) {
					for (local175 = 0; local175 < local150; local175++) {
						for (local200 = 0; local200 < local158; local200++) {
							this.aByteArrayArray2[local126][local175 + local200 * local150] = local76.method56();
						}
					}
				}
				if (local158 > this.anInt102 && local126 < 128) {
					this.anInt102 = local158;
				}
				this.anIntArray19[local126] = 1;
				this.anIntArray21[local126] = local150 + 2;
				local175 = 0;
				for (local200 = local158 / 7; local200 < local158; local200++) {
					local175 += this.aByteArrayArray2[local126][local200 * local150];
				}
				@Pc(277) int local277;
				if (local175 <= local158 / 7) {
					local277 = this.anIntArray21[local126]--;
					this.anIntArray19[local126] = 0;
				}
				local175 = 0;
				for (@Pc(291) int local291 = local158 / 7; local291 < local158; local291++) {
					local175 += this.aByteArrayArray2[local126][local150 + local291 * local150 - 1];
				}
				if (local175 <= local158 / 7) {
					local277 = this.anIntArray21[local126]--;
				}
			}
			if (arg0) {
				this.anIntArray21[32] = this.anIntArray21[73];
			} else {
				this.anIntArray21[32] = this.anIntArray21[105];
			}
		} catch (@Pc(350) RuntimeException local350) {
			signlink.reporterror("35831, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local350.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIBLjava/lang/String;)V")
	public void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2) {
		try {
			this.method111(507 - this.method110(arg2), arg0, arg2, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("65354, " + arg0 + ", " + arg1 + ", " + 507 + ", " + 25 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIZILjava/lang/String;)V")
	public void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method111(arg1 - this.method110(arg3) / 2, arg0, arg3, arg2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62657, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIZILjava/lang/String;Z)V")
	public void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.method115(arg3 - this.method109(arg4) / 2, arg0, arg2, arg4, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("89263, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method109(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				if (arg0.charAt(local15) == '@' && local15 + 4 < arg0.length() && arg0.charAt(local15 + 4) == '@') {
					local15 += 4;
				} else {
					local13 += this.anIntArray21[arg0.charAt(local15)];
				}
			}
			return local13;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("19724, " + arg0 + ", " + -86 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method110(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local5 += this.anIntArray21[arg0.charAt(local13)];
			}
			return local5;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("95159, " + -120 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IZILjava/lang/String;I)V")
	public void method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg3 - this.anInt102;
				for (@Pc(9) int local9 = 0; local9 < arg2.length(); local9++) {
					@Pc(15) char local15 = arg2.charAt(local9);
					if (local15 != ' ') {
						this.method118(this.aByteArrayArray2[local15], arg0 + this.anIntArray19[local15], local7 + this.anIntArray20[local15], this.anIntArray17[local15], this.anIntArray18[local15], arg1);
					}
					arg0 += this.anIntArray21[local15];
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("11283, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg0 -= this.method110(arg3) / 2;
				@Pc(20) int local20 = arg4 - this.anInt102;
				for (@Pc(22) int local22 = 0; local22 < arg3.length(); local22++) {
					@Pc(28) char local28 = arg3.charAt(local22);
					if (local28 != ' ') {
						this.method118(this.aByteArrayArray2[local28], arg0 + this.anIntArray19[local28], local20 + this.anIntArray20[local28] + (int) (Math.sin((double) local22 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray17[local28], this.anIntArray18[local28], arg2);
					}
					arg0 += this.anIntArray21[local28];
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("71239, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -47669 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method110(arg4) / 2;
				@Pc(20) int local20 = arg3 - this.anInt102;
				for (@Pc(22) int local22 = 0; local22 < arg4.length(); local22++) {
					@Pc(28) char local28 = arg4.charAt(local22);
					if (local28 != ' ') {
						this.method118(this.aByteArrayArray2[local28], arg1 + this.anIntArray19[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local20 + this.anIntArray20[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray17[local28], this.anIntArray18[local28], arg2);
					}
					arg1 += this.anIntArray21[local28];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("39943, " + arg0 + ", " + arg1 + ", " + -38706 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		try {
			if (arg6 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg4 / 8.0D;
				if (arg5 != this.anInt100) {
					this.anInt97 = -405;
				}
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg1 -= this.method110(arg6) / 2;
				@Pc(36) int local36 = arg2 - this.anInt102;
				for (@Pc(38) int local38 = 0; local38 < arg6.length(); local38++) {
					@Pc(44) char local44 = arg6.charAt(local38);
					if (local44 != ' ') {
						this.method118(this.aByteArrayArray2[local44], arg1 + this.anIntArray19[local44], local36 + this.anIntArray20[local44] + (int) (Math.sin((double) local38 / 1.5D + (double) arg3) * local9), this.anIntArray17[local44], this.anIntArray18[local44], arg0);
					}
					arg1 += this.anIntArray21[local44];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("58481, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
	public void method115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean37 = false;
			@Pc(16) int local16 = arg0;
			if (arg3 != null) {
				@Pc(24) int local24 = arg1 - this.anInt102;
				for (@Pc(26) int local26 = 0; local26 < arg3.length(); local26++) {
					if (arg3.charAt(local26) == '@' && local26 + 4 < arg3.length() && arg3.charAt(local26 + 4) == '@') {
						@Pc(58) int local58 = this.method117(arg3.substring(local26 + 1, local26 + 4));
						if (local58 != -1) {
							arg4 = local58;
						}
						local26 += 4;
					} else {
						@Pc(70) char local70 = arg3.charAt(local26);
						if (local70 != ' ') {
							if (arg2) {
								this.method118(this.aByteArrayArray2[local70], arg0 + this.anIntArray19[local70] + 1, local24 + this.anIntArray20[local70] + 1, this.anIntArray17[local70], this.anIntArray18[local70], 0);
							}
							this.method118(this.aByteArrayArray2[local70], arg0 + this.anIntArray19[local70], local24 + this.anIntArray20[local70], this.anIntArray17[local70], this.anIntArray18[local70], arg4);
						}
						arg0 += this.anIntArray21[local70];
					}
				}
				if (this.aBoolean37) {
					Class1_Sub1_Sub2.method464(arg0 - local16, local16, 8388608, local24 + (int) ((double) this.anInt102 * 0.7D));
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("20326, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	public void method116(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(31) int local31 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(36) int local36 = 15 - this.anInt102;
				for (@Pc(38) int local38 = 0; local38 < arg1.length(); local38++) {
					if (arg1.charAt(local38) == '@' && local38 + 4 < arg1.length() && arg1.charAt(local38 + 4) == '@') {
						@Pc(70) int local70 = this.method117(arg1.substring(local38 + 1, local38 + 4));
						if (local70 != -1) {
							arg4 = local70;
						}
						local38 += 4;
					} else {
						@Pc(82) char local82 = arg1.charAt(local38);
						if (local82 != ' ') {
							this.method120(0, this.anIntArray17[local82], local36 + this.anIntArray20[local82] + 1, this.anIntArray18[local82], 192, this.aByteArrayArray2[local82], arg3 + this.anIntArray19[local82] + 1);
							this.method120(arg4, this.anIntArray17[local82], local36 + this.anIntArray20[local82], this.anIntArray18[local82], local31, this.aByteArrayArray2[local82], arg3 + this.anIntArray19[local82]);
						}
						arg3 += this.anIntArray21[local82];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(170) RuntimeException local170) {
			signlink.reporterror("58479, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 2 + ", " + true + ", " + local170.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method117(@OriginalArg(1) String arg0) {
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
					this.aBoolean37 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean37 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("2933, " + 0 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "([BIIIII)V")
	private void method118(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt653;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt653 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt655) {
			local20 = Class1_Sub1_Sub2.anInt655 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt655;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt653;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt656) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt656;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt657) {
			local20 = Class1_Sub1_Sub2.anInt657 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt657;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt658) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt658;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method119(Class1_Sub1_Sub2.anIntArray170, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method119(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(IIIII[BII)V")
	private void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(10) int local10 = arg6 + arg2 * Class1_Sub1_Sub2.anInt653;
			@Pc(14) int local14 = Class1_Sub1_Sub2.anInt653 - arg1;
			@Pc(16) int local16 = 0;
			@Pc(18) int local18 = 0;
			@Pc(25) int local25;
			if (arg2 < Class1_Sub1_Sub2.anInt655) {
				local25 = Class1_Sub1_Sub2.anInt655 - arg2;
				arg3 -= local25;
				arg2 = Class1_Sub1_Sub2.anInt655;
				local18 = local25 * arg1 + 0;
				local10 += local25 * Class1_Sub1_Sub2.anInt653;
			}
			if (arg2 + arg3 >= Class1_Sub1_Sub2.anInt656) {
				arg3 -= arg2 + arg3 + 1 - Class1_Sub1_Sub2.anInt656;
			}
			if (arg6 < Class1_Sub1_Sub2.anInt657) {
				local25 = Class1_Sub1_Sub2.anInt657 - arg6;
				arg1 -= local25;
				arg6 = Class1_Sub1_Sub2.anInt657;
				local18 += local25;
				local10 += local25;
				local16 = local25 + 0;
				local14 += local25;
			}
			if (arg6 + arg1 >= Class1_Sub1_Sub2.anInt658) {
				local25 = arg6 + arg1 + 1 - Class1_Sub1_Sub2.anInt658;
				arg1 -= local25;
				local16 += local25;
				local14 += local25;
			}
			if (arg1 > 0 && arg3 > 0) {
				this.method121(arg0, arg5, local16, Class1_Sub1_Sub2.anIntArray170, local10, local14, local18, arg1, arg3, arg4);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("17878, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -812 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CWXRTTYV", name = "a", descriptor = "(I[BI[IIIIIIII)V")
	private void method121(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(19) int local19 = ((arg0 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(31) int local31 = -arg8; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg7; local36 < 0; local36++) {
					if (arg1[arg6++] == 0) {
						arg4++;
					} else {
						@Pc(47) int local47 = arg3[arg4];
						arg3[arg4++] = (((local47 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local47 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg4 += arg5;
				arg6 += arg2;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("48469, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 0 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
