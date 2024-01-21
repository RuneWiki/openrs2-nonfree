import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JRELGTVY")
public final class Class20 {

	@OriginalMember(owner = "client!JRELGTVY", name = "d", descriptor = "Lclient!PQBRPYKE;")
	private static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_3;

	@OriginalMember(owner = "client!JRELGTVY", name = "m", descriptor = "I")
	private static int anInt289;

	@OriginalMember(owner = "client!JRELGTVY", name = "v", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!JRELGTVY", name = "A", descriptor = "I")
	private static int anInt296;

	@OriginalMember(owner = "client!JRELGTVY", name = "C", descriptor = "[Lclient!JRELGTVY;")
	private static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!JRELGTVY", name = "J", descriptor = "[I")
	private static int[] anIntArray86;

	@OriginalMember(owner = "client!JRELGTVY", name = "f", descriptor = "Lclient!YITKGHWB;")
	public static Class46 aClass46_5 = new Class46(30, (byte) 6);

	@OriginalMember(owner = "client!JRELGTVY", name = "N", descriptor = "I")
	private static int anInt304 = 188;

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!JRELGTVY", name = "i", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!JRELGTVY", name = "j", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!JRELGTVY", name = "o", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!JRELGTVY", name = "E", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!JRELGTVY", name = "F", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!JRELGTVY", name = "H", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!JRELGTVY", name = "M", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!JRELGTVY", name = "c", descriptor = "I")
	public int anInt283 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "e", descriptor = "I")
	public int anInt284 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "g", descriptor = "I")
	public int anInt285 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "h", descriptor = "I")
	public int anInt286 = 32;

	@OriginalMember(owner = "client!JRELGTVY", name = "k", descriptor = "I")
	private int anInt287 = 128;

	@OriginalMember(owner = "client!JRELGTVY", name = "l", descriptor = "I")
	private int anInt288 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "n", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!JRELGTVY", name = "p", descriptor = "B")
	private byte aByte21 = -72;

	@OriginalMember(owner = "client!JRELGTVY", name = "q", descriptor = "I")
	private int anInt290 = -727;

	@OriginalMember(owner = "client!JRELGTVY", name = "r", descriptor = "J")
	public long aLong12 = -1L;

	@OriginalMember(owner = "client!JRELGTVY", name = "s", descriptor = "I")
	public int anInt291 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "t", descriptor = "I")
	private int anInt292 = 128;

	@OriginalMember(owner = "client!JRELGTVY", name = "u", descriptor = "I")
	public int anInt293 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "w", descriptor = "B")
	public byte aByte22 = 1;

	@OriginalMember(owner = "client!JRELGTVY", name = "x", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!JRELGTVY", name = "y", descriptor = "I")
	private int anInt294 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "z", descriptor = "I")
	private int anInt295 = 3;

	@OriginalMember(owner = "client!JRELGTVY", name = "B", descriptor = "I")
	public int anInt297 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "D", descriptor = "I")
	private int anInt298 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "G", descriptor = "Ljava/lang/String;")
	public String aString9 = "null";

	@OriginalMember(owner = "client!JRELGTVY", name = "I", descriptor = "I")
	private int anInt301 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "K", descriptor = "I")
	public int anInt302 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "L", descriptor = "I")
	private int anInt303 = -1;

	@OriginalMember(owner = "client!JRELGTVY", name = "O", descriptor = "Z")
	public boolean aBoolean78 = true;

	@OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "(Z)V")
	public static void method148() {
		try {
			aClass46_5 = null;
			anIntArray86 = null;
			aClass20Array1 = null;
			aClass6_Sub1_Sub4_3 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("69269, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(Lclient!XOJZVVDK;)V")
	public static void method149(@OriginalArg(0) Class43 arg0) {
		aClass6_Sub1_Sub4_3 = new Class6_Sub1_Sub4(888, arg0.method518("npc.dat", (byte[]) null));
		@Pc(19) Class6_Sub1_Sub4 local19 = new Class6_Sub1_Sub4(888, arg0.method518("npc.idx", (byte[]) null));
		anInt296 = local19.method241();
		anIntArray86 = new int[anInt296];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt296; local29++) {
			anIntArray86[local29] = local27;
			local27 += local19.method241();
		}
		aClass20Array1 = new Class20[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass20Array1[local49] = new Class20();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "b", descriptor = "(I)Lclient!JRELGTVY;")
	public static Class20 method150(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass20Array1[local1].aLong12 == (long) arg0) {
				return aClass20Array1[local1];
			}
		}
		anInt289 = (anInt289 + 1) % 20;
		@Pc(33) Class20 local33 = aClass20Array1[anInt289] = new Class20();
		aClass6_Sub1_Sub4_3.anInt390 = anIntArray86[arg0];
		local33.aLong12 = (long) arg0;
		local33.method145(aClass6_Sub1_Sub4_3);
		return local33;
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "<init>", descriptor = "()V")
	private Class20() {
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method145(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method239();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method239();
					this.anIntArray83 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray83[local25] = arg0.method241();
					}
				} else if (local10 == 2) {
					this.aString9 = arg0.method246();
				} else if (local10 == 3) {
					this.aByteArray10 = arg0.method247();
				} else if (local10 == 12) {
					this.aByte22 = arg0.method240();
				} else if (local10 == 13) {
					this.anInt283 = arg0.method241();
				} else if (local10 == 14) {
					this.anInt297 = arg0.method241();
				} else if (local10 == 17) {
					this.anInt297 = arg0.method241();
					this.anInt302 = arg0.method241();
					this.anInt284 = arg0.method241();
					this.anInt285 = arg0.method241();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local10 - 30] = arg0.method246();
					if (this.aStringArray4[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray4[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method239();
					this.anIntArray84 = new int[local19];
					this.anIntArray85 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray84[local25] = arg0.method241();
						this.anIntArray85[local25] = arg0.method241();
					}
				} else if (local10 == 60) {
					local19 = arg0.method239();
					this.anIntArray87 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray87[local25] = arg0.method241();
					}
				} else if (local10 == 90) {
					this.anInt301 = arg0.method241();
				} else if (local10 == 91) {
					this.anInt298 = arg0.method241();
				} else if (local10 == 92) {
					this.anInt294 = arg0.method241();
				} else if (local10 == 93) {
					this.aBoolean77 = false;
				} else if (local10 == 95) {
					this.anInt293 = arg0.method241();
				} else if (local10 == 97) {
					this.anInt292 = arg0.method241();
				} else if (local10 == 98) {
					this.anInt287 = arg0.method241();
				} else if (local10 == 99) {
					this.aBoolean76 = true;
				} else if (local10 == 100) {
					this.anInt299 = arg0.method240();
				} else if (local10 == 101) {
					this.anInt300 = arg0.method240() * 5;
				} else if (local10 == 102) {
					this.anInt291 = arg0.method241();
				} else if (local10 == 103) {
					this.anInt286 = arg0.method241();
				} else if (local10 == 106) {
					this.anInt288 = arg0.method241();
					if (this.anInt288 == 65535) {
						this.anInt288 = -1;
					}
					this.anInt303 = arg0.method241();
					if (this.anInt303 == 65535) {
						this.anInt303 = -1;
					}
					local19 = arg0.method239();
					this.anIntArray82 = new int[local19 + 1];
					for (local25 = 0; local25 <= local19; local25++) {
						this.anIntArray82[local25] = arg0.method241();
						if (this.anIntArray82[local25] == 65535) {
							this.anIntArray82[local25] = -1;
						}
					}
				} else if (local10 == 107) {
					this.aBoolean78 = false;
				}
			}
		} catch (@Pc(384) RuntimeException local384) {
			signlink.reporterror("45701, " + arg0 + ", " + false + ", " + local384.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(Z)Z")
	public boolean method146() {
		try {
			if (this.anIntArray82 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (this.anInt288 != -1) {
				@Pc(20) Class18 local20 = Class18.aClass18Array1[this.anInt288];
				@Pc(23) int local23 = local20.anInt217;
				@Pc(26) int local26 = local20.anInt218;
				@Pc(29) int local29 = local20.anInt219;
				@Pc(35) int local35 = client.anIntArray223[local29 - local26];
				local6 = aClient3.anIntArray239[local23] >> local26 & local35;
			} else if (this.anInt303 != -1) {
				local6 = aClient3.anIntArray239[this.anInt303];
			}
			return local6 >= 0 && local6 < this.anIntArray82.length && this.anIntArray82[local6] != -1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("1279, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "(I)Lclient!JRELGTVY;")
	public Class20 method147() {
		try {
			if (3 < this.anInt295 || 3 > this.anInt295) {
				throw new NullPointerException();
			}
			@Pc(13) int local13 = -1;
			if (this.anInt288 != -1) {
				@Pc(22) Class18 local22 = Class18.aClass18Array1[this.anInt288];
				@Pc(25) int local25 = local22.anInt217;
				@Pc(28) int local28 = local22.anInt218;
				@Pc(31) int local31 = local22.anInt219;
				@Pc(37) int local37 = client.anIntArray223[local31 - local28];
				local13 = aClient3.anIntArray239[local25] >> local28 & local37;
			} else if (this.anInt303 != -1) {
				local13 = aClient3.anIntArray239[this.anInt303];
			}
			return local13 < 0 || local13 >= this.anIntArray82.length || this.anIntArray82[local13] == -1 ? null : method150(this.anIntArray82[local13]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("11810, " + 3 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "a", descriptor = "([IIIB)Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method151(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anIntArray82 != null) {
				@Pc(18) Class20 local18 = this.method147();
				return local18 == null ? null : local18.method151(arg0, arg1, arg2);
			}
			@Pc(35) Class6_Sub1_Sub2_Sub2 local35 = (Class6_Sub1_Sub2_Sub2) aClass46_5.method529(this.aLong12);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray83.length; local41++) {
					if (!Class6_Sub1_Sub2_Sub2.method87(this.anIntArray83[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(66) Class6_Sub1_Sub2_Sub2[] local66 = new Class6_Sub1_Sub2_Sub2[this.anIntArray83.length];
				for (@Pc(68) int local68 = 0; local68 < this.anIntArray83.length; local68++) {
					local66[local68] = Class6_Sub1_Sub2_Sub2.method86(this.anIntArray83[local68]);
				}
				if (local66.length == 1) {
					local35 = local66[0];
				} else {
					local35 = new Class6_Sub1_Sub2_Sub2(local66.length, local66, this.aByte21);
				}
				if (this.anIntArray84 != null) {
					for (@Pc(108) int local108 = 0; local108 < this.anIntArray84.length; local108++) {
						local35.method100(this.anIntArray84[local108], this.anIntArray85[local108]);
					}
				}
				local35.method93();
				local35.method103(64 + this.anInt299, 850 + this.anInt300, -30, -50, -30, true);
				aClass46_5.method530(local35, this.aLong12);
			}
			@Pc(151) Class6_Sub1_Sub2_Sub2 local151 = Class6_Sub1_Sub2_Sub2.aClass6_Sub1_Sub2_Sub2_1;
			local151.method88(Class27.method185(arg2) & Class27.method185(arg1), local35);
			if (arg2 != -1 && arg1 != -1) {
				local151.method95(arg1, arg2, arg0);
			} else if (arg2 != -1) {
				local151.method94(arg2);
			}
			if (this.anInt292 != 128 || this.anInt287 != 128) {
				local151.method102(this.anInt292, this.anInt292, this.anInt287);
			}
			local151.method90();
			local151.anIntArrayArray5 = null;
			local151.anIntArrayArray4 = null;
			if (this.aByte22 == 1) {
				local151.aBoolean56 = true;
			}
			return local151;
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("31478, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -77 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRELGTVY", name = "c", descriptor = "(I)Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method152() {
		try {
			if (this.anIntArray82 != null) {
				@Pc(16) Class20 local16 = this.method147();
				return local16 == null ? null : local16.method152();
			} else if (this.anIntArray87 == null) {
				return null;
			} else {
				@Pc(31) boolean local31 = false;
				for (@Pc(33) int local33 = 0; local33 < this.anIntArray87.length; local33++) {
					if (!Class6_Sub1_Sub2_Sub2.method87(this.anIntArray87[local33])) {
						local31 = true;
					}
				}
				if (local31) {
					return null;
				}
				@Pc(58) Class6_Sub1_Sub2_Sub2[] local58 = new Class6_Sub1_Sub2_Sub2[this.anIntArray87.length];
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray87.length; local60++) {
					local58[local60] = Class6_Sub1_Sub2_Sub2.method86(this.anIntArray87[local60]);
				}
				@Pc(84) Class6_Sub1_Sub2_Sub2 local84;
				if (local58.length == 1) {
					local84 = local58[0];
				} else {
					local84 = new Class6_Sub1_Sub2_Sub2(local58.length, local58, this.aByte21);
				}
				if (this.anIntArray84 != null) {
					for (@Pc(100) int local100 = 0; local100 < this.anIntArray84.length; local100++) {
						local84.method100(this.anIntArray84[local100], this.anIntArray85[local100]);
					}
				}
				return local84;
			}
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("32008, " + -727 + ", " + local121.toString());
			throw new RuntimeException();
		}
	}
}
