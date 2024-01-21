import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WHKCNEXD")
public final class Class42 {

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "[I")
	private static int[] anIntArray152;

	@OriginalMember(owner = "client!WHKCNEXD", name = "d", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!WHKCNEXD", name = "q", descriptor = "I")
	private static int anInt704;

	@OriginalMember(owner = "client!WHKCNEXD", name = "B", descriptor = "[Lclient!WHKCNEXD;")
	private static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "G", descriptor = "I")
	private static int anInt712;

	@OriginalMember(owner = "client!WHKCNEXD", name = "K", descriptor = "Lclient!IMUIZRAF;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_5;

	@OriginalMember(owner = "client!WHKCNEXD", name = "c", descriptor = "I")
	private static int anInt695 = 8;

	@OriginalMember(owner = "client!WHKCNEXD", name = "w", descriptor = "Lclient!WMYPWVZI;")
	public static Class43 aClass43_9 = new Class43(30, 267);

	@OriginalMember(owner = "client!WHKCNEXD", name = "e", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!WHKCNEXD", name = "g", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!WHKCNEXD", name = "i", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!WHKCNEXD", name = "m", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!WHKCNEXD", name = "p", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!WHKCNEXD", name = "x", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!WHKCNEXD", name = "y", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!WHKCNEXD", name = "C", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!WHKCNEXD", name = "I", descriptor = "[I")
	private int[] anIntArray157;

	@OriginalMember(owner = "client!WHKCNEXD", name = "L", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!WHKCNEXD", name = "N", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!WHKCNEXD", name = "b", descriptor = "Z")
	public boolean aBoolean212 = true;

	@OriginalMember(owner = "client!WHKCNEXD", name = "f", descriptor = "I")
	public int anInt696 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "h", descriptor = "I")
	public int anInt698 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "j", descriptor = "Z")
	public boolean aBoolean213 = false;

	@OriginalMember(owner = "client!WHKCNEXD", name = "k", descriptor = "I")
	public int anInt700 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "l", descriptor = "I")
	private int anInt701 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "n", descriptor = "I")
	public int anInt702 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "o", descriptor = "I")
	public int anInt703 = 32;

	@OriginalMember(owner = "client!WHKCNEXD", name = "r", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!WHKCNEXD", name = "s", descriptor = "I")
	private int anInt705 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "t", descriptor = "I")
	public int anInt706 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "u", descriptor = "Z")
	public boolean aBoolean215 = true;

	@OriginalMember(owner = "client!WHKCNEXD", name = "v", descriptor = "J")
	public long aLong24 = -1L;

	@OriginalMember(owner = "client!WHKCNEXD", name = "z", descriptor = "I")
	public int anInt707 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "A", descriptor = "I")
	private int anInt708 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "D", descriptor = "I")
	private int anInt709 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "E", descriptor = "I")
	public int anInt710 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "F", descriptor = "I")
	private int anInt711 = 128;

	@OriginalMember(owner = "client!WHKCNEXD", name = "H", descriptor = "I")
	private int anInt713 = -1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "J", descriptor = "B")
	public byte aByte18 = 1;

	@OriginalMember(owner = "client!WHKCNEXD", name = "M", descriptor = "I")
	private int anInt715 = 128;

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "(I)V")
	public static void method476(@OriginalArg(0) int arg0) {
		try {
			aClass43_9 = null;
			@Pc(5) boolean local5 = false;
			anIntArray152 = null;
			aClass42Array1 = null;
			aClass3_Sub1_Sub3_5 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("81814, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "(Lclient!BYZSQZUF;)V")
	public static void method477(@OriginalArg(0) Class5 arg0) {
		aClass3_Sub1_Sub3_5 = new Class3_Sub1_Sub3(0, arg0.method66("npc.dat", null));
		@Pc(19) Class3_Sub1_Sub3 local19 = new Class3_Sub1_Sub3(0, arg0.method66("npc.idx", null));
		anInt712 = local19.method148();
		anIntArray152 = new int[anInt712];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt712; local29++) {
			anIntArray152[local29] = local27;
			local27 += local19.method148();
		}
		aClass42Array1 = new Class42[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass42Array1[local49] = new Class42();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "d", descriptor = "(I)Lclient!WHKCNEXD;")
	public static Class42 method481(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass42Array1[local1].aLong24 == (long) arg0) {
				return aClass42Array1[local1];
			}
		}
		anInt704 = (anInt704 + 1) % 20;
		@Pc(33) Class42 local33 = aClass42Array1[anInt704] = new Class42();
		aClass3_Sub1_Sub3_5.anInt243 = anIntArray152[arg0];
		local33.aLong24 = arg0;
		local33.method483(anInt695, aClass3_Sub1_Sub3_5);
		return local33;
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "<init>", descriptor = "()V")
	private Class42() {
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "b", descriptor = "(I)Lclient!WHKCNEXD;")
	public Class42 method478() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt709 != -1) {
				@Pc(16) Class2 local16 = Class2.aClass2Array1[this.anInt709];
				@Pc(19) int local19 = local16.anInt3;
				@Pc(22) int local22 = local16.anInt4;
				@Pc(25) int local25 = local16.anInt5;
				@Pc(31) int local31 = client.anIntArray233[local25 - local22];
				local1 = aClient4.anIntArray224[local19] >> local22 & local31;
			} else if (this.anInt708 != -1) {
				local1 = aClient4.anIntArray224[this.anInt708];
			}
			return local1 < 0 || local1 >= this.anIntArray155.length || this.anIntArray155[local1] == -1 ? null : method481(this.anIntArray155[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("35708, " + -13525 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "c", descriptor = "(I)Z")
	public boolean method479(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray155 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			@Pc(10) boolean local10 = false;
			if (this.anInt709 != -1) {
				@Pc(19) Class2 local19 = Class2.aClass2Array1[this.anInt709];
				@Pc(22) int local22 = local19.anInt3;
				@Pc(25) int local25 = local19.anInt4;
				@Pc(28) int local28 = local19.anInt5;
				@Pc(34) int local34 = client.anIntArray233[local28 - local25];
				local6 = aClient4.anIntArray224[local22] >> local25 & local34;
			} else if (this.anInt708 != -1) {
				local6 = aClient4.anIntArray224[this.anInt708];
			}
			return local6 >= 0 && local6 < this.anIntArray155.length && this.anIntArray155[local6] != -1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("26565, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "([IZII)Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method480(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray155 != null) {
				@Pc(8) Class42 local8 = this.method478();
				return local8 == null ? null : local8.method480(arg0, arg1, arg2);
			}
			@Pc(25) Class3_Sub1_Sub2_Sub6 local25 = (Class3_Sub1_Sub2_Sub6) aClass43_9.method484(this.aLong24);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray156.length; local31++) {
					if (!Class3_Sub1_Sub2_Sub6.method511(this.anIntArray156[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class3_Sub1_Sub2_Sub6[] local56 = new Class3_Sub1_Sub2_Sub6[this.anIntArray156.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray156.length; local58++) {
					local56[local58] = Class3_Sub1_Sub2_Sub6.method510(this.anIntArray156[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class3_Sub1_Sub2_Sub6(local56, true, local56.length);
				}
				if (this.anIntArray157 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray157.length; local98++) {
						local25.method524(this.anIntArray157[local98], this.anIntArray153[local98]);
					}
				}
				local25.method517();
				local25.method527(this.anInt697 + 64, this.anInt714 + 850, -30, -50, -30, true);
				aClass43_9.method485(this.aLong24, local25);
			}
			@Pc(141) Class3_Sub1_Sub2_Sub6 local141 = Class3_Sub1_Sub2_Sub6.aClass3_Sub1_Sub2_Sub6_2;
			local141.method512(local25, Class15.method125(arg1) & Class15.method125(arg2));
			if (arg1 != -1 && arg2 != -1) {
				local141.method519(arg0, arg2, arg1);
			} else if (arg1 != -1) {
				local141.method518(598, arg1);
			}
			if (this.anInt711 != 128 || this.anInt715 != 128) {
				local141.method526(this.anInt715, this.anInt711, this.anInt711);
			}
			local141.method514();
			local141.anIntArrayArray18 = null;
			local141.anIntArrayArray17 = null;
			if (this.aByte18 == 1) {
				local141.aBoolean227 = true;
			}
			return local141;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("30427, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "(B)Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method482() {
		try {
			if (this.anIntArray155 != null) {
				@Pc(15) Class42 local15 = this.method478();
				return local15 == null ? null : local15.method482();
			} else if (this.anIntArray154 == null) {
				return null;
			} else {
				@Pc(30) boolean local30 = false;
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray154.length; local32++) {
					if (!Class3_Sub1_Sub2_Sub6.method511(this.anIntArray154[local32])) {
						local30 = true;
					}
				}
				if (local30) {
					return null;
				}
				@Pc(57) Class3_Sub1_Sub2_Sub6[] local57 = new Class3_Sub1_Sub2_Sub6[this.anIntArray154.length];
				for (@Pc(59) int local59 = 0; local59 < this.anIntArray154.length; local59++) {
					local57[local59] = Class3_Sub1_Sub2_Sub6.method510(this.anIntArray154[local59]);
				}
				@Pc(84) Class3_Sub1_Sub2_Sub6 local84;
				if (local57.length == 1) {
					local84 = local57[0];
				} else {
					local84 = new Class3_Sub1_Sub2_Sub6(local57, true, local57.length);
				}
				if (this.anIntArray157 != null) {
					for (@Pc(99) int local99 = 0; local99 < this.anIntArray157.length; local99++) {
						local84.method524(this.anIntArray157[local99], this.anIntArray153[local99]);
					}
				}
				return local84;
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("99179, " + -127 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHKCNEXD", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method483(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method146();
					if (local11 == 0) {
						return;
					}
					@Pc(20) int local20;
					@Pc(26) int local26;
					if (local11 == 1) {
						local20 = arg1.method146();
						this.anIntArray156 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray156[local26] = arg1.method148();
						}
					} else if (local11 == 2) {
						this.aString16 = arg1.method153();
					} else if (local11 == 3) {
						this.aByteArray19 = arg1.method154();
					} else if (local11 == 12) {
						this.aByte18 = arg1.method147();
					} else if (local11 == 13) {
						this.anInt698 = arg1.method148();
					} else if (local11 == 14) {
						this.anInt696 = arg1.method148();
					} else if (local11 == 17) {
						this.anInt696 = arg1.method148();
						this.anInt706 = arg1.method148();
						this.anInt707 = arg1.method148();
						this.anInt700 = arg1.method148();
					} else if (local11 >= 30 && local11 < 40) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local11 - 30] = arg1.method153();
						if (this.aStringArray7[local11 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local11 - 30] = null;
						}
					} else if (local11 == 40) {
						local20 = arg1.method146();
						this.anIntArray157 = new int[local20];
						this.anIntArray153 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray157[local26] = arg1.method148();
							this.anIntArray153[local26] = arg1.method148();
						}
					} else if (local11 == 60) {
						local20 = arg1.method146();
						this.anIntArray154 = new int[local20];
						for (local26 = 0; local26 < local20; local26++) {
							this.anIntArray154[local26] = arg1.method148();
						}
					} else if (local11 == 90) {
						this.anInt713 = arg1.method148();
					} else if (local11 == 91) {
						this.anInt701 = arg1.method148();
					} else if (local11 == 92) {
						this.anInt705 = arg1.method148();
					} else if (local11 == 93) {
						this.aBoolean212 = false;
					} else if (local11 == 95) {
						this.anInt702 = arg1.method148();
					} else if (local11 == 97) {
						this.anInt711 = arg1.method148();
					} else if (local11 == 98) {
						this.anInt715 = arg1.method148();
					} else if (local11 == 99) {
						this.aBoolean213 = true;
					} else if (local11 == 100) {
						this.anInt697 = arg1.method147();
					} else if (local11 == 101) {
						this.anInt714 = arg1.method147() * 5;
					} else if (local11 == 102) {
						this.anInt710 = arg1.method148();
					} else if (local11 == 103) {
						this.anInt703 = arg1.method148();
					} else if (local11 == 106) {
						this.anInt709 = arg1.method148();
						if (this.anInt709 == 65535) {
							this.anInt709 = -1;
						}
						this.anInt708 = arg1.method148();
						if (this.anInt708 == 65535) {
							this.anInt708 = -1;
						}
						local20 = arg1.method146();
						this.anIntArray155 = new int[local20 + 1];
						for (local26 = 0; local26 <= local20; local26++) {
							this.anIntArray155[local26] = arg1.method148();
							if (this.anIntArray155[local26] == 65535) {
								this.anIntArray155[local26] = -1;
							}
						}
					} else if (local11 == 107) {
						this.aBoolean215 = false;
					}
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("10978, " + arg0 + ", " + arg1 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}
}
