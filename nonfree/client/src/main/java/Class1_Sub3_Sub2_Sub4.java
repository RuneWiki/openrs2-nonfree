import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "[I")
	private static int[] anIntArray185 = new int[256];

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "B")
	private byte aByte42 = 4;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt526 = 6;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt527 = -514;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[I")
	private int[] anIntArray179 = new int[94];

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	private int[] anIntArray180 = new int[94];

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	private int[] anIntArray181 = new int[94];

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[I")
	private int[] anIntArray182 = new int[94];

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	private int[] anIntArray183 = new int[95];

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[I")
	private int[] anIntArray184 = new int[256];

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt528;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray185[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljava/lang/String;ILclient!ub;)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2) {
		try {
			@Pc(58) Class1_Sub3_Sub3 local58 = new Class1_Sub3_Sub3(arg2.method528(this.aByte42, arg0 + ".dat", null), 0);
			@Pc(76) Class1_Sub3_Sub3 local76 = new Class1_Sub3_Sub3(arg2.method528(this.aByte42, "index.dat", null), 0);
			local76.anInt548 = local58.method385() + 4;
			@Pc(85) int local85 = local76.method383();
			if (local85 > 0) {
				local76.anInt548 += (local85 - 1) * 3;
			}
			@Pc(121) int local121;
			for (@Pc(99) int local99 = 0; local99 < 94; local99++) {
				this.anIntArray181[local99] = local76.method383();
				this.anIntArray182[local99] = local76.method383();
				local121 = this.anIntArray179[local99] = local76.method385();
				@Pc(129) int local129 = this.anIntArray180[local99] = local76.method385();
				@Pc(132) int local132 = local76.method383();
				@Pc(136) int local136 = local121 * local129;
				this.aByteArrayArray3[local99] = new byte[local136];
				@Pc(146) int local146;
				@Pc(171) int local171;
				if (local132 == 0) {
					for (local146 = 0; local146 < local136; local146++) {
						this.aByteArrayArray3[local99][local146] = local58.method384();
					}
				} else if (local132 == 1) {
					for (local146 = 0; local146 < local121; local146++) {
						for (local171 = 0; local171 < local129; local171++) {
							this.aByteArrayArray3[local99][local146 + local171 * local121] = local58.method384();
						}
					}
				}
				if (local129 > this.anInt528) {
					this.anInt528 = local129;
				}
				this.anIntArray181[local99] = 1;
				this.anIntArray183[local99] = local121 + 2;
				local146 = 0;
				for (local171 = local129 / 7; local171 < local129; local171++) {
					local146 += this.aByteArrayArray3[local99][local171 * local121];
				}
				@Pc(245) int local245;
				if (local146 <= local129 / 7) {
					local245 = this.anIntArray183[local99]--;
					this.anIntArray181[local99] = 0;
				}
				local146 = 0;
				for (@Pc(259) int local259 = local129 / 7; local259 < local129; local259++) {
					local146 += this.aByteArrayArray3[local99][local121 + local259 * local121 - 1];
				}
				if (local146 <= local129 / 7) {
					local245 = this.anIntArray183[local99]--;
				}
			}
			this.anIntArray183[94] = this.anIntArray183[8];
			for (local121 = 0; local121 < 256; local121++) {
				this.anIntArray184[local121] = this.anIntArray183[anIntArray185[local121]];
			}
		} catch (@Pc(330) RuntimeException local330) {
			signlink.reporterror("89444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local330.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public void method358(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			this.method361(476, arg0, arg1, arg2 - this.method360(arg1) / 2, arg3);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("58560, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;IIZI)V")
	public void method359(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			this.method363(arg0, arg2, arg4 - this.method360(arg0) / 2, arg3, arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57128, " + -45560 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method360(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray184[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("90369, " + arg0 + ", " + 9 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IILjava/lang/String;II)V")
	public void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 != null) {
				@Pc(7) int local7 = arg1 - this.anInt528;
				for (@Pc(9) int local9 = 0; local9 < arg2.length(); local9++) {
					@Pc(17) int local17 = anIntArray185[arg2.charAt(local9)];
					if (local17 != 94) {
						this.method364(this.aByteArrayArray3[local17], arg3 + this.anIntArray181[local17], local7 + this.anIntArray182[local17], this.anIntArray179[local17], this.anIntArray180[local17], arg4);
					}
					arg3 += this.anIntArray183[local17];
				}
				@Pc(63) boolean local63 = false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("77105, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIILjava/lang/String;)V")
	public void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg2 -= this.method360(arg4) / 2;
				@Pc(18) int local18 = arg3 - this.anInt528;
				for (@Pc(20) int local20 = 0; local20 < arg4.length(); local20++) {
					@Pc(28) int local28 = anIntArray185[arg4.charAt(local20)];
					if (local28 != 94) {
						this.method364(this.aByteArrayArray3[local28], arg2 + this.anIntArray181[local28], local18 + this.anIntArray182[local28] + (int) (Math.sin((double) local20 / 2.0D + (double) arg1 / 5.0D) * 5.0D), this.anIntArray179[local28], this.anIntArray180[local28], arg0);
					}
					arg2 += this.anIntArray183[local28];
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("59806, " + arg0 + ", " + arg1 + ", " + -873 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;IZIZI)V")
	public void method363(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				@Pc(14) int local14 = arg4 - this.anInt528;
				for (@Pc(16) int local16 = 0; local16 < arg0.length(); local16++) {
					if (arg0.charAt(local16) == '@' && local16 + 4 < arg0.length() && arg0.charAt(local16 + 4) == '@') {
						@Pc(45) String local45 = arg0.substring(local16 + 1, local16 + 4);
						if (local45.equals("red")) {
							arg1 = 16711680;
						}
						if (local45.equals("gre")) {
							arg1 = 65280;
						}
						if (local45.equals("blu")) {
							arg1 = 255;
						}
						if (local45.equals("yel")) {
							arg1 = 16776960;
						}
						if (local45.equals("cya")) {
							arg1 = 65535;
						}
						if (local45.equals("mag")) {
							arg1 = 16711935;
						}
						if (local45.equals("whi")) {
							arg1 = 16777215;
						}
						if (local45.equals("bla")) {
							arg1 = 0;
						}
						if (local45.equals("lre")) {
							arg1 = 16748608;
						}
						if (local45.equals("dre")) {
							arg1 = 8388608;
						}
						if (local45.equals("dbl")) {
							arg1 = 128;
						}
						if (local45.equals("or1")) {
							arg1 = 16756736;
						}
						if (local45.equals("or2")) {
							arg1 = 16740352;
						}
						if (local45.equals("or3")) {
							arg1 = 16723968;
						}
						if (local45.equals("gr1")) {
							arg1 = 12648192;
						}
						if (local45.equals("gr2")) {
							arg1 = 8453888;
						}
						if (local45.equals("gr3")) {
							arg1 = 4259584;
						}
						local16 += 4;
					} else {
						@Pc(156) int local156 = anIntArray185[arg0.charAt(local16)];
						if (local156 != 94) {
							if (arg3) {
								this.method364(this.aByteArrayArray3[local156], arg2 + this.anIntArray181[local156] + 1, local14 + this.anIntArray182[local156] + 1, this.anIntArray179[local156], this.anIntArray180[local156], 0);
							}
							this.method364(this.aByteArrayArray3[local156], arg2 + this.anIntArray181[local156], local14 + this.anIntArray182[local156], this.anIntArray179[local156], this.anIntArray180[local156], arg1);
						}
						arg2 += this.anIntArray183[local156];
					}
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("96789, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIIIII)V")
	private void method364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt516;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt516 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt518) {
			local20 = Class1_Sub3_Sub2.anInt518 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt518;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub3_Sub2.anInt516;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt519) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt519;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt520) {
			local20 = Class1_Sub3_Sub2.anInt520 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt520;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt521) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt521;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method365(Class1_Sub3_Sub2.anIntArray178, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method365(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
}
