import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "[I")
	private static int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt748 = 3;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
	private int anInt750 = 3;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "Z")
	private boolean aBoolean187 = true;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray214 = new int[94];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray215 = new int[94];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[I")
	private int[] anIntArray216 = new int[94];

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
	private int[] anIntArray217 = new int[94];

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
	private int[] anIntArray218 = new int[95];

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "[I")
	private int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "N", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
	public int anInt751;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray220[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!yb;Z)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(67) Class1_Sub1_Sub3 local67 = new Class1_Sub1_Sub3(arg1.method678(arg0 + ".dat", null), (byte) 3);
			@Pc(76) Class1_Sub1_Sub3 local76 = new Class1_Sub1_Sub3(arg1.method678("index.dat", null), (byte) 3);
			local76.anInt777 = local67.method500() + 4;
			@Pc(92) int local92 = local76.method498();
			if (local92 > 0) {
				local76.anInt777 += (local92 - 1) * 3;
			}
			@Pc(130) int local130;
			for (@Pc(106) int local106 = 0; local106 < 94; local106++) {
				this.anIntArray216[local106] = local76.method498();
				this.anIntArray217[local106] = local76.method498();
				local130 = this.anIntArray214[local106] = local76.method500();
				@Pc(138) int local138 = this.anIntArray215[local106] = local76.method500();
				@Pc(141) int local141 = local76.method498();
				@Pc(145) int local145 = local130 * local138;
				this.aByteArrayArray3[local106] = new byte[local145];
				@Pc(155) int local155;
				@Pc(180) int local180;
				if (local141 == 0) {
					for (local155 = 0; local155 < local145; local155++) {
						this.aByteArrayArray3[local106][local155] = local67.method499();
					}
				} else if (local141 == 1) {
					for (local155 = 0; local155 < local130; local155++) {
						for (local180 = 0; local180 < local138; local180++) {
							this.aByteArrayArray3[local106][local155 + local180 * local130] = local67.method499();
						}
					}
				}
				if (local138 > this.anInt751) {
					this.anInt751 = local138;
				}
				this.anIntArray216[local106] = 1;
				this.anIntArray218[local106] = local130 + 2;
				local155 = 0;
				for (local180 = local138 / 7; local180 < local138; local180++) {
					local155 += this.aByteArrayArray3[local106][local180 * local130];
				}
				@Pc(254) int local254;
				if (local155 <= local138 / 7) {
					local254 = this.anIntArray218[local106]--;
					this.anIntArray216[local106] = 0;
				}
				local155 = 0;
				for (@Pc(268) int local268 = local138 / 7; local268 < local138; local268++) {
					local155 += this.aByteArrayArray3[local106][local130 + local268 * local130 - 1];
				}
				if (local155 <= local138 / 7) {
					local254 = this.anIntArray218[local106]--;
				}
			}
			this.anIntArray218[94] = this.anIntArray218[8];
			for (local130 = 0; local130 < 256; local130++) {
				this.anIntArray219[local130] = this.anIntArray218[anIntArray220[local130]];
			}
		} catch (@Pc(339) RuntimeException local339) {
			signlink.reporterror("63335, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local339.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method468(arg3, arg2 - this.method467(arg1) / 2, arg0, this.anInt750, arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31550, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILjava/lang/String;ZIZ)V")
	public void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method470(arg4, arg2, arg3, arg0, arg1 - this.method467(arg2) / 2);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("2313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method467(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray219[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("54751, " + arg0 + ", " + true + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			if (arg3 < 3 || arg3 > 3) {
				this.anInt749 = -464;
			}
			if (arg4 != null) {
				@Pc(16) int local16 = arg2 - this.anInt751;
				for (@Pc(18) int local18 = 0; local18 < arg4.length(); local18++) {
					@Pc(26) int local26 = anIntArray220[arg4.charAt(local18)];
					if (local26 != 94) {
						this.method473(this.aByteArrayArray3[local26], arg1 + this.anIntArray216[local26], local16 + this.anIntArray217[local26], this.anIntArray214[local26], this.anIntArray215[local26], arg0);
					}
					arg1 += this.anIntArray218[local26];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("70193, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBILjava/lang/String;I)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method467(arg3) / 2;
				@Pc(18) int local18 = arg4 - this.anInt751;
				for (@Pc(30) int local30 = 0; local30 < arg3.length(); local30++) {
					@Pc(38) int local38 = anIntArray220[arg3.charAt(local30)];
					if (local38 != 94) {
						this.method473(this.aByteArrayArray3[local38], arg2 + this.anIntArray216[local38], local18 + this.anIntArray217[local38] + (int) (Math.sin((double) local30 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray214[local38], this.anIntArray215[local38], arg1);
					}
					arg2 += this.anIntArray218[local38];
				}
			}
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("85997, " + arg0 + ", " + arg1 + ", " + -94 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;IBII)V")
	public void method470(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean188 = false;
			@Pc(6) int local6 = arg4;
			if (arg1 != null) {
				@Pc(14) int local14 = arg2 - this.anInt751;
				for (@Pc(27) int local27 = 0; local27 < arg1.length(); local27++) {
					@Pc(59) int local59;
					if (arg1.charAt(local27) == '@' && local27 + 4 < arg1.length() && arg1.charAt(local27 + 4) == '@') {
						local59 = this.method472(arg1.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg3 = local59;
						}
						local27 += 4;
					} else {
						local59 = anIntArray220[arg1.charAt(local27)];
						if (local59 != 94) {
							if (arg0) {
								this.method473(this.aByteArrayArray3[local59], arg4 + this.anIntArray216[local59] + 1, local14 + this.anIntArray217[local59] + 1, this.anIntArray214[local59], this.anIntArray215[local59], 0);
							}
							this.method473(this.aByteArrayArray3[local59], arg4 + this.anIntArray216[local59], local14 + this.anIntArray217[local59], this.anIntArray214[local59], this.anIntArray215[local59], arg3);
						}
						arg4 += this.anIntArray218[local59];
					}
				}
				if (this.aBoolean188) {
					Class1_Sub1_Sub2.method461(local6, local14 + (int) ((double) this.anInt751 * 0.7D), 8388608, arg4 - local6);
				}
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("84645, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 45 + ", " + arg3 + ", " + arg4 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;IIZII)V")
	public void method471(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt751;
				for (@Pc(28) int local28 = 0; local28 < arg1.length(); local28++) {
					@Pc(60) int local60;
					if (arg1.charAt(local28) == '@' && local28 + 4 < arg1.length() && arg1.charAt(local28 + 4) == '@') {
						local60 = this.method472(arg1.substring(local28 + 1, local28 + 4));
						if (local60 != -1) {
							arg2 = local60;
						}
						local28 += 4;
					} else {
						local60 = anIntArray220[arg1.charAt(local28)];
						if (local60 != 94) {
							this.method475(this.anIntArray215[local60], local22 + this.anIntArray217[local60] + 1, 0, 192, this.anIntArray214[local60], this.aByteArrayArray3[local60], arg4 + this.anIntArray216[local60] + 1);
							this.method475(this.anIntArray215[local60], local22 + this.anIntArray217[local60], arg2, local17, this.anIntArray214[local60], this.aByteArrayArray3[local60], arg4 + this.anIntArray216[local60]);
						}
						arg4 += this.anIntArray218[local60];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("4775, " + arg0 + ", " + arg1 + ", " + 21042 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	private int method472(@OriginalArg(1) String arg0) {
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
					this.aBoolean188 = true;
				}
				return -1;
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("93318, " + 91 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method473(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt738;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt738 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt740) {
			local20 = Class1_Sub1_Sub2.anInt740 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt740;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt738;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt741) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt741;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt742) {
			local20 = Class1_Sub1_Sub2.anInt742 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt742;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt743) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt743;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method474(Class1_Sub1_Sub2.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method474(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII[BII)V")
	private void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(19) int local19 = arg6 + arg1 * Class1_Sub1_Sub2.anInt738;
			@Pc(23) int local23 = Class1_Sub1_Sub2.anInt738 - arg4;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(34) int local34;
			if (arg1 < Class1_Sub1_Sub2.anInt740) {
				local34 = Class1_Sub1_Sub2.anInt740 - arg1;
				arg0 -= local34;
				arg1 = Class1_Sub1_Sub2.anInt740;
				local27 = local34 * arg4 + 0;
				local19 += local34 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg1 + arg0 >= Class1_Sub1_Sub2.anInt741) {
				arg0 -= arg1 + arg0 + 1 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg6 < Class1_Sub1_Sub2.anInt742) {
				local34 = Class1_Sub1_Sub2.anInt742 - arg6;
				arg4 -= local34;
				arg6 = Class1_Sub1_Sub2.anInt742;
				local27 += local34;
				local19 += local34;
				local25 = local34 + 0;
				local23 += local34;
			}
			if (arg6 + arg4 >= Class1_Sub1_Sub2.anInt743) {
				local34 = arg6 + arg4 + 1 - Class1_Sub1_Sub2.anInt743;
				arg4 -= local34;
				local25 += local34;
				local23 += local34;
			}
			if (arg4 > 0 && arg0 > 0) {
				this.method476(arg2, Class1_Sub1_Sub2.anIntArray213, arg4, arg3, local25, arg5, local27, local23, arg0, local19);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("58229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 4 + ", " + arg6 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[IIIII[BIIII)V")
	private void method476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg3 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg3;
			for (@Pc(30) int local30 = -arg8; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg2; local35 < 0; local35++) {
					if (arg5[arg6++] == 0) {
						arg9++;
					} else {
						@Pc(46) int local46 = arg1[arg9];
						arg1[arg9++] = (((local46 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local46 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg7;
				arg6 += arg4;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("3897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 32727 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
