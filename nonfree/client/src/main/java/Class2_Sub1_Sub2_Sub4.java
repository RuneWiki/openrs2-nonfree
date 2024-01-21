import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZTYSAOXK")
public final class Class2_Sub1_Sub2_Sub4 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZTYSAOXK", name = "x", descriptor = "B")
	private byte aByte28 = 1;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "y", descriptor = "B")
	private byte aByte29 = 119;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "z", descriptor = "B")
	private byte aByte30 = 107;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "A", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "B", descriptor = "I")
	private int anInt792 = 709;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "C", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "E", descriptor = "[I")
	private int[] anIntArray205 = new int[256];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "F", descriptor = "[I")
	private int[] anIntArray206 = new int[256];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "G", descriptor = "[I")
	private int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "H", descriptor = "[I")
	private int[] anIntArray208 = new int[256];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "I", descriptor = "[I")
	private int[] anIntArray209 = new int[256];

	@OriginalMember(owner = "client!ZTYSAOXK", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ZTYSAOXK", name = "L", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "J", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!ZTYSAOXK", name = "<init>", descriptor = "(ZLjava/lang/String;Lclient!FUZJMGZB;I)V")
	public Class2_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(69) Class2_Sub1_Sub3 local69 = new Class2_Sub1_Sub3((byte) 114, arg2.method186(arg1 + ".dat", null));
			@Pc(78) Class2_Sub1_Sub3 local78 = new Class2_Sub1_Sub3((byte) 114, arg2.method186("index.dat", null));
			local78.anInt283 = local69.method269() + 4;
			@Pc(107) int local107 = local78.method267();
			if (local107 > 0) {
				local78.anInt283 += (local107 - 1) * 3;
			}
			for (@Pc(121) int local121 = 0; local121 < 256; local121++) {
				this.anIntArray207[local121] = local78.method267();
				this.anIntArray208[local121] = local78.method267();
				@Pc(145) int local145 = this.anIntArray205[local121] = local78.method269();
				@Pc(153) int local153 = this.anIntArray206[local121] = local78.method269();
				@Pc(156) int local156 = local78.method267();
				@Pc(160) int local160 = local145 * local153;
				this.aByteArrayArray4[local121] = new byte[local160];
				@Pc(170) int local170;
				@Pc(195) int local195;
				if (local156 == 0) {
					for (local170 = 0; local170 < local160; local170++) {
						this.aByteArrayArray4[local121][local170] = local69.method268();
					}
				} else if (local156 == 1) {
					for (local170 = 0; local170 < local145; local170++) {
						for (local195 = 0; local195 < local153; local195++) {
							this.aByteArrayArray4[local121][local170 + local195 * local145] = local69.method268();
						}
					}
				}
				if (local153 > this.anInt793 && local121 < 128) {
					this.anInt793 = local153;
				}
				this.anIntArray207[local121] = 1;
				this.anIntArray209[local121] = local145 + 2;
				local170 = 0;
				for (local195 = local153 / 7; local195 < local153; local195++) {
					local170 += this.aByteArrayArray4[local121][local195 * local145];
				}
				@Pc(272) int local272;
				if (local170 <= local153 / 7) {
					local272 = this.anIntArray209[local121]--;
					this.anIntArray207[local121] = 0;
				}
				local170 = 0;
				for (@Pc(286) int local286 = local153 / 7; local286 < local153; local286++) {
					local170 += this.aByteArrayArray4[local121][local145 + local286 * local145 - 1];
				}
				if (local170 <= local153 / 7) {
					local272 = this.anIntArray209[local121]--;
				}
			}
			if (arg0) {
				this.anIntArray209[32] = this.anIntArray209[73];
			} else {
				this.anIntArray209[32] = this.anIntArray209[105];
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("84768, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method557(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2) {
		try {
			this.method562(arg2, arg0, 507 - this.method561(arg2), arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("5988, " + arg0 + ", " + 0 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIILjava/lang/String;B)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			this.method562(arg3, arg2, arg1 - this.method561(arg3) / 2, arg0);
			if (this.aByte29 != 119) {
				this.aBoolean173 = !this.aBoolean173;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("11712, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 119 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ZLjava/lang/String;BIII)V")
	public void method559(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.method566(arg3, arg1, arg0, arg5 - this.method560(arg1, this.aByte28) / 2, this.aBoolean172, arg4);
			if (arg2 == 9) {
				;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("7220, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method560(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == 1) {
				@Pc(6) boolean local6 = false;
			} else {
				this.anInt792 = -482;
			}
			if (arg0 == null) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local17 += this.anIntArray209[arg0.charAt(local19)];
				}
			}
			return local17;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("98061, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method561(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			if (this.aByte30 == 107) {
				for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
					local5 += this.anIntArray209[arg0.charAt(local13)];
				}
				return local5;
			} else {
				return 4;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("49311, " + 107 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method562(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg1 - this.anInt793;
				for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
					@Pc(19) char local19 = arg0.charAt(local13);
					if (local19 != ' ') {
						this.method569(this.aByteArrayArray4[local19], arg2 + this.anIntArray207[local19], local7 + this.anIntArray208[local19], this.anIntArray205[local19], this.anIntArray206[local19], arg3);
					}
					arg2 += this.anIntArray209[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("21058, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -32001 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method563(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method561(arg0) / 2;
				@Pc(16) int local16 = arg3 - this.anInt793;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method569(this.aByteArrayArray4[local24], arg1 + this.anIntArray207[local24], local16 + this.anIntArray208[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray205[local24], this.anIntArray206[local24], arg4);
					}
					arg1 += this.anIntArray209[local24];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("35076, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IIIBI)V")
	public void method564(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != null) {
				arg3 -= this.method561(arg0) / 2;
				@Pc(18) boolean local18 = false;
				@Pc(26) int local26 = arg5 - this.anInt793;
				for (@Pc(28) int local28 = 0; local28 < arg0.length(); local28++) {
					@Pc(34) char local34 = arg0.charAt(local28);
					if (local34 != ' ') {
						this.method569(this.aByteArrayArray4[local34], arg3 + this.anIntArray207[local34] + (int) (Math.sin((double) local28 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local26 + this.anIntArray208[local34] + (int) (Math.sin((double) local28 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray205[local34], this.anIntArray206[local34], arg2);
					}
					arg3 += this.anIntArray209[local34];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("31386, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(Ljava/lang/String;IBIIII)V")
	public void method565(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(13) double local13 = 7.0D - (double) arg2 / 8.0D;
				if (local13 < 0.0D) {
					local13 = 0.0D;
				}
				arg3 -= this.method561(arg0) / 2;
				@Pc(33) int local33 = arg1 - this.anInt793;
				for (@Pc(35) int local35 = 0; local35 < arg0.length(); local35++) {
					@Pc(41) char local41 = arg0.charAt(local35);
					if (local41 != ' ') {
						this.method569(this.aByteArrayArray4[local41], arg3 + this.anIntArray207[local41], local33 + this.anIntArray208[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg5) * local13), this.anIntArray205[local41], this.anIntArray206[local41], arg4);
					}
					arg3 += this.anIntArray209[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("76381, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ILjava/lang/String;ZIZI)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			this.aBoolean174 = false;
			@Pc(6) int local6 = arg3;
			if (arg4 && arg1 != null) {
				@Pc(17) int local17 = arg5 - this.anInt793;
				for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
					if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method568(arg1.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg0 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg1.charAt(local19);
						if (local63 != ' ') {
							if (arg2) {
								this.method569(this.aByteArrayArray4[local63], arg3 + this.anIntArray207[local63] + 1, local17 + this.anIntArray208[local63] + 1, this.anIntArray205[local63], this.anIntArray206[local63], 0);
							}
							this.method569(this.aByteArrayArray4[local63], arg3 + this.anIntArray207[local63], local17 + this.anIntArray208[local63], this.anIntArray205[local63], this.anIntArray206[local63], arg0);
						}
						arg3 += this.anIntArray209[local63];
					}
				}
				if (this.aBoolean174) {
					Class2_Sub1_Sub2.method553(arg3 - local6, local6, local17 + (int) ((double) this.anInt793 * 0.7D), 8388608);
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("15201, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
	public void method567(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg4);
				if (arg1 == 3169) {
					@Pc(21) int local21 = (this.aRandom1.nextInt() & 0x1F) + 192;
					@Pc(26) int local26 = 15 - this.anInt793;
					for (@Pc(28) int local28 = 0; local28 < arg0.length(); local28++) {
						if (arg0.charAt(local28) == '@' && local28 + 4 < arg0.length() && arg0.charAt(local28 + 4) == '@') {
							@Pc(60) int local60 = this.method568(arg0.substring(local28 + 1, local28 + 4));
							if (local60 != -1) {
								arg5 = local60;
							}
							local28 += 4;
						} else {
							@Pc(72) char local72 = arg0.charAt(local28);
							if (local72 != ' ') {
								this.method571(192, local26 + this.anIntArray208[local72] + 1, 0, arg3 + this.anIntArray207[local72] + 1, this.anIntArray205[local72], this.anIntArray206[local72], this.aByteArrayArray4[local72]);
								this.method571(local21, local26 + this.anIntArray208[local72], arg5, arg3 + this.anIntArray207[local72], this.anIntArray205[local72], this.anIntArray206[local72], this.aByteArrayArray4[local72]);
							}
							arg3 += this.anIntArray209[local72];
							if ((this.aRandom1.nextInt() & 0x3) == 0) {
								arg3++;
							}
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("37782, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method568(@OriginalArg(1) String arg0) {
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
					this.aBoolean174 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean174 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("87397, " + 0 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "([BIIIII)V")
	private void method569(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub2.anInt783;
		@Pc(9) int local9 = Class2_Sub1_Sub2.anInt783 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub2.anInt785) {
			local20 = Class2_Sub1_Sub2.anInt785 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub2.anInt785;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub2.anInt783;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub2.anInt786) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub2.anInt786;
		}
		if (arg1 < Class2_Sub1_Sub2.anInt787) {
			local20 = Class2_Sub1_Sub2.anInt787 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub2.anInt787;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub2.anInt788) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub2.anInt788;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method570(Class2_Sub1_Sub2.anIntArray204, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method570(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIZIIII[B)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg1 * Class2_Sub1_Sub2.anInt783;
			@Pc(9) int local9 = Class2_Sub1_Sub2.anInt783 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(29) int local29;
			if (arg1 < Class2_Sub1_Sub2.anInt785) {
				local29 = Class2_Sub1_Sub2.anInt785 - arg1;
				arg5 -= local29;
				arg1 = Class2_Sub1_Sub2.anInt785;
				local13 = local29 * arg4 + 0;
				local5 += local29 * Class2_Sub1_Sub2.anInt783;
			}
			if (arg1 + arg5 >= Class2_Sub1_Sub2.anInt786) {
				arg5 -= arg1 + arg5 + 1 - Class2_Sub1_Sub2.anInt786;
			}
			if (arg3 < Class2_Sub1_Sub2.anInt787) {
				local29 = Class2_Sub1_Sub2.anInt787 - arg3;
				arg4 -= local29;
				arg3 = Class2_Sub1_Sub2.anInt787;
				local13 += local29;
				local5 += local29;
				local11 = local29 + 0;
				local9 += local29;
			}
			if (arg3 + arg4 >= Class2_Sub1_Sub2.anInt788) {
				local29 = arg3 + arg4 + 1 - Class2_Sub1_Sub2.anInt788;
				arg4 -= local29;
				local11 += local29;
				local9 += local29;
			}
			if (arg4 > 0 && arg5 > 0) {
				this.method572(local5, local13, arg5, arg2, arg0, arg4, local11, Class2_Sub1_Sub2.anIntArray204, local9, arg6);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("96864, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZTYSAOXK", name = "a", descriptor = "(IIIIIIII[II[B)V")
	private void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg4;
			for (@Pc(30) int local30 = -arg2; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg5; local35 < 0; local35++) {
					if (arg9[arg1++] == 0) {
						arg0++;
					} else {
						@Pc(46) int local46 = arg7[arg0];
						arg7[arg0++] = (((local46 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local46 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg8;
				arg1 += arg6;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("81191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -2270 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
