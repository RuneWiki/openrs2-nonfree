import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YIBRLAQY")
public final class Class49 {

	@OriginalMember(owner = "client!YIBRLAQY", name = "f", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YIBRLAQY", name = "k", descriptor = "[Lclient!YIBRLAQY;")
	private static Class49[] aClass49Array1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "l", descriptor = "I")
	private static int anInt753;

	@OriginalMember(owner = "client!YIBRLAQY", name = "x", descriptor = "I")
	private static int anInt761;

	@OriginalMember(owner = "client!YIBRLAQY", name = "H", descriptor = "[I")
	private static int[] anIntArray200;

	@OriginalMember(owner = "client!YIBRLAQY", name = "L", descriptor = "Lclient!PKHWFJLM;")
	private static Class5_Sub1_Sub4 aClass5_Sub1_Sub4_5;

	@OriginalMember(owner = "client!YIBRLAQY", name = "g", descriptor = "Lclient!WIUIWDML;")
	public static Class45 aClass45_9 = new Class45(-99, 30);

	@OriginalMember(owner = "client!YIBRLAQY", name = "m", descriptor = "Z")
	private static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!YIBRLAQY", name = "d", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!YIBRLAQY", name = "h", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!YIBRLAQY", name = "i", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!YIBRLAQY", name = "j", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!YIBRLAQY", name = "n", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!YIBRLAQY", name = "p", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!YIBRLAQY", name = "u", descriptor = "[I")
	private int[] anIntArray198;

	@OriginalMember(owner = "client!YIBRLAQY", name = "y", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!YIBRLAQY", name = "C", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!YIBRLAQY", name = "I", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "I")
	public int anInt750 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "b", descriptor = "J")
	public long aLong25 = -1L;

	@OriginalMember(owner = "client!YIBRLAQY", name = "c", descriptor = "I")
	public int anInt751 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "e", descriptor = "Z")
	public boolean aBoolean194 = true;

	@OriginalMember(owner = "client!YIBRLAQY", name = "o", descriptor = "I")
	private int anInt755 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "q", descriptor = "I")
	public int anInt756 = 32;

	@OriginalMember(owner = "client!YIBRLAQY", name = "r", descriptor = "I")
	private int anInt757 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "s", descriptor = "I")
	private int anInt758 = 128;

	@OriginalMember(owner = "client!YIBRLAQY", name = "t", descriptor = "I")
	public int anInt759 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "v", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!YIBRLAQY", name = "w", descriptor = "I")
	public int anInt760 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "z", descriptor = "I")
	private int anInt762 = -47097;

	@OriginalMember(owner = "client!YIBRLAQY", name = "A", descriptor = "I")
	private int anInt763 = 128;

	@OriginalMember(owner = "client!YIBRLAQY", name = "B", descriptor = "I")
	public int anInt764 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "D", descriptor = "I")
	private int anInt765 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "E", descriptor = "I")
	private int anInt766 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "F", descriptor = "I")
	public int anInt767 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "G", descriptor = "Z")
	public boolean aBoolean197 = true;

	@OriginalMember(owner = "client!YIBRLAQY", name = "J", descriptor = "I")
	public int anInt768 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "K", descriptor = "I")
	private int anInt769 = -1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "M", descriptor = "I")
	private int anInt770 = 635;

	@OriginalMember(owner = "client!YIBRLAQY", name = "N", descriptor = "B")
	public byte aByte20 = 1;

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(B)V")
	public static void method536() {
		try {
			aClass45_9 = null;
			anIntArray200 = null;
			aClass49Array1 = null;
			aClass5_Sub1_Sub4_5 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("53095, " + 0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "b", descriptor = "(I)Lclient!YIBRLAQY;")
	public static Class49 method537(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass49Array1[local1].aLong25 == (long) arg0) {
				return aClass49Array1[local1];
			}
		}
		anInt761 = (anInt761 + 1) % 20;
		@Pc(33) Class49 local33 = aClass49Array1[anInt761] = new Class49();
		aClass5_Sub1_Sub4_5.anInt429 = anIntArray200[arg0];
		local33.aLong25 = arg0;
		local33.method535(aClass5_Sub1_Sub4_5, aBoolean195);
		return local33;
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(Lclient!TXPLZUUI;)V")
	public static void method538(@OriginalArg(0) Class40 arg0) {
		aClass5_Sub1_Sub4_5 = new Class5_Sub1_Sub4(arg0.method464("npc.dat", null), 0);
		@Pc(19) Class5_Sub1_Sub4 local19 = new Class5_Sub1_Sub4(arg0.method464("npc.idx", null), 0);
		anInt753 = local19.method242();
		anIntArray200 = new int[anInt753];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt753; local29++) {
			anIntArray200[local29] = local27;
			local27 += local19.method242();
		}
		aClass49Array1 = new Class49[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass49Array1[local49] = new Class49();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "<init>", descriptor = "()V")
	private Class49() {
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(I)Lclient!YIBRLAQY;")
	public Class49 method534() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt757 != -1) {
				@Pc(16) Class4 local16 = Class4.aClass4Array1[this.anInt757];
				@Pc(19) int local19 = local16.anInt16;
				@Pc(22) int local22 = local16.anInt17;
				@Pc(25) int local25 = local16.anInt18;
				@Pc(31) int local31 = client.anIntArray222[local25 - local22];
				local1 = aClient5.anIntArray216[local19] >> local22 & local31;
			} else if (this.anInt755 != -1) {
				local1 = aClient5.anIntArray216[this.anInt755];
			}
			return local1 < 0 || local1 >= this.anIntArray197.length || this.anIntArray197[local1] == -1 ? null : method537(this.anIntArray197[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("46580, " + 29839 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method535(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(5) int local5;
			if (!arg1) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			while (true) {
				while (true) {
					local5 = arg0.method240();
					if (local5 == 0) {
						return;
					}
					@Pc(22) int local22;
					@Pc(28) int local28;
					if (local5 == 1) {
						local22 = arg0.method240();
						this.anIntArray199 = new int[local22];
						for (local28 = 0; local28 < local22; local28++) {
							this.anIntArray199[local28] = arg0.method242();
						}
					} else if (local5 == 2) {
						this.aString16 = arg0.method247();
					} else if (local5 == 3) {
						this.aByteArray20 = arg0.method248();
					} else if (local5 == 12) {
						this.aByte20 = arg0.method241();
					} else if (local5 == 13) {
						this.anInt764 = arg0.method242();
					} else if (local5 == 14) {
						this.anInt768 = arg0.method242();
					} else if (local5 == 17) {
						this.anInt768 = arg0.method242();
						this.anInt759 = arg0.method242();
						this.anInt767 = arg0.method242();
						this.anInt751 = arg0.method242();
					} else if (local5 >= 30 && local5 < 40) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local5 - 30] = arg0.method247();
						if (this.aStringArray7[local5 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local5 - 30] = null;
						}
					} else if (local5 == 40) {
						local22 = arg0.method240();
						this.anIntArray196 = new int[local22];
						this.anIntArray195 = new int[local22];
						for (local28 = 0; local28 < local22; local28++) {
							this.anIntArray196[local28] = arg0.method242();
							this.anIntArray195[local28] = arg0.method242();
						}
					} else if (local5 == 60) {
						local22 = arg0.method240();
						this.anIntArray198 = new int[local22];
						for (local28 = 0; local28 < local22; local28++) {
							this.anIntArray198[local28] = arg0.method242();
						}
					} else if (local5 == 90) {
						this.anInt765 = arg0.method242();
					} else if (local5 == 91) {
						this.anInt766 = arg0.method242();
					} else if (local5 == 92) {
						this.anInt769 = arg0.method242();
					} else if (local5 == 93) {
						this.aBoolean197 = false;
					} else if (local5 == 95) {
						this.anInt750 = arg0.method242();
					} else if (local5 == 97) {
						this.anInt758 = arg0.method242();
					} else if (local5 == 98) {
						this.anInt763 = arg0.method242();
					} else if (local5 == 99) {
						this.aBoolean196 = true;
					} else if (local5 == 100) {
						this.anInt754 = arg0.method241();
					} else if (local5 == 101) {
						this.anInt752 = arg0.method241() * 5;
					} else if (local5 == 102) {
						this.anInt760 = arg0.method242();
					} else if (local5 == 103) {
						this.anInt756 = arg0.method242();
					} else if (local5 == 106) {
						this.anInt757 = arg0.method242();
						if (this.anInt757 == 65535) {
							this.anInt757 = -1;
						}
						this.anInt755 = arg0.method242();
						if (this.anInt755 == 65535) {
							this.anInt755 = -1;
						}
						local22 = arg0.method240();
						this.anIntArray197 = new int[local22 + 1];
						for (local28 = 0; local28 <= local22; local28++) {
							this.anIntArray197[local28] = arg0.method242();
							if (this.anIntArray197[local28] == 65535) {
								this.anIntArray197[local28] = -1;
							}
						}
					} else if (local5 == 107) {
						this.aBoolean194 = false;
					}
				}
			}
		} catch (@Pc(387) RuntimeException local387) {
			signlink.reporterror("6926, " + arg0 + ", " + arg1 + ", " + local387.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(II[II)Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			if (this.anIntArray197 != null) {
				@Pc(8) Class49 local8 = this.method534();
				return local8 == null ? null : local8.method539(arg0, arg1, arg2, this.anInt762);
			}
			@Pc(26) Class5_Sub1_Sub2_Sub5 local26 = (Class5_Sub1_Sub2_Sub5) aClass45_9.method477(this.aLong25);
			if (local26 == null) {
				@Pc(30) boolean local30 = false;
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray199.length; local32++) {
					if (!Class5_Sub1_Sub2_Sub5.method325(this.anIntArray199[local32])) {
						local30 = true;
					}
				}
				if (local30) {
					return null;
				}
				@Pc(57) Class5_Sub1_Sub2_Sub5[] local57 = new Class5_Sub1_Sub2_Sub5[this.anIntArray199.length];
				for (@Pc(59) int local59 = 0; local59 < this.anIntArray199.length; local59++) {
					local57[local59] = Class5_Sub1_Sub2_Sub5.method324(this.anIntArray199[local59]);
				}
				if (local57.length == 1) {
					local26 = local57[0];
				} else {
					local26 = new Class5_Sub1_Sub2_Sub5(8111, local57.length, local57);
				}
				if (this.anIntArray196 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray196.length; local98++) {
						local26.method338(this.anIntArray196[local98], this.anIntArray195[local98]);
					}
				}
				local26.method331();
				local26.method341(this.anInt754 + 64, this.anInt752 + 850, -30, -50, -30, true);
				aClass45_9.method478(this.anInt770, this.aLong25, local26);
			}
			@Pc(142) Class5_Sub1_Sub2_Sub5 local142 = Class5_Sub1_Sub2_Sub5.aClass5_Sub1_Sub2_Sub5_1;
			if (arg3 != -47097) {
				throw new NullPointerException();
			}
			local142.method326(local26, Class3.method5(arg0) & Class3.method5(arg1));
			if (arg0 != -1 && arg1 != -1) {
				local142.method333(arg2, arg1, arg0);
			} else if (arg0 != -1) {
				local142.method332(arg0);
			}
			if (this.anInt758 != 128 || this.anInt763 != 128) {
				local142.method340(this.anInt763, this.anInt758, this.anInt758);
			}
			local142.method328();
			local142.anIntArrayArray11 = null;
			local142.anIntArrayArray10 = null;
			if (this.aByte20 == 1) {
				local142.aBoolean125 = true;
			}
			return local142;
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("50047, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "c", descriptor = "(I)Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method540() {
		try {
			if (this.anIntArray197 != null) {
				@Pc(8) Class49 local8 = this.method534();
				return local8 == null ? null : local8.method540();
			} else if (this.anIntArray198 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray198.length; local35++) {
					if (!Class5_Sub1_Sub2_Sub5.method325(this.anIntArray198[local35])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(60) Class5_Sub1_Sub2_Sub5[] local60 = new Class5_Sub1_Sub2_Sub5[this.anIntArray198.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray198.length; local62++) {
					local60[local62] = Class5_Sub1_Sub2_Sub5.method324(this.anIntArray198[local62]);
				}
				@Pc(86) Class5_Sub1_Sub2_Sub5 local86;
				if (local60.length == 1) {
					local86 = local60[0];
				} else {
					local86 = new Class5_Sub1_Sub2_Sub5(8111, local60.length, local60);
				}
				if (this.anIntArray196 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray196.length; local101++) {
						local86.method338(this.anIntArray196[local101], this.anIntArray195[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("29592, " + -23891 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YIBRLAQY", name = "a", descriptor = "(Z)Z")
	public boolean method541() {
		try {
			if (this.anIntArray197 == null) {
				return true;
			}
			@Pc(12) int local12 = -1;
			if (this.anInt757 != -1) {
				@Pc(21) Class4 local21 = Class4.aClass4Array1[this.anInt757];
				@Pc(24) int local24 = local21.anInt16;
				@Pc(27) int local27 = local21.anInt17;
				@Pc(30) int local30 = local21.anInt18;
				@Pc(36) int local36 = client.anIntArray222[local30 - local27];
				local12 = aClient5.anIntArray216[local24] >> local27 & local36;
			} else if (this.anInt755 != -1) {
				local12 = aClient5.anIntArray216[this.anInt755];
			}
			return local12 >= 0 && local12 < this.anIntArray197.length && this.anIntArray197[local12] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("84208, " + false + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
