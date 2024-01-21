import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hc")
public final class Class15 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	private static int anInt579;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[I")
	private static int[] anIntArray176;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_6;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "[Lclient!hc;")
	private static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private static int anInt580;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
	private static int anInt578 = -729;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!s;")
	public static Class39 aClass39_6 = new Class39(30, false);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private int anInt577;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
	private int[] anIntArray178;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
	private int[] anIntArray180;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "J")
	private long aLong24 = -1L;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "B")
	public byte aByte26 = 1;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public int anInt581 = -1;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	private int anInt586 = -1;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
	private int anInt587 = -1;

	@OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
	private int anInt588 = -1;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public int anInt589 = -1;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
	private int anInt590 = 128;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
	private int anInt591 = 128;

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
	public int anInt594 = -1;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	public int anInt595 = 32;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method350(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_6 = new Class1_Sub1_Sub3(arg0.method689("npc.dat", null), true);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method689("npc.idx", null), true);
		anInt579 = local19.method505();
		anIntArray176 = new int[anInt579];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt579; local29++) {
			anIntArray176[local29] = local27;
			local27 += local19.method505();
		}
		aClass15Array1 = new Class15[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass15Array1[local49] = new Class15();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method351() {
		try {
			aClass39_6 = null;
			anIntArray176 = null;
			aClass15Array1 = null;
			aClass1_Sub1_Sub3_6 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("76172, " + 0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lclient!hc;")
	public static Class15 method352(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass15Array1[local1].aLong24 == (long) arg0) {
				return aClass15Array1[local1];
			}
		}
		anInt580 = (anInt580 + 1) % 20;
		@Pc(33) Class15 local33 = aClass15Array1[anInt580] = new Class15();
		aClass1_Sub1_Sub3_6.anInt766 = anIntArray176[arg0];
		local33.aLong24 = arg0;
		local33.method353(aClass1_Sub1_Sub3_6);
		return local33;
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method353(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method503();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method503();
					this.anIntArray177 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray177[local26] = arg0.method505();
					}
				} else if (local11 == 2) {
					this.aString24 = arg0.method510();
				} else if (local11 == 3) {
					this.aByteArray5 = arg0.method511();
				} else if (local11 == 12) {
					this.aByte26 = arg0.method504();
				} else if (local11 == 13) {
					this.anInt581 = arg0.method505();
				} else if (local11 == 14) {
					this.anInt582 = arg0.method505();
				} else if (local11 == 17) {
					this.anInt582 = arg0.method505();
					this.anInt583 = arg0.method505();
					this.anInt584 = arg0.method505();
					this.anInt585 = arg0.method505();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local11 - 30] = arg0.method510();
					if (this.aStringArray9[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method503();
					this.anIntArray179 = new int[local20];
					this.anIntArray180 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray179[local26] = arg0.method505();
						this.anIntArray180[local26] = arg0.method505();
					}
				} else if (local11 == 60) {
					local20 = arg0.method503();
					this.anIntArray178 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray178[local26] = arg0.method505();
					}
				} else if (local11 == 90) {
					this.anInt586 = arg0.method505();
				} else if (local11 == 91) {
					this.anInt587 = arg0.method505();
				} else if (local11 == 92) {
					this.anInt588 = arg0.method505();
				} else if (local11 == 93) {
					this.aBoolean145 = false;
				} else if (local11 == 95) {
					this.anInt589 = arg0.method505();
				} else if (local11 == 97) {
					this.anInt590 = arg0.method505();
				} else if (local11 == 98) {
					this.anInt591 = arg0.method505();
				} else if (local11 == 99) {
					this.aBoolean146 = true;
				} else if (local11 == 100) {
					this.anInt592 = arg0.method504();
				} else if (local11 == 101) {
					this.anInt593 = arg0.method504() * 5;
				} else if (local11 == 102) {
					this.anInt594 = arg0.method505();
				} else if (local11 == 103) {
					this.anInt595 = arg0.method505();
				}
			}
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("73434, " + 44 + ", " + arg0 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII[I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method354(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass39_6.method604(this.aLong24);
			if (arg0) {
				throw new NullPointerException();
			}
			if (local7 == null) {
				@Pc(17) boolean local17 = false;
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray177.length; local19++) {
					if (!Class1_Sub1_Sub1_Sub5.method257(this.anIntArray177[local19])) {
						local17 = true;
					}
				}
				if (local17) {
					return null;
				}
				@Pc(44) Class1_Sub1_Sub1_Sub5[] local44 = new Class1_Sub1_Sub1_Sub5[this.anIntArray177.length];
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray177.length; local46++) {
					local44[local46] = Class1_Sub1_Sub1_Sub5.method256(this.anIntArray177[local46], 196);
				}
				if (local44.length == 1) {
					local7 = local44[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(172, local44, local44.length);
				}
				if (this.anIntArray179 != null) {
					for (@Pc(86) int local86 = 0; local86 < this.anIntArray179.length; local86++) {
						local7.method270(this.anIntArray179[local86], this.anIntArray180[local86]);
					}
				}
				local7.method263(this.anInt577);
				local7.method273(this.anInt592 + 64, this.anInt593 + 850, -30, -50, -30, true);
				aClass39_6.method605(local7, this.aLong24);
			}
			@Pc(130) Class1_Sub1_Sub1_Sub5 local130 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local130.method258((byte) 6, local7, Class12.method304(arg2) & Class12.method304(arg1));
			if (arg2 != -1 && arg1 != -1) {
				local130.method265(306, arg2, arg3, arg1);
			} else if (arg2 != -1) {
				local130.method264(arg2);
			}
			if (this.anInt590 != 128 || this.anInt591 != 128) {
				local130.method272(this.anInt590, this.anInt590, this.anInt591);
			}
			local130.method260();
			local130.anIntArrayArray9 = null;
			local130.anIntArrayArray8 = null;
			if (this.aByte26 == 1) {
				local130.aBoolean109 = true;
			}
			return local130;
		} catch (@Pc(198) RuntimeException local198) {
			signlink.reporterror("30366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local198.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method355(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray178 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray178.length; local17++) {
				if (!Class1_Sub1_Sub1_Sub5.method257(this.anIntArray178[local17])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(42) Class1_Sub1_Sub1_Sub5[] local42 = new Class1_Sub1_Sub1_Sub5[this.anIntArray178.length];
			for (@Pc(44) int local44 = 0; local44 < this.anIntArray178.length; local44++) {
				local42[local44] = Class1_Sub1_Sub1_Sub5.method256(this.anIntArray178[local44], 196);
			}
			@Pc(69) Class1_Sub1_Sub1_Sub5 local69;
			if (local42.length == 1) {
				local69 = local42[0];
			} else {
				local69 = new Class1_Sub1_Sub1_Sub5(172, local42, local42.length);
			}
			if (this.anIntArray179 != null) {
				for (@Pc(84) int local84 = 0; local84 < this.anIntArray179.length; local84++) {
					local69.method270(this.anIntArray179[local84], this.anIntArray180[local84]);
				}
			}
			return local69;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("56213, " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
