import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AKTTXKXI")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!AKTTXKXI", name = "z", descriptor = "I")
	private int anInt36;

	@OriginalMember(owner = "client!AKTTXKXI", name = "B", descriptor = "B")
	private byte aByte6 = 16;

	@OriginalMember(owner = "client!AKTTXKXI", name = "C", descriptor = "B")
	private byte aByte7 = -106;

	@OriginalMember(owner = "client!AKTTXKXI", name = "D", descriptor = "I")
	private int anInt37 = 4;

	@OriginalMember(owner = "client!AKTTXKXI", name = "E", descriptor = "Z")
	private boolean aBoolean22 = true;

	@OriginalMember(owner = "client!AKTTXKXI", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!AKTTXKXI", name = "G", descriptor = "[I")
	private int[] anIntArray4 = new int[256];

	@OriginalMember(owner = "client!AKTTXKXI", name = "H", descriptor = "[I")
	private int[] anIntArray5 = new int[256];

	@OriginalMember(owner = "client!AKTTXKXI", name = "I", descriptor = "[I")
	private int[] anIntArray6 = new int[256];

	@OriginalMember(owner = "client!AKTTXKXI", name = "J", descriptor = "[I")
	private int[] anIntArray7 = new int[256];

	@OriginalMember(owner = "client!AKTTXKXI", name = "K", descriptor = "[I")
	private int[] anIntArray8 = new int[256];

	@OriginalMember(owner = "client!AKTTXKXI", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!AKTTXKXI", name = "N", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!AKTTXKXI", name = "L", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!AKTTXKXI", name = "<init>", descriptor = "(BLclient!SMIVAFST;ZLjava/lang/String;)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) byte arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(63) Class2_Sub1_Sub2 local63 = new Class2_Sub1_Sub2(arg1.method485(arg3 + ".dat", null), (byte) 3);
			@Pc(72) Class2_Sub1_Sub2 local72 = new Class2_Sub1_Sub2(arg1.method485("index.dat", null), (byte) 3);
			local72.anInt81 = local63.method96() + 4;
			@Pc(83) int local83 = local72.method94();
			@Pc(89) int local89;
			if (arg0 != this.aByte6) {
				for (local89 = 1; local89 > 0; local89++) {
				}
			}
			if (local83 > 0) {
				local72.anInt81 += (local83 - 1) * 3;
			}
			for (local89 = 0; local89 < 256; local89++) {
				this.anIntArray6[local89] = local72.method94();
				this.anIntArray7[local89] = local72.method94();
				@Pc(132) int local132 = this.anIntArray4[local89] = local72.method96();
				@Pc(140) int local140 = this.anIntArray5[local89] = local72.method96();
				@Pc(143) int local143 = local72.method94();
				@Pc(147) int local147 = local132 * local140;
				this.aByteArrayArray1[local89] = new byte[local147];
				@Pc(157) int local157;
				@Pc(182) int local182;
				if (local143 == 0) {
					for (local157 = 0; local157 < local147; local157++) {
						this.aByteArrayArray1[local89][local157] = local63.method95();
					}
				} else if (local143 == 1) {
					for (local157 = 0; local157 < local132; local157++) {
						for (local182 = 0; local182 < local140; local182++) {
							this.aByteArrayArray1[local89][local157 + local182 * local132] = local63.method95();
						}
					}
				}
				if (local140 > this.anInt38 && local89 < 128) {
					this.anInt38 = local140;
				}
				this.anIntArray6[local89] = 1;
				this.anIntArray8[local89] = local132 + 2;
				local157 = 0;
				for (local182 = local140 / 7; local182 < local140; local182++) {
					local157 += this.aByteArrayArray1[local89][local182 * local132];
				}
				@Pc(259) int local259;
				if (local157 <= local140 / 7) {
					local259 = this.anIntArray8[local89]--;
					this.anIntArray6[local89] = 0;
				}
				local157 = 0;
				for (@Pc(273) int local273 = local140 / 7; local273 < local140; local273++) {
					local157 += this.aByteArrayArray1[local89][local132 + local273 * local132 - 1];
				}
				if (local157 <= local140 / 7) {
					local259 = this.anIntArray8[local89]--;
				}
			}
			if (arg2) {
				this.anIntArray8[32] = this.anIntArray8[73];
			} else {
				this.anIntArray8[32] = this.anIntArray8[105];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("3352, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;IBI)V")
	public void method34(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method39(507 - this.method38(arg0, 324), arg0, arg2, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("87349, " + 507 + ", " + arg0 + ", " + arg1 + ", " + -83 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IILjava/lang/String;BI)V")
	public void method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method39(arg3 - this.method38(arg2, 324) / 2, arg2, arg1, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("44723, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZZLjava/lang/String;III)V")
	public void method36(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method43(arg4 - this.method37(arg1) / 2, arg0, arg2, arg1, arg3);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("24726, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method37(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
					local16 += 4;
				} else {
					local7 += this.anIntArray8[arg0.charAt(local16)];
				}
			}
			return local7;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("24163, " + -754 + ", " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method38(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 == null) {
				return 0;
			}
			@Pc(9) int local9 = 0;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local9 += this.anIntArray8[arg0.charAt(local11)];
			}
			return local9;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28810, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
	public void method39(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg2 - this.anInt38;
				for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
					@Pc(17) char local17 = arg1.charAt(local11);
					if (local17 != ' ') {
						this.method46(this.aByteArrayArray1[local17], arg0 + this.anIntArray6[local17], local9 + this.anIntArray7[local17], this.anIntArray4[local17], this.anIntArray5[local17], arg3);
					}
					arg0 += this.anIntArray8[local17];
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("99826, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 27 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(BLjava/lang/String;IIII)V")
	public void method40(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method38(arg0, 324) / 2;
				@Pc(16) int local16 = arg2 - this.anInt38;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method46(this.aByteArrayArray1[local24], arg1 + this.anIntArray6[local24], local16 + this.anIntArray7[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray4[local24], this.anIntArray5[local24], arg4);
					}
					arg1 += this.anIntArray8[local24];
				}
				if (this.aByte7 != -106) {
					this.aBoolean22 = !this.aBoolean22;
				}
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("50828, " + -106 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZIIIILjava/lang/String;)V")
	public void method41(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method38(arg4, 324) / 2;
				@Pc(16) int local16 = arg2 - this.anInt38;
				for (@Pc(21) int local21 = 0; local21 < arg4.length(); local21++) {
					@Pc(27) char local27 = arg4.charAt(local21);
					if (local27 != ' ') {
						this.method46(this.aByteArrayArray1[local27], arg3 + this.anIntArray6[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local16 + this.anIntArray7[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray4[local27], this.anIntArray5[local27], arg1);
					}
					arg3 += this.anIntArray8[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("34246, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;IIIIII)V")
	public void method42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 >= 1 && arg3 <= 1 && arg0 != null) {
				@Pc(16) double local16 = 7.0D - (double) arg1 / 8.0D;
				if (local16 < 0.0D) {
					local16 = 0.0D;
				}
				arg4 -= this.method38(arg0, 324) / 2;
				@Pc(36) int local36 = arg5 - this.anInt38;
				for (@Pc(38) int local38 = 0; local38 < arg0.length(); local38++) {
					@Pc(44) char local44 = arg0.charAt(local38);
					if (local44 != ' ') {
						this.method46(this.aByteArrayArray1[local44], arg4 + this.anIntArray6[local44], local36 + this.anIntArray7[local44] + (int) (Math.sin((double) local38 / 1.5D + (double) arg2) * local16), this.anIntArray4[local44], this.anIntArray5[local44], arg6);
					}
					arg4 += this.anIntArray8[local44];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IZILjava/lang/String;II)V")
	public void method43(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean23 = false;
			@Pc(16) int local16 = arg0;
			if (arg3 != null) {
				@Pc(24) int local24 = arg2 - this.anInt38;
				for (@Pc(26) int local26 = 0; local26 < arg3.length(); local26++) {
					if (arg3.charAt(local26) == '@' && local26 + 4 < arg3.length() && arg3.charAt(local26 + 4) == '@') {
						@Pc(58) int local58 = this.method45(arg3.substring(local26 + 1, local26 + 4));
						if (local58 != -1) {
							arg4 = local58;
						}
						local26 += 4;
					} else {
						@Pc(70) char local70 = arg3.charAt(local26);
						if (local70 != ' ') {
							if (arg1) {
								this.method46(this.aByteArrayArray1[local70], arg0 + this.anIntArray6[local70] + 1, local24 + this.anIntArray7[local70] + 1, this.anIntArray4[local70], this.anIntArray5[local70], 0);
							}
							this.method46(this.aByteArrayArray1[local70], arg0 + this.anIntArray6[local70], local24 + this.anIntArray7[local70], this.anIntArray4[local70], this.anIntArray5[local70], arg4);
						}
						arg0 += this.anIntArray8[local70];
					}
				}
				if (this.aBoolean23) {
					Class2_Sub1_Sub1.method281(local24 + (int) ((double) this.anInt38 * 0.7D), arg0 - local16, 8388608, local16);
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("69779, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 32048 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(ZLjava/lang/String;IZIII)V")
	public void method44(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt38;
				for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
					if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method45(arg0.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg2 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg0.charAt(local24);
						if (local68 != ' ') {
							this.method48(local22 + this.anIntArray7[local68] + 1, this.anIntArray5[local68], 192, this.aByteArrayArray1[local68], 0, this.anIntArray4[local68], arg1 + this.anIntArray6[local68] + 1);
							this.method48(local22 + this.anIntArray7[local68], this.anIntArray5[local68], local17, this.aByteArrayArray1[local68], arg2, this.anIntArray4[local68], arg1 + this.anIntArray6[local68]);
						}
						arg1 += this.anIntArray8[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("18377, " + true + ", " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method45(@OriginalArg(0) String arg0) {
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
					this.aBoolean23 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean23 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("44153, " + arg0 + ", " + false + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "([BIIIII)V")
	private void method46(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub1.anInt281;
		@Pc(9) int local9 = Class2_Sub1_Sub1.anInt281 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub1.anInt283) {
			local20 = Class2_Sub1_Sub1.anInt283 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub1.anInt283;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub1.anInt281;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub1.anInt284) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub1.anInt284;
		}
		if (arg1 < Class2_Sub1_Sub1.anInt285) {
			local20 = Class2_Sub1_Sub1.anInt285 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub1.anInt285;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub1.anInt286) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub1.anInt286;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method47(Class2_Sub1_Sub1.anIntArray68, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method47(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(III[BIZII)V")
	private void method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(15) int local15 = arg6 + arg0 * Class2_Sub1_Sub1.anInt281;
			@Pc(19) int local19 = Class2_Sub1_Sub1.anInt281 - arg5;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			if (arg0 < Class2_Sub1_Sub1.anInt283) {
				local30 = Class2_Sub1_Sub1.anInt283 - arg0;
				arg1 -= local30;
				arg0 = Class2_Sub1_Sub1.anInt283;
				local23 = local30 * arg5 + 0;
				local15 += local30 * Class2_Sub1_Sub1.anInt281;
			}
			if (arg0 + arg1 >= Class2_Sub1_Sub1.anInt284) {
				arg1 -= arg0 + arg1 + 1 - Class2_Sub1_Sub1.anInt284;
			}
			if (arg6 < Class2_Sub1_Sub1.anInt285) {
				local30 = Class2_Sub1_Sub1.anInt285 - arg6;
				arg5 -= local30;
				arg6 = Class2_Sub1_Sub1.anInt285;
				local23 += local30;
				local15 += local30;
				local21 = local30 + 0;
				local19 += local30;
			}
			if (arg6 + arg5 >= Class2_Sub1_Sub1.anInt286) {
				local30 = arg6 + arg5 + 1 - Class2_Sub1_Sub1.anInt286;
				arg5 -= local30;
				local21 += local30;
				local19 += local30;
			}
			if (arg5 > 0 && arg1 > 0) {
				this.method49(local15, arg1, local21, local23, arg5, Class2_Sub1_Sub1.anIntArray68, arg2, local19, arg3, arg4);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("35908, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AKTTXKXI", name = "a", descriptor = "(IIIIII[III[BI)V")
	private void method49(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg9 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg6;
			for (@Pc(31) int local31 = -arg1; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg4; local36 < 0; local36++) {
					if (arg8[arg3++] == 0) {
						arg0++;
					} else {
						@Pc(47) int local47 = arg5[arg0];
						arg5[arg0++] = (((local47 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local47 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg7;
				arg3 += arg2;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("63712, " + -369 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
