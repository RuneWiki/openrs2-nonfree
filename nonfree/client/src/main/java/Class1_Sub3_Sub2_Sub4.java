import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub3_Sub2_Sub4 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[I")
	private static int[] anIntArray160 = new int[256];

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private int anInt376 = -449;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt377 = 331;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "[[B")
	private byte[][] aByteArrayArray3 = new byte[94][];

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
	private int[] anIntArray154 = new int[94];

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
	private int[] anIntArray155 = new int[94];

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "[I")
	private int[] anIntArray156 = new int[94];

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
	private int[] anIntArray157 = new int[94];

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	private int[] anIntArray158 = new int[95];

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
	private int[] anIntArray159 = new int[256];

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt379;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
	private int anInt378;

	static {
		@Pc(4) String local4 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(11) int local11 = local4.indexOf(local6);
			if (local11 == -1) {
				local11 = 74;
			}
			anIntArray160[local6] = local11;
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!tb;Z)V")
	public Class1_Sub3_Sub2_Sub4(@OriginalArg(0) String arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(57) Class1_Sub3_Sub3 local57 = new Class1_Sub3_Sub3(arg1.method428(null, arg0 + ".dat"), (byte) 63);
		@Pc(67) Class1_Sub3_Sub3 local67 = new Class1_Sub3_Sub3(arg1.method428(null, "index.dat"), (byte) 63);
		local67.anInt394 = local57.method333() + 4;
		@Pc(76) int local76 = local67.method331();
		if (local76 > 0) {
			local67.anInt394 += (local76 - 1) * 3;
		}
		@Pc(112) int local112;
		for (@Pc(90) int local90 = 0; local90 < 94; local90++) {
			this.anIntArray156[local90] = local67.method331();
			this.anIntArray157[local90] = local67.method331();
			local112 = this.anIntArray154[local90] = local67.method333();
			@Pc(120) int local120 = this.anIntArray155[local90] = local67.method333();
			@Pc(123) int local123 = local67.method331();
			@Pc(127) int local127 = local112 * local120;
			this.aByteArrayArray3[local90] = new byte[local127];
			@Pc(137) int local137;
			@Pc(162) int local162;
			if (local123 == 0) {
				for (local137 = 0; local137 < local127; local137++) {
					this.aByteArrayArray3[local90][local137] = local57.method332();
				}
			} else if (local123 == 1) {
				for (local137 = 0; local137 < local112; local137++) {
					for (local162 = 0; local162 < local120; local162++) {
						this.aByteArrayArray3[local90][local137 + local162 * local112] = local57.method332();
					}
				}
			}
			if (local120 > this.anInt379) {
				this.anInt379 = local120;
			}
			this.anIntArray156[local90] = 1;
			this.anIntArray158[local90] = local112 + 2;
			local137 = 0;
			for (local162 = local120 / 7; local162 < local120; local162++) {
				local137 += this.aByteArrayArray3[local90][local162 * local112];
			}
			@Pc(236) int local236;
			if (local137 <= local120 / 7) {
				local236 = this.anIntArray158[local90]--;
				this.anIntArray156[local90] = 0;
			}
			local137 = 0;
			for (@Pc(250) int local250 = local120 / 7; local250 < local120; local250++) {
				local137 += this.aByteArrayArray3[local90][local112 + local250 * local112 - 1];
			}
			if (local137 <= local120 / 7) {
				local236 = this.anIntArray158[local90]--;
			}
		}
		this.anIntArray158[94] = this.anIntArray158[8];
		for (local112 = 0; local112 < 256; local112++) {
			this.anIntArray159[local112] = this.anIntArray158[anIntArray160[local112]];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILjava/lang/String;)V")
	public void method274(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		if (arg1) {
			for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
			}
		}
		this.method277(arg4, arg2 - this.method276(arg4) / 2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;IIIZ)V")
	public void method275(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.method279(arg5, arg0 - this.method276(arg1) / 2, arg2, arg4, arg1);
		if (arg3 >= 0) {
			for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method276(@OriginalArg(1) String arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0.length(); local9++) {
			if (arg0.charAt(local9) == '@' && local9 + 4 < arg0.length() && arg0.charAt(local9 + 4) == '@') {
				local9 += 4;
			} else {
				local7 += this.anIntArray159[arg0.charAt(local9)];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public void method277(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = arg2 - this.anInt379;
		for (@Pc(15) int local15 = 0; local15 < arg0.length(); local15++) {
			@Pc(23) int local23 = anIntArray160[arg0.charAt(local15)];
			if (local23 != 94) {
				this.method280(this.aByteArrayArray3[local23], arg1 + this.anIntArray156[local23], local13 + this.anIntArray157[local23], this.anIntArray154[local23], this.anIntArray155[local23], arg3);
			}
			arg1 += this.anIntArray158[local23];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBIILjava/lang/String;)V")
	public void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		arg0 -= this.method276(arg4) / 2;
		@Pc(19) int local19 = arg3 - this.anInt379;
		for (@Pc(21) int local21 = 0; local21 < arg4.length(); local21++) {
			@Pc(29) int local29 = anIntArray160[arg4.charAt(local21)];
			if (local29 != 94) {
				this.method280(this.aByteArrayArray3[local29], arg0 + this.anIntArray156[local29], local19 + this.anIntArray157[local29] + (int) (Math.sin((double) local21 / 2.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray154[local29], this.anIntArray155[local29], arg1);
			}
			arg0 += this.anIntArray158[local29];
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIIIZLjava/lang/String;)V")
	public void method279(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4) {
		@Pc(6) int local6 = arg2 - this.anInt379;
		for (@Pc(8) int local8 = 0; local8 < arg4.length(); local8++) {
			if (arg4.charAt(local8) == '@' && local8 + 4 < arg4.length() && arg4.charAt(local8 + 4) == '@') {
				@Pc(37) String local37 = arg4.substring(local8 + 1, local8 + 4);
				if (local37.equals("red")) {
					arg3 = 16711680;
				}
				if (local37.equals("gre")) {
					arg3 = 65280;
				}
				if (local37.equals("blu")) {
					arg3 = 255;
				}
				if (local37.equals("yel")) {
					arg3 = 16776960;
				}
				if (local37.equals("cya")) {
					arg3 = 65535;
				}
				if (local37.equals("mag")) {
					arg3 = 16711935;
				}
				if (local37.equals("whi")) {
					arg3 = 16777215;
				}
				if (local37.equals("bla")) {
					arg3 = 0;
				}
				if (local37.equals("lre")) {
					arg3 = 16748608;
				}
				if (local37.equals("dre")) {
					arg3 = 8388608;
				}
				if (local37.equals("dbl")) {
					arg3 = 128;
				}
				if (local37.equals("or1")) {
					arg3 = 16756736;
				}
				if (local37.equals("or2")) {
					arg3 = 16740352;
				}
				if (local37.equals("or3")) {
					arg3 = 16723968;
				}
				if (local37.equals("gr1")) {
					arg3 = 12648192;
				}
				if (local37.equals("gr2")) {
					arg3 = 8453888;
				}
				if (local37.equals("gr3")) {
					arg3 = 4259584;
				}
				local8 += 4;
			} else {
				@Pc(148) int local148 = anIntArray160[arg4.charAt(local8)];
				if (local148 != 94) {
					if (arg0) {
						this.method280(this.aByteArrayArray3[local148], arg1 + this.anIntArray156[local148] + 1, local6 + this.anIntArray157[local148] + 1, this.anIntArray154[local148], this.anIntArray155[local148], 0);
					}
					this.method280(this.aByteArrayArray3[local148], arg1 + this.anIntArray156[local148], local6 + this.anIntArray157[local148], this.anIntArray154[local148], this.anIntArray155[local148], arg3);
				}
				arg1 += this.anIntArray158[local148];
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIIIII)V")
	private void method280(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class1_Sub3_Sub2.anInt367;
		@Pc(9) int local9 = Class1_Sub3_Sub2.anInt367 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class1_Sub3_Sub2.anInt369) {
			local20 = Class1_Sub3_Sub2.anInt369 - arg2;
			arg4 -= local20;
			arg2 = Class1_Sub3_Sub2.anInt369;
			local13 = local20 * arg3;
			local5 += local20 * Class1_Sub3_Sub2.anInt367;
		}
		if (arg2 + arg4 >= Class1_Sub3_Sub2.anInt370) {
			arg4 -= arg2 + arg4 + 1 - Class1_Sub3_Sub2.anInt370;
		}
		if (arg1 < Class1_Sub3_Sub2.anInt371) {
			local20 = Class1_Sub3_Sub2.anInt371 - arg1;
			arg3 -= local20;
			arg1 = Class1_Sub3_Sub2.anInt371;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class1_Sub3_Sub2.anInt372) {
			local20 = arg1 + arg3 + 1 - Class1_Sub3_Sub2.anInt372;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method281(Class1_Sub3_Sub2.anIntArray153, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method281(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
