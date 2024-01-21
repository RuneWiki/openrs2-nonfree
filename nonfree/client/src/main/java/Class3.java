import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private static int anInt66;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private static int[] anIntArray8;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lclient!bc;")
	private static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	private static int anInt67;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "B")
	private static byte aByte4 = 6;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private static boolean aBoolean21 = true;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!s;")
	public static Class35 aClass35_3 = new Class35(17295, 30);

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray2;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "J")
	private long aLong5 = -1L;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "B")
	public byte aByte5 = 1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt68 = -1;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt69 = -1;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt70 = -1;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt71 = -1;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	private int anInt73 = -1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt74 = -1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	private int anInt75 = -1;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	public boolean aBoolean23 = true;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public int anInt76 = -1;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	private int anInt77 = 128;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	private int anInt78 = 128;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method30(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3(arg0.method516("npc.dat", null), aBoolean21);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method516("npc.idx", null), aBoolean21);
		anInt66 = local21.method374();
		anIntArray8 = new int[anInt66];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt66; local31++) {
			anIntArray8[local31] = local29;
			local29 += local21.method374();
		}
		aClass3Array1 = new Class3[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass3Array1[local51] = new Class3();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method31(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			aClass35_3 = null;
			anIntArray8 = null;
			aClass3Array1 = null;
			aClass1_Sub3_Sub3_2 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("38601, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!bc;")
	public static Class3 method32(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass3Array1[local1].aLong5 == (long) arg0) {
				return aClass3Array1[local1];
			}
		}
		anInt67 = (anInt67 + 1) % 20;
		@Pc(33) Class3 local33 = aClass3Array1[anInt67] = new Class3();
		aClass1_Sub3_Sub3_2.anInt539 = anIntArray8[arg0];
		local33.aLong5 = arg0;
		local33.method33(aByte4, aClass1_Sub3_Sub3_2);
		return local33;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method33(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(15) int local15 = arg1.method372();
					if (local15 == 0) {
						return;
					}
					@Pc(24) int local24;
					@Pc(30) int local30;
					if (local15 == 1) {
						local24 = arg1.method372();
						this.anIntArray9 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray9[local30] = arg1.method374();
						}
					} else if (local15 == 2) {
						this.aString2 = arg1.method379();
					} else if (local15 == 3) {
						this.aByteArray2 = arg1.method380(525);
					} else if (local15 == 12) {
						this.aByte5 = arg1.method373();
					} else if (local15 == 13) {
						this.anInt68 = arg1.method374();
					} else if (local15 == 14) {
						this.anInt69 = arg1.method374();
					} else if (local15 == 16) {
						this.aBoolean22 = true;
					} else if (local15 == 17) {
						this.anInt69 = arg1.method374();
						this.anInt70 = arg1.method374();
						this.anInt71 = arg1.method374();
						this.anInt72 = arg1.method374();
					} else if (local15 >= 30 && local15 < 40) {
						if (this.aStringArray2 == null) {
							this.aStringArray2 = new String[5];
						}
						this.aStringArray2[local15 - 30] = arg1.method379();
						if (this.aStringArray2[local15 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray2[local15 - 30] = null;
						}
					} else if (local15 == 40) {
						local24 = arg1.method372();
						this.anIntArray11 = new int[local24];
						this.anIntArray12 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray11[local30] = arg1.method374();
							this.anIntArray12[local30] = arg1.method374();
						}
					} else if (local15 == 60) {
						local24 = arg1.method372();
						this.anIntArray10 = new int[local24];
						for (local30 = 0; local30 < local24; local30++) {
							this.anIntArray10[local30] = arg1.method374();
						}
					} else if (local15 == 90) {
						this.anInt73 = arg1.method374();
					} else if (local15 == 91) {
						this.anInt74 = arg1.method374();
					} else if (local15 == 92) {
						this.anInt75 = arg1.method374();
					} else if (local15 == 93) {
						this.aBoolean23 = false;
					} else if (local15 == 95) {
						this.anInt76 = arg1.method374();
					} else if (local15 == 97) {
						this.anInt77 = arg1.method374();
					} else if (local15 == 98) {
						this.anInt78 = arg1.method374();
					}
				}
			}
		} catch (@Pc(282) RuntimeException local282) {
			signlink.reporterror("53037, " + arg0 + ", " + arg1 + ", " + local282.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[I)Lclient!eb;")
	public Class1_Sub3_Sub1 method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass35_3.method507(this.aLong5);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray9.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray9.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(this.anIntArray9[local18], true);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(16925, local16.length, local16);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray11.length; local60++) {
					local9.method225(this.anIntArray11[local60], this.anIntArray12[local60]);
				}
			}
			local9.method218();
			local9.method228(64, 850, -30, -50, -30, true);
			aClass35_3.method508(this.aLong5, local9, (byte) 3);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(16925, !this.aBoolean22, local9);
		if (arg0 != -1 && arg1 != -1) {
			local107.method220(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			local107.method219(arg0);
		}
		if (this.anInt77 != 128 || this.anInt78 != 128) {
			local107.method227(this.anInt78, this.anInt77, this.anInt77);
		}
		local107.method215();
		local107.anIntArrayArray7 = null;
		local107.anIntArrayArray6 = null;
		if (this.aByte5 == 1) {
			local107.aBoolean90 = true;
		}
		return local107;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub3_Sub1 method35() {
		try {
			if (this.anIntArray10 == null) {
				return null;
			}
			@Pc(21) Class1_Sub3_Sub1[] local21 = new Class1_Sub3_Sub1[this.anIntArray10.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray10.length; local23++) {
				local21[local23] = new Class1_Sub3_Sub1(this.anIntArray10[local23], true);
			}
			@Pc(50) Class1_Sub3_Sub1 local50;
			if (local21.length == 1) {
				local50 = local21[0];
			} else {
				local50 = new Class1_Sub3_Sub1(16925, local21.length, local21);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(65) int local65 = 0; local65 < this.anIntArray11.length; local65++) {
					local50.method225(this.anIntArray11[local65], this.anIntArray12[local65]);
				}
			}
			return local50;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("62836, " + 88 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
