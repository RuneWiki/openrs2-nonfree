import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private static int anInt591;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[I")
	private static int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	private static int anInt592;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "Lclient!t;")
	public static Class42 aClass42_6 = new Class42(0, 30);

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private int anInt590;

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
	private int anInt604;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "B")
	private byte aByte38 = 0;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "J")
	private long aLong25 = -1L;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "B")
	public byte aByte39 = 1;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "I")
	public int anInt593 = -1;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "I")
	public int anInt594 = -1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt595 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt596 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt597 = -1;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "I")
	private int anInt598 = -1;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "I")
	private int anInt599 = -1;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "I")
	private int anInt600 = -1;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "Z")
	public boolean aBoolean139 = true;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	public int anInt601 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt602 = 128;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "I")
	private int anInt603 = 128;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "I")
	public int anInt606 = -1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method318(@OriginalArg(0) Class48 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(45427, arg0.method678("npc.dat", null));
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(45427, arg0.method678("npc.idx", null));
		anInt591 = local19.method500();
		anIntArray165 = new int[anInt591];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt591; local29++) {
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
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("37136, " + true + ", " + local12.toString());
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
		anInt592 = (anInt592 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt592] = new Class13();
		aClass1_Sub1_Sub3_8.anInt796 = anIntArray165[arg0];
		local33.aLong25 = arg0;
		local33.method321(aClass1_Sub1_Sub3_8);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method321(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method498();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method498();
					this.anIntArray166 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray166[local26] = arg0.method500();
					}
				} else if (local11 == 2) {
					this.aString25 = arg0.method505();
				} else if (local11 == 3) {
					this.aByteArray5 = arg0.method506();
				} else if (local11 == 12) {
					this.aByte39 = arg0.method499();
				} else if (local11 == 13) {
					this.anInt593 = arg0.method500();
				} else if (local11 == 14) {
					this.anInt594 = arg0.method500();
				} else if (local11 == 17) {
					this.anInt594 = arg0.method500();
					this.anInt595 = arg0.method500();
					this.anInt596 = arg0.method500();
					this.anInt597 = arg0.method500();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local11 - 30] = arg0.method505();
					if (this.aStringArray8[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray8[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method498();
					this.anIntArray168 = new int[local20];
					this.anIntArray169 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray168[local26] = arg0.method500();
						this.anIntArray169[local26] = arg0.method500();
					}
				} else if (local11 == 60) {
					local20 = arg0.method498();
					this.anIntArray167 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray167[local26] = arg0.method500();
					}
				} else if (local11 == 90) {
					this.anInt598 = arg0.method500();
				} else if (local11 == 91) {
					this.anInt599 = arg0.method500();
				} else if (local11 == 92) {
					this.anInt600 = arg0.method500();
				} else if (local11 == 93) {
					this.aBoolean139 = false;
				} else if (local11 == 95) {
					this.anInt601 = arg0.method500();
				} else if (local11 == 97) {
					this.anInt602 = arg0.method500();
				} else if (local11 == 98) {
					this.anInt603 = arg0.method500();
				} else if (local11 == 99) {
					this.aBoolean140 = true;
				} else if (local11 == 100) {
					this.anInt604 = arg0.method499();
				} else if (local11 == 101) {
					this.anInt605 = arg0.method499() * 5;
				} else if (local11 == 102) {
					this.anInt606 = arg0.method500();
				}
			}
		} catch (@Pc(307) RuntimeException local307) {
			signlink.reporterror("10703, " + arg0 + ", " + 66 + ", " + local307.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(II[II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
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
					local7 = new Class1_Sub1_Sub1_Sub5(local38.length, local38, -38792);
				}
				if (this.anIntArray168 != null) {
					for (@Pc(80) int local80 = 0; local80 < this.anIntArray168.length; local80++) {
						local7.method302(this.anIntArray168[local80], this.anIntArray169[local80]);
					}
				}
				local7.method295();
				local7.method305(this.anInt604 + 64, this.anInt605 + 850, -30, -50, -30, true);
				aClass42_6.method642(this.aLong25, local7);
			}
			@Pc(123) Class1_Sub1_Sub1_Sub5 local123 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local123.method290(Class14.method328((byte) 7, arg0) & Class14.method328((byte) 7, arg1), local7);
			if (arg0 != -1 && arg1 != -1) {
				local123.method297(arg1, arg2, arg0);
			} else if (arg0 != -1) {
				local123.method296(this.aByte38, arg0);
			}
			if (this.anInt602 != 128 || this.anInt603 != 128) {
				local123.method304(this.anInt602, this.anInt603, this.anInt602);
			}
			local123.method292();
			local123.anIntArrayArray8 = null;
			local123.anIntArrayArray7 = null;
			if (this.aByte39 == 1) {
				local123.aBoolean131 = true;
			}
			return local123;
		} catch (@Pc(197) RuntimeException local197) {
			signlink.reporterror("41859, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -567 + ", " + local197.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method323() {
		try {
			if (this.anIntArray167 == null) {
				return null;
			}
			@Pc(14) boolean local14 = false;
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray167.length; local16++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray167[local16])) {
					local14 = true;
				}
			}
			if (local14) {
				return null;
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5[] local41 = new Class1_Sub1_Sub1_Sub5[this.anIntArray167.length];
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray167.length; local43++) {
				local41[local43] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray167[local43]);
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5 local68;
			if (local41.length == 1) {
				local68 = local41[0];
			} else {
				local68 = new Class1_Sub1_Sub1_Sub5(local41.length, local41, -38792);
			}
			if (this.anIntArray168 != null) {
				for (@Pc(83) int local83 = 0; local83 < this.anIntArray168.length; local83++) {
					local68.method302(this.anIntArray168[local83], this.anIntArray169[local83]);
				}
			}
			return local68;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("23329, " + false + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
