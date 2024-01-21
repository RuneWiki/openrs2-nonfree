import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UOINBUQD")
public final class Class8_Sub1_Sub2_Sub3 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!UOINBUQD", name = "w", descriptor = "Z")
	private boolean aBoolean153 = true;

	@OriginalMember(owner = "client!UOINBUQD", name = "x", descriptor = "I")
	private int anInt677 = 976;

	@OriginalMember(owner = "client!UOINBUQD", name = "y", descriptor = "I")
	private int anInt678 = 7;

	@OriginalMember(owner = "client!UOINBUQD", name = "z", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!UOINBUQD", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!UOINBUQD", name = "B", descriptor = "[I")
	private int[] anIntArray176 = new int[256];

	@OriginalMember(owner = "client!UOINBUQD", name = "C", descriptor = "[I")
	private int[] anIntArray177 = new int[256];

	@OriginalMember(owner = "client!UOINBUQD", name = "D", descriptor = "[I")
	private int[] anIntArray178 = new int[256];

	@OriginalMember(owner = "client!UOINBUQD", name = "E", descriptor = "[I")
	private int[] anIntArray179 = new int[256];

	@OriginalMember(owner = "client!UOINBUQD", name = "F", descriptor = "[I")
	private int[] anIntArray180 = new int[256];

	@OriginalMember(owner = "client!UOINBUQD", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!UOINBUQD", name = "I", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!UOINBUQD", name = "G", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!UOINBUQD", name = "<init>", descriptor = "(ZLclient!AWEEREDT;ZLjava/lang/String;)V")
	public Class8_Sub1_Sub2_Sub3(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(63) Class8_Sub1_Sub3 local63 = new Class8_Sub1_Sub3(arg1.method14(arg3 + ".dat", null), 713);
			@Pc(82) Class8_Sub1_Sub3 local82 = new Class8_Sub1_Sub3(arg1.method14("index.dat", null), 713);
			local82.anInt239 = local63.method154() + 4;
			@Pc(93) int local93 = local82.method152();
			if (local93 > 0) {
				local82.anInt239 += (local93 - 1) * 3;
			}
			for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
				this.anIntArray178[local107] = local82.method152();
				this.anIntArray179[local107] = local82.method152();
				@Pc(131) int local131 = this.anIntArray176[local107] = local82.method154();
				@Pc(139) int local139 = this.anIntArray177[local107] = local82.method154();
				@Pc(142) int local142 = local82.method152();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray4[local107] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray4[local107][local156] = local63.method153();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray4[local107][local156 + local181 * local131] = local63.method153();
						}
					}
				}
				if (local139 > this.anInt679 && local107 < 128) {
					this.anInt679 = local139;
				}
				this.anIntArray178[local107] = 1;
				this.anIntArray180[local107] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray4[local107][local181 * local131];
				}
				@Pc(258) int local258;
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray180[local107]--;
					this.anIntArray178[local107] = 0;
				}
				local156 = 0;
				for (@Pc(272) int local272 = local139 / 7; local272 < local139; local272++) {
					local156 += this.aByteArrayArray4[local107][local131 + local272 * local131 - 1];
				}
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray180[local107]--;
				}
			}
			if (arg0) {
				this.anIntArray180[32] = this.anIntArray180[73];
			} else {
				this.anIntArray180[32] = this.anIntArray180[105];
			}
		} catch (@Pc(331) RuntimeException local331) {
			signlink.reporterror("40439, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local331.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg0, arg1, 507 - this.method450(arg1, 264), arg2);
			if (arg3 != 2) {
				this.aBoolean153 = !this.aBoolean153;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27612, " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + arg3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg0, arg2, arg1 - this.method450(arg2, 264) / 2, arg3);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("73823, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
	public void method448(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method455(arg0, arg4, arg2 - this.method449(arg0) / 2, arg1, arg3);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("81758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + arg4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method449(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray180[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("19267, " + arg0 + ", " + -665 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method450(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local5 += this.anIntArray180[arg0.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("23525, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;IZI)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(12) int local12 = arg3 - this.anInt679;
				for (@Pc(14) int local14 = 0; local14 < arg1.length(); local14++) {
					@Pc(20) char local20 = arg1.charAt(local14);
					if (local20 != ' ') {
						this.method458(this.aByteArrayArray4[local20], arg2 + this.anIntArray178[local20], local12 + this.anIntArray179[local20], this.anIntArray176[local20], this.anIntArray177[local20], arg0);
					}
					arg2 += this.anIntArray180[local20];
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("14560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg0 -= this.method450(arg1, 264) / 2;
				if (this.anInt678 != 7) {
					this.anInt677 = 337;
				}
				@Pc(23) int local23 = arg4 - this.anInt679;
				for (@Pc(25) int local25 = 0; local25 < arg1.length(); local25++) {
					@Pc(31) char local31 = arg1.charAt(local25);
					if (local31 != ' ') {
						this.method458(this.aByteArrayArray4[local31], arg0 + this.anIntArray178[local31], local23 + this.anIntArray179[local31] + (int) (Math.sin((double) local25 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray176[local31], this.anIntArray177[local31], arg3);
					}
					arg0 += this.anIntArray180[local31];
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("42372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + arg4 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIIILjava/lang/String;B)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			if (arg4 != null) {
				arg0 -= this.method450(arg4, 264) / 2;
				@Pc(18) int local18 = arg3 - this.anInt679;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					@Pc(26) char local26 = arg4.charAt(local20);
					if (local26 != ' ') {
						this.method458(this.aByteArrayArray4[local26], arg0 + this.anIntArray178[local26] + (int) (Math.sin((double) local20 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local18 + this.anIntArray179[local26] + (int) (Math.sin((double) local20 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray176[local26], this.anIntArray177[local26], arg1);
					}
					arg0 += this.anIntArray180[local26];
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("76291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg5 != null) {
				@Pc(13) double local13 = 7.0D - (double) arg3 / 8.0D;
				if (local13 < 0.0D) {
					local13 = 0.0D;
				}
				arg2 -= this.method450(arg5, 264) / 2;
				@Pc(33) int local33 = arg1 - this.anInt679;
				for (@Pc(35) int local35 = 0; local35 < arg5.length(); local35++) {
					@Pc(41) char local41 = arg5.charAt(local35);
					if (local41 != ' ') {
						this.method458(this.aByteArrayArray4[local41], arg2 + this.anIntArray178[local41], local33 + this.anIntArray179[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg6) * local13), this.anIntArray176[local41], this.anIntArray177[local41], arg0);
					}
					arg2 += this.anIntArray180[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("62267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
	public void method455(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean155 = false;
			@Pc(9) int local9 = arg2;
			if (arg0 != null) {
				@Pc(17) int local17 = arg4 - this.anInt679;
				for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
					if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method457(arg0.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg3 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg0.charAt(local19);
						if (local63 != ' ') {
							if (arg1) {
								this.method458(this.aByteArrayArray4[local63], arg2 + this.anIntArray178[local63] + 1, local17 + this.anIntArray179[local63] + 1, this.anIntArray176[local63], this.anIntArray177[local63], 0);
							}
							this.method458(this.aByteArrayArray4[local63], arg2 + this.anIntArray178[local63], local17 + this.anIntArray179[local63], this.anIntArray176[local63], this.anIntArray177[local63], arg3);
						}
						arg2 += this.anIntArray180[local63];
					}
				}
				if (this.aBoolean155) {
					Class8_Sub1_Sub2.method553(local17 + (int) ((double) this.anInt679 * 0.7D), 8388608, local9, arg2 - local9);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("11400, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 441 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(IIZLjava/lang/String;BII)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(26) int local26 = 15 - this.anInt679;
				for (@Pc(28) int local28 = 0; local28 < arg2.length(); local28++) {
					if (arg2.charAt(local28) == '@' && local28 + 4 < arg2.length() && arg2.charAt(local28 + 4) == '@') {
						@Pc(60) int local60 = this.method457(arg2.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg3 = local60;
						}
						local28 += 4;
					} else {
						@Pc(72) char local72 = arg2.charAt(local28);
						if (local72 != ' ') {
							this.method460(arg1 + this.anIntArray178[local72] + 1, this.aByteArrayArray4[local72], 192, this.anIntArray176[local72], local26 + this.anIntArray179[local72] + 1, this.anIntArray177[local72], 0);
							this.method460(arg1 + this.anIntArray178[local72], this.aByteArrayArray4[local72], local17, this.anIntArray176[local72], local26 + this.anIntArray179[local72], this.anIntArray177[local72], arg3);
						}
						arg1 += this.anIntArray180[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("64801, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + -11 + ", " + arg3 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method457(@OriginalArg(1) String arg0) {
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
					this.aBoolean155 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean155 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("86829, " + 0 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class8_Sub1_Sub2.anInt806;
		@Pc(9) int local9 = Class8_Sub1_Sub2.anInt806 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class8_Sub1_Sub2.anInt808) {
			local20 = Class8_Sub1_Sub2.anInt808 - arg2;
			arg4 -= local20;
			arg2 = Class8_Sub1_Sub2.anInt808;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class8_Sub1_Sub2.anInt806;
		}
		if (arg2 + arg4 >= Class8_Sub1_Sub2.anInt809) {
			arg4 -= arg2 + arg4 + 1 - Class8_Sub1_Sub2.anInt809;
		}
		if (arg1 < Class8_Sub1_Sub2.anInt810) {
			local20 = Class8_Sub1_Sub2.anInt810 - arg1;
			arg3 -= local20;
			arg1 = Class8_Sub1_Sub2.anInt810;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class8_Sub1_Sub2.anInt811) {
			local20 = arg1 + arg3 + 1 - Class8_Sub1_Sub2.anInt811;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method459(Class8_Sub1_Sub2.anIntArray201, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method459(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(II[BIIIII)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(8) int local8 = arg0 + arg4 * Class8_Sub1_Sub2.anInt806;
			@Pc(12) int local12 = Class8_Sub1_Sub2.anInt806 - arg3;
			@Pc(14) int local14 = 0;
			@Pc(16) int local16 = 0;
			@Pc(23) int local23;
			if (arg4 < Class8_Sub1_Sub2.anInt808) {
				local23 = Class8_Sub1_Sub2.anInt808 - arg4;
				arg5 -= local23;
				arg4 = Class8_Sub1_Sub2.anInt808;
				local16 = local23 * arg3 + 0;
				local8 += local23 * Class8_Sub1_Sub2.anInt806;
			}
			if (arg4 + arg5 >= Class8_Sub1_Sub2.anInt809) {
				arg5 -= arg4 + arg5 + 1 - Class8_Sub1_Sub2.anInt809;
			}
			if (arg0 < Class8_Sub1_Sub2.anInt810) {
				local23 = Class8_Sub1_Sub2.anInt810 - arg0;
				arg3 -= local23;
				arg0 = Class8_Sub1_Sub2.anInt810;
				local16 += local23;
				local8 += local23;
				local14 = local23 + 0;
				local12 += local23;
			}
			if (arg0 + arg3 >= Class8_Sub1_Sub2.anInt811) {
				local23 = arg0 + arg3 + 1 - Class8_Sub1_Sub2.anInt811;
				arg3 -= local23;
				local14 += local23;
				local12 += local23;
			}
			if (arg3 > 0 && arg5 > 0) {
				this.method461(arg2, arg5, arg1, Class8_Sub1_Sub2.anIntArray201, local12, local14, local8, arg6, local16, arg3);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("26224, " + arg0 + ", " + -84 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UOINBUQD", name = "a", descriptor = "(II[B[IIIIIIII)V")
	private void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg7 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg0 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg0;
			for (@Pc(26) int local26 = -arg1; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg9; local31 < 0; local31++) {
					if (arg2[arg8++] == 0) {
						arg6++;
					} else {
						@Pc(42) int local42 = arg3[arg6];
						arg3[arg6++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg6 += arg4;
				arg8 += arg5;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("91480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
