import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GALAVQEJ")
public final class Class7 {

	@OriginalMember(owner = "client!GALAVQEJ", name = "f", descriptor = "[I")
	private static int[] anIntArray50;

	@OriginalMember(owner = "client!GALAVQEJ", name = "j", descriptor = "Lclient!NHEPCMLW;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "m", descriptor = "I")
	private static int anInt131;

	@OriginalMember(owner = "client!GALAVQEJ", name = "n", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!GALAVQEJ", name = "q", descriptor = "[Lclient!GALAVQEJ;")
	private static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "N", descriptor = "I")
	private static int anInt146;

	@OriginalMember(owner = "client!GALAVQEJ", name = "b", descriptor = "Lclient!ZPNSJLZE;")
	public static Class49 aClass49_2 = new Class49(30, false);

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "h", descriptor = "[I")
	private int[] anIntArray51;

	@OriginalMember(owner = "client!GALAVQEJ", name = "i", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!GALAVQEJ", name = "l", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!GALAVQEJ", name = "s", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "t", descriptor = "I")
	private int anInt135;

	@OriginalMember(owner = "client!GALAVQEJ", name = "w", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!GALAVQEJ", name = "A", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "B", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!GALAVQEJ", name = "D", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!GALAVQEJ", name = "G", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!GALAVQEJ", name = "c", descriptor = "I")
	public int anInt126 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "d", descriptor = "I")
	public int anInt127 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "e", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!GALAVQEJ", name = "g", descriptor = "I")
	private int anInt128 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "k", descriptor = "I")
	private int anInt130 = 5;

	@OriginalMember(owner = "client!GALAVQEJ", name = "o", descriptor = "I")
	public int anInt132 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "p", descriptor = "I")
	private int anInt133 = 128;

	@OriginalMember(owner = "client!GALAVQEJ", name = "r", descriptor = "I")
	public int anInt134 = 32;

	@OriginalMember(owner = "client!GALAVQEJ", name = "u", descriptor = "Z")
	public boolean aBoolean39 = true;

	@OriginalMember(owner = "client!GALAVQEJ", name = "v", descriptor = "I")
	public int anInt136 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "x", descriptor = "J")
	public long aLong10 = -1L;

	@OriginalMember(owner = "client!GALAVQEJ", name = "y", descriptor = "I")
	private int anInt137 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "z", descriptor = "B")
	public byte aByte2 = 1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "C", descriptor = "I")
	public int anInt138 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "E", descriptor = "I")
	private int anInt140 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "F", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!GALAVQEJ", name = "H", descriptor = "Z")
	public boolean aBoolean41 = true;

	@OriginalMember(owner = "client!GALAVQEJ", name = "I", descriptor = "I")
	public int anInt141 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "J", descriptor = "I")
	private int anInt142 = 128;

	@OriginalMember(owner = "client!GALAVQEJ", name = "K", descriptor = "I")
	public int anInt143 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "L", descriptor = "I")
	private int anInt144 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "M", descriptor = "I")
	private int anInt145 = -1;

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "(I)Lclient!GALAVQEJ;")
	public static Class7 method83(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass7Array1[local1].aLong10 == (long) arg0) {
				return aClass7Array1[local1];
			}
		}
		anInt131 = (anInt131 + 1) % 20;
		@Pc(33) Class7 local33 = aClass7Array1[anInt131] = new Class7();
		aClass3_Sub1_Sub3_1.anInt441 = anIntArray50[arg0];
		local33.aLong10 = (long) arg0;
		local33.method87(aClass3_Sub1_Sub3_1);
		return local33;
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "b", descriptor = "(Z)V")
	public static void method89() {
		try {
			aClass49_2 = null;
			anIntArray50 = null;
			aClass7Array1 = null;
			aClass3_Sub1_Sub3_1 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("66184, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "(Lclient!INOFEYKQ;)V")
	public static void method90(@OriginalArg(0) Class14 arg0) {
		aClass3_Sub1_Sub3_1 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("npc.dat", (byte[]) null));
		@Pc(19) Class3_Sub1_Sub3 local19 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("npc.idx", (byte[]) null));
		anInt146 = local19.method276();
		anIntArray50 = new int[anInt146];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt146; local29++) {
			anIntArray50[local29] = local27;
			local27 += local19.method276();
		}
		aClass7Array1 = new Class7[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass7Array1[local49] = new Class7();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "b", descriptor = "(I)Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method84() {
		try {
			if (this.anIntArray54 != null) {
				@Pc(19) Class7 local19 = this.method86();
				return local19 == null ? null : local19.method84();
			} else if (this.anIntArray51 == null) {
				return null;
			} else {
				@Pc(34) boolean local34 = false;
				for (@Pc(36) int local36 = 0; local36 < this.anIntArray51.length; local36++) {
					if (!Class3_Sub1_Sub1_Sub1.method34(this.anIntArray51[local36])) {
						local34 = true;
					}
				}
				if (local34) {
					return null;
				}
				@Pc(61) Class3_Sub1_Sub1_Sub1[] local61 = new Class3_Sub1_Sub1_Sub1[this.anIntArray51.length];
				for (@Pc(63) int local63 = 0; local63 < this.anIntArray51.length; local63++) {
					local61[local63] = Class3_Sub1_Sub1_Sub1.method33(this.anIntArray51[local63]);
				}
				@Pc(87) Class3_Sub1_Sub1_Sub1 local87;
				if (local61.length == 1) {
					local87 = local61[0];
				} else {
					local87 = new Class3_Sub1_Sub1_Sub1(local61.length, -39808, local61);
				}
				if (this.anIntArray55 != null) {
					for (@Pc(102) int local102 = 0; local102 < this.anIntArray55.length; local102++) {
						local87.method47(this.anIntArray55[local102], this.anIntArray52[local102]);
					}
				}
				return local87;
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("97288, " + -366 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "(II[II)Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anIntArray54 != null) {
				@Pc(12) Class7 local12 = this.method86();
				return local12 == null ? null : local12.method85(426, arg1, arg2, arg3);
			}
			@Pc(29) Class3_Sub1_Sub1_Sub1 local29 = (Class3_Sub1_Sub1_Sub1) aClass49_2.method542(this.aLong10);
			if (local29 == null) {
				@Pc(33) boolean local33 = false;
				for (@Pc(35) int local35 = 0; local35 < this.anIntArray53.length; local35++) {
					if (!Class3_Sub1_Sub1_Sub1.method34(this.anIntArray53[local35])) {
						local33 = true;
					}
				}
				if (local33) {
					return null;
				}
				@Pc(60) Class3_Sub1_Sub1_Sub1[] local60 = new Class3_Sub1_Sub1_Sub1[this.anIntArray53.length];
				for (@Pc(62) int local62 = 0; local62 < this.anIntArray53.length; local62++) {
					local60[local62] = Class3_Sub1_Sub1_Sub1.method33(this.anIntArray53[local62]);
				}
				if (local60.length == 1) {
					local29 = local60[0];
				} else {
					local29 = new Class3_Sub1_Sub1_Sub1(local60.length, -39808, local60);
				}
				if (this.anIntArray55 != null) {
					for (@Pc(101) int local101 = 0; local101 < this.anIntArray55.length; local101++) {
						local29.method47(this.anIntArray55[local101], this.anIntArray52[local101]);
					}
				}
				local29.method40();
				local29.method50(this.anInt139 + 64, 850 + this.anInt129, -30, -50, -30, true);
				aClass49_2.method543(local29, this.anInt135, this.aLong10);
			}
			@Pc(145) Class3_Sub1_Sub1_Sub1 local145 = Class3_Sub1_Sub1_Sub1.aClass3_Sub1_Sub1_Sub1_1;
			local145.method35(local29, Class18.method210(arg1) & Class18.method210(arg3));
			if (arg1 != -1 && arg3 != -1) {
				local145.method42(arg1, arg2, arg3);
			} else if (arg1 != -1) {
				local145.method41(arg1);
			}
			if (this.anInt133 != 128 || this.anInt142 != 128) {
				local145.method49(this.anInt133, this.anInt142, this.anInt133);
			}
			local145.method37();
			local145.anIntArrayArray2 = null;
			local145.anIntArrayArray1 = null;
			if (this.aByte2 == 1) {
				local145.aBoolean19 = true;
			}
			return local145;
		} catch (@Pc(213) RuntimeException local213) {
			signlink.reporterror("21759, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local213.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "c", descriptor = "(I)Lclient!GALAVQEJ;")
	public Class7 method86() {
		try {
			@Pc(11) int local11 = -1;
			if (this.anInt128 != -1) {
				@Pc(20) Class28 local20 = Class28.aClass28Array1[this.anInt128];
				@Pc(23) int local23 = local20.anInt472;
				@Pc(26) int local26 = local20.anInt473;
				@Pc(29) int local29 = local20.anInt474;
				@Pc(35) int local35 = client.anIntArray254[local29 - local26];
				local11 = aClient2.anIntArray221[local23] >> local26 & local35;
			} else if (this.anInt137 != -1) {
				local11 = aClient2.anIntArray221[this.anInt137];
			}
			return local11 < 0 || local11 >= this.anIntArray54.length || this.anIntArray54[local11] == -1 ? null : method83(this.anIntArray54[local11]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("65714, " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method87(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method274();
				if (local9 == 0) {
					return;
				}
				@Pc(18) int local18;
				@Pc(24) int local24;
				if (local9 == 1) {
					local18 = arg0.method274();
					this.anIntArray53 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray53[local24] = arg0.method276();
					}
				} else if (local9 == 2) {
					this.aString1 = arg0.method281();
				} else if (local9 == 3) {
					this.aByteArray1 = arg0.method282();
				} else if (local9 == 12) {
					this.aByte2 = arg0.method275();
				} else if (local9 == 13) {
					this.anInt143 = arg0.method276();
				} else if (local9 == 14) {
					this.anInt127 = arg0.method276();
				} else if (local9 == 17) {
					this.anInt127 = arg0.method276();
					this.anInt138 = arg0.method276();
					this.anInt126 = arg0.method276();
					this.anInt132 = arg0.method276();
				} else if (local9 >= 30 && local9 < 40) {
					if (this.aStringArray1 == null) {
						this.aStringArray1 = new String[5];
					}
					this.aStringArray1[local9 - 30] = arg0.method281();
					if (this.aStringArray1[local9 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray1[local9 - 30] = null;
					}
				} else if (local9 == 40) {
					local18 = arg0.method274();
					this.anIntArray55 = new int[local18];
					this.anIntArray52 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray55[local24] = arg0.method276();
						this.anIntArray52[local24] = arg0.method276();
					}
				} else if (local9 == 60) {
					local18 = arg0.method274();
					this.anIntArray51 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray51[local24] = arg0.method276();
					}
				} else if (local9 == 90) {
					this.anInt144 = arg0.method276();
				} else if (local9 == 91) {
					this.anInt140 = arg0.method276();
				} else if (local9 == 92) {
					this.anInt145 = arg0.method276();
				} else if (local9 == 93) {
					this.aBoolean39 = false;
				} else if (local9 == 95) {
					this.anInt136 = arg0.method276();
				} else if (local9 == 97) {
					this.anInt133 = arg0.method276();
				} else if (local9 == 98) {
					this.anInt142 = arg0.method276();
				} else if (local9 == 99) {
					this.aBoolean38 = true;
				} else if (local9 == 100) {
					this.anInt139 = arg0.method275();
				} else if (local9 == 101) {
					this.anInt129 = arg0.method275() * 5;
				} else if (local9 == 102) {
					this.anInt141 = arg0.method276();
				} else if (local9 == 103) {
					this.anInt134 = arg0.method276();
				} else if (local9 == 106) {
					this.anInt128 = arg0.method276();
					if (this.anInt128 == 65535) {
						this.anInt128 = -1;
					}
					this.anInt137 = arg0.method276();
					if (this.anInt137 == 65535) {
						this.anInt137 = -1;
					}
					local18 = arg0.method274();
					this.anIntArray54 = new int[local18 + 1];
					for (local24 = 0; local24 <= local18; local24++) {
						this.anIntArray54[local24] = arg0.method276();
						if (this.anIntArray54[local24] == 65535) {
							this.anIntArray54[local24] = -1;
						}
					}
				} else if (local9 == 107) {
					this.aBoolean41 = false;
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("79159, " + false + ", " + arg0 + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GALAVQEJ", name = "a", descriptor = "(Z)Z")
	public boolean method88() {
		try {
			if (this.anIntArray54 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt128 != -1) {
				@Pc(21) Class28 local21 = Class28.aClass28Array1[this.anInt128];
				@Pc(24) int local24 = local21.anInt472;
				@Pc(27) int local27 = local21.anInt473;
				@Pc(30) int local30 = local21.anInt474;
				@Pc(36) int local36 = client.anIntArray254[local30 - local27];
				local6 = aClient2.anIntArray221[local24] >> local27 & local36;
			} else if (this.anInt137 != -1) {
				local6 = aClient2.anIntArray221[this.anInt137];
			}
			return local6 >= 0 && local6 < this.anIntArray54.length && this.anIntArray54[local6] != -1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("81078, " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
