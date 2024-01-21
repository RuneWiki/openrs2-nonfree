import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	private int anInt706 = 5706;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Z")
	private boolean aBoolean177 = false;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt707 = 8;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt708 = -714;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "B")
	private byte aByte26 = 7;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "B")
	private byte aByte27 = 7;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!xb;ZLjava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(72) Class1_Sub1_Sub3 local72 = new Class1_Sub1_Sub3(arg0.method666(arg2 + ".dat", null), 58);
			@Pc(81) Class1_Sub1_Sub3 local81 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), 58);
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
				if (local138 > this.anInt710 && local106 < 128) {
					this.anInt710 = local138;
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
			if (arg1) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(344) RuntimeException local344) {
			signlink.reporterror("16055, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local344.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method451(arg2, arg1, arg0, 507 - this.method450(arg2));
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("49019, " + arg0 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.method451(arg0, arg3, arg2, arg4 - this.method450(arg0) / 2);
			if (arg1 != this.anInt707) {
				this.aBoolean177 = !this.aBoolean177;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("51132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;BIZ)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method455(arg0 - this.method449((byte) 5, arg2) / 2, arg1, arg2, arg4, arg3);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("3301, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 114 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method449(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
				if (arg1.charAt(local9) == '@' && local9 + 4 < arg1.length() && arg1.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray218[arg1.charAt(local9)];
				}
			}
			@Pc(51) boolean local51 = false;
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("10287, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method450(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(11) int local11 = 0;
			for (@Pc(13) int local13 = 0; local13 < arg0.length(); local13++) {
				local11 += this.anIntArray218[arg0.charAt(local13)];
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("66138, " + -47 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public void method451(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg2 - this.anInt710;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					@Pc(22) char local22 = arg0.charAt(local16);
					if (local22 != ' ') {
						this.method458(this.aByteArrayArray3[local22], arg3 + this.anIntArray216[local22], local7 + this.anIntArray217[local22], this.anIntArray214[local22], this.anIntArray215[local22], arg1);
					}
					arg3 += this.anIntArray218[local22];
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("20344, " + arg0 + ", " + 1 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIIB)V")
	public void method452(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method450(arg0) / 2;
				@Pc(18) int local18 = arg4 - this.anInt710;
				for (@Pc(29) int local29 = 0; local29 < arg0.length(); local29++) {
					@Pc(35) char local35 = arg0.charAt(local29);
					if (local35 != ' ') {
						this.method458(this.aByteArrayArray3[local35], arg2 + this.anIntArray216[local35], local18 + this.anIntArray217[local35] + (int) (Math.sin((double) local29 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local35], this.anIntArray215[local35], arg1);
					}
					arg2 += this.anIntArray218[local35];
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("84692, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IZII)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg4 -= this.method450(arg1) / 2;
				@Pc(16) int local16 = arg3 - this.anInt710;
				for (@Pc(21) int local21 = 0; local21 < arg1.length(); local21++) {
					@Pc(27) char local27 = arg1.charAt(local21);
					if (local27 != ' ') {
						this.method458(this.aByteArrayArray3[local27], arg4 + this.anIntArray216[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local16 + this.anIntArray217[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray214[local27], this.anIntArray215[local27], arg2);
					}
					arg4 += this.anIntArray218[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("18040, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg2 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg1 -= this.method450(arg5) / 2;
				@Pc(29) int local29 = arg0 - this.anInt710;
				for (@Pc(31) int local31 = 0; local31 < arg5.length(); local31++) {
					@Pc(37) char local37 = arg5.charAt(local31);
					if (local37 != ' ') {
						this.method458(this.aByteArrayArray3[local37], arg1 + this.anIntArray216[local37], local29 + this.anIntArray217[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg6) * local9), this.anIntArray214[local37], this.anIntArray215[local37], arg4);
					}
					arg1 += this.anIntArray218[local37];
				}
				if (arg3 < 0) {
					;
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("85313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;ZBI)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean179 = false;
			@Pc(10) int local10 = arg0;
			if (arg2 != null) {
				@Pc(18) int local18 = arg4 - this.anInt710;
				for (@Pc(20) int local20 = 0; local20 < arg2.length(); local20++) {
					if (arg2.charAt(local20) == '@' && local20 + 4 < arg2.length() && arg2.charAt(local20 + 4) == '@') {
						@Pc(53) int local53 = this.method457(this.aByte26, arg2.substring(local20 + 1, local20 + 4));
						if (local53 != -1) {
							arg1 = local53;
						}
						local20 += 4;
					} else {
						@Pc(65) char local65 = arg2.charAt(local20);
						if (local65 != ' ') {
							if (arg3) {
								this.method458(this.aByteArrayArray3[local65], arg0 + this.anIntArray216[local65] + 1, local18 + this.anIntArray217[local65] + 1, this.anIntArray214[local65], this.anIntArray215[local65], 0);
							}
							this.method458(this.aByteArrayArray3[local65], arg0 + this.anIntArray216[local65], local18 + this.anIntArray217[local65], this.anIntArray214[local65], this.anIntArray215[local65], arg1);
						}
						arg0 += this.anIntArray218[local65];
					}
				}
				if (this.aBoolean179) {
					Class1_Sub1_Sub2.method442(8388608, arg0 - local10, local10, local18 + (int) ((double) this.anInt710 * 0.7D));
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("96153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -108 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIILjava/lang/String;IZI)V")
	public void method456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt710;
				for (@Pc(27) int local27 = 0; local27 < arg2.length(); local27++) {
					if (arg2.charAt(local27) == '@' && local27 + 4 < arg2.length() && arg2.charAt(local27 + 4) == '@') {
						@Pc(60) int local60 = this.method457(this.aByte26, arg2.substring(local27 + 1, local27 + 4));
						if (local60 != -1) {
							arg1 = local60;
						}
						local27 += 4;
					} else {
						@Pc(72) char local72 = arg2.charAt(local27);
						if (local72 != ' ') {
							this.method460(192, this.anIntArray215[local72], 0, local25 + this.anIntArray217[local72] + 1, this.aByteArrayArray3[local72], arg4 + this.anIntArray216[local72] + 1, this.anIntArray214[local72]);
							this.method460(local20, this.anIntArray215[local72], arg1, local25 + this.anIntArray217[local72], this.aByteArrayArray3[local72], arg4 + this.anIntArray216[local72], this.anIntArray214[local72]);
						}
						arg4 += this.anIntArray218[local72];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("74346, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(BLjava/lang/String;)I")
	private int method457(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 != this.aByte27) {
				return this.anInt708;
			}
			@Pc(5) boolean local5 = false;
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
					this.aBoolean179 = true;
				}
				if (arg1.equals("end")) {
					this.aBoolean179 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("30843, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt696;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt696 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt698) {
			local20 = Class1_Sub1_Sub2.anInt698 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt698;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt696;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt699) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt699;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt700) {
			local20 = Class1_Sub1_Sub2.anInt700 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt700;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt701) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt701;
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIB[BII)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg5 + arg3 * Class1_Sub1_Sub2.anInt696;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt696 - arg6;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(34) int local34;
			if (arg3 < Class1_Sub1_Sub2.anInt698) {
				local34 = Class1_Sub1_Sub2.anInt698 - arg3;
				arg1 -= local34;
				arg3 = Class1_Sub1_Sub2.anInt698;
				local13 = local34 * arg6 + 0;
				local5 += local34 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg3 + arg1 >= Class1_Sub1_Sub2.anInt699) {
				arg1 -= arg3 + arg1 + 1 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg5 < Class1_Sub1_Sub2.anInt700) {
				local34 = Class1_Sub1_Sub2.anInt700 - arg5;
				arg6 -= local34;
				arg5 = Class1_Sub1_Sub2.anInt700;
				local13 += local34;
				local5 += local34;
				local11 = local34 + 0;
				local9 += local34;
			}
			if (arg5 + arg6 >= Class1_Sub1_Sub2.anInt701) {
				local34 = arg5 + arg6 + 1 - Class1_Sub1_Sub2.anInt701;
				arg6 -= local34;
				local11 += local34;
				local9 += local34;
			}
			if (arg6 > 0 && arg1 > 0) {
				this.method461(arg6, arg4, arg1, local11, Class1_Sub1_Sub2.anIntArray213, arg2, local13, arg0, local5, local9);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("71387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII[IIIIZII)V")
	private void method461(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg5 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg7;
			for (@Pc(26) int local26 = -arg2; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg0; local31 < 0; local31++) {
					if (arg1[arg6++] == 0) {
						arg8++;
					} else {
						@Pc(42) int local42 = arg4[arg8];
						arg4[arg8++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg8 += arg9;
				arg6 += arg3;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("60044, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + true + ", " + arg8 + ", " + arg9 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
