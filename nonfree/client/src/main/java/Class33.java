import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RDFTXEYV")
public final class Class33 {

	@OriginalMember(owner = "client!RDFTXEYV", name = "d", descriptor = "[I")
	private static int[] anIntArray129;

	@OriginalMember(owner = "client!RDFTXEYV", name = "j", descriptor = "[Lclient!RDFTXEYV;")
	private static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "n", descriptor = "Lclient!FTMSICIZ;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_3;

	@OriginalMember(owner = "client!RDFTXEYV", name = "C", descriptor = "I")
	private static int anInt511;

	@OriginalMember(owner = "client!RDFTXEYV", name = "G", descriptor = "I")
	private static int anInt513;

	@OriginalMember(owner = "client!RDFTXEYV", name = "H", descriptor = "Lclient!client;")
	public static client aClient5;

	@OriginalMember(owner = "client!RDFTXEYV", name = "x", descriptor = "Lclient!FFRFJBIR;")
	public static Class7 aClass7_8 = new Class7(30, -2745);

	@OriginalMember(owner = "client!RDFTXEYV", name = "i", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!RDFTXEYV", name = "o", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!RDFTXEYV", name = "y", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!RDFTXEYV", name = "B", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!RDFTXEYV", name = "E", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!RDFTXEYV", name = "I", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!RDFTXEYV", name = "M", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!RDFTXEYV", name = "N", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray6;

	@OriginalMember(owner = "client!RDFTXEYV", name = "O", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "I")
	public int anInt495 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "b", descriptor = "I")
	private int anInt496 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "c", descriptor = "I")
	private int anInt497 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "e", descriptor = "Ljava/lang/String;")
	public String aString12 = "null";

	@OriginalMember(owner = "client!RDFTXEYV", name = "f", descriptor = "Z")
	public boolean aBoolean153 = true;

	@OriginalMember(owner = "client!RDFTXEYV", name = "g", descriptor = "I")
	private int anInt498 = -3404;

	@OriginalMember(owner = "client!RDFTXEYV", name = "h", descriptor = "I")
	private int anInt499 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "k", descriptor = "I")
	public int anInt501 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "l", descriptor = "I")
	private int anInt502 = 128;

	@OriginalMember(owner = "client!RDFTXEYV", name = "m", descriptor = "I")
	public int anInt503 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "p", descriptor = "I")
	private int anInt504 = -548;

	@OriginalMember(owner = "client!RDFTXEYV", name = "q", descriptor = "I")
	public int anInt505 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "r", descriptor = "I")
	public int anInt506 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "s", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!RDFTXEYV", name = "t", descriptor = "I")
	public int anInt507 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "u", descriptor = "Z")
	public boolean aBoolean155 = false;

	@OriginalMember(owner = "client!RDFTXEYV", name = "v", descriptor = "I")
	private int anInt508 = 128;

	@OriginalMember(owner = "client!RDFTXEYV", name = "w", descriptor = "I")
	private int anInt509 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "z", descriptor = "I")
	private int anInt510 = 9;

	@OriginalMember(owner = "client!RDFTXEYV", name = "A", descriptor = "Z")
	public boolean aBoolean156 = true;

	@OriginalMember(owner = "client!RDFTXEYV", name = "D", descriptor = "B")
	public byte aByte25 = 1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "F", descriptor = "I")
	private int anInt512 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "J", descriptor = "I")
	public int anInt514 = 32;

	@OriginalMember(owner = "client!RDFTXEYV", name = "K", descriptor = "J")
	public long aLong19 = -1L;

	@OriginalMember(owner = "client!RDFTXEYV", name = "L", descriptor = "I")
	public int anInt515 = -1;

	@OriginalMember(owner = "client!RDFTXEYV", name = "b", descriptor = "(I)V")
	public static void method371(@OriginalArg(0) int arg0) {
		try {
			aClass7_8 = null;
			anIntArray129 = null;
			aClass33Array1 = null;
			aClass4_Sub1_Sub3_3 = null;
			@Pc(11) int local11 = 49 / arg0;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("27302, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "c", descriptor = "(I)Lclient!RDFTXEYV;")
	public static Class33 method372(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass33Array1[local1].aLong19 == (long) arg0) {
				return aClass33Array1[local1];
			}
		}
		anInt511 = (anInt511 + 1) % 20;
		@Pc(33) Class33 local33 = aClass33Array1[anInt511] = new Class33();
		aClass4_Sub1_Sub3_3.anInt101 = anIntArray129[arg0];
		local33.aLong19 = arg0;
		local33.method373(aClass4_Sub1_Sub3_3, 799);
		return local33;
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(Lclient!AKPFVPPG;)V")
	public static void method374(@OriginalArg(0) Class2 arg0) {
		aClass4_Sub1_Sub3_3 = new Class4_Sub1_Sub3(arg0.method7("npc.dat", null), (byte) 3);
		@Pc(19) Class4_Sub1_Sub3 local19 = new Class4_Sub1_Sub3(arg0.method7("npc.idx", null), (byte) 3);
		anInt513 = local19.method104();
		anIntArray129 = new int[anInt513];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt513; local29++) {
			anIntArray129[local29] = local27;
			local27 += local19.method104();
		}
		aClass33Array1 = new Class33[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass33Array1[local49] = new Class33();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(I)Z")
	public boolean method367() {
		try {
			if (this.anIntArray133 == null) {
				return true;
			}
			@Pc(8) int local8 = -1;
			if (this.anInt509 != -1) {
				@Pc(27) Class25 local27 = Class25.aClass25Array1[this.anInt509];
				@Pc(30) int local30 = local27.anInt320;
				@Pc(33) int local33 = local27.anInt321;
				@Pc(36) int local36 = local27.anInt322;
				@Pc(42) int local42 = client.anIntArray269[local36 - local33];
				local8 = aClient5.anIntArray276[local30] >> local33 & local42;
			} else if (this.anInt512 != -1) {
				local8 = aClient5.anIntArray276[this.anInt512];
			}
			return local8 >= 0 && local8 < this.anIntArray133.length && this.anIntArray133[local8] != -1;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("73029, " + 42371 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(III[I)Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray133 != null) {
				@Pc(8) Class33 local8 = this.method369();
				return local8 == null ? null : local8.method368(arg0, arg1, arg2);
			}
			@Pc(25) Class4_Sub1_Sub2_Sub3 local25 = (Class4_Sub1_Sub2_Sub3) aClass7_8.method85(this.aLong19);
			if (local25 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray131.length; local41++) {
					if (!Class4_Sub1_Sub2_Sub3.method256(this.anIntArray131[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(66) Class4_Sub1_Sub2_Sub3[] local66 = new Class4_Sub1_Sub2_Sub3[this.anIntArray131.length];
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray131.length; local68++) {
					local66[local68] = Class4_Sub1_Sub2_Sub3.method255(this.anIntArray131[local68]);
				}
				if (local66.length == 1) {
					local25 = local66[0];
				} else {
					local25 = new Class4_Sub1_Sub2_Sub3(local66.length, local66, 127);
				}
				if (this.anIntArray130 != null) {
					for (@Pc(107) int local107 = 0; local107 < this.anIntArray130.length; local107++) {
						local25.method269(this.anIntArray130[local107], this.anIntArray134[local107]);
					}
				}
				local25.method262();
				local25.method272(this.anInt516 + 64, this.anInt500 + 850, -30, -50, -30, true);
				aClass7_8.method86(this.aLong19, local25, this.aBoolean154);
			}
			@Pc(151) Class4_Sub1_Sub2_Sub3 local151 = Class4_Sub1_Sub2_Sub3.aClass4_Sub1_Sub2_Sub3_1;
			local151.method257(Class37.method388(arg0) & Class37.method388(arg1), this.anInt510, local25);
			if (arg0 != -1 && arg1 != -1) {
				local151.method264(arg0, arg1, arg2);
			} else if (arg0 != -1) {
				local151.method263(arg0);
			}
			if (this.anInt508 != 128 || this.anInt502 != 128) {
				local151.method271(this.anInt508, this.anInt508, this.anInt502);
			}
			local151.method259();
			local151.anIntArrayArray3 = null;
			local151.anIntArrayArray2 = null;
			if (this.aByte25 == 1) {
				local151.aBoolean90 = true;
			}
			return local151;
		} catch (@Pc(220) RuntimeException local220) {
			signlink.reporterror("89529, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local220.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(B)Lclient!RDFTXEYV;")
	public Class33 method369() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt509 != -1) {
				@Pc(16) Class25 local16 = Class25.aClass25Array1[this.anInt509];
				@Pc(19) int local19 = local16.anInt320;
				@Pc(22) int local22 = local16.anInt321;
				@Pc(25) int local25 = local16.anInt322;
				@Pc(31) int local31 = client.anIntArray269[local25 - local22];
				local1 = aClient5.anIntArray276[local19] >> local22 & local31;
			} else if (this.anInt512 != -1) {
				local1 = aClient5.anIntArray276[this.anInt512];
			}
			return local1 < 0 || local1 >= this.anIntArray133.length || this.anIntArray133[local1] == -1 ? null : method372(this.anIntArray133[local1]);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("46415, " + -38 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(Z)Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method370() {
		try {
			if (this.anIntArray133 != null) {
				@Pc(13) Class33 local13 = this.method369();
				return local13 == null ? null : local13.method370();
			} else if (this.anIntArray132 == null) {
				return null;
			} else {
				@Pc(28) boolean local28 = false;
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray132.length; local30++) {
					if (!Class4_Sub1_Sub2_Sub3.method256(this.anIntArray132[local30])) {
						local28 = true;
					}
				}
				if (local28) {
					return null;
				}
				@Pc(55) Class4_Sub1_Sub2_Sub3[] local55 = new Class4_Sub1_Sub2_Sub3[this.anIntArray132.length];
				for (@Pc(57) int local57 = 0; local57 < this.anIntArray132.length; local57++) {
					local55[local57] = Class4_Sub1_Sub2_Sub3.method255(this.anIntArray132[local57]);
				}
				@Pc(81) Class4_Sub1_Sub2_Sub3 local81;
				if (local55.length == 1) {
					local81 = local55[0];
				} else {
					local81 = new Class4_Sub1_Sub2_Sub3(local55.length, local55, 127);
				}
				if (this.anIntArray130 != null) {
					for (@Pc(96) int local96 = 0; local96 < this.anIntArray130.length; local96++) {
						local81.method269(this.anIntArray130[local96], this.anIntArray134[local96]);
					}
				}
				return local81;
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("4524, " + true + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RDFTXEYV", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method373(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method102();
					if (local8 == 0) {
						return;
					}
					@Pc(17) int local17;
					@Pc(23) int local23;
					if (local8 == 1) {
						local17 = arg0.method102();
						this.anIntArray131 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray131[local23] = arg0.method104();
						}
					} else if (local8 == 2) {
						this.aString12 = arg0.method109();
					} else if (local8 == 3) {
						this.aByteArray11 = arg0.method110(this.anInt504);
					} else if (local8 == 12) {
						this.aByte25 = arg0.method103();
					} else if (local8 == 13) {
						this.anInt515 = arg0.method104();
					} else if (local8 == 14) {
						this.anInt505 = arg0.method104();
					} else if (local8 == 17) {
						this.anInt505 = arg0.method104();
						this.anInt503 = arg0.method104();
						this.anInt507 = arg0.method104();
						this.anInt501 = arg0.method104();
					} else if (local8 >= 30 && local8 < 40) {
						if (this.aStringArray6 == null) {
							this.aStringArray6 = new String[5];
						}
						this.aStringArray6[local8 - 30] = arg0.method109();
						if (this.aStringArray6[local8 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray6[local8 - 30] = null;
						}
					} else if (local8 == 40) {
						local17 = arg0.method102();
						this.anIntArray130 = new int[local17];
						this.anIntArray134 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray130[local23] = arg0.method104();
							this.anIntArray134[local23] = arg0.method104();
						}
					} else if (local8 == 60) {
						local17 = arg0.method102();
						this.anIntArray132 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray132[local23] = arg0.method104();
						}
					} else if (local8 == 90) {
						this.anInt496 = arg0.method104();
					} else if (local8 == 91) {
						this.anInt499 = arg0.method104();
					} else if (local8 == 92) {
						this.anInt497 = arg0.method104();
					} else if (local8 == 93) {
						this.aBoolean153 = false;
					} else if (local8 == 95) {
						this.anInt495 = arg0.method104();
					} else if (local8 == 97) {
						this.anInt508 = arg0.method104();
					} else if (local8 == 98) {
						this.anInt502 = arg0.method104();
					} else if (local8 == 99) {
						this.aBoolean155 = true;
					} else if (local8 == 100) {
						this.anInt516 = arg0.method103();
					} else if (local8 == 101) {
						this.anInt500 = arg0.method103() * 5;
					} else if (local8 == 102) {
						this.anInt506 = arg0.method104();
					} else if (local8 == 103) {
						this.anInt514 = arg0.method104();
					} else if (local8 == 106) {
						this.anInt509 = arg0.method104();
						if (this.anInt509 == 65535) {
							this.anInt509 = -1;
						}
						this.anInt512 = arg0.method104();
						if (this.anInt512 == 65535) {
							this.anInt512 = -1;
						}
						local17 = arg0.method102();
						this.anIntArray133 = new int[local17 + 1];
						for (local23 = 0; local23 <= local17; local23++) {
							this.anIntArray133[local23] = arg0.method104();
							if (this.anIntArray133[local23] == 65535) {
								this.anIntArray133[local23] = -1;
							}
						}
					} else if (local8 == 107) {
						this.aBoolean156 = false;
					}
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("24836, " + arg0 + ", " + arg1 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}
}
