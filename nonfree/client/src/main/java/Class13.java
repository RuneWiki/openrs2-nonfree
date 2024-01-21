import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private static int anInt547;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	private static int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "I")
	private static int anInt548;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40((byte) 7, 30);

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
	private int anInt560;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt546 = 44692;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "B")
	private byte aByte24 = 4;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "B")
	public byte aByte25 = 1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt549 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt550 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt551 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt552 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt553 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt554 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt555 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt556 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	public int anInt557 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt558 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt559 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt562 = -1;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt563 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method319(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method662("npc.dat", null), 15787);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method662("npc.idx", null), 15787);
		anInt547 = local19.method478();
		anIntArray169 = new int[anInt547];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt547; local29++) {
			anIntArray169[local29] = local27;
			local27 += local19.method478();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method320() {
		try {
			aClass40_6 = null;
			anIntArray169 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("45481, " + 42 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method321(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt548 = (anInt548 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt548] = new Class13();
		aClass1_Sub1_Sub3_6.anInt734 = anIntArray169[arg0];
		local33.aLong23 = arg0;
		local33.method322(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method322(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method476();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method476();
					this.anIntArray170 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray170[local28] = arg0.method478();
					}
				} else if (local13 == 2) {
					this.aString24 = arg0.method483();
				} else if (local13 == 3) {
					this.aByteArray5 = arg0.method484(this.anInt546);
				} else if (local13 == 12) {
					this.aByte25 = arg0.method477();
				} else if (local13 == 13) {
					this.anInt549 = arg0.method478();
				} else if (local13 == 14) {
					this.anInt550 = arg0.method478();
				} else if (local13 == 17) {
					this.anInt550 = arg0.method478();
					this.anInt551 = arg0.method478();
					this.anInt552 = arg0.method478();
					this.anInt553 = arg0.method478();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local13 - 30] = arg0.method483();
					if (this.aStringArray9[local13 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local13 - 30] = null;
					}
				} else if (local13 == 40) {
					local22 = arg0.method476();
					this.anIntArray172 = new int[local22];
					this.anIntArray173 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray172[local28] = arg0.method478();
						this.anIntArray173[local28] = arg0.method478();
					}
				} else if (local13 == 60) {
					local22 = arg0.method476();
					this.anIntArray171 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray171[local28] = arg0.method478();
					}
				} else if (local13 == 90) {
					this.anInt554 = arg0.method478();
				} else if (local13 == 91) {
					this.anInt555 = arg0.method478();
				} else if (local13 == 92) {
					this.anInt556 = arg0.method478();
				} else if (local13 == 93) {
					this.aBoolean145 = false;
				} else if (local13 == 95) {
					this.anInt557 = arg0.method478();
				} else if (local13 == 97) {
					this.anInt558 = arg0.method478();
				} else if (local13 == 98) {
					this.anInt559 = arg0.method478();
				} else if (local13 == 99) {
					this.aBoolean146 = true;
				} else if (local13 == 100) {
					this.anInt560 = arg0.method477();
				} else if (local13 == 101) {
					this.anInt561 = arg0.method477() * 5;
				} else if (local13 == 102) {
					this.anInt562 = arg0.method478();
				} else if (local13 == 103) {
					this.anInt563 = arg0.method478();
				}
			}
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("19436, " + false + ", " + arg0 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method587(this.aLong23);
			if (local7 == null) {
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray170.length; local22++) {
					if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray170[local22])) {
						local20 = true;
					}
				}
				if (local20) {
					return null;
				}
				@Pc(47) Class1_Sub1_Sub1_Sub5[] local47 = new Class1_Sub1_Sub1_Sub5[this.anIntArray170.length];
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray170.length; local49++) {
					local47[local49] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray170[local49], this.aByte24);
				}
				if (local47.length == 1) {
					local7 = local47[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(local47, local47.length, -33019);
				}
				if (this.anIntArray172 != null) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray172.length; local90++) {
						local7.method274(this.anIntArray172[local90], this.anIntArray173[local90]);
					}
				}
				local7.method267((byte) 3);
				local7.method277(this.anInt560 + 64, this.anInt561 + 850, -30, -50, -30, true);
				aClass40_6.method588(this.aLong23, local7);
			}
			@Pc(133) Class1_Sub1_Sub1_Sub5 local133 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local133.method262(Class12.method304(arg1) & Class12.method304(arg0), local7);
			if (arg1 != -1 && arg0 != -1) {
				local133.method269(arg1, arg0, arg2);
			} else if (arg1 != -1) {
				local133.method268(arg1, 188);
			}
			if (this.anInt558 != 128 || this.anInt559 != 128) {
				local133.method276(this.anInt558, this.anInt558, this.anInt559);
			}
			local133.method264();
			local133.anIntArrayArray9 = null;
			local133.anIntArrayArray8 = null;
			if (this.aByte25 == 1) {
				local133.aBoolean120 = true;
			}
			return local133;
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("77537, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method324() {
		try {
			if (this.anIntArray171 == null) {
				return null;
			}
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray171.length; local17++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray171[local17])) {
					local15 = true;
				}
			}
			if (local15) {
				return null;
			}
			@Pc(42) Class1_Sub1_Sub1_Sub5[] local42 = new Class1_Sub1_Sub1_Sub5[this.anIntArray171.length];
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray171.length; local44++) {
				local42[local44] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray171[local44], this.aByte24);
			}
			@Pc(70) Class1_Sub1_Sub1_Sub5 local70;
			if (local42.length == 1) {
				local70 = local42[0];
			} else {
				local70 = new Class1_Sub1_Sub1_Sub5(local42, local42.length, -33019);
			}
			if (this.anIntArray172 != null) {
				for (@Pc(85) int local85 = 0; local85 < this.anIntArray172.length; local85++) {
					local70.method274(this.anIntArray172[local85], this.anIntArray173[local85]);
				}
			}
			return local70;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("20491, " + 105 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}
}
