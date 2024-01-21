import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private static int anInt559;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt560;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!s;")
	public static Class35 aClass35_8 = new Class35(-24, 30);

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!jc;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt563 = -1;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean132 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	private int[] anIntArray193 = new int[6];

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt564 = 128;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt565 = 128;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method407(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "spotanim.dat"));
			anInt560 = local11.method393();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt560];
			}
			for (@Pc(31) int local31 = 0; local31 < anInt560; local31++) {
				if (aClass21Array1[local31] == null) {
					aClass21Array1[local31] = new Class21();
				}
				aClass21Array1[local31].anInt561 = local31;
				aClass21Array1[local31].method408(local11);
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("46593, " + -5880 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method408(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method391();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt562 = arg0.method393();
				} else if (local8 == 2) {
					this.anInt563 = arg0.method393();
					if (Class19.aClass19Array1 != null) {
						this.aClass19_1 = Class19.aClass19Array1[this.anInt563];
					}
				} else if (local8 == 3) {
					this.aBoolean132 = true;
				} else if (local8 == 4) {
					this.anInt564 = arg0.method393();
				} else if (local8 == 5) {
					this.anInt565 = arg0.method393();
				} else if (local8 == 6) {
					this.anInt566 = arg0.method393();
				} else if (local8 == 7) {
					this.anInt567 = arg0.method391();
				} else if (local8 == 8) {
					this.anInt568 = arg0.method391();
				} else if (local8 >= 40 && local8 < 50) {
					this.anIntArray192[local8 - 40] = arg0.method393();
				} else if (local8 >= 50 && local8 < 60) {
					this.anIntArray193[local8 - 50] = arg0.method393();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local8);
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("46462, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method409() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass35_8.method527((long) this.anInt561);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt562, (byte) 1);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray192[0] != 0) {
				local6.method237(this.anIntArray192[local19], this.anIntArray193[local19]);
			}
		}
		aClass35_8.method528(local6, (long) this.anInt561);
		return local6;
	}
}
