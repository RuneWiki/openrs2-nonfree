import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	private static int anInt581;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	private static int[] anIntArray164;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_8;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[Lclient!gc;")
	private static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	private static int anInt582;

	@OriginalMember(owner = "client!gc", name = "J", descriptor = "Lclient!t;")
	public static Class40 aClass40_6;

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!gc", name = "l", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!gc", name = "n", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!gc", name = "o", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!gc", name = "w", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!gc", name = "x", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!gc", name = "G", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!gc", name = "H", descriptor = "I")
	private int anInt595;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private int anInt579 = 8;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "B")
	private byte aByte26 = 86;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	private int anInt580 = -856;

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "J")
	private long aLong25 = -1L;

	@OriginalMember(owner = "client!gc", name = "m", descriptor = "B")
	public byte aByte27 = 1;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!gc", name = "q", descriptor = "I")
	public int anInt584 = -1;

	@OriginalMember(owner = "client!gc", name = "r", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "I")
	public int anInt586 = -1;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "I")
	public int anInt587 = -1;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!gc", name = "y", descriptor = "I")
	private int anInt588 = -1;

	@OriginalMember(owner = "client!gc", name = "z", descriptor = "I")
	private int anInt589 = -1;

	@OriginalMember(owner = "client!gc", name = "A", descriptor = "I")
	private int anInt590 = -1;

	@OriginalMember(owner = "client!gc", name = "B", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!gc", name = "C", descriptor = "I")
	public int anInt591 = -1;

	@OriginalMember(owner = "client!gc", name = "D", descriptor = "I")
	private int anInt592 = 128;

	@OriginalMember(owner = "client!gc", name = "E", descriptor = "I")
	private int anInt593 = 128;

	@OriginalMember(owner = "client!gc", name = "F", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!gc", name = "I", descriptor = "I")
	public int anInt596 = -1;

	static {
		aBoolean129 = true;
		aClass40_6 = new Class40(30, (byte) 3);
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yb;)V")
	public static void method317(@OriginalArg(0) Class46 arg0) {
		aClass1_Sub1_Sub3_8 = new Class1_Sub1_Sub3(arg0.method674("npc.dat", null), false);
		@Pc(19) Class1_Sub1_Sub3 local19 = new Class1_Sub1_Sub3(arg0.method674("npc.idx", null), false);
		anInt581 = local19.method498();
		anIntArray164 = new int[anInt581];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt581; local29++) {
			anIntArray164[local29] = local27;
			local27 += local19.method498();
		}
		aClass13Array1 = new Class13[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass13Array1[local49] = new Class13();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)V")
	public static void method318(@OriginalArg(0) byte arg0) {
		try {
			aClass40_6 = null;
			@Pc(6) boolean local6 = false;
			anIntArray164 = null;
			aClass13Array1 = null;
			aClass1_Sub1_Sub3_8 = null;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("87151, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!gc;")
	public static Class13 method319(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass13Array1[local1].aLong25 == (long) arg0) {
				return aClass13Array1[local1];
			}
		}
		anInt582 = (anInt582 + 1) % 20;
		@Pc(33) Class13 local33 = aClass13Array1[anInt582] = new Class13();
		aClass1_Sub1_Sub3_8.anInt778 = anIntArray164[arg0];
		local33.aLong25 = arg0;
		local33.method320(aClass1_Sub1_Sub3_8);
		return local33;
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method320(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method496();
				if (local9 == 0) {
					return;
				}
				@Pc(18) int local18;
				@Pc(24) int local24;
				if (local9 == 1) {
					local18 = arg0.method496();
					this.anIntArray165 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray165[local24] = arg0.method498();
					}
				} else if (local9 == 2) {
					this.aString25 = arg0.method503();
				} else if (local9 == 3) {
					this.aByteArray5 = arg0.method504(this.anInt579);
				} else if (local9 == 12) {
					this.aByte27 = arg0.method497();
				} else if (local9 == 13) {
					this.anInt583 = arg0.method498();
				} else if (local9 == 14) {
					this.anInt584 = arg0.method498();
				} else if (local9 == 16) {
					this.aBoolean130 = true;
				} else if (local9 == 17) {
					this.anInt584 = arg0.method498();
					this.anInt585 = arg0.method498();
					this.anInt586 = arg0.method498();
					this.anInt587 = arg0.method498();
				} else if (local9 >= 30 && local9 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local9 - 30] = arg0.method503();
					if (this.aStringArray8[local9 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray8[local9 - 30] = null;
					}
				} else if (local9 == 40) {
					local18 = arg0.method496();
					this.anIntArray167 = new int[local18];
					this.anIntArray168 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray167[local24] = arg0.method498();
						this.anIntArray168[local24] = arg0.method498();
					}
				} else if (local9 == 60) {
					local18 = arg0.method496();
					this.anIntArray166 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray166[local24] = arg0.method498();
					}
				} else if (local9 == 90) {
					this.anInt588 = arg0.method498();
				} else if (local9 == 91) {
					this.anInt589 = arg0.method498();
				} else if (local9 == 92) {
					this.anInt590 = arg0.method498();
				} else if (local9 == 93) {
					this.aBoolean131 = false;
				} else if (local9 == 95) {
					this.anInt591 = arg0.method498();
				} else if (local9 == 97) {
					this.anInt592 = arg0.method498();
				} else if (local9 == 98) {
					this.anInt593 = arg0.method498();
				} else if (local9 == 99) {
					this.aBoolean132 = true;
				} else if (local9 == 100) {
					this.anInt594 = arg0.method497();
				} else if (local9 == 101) {
					this.anInt595 = arg0.method497() * 5;
				} else if (local9 == 102) {
					this.anInt596 = arg0.method498();
				}
			}
		} catch (@Pc(314) RuntimeException local314) {
			signlink.reporterror("14060, " + true + ", " + arg0 + ", " + local314.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(IB[II)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method321(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(7) Class1_Sub1_Sub1_Sub5 local7 = (Class1_Sub1_Sub1_Sub5) aClass40_6.method637(this.aLong25);
			if (arg1 != 3) {
				throw new NullPointerException();
			}
			@Pc(12) boolean local12 = false;
			if (local7 == null) {
				@Pc(22) boolean local22 = false;
				for (@Pc(24) int local24 = 0; local24 < this.anIntArray165.length; local24++) {
					if (!Class1_Sub1_Sub1_Sub5.method288(this.anIntArray165[local24])) {
						local22 = true;
					}
				}
				if (local22) {
					return null;
				}
				@Pc(49) Class1_Sub1_Sub1_Sub5[] local49 = new Class1_Sub1_Sub1_Sub5[this.anIntArray165.length];
				for (@Pc(51) int local51 = 0; local51 < this.anIntArray165.length; local51++) {
					local49[local51] = Class1_Sub1_Sub1_Sub5.method287(this.anIntArray165[local51]);
				}
				if (local49.length == 1) {
					local7 = local49[0];
				} else {
					local7 = new Class1_Sub1_Sub1_Sub5(false, local49, local49.length);
				}
				if (this.anIntArray167 != null) {
					for (@Pc(91) int local91 = 0; local91 < this.anIntArray167.length; local91++) {
						local7.method301(this.anIntArray167[local91], this.anIntArray168[local91]);
					}
				}
				local7.method294(this.aByte26);
				local7.method304(this.anInt594 + 64, this.anInt595 + 850, -30, -50, -30, true);
				aClass40_6.method638(local7, this.aLong25);
			}
			@Pc(135) Class1_Sub1_Sub1_Sub5 local135 = Class1_Sub1_Sub1_Sub5.aClass1_Sub1_Sub1_Sub5_2;
			local135.method289(local7, !this.aBoolean130);
			if (arg0 != -1 && arg3 != -1) {
				local135.method296(arg2, arg3, arg0);
			} else if (arg0 != -1) {
				local135.method295(arg0);
			}
			if (this.anInt592 != 128 || this.anInt593 != 128) {
				local135.method303(this.anInt592, this.anInt592, this.anInt593);
			}
			local135.method291();
			local135.anIntArrayArray8 = null;
			local135.anIntArrayArray7 = null;
			if (this.aByte27 == 1) {
				local135.aBoolean122 = true;
			}
			return local135;
		} catch (@Pc(202) RuntimeException local202) {
			signlink.reporterror("38269, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local202.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method322() {
		try {
			if (this.anIntArray166 == null) {
				return null;
			}
			@Pc(8) boolean local8 = false;
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray166.length; local16++) {
				if (!Class1_Sub1_Sub1_Sub5.method288(this.anIntArray166[local16])) {
					local8 = true;
				}
			}
			if (local8) {
				return null;
			}
			@Pc(41) Class1_Sub1_Sub1_Sub5[] local41 = new Class1_Sub1_Sub1_Sub5[this.anIntArray166.length];
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray166.length; local43++) {
				local41[local43] = Class1_Sub1_Sub1_Sub5.method287(this.anIntArray166[local43]);
			}
			@Pc(68) Class1_Sub1_Sub1_Sub5 local68;
			if (local41.length == 1) {
				local68 = local41[0];
			} else {
				local68 = new Class1_Sub1_Sub1_Sub5(false, local41, local41.length);
			}
			if (this.anIntArray167 != null) {
				for (@Pc(83) int local83 = 0; local83 < this.anIntArray167.length; local83++) {
					local68.method301(this.anIntArray167[local83], this.anIntArray168[local83]);
				}
			}
			return local68;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("48889, " + false + ", " + local104.toString());
			throw new RuntimeException();
		}
	}
}
