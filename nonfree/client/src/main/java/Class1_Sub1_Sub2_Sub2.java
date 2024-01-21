import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ONSICLVF")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ONSICLVF", name = "w", descriptor = "I")
	private int anInt432 = 9;

	@OriginalMember(owner = "client!ONSICLVF", name = "x", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!ONSICLVF", name = "y", descriptor = "B")
	private byte aByte9 = 1;

	@OriginalMember(owner = "client!ONSICLVF", name = "z", descriptor = "B")
	private byte aByte10 = 1;

	@OriginalMember(owner = "client!ONSICLVF", name = "A", descriptor = "Z")
	private boolean aBoolean90 = false;

	@OriginalMember(owner = "client!ONSICLVF", name = "B", descriptor = "I")
	private int anInt433 = 7;

	@OriginalMember(owner = "client!ONSICLVF", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!ONSICLVF", name = "D", descriptor = "[I")
	private int[] anIntArray130 = new int[256];

	@OriginalMember(owner = "client!ONSICLVF", name = "E", descriptor = "[I")
	private int[] anIntArray131 = new int[256];

	@OriginalMember(owner = "client!ONSICLVF", name = "F", descriptor = "[I")
	private int[] anIntArray132 = new int[256];

	@OriginalMember(owner = "client!ONSICLVF", name = "G", descriptor = "[I")
	private int[] anIntArray133 = new int[256];

	@OriginalMember(owner = "client!ONSICLVF", name = "H", descriptor = "[I")
	private int[] anIntArray134 = new int[256];

	@OriginalMember(owner = "client!ONSICLVF", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ONSICLVF", name = "K", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ONSICLVF", name = "I", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!ONSICLVF", name = "<init>", descriptor = "(BLclient!WEMOPWVJ;ZLjava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(69) Class1_Sub1_Sub4 local69 = new Class1_Sub1_Sub4(arg1.method515(arg3 + ".dat", null), true);
			@Pc(78) Class1_Sub1_Sub4 local78 = new Class1_Sub1_Sub4(arg1.method515("index.dat", null), true);
			if (arg0 != this.aByte9) {
				this.aBoolean90 = !this.aBoolean90;
			}
			local78.anInt624 = local69.method407() + 4;
			@Pc(101) int local101 = local78.method405();
			if (local101 > 0) {
				local78.anInt624 += (local101 - 1) * 3;
			}
			for (@Pc(115) int local115 = 0; local115 < 256; local115++) {
				this.anIntArray132[local115] = local78.method405();
				this.anIntArray133[local115] = local78.method405();
				@Pc(139) int local139 = this.anIntArray130[local115] = local78.method407();
				@Pc(147) int local147 = this.anIntArray131[local115] = local78.method407();
				@Pc(150) int local150 = local78.method405();
				@Pc(154) int local154 = local139 * local147;
				this.aByteArrayArray3[local115] = new byte[local154];
				@Pc(164) int local164;
				@Pc(189) int local189;
				if (local150 == 0) {
					for (local164 = 0; local164 < local154; local164++) {
						this.aByteArrayArray3[local115][local164] = local69.method406();
					}
				} else if (local150 == 1) {
					for (local164 = 0; local164 < local139; local164++) {
						for (local189 = 0; local189 < local147; local189++) {
							this.aByteArrayArray3[local115][local164 + local189 * local139] = local69.method406();
						}
					}
				}
				if (local147 > this.anInt434 && local115 < 128) {
					this.anInt434 = local147;
				}
				this.anIntArray132[local115] = 1;
				this.anIntArray134[local115] = local139 + 2;
				local164 = 0;
				for (local189 = local147 / 7; local189 < local147; local189++) {
					local164 += this.aByteArrayArray3[local115][local189 * local139];
				}
				@Pc(266) int local266;
				if (local164 <= local147 / 7) {
					local266 = this.anIntArray134[local115]--;
					this.anIntArray132[local115] = 0;
				}
				local164 = 0;
				for (@Pc(280) int local280 = local147 / 7; local280 < local147; local280++) {
					local164 += this.aByteArrayArray3[local115][local139 + local280 * local139 - 1];
				}
				if (local164 <= local147 / 7) {
					local266 = this.anIntArray134[local115]--;
				}
			}
			if (arg2) {
				this.anIntArray134[32] = this.anIntArray134[73];
			} else {
				this.anIntArray134[32] = this.anIntArray134[105];
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("39759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method274(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			this.method279(arg0, arg2, 507 - this.method278(arg1), arg1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83651, " + arg0 + ", " + 553 + ", " + arg1 + ", " + arg2 + ", " + 507 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IBLjava/lang/String;II)V")
	public void method275(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method279(arg0, arg3, arg2 - this.method278(arg1) / 2, arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("80870, " + arg0 + ", " + 33 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public void method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.method283(arg4, arg3, arg2, arg0 - this.method277(arg2) / 2, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -40792 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method277(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray134[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("60003, " + arg0 + ", " + 443 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method278(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local16 += this.anIntArray134[arg0.charAt(local18)];
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("7831, " + 0 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIBILjava/lang/String;)V")
	public void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg0 - this.anInt434;
				for (@Pc(13) int local13 = 0; local13 < arg3.length(); local13++) {
					@Pc(19) char local19 = arg3.charAt(local13);
					if (local19 != ' ') {
						this.method286(this.aByteArrayArray3[local19], arg2 + this.anIntArray132[local19], local7 + this.anIntArray133[local19], this.anIntArray130[local19], this.anIntArray131[local19], arg1);
					}
					arg2 += this.anIntArray134[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("15715, " + arg0 + ", " + arg1 + ", " + -120 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg0 -= this.method278(arg3) / 2;
				@Pc(16) int local16 = arg4 - this.anInt434;
				for (@Pc(18) int local18 = 0; local18 < arg3.length(); local18++) {
					@Pc(24) char local24 = arg3.charAt(local18);
					if (local24 != ' ') {
						this.method286(this.aByteArrayArray3[local24], arg0 + this.anIntArray132[local24], local16 + this.anIntArray133[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray130[local24], this.anIntArray131[local24], arg2);
					}
					arg0 += this.anIntArray134[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("77343, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method281(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg3 -= this.method278(arg0) / 2;
				@Pc(16) int local16 = arg2 - this.anInt434;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method286(this.aByteArrayArray3[local24], arg3 + this.anIntArray132[local24] + (int) (Math.sin((double) local18 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local16 + this.anIntArray133[local24] + (int) (Math.sin((double) local18 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray130[local24], this.anIntArray131[local24], arg4);
					}
					arg3 += this.anIntArray134[local24];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("53681, " + arg0 + ", " + arg1 + ", " + 856 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg4 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg5 -= this.method278(arg2) / 2;
				@Pc(31) int local31 = arg0 - this.anInt434;
				for (@Pc(33) int local33 = 0; local33 < arg2.length(); local33++) {
					@Pc(39) char local39 = arg2.charAt(local33);
					if (local39 != ' ') {
						this.method286(this.aByteArrayArray3[local39], arg5 + this.anIntArray132[local39], local31 + this.anIntArray133[local39] + (int) (Math.sin((double) local33 / 1.5D + (double) arg3) * local11), this.anIntArray130[local39], this.anIntArray131[local39], arg1);
					}
					arg5 += this.anIntArray134[local39];
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("61891, " + -125 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean91 = false;
			@Pc(10) int local10 = arg3;
			if (arg2 != null) {
				@Pc(18) int local18 = arg4 - this.anInt434;
				for (@Pc(20) int local20 = 0; local20 < arg2.length(); local20++) {
					if (arg2.charAt(local20) == '@' && local20 + 4 < arg2.length() && arg2.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method285(arg2.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg0 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg2.charAt(local20);
						if (local64 != ' ') {
							if (arg1) {
								this.method286(this.aByteArrayArray3[local64], arg3 + this.anIntArray132[local64] + 1, local18 + this.anIntArray133[local64] + 1, this.anIntArray130[local64], this.anIntArray131[local64], 0);
							}
							this.method286(this.aByteArrayArray3[local64], arg3 + this.anIntArray132[local64], local18 + this.anIntArray133[local64], this.anIntArray130[local64], this.anIntArray131[local64], arg0);
						}
						arg3 += this.anIntArray134[local64];
					}
				}
				if (this.aBoolean91) {
					Class1_Sub1_Sub2.method561(local10, arg3 - local10, 8388608, local18 + (int) ((double) this.anInt434 * 0.7D));
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("85372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -21100 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IILjava/lang/String;IIZZ)V")
	public void method284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt434;
				for (@Pc(27) int local27 = 0; local27 < arg2.length(); local27++) {
					if (arg2.charAt(local27) == '@' && local27 + 4 < arg2.length() && arg2.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method285(arg2.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg1 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg2.charAt(local27);
						if (local71 != ' ') {
							this.method288(this.aByteArrayArray3[local71], 0, this.anIntArray130[local71], this.anIntArray131[local71], local22 + this.anIntArray133[local71] + 1, arg4 + this.anIntArray132[local71] + 1, 192);
							this.method288(this.aByteArrayArray3[local71], arg1, this.anIntArray130[local71], this.anIntArray131[local71], local22 + this.anIntArray133[local71], arg4 + this.anIntArray132[local71], local17);
						}
						arg4 += this.anIntArray134[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("69944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "b", descriptor = "(Ljava/lang/String;I)I")
	private int method285(@OriginalArg(0) String arg0) {
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
					this.aBoolean91 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean91 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("10270, " + arg0 + ", " + -404 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([BIIIII)V")
	private void method286(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt787;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt787 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt789) {
			local20 = Class1_Sub1_Sub2.anInt789 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt789;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt787;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt790) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt790;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt791) {
			local20 = Class1_Sub1_Sub2.anInt791 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt791;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt792) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt792;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method287(Class1_Sub1_Sub2.anIntArray208, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method287(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "([BIIIIIII)V")
	private void method288(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(15) int local15 = arg5 + arg4 * Class1_Sub1_Sub2.anInt787;
			@Pc(19) int local19 = Class1_Sub1_Sub2.anInt787 - arg2;
			@Pc(21) int local21 = 0;
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			if (arg4 < Class1_Sub1_Sub2.anInt789) {
				local30 = Class1_Sub1_Sub2.anInt789 - arg4;
				arg3 -= local30;
				arg4 = Class1_Sub1_Sub2.anInt789;
				local23 = local30 * arg2 + 0;
				local15 += local30 * Class1_Sub1_Sub2.anInt787;
			}
			if (arg4 + arg3 >= Class1_Sub1_Sub2.anInt790) {
				arg3 -= arg4 + arg3 + 1 - Class1_Sub1_Sub2.anInt790;
			}
			if (arg5 < Class1_Sub1_Sub2.anInt791) {
				local30 = Class1_Sub1_Sub2.anInt791 - arg5;
				arg2 -= local30;
				arg5 = Class1_Sub1_Sub2.anInt791;
				local23 += local30;
				local15 += local30;
				local21 = local30 + 0;
				local19 += local30;
			}
			if (arg5 + arg2 >= Class1_Sub1_Sub2.anInt792) {
				local30 = arg5 + arg2 + 1 - Class1_Sub1_Sub2.anInt792;
				arg2 -= local30;
				local21 += local30;
				local19 += local30;
			}
			if (arg2 > 0 && arg3 > 0) {
				this.method289(local21, arg6, arg3, local19, arg0, local15, Class1_Sub1_Sub2.anIntArray208, arg2, local23, arg1);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("49958, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ONSICLVF", name = "a", descriptor = "(IBIII[BI[IIII)V")
	private void method289(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			if (this.aByte10 == 1) {
				@Pc(24) int local24 = ((arg9 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg1 & 0xFF0000) >> 8;
				@Pc(28) int local28 = 256 - arg1;
				for (@Pc(31) int local31 = -arg2; local31 < 0; local31++) {
					for (@Pc(36) int local36 = -arg7; local36 < 0; local36++) {
						if (arg4[arg8++] == 0) {
							arg5++;
						} else {
							@Pc(47) int local47 = arg6[arg5];
							arg6[arg5++] = (((local47 & 0xFF00FF) * local28 & 0xFF00FF00) + ((local47 & 0xFF00) * local28 & 0xFF0000) >> 8) + local24;
						}
					}
					arg5 += arg3;
					arg8 += arg0;
				}
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("42561, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
