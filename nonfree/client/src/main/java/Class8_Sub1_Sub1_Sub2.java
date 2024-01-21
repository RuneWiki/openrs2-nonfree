import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DBRMEPJQ")
public final class Class8_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!DBRMEPJQ", name = "C", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "D", descriptor = "I")
	private int anInt196 = -558;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "E", descriptor = "I")
	private int anInt197 = 68;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "F", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "G", descriptor = "B")
	private byte aByte8 = 2;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "H", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "I", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "J", descriptor = "[[B")
	private byte[][] aByteArrayArray2 = new byte[256][];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "K", descriptor = "[I")
	private int[] anIntArray30 = new int[256];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "L", descriptor = "[I")
	private int[] anIntArray31 = new int[256];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "M", descriptor = "[I")
	private int[] anIntArray32 = new int[256];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "N", descriptor = "[I")
	private int[] anIntArray33 = new int[256];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "O", descriptor = "[I")
	private int[] anIntArray34 = new int[256];

	@OriginalMember(owner = "client!DBRMEPJQ", name = "Q", descriptor = "Ljava/util/Random;")
	private Random aRandom1 = new Random();

	@OriginalMember(owner = "client!DBRMEPJQ", name = "R", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "P", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!DBRMEPJQ", name = "<init>", descriptor = "(Ljava/lang/String;IZLclient!XRWUKRPO;)V")
	public Class8_Sub1_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class45 arg3) {
		try {
			@Pc(69) Class8_Sub1_Sub3 local69 = new Class8_Sub1_Sub3(arg3.method553(arg0 + ".dat", null), -49015);
			@Pc(78) Class8_Sub1_Sub3 local78 = new Class8_Sub1_Sub3(arg3.method553("index.dat", null), -49015);
			local78.anInt253 = local69.method167() + 4;
			@Pc(95) int local95 = local78.method165();
			if (local95 > 0) {
				local78.anInt253 += (local95 - 1) * 3;
			}
			for (@Pc(109) int local109 = 0; local109 < 256; local109++) {
				this.anIntArray32[local109] = local78.method165();
				this.anIntArray33[local109] = local78.method165();
				@Pc(133) int local133 = this.anIntArray30[local109] = local78.method167();
				@Pc(141) int local141 = this.anIntArray31[local109] = local78.method167();
				@Pc(144) int local144 = local78.method165();
				@Pc(148) int local148 = local133 * local141;
				this.aByteArrayArray2[local109] = new byte[local148];
				@Pc(158) int local158;
				@Pc(183) int local183;
				if (local144 == 0) {
					for (local158 = 0; local158 < local148; local158++) {
						this.aByteArrayArray2[local109][local158] = local69.method166();
					}
				} else if (local144 == 1) {
					for (local158 = 0; local158 < local133; local158++) {
						for (local183 = 0; local183 < local141; local183++) {
							this.aByteArrayArray2[local109][local158 + local183 * local133] = local69.method166();
						}
					}
				}
				if (local141 > this.anInt198 && local109 < 128) {
					this.anInt198 = local141;
				}
				this.anIntArray32[local109] = 1;
				this.anIntArray34[local109] = local133 + 2;
				local158 = 0;
				for (local183 = local141 / 7; local183 < local141; local183++) {
					local158 += this.aByteArrayArray2[local109][local183 * local133];
				}
				@Pc(260) int local260;
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray34[local109]--;
					this.anIntArray32[local109] = 0;
				}
				local158 = 0;
				for (@Pc(274) int local274 = local141 / 7; local274 < local141; local274++) {
					local158 += this.aByteArrayArray2[local109][local133 + local274 * local133 - 1];
				}
				if (local158 <= local141 / 7) {
					local260 = this.anIntArray34[local109]--;
				}
			}
			if (arg2) {
				this.anIntArray34[32] = this.anIntArray34[73];
			} else {
				this.anIntArray34[32] = this.anIntArray34[105];
			}
		} catch (@Pc(341) RuntimeException local341) {
			signlink.reporterror("86729, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local341.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public void method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		try {
			if (arg0 < 0) {
				this.method105(arg3, arg1, 507 - this.method104(arg3, this.anInt197), arg2);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("52730, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 507 + ", " + arg3 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public void method101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		try {
			this.method105(arg2, arg3, arg1 - this.method104(arg2, this.anInt197) / 2, arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("21496, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;IZ)V")
	public void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) boolean arg4) {
		try {
			this.method109(arg3, arg1, arg4, arg0 - this.method103(arg3) / 2, arg2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("24668, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method103(@OriginalArg(0) String arg0) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
				if (arg0.charAt(local20) == '@' && local20 + 4 < arg0.length() && arg0.charAt(local20 + 4) == '@') {
					local20 += 4;
				} else {
					local18 += this.anIntArray34[arg0.charAt(local20)];
				}
			}
			return local18;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("8928, " + arg0 + ", " + -989 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method104(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 == null) {
				return 0;
			}
			@Pc(5) int local5 = 0;
			@Pc(9) int local9 = 65 / arg1;
			for (@Pc(11) int local11 = 0; local11 < arg0.length(); local11++) {
				local5 += this.anIntArray34[arg0.charAt(local11)];
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("36324, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(BLjava/lang/String;III)V")
	public void method105(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 != null) {
				@Pc(18) int local18 = arg3 - this.anInt198;
				for (@Pc(20) int local20 = 0; local20 < arg0.length(); local20++) {
					@Pc(26) char local26 = arg0.charAt(local20);
					if (local26 != ' ') {
						this.method112(this.aByteArrayArray2[local26], arg2 + this.anIntArray32[local26], local18 + this.anIntArray33[local26], this.anIntArray30[local26], this.anIntArray31[local26], arg1);
					}
					arg2 += this.anIntArray34[local26];
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("522, " + 22 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IZLjava/lang/String;III)V")
	public void method106(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 != null) {
				arg0 -= this.method104(arg1, this.anInt197) / 2;
				@Pc(20) int local20 = arg2 - this.anInt198;
				for (@Pc(22) int local22 = 0; local22 < arg1.length(); local22++) {
					@Pc(28) char local28 = arg1.charAt(local22);
					if (local28 != ' ') {
						this.method112(this.aByteArrayArray2[local28], arg0 + this.anIntArray32[local28], local20 + this.anIntArray33[local28] + (int) (Math.sin((double) local22 / 2.0D + (double) arg4 / 5.0D) * 5.0D), this.anIntArray30[local28], this.anIntArray31[local28], arg3);
					}
					arg0 += this.anIntArray34[local28];
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("64650, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;IZIII)V")
	public void method107(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 != null) {
				arg4 -= this.method104(arg0, this.anInt197) / 2;
				@Pc(28) int local28 = arg3 - this.anInt198;
				for (@Pc(30) int local30 = 0; local30 < arg0.length(); local30++) {
					@Pc(36) char local36 = arg0.charAt(local30);
					if (local36 != ' ') {
						this.method112(this.aByteArrayArray2[local36], arg4 + this.anIntArray32[local36] + (int) (Math.sin((double) local30 / 5.0D + (double) arg2 / 5.0D) * 5.0D), local28 + this.anIntArray33[local36] + (int) (Math.sin((double) local30 / 3.0D + (double) arg2 / 5.0D) * 5.0D), this.anIntArray30[local36], this.anIntArray31[local36], arg1);
					}
					arg4 += this.anIntArray34[local36];
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("25639, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IIILjava/lang/String;IBI)V")
	public void method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 != null) {
				@Pc(13) double local13 = 7.0D - (double) arg0 / 8.0D;
				if (local13 < 0.0D) {
					local13 = 0.0D;
				}
				arg5 -= this.method104(arg3, this.anInt197) / 2;
				@Pc(34) int local34 = arg4 - this.anInt198;
				for (@Pc(36) int local36 = 0; local36 < arg3.length(); local36++) {
					@Pc(42) char local42 = arg3.charAt(local36);
					if (local42 != ' ') {
						this.method112(this.aByteArrayArray2[local42], arg5 + this.anIntArray32[local42], local34 + this.anIntArray33[local42] + (int) (Math.sin((double) local36 / 1.5D + (double) arg2) * local13), this.anIntArray30[local42], this.anIntArray31[local42], arg1);
					}
					arg5 += this.anIntArray34[local42];
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("43161, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -26 + ", " + arg5 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;IZZII)V")
	public void method109(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			this.aBoolean40 = false;
			@Pc(6) int local6 = arg3;
			if (arg0 != null) {
				@Pc(14) int local14 = arg1 - this.anInt198;
				for (@Pc(19) int local19 = 0; local19 < arg0.length(); local19++) {
					if (arg0.charAt(local19) == '@' && local19 + 4 < arg0.length() && arg0.charAt(local19 + 4) == '@') {
						@Pc(51) int local51 = this.method111(arg0.substring(local19 + 1, local19 + 4));
						if (local51 != -1) {
							arg4 = local51;
						}
						local19 += 4;
					} else {
						@Pc(63) char local63 = arg0.charAt(local19);
						if (local63 != ' ') {
							if (arg2) {
								this.method112(this.aByteArrayArray2[local63], arg3 + this.anIntArray32[local63] + 1, local14 + this.anIntArray33[local63] + 1, this.anIntArray30[local63], this.anIntArray31[local63], 0);
							}
							this.method112(this.aByteArrayArray2[local63], arg3 + this.anIntArray32[local63], local14 + this.anIntArray33[local63], this.anIntArray30[local63], this.anIntArray31[local63], arg4);
						}
						arg3 += this.anIntArray34[local63];
					}
				}
				if (this.aBoolean40) {
					Class8_Sub1_Sub1.method510(local6, 8388608, arg3 - local6, local14 + (int) ((double) this.anInt198 * 0.7D));
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("39214, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(IZILjava/lang/String;ZII)V")
	public void method110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (!arg3 && arg2 != null) {
				this.aRandom1.setSeed((long) arg0);
				@Pc(20) int local20 = (this.aRandom1.nextInt() & 0x1F) + 192;
				@Pc(25) int local25 = 15 - this.anInt198;
				for (@Pc(27) int local27 = 0; local27 < arg2.length(); local27++) {
					if (arg2.charAt(local27) == '@' && local27 + 4 < arg2.length() && arg2.charAt(local27 + 4) == '@') {
						@Pc(59) int local59 = this.method111(arg2.substring(local27 + 1, local27 + 4));
						if (local59 != -1) {
							arg5 = local59;
						}
						local27 += 4;
					} else {
						@Pc(71) char local71 = arg2.charAt(local27);
						if (local71 != ' ') {
							this.method114(this.anIntArray31[local71], 192, local25 + this.anIntArray33[local71] + 1, this.aByteArrayArray2[local71], this.anIntArray30[local71], 0, arg4 + this.anIntArray32[local71] + 1);
							this.method114(this.anIntArray31[local71], local20, local25 + this.anIntArray33[local71], this.aByteArrayArray2[local71], this.anIntArray30[local71], arg5, arg4 + this.anIntArray32[local71]);
						}
						arg4 += this.anIntArray34[local71];
						if ((this.aRandom1.nextInt() & 0x3) == 0) {
							arg4++;
						}
					}
				}
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("73633, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(Ljava/lang/String;B)I")
	private int method111(@OriginalArg(0) String arg0) {
		try {
			if (this.aByte8 != 2) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
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
					this.aBoolean40 = true;
				}
				if (arg0.equals("end")) {
					this.aBoolean40 = false;
				}
				return -1;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("39140, " + arg0 + ", " + 2 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "([BIIIII)V")
	private void method112(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Class8_Sub1_Sub1.anInt734;
		@Pc(9) int local9 = Class8_Sub1_Sub1.anInt734 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Class8_Sub1_Sub1.anInt736) {
			local20 = Class8_Sub1_Sub1.anInt736 - arg2;
			arg4 -= local20;
			arg2 = Class8_Sub1_Sub1.anInt736;
			local13 = local20 * arg3 + 0;
			local5 += local20 * Class8_Sub1_Sub1.anInt734;
		}
		if (arg2 + arg4 >= Class8_Sub1_Sub1.anInt737) {
			arg4 -= arg2 + arg4 + 1 - Class8_Sub1_Sub1.anInt737;
		}
		if (arg1 < Class8_Sub1_Sub1.anInt738) {
			local20 = Class8_Sub1_Sub1.anInt738 - arg1;
			arg3 -= local20;
			arg1 = Class8_Sub1_Sub1.anInt738;
			local13 += local20;
			local5 += local20;
			local11 = local20 + 0;
			local9 += local20;
		}
		if (arg1 + arg3 >= Class8_Sub1_Sub1.anInt739) {
			local20 = arg1 + arg3 + 1 - Class8_Sub1_Sub1.anInt739;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			this.method113(Class8_Sub1_Sub1.anIntArray157, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method113(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(III[BIZII)V")
	private void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		try {
			@Pc(5) int local5 = arg6 + arg2 * Class8_Sub1_Sub1.anInt734;
			@Pc(9) int local9 = Class8_Sub1_Sub1.anInt734 - arg4;
			@Pc(11) int local11 = 0;
			@Pc(13) int local13 = 0;
			@Pc(29) int local29;
			if (arg2 < Class8_Sub1_Sub1.anInt736) {
				local29 = Class8_Sub1_Sub1.anInt736 - arg2;
				arg0 -= local29;
				arg2 = Class8_Sub1_Sub1.anInt736;
				local13 = local29 * arg4 + 0;
				local5 += local29 * Class8_Sub1_Sub1.anInt734;
			}
			if (arg2 + arg0 >= Class8_Sub1_Sub1.anInt737) {
				arg0 -= arg2 + arg0 + 1 - Class8_Sub1_Sub1.anInt737;
			}
			if (arg6 < Class8_Sub1_Sub1.anInt738) {
				local29 = Class8_Sub1_Sub1.anInt738 - arg6;
				arg4 -= local29;
				arg6 = Class8_Sub1_Sub1.anInt738;
				local13 += local29;
				local5 += local29;
				local11 = local29 + 0;
				local9 += local29;
			}
			if (arg6 + arg4 >= Class8_Sub1_Sub1.anInt739) {
				local29 = arg6 + arg4 + 1 - Class8_Sub1_Sub1.anInt739;
				arg4 -= local29;
				local11 += local29;
				local9 += local29;
			}
			if (arg4 > 0 && arg0 > 0) {
				this.method115(local5, Class8_Sub1_Sub1.anIntArray157, local11, arg3, arg0, local9, arg4, arg1, local13, arg5);
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("68967, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DBRMEPJQ", name = "a", descriptor = "(I[II[BIZIIIII)V")
	private void method115(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(19) int local19 = ((arg9 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg9 & 0xFF00) * arg7 & 0xFF0000) >> 8;
			@Pc(23) int local23 = 256 - arg7;
			for (@Pc(26) int local26 = -arg4; local26 < 0; local26++) {
				for (@Pc(31) int local31 = -arg6; local31 < 0; local31++) {
					if (arg3[arg8++] == 0) {
						arg0++;
					} else {
						@Pc(42) int local42 = arg1[arg0];
						arg1[arg0++] = (((local42 & 0xFF00FF) * local23 & 0xFF00FF00) + ((local42 & 0xFF00) * local23 & 0xFF0000) >> 8) + local19;
					}
				}
				arg0 += arg5;
				arg8 += arg2;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("86977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
