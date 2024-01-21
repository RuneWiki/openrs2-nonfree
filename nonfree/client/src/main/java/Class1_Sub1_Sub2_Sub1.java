import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AWMLZOXZ")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!AWMLZOXZ", name = "w", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "v", descriptor = "I")
	private int anInt168 = 3;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "x", descriptor = "B")
	private byte aByte3 = 2;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "y", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "A", descriptor = "[I")
	private int[] anIntArray18 = new int[256];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "B", descriptor = "[I")
	private int[] anIntArray19 = new int[256];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "C", descriptor = "[I")
	private int[] anIntArray20 = new int[256];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "D", descriptor = "[I")
	private int[] anIntArray21 = new int[256];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "E", descriptor = "[I")
	private int[] anIntArray22 = new int[256];

	@OriginalMember(owner = "client!AWMLZOXZ", name = "G", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!AWMLZOXZ", name = "H", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "F", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!AWMLZOXZ", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!IEMHZJLX;ZZ)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(60) Class1_Sub1_Sub4 local60 = new Class1_Sub1_Sub4(0, arg1.method181(arg0 + ".dat", null));
			@Pc(69) Class1_Sub1_Sub4 local69 = new Class1_Sub1_Sub4(0, arg1.method181("index.dat", null));
			local69.anInt529 = local60.method296() + 4;
			@Pc(85) int local85 = local69.method294();
			if (local85 > 0) {
				local69.anInt529 += (local85 - 1) * 3;
			}
			for (@Pc(99) int local99 = 0; local99 < 256; local99++) {
				this.anIntArray20[local99] = local69.method294();
				this.anIntArray21[local99] = local69.method294();
				@Pc(123) int local123 = this.anIntArray18[local99] = local69.method296();
				@Pc(131) int local131 = this.anIntArray19[local99] = local69.method296();
				@Pc(134) int local134 = local69.method294();
				@Pc(138) int local138 = local123 * local131;
				this.aByteArrayArray1[local99] = new byte[local138];
				@Pc(148) int local148;
				@Pc(173) int local173;
				if (local134 == 0) {
					for (local148 = 0; local148 < local138; local148++) {
						this.aByteArrayArray1[local99][local148] = local60.method295();
					}
				} else if (local134 == 1) {
					for (local148 = 0; local148 < local123; local148++) {
						for (local173 = 0; local173 < local131; local173++) {
							this.aByteArrayArray1[local99][local148 + local173 * local123] = local60.method295();
						}
					}
				}
				if (local131 > this.anInt170 && local99 < 128) {
					this.anInt170 = local131;
				}
				this.anIntArray20[local99] = 1;
				this.anIntArray22[local99] = local123 + 2;
				local148 = 0;
				for (local173 = local131 / 7; local173 < local131; local173++) {
					local148 += this.aByteArrayArray1[local99][local173 * local123];
				}
				@Pc(250) int local250;
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray22[local99]--;
					this.anIntArray20[local99] = 0;
				}
				local148 = 0;
				for (@Pc(264) int local264 = local131 / 7; local264 < local131; local264++) {
					local148 += this.aByteArrayArray1[local99][local123 + local264 * local123 - 1];
				}
				if (local148 <= local131 / 7) {
					local250 = this.anIntArray22[local99]--;
				}
			}
			if (arg3) {
				this.anIntArray22[32] = this.anIntArray22[73];
			} else {
				this.anIntArray22[32] = this.anIntArray22[105];
			}
		} catch (@Pc(323) RuntimeException local323) {
			signlink.reporterror("69094, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local323.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
	public void method68(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			this.method73((byte) 6, arg2, arg1, 507 - this.method72(arg1), arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("75435, " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method69(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method73((byte) 6, arg2, arg1, arg3 - this.method72(arg1) / 2, arg0);
			if (this.anInt169 == 0) {
				;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("83749, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(Ljava/lang/String;ZIIII)V")
	public void method70(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method77(arg4 - this.method71(arg0) / 2, arg2, arg1, arg0, arg3);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("15454, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method71(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray22[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("79042, " + 0 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method72(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local10 += this.anIntArray22[arg0.charAt(local12)];
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("22155, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BILjava/lang/String;II)V")
	public void method73(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg1 - this.anInt170;
				for (@Pc(9) int local9 = 0; local9 < arg2.length(); local9++) {
					@Pc(15) char local15 = arg2.charAt(local9);
					if (local15 != ' ') {
						this.method80(this.aByteArrayArray1[local15], arg3 + this.anIntArray20[local15], local7 + this.anIntArray21[local15], this.anIntArray18[local15], this.anIntArray19[local15], arg4);
					}
					arg3 += this.anIntArray22[local15];
				}
				@Pc(62) boolean local62 = false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("25560, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method74(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 != null) {
				arg0 -= this.method72(arg1) / 2;
				@Pc(18) int local18 = arg4 - this.anInt170;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					@Pc(26) char local26 = arg1.charAt(local20);
					if (local26 != ' ') {
						this.method80(this.aByteArrayArray1[local26], arg0 + this.anIntArray20[local26], local18 + this.anIntArray21[local26] + (int) (Math.sin((double) local20 / 2.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray18[local26], this.anIntArray19[local26], arg2);
					}
					arg0 += this.anIntArray22[local26];
				}
				if (arg3 < 0 || arg3 > 0) {
					for (@Pc(88) int local88 = 1; local88 > 0; local88++) {
					}
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("13358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BIIIILjava/lang/String;)V")
	public void method75(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			if (arg5 != null) {
				arg3 -= this.method72(arg5) / 2;
				if (arg0 != -114) {
					this.anInt168 = 353;
				}
				@Pc(22) int local22 = arg2 - this.anInt170;
				for (@Pc(24) int local24 = 0; local24 < arg5.length(); local24++) {
					@Pc(30) char local30 = arg5.charAt(local24);
					if (local30 != ' ') {
						this.method80(this.aByteArrayArray1[local30], arg3 + this.anIntArray20[local30] + (int) (Math.sin((double) local24 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local22 + this.anIntArray21[local30] + (int) (Math.sin((double) local24 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray18[local30], this.anIntArray19[local30], arg4);
					}
					arg3 += this.anIntArray22[local30];
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("47626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IZIIILjava/lang/String;I)V")
	public void method76(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg4 / 8.0D;
				if (arg1) {
					if (local9 < 0.0D) {
						local9 = 0.0D;
					}
					arg2 -= this.method72(arg5) / 2;
					@Pc(32) int local32 = arg0 - this.anInt170;
					for (@Pc(34) int local34 = 0; local34 < arg5.length(); local34++) {
						@Pc(40) char local40 = arg5.charAt(local34);
						if (local40 != ' ') {
							this.method80(this.aByteArrayArray1[local40], arg2 + this.anIntArray20[local40], local32 + this.anIntArray21[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg3) * local9), this.anIntArray18[local40], this.anIntArray19[local40], arg6);
						}
						arg2 += this.anIntArray22[local40];
					}
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("56087, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIIZLjava/lang/String;I)V")
	public void method77(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean25 = false;
			@Pc(6) int local6 = arg0;
			if (arg3 != null) {
				@Pc(14) int local14 = arg1 - this.anInt170;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					if (arg3.charAt(local21) == '@' && local21 + 4 < arg3.length() && arg3.charAt(local21 + 4) == '@') {
						@Pc(53) int local53 = this.method79((byte) 6, arg3.substring(local21 + 1, local21 + 4));
						if (local53 != -1) {
							arg4 = local53;
						}
						local21 += 4;
					} else {
						@Pc(65) char local65 = arg3.charAt(local21);
						if (local65 != ' ') {
							if (arg2) {
								this.method80(this.aByteArrayArray1[local65], arg0 + this.anIntArray20[local65] + 1, local14 + this.anIntArray21[local65] + 1, this.anIntArray18[local65], this.anIntArray19[local65], 0);
							}
							this.method80(this.aByteArrayArray1[local65], arg0 + this.anIntArray20[local65], local14 + this.anIntArray21[local65], this.anIntArray18[local65], this.anIntArray19[local65], arg4);
						}
						arg0 += this.anIntArray22[local65];
					}
				}
				if (this.aBoolean25) {
					Class1_Sub1_Sub2.method520(local6, local14 + (int) ((double) this.anInt170 * 0.7D), 8388608, arg0 - local6);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("40689, " + arg0 + ", " + -968 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IILjava/lang/String;IZBI)V")
	public void method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(11) int local11;
			if (this.aByte3 == 2) {
				@Pc(7) boolean local7 = false;
			} else {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg5);
				local11 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(37) int local37 = 15 - this.anInt170;
				for (@Pc(39) int local39 = 0; local39 < arg2.length(); local39++) {
					if (arg2.charAt(local39) == '@' && local39 + 4 < arg2.length() && arg2.charAt(local39 + 4) == '@') {
						@Pc(71) int local71 = this.method79((byte) 6, arg2.substring(local39 + 1, local39 + 4));
						if (local71 != -1) {
							arg0 = local71;
						}
						local39 += 4;
					} else {
						@Pc(83) char local83 = arg2.charAt(local39);
						if (local83 != ' ') {
							this.method82(192, arg1 + this.anIntArray20[local83] + 1, this.anIntArray18[local83], this.anIntArray19[local83], this.aByteArrayArray1[local83], 0, local37 + this.anIntArray21[local83] + 1);
							this.method82(local11, arg1 + this.anIntArray20[local83], this.anIntArray18[local83], this.anIntArray19[local83], this.aByteArrayArray1[local83], arg0, local37 + this.anIntArray21[local83]);
						}
						arg1 += this.anIntArray22[local83];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("67516, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(BLjava/lang/String;)I")
	private int method79(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(4) boolean local4 = false;
			if (arg1.equals("red")) {
				return 16711680;
			} else if (arg1.equals("gre")) {
				return 65280;
			} else if (arg1.equals("blu")) {
				return 255;
			} else if (arg1.equals("yel")) {
				return 16776960;
			} else if (arg1.equals("cya")) {
				return 65535;
			} else if (arg1.equals("mag")) {
				return 16711935;
			} else if (arg1.equals("whi")) {
				return 16777215;
			} else if (arg1.equals("bla")) {
				return 0;
			} else if (arg1.equals("lre")) {
				return 16748608;
			} else if (arg1.equals("dre")) {
				return 8388608;
			} else if (arg1.equals("dbl")) {
				return 128;
			} else if (arg1.equals("or1")) {
				return 16756736;
			} else if (arg1.equals("or2")) {
				return 16740352;
			} else if (arg1.equals("or3")) {
				return 16723968;
			} else if (arg1.equals("gr1")) {
				return 12648192;
			} else if (arg1.equals("gr2")) {
				return 8453888;
			} else if (arg1.equals("gr3")) {
				return 4259584;
			} else {
				if (arg1.equals("str")) {
					this.aBoolean25 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean25 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("58048, " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "([BIIIII)V")
	private void method80(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt730;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt730 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt732) {
			local20 = Class1_Sub1_Sub2.anInt732 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt732;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt730;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt733) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt733;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt734) {
			local20 = Class1_Sub1_Sub2.anInt734 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt734;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt735) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt735;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method81(Class1_Sub1_Sub2.anIntArray192, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method81(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIII[BIII)V")
	private void method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg6 * Class1_Sub1_Sub2.anInt730;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt730 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg6 < Class1_Sub1_Sub2.anInt732) {
				local20 = Class1_Sub1_Sub2.anInt732 - arg6;
				arg3 -= local20;
				arg6 = Class1_Sub1_Sub2.anInt732;
				local13 = local20 * arg2 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg6 + arg3 >= Class1_Sub1_Sub2.anInt733) {
				arg3 -= arg6 + arg3 + 1 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt734) {
				local20 = Class1_Sub1_Sub2.anInt734 - arg1;
				arg2 -= local20;
				arg1 = Class1_Sub1_Sub2.anInt734;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg1 + arg2 >= Class1_Sub1_Sub2.anInt735) {
				local20 = arg1 + arg2 + 1 - Class1_Sub1_Sub2.anInt735;
				arg2 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg2 > 0 && arg3 > 0) {
				this.method83(local5, arg5, local9, local11, local13, arg0, arg2, arg3, arg4, Class1_Sub1_Sub2.anIntArray192);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("81777, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AWMLZOXZ", name = "a", descriptor = "(IIIIIBIII[B[I)V")
	private void method83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(19) int local19 = ((arg1 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg5;
			for (@Pc(37) int local37 = -arg7; local37 < 0; local37++) {
				for (@Pc(42) int local42 = -arg6; local42 < 0; local42++) {
					if (arg8[arg4++] == 0) {
						arg0++;
					} else {
						@Pc(53) int local53 = arg9[arg0];
						arg9[arg0++] = (((local53 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local53 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg2;
				arg4 += arg3;
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("83371, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -65 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}
}
