import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private static int anInt62;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private static int[] anIntArray8;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[Lclient!bc;")
	private static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private static int anInt63;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private static boolean aBoolean19 = true;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "Lclient!s;")
	public static Class35 aClass35_3 = new Class35(30, (byte) 4);

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "[B")
	public byte[] aByteArray2;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray2;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "J")
	private long aLong5 = -1L;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "B")
	public byte aByte8 = 1;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	public int anInt64 = -1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt65 = -1;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt66 = -1;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt68 = -1;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	private int anInt69 = -1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	private int anInt70 = -1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt71 = -1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Z")
	public boolean aBoolean21 = true;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	private int anInt73 = 128;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	private int anInt74 = 128;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method30(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3(0, arg0.method528("npc.dat", null));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("npc.idx", null));
		anInt62 = local21.method385();
		anIntArray8 = new int[anInt62];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt62; local31++) {
			anIntArray8[local31] = local29;
			local29 += local21.method385();
		}
		aClass3Array1 = new Class3[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass3Array1[local51] = new Class3();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method31() {
		try {
			aClass35_3 = null;
			anIntArray8 = null;
			aClass3Array1 = null;
			aClass1_Sub3_Sub3_2 = null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("25580, " + -123 + ", " + local13.toString());
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
		anInt63 = (anInt63 + 1) % 20;
		@Pc(33) Class3 local33 = aClass3Array1[anInt63] = new Class3();
		aClass1_Sub3_Sub3_2.anInt566 = anIntArray8[arg0];
		local33.aLong5 = arg0;
		local33.method33(aClass1_Sub3_Sub3_2);
		return local33;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method33(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(12) int local12 = arg0.method383();
				if (local12 == 0) {
					return;
				}
				@Pc(21) int local21;
				@Pc(27) int local27;
				if (local12 == 1) {
					local21 = arg0.method383();
					this.anIntArray9 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray9[local27] = arg0.method385();
					}
				} else if (local12 == 2) {
					this.aString2 = arg0.method390();
				} else if (local12 == 3) {
					this.aByteArray2 = arg0.method391();
				} else if (local12 == 12) {
					this.aByte8 = arg0.method384();
				} else if (local12 == 13) {
					this.anInt64 = arg0.method385();
				} else if (local12 == 14) {
					this.anInt65 = arg0.method385();
				} else if (local12 == 16) {
					this.aBoolean20 = true;
				} else if (local12 == 17) {
					this.anInt65 = arg0.method385();
					this.anInt66 = arg0.method385();
					this.anInt67 = arg0.method385();
					this.anInt68 = arg0.method385();
				} else if (local12 >= 30 && local12 < 40) {
					if (this.aStringArray2 == null) {
						this.aStringArray2 = new String[5];
					}
					this.aStringArray2[local12 - 30] = arg0.method390();
					if (this.aStringArray2[local12 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray2[local12 - 30] = null;
					}
				} else if (local12 == 40) {
					local21 = arg0.method383();
					this.anIntArray11 = new int[local21];
					this.anIntArray12 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray11[local27] = arg0.method385();
						this.anIntArray12[local27] = arg0.method385();
					}
				} else if (local12 == 60) {
					local21 = arg0.method383();
					this.anIntArray10 = new int[local21];
					for (local27 = 0; local27 < local21; local27++) {
						this.anIntArray10[local27] = arg0.method385();
					}
				} else if (local12 == 90) {
					this.anInt69 = arg0.method385();
				} else if (local12 == 91) {
					this.anInt70 = arg0.method385();
				} else if (local12 == 92) {
					this.anInt71 = arg0.method385();
				} else if (local12 == 93) {
					this.aBoolean21 = false;
				} else if (local12 == 95) {
					this.anInt72 = arg0.method385();
				} else if (local12 == 97) {
					this.anInt73 = arg0.method385();
				} else if (local12 == 98) {
					this.anInt74 = arg0.method385();
				}
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("77457, " + arg0 + ", " + 0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[I)Lclient!eb;")
	public Class1_Sub3_Sub1 method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass35_3.method519(this.aLong5);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray9.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray9.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(0, this.anIntArray9[local18]);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(6, local16.length, local16);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray11.length; local60++) {
					local9.method236(this.anIntArray11[local60], this.anIntArray12[local60]);
				}
			}
			local9.method229();
			local9.method239(64, 850, -30, -50, -30, true);
			aClass35_3.method520(this.aLong5, local9);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(6, !this.aBoolean20, local9);
		if (arg0 != -1 && arg1 != -1) {
			local107.method231(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			local107.method230(arg0);
		}
		if (this.anInt73 != 128 || this.anInt74 != 128) {
			local107.method238(this.anInt73, this.anInt73, this.anInt74);
		}
		local107.method226(983);
		local107.anIntArrayArray7 = null;
		local107.anIntArrayArray6 = null;
		if (this.aByte8 == 1) {
			local107.aBoolean81 = true;
		}
		return local107;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method35() {
		try {
			if (this.anIntArray10 == null) {
				return null;
			}
			@Pc(21) Class1_Sub3_Sub1[] local21 = new Class1_Sub3_Sub1[this.anIntArray10.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray10.length; local23++) {
				local21[local23] = new Class1_Sub3_Sub1(0, this.anIntArray10[local23]);
			}
			@Pc(50) Class1_Sub3_Sub1 local50;
			if (local21.length == 1) {
				local50 = local21[0];
			} else {
				local50 = new Class1_Sub3_Sub1(6, local21.length, local21);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(65) int local65 = 0; local65 < this.anIntArray11.length; local65++) {
					local50.method236(this.anIntArray11[local65], this.anIntArray12[local65]);
				}
			}
			return local50;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("77151, " + 2 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
