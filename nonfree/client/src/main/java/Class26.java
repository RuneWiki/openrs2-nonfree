import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LPTCUHOU")
public final class Class26 {

	@OriginalMember(owner = "client!LPTCUHOU", name = "k", descriptor = "[I")
	private static int[] anIntArray58;

	@OriginalMember(owner = "client!LPTCUHOU", name = "n", descriptor = "Lclient!GLMIQHJI;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_4;

	@OriginalMember(owner = "client!LPTCUHOU", name = "r", descriptor = "[Lclient!LPTCUHOU;")
	private static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "s", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!LPTCUHOU", name = "v", descriptor = "I")
	private static int anInt374;

	@OriginalMember(owner = "client!LPTCUHOU", name = "K", descriptor = "I")
	private static int anInt381;

	@OriginalMember(owner = "client!LPTCUHOU", name = "t", descriptor = "Lclient!HGKRJZKS;")
	public static Class18 aClass18_3 = new Class18(0, 30);

	@OriginalMember(owner = "client!LPTCUHOU", name = "c", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!LPTCUHOU", name = "f", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!LPTCUHOU", name = "g", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!LPTCUHOU", name = "l", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!LPTCUHOU", name = "u", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!LPTCUHOU", name = "x", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!LPTCUHOU", name = "B", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!LPTCUHOU", name = "C", descriptor = "I")
	private int anInt377;

	@OriginalMember(owner = "client!LPTCUHOU", name = "E", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray4;

	@OriginalMember(owner = "client!LPTCUHOU", name = "J", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!LPTCUHOU", name = "a", descriptor = "I")
	public int anInt364 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "b", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!LPTCUHOU", name = "d", descriptor = "I")
	public int anInt365 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "e", descriptor = "I")
	private int anInt366 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "h", descriptor = "I")
	private int anInt367 = 128;

	@OriginalMember(owner = "client!LPTCUHOU", name = "i", descriptor = "I")
	public int anInt368 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "j", descriptor = "I")
	public int anInt369 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "m", descriptor = "I")
	private int anInt371 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "o", descriptor = "I")
	public int anInt372 = 32;

	@OriginalMember(owner = "client!LPTCUHOU", name = "p", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!LPTCUHOU", name = "q", descriptor = "I")
	private int anInt373 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "w", descriptor = "I")
	private int anInt375 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "y", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!LPTCUHOU", name = "z", descriptor = "B")
	public byte aByte19 = 1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "A", descriptor = "I")
	public int anInt376 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "D", descriptor = "I")
	public int anInt378 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "F", descriptor = "J")
	public long aLong16 = -1L;

	@OriginalMember(owner = "client!LPTCUHOU", name = "G", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!LPTCUHOU", name = "H", descriptor = "I")
	private int anInt379 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "I", descriptor = "I")
	public int anInt380 = -1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "L", descriptor = "I")
	private int anInt382 = 128;

	@OriginalMember(owner = "client!LPTCUHOU", name = "M", descriptor = "B")
	private byte aByte20 = 1;

	@OriginalMember(owner = "client!LPTCUHOU", name = "b", descriptor = "(I)Lclient!LPTCUHOU;")
	public static Class26 method320(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass26Array1[local1].aLong16 == (long) arg0) {
				return aClass26Array1[local1];
			}
		}
		anInt381 = (anInt381 + 1) % 20;
		@Pc(33) Class26 local33 = aClass26Array1[anInt381] = new Class26();
		aClass8_Sub1_Sub3_4.anInt253 = anIntArray58[arg0];
		local33.aLong16 = arg0;
		local33.method319(aClass8_Sub1_Sub3_4);
		return local33;
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "a", descriptor = "(Lclient!XRWUKRPO;)V")
	public static void method321(@OriginalArg(0) Class45 arg0) {
		aClass8_Sub1_Sub3_4 = new Class8_Sub1_Sub3(arg0.method553("npc.dat", null), -49015);
		@Pc(19) Class8_Sub1_Sub3 local19 = new Class8_Sub1_Sub3(arg0.method553("npc.idx", null), -49015);
		anInt374 = local19.method167();
		anIntArray58 = new int[anInt374];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt374; local29++) {
			anIntArray58[local29] = local27;
			local27 += local19.method167();
		}
		aClass26Array1 = new Class26[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass26Array1[local49] = new Class26();
		}
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "d", descriptor = "(I)V")
	public static void method324() {
		try {
			aClass18_3 = null;
			anIntArray58 = null;
			aClass26Array1 = null;
			aClass8_Sub1_Sub3_4 = null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("35325, " + 2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "<init>", descriptor = "()V")
	private Class26() {
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method318() {
		try {
			if (this.anIntArray61 != null) {
				@Pc(8) Class26 local8 = this.method323();
				return local8 == null ? null : local8.method318();
			} else if (this.anIntArray57 == null) {
				return null;
			} else {
				@Pc(23) boolean local23 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray57.length; local31++) {
					if (!Class8_Sub1_Sub2_Sub5.method464(this.anIntArray57[local31])) {
						local23 = true;
					}
				}
				if (local23) {
					return null;
				}
				@Pc(56) Class8_Sub1_Sub2_Sub5[] local56 = new Class8_Sub1_Sub2_Sub5[this.anIntArray57.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray57.length; local58++) {
					local56[local58] = Class8_Sub1_Sub2_Sub5.method463(this.anIntArray57[local58]);
				}
				@Pc(83) Class8_Sub1_Sub2_Sub5 local83;
				if (local56.length == 1) {
					local83 = local56[0];
				} else {
					local83 = new Class8_Sub1_Sub2_Sub5(local56.length, local56, -11616);
				}
				if (this.anIntArray60 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray60.length; local98++) {
						local83.method477(this.anIntArray60[local98], this.anIntArray59[local98]);
					}
				}
				return local83;
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("59543, " + 0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method319(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method165();
				if (local15 == 0) {
					return;
				}
				@Pc(24) int local24;
				@Pc(30) int local30;
				if (local15 == 1) {
					local24 = arg0.method165();
					this.anIntArray56 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray56[local30] = arg0.method167();
					}
				} else if (local15 == 2) {
					this.aString4 = arg0.method172();
				} else if (local15 == 3) {
					this.aByteArray14 = arg0.method173();
				} else if (local15 == 12) {
					this.aByte19 = arg0.method166();
				} else if (local15 == 13) {
					this.anInt376 = arg0.method167();
				} else if (local15 == 14) {
					this.anInt364 = arg0.method167();
				} else if (local15 == 17) {
					this.anInt364 = arg0.method167();
					this.anInt378 = arg0.method167();
					this.anInt380 = arg0.method167();
					this.anInt369 = arg0.method167();
				} else if (local15 >= 30 && local15 < 40) {
					if (this.aStringArray4 == null) {
						this.aStringArray4 = new String[5];
					}
					this.aStringArray4[local15 - 30] = arg0.method172();
					if (this.aStringArray4[local15 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray4[local15 - 30] = null;
					}
				} else if (local15 == 40) {
					local24 = arg0.method165();
					this.anIntArray60 = new int[local24];
					this.anIntArray59 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray60[local30] = arg0.method167();
						this.anIntArray59[local30] = arg0.method167();
					}
				} else if (local15 == 60) {
					local24 = arg0.method165();
					this.anIntArray57 = new int[local24];
					for (local30 = 0; local30 < local24; local30++) {
						this.anIntArray57[local30] = arg0.method167();
					}
				} else if (local15 == 90) {
					this.anInt371 = arg0.method167();
				} else if (local15 == 91) {
					this.anInt366 = arg0.method167();
				} else if (local15 == 92) {
					this.anInt379 = arg0.method167();
				} else if (local15 == 93) {
					this.aBoolean99 = false;
				} else if (local15 == 95) {
					this.anInt365 = arg0.method167();
				} else if (local15 == 97) {
					this.anInt367 = arg0.method167();
				} else if (local15 == 98) {
					this.anInt382 = arg0.method167();
				} else if (local15 == 99) {
					this.aBoolean100 = true;
				} else if (local15 == 100) {
					this.anInt370 = arg0.method166();
				} else if (local15 == 101) {
					this.anInt377 = arg0.method166() * 5;
				} else if (local15 == 102) {
					this.anInt368 = arg0.method167();
				} else if (local15 == 103) {
					this.anInt372 = arg0.method167();
				} else if (local15 == 106) {
					this.anInt373 = arg0.method167();
					if (this.anInt373 == 65535) {
						this.anInt373 = -1;
					}
					this.anInt375 = arg0.method167();
					if (this.anInt375 == 65535) {
						this.anInt375 = -1;
					}
					local24 = arg0.method165();
					this.anIntArray61 = new int[local24 + 1];
					for (local30 = 0; local30 <= local24; local30++) {
						this.anIntArray61[local30] = arg0.method167();
						if (this.anIntArray61[local30] == 65535) {
							this.anIntArray61[local30] = -1;
						}
					}
				}
			}
		} catch (@Pc(381) RuntimeException local381) {
			signlink.reporterror("55060, " + 8 + ", " + arg0 + ", " + local381.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "a", descriptor = "([IIII)Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method322(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.anIntArray61 != null) {
				@Pc(8) Class26 local8 = this.method323();
				return local8 == null ? null : local8.method322(arg0, arg1, arg2);
			}
			@Pc(25) Class8_Sub1_Sub2_Sub5 local25 = (Class8_Sub1_Sub2_Sub5) aClass18_3.method207(this.aLong16);
			if (local25 == null) {
				@Pc(29) boolean local29 = false;
				for (@Pc(31) int local31 = 0; local31 < this.anIntArray56.length; local31++) {
					if (!Class8_Sub1_Sub2_Sub5.method464(this.anIntArray56[local31])) {
						local29 = true;
					}
				}
				if (local29) {
					return null;
				}
				@Pc(56) Class8_Sub1_Sub2_Sub5[] local56 = new Class8_Sub1_Sub2_Sub5[this.anIntArray56.length];
				for (@Pc(58) int local58 = 0; local58 < this.anIntArray56.length; local58++) {
					local56[local58] = Class8_Sub1_Sub2_Sub5.method463(this.anIntArray56[local58]);
				}
				if (local56.length == 1) {
					local25 = local56[0];
				} else {
					local25 = new Class8_Sub1_Sub2_Sub5(local56.length, local56, -11616);
				}
				if (this.anIntArray60 != null) {
					for (@Pc(98) int local98 = 0; local98 < this.anIntArray60.length; local98++) {
						local25.method477(this.anIntArray60[local98], this.anIntArray59[local98]);
					}
				}
				local25.method470();
				local25.method480(this.anInt370 + 64, this.anInt377 + 850, -30, -50, -30, true);
				aClass18_3.method208(this.aLong16, local25);
			}
			@Pc(141) Class8_Sub1_Sub2_Sub5 local141 = Class8_Sub1_Sub2_Sub5.aClass8_Sub1_Sub2_Sub5_2;
			local141.method465(local25, Class35.method448(arg2, this.aByte20) & Class35.method448(arg1, this.aByte20));
			if (arg2 != -1 && arg1 != -1) {
				local141.method472(arg2, arg0, arg1);
			} else if (arg2 != -1) {
				local141.method471(arg2);
			}
			if (this.anInt367 != 128 || this.anInt382 != 128) {
				local141.method479(this.aBoolean102, this.anInt367, this.anInt367, this.anInt382);
			}
			local141.method467();
			local141.anIntArrayArray16 = null;
			local141.anIntArrayArray15 = null;
			if (this.aByte19 == 1) {
				local141.aBoolean160 = true;
			}
			return local141;
		} catch (@Pc(219) RuntimeException local219) {
			signlink.reporterror("59163, " + arg0 + ", " + arg1 + ", " + 14442 + ", " + arg2 + ", " + local219.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LPTCUHOU", name = "c", descriptor = "(I)Lclient!LPTCUHOU;")
	public Class26 method323() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt373 != -1) {
				@Pc(17) Class50 local17 = Class50.aClass50Array1[this.anInt373];
				@Pc(20) int local20 = local17.anInt824;
				@Pc(23) int local23 = local17.anInt825;
				@Pc(26) int local26 = local17.anInt826;
				@Pc(32) int local32 = client.anIntArray249[local26 - local23];
				local8 = aClient2.anIntArray246[local20] >> local23 & local32;
			} else if (this.anInt375 != -1) {
				local8 = aClient2.anIntArray246[this.anInt375];
			}
			return local8 < 0 || local8 >= this.anIntArray61.length || this.anIntArray61[local8] == -1 ? null : method320(this.anIntArray61[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("12371, " + -23798 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
