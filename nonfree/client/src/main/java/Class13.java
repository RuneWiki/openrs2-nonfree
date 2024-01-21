import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	private static int anInt568;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "I")
	private static int anInt569;

	@OriginalMember(owner = "client!gc", name = "N", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(false, 30);

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt582;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "B")
	private byte aByte25 = -41;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private int anInt567 = 26254;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "B")
	public byte aByte26 = 1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt570 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt572 = -1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "I")
	public int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt575 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	private int anInt576 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt577 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	public int anInt578 = -1;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt579 = 128;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt580 = 128;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "Z")
	public boolean aBoolean153 = false;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	public int anInt584 = 32;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!gc", name = "M", descriptor = "I")
	private int anInt586 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(-49365, arg0.method666("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(-49365, arg0.method666("npc.idx", null));
		anInt568 = local19.method482();
		anIntArray169 = new int[anInt568];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt568; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.method482();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)V")
	public static void method322() {
		try {
			aClass40_6 = null;
			anIntArray169 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("80541, " + true + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method323(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt569 = (anInt569 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt569] = new Class13();
		aClass1_Sub1_Sub3_6.anInt763 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method324(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method324(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method480();
					this.anIntArray170 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray170[local28] = arg0.method482();
					}
				} else if (local13 == 2) {
					this.aString24 = arg0.method487();
				} else if (local13 == 3) {
					this.aByteArray5 = arg0.method488();
				} else if (local13 == 12) {
					this.aByte26 = arg0.method481();
				} else if (local13 == 13) {
					this.anInt570 = arg0.method482();
				} else if (local13 == 14) {
					this.anInt571 = arg0.method482();
				} else if (local13 == 17) {
					this.anInt571 = arg0.method482();
					this.anInt572 = arg0.method482();
					this.anInt573 = arg0.method482();
					this.anInt574 = arg0.method482();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local13 - 30] = arg0.method487();
					if (this.aStringArray9[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method480();
					this.anIntArray172 = new int[local22];
					this.anIntArray173 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray172[local28] = arg0.method482();
						this.anIntArray173[local28] = arg0.method482();
					}
				} else if (local13 == 60) {
					local22 = arg0.method480();
					this.anIntArray171 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray171[local28] = arg0.method482();
					}
				} else if (local13 == 90) {
					this.anInt575 = arg0.method482();
				} else if (local13 == 91) {
					this.anInt576 = arg0.method482();
				} else if (local13 == 92) {
					this.anInt577 = arg0.method482();
				} else if (local13 == 93) {
					this.aBoolean152 = false;
				} else if (local13 == 95) {
					this.anInt578 = arg0.method482();
				} else if (local13 == 97) {
					this.anInt579 = arg0.method482();
				} else if (local13 == 98) {
					this.anInt580 = arg0.method482();
				} else if (local13 == 99) {
					this.aBoolean153 = true;
				} else if (local13 == 100) {
					this.anInt581 = arg0.method481();
				} else if (local13 == 101) {
					this.anInt582 = arg0.method481() * 5;
				} else if (local13 == 102) {
					this.anInt583 = arg0.method482();
				} else if (local13 == 103) {
					this.anInt584 = arg0.method482();
				} else if (local13 == 106) {
					this.anInt585 = arg0.method482();
					if (this.anInt585 == 65535) {
						this.anInt585 = -1;
					}
					this.anInt586 = arg0.method482();
					if (this.anInt586 == 65535) {
						this.anInt586 = -1;
					}
					local22 = arg0.method480();
					this.anIntArray174 = new int[local22 + 1];
					for (local28 = 0; local28 <= local22; local28++) {
						this.anIntArray174[local28] = arg0.method482();
						if (this.anIntArray174[local28] == 65535) {
							this.anIntArray174[local28] = -1;
						}
					}
				}
			}
		} catch (@Pc(379) RuntimeException local379) {
			signlink.reporterror("98892, " + arg0 + ", " + false + ", " + local379.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(IIZ[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(18) Class13 local18 = this.method327();
				return local18 == null ? null : local18.method325(arg0, arg1, arg2);
			}
			@Pc(35) Class1_Sub1_Sub1_Sub5 local35 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray170.length; local41++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(66) Class1_Sub1_Sub1_Sub5[] local66 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray170.length; local68++) {
					local66[local68] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local68]);
				}
				if (local66.length == 1) {
					local35 = local66[0];
				} else {
					local35 = new Class1_Sub1_Sub1_Sub5(local66, this.aByte25, local66.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(109) int local109 = 0; local109 < this.anIntArray172.length; local109++) {
						local35.method275(this.anIntArray172[local109], this.anIntArray173[local109]);
					}
				}
				local35.method268();
				local35.method278(this.anInt581 + 64, this.anInt582 + 850, -30, -50, -30, true);
				aClass40_6.method592(this.aLong23, local35);
			}
			@Pc(152) Class1_Sub1_Sub1_Sub5 local152 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local152.method263(local35, Class12.method306(arg0, this.aBoolean151) & Class12.method306(arg1, this.aBoolean151));
			if (arg0 != -1 && arg1 != -1) {
				local152.method270(arg0, arg2, arg1);
			} else if (arg0 != -1) {
				local152.method269(arg0);
			}
			if (this.anInt579 != 128 || this.anInt580 != 128) {
				local152.method277(this.anInt579, this.anInt579, this.anInt580);
			}
			local152.method265();
			local152.anIntArrayArray9 = null;
			local152.anIntArrayArray8 = null;
			if (this.aByte26 == 1) {
				local152.aBoolean123 = true;
			}
			return local152;
		} catch (@Pc(222) RuntimeException local222) {
			signlink.reporterror("91603, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local222.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(13) Class13 local13 = this.method327();
				return local13 == null ? null : local13.method326();
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(28) boolean local28 = false;
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray171.length; local30++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local30])) {
						local28 = true;
					}
				}
				if (local28) {
					return null;
				}
				@Pc(55) Class1_Sub1_Sub1_Sub5[] local55 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(57) int local57 = 0; local57 < this.anIntArray171.length; local57++) {
					local55[local57] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local57]);
				}
				@Pc(82) Class1_Sub1_Sub1_Sub5 local82;
				if (local55.length == 1) {
					local82 = local55[0];
				} else {
					local82 = new Class1_Sub1_Sub1_Sub5(local55, this.aByte25, local55.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray172.length; local98++) {
						local82.method275(this.anIntArray172[local98], this.anIntArray173[local98]);
					}
				}
				return local82;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("31616, " + -869 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!gc;")
	public Class13 method327() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt585 != -1) {
				@Pc(17) Class36 local17 = Class36.aClass36Array1[this.anInt585];
				@Pc(20) int local20 = local17.anInt862;
				@Pc(23) int local23 = local17.anInt863;
				@Pc(26) int local26 = local17.anInt864;
				@Pc(32) int local32 = client.anIntArray91[local26 - local23];
				local8 = aClient4.anIntArray81[local20] >> local23 & local32;
			} else if (this.anInt586 != -1) {
				local8 = aClient4.anIntArray81[this.anInt586];
			}
			return local8 < 0 || local8 >= this.anIntArray174.length || this.anIntArray174[local8] == -1 ? null : method323(this.anIntArray174[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("29141, " + 930 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
