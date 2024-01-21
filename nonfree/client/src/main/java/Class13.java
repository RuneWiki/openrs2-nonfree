import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean150;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt553;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt554;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(false, 30);

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt567;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	public long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte14 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt555 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt556 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt557 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt558 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt559 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt560 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt561 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt562 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt563 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt564 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt565 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt568 = -1;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt569 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method319(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method660("npc.dat", null), 185);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method660("npc.idx", null), 185);
		anInt553 = local19.method476();
		anIntArray167 = new int[anInt553];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt553; local29++) {
			anIntArray167[local29] = local27;
			local27 += local19.method476();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)V")
	public static void method320() {
		try {
			aClass40_6 = null;
			anIntArray167 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("13232, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!gc;")
	public static Class13 method321(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong23 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt554 = (anInt554 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt554] = new Class13();
		aClass1_Sub1_Sub3_6.anInt738 = anIntArray167[arg0];
		local33.aLong23 = arg0;
		local33.method322(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method322(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method474();
				if (local14 == 0) {
					return;
				}
				@Pc(23) int local23;
				@Pc(29) int local29;
				if (local14 == 1) {
					local23 = arg0.method474();
					this.anIntArray168 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray168[local29] = arg0.method476();
					}
				} else if (local14 == 2) {
					this.aString24 = arg0.method481();
				} else if (local14 == 3) {
					this.aByteArray5 = arg0.method482();
				} else if (local14 == 12) {
					this.aByte14 = arg0.method475();
				} else if (local14 == 13) {
					this.anInt555 = arg0.method476();
				} else if (local14 == 14) {
					this.anInt556 = arg0.method476();
				} else if (local14 == 17) {
					this.anInt556 = arg0.method476();
					this.anInt557 = arg0.method476();
					this.anInt558 = arg0.method476();
					this.anInt559 = arg0.method476();
				} else if (local14 >= 30 && local14 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local14 - 30] = arg0.method481();
					if (this.aStringArray9[local14 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local14 - 30] = null;
					}
				} else if (local14 == 40) {
					local23 = arg0.method474();
					this.anIntArray170 = new int[local23];
					this.anIntArray171 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray170[local29] = arg0.method476();
						this.anIntArray171[local29] = arg0.method476();
					}
				} else if (local14 == 60) {
					local23 = arg0.method474();
					this.anIntArray169 = new int[local23];
					for (local29 = 0; local29 < local23; local29++) {
						this.anIntArray169[local29] = arg0.method476();
					}
				} else if (local14 == 90) {
					this.anInt560 = arg0.method476();
				} else if (local14 == 91) {
					this.anInt561 = arg0.method476();
				} else if (local14 == 92) {
					this.anInt562 = arg0.method476();
				} else if (local14 == 93) {
					this.aBoolean151 = false;
				} else if (local14 == 95) {
					this.anInt563 = arg0.method476();
				} else if (local14 == 97) {
					this.anInt564 = arg0.method476();
				} else if (local14 == 98) {
					this.anInt565 = arg0.method476();
				} else if (local14 == 99) {
					this.aBoolean152 = true;
				} else if (local14 == 100) {
					this.anInt566 = arg0.method475();
				} else if (local14 == 101) {
					this.anInt567 = arg0.method475() * 5;
				} else if (local14 == 102) {
					this.anInt568 = arg0.method476();
				} else if (local14 == 103) {
					this.anInt569 = arg0.method476();
				}
			}
		} catch (@Pc(319) RuntimeException local319) {
			signlink.reporterror("61764, " + arg0 + ", " + 81 + ", " + local319.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method585(this.aLong23);
			if (local7 == null) {
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < this.anIntArray168.length; local13++) {
					if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray168[local13])) {
						local11 = true;
					}
				}
				if (local11) {
					return null;
				}
				@Pc(38) Class1_Sub1_Sub1_Sub5[] local38 = new Class1_Sub1_Sub1_Sub5[this.anIntArray168.length];
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray168.length; local40++) {
					local38[local40] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray168[local40]);
				}
				if (local38.length == 1) {
					local7 = local38[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5((byte) 3, local38.length, local38);
				}
				if (this.anIntArray170 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray170.length; local80++) {
						local7.method274(this.anIntArray170[local80], this.anIntArray171[local80]);
					}
				}
				local7.method267();
				local7.method277(this.anInt566 + 64, this.anInt567 + 850, -30, -50, -30, true);
				aClass40_6.method586(400, local7, this.aLong23);
			}
			@Pc(123) Class1_Sub1_Sub1_Sub5 local123 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local123.method262(local7, Class12.method304(this.anInt552, arg0) & Class12.method304(this.anInt552, arg1));
			if (arg0 != -1 && arg1 != -1) {
				local123.method269(arg2, arg1, arg0);
			} else if (arg0 != -1) {
				local123.method268(arg0);
			}
			if (this.anInt564 != 128 || this.anInt565 != 128) {
				local123.method276(this.anInt564, this.anInt564, this.anInt565);
			}
			local123.method264();
			local123.anIntArrayArray9 = null;
			local123.anIntArrayArray8 = null;
			if (this.aByte14 == 1) {
				local123.aBoolean124 = true;
			}
			return local123;
		} catch (@Pc(201) RuntimeException local201) {
			signlink.reporterror("46107, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local201.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method324() {
		try {
			if (this.anIntArray169 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray169.length; local15++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray169[local15])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(40) Class1_Sub1_Sub1_Sub5[] local40 = new Class1_Sub1_Sub1_Sub5[this.anIntArray169.length];
			for (@Pc(42) int local42 = 0; local42 < this.anIntArray169.length; local42++) {
				local40[local42] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray169[local42]);
			}
			@Pc(67) Class1_Sub1_Sub1_Sub5 local67;
			if (local40.length == 1) {
				local67 = local40[0];
			} else {
				local67 = new Class1_Sub1_Sub1_Sub5((byte) 3, local40.length, local40);
			}
			if (this.anIntArray170 != null) {
				for (@Pc(82) int local82 = 0; local82 < this.anIntArray170.length; local82++) {
					local67.method274(this.anIntArray170[local82], this.anIntArray171[local82]);
				}
			}
			return local67;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("58721, " + 0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}
}
