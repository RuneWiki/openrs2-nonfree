import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt722 = -843;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt723 = 9;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray216 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray217 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	private int[] anIntArray218 = new int[256];

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILjava/lang/String;Lclient!xb;Z)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(63) Class1_Sub1_Sub3 local63 = new Class1_Sub1_Sub3(false, arg2.method666(arg1 + ".dat", null));
			@Pc(72) Class1_Sub1_Sub3 local72 = new Class1_Sub1_Sub3(false, arg2.method666("index.dat", null));
			local72.anInt757 = local63.method482() + 4;
			@Pc(83) int local83 = local72.method480();
			if (arg0 != 24133) {
				throw new NullPointerException();
			}
			if (local83 > 0) {
				local72.anInt757 += (local83 - 1) * 3;
			}
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				this.anIntArray216[local104] = local72.method480();
				this.anIntArray217[local104] = local72.method480();
				@Pc(128) int local128 = this.anIntArray214[local104] = local72.method482();
				@Pc(136) int local136 = this.anIntArray215[local104] = local72.method482();
				@Pc(139) int local139 = local72.method480();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray3[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray3[local104][local153] = local63.method481();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray3[local104][local153 + local178 * local128] = local63.method481();
						}
					}
				}
				if (local136 > this.anInt724 && local104 < 128) {
					this.anInt724 = local136;
				}
				this.anIntArray216[local104] = 1;
				this.anIntArray218[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray3[local104][local178 * local128];
				}
				@Pc(255) int local255;
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray218[local104]--;
					this.anIntArray216[local104] = 0;
				}
				local153 = 0;
				for (@Pc(269) int local269 = local136 / 7; local269 < local136; local269++) {
					local153 += this.aByteArrayArray3[local104][local128 + local269 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray218[local104]--;
				}
			}
			if (arg3) {
				this.anIntArray218[32] = this.anIntArray218[73];
			} else {
				this.anIntArray218[32] = this.anIntArray218[105];
			}
		} catch (@Pc(333) RuntimeException local333) {
			signlink.reporterror("89452, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local333.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
	public void method446(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method451(507 - this.method450(arg0), arg0, arg2, arg1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83118, " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZILjava/lang/String;)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method451(arg2 - this.method450(arg3) / 2, arg3, arg0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("19211, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZIZLjava/lang/String;)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) String arg5) {
		try {
			this.method455(arg5, arg3 - this.method449(arg5) / 2, arg2, 654, arg0, arg1);
			if (arg4) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("76502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method449(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local7 += this.anIntArray218[arg0.charAt(local19)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("26305, " + arg0 + ", " + -25271 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method450(@OriginalArg(1) String arg0) {
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
			signlink.reporterror("16056, " + -3 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(17) int local17 = arg3 - this.anInt724;
				for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
					@Pc(25) char local25 = arg1.charAt(local19);
					if (local25 != ' ') {
						this.method458(this.aByteArrayArray3[local25], arg0 + this.anIntArray216[local25], local17 + this.anIntArray217[local25], this.anIntArray214[local25], this.anIntArray215[local25], arg2);
					}
					arg0 += this.anIntArray218[local25];
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("79463, " + arg0 + ", " + arg1 + ", " + -830 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public void method452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != null) {
				arg4 -= this.method450(arg2) / 2;
				@Pc(16) int local16 = arg3 - this.anInt724;
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
					@Pc(28) char local28 = arg2.charAt(local22);
					if (local28 != ' ') {
						this.method458(this.aByteArrayArray3[local28], arg4 + this.anIntArray216[local28], local16 + this.anIntArray217[local28] + (int) (Math.sin((double) local22 / 2.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray214[local28], this.anIntArray215[local28], arg1);
					}
					arg4 += this.anIntArray218[local28];
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("78231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method450(arg3) / 2;
				@Pc(21) int local21 = arg0 - this.anInt724;
				for (@Pc(23) int local23 = 0; local23 < arg3.length(); local23++) {
					@Pc(29) char local29 = arg3.charAt(local23);
					if (local29 != ' ') {
						this.method458(this.aByteArrayArray3[local29], arg2 + this.anIntArray216[local29] + (int) (Math.sin((double) local23 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local21 + this.anIntArray217[local29] + (int) (Math.sin((double) local23 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray214[local29], this.anIntArray215[local29], arg1);
					}
					arg2 += this.anIntArray218[local29];
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("16321, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg0 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg2 -= this.method450(arg4) / 2;
				@Pc(29) int local29 = arg1 - this.anInt724;
				for (@Pc(31) int local31 = 0; local31 < arg4.length(); local31++) {
					@Pc(37) char local37 = arg4.charAt(local31);
					if (local37 != ' ') {
						this.method458(this.aByteArrayArray3[local37], arg2 + this.anIntArray216[local37], local29 + this.anIntArray217[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg3) * local9), this.anIntArray214[local37], this.anIntArray215[local37], arg5);
					}
					arg2 += this.anIntArray218[local37];
				}
				@Pc(95) boolean local95 = false;
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("71012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public void method455(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(5) boolean local5 = false;
			this.aBoolean176 = false;
			@Pc(10) int local10 = arg1;
			if (arg0 != null) {
				@Pc(18) int local18 = arg4 - this.anInt724;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					if (arg0.charAt(local20) == '@' && local20 + 4 < arg0.length() && arg0.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method457(arg0.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg5 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg0.charAt(local20);
						if (local64 != ' ') {
							if (arg2) {
								this.method458(this.aByteArrayArray3[local64], arg1 + this.anIntArray216[local64] + 1, local18 + this.anIntArray217[local64] + 1, this.anIntArray214[local64], this.anIntArray215[local64], 0);
							}
							this.method458(this.aByteArrayArray3[local64], arg1 + this.anIntArray216[local64], local18 + this.anIntArray217[local64], this.anIntArray214[local64], this.anIntArray215[local64], arg5);
						}
						arg1 += this.anIntArray218[local64];
					}
				}
				if (this.aBoolean176) {
					Class1_Sub1_Sub2.method442(local18 + (int) ((double) this.anInt724 * 0.7D), arg1 - local10, local10, 8388608);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("96251, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;ZI)V")
	public void method456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt724;
				for (@Pc(24) int local24 = 0; local24 < arg3.length(); local24++) {
					if (arg3.charAt(local24) == '@' && local24 + 4 < arg3.length() && arg3.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method457(arg3.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg1 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg3.charAt(local24);
						if (local68 != ' ') {
							this.method460(this.anIntArray214[local68], this.aByteArrayArray3[local68], 0, arg4 + this.anIntArray216[local68] + 1, this.anIntArray215[local68], 192, local22 + this.anIntArray217[local68] + 1);
							this.method460(this.anIntArray214[local68], this.aByteArrayArray3[local68], arg1, arg4 + this.anIntArray216[local68], this.anIntArray215[local68], local17, local22 + this.anIntArray217[local68]);
						}
						arg4 += this.anIntArray218[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("73021, " + 33217 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;B)I")
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
					this.aBoolean176 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean176 = false;
				}
				return -1;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("77526, " + arg0 + ", " + -74 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method458(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt712;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt712 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt714) {
			local20 = Class1_Sub1_Sub2.anInt714 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt714;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt712;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt715) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt715;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt716) {
			local20 = Class1_Sub1_Sub2.anInt716 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt716;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt717) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt717;
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIIIIBI)V")
	private void method460(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg6 * Class1_Sub1_Sub2.anInt712;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt712 - arg0;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(23) int local23;
			if (arg6 < Class1_Sub1_Sub2.anInt714) {
				local23 = Class1_Sub1_Sub2.anInt714 - arg6;
				arg4 -= local23;
				arg6 = Class1_Sub1_Sub2.anInt714;
				local13 = local23 * arg0 + 0;
				local5 += local23 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg6 + arg4 >= Class1_Sub1_Sub2.anInt715) {
				arg4 -= arg6 + arg4 + 1 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg3 < Class1_Sub1_Sub2.anInt716) {
				local23 = Class1_Sub1_Sub2.anInt716 - arg3;
				arg0 -= local23;
				arg3 = Class1_Sub1_Sub2.anInt716;
				local13 += local23;
				local5 += local23;
				local11 = local23 + 0;
				local9 += local23;
			}
			if (arg3 + arg0 >= Class1_Sub1_Sub2.anInt717) {
				local23 = arg3 + arg0 + 1 - Class1_Sub1_Sub2.anInt717;
				arg0 -= local23;
				local11 += local23;
				local9 += local23;
			}
			if (arg0 > 0 && arg4 > 0) {
				this.method461(arg5, local9, arg4, arg0, Class1_Sub1_Sub2.anIntArray213, arg2, local11, local5, arg1, local13);
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("57571, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIII[IIII[BI)V")
	private void method461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg5 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg0 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg0;
			for (@Pc(36) int local36 = -arg2; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg3; local41 < 0; local41++) {
					if (arg8[arg9++] == 0) {
						arg7++;
					} else {
						@Pc(52) int local52 = arg4[arg7];
						arg4[arg7++] = (((local52 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local52 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg7 += arg1;
				arg9 += arg6;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("60439, " + 84 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
