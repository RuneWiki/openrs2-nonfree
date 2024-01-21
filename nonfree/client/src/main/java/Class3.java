import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
	private static boolean aBoolean23;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
	private static boolean aBoolean24;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private static int anInt61;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	private static int[] anIntArray8;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[Lclient!bc;")
	private static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private static int anInt62;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "B")
	private static byte aByte8 = 8;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "B")
	private static byte aByte9 = 4;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Lclient!s;")
	public static Class35 aClass35_3 = new Class35(2, 30);

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray2;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "J")
	private long aLong5 = -1L;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "B")
	public byte aByte10 = 1;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt63 = -1;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt64 = -1;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public int anInt65 = -1;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	public int anInt66 = -1;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	private int anInt68 = -1;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	private int anInt69 = -1;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	private int anInt70 = -1;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "Z")
	public boolean aBoolean26 = true;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
	public int anInt71 = -1;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt72 = 128;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
	private int anInt73 = 128;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method30(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3(arg0.method528(aByte9, "npc.dat", null), 0);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method528(aByte9, "npc.idx", null), 0);
		anInt61 = local21.method385();
		anIntArray8 = new int[anInt61];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt61; local31++) {
			anIntArray8[local31] = local29;
			local29 += local21.method385();
		}
		aClass3Array1 = new Class3[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass3Array1[local51] = new Class3();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public static void method31(@OriginalArg(0) boolean arg0) {
		try {
			aClass35_3 = null;
			anIntArray8 = null;
			aClass3Array1 = null;
			if (arg0) {
				aBoolean24 = !aBoolean24;
			}
			aClass1_Sub3_Sub3_2 = null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("47504, " + arg0 + ", " + local17.toString());
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
		anInt62 = (anInt62 + 1) % 20;
		@Pc(33) Class3 local33 = aClass3Array1[anInt62] = new Class3();
		aClass1_Sub3_Sub3_2.anInt548 = anIntArray8[arg0];
		local33.aLong5 = arg0;
		local33.method33(aByte8, aClass1_Sub3_Sub3_2);
		return local33;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method33(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(10) int local10;
			if (arg0 == 8) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			while (true) {
				while (true) {
					local10 = arg1.method383();
					if (local10 == 0) {
						return;
					}
					@Pc(27) int local27;
					@Pc(33) int local33;
					if (local10 == 1) {
						local27 = arg1.method383();
						this.anIntArray9 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray9[local33] = arg1.method385();
						}
					} else if (local10 == 2) {
						this.aString2 = arg1.method390();
					} else if (local10 == 3) {
						this.aByteArray2 = arg1.method391();
					} else if (local10 == 12) {
						this.aByte10 = arg1.method384();
					} else if (local10 == 13) {
						this.anInt63 = arg1.method385();
					} else if (local10 == 14) {
						this.anInt64 = arg1.method385();
					} else if (local10 == 16) {
						this.aBoolean25 = true;
					} else if (local10 == 17) {
						this.anInt64 = arg1.method385();
						this.anInt65 = arg1.method385();
						this.anInt66 = arg1.method385();
						this.anInt67 = arg1.method385();
					} else if (local10 >= 30 && local10 < 40) {
						if (this.aStringArray2 == null) {
							this.aStringArray2 = new String[5];
						}
						this.aStringArray2[local10 - 30] = arg1.method390();
						if (this.aStringArray2[local10 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray2[local10 - 30] = null;
						}
					} else if (local10 == 40) {
						local27 = arg1.method383();
						this.anIntArray11 = new int[local27];
						this.anIntArray12 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray11[local33] = arg1.method385();
							this.anIntArray12[local33] = arg1.method385();
						}
					} else if (local10 == 60) {
						local27 = arg1.method383();
						this.anIntArray10 = new int[local27];
						for (local33 = 0; local33 < local27; local33++) {
							this.anIntArray10[local33] = arg1.method385();
						}
					} else if (local10 == 90) {
						this.anInt68 = arg1.method385();
					} else if (local10 == 91) {
						this.anInt69 = arg1.method385();
					} else if (local10 == 92) {
						this.anInt70 = arg1.method385();
					} else if (local10 == 93) {
						this.aBoolean26 = false;
					} else if (local10 == 95) {
						this.anInt71 = arg1.method385();
					} else if (local10 == 97) {
						this.anInt72 = arg1.method385();
					} else if (local10 == 98) {
						this.anInt73 = arg1.method385();
					}
				}
			}
		} catch (@Pc(285) RuntimeException local285) {
			signlink.reporterror("52508, " + arg0 + ", " + arg1 + ", " + local285.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[I)Lclient!eb;")
	public Class1_Sub3_Sub1 method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass35_3.method519(this.aLong5);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray9.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray9.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(this.anIntArray9[local18], 6);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(20363, local16, local16.length);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray11.length; local60++) {
					local9.method236(this.anIntArray11[local60], this.anIntArray12[local60]);
				}
			}
			local9.method229(797);
			local9.method239(64, 850, -30, -50, -30, true);
			aClass35_3.method520(local9, this.aLong5);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(20363, local9, !this.aBoolean25);
		if (arg0 != -1 && arg1 != -1) {
			local107.method231(arg1, arg0, arg2);
		} else if (arg0 != -1) {
			local107.method230(arg0);
		}
		if (this.anInt72 != 128 || this.anInt73 != 128) {
			local107.method238(this.anInt73, this.anInt72, this.anInt72);
		}
		local107.method226(aBoolean23);
		local107.anIntArrayArray7 = null;
		local107.anIntArrayArray6 = null;
		if (this.aByte10 == 1) {
			local107.aBoolean88 = true;
		}
		return local107;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method35() {
		try {
			if (this.anIntArray10 == null) {
				return null;
			}
			@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray10.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray10.length; local23++) {
				local11[local23] = new Class1_Sub3_Sub1(this.anIntArray10[local23], 6);
			}
			@Pc(50) Class1_Sub3_Sub1 local50;
			if (local11.length == 1) {
				local50 = local11[0];
			} else {
				local50 = new Class1_Sub3_Sub1(20363, local11, local11.length);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(65) int local65 = 0; local65 < this.anIntArray11.length; local65++) {
					local50.method236(this.anIntArray11[local65], this.anIntArray12[local65]);
				}
			}
			return local50;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("83672, " + 509 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
