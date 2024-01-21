import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xb")
public final class Class38 {

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "I")
	private static int anInt685;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "[I")
	private static int[] anIntArray202;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "Lclient!jb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_19;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "[Lclient!xb;")
	private static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	private static int anInt686;

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private static int anInt684 = -612;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "B")
	private static byte aByte33 = 2;

	@OriginalMember(owner = "client!xb", name = "E", descriptor = "Lclient!r;")
	public static Class30 aClass30_6 = new Class30(-947, 30);

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "Ljava/lang/String;")
	public String aString25;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "[I")
	private int[] anIntArray203;

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "[I")
	private int[] anIntArray204;

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray8;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "J")
	private long aLong20 = -1L;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "B")
	public byte aByte34 = 1;

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "I")
	public int anInt688 = -1;

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "I")
	public int anInt689 = -1;

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "I")
	public int anInt690 = -1;

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "I")
	public int anInt691 = -1;

	@OriginalMember(owner = "client!xb", name = "t", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "I")
	private int anInt692 = -1;

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "I")
	private int anInt693 = -1;

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "I")
	private int anInt694 = -1;

	@OriginalMember(owner = "client!xb", name = "A", descriptor = "Z")
	public boolean aBoolean127 = true;

	@OriginalMember(owner = "client!xb", name = "B", descriptor = "I")
	public int anInt695 = -1;

	@OriginalMember(owner = "client!xb", name = "C", descriptor = "I")
	private int anInt696 = 128;

	@OriginalMember(owner = "client!xb", name = "D", descriptor = "I")
	private int anInt697 = 128;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!tb;)V")
	public static void method455(@OriginalArg(0) Class34 arg0) {
		aClass1_Sub3_Sub3_19 = new Class1_Sub3_Sub3(arg0.method428(null, "npc.dat"), (byte) 63);
		@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(arg0.method428(null, "npc.idx"), (byte) 63);
		anInt685 = local21.method333();
		anIntArray202 = new int[anInt685];
		@Pc(29) int local29 = 2;
		for (@Pc(31) int local31 = 0; local31 < anInt685; local31++) {
			anIntArray202[local31] = local29;
			local29 += local21.method333();
		}
		aClass38Array1 = new Class38[20];
		for (@Pc(51) int local51 = 0; local51 < 20; local51++) {
			aClass38Array1[local51] = new Class38();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(I)V")
	public static void method456() {
		aClass30_6 = null;
		anIntArray202 = null;
		aClass38Array1 = null;
		aClass1_Sub3_Sub3_19 = null;
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "(I)Lclient!xb;")
	public static Class38 method457(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < 20; local1++) {
			if (aClass38Array1[local1].aLong20 == (long) arg0) {
				return aClass38Array1[local1];
			}
		}
		anInt686 = (anInt686 + 1) % 20;
		@Pc(33) Class38 local33 = aClass38Array1[anInt686] = new Class38();
		aClass1_Sub3_Sub3_19.anInt394 = anIntArray202[arg0];
		local33.aLong20 = arg0;
		local33.method458(aClass1_Sub3_Sub3_19);
		return local33;
	}

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(BLclient!jb;)V")
	private void method458(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method331();
			if (local15 == 0) {
				return;
			}
			@Pc(24) int local24;
			@Pc(30) int local30;
			if (local15 == 1) {
				local24 = arg0.method331();
				this.anIntArray203 = new int[local24];
				for (local30 = 0; local30 < local24; local30++) {
					this.anIntArray203[local30] = arg0.method333();
				}
			} else if (local15 == 2) {
				this.aString25 = arg0.method338();
			} else if (local15 == 3) {
				this.aByteArray13 = arg0.method339();
			} else if (local15 == 12) {
				this.aByte34 = arg0.method332();
			} else if (local15 == 13) {
				this.anInt687 = arg0.method333();
			} else if (local15 == 14) {
				this.anInt688 = arg0.method333();
			} else if (local15 == 16) {
				this.aBoolean126 = true;
			} else if (local15 == 17) {
				this.anInt688 = arg0.method333();
				this.anInt689 = arg0.method333();
				this.anInt690 = arg0.method333();
				this.anInt691 = arg0.method333();
			} else if (local15 >= 30 && local15 < 40) {
				if (this.aStringArray8 == null) {
					this.aStringArray8 = new String[5];
				}
				this.aStringArray8[local15 - 30] = arg0.method338();
			} else if (local15 == 40) {
				local24 = arg0.method331();
				this.anIntArray205 = new int[local24];
				this.anIntArray206 = new int[local24];
				for (local30 = 0; local30 < local24; local30++) {
					this.anIntArray205[local30] = arg0.method333();
					this.anIntArray206[local30] = arg0.method333();
				}
			} else if (local15 == 60) {
				local24 = arg0.method331();
				this.anIntArray204 = new int[local24];
				for (local30 = 0; local30 < local24; local30++) {
					this.anIntArray204[local30] = arg0.method333();
				}
			} else if (local15 == 90) {
				this.anInt692 = arg0.method333();
			} else if (local15 == 91) {
				this.anInt693 = arg0.method333();
			} else if (local15 == 92) {
				this.anInt694 = arg0.method333();
			} else if (local15 == 93) {
				this.aBoolean127 = false;
			} else if (local15 == 95) {
				this.anInt695 = arg0.method333();
			} else if (local15 == 97) {
				this.anInt696 = arg0.method333();
			} else if (local15 == 98) {
				this.anInt697 = arg0.method333();
			}
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(II[I)Lclient!db;")
	public Class1_Sub3_Sub1 method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(9) Class1_Sub3_Sub1 local9 = (Class1_Sub3_Sub1) aClass30_6.method419(this.aLong20);
		if (local9 == null) {
			@Pc(16) Class1_Sub3_Sub1[] local16 = new Class1_Sub3_Sub1[this.anIntArray203.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray203.length; local18++) {
				local16[local18] = new Class1_Sub3_Sub1(this.anIntArray203[local18], aBoolean125);
			}
			if (local16.length == 1) {
				local9 = local16[0];
			} else {
				local9 = new Class1_Sub3_Sub1(local16.length, false, local16);
			}
			if (this.anIntArray205 != null) {
				for (@Pc(60) int local60 = 0; local60 < this.anIntArray205.length; local60++) {
					local9.method166(this.anIntArray205[local60], this.anIntArray206[local60]);
				}
			}
			local9.method159();
			local9.method169(64, 850, -30, -50, -30, true);
			aClass30_6.method420(local9, this.aLong20, aByte33);
		}
		@Pc(107) Class1_Sub3_Sub1 local107 = new Class1_Sub3_Sub1(!this.aBoolean126, false, local9);
		if (arg0 != -1 && arg1 != -1) {
			local107.method161(arg0, arg1, arg2, anInt684);
		} else if (arg0 != -1) {
			local107.method160(arg0);
		}
		if (this.anInt696 != 128 || this.anInt697 != 128) {
			local107.method168(this.anInt697, this.anInt696, this.anInt696);
		}
		local107.method157();
		local107.anIntArrayArray8 = null;
		local107.anIntArrayArray7 = null;
		return local107;
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "(I)Lclient!db;")
	public Class1_Sub3_Sub1 method460() {
		if (this.anIntArray204 == null) {
			return null;
		}
		@Pc(22) Class1_Sub3_Sub1[] local22 = new Class1_Sub3_Sub1[this.anIntArray204.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray204.length; local24++) {
			local22[local24] = new Class1_Sub3_Sub1(this.anIntArray204[local24], aBoolean125);
		}
		@Pc(51) Class1_Sub3_Sub1 local51;
		if (local22.length == 1) {
			local51 = local22[0];
		} else {
			local51 = new Class1_Sub3_Sub1(local22.length, false, local22);
		}
		if (this.anIntArray205 != null) {
			for (@Pc(66) int local66 = 0; local66 < this.anIntArray205.length; local66++) {
				local51.method166(this.anIntArray205[local66], this.anIntArray206[local66]);
			}
		}
		return local51;
	}
}
