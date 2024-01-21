import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!THSQSAVT")
public final class Class3_Sub1_Sub3_Sub4 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!THSQSAVT", name = "x", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!THSQSAVT", name = "y", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!THSQSAVT", name = "z", descriptor = "I")
	private int anInt672 = -459;

	@OriginalMember(owner = "client!THSQSAVT", name = "A", descriptor = "B")
	private byte aByte27 = -115;

	@OriginalMember(owner = "client!THSQSAVT", name = "B", descriptor = "I")
	private int anInt673 = -73;

	@OriginalMember(owner = "client!THSQSAVT", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[256][];

	@OriginalMember(owner = "client!THSQSAVT", name = "D", descriptor = "[I")
	private int[] anIntArray163 = new int[256];

	@OriginalMember(owner = "client!THSQSAVT", name = "E", descriptor = "[I")
	private int[] anIntArray164 = new int[256];

	@OriginalMember(owner = "client!THSQSAVT", name = "F", descriptor = "[I")
	private int[] anIntArray165 = new int[256];

	@OriginalMember(owner = "client!THSQSAVT", name = "G", descriptor = "[I")
	private int[] anIntArray166 = new int[256];

	@OriginalMember(owner = "client!THSQSAVT", name = "H", descriptor = "[I")
	private int[] anIntArray167 = new int[256];

	@OriginalMember(owner = "client!THSQSAVT", name = "J", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!THSQSAVT", name = "K", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!THSQSAVT", name = "I", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!THSQSAVT", name = "<init>", descriptor = "(Lclient!DTIATKJO;Ljava/lang/String;ZI)V")
	public Class3_Sub1_Sub3_Sub4(@OriginalArg(0) Class7 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(66) Class3_Sub1_Sub2 local66 = new Class3_Sub1_Sub2(-527, arg0.method30(arg1 + ".dat", null));
			@Pc(75) Class3_Sub1_Sub2 local75 = new Class3_Sub1_Sub2(-527, arg0.method30("index.dat", null));
			@Pc(81) int local81 = 46 / arg3;
			local75.anInt257 = local66.method91() + 4;
			@Pc(90) int local90 = local75.method89();
			if (local90 > 0) {
				local75.anInt257 += (local90 - 1) * 3;
			}
			for (@Pc(104) int local104 = 0; local104 < 256; local104++) {
				this.anIntArray165[local104] = local75.method89();
				this.anIntArray166[local104] = local75.method89();
				@Pc(128) int local128 = this.anIntArray163[local104] = local75.method91();
				@Pc(136) int local136 = this.anIntArray164[local104] = local75.method91();
				@Pc(139) int local139 = local75.method89();
				@Pc(143) int local143 = local128 * local136;
				this.aByteArrayArray3[local104] = new byte[local143];
				@Pc(153) int local153;
				@Pc(178) int local178;
				if (local139 == 0) {
					for (local153 = 0; local153 < local143; local153++) {
						this.aByteArrayArray3[local104][local153] = local66.method90();
					}
				} else if (local139 == 1) {
					for (local153 = 0; local153 < local128; local153++) {
						for (local178 = 0; local178 < local136; local178++) {
							this.aByteArrayArray3[local104][local153 + local178 * local128] = local66.method90();
						}
					}
				}
				if (local136 > this.anInt674 && local104 < 128) {
					this.anInt674 = local136;
				}
				this.anIntArray165[local104] = 1;
				this.anIntArray167[local104] = local128 + 2;
				local153 = 0;
				for (local178 = local136 / 7; local178 < local136; local178++) {
					local153 += this.aByteArrayArray3[local104][local178 * local128];
				}
				@Pc(255) int local255;
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray167[local104]--;
					this.anIntArray165[local104] = 0;
				}
				local153 = 0;
				for (@Pc(269) int local269 = local136 / 7; local269 < local136; local269++) {
					local153 += this.aByteArrayArray3[local104][local128 + local269 * local128 - 1];
				}
				if (local153 <= local136 / 7) {
					local255 = this.anIntArray167[local104]--;
				}
			}
			if (arg2) {
				this.anIntArray167[32] = this.anIntArray167[73];
			} else {
				this.anIntArray167[32] = this.anIntArray167[105];
			}
		} catch (@Pc(328) RuntimeException local328) {
			signlink.reporterror("98237, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local328.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) String arg2) {
		try {
			this.method444(arg0, arg2, arg1, 507 - this.method443(arg2));
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("51257, " + arg0 + ", " + 507 + ", " + arg1 + ", " + 17401 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		try {
			this.method444(arg2, arg3, arg0, arg1 - this.method443(arg3) / 2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 6600 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(ZIIILjava/lang/String;I)V")
	public void method441(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.method448(arg4 - this.method442(arg3) / 2, arg3, arg1, arg2, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("29090, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method442(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
				if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
					local9 += 4;
				} else {
					local7 += this.anIntArray167[arg0.charAt(local9)];
				}
			}
			return local7;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("54495, " + arg0 + ", " + 0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method443(@OriginalArg(1) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			for (@Pc(18) int local18 = 0; local18 < arg0.length(); local18++) {
				local5 += this.anIntArray167[arg0.charAt(local18)];
			}
			return local5;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("99464, " + -7791 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public void method444(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 != null) {
				@Pc(11) int local11 = arg2 - this.anInt674;
				for (@Pc(13) int local13 = 0; local13 < arg1.length(); local13++) {
					@Pc(19) char local19 = arg1.charAt(local13);
					if (local19 != ' ') {
						this.method451(this.aByteArrayArray3[local19], arg3 + this.anIntArray165[local19], local11 + this.anIntArray166[local19], this.anIntArray163[local19], this.anIntArray164[local19], arg0);
					}
					arg3 += this.anIntArray167[local19];
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("78075, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;ZI)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method443(arg3) / 2;
				@Pc(16) int local16 = arg1 - this.anInt674;
				for (@Pc(18) int local18 = 0; local18 < arg3.length(); local18++) {
					@Pc(24) char local24 = arg3.charAt(local18);
					if (local24 != ' ') {
						this.method451(this.aByteArrayArray3[local24], arg2 + this.anIntArray165[local24], local16 + this.anIntArray166[local24] + (int) (Math.sin((double) local18 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray163[local24], this.anIntArray164[local24], arg4);
					}
					arg2 += this.anIntArray167[local24];
				}
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("30375, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIILjava/lang/String;BI)V")
	public void method446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg1 -= this.method443(arg3) / 2;
				@Pc(25) int local25 = arg2 - this.anInt674;
				for (@Pc(27) int local27 = 0; local27 < arg3.length(); local27++) {
					@Pc(33) char local33 = arg3.charAt(local27);
					if (local33 != ' ') {
						this.method451(this.aByteArrayArray3[local33], arg1 + this.anIntArray165[local33] + (int) (Math.sin((double) local27 / 5.0D + (double) arg0 / 5.0D) * 5.0D), local25 + this.anIntArray166[local33] + (int) (Math.sin((double) local27 / 3.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray163[local33], this.anIntArray164[local33], arg4);
					}
					arg1 += this.anIntArray167[local33];
				}
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("69789, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIIIILjava/lang/String;I)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 != null) {
				@Pc(11) double local11 = 7.0D - (double) arg2 / 8.0D;
				if (local11 < 0.0D) {
					local11 = 0.0D;
				}
				arg1 -= this.method443(arg4) / 2;
				@Pc(40) int local40 = arg0 - this.anInt674;
				for (@Pc(42) int local42 = 0; local42 < arg4.length(); local42++) {
					@Pc(48) char local48 = arg4.charAt(local42);
					if (local48 != ' ') {
						this.method451(this.aByteArrayArray3[local48], arg1 + this.anIntArray165[local48], local40 + this.anIntArray166[local48] + (int) (Math.sin((double) local42 / 1.5D + (double) arg3) * local11), this.anIntArray163[local48], this.anIntArray164[local48], arg5);
					}
					arg1 += this.anIntArray167[local48];
				}
			}
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("52252, " + arg0 + ", " + -459 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(ILjava/lang/String;IIZZ)V")
	public void method448(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			this.aBoolean164 = false;
			@Pc(6) int local6 = arg0;
			if (arg1 != null) {
				@Pc(14) int local14 = arg3 - this.anInt674;
				for (@Pc(19) int local19 = 0; local19 < arg1.length(); local19++) {
					if (arg1.charAt(local19) == '@' && local19 + 4 < arg1.length() && arg1.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method450(arg1.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg2 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg1.charAt(local19);
						if (local63 != ' ') {
							if (arg4) {
								this.method451(this.aByteArrayArray3[local63], arg0 + this.anIntArray165[local63] + 1, local14 + this.anIntArray166[local63] + 1, this.anIntArray163[local63], this.anIntArray164[local63], 0);
							}
							this.method451(this.aByteArrayArray3[local63], arg0 + this.anIntArray165[local63], local14 + this.anIntArray166[local63], this.anIntArray163[local63], this.anIntArray164[local63], arg2);
						}
						arg0 += this.anIntArray167[local63];
					}
				}
				if (this.aBoolean164) {
					Class3_Sub1_Sub3.method435(local6, arg0 - local6, 8388608, local14 + (int) ((double) this.anInt674 * 0.7D));
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("3503, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIZILjava/lang/String;ZI)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(6) int arg4) {
		try {
			if (arg3 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt674;
				for (@Pc(27) int local27 = 0; local27 < arg3.length(); local27++) {
					if (arg3.charAt(local27) == '@' && local27 + 4 < arg3.length() && arg3.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method450(arg3.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg1 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg3.charAt(local27);
						if (local71 != ' ') {
							this.method453(local25 + this.anIntArray166[local71] + 1, 192, arg2 + this.anIntArray165[local71] + 1, this.anIntArray164[local71], this.aByteArrayArray3[local71], this.anIntArray163[local71], 0);
							this.method453(local25 + this.anIntArray166[local71], local20, arg2 + this.anIntArray165[local71], this.anIntArray164[local71], this.aByteArrayArray3[local71], this.anIntArray163[local71], arg1);
						}
						arg2 += this.anIntArray167[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg2++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("93642, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "b", descriptor = "(ILjava/lang/String;)I")
	private int method450(@OriginalArg(1) String arg0) {
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
					this.aBoolean164 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean164 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("89796, " + 5 + ", " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "([BIIIII)V")
	private void method451(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub1_Sub3.anInt663;
		@Pc(9) int local9 = Class3_Sub1_Sub3.anInt663 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub1_Sub3.anInt665) {
			local20 = Class3_Sub1_Sub3.anInt665 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub1_Sub3.anInt665;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub1_Sub3.anInt663;
		}
		if (arg2 + arg4 >= Class3_Sub1_Sub3.anInt666) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub1_Sub3.anInt666;
		}
		if (arg1 < Class3_Sub1_Sub3.anInt667) {
			local20 = Class3_Sub1_Sub3.anInt667 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub1_Sub3.anInt667;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub1_Sub3.anInt668) {
			local20 = arg1 + arg3 + 1 - Class3_Sub1_Sub3.anInt668;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method452(Class3_Sub1_Sub3.anIntArray162, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "([I[BIIIIIII)V")
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

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(IIIBI[BII)V")
	private void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg2 + arg0 * Class3_Sub1_Sub3.anInt663;
			@Pc(9) int local9 = Class3_Sub1_Sub3.anInt663 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			if (this.aByte27 == -115) {
				@Pc(25) int local25;
				if (arg0 < Class3_Sub1_Sub3.anInt665) {
					local25 = Class3_Sub1_Sub3.anInt665 - arg0;
					arg3 -= local25;
					arg0 = Class3_Sub1_Sub3.anInt665;
					local13 = local25 * arg5 + 0;
					local5 += local25 * Class3_Sub1_Sub3.anInt663;
				}
				if (arg0 + arg3 >= Class3_Sub1_Sub3.anInt666) {
					arg3 -= arg0 + arg3 + 1 - Class3_Sub1_Sub3.anInt666;
				}
				if (arg2 < Class3_Sub1_Sub3.anInt667) {
					local25 = Class3_Sub1_Sub3.anInt667 - arg2;
					arg5 -= local25;
					arg2 = Class3_Sub1_Sub3.anInt667;
					local13 += local25;
					local5 += local25;
					local11 = local25 + 0;
					local9 += local25;
				}
				if (arg2 + arg5 >= Class3_Sub1_Sub3.anInt668) {
					local25 = arg2 + arg5 + 1 - Class3_Sub1_Sub3.anInt668;
					arg5 -= local25;
					local11 += local25;
					local9 += local25;
				}
				if (arg5 > 0 && arg3 > 0) {
					this.method454(local9, arg5, local13, arg4, local11, local5, arg1, arg3, Class3_Sub1_Sub3.anIntArray162, arg6);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("19385, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -115 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THSQSAVT", name = "a", descriptor = "(ZIII[BIIII[II)V")
	private void method454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg9 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg6 & 0xFF0000) >> 8;
			@Pc(26) int local26 = 256 - arg6;
			for (@Pc(29) int local29 = -arg7; local29 < 0; local29++) {
				for (@Pc(34) int local34 = -arg1; local34 < 0; local34++) {
					if (arg3[arg2++] == 0) {
						arg5++;
					} else {
						@Pc(45) int local45 = arg8[arg5];
						arg8[arg5++] = (((local45 & 0xFF00FF) * local26 & 0xFF00FF00) + ((local45 & 0xFF00) * local26 & 0xFF0000) >> 8) + local19;
					}
				}
				arg5 += arg0;
				arg2 += arg4;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("50680, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
