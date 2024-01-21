import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QJBJRTJO")
public final class Class1_Sub1_Sub1_Sub3 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QJBJRTJO", name = "z", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!QJBJRTJO", name = "C", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!QJBJRTJO", name = "x", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!QJBJRTJO", name = "y", descriptor = "I")
	private int anInt568 = 788;

	@OriginalMember(owner = "client!QJBJRTJO", name = "A", descriptor = "I")
	private int anInt570 = 42086;

	@OriginalMember(owner = "client!QJBJRTJO", name = "B", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!QJBJRTJO", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!QJBJRTJO", name = "E", descriptor = "[I")
	private int[] anIntArray106 = new int[256];

	@OriginalMember(owner = "client!QJBJRTJO", name = "F", descriptor = "[I")
	private int[] anIntArray107 = new int[256];

	@OriginalMember(owner = "client!QJBJRTJO", name = "G", descriptor = "[I")
	private int[] anIntArray108 = new int[256];

	@OriginalMember(owner = "client!QJBJRTJO", name = "H", descriptor = "[I")
	private int[] anIntArray109 = new int[256];

	@OriginalMember(owner = "client!QJBJRTJO", name = "I", descriptor = "[I")
	private int[] anIntArray110 = new int[256];

	@OriginalMember(owner = "client!QJBJRTJO", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!QJBJRTJO", name = "L", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!QJBJRTJO", name = "J", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!QJBJRTJO", name = "<init>", descriptor = "(ILclient!HRXSNEYZ;Ljava/lang/String;Z)V")
	public Class1_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(63) Class1_Sub1_Sub3 local63 = new Class1_Sub1_Sub3(arg1.method220(arg2 + ".dat", null), 8);
			@Pc(72) Class1_Sub1_Sub3 local72 = new Class1_Sub1_Sub3(arg1.method220("index.dat", null), 8);
			local72.anInt352 = local63.method240() + 4;
			@Pc(93) int local93 = local72.method238();
			if (local93 > 0) {
				local72.anInt352 += (local93 - 1) * 3;
			}
			for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
				this.anIntArray108[local107] = local72.method238();
				this.anIntArray109[local107] = local72.method238();
				@Pc(131) int local131 = this.anIntArray106[local107] = local72.method240();
				@Pc(139) int local139 = this.anIntArray107[local107] = local72.method240();
				@Pc(142) int local142 = local72.method238();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray1[local107] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray1[local107][local156] = local63.method239();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray1[local107][local156 + local181 * local131] = local63.method239();
						}
					}
				}
				if (local139 > this.anInt572 && local107 < 128) {
					this.anInt572 = local139;
				}
				this.anIntArray108[local107] = 1;
				this.anIntArray110[local107] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray1[local107][local181 * local131];
				}
				@Pc(258) int local258;
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray110[local107]--;
					this.anIntArray108[local107] = 0;
				}
				local156 = 0;
				for (@Pc(272) int local272 = local139 / 7; local272 < local139; local272++) {
					local156 += this.aByteArrayArray1[local107][local131 + local272 * local131 - 1];
				}
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray110[local107]--;
				}
			}
			if (arg3) {
				this.anIntArray110[32] = this.anIntArray110[73];
			} else {
				this.anIntArray110[32] = this.anIntArray110[105];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("42210, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method378(@OriginalArg(2) String arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method383(arg2, (byte) 2, arg0, 507 - this.method382(510, arg0), arg1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("68121, " + 507 + ", " + -720 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "b", descriptor = "(IILjava/lang/String;II)V")
	public void method379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			this.method383(arg3, (byte) 2, arg2, arg1 - this.method382(510, arg2) / 2, arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(ZLjava/lang/String;IIII)V")
	public void method380(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method387(arg1, arg0, arg2 - this.method381(arg1, this.anInt570) / 2, arg3, arg4);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16440, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method381(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 42086) {
				this.anInt569 = 247;
			}
			if (arg0 == null) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				if (arg0.charAt(local15) == '@' && local15 + 4 < arg0.length() && arg0.charAt(local15 + 4) == '@') {
					local15 += 4;
				} else {
					local13 += this.anIntArray110[arg0.charAt(local15)];
				}
			}
			return local13;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("62890, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method382(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
				local5 += this.anIntArray110[arg1.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("89622, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(IBLjava/lang/String;II)V")
	public void method383(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg4 - this.anInt572;
				for (@Pc(9) int local9 = 0; local9 < arg2.length(); local9++) {
					@Pc(15) char local15 = arg2.charAt(local9);
					if (local15 != ' ') {
						this.method390(this.aByteArrayArray1[local15], arg3 + this.anIntArray108[local15], local7 + this.anIntArray109[local15], this.anIntArray106[local15], this.anIntArray107[local15], arg0);
					}
					arg3 += this.anIntArray110[local15];
				}
				@Pc(62) boolean local62 = false;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("59659, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(IILjava/lang/String;IIZ)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				arg4 -= this.method382(510, arg2) / 2;
				@Pc(16) int local16 = arg1 - this.anInt572;
				for (@Pc(18) int local18 = 0; local18 < arg2.length(); local18++) {
					@Pc(24) char local24 = arg2.charAt(local18);
					if (local24 != ' ') {
						this.method390(this.aByteArrayArray1[local24], arg4 + this.anIntArray108[local24], local16 + this.anIntArray109[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray106[local24], this.anIntArray107[local24], arg0);
					}
					arg4 += this.anIntArray110[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("29822, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method382(510, arg4) / 2;
				@Pc(21) int local21 = arg0 - this.anInt572;
				for (@Pc(23) int local23 = 0; local23 < arg4.length(); local23++) {
					@Pc(29) char local29 = arg4.charAt(local23);
					if (local29 != ' ') {
						this.method390(this.aByteArrayArray1[local29], arg1 + this.anIntArray108[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local21 + this.anIntArray109[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray106[local29], this.anIntArray107[local29], arg2);
					}
					arg1 += this.anIntArray110[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("2784, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg1 -= this.method382(510, arg5) / 2;
				@Pc(40) int local40 = arg2 - this.anInt572;
				for (@Pc(42) int local42 = 0; local42 < arg5.length(); local42++) {
					@Pc(48) char local48 = arg5.charAt(local42);
					if (local48 != ' ') {
						this.method390(this.aByteArrayArray1[local48], arg1 + this.anIntArray108[local48], local40 + this.anIntArray109[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg4) * local9), this.anIntArray106[local48], this.anIntArray107[local48], arg0);
					}
					arg1 += this.anIntArray110[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("27921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(Ljava/lang/String;ZZIII)V")
	public void method387(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean118 = false;
			@Pc(11) int local11 = arg2;
			if (arg0 != null) {
				@Pc(19) int local19 = arg4 - this.anInt572;
				for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
					if (arg0.charAt(local21) == '@' && local21 + 4 < arg0.length() && arg0.charAt(local21 + 4) == '@') {
						@Pc(53) int local53 = this.method389(arg0.substring(local21 + 1, local21 + 4));
						if (local53 != -1) {
							arg3 = local53;
						}
						local21 += 4;
					} else {
						@Pc(65) char local65 = arg0.charAt(local21);
						if (local65 != ' ') {
							if (arg1) {
								this.method390(this.aByteArrayArray1[local65], arg2 + this.anIntArray108[local65] + 1, local19 + this.anIntArray109[local65] + 1, this.anIntArray106[local65], this.anIntArray107[local65], 0);
							}
							this.method390(this.aByteArrayArray1[local65], arg2 + this.anIntArray108[local65], local19 + this.anIntArray109[local65], this.anIntArray106[local65], this.anIntArray107[local65], arg3);
						}
						arg2 += this.anIntArray110[local65];
					}
				}
				if (this.aBoolean118) {
					Class1_Sub1_Sub1.method554(arg2 - local11, 8388608, local11, local19 + (int) ((double) this.anInt572 * 0.7D));
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("3265, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(ZLjava/lang/String;IBIII)V")
	public void method388(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(23) int local23 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(28) int local28 = 15 - this.anInt572;
				for (@Pc(30) int local30 = 0; local30 < arg0.length(); local30++) {
					if (arg0.charAt(local30) == '@' && local30 + 4 < arg0.length() && arg0.charAt(local30 + 4) == '@') {
						@Pc(62) int local62 = this.method389(arg0.substring(local30 + 1, local30 + 4));
						if (local62 != -1) {
							arg3 = local62;
						}
						local30 += 4;
					} else {
						@Pc(74) char local74 = arg0.charAt(local30);
						if (local74 != ' ') {
							this.method392(arg4 + this.anIntArray108[local74] + 1, local28 + this.anIntArray109[local74] + 1, this.aByteArrayArray1[local74], this.anIntArray107[local74], this.anIntArray106[local74], 0, 192);
							this.method392(arg4 + this.anIntArray108[local74], local28 + this.anIntArray109[local74], this.aByteArrayArray1[local74], this.anIntArray107[local74], this.anIntArray106[local74], arg3, local23);
						}
						arg4 += this.anIntArray110[local74];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("43524, " + true + ", " + arg0 + ", " + arg1 + ", " + -13 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method389(@OriginalArg(1) String arg0) {
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
					this.aBoolean118 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean118 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("16375, " + -357 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "([BIIIII)V")
	private void method390(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub1.anInt799;
		@Pc(9) int local9 = Class1_Sub1_Sub1.anInt799 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub1.anInt801) {
			local20 = Class1_Sub1_Sub1.anInt801 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub1.anInt801;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub1.anInt799;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub1.anInt802) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub1.anInt802;
		}
		if (arg1 < Class1_Sub1_Sub1.anInt803) {
			local20 = Class1_Sub1_Sub1.anInt803 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub1.anInt803;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub1.anInt804) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub1.anInt804;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method391(Class1_Sub1_Sub1.anIntArray206, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method391(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "(II[BIZIII)V")
	private void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(14) int local14 = arg0 + arg1 * Class1_Sub1_Sub1.anInt799;
			@Pc(18) int local18 = Class1_Sub1_Sub1.anInt799 - arg4;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			if (arg1 < Class1_Sub1_Sub1.anInt801) {
				local29 = Class1_Sub1_Sub1.anInt801 - arg1;
				arg3 -= local29;
				arg1 = Class1_Sub1_Sub1.anInt801;
				local22 = local29 * arg4 + 0;
				local14 += local29 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg1 + arg3 >= Class1_Sub1_Sub1.anInt802) {
				arg3 -= arg1 + arg3 + 1 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt803) {
				local29 = Class1_Sub1_Sub1.anInt803 - arg0;
				arg4 -= local29;
				arg0 = Class1_Sub1_Sub1.anInt803;
				local22 += local29;
				local14 += local29;
				local20 = local29 + 0;
				local18 += local29;
			}
			if (arg0 + arg4 >= Class1_Sub1_Sub1.anInt804) {
				local29 = arg0 + arg4 + 1 - Class1_Sub1_Sub1.anInt804;
				arg4 -= local29;
				local20 += local29;
				local18 += local29;
			}
			if (arg4 > 0 && arg3 > 0) {
				this.method393(arg2, local14, local20, arg6, Class1_Sub1_Sub1.anIntArray206, arg3, arg5, arg4, local22, local18);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("14256, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QJBJRTJO", name = "a", descriptor = "([BIIIB[IIIIII)V")
	private void method393(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(25) int local25 = ((arg6 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg3 & 0xFF0000) >> 8;
			@Pc(29) int local29 = 256 - arg3;
			for (@Pc(32) int local32 = -arg5; local32 < 0; local32++) {
				for (@Pc(37) int local37 = -arg7; local37 < 0; local37++) {
					if (arg0[arg8++] == 0) {
						arg1++;
					} else {
						@Pc(48) int local48 = arg4[arg1];
						arg4[arg1++] = (((local48 & 0xFF00FF) * local29 & 0xFF00FF00) + ((local48 & 0xFF00) * local29 & 0xFF0000) >> 8) + local25;
					}
				}
				arg1 += arg9;
				arg8 += arg2;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("76133, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 85 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
