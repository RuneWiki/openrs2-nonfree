import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hc")
public final class Class15 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	private static int anInt367;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "[Lclient!hc;")
	public static Class15[] aClass15Array1;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!s;")
	public static Class32 aClass32_3 = new Class32(-24094, 30);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
	private int anInt368;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!gc;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Z")
	public boolean aBoolean102 = false;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	private int[] anIntArray136 = new int[6];

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
	private int[] anIntArray137 = new int[6];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method290(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "spotanim.dat"), 4);
			anInt367 = local11.method382();
			if (aClass15Array1 == null) {
				aClass15Array1 = new Class15[anInt367];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt367; local21++) {
				if (aClass15Array1[local21] == null) {
					aClass15Array1[local21] = new Class15();
				}
				aClass15Array1[local21].anInt368 = local21;
				aClass15Array1[local21].method291(213, local11);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("73192, " + true + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	private Class15() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!kb;)V")
	private void method291(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method380();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt369 = arg1.method382();
					} else if (local8 == 2) {
						this.aClass13_1 = Class13.aClass13Array1[arg1.method382()];
					} else if (local8 == 3) {
						this.aBoolean102 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray136[local8 - 40] = arg1.method382();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray137[local8 - 50] = arg1.method382();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local8);
					}
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("48671, " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method292() {
		@Pc(6) Class1_Sub3_Sub1 local6 = (Class1_Sub3_Sub1) aClass32_3.method470((long) this.anInt368);
		if (local6 != null) {
			return local6;
		}
		local6 = new Class1_Sub3_Sub1(this.anInt369, 298);
		for (@Pc(19) int local19 = 0; local19 < 6; local19++) {
			if (this.anIntArray136[0] != 0) {
				local6.method213(this.anIntArray136[local19], this.anIntArray137[local19]);
			}
		}
		aClass32_3.method471((long) this.anInt368, 7, local6);
		return local6;
	}
}
