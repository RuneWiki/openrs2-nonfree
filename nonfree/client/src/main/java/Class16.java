import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JKAPIYZO")
public final class Class16 {

	@OriginalMember(owner = "client!JKAPIYZO", name = "e", descriptor = "Lclient!UAWAYCTK;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_4;

	@OriginalMember(owner = "client!JKAPIYZO", name = "f", descriptor = "[I")
	private static int[] anIntArray57;

	@OriginalMember(owner = "client!JKAPIYZO", name = "u", descriptor = "I")
	private static int anInt215;

	@OriginalMember(owner = "client!JKAPIYZO", name = "y", descriptor = "I")
	private static int anInt218;

	@OriginalMember(owner = "client!JKAPIYZO", name = "G", descriptor = "[Lclient!JKAPIYZO;")
	private static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "I", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!JKAPIYZO", name = "L", descriptor = "Lclient!EOJHVRZF;")
	public static Class10 aClass10_3 = new Class10(10369, 30);

	@OriginalMember(owner = "client!JKAPIYZO", name = "b", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!JKAPIYZO", name = "d", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!JKAPIYZO", name = "g", descriptor = "[I")
	private int[] anIntArray58;

	@OriginalMember(owner = "client!JKAPIYZO", name = "h", descriptor = "[I")
	public int[] anIntArray59;

	@OriginalMember(owner = "client!JKAPIYZO", name = "w", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!JKAPIYZO", name = "A", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!JKAPIYZO", name = "B", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!JKAPIYZO", name = "D", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!JKAPIYZO", name = "F", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!JKAPIYZO", name = "M", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!JKAPIYZO", name = "N", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray3;

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!JKAPIYZO", name = "c", descriptor = "J")
	public long aLong13 = -1L;

	@OriginalMember(owner = "client!JKAPIYZO", name = "i", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!JKAPIYZO", name = "j", descriptor = "I")
	private int anInt206 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "k", descriptor = "I")
	public int anInt207 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "l", descriptor = "I")
	public int anInt208 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "m", descriptor = "I")
	public int anInt209 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "n", descriptor = "I")
	private int anInt210 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "o", descriptor = "Z")
	public boolean aBoolean80 = true;

	@OriginalMember(owner = "client!JKAPIYZO", name = "p", descriptor = "I")
	private int anInt211 = 128;

	@OriginalMember(owner = "client!JKAPIYZO", name = "q", descriptor = "I")
	public int anInt212 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "r", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!JKAPIYZO", name = "s", descriptor = "I")
	private int anInt213 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "t", descriptor = "I")
	private int anInt214 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "v", descriptor = "I")
	private int anInt216 = 128;

	@OriginalMember(owner = "client!JKAPIYZO", name = "x", descriptor = "I")
	private int anInt217 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "z", descriptor = "B")
	public byte aByte10 = 1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "C", descriptor = "I")
	public int anInt219 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "E", descriptor = "Z")
	public boolean aBoolean82 = false;

	@OriginalMember(owner = "client!JKAPIYZO", name = "H", descriptor = "I")
	public int anInt222 = 32;

	@OriginalMember(owner = "client!JKAPIYZO", name = "J", descriptor = "I")
	public int anInt223 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "K", descriptor = "I")
	public int anInt224 = -1;

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "(Z)V")
	public static void method202() {
		try {
			aClass10_3 = null;
			anIntArray57 = null;
			aClass16Array1 = null;
			aClass6_Sub2_Sub3_4 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("68356, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "c", descriptor = "(I)Lclient!JKAPIYZO;")
	public static Class16 method207(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass16Array1[local1].aLong13 == (long) arg0) {
				return aClass16Array1[local1];
			}
		}
		anInt218 = (anInt218 + 1) % 20;
		@Pc(33) Class16 local33 = aClass16Array1[anInt218] = new Class16();
		aClass6_Sub2_Sub3_4.anInt609 = anIntArray57[arg0];
		local33.aLong13 = arg0;
		local33.method206(aClass6_Sub2_Sub3_4);
		return local33;
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "(Lclient!RVLWVPJQ;)V")
	public static void method208(@OriginalArg(0) Class36 arg0) {
		aClass6_Sub2_Sub3_4 = new Class6_Sub2_Sub3(741, arg0.method381("npc.dat", null));
		@Pc(19) Class6_Sub2_Sub3 local19 = new Class6_Sub2_Sub3(741, arg0.method381("npc.idx", null));
		anInt215 = local19.method404();
		anIntArray57 = new int[anInt215];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt215; local29++) {
			anIntArray57[local29] = local27;
			local27 += local19.method404();
		}
		aClass16Array1 = new Class16[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass16Array1[local49] = new Class16();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "(ZI[II)Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method201(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray59 != null) {
				@Pc(8) Class16 local8 = this.method205();
				return local8 == null ? null : local8.method201(arg0, arg1, arg2);
			}
			@Pc(25) Class6_Sub2_Sub1_Sub6 local25 = (Class6_Sub2_Sub1_Sub6) aClass10_3.method75(this.aLong13);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray60.length; local31++) {
					if (!Class6_Sub2_Sub1_Sub6.method488(this.anIntArray60[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class6_Sub2_Sub1_Sub6[] local56 = new Class6_Sub2_Sub1_Sub6[this.anIntArray60.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray60.length; local58++) {
					local56[local58] = Class6_Sub2_Sub1_Sub6.method487(892, this.anIntArray60[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class6_Sub2_Sub1_Sub6(true, local56.length, local56);
				}
				if (this.anIntArray61 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray61.length; local98++) {
						local25.method501(this.anIntArray61[local98], this.anIntArray58[local98]);
					}
				}
				local25.method494((byte) 2);
				local25.method504(this.anInt225 + 64, this.anInt220 + 850, -30, -50, -30, true);
				aClass10_3.method76(this.aLong13, local25);
			}
			@Pc(141) Class6_Sub2_Sub1_Sub6 local141 = Class6_Sub2_Sub1_Sub6.aClass6_Sub2_Sub1_Sub6_2;
			local141.method489(local25, Class12.method88(arg0) & Class12.method88(arg2));
			if (arg0 != -1 && arg2 != -1) {
				local141.method496(arg2, arg0, arg1);
			} else if (arg0 != -1) {
				local141.method495(arg0, 803);
			}
			if (this.anInt211 != 128 || this.anInt216 != 128) {
				local141.method503(this.anInt211, this.anInt211, this.anInt216);
			}
			local141.method491();
			local141.anIntArrayArray19 = null;
			local141.anIntArrayArray18 = null;
			if (this.aByte10 == 1) {
				local141.aBoolean192 = true;
			}
			return local141;
		} catch (@Pc(215) RuntimeException local215) {
			signlink.reporterror("90139, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local215.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "b", descriptor = "(Z)Z")
	public boolean method203() {
		try {
			if (this.anIntArray59 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt213 != -1) {
				@Pc(20) Class38 local20 = Class38.aClass38Array1[this.anInt213];
				@Pc(23) int local23 = local20.anInt681;
				@Pc(26) int local26 = local20.anInt682;
				@Pc(29) int local29 = local20.anInt683;
				@Pc(35) int local35 = client.anIntArray228[local29 - local26];
				local6 = aClient4.anIntArray240[local23] >> local26 & local35;
			} else if (this.anInt217 != -1) {
				local6 = aClient4.anIntArray240[this.anInt217];
			}
			return local6 >= 0 && local6 < this.anIntArray59.length && this.anIntArray59[local6] != -1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("55623, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "(I)Lclient!WEVRTBOZ;")
	public Class6_Sub2_Sub1_Sub6 method204() {
		try {
			if (this.anIntArray59 != null) {
				@Pc(19) Class16 local19 = this.method205();
				return local19 == null ? null : local19.method204();
			} else if (this.anIntArray62 == null) {
				return null;
			} else {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray62.length; local36++) {
					if (!Class6_Sub2_Sub1_Sub6.method488(this.anIntArray62[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class6_Sub2_Sub1_Sub6[] local61 = new Class6_Sub2_Sub1_Sub6[this.anIntArray62.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray62.length; local63++) {
					local61[local63] = Class6_Sub2_Sub1_Sub6.method487(892, this.anIntArray62[local63]);
				}
				@Pc(88) Class6_Sub2_Sub1_Sub6 local88;
				if (local61.length == 1) {
					local88 = local61[0];
				} else {
					local88 = new Class6_Sub2_Sub1_Sub6(true, local61.length, local61);
				}
				if (this.anIntArray61 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray61.length; local103++) {
						local88.method501(this.anIntArray61[local103], this.anIntArray58[local103]);
					}
				}
				return local88;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("98327, " + 7 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "b", descriptor = "(I)Lclient!JKAPIYZO;")
	public Class16 method205() {
		try {
			@Pc(7) int local7 = -1;
			if (this.anInt213 != -1) {
				@Pc(16) Class38 local16 = Class38.aClass38Array1[this.anInt213];
				@Pc(19) int local19 = local16.anInt681;
				@Pc(22) int local22 = local16.anInt682;
				@Pc(25) int local25 = local16.anInt683;
				@Pc(31) int local31 = client.anIntArray228[local25 - local22];
				local7 = aClient4.anIntArray240[local19] >> local22 & local31;
			} else if (this.anInt217 != -1) {
				local7 = aClient4.anIntArray240[this.anInt217];
			}
			return local7 < 0 || local7 >= this.anIntArray59.length || this.anIntArray59[local7] == -1 ? null : method207(this.anIntArray59[local7]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("39680, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JKAPIYZO", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method206(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method402();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method402();
					this.anIntArray60 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray60[local26] = arg0.method404();
					}
				} else if (local11 == 2) {
					this.aString4 = arg0.method409();
				} else if (local11 == 3) {
					this.aByteArray7 = arg0.method410();
				} else if (local11 == 12) {
					this.aByte10 = arg0.method403();
				} else if (local11 == 13) {
					this.anInt207 = arg0.method404();
				} else if (local11 == 14) {
					this.anInt212 = arg0.method404();
				} else if (local11 == 17) {
					this.anInt212 = arg0.method404();
					this.anInt223 = arg0.method404();
					this.anInt209 = arg0.method404();
					this.anInt219 = arg0.method404();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray3 == null) {
						this.aStringArray3 = new String[5];
					}
					this.aStringArray3[local11 - 30] = arg0.method409();
					if (this.aStringArray3[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray3[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method402();
					this.anIntArray61 = new int[local20];
					this.anIntArray58 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray61[local26] = arg0.method404();
						this.anIntArray58[local26] = arg0.method404();
					}
				} else if (local11 == 60) {
					local20 = arg0.method402();
					this.anIntArray62 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray62[local26] = arg0.method404();
					}
				} else if (local11 == 90) {
					this.anInt214 = arg0.method404();
				} else if (local11 == 91) {
					this.anInt206 = arg0.method404();
				} else if (local11 == 92) {
					this.anInt210 = arg0.method404();
				} else if (local11 == 93) {
					this.aBoolean80 = false;
				} else if (local11 == 95) {
					this.anInt208 = arg0.method404();
				} else if (local11 == 97) {
					this.anInt211 = arg0.method404();
				} else if (local11 == 98) {
					this.anInt216 = arg0.method404();
				} else if (local11 == 99) {
					this.aBoolean82 = true;
				} else if (local11 == 100) {
					this.anInt225 = arg0.method403();
				} else if (local11 == 101) {
					this.anInt220 = arg0.method403() * 5;
				} else if (local11 == 102) {
					this.anInt224 = arg0.method404();
				} else if (local11 == 103) {
					this.anInt222 = arg0.method404();
				} else if (local11 == 106) {
					this.anInt213 = arg0.method404();
					if (this.anInt213 == 65535) {
						this.anInt213 = -1;
					}
					this.anInt217 = arg0.method404();
					if (this.anInt217 == 65535) {
						this.anInt217 = -1;
					}
					local20 = arg0.method402();
					this.anIntArray59 = new int[local20 + 1];
					for (local26 = 0; local26 <= local20; local26++) {
						this.anIntArray59[local26] = arg0.method404();
						if (this.anIntArray59[local26] == 65535) {
							this.anIntArray59[local26] = -1;
						}
					}
				} else if (local11 == 107) {
					this.aBoolean78 = false;
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("59336, " + -7321 + ", " + arg0 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}
}
