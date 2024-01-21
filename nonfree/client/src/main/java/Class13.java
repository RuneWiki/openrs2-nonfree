import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	private static int anInt525;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	private static int anInt526;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private static boolean aBoolean148 = true;

	@OriginalMember(owner = "client!gc", name = "M", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(30, (byte) 1);

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt539;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "B")
	public byte aByte18 = 1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt527 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt528 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt529 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt530 = -1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt531 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt532 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt533 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	private int anInt534 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt536 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt537 = 128;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "Z")
	public boolean aBoolean151 = false;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt540 = -1;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	public int anInt541 = 32;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt542 = -1;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "I")
	private int anInt543 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method666("npc.dat", null), (byte) -93);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("npc.idx", null), (byte) -93);
		anInt525 = local19.method482();
		anIntArray169 = new int[anInt525];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt525; local29++) {
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
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("29767, " + false + ", " + local17.toString());
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
		anInt526 = (anInt526 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt526] = new Class13();
		aClass1_Sub1_Sub3_6.anInt720 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method324(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method324(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method480();
					this.anIntArray170 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray170[local25] = arg0.method482();
					}
				} else if (local10 == 2) {
					this.aString24 = arg0.method487();
				} else if (local10 == 3) {
					this.aByteArray5 = arg0.method488();
				} else if (local10 == 12) {
					this.aByte18 = arg0.method481();
				} else if (local10 == 13) {
					this.anInt527 = arg0.method482();
				} else if (local10 == 14) {
					this.anInt528 = arg0.method482();
				} else if (local10 == 17) {
					this.anInt528 = arg0.method482();
					this.anInt529 = arg0.method482();
					this.anInt530 = arg0.method482();
					this.anInt531 = arg0.method482();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local10 - 30] = arg0.method487();
					if (this.aStringArray9[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method480();
					this.anIntArray172 = new int[local19];
					this.anIntArray173 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray172[local25] = arg0.method482();
						this.anIntArray173[local25] = arg0.method482();
					}
				} else if (local10 == 60) {
					local19 = arg0.method480();
					this.anIntArray171 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray171[local25] = arg0.method482();
					}
				} else if (local10 == 90) {
					this.anInt532 = arg0.method482();
				} else if (local10 == 91) {
					this.anInt533 = arg0.method482();
				} else if (local10 == 92) {
					this.anInt534 = arg0.method482();
				} else if (local10 == 93) {
					this.aBoolean150 = false;
				} else if (local10 == 95) {
					this.anInt535 = arg0.method482();
				} else if (local10 == 97) {
					this.anInt536 = arg0.method482();
				} else if (local10 == 98) {
					this.anInt537 = arg0.method482();
				} else if (local10 == 99) {
					this.aBoolean151 = true;
				} else if (local10 == 100) {
					this.anInt538 = arg0.method481();
				} else if (local10 == 101) {
					this.anInt539 = arg0.method481() * 5;
				} else if (local10 == 102) {
					this.anInt540 = arg0.method482();
				} else if (local10 == 103) {
					this.anInt541 = arg0.method482();
				} else if (local10 == 106) {
					this.anInt542 = arg0.method482();
					if (this.anInt542 == 65535) {
						this.anInt542 = -1;
					}
					this.anInt543 = arg0.method482();
					if (this.anInt543 == 65535) {
						this.anInt543 = -1;
					}
					local19 = arg0.method480();
					this.anIntArray174 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray174[local25] = arg0.method482();
						if (this.anIntArray174[local25] == 65535) {
							this.anIntArray174[local25] = -1;
						}
					}
				}
			}
		} catch (@Pc(376) RuntimeException local376) {
			signlink.reporterror("24807, " + 210 + ", " + arg0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(II[II)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327();
				return local8 == null ? null : local8.method325(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub5 local25 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local25 == null) {
				@Pc(37) boolean local37 = false;
				for (@Pc(39) int local39 = 0; local39 < this.anIntArray170.length; local39++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local39])) {
						local37 = true;
					}
				}
				if (local37) {
					return null;
				}
				@Pc(64) Class1_Sub1_Sub1_Sub5[] local64 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray170.length; local66++) {
					local64[local66] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local66]);
				}
				if (local64.length == 1) {
					local25 = local64[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub5(local64, local64.length, false);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(106) int local106 = 0; local106 < this.anIntArray172.length; local106++) {
						local25.method275(this.anIntArray172[local106], this.anIntArray173[local106]);
					}
				}
				local25.method268();
				local25.method278(this.anInt538 + 64, this.anInt539 + 850, -30, -50, -30, true);
				aClass40_6.method592(local25, this.aLong23);
			}
			@Pc(149) Class1_Sub1_Sub1_Sub5 local149 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local149.method263((byte) 9, local25, Class12.method306(arg1) & Class12.method306(arg0));
			if (arg1 != -1 && arg0 != -1) {
				local149.method270(arg2, arg0, arg1, this.aBoolean147);
			} else if (arg1 != -1) {
				local149.method269(arg1);
			}
			if (this.anInt536 != 128 || this.anInt537 != 128) {
				local149.method277(this.anInt536, this.anInt537, this.anInt536);
			}
			local149.method265();
			local149.anIntArrayArray9 = null;
			local149.anIntArrayArray8 = null;
			if (this.aByte18 == 1) {
				local149.aBoolean123 = true;
			}
			return local149;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("62616, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(20) Class13 local20 = this.method327();
				return local20 == null ? null : local20.method326();
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray171.length; local37++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class1_Sub1_Sub1_Sub5[] local62 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray171.length; local64++) {
					local62[local64] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local64]);
				}
				@Pc(89) Class1_Sub1_Sub1_Sub5 local89;
				if (local62.length == 1) {
					local89 = local62[0];
				} else {
					local89 = new Class1_Sub1_Sub1_Sub5(local62, local62.length, false);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(104) int local104 = 0; local104 < this.anIntArray172.length; local104++) {
						local89.method275(this.anIntArray172[local104], this.anIntArray173[local104]);
					}
				}
				return local89;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("36582, " + 8 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(Z)Lclient!gc;")
	public Class13 method327() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt542 != -1) {
				@Pc(20) Class36 local20 = Class36.aClass36Array1[this.anInt542];
				@Pc(23) int local23 = local20.anInt822;
				@Pc(26) int local26 = local20.anInt823;
				@Pc(29) int local29 = local20.anInt824;
				@Pc(35) int local35 = client.anIntArray57[local29 - local26];
				local1 = aClient4.anIntArray56[local23] >> local26 & local35;
			} else if (this.anInt543 != -1) {
				local1 = aClient4.anIntArray56[this.anInt543];
			}
			return local1 < 0 || local1 >= this.anIntArray174.length || this.anIntArray174[local1] == -1 ? null : method323(this.anIntArray174[local1]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("43663, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
