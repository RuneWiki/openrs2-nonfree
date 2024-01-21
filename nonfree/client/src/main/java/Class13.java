import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	private static int anInt580;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	private static int anInt581;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "Z")
	private static boolean aBoolean150 = true;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "Lclient!t;")
	public static Class42 aClass42_6 = new Class42(30, 0);

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray9;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "B")
	private byte aByte22 = 67;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private int anInt579 = -475;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "J")
	private long aLong25 = -1L;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "B")
	public byte aByte23 = 1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt582 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt587 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt588 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	private int anInt589 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	public int anInt590 = -1;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	private int anInt591 = 128;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt592 = 128;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "Z")
	public boolean aBoolean152 = false;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	public int anInt596 = 32;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method318(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(16, arg0.method678("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(16, arg0.method678("npc.idx", null));
		anInt580 = local19.method500();
		anIntArray165 = new int[anInt580];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt580; local29++) {
			anIntArray165[local29] = local27;
			local27 += local19.method500();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)V")
	public static void method319() {
		try {
			aClass42_6 = null;
			anIntArray165 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_8 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("34340, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method320(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong25 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt581 = (anInt581 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt581] = new Class13();
		aClass1_Sub1_Sub3_8.anInt776 = anIntArray165[arg0];
		local33.aLong25 = arg0;
		local33.method321(aClass1_Sub1_Sub3_8);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method321(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method498();
				if (local9 == 0) {
					return;
				}
				@Pc(18) int local18;
				@Pc(24) int local24;
				if (local9 == 1) {
					local18 = arg0.method498();
					this.anIntArray166 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray166[local24] = arg0.method500();
					}
				} else if (local9 == 2) {
					this.aString25 = arg0.method505();
				} else if (local9 == 3) {
					this.aByteArray5 = arg0.method506();
				} else if (local9 == 12) {
					this.aByte23 = arg0.method499();
				} else if (local9 == 13) {
					this.anInt582 = arg0.method500();
				} else if (local9 == 14) {
					this.anInt583 = arg0.method500();
				} else if (local9 == 17) {
					this.anInt583 = arg0.method500();
					this.anInt584 = arg0.method500();
					this.anInt585 = arg0.method500();
					this.anInt586 = arg0.method500();
				} else if (local9 >= 30 && local9 < 40) {
					if (this.aStringArray9 == null) {
						this.aStringArray9 = new String[5];
					}
					this.aStringArray9[local9 - 30] = arg0.method505();
					if (this.aStringArray9[local9 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray9[local9 - 30] = null;
					}
				} else if (local9 == 40) {
					local18 = arg0.method498();
					this.anIntArray168 = new int[local18];
					this.anIntArray169 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray168[local24] = arg0.method500();
						this.anIntArray169[local24] = arg0.method500();
					}
				} else if (local9 == 60) {
					local18 = arg0.method498();
					this.anIntArray167 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray167[local24] = arg0.method500();
					}
				} else if (local9 == 90) {
					this.anInt587 = arg0.method500();
				} else if (local9 == 91) {
					this.anInt588 = arg0.method500();
				} else if (local9 == 92) {
					this.anInt589 = arg0.method500();
				} else if (local9 == 93) {
					this.aBoolean151 = false;
				} else if (local9 == 95) {
					this.anInt590 = arg0.method500();
				} else if (local9 == 97) {
					this.anInt591 = arg0.method500();
				} else if (local9 == 98) {
					this.anInt592 = arg0.method500();
				} else if (local9 == 99) {
					this.aBoolean152 = true;
				} else if (local9 == 100) {
					this.anInt593 = arg0.method499();
				} else if (local9 == 101) {
					this.anInt594 = arg0.method499() * 5;
				} else if (local9 == 102) {
					this.anInt595 = arg0.method500();
				} else if (local9 == 103) {
					this.anInt596 = arg0.method500();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("87672, " + 891 + ", " + arg0 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I[III)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(16) Class1_Sub1_Sub1_Sub5 local16 = (Class1_Sub1_Sub1_Sub5) aClass42_6.method641(this.aLong25);
			if (local16 == null) {
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray166.length; local22++) {
					if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray166[local22])) {
						local20 = true;
					}
				}
				if (local20) {
					return null;
				}
				@Pc(47) Class1_Sub1_Sub1_Sub5[] local47 = new Class1_Sub1_Sub1_Sub5[this.anIntArray166.length];
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray166.length; local49++) {
					local47[local49] = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean149, this.anIntArray166[local49]);
				}
				if (local47.length == 1) {
					local16 = local47[0];
				} else {
					local16 = new Class1_Sub1_Sub1_Sub5(local47, local47.length, (byte) 2);
				}
				if (this.anIntArray168 != null) {
					for (@Pc(90) int local90 = 0; local90 < this.anIntArray168.length; local90++) {
						local16.method302(this.anIntArray168[local90], this.anIntArray169[local90]);
					}
				}
				local16.method295();
				local16.method305(this.anInt593 + 64, this.anInt594 + 850, -30, -50, -30, true);
				aClass42_6.method642(local16, this.aLong25, this.aByte22);
			}
			@Pc(134) Class1_Sub1_Sub1_Sub5 local134 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local134.method290(Class14.method328(arg0) & Class14.method328(arg2), local16);
			if (arg0 != -1 && arg2 != -1) {
				local134.method297((byte) 5, arg2, arg0, arg1);
			} else if (arg0 != -1) {
				local134.method296(arg0);
			}
			if (this.anInt591 != 128 || this.anInt592 != 128) {
				local134.method304(this.anInt591, (byte) 9, this.anInt591, this.anInt592);
			}
			local134.method292();
			local134.anIntArrayArray8 = null;
			local134.anIntArrayArray7 = null;
			if (this.aByte23 == 1) {
				local134.aBoolean139 = true;
			}
			return local134;
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("34478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method323() {
		try {
			if (this.anIntArray167 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray167.length; local19++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray167[local19])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5[] local44 = new Class1_Sub1_Sub1_Sub5[this.anIntArray167.length];
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray167.length; local46++) {
				local44[local46] = Class1_Sub1_Sub1_Sub5.method288(this.aBoolean149, this.anIntArray167[local46]);
			}
			@Pc(72) Class1_Sub1_Sub1_Sub5 local72;
			if (local44.length == 1) {
				local72 = local44[0];
			} else {
				local72 = new Class1_Sub1_Sub1_Sub5(local44, local44.length, (byte) 2);
			}
			if (this.anIntArray168 != null) {
				for (@Pc(87) int local87 = 0; local87 < this.anIntArray168.length; local87++) {
					local72.method302(this.anIntArray168[local87], this.anIntArray169[local87]);
				}
			}
			return local72;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("84966, " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}
}
