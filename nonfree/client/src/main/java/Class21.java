import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt544;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private static int anInt545;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "B")
	private static byte aByte32 = 6;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
	private static boolean aBoolean147 = true;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!s;")
	public static Class35 aClass35_8 = new Class35(17295, 30);

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!jc;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt550;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt551;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	private int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt548 = 128;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt549 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method388(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method516("spotanim.dat", null), aBoolean147);
			anInt545 = local9.method374();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt545];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt545; local22++) {
				if (aClass21Array1[local22] == null) {
					aClass21Array1[local22] = new Class21();
				}
				aClass21Array1[local22].anInt546 = local22;
				aClass21Array1[local22].method389(aByte32, local9);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("99605, " + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method389(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 6) {
				anInt544 = -458;
			}
			while (true) {
				while (true) {
					@Pc(9) int local9 = arg1.method372();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt547 = arg1.method374();
					} else if (local9 == 2) {
						this.aClass19_1 = Class19.aClass19Array1[arg1.method374()];
					} else if (local9 == 3) {
						this.aBoolean148 = true;
					} else if (local9 == 4) {
						this.anInt548 = arg1.method374();
					} else if (local9 == 5) {
						this.anInt549 = arg1.method374();
					} else if (local9 == 6) {
						this.anInt550 = arg1.method374();
					} else if (local9 == 7) {
						this.anInt551 = arg1.method372();
					} else if (local9 == 8) {
						this.anInt552 = arg1.method372();
					} else if (local9 >= 40 && local9 < 50) {
						this.anIntArray192[local9 - 40] = arg1.method374();
					} else if (local9 >= 50 && local9 < 60) {
						this.anIntArray193[local9 - 50] = arg1.method374();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local9);
					}
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("33072, " + arg0 + ", " + arg1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method390() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass35_8.method507((long) this.anInt546);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt547, true);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method225(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method508((long) this.anInt546, local6, (byte) 3);
		return local6;
	}
}
