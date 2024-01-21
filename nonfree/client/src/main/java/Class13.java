import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	private static int anInt531;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "I")
	private static int anInt532;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(30, 0);

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt544;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean153 = true;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt529 = 4697;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Z")
	private boolean aBoolean154 = true;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "Z")
	private boolean aBoolean155 = false;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	private int anInt530 = 848;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "J")
	private long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "B")
	public byte aByte19 = 1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt533 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt534 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt535 = -1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt536 = -1;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "I")
	public int anInt537 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt538 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	private int anInt539 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt540 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	public int anInt541 = -1;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt542 = 128;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt543 = 128;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "Z")
	public boolean aBoolean157 = false;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	public int anInt546 = -1;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	public int anInt547 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method318(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("npc.idx", null));
		anInt531 = local19.method474();
		anIntArray167 = new int[anInt531];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt531; local29++) {
			anIntArray167[local29] = local27;
			local27 += local19.method474();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method319() {
		try {
			aClass40_6 = null;
			anIntArray167 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("44055, " + 5 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method320(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt532 = (anInt532 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt532] = new Class13();
		aClass1_Sub1_Sub3_6.anInt715 = anIntArray167[arg0];
		local33.aLong23 = arg0;
		local33.method321(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method321(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method472();
				if (local15 == 0) {
					return;
				}
				@Pc(24) int local24;
				@Pc(30) int local30;
				if (local15 == 1) {
					local24 = arg0.method472();
					this.anIntArray168 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray168[local30] = arg0.method474();
					}
				} else if (local15 == 2) {
					this.aString24 = arg0.method479();
				} else if (local15 == 3) {
					this.aByteArray5 = arg0.method480();
				} else if (local15 == 12) {
					this.aByte19 = arg0.method473();
				} else if (local15 == 13) {
					this.anInt533 = arg0.method474();
				} else if (local15 == 14) {
					this.anInt534 = arg0.method474();
				} else if (local15 == 17) {
					this.anInt534 = arg0.method474();
					this.anInt535 = arg0.method474();
					this.anInt536 = arg0.method474();
					this.anInt537 = arg0.method474();
				} else if (local15 >= 30 && local15 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local15 - 30] = arg0.method479();
					if (this.aStringArray9[local15 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local15 - 30] = null;
					}
				} else if (local15 == 40) {
					local24 = arg0.method472();
					this.anIntArray170 = new int[local24];
					this.anIntArray171 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray170[local30] = arg0.method474();
						this.anIntArray171[local30] = arg0.method474();
					}
				} else if (local15 == 60) {
					local24 = arg0.method472();
					this.anIntArray169 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray169[local30] = arg0.method474();
					}
				} else if (local15 == 90) {
					this.anInt538 = arg0.method474();
				} else if (local15 == 91) {
					this.anInt539 = arg0.method474();
				} else if (local15 == 92) {
					this.anInt540 = arg0.method474();
				} else if (local15 == 93) {
					this.aBoolean156 = false;
				} else if (local15 == 95) {
					this.anInt541 = arg0.method474();
				} else if (local15 == 97) {
					this.anInt542 = arg0.method474();
				} else if (local15 == 98) {
					this.anInt543 = arg0.method474();
				} else if (local15 == 99) {
					this.aBoolean157 = true;
				} else if (local15 == 100) {
					this.anInt544 = arg0.method473();
				} else if (local15 == 101) {
					this.anInt545 = arg0.method473() * 5;
				} else if (local15 == 102) {
					this.anInt546 = arg0.method474();
				} else if (local15 == 103) {
					this.anInt547 = arg0.method474();
				}
			}
		} catch (@Pc(320) RuntimeException local320) {
			signlink.reporterror("80342, " + arg0 + ", " + -32477 + ", " + local320.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I[III)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method583(this.aLong23);
			if (local7 == null) {
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray168.length; local22++) {
					if (!Class1_Sub1_Sub1_Sub5.method260(this.anIntArray168[local22])) {
						local20 = true;
					}
				}
				if (local20) {
					return null;
				}
				@Pc(47) Class1_Sub1_Sub1_Sub5[] local47 = new Class1_Sub1_Sub1_Sub5[this.anIntArray168.length];
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray168.length; local49++) {
					local47[local49] = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean153, this.anIntArray168[local49]);
				}
				if (local47.length == 1) {
					local7 = local47[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(local47.length, local47, this.anInt529);
				}
				if (this.anIntArray170 != null) {
					for (@Pc(91) int local91 = 0; local91 < this.anIntArray170.length; local91++) {
						local7.method273(this.anIntArray170[local91], this.anIntArray171[local91]);
					}
				}
				local7.method266();
				local7.method276(this.anInt544 + 64, this.anInt545 + 850, -30, -50, -30, true);
				aClass40_6.method584(this.aLong23, local7, this.anInt530);
			}
			@Pc(135) Class1_Sub1_Sub1_Sub5 local135 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local135.method261(Class12.method303(arg0, 681) & Class12.method303(arg2, 681), local7);
			if (arg0 != -1 && arg2 != -1) {
				local135.method268(arg2, arg1, arg0);
			} else if (arg0 != -1) {
				local135.method267(arg0);
			}
			if (this.anInt542 != 128 || this.anInt543 != 128) {
				local135.method275(this.anInt542, this.anInt543, this.anInt542);
			}
			local135.method263(this.aBoolean154);
			local135.anIntArrayArray9 = null;
			local135.anIntArrayArray8 = null;
			if (this.aByte19 == 1) {
				local135.aBoolean126 = true;
			}
			return local135;
		} catch (@Pc(204) RuntimeException local204) {
			signlink.reporterror("26194, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local204.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method323() {
		try {
			if (this.anIntArray169 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray169.length; local15++) {
				if (!Class1_Sub1_Sub1_Sub5.method260(this.anIntArray169[local15])) {
					local13 = true;
				}
			}
			if (local13) {
				return null;
			}
			@Pc(40) Class1_Sub1_Sub1_Sub5[] local40 = new Class1_Sub1_Sub1_Sub5[this.anIntArray169.length];
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray169.length; local42++) {
				local40[local42] = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean153, this.anIntArray169[local42]);
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5 local68;
			if (local40.length == 1) {
				local68 = local40[0];
			} else {
				local68 = new Class1_Sub1_Sub1_Sub5(local40.length, local40, this.anInt529);
			}
			if (this.anIntArray170 != null) {
				for (@Pc(84) int local84 = 0; local84 < this.anIntArray170.length; local84++) {
					local68.method273(this.anIntArray170[local84], this.anIntArray171[local84]);
				}
			}
			return local68;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("65494, " + false + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
