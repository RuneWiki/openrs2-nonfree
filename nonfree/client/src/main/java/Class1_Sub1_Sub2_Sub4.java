import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt730;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt731 = -456;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[94][];

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
	private int[] anIntArray219 = new int[94];

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[I")
	private int[] anIntArray220 = new int[94];

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	private int[] anIntArray221 = new int[94];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray222 = new int[94];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray223 = new int[95];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray224 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljava/util/Random;")
	private Random aRandom2 = new Random();

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Z")
	private boolean aBoolean174 = false;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray225[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2_Sub4() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1) {
		@Pc(58) Class1_Sub1_Sub3 local58 = new Class1_Sub1_Sub3(arg0.method689(arg1 + ".dat", null), true);
		@Pc(67) Class1_Sub1_Sub3 local67 = new Class1_Sub1_Sub3(arg0.method689("index.dat", null), true);
		local67.anInt766 = local58.method505() + 4;
		@Pc(78) int local78 = local67.method503();
		if (local78 > 0) {
			local67.anInt766 += (local78 - 1) * 3;
		}
		@Pc(116) int local116;
		for (@Pc(92) int local92 = 0; local92 < 94; local92++) {
			this.anIntArray221[local92] = local67.method503();
			this.anIntArray222[local92] = local67.method503();
			local116 = this.anIntArray219[local92] = local67.method505();
			@Pc(124) int local124 = this.anIntArray220[local92] = local67.method505();
			@Pc(127) int local127 = local67.method503();
			@Pc(131) int local131 = local116 * local124;
			this.aByteArrayArray4[local92] = new byte[local131];
			@Pc(141) int local141;
			@Pc(166) int local166;
			if (local127 == 0) {
				for (local141 = 0; local141 < local131; local141++) {
					this.aByteArrayArray4[local92][local141] = local58.method504();
				}
			} else if (local127 == 1) {
				for (local141 = 0; local141 < local116; local141++) {
					for (local166 = 0; local166 < local124; local166++) {
						this.aByteArrayArray4[local92][local141 + local166 * local116] = local58.method504();
					}
				}
			}
			if (local124 > this.anInt732) {
				this.anInt732 = local124;
			}
			this.anIntArray221[local92] = 1;
			this.anIntArray223[local92] = local116 + 2;
			local141 = 0;
			for (local166 = local124 / 7; local166 < local124; local166++) {
				local141 += this.aByteArrayArray4[local92][local166 * local116];
			}
			@Pc(240) int local240;
			if (local141 <= local124 / 7) {
				local240 = this.anIntArray223[local92]--;
				this.anIntArray221[local92] = 0;
			}
			local141 = 0;
			for (@Pc(254) int local254 = local124 / 7; local254 < local124; local254++) {
				local141 += this.aByteArrayArray4[local92][local116 + local254 * local116 - 1];
			}
			if (local141 <= local124 / 7) {
				local240 = this.anIntArray223[local92]--;
			}
		}
		this.anIntArray223[94] = this.anIntArray223[8];
		for (local116 = 0; local116 < 256; local116++) {
			this.anIntArray224[local116] = this.anIntArray223[anIntArray225[local116]];
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method472(arg2, arg3, arg0, arg1 - this.method471(arg2) / 2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("29225, " + -544 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZZIILjava/lang/String;)V")
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.method474(arg3, arg4, arg0 - this.method471(arg4) / 2, arg1, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("11966, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method471(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray224[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("74656, " + false + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIBI)V")
	public void method472(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(7) int local7 = arg2 - this.anInt732;
				for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
					@Pc(17) int local17 = anIntArray225[arg0.charAt(local9)];
					if (local17 != 94) {
						this.method477(this.aByteArrayArray4[local17], arg3 + this.anIntArray221[local17], local7 + this.anIntArray222[local17], this.anIntArray219[local17], this.anIntArray220[local17], arg1);
					}
					arg3 += this.anIntArray223[local17];
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("83885, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 110 + ", " + arg3 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method473(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg1 -= this.method471(arg0) / 2;
				@Pc(19) int local19 = arg3 - this.anInt732;
				for (@Pc(21) int local21 = 0; local21 < arg0.length(); local21++) {
					@Pc(29) int local29 = anIntArray225[arg0.charAt(local21)];
					if (local29 != 94) {
						this.method477(this.aByteArrayArray4[local29], arg1 + this.anIntArray221[local29], local19 + this.anIntArray222[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray219[local29], this.anIntArray220[local29], arg4);
					}
					arg1 += this.anIntArray223[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("29380, " + arg0 + ", " + -794 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;IZI)V")
	public void method474(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean174 = false;
			@Pc(9) int local9 = arg2;
			if (arg1 != null) {
				@Pc(17) int local17 = arg0 - this.anInt732;
				for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
					@Pc(51) int local51;
					if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
						local51 = this.method476(arg1.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg4 = local51;
						}
						local19 += 4;
					} else {
						local51 = anIntArray225[arg1.charAt(local19)];
						if (local51 != 94) {
							if (arg3) {
								this.method477(this.aByteArrayArray4[local51], arg2 + this.anIntArray221[local51] + 1, local17 + this.anIntArray222[local51] + 1, this.anIntArray219[local51], this.anIntArray220[local51], 0);
							}
							this.method477(this.aByteArrayArray4[local51], arg2 + this.anIntArray221[local51], local17 + this.anIntArray222[local51], this.anIntArray219[local51], this.anIntArray220[local51], arg4);
						}
						arg2 += this.anIntArray223[local51];
					}
				}
				if (this.aBoolean174) {
					Class1_Sub1_Sub2.method465(8388608, arg2 - local9, local9, local17 + (int) ((double) this.anInt732 * 0.7D), (byte) 2);
				}
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("55462, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLjava/lang/String;IIIII)V")
	public void method475(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom2.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom2.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt732;
				for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
					@Pc(56) int local56;
					if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
						local56 = this.method476(arg0.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg2 = local56;
						}
						local24 += 4;
					} else {
						local56 = anIntArray225[arg0.charAt(local24)];
						if (local56 != 94) {
							this.method479(192, this.aByteArrayArray4[local56], arg4 + this.anIntArray221[local56] + 1, 0, this.anIntArray220[local56], this.anIntArray219[local56], local22 + this.anIntArray222[local56] + 1);
							this.method479(local17, this.aByteArrayArray4[local56], arg4 + this.anIntArray221[local56], arg2, this.anIntArray220[local56], this.anIntArray219[local56], local22 + this.anIntArray222[local56]);
						}
						arg4 += this.anIntArray223[local56];
						if ((this.aRandom2.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("57826, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 25755 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I")
	protected int method476(@OriginalArg(1) String arg0) {
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
					this.aBoolean174 = true;
				}
				return -1;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("52919, " + 94 + ", " + arg0 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method477(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt721;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt721 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt723) {
			local20 = Class1_Sub1_Sub2.anInt723 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt723;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt721;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt724) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt724;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt725) {
			local20 = Class1_Sub1_Sub2.anInt725 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt725;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt726) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt726;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method478(Class1_Sub1_Sub2.anIntArray218, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method478(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIIIIIZ)V")
	private void method479(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			@Pc(14) int local14 = arg2 + arg6 * Class1_Sub1_Sub2.anInt721;
			@Pc(18) int local18 = Class1_Sub1_Sub2.anInt721 - arg5;
			@Pc(20) int local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			if (arg6 < Class1_Sub1_Sub2.anInt723) {
				local29 = Class1_Sub1_Sub2.anInt723 - arg6;
				arg4 -= local29;
				arg6 = Class1_Sub1_Sub2.anInt723;
				local22 = local29 * arg5 + 0;
				local14 += local29 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg6 + arg4 >= Class1_Sub1_Sub2.anInt724) {
				arg4 -= arg6 + arg4 + 1 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt725) {
				local29 = Class1_Sub1_Sub2.anInt725 - arg2;
				arg5 -= local29;
				arg2 = Class1_Sub1_Sub2.anInt725;
				local22 += local29;
				local14 += local29;
				local20 = local29 + 0;
				local18 += local29;
			}
			if (arg2 + arg5 >= Class1_Sub1_Sub2.anInt726) {
				local29 = arg2 + arg5 + 1 - Class1_Sub1_Sub2.anInt726;
				arg5 -= local29;
				local20 += local29;
				local18 += local29;
			}
			if (arg5 > 0 && arg4 > 0) {
				this.method480(local20, arg3, Class1_Sub1_Sub2.anIntArray218, arg5, local22, arg1, arg4, local18, arg0, local14);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("73923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[III[BIIII)V")
	private void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg1 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg8;
			for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg3; local31 < 0; local31++) {
					if (arg5[arg4++] == 0) {
						arg9++;
					} else {
						@Pc(42) int local42 = arg2[arg9];
						arg2[arg9++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg9 += arg7;
				arg4 += arg0;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("27392, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
