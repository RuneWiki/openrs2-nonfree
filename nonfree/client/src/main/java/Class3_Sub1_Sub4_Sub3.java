import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SSVSGKGT")
public final class Class3_Sub1_Sub4_Sub3 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!SSVSGKGT", name = "z", descriptor = "I")
	private int anInt624;

	@OriginalMember(owner = "client!SSVSGKGT", name = "y", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!SSVSGKGT", name = "A", descriptor = "I")
	private int anInt625 = 106;

	@OriginalMember(owner = "client!SSVSGKGT", name = "B", descriptor = "B")
	private byte aByte31 = -61;

	@OriginalMember(owner = "client!SSVSGKGT", name = "C", descriptor = "I")
	private int anInt626 = 10744;

	@OriginalMember(owner = "client!SSVSGKGT", name = "D", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!SSVSGKGT", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[256][];

	@OriginalMember(owner = "client!SSVSGKGT", name = "F", descriptor = "[I")
	private int[] anIntArray169 = new int[256];

	@OriginalMember(owner = "client!SSVSGKGT", name = "G", descriptor = "[I")
	private int[] anIntArray170 = new int[256];

	@OriginalMember(owner = "client!SSVSGKGT", name = "H", descriptor = "[I")
	private int[] anIntArray171 = new int[256];

	@OriginalMember(owner = "client!SSVSGKGT", name = "I", descriptor = "[I")
	private int[] anIntArray172 = new int[256];

	@OriginalMember(owner = "client!SSVSGKGT", name = "J", descriptor = "[I")
	private int[] anIntArray173 = new int[256];

	@OriginalMember(owner = "client!SSVSGKGT", name = "L", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!SSVSGKGT", name = "M", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!SSVSGKGT", name = "K", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!SSVSGKGT", name = "<init>", descriptor = "(ILjava/lang/String;ZLclient!GWOEELWB;)V")
	public Class3_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class13 arg3) {
		try {
			@Pc(66) Class3_Sub1_Sub2 local66 = new Class3_Sub1_Sub2(true, arg3.method140(arg1 + ".dat", null));
			@Pc(75) Class3_Sub1_Sub2 local75 = new Class3_Sub1_Sub2(true, arg3.method140("index.dat", null));
			local75.anInt429 = local66.method202() + 4;
			@Pc(92) int local92 = local75.method200();
			if (local92 > 0) {
				local75.anInt429 += (local92 - 1) * 3;
			}
			for (@Pc(106) int local106 = 0; local106 < 256; local106++) {
				this.anIntArray171[local106] = local75.method200();
				this.anIntArray172[local106] = local75.method200();
				@Pc(130) int local130 = this.anIntArray169[local106] = local75.method202();
				@Pc(138) int local138 = this.anIntArray170[local106] = local75.method202();
				@Pc(141) int local141 = local75.method200();
				@Pc(145) int local145 = local130 * local138;
				this.aByteArrayArray4[local106] = new byte[local145];
				@Pc(155) int local155;
				@Pc(180) int local180;
				if (local141 == 0) {
					for (local155 = 0; local155 < local145; local155++) {
						this.aByteArrayArray4[local106][local155] = local66.method201();
					}
				} else if (local141 == 1) {
					for (local155 = 0; local155 < local130; local155++) {
						for (local180 = 0; local180 < local138; local180++) {
							this.aByteArrayArray4[local106][local155 + local180 * local130] = local66.method201();
						}
					}
				}
				if (local138 > this.anInt627 && local106 < 128) {
					this.anInt627 = local138;
				}
				this.anIntArray171[local106] = 1;
				this.anIntArray173[local106] = local130 + 2;
				local155 = 0;
				for (local180 = local138 / 7; local180 < local138; local180++) {
					local155 += this.aByteArrayArray4[local106][local180 * local130];
				}
				@Pc(257) int local257;
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray173[local106]--;
					this.anIntArray171[local106] = 0;
				}
				local155 = 0;
				for (@Pc(271) int local271 = local138 / 7; local271 < local138; local271++) {
					local155 += this.aByteArrayArray4[local106][local130 + local271 * local130 - 1];
				}
				if (local155 <= local138 / 7) {
					local257 = this.anIntArray173[local106]--;
				}
			}
			if (arg2) {
				this.anIntArray173[32] = this.anIntArray173[73];
			} else {
				this.anIntArray173[32] = this.anIntArray173[105];
			}
		} catch (@Pc(338) RuntimeException local338) {
			signlink.reporterror("13954, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local338.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method414(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) String arg2) {
		try {
			this.method419(arg1, 507 - this.method418(arg2, 106), arg0, arg2);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("16129, " + -849 + ", " + 507 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "b", descriptor = "(IIIILjava/lang/String;)V")
	public void method415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			this.method419(arg0, arg2 - this.method418(arg3, 106) / 2, arg1, arg3);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("89557, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(Ljava/lang/String;IIZII)V")
	public void method416(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.method423(arg3 - this.method417(arg0) / 2, arg4, arg2, arg0, arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("97063, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method417(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(7) int local7 = 0;
			for (@Pc(23) int local23 = 0; local23 < arg0.length(); local23++) {
				if (arg0.charAt(local23) == '@' && local23 + 4 < arg0.length() && arg0.charAt(local23 + 4) == '@') {
					local23 += 4;
				} else {
					local7 += this.anIntArray173[arg0.charAt(local23)];
				}
			}
			return local7;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("43076, " + arg0 + ", " + 9 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method418(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local5 += this.anIntArray173[arg0.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("68898, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(BIIILjava/lang/String;)V")
	public void method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg3 != null) {
				@Pc(7) int local7 = arg2 - this.anInt627;
				if (this.aByte31 != -61) {
					this.anInt624 = 482;
				}
				for (@Pc(16) int local16 = 0; local16 < arg3.length(); local16++) {
					@Pc(22) char local22 = arg3.charAt(local16);
					if (local22 != ' ') {
						this.method426(this.aByteArrayArray4[local22], arg1 + this.anIntArray171[local22], local7 + this.anIntArray172[local22], this.anIntArray169[local22], this.anIntArray170[local22], arg0);
					}
					arg1 += this.anIntArray173[local22];
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("11731, " + -61 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIIILjava/lang/String;I)V")
	public void method420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		try {
			if (arg4 != null) {
				arg3 -= this.method418(arg4, 106) / 2;
				@Pc(18) int local18 = arg1 - this.anInt627;
				for (@Pc(31) int local31 = 0; local31 < arg4.length(); local31++) {
					@Pc(37) char local37 = arg4.charAt(local31);
					if (local37 != ' ') {
						this.method426(this.aByteArrayArray4[local37], arg3 + this.anIntArray171[local37], local18 + this.anIntArray172[local37] + (int) (Math.sin((double) local31 / 2.0D + (double) arg0 / 5.0D) * 5.0D), this.anIntArray169[local37], this.anIntArray170[local37], arg2);
					}
					arg3 += this.anIntArray173[local37];
				}
			}
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("69567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -111 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIILjava/lang/String;II)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 != null) {
				arg2 -= this.method418(arg3, 106) / 2;
				@Pc(27) int local27 = arg0 - this.anInt627;
				for (@Pc(29) int local29 = 0; local29 < arg3.length(); local29++) {
					@Pc(35) char local35 = arg3.charAt(local29);
					if (local35 != ' ') {
						this.method426(this.aByteArrayArray4[local35], arg2 + this.anIntArray171[local35] + (int) (Math.sin((double) local29 / 5.0D + (double) arg4 / 5.0D) * 5.0D), local27 + this.anIntArray172[local35] + (int) (Math.sin((double) local29 / 3.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray169[local35], this.anIntArray170[local35], arg1);
					}
					arg2 += this.anIntArray173[local35];
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("27477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -3443 + ", " + arg4 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IILjava/lang/String;IIII)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 != null) {
				@Pc(9) double local9 = 7.0D - (double) arg2 / 8.0D;
				if (local9 < 0.0D) {
					local9 = 0.0D;
				}
				arg5 -= this.method418(arg1, 106) / 2;
				@Pc(29) int local29 = arg3 - this.anInt627;
				for (@Pc(31) int local31 = 0; local31 < arg1.length(); local31++) {
					@Pc(37) char local37 = arg1.charAt(local31);
					if (local37 != ' ') {
						this.method426(this.aByteArrayArray4[local37], arg5 + this.anIntArray171[local37], local29 + this.anIntArray172[local37] + (int) (Math.sin((double) local31 / 1.5D + (double) arg4) * local9), this.anIntArray169[local37], this.anIntArray170[local37], arg0);
					}
					arg5 += this.anIntArray173[local37];
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("13692, " + arg0 + ", " + -972 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIZILjava/lang/String;I)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean165 = false;
			@Pc(10) int local10 = arg0;
			if (arg3 != null) {
				@Pc(18) int local18 = arg4 - this.anInt627;
				for (@Pc(20) int local20 = 0; local20 < arg3.length(); local20++) {
					if (arg3.charAt(local20) == '@' && local20 + 4 < arg3.length() && arg3.charAt(local20 + 4) == '@') {
						@Pc(52) int local52 = this.method425(arg3.substring(local20 + 1, local20 + 4));
						if (local52 != -1) {
							arg1 = local52;
						}
						local20 += 4;
					} else {
						@Pc(64) char local64 = arg3.charAt(local20);
						if (local64 != ' ') {
							if (arg2) {
								this.method426(this.aByteArrayArray4[local64], arg0 + this.anIntArray171[local64] + 1, local18 + this.anIntArray172[local64] + 1, this.anIntArray169[local64], this.anIntArray170[local64], 0);
							}
							this.method426(this.aByteArrayArray4[local64], arg0 + this.anIntArray171[local64], local18 + this.anIntArray172[local64], this.anIntArray169[local64], this.anIntArray170[local64], arg1);
						}
						arg0 += this.anIntArray173[local64];
					}
				}
				if (this.aBoolean165) {
					Class3_Sub1_Sub4.method440(8388608, local18 + (int) ((double) this.anInt627 * 0.7D), arg0 - local10, local10);
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("71888, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 14904 + ", " + arg3 + ", " + arg4 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(ILjava/lang/String;IIIIZ)V")
	public void method424(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				this.aRandom1.setSeed((long) arg3);
				@Pc(17) int local17 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(22) int local22 = 15 - this.anInt627;
				for (@Pc(24) int local24 = 0; local24 < arg0.length(); local24++) {
					if (arg0.charAt(local24) == '@' && local24 + 4 < arg0.length() && arg0.charAt(local24 + 4) == '@') {
						@Pc(56) int local56 = this.method425(arg0.substring(local24 + 1, local24 + 4));
						if (local56 != -1) {
							arg4 = local56;
						}
						local24 += 4;
					} else {
						@Pc(68) char local68 = arg0.charAt(local24);
						if (local68 != ' ') {
							this.method428(0, 192, this.anIntArray170[local68], local22 + this.anIntArray172[local68] + 1, arg1 + this.anIntArray171[local68] + 1, this.anIntArray169[local68], this.aByteArrayArray4[local68], 359);
							this.method428(arg4, local17, this.anIntArray170[local68], local22 + this.anIntArray172[local68], arg1 + this.anIntArray171[local68], this.anIntArray169[local68], this.aByteArrayArray4[local68], 359);
						}
						arg1 += this.anIntArray173[local68];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg1++;
						}
					}
				}
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("49927, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(ILjava/lang/String;)I")
	private int method425(@OriginalArg(1) String arg0) {
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
					this.aBoolean165 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean165 = false;
				}
				return -1;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("27570, " + 0 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "([BIIIII)V")
	private void method426(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class3_Sub1_Sub4.anInt631;
		@Pc(9) int local9 = Class3_Sub1_Sub4.anInt631 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class3_Sub1_Sub4.anInt633) {
			local20 = Class3_Sub1_Sub4.anInt633 - arg2;
			arg4 -= local20;
			arg2 = Class3_Sub1_Sub4.anInt633;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class3_Sub1_Sub4.anInt631;
		}
		if (arg2 + arg4 >= Class3_Sub1_Sub4.anInt634) {
			arg4 -= arg2 + arg4 + 1 - Class3_Sub1_Sub4.anInt634;
		}
		if (arg1 < Class3_Sub1_Sub4.anInt635) {
			local20 = Class3_Sub1_Sub4.anInt635 - arg1;
			arg3 -= local20;
			arg1 = Class3_Sub1_Sub4.anInt635;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class3_Sub1_Sub4.anInt636) {
			local20 = arg1 + arg3 + 1 - Class3_Sub1_Sub4.anInt636;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method427(Class3_Sub1_Sub4.anIntArray174, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method427(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIIIII[BI)V")
	private void method428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(5) int local5 = arg4 + arg3 * Class3_Sub1_Sub4.anInt631;
			@Pc(9) int local9 = Class3_Sub1_Sub4.anInt631 - arg5;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(20) int local20;
			if (arg3 < Class3_Sub1_Sub4.anInt633) {
				local20 = Class3_Sub1_Sub4.anInt633 - arg3;
				arg2 -= local20;
				arg3 = Class3_Sub1_Sub4.anInt633;
				local13 = local20 * arg5 + 0;
				local5 += local20 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg3 + arg2 >= Class3_Sub1_Sub4.anInt634) {
				arg2 -= arg3 + arg2 + 1 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg4 < Class3_Sub1_Sub4.anInt635) {
				local20 = Class3_Sub1_Sub4.anInt635 - arg4;
				arg5 -= local20;
				arg4 = Class3_Sub1_Sub4.anInt635;
				local13 += local20;
				local5 += local20;
				local11 = local20 + 0;
				local9 += local20;
			}
			if (arg4 + arg5 >= Class3_Sub1_Sub4.anInt636) {
				local20 = arg4 + arg5 + 1 - Class3_Sub1_Sub4.anInt636;
				arg5 -= local20;
				local11 += local20;
				local9 += local20;
			}
			if (arg5 > 0 && arg2 > 0) {
				this.method429(arg2, arg1, local9, this.anInt626, local11, local5, arg6, arg0, local13, Class3_Sub1_Sub4.anIntArray174, arg5);
				@Pc(130) boolean local130 = false;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("70504, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSVSGKGT", name = "a", descriptor = "(IIIIII[BII[II)V")
	private void method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(19) int local19 = ((arg7 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg1 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg1;
			for (@Pc(26) int local26 = -arg0; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg10; local31 < 0; local31++) {
					if (arg6[arg8++] == 0) {
						arg5++;
					} else {
						@Pc(42) int local42 = arg9[arg5];
						arg9[arg5++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg5 += arg2;
				arg8 += arg4;
			}
			if (arg3 == 10744) {
				;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("75175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
