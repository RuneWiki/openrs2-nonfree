import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AUWOQLEO")
public final class Class2 {

	@OriginalMember(owner = "client!AUWOQLEO", name = "d", descriptor = "[I")
	private static int[] anIntArray1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "p", descriptor = "I")
	private static int anInt13;

	@OriginalMember(owner = "client!AUWOQLEO", name = "t", descriptor = "I")
	private static int anInt16;

	@OriginalMember(owner = "client!AUWOQLEO", name = "x", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "y", descriptor = "Lclient!EGCCHUZS;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "J", descriptor = "[Lclient!AUWOQLEO;")
	private static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "b", descriptor = "Lclient!AKUDQPZE;")
	public static Class1 aClass1_1 = new Class1((byte) 8, 30);

	@OriginalMember(owner = "client!AUWOQLEO", name = "E", descriptor = "I")
	private static int anInt23 = 48698;

	@OriginalMember(owner = "client!AUWOQLEO", name = "f", descriptor = "[I")
	private int[] anIntArray2;

	@OriginalMember(owner = "client!AUWOQLEO", name = "j", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!AUWOQLEO", name = "m", descriptor = "[I")
	public int[] anIntArray3;

	@OriginalMember(owner = "client!AUWOQLEO", name = "s", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "D", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "F", descriptor = "[I")
	private int[] anIntArray4;

	@OriginalMember(owner = "client!AUWOQLEO", name = "G", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "H", descriptor = "[I")
	private int[] anIntArray5;

	@OriginalMember(owner = "client!AUWOQLEO", name = "O", descriptor = "[I")
	private int[] anIntArray6;

	@OriginalMember(owner = "client!AUWOQLEO", name = "P", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "I")
	public int anInt6 = 32;

	@OriginalMember(owner = "client!AUWOQLEO", name = "c", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!AUWOQLEO", name = "e", descriptor = "I")
	public int anInt7 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "g", descriptor = "I")
	public int anInt8 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "h", descriptor = "I")
	private int anInt9 = 128;

	@OriginalMember(owner = "client!AUWOQLEO", name = "i", descriptor = "B")
	public byte aByte1 = 1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "k", descriptor = "B")
	private byte aByte2 = -71;

	@OriginalMember(owner = "client!AUWOQLEO", name = "l", descriptor = "Z")
	public boolean aBoolean3 = false;

	@OriginalMember(owner = "client!AUWOQLEO", name = "n", descriptor = "I")
	public int anInt11 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "o", descriptor = "I")
	private int anInt12 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "q", descriptor = "I")
	private int anInt14 = 5131;

	@OriginalMember(owner = "client!AUWOQLEO", name = "r", descriptor = "I")
	private int anInt15 = 128;

	@OriginalMember(owner = "client!AUWOQLEO", name = "u", descriptor = "I")
	public int anInt17 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "v", descriptor = "I")
	public int anInt18 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "w", descriptor = "I")
	private int anInt19 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "z", descriptor = "B")
	private byte aByte3 = -71;

	@OriginalMember(owner = "client!AUWOQLEO", name = "A", descriptor = "I")
	public int anInt20 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "B", descriptor = "I")
	private int anInt21 = -8952;

	@OriginalMember(owner = "client!AUWOQLEO", name = "C", descriptor = "I")
	private int anInt22 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "I", descriptor = "I")
	private int anInt24 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "K", descriptor = "Z")
	public boolean aBoolean4 = true;

	@OriginalMember(owner = "client!AUWOQLEO", name = "L", descriptor = "I")
	public int anInt25 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "M", descriptor = "J")
	public long aLong1 = -1L;

	@OriginalMember(owner = "client!AUWOQLEO", name = "N", descriptor = "I")
	private int anInt26 = -1;

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "(Lclient!TKEGJSFV;)V")
	public static void method8(@OriginalArg(0) Class38 arg0) {
		aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3(arg0.method514("npc.dat", null), false);
		@Pc(19) Class4_Sub1_Sub3 local19 = new Class4_Sub1_Sub3(arg0.method514("npc.idx", null), false);
		anInt16 = local19.method169();
		anIntArray1 = new int[anInt16];
		@Pc(27) int local27 = 2;
		for (@Pc(29) int local29 = 0; local29 < anInt16; local29++) {
			anIntArray1[local29] = local27;
			local27 += local19.method169();
		}
		aClass2Array1 = new Class2[20];
		for (@Pc(49) int local49 = 0; local49 < 20; local49++) {
			aClass2Array1[local49] = new Class2();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "b", descriptor = "(I)Lclient!AUWOQLEO;")
	public static Class2 method9(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass2Array1[local1].aLong1 == (long) arg0) {
				return aClass2Array1[local1];
			}
		}
		anInt13 = (anInt13 + 1) % 20;
		@Pc(33) Class2 local33 = aClass2Array1[anInt13] = new Class2();
		aClass4_Sub1_Sub3_1.anInt242 = anIntArray1[arg0];
		local33.aLong1 = arg0;
		local33.method5(aClass4_Sub1_Sub3_1);
		return local33;
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "b", descriptor = "(B)V")
	public static void method10() {
		try {
			aClass1_1 = null;
			anIntArray1 = null;
			aClass2Array1 = null;
			aClass4_Sub1_Sub3_1 = null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("78297, " + 1 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "(I)Z")
	public boolean method4(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray3 == null) {
				return true;
			}
			@Pc(6) int local6 = -1;
			if (arg0 >= 0) {
				anInt23 = 470;
			}
			if (this.anInt19 != -1) {
				@Pc(19) Class12 local19 = Class12.aClass12Array1[this.anInt19];
				@Pc(22) int local22 = local19.anInt248;
				@Pc(25) int local25 = local19.anInt249;
				@Pc(28) int local28 = local19.anInt250;
				@Pc(34) int local34 = client.anIntArray261[local28 - local25];
				local6 = aClient1.anIntArray212[local22] >> local25 & local34;
			} else if (this.anInt26 != -1) {
				local6 = aClient1.anIntArray212[this.anInt26];
			}
			return local6 >= 0 && local6 < this.anIntArray3.length && this.anIntArray3[local6] != -1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("12119, " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method5(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method167();
				if (local9 == 0) {
					return;
				}
				@Pc(18) int local18;
				@Pc(24) int local24;
				if (local9 == 1) {
					local18 = arg0.method167();
					this.anIntArray5 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray5[local24] = arg0.method169();
					}
				} else if (local9 == 2) {
					this.aString1 = arg0.method174();
				} else if (local9 == 3) {
					this.aByteArray1 = arg0.method175();
				} else if (local9 == 12) {
					this.aByte1 = arg0.method168();
				} else if (local9 == 13) {
					this.anInt18 = arg0.method169();
				} else if (local9 == 14) {
					this.anInt7 = arg0.method169();
				} else if (local9 == 17) {
					this.anInt7 = arg0.method169();
					this.anInt8 = arg0.method169();
					this.anInt20 = arg0.method169();
					this.anInt11 = arg0.method169();
				} else if (local9 >= 30 && local9 < 40) {
					if (this.aStringArray1 == null) {
						this.aStringArray1 = new String[5];
					}
					this.aStringArray1[local9 - 30] = arg0.method174();
					if (this.aStringArray1[local9 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray1[local9 - 30] = null;
					}
				} else if (local9 == 40) {
					local18 = arg0.method167();
					this.anIntArray2 = new int[local18];
					this.anIntArray6 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray2[local24] = arg0.method169();
						this.anIntArray6[local24] = arg0.method169();
					}
				} else if (local9 == 60) {
					local18 = arg0.method167();
					this.anIntArray4 = new int[local18];
					for (local24 = 0; local24 < local18; local24++) {
						this.anIntArray4[local24] = arg0.method169();
					}
				} else if (local9 == 90) {
					this.anInt12 = arg0.method169();
				} else if (local9 == 91) {
					this.anInt22 = arg0.method169();
				} else if (local9 == 92) {
					this.anInt24 = arg0.method169();
				} else if (local9 == 93) {
					this.aBoolean4 = false;
				} else if (local9 == 95) {
					this.anInt25 = arg0.method169();
				} else if (local9 == 97) {
					this.anInt9 = arg0.method169();
				} else if (local9 == 98) {
					this.anInt15 = arg0.method169();
				} else if (local9 == 99) {
					this.aBoolean3 = true;
				} else if (local9 == 100) {
					this.anInt10 = arg0.method168();
				} else if (local9 == 101) {
					this.anInt27 = arg0.method168() * 5;
				} else if (local9 == 102) {
					this.anInt17 = arg0.method169();
				} else if (local9 == 103) {
					this.anInt6 = arg0.method169();
				} else if (local9 == 106) {
					this.anInt19 = arg0.method169();
					if (this.anInt19 == 65535) {
						this.anInt19 = -1;
					}
					this.anInt26 = arg0.method169();
					if (this.anInt26 == 65535) {
						this.anInt26 = -1;
					}
					local18 = arg0.method167();
					this.anIntArray3 = new int[local18 + 1];
					for (local24 = 0; local24 <= local18; local24++) {
						this.anIntArray3[local24] = arg0.method169();
						if (this.anIntArray3[local24] == 65535) {
							this.anIntArray3[local24] = -1;
						}
					}
				} else if (local9 == 107) {
					this.aBoolean2 = false;
				}
			}
		} catch (@Pc(383) RuntimeException local383) {
			signlink.reporterror("70335, " + arg0 + ", " + true + ", " + local383.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "(B)Lclient!AUWOQLEO;")
	public Class2 method6(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 != this.aByte3) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			if (this.anInt19 != -1) {
				@Pc(23) Class12 local23 = Class12.aClass12Array1[this.anInt19];
				@Pc(26) int local26 = local23.anInt248;
				@Pc(29) int local29 = local23.anInt249;
				@Pc(32) int local32 = local23.anInt250;
				@Pc(38) int local38 = client.anIntArray261[local32 - local29];
				local3 = aClient1.anIntArray212[local26] >> local29 & local38;
			} else if (this.anInt26 != -1) {
				local3 = aClient1.anIntArray212[this.anInt26];
			}
			return local3 < 0 || local3 >= this.anIntArray3.length || this.anIntArray3[local3] == -1 ? null : method9(this.anIntArray3[local3]);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("99437, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "a", descriptor = "(BII[I)Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method7(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			if (this.anIntArray3 != null) {
				@Pc(16) Class2 local16 = this.method6(this.aByte2);
				return local16 == null ? null : local16.method7(arg0, arg1, arg2);
			}
			@Pc(33) Class4_Sub1_Sub1_Sub3 local33 = (Class4_Sub1_Sub1_Sub3) aClass1_1.method1(this.aLong1);
			if (local33 == null) {
				@Pc(37) boolean local37 = false;
				for (@Pc(39) int local39 = 0; local39 < this.anIntArray5.length; local39++) {
					if (!Class4_Sub1_Sub1_Sub3.method284(this.anIntArray5[local39])) {
						local37 = true;
					}
				}
				if (local37) {
					return null;
				}
				@Pc(64) Class4_Sub1_Sub1_Sub3[] local64 = new Class4_Sub1_Sub1_Sub3[this.anIntArray5.length];
				for (@Pc(66) int local66 = 0; local66 < this.anIntArray5.length; local66++) {
					local64[local66] = Class4_Sub1_Sub1_Sub3.method283(this.anIntArray5[local66]);
				}
				if (local64.length == 1) {
					local33 = local64[0];
				} else {
					local33 = new Class4_Sub1_Sub1_Sub3(true, local64.length, local64);
				}
				if (this.anIntArray2 != null) {
					for (@Pc(105) int local105 = 0; local105 < this.anIntArray2.length; local105++) {
						local33.method297(this.anIntArray2[local105], this.anIntArray6[local105]);
					}
				}
				local33.method290();
				local33.method300(this.anInt10 + 64, this.anInt27 + 850, -30, -50, -30, true);
				aClass1_1.method2(local33, this.aLong1);
			}
			@Pc(148) Class4_Sub1_Sub1_Sub3 local148 = Class4_Sub1_Sub1_Sub3.aClass4_Sub1_Sub1_Sub3_1;
			local148.method285(local33, Class22.method274(arg1, this.anInt14) & Class22.method274(arg0, this.anInt14));
			if (arg1 != -1 && arg0 != -1) {
				local148.method292(arg2, arg0, arg1);
			} else if (arg1 != -1) {
				local148.method291(arg1);
			}
			if (this.anInt9 != 128 || this.anInt15 != 128) {
				local148.method299(this.anInt9, this.anInt15, this.anInt9);
			}
			local148.method287(856);
			local148.anIntArrayArray5 = null;
			local148.anIntArrayArray4 = null;
			if (this.aByte1 == 1) {
				local148.aBoolean120 = true;
			}
			return local148;
		} catch (@Pc(218) RuntimeException local218) {
			signlink.reporterror("22185, " + 15 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local218.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AUWOQLEO", name = "c", descriptor = "(B)Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method11(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray3 != null) {
				@Pc(20) Class2 local20 = this.method6(this.aByte2);
				return local20 == null ? null : local20.method11((byte) 5);
			} else if (this.anIntArray4 == null) {
				return null;
			} else {
				@Pc(35) boolean local35 = false;
				for (@Pc(37) int local37 = 0; local37 < this.anIntArray4.length; local37++) {
					if (!Class4_Sub1_Sub1_Sub3.method284(this.anIntArray4[local37])) {
						local35 = true;
					}
				}
				if (local35) {
					return null;
				}
				@Pc(62) Class4_Sub1_Sub1_Sub3[] local62 = new Class4_Sub1_Sub1_Sub3[this.anIntArray4.length];
				for (@Pc(64) int local64 = 0; local64 < this.anIntArray4.length; local64++) {
					local62[local64] = Class4_Sub1_Sub1_Sub3.method283(this.anIntArray4[local64]);
				}
				@Pc(88) Class4_Sub1_Sub1_Sub3 local88;
				if (local62.length == 1) {
					local88 = local62[0];
				} else {
					local88 = new Class4_Sub1_Sub1_Sub3(true, local62.length, local62);
				}
				if (this.anIntArray2 != null) {
					for (@Pc(103) int local103 = 0; local103 < this.anIntArray2.length; local103++) {
						local88.method297(this.anIntArray2[local103], this.anIntArray6[local103]);
					}
				}
				return local88;
			}
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("54267, " + arg0 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}
}
