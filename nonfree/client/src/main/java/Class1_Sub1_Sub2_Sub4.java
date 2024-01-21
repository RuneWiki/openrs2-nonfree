import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt705 = 1;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "B")
	private byte aByte24 = 4;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt706 = 7;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt707 = -17283;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt708 = 25737;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IZLjava/lang/String;Lclient!xb;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class47 arg3) {
		try {
			@Pc(72) Class1_Sub1_Sub3 local72 = new Class1_Sub1_Sub3(arg3.method666(arg2 + ".dat", null), -26728);
			@Pc(81) Class1_Sub1_Sub3 local81 = new Class1_Sub1_Sub3(arg3.method666("index.dat", null), -26728);
			local81.anInt742 = local72.method482() + 4;
			@Pc(92) int local92 = local81.method480();
			if (local92 > 0) {
				local81.anInt742 += (local92 - 1) * 3;
			}
			for (@Pc(106) int local106 = 0; local106 < 256; local106++) {
				this.anIntArray216[local106] = local81.method480();
				this.anIntArray217[local106] = local81.method480();
				@Pc(130) int local130 = this.anIntArray214[local106] = local81.method482();
				@Pc(138) int local138 = this.anIntArray215[local106] = local81.method482();
				@Pc(141) int local141 = local81.method480();
				@Pc(145) int local145 = local130 * local138;
				this.aByteArrayArray3[local106] = new byte[local145];
				@Pc(155) int local155;
				@Pc(180) int local180;
				if (local141 == 0) {
					for (local155 = 0; local155 < local145; local155++) {
						this.aByteArrayArray3[local106][local155] = local72.method481();
					}
				} else if (local141 == 1) {
					for (local155 = 0; local155 < local130; local155++) {
						for (local180 = 0; local180 < local138; local180++) {
							this.aByteArrayArray3[local106][local155 + local180 * local130] = local72.method481();
						}
					}
				}
				if (local138 > this.anInt711 && local106 < 128) {
					this.anInt711 = local138;
				}
				this.anIntArray216[local106] = 1;
				this.anIntArray218[local106] = local130 + 2;
				local155 = 0;
				for (local180 = local138 / 7; local180 < local138; local180++) {
					local155 += this.aByteArrayArray3[local106][local180 * local130];
				}
				@Pc(257) int local257;
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray218[local106]--;
					this.anIntArray216[local106] = 0;
				}
				local155 = 0;
				for (@Pc(271) int local271 = local138 / 7; local271 < local138; local271++) {
					local155 += this.aByteArrayArray3[local106][local130 + local271 * local130 - 1];
				}
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray218[local106]--;
				}
			}
			if (arg0 < this.anInt706 || arg0 > this.anInt706) {
				throw new NullPointerException();
			} else if (arg1) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(347) RuntimeException local347) {
			signlink.reporterror("24977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local347.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method446(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method451(arg1, 507 - this.method450(arg1), arg2, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("94235, " + 507 + ", " + arg0 + ", " + arg1 + ", " + 44274 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) int local3 = 78 / arg4;
			this.method451(arg0, arg3 - this.method450(arg0) / 2, arg2, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("69887, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIBZ)V")
	public void method448(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method455(arg0, arg3, arg2 - this.method449(arg0) / 2, arg4, arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("80026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + arg4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method449(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			if (this.aByte24 != 4) {
				return this.anInt709;
			}
			for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
				if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
					local16 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local16)];
				}
			}
			return local7;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("55856, " + 4 + ", " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method450(@OriginalArg(0) String arg0) {
		try {
			if (this.anInt707 != -17283) {
				this.aBoolean179 = !this.aBoolean179;
			}
			if (arg0 == null) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				local17 += this.anIntArray218[arg0.charAt(local19)];
			}
			return local17;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("3085, " + arg0 + ", " + -17283 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public void method451(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (this.anInt708 != 25737) {
				this.aBoolean180 = !this.aBoolean180;
			}
			if (arg0 != null) {
				@Pc(19) int local19 = arg3 - this.anInt711;
				for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
					@Pc(27) char local27 = arg0.charAt(local21);
					if (local27 != ' ') {
						this.method458(this.aByteArrayArray3[local27], arg1 + this.anIntArray216[local27], local19 + this.anIntArray217[local27], this.anIntArray214[local27], this.anIntArray215[local27], arg2);
					}
					arg1 += this.anIntArray218[local27];
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19673, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 25737 + ", " + arg3 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIZLjava/lang/String;)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method450(arg4) / 2;
				@Pc(16) int local16 = arg2 - this.anInt711;
				for (@Pc(18) int local18 = 0; local18 < arg4.length(); local18++) {
					@Pc(24) char local24 = arg4.charAt(local18);
					if (local24 != ' ') {
						this.method458(this.aByteArrayArray3[local24], arg3 + this.anIntArray216[local24], local16 + this.anIntArray217[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray214[local24], this.anIntArray215[local24], arg1);
					}
					arg3 += this.anIntArray218[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("36428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg4 -= this.method450(arg2) / 2;
				@Pc(26) int local26 = arg3 - this.anInt711;
				for (@Pc(28) int local28 = 0; local28 < arg2.length(); local28++) {
					@Pc(34) char local34 = arg2.charAt(local28);
					if (local34 != ' ') {
						this.method458(this.aByteArrayArray3[local34], arg4 + this.anIntArray216[local34] + (int) (Math.sin((double) local28 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local26 + this.anIntArray217[local34] + (int) (Math.sin((double) local28 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray214[local34], this.anIntArray215[local34], arg0);
					}
					arg4 += this.anIntArray218[local34];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("59481, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIIIB)V")
	public void method454(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg1 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method450(arg0) / 2;
				@Pc(29) int local29 = arg3 - this.anInt711;
				for (@Pc(31) int local31 = 0; local31 < arg0.length(); local31++) {
					@Pc(37) char local37 = arg0.charAt(local31);
					if (local37 != ' ') {
						this.method458(this.aByteArrayArray3[local37], arg5 + this.anIntArray216[local37], local29 + this.anIntArray217[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg4) * local9), this.anIntArray214[local37], this.anIntArray215[local37], arg2);
					}
					arg5 += this.anIntArray218[local37];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("86511, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 30 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;ZIIZI)V")
	public void method455(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean181 = false;
			@Pc(15) int local15 = arg2;
			if (arg0 != null) {
				@Pc(23) int local23 = arg4 - this.anInt711;
				for (@Pc(25) int local25 = 0; local25 < arg0.length(); local25++) {
					if (arg0.charAt(local25) == '@' && local25 + 4 < arg0.length() && arg0.charAt(local25 + 4) == '@') {
						@Pc(57) int local57 = this.method457(arg0.substring(local25 + 1, local25 + 4));
						if (local57 != -1) {
							arg1 = local57;
						}
						local25 += 4;
					} else {
						@Pc(69) char local69 = arg0.charAt(local25);
						if (local69 != ' ') {
							if (arg3) {
								this.method458(this.aByteArrayArray3[local69], arg2 + this.anIntArray216[local69] + 1, local23 + this.anIntArray217[local69] + 1, this.anIntArray214[local69], this.anIntArray215[local69], 0);
							}
							this.method458(this.aByteArrayArray3[local69], arg2 + this.anIntArray216[local69], local23 + this.anIntArray217[local69], this.anIntArray214[local69], this.anIntArray215[local69], arg1);
						}
						arg2 += this.anIntArray218[local69];
					}
				}
				if (this.aBoolean181) {
					Class1_Sub1_Sub2.method442(local23 + (int) ((double) this.anInt711 * 0.7D), local15, 8388608, arg2 - local15);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("5444, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;IBZ)V")
	public void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(28) int local28 = 15 - this.anInt711;
				for (@Pc(30) int local30 = 0; local30 < arg3.length(); local30++) {
					if (arg3.charAt(local30) == '@' && local30 + 4 < arg3.length() && arg3.charAt(local30 + 4) == '@') {
						@Pc(62) int local62 = this.method457(arg3.substring(local30 + 1, local30 + 4));
						if (local62 != -1) {
							arg1 = local62;
						}
						local30 += 4;
					} else {
						@Pc(74) char local74 = arg3.charAt(local30);
						if (local74 != ' ') {
							this.method460(this.anIntArray214[local74], arg4 + this.anIntArray216[local74] + 1, 192, 0, local28 + this.anIntArray217[local74] + 1, this.anIntArray215[local74], this.aByteArrayArray3[local74], (byte) 6);
							this.method460(this.anIntArray214[local74], arg4 + this.anIntArray216[local74], local17, arg1, local28 + this.anIntArray217[local74], this.anIntArray215[local74], this.aByteArrayArray3[local74], (byte) 6);
						}
						arg4 += this.anIntArray218[local74];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("12261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 8 + ", " + true + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method457(@OriginalArg(0) String arg0) {
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
					this.aBoolean181 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean181 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("11015, " + arg0 + ", " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt695;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt695 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt697) {
			local20 = Class1_Sub1_Sub2.anInt697 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt697;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt695;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt698) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt698;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt699) {
			local20 = Class1_Sub1_Sub2.anInt699 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt699;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt700) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt700;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method459(Class1_Sub1_Sub2.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII[BB)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) byte arg7) {
		try {
			@Pc(5) int local5 = arg1 + arg4 * Class1_Sub1_Sub2.anInt695;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt695 - arg0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg4 < Class1_Sub1_Sub2.anInt697) {
				local20 = Class1_Sub1_Sub2.anInt697 - arg4;
				arg5 -= local20;
				arg4 = Class1_Sub1_Sub2.anInt697;
				local13 = local20 * arg0 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt695;
			}
			if (arg4 + arg5 >= Class1_Sub1_Sub2.anInt698) {
				arg5 -= arg4 + arg5 + 1 - Class1_Sub1_Sub2.anInt698;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt699) {
				local20 = Class1_Sub1_Sub2.anInt699 - arg1;
				arg0 -= local20;
				arg1 = Class1_Sub1_Sub2.anInt699;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg1 + arg0 >= Class1_Sub1_Sub2.anInt700) {
				local20 = arg1 + arg0 + 1 - Class1_Sub1_Sub2.anInt700;
				arg0 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg0 > 0 && arg5 > 0) {
				this.method461(local11, Class1_Sub1_Sub2.anIntArray213, arg2, arg5, arg0, local5, arg3, local9, arg6, local13);
				@Pc(130) boolean local130 = false;
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("9040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[IIIIIIII[BI)V")
	private void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg2 & 0xFF0000) >> 8;
			@Pc(30) int local30 = 256 - arg2;
			for (@Pc(33) int local33 = -arg3; local33 < 0; local33++) {
				for (@Pc(38) int local38 = -arg4; local38 < 0; local38++) {
					if (arg8[arg9++] == 0) {
						arg5++;
					} else {
						@Pc(49) int local49 = arg1[arg5];
						arg1[arg5++] = (((local49 & 0xFF00FF) * local30 & 0xFF00FF00) + ((local49 & 0xFF00) * local30 & 0xFF0000) >> 8) + local19;
					}
				}
				arg5 += arg7;
				arg9 += arg0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("58527, " + arg0 + ", " + arg1 + ", " + -487 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
