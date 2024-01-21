import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class40 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "I")
	private static int anInt728;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "[I")
	private static int[] anIntArray208;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_21;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[Lclient!yb;")
	private static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "I")
	private static int anInt729;

	@OriginalMember(owner = "client!yb", name = "B", descriptor = "Lclient!s;")
	public static Class32 aClass32_6 = new Class32(-24094, 30);

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!yb", name = "r", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!yb", name = "s", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!yb", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "J")
	private long aLong22 = -1L;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "B")
	public byte aByte28 = 1;

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "I")
	public int anInt730 = -1;

	@OriginalMember(owner = "client!yb", name = "m", descriptor = "I")
	public int anInt731 = -1;

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!yb", name = "o", descriptor = "I")
	public int anInt733 = -1;

	@OriginalMember(owner = "client!yb", name = "p", descriptor = "I")
	public int anInt734 = -1;

	@OriginalMember(owner = "client!yb", name = "q", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!yb", name = "u", descriptor = "I")
	private int anInt735 = -1;

	@OriginalMember(owner = "client!yb", name = "v", descriptor = "I")
	private int anInt736 = -1;

	@OriginalMember(owner = "client!yb", name = "w", descriptor = "I")
	private int anInt737 = -1;

	@OriginalMember(owner = "client!yb", name = "x", descriptor = "Z")
	public boolean aBoolean158 = true;

	@OriginalMember(owner = "client!yb", name = "y", descriptor = "I")
	public int anInt738 = -1;

	@OriginalMember(owner = "client!yb", name = "z", descriptor = "I")
	private int anInt739 = 128;

	@OriginalMember(owner = "client!yb", name = "A", descriptor = "I")
	private int anInt740 = 128;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!ub;)V")
	public static void method506(@OriginalArg(0) Class36 arg0) {
		aClass1_Sub3_Sub3_21 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "npc.dat"), 4);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "npc.idx"), 4);
		anInt728 = local21.method382();
		anIntArray208 = new int[anInt728];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt728; local31++) {
			anIntArray208[local31] = local29;
			local29 += local21.method382();
		}
		aClass40Array1 = new Class40[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass40Array1[local51] = new Class40();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)V")
	public static void method507() {
		try {
			aClass32_6 = null;
			anIntArray208 = null;
			aClass40Array1 = null;
			aClass1_Sub3_Sub3_21 = null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("26226, " + 300 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(I)Lclient!yb;")
	public static Class40 method508(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass40Array1[local1].aLong22 == (long) arg0) {
				return aClass40Array1[local1];
			}
		}
		anInt729 = (anInt729 + 1) % 20;
		@Pc(33) Class40 local33 = aClass40Array1[anInt729] = new Class40();
		aClass1_Sub3_Sub3_21.anInt433 = anIntArray208[arg0];
		local33.aLong22 = arg0;
		local33.method509(aClass1_Sub3_Sub3_21);
		return local33;
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILclient!kb;)V")
	private void method509(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method380();
				if (local13 == 0) {
					return;
				}
				@Pc(22) int local22;
				@Pc(28) int local28;
				if (local13 == 1) {
					local22 = arg0.method380();
					this.anIntArray209 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray209[local28] = arg0.method382();
					}
				} else if (local13 == 2) {
					this.aString25 = arg0.method387();
				} else if (local13 == 3) {
					this.aByteArray13 = arg0.method388();
				} else if (local13 == 12) {
					this.aByte28 = arg0.method381();
				} else if (local13 == 13) {
					this.anInt730 = arg0.method382();
				} else if (local13 == 14) {
					this.anInt731 = arg0.method382();
				} else if (local13 == 16) {
					this.aBoolean157 = true;
				} else if (local13 == 17) {
					this.anInt731 = arg0.method382();
					this.anInt732 = arg0.method382();
					this.anInt733 = arg0.method382();
					this.anInt734 = arg0.method382();
				} else if (local13 >= 30 && local13 < 40) {
					if (this.aStringArray8 == null) {
						this.aStringArray8 = new String[5];
					}
					this.aStringArray8[local13 - 30] = arg0.method387();
				} else if (local13 == 40) {
					local22 = arg0.method380();
					this.anIntArray211 = new int[local22];
					this.anIntArray212 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray211[local28] = arg0.method382();
						this.anIntArray212[local28] = arg0.method382();
					}
				} else if (local13 == 60) {
					local22 = arg0.method380();
					this.anIntArray210 = new int[local22];
					for (local28 = 0; local28 < local22; local28++) {
						this.anIntArray210[local28] = arg0.method382();
					}
				} else if (local13 == 90) {
					this.anInt735 = arg0.method382();
				} else if (local13 == 91) {
					this.anInt736 = arg0.method382();
				} else if (local13 == 92) {
					this.anInt737 = arg0.method382();
				} else if (local13 == 93) {
					this.aBoolean158 = false;
				} else if (local13 == 95) {
					this.anInt738 = arg0.method382();
				} else if (local13 == 97) {
					this.anInt739 = arg0.method382();
				} else if (local13 == 98) {
					this.anInt740 = arg0.method382();
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("82580, " + 213 + ", " + arg0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II[I)Lclient!eb;")
	public Class1_Sub3_Sub1 method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass32_6.method470(this.aLong22);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray209.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray209.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(this.anIntArray209[local18], 298);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(false, local16.length, local16);
			}
			if (this.anIntArray211 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray211.length; local60++) {
					local9.method213(this.anIntArray211[local60], this.anIntArray212[local60]);
				}
			}
			local9.method206();
			local9.method216(64, 850, -30, -50, -30, true);
			aClass32_6.method471(this.aLong22, 7, local9);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(false, !this.aBoolean157, local9);
		if (arg0 != -1 && arg1 != -1) {
			local107.method208(arg0, arg2, arg1);
		} else if (arg0 != -1) {
			local107.method207(arg0);
		}
		if (this.anInt739 != 128 || this.anInt740 != 128) {
			local107.method215(this.anInt739, this.anInt740, this.anInt739);
		}
		local107.method204();
		local107.anIntArrayArray8 = null;
		local107.anIntArrayArray7 = null;
		if (this.aByte28 == 1) {
			local107.aBoolean69 = true;
		}
		return local107;
	}

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method511() {
		try {
			if (this.anIntArray210 == null) {
				return null;
			}
			@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray210.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray210.length; local19++) {
				local11[local19] = new Class1_Sub3_Sub1(this.anIntArray210[local19], 298);
			}
			@Pc(46) Class1_Sub3_Sub1 local46;
			if (local11.length == 1) {
				local46 = local11[0];
			} else {
				local46 = new Class1_Sub3_Sub1(false, local11.length, local11);
			}
			if (this.anIntArray211 != null) {
				for (@Pc(61) int local61 = 0; local61 < this.anIntArray211.length; local61++) {
					local46.method213(this.anIntArray211[local61], this.anIntArray212[local61]);
				}
			}
			return local46;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("59189, " + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
