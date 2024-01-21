import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt556;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt557;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(-739, 30);

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte16 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt558 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt559 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt560 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt561 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt562 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt563 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt564 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt565 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt567 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt568 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt572 = 32;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	private int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method666("npc.dat", null), -26728);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("npc.idx", null), -26728);
		anInt556 = local19.method482();
		anIntArray169 = new int[anInt556];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt556; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.method482();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)V")
	public static void method322() {
		try {
			aClass40_6 = null;
			anIntArray169 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("32822, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
	public static Class13 method323(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt557 = (anInt557 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt557] = new Class13();
		aClass1_Sub1_Sub3_6.anInt742 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method324(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method324(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method480();
				if (local17 == 0) {
					return;
				}
				@Pc(26) int local26;
				@Pc(32) int local32;
				if (local17 == 1) {
					local26 = arg0.method480();
					this.anIntArray170 = new int[local26];
					for (local32 = 0; local32 < local26; local32++) {
						this.anIntArray170[local32] = arg0.method482();
					}
				} else if (local17 == 2) {
					this.aString24 = arg0.method487();
				} else if (local17 == 3) {
					this.aByteArray5 = arg0.method488((byte) 6);
				} else if (local17 == 12) {
					this.aByte16 = arg0.method481();
				} else if (local17 == 13) {
					this.anInt558 = arg0.method482();
				} else if (local17 == 14) {
					this.anInt559 = arg0.method482();
				} else if (local17 == 17) {
					this.anInt559 = arg0.method482();
					this.anInt560 = arg0.method482();
					this.anInt561 = arg0.method482();
					this.anInt562 = arg0.method482();
				} else if (local17 >= 30 && local17 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local17 - 30] = arg0.method487();
					if (this.aStringArray9[local17 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local17 - 30] = null;
					}
				} else if (local17 == 40) {
					local26 = arg0.method480();
					this.anIntArray172 = new int[local26];
					this.anIntArray173 = new int[local26];
					for (local32 = 0; local32 < local26; local32++) {
						this.anIntArray172[local32] = arg0.method482();
						this.anIntArray173[local32] = arg0.method482();
					}
				} else if (local17 == 60) {
					local26 = arg0.method480();
					this.anIntArray171 = new int[local26];
					for (local32 = 0; local32 < local26; local32++) {
						this.anIntArray171[local32] = arg0.method482();
					}
				} else if (local17 == 90) {
					this.anInt563 = arg0.method482();
				} else if (local17 == 91) {
					this.anInt564 = arg0.method482();
				} else if (local17 == 92) {
					this.anInt565 = arg0.method482();
				} else if (local17 == 93) {
					this.aBoolean139 = false;
				} else if (local17 == 95) {
					this.anInt566 = arg0.method482();
				} else if (local17 == 97) {
					this.anInt567 = arg0.method482();
				} else if (local17 == 98) {
					this.anInt568 = arg0.method482();
				} else if (local17 == 99) {
					this.aBoolean140 = true;
				} else if (local17 == 100) {
					this.anInt569 = arg0.method481();
				} else if (local17 == 101) {
					this.anInt570 = arg0.method481() * 5;
				} else if (local17 == 102) {
					this.anInt571 = arg0.method482();
				} else if (local17 == 103) {
					this.anInt572 = arg0.method482();
				} else if (local17 == 106) {
					this.anInt573 = arg0.method482();
					if (this.anInt573 == 65535) {
						this.anInt573 = -1;
					}
					this.anInt574 = arg0.method482();
					if (this.anInt574 == 65535) {
						this.anInt574 = -1;
					}
					local26 = arg0.method480();
					this.anIntArray174 = new int[local26 + 1];
					for (local32 = 0; local32 <= local26; local32++) {
						this.anIntArray174[local32] = arg0.method482();
						if (this.anIntArray174[local32] == 65535) {
							this.anIntArray174[local32] = -1;
						}
					}
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("76051, " + arg0 + ", " + 8 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I[IIZ)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327(559);
				return local8 == null ? null : local8.method325(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub5 local25 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local25 == null) {
				@Pc(38) boolean local38 = false;
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray170.length; local40++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local40])) {
						local38 = true;
					}
				}
				if (local38) {
					return null;
				}
				@Pc(65) Class1_Sub1_Sub1_Sub5[] local65 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(67) int local67 = 0; local67 < this.anIntArray170.length; local67++) {
					local65[local67] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local67]);
				}
				if (local65.length == 1) {
					local25 = local65[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub5(local65.length, -314, local65);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(107) int local107 = 0; local107 < this.anIntArray172.length; local107++) {
						local25.method275(this.anIntArray172[local107], this.anIntArray173[local107]);
					}
				}
				local25.method268();
				local25.method278(this.anInt569 + 64, this.anInt570 + 850, -30, -50, -30, true);
				aClass40_6.method592(this.aLong23, local25);
			}
			@Pc(150) Class1_Sub1_Sub1_Sub5 local150 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local150.method263(local25, Class12.method306(arg2) & Class12.method306(arg0));
			if (arg2 != -1 && arg0 != -1) {
				local150.method270(arg0, arg2, arg1);
			} else if (arg2 != -1) {
				local150.method269(arg2);
			}
			if (this.anInt567 != 128 || this.anInt568 != 128) {
				local150.method277(this.anInt567, this.anInt567, this.anInt568);
			}
			local150.method265();
			local150.anIntArrayArray9 = null;
			local150.anIntArrayArray8 = null;
			if (this.aByte16 == 1) {
				local150.aBoolean114 = true;
			}
			return local150;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("66785, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327(559);
				return local8 == null ? null : local8.method326();
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray171.length; local33++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local33])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(58) Class1_Sub1_Sub1_Sub5[] local58 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray171.length; local60++) {
					local58[local60] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local60]);
				}
				@Pc(85) Class1_Sub1_Sub1_Sub5 local85;
				if (local58.length == 1) {
					local85 = local58[0];
				} else {
					local85 = new Class1_Sub1_Sub1_Sub5(local58.length, -314, local58);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(100) int local100 = 0; local100 < this.anIntArray172.length; local100++) {
						local85.method275(this.anIntArray172[local100], this.anIntArray173[local100]);
					}
				}
				return local85;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("71278, " + -205 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "(I)Lclient!gc;")
	public Class13 method327(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) int local5 = -1;
			if (this.anInt573 != -1) {
				@Pc(14) Class36 local14 = Class36.aClass36Array1[this.anInt573];
				@Pc(17) int local17 = local14.anInt846;
				@Pc(20) int local20 = local14.anInt847;
				@Pc(23) int local23 = local14.anInt848;
				@Pc(29) int local29 = client.anIntArray48[local23 - local20];
				local5 = aClient4.anIntArray50[local17] >> local20 & local29;
			} else if (this.anInt574 != -1) {
				local5 = aClient4.anIntArray50[this.anInt574];
			}
			return local5 < 0 || local5 >= this.anIntArray174.length || this.anIntArray174[local5] == -1 ? null : method323(this.anIntArray174[local5]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("25428, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
