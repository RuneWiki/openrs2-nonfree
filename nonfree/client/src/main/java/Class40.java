import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WZSDIPBR")
public final class Class40 {

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!WZSDIPBR", name = "e", descriptor = "I")
	private static int anInt631;

	@OriginalMember(owner = "client!WZSDIPBR", name = "s", descriptor = "[I")
	private static int[] anIntArray154;

	@OriginalMember(owner = "client!WZSDIPBR", name = "G", descriptor = "[Lclient!WZSDIPBR;")
	private static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "J", descriptor = "I")
	private static int anInt649;

	@OriginalMember(owner = "client!WZSDIPBR", name = "O", descriptor = "Lclient!PGNBHFUF;")
	private static Class4_Sub1_Sub4 aClass4_Sub1_Sub4_5;

	@OriginalMember(owner = "client!WZSDIPBR", name = "c", descriptor = "Lclient!ZYLCKQCD;")
	public static Class49 aClass49_8 = new Class49((byte) -89, 30);

	@OriginalMember(owner = "client!WZSDIPBR", name = "f", descriptor = "I")
	private static int anInt632 = 974;

	@OriginalMember(owner = "client!WZSDIPBR", name = "N", descriptor = "I")
	private static int anInt651 = -48545;

	@OriginalMember(owner = "client!WZSDIPBR", name = "b", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "client!WZSDIPBR", name = "d", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!WZSDIPBR", name = "k", descriptor = "[I")
	private int[] anIntArray151;

	@OriginalMember(owner = "client!WZSDIPBR", name = "l", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!WZSDIPBR", name = "q", descriptor = "[I")
	private int[] anIntArray152;

	@OriginalMember(owner = "client!WZSDIPBR", name = "r", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!WZSDIPBR", name = "z", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!WZSDIPBR", name = "H", descriptor = "[I")
	public int[] anIntArray155;

	@OriginalMember(owner = "client!WZSDIPBR", name = "I", descriptor = "[I")
	private int[] anIntArray156;

	@OriginalMember(owner = "client!WZSDIPBR", name = "L", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray7;

	@OriginalMember(owner = "client!WZSDIPBR", name = "g", descriptor = "I")
	public int anInt633 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "h", descriptor = "I")
	private int anInt634 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "i", descriptor = "I")
	private int anInt635 = 128;

	@OriginalMember(owner = "client!WZSDIPBR", name = "j", descriptor = "I")
	public int anInt636 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "m", descriptor = "I")
	public int anInt638 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "n", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!WZSDIPBR", name = "o", descriptor = "B")
	public byte aByte25 = 1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "p", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!WZSDIPBR", name = "t", descriptor = "I")
	private int anInt639 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "u", descriptor = "I")
	private int anInt640 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "v", descriptor = "Z")
	public boolean aBoolean173 = true;

	@OriginalMember(owner = "client!WZSDIPBR", name = "w", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!WZSDIPBR", name = "x", descriptor = "I")
	private int anInt641 = 128;

	@OriginalMember(owner = "client!WZSDIPBR", name = "y", descriptor = "I")
	private int anInt642 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "A", descriptor = "I")
	public int anInt643 = 32;

	@OriginalMember(owner = "client!WZSDIPBR", name = "B", descriptor = "I")
	public int anInt644 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "C", descriptor = "I")
	public int anInt645 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "D", descriptor = "I")
	private int anInt646 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "E", descriptor = "I")
	public int anInt647 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "F", descriptor = "I")
	private int anInt648 = 8;

	@OriginalMember(owner = "client!WZSDIPBR", name = "K", descriptor = "J")
	public long aLong21 = -1L;

	@OriginalMember(owner = "client!WZSDIPBR", name = "M", descriptor = "I")
	public int anInt650 = -1;

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "(I)Lclient!WZSDIPBR;")
	public static Class40 method481(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass40Array1[local1].aLong21 == (long) arg0) {
				return aClass40Array1[local1];
			}
		}
		anInt649 = (anInt649 + 1) % 20;
		@Pc(33) Class40 local33 = aClass40Array1[anInt649] = new Class40();
		aClass4_Sub1_Sub4_5.anInt506 = anIntArray154[arg0];
		local33.aLong21 = arg0;
		local33.method485(aClass4_Sub1_Sub4_5, anInt632);
		return local33;
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "(Lclient!QDHHNYHL;)V")
	public static void method487(@OriginalArg(0) Class32 arg0) {
		aClass4_Sub1_Sub4_5 = new Class4_Sub1_Sub4(5, arg0.method426("npc.dat", null));
		@Pc(19) Class4_Sub1_Sub4 local19 = new Class4_Sub1_Sub4(5, arg0.method426("npc.idx", null));
		anInt631 = local19.method357();
		anIntArray154 = new int[anInt631];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt631; local29++) {
			anIntArray154[local29] = local27;
			local27 += local19.method357();
		}
		aClass40Array1 = new Class40[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass40Array1[local49] = new Class40();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "c", descriptor = "(I)V")
	public static void method488() {
		try {
			aClass49_8 = null;
			anIntArray154 = null;
			aClass40Array1 = null;
			aClass4_Sub1_Sub4_5 = null;
			if (anInt651 == -48545) {
				;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("56768, " + -48545 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "(B)Lclient!WZSDIPBR;")
	public Class40 method482(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			@Pc(8) boolean local8 = false;
			if (this.anInt646 != -1) {
				@Pc(21) Class13 local21 = Class13.aClass13Array1[this.anInt646];
				@Pc(24) int local24 = local21.anInt241;
				@Pc(27) int local27 = local21.anInt242;
				@Pc(30) int local30 = local21.anInt243;
				@Pc(36) int local36 = client.anIntArray223[local30 - local27];
				local3 = aClient3.anIntArray249[local24] >> local27 & local36;
			} else if (this.anInt640 != -1) {
				local3 = aClient3.anIntArray249[this.anInt640];
			}
			return local3 < 0 || local3 >= this.anIntArray155.length || this.anIntArray155[local3] == -1 ? null : method481(this.anIntArray155[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("62173, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "(I[III)Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method483(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray155 != null) {
				@Pc(15) Class40 local15 = this.method482((byte) 3);
				return local15 == null ? null : local15.method483(arg0, arg1, arg2);
			}
			@Pc(32) Class4_Sub1_Sub1_Sub4 local32 = (Class4_Sub1_Sub1_Sub4) aClass49_8.method570(this.aLong21);
			if (local32 == null) {
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < this.anIntArray156.length; local38++) {
					if (!Class4_Sub1_Sub1_Sub4.method400(this.anIntArray156[local38])) {
						local36 = true;
					}
				}
				if (local36) {
					return null;
				}
				@Pc(63) Class4_Sub1_Sub1_Sub4[] local63 = new Class4_Sub1_Sub1_Sub4[this.anIntArray156.length];
				for (@Pc(65) int local65 = 0; local65 < this.anIntArray156.length; local65++) {
					local63[local65] = Class4_Sub1_Sub1_Sub4.method399(this.anIntArray156[local65]);
				}
				if (local63.length == 1) {
					local32 = local63[0];
				} else {
					local32 = new Class4_Sub1_Sub1_Sub4(local63.length, -347, local63);
				}
				if (this.anIntArray151 != null) {
					for (@Pc(104) int local104 = 0; local104 < this.anIntArray151.length; local104++) {
						local32.method413(this.anIntArray151[local104], this.anIntArray153[local104]);
					}
				}
				local32.method406();
				local32.method416(this.anInt637 + 64, this.anInt630 + 850, -30, -50, -30, true);
				aClass49_8.method571(local32, this.anInt648, this.aLong21);
			}
			@Pc(148) Class4_Sub1_Sub1_Sub4 local148 = Class4_Sub1_Sub1_Sub4.aClass4_Sub1_Sub1_Sub4_1;
			local148.method401(this.aBoolean172, local32, Class16.method193(arg1) & Class16.method193(arg2));
			if (arg1 != -1 && arg2 != -1) {
				local148.method408(arg0, arg1, arg2);
			} else if (arg1 != -1) {
				local148.method407(arg1);
			}
			if (this.anInt635 != 128 || this.anInt641 != 128) {
				local148.method415(this.anInt641, this.anInt635, this.anInt635);
			}
			local148.method403((byte) 3);
			local148.anIntArrayArray12 = null;
			local148.anIntArrayArray11 = null;
			if (this.aByte25 == 1) {
				local148.aBoolean138 = true;
			}
			return local148;
		} catch (@Pc(217) RuntimeException local217) {
			signlink.reporterror("79510, " + 11195 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local217.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "b", descriptor = "(B)Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method484() {
		try {
			if (this.anIntArray155 != null) {
				@Pc(18) Class40 local18 = this.method482((byte) 3);
				return local18 == null ? null : local18.method484();
			} else if (this.anIntArray152 == null) {
				return null;
			} else {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray152.length; local35++) {
					if (!Class4_Sub1_Sub1_Sub4.method400(this.anIntArray152[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class4_Sub1_Sub1_Sub4[] local60 = new Class4_Sub1_Sub1_Sub4[this.anIntArray152.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray152.length; local62++) {
					local60[local62] = Class4_Sub1_Sub1_Sub4.method399(this.anIntArray152[local62]);
				}
				@Pc(86) Class4_Sub1_Sub1_Sub4 local86;
				if (local60.length == 1) {
					local86 = local60[0];
				} else {
					local86 = new Class4_Sub1_Sub1_Sub4(local60.length, -347, local60);
				}
				if (this.anIntArray151 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray151.length; local101++) {
						local86.method413(this.anIntArray151[local101], this.anIntArray153[local101]);
					}
				}
				return local86;
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("63111, " + 50 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method485(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) int local5 = 55 / arg1;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method355();
					if (local8 == 0) {
						return;
					}
					@Pc(17) int local17;
					@Pc(23) int local23;
					if (local8 == 1) {
						local17 = arg0.method355();
						this.anIntArray156 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray156[local23] = arg0.method357();
						}
					} else if (local8 == 2) {
						this.aString13 = arg0.method362();
					} else if (local8 == 3) {
						this.aByteArray14 = arg0.method363();
					} else if (local8 == 12) {
						this.aByte25 = arg0.method356();
					} else if (local8 == 13) {
						this.anInt650 = arg0.method357();
					} else if (local8 == 14) {
						this.anInt638 = arg0.method357();
					} else if (local8 == 17) {
						this.anInt638 = arg0.method357();
						this.anInt633 = arg0.method357();
						this.anInt636 = arg0.method357();
						this.anInt644 = arg0.method357();
					} else if (local8 >= 30 && local8 < 40) {
						if (this.aStringArray7 == null) {
							this.aStringArray7 = new String[5];
						}
						this.aStringArray7[local8 - 30] = arg0.method362();
						if (this.aStringArray7[local8 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray7[local8 - 30] = null;
						}
					} else if (local8 == 40) {
						local17 = arg0.method355();
						this.anIntArray151 = new int[local17];
						this.anIntArray153 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray151[local23] = arg0.method357();
							this.anIntArray153[local23] = arg0.method357();
						}
					} else if (local8 == 60) {
						local17 = arg0.method355();
						this.anIntArray152 = new int[local17];
						for (local23 = 0; local23 < local17; local23++) {
							this.anIntArray152[local23] = arg0.method357();
						}
					} else if (local8 == 90) {
						this.anInt639 = arg0.method357();
					} else if (local8 == 91) {
						this.anInt634 = arg0.method357();
					} else if (local8 == 92) {
						this.anInt642 = arg0.method357();
					} else if (local8 == 93) {
						this.aBoolean173 = false;
					} else if (local8 == 95) {
						this.anInt645 = arg0.method357();
					} else if (local8 == 97) {
						this.anInt635 = arg0.method357();
					} else if (local8 == 98) {
						this.anInt641 = arg0.method357();
					} else if (local8 == 99) {
						this.aBoolean171 = true;
					} else if (local8 == 100) {
						this.anInt637 = arg0.method356();
					} else if (local8 == 101) {
						this.anInt630 = arg0.method356() * 5;
					} else if (local8 == 102) {
						this.anInt647 = arg0.method357();
					} else if (local8 == 103) {
						this.anInt643 = arg0.method357();
					} else if (local8 == 106) {
						this.anInt646 = arg0.method357();
						if (this.anInt646 == 65535) {
							this.anInt646 = -1;
						}
						this.anInt640 = arg0.method357();
						if (this.anInt640 == 65535) {
							this.anInt640 = -1;
						}
						local17 = arg0.method355();
						this.anIntArray155 = new int[local17 + 1];
						for (local23 = 0; local23 <= local17; local23++) {
							this.anIntArray155[local23] = arg0.method357();
							if (this.anIntArray155[local23] == 65535) {
								this.anIntArray155[local23] = -1;
							}
						}
					} else if (local8 == 107) {
						this.aBoolean174 = false;
					}
				}
			}
		} catch (@Pc(382) RuntimeException local382) {
			signlink.reporterror("41003, " + arg0 + ", " + arg1 + ", " + local382.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WZSDIPBR", name = "b", descriptor = "(I)Z")
	public boolean method486() {
		try {
			if (this.anIntArray155 == null) {
				return true;
			}
			@Pc(11) int local11 = -1;
			if (this.anInt646 != -1) {
				@Pc(20) Class13 local20 = Class13.aClass13Array1[this.anInt646];
				@Pc(23) int local23 = local20.anInt241;
				@Pc(26) int local26 = local20.anInt242;
				@Pc(29) int local29 = local20.anInt243;
				@Pc(35) int local35 = client.anIntArray223[local29 - local26];
				local11 = aClient3.anIntArray249[local23] >> local26 & local35;
			} else if (this.anInt640 != -1) {
				local11 = aClient3.anIntArray249[this.anInt640];
			}
			return local11 >= 0 && local11 < this.anIntArray155.length && this.anIntArray155[local11] != -1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("78248, " + -39117 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
