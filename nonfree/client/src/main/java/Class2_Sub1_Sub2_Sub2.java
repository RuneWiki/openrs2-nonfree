import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EDIBXOXE")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!EDIBXOXE", name = "A", descriptor = "I")
	private int anInt131;

	@OriginalMember(owner = "client!EDIBXOXE", name = "w", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!EDIBXOXE", name = "x", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!EDIBXOXE", name = "y", descriptor = "Z")
	private boolean aBoolean36 = true;

	@OriginalMember(owner = "client!EDIBXOXE", name = "z", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!EDIBXOXE", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!EDIBXOXE", name = "C", descriptor = "[I")
	private int[] anIntArray29 = new int[256];

	@OriginalMember(owner = "client!EDIBXOXE", name = "D", descriptor = "[I")
	private int[] anIntArray30 = new int[256];

	@OriginalMember(owner = "client!EDIBXOXE", name = "E", descriptor = "[I")
	private int[] anIntArray31 = new int[256];

	@OriginalMember(owner = "client!EDIBXOXE", name = "F", descriptor = "[I")
	private int[] anIntArray32 = new int[256];

	@OriginalMember(owner = "client!EDIBXOXE", name = "G", descriptor = "[I")
	private int[] anIntArray33 = new int[256];

	@OriginalMember(owner = "client!EDIBXOXE", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!EDIBXOXE", name = "J", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!EDIBXOXE", name = "H", descriptor = "I")
	public int anInt132;

	@OriginalMember(owner = "client!EDIBXOXE", name = "<init>", descriptor = "(Lclient!FXNTEMPE;ILjava/lang/String;Z)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(63) Class2_Sub1_Sub4 local63 = new Class2_Sub1_Sub4(arg0.method117(arg2 + ".dat", null), -46859);
			@Pc(79) Class2_Sub1_Sub4 local79 = new Class2_Sub1_Sub4(arg0.method117("index.dat", null), -46859);
			local79.anInt556 = local63.method342() + 4;
			@Pc(90) int local90 = local79.method340();
			if (local90 > 0) {
				local79.anInt556 += (local90 - 1) * 3;
			}
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				this.anIntArray31[local104] = local79.method340();
				this.anIntArray32[local104] = local79.method340();
				@Pc(128) int local128 = this.anIntArray29[local104] = local79.method342();
				@Pc(136) int local136 = this.anIntArray30[local104] = local79.method342();
				@Pc(139) int local139 = local79.method340();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray2[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray2[local104][local153] = local63.method341();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray2[local104][local153 + local178 * local128] = local63.method341();
						}
					}
				}
				if (local136 > this.anInt132 && local104 < 128) {
					this.anInt132 = local136;
				}
				this.anIntArray31[local104] = 1;
				this.anIntArray33[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray2[local104][local178 * local128];
				}
				@Pc(255) int local255;
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray33[local104]--;
					this.anIntArray31[local104] = 0;
				}
				local153 = 0;
				for (@Pc(269) int local269 = local136 / 7; local269 < local136; local269++) {
					local153 += this.aByteArrayArray2[local104][local128 + local269 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray33[local104]--;
				}
			}
			if (arg3) {
				this.anIntArray33[32] = this.anIntArray33[73];
			} else {
				this.anIntArray33[32] = this.anIntArray33[105];
			}
		} catch (@Pc(336) RuntimeException local336) {
			signlink.reporterror("73276, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local336.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method84(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method89(507 - this.method88(162, arg0), arg1, arg2, arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("15624, " + -44393 + ", " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method85(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method89(arg1 - this.method88(162, arg3) / 2, arg0, arg2, arg3);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("69037, " + -35070 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ZILjava/lang/String;III)V")
	public void method86(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method93(arg4 - this.method87(arg2) / 2, arg2, arg1, arg0, arg3);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("6123, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method87(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray33[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("41345, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method88(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg1.length(); local11++) {
				local5 += this.anIntArray33[arg1.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("88712, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IBIILjava/lang/String;)V")
	public void method89(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(17) int local17 = arg2 - this.anInt132;
				for (@Pc(19) int local19 = 0; local19 < arg3.length(); local19++) {
					@Pc(25) char local25 = arg3.charAt(local19);
					if (local25 != ' ') {
						this.method96(this.aByteArrayArray2[local25], arg0 + this.anIntArray31[local25], local17 + this.anIntArray32[local25], this.anIntArray29[local25], this.anIntArray30[local25], arg1);
					}
					arg0 += this.anIntArray33[local25];
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("99720, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public void method90(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 != null) {
				arg5 -= this.method88(162, arg0) / 2;
				@Pc(17) int local17;
				if (!arg4) {
					for (local17 = 1; local17 > 0; local17++) {
					}
				}
				@Pc(27) int local27 = arg1 - this.anInt132;
				for (local17 = 0; local17 < arg0.length(); local17++) {
					@Pc(35) char local35 = arg0.charAt(local17);
					if (local35 != ' ') {
						this.method96(this.aByteArrayArray2[local35], arg5 + this.anIntArray31[local35], local27 + this.anIntArray32[local35] + (int) (Math.sin((double) local17 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray29[local35], this.anIntArray30[local35], arg2);
					}
					arg5 += this.anIntArray33[local35];
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("37509, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "b", descriptor = "(ZILjava/lang/String;III)V")
	public void method91(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg2 -= this.method88(162, arg1) / 2;
				@Pc(18) int local18 = arg4 - this.anInt132;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					@Pc(26) char local26 = arg1.charAt(local20);
					if (local26 != ' ') {
						this.method96(this.aByteArrayArray2[local26], arg2 + this.anIntArray31[local26] + (int) (Math.sin((double) local20 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local18 + this.anIntArray32[local26] + (int) (Math.sin((double) local20 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray29[local26], this.anIntArray30[local26], arg3);
					}
					arg2 += this.anIntArray33[local26];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("97774, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIILjava/lang/String;III)V")
	public void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg0 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method88(162, arg3) / 2;
				@Pc(29) int local29 = arg2 - this.anInt132;
				for (@Pc(31) int local31 = 0; local31 < arg3.length(); local31++) {
					@Pc(37) char local37 = arg3.charAt(local31);
					if (local37 != ' ') {
						this.method96(this.aByteArrayArray2[local37], arg5 + this.anIntArray31[local37], local29 + this.anIntArray32[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg1) * local9), this.anIntArray29[local37], this.anIntArray30[local37], arg4);
					}
					arg5 += this.anIntArray33[local37];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("72990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 4410 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
	public void method93(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean38 = false;
			@Pc(6) int local6 = arg0;
			if (arg1 != null) {
				@Pc(14) int local14 = arg4 - this.anInt132;
				for (@Pc(16) int local16 = 0; local16 < arg1.length(); local16++) {
					if (arg1.charAt(local16) == '@' && local16 + 4 < arg1.length() && arg1.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method95(arg1.substring(local16 + 1, local16 + 4), 513);
						if (local48 != -1) {
							arg2 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg1.charAt(local16);
						if (local60 != ' ') {
							if (arg3) {
								this.method96(this.aByteArrayArray2[local60], arg0 + this.anIntArray31[local60] + 1, local14 + this.anIntArray32[local60] + 1, this.anIntArray29[local60], this.anIntArray30[local60], 0);
							}
							this.method96(this.aByteArrayArray2[local60], arg0 + this.anIntArray31[local60], local14 + this.anIntArray32[local60], this.anIntArray29[local60], this.anIntArray30[local60], arg2);
						}
						arg0 += this.anIntArray33[local60];
					}
				}
				if (this.aBoolean38) {
					Class2_Sub1_Sub2.method481(local14 + (int) ((double) this.anInt132 * 0.7D), 160, 8388608, local6, arg0 - local6);
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("30035, " + arg0 + ", " + arg1 + ", " + -129 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(ZIZIILjava/lang/String;I)V")
	public void method94(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg4);
				@Pc(22) int local22 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(27) int local27 = 15 - this.anInt132;
				for (@Pc(29) int local29 = 0; local29 < arg3.length(); local29++) {
					if (arg3.charAt(local29) == '@' && local29 + 4 < arg3.length() && arg3.charAt(local29 + 4) == '@') {
						@Pc(61) int local61 = this.method95(arg3.substring(local29 + 1, local29 + 4), 513);
						if (local61 != -1) {
							arg2 = local61;
						}
						local29 += 4;
					} else {
						@Pc(73) char local73 = arg3.charAt(local29);
						if (local73 != ' ') {
							this.method98(this.aByteArrayArray2[local73], 0, this.anIntArray29[local73], arg1 + this.anIntArray31[local73] + 1, this.anIntArray30[local73], 192, local27 + this.anIntArray32[local73] + 1);
							this.method98(this.aByteArrayArray2[local73], arg2, this.anIntArray29[local73], arg1 + this.anIntArray31[local73], this.anIntArray30[local73], local22, local27 + this.anIntArray32[local73]);
						}
						arg1 += this.anIntArray33[local73];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("65945, " + false + ", " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method95(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
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
					this.aBoolean38 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean38 = false;
				}
				return -1;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("53943, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "([BIIIII)V")
	private void method96(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class2_Sub1_Sub2.anInt710;
		@Pc(9) int local9 = Class2_Sub1_Sub2.anInt710 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class2_Sub1_Sub2.anInt712) {
			local20 = Class2_Sub1_Sub2.anInt712 - arg2;
			arg4 -= local20;
			arg2 = Class2_Sub1_Sub2.anInt712;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class2_Sub1_Sub2.anInt710;
		}
		if (arg2 + arg4 >= Class2_Sub1_Sub2.anInt713) {
			arg4 -= arg2 + arg4 + 1 - Class2_Sub1_Sub2.anInt713;
		}
		if (arg1 < Class2_Sub1_Sub2.anInt714) {
			local20 = Class2_Sub1_Sub2.anInt714 - arg1;
			arg3 -= local20;
			arg1 = Class2_Sub1_Sub2.anInt714;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class2_Sub1_Sub2.anInt715) {
			local20 = arg1 + arg3 + 1 - Class2_Sub1_Sub2.anInt715;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method97(Class2_Sub1_Sub2.anIntArray184, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method97(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(Z[BIIIIII)V")
	private void method98(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg6 * Class2_Sub1_Sub2.anInt710;
			@Pc(9) int local9 = Class2_Sub1_Sub2.anInt710 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(29) int local29;
			if (arg6 < Class2_Sub1_Sub2.anInt712) {
				local29 = Class2_Sub1_Sub2.anInt712 - arg6;
				arg4 -= local29;
				arg6 = Class2_Sub1_Sub2.anInt712;
				local13 = local29 * arg2 + 0;
				local5 += local29 * Class2_Sub1_Sub2.anInt710;
			}
			if (arg6 + arg4 >= Class2_Sub1_Sub2.anInt713) {
				arg4 -= arg6 + arg4 + 1 - Class2_Sub1_Sub2.anInt713;
			}
			if (arg3 < Class2_Sub1_Sub2.anInt714) {
				local29 = Class2_Sub1_Sub2.anInt714 - arg3;
				arg2 -= local29;
				arg3 = Class2_Sub1_Sub2.anInt714;
				local13 += local29;
				local5 += local29;
				local11 = local29 + 0;
				local9 += local29;
			}
			if (arg3 + arg2 >= Class2_Sub1_Sub2.anInt715) {
				local29 = arg3 + arg2 + 1 - Class2_Sub1_Sub2.anInt715;
				arg2 -= local29;
				local11 += local29;
				local9 += local29;
			}
			if (arg2 > 0 && arg4 > 0) {
				this.method99(arg4, local13, local5, local11, local9, Class2_Sub1_Sub2.anIntArray184, arg1, arg2, arg5, arg0);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("88182, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDIBXOXE", name = "a", descriptor = "(IIIIII[IIII[B)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(19) int local19 = ((arg6 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg6 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg8;
			for (@Pc(29) int local29 = -arg0; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg7; local34 < 0; local34++) {
					if (arg9[arg1++] == 0) {
						arg2++;
					} else {
						@Pc(45) int local45 = arg5[arg2];
						arg5[arg2++] = (((local45 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local45 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg2 += arg4;
				arg1 += arg3;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("91081, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
