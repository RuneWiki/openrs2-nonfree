import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZGPIKWUW")
public final class Class8_Sub1_Sub2_Sub4 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZGPIKWUW", name = "x", descriptor = "I")
	private int anInt795;

	@OriginalMember(owner = "client!ZGPIKWUW", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "z", descriptor = "[I")
	private int[] anIntArray205 = new int[256];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "A", descriptor = "[I")
	private int[] anIntArray206 = new int[256];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "B", descriptor = "[I")
	private int[] anIntArray207 = new int[256];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "C", descriptor = "[I")
	private int[] anIntArray208 = new int[256];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "D", descriptor = "[I")
	private int[] anIntArray209 = new int[256];

	@OriginalMember(owner = "client!ZGPIKWUW", name = "F", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ZGPIKWUW", name = "G", descriptor = "Z")
	private boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ZGPIKWUW", name = "E", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!ZGPIKWUW", name = "<init>", descriptor = "(Lclient!SXKKBWPU;BLjava/lang/String;Z)V")
	public Class8_Sub1_Sub2_Sub4(@OriginalArg(0) Class35 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		try {
			@Pc(51) Class8_Sub1_Sub3 local51 = new Class8_Sub1_Sub3(arg0.method364(arg2 + ".dat", null), -631);
			@Pc(60) Class8_Sub1_Sub3 local60 = new Class8_Sub1_Sub3(arg0.method364("index.dat", null), -631);
			local60.anInt620 = local51.method408() + 4;
			@Pc(71) int local71 = local60.method406();
			if (local71 > 0) {
				local60.anInt620 += (local71 - 1) * 3;
			}
			for (@Pc(85) int local85 = 0; local85 < 256; local85++) {
				this.anIntArray207[local85] = local60.method406();
				this.anIntArray208[local85] = local60.method406();
				@Pc(109) int local109 = this.anIntArray205[local85] = local60.method408();
				@Pc(117) int local117 = this.anIntArray206[local85] = local60.method408();
				@Pc(120) int local120 = local60.method406();
				@Pc(124) int local124 = local109 * local117;
				this.aByteArrayArray4[local85] = new byte[local124];
				@Pc(134) int local134;
				@Pc(159) int local159;
				if (local120 == 0) {
					for (local134 = 0; local134 < local124; local134++) {
						this.aByteArrayArray4[local85][local134] = local51.method407();
					}
				} else if (local120 == 1) {
					for (local134 = 0; local134 < local109; local134++) {
						for (local159 = 0; local159 < local117; local159++) {
							this.aByteArrayArray4[local85][local134 + local159 * local109] = local51.method407();
						}
					}
				}
				if (local117 > this.anInt796 && local85 < 128) {
					this.anInt796 = local117;
				}
				this.anIntArray207[local85] = 1;
				this.anIntArray209[local85] = local109 + 2;
				local134 = 0;
				for (local159 = local117 / 7; local159 < local117; local159++) {
					local134 += this.aByteArrayArray4[local85][local159 * local109];
				}
				@Pc(236) int local236;
				if (local134 <= local117 / 7) {
					local236 = this.anIntArray209[local85]--;
					this.anIntArray207[local85] = 0;
				}
				local134 = 0;
				for (@Pc(250) int local250 = local117 / 7; local250 < local117; local250++) {
					local134 += this.aByteArrayArray4[local85][local109 + local250 * local109 - 1];
				}
				if (local134 <= local117 / 7) {
					local236 = this.anIntArray209[local85]--;
				}
			}
			if (arg3) {
				this.anIntArray209[32] = this.anIntArray209[73];
			} else {
				this.anIntArray209[32] = this.anIntArray209[105];
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("36734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public void method560(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		try {
			this.method565(arg0, arg2, arg1, 507 - this.method564(arg1));
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("65235, " + arg0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method565(arg3, arg0, arg2, arg1 - this.method564(arg2) / 2);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("44508, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.method569(arg4, arg1 - this.method563(arg3) / 2, arg2, arg0, arg3);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("2287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -918 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method563(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray209[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("39347, " + -6377 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method564(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local16 += this.anIntArray209[arg0.charAt(local18)];
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("16446, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 != null) {
				@Pc(9) int local9 = arg0 - this.anInt796;
				for (@Pc(20) int local20 = 0; local20 < arg2.length(); local20++) {
					@Pc(26) char local26 = arg2.charAt(local20);
					if (local26 != ' ') {
						this.method572(this.aByteArrayArray4[local26], arg3 + this.anIntArray207[local26], local9 + this.anIntArray208[local26], this.anIntArray205[local26], this.anIntArray206[local26], arg1);
					}
					arg3 += this.anIntArray209[local26];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("36383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 914 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 != null) {
				arg1 -= this.method564(arg3) / 2;
				@Pc(16) int local16 = arg0 - this.anInt796;
				for (@Pc(18) int local18 = 0; local18 < arg3.length(); local18++) {
					@Pc(24) char local24 = arg3.charAt(local18);
					if (local24 != ' ') {
						this.method572(this.aByteArrayArray4[local24], arg1 + this.anIntArray207[local24], local16 + this.anIntArray208[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg5 / 5.0D) * 5.0D), this.anIntArray205[local24], this.anIntArray206[local24], arg2);
					}
					arg1 += this.anIntArray209[local24];
				}
				if (arg4 != 0) {
					this.anInt795 = 266;
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("69610, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 != null) {
				arg1 -= this.method564(arg3) / 2;
				@Pc(16) int local16 = arg2 - this.anInt796;
				for (@Pc(21) int local21 = 0; local21 < arg3.length(); local21++) {
					@Pc(27) char local27 = arg3.charAt(local21);
					if (local27 != ' ') {
						this.method572(this.aByteArrayArray4[local27], arg1 + this.anIntArray207[local27] + (int) (Math.sin((double) local21 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local16 + this.anIntArray208[local27] + (int) (Math.sin((double) local21 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray205[local27], this.anIntArray206[local27], arg4);
					}
					arg1 += this.anIntArray209[local27];
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("62880, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;IIIII)V")
	public void method568(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg3 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method564(arg0) / 2;
				@Pc(29) int local29 = arg1 - this.anInt796;
				for (@Pc(35) int local35 = 0; local35 < arg0.length(); local35++) {
					@Pc(41) char local41 = arg0.charAt(local35);
					if (local41 != ' ') {
						this.method572(this.aByteArrayArray4[local41], arg5 + this.anIntArray207[local41], local29 + this.anIntArray208[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg2) * local9), this.anIntArray205[local41], this.anIntArray206[local41], arg4);
					}
					arg5 += this.anIntArray209[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("66378, " + -34278 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(IIIZILjava/lang/String;)V")
	public void method569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			this.aBoolean195 = false;
			@Pc(15) int local15 = arg1;
			if (arg4 != null) {
				@Pc(23) int local23 = arg3 - this.anInt796;
				for (@Pc(25) int local25 = 0; local25 < arg4.length(); local25++) {
					if (arg4.charAt(local25) == '@' && local25 + 4 < arg4.length() && arg4.charAt(local25 + 4) == '@') {
						@Pc(57) int local57 = this.method571(arg4.substring(local25 + 1, local25 + 4));
						if (local57 != -1) {
							arg0 = local57;
						}
						local25 += 4;
					} else {
						@Pc(69) char local69 = arg4.charAt(local25);
						if (local69 != ' ') {
							if (arg2) {
								this.method572(this.aByteArrayArray4[local69], arg1 + this.anIntArray207[local69] + 1, local23 + this.anIntArray208[local69] + 1, this.anIntArray205[local69], this.anIntArray206[local69], 0);
							}
							this.method572(this.aByteArrayArray4[local69], arg1 + this.anIntArray207[local69], local23 + this.anIntArray208[local69], this.anIntArray205[local69], this.anIntArray206[local69], arg0);
						}
						arg1 += this.anIntArray209[local69];
					}
				}
				if (this.aBoolean195) {
					Class8_Sub1_Sub2.method556(8388608, local23 + (int) ((double) this.anInt796 * 0.7D), local15, arg1 - local15);
				}
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("23023, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(ILjava/lang/String;BIZII)V")
	public void method570(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) boolean local22 = false;
				@Pc(32) int local32 = 15 - this.anInt796;
				for (@Pc(34) int local34 = 0; local34 < arg1.length(); local34++) {
					if (arg1.charAt(local34) == '@' && local34 + 4 < arg1.length() && arg1.charAt(local34 + 4) == '@') {
						@Pc(66) int local66 = this.method571(arg1.substring(local34 + 1, local34 + 4));
						if (local66 != -1) {
							arg5 = local66;
						}
						local34 += 4;
					} else {
						@Pc(78) char local78 = arg1.charAt(local34);
						if (local78 != ' ') {
							this.method574(local32 + this.anIntArray208[local78] + 1, 192, arg3 + this.anIntArray207[local78] + 1, this.aByteArrayArray4[local78], this.anIntArray205[local78], this.anIntArray206[local78], 0);
							this.method574(local32 + this.anIntArray208[local78], local17, arg3 + this.anIntArray207[local78], this.aByteArrayArray4[local78], this.anIntArray205[local78], this.anIntArray206[local78], arg5);
						}
						arg3 += this.anIntArray209[local78];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg3++;
						}
					}
				}
			}
		} catch (@Pc(166) RuntimeException local166) {
			signlink.reporterror("83859, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + local166.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(Ljava/lang/String;B)I")
	private int method571(@OriginalArg(0) String arg0) {
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
					this.aBoolean195 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean195 = false;
				}
				return -1;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("25876, " + arg0 + ", " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "([BIIIII)V")
	private void method572(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class8_Sub1_Sub2.anInt786;
		@Pc(9) int local9 = Class8_Sub1_Sub2.anInt786 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class8_Sub1_Sub2.anInt788) {
			local20 = Class8_Sub1_Sub2.anInt788 - arg2;
			arg4 -= local20;
			arg2 = Class8_Sub1_Sub2.anInt788;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class8_Sub1_Sub2.anInt786;
		}
		if (arg2 + arg4 >= Class8_Sub1_Sub2.anInt789) {
			arg4 -= arg2 + arg4 + 1 - Class8_Sub1_Sub2.anInt789;
		}
		if (arg1 < Class8_Sub1_Sub2.anInt790) {
			local20 = Class8_Sub1_Sub2.anInt790 - arg1;
			arg3 -= local20;
			arg1 = Class8_Sub1_Sub2.anInt790;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class8_Sub1_Sub2.anInt791) {
			local20 = arg1 + arg3 + 1 - Class8_Sub1_Sub2.anInt791;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method573(Class8_Sub1_Sub2.anIntArray204, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method573(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(BIII[BIII)V")
	private void method574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 * Class8_Sub1_Sub2.anInt786;
			@Pc(9) int local9 = Class8_Sub1_Sub2.anInt786 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(24) int local24;
			if (arg0 < Class8_Sub1_Sub2.anInt788) {
				local24 = Class8_Sub1_Sub2.anInt788 - arg0;
				arg5 -= local24;
				arg0 = Class8_Sub1_Sub2.anInt788;
				local13 = local24 * arg4 + 0;
				local5 += local24 * Class8_Sub1_Sub2.anInt786;
			}
			if (arg0 + arg5 >= Class8_Sub1_Sub2.anInt789) {
				arg5 -= arg0 + arg5 + 1 - Class8_Sub1_Sub2.anInt789;
			}
			if (arg2 < Class8_Sub1_Sub2.anInt790) {
				local24 = Class8_Sub1_Sub2.anInt790 - arg2;
				arg4 -= local24;
				arg2 = Class8_Sub1_Sub2.anInt790;
				local13 += local24;
				local5 += local24;
				local11 = local24 + 0;
				local9 += local24;
			}
			if (arg2 + arg4 >= Class8_Sub1_Sub2.anInt791) {
				local24 = arg2 + arg4 + 1 - Class8_Sub1_Sub2.anInt791;
				arg4 -= local24;
				local11 += local24;
				local9 += local24;
			}
			if (arg4 > 0 && arg5 > 0) {
				this.method575(arg5, arg6, arg3, local5, local11, arg4, local13, Class8_Sub1_Sub2.anIntArray204, local9, arg1);
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("51511, " + 6 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZGPIKWUW", name = "a", descriptor = "(II[BBIIII[III)V")
	private void method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg1 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(27) int local27 = 256 - arg9;
			for (@Pc(30) int local30 = -arg0; local30 < 0; local30++) {
				for (@Pc(35) int local35 = -arg5; local35 < 0; local35++) {
					if (arg2[arg6++] == 0) {
						arg3++;
					} else {
						@Pc(46) int local46 = arg7[arg3];
						arg7[arg3++] = (((local46 & 0xFF00FF) * local27 & 0xFF00FF00) + ((local46 & 0xFF00) * local27 & 0xFF0000) >> 8) + local19;
					}
				}
				arg3 += arg8;
				arg6 += arg4;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("60137, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 10 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
