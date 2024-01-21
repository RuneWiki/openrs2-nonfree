import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "[I")
	private static int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private int anInt766 = 7;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "B")
	private byte aByte55 = 2;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
	private int anInt768 = 6;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "[I")
	private int[] anIntArray214 = new int[94];

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "[I")
	private int[] anIntArray215 = new int[94];

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
	private int[] anIntArray216 = new int[94];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
	private int[] anIntArray217 = new int[94];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "[I")
	private int[] anIntArray218 = new int[95];

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "[I")
	private int[] anIntArray219 = new int[256];

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	public int anInt769;

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

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!yb;ILjava/lang/String;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		try {
			@Pc(64) Class1_Sub1_Sub3 local64 = new Class1_Sub1_Sub3(45427, arg0.method678(arg2 + ".dat", null));
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3(45427, arg0.method678("index.dat", null));
			local73.anInt796 = local64.method500() + 4;
			@Pc(90) int local90 = local73.method498();
			if (local90 > 0) {
				local73.anInt796 += (local90 - 1) * 3;
			}
			@Pc(128) int local128;
			for (@Pc(104) int local104 = 0; local104 < 94; local104++) {
				this.anIntArray216[local104] = local73.method498();
				this.anIntArray217[local104] = local73.method498();
				local128 = this.anIntArray214[local104] = local73.method500();
				@Pc(136) int local136 = this.anIntArray215[local104] = local73.method500();
				@Pc(139) int local139 = local73.method498();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray3[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray3[local104][local153] = local64.method499();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray3[local104][local153 + local178 * local128] = local64.method499();
						}
					}
				}
				if (local136 > this.anInt769) {
					this.anInt769 = local136;
				}
				this.anIntArray216[local104] = 1;
				this.anIntArray218[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray3[local104][local178 * local128];
				}
				@Pc(252) int local252;
				if (local153 <= local136 / 7) {
					local252 = this.anIntArray218[local104]--;
					this.anIntArray216[local104] = 0;
				}
				local153 = 0;
				for (@Pc(266) int local266 = local136 / 7; local266 < local136; local266++) {
					local153 += this.aByteArrayArray3[local104][local128 + local266 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local252 = this.anIntArray218[local104]--;
				}
			}
			this.anIntArray218[94] = this.anIntArray218[8];
			for (local128 = 0; local128 < 256; local128++) {
				this.anIntArray219[local128] = this.anIntArray218[anIntArray220[local128]];
			}
		} catch (@Pc(337) RuntimeException local337) {
			signlink.reporterror("28393, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local337.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method465(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			this.method468(arg4 - this.method467((byte) 7, arg1) / 2, arg1, arg3, arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("14701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			this.method470(arg4, arg3, arg0 - this.method467((byte) 7, arg4) / 2, arg1, arg2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("10269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method467(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		try {
			if (arg1 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			@Pc(12) boolean local12 = false;
			for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
				if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
					local19 += 4;
				} else {
					local7 += this.anIntArray219[arg1.charAt(local19)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("91312, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ILjava/lang/String;III)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(18) int local18 = arg2 - this.anInt769;
				for (@Pc(20) int local20 = 0; local20 < arg1.length(); local20++) {
					@Pc(28) int local28 = anIntArray220[arg1.charAt(local20)];
					if (local28 != 94) {
						this.method473(this.aByteArrayArray3[local28], arg0 + this.anIntArray216[local28], local18 + this.anIntArray217[local28], this.anIntArray214[local28], this.anIntArray215[local28], arg3);
					}
					arg0 += this.anIntArray218[local28];
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("92380, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		try {
			if (arg4 != null) {
				arg0 -= this.method467((byte) 7, arg4) / 2;
				@Pc(16) int local16 = arg1 - this.anInt769;
				for (@Pc(22) int local22 = 0; local22 < arg4.length(); local22++) {
					@Pc(30) int local30 = anIntArray220[arg4.charAt(local22)];
					if (local30 != 94) {
						this.method473(this.aByteArrayArray3[local30], arg0 + this.anIntArray216[local30], local16 + this.anIntArray217[local30] + (int) (Math.sin((double) local22 / 2.0D + (double) arg3 / 5.0D) * 5.0D), this.anIntArray214[local30], this.anIntArray215[local30], arg2);
					}
					arg0 += this.anIntArray218[local30];
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("34475, " + arg0 + ", " + arg1 + ", " + -75 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;IIIIZ)V")
	public void method470(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.aBoolean173 = false;
			@Pc(6) int local6 = arg2;
			if (arg0 != null) {
				@Pc(18) int local18 = arg1 - this.anInt769;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(52) int local52;
					if (arg0.charAt(local20) == '@' && local20 + 4 < arg0.length() && arg0.charAt(local20 + 4) == '@') {
						local52 = this.method472(arg0.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg3 = local52;
						}
						local20 += 4;
					} else {
						local52 = anIntArray220[arg0.charAt(local20)];
						if (local52 != 94) {
							if (arg4) {
								this.method473(this.aByteArrayArray3[local52], arg2 + this.anIntArray216[local52] + 1, local18 + this.anIntArray217[local52] + 1, this.anIntArray214[local52], this.anIntArray215[local52], 0);
							}
							this.method473(this.aByteArrayArray3[local52], arg2 + this.anIntArray216[local52], local18 + this.anIntArray217[local52], this.anIntArray214[local52], this.anIntArray215[local52], arg3);
						}
						arg2 += this.anIntArray218[local52];
					}
				}
				if (this.aBoolean173) {
					Class1_Sub1_Sub2.method461(this.aByte55, 8388608, local6, arg2 - local6, local18 + (int) ((double) this.anInt769 * 0.7D));
				}
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("82916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2 + ", " + arg4 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIBILjava/lang/String;)V")
	public void method471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) String arg4) {
		try {
			if (arg4 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt769;
				for (@Pc(24) int local24 = 0; local24 < arg4.length(); local24++) {
					@Pc(56) int local56;
					if (arg4.charAt(local24) == '@' && local24 + 4 < arg4.length() && arg4.charAt(local24 + 4) == '@') {
						local56 = this.method472(arg4.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg2 = local56;
						}
						local24 += 4;
					} else {
						local56 = anIntArray220[arg4.charAt(local24)];
						if (local56 != 94) {
							this.method475(this.aByteArrayArray3[local56], 0, this.anIntArray214[local56], local22 + this.anIntArray217[local56] + 1, this.anIntArray215[local56], 192, arg0 + this.anIntArray216[local56] + 1);
							this.method475(this.aByteArrayArray3[local56], arg2, this.anIntArray214[local56], local22 + this.anIntArray217[local56], this.anIntArray215[local56], local17, arg0 + this.anIntArray216[local56]);
						}
						arg0 += this.anIntArray218[local56];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg0++;
						}
					}
				}
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("44184, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + arg4 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(BLjava/lang/String;)I")
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
					this.aBoolean173 = true;
				}
				return -1;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("14572, " + 0 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIII)V")
	private void method473(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub1_Sub2.anInt756;
		@Pc(9) int local9 = Class1_Sub1_Sub2.anInt756 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub1_Sub2.anInt758) {
			local20 = Class1_Sub1_Sub2.anInt758 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub1_Sub2.anInt758;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class1_Sub1_Sub2.anInt756;
		}
		if (arg2 + arg4 >= Class1_Sub1_Sub2.anInt759) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub1_Sub2.anInt759;
		}
		if (arg1 < Class1_Sub1_Sub2.anInt760) {
			local20 = Class1_Sub1_Sub2.anInt760 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub1_Sub2.anInt760;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub1_Sub2.anInt761) {
			local20 = arg1 + arg3 + 1 - Class1_Sub1_Sub2.anInt761;
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([BIIIIZII)V")
	private void method475(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg3 * Class1_Sub1_Sub2.anInt756;
			@Pc(9) int local9 = Class1_Sub1_Sub2.anInt756 - arg2;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg3 < Class1_Sub1_Sub2.anInt758) {
				local20 = Class1_Sub1_Sub2.anInt758 - arg3;
				arg4 -= local20;
				arg3 = Class1_Sub1_Sub2.anInt758;
				local13 = local20 * arg2 + 0;
				local5 += local20 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg3 + arg4 >= Class1_Sub1_Sub2.anInt759) {
				arg4 -= arg3 + arg4 + 1 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg6 < Class1_Sub1_Sub2.anInt760) {
				local20 = Class1_Sub1_Sub2.anInt760 - arg6;
				arg2 -= local20;
				arg6 = Class1_Sub1_Sub2.anInt760;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg6 + arg2 >= Class1_Sub1_Sub2.anInt761) {
				local20 = arg6 + arg2 + 1 - Class1_Sub1_Sub2.anInt761;
				arg2 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg2 > 0 && arg4 > 0) {
				this.method476(Class1_Sub1_Sub2.anIntArray213, arg4, local5, arg0, arg5, this.anInt767, local9, arg2, arg1, local13, local11);
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("86500, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([III[BIIIIIII)V")
	private void method476(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg8 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg4 & 0xFF0000) >> 8;
			if (arg5 != 0) {
				this.anInt768 = -425;
			}
			@Pc(28) int local28 = 256 - arg4;
			for (@Pc(31) int local31 = -arg1; local31 < 0; local31++) {
				for (@Pc(36) int local36 = -arg7; local36 < 0; local36++) {
					if (arg3[arg9++] == 0) {
						arg2++;
					} else {
						@Pc(47) int local47 = arg0[arg2];
						arg0[arg2++] = (((local47 & 0xFF00FF) * local28 & 0xFF00FF00) + ((local47 & 0xFF00) * local28 & 0xFF0000) >> 8) + local19;
					}
				}
				arg2 += arg6;
				arg9 += arg10;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("26259, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}
}
