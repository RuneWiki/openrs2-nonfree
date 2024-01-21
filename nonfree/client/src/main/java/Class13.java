import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private static int anInt567;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "I")
	private static int anInt568;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private static int anInt565 = 1000;

	@OriginalMember(owner = "client!gc", name = "L", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40((byte) 113, 30);

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
	private int anInt580;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt581;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt566 = -22323;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "B")
	public byte aByte16 = 1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt569 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt570 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt571 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt572 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt575 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt576 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	public int anInt577 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt578 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt579 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt583 = 32;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "I")
	private int anInt584 = -1;

	@OriginalMember(owner = "client!gc", name = "K", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method321(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(anInt565, arg0.method666("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(anInt565, arg0.method666("npc.idx", null));
		anInt567 = local19.method482();
		anIntArray169 = new int[anInt567];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt567; local29++) {
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
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("86676, " + 3 + ", " + local16.toString());
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
		anInt568 = (anInt568 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt568] = new Class13();
		aClass1_Sub1_Sub3_6.anInt751 = anIntArray169[arg0];
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
				@Pc(12) int local12 = arg0.method480();
				if (local12 == 0) {
					return;
				}
				@Pc(21) int local21;
				@Pc(27) int local27;
				if (local12 == 1) {
					local21 = arg0.method480();
					this.anIntArray170 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray170[local27] = arg0.method482();
					}
				} else if (local12 == 2) {
					this.aString24 = arg0.method487();
				} else if (local12 == 3) {
					this.aByteArray5 = arg0.method488();
				} else if (local12 == 12) {
					this.aByte16 = arg0.method481();
				} else if (local12 == 13) {
					this.anInt569 = arg0.method482();
				} else if (local12 == 14) {
					this.anInt570 = arg0.method482();
				} else if (local12 == 17) {
					this.anInt570 = arg0.method482();
					this.anInt571 = arg0.method482();
					this.anInt572 = arg0.method482();
					this.anInt573 = arg0.method482();
				} else if (local12 >= 30 && local12 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local12 - 30] = arg0.method487();
					if (this.aStringArray9[local12 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local12 - 30] = null;
					}
				} else if (local12 == 40) {
					local21 = arg0.method480();
					this.anIntArray172 = new int[local21];
					this.anIntArray173 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray172[local27] = arg0.method482();
						this.anIntArray173[local27] = arg0.method482();
					}
				} else if (local12 == 60) {
					local21 = arg0.method480();
					this.anIntArray171 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray171[local27] = arg0.method482();
					}
				} else if (local12 == 90) {
					this.anInt574 = arg0.method482();
				} else if (local12 == 91) {
					this.anInt575 = arg0.method482();
				} else if (local12 == 92) {
					this.anInt576 = arg0.method482();
				} else if (local12 == 93) {
					this.aBoolean147 = false;
				} else if (local12 == 95) {
					this.anInt577 = arg0.method482();
				} else if (local12 == 97) {
					this.anInt578 = arg0.method482();
				} else if (local12 == 98) {
					this.anInt579 = arg0.method482();
				} else if (local12 == 99) {
					this.aBoolean148 = true;
				} else if (local12 == 100) {
					this.anInt580 = arg0.method481();
				} else if (local12 == 101) {
					this.anInt581 = arg0.method481() * 5;
				} else if (local12 == 102) {
					this.anInt582 = arg0.method482();
				} else if (local12 == 103) {
					this.anInt583 = arg0.method482();
				} else if (local12 == 106) {
					this.anInt584 = arg0.method482();
					if (this.anInt584 == 65535) {
						this.anInt584 = -1;
					}
					this.anInt585 = arg0.method482();
					if (this.anInt585 == 65535) {
						this.anInt585 = -1;
					}
					local21 = arg0.method480();
					this.anIntArray174 = new int[local21 + 1];
					for (local27 = 0; local27 <= local21; local27++) {
						this.anIntArray174[local27] = arg0.method482();
						if (this.anIntArray174[local27] == 65535) {
							this.anIntArray174[local27] = -1;
						}
					}
				}
			}
		} catch (@Pc(378) RuntimeException local378) {
			signlink.reporterror("32437, " + 8 + ", " + arg0 + ", " + local378.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			if (this.anIntArray174 != null) {
				@Pc(8) Class13 local8 = this.method327();
				return local8 == null ? null : local8.method325(arg0, 175, arg2, arg3);
			}
			@Pc(25) Class1_Sub1_Sub1_Sub5 local25 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method591(this.aLong23);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray170.length; local31++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray170[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class1_Sub1_Sub1_Sub5[] local56 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray170.length; local58++) {
					local56[local58] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local58], this.anInt566);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class1_Sub1_Sub1_Sub5(local56.length, -550, local56);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(99) int local99 = 0; local99 < this.anIntArray172.length; local99++) {
						local25.method275(this.anIntArray172[local99], this.anIntArray173[local99]);
					}
				}
				local25.method268();
				local25.method278(this.anInt580 + 64, this.anInt581 + 850, -30, -50, -30, true);
				aClass40_6.method592(this.aLong23, local25);
			}
			@Pc(142) Class1_Sub1_Sub1_Sub5 local142 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			@Pc(146) boolean local146 = false;
			local142.method263(Class12.method306(arg0) & Class12.method306(arg2), local25, 471);
			if (arg0 != -1 && arg2 != -1) {
				local142.method270(arg2, arg3, arg0);
			} else if (arg0 != -1) {
				local142.method269(428, arg0);
			}
			if (this.anInt578 != 128 || this.anInt579 != 128) {
				local142.method277((byte) 4, this.anInt579, this.anInt578, this.anInt578);
			}
			local142.method265();
			local142.anIntArrayArray9 = null;
			local142.anIntArrayArray8 = null;
			if (this.aByte16 == 1) {
				local142.aBoolean122 = true;
			}
			return local142;
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("37772, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method326() {
		try {
			if (this.anIntArray174 != null) {
				@Pc(15) Class13 local15 = this.method327();
				return local15 == null ? null : local15.method326();
			} else if (this.anIntArray171 == null) {
				return null;
			} else {
				@Pc(30) boolean local30 = false;
				for (@Pc(32) int local32 = 0; local32 < this.anIntArray171.length; local32++) {
					if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray171[local32])) {
						local30 = true;
					}
				}
				if (local30) {
					return null;
				}
				@Pc(57) Class1_Sub1_Sub1_Sub5[] local57 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
				for (@Pc(59) int local59 = 0; local59 < this.anIntArray171.length; local59++) {
					local57[local59] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local59], this.anInt566);
				}
				@Pc(85) Class1_Sub1_Sub1_Sub5 local85;
				if (local57.length == 1) {
					local85 = local57[0];
				} else {
					local85 = new Class1_Sub1_Sub1_Sub5(local57.length, -550, local57);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(100) int local100 = 0; local100 < this.anIntArray172.length; local100++) {
						local85.method275(this.anIntArray172[local100], this.anIntArray173[local100]);
					}
				}
				return local85;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("88693, " + -41730 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "(I)Lclient!gc;")
	public Class13 method327() {
		try {
			@Pc(5) int local5 = -1;
			if (this.anInt584 != -1) {
				@Pc(14) Class36 local14 = Class36.aClass36Array1[this.anInt584];
				@Pc(17) int local17 = local14.anInt859;
				@Pc(20) int local20 = local14.anInt860;
				@Pc(23) int local23 = local14.anInt861;
				@Pc(29) int local29 = client.anIntArray42[local23 - local20];
				local5 = aClient4.anIntArray45[local17] >> local20 & local29;
			} else if (this.anInt585 != -1) {
				local5 = aClient4.anIntArray45[this.anInt585];
			}
			return local5 < 0 || local5 >= this.anIntArray174.length || this.anIntArray174[local5] == -1 ? null : method323(this.anIntArray174[local5]);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("36995, " + 0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
