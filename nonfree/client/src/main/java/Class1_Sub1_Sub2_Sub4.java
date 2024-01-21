import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt707 = 436;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private int anInt708 = 436;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "[I")
	private int[] anIntArray211 = new int[256];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private int[] anIntArray212 = new int[256];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "[I")
	private int[] anIntArray213 = new int[256];

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	private int[] anIntArray214 = new int[256];

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "[I")
	private int[] anIntArray215 = new int[256];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	public int anInt710;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!xb;ZLjava/lang/String;B)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		try {
			@Pc(60) Class1_Sub1_Sub3 local60 = new Class1_Sub1_Sub3(arg0.method659(arg2 + ".dat", null), (byte) 1);
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(arg0.method659("index.dat", null), (byte) 1);
			local69.anInt743 = local60.method475() + 4;
			@Pc(80) int local80 = local69.method473();
			if (local80 > 0) {
				local69.anInt743 += (local80 - 1) * 3;
			}
			for (@Pc(94) int local94 = 0; local94 < 256; local94++) {
				this.anIntArray213[local94] = local69.method473();
				this.anIntArray214[local94] = local69.method473();
				@Pc(118) int local118 = this.anIntArray211[local94] = local69.method475();
				@Pc(126) int local126 = this.anIntArray212[local94] = local69.method475();
				@Pc(129) int local129 = local69.method473();
				@Pc(133) int local133 = local118 * local126;
				this.aByteArrayArray3[local94] = new byte[local133];
				@Pc(143) int local143;
				@Pc(168) int local168;
				if (local129 == 0) {
					for (local143 = 0; local143 < local133; local143++) {
						this.aByteArrayArray3[local94][local143] = local60.method474();
					}
				} else if (local129 == 1) {
					for (local143 = 0; local143 < local118; local143++) {
						for (local168 = 0; local168 < local126; local168++) {
							this.aByteArrayArray3[local94][local143 + local168 * local118] = local60.method474();
						}
					}
				}
				if (local126 > this.anInt710 && local94 < 128) {
					this.anInt710 = local126;
				}
				this.anIntArray213[local94] = 1;
				this.anIntArray215[local94] = local118 + 2;
				local143 = 0;
				for (local168 = local126 / 7; local168 < local126; local168++) {
					local143 += this.aByteArrayArray3[local94][local168 * local118];
				}
				@Pc(245) int local245;
				if (local143 <= local126 / 7) {
					local245 = this.anIntArray215[local94]--;
					this.anIntArray213[local94] = 0;
				}
				local143 = 0;
				for (@Pc(259) int local259 = local126 / 7; local259 < local126; local259++) {
					local143 += this.aByteArrayArray3[local94][local118 + local259 * local118 - 1];
				}
				if (local143 <= local126 / 7) {
					local245 = this.anIntArray215[local94]--;
				}
			}
			@Pc(301) boolean local301 = false;
			if (arg1) {
				this.anIntArray215[32] = this.anIntArray215[73];
			} else {
				this.anIntArray215[32] = this.anIntArray215[105];
			}
		} catch (@Pc(332) RuntimeException local332) {
			signlink.reporterror("36332, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local332.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;Z)V")
	public void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			this.method446(arg0 - this.method445(arg3) / 2, arg3, arg2, arg1);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("80904, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method448(arg2, this.anInt707, arg4, arg1, arg0 - this.method445(arg2) / 2, arg3);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("35733, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method445(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray215[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("3749, " + -43341 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(7) int local7 = arg3 - this.anInt710;
				for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
					@Pc(15) char local15 = arg1.charAt(local9);
					if (local15 != ' ') {
						this.method451(this.aByteArrayArray3[local15], arg0 + this.anIntArray213[local15], local7 + this.anIntArray214[local15], this.anIntArray211[local15], this.anIntArray212[local15], arg2);
					}
					arg0 += this.anIntArray215[local15];
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("5577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IIIII)V")
	public void method447(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method445(arg0) / 2;
				@Pc(25) int local25 = arg1 - this.anInt710;
				for (@Pc(27) int local27 = 0; local27 < arg0.length(); local27++) {
					@Pc(33) char local33 = arg0.charAt(local27);
					if (local33 != ' ') {
						this.method451(this.aByteArrayArray3[local33], arg2 + this.anIntArray213[local33], local25 + this.anIntArray214[local33] + (int) (Math.sin((double) local27 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray211[local33], this.anIntArray212[local33], arg3);
					}
					arg2 += this.anIntArray215[local33];
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("36814, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6 + ", " + arg4 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public void method448(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			this.aBoolean174 = false;
			@Pc(6) int local6 = arg4;
			if (arg0 != null) {
				@Pc(14) int local14 = arg3 - this.anInt710;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method450(arg0.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg5 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg0.charAt(local16);
						if (local60 != ' ') {
							if (arg2) {
								this.method451(this.aByteArrayArray3[local60], arg4 + this.anIntArray213[local60] + 1, local14 + this.anIntArray214[local60] + 1, this.anIntArray211[local60], this.anIntArray212[local60], 0);
							}
							this.method451(this.aByteArrayArray3[local60], arg4 + this.anIntArray213[local60], local14 + this.anIntArray214[local60], this.anIntArray211[local60], this.anIntArray212[local60], arg5);
						}
						arg4 += this.anIntArray215[local60];
					}
				}
				if (arg1 > 0 && this.aBoolean174) {
					Class1_Sub1_Sub2.method439(arg4 - local6, 8388608, local6, local14 + (int) ((double) this.anInt710 * 0.7D));
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("93093, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILjava/lang/String;IIIZ)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg5);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt710;
				for (@Pc(24) int local24 = 0; local24 < arg2.length(); local24++) {
					if (arg2.charAt(local24) == '@' && local24 + 4 < arg2.length() && arg2.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method450(arg2.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg4 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg2.charAt(local24);
						if (local68 != ' ') {
							this.method453(local22 + this.anIntArray214[local68] + 1, this.aByteArrayArray3[local68], arg1 + this.anIntArray213[local68] + 1, 0, this.anIntArray212[local68], 192, this.anIntArray211[local68]);
							this.method453(local22 + this.anIntArray214[local68], this.aByteArrayArray3[local68], arg1 + this.anIntArray213[local68], arg4, this.anIntArray212[local68], local17, this.anIntArray211[local68]);
						}
						arg1 += this.anIntArray215[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
				if (arg0 == 12122) {
					;
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("15749, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	private int method450(@OriginalArg(0) String arg0) {
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
			signlink.reporterror("15528, " + arg0 + ", " + -13619 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIIIII)V")
	private void method451(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			this.method452(Class1_Sub1_Sub2.anIntArray210, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method452(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIIIZII)V")
	private void method453(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 * Class1_Sub1_Sub2.anInt696;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt696 - arg6;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg0 < Class1_Sub1_Sub2.anInt698) {
				local20 = Class1_Sub1_Sub2.anInt698 - arg0;
				arg4 -= local20;
				arg0 = Class1_Sub1_Sub2.anInt698;
				local13 = local20 * arg6 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg0 + arg4 >= Class1_Sub1_Sub2.anInt699) {
				arg4 -= arg0 + arg4 + 1 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt700) {
				local20 = Class1_Sub1_Sub2.anInt700 - arg2;
				arg6 -= local20;
				arg2 = Class1_Sub1_Sub2.anInt700;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg2 + arg6 >= Class1_Sub1_Sub2.anInt701) {
				local20 = arg2 + arg6 + 1 - Class1_Sub1_Sub2.anInt701;
				arg6 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg6 > 0 && arg4 > 0) {
				this.method454(arg4, arg1, arg3, arg6, local11, arg5, local5, Class1_Sub1_Sub2.anIntArray210, local13, local9);
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("14458, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIIIII[IIII)V")
	private void method454(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(26) int local26 = ((arg2 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg5 & 0xFF0000) >> 8;
			@Pc(30) int local30 = 256 - arg5;
			for (@Pc(33) int local33 = -arg0; local33 < 0; local33++) {
				for (@Pc(38) int local38 = -arg3; local38 < 0; local38++) {
					if (arg1[arg8++] == 0) {
						arg6++;
					} else {
						@Pc(49) int local49 = arg7[arg6];
						arg7[arg6++] = (((local49 & 0xFF00FF) * local30 & 0xFF00FF00) + ((local49 & 0xFF00) * local30 & 0xFF0000) >> 8) + local26;
					}
				}
				arg6 += arg9;
				arg8 += arg4;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("85058, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -701 + ", " + arg8 + ", " + arg9 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}
}
