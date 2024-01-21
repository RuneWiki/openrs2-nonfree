import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private static int anInt70;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private static int[] anIntArray8;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[Lclient!bc;")
	private static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	private static int anInt71;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private static int anInt69 = 9;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!s;")
	public static Class35 aClass35_3 = new Class35(-24, 30);

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

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "J")
	private long aLong5 = -1L;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "B")
	public byte aByte6 = 1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt73 = -1;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt74 = -1;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt75 = -1;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	public int anInt76 = -1;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
	private boolean aBoolean19 = false;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	private int anInt77 = -1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt78 = -1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	private int anInt79 = -1;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	public boolean aBoolean20 = true;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public int anInt80 = -1;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
	private int anInt81 = 128;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	private int anInt82 = 128;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method30(@OriginalArg(0) Class39 arg0) {
		aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "npc.dat"));
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "npc.idx"));
		anInt70 = local21.method393();
		anIntArray8 = new int[anInt70];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt70; local31++) {
			anIntArray8[local31] = local29;
			local29 += local21.method393();
		}
		aClass3Array1 = new Class3[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass3Array1[local51] = new Class3();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method31() {
		try {
			aClass35_3 = null;
			anIntArray8 = null;
			aClass3Array1 = null;
			aClass1_Sub3_Sub3_2 = null;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("48153, " + -25 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Lclient!bc;")
	public static Class3 method32(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass3Array1[local1].aLong5 == (long) arg0) {
				return aClass3Array1[local1];
			}
		}
		anInt71 = (anInt71 + 1) % 20;
		@Pc(33) Class3 local33 = aClass3Array1[anInt71] = new Class3();
		aClass1_Sub3_Sub3_2.anInt554 = anIntArray8[arg0];
		local33.aLong5 = arg0;
		local33.method33(aClass1_Sub3_Sub3_2);
		return local33;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method33(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method391();
				if (local10 == 0) {
					return;
				}
				@Pc(19) int local19;
				@Pc(25) int local25;
				if (local10 == 1) {
					local19 = arg0.method391();
					this.anIntArray9 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray9[local25] = arg0.method393();
					}
				} else if (local10 == 2) {
					this.aString2 = arg0.method398();
				} else if (local10 == 3) {
					this.aByteArray2 = arg0.method399();
				} else if (local10 == 12) {
					this.aByte6 = arg0.method392();
				} else if (local10 == 13) {
					this.anInt72 = arg0.method393();
				} else if (local10 == 14) {
					this.anInt73 = arg0.method393();
				} else if (local10 == 16) {
					this.aBoolean19 = true;
				} else if (local10 == 17) {
					this.anInt73 = arg0.method393();
					this.anInt74 = arg0.method393();
					this.anInt75 = arg0.method393();
					this.anInt76 = arg0.method393();
				} else if (local10 >= 30 && local10 < 40) {
					if (this.aStringArray2 == null) {
						this.aStringArray2 = new String[5];
					}
					this.aStringArray2[local10 - 30] = arg0.method398();
					if (this.aStringArray2[local10 - 30].equalsIgnoreCase("hidden")) {
						this.aStringArray2[local10 - 30] = null;
					}
				} else if (local10 == 40) {
					local19 = arg0.method391();
					this.anIntArray11 = new int[local19];
					this.anIntArray12 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray11[local25] = arg0.method393();
						this.anIntArray12[local25] = arg0.method393();
					}
				} else if (local10 == 60) {
					local19 = arg0.method391();
					this.anIntArray10 = new int[local19];
					for (local25 = 0; local25 < local19; local25++) {
						this.anIntArray10[local25] = arg0.method393();
					}
				} else if (local10 == 90) {
					this.anInt77 = arg0.method393();
				} else if (local10 == 91) {
					this.anInt78 = arg0.method393();
				} else if (local10 == 92) {
					this.anInt79 = arg0.method393();
				} else if (local10 == 93) {
					this.aBoolean20 = false;
				} else if (local10 == 95) {
					this.anInt80 = arg0.method393();
				} else if (local10 == 97) {
					this.anInt81 = arg0.method393();
				} else if (local10 == 98) {
					this.anInt82 = arg0.method393();
				}
			}
		} catch (@Pc(277) RuntimeException local277) {
			signlink.reporterror("95224, " + arg0 + ", " + true + ", " + local277.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[I)Lclient!eb;")
	public Class1_Sub3_Sub1 method34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass35_3.method527(this.aLong5);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray9.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray9.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(this.anIntArray9[local18], (byte) 1);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(-406, local16, local16.length);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray11.length; local60++) {
					local9.method237(this.anIntArray11[local60], this.anIntArray12[local60]);
				}
			}
			local9.method230();
			local9.method240(64, 850, -30, -50, -30, true);
			aClass35_3.method528(local9, this.aLong5);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(-406, local9, !this.aBoolean19);
		if (arg0 != -1 && arg1 != -1) {
			local107.method232(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			local107.method231(arg0);
		}
		if (this.anInt81 != 128 || this.anInt82 != 128) {
			local107.method239(this.anInt82, this.anInt81, this.anInt81);
		}
		local107.method227();
		local107.anIntArrayArray7 = null;
		local107.anIntArrayArray6 = null;
		if (this.aByte6 == 1) {
			local107.aBoolean84 = true;
		}
		return local107;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method35() {
		try {
			if (this.anIntArray10 == null) {
				return null;
			}
			@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray10.length];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray10.length; local25++) {
				local11[local25] = new Class1_Sub3_Sub1(this.anIntArray10[local25], (byte) 1);
			}
			@Pc(52) Class1_Sub3_Sub1 local52;
			if (local11.length == 1) {
				local52 = local11[0];
			} else {
				local52 = new Class1_Sub3_Sub1(-406, local11, local11.length);
			}
			if (this.anIntArray11 != null) {
				for (@Pc(67) int local67 = 0; local67 < this.anIntArray11.length; local67++) {
					local52.method237(this.anIntArray11[local67], this.anIntArray12[local67]);
				}
			}
			return local52;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("9085, " + -284 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}
}
