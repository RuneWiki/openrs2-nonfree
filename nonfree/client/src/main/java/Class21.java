import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt573;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt571 = 3;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt572 = 999;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!s;")
	public static Class35 aClass35_8 = new Class35(30, (byte) 4);

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt574;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt575;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!jc;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	private int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt576 = 128;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt577 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method399(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(0, arg0.method528("spotanim.dat", null));
			anInt573 = local9.method385();
			if (anInt571 > 3 || anInt571 < 3) {
				anInt572 = -424;
			}
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt573];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt573; local27++) {
				if (aClass21Array1[local27] == null) {
					aClass21Array1[local27] = new Class21();
				}
				aClass21Array1[local27].anInt574 = local27;
				aClass21Array1[local27].method400(local9);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("25482, " + arg0 + ", " + 3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method400(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method383();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt575 = arg0.method385();
				} else if (local13 == 2) {
					this.aClass19_1 = Class19.aClass19Array1[arg0.method385()];
				} else if (local13 == 3) {
					this.aBoolean133 = true;
				} else if (local13 == 4) {
					this.anInt576 = arg0.method385();
				} else if (local13 == 5) {
					this.anInt577 = arg0.method385();
				} else if (local13 == 6) {
					this.anInt578 = arg0.method385();
				} else if (local13 == 7) {
					this.anInt579 = arg0.method383();
				} else if (local13 == 8) {
					this.anInt580 = arg0.method383();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray192[local13 - 40] = arg0.method385();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray193[local13 - 50] = arg0.method385();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("32499, " + arg0 + ", " + 0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method401() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass35_8.method519((long) this.anInt574);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(0, this.anInt575);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method236(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method520((long) this.anInt574, local6);
		return local6;
	}
}
