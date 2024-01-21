import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt551;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt552;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private static boolean aBoolean139 = true;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "Lclient!s;")
	public static Class40 aClass40_6 = new Class40(30, 0);

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
	private int anInt564;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private int anInt550 = -32952;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	private long aLong23 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte26 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt553 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt554 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt555 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt556 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt557 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt558 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt559 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt560 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean140 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt561 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt562 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt563 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt566 = -1;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	public int anInt567 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!xb;)V")
	public static void method319(@OriginalArg(0) Class47 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method659("npc.dat", null), (byte) 1);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method659("npc.idx", null), (byte) 1);
		anInt551 = local19.method475();
		anIntArray167 = new int[anInt551];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt551; local29++) {
			anIntArray167[local29] = local27;
			local27 += local19.method475();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method320(@OriginalArg(0) byte arg0) {
		try {
			aClass40_6 = null;
			anIntArray167 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
			@Pc(12) boolean local12 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("73103, " + arg0 + ", " + local21.toString());
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
		anInt552 = (anInt552 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt552] = new Class13();
		aClass1_Sub1_Sub3_6.anInt743 = anIntArray167[arg0];
		local33.aLong23 = arg0;
		local33.method322((byte) 2, aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method322(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg1.method473();
					if (local18 == 0) {
						return;
					}
					@Pc(27) int local27;
					@Pc(33) int local33;
					if (local18 == 1) {
						local27 = arg1.method473();
						this.anIntArray168 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray168[local33] = arg1.method475();
						}
					} else if (local18 == 2) {
						this.aString24 = arg1.method480();
					} else if (local18 == 3) {
						this.aByteArray5 = arg1.method481(this.anInt550);
					} else if (local18 == 12) {
						this.aByte26 = arg1.method474();
					} else if (local18 == 13) {
						this.anInt553 = arg1.method475();
					} else if (local18 == 14) {
						this.anInt554 = arg1.method475();
					} else if (local18 == 17) {
						this.anInt554 = arg1.method475();
						this.anInt555 = arg1.method475();
						this.anInt556 = arg1.method475();
						this.anInt557 = arg1.method475();
					} else if (local18 >= 30 && local18 < 40) {
						if (this.aStringArray9 == null) {
							this.aStringArray9 = new String[5];
						}
						this.aStringArray9[local18 - 30] = arg1.method480();
						if (this.aStringArray9[local18 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray9[local18 - 30] = null;
						}
					} else if (local18 == 40) {
						local27 = arg1.method473();
						this.anIntArray170 = new int[local27];
						this.anIntArray171 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray170[local33] = arg1.method475();
							this.anIntArray171[local33] = arg1.method475();
						}
					} else if (local18 == 60) {
						local27 = arg1.method473();
						this.anIntArray169 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray169[local33] = arg1.method475();
						}
					} else if (local18 == 90) {
						this.anInt558 = arg1.method475();
					} else if (local18 == 91) {
						this.anInt559 = arg1.method475();
					} else if (local18 == 92) {
						this.anInt560 = arg1.method475();
					} else if (local18 == 93) {
						this.aBoolean140 = false;
					} else if (local18 == 95) {
						this.anInt561 = arg1.method475();
					} else if (local18 == 97) {
						this.anInt562 = arg1.method475();
					} else if (local18 == 98) {
						this.anInt563 = arg1.method475();
					} else if (local18 == 99) {
						this.aBoolean141 = true;
					} else if (local18 == 100) {
						this.anInt564 = arg1.method474();
					} else if (local18 == 101) {
						this.anInt565 = arg1.method474() * 5;
					} else if (local18 == 102) {
						this.anInt566 = arg1.method475();
					} else if (local18 == 103) {
						this.anInt567 = arg1.method475();
					}
				}
			}
		} catch (@Pc(324) RuntimeException local324) {
			signlink.reporterror("38865, " + arg0 + ", " + arg1 + ", " + local324.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method584(this.aLong23);
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
					local7 = new Class1_Sub1_Sub1_Sub5(local38.length, -643, local38);
				}
				if (this.anIntArray170 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray170.length; local80++) {
						local7.method274(this.anIntArray170[local80], this.anIntArray171[local80]);
					}
				}
				local7.method267();
				local7.method277(this.anInt564 + 64, this.anInt565 + 850, -30, -50, -30, true);
				aClass40_6.method585(201, this.aLong23, local7);
			}
			@Pc(123) Class1_Sub1_Sub1_Sub5 local123 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			@Pc(127) boolean local127 = false;
			local123.method262(local7, Class12.method304(arg0) & Class12.method304(arg1));
			if (arg0 != -1 && arg1 != -1) {
				local123.method269(arg3, arg0, arg1);
			} else if (arg0 != -1) {
				local123.method268(arg0);
			}
			if (this.anInt562 != 128 || this.anInt563 != 128) {
				local123.method276(this.anInt562, this.anInt562, this.anInt563);
			}
			local123.method264(486);
			local123.anIntArrayArray9 = null;
			local123.anIntArrayArray8 = null;
			if (this.aByte26 == 1) {
				local123.aBoolean116 = true;
			}
			return local123;
		} catch (@Pc(195) RuntimeException local195) {
			signlink.reporterror("40442, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local195.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method324() {
		try {
			if (this.anIntArray169 == null) {
				return null;
			}
			@Pc(17) boolean local17 = false;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray169.length; local19++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray169[local19])) {
					local17 = true;
				}
			}
			if (local17) {
				return null;
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5[] local44 = new Class1_Sub1_Sub1_Sub5[this.anIntArray169.length];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray169.length; local46++) {
				local44[local46] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray169[local46]);
			}
			@Pc(71) Class1_Sub1_Sub1_Sub5 local71;
			if (local44.length == 1) {
				local71 = local44[0];
			} else {
				local71 = new Class1_Sub1_Sub1_Sub5(local44.length, -643, local44);
			}
			if (this.anIntArray170 != null) {
				for (@Pc(86) int local86 = 0; local86 < this.anIntArray170.length; local86++) {
					local71.method274(this.anIntArray170[local86], this.anIntArray171[local86]);
				}
			}
			return local71;
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("94352, " + 0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}
}
