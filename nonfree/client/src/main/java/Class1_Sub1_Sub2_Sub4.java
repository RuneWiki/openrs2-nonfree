import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt680 = -206;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[I")
	private int[] anIntArray211 = new int[256];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray212 = new int[256];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Z")
	private boolean aBoolean194 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	public int anInt682;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!xb;ILjava/lang/String;Z)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(54) Class1_Sub1_Sub3 local54 = new Class1_Sub1_Sub3((byte) 3, arg0.method658(arg2 + ".dat", null));
			@Pc(63) Class1_Sub1_Sub3 local63 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("index.dat", null));
			@Pc(67) int local67 = 53 / arg1;
			local63.anInt715 = local54.method474() + 4;
			@Pc(78) int local78 = local63.method472();
			if (local78 > 0) {
				local63.anInt715 += (local78 - 1) * 3;
			}
			for (@Pc(92) int local92 = 0; local92 < 256; local92++) {
				this.anIntArray213[local92] = local63.method472();
				this.anIntArray214[local92] = local63.method472();
				@Pc(116) int local116 = this.anIntArray211[local92] = local63.method474();
				@Pc(124) int local124 = this.anIntArray212[local92] = local63.method474();
				@Pc(127) int local127 = local63.method472();
				@Pc(131) int local131 = local116 * local124;
				this.aByteArrayArray3[local92] = new byte[local131];
				@Pc(141) int local141;
				@Pc(166) int local166;
				if (local127 == 0) {
					for (local141 = 0; local141 < local131; local141++) {
						this.aByteArrayArray3[local92][local141] = local54.method473();
					}
				} else if (local127 == 1) {
					for (local141 = 0; local141 < local116; local141++) {
						for (local166 = 0; local166 < local124; local166++) {
							this.aByteArrayArray3[local92][local141 + local166 * local116] = local54.method473();
						}
					}
				}
				if (local124 > this.anInt682 && local92 < 128) {
					this.anInt682 = local124;
				}
				this.anIntArray213[local92] = 1;
				this.anIntArray215[local92] = local116 + 2;
				local141 = 0;
				for (local166 = local124 / 7; local166 < local124; local166++) {
					local141 += this.aByteArrayArray3[local92][local166 * local116];
				}
				@Pc(243) int local243;
				if (local141 <= local124 / 7) {
					local243 = this.anIntArray215[local92]--;
					this.anIntArray213[local92] = 0;
				}
				local141 = 0;
				for (@Pc(257) int local257 = local124 / 7; local257 < local124; local257++) {
					local141 += this.aByteArrayArray3[local92][local116 + local257 * local116 - 1];
				}
				if (local141 <= local124 / 7) {
					local243 = this.anIntArray215[local92]--;
				}
			}
			if (arg3) {
				this.anIntArray215[32] = this.anIntArray215[73];
			} else {
				this.anIntArray215[32] = this.anIntArray215[105];
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("99376, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBILjava/lang/String;)V")
	public void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method445(arg0 - this.method444(arg3) / 2, 474, arg2, arg3, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("52377, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIZI)V")
	public void method443(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.method447(arg0, arg1, arg2, arg4 - this.method444(arg0) / 2, arg3);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method444(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				if (arg0.charAt(local18) == '@' && local18 + 4 < arg0.length() && arg0.charAt(local18 + 4) == '@') {
					local18 += 4;
				} else {
					local16 += this.anIntArray215[arg0.charAt(local18)];
				}
			}
			return local16;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("2305, " + arg0 + ", " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg4 - this.anInt682;
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < arg3.length(); local13++) {
					@Pc(19) char local19 = arg3.charAt(local13);
					if (local19 != ' ') {
						this.method450(this.aByteArrayArray3[local19], arg0 + this.anIntArray213[local19], local7 + this.anIntArray214[local19], this.anIntArray211[local19], this.anIntArray212[local19], arg2);
					}
					arg0 += this.anIntArray215[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("91951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method444(arg3) / 2;
				@Pc(16) int local16 = arg4 - this.anInt682;
				for (@Pc(23) int local23 = 0; local23 < arg3.length(); local23++) {
					@Pc(29) char local29 = arg3.charAt(local23);
					if (local29 != ' ') {
						this.method450(this.aByteArrayArray3[local29], arg2 + this.anIntArray213[local29], local16 + this.anIntArray214[local29] + (int) (Math.sin((double) local23 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray211[local29], this.anIntArray212[local29], arg1);
					}
					arg2 += this.anIntArray215[local29];
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("91153, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -435 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.aBoolean194 = false;
			@Pc(6) int local6 = arg3;
			if (arg0 != null) {
				@Pc(14) int local14 = arg1 - this.anInt682;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method449(arg0.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg2 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg0.charAt(local16);
						if (local60 != ' ') {
							if (arg4) {
								this.method450(this.aByteArrayArray3[local60], arg3 + this.anIntArray213[local60] + 1, local14 + this.anIntArray214[local60] + 1, this.anIntArray211[local60], this.anIntArray212[local60], 0);
							}
							this.method450(this.aByteArrayArray3[local60], arg3 + this.anIntArray213[local60], local14 + this.anIntArray214[local60], this.anIntArray211[local60], this.anIntArray212[local60], arg2);
						}
						arg3 += this.anIntArray215[local60];
					}
				}
				if (this.aBoolean194) {
					Class1_Sub1_Sub2.method438(local6, 8388608, local14 + (int) ((double) this.anInt682 * 0.7D), arg3 - local6);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("862, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILjava/lang/String;IZII)V")
	public void method448(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt682;
				for (@Pc(27) int local27 = 0; local27 < arg1.length(); local27++) {
					if (arg1.charAt(local27) == '@' && local27 + 4 < arg1.length() && arg1.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method449(arg1.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg2 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg1.charAt(local27);
						if (local71 != ' ') {
							this.method452(this.aByteArrayArray3[local71], local25 + this.anIntArray214[local71] + 1, arg3 + this.anIntArray213[local71] + 1, 0, this.anIntArray211[local71], this.anIntArray212[local71], 192);
							this.method452(this.aByteArrayArray3[local71], local25 + this.anIntArray214[local71], arg3 + this.anIntArray213[local71], arg2, this.anIntArray211[local71], this.anIntArray212[local71], local20);
						}
						arg3 += this.anIntArray215[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("51499, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method449(@OriginalArg(0) String arg0) {
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
					this.aBoolean194 = true;
				}
				return -1;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("17695, " + arg0 + ", " + 9 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method450(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt670;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt670 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt672) {
			local20 = Class1_Sub1_Sub2.anInt672 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt672;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt670;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt673) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt673;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt674) {
			local20 = Class1_Sub1_Sub2.anInt674 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt674;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt675) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt675;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method451(Class1_Sub1_Sub2.anIntArray210, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method451(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIIIII)V")
	private void method452(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(9) int local9 = arg2 + arg1 * Class1_Sub1_Sub2.anInt670;
			@Pc(13) int local13 = Class1_Sub1_Sub2.anInt670 - arg4;
			@Pc(15) int local15 = 0;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			if (arg1 < Class1_Sub1_Sub2.anInt672) {
				local24 = Class1_Sub1_Sub2.anInt672 - arg1;
				arg5 -= local24;
				arg1 = Class1_Sub1_Sub2.anInt672;
				local17 = local24 * arg4 + 0;
				local9 += local24 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg1 + arg5 >= Class1_Sub1_Sub2.anInt673) {
				arg5 -= arg1 + arg5 + 1 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt674) {
				local24 = Class1_Sub1_Sub2.anInt674 - arg2;
				arg4 -= local24;
				arg2 = Class1_Sub1_Sub2.anInt674;
				local17 += local24;
				local9 += local24;
				local15 = local24 + 0;
				local13 += local24;
			}
			if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt675) {
				local24 = arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt675;
				arg4 -= local24;
				local15 += local24;
				local13 += local24;
			}
			if (arg4 > 0 && arg5 > 0) {
				this.method453(local13, local17, arg4, this.anInt681, Class1_Sub1_Sub2.anIntArray210, local15, arg5, arg3, arg6, arg0, local9);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("50521, " + arg0 + ", " + -31507 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII[IIIII[BI)V")
	private void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg7 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg8 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg8;
			for (@Pc(26) int local26 = -arg6; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg2; local31 < 0; local31++) {
					if (arg9[arg1++] == 0) {
						arg10++;
					} else {
						@Pc(42) int local42 = arg4[arg10];
						arg4[arg10++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg10 += arg0;
				arg1 += arg5;
			}
			if (arg3 != 0) {
				this.anInt681 = 463;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("78801, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
