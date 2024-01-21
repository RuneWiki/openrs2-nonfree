import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YGGALXYD")
public final class Class45 {

	@OriginalMember(owner = "client!YGGALXYD", name = "c", descriptor = "[Lclient!YGGALXYD;")
	private static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!YGGALXYD", name = "h", descriptor = "[I")
	private static int[] anIntArray172;

	@OriginalMember(owner = "client!YGGALXYD", name = "l", descriptor = "I")
	private static int anInt685;

	@OriginalMember(owner = "client!YGGALXYD", name = "y", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!YGGALXYD", name = "D", descriptor = "I")
	private static int anInt694;

	@OriginalMember(owner = "client!YGGALXYD", name = "I", descriptor = "Lclient!LBBVYYXO;")
	private static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_5;

	@OriginalMember(owner = "client!YGGALXYD", name = "r", descriptor = "Lclient!THJKANXW;")
	public static Class36 aClass36_9 = new Class36(30, false);

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!YGGALXYD", name = "f", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!YGGALXYD", name = "k", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!YGGALXYD", name = "n", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!YGGALXYD", name = "q", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!YGGALXYD", name = "s", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!YGGALXYD", name = "x", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!YGGALXYD", name = "C", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!YGGALXYD", name = "E", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!YGGALXYD", name = "F", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!YGGALXYD", name = "b", descriptor = "I")
	public int anInt680 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "d", descriptor = "Z")
	public boolean aBoolean158 = false;

	@OriginalMember(owner = "client!YGGALXYD", name = "e", descriptor = "I")
	private int anInt681 = 5;

	@OriginalMember(owner = "client!YGGALXYD", name = "g", descriptor = "I")
	public int anInt682 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "i", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!YGGALXYD", name = "j", descriptor = "I")
	private int anInt683 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "m", descriptor = "I")
	public int anInt686 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "o", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "p", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!YGGALXYD", name = "t", descriptor = "I")
	private int anInt688 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "u", descriptor = "I")
	private int anInt689 = 128;

	@OriginalMember(owner = "client!YGGALXYD", name = "v", descriptor = "I")
	private int anInt690 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "w", descriptor = "I")
	private int anInt691 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "z", descriptor = "Z")
	public boolean aBoolean160 = true;

	@OriginalMember(owner = "client!YGGALXYD", name = "A", descriptor = "I")
	public int anInt692 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "B", descriptor = "I")
	private int anInt693 = 128;

	@OriginalMember(owner = "client!YGGALXYD", name = "G", descriptor = "I")
	public int anInt696 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "H", descriptor = "B")
	public byte aByte22 = 1;

	@OriginalMember(owner = "client!YGGALXYD", name = "J", descriptor = "I")
	public int anInt697 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "K", descriptor = "I")
	public int anInt698 = 32;

	@OriginalMember(owner = "client!YGGALXYD", name = "L", descriptor = "I")
	private int anInt699 = -1;

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(Z)V")
	public static void method514() {
		try {
			aClass36_9 = null;
			anIntArray172 = null;
			aClass45Array1 = null;
			aClass2_Sub1_Sub3_5 = null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("43522, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "c", descriptor = "(I)Lclient!YGGALXYD;")
	public static Class45 method516(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass45Array1[local1].aLong23 == (long) arg0) {
				return aClass45Array1[local1];
			}
		}
		anInt694 = (anInt694 + 1) % 20;
		@Pc(33) Class45 local33 = aClass45Array1[anInt694] = new Class45();
		aClass2_Sub1_Sub3_5.anInt283 = anIntArray172[arg0];
		local33.aLong23 = arg0;
		local33.method511(aClass2_Sub1_Sub3_5);
		return local33;
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(Lclient!FUZJMGZB;)V")
	public static void method517(@OriginalArg(0) Class13 arg0) {
		aClass2_Sub1_Sub3_5 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("npc.dat", null));
		@Pc(19) Class2_Sub1_Sub3 local19 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("npc.idx", null));
		anInt685 = local19.method269();
		anIntArray172 = new int[anInt685];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt685; local29++) {
			anIntArray172[local29] = local27;
			local27 += local19.method269();
		}
		aClass45Array1 = new Class45[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass45Array1[local49] = new Class45();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "<init>", descriptor = "()V")
	private Class45() {
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(IBI[I)Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method510(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(17) Class45 local17 = this.method513();
				return local17 == null ? null : local17.method510(arg0, arg1, arg2);
			}
			@Pc(34) Class2_Sub1_Sub1_Sub2 local34 = (Class2_Sub1_Sub1_Sub2) aClass36_9.method456(this.aLong23);
			if (local34 == null) {
				@Pc(38) boolean local38 = false;
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray170.length; local40++) {
					if (!Class2_Sub1_Sub1_Sub2.method92(this.anIntArray170[local40])) {
						local38 = true;
					}
				}
				if (local38) {
					return null;
				}
				@Pc(65) Class2_Sub1_Sub1_Sub2[] local65 = new Class2_Sub1_Sub1_Sub2[this.anIntArray170.length];
				for (@Pc(67) int local67 = 0; local67 < this.anIntArray170.length; local67++) {
					local65[local67] = Class2_Sub1_Sub1_Sub2.method91(this.anIntArray170[local67]);
				}
				if (local65.length == 1) {
					local34 = local65[0];
				} else {
					local34 = new Class2_Sub1_Sub1_Sub2(local65, 3, local65.length);
				}
				if (this.anIntArray175 != null) {
					for (@Pc(106) int local106 = 0; local106 < this.anIntArray175.length; local106++) {
						local34.method105(this.anIntArray175[local106], this.anIntArray171[local106]);
					}
				}
				local34.method98();
				local34.method108(this.anInt684 + 64, this.anInt695 + 850, -30, -50, -30, true);
				aClass36_9.method457(this.aLong23, local34);
			}
			@Pc(149) Class2_Sub1_Sub1_Sub2 local149 = Class2_Sub1_Sub1_Sub2.aClass2_Sub1_Sub1_Sub2_1;
			local149.method93(Class32.method374(arg1) & Class32.method374(arg0), local34);
			if (arg1 != -1 && arg0 != -1) {
				local149.method100(arg1, arg0, arg2);
			} else if (arg1 != -1) {
				local149.method99(257, arg1);
			}
			if (this.anInt689 != 128 || this.anInt693 != 128) {
				local149.method107(this.anInt689, this.anInt693, this.anInt689);
			}
			local149.method95();
			local149.anIntArrayArray6 = null;
			local149.anIntArrayArray5 = null;
			if (this.aByte22 == 1) {
				local149.aBoolean33 = true;
			}
			return local149;
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("25356, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method511(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method267();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method267();
					this.anIntArray170 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray170[local26] = arg0.method269();
					}
				} else if (local11 == 2) {
					this.aString16 = arg0.method274();
				} else if (local11 == 3) {
					this.aByteArray12 = arg0.method275();
				} else if (local11 == 12) {
					this.aByte22 = arg0.method268();
				} else if (local11 == 13) {
					this.anInt692 = arg0.method269();
				} else if (local11 == 14) {
					this.anInt697 = arg0.method269();
				} else if (local11 == 17) {
					this.anInt697 = arg0.method269();
					this.anInt680 = arg0.method269();
					this.anInt687 = arg0.method269();
					this.anInt696 = arg0.method269();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray7 == null) {
						this.aStringArray7 = new String[5];
					}
					this.aStringArray7[local11 - 30] = arg0.method274();
					if (this.aStringArray7[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray7[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method267();
					this.anIntArray175 = new int[local20];
					this.anIntArray171 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray175[local26] = arg0.method269();
						this.anIntArray171[local26] = arg0.method269();
					}
				} else if (local11 == 60) {
					local20 = arg0.method267();
					this.anIntArray173 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray173[local26] = arg0.method269();
					}
				} else if (local11 == 90) {
					this.anInt699 = arg0.method269();
				} else if (local11 == 91) {
					this.anInt688 = arg0.method269();
				} else if (local11 == 92) {
					this.anInt683 = arg0.method269();
				} else if (local11 == 93) {
					this.aBoolean160 = false;
				} else if (local11 == 95) {
					this.anInt686 = arg0.method269();
				} else if (local11 == 97) {
					this.anInt689 = arg0.method269();
				} else if (local11 == 98) {
					this.anInt693 = arg0.method269();
				} else if (local11 == 99) {
					this.aBoolean158 = true;
				} else if (local11 == 100) {
					this.anInt684 = arg0.method268();
				} else if (local11 == 101) {
					this.anInt695 = arg0.method268() * 5;
				} else if (local11 == 102) {
					this.anInt682 = arg0.method269();
				} else if (local11 == 103) {
					this.anInt698 = arg0.method269();
				} else if (local11 == 106) {
					this.anInt690 = arg0.method269();
					if (this.anInt690 == 65535) {
						this.anInt690 = -1;
					}
					this.anInt691 = arg0.method269();
					if (this.anInt691 == 65535) {
						this.anInt691 = -1;
					}
					local20 = arg0.method267();
					this.anIntArray174 = new int[local20 + 1];
					for (local26 = 0; local26 <= local20; local26++) {
						this.anIntArray174[local26] = arg0.method269();
						if (this.anIntArray174[local26] == 65535) {
							this.anIntArray174[local26] = -1;
						}
					}
				} else if (local11 == 107) {
					this.aBoolean159 = false;
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("99353, " + arg0 + ", " + 59 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(I)Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method512() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class45 local8 = this.method513();
				return local8 == null ? null : local8.method512();
			} else if (this.anIntArray173 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray173.length; local31++) {
					if (!Class2_Sub1_Sub1_Sub2.method92(this.anIntArray173[local31])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(56) Class2_Sub1_Sub1_Sub2[] local56 = new Class2_Sub1_Sub1_Sub2[this.anIntArray173.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray173.length; local58++) {
					local56[local58] = Class2_Sub1_Sub1_Sub2.method91(this.anIntArray173[local58]);
				}
				@Pc(82) Class2_Sub1_Sub1_Sub2 local82;
				if (local56.length == 1) {
					local82 = local56[0];
				} else {
					local82 = new Class2_Sub1_Sub1_Sub2(local56, 3, local56.length);
				}
				if (this.anIntArray175 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray175.length; local97++) {
						local82.method105(this.anIntArray175[local97], this.anIntArray171[local97]);
					}
				}
				return local82;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("97938, " + -384 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "b", descriptor = "(I)Lclient!YGGALXYD;")
	public Class45 method513() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt690 != -1) {
				@Pc(20) Class15 local20 = Class15.aClass15Array1[this.anInt690];
				@Pc(23) int local23 = local20.anInt239;
				@Pc(26) int local26 = local20.anInt240;
				@Pc(29) int local29 = local20.anInt241;
				@Pc(35) int local35 = client.anIntArray276[local29 - local26];
				local11 = aClient5.anIntArray253[local23] >> local26 & local35;
			} else if (this.anInt691 != -1) {
				local11 = aClient5.anIntArray253[this.anInt691];
			}
			return local11 < 0 || local11 >= this.anIntArray174.length || this.anIntArray174[local11] == -1 ? null : method516(this.anIntArray174[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("31786, " + 7 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGGALXYD", name = "a", descriptor = "(B)Z")
	public boolean method515() {
		try {
			if (this.anIntArray174 == null) {
				return true;
			}
			@Pc(18) int local18 = -1;
			if (this.anInt690 != -1) {
				@Pc(27) Class15 local27 = Class15.aClass15Array1[this.anInt690];
				@Pc(30) int local30 = local27.anInt239;
				@Pc(33) int local33 = local27.anInt240;
				@Pc(36) int local36 = local27.anInt241;
				@Pc(42) int local42 = client.anIntArray276[local36 - local33];
				local18 = aClient5.anIntArray253[local30] >> local33 & local42;
			} else if (this.anInt691 != -1) {
				local18 = aClient5.anIntArray253[this.anInt691];
			}
			return local18 >= 0 && local18 < this.anIntArray174.length && this.anIntArray174[local18] != -1;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("31452, " + -92 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
