import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt571;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt572;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "Lclient!t;")
	public static Class42 aClass42_6 = new Class42(0, 30);

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt585;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt570 = 1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	private long aLong25 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte21 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt573 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt574 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt575 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt577 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt578 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt579 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt580 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean138 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt581 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt582 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt583 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method318(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(arg0.method678("npc.dat", null), 337);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method678("npc.idx", null), 337);
		anInt571 = local19.method500();
		anIntArray165 = new int[anInt571];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt571; local29++) {
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
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("48377, " + false + ", " + local18.toString());
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
		anInt572 = (anInt572 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt572] = new Class13();
		aClass1_Sub1_Sub3_8.anInt768 = anIntArray165[arg0];
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
					this.aByte21 = arg0.method499();
				} else if (local9 == 13) {
					this.anInt573 = arg0.method500();
				} else if (local9 == 14) {
					this.anInt574 = arg0.method500();
				} else if (local9 == 17) {
					this.anInt574 = arg0.method500();
					this.anInt575 = arg0.method500();
					this.anInt576 = arg0.method500();
					this.anInt577 = arg0.method500();
				} else if (local9 >= 30 && local9 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local9 - 30] = arg0.method505();
					if (this.aStringArray8[local9 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray8[local9 - 30] = null;
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
					this.anInt578 = arg0.method500();
				} else if (local9 == 91) {
					this.anInt579 = arg0.method500();
				} else if (local9 == 92) {
					this.anInt580 = arg0.method500();
				} else if (local9 == 93) {
					this.aBoolean138 = false;
				} else if (local9 == 95) {
					this.anInt581 = arg0.method500();
				} else if (local9 == 97) {
					this.anInt582 = arg0.method500();
				} else if (local9 == 98) {
					this.anInt583 = arg0.method500();
				} else if (local9 == 99) {
					this.aBoolean139 = true;
				} else if (local9 == 100) {
					this.anInt584 = arg0.method499();
				} else if (local9 == 101) {
					this.anInt585 = arg0.method499() * 5;
				} else if (local9 == 102) {
					this.anInt586 = arg0.method500();
				}
			}
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("11299, " + 0 + ", " + arg0 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(III[I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass42_6.method641(this.aLong25);
			if (local7 == null) {
				@Pc(11) boolean local11 = false;
				for (@Pc(13) int local13 = 0; local13 < this.anIntArray166.length; local13++) {
					if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray166[local13])) {
						local11 = true;
					}
				}
				if (local11) {
					return null;
				}
				@Pc(38) Class1_Sub1_Sub1_Sub5[] local38 = new Class1_Sub1_Sub1_Sub5[this.anIntArray166.length];
				for (@Pc(40) int local40 = 0; local40 < this.anIntArray166.length; local40++) {
					local38[local40] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray166[local40]);
				}
				if (local38.length == 1) {
					local7 = local38[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5((byte) 1, local38.length, local38);
				}
				if (this.anIntArray168 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray168.length; local80++) {
						local7.method302(this.anIntArray168[local80], this.anIntArray169[local80]);
					}
				}
				local7.method295();
				local7.method305(this.anInt584 + 64, this.anInt585 + 850, -30, -50, -30, true);
				aClass42_6.method642(this.aLong25, local7);
			}
			@Pc(123) Class1_Sub1_Sub1_Sub5 local123 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local123.method290(local7, Class14.method328(arg1) & Class14.method328(arg0));
			if (arg1 != -1 && arg0 != -1) {
				local123.method297(arg2, arg0, arg1);
			} else if (arg1 != -1) {
				local123.method296(arg1);
			}
			if (this.anInt582 != 128 || this.anInt583 != 128) {
				local123.method304(this.anInt582, this.anInt583, this.anInt582);
			}
			local123.method292();
			local123.anIntArrayArray8 = null;
			local123.anIntArrayArray7 = null;
			if (this.aByte21 == 1) {
				local123.aBoolean130 = true;
			}
			return local123;
		} catch (@Pc(200) RuntimeException local200) {
			signlink.reporterror("8338, " + arg0 + ", " + arg1 + ", " + -824 + ", " + arg2 + ", " + local200.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method323() {
		try {
			if (this.anInt570 > 1 || this.anInt570 < 1) {
				throw new NullPointerException();
			} else if (this.anIntArray167 == null) {
				return null;
			} else {
				@Pc(20) boolean local20 = false;
				for (@Pc(22) int local22 = 0; local22 < this.anIntArray167.length; local22++) {
					if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray167[local22])) {
						local20 = true;
					}
				}
				if (local20) {
					return null;
				}
				@Pc(47) Class1_Sub1_Sub1_Sub5[] local47 = new Class1_Sub1_Sub1_Sub5[this.anIntArray167.length];
				for (@Pc(49) int local49 = 0; local49 < this.anIntArray167.length; local49++) {
					local47[local49] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray167[local49]);
				}
				@Pc(74) Class1_Sub1_Sub1_Sub5 local74;
				if (local47.length == 1) {
					local74 = local47[0];
				} else {
					local74 = new Class1_Sub1_Sub1_Sub5((byte) 1, local47.length, local47);
				}
				if (this.anIntArray168 != null) {
					for (@Pc(89) int local89 = 0; local89 < this.anIntArray168.length; local89++) {
						local74.method302(this.anIntArray168[local89], this.anIntArray169[local89]);
					}
				}
				return local74;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("96996, " + 1 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}
}
