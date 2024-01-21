import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt567;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt566 = 473;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!s;")
	public static Class35 aClass35_8 = new Class35((byte) 0, 30);

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private int anInt568;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!jc;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt573;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt574;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt570 = -1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	private int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt571 = 128;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt572 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method407(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(13) Class1_Sub3_Sub3 local13 = new Class1_Sub3_Sub3(363, arg0.method536("spotanim.dat", null));
			anInt567 = local13.method393();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt567];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt567; local23++) {
				if (aClass21Array1[local23] == null) {
					aClass21Array1[local23] = new Class21();
				}
				aClass21Array1[local23].anInt568 = local23;
				aClass21Array1[local23].method408(local13);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("26561, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method408(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method391();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt569 = arg0.method393();
				} else if (local13 == 2) {
					this.anInt570 = arg0.method393();
					if (Class19.aClass19Array1 != null) {
						this.aClass19_1 = Class19.aClass19Array1[this.anInt570];
					}
				} else if (local13 == 3) {
					this.aBoolean131 = true;
				} else if (local13 == 4) {
					this.anInt571 = arg0.method393();
				} else if (local13 == 5) {
					this.anInt572 = arg0.method393();
				} else if (local13 == 6) {
					this.anInt573 = arg0.method393();
				} else if (local13 == 7) {
					this.anInt574 = arg0.method391();
				} else if (local13 == 8) {
					this.anInt575 = arg0.method391();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray192[local13 - 40] = arg0.method393();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray193[local13 - 50] = arg0.method393();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("42060, " + false + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method409() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass35_8.method527((long) this.anInt568);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(false, this.anInt569);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method237(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method528((long) this.anInt568, local6);
		return local6;
	}
}
