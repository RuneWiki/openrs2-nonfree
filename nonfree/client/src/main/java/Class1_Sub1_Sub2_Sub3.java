import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UMCYZJWP")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!UMCYZJWP", name = "D", descriptor = "I")
	private int anInt732;

	@OriginalMember(owner = "client!UMCYZJWP", name = "z", descriptor = "I")
	private int anInt729 = -510;

	@OriginalMember(owner = "client!UMCYZJWP", name = "A", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!UMCYZJWP", name = "B", descriptor = "I")
	private int anInt730 = 2088;

	@OriginalMember(owner = "client!UMCYZJWP", name = "C", descriptor = "I")
	private int anInt731 = 9;

	@OriginalMember(owner = "client!UMCYZJWP", name = "E", descriptor = "Z")
	private boolean aBoolean152 = true;

	@OriginalMember(owner = "client!UMCYZJWP", name = "F", descriptor = "Z")
	private boolean aBoolean153 = false;

	@OriginalMember(owner = "client!UMCYZJWP", name = "G", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!UMCYZJWP", name = "H", descriptor = "[I")
	private int[] anIntArray183 = new int[256];

	@OriginalMember(owner = "client!UMCYZJWP", name = "I", descriptor = "[I")
	private int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!UMCYZJWP", name = "J", descriptor = "[I")
	private int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!UMCYZJWP", name = "K", descriptor = "[I")
	private int[] anIntArray186 = new int[256];

	@OriginalMember(owner = "client!UMCYZJWP", name = "L", descriptor = "[I")
	private int[] anIntArray187 = new int[256];

	@OriginalMember(owner = "client!UMCYZJWP", name = "N", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!UMCYZJWP", name = "O", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!UMCYZJWP", name = "M", descriptor = "I")
	public int anInt733;

	@OriginalMember(owner = "client!UMCYZJWP", name = "<init>", descriptor = "(Ljava/lang/String;ZILclient!QKFGLETG;)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36 arg3) {
		try {
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3((byte) 9, arg3.method337(arg0 + ".dat", null));
			@Pc(78) Class1_Sub1_Sub3 local78 = new Class1_Sub1_Sub3((byte) 9, arg3.method337("index.dat", null));
			local78.anInt806 = local69.method500() + 4;
			@Pc(89) int local89 = local78.method498();
			if (local89 > 0) {
				local78.anInt806 += (local89 - 1) * 3;
			}
			for (@Pc(103) int local103 = 0; local103 < 256; local103++) {
				this.anIntArray185[local103] = local78.method498();
				this.anIntArray186[local103] = local78.method498();
				@Pc(127) int local127 = this.anIntArray183[local103] = local78.method500();
				@Pc(135) int local135 = this.anIntArray184[local103] = local78.method500();
				@Pc(138) int local138 = local78.method498();
				@Pc(142) int local142 = local127 * local135;
				this.aByteArrayArray3[local103] = new byte[local142];
				@Pc(152) int local152;
				@Pc(177) int local177;
				if (local138 == 0) {
					for (local152 = 0; local152 < local142; local152++) {
						this.aByteArrayArray3[local103][local152] = local69.method499();
					}
				} else if (local138 == 1) {
					for (local152 = 0; local152 < local127; local152++) {
						for (local177 = 0; local177 < local135; local177++) {
							this.aByteArrayArray3[local103][local152 + local177 * local127] = local69.method499();
						}
					}
				}
				if (local135 > this.anInt733 && local103 < 128) {
					this.anInt733 = local135;
				}
				this.anIntArray185[local103] = 1;
				this.anIntArray187[local103] = local127 + 2;
				local152 = 0;
				for (local177 = local135 / 7; local177 < local135; local177++) {
					local152 += this.aByteArrayArray3[local103][local177 * local127];
				}
				@Pc(254) int local254;
				if (local152 <= local135 / 7) {
					local254 = this.anIntArray187[local103]--;
					this.anIntArray185[local103] = 0;
				}
				local152 = 0;
				for (@Pc(268) int local268 = local135 / 7; local268 < local135; local268++) {
					local152 += this.aByteArrayArray3[local103][local127 + local268 * local127 - 1];
				}
				if (local152 <= local135 / 7) {
					local254 = this.anIntArray187[local103]--;
				}
			}
			if (arg1) {
				this.anIntArray187[32] = this.anIntArray187[73];
			} else {
				this.anIntArray187[32] = this.anIntArray187[105];
			}
		} catch (@Pc(345) RuntimeException local345) {
			signlink.reporterror("77814, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local345.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg1 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			this.method424(507 - this.method423(arg3), arg3, arg0, arg2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("8922, " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method424(arg3 - this.method423(arg1) / 2, arg1, arg2, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("6056, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;ZZII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method428(arg4, arg3, arg1, arg2, arg0 - this.method422(arg1) / 2);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("89959, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method422(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < arg0.length(); local14++) {
				if (arg0.charAt(local14) == '@' && local14 + 4 < arg0.length() && arg0.charAt(local14 + 4) == '@') {
					local14 += 4;
				} else {
					local12 += this.anIntArray187[arg0.charAt(local14)];
				}
			}
			return local12;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("10508, " + arg0 + ", " + 12 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method423(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local10 += this.anIntArray187[arg0.charAt(local12)];
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("21033, " + 0 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "b", descriptor = "(ILjava/lang/String;III)V")
	public void method424(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg3 - this.anInt733;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method431(this.aByteArrayArray3[local15], arg0 + this.anIntArray185[local15], local7 + this.anIntArray186[local15], this.anIntArray183[local15], this.anIntArray184[local15], arg2);
					}
					arg0 += this.anIntArray187[local15];
				}
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("80952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method425(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 != null) {
				arg3 -= this.method423(arg1) / 2;
				@Pc(26) int local26 = arg4 - this.anInt733;
				for (@Pc(28) int local28 = 0; local28 < arg1.length(); local28++) {
					@Pc(34) char local34 = arg1.charAt(local28);
					if (local34 != ' ') {
						this.method431(this.aByteArrayArray3[local34], arg3 + this.anIntArray185[local34], local26 + this.anIntArray186[local34] + (int) (Math.sin((double) local28 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray183[local34], this.anIntArray184[local34], arg0);
					}
					arg3 += this.anIntArray187[local34];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("72588, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 524 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method426(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method423(arg0) / 2;
				@Pc(21) int local21 = arg1 - this.anInt733;
				for (@Pc(23) int local23 = 0; local23 < arg0.length(); local23++) {
					@Pc(29) char local29 = arg0.charAt(local23);
					if (local29 != ' ') {
						this.method431(this.aByteArrayArray3[local29], arg2 + this.anIntArray185[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local21 + this.anIntArray186[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray183[local29], this.anIntArray184[local29], arg4);
					}
					arg2 += this.anIntArray187[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("8082, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg1 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg0 -= this.method423(arg4) / 2;
				@Pc(36) int local36 = arg5 - this.anInt733;
				for (@Pc(38) int local38 = 0; local38 < arg4.length(); local38++) {
					@Pc(44) char local44 = arg4.charAt(local38);
					if (local44 != ' ') {
						this.method431(this.aByteArrayArray3[local44], arg0 + this.anIntArray185[local44], local36 + this.anIntArray186[local44] + (int) (Math.sin((double) local38 / 1.5D + (double) arg2) * local9), this.anIntArray183[local44], this.anIntArray184[local44], arg3);
					}
					arg0 += this.anIntArray187[local44];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("52043, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(IILjava/lang/String;ZIB)V")
	public void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			this.aBoolean154 = false;
			@Pc(6) int local6 = arg4;
			if (arg2 != null) {
				@Pc(14) int local14 = arg0 - this.anInt733;
				for (@Pc(20) int local20 = 0; local20 < arg2.length(); local20++) {
					if (arg2.charAt(local20) == '@' && local20 + 4 < arg2.length() && arg2.charAt(local20 + 4) == '@') {
						@Pc(53) int local53 = this.method430(arg2.substring(local20 + 1, local20 + 4), this.anInt732);
						if (local53 != -1) {
							arg1 = local53;
						}
						local20 += 4;
					} else {
						@Pc(65) char local65 = arg2.charAt(local20);
						if (local65 != ' ') {
							if (arg3) {
								this.method431(this.aByteArrayArray3[local65], arg4 + this.anIntArray185[local65] + 1, local14 + this.anIntArray186[local65] + 1, this.anIntArray183[local65], this.anIntArray184[local65], 0);
							}
							this.method431(this.aByteArrayArray3[local65], arg4 + this.anIntArray185[local65], local14 + this.anIntArray186[local65], this.anIntArray183[local65], this.anIntArray184[local65], arg1);
						}
						arg4 += this.anIntArray187[local65];
					}
				}
				if (this.aBoolean154) {
					Class1_Sub1_Sub2.method545(8388608, local14 + (int) ((double) this.anInt733 * 0.7D), arg4 - local6, local6);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("81953, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;IZIZII)V")
	public void method429(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt733;
				for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
					if (arg0.charAt(local27) == '@' && local27 + 4 < arg0.length() && arg0.charAt(local27 + 4) == '@') {
						@Pc(60) int local60 = this.method430(arg0.substring(local27 + 1, local27 + 4), this.anInt732);
						if (local60 != -1) {
							arg1 = local60;
						}
						local27 += 4;
					} else {
						@Pc(72) char local72 = arg0.charAt(local27);
						if (local72 != ' ') {
							this.method433(this.anIntArray184[local72], this.anIntArray183[local72], this.aByteArrayArray3[local72], 192, 0, arg2 + this.anIntArray185[local72] + 1, local25 + this.anIntArray186[local72] + 1);
							this.method433(this.anIntArray184[local72], this.anIntArray183[local72], this.aByteArrayArray3[local72], local17, arg1, arg2 + this.anIntArray185[local72], local25 + this.anIntArray186[local72]);
						}
						arg2 += this.anIntArray187[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("82795, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method430(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 0) {
				this.aBoolean151 = !this.aBoolean151;
			}
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
					this.aBoolean154 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean154 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("43699, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "([BIIIII)V")
	private void method431(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt817;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt817 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt819) {
			local20 = Class1_Sub1_Sub2.anInt819 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt819;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt817;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt820) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt820;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt821) {
			local20 = Class1_Sub1_Sub2.anInt821 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt821;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt822) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt822;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method432(Class1_Sub1_Sub2.anIntArray207, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method432(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(II[BIIIII)V")
	private void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(5) int local5 = arg5 + arg6 * Class1_Sub1_Sub2.anInt817;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt817 - arg1;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(23) int local23;
			if (arg6 < Class1_Sub1_Sub2.anInt819) {
				local23 = Class1_Sub1_Sub2.anInt819 - arg6;
				arg0 -= local23;
				arg6 = Class1_Sub1_Sub2.anInt819;
				local13 = local23 * arg1 + 0;
				local5 += local23 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg6 + arg0 >= Class1_Sub1_Sub2.anInt820) {
				arg0 -= arg6 + arg0 + 1 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg5 < Class1_Sub1_Sub2.anInt821) {
				local23 = Class1_Sub1_Sub2.anInt821 - arg5;
				arg1 -= local23;
				arg5 = Class1_Sub1_Sub2.anInt821;
				local13 += local23;
				local5 += local23;
				local11 = local23 + 0;
				local9 += local23;
			}
			if (arg5 + arg1 >= Class1_Sub1_Sub2.anInt822) {
				local23 = arg5 + arg1 + 1 - Class1_Sub1_Sub2.anInt822;
				arg1 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg1 > 0 && arg0 > 0) {
				this.method434(local5, local9, arg0, arg2, arg4, Class1_Sub1_Sub2.anIntArray207, arg1, local13, local11, arg3);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("19766, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMCYZJWP", name = "a", descriptor = "(III[BII[IIIII)V")
	private void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg4 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(36) int local36 = -arg2; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg6; local41 < 0; local41++) {
					if (arg3[arg7++] == 0) {
						arg0++;
					} else {
						@Pc(52) int local52 = arg5[arg0];
						arg5[arg0++] = (((local52 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local52 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg1;
				arg7 += arg8;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("82783, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
