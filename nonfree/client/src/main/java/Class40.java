import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VWKJSKWX")
public final class Class40 {

	@OriginalMember(owner = "client!VWKJSKWX", name = "c", descriptor = "[I")
	private static int[] anIntArray198;

	@OriginalMember(owner = "client!VWKJSKWX", name = "n", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!VWKJSKWX", name = "t", descriptor = "I")
	private static int anInt738;

	@OriginalMember(owner = "client!VWKJSKWX", name = "v", descriptor = "[Lclient!VWKJSKWX;")
	private static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "G", descriptor = "Lclient!MLYYHULT;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_5;

	@OriginalMember(owner = "client!VWKJSKWX", name = "H", descriptor = "I")
	private static int anInt746;

	@OriginalMember(owner = "client!VWKJSKWX", name = "f", descriptor = "Lclient!UECXVCCS;")
	public static Class36 aClass36_8 = new Class36(30, (byte) -2);

	@OriginalMember(owner = "client!VWKJSKWX", name = "z", descriptor = "I")
	private static int anInt742 = 36177;

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "[I")
	private int[] anIntArray197;

	@OriginalMember(owner = "client!VWKJSKWX", name = "d", descriptor = "[I")
	private int[] anIntArray199;

	@OriginalMember(owner = "client!VWKJSKWX", name = "h", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!VWKJSKWX", name = "o", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!VWKJSKWX", name = "q", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!VWKJSKWX", name = "w", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!VWKJSKWX", name = "E", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!VWKJSKWX", name = "I", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!VWKJSKWX", name = "J", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!VWKJSKWX", name = "L", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!VWKJSKWX", name = "b", descriptor = "I")
	public int anInt729 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "e", descriptor = "Z")
	public boolean aBoolean192 = true;

	@OriginalMember(owner = "client!VWKJSKWX", name = "g", descriptor = "I")
	private int anInt730 = 128;

	@OriginalMember(owner = "client!VWKJSKWX", name = "i", descriptor = "I")
	public int anInt731 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "j", descriptor = "I")
	private int anInt732 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "k", descriptor = "I")
	public int anInt733 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "l", descriptor = "J")
	public long aLong24 = -1L;

	@OriginalMember(owner = "client!VWKJSKWX", name = "m", descriptor = "Z")
	public boolean aBoolean193 = true;

	@OriginalMember(owner = "client!VWKJSKWX", name = "p", descriptor = "I")
	private int anInt735 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "r", descriptor = "I")
	private int anInt736 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "s", descriptor = "I")
	public int anInt737 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "u", descriptor = "I")
	public int anInt739 = 32;

	@OriginalMember(owner = "client!VWKJSKWX", name = "x", descriptor = "I")
	public int anInt740 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "y", descriptor = "I")
	public int anInt741 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "A", descriptor = "B")
	public byte aByte37 = 1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "B", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!VWKJSKWX", name = "C", descriptor = "I")
	public int anInt743 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "D", descriptor = "I")
	private int anInt744 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "F", descriptor = "I")
	private int anInt745 = -1;

	@OriginalMember(owner = "client!VWKJSKWX", name = "K", descriptor = "I")
	private int anInt748 = 128;

	@OriginalMember(owner = "client!VWKJSKWX", name = "c", descriptor = "(I)V")
	public static void method534(@OriginalArg(0) int arg0) {
		try {
			aClass36_8 = null;
			anIntArray198 = null;
			aClass40Array1 = null;
			if (arg0 != -38190) {
				anInt742 = 432;
			}
			aClass3_Sub1_Sub2_5 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("64716, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "(Lclient!GWOEELWB;)V")
	public static void method536(@OriginalArg(0) Class13 arg0) {
		aClass3_Sub1_Sub2_5 = new Class3_Sub1_Sub2(true, arg0.method140("npc.dat", null));
		@Pc(19) Class3_Sub1_Sub2 local19 = new Class3_Sub1_Sub2(true, arg0.method140("npc.idx", null));
		anInt738 = local19.method202();
		anIntArray198 = new int[anInt738];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt738; local29++) {
			anIntArray198[local29] = local27;
			local27 += local19.method202();
		}
		aClass40Array1 = new Class40[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass40Array1[local49] = new Class40();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "d", descriptor = "(I)Lclient!VWKJSKWX;")
	public static Class40 method537(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass40Array1[local1].aLong24 == (long) arg0) {
				return aClass40Array1[local1];
			}
		}
		anInt746 = (anInt746 + 1) % 20;
		@Pc(33) Class40 local33 = aClass40Array1[anInt746] = new Class40();
		aClass3_Sub1_Sub2_5.anInt429 = anIntArray198[arg0];
		local33.aLong24 = arg0;
		local33.method531(aClass3_Sub1_Sub2_5);
		return local33;
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method531(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method200();
				if (local11 == 0) {
					return;
				}
				@Pc(20) int local20;
				@Pc(26) int local26;
				if (local11 == 1) {
					local20 = arg0.method200();
					this.anIntArray201 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray201[local26] = arg0.method202();
					}
				} else if (local11 == 2) {
					this.aString15 = arg0.method207();
				} else if (local11 == 3) {
					this.aByteArray19 = arg0.method208();
				} else if (local11 == 12) {
					this.aByte37 = arg0.method201();
				} else if (local11 == 13) {
					this.anInt740 = arg0.method202();
				} else if (local11 == 14) {
					this.anInt729 = arg0.method202();
				} else if (local11 == 17) {
					this.anInt729 = arg0.method202();
					this.anInt737 = arg0.method202();
					this.anInt733 = arg0.method202();
					this.anInt741 = arg0.method202();
				} else if (local11 >= 30 && local11 < 40) {
					if (this.aStringArray7 == null) {
						this.aStringArray7 = new String[5];
					}
					this.aStringArray7[local11 - 30] = arg0.method207();
					if (this.aStringArray7[local11 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray7[local11 - 30] = null;
					}
				} else if (local11 == 40) {
					local20 = arg0.method200();
					this.anIntArray197 = new int[local20];
					this.anIntArray202 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray197[local26] = arg0.method202();
						this.anIntArray202[local26] = arg0.method202();
					}
				} else if (local11 == 60) {
					local20 = arg0.method200();
					this.anIntArray199 = new int[local20];
					for (local26 = 0; local26 < local20; local26++) {
						this.anIntArray199[local26] = arg0.method202();
					}
				} else if (local11 == 90) {
					this.anInt736 = arg0.method202();
				} else if (local11 == 91) {
					this.anInt732 = arg0.method202();
				} else if (local11 == 92) {
					this.anInt735 = arg0.method202();
				} else if (local11 == 93) {
					this.aBoolean192 = false;
				} else if (local11 == 95) {
					this.anInt743 = arg0.method202();
				} else if (local11 == 97) {
					this.anInt748 = arg0.method202();
				} else if (local11 == 98) {
					this.anInt730 = arg0.method202();
				} else if (local11 == 99) {
					this.aBoolean194 = true;
				} else if (local11 == 100) {
					this.anInt747 = arg0.method201();
				} else if (local11 == 101) {
					this.anInt734 = arg0.method201() * 5;
				} else if (local11 == 102) {
					this.anInt731 = arg0.method202();
				} else if (local11 == 103) {
					this.anInt739 = arg0.method202();
				} else if (local11 == 106) {
					this.anInt745 = arg0.method202();
					if (this.anInt745 == 65535) {
						this.anInt745 = -1;
					}
					this.anInt744 = arg0.method202();
					if (this.anInt744 == 65535) {
						this.anInt744 = -1;
					}
					local20 = arg0.method200();
					this.anIntArray200 = new int[local20 + 1];
					for (local26 = 0; local26 <= local20; local26++) {
						this.anIntArray200[local26] = arg0.method202();
						if (this.anIntArray200[local26] == 65535) {
							this.anIntArray200[local26] = -1;
						}
					}
				} else if (local11 == 107) {
					this.aBoolean193 = false;
				}
			}
		} catch (@Pc(385) RuntimeException local385) {
			signlink.reporterror("68539, " + arg0 + ", " + 2 + ", " + local385.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "(I)Z")
	public boolean method532() {
		try {
			if (this.anIntArray200 == null) {
				return true;
			}
			@Pc(8) int local8 = -1;
			if (this.anInt745 != -1) {
				@Pc(26) Class41 local26 = Class41.aClass41Array1[this.anInt745];
				@Pc(29) int local29 = local26.anInt750;
				@Pc(32) int local32 = local26.anInt751;
				@Pc(35) int local35 = local26.anInt752;
				@Pc(41) int local41 = client.anIntArray213[local35 - local32];
				local8 = aClient4.anIntArray232[local29] >> local32 & local41;
			} else if (this.anInt744 != -1) {
				local8 = aClient4.anIntArray232[this.anInt744];
			}
			return local8 >= 0 && local8 < this.anIntArray200.length && this.anIntArray200[local8] != -1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("92254, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "b", descriptor = "(I)Lclient!VWKJSKWX;")
	public Class40 method533() {
		try {
			@Pc(3) int local3 = -1;
			if (this.anInt745 != -1) {
				@Pc(21) Class41 local21 = Class41.aClass41Array1[this.anInt745];
				@Pc(24) int local24 = local21.anInt750;
				@Pc(27) int local27 = local21.anInt751;
				@Pc(30) int local30 = local21.anInt752;
				@Pc(36) int local36 = client.anIntArray213[local30 - local27];
				local3 = aClient4.anIntArray232[local24] >> local27 & local36;
			} else if (this.anInt744 != -1) {
				local3 = aClient4.anIntArray232[this.anInt744];
			}
			return local3 < 0 || local3 >= this.anIntArray200.length || this.anIntArray200[local3] == -1 ? null : method537(this.anIntArray200[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("12742, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "(III[I)Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anIntArray200 != null) {
				@Pc(12) Class40 local12 = this.method533();
				return local12 == null ? null : local12.method535(119, arg1, arg2, arg3);
			}
			@Pc(29) Class3_Sub1_Sub1_Sub1 local29 = (Class3_Sub1_Sub1_Sub1) aClass36_8.method513(this.aLong24);
			if (local29 == null) {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray201.length; local35++) {
					if (!Class3_Sub1_Sub1_Sub1.method23(this.anIntArray201[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class3_Sub1_Sub1_Sub1[] local60 = new Class3_Sub1_Sub1_Sub1[this.anIntArray201.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray201.length; local62++) {
					local60[local62] = Class3_Sub1_Sub1_Sub1.method22(this.anIntArray201[local62]);
				}
				if (local60.length == 1) {
					local29 = local60[0];
				} else {
					local29 = new Class3_Sub1_Sub1_Sub1(local60, local60.length, 337);
				}
				if (this.anIntArray197 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray197.length; local101++) {
						local29.method36(this.anIntArray197[local101], this.anIntArray202[local101]);
					}
				}
				local29.method29();
				local29.method39(this.anInt747 + 64, this.anInt734 + 850, -30, -50, -30, true);
				aClass36_8.method514(local29, this.aLong24);
			}
			@Pc(144) Class3_Sub1_Sub1_Sub1 local144 = Class3_Sub1_Sub1_Sub1.aClass3_Sub1_Sub1_Sub1_1;
			local144.method24(local29, Class7.method94(arg2) & Class7.method94(arg1));
			if (arg2 != -1 && arg1 != -1) {
				local144.method31(arg2, arg1, (byte) 4, arg3);
			} else if (arg2 != -1) {
				local144.method30(arg2);
			}
			if (this.anInt748 != 128 || this.anInt730 != 128) {
				local144.method38(this.anInt748, this.anInt730, this.anInt748);
			}
			local144.method26();
			local144.anIntArrayArray3 = null;
			local144.anIntArrayArray2 = null;
			if (this.aByte37 == 1) {
				local144.aBoolean15 = true;
			}
			return local144;
		} catch (@Pc(212) RuntimeException local212) {
			signlink.reporterror("70330, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local212.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VWKJSKWX", name = "a", descriptor = "(B)Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method538() {
		try {
			if (this.anIntArray200 != null) {
				@Pc(18) Class40 local18 = this.method533();
				return local18 == null ? null : local18.method538();
			} else if (this.anIntArray199 == null) {
				return null;
			} else {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray199.length; local35++) {
					if (!Class3_Sub1_Sub1_Sub1.method23(this.anIntArray199[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class3_Sub1_Sub1_Sub1[] local60 = new Class3_Sub1_Sub1_Sub1[this.anIntArray199.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray199.length; local62++) {
					local60[local62] = Class3_Sub1_Sub1_Sub1.method22(this.anIntArray199[local62]);
				}
				@Pc(86) Class3_Sub1_Sub1_Sub1 local86;
				if (local60.length == 1) {
					local86 = local60[0];
				} else {
					local86 = new Class3_Sub1_Sub1_Sub1(local60, local60.length, 337);
				}
				if (this.anIntArray197 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray197.length; local101++) {
						local86.method36(this.anIntArray197[local101], this.anIntArray202[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("37529, " + -72 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}
}
