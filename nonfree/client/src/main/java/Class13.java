import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private static int anInt555;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private static int anInt556;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "I")
	private static int anInt557;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40((byte) 8, 30);

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
	private int anInt569;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "B")
	public byte aByte18 = 1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt558 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt559 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt560 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt561 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt562 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt563 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt564 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt565 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt567 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt568 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt572 = 32;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method666("npc.dat", null), 58);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method666("npc.idx", null), 58);
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
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("15635, " + 0 + ", " + local15.toString());
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
		local33.method324(aClass1_Sub1_Sub3_6, 913);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method324(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method480();
					if (local8 == 0) {
						return;
					}
					@Pc(17) int local17;
					@Pc(23) int local23;
					if (local8 == 1) {
						local17 = arg0.method480();
						this.anIntArray170 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray170[local23] = arg0.method482();
						}
					} else if (local8 == 2) {
						this.aString24 = arg0.method487();
					} else if (local8 == 3) {
						this.aByteArray5 = arg0.method488();
					} else if (local8 == 12) {
						this.aByte18 = arg0.method481();
					} else if (local8 == 13) {
						this.anInt558 = arg0.method482();
					} else if (local8 == 14) {
						this.anInt559 = arg0.method482();
					} else if (local8 == 17) {
						this.anInt559 = arg0.method482();
						this.anInt560 = arg0.method482();
						this.anInt561 = arg0.method482();
						this.anInt562 = arg0.method482();
					} else if (local8 >= 30 && local8 < 40) {
						if (this.aStringArray9 == null) {
							this.aStringArray9 = new String[5];
						}
						this.aStringArray9[local8 - 30] = arg0.method487();
						if (this.aStringArray9[local8 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray9[local8 - 30] = null;
						}
					} else if (local8 == 40) {
						local17 = arg0.method480();
						this.anIntArray172 = new int[local17];
						this.anIntArray173 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray172[local23] = arg0.method482();
							this.anIntArray173[local23] = arg0.method482();
						}
					} else if (local8 == 60) {
						local17 = arg0.method480();
						this.anIntArray171 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray171[local23] = arg0.method482();
						}
					} else if (local8 == 90) {
						this.anInt563 = arg0.method482();
					} else if (local8 == 91) {
						this.anInt564 = arg0.method482();
					} else if (local8 == 92) {
						this.anInt565 = arg0.method482();
					} else if (local8 == 93) {
						this.aBoolean145 = false;
					} else if (local8 == 95) {
						this.anInt566 = arg0.method482();
					} else if (local8 == 97) {
						this.anInt567 = arg0.method482();
					} else if (local8 == 98) {
						this.anInt568 = arg0.method482();
					} else if (local8 == 99) {
						this.aBoolean146 = true;
					} else if (local8 == 100) {
						this.anInt569 = arg0.method481();
					} else if (local8 == 101) {
						this.anInt570 = arg0.method481() * 5;
					} else if (local8 == 102) {
						this.anInt571 = arg0.method482();
					} else if (local8 == 103) {
						this.anInt572 = arg0.method482();
					} else if (local8 == 106) {
						this.anInt573 = arg0.method482();
						if (this.anInt573 == 65535) {
							this.anInt573 = -1;
						}
						this.anInt574 = arg0.method482();
						if (this.anInt574 == 65535) {
							this.anInt574 = -1;
						}
						local17 = arg0.method480();
						this.anIntArray174 = new int[local17 + 1];
						for (local23 = 0; local23 <= local17; local23++) {
							this.anIntArray174[local23] = arg0.method482();
							if (this.anIntArray174[local23] == 65535) {
								this.anIntArray174[local23] = -1;
							}
						}
					}
				}
			}
		} catch (@Pc(374) RuntimeException local374) {
			signlink.reporterror("43361, " + arg0 + ", " + arg1 + ", " + local374.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I[IZI)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327((byte) 8);
				return local8 == null ? null : local8.method325(arg0, arg1, arg2);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub5 local25 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local25 == null) {
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
					local25 = local66[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub5((byte) 2, local66, local66.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(108) int local108 = 0; local108 < this.anIntArray172.length; local108++) {
						local25.method275(this.anIntArray172[local108], this.anIntArray173[local108]);
					}
				}
				local25.method268();
				local25.method278(this.anInt569 + 64, this.anInt570 + 850, -30, -50, -30, true);
				aClass40_6.method592(this.aLong23, local25);
			}
			@Pc(151) Class1_Sub1_Sub1_Sub5 local151 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local151.method263(Class12.method306(arg0) & Class12.method306(arg2), local25);
			if (arg0 != -1 && arg2 != -1) {
				local151.method270(arg1, arg2, arg0);
			} else if (arg0 != -1) {
				local151.method269(arg0);
			}
			if (this.anInt567 != 128 || this.anInt568 != 128) {
				local151.method277(this.anInt567, this.anInt567, this.anInt568);
			}
			local151.method265(793);
			local151.anIntArrayArray9 = null;
			local151.anIntArrayArray8 = null;
			if (this.aByte18 == 1) {
				local151.aBoolean119 = true;
			}
			return local151;
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("41672, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(13) Class13 local13 = this.method327((byte) 8);
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
					local82 = new Class1_Sub1_Sub1_Sub5((byte) 2, local55, local55.length);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(97) int local97 = 0; local97 < this.anIntArray172.length; local97++) {
						local82.method275(this.anIntArray172[local97], this.anIntArray173[local97]);
					}
				}
				return local82;
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("19558, " + -23484 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)Lclient!gc;")
	public Class13 method327(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			@Pc(8) boolean local8 = false;
			if (this.anInt573 != -1) {
				@Pc(21) Class36 local21 = Class36.aClass36Array1[this.anInt573];
				@Pc(24) int local24 = local21.anInt839;
				@Pc(27) int local27 = local21.anInt840;
				@Pc(30) int local30 = local21.anInt841;
				@Pc(36) int local36 = client.anIntArray67[local30 - local27];
				local3 = aClient4.anIntArray33[local24] >> local27 & local36;
			} else if (this.anInt574 != -1) {
				local3 = aClient4.anIntArray33[this.anInt574];
			}
			return local3 < 0 || local3 >= this.anIntArray174.length || this.anIntArray174[local3] == -1 ? null : method323(this.anIntArray174[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("32117, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
