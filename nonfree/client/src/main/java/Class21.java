import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
	private static boolean aBoolean142;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private static int anInt554;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "B")
	private static byte aByte46 = 8;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "B")
	private static byte aByte47 = 4;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private static int anInt553 = -715;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!s;")
	public static Class35 aClass35_8 = new Class35(2, 30);

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt555;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!jc;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "[I")
	private int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt557 = 128;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt558 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method399(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method528(aByte47, "spotanim.dat", null), 0);
			anInt554 = local9.method385();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt554];
			}
			for (@Pc(31) int local31 = 0; local31 < anInt554; local31++) {
				if (aClass21Array1[local31] == null) {
					aClass21Array1[local31] = new Class21();
				}
				aClass21Array1[local31].anInt555 = local31;
				aClass21Array1[local31].method400(aByte46, local9);
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("45742, " + 4 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method400(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				anInt553 = 178;
			}
			while (true) {
				while (true) {
					@Pc(9) int local9 = arg1.method383();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt556 = arg1.method385();
					} else if (local9 == 2) {
						this.aClass19_1 = Class19.aClass19Array1[arg1.method385()];
					} else if (local9 == 3) {
						this.aBoolean143 = true;
					} else if (local9 == 4) {
						this.anInt557 = arg1.method385();
					} else if (local9 == 5) {
						this.anInt558 = arg1.method385();
					} else if (local9 == 6) {
						this.anInt559 = arg1.method385();
					} else if (local9 == 7) {
						this.anInt560 = arg1.method383();
					} else if (local9 == 8) {
						this.anInt561 = arg1.method383();
					} else if (local9 >= 40 && local9 < 50) {
						this.anIntArray192[local9 - 40] = arg1.method385();
					} else if (local9 >= 50 && local9 < 60) {
						this.anIntArray193[local9 - 50] = arg1.method385();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local9);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("78812, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method401() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass35_8.method519((long) this.anInt555);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt556, 6);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method236(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method520(local6, (long) this.anInt555);
		return local6;
	}
}
