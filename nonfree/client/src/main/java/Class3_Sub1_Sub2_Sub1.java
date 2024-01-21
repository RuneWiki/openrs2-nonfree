import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BTJUXBKR")
public final class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!BTJUXBKR", name = "z", descriptor = "I")
	private int anInt62 = 790;

	@OriginalMember(owner = "client!BTJUXBKR", name = "A", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!BTJUXBKR", name = "B", descriptor = "I")
	private int anInt63 = -902;

	@OriginalMember(owner = "client!BTJUXBKR", name = "C", descriptor = "I")
	private int anInt64 = 7;

	@OriginalMember(owner = "client!BTJUXBKR", name = "D", descriptor = "I")
	private int anInt65 = -462;

	@OriginalMember(owner = "client!BTJUXBKR", name = "E", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!BTJUXBKR", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!BTJUXBKR", name = "G", descriptor = "[I")
	private int[] anIntArray9 = new int[256];

	@OriginalMember(owner = "client!BTJUXBKR", name = "H", descriptor = "[I")
	private int[] anIntArray10 = new int[256];

	@OriginalMember(owner = "client!BTJUXBKR", name = "I", descriptor = "[I")
	private int[] anIntArray11 = new int[256];

	@OriginalMember(owner = "client!BTJUXBKR", name = "J", descriptor = "[I")
	private int[] anIntArray12 = new int[256];

	@OriginalMember(owner = "client!BTJUXBKR", name = "K", descriptor = "[I")
	private int[] anIntArray13 = new int[256];

	@OriginalMember(owner = "client!BTJUXBKR", name = "M", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!BTJUXBKR", name = "N", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!BTJUXBKR", name = "L", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!BTJUXBKR", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!RPFMUSNN;BZ)V")
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(69) Class3_Sub1_Sub4 local69 = new Class3_Sub1_Sub4((byte) -58, arg1.method341(arg0 + ".dat", null));
			@Pc(78) Class3_Sub1_Sub4 local78 = new Class3_Sub1_Sub4((byte) -58, arg1.method341("index.dat", null));
			local78.anInt666 = local69.method460() + 4;
			@Pc(96) int local96 = local78.method458();
			if (local96 > 0) {
				local78.anInt666 += (local96 - 1) * 3;
			}
			for (@Pc(110) int local110 = 0; local110 < 256; local110++) {
				this.anIntArray11[local110] = local78.method458();
				this.anIntArray12[local110] = local78.method458();
				@Pc(140) int local140 = this.anIntArray9[local110] = local78.method460();
				@Pc(148) int local148 = this.anIntArray10[local110] = local78.method460();
				@Pc(151) int local151 = local78.method458();
				@Pc(155) int local155 = local140 * local148;
				this.aByteArrayArray1[local110] = new byte[local155];
				@Pc(165) int local165;
				@Pc(190) int local190;
				if (local151 == 0) {
					for (local165 = 0; local165 < local155; local165++) {
						this.aByteArrayArray1[local110][local165] = local69.method459();
					}
				} else if (local151 == 1) {
					for (local165 = 0; local165 < local140; local165++) {
						for (local190 = 0; local190 < local148; local190++) {
							this.aByteArrayArray1[local110][local165 + local190 * local140] = local69.method459();
						}
					}
				}
				if (local148 > this.anInt66 && local110 < 128) {
					this.anInt66 = local148;
				}
				this.anIntArray11[local110] = 1;
				this.anIntArray13[local110] = local140 + 2;
				local165 = 0;
				for (local190 = local148 / 7; local190 < local148; local190++) {
					local165 += this.aByteArrayArray1[local110][local190 * local140];
				}
				@Pc(267) int local267;
				if (local165 <= local148 / 7) {
					local267 = this.anIntArray13[local110]--;
					this.anIntArray11[local110] = 0;
				}
				local165 = 0;
				for (@Pc(281) int local281 = local148 / 7; local281 < local148; local281++) {
					local165 += this.aByteArrayArray1[local110][local140 + local281 * local140 - 1];
				}
				if (local165 <= local148 / 7) {
					local267 = this.anIntArray13[local110]--;
				}
			}
			if (arg3) {
				this.anIntArray13[32] = this.anIntArray13[73];
			} else {
				this.anIntArray13[32] = this.anIntArray13[105];
			}
		} catch (@Pc(340) RuntimeException local340) {
			signlink.reporterror("97769, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local340.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			this.method49(507 - this.method48(arg0), arg1, arg0, arg2, this.anInt63);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("16382, " + arg0 + ", " + arg1 + ", " + -738 + ", " + arg2 + ", " + 507 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method45(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			this.method49(arg2 - this.method48(arg1) / 2, arg3, arg1, arg0, this.anInt63);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("82227, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(Ljava/lang/String;ZIZII)V")
	public void method46(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method53((byte) 1, arg2, arg1, arg4, arg3 - this.method47(this.anInt62, arg0) / 2, arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("87646, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method47(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg0 <= 0) {
				this.aBoolean17 = !this.aBoolean17;
			}
			if (arg1 == null) {
				return 0;
			}
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
				if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local17 += this.anIntArray13[arg1.charAt(local19)];
				}
			}
			return local17;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("41855, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method48(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local10 += this.anIntArray13[arg0.charAt(local12)];
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("76323, " + -162 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg3 - this.anInt66;
				if (arg4 < 0) {
					for (@Pc(12) int local12 = 0; local12 < arg2.length(); local12++) {
						@Pc(18) char local18 = arg2.charAt(local12);
						if (local18 != ' ') {
							this.method56(this.aByteArrayArray1[local18], arg0 + this.anIntArray11[local18], local7 + this.anIntArray12[local18], this.anIntArray9[local18], this.anIntArray10[local18], arg1);
						}
						arg0 += this.anIntArray13[local18];
					}
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("98725, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(ILjava/lang/String;IIII)V")
	public void method50(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg2 -= this.method48(arg0) / 2;
				@Pc(16) int local16 = arg4 - this.anInt66;
				for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
					@Pc(24) char local24 = arg0.charAt(local18);
					if (local24 != ' ') {
						this.method56(this.aByteArrayArray1[local24], arg2 + this.anIntArray11[local24], local16 + this.anIntArray12[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray9[local24], this.anIntArray10[local24], arg1);
					}
					arg2 += this.anIntArray13[local24];
				}
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("28611, " + -298 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIBILjava/lang/String;)V")
	public void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg0 -= this.method48(arg4) / 2;
				@Pc(22) int local22 = arg3 - this.anInt66;
				for (@Pc(24) int local24 = 0; local24 < arg4.length(); local24++) {
					@Pc(30) char local30 = arg4.charAt(local24);
					if (local30 != ' ') {
						this.method56(this.aByteArrayArray1[local30], arg0 + this.anIntArray11[local30] + (int) (Math.sin((double) local24 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local22 + this.anIntArray12[local30] + (int) (Math.sin((double) local24 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray9[local30], this.anIntArray10[local30], arg2);
					}
					arg0 += this.anIntArray13[local30];
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("20702, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + arg4 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method48(arg4) / 2;
				@Pc(29) int local29 = arg1 - this.anInt66;
				for (@Pc(36) int local36 = 0; local36 < arg4.length(); local36++) {
					@Pc(42) char local42 = arg4.charAt(local36);
					if (local42 != ' ') {
						this.method56(this.aByteArrayArray1[local42], arg5 + this.anIntArray11[local42], local29 + this.anIntArray12[local42] + (int) (Math.sin((double) local36 / 1.5D + (double) arg0) * local9), this.anIntArray9[local42], this.anIntArray10[local42], arg2);
					}
					arg5 += this.anIntArray13[local42];
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("425, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(BZIIILjava/lang/String;)V")
	public void method53(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) {
		try {
			this.aBoolean19 = false;
			@Pc(6) int local6 = arg4;
			if (arg5 != null) {
				@Pc(14) int local14 = arg2 - this.anInt66;
				for (@Pc(16) int local16 = 0; local16 < arg5.length(); local16++) {
					if (arg5.charAt(local16) == '@' && local16 + 4 < arg5.length() && arg5.charAt(local16 + 4) == '@') {
						@Pc(48) int local48 = this.method55(arg5.substring(local16 + 1, local16 + 4));
						if (local48 != -1) {
							arg3 = local48;
						}
						local16 += 4;
					} else {
						@Pc(60) char local60 = arg5.charAt(local16);
						if (local60 != ' ') {
							if (arg1) {
								this.method56(this.aByteArrayArray1[local60], arg4 + this.anIntArray11[local60] + 1, local14 + this.anIntArray12[local60] + 1, this.anIntArray9[local60], this.anIntArray10[local60], 0);
							}
							this.method56(this.aByteArrayArray1[local60], arg4 + this.anIntArray11[local60], local14 + this.anIntArray12[local60], this.anIntArray9[local60], this.anIntArray10[local60], arg3);
						}
						arg4 += this.anIntArray13[local60];
					}
				}
				@Pc(140) boolean local140 = false;
				if (this.aBoolean19) {
					Class3_Sub1_Sub2.method524(local14 + (int) ((double) this.anInt66 * 0.7D), 8388608, arg4 - local6, local6);
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("97020, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IBIZILjava/lang/String;I)V")
	public void method54(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg2);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt66;
				for (@Pc(24) int local24 = 0; local24 < arg3.length(); local24++) {
					if (arg3.charAt(local24) == '@' && local24 + 4 < arg3.length() && arg3.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method55(arg3.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg4 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg3.charAt(local24);
						if (local68 != ' ') {
							this.method58(local22 + this.anIntArray12[local68] + 1, this.anInt64, this.anIntArray10[local68], arg0 + this.anIntArray11[local68] + 1, 192, 0, this.anIntArray9[local68], this.aByteArrayArray1[local68]);
							this.method58(local22 + this.anIntArray12[local68], this.anInt64, this.anIntArray10[local68], arg0 + this.anIntArray11[local68], local17, arg4, this.anIntArray9[local68], this.aByteArrayArray1[local68]);
						}
						arg0 += this.anIntArray13[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(169) RuntimeException local169) {
			signlink.reporterror("62568, " + arg0 + ", " + 1 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local169.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "c", descriptor = "(ILjava/lang/String;)I")
	private int method55(@OriginalArg(1) String arg0) {
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
					this.aBoolean19 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean19 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("77673, " + 354 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "([BIIIII)V")
	private void method56(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub1_Sub2.anInt758;
		@Pc(9) int local9 = Class3_Sub1_Sub2.anInt758 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub1_Sub2.anInt760) {
			local20 = Class3_Sub1_Sub2.anInt760 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub1_Sub2.anInt760;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub1_Sub2.anInt758;
		}
		if (arg2 + arg4 >= Class3_Sub1_Sub2.anInt761) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub1_Sub2.anInt761;
		}
		if (arg1 < Class3_Sub1_Sub2.anInt762) {
			local20 = Class3_Sub1_Sub2.anInt762 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub1_Sub2.anInt762;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub1_Sub2.anInt763) {
			local20 = arg1 + arg3 + 1 - Class3_Sub1_Sub2.anInt763;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method57(Class3_Sub1_Sub2.anIntArray181, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method57(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(IIIIIII[B)V")
	private void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7) {
		try {
			@Pc(5) int local5 = arg3 + arg0 * Class3_Sub1_Sub2.anInt758;
			@Pc(9) int local9 = Class3_Sub1_Sub2.anInt758 - arg6;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (arg1 == 7) {
				@Pc(24) int local24;
				if (arg0 < Class3_Sub1_Sub2.anInt760) {
					local24 = Class3_Sub1_Sub2.anInt760 - arg0;
					arg2 -= local24;
					arg0 = Class3_Sub1_Sub2.anInt760;
					local13 = local24 * arg6 + 0;
					local5 += local24 * Class3_Sub1_Sub2.anInt758;
				}
				if (arg0 + arg2 >= Class3_Sub1_Sub2.anInt761) {
					arg2 -= arg0 + arg2 + 1 - Class3_Sub1_Sub2.anInt761;
				}
				if (arg3 < Class3_Sub1_Sub2.anInt762) {
					local24 = Class3_Sub1_Sub2.anInt762 - arg3;
					arg6 -= local24;
					arg3 = Class3_Sub1_Sub2.anInt762;
					local13 += local24;
					local5 += local24;
					local11 = local24 + 0;
					local9 += local24;
				}
				if (arg3 + arg6 >= Class3_Sub1_Sub2.anInt763) {
					local24 = arg3 + arg6 + 1 - Class3_Sub1_Sub2.anInt763;
					arg6 -= local24;
					local11 += local24;
					local9 += local24;
				}
				if (arg6 > 0 && arg2 > 0) {
					this.method59((byte) 4, local5, Class3_Sub1_Sub2.anIntArray181, arg5, arg4, local11, local13, local9, arg6, arg7, arg2);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("39909, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BTJUXBKR", name = "a", descriptor = "(BI[IIIIIII[BI)V")
	private void method59(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg3 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg4;
			@Pc(28) boolean local28 = false;
			for (@Pc(41) int local41 = -arg10; local41 < 0; local41++) {
				for (@Pc(46) int local46 = -arg8; local46 < 0; local46++) {
					if (arg9[arg6++] == 0) {
						arg1++;
					} else {
						@Pc(57) int local57 = arg2[arg1];
						arg2[arg1++] = (((local57 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local57 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg1 += arg7;
				arg6 += arg5;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("88529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
