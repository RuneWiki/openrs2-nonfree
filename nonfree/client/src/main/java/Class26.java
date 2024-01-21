import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NIJEYEOX")
public final class Class26 {

	@OriginalMember(owner = "client!NIJEYEOX", name = "h", descriptor = "[Lclient!NIJEYEOX;")
	private static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "s", descriptor = "Lclient!IUVBENCV;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_3;

	@OriginalMember(owner = "client!NIJEYEOX", name = "x", descriptor = "I")
	private static int anInt475;

	@OriginalMember(owner = "client!NIJEYEOX", name = "B", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!NIJEYEOX", name = "F", descriptor = "[I")
	private static int[] anIntArray135;

	@OriginalMember(owner = "client!NIJEYEOX", name = "O", descriptor = "I")
	private static int anInt483;

	@OriginalMember(owner = "client!NIJEYEOX", name = "C", descriptor = "Lclient!QASTZCLF;")
	public static Class33 aClass33_8 = new Class33(30, false);

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!NIJEYEOX", name = "g", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray6;

	@OriginalMember(owner = "client!NIJEYEOX", name = "i", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!NIJEYEOX", name = "p", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!NIJEYEOX", name = "t", descriptor = "I")
	private int anInt473;

	@OriginalMember(owner = "client!NIJEYEOX", name = "v", descriptor = "[I")
	public int[] anIntArray133;

	@OriginalMember(owner = "client!NIJEYEOX", name = "w", descriptor = "[I")
	private int[] anIntArray134;

	@OriginalMember(owner = "client!NIJEYEOX", name = "L", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!NIJEYEOX", name = "M", descriptor = "[I")
	private int[] anIntArray136;

	@OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "B")
	public byte aByte11 = 1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "c", descriptor = "I")
	private int anInt464 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "d", descriptor = "I")
	private int anInt465 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "e", descriptor = "I")
	public int anInt466 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "f", descriptor = "Ljava/lang/String;")
	public String aString12 = "null";

	@OriginalMember(owner = "client!NIJEYEOX", name = "j", descriptor = "J")
	public long aLong18 = -1L;

	@OriginalMember(owner = "client!NIJEYEOX", name = "k", descriptor = "I")
	public int anInt467 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "l", descriptor = "I")
	public int anInt468 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "m", descriptor = "I")
	private int anInt469 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "n", descriptor = "I")
	public int anInt470 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "o", descriptor = "I")
	private int anInt471 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "q", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!NIJEYEOX", name = "r", descriptor = "I")
	public int anInt472 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "u", descriptor = "I")
	public int anInt474 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "y", descriptor = "I")
	private int anInt476 = 500;

	@OriginalMember(owner = "client!NIJEYEOX", name = "z", descriptor = "I")
	private int anInt477 = 128;

	@OriginalMember(owner = "client!NIJEYEOX", name = "A", descriptor = "I")
	private int anInt478 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "D", descriptor = "Z")
	public boolean aBoolean110 = true;

	@OriginalMember(owner = "client!NIJEYEOX", name = "E", descriptor = "I")
	private int anInt479 = 128;

	@OriginalMember(owner = "client!NIJEYEOX", name = "G", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!NIJEYEOX", name = "H", descriptor = "I")
	private int anInt480 = 38776;

	@OriginalMember(owner = "client!NIJEYEOX", name = "I", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!NIJEYEOX", name = "J", descriptor = "I")
	public int anInt481 = -1;

	@OriginalMember(owner = "client!NIJEYEOX", name = "K", descriptor = "Z")
	public boolean aBoolean113 = true;

	@OriginalMember(owner = "client!NIJEYEOX", name = "N", descriptor = "I")
	public int anInt482 = 32;

	@OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "(I)Lclient!NIJEYEOX;")
	public static Class26 method290(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass26Array1[local1].aLong18 == (long) arg0) {
				return aClass26Array1[local1];
			}
		}
		anInt483 = (anInt483 + 1) % 20;
		@Pc(33) Class26 local33 = aClass26Array1[anInt483] = new Class26();
		aClass8_Sub1_Sub3_3.anInt239 = anIntArray135[arg0];
		local33.aLong18 = arg0;
		local33.method294(aClass8_Sub1_Sub3_3, (byte) 1);
		return local33;
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(Lclient!AWEEREDT;)V")
	public static void method292(@OriginalArg(0) Class2 arg0) {
		aClass8_Sub1_Sub3_3 = new Class8_Sub1_Sub3(arg0.method14("npc.dat", null), 713);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method14("npc.idx", null), 713);
		anInt475 = local19.method154();
		anIntArray135 = new int[anInt475];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt475; local29++) {
			anIntArray135[local29] = local27;
			local27 += local19.method154();
		}
		aClass26Array1 = new Class26[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass26Array1[local49] = new Class26();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "b", descriptor = "(Z)V")
	public static void method293() {
		try {
			aClass33_8 = null;
			anIntArray135 = null;
			aClass26Array1 = null;
			aClass8_Sub1_Sub3_3 = null;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("1555, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "<init>", descriptor = "()V")
	private Class26() {
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(I)Lclient!NIJEYEOX;")
	public Class26 method289() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt471 != -1) {
				@Pc(17) Class13 local17 = Class13.aClass13Array1[this.anInt471];
				@Pc(20) int local20 = local17.anInt110;
				@Pc(23) int local23 = local17.anInt111;
				@Pc(26) int local26 = local17.anInt112;
				@Pc(32) int local32 = client.anIntArray248[local26 - local23];
				local8 = aClient4.anIntArray218[local20] >> local23 & local32;
			} else if (this.anInt465 != -1) {
				local8 = aClient4.anIntArray218[this.anInt465];
			}
			return local8 < 0 || local8 >= this.anIntArray133.length || this.anIntArray133[local8] == -1 ? null : method290(this.anIntArray133[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("94539, " + 4 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(Z)Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method291() {
		try {
			if (this.anIntArray133 != null) {
				@Pc(8) Class26 local8 = this.method289();
				return local8 == null ? null : local8.method291();
			} else if (this.anIntArray132 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray132.length; local35++) {
					if (!Class8_Sub1_Sub1_Sub5.method211(this.anIntArray132[local35])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(60) Class8_Sub1_Sub1_Sub5[] local60 = new Class8_Sub1_Sub1_Sub5[this.anIntArray132.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray132.length; local62++) {
					local60[local62] = Class8_Sub1_Sub1_Sub5.method210(this.anIntArray132[local62]);
				}
				@Pc(86) Class8_Sub1_Sub1_Sub5 local86;
				if (local60.length == 1) {
					local86 = local60[0];
				} else {
					local86 = new Class8_Sub1_Sub1_Sub5(local60, local60.length, -41715);
				}
				if (this.anIntArray136 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray136.length; local101++) {
						local86.method224(this.anIntArray136[local101], this.anIntArray131[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("43193, " + false + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method294(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg0.method152();
					if (local18 == 0) {
						return;
					}
					@Pc(27) int local27;
					@Pc(33) int local33;
					if (local18 == 1) {
						local27 = arg0.method152();
						this.anIntArray134 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray134[local33] = arg0.method154();
						}
					} else if (local18 == 2) {
						this.aString12 = arg0.method159();
					} else if (local18 == 3) {
						this.aByteArray10 = arg0.method160();
					} else if (local18 == 12) {
						this.aByte11 = arg0.method153();
					} else if (local18 == 13) {
						this.anInt467 = arg0.method154();
					} else if (local18 == 14) {
						this.anInt468 = arg0.method154();
					} else if (local18 == 17) {
						this.anInt468 = arg0.method154();
						this.anInt466 = arg0.method154();
						this.anInt472 = arg0.method154();
						this.anInt470 = arg0.method154();
					} else if (local18 >= 30 && local18 < 40) {
						if (this.aStringArray6 == null) {
							this.aStringArray6 = new String[5];
						}
						this.aStringArray6[local18 - 30] = arg0.method159();
						if (this.aStringArray6[local18 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray6[local18 - 30] = null;
						}
					} else if (local18 == 40) {
						local27 = arg0.method152();
						this.anIntArray136 = new int[local27];
						this.anIntArray131 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray136[local33] = arg0.method154();
							this.anIntArray131[local33] = arg0.method154();
						}
					} else if (local18 == 60) {
						local27 = arg0.method152();
						this.anIntArray132 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray132[local33] = arg0.method154();
						}
					} else if (local18 == 90) {
						this.anInt478 = arg0.method154();
					} else if (local18 == 91) {
						this.anInt469 = arg0.method154();
					} else if (local18 == 92) {
						this.anInt464 = arg0.method154();
					} else if (local18 == 93) {
						this.aBoolean113 = false;
					} else if (local18 == 95) {
						this.anInt481 = arg0.method154();
					} else if (local18 == 97) {
						this.anInt479 = arg0.method154();
					} else if (local18 == 98) {
						this.anInt477 = arg0.method154();
					} else if (local18 == 99) {
						this.aBoolean112 = true;
					} else if (local18 == 100) {
						this.anInt463 = arg0.method153();
					} else if (local18 == 101) {
						this.anInt473 = arg0.method153() * 5;
					} else if (local18 == 102) {
						this.anInt474 = arg0.method154();
					} else if (local18 == 103) {
						this.anInt482 = arg0.method154();
					} else if (local18 == 106) {
						this.anInt471 = arg0.method154();
						if (this.anInt471 == 65535) {
							this.anInt471 = -1;
						}
						this.anInt465 = arg0.method154();
						if (this.anInt465 == 65535) {
							this.anInt465 = -1;
						}
						local27 = arg0.method152();
						this.anIntArray133 = new int[local27 + 1];
						for (local33 = 0; local33 <= local27; local33++) {
							this.anIntArray133[local33] = arg0.method154();
							if (this.anIntArray133[local33] == 65535) {
								this.anIntArray133[local33] = -1;
							}
						}
					} else if (local18 == 107) {
						this.aBoolean110 = false;
					}
				}
			}
		} catch (@Pc(392) RuntimeException local392) {
			signlink.reporterror("35824, " + arg0 + ", " + arg1 + ", " + local392.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "a", descriptor = "(III[I)Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray133 != null) {
				@Pc(13) Class26 local13 = this.method289();
				return local13 == null ? null : local13.method295(arg0, arg1, arg2);
			}
			@Pc(30) Class8_Sub1_Sub1_Sub5 local30 = (Class8_Sub1_Sub1_Sub5) aClass33_8.method367(this.aLong18);
			if (local30 == null) {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray134.length; local36++) {
					if (!Class8_Sub1_Sub1_Sub5.method211(this.anIntArray134[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class8_Sub1_Sub1_Sub5[] local61 = new Class8_Sub1_Sub1_Sub5[this.anIntArray134.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray134.length; local63++) {
					local61[local63] = Class8_Sub1_Sub1_Sub5.method210(this.anIntArray134[local63]);
				}
				if (local61.length == 1) {
					local30 = local61[0];
				} else {
					local30 = new Class8_Sub1_Sub1_Sub5(local61, local61.length, -41715);
				}
				if (this.anIntArray136 != null) {
					for (@Pc(102) int local102 = 0; local102 < this.anIntArray136.length; local102++) {
						local30.method224(this.anIntArray136[local102], this.anIntArray131[local102]);
					}
				}
				local30.method217(979);
				local30.method227(this.anInt463 + 64, this.anInt473 + 850, -30, -50, -30, true);
				aClass33_8.method368(local30, this.aLong18);
			}
			@Pc(145) Class8_Sub1_Sub1_Sub5 local145 = Class8_Sub1_Sub1_Sub5.aClass8_Sub1_Sub1_Sub5_1;
			local145.method212(local30, this.anInt480, Class29.method309(arg0) & Class29.method309(arg1));
			if (arg0 != -1 && arg1 != -1) {
				local145.method219(arg1, arg2, arg0);
			} else if (arg0 != -1) {
				local145.method218(arg0);
			}
			if (this.anInt479 != 128 || this.anInt477 != 128) {
				local145.method226(this.anInt477, this.anInt479, this.anInt479);
			}
			local145.method214();
			local145.anIntArrayArray8 = null;
			local145.anIntArrayArray7 = null;
			if (this.aByte11 == 1) {
				local145.aBoolean69 = true;
			}
			return local145;
		} catch (@Pc(214) RuntimeException local214) {
			signlink.reporterror("18181, " + arg0 + ", " + arg1 + ", " + -768 + ", " + arg2 + ", " + local214.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NIJEYEOX", name = "c", descriptor = "(I)Z")
	public boolean method296() {
		try {
			if (this.anIntArray133 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt471 != -1) {
				@Pc(21) Class13 local21 = Class13.aClass13Array1[this.anInt471];
				@Pc(24) int local24 = local21.anInt110;
				@Pc(27) int local27 = local21.anInt111;
				@Pc(30) int local30 = local21.anInt112;
				@Pc(36) int local36 = client.anIntArray248[local30 - local27];
				local6 = aClient4.anIntArray218[local24] >> local27 & local36;
			} else if (this.anInt465 != -1) {
				local6 = aClient4.anIntArray218[this.anInt465];
			}
			return local6 >= 0 && local6 < this.anIntArray133.length && this.anIntArray133[local6] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("45951, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
