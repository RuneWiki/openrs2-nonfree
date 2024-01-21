import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YCYYIGLM")
public final class Class3_Sub3_Sub3_Sub4 extends Class3_Sub3_Sub3 {

	@OriginalMember(owner = "client!YCYYIGLM", name = "x", descriptor = "I")
	private int anInt824;

	@OriginalMember(owner = "client!YCYYIGLM", name = "w", descriptor = "Z")
	private boolean aBoolean190 = false;

	@OriginalMember(owner = "client!YCYYIGLM", name = "y", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!YCYYIGLM", name = "z", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!YCYYIGLM", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!YCYYIGLM", name = "B", descriptor = "[I")
	private int[] anIntArray205 = new int[256];

	@OriginalMember(owner = "client!YCYYIGLM", name = "C", descriptor = "[I")
	private int[] anIntArray206 = new int[256];

	@OriginalMember(owner = "client!YCYYIGLM", name = "D", descriptor = "[I")
	private int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!YCYYIGLM", name = "E", descriptor = "[I")
	private int[] anIntArray208 = new int[256];

	@OriginalMember(owner = "client!YCYYIGLM", name = "F", descriptor = "[I")
	private int[] anIntArray209 = new int[256];

	@OriginalMember(owner = "client!YCYYIGLM", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!YCYYIGLM", name = "I", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!YCYYIGLM", name = "G", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!YCYYIGLM", name = "<init>", descriptor = "(ZLclient!LKPVZAQN;Ljava/lang/String;B)V")
	public Class3_Sub3_Sub3_Sub4(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(60) Class3_Sub3_Sub4 local60 = new Class3_Sub3_Sub4((byte) -115, arg1.method207(arg2 + ".dat", null));
			@Pc(69) Class3_Sub3_Sub4 local69 = new Class3_Sub3_Sub4((byte) -115, arg1.method207("index.dat", null));
			local69.anInt738 = local60.method470() + 4;
			@Pc(87) int local87 = local69.method468();
			if (local87 > 0) {
				local69.anInt738 += (local87 - 1) * 3;
			}
			for (@Pc(101) int local101 = 0; local101 < 256; local101++) {
				this.anIntArray207[local101] = local69.method468();
				this.anIntArray208[local101] = local69.method468();
				@Pc(125) int local125 = this.anIntArray205[local101] = local69.method470();
				@Pc(133) int local133 = this.anIntArray206[local101] = local69.method470();
				@Pc(136) int local136 = local69.method468();
				@Pc(140) int local140 = local125 * local133;
				this.aByteArrayArray4[local101] = new byte[local140];
				@Pc(150) int local150;
				@Pc(175) int local175;
				if (local136 == 0) {
					for (local150 = 0; local150 < local140; local150++) {
						this.aByteArrayArray4[local101][local150] = local60.method469();
					}
				} else if (local136 == 1) {
					for (local150 = 0; local150 < local125; local150++) {
						for (local175 = 0; local175 < local133; local175++) {
							this.aByteArrayArray4[local101][local150 + local175 * local125] = local60.method469();
						}
					}
				}
				if (local133 > this.anInt825 && local101 < 128) {
					this.anInt825 = local133;
				}
				this.anIntArray207[local101] = 1;
				this.anIntArray209[local101] = local125 + 2;
				local150 = 0;
				for (local175 = local133 / 7; local175 < local133; local175++) {
					local150 += this.aByteArrayArray4[local101][local175 * local125];
				}
				@Pc(252) int local252;
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray209[local101]--;
					this.anIntArray207[local101] = 0;
				}
				local150 = 0;
				for (@Pc(266) int local266 = local133 / 7; local266 < local133; local266++) {
					local150 += this.aByteArrayArray4[local101][local125 + local266 * local125 - 1];
				}
				if (local150 <= local133 / 7) {
					local252 = this.anIntArray209[local101]--;
				}
			}
			if (arg0) {
				this.anIntArray209[32] = this.anIntArray209[73];
			} else {
				this.anIntArray209[32] = this.anIntArray209[105];
			}
		} catch (@Pc(325) RuntimeException local325) {
			signlink.reporterror("68507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local325.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method559(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		try {
			this.method564(arg0, arg2, arg1, 507 - this.method563(arg1));
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("94919, " + arg0 + ", " + 507 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			this.method564(arg1, arg0, arg3, arg2 - this.method563(arg3) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36929, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -27242 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public void method561(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			this.method568((byte) 3, arg1, arg2, arg3 - this.method562(arg2) / 2, arg0, arg4);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("41002, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method562(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
				if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local7 += this.anIntArray209[arg0.charAt(local19)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("46002, " + false + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method563(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local10 += this.anIntArray209[arg0.charAt(local12)];
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("65499, " + 0 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(ZIILjava/lang/String;I)V")
	public void method564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(10) int local10 = arg1 - this.anInt825;
				for (@Pc(12) int local12 = 0; local12 < arg2.length(); local12++) {
					@Pc(18) char local18 = arg2.charAt(local12);
					if (local18 != ' ') {
						this.method571(this.aByteArrayArray4[local18], arg3 + this.anIntArray207[local18], local10 + this.anIntArray208[local18], this.anIntArray205[local18], this.anIntArray206[local18], arg0);
					}
					arg3 += this.anIntArray209[local18];
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("55066, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method565(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 != null) {
				arg3 -= this.method563(arg0) / 2;
				@Pc(21) int local21 = arg1 - this.anInt825;
				for (@Pc(23) int local23 = 0; local23 < arg0.length(); local23++) {
					@Pc(29) char local29 = arg0.charAt(local23);
					if (local29 != ' ') {
						this.method571(this.aByteArrayArray4[local29], arg3 + this.anIntArray207[local29], local21 + this.anIntArray208[local29] + (int) (Math.sin((double) local23 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray205[local29], this.anIntArray206[local29], arg4);
					}
					arg3 += this.anIntArray209[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("79234, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg1 -= this.method563(arg4) / 2;
				@Pc(26) int local26 = arg2 - this.anInt825;
				for (@Pc(28) int local28 = 0; local28 < arg4.length(); local28++) {
					@Pc(34) char local34 = arg4.charAt(local28);
					if (local34 != ' ') {
						this.method571(this.aByteArrayArray4[local34], arg1 + this.anIntArray207[local34] + (int) (Math.sin((double) local28 / 5.0D + (double) arg3 / 5.0D) * 5.0D), local26 + this.anIntArray208[local34] + (int) (Math.sin((double) local28 / 3.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray205[local34], this.anIntArray206[local34], arg0);
					}
					arg1 += this.anIntArray209[local34];
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("47702, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIZIILjava/lang/String;)V")
	public void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			if (arg5 != null) {
				@Pc(12) double local12 = 7.0D - (double) arg4 / 8.0D;
				if (local12 < 0.0D) {
					local12 = 0.0D;
				}
				arg3 -= this.method563(arg5) / 2;
				@Pc(32) int local32 = arg1 - this.anInt825;
				for (@Pc(34) int local34 = 0; local34 < arg5.length(); local34++) {
					@Pc(40) char local40 = arg5.charAt(local34);
					if (local40 != ' ') {
						this.method571(this.aByteArrayArray4[local40], arg3 + this.anIntArray207[local40], local32 + this.anIntArray208[local40] + (int) (Math.sin((double) local34 / 1.5D + (double) arg2) * local12), this.anIntArray205[local40], this.anIntArray206[local40], arg0);
					}
					arg3 += this.anIntArray209[local40];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("71169, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(BZLjava/lang/String;III)V")
	public void method568(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aBoolean193 = false;
			@Pc(6) int local6 = arg3;
			if (arg2 != null) {
				@Pc(14) int local14 = arg5 - this.anInt825;
				for (@Pc(16) int local16 = 0; local16 < arg2.length(); local16++) {
					if (arg2.charAt(local16) == '@' && local16 + 4 < arg2.length() && arg2.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method570(arg2.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg4 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg2.charAt(local16);
						if (local60 != ' ') {
							if (arg1) {
								this.method571(this.aByteArrayArray4[local60], arg3 + this.anIntArray207[local60] + 1, local14 + this.anIntArray208[local60] + 1, this.anIntArray205[local60], this.anIntArray206[local60], 0);
							}
							this.method571(this.aByteArrayArray4[local60], arg3 + this.anIntArray207[local60], local14 + this.anIntArray208[local60], this.anIntArray205[local60], this.anIntArray206[local60], arg4);
						}
						arg3 += this.anIntArray209[local60];
					}
				}
				@Pc(140) boolean local140 = false;
				if (this.aBoolean193) {
					Class3_Sub3_Sub3.method555(local14 + (int) ((double) this.anInt825 * 0.7D), arg3 - local6, local6, 8388608);
				}
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("33760, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;ZIIIII)V")
	public void method569(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg4);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt825;
				for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
					if (arg0.charAt(local27) == '@' && local27 + 4 < arg0.length() && arg0.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method570(arg0.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg3 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg0.charAt(local27);
						if (local71 != ' ') {
							this.method573(this.anIntArray206[local71], arg1 + this.anIntArray207[local71] + 1, this.anIntArray205[local71], 0, local25 + this.anIntArray208[local71] + 1, 192, this.aByteArrayArray4[local71]);
							this.method573(this.anIntArray206[local71], arg1 + this.anIntArray207[local71], this.anIntArray205[local71], arg3, local25 + this.anIntArray208[local71], local20, this.aByteArrayArray4[local71]);
						}
						arg1 += this.anIntArray209[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("54782, " + arg0 + ", " + true + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	private int method570(@OriginalArg(0) String arg0) {
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
					this.aBoolean193 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean193 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("77090, " + arg0 + ", " + false + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "([BIIIII)V")
	private void method571(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub3_Sub3.anInt815;
		@Pc(9) int local9 = Class3_Sub3_Sub3.anInt815 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub3_Sub3.anInt817) {
			local20 = Class3_Sub3_Sub3.anInt817 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub3_Sub3.anInt817;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub3_Sub3.anInt815;
		}
		if (arg2 + arg4 >= Class3_Sub3_Sub3.anInt818) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub3_Sub3.anInt818;
		}
		if (arg1 < Class3_Sub3_Sub3.anInt819) {
			local20 = Class3_Sub3_Sub3.anInt819 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub3_Sub3.anInt819;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub3_Sub3.anInt820) {
			local20 = arg1 + arg3 + 1 - Class3_Sub3_Sub3.anInt820;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method572(Class3_Sub3_Sub3.anIntArray204, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method572(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIIIII[B)V")
	private void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		try {
			@Pc(5) int local5 = arg1 + arg4 * Class3_Sub3_Sub3.anInt815;
			@Pc(9) int local9 = Class3_Sub3_Sub3.anInt815 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(30) int local30;
			if (arg4 < Class3_Sub3_Sub3.anInt817) {
				local30 = Class3_Sub3_Sub3.anInt817 - arg4;
				arg0 -= local30;
				arg4 = Class3_Sub3_Sub3.anInt817;
				local13 = local30 * arg2 + 0;
				local5 += local30 * Class3_Sub3_Sub3.anInt815;
			}
			if (arg4 + arg0 >= Class3_Sub3_Sub3.anInt818) {
				arg0 -= arg4 + arg0 + 1 - Class3_Sub3_Sub3.anInt818;
			}
			if (arg1 < Class3_Sub3_Sub3.anInt819) {
				local30 = Class3_Sub3_Sub3.anInt819 - arg1;
				arg2 -= local30;
				arg1 = Class3_Sub3_Sub3.anInt819;
				local13 += local30;
				local5 += local30;
				local11 = local30 + 0;
				local9 += local30;
			}
			if (arg1 + arg2 >= Class3_Sub3_Sub3.anInt820) {
				local30 = arg1 + arg2 + 1 - Class3_Sub3_Sub3.anInt820;
				arg2 -= local30;
				local11 += local30;
				local9 += local30;
			}
			if (arg2 > 0 && arg0 > 0) {
				this.method574(arg3, arg0, arg5, local11, arg6, local13, arg2, local5, Class3_Sub3_Sub3.anIntArray204, local9);
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("2497, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + arg5 + ", " + arg6 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YCYYIGLM", name = "a", descriptor = "(IIIII[BIII[II)V")
	private void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(29) int local29 = ((arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg2 & 0xFF0000) >> 8;
			@Pc(33) int local33 = 256 - arg2;
			for (@Pc(36) int local36 = -arg1; local36 < 0; local36++) {
				for (@Pc(41) int local41 = -arg6; local41 < 0; local41++) {
					if (arg4[arg5++] == 0) {
						arg7++;
					} else {
						@Pc(52) int local52 = arg8[arg7];
						arg8[arg7++] = (((local52 & 0xFF00FF) * local33 & 0xFF00FF00) + ((local52 & 0xFF00) * local33 & 0xFF0000) >> 8) + local29;
					}
				}
				arg7 += arg9;
				arg5 += arg3;
			}
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("70425, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -4 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
