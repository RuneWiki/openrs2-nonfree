import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt729 = 315;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "B")
	private byte aByte32 = -59;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	private int anInt730 = 1742;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	private int anInt731 = 1;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ZZLjava/lang/String;Lclient!xb;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class47 arg3) {
		try {
			@Pc(66) Class1_Sub1_Sub3 local66 = new Class1_Sub1_Sub3(-49365, arg3.method666(arg2 + ".dat", null));
			@Pc(90) Class1_Sub1_Sub3 local90 = new Class1_Sub1_Sub3(-49365, arg3.method666("index.dat", null));
			local90.anInt763 = local66.method482() + 4;
			@Pc(101) int local101 = local90.method480();
			if (local101 > 0) {
				local90.anInt763 += (local101 - 1) * 3;
			}
			for (@Pc(115) int local115 = 0; local115 < 256; local115++) {
				this.anIntArray216[local115] = local90.method480();
				this.anIntArray217[local115] = local90.method480();
				@Pc(139) int local139 = this.anIntArray214[local115] = local90.method482();
				@Pc(147) int local147 = this.anIntArray215[local115] = local90.method482();
				@Pc(150) int local150 = local90.method480();
				@Pc(154) int local154 = local139 * local147;
				this.aByteArrayArray3[local115] = new byte[local154];
				@Pc(164) int local164;
				@Pc(189) int local189;
				if (local150 == 0) {
					for (local164 = 0; local164 < local154; local164++) {
						this.aByteArrayArray3[local115][local164] = local66.method481();
					}
				} else if (local150 == 1) {
					for (local164 = 0; local164 < local139; local164++) {
						for (local189 = 0; local189 < local147; local189++) {
							this.aByteArrayArray3[local115][local164 + local189 * local139] = local66.method481();
						}
					}
				}
				if (local147 > this.anInt732 && local115 < 128) {
					this.anInt732 = local147;
				}
				this.anIntArray216[local115] = 1;
				this.anIntArray218[local115] = local139 + 2;
				local164 = 0;
				for (local189 = local147 / 7; local189 < local147; local189++) {
					local164 += this.aByteArrayArray3[local115][local189 * local139];
				}
				@Pc(266) int local266;
				if (local164 <= local147 / 7) {
					local266 = this.anIntArray218[local115]--;
					this.anIntArray216[local115] = 0;
				}
				local164 = 0;
				for (@Pc(280) int local280 = local147 / 7; local280 < local147; local280++) {
					local164 += this.aByteArrayArray3[local115][local139 + local280 * local139 - 1];
				}
				if (local164 <= local147 / 7) {
					local266 = this.anIntArray218[local115]--;
				}
			}
			if (arg0) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("12052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;B)V")
	public void method446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) byte arg3) {
		try {
			@Pc(4) boolean local4 = false;
			this.method451(arg1, arg2, arg0, 507 - this.method450(arg2));
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("42555, " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg3, arg0, arg1, arg2 - this.method450(arg0) / 2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("85876, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBILjava/lang/String;IZ)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		try {
			this.method455(arg3, arg4, arg0, arg5, arg2 - this.method449(arg3) / 2);
			@Pc(19) boolean local19 = false;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("16266, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method449(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				if (arg0.charAt(local15) == '@' && local15 + 4 < arg0.length() && arg0.charAt(local15 + 4) == '@') {
					local15 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local15)];
				}
			}
			return local7;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("35673, " + arg0 + ", " + 86 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method450(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local5 += this.anIntArray218[arg0.charAt(local18)];
			}
			return local5;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("94449, " + arg0 + ", " + -73 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg0 - this.anInt732;
				for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
					@Pc(28) char local28 = arg1.charAt(local22);
					if (local28 != ' ') {
						this.method458(this.aByteArrayArray3[local28], arg3 + this.anIntArray216[local28], local9 + this.anIntArray217[local28], this.anIntArray214[local28], this.anIntArray215[local28], arg2);
					}
					arg3 += this.anIntArray218[local28];
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("6865, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -56 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public void method452(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method450(arg0) / 2;
				@Pc(16) int local16 = arg1 - this.anInt732;
				for (@Pc(28) int local28 = 0; local28 < arg0.length(); local28++) {
					@Pc(34) char local34 = arg0.charAt(local28);
					if (local34 != ' ') {
						this.method458(this.aByteArrayArray3[local34], arg2 + this.anIntArray216[local34], local16 + this.anIntArray217[local34] + (int) (Math.sin((double) local28 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local34], this.anIntArray215[local34], arg4);
					}
					arg2 += this.anIntArray218[local34];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("72296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method453(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg4 -= this.method450(arg0) / 2;
				@Pc(16) int local16 = arg3 - this.anInt732;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method458(this.aByteArrayArray3[local24], arg4 + this.anIntArray216[local24] + (int) (Math.sin((double) local18 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local16 + this.anIntArray217[local24] + (int) (Math.sin((double) local18 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray214[local24], this.anIntArray215[local24], arg1);
					}
					arg4 += this.anIntArray218[local24];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("76075, " + 39024 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZILjava/lang/String;III)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(20) double local20 = 7.0D - (double) arg5 / 8.0D;
				if (local20 < 0.0D) {
					local20 = 0.0D;
				}
				arg1 -= this.method450(arg2) / 2;
				@Pc(40) int local40 = arg3 - this.anInt732;
				for (@Pc(42) int local42 = 0; local42 < arg2.length(); local42++) {
					@Pc(48) char local48 = arg2.charAt(local42);
					if (local48 != ' ') {
						this.method458(this.aByteArrayArray3[local48], arg1 + this.anIntArray216[local48], local40 + this.anIntArray217[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg4) * local20), this.anIntArray214[local48], this.anIntArray215[local48], arg0);
					}
					arg1 += this.anIntArray218[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("74597, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;BIIZI)V")
	public void method455(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean189 = false;
			@Pc(6) int local6 = arg4;
			if (arg0 != null) {
				@Pc(14) int local14 = arg2 - this.anInt732;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method457(arg0.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg1 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg0.charAt(local16);
						if (local60 != ' ') {
							if (arg3) {
								this.method458(this.aByteArrayArray3[local60], arg4 + this.anIntArray216[local60] + 1, local14 + this.anIntArray217[local60] + 1, this.anIntArray214[local60], this.anIntArray215[local60], 0);
							}
							this.method458(this.aByteArrayArray3[local60], arg4 + this.anIntArray216[local60], local14 + this.anIntArray217[local60], this.anIntArray214[local60], this.anIntArray215[local60], arg1);
						}
						arg4 += this.anIntArray218[local60];
					}
				}
				if (this.aBoolean189) {
					Class1_Sub1_Sub2.method442(arg4 - local6, 8388608, local14 + (int) ((double) this.anInt732 * 0.7D), local6);
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("85879, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IBIZII)V")
	public void method456(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg1);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt732;
				for (@Pc(34) int local34 = 0; local34 < arg0.length(); local34++) {
					if (arg0.charAt(local34) == '@' && local34 + 4 < arg0.length() && arg0.charAt(local34 + 4) == '@') {
						@Pc(66) int local66 = this.method457(arg0.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg3 = local66;
						}
						local34 += 4;
					} else {
						@Pc(78) char local78 = arg0.charAt(local34);
						if (local78 != ' ') {
							this.method460(this.anIntArray215[local78], 192, local22 + this.anIntArray217[local78] + 1, this.anIntArray214[local78], this.aByteArrayArray3[local78], arg4 + this.anIntArray216[local78] + 1, 0);
							this.method460(this.anIntArray215[local78], local17, local22 + this.anIntArray217[local78], this.anIntArray214[local78], this.aByteArrayArray3[local78], arg4 + this.anIntArray216[local78], arg3);
						}
						arg4 += this.anIntArray218[local78];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("38634, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Ljava/lang/String;B)I")
	private int method457(@OriginalArg(0) String arg0) {
		try {
			if (this.aByte32 != -59) {
				this.anInt729 = -255;
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
					this.aBoolean189 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean189 = false;
				}
				return -1;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("18359, " + arg0 + ", " + -59 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt719;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt719 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt721) {
			local20 = Class1_Sub1_Sub2.anInt721 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt721;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt719;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt722) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt722;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt723) {
			local20 = Class1_Sub1_Sub2.anInt723 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt723;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt724) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt724;
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII[BIII)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg5 + arg2 * Class1_Sub1_Sub2.anInt719;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt719 - arg3;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg2 < Class1_Sub1_Sub2.anInt721) {
				local20 = Class1_Sub1_Sub2.anInt721 - arg2;
				arg0 -= local20;
				arg2 = Class1_Sub1_Sub2.anInt721;
				local13 = local20 * arg3 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg2 + arg0 >= Class1_Sub1_Sub2.anInt722) {
				arg0 -= arg2 + arg0 + 1 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg5 < Class1_Sub1_Sub2.anInt723) {
				local20 = Class1_Sub1_Sub2.anInt723 - arg5;
				arg3 -= local20;
				arg5 = Class1_Sub1_Sub2.anInt723;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg5 + arg3 >= Class1_Sub1_Sub2.anInt724) {
				local20 = arg5 + arg3 + 1 - Class1_Sub1_Sub2.anInt724;
				arg3 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg3 > 0 && arg0 > 0) {
				this.method461(Class1_Sub1_Sub2.anIntArray213, local11, local5, local13, arg1, arg0, arg3, arg4, arg6, local9);
				if (this.anInt730 == 1742) {
					;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("22599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 1742 + ", " + arg6 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIIIIII[BII)V")
	private void method461(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(29) int local29 = ((arg8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg4;
			for (@Pc(36) int local36 = -arg5; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg6; local41 < 0; local41++) {
					if (arg7[arg3++] == 0) {
						arg2++;
					} else {
						@Pc(52) int local52 = arg0[arg2];
						arg0[arg2++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local29;
					}
				}
				arg2 += arg9;
				arg3 += arg1;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("24644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -45169 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
