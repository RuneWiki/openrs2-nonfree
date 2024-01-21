import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DIVYVFFL")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!DIVYVFFL", name = "B", descriptor = "I")
	private int anInt144;

	@OriginalMember(owner = "client!DIVYVFFL", name = "z", descriptor = "I")
	private int anInt142 = 71;

	@OriginalMember(owner = "client!DIVYVFFL", name = "A", descriptor = "I")
	private int anInt143 = 2239;

	@OriginalMember(owner = "client!DIVYVFFL", name = "C", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!DIVYVFFL", name = "D", descriptor = "Z")
	private boolean aBoolean44 = true;

	@OriginalMember(owner = "client!DIVYVFFL", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray1 = new byte[256][];

	@OriginalMember(owner = "client!DIVYVFFL", name = "F", descriptor = "[I")
	private int[] anIntArray22 = new int[256];

	@OriginalMember(owner = "client!DIVYVFFL", name = "G", descriptor = "[I")
	private int[] anIntArray23 = new int[256];

	@OriginalMember(owner = "client!DIVYVFFL", name = "H", descriptor = "[I")
	private int[] anIntArray24 = new int[256];

	@OriginalMember(owner = "client!DIVYVFFL", name = "I", descriptor = "[I")
	private int[] anIntArray25 = new int[256];

	@OriginalMember(owner = "client!DIVYVFFL", name = "J", descriptor = "[I")
	private int[] anIntArray26 = new int[256];

	@OriginalMember(owner = "client!DIVYVFFL", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!DIVYVFFL", name = "M", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!DIVYVFFL", name = "K", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!DIVYVFFL", name = "<init>", descriptor = "(ZLjava/lang/String;Lclient!BYZSQZUF;I)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(63) Class3_Sub1_Sub3 local63 = new Class3_Sub1_Sub3(0, arg2.method66(arg1 + ".dat", null));
			@Pc(72) Class3_Sub1_Sub3 local72 = new Class3_Sub1_Sub3(0, arg2.method66("index.dat", null));
			local72.anInt243 = local63.method148() + 4;
			@Pc(93) int local93 = local72.method146();
			if (local93 > 0) {
				local72.anInt243 += (local93 - 1) * 3;
			}
			for (@Pc(107) int local107 = 0; local107 < 256; local107++) {
				this.anIntArray24[local107] = local72.method146();
				this.anIntArray25[local107] = local72.method146();
				@Pc(131) int local131 = this.anIntArray22[local107] = local72.method148();
				@Pc(139) int local139 = this.anIntArray23[local107] = local72.method148();
				@Pc(142) int local142 = local72.method146();
				@Pc(146) int local146 = local131 * local139;
				this.aByteArrayArray1[local107] = new byte[local146];
				@Pc(156) int local156;
				@Pc(181) int local181;
				if (local142 == 0) {
					for (local156 = 0; local156 < local146; local156++) {
						this.aByteArrayArray1[local107][local156] = local63.method147();
					}
				} else if (local142 == 1) {
					for (local156 = 0; local156 < local131; local156++) {
						for (local181 = 0; local181 < local139; local181++) {
							this.aByteArrayArray1[local107][local156 + local181 * local131] = local63.method147();
						}
					}
				}
				if (local139 > this.anInt145 && local107 < 128) {
					this.anInt145 = local139;
				}
				this.anIntArray24[local107] = 1;
				this.anIntArray26[local107] = local131 + 2;
				local156 = 0;
				for (local181 = local139 / 7; local181 < local139; local181++) {
					local156 += this.aByteArrayArray1[local107][local181 * local131];
				}
				@Pc(258) int local258;
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray26[local107]--;
					this.anIntArray24[local107] = 0;
				}
				local156 = 0;
				for (@Pc(272) int local272 = local139 / 7; local272 < local139; local272++) {
					local156 += this.aByteArrayArray1[local107][local131 + local272 * local131 - 1];
				}
				if (local156 <= local139 / 7) {
					local258 = this.anIntArray26[local107]--;
				}
			}
			if (arg0) {
				this.anIntArray26[32] = this.anIntArray26[73];
			} else {
				this.anIntArray26[32] = this.anIntArray26[105];
			}
		} catch (@Pc(331) RuntimeException local331) {
			signlink.reporterror("85567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local331.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method84(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		try {
			this.method89(arg2, arg0, 507 - this.method88(arg0), arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("10572, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 507 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method85(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method89(arg0, arg3, arg2 - this.method88(arg3) / 2, arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("217, " + -35924 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public void method86(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		try {
			this.method93(arg4, arg0, arg3, arg2, arg1 - this.method87(arg0) / 2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("29912, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -771 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method87(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
				if (arg0.charAt(local15) == '@' && local15 + 4 < arg0.length() && arg0.charAt(local15 + 4) == '@') {
					local15 += 4;
				} else {
					local13 += this.anIntArray26[arg0.charAt(local15)];
				}
			}
			return local13;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("46430, " + 47982 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method88(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(12) int local12 = 0; local12 < arg0.length(); local12++) {
				local5 += this.anIntArray26[arg0.charAt(local12)];
			}
			return local5;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("64136, " + true + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method89(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(9) int local9 = arg0 - this.anInt145;
				for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
					@Pc(28) char local28 = arg1.charAt(local22);
					if (local28 != ' ') {
						this.method96(this.aByteArrayArray1[local28], arg2 + this.anIntArray24[local28], local9 + this.anIntArray25[local28], this.anIntArray22[local28], this.anIntArray23[local28], arg3);
					}
					arg2 += this.anIntArray26[local28];
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("33026, " + arg0 + ", " + arg1 + ", " + -412 + ", " + arg2 + ", " + arg3 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;III)V")
	public void method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method88(arg2) / 2;
				@Pc(19) int local19 = arg0 - this.anInt145;
				for (@Pc(21) int local21 = 0; local21 < arg2.length(); local21++) {
					@Pc(27) char local27 = arg2.charAt(local21);
					if (local27 != ' ') {
						this.method96(this.aByteArrayArray1[local27], arg3 + this.anIntArray24[local27], local19 + this.anIntArray25[local27] + (int) (Math.sin((double) local21 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray22[local27], this.anIntArray23[local27], arg4);
					}
					arg3 += this.anIntArray26[local27];
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("18933, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IBILjava/lang/String;II)V")
	public void method91(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 != null) {
				arg3 -= this.method88(arg2) / 2;
				@Pc(20) int local20 = arg4 - this.anInt145;
				for (@Pc(22) int local22 = 0; local22 < arg2.length(); local22++) {
					@Pc(28) char local28 = arg2.charAt(local22);
					if (local28 != ' ') {
						this.method96(this.aByteArrayArray1[local28], arg3 + this.anIntArray24[local28] + (int) (Math.sin((double) local22 / 5.0D + (double) arg1 / 5.0D) * 5.0D), local20 + this.anIntArray25[local28] + (int) (Math.sin((double) local22 / 3.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray22[local28], this.anIntArray23[local28], arg0);
					}
					arg3 += this.anIntArray26[local28];
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("5645, " + arg0 + ", " + -99 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg1 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg3 -= this.method88(arg2) / 2;
				@Pc(33) int local33 = arg5 - this.anInt145;
				for (@Pc(35) int local35 = 0; local35 < arg2.length(); local35++) {
					@Pc(41) char local41 = arg2.charAt(local35);
					if (local41 != ' ') {
						this.method96(this.aByteArrayArray1[local41], arg3 + this.anIntArray24[local41], local33 + this.anIntArray25[local41] + (int) (Math.sin((double) local35 / 1.5D + (double) arg0) * local9), this.anIntArray22[local41], this.anIntArray23[local41], arg4);
					}
					arg3 += this.anIntArray26[local41];
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("58707, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + arg5 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(ILjava/lang/String;ZIII)V")
	public void method93(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean45 = false;
			@Pc(16) int local16 = arg4;
			if (arg1 != null) {
				@Pc(24) int local24 = arg3 - this.anInt145;
				for (@Pc(26) int local26 = 0; local26 < arg1.length(); local26++) {
					if (arg1.charAt(local26) == '@' && local26 + 4 < arg1.length() && arg1.charAt(local26 + 4) == '@') {
						@Pc(58) int local58 = this.method95(arg1.substring(local26 + 1, local26 + 4));
						if (local58 != -1) {
							arg0 = local58;
						}
						local26 += 4;
					} else {
						@Pc(70) char local70 = arg1.charAt(local26);
						if (local70 != ' ') {
							if (arg2) {
								this.method96(this.aByteArrayArray1[local70], arg4 + this.anIntArray24[local70] + 1, local24 + this.anIntArray25[local70] + 1, this.anIntArray22[local70], this.anIntArray23[local70], 0);
							}
							this.method96(this.aByteArrayArray1[local70], arg4 + this.anIntArray24[local70], local24 + this.anIntArray25[local70], this.anIntArray22[local70], this.anIntArray23[local70], arg0);
						}
						arg4 += this.anIntArray26[local70];
					}
				}
				if (this.aBoolean45) {
					Class3_Sub1_Sub1.method545(8388608, local16, local24 + (int) ((double) this.anInt145 * 0.7D), arg4 - local16);
				}
			}
		} catch (@Pc(165) RuntimeException local165) {
			signlink.reporterror("13670, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local165.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IILjava/lang/String;ZIII)V")
	public void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg2 != null) {
				this.aRandom1.setSeed((long) arg4);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(28) int local28 = 15 - this.anInt145;
				for (@Pc(30) int local30 = 0; local30 < arg2.length(); local30++) {
					if (arg2.charAt(local30) == '@' && local30 + 4 < arg2.length() && arg2.charAt(local30 + 4) == '@') {
						@Pc(62) int local62 = this.method95(arg2.substring(local30 + 1, local30 + 4));
						if (local62 != -1) {
							arg3 = local62;
						}
						local30 += 4;
					} else {
						@Pc(74) char local74 = arg2.charAt(local30);
						if (local74 != ' ') {
							this.method98(this.aByteArrayArray1[local74], 192, 0, arg1 + this.anIntArray24[local74] + 1, this.anIntArray23[local74], this.anIntArray22[local74], local28 + this.anIntArray25[local74] + 1);
							this.method98(this.aByteArrayArray1[local74], local17, arg3, arg1 + this.anIntArray24[local74], this.anIntArray23[local74], this.anIntArray22[local74], local28 + this.anIntArray25[local74]);
						}
						arg1 += this.anIntArray26[local74];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("49270, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + 36526 + ", " + arg4 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method95(@OriginalArg(1) String arg0) {
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
					this.aBoolean45 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean45 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("29735, " + -563 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "([BIIIII)V")
	private void method96(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub1_Sub1.anInt760;
		@Pc(9) int local9 = Class3_Sub1_Sub1.anInt760 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub1_Sub1.anInt762) {
			local20 = Class3_Sub1_Sub1.anInt762 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub1_Sub1.anInt762;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub1_Sub1.anInt760;
		}
		if (arg2 + arg4 >= Class3_Sub1_Sub1.anInt763) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub1_Sub1.anInt763;
		}
		if (arg1 < Class3_Sub1_Sub1.anInt764) {
			local20 = Class3_Sub1_Sub1.anInt764 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub1_Sub1.anInt764;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub1_Sub1.anInt765) {
			local20 = arg1 + arg3 + 1 - Class3_Sub1_Sub1.anInt765;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method97(Class3_Sub1_Sub1.anIntArray203, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "([I[BIIIIIII)V")
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

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(I[BIIIIII)V")
	private void method98(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg3 + arg6 * Class3_Sub1_Sub1.anInt760;
			@Pc(9) int local9 = Class3_Sub1_Sub1.anInt760 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(25) int local25;
			if (arg6 < Class3_Sub1_Sub1.anInt762) {
				local25 = Class3_Sub1_Sub1.anInt762 - arg6;
				arg4 -= local25;
				arg6 = Class3_Sub1_Sub1.anInt762;
				local13 = local25 * arg5 + 0;
				local5 += local25 * Class3_Sub1_Sub1.anInt760;
			}
			if (arg6 + arg4 >= Class3_Sub1_Sub1.anInt763) {
				arg4 -= arg6 + arg4 + 1 - Class3_Sub1_Sub1.anInt763;
			}
			if (arg3 < Class3_Sub1_Sub1.anInt764) {
				local25 = Class3_Sub1_Sub1.anInt764 - arg3;
				arg5 -= local25;
				arg3 = Class3_Sub1_Sub1.anInt764;
				local13 += local25;
				local5 += local25;
				local11 = local25 + 0;
				local9 += local25;
			}
			if (arg3 + arg5 >= Class3_Sub1_Sub1.anInt765) {
				local25 = arg3 + arg5 + 1 - Class3_Sub1_Sub1.anInt765;
				arg5 -= local25;
				local11 += local25;
				local9 += local25;
			}
			if (arg5 > 0 && arg4 > 0) {
				this.method99(local11, arg5, local9, local5, arg2, arg4, arg0, local13, Class3_Sub1_Sub1.anIntArray203, arg1);
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("77057, " + -103 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DIVYVFFL", name = "a", descriptor = "(IIIIIII[BI[II)V")
	private void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg4 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg9 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg9;
			for (@Pc(26) int local26 = -arg5; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg1; local31 < 0; local31++) {
					if (arg6[arg7++] == 0) {
						arg3++;
					} else {
						@Pc(42) int local42 = arg8[arg3];
						arg8[arg3++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg3 += arg2;
				arg7 += arg0;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("52193, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
