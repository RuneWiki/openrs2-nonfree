import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean152;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private static int anInt545;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "I")
	private static int anInt546;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(30, true);

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt558;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt559;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt544 = 16935;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "B")
	public byte aByte20 = 1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt548 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt549 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt550 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt551 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt552 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt553 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt554 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Z")
	public boolean aBoolean153 = true;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	public int anInt555 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt556 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt557 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "Z")
	public boolean aBoolean154 = false;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt560 = -1;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt561 = 32;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt562 = -1;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt563 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method666("npc.dat", null), aBoolean152);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("npc.idx", null), aBoolean152);
		anInt545 = local19.method482();
		anIntArray169 = new int[anInt545];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt545; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.method482();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method322(@OriginalArg(0) byte arg0) {
		try {
			aClass40_6 = null;
			anIntArray169 = null;
			@Pc(8) boolean local8 = false;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("69034, " + arg0 + ", " + local17.toString());
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
		anInt546 = (anInt546 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt546] = new Class13();
		aClass1_Sub1_Sub3_6.anInt733 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method324(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!lb;)V")
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
					this.aByte20 = arg0.method481();
				} else if (local10 == 13) {
					this.anInt547 = arg0.method482();
				} else if (local10 == 14) {
					this.anInt548 = arg0.method482();
				} else if (local10 == 17) {
					this.anInt548 = arg0.method482();
					this.anInt549 = arg0.method482();
					this.anInt550 = arg0.method482();
					this.anInt551 = arg0.method482();
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
					this.anInt552 = arg0.method482();
				} else if (local10 == 91) {
					this.anInt553 = arg0.method482();
				} else if (local10 == 92) {
					this.anInt554 = arg0.method482();
				} else if (local10 == 93) {
					this.aBoolean153 = false;
				} else if (local10 == 95) {
					this.anInt555 = arg0.method482();
				} else if (local10 == 97) {
					this.anInt556 = arg0.method482();
				} else if (local10 == 98) {
					this.anInt557 = arg0.method482();
				} else if (local10 == 99) {
					this.aBoolean154 = true;
				} else if (local10 == 100) {
					this.anInt558 = arg0.method481();
				} else if (local10 == 101) {
					this.anInt559 = arg0.method481() * 5;
				} else if (local10 == 102) {
					this.anInt560 = arg0.method482();
				} else if (local10 == 103) {
					this.anInt561 = arg0.method482();
				} else if (local10 == 106) {
					this.anInt562 = arg0.method482();
					if (this.anInt562 == 65535) {
						this.anInt562 = -1;
					}
					this.anInt563 = arg0.method482();
					if (this.anInt563 == 65535) {
						this.anInt563 = -1;
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
			signlink.reporterror("28863, " + false + ", " + arg0 + ", " + local376.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BII[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray174 != null) {
				@Pc(19) Class13 local19 = this.method327();
				return local19 == null ? null : local19.method325((byte) 3, arg1, arg2, arg3);
			}
			@Pc(36) Class1_Sub1_Sub1_Sub5 local36 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local36 == null) {
				@Pc(40) boolean local40 = false;
				for (@Pc(42) int local42 = 0; local42 < this.anIntArray170.length; local42++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local42])) {
						local40 = true;
					}
				}
				if (local40) {
					return null;
				}
				@Pc(67) Class1_Sub1_Sub1_Sub5[] local67 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(69) int local69 = 0; local69 < this.anIntArray170.length; local69++) {
					local67[local69] = Class1_Sub1_Sub1_Sub5.method261((byte) 4, this.anIntArray170[local69]);
				}
				if (local67.length == 1) {
					local36 = local67[0];
				} else {
					local36 = new Class1_Sub1_Sub1_Sub5(local67, this.anInt544, local67.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(110) int local110 = 0; local110 < this.anIntArray172.length; local110++) {
						local36.method275(this.anIntArray172[local110], this.anIntArray173[local110]);
					}
				}
				local36.method268();
				local36.method278(this.anInt558 + 64, this.anInt559 + 850, -30, -50, -30, true);
				aClass40_6.method592(this.aLong23, local36);
			}
			@Pc(153) Class1_Sub1_Sub1_Sub5 local153 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local153.method263(local36, Class12.method306(arg2, (byte) 7) & Class12.method306(arg1, (byte) 7));
			if (arg2 != -1 && arg1 != -1) {
				local153.method270(arg2, arg1, arg3);
			} else if (arg2 != -1) {
				local153.method269(arg2);
			}
			if (this.anInt556 != 128 || this.anInt557 != 128) {
				local153.method277(this.anInt556, this.anInt556, this.anInt557);
			}
			local153.method265();
			local153.anIntArrayArray9 = null;
			local153.anIntArrayArray8 = null;
			if (this.aByte20 == 1) {
				local153.aBoolean128 = true;
			}
			return local153;
		} catch (@Pc(221) RuntimeException local221) {
			signlink.reporterror("77894, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local221.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327();
				return local8 == null ? null : local8.method326((byte) 7);
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				@Pc(28) boolean local28 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray171.length; local36++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local36])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(61) Class1_Sub1_Sub1_Sub5[] local61 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray171.length; local63++) {
					local61[local63] = Class1_Sub1_Sub1_Sub5.method261((byte) 4, this.anIntArray171[local63]);
				}
				@Pc(88) Class1_Sub1_Sub1_Sub5 local88;
				if (local61.length == 1) {
					local88 = local61[0];
				} else {
					local88 = new Class1_Sub1_Sub1_Sub5(local61, this.anInt544, local61.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(104) int local104 = 0; local104 < this.anIntArray172.length; local104++) {
						local88.method275(this.anIntArray172[local104], this.anIntArray173[local104]);
					}
				}
				return local88;
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("67439, " + arg0 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
	public Class13 method327() {
		try {
			@Pc(10) int local10 = -1;
			if (this.anInt562 != -1) {
				@Pc(19) Class36 local19 = Class36.aClass36Array1[this.anInt562];
				@Pc(22) int local22 = local19.anInt834;
				@Pc(25) int local25 = local19.anInt835;
				@Pc(28) int local28 = local19.anInt836;
				@Pc(34) int local34 = client.anIntArray88[local28 - local25];
				local10 = aClient4.anIntArray73[local22] >> local25 & local34;
			} else if (this.anInt563 != -1) {
				local10 = aClient4.anIntArray73[this.anInt563];
			}
			return local10 < 0 || local10 >= this.anIntArray174.length || this.anIntArray174[local10] == -1 ? null : method323(this.anIntArray174[local10]);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("6792, " + -13461 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
