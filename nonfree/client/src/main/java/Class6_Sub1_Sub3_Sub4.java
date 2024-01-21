import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZFUOSNLM")
public final class Class6_Sub1_Sub3_Sub4 extends Class6_Sub1_Sub3 {

	@OriginalMember(owner = "client!ZFUOSNLM", name = "z", descriptor = "I")
	private int anInt794 = 16067;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "A", descriptor = "I")
	private int anInt795 = 22125;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "B", descriptor = "I")
	private int anInt796 = 907;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "C", descriptor = "Z")
	private boolean aBoolean194 = true;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "E", descriptor = "[I")
	private int[] anIntArray205 = new int[256];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "F", descriptor = "[I")
	private int[] anIntArray206 = new int[256];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "G", descriptor = "[I")
	private int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "H", descriptor = "[I")
	private int[] anIntArray208 = new int[256];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "I", descriptor = "[I")
	private int[] anIntArray209 = new int[256];

	@OriginalMember(owner = "client!ZFUOSNLM", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ZFUOSNLM", name = "L", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "J", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZFUOSNLM", name = "<init>", descriptor = "(ZLclient!XOJZVVDK;ZLjava/lang/String;)V")
	public Class6_Sub1_Sub3_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(73) Class6_Sub1_Sub4 local73 = new Class6_Sub1_Sub4(888, arg1.method518(arg3 + ".dat", (byte[]) null));
			@Pc(82) Class6_Sub1_Sub4 local82 = new Class6_Sub1_Sub4(888, arg1.method518("index.dat", (byte[]) null));
			local82.anInt390 = local73.method241() + 4;
			@Pc(93) int local93 = local82.method239();
			if (local93 > 0) {
				local82.anInt390 += 3 * (local93 - 1);
			}
			for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
				this.anIntArray207[local107] = local82.method239();
				this.anIntArray208[local107] = local82.method239();
				@Pc(131) int local131 = this.anIntArray205[local107] = local82.method241();
				@Pc(139) int local139 = this.anIntArray206[local107] = local82.method241();
				@Pc(142) int local142 = local82.method239();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray4[local107] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray4[local107][local156] = local73.method240();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray4[local107][local156 + local181 * local131] = local73.method240();
						}
					}
				}
				if (local139 > this.anInt797 && local107 < 128) {
					this.anInt797 = local139;
				}
				this.anIntArray207[local107] = 1;
				this.anIntArray209[local107] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray4[local107][local181 * local131];
				}
				@Pc(258) int local258;
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray209[local107]--;
					this.anIntArray207[local107] = 0;
				}
				local156 = 0;
				for (@Pc(272) int local272 = local139 / 7; local272 < local139; local272++) {
					local156 += this.aByteArrayArray4[local107][local131 - 1 + local272 * local131];
				}
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray209[local107]--;
				}
			}
			if (arg0) {
				this.anIntArray209[32] = this.anIntArray209[73];
			} else {
				this.anIntArray209[32] = this.anIntArray209[105];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("88057, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method556(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method561(arg1, arg2, arg0, 507 - this.method560(arg1));
			if (16067 == this.anInt794) {
				;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("64468, " + 16067 + ", " + arg0 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method557(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method561(arg0, arg3, arg2, arg1 - this.method560(arg0) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58037, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.method565(arg0 - this.method559(arg3) / 2, arg3, arg2, arg1, this.anInt796, arg4);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("88536, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -104 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method559(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				if (arg0.charAt(local13) == '@' && local13 + 4 < arg0.length() && arg0.charAt(local13 + 4) == '@') {
					local13 += 4;
				} else {
					local11 += this.anIntArray209[arg0.charAt(local13)];
				}
			}
			return local11;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("32317, " + arg0 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method560(@OriginalArg(1) String arg0) {
		try {
			if (22125 != this.anInt795) {
				this.anInt795 = -388;
			}
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				local12 += this.anIntArray209[arg0.charAt(local14)];
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("83957, " + 22125 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IZII)V")
	public void method561(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg1 - this.anInt797;
				for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
					@Pc(15) char local15 = arg0.charAt(local9);
					if (local15 != ' ') {
						this.method568(this.aByteArrayArray4[local15], arg3 + this.anIntArray207[local15], local7 + this.anIntArray208[local15], this.anIntArray205[local15], this.anIntArray206[local15], arg2);
					}
					arg3 += this.anIntArray209[local15];
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("68118, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method562(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method560(arg0) / 2;
				@Pc(16) int local16 = arg4 - this.anInt797;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method568(this.aByteArrayArray4[local24], arg1 + this.anIntArray207[local24], local16 + this.anIntArray208[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray205[local24], this.anIntArray206[local24], arg2);
					}
					arg1 += this.anIntArray209[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("87063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg4 -= this.method560(arg3) / 2;
				@Pc(16) int local16 = arg1 - this.anInt797;
				for (@Pc(24) int local24 = 0; local24 < arg3.length(); local24++) {
					@Pc(30) char local30 = arg3.charAt(local24);
					if (local30 != ' ') {
						this.method568(this.aByteArrayArray4[local30], arg4 + this.anIntArray207[local30] + (int) (Math.sin((double) local24 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local16 + this.anIntArray208[local30] + (int) (Math.sin((double) local24 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray205[local30], this.anIntArray206[local30], arg0);
					}
					arg4 += this.anIntArray209[local30];
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("81952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg4 -= this.method560(arg2) / 2;
				@Pc(33) int local33 = arg0 - this.anInt797;
				for (@Pc(35) int local35 = 0; local35 < arg2.length(); local35++) {
					@Pc(41) char local41 = arg2.charAt(local35);
					if (local41 != ' ') {
						this.method568(this.aByteArrayArray4[local41], arg4 + this.anIntArray207[local41], local33 + this.anIntArray208[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg1) * local9), this.anIntArray205[local41], this.anIntArray206[local41], arg5);
					}
					arg4 += this.anIntArray209[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("53756, " + 45739 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(ILjava/lang/String;IIIZ)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			@Pc(5) int local5 = 99 / arg4;
			this.aBoolean195 = false;
			@Pc(10) int local10 = arg0;
			if (arg1 != null) {
				@Pc(18) int local18 = arg2 - this.anInt797;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					if (arg1.charAt(local20) == '@' && local20 + 4 < arg1.length() && arg1.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method567(arg1.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg3 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg1.charAt(local20);
						if (local64 != ' ') {
							if (arg5) {
								this.method568(this.aByteArrayArray4[local64], arg0 + this.anIntArray207[local64] + 1, local18 + this.anIntArray208[local64] + 1, this.anIntArray205[local64], this.anIntArray206[local64], 0);
							}
							this.method568(this.aByteArrayArray4[local64], arg0 + this.anIntArray207[local64], local18 + this.anIntArray208[local64], this.anIntArray205[local64], this.anIntArray206[local64], arg3);
						}
						arg0 += this.anIntArray209[local64];
					}
				}
				if (this.aBoolean195) {
					Class6_Sub1_Sub3.method552(local10, local18 + (int) ((double) this.anInt797 * 0.7D), arg0 - local10, 8388608);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("85577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IZZLjava/lang/String;III)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(17) int local17 = 192 + (this.aRandom1.nextInt() & 0x1F);
				@Pc(22) int local22 = 15 - this.anInt797;
				for (@Pc(24) int local24 = 0; local24 < arg1.length(); local24++) {
					if (arg1.charAt(local24) == '@' && local24 + 4 < arg1.length() && arg1.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method567(arg1.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg0 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg1.charAt(local24);
						if (local68 != ' ') {
							this.method570(192, local22 + this.anIntArray208[local68] + 1, 0, this.anIntArray206[local68], arg3 + this.anIntArray207[local68] + 1, this.aByteArrayArray4[local68], this.anIntArray205[local68]);
							this.method570(local17, local22 + this.anIntArray208[local68], arg0, this.anIntArray206[local68], arg3 + this.anIntArray207[local68], this.aByteArrayArray4[local68], this.anIntArray205[local68]);
						}
						arg3 += this.anIntArray209[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("3099, " + arg0 + ", " + true + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method567(@OriginalArg(1) String arg0) {
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
					this.aBoolean195 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean195 = false;
				}
				return -1;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("11523, " + -690 + ", " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "([BIIIII)V")
	private void method568(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class6_Sub1_Sub3.anInt785;
		@Pc(9) int local9 = Class6_Sub1_Sub3.anInt785 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class6_Sub1_Sub3.anInt787) {
			local20 = Class6_Sub1_Sub3.anInt787 - arg2;
			arg4 -= local20;
			arg2 = Class6_Sub1_Sub3.anInt787;
			local13 = 0 + local20 * arg3;
			local5 += local20 * Class6_Sub1_Sub3.anInt785;
		}
		if (arg2 + arg4 >= Class6_Sub1_Sub3.anInt788) {
			arg4 -= arg2 + arg4 - Class6_Sub1_Sub3.anInt788 + 1;
		}
		if (arg1 < Class6_Sub1_Sub3.anInt789) {
			local20 = Class6_Sub1_Sub3.anInt789 - arg1;
			arg3 -= local20;
			arg1 = Class6_Sub1_Sub3.anInt789;
			local13 += local20;
			local5 += local20;
			local11 = 0 + local20;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class6_Sub1_Sub3.anInt790) {
			local20 = arg1 + arg3 - Class6_Sub1_Sub3.anInt790 + 1;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method569(Class6_Sub1_Sub3.anIntArray204, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method569(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(IIIII[BII)V")
	private void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg4 + arg1 * Class6_Sub1_Sub3.anInt785;
			@Pc(9) int local9 = Class6_Sub1_Sub3.anInt785 - arg6;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(23) int local23;
			if (arg1 < Class6_Sub1_Sub3.anInt787) {
				local23 = Class6_Sub1_Sub3.anInt787 - arg1;
				arg3 -= local23;
				arg1 = Class6_Sub1_Sub3.anInt787;
				local13 = 0 + local23 * arg6;
				local5 += local23 * Class6_Sub1_Sub3.anInt785;
			}
			if (arg1 + arg3 >= Class6_Sub1_Sub3.anInt788) {
				arg3 -= arg1 + arg3 - Class6_Sub1_Sub3.anInt788 + 1;
			}
			if (arg4 < Class6_Sub1_Sub3.anInt789) {
				local23 = Class6_Sub1_Sub3.anInt789 - arg4;
				arg6 -= local23;
				arg4 = Class6_Sub1_Sub3.anInt789;
				local13 += local23;
				local5 += local23;
				local11 = 0 + local23;
				local9 += local23;
			}
			if (arg4 + arg6 >= Class6_Sub1_Sub3.anInt790) {
				local23 = arg4 + arg6 - Class6_Sub1_Sub3.anInt790 + 1;
				arg6 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg6 > 0 && arg3 > 0) {
				this.method571(arg0, arg6, Class6_Sub1_Sub3.anIntArray204, arg3, local13, local5, arg2, local9, arg5, local11);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("41761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZFUOSNLM", name = "a", descriptor = "(II[IIIIIII[BI)V")
	private void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg0 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg0;
			for (@Pc(32) int local32 = -arg3; local32 < 0; local32++) {
				for (@Pc(37) int local37 = -arg1; local37 < 0; local37++) {
					if (arg8[arg4++] == 0) {
						arg5++;
					} else {
						@Pc(48) int local48 = arg2[arg5];
						arg2[arg5++] = (((local48 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local48 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg5 += arg7;
				arg4 += arg9;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("79033, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
