import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PFWIJTDA")
public final class Class34 {

	@OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "[I")
	private static int[] anIntArray121;

	@OriginalMember(owner = "client!PFWIJTDA", name = "e", descriptor = "[Lclient!PFWIJTDA;")
	private static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "g", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!PFWIJTDA", name = "l", descriptor = "I")
	private static int anInt510;

	@OriginalMember(owner = "client!PFWIJTDA", name = "q", descriptor = "I")
	private static int anInt512;

	@OriginalMember(owner = "client!PFWIJTDA", name = "r", descriptor = "Lclient!MNKDCXXG;")
	private static Class1_Sub2_Sub3 aClass1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!PFWIJTDA", name = "t", descriptor = "I")
	private static int anInt513 = -46103;

	@OriginalMember(owner = "client!PFWIJTDA", name = "w", descriptor = "Lclient!NVDACYAH;")
	public static Class30 aClass30_7 = new Class30(false, 30);

	@OriginalMember(owner = "client!PFWIJTDA", name = "c", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!PFWIJTDA", name = "k", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!PFWIJTDA", name = "p", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!PFWIJTDA", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!PFWIJTDA", name = "y", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!PFWIJTDA", name = "B", descriptor = "[I")
	private int[] anIntArray124;

	@OriginalMember(owner = "client!PFWIJTDA", name = "G", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!PFWIJTDA", name = "J", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!PFWIJTDA", name = "O", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!PFWIJTDA", name = "b", descriptor = "I")
	public int anInt506 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "d", descriptor = "J")
	public long aLong17 = -1L;

	@OriginalMember(owner = "client!PFWIJTDA", name = "f", descriptor = "I")
	private int anInt508 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "h", descriptor = "I")
	public int anInt509 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "i", descriptor = "Z")
	public boolean aBoolean107 = true;

	@OriginalMember(owner = "client!PFWIJTDA", name = "j", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!PFWIJTDA", name = "m", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!PFWIJTDA", name = "n", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!PFWIJTDA", name = "o", descriptor = "I")
	private int anInt511 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "s", descriptor = "B")
	public byte aByte24 = 1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "v", descriptor = "I")
	private int anInt514 = 128;

	@OriginalMember(owner = "client!PFWIJTDA", name = "x", descriptor = "I")
	private int anInt515 = 766;

	@OriginalMember(owner = "client!PFWIJTDA", name = "z", descriptor = "I")
	public int anInt516 = 32;

	@OriginalMember(owner = "client!PFWIJTDA", name = "A", descriptor = "I")
	public int anInt517 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "C", descriptor = "I")
	public int anInt518 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "D", descriptor = "I")
	public int anInt519 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "E", descriptor = "I")
	private int anInt520 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "F", descriptor = "I")
	private int anInt521 = 128;

	@OriginalMember(owner = "client!PFWIJTDA", name = "H", descriptor = "I")
	private int anInt523 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "I", descriptor = "Ljava/lang/String;")
	public String aString13 = "null";

	@OriginalMember(owner = "client!PFWIJTDA", name = "K", descriptor = "B")
	private byte aByte25 = -8;

	@OriginalMember(owner = "client!PFWIJTDA", name = "L", descriptor = "I")
	public int anInt524 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "M", descriptor = "I")
	public int anInt525 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "N", descriptor = "I")
	private int anInt526 = -1;

	@OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(Lclient!NXFIIFAD;)V")
	public static void method358(@OriginalArg(0) Class31 arg0) {
		aClass1_Sub2_Sub3_3 = new Class1_Sub2_Sub3(arg0.method352("npc.dat", null), -670);
		@Pc(19) Class1_Sub2_Sub3 local19 = new Class1_Sub2_Sub3(arg0.method352("npc.idx", null), -670);
		anInt510 = local19.method309();
		anIntArray121 = new int[anInt510];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt510; local29++) {
			anIntArray121[local29] = local27;
			local27 += local19.method309();
		}
		aClass34Array1 = new Class34[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass34Array1[local49] = new Class34();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "d", descriptor = "(I)Lclient!PFWIJTDA;")
	public static Class34 method362(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass34Array1[local1].aLong17 == (long) arg0) {
				return aClass34Array1[local1];
			}
		}
		anInt512 = (anInt512 + 1) % 20;
		@Pc(33) Class34 local33 = aClass34Array1[anInt512] = new Class34();
		aClass1_Sub2_Sub3_3.anInt474 = anIntArray121[arg0];
		local33.aLong17 = arg0;
		local33.method359(aClass1_Sub2_Sub3_3);
		return local33;
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "e", descriptor = "(I)V")
	public static void method363() {
		try {
			aClass30_7 = null;
			anIntArray121 = null;
			aClass34Array1 = null;
			aClass1_Sub2_Sub3_3 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("48366, " + 7 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "<init>", descriptor = "()V")
	private Class34() {
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(I)Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method356() {
		try {
			if (this.anIntArray122 != null) {
				@Pc(19) Class34 local19 = this.method357();
				return local19 == null ? null : local19.method356();
			} else if (this.anIntArray125 == null) {
				return null;
			} else {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray125.length; local36++) {
					if (!Class1_Sub2_Sub2_Sub3.method197(this.anIntArray125[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class1_Sub2_Sub2_Sub3[] local61 = new Class1_Sub2_Sub2_Sub3[this.anIntArray125.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray125.length; local63++) {
					local61[local63] = Class1_Sub2_Sub2_Sub3.method196(this.anIntArray125[local63]);
				}
				@Pc(87) Class1_Sub2_Sub2_Sub3 local87;
				if (local61.length == 1) {
					local87 = local61[0];
				} else {
					local87 = new Class1_Sub2_Sub2_Sub3(local61.length, 473, local61);
				}
				if (this.anIntArray126 != null) {
					for (@Pc(102) int local102 = 0; local102 < this.anIntArray126.length; local102++) {
						local87.method210(this.anIntArray126[local102], this.anIntArray123[local102]);
					}
				}
				return local87;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("61334, " + -38435 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "b", descriptor = "(I)Lclient!PFWIJTDA;")
	public Class34 method357() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt520 != -1) {
				@Pc(14) Class29 local14 = Class29.aClass29Array1[this.anInt520];
				@Pc(17) int local17 = local14.anInt484;
				@Pc(20) int local20 = local14.anInt485;
				@Pc(23) int local23 = local14.anInt486;
				@Pc(29) int local29 = client.anIntArray262[local23 - local20];
				local1 = aClient3.anIntArray268[local17] >> local20 & local29;
			} else if (this.anInt511 != -1) {
				local1 = aClient3.anIntArray268[this.anInt511];
			}
			return local1 < 0 || local1 >= this.anIntArray122.length || this.anIntArray122[local1] == -1 ? null : method362(this.anIntArray122[local1]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("4934, " + 505 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method359(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method307();
				if (local14 == 0) {
					return;
				}
				@Pc(23) int local23;
				@Pc(29) int local29;
				if (local14 == 1) {
					local23 = arg0.method307();
					this.anIntArray124 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray124[local29] = arg0.method309();
					}
				} else if (local14 == 2) {
					this.aString13 = arg0.method314();
				} else if (local14 == 3) {
					this.aByteArray12 = arg0.method315();
				} else if (local14 == 12) {
					this.aByte24 = arg0.method308();
				} else if (local14 == 13) {
					this.anInt524 = arg0.method309();
				} else if (local14 == 14) {
					this.anInt509 = arg0.method309();
				} else if (local14 == 17) {
					this.anInt509 = arg0.method309();
					this.anInt506 = arg0.method309();
					this.anInt517 = arg0.method309();
					this.anInt518 = arg0.method309();
				} else if (local14 >= 30 && local14 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local14 - 30] = arg0.method314();
					if (this.aStringArray4[local14 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray4[local14 - 30] = null;
					}
				} else if (local14 == 40) {
					local23 = arg0.method307();
					this.anIntArray126 = new int[local23];
					this.anIntArray123 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray126[local29] = arg0.method309();
						this.anIntArray123[local29] = arg0.method309();
					}
				} else if (local14 == 60) {
					local23 = arg0.method307();
					this.anIntArray125 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray125[local29] = arg0.method309();
					}
				} else if (local14 == 90) {
					this.anInt523 = arg0.method309();
				} else if (local14 == 91) {
					this.anInt526 = arg0.method309();
				} else if (local14 == 92) {
					this.anInt508 = arg0.method309();
				} else if (local14 == 93) {
					this.aBoolean110 = false;
				} else if (local14 == 95) {
					this.anInt519 = arg0.method309();
				} else if (local14 == 97) {
					this.anInt521 = arg0.method309();
				} else if (local14 == 98) {
					this.anInt514 = arg0.method309();
				} else if (local14 == 99) {
					this.aBoolean109 = true;
				} else if (local14 == 100) {
					this.anInt507 = arg0.method308();
				} else if (local14 == 101) {
					this.anInt522 = arg0.method308() * 5;
				} else if (local14 == 102) {
					this.anInt525 = arg0.method309();
				} else if (local14 == 103) {
					this.anInt516 = arg0.method309();
				} else if (local14 == 106) {
					this.anInt520 = arg0.method309();
					if (this.anInt520 == 65535) {
						this.anInt520 = -1;
					}
					this.anInt511 = arg0.method309();
					if (this.anInt511 == 65535) {
						this.anInt511 = -1;
					}
					local23 = arg0.method307();
					this.anIntArray122 = new int[local23 + 1];
					for (local29 = 0; local29 <= local23; local29++) {
						this.anIntArray122[local29] = arg0.method309();
						if (this.anIntArray122[local29] == 65535) {
							this.anIntArray122[local29] = -1;
						}
					}
				} else if (local14 == 107) {
					this.aBoolean107 = false;
				}
			}
		} catch (@Pc(388) RuntimeException local388) {
			signlink.reporterror("97400, " + arg0 + ", " + 0 + ", " + local388.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "a", descriptor = "([IIII)Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method360(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anIntArray122 != null) {
				@Pc(12) Class34 local12 = this.method357();
				return local12 == null ? null : local12.method360(arg0, arg1, arg2, 670);
			}
			@Pc(29) Class1_Sub2_Sub2_Sub3 local29 = (Class1_Sub2_Sub2_Sub3) aClass30_7.method348(this.aLong17);
			if (local29 == null) {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray124.length; local35++) {
					if (!Class1_Sub2_Sub2_Sub3.method197(this.anIntArray124[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class1_Sub2_Sub2_Sub3[] local60 = new Class1_Sub2_Sub2_Sub3[this.anIntArray124.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray124.length; local62++) {
					local60[local62] = Class1_Sub2_Sub2_Sub3.method196(this.anIntArray124[local62]);
				}
				if (local60.length == 1) {
					local29 = local60[0];
				} else {
					local29 = new Class1_Sub2_Sub2_Sub3(local60.length, 473, local60);
				}
				if (this.anIntArray126 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray126.length; local101++) {
						local29.method210(this.anIntArray126[local101], this.anIntArray123[local101]);
					}
				}
				local29.method203();
				local29.method213(this.anInt507 + 64, this.anInt522 + 850, -30, -50, -30, true);
				aClass30_7.method349(this.aLong17, local29);
			}
			@Pc(144) Class1_Sub2_Sub2_Sub3 local144 = Class1_Sub2_Sub2_Sub3.aClass1_Sub2_Sub2_Sub3_2;
			local144.method198(this.anInt515, local29, Class11.method123(arg2) & Class11.method123(arg1));
			if (arg2 != -1 && arg1 != -1) {
				local144.method205(arg2, arg0, arg1);
			} else if (arg2 != -1) {
				local144.method204(arg2);
			}
			if (this.anInt521 != 128 || this.anInt514 != 128) {
				local144.method212(this.anInt521, this.aByte25, this.anInt514, this.anInt521);
			}
			local144.method200();
			local144.anIntArrayArray11 = null;
			local144.anIntArrayArray10 = null;
			if (this.aByte24 == 1) {
				local144.aBoolean69 = true;
			}
			return local144;
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("65862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PFWIJTDA", name = "c", descriptor = "(I)Z")
	public boolean method361(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			if (this.anIntArray122 == null) {
				return true;
			}
			@Pc(10) int local10 = -1;
			if (this.anInt520 != -1) {
				@Pc(19) Class29 local19 = Class29.aClass29Array1[this.anInt520];
				@Pc(22) int local22 = local19.anInt484;
				@Pc(25) int local25 = local19.anInt485;
				@Pc(28) int local28 = local19.anInt486;
				@Pc(34) int local34 = client.anIntArray262[local28 - local25];
				local10 = aClient3.anIntArray268[local22] >> local25 & local34;
			} else if (this.anInt511 != -1) {
				local10 = aClient3.anIntArray268[this.anInt511];
			}
			return local10 >= 0 && local10 < this.anIntArray122.length && this.anIntArray122[local10] != -1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("70600, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
