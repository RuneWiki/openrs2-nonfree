import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XZMPLIVN")
public final class Class1_Sub2_Sub1_Sub4 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!XZMPLIVN", name = "x", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!XZMPLIVN", name = "y", descriptor = "I")
	private int anInt719 = 111;

	@OriginalMember(owner = "client!XZMPLIVN", name = "z", descriptor = "I")
	private int anInt720 = -413;

	@OriginalMember(owner = "client!XZMPLIVN", name = "A", descriptor = "I")
	private int anInt721 = -953;

	@OriginalMember(owner = "client!XZMPLIVN", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!XZMPLIVN", name = "C", descriptor = "[I")
	private int[] anIntArray199 = new int[256];

	@OriginalMember(owner = "client!XZMPLIVN", name = "D", descriptor = "[I")
	private int[] anIntArray200 = new int[256];

	@OriginalMember(owner = "client!XZMPLIVN", name = "E", descriptor = "[I")
	private int[] anIntArray201 = new int[256];

	@OriginalMember(owner = "client!XZMPLIVN", name = "F", descriptor = "[I")
	private int[] anIntArray202 = new int[256];

	@OriginalMember(owner = "client!XZMPLIVN", name = "G", descriptor = "[I")
	private int[] anIntArray203 = new int[256];

	@OriginalMember(owner = "client!XZMPLIVN", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!XZMPLIVN", name = "J", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!XZMPLIVN", name = "H", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!XZMPLIVN", name = "<init>", descriptor = "(Lclient!NXFIIFAD;ZILjava/lang/String;)V")
	public Class1_Sub2_Sub1_Sub4(@OriginalArg(0) Class31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			@Pc(63) Class1_Sub2_Sub3 local63 = new Class1_Sub2_Sub3(arg0.method352(arg3 + ".dat", null), -670);
			@Pc(72) Class1_Sub2_Sub3 local72 = new Class1_Sub2_Sub3(arg0.method352("index.dat", null), -670);
			local72.anInt474 = local63.method309() + 4;
			@Pc(84) int local84 = 24 / arg2;
			@Pc(87) int local87 = local72.method307();
			if (local87 > 0) {
				local72.anInt474 += (local87 - 1) * 3;
			}
			for (@Pc(101) int local101 = 0; local101 < 256; local101++) {
				this.anIntArray201[local101] = local72.method307();
				this.anIntArray202[local101] = local72.method307();
				@Pc(125) int local125 = this.anIntArray199[local101] = local72.method309();
				@Pc(133) int local133 = this.anIntArray200[local101] = local72.method309();
				@Pc(136) int local136 = local72.method307();
				@Pc(140) int local140 = local125 * local133;
				this.aByteArrayArray4[local101] = new byte[local140];
				@Pc(150) int local150;
				@Pc(175) int local175;
				if (local136 == 0) {
					for (local150 = 0; local150 < local140; local150++) {
						this.aByteArrayArray4[local101][local150] = local63.method308();
					}
				} else if (local136 == 1) {
					for (local150 = 0; local150 < local125; local150++) {
						for (local175 = 0; local175 < local133; local175++) {
							this.aByteArrayArray4[local101][local150 + local175 * local125] = local63.method308();
						}
					}
				}
				if (local133 > this.anInt722 && local101 < 128) {
					this.anInt722 = local133;
				}
				this.anIntArray201[local101] = 1;
				this.anIntArray203[local101] = local125 + 2;
				local150 = 0;
				for (local175 = local133 / 7; local175 < local133; local175++) {
					local150 += this.aByteArrayArray4[local101][local175 * local125];
				}
				@Pc(252) int local252;
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray203[local101]--;
					this.anIntArray201[local101] = 0;
				}
				local150 = 0;
				for (@Pc(266) int local266 = local133 / 7; local266 < local133; local266++) {
					local150 += this.aByteArrayArray4[local101][local125 + local266 * local125 - 1];
				}
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray203[local101]--;
				}
			}
			if (arg1) {
				this.anIntArray203[32] = this.anIntArray203[73];
			} else {
				this.anIntArray203[32] = this.anIntArray203[105];
			}
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("19173, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method542(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2) {
		try {
			this.method547(arg2, arg1, 507 - this.method546(arg1), arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("56221, " + 6 + ", " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method547(arg0, arg3, arg2 - this.method546(arg3) / 2, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("24884, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IZIBILjava/lang/String;)V")
	public void method544(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method551(arg0, arg3 - this.method545(arg4) / 2, arg1, arg2, arg4);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("26117, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method545(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local17 += this.anIntArray203[arg0.charAt(local19)];
				}
			}
			return local17;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("3036, " + arg0 + ", " + -24375 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method546(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local5 += this.anIntArray203[arg0.charAt(local12)];
			}
			return local5;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("139, " + arg0 + ", " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method547(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(12) int local12 = arg3 - this.anInt722;
				for (@Pc(14) int local14 = 0; local14 < arg1.length(); local14++) {
					@Pc(20) char local20 = arg1.charAt(local14);
					if (local20 != ' ') {
						this.method554(this.aByteArrayArray4[local20], arg2 + this.anIntArray201[local20], local12 + this.anIntArray202[local20], this.anIntArray199[local20], this.anIntArray200[local20], arg0);
					}
					arg2 += this.anIntArray203[local20];
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("86181, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -312 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method548(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 != null) {
				arg0 -= this.method546(arg1) / 2;
				@Pc(16) int local16 = arg5 - this.anInt722;
				for (@Pc(18) int local18 = 0; local18 < arg1.length(); local18++) {
					@Pc(24) char local24 = arg1.charAt(local18);
					if (local24 != ' ') {
						this.method554(this.aByteArrayArray4[local24], arg0 + this.anIntArray201[local24], local16 + this.anIntArray202[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray199[local24], this.anIntArray200[local24], arg2);
					}
					arg0 += this.anIntArray203[local24];
				}
				@Pc(84) boolean local84 = true;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50673, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIZIILjava/lang/String;)V")
	public void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method546(arg4) / 2;
				@Pc(19) int local19 = arg3 - this.anInt722;
				for (@Pc(21) int local21 = 0; local21 < arg4.length(); local21++) {
					@Pc(27) char local27 = arg4.charAt(local21);
					if (local27 != ' ') {
						this.method554(this.aByteArrayArray4[local27], arg1 + this.anIntArray201[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local19 + this.anIntArray202[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray199[local27], this.anIntArray200[local27], arg2);
					}
					arg1 += this.anIntArray203[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("79403, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIZIIILjava/lang/String;)V")
	public void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		try {
			if (arg6 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg1 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg4 -= this.method546(arg6) / 2;
				@Pc(29) int local29 = arg3 - this.anInt722;
				for (@Pc(31) int local31 = 0; local31 < arg6.length(); local31++) {
					@Pc(37) char local37 = arg6.charAt(local31);
					if (local37 != ' ') {
						this.method554(this.aByteArrayArray4[local37], arg4 + this.anIntArray201[local37], local29 + this.anIntArray202[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg5) * local9), this.anIntArray199[local37], this.anIntArray200[local37], arg0);
					}
					arg4 += this.anIntArray203[local37];
				}
				if (arg2) {
					this.anInt721 = 60;
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("38754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(BIIZILjava/lang/String;)V")
	public void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean171 = false;
			@Pc(6) int local6 = arg1;
			if (arg4 != null) {
				@Pc(14) int local14 = arg3 - this.anInt722;
				for (@Pc(16) int local16 = 0; local16 < arg4.length(); local16++) {
					if (arg4.charAt(local16) == '@' && local16 + 4 < arg4.length() && arg4.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method553(arg4.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg0 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg4.charAt(local16);
						if (local60 != ' ') {
							if (arg2) {
								this.method554(this.aByteArrayArray4[local60], arg1 + this.anIntArray201[local60] + 1, local14 + this.anIntArray202[local60] + 1, this.anIntArray199[local60], this.anIntArray200[local60], 0);
							}
							this.method554(this.aByteArrayArray4[local60], arg1 + this.anIntArray201[local60], local14 + this.anIntArray202[local60], this.anIntArray199[local60], this.anIntArray200[local60], arg0);
						}
						arg1 += this.anIntArray203[local60];
					}
				}
				if (this.aBoolean171) {
					Class1_Sub2_Sub1.method538(local6, 8388608, arg1 - local6, local14 + (int) ((double) this.anInt722 * 0.7D));
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("56784, " + 104 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(ZIILjava/lang/String;III)V")
	public void method552(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(35) int local35 = 15 - this.anInt722;
				for (@Pc(37) int local37 = 0; local37 < arg1.length(); local37++) {
					if (arg1.charAt(local37) == '@' && local37 + 4 < arg1.length() && arg1.charAt(local37 + 4) == '@') {
						@Pc(69) int local69 = this.method553(arg1.substring(local37 + 1, local37 + 4));
						if (local69 != -1) {
							arg2 = local69;
						}
						local37 += 4;
					} else {
						@Pc(81) char local81 = arg1.charAt(local37);
						if (local81 != ' ') {
							this.method556(0, this.anIntArray200[local81], local35 + this.anIntArray202[local81] + 1, this.anIntArray199[local81], arg0 + this.anIntArray201[local81] + 1, this.aByteArrayArray4[local81], this.anInt720, 192);
							this.method556(arg2, this.anIntArray200[local81], local35 + this.anIntArray202[local81], this.anIntArray199[local81], arg0 + this.anIntArray201[local81], this.aByteArrayArray4[local81], this.anInt720, local17);
						}
						arg0 += this.anIntArray203[local81];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(171) RuntimeException local171) {
			signlink.reporterror("35250, " + true + ", " + arg0 + ", " + 8 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local171.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(BLjava/lang/String;)I")
	private int method553(@OriginalArg(1) String arg0) {
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
					this.aBoolean171 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean171 = false;
				}
				return -1;
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("80102, " + 79 + ", " + arg0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "([BIIIII)V")
	private void method554(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub2_Sub1.anInt710;
		@Pc(9) int local9 = Class1_Sub2_Sub1.anInt710 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub2_Sub1.anInt712) {
			local20 = Class1_Sub2_Sub1.anInt712 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub2_Sub1.anInt712;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub2_Sub1.anInt710;
		}
		if (arg2 + arg4 >= Class1_Sub2_Sub1.anInt713) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub2_Sub1.anInt713;
		}
		if (arg1 < Class1_Sub2_Sub1.anInt714) {
			local20 = Class1_Sub2_Sub1.anInt714 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub2_Sub1.anInt714;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub2_Sub1.anInt715) {
			local20 = arg1 + arg3 + 1 - Class1_Sub2_Sub1.anInt715;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method555(Class1_Sub2_Sub1.anIntArray198, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIII[BII)V")
	private void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			while (arg6 >= 0) {
				this.anInt721 = -269;
			}
			@Pc(12) int local12 = arg4 + arg2 * Class1_Sub2_Sub1.anInt710;
			@Pc(16) int local16 = Class1_Sub2_Sub1.anInt710 - arg3;
			@Pc(18) int local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(27) int local27;
			if (arg2 < Class1_Sub2_Sub1.anInt712) {
				local27 = Class1_Sub2_Sub1.anInt712 - arg2;
				arg1 -= local27;
				arg2 = Class1_Sub2_Sub1.anInt712;
				local20 = local27 * arg3 + 0;
				local12 += local27 * Class1_Sub2_Sub1.anInt710;
			}
			if (arg2 + arg1 >= Class1_Sub2_Sub1.anInt713) {
				arg1 -= arg2 + arg1 + 1 - Class1_Sub2_Sub1.anInt713;
			}
			if (arg4 < Class1_Sub2_Sub1.anInt714) {
				local27 = Class1_Sub2_Sub1.anInt714 - arg4;
				arg3 -= local27;
				arg4 = Class1_Sub2_Sub1.anInt714;
				local20 += local27;
				local12 += local27;
				local18 = local27 + 0;
				local16 += local27;
			}
			if (arg4 + arg3 >= Class1_Sub2_Sub1.anInt715) {
				local27 = arg4 + arg3 + 1 - Class1_Sub2_Sub1.anInt715;
				arg3 -= local27;
				local18 += local27;
				local16 += local27;
			}
			if (arg3 > 0 && arg1 > 0) {
				this.method557(local12, arg1, arg3, arg0, arg7, (byte) 7, Class1_Sub2_Sub1.anIntArray198, arg5, local16, local18, local20);
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("55023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XZMPLIVN", name = "a", descriptor = "(IIIIIB[I[BIII)V")
	private void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(24) boolean local24 = false;
			@Pc(37) int local37 = 256 - arg4;
			for (@Pc(40) int local40 = -arg1; local40 < 0; local40++) {
				for (@Pc(45) int local45 = -arg2; local45 < 0; local45++) {
					if (arg7[arg10++] == 0) {
						arg0++;
					} else {
						@Pc(56) int local56 = arg6[arg0];
						arg6[arg0++] = (((local56 & 0xFF00FF) * local37 & 0xFF00FF00) + ((local56 & 0xFF00) * local37 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg8;
				arg10 += arg9;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("3571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
