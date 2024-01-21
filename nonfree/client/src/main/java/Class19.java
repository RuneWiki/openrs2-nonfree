import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private static int anInt545;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private static int anInt544 = 3;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt546;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt548 = 5;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt549 = -1;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt550 = -1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt551 = 99;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method366(@OriginalArg(0) Class39 arg0) {
		try {
			if (anInt544 > 3 || anInt544 < 3) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			@Pc(24) Class1_Sub3_Sub3 local24 = new Class1_Sub3_Sub3(0, arg0.method528("seq.dat", null));
			anInt545 = local24.method385();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt545];
			}
			for (@Pc(34) int local34 = 0; local34 < anInt545; local34++) {
				if (aClass19Array1[local34] == null) {
					aClass19Array1[local34] = new Class19();
				}
				aClass19Array1[local34].method367(local24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("51094, " + arg0 + ", " + 3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method367(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method383();
				if (local10 == 0) {
					if (this.anInt546 == 0) {
						this.anInt546 = 1;
						this.anIntArray186 = new int[1];
						this.anIntArray186[0] = -1;
						this.anIntArray187 = new int[1];
						this.anIntArray187[0] = -1;
						this.anIntArray188 = new int[1];
						this.anIntArray188[0] = -1;
						return;
					}
					return;
				}
				@Pc(37) int local37;
				if (local10 == 1) {
					this.anInt546 = arg0.method383();
					this.anIntArray186 = new int[this.anInt546];
					this.anIntArray187 = new int[this.anInt546];
					this.anIntArray188 = new int[this.anInt546];
					for (local37 = 0; local37 < this.anInt546; local37++) {
						this.anIntArray186[local37] = arg0.method385();
						this.anIntArray187[local37] = arg0.method385();
						if (this.anIntArray187[local37] == 65535) {
							this.anIntArray187[local37] = -1;
						}
						this.anIntArray188[local37] = arg0.method385();
						if (this.anIntArray188[local37] == 0) {
							this.anIntArray188[local37] = Class12.aClass12Array1[this.anIntArray186[local37]].anInt410;
						}
						if (this.anIntArray188[local37] == 0) {
							this.anIntArray188[local37] = 1;
						}
					}
				} else if (local10 == 2) {
					this.anInt547 = arg0.method385();
				} else if (local10 == 3) {
					local37 = arg0.method383();
					this.anIntArray189 = new int[local37 + 1];
					for (@Pc(124) int local124 = 0; local124 < local37; local124++) {
						this.anIntArray189[local124] = arg0.method383();
					}
					this.anIntArray189[local37] = 9999999;
				} else if (local10 == 4) {
					this.aBoolean127 = true;
				} else if (local10 == 5) {
					this.anInt548 = arg0.method383();
				} else if (local10 == 6) {
					this.anInt549 = arg0.method385();
				} else if (local10 == 7) {
					this.anInt550 = arg0.method385();
				} else if (local10 == 8) {
					this.anInt551 = arg0.method383();
				} else {
					System.out.println("Error unrecognised seq config code: " + local10);
				}
			}
		} catch (@Pc(233) RuntimeException local233) {
			signlink.reporterror("13007, " + arg0 + ", " + 0 + ", " + local233.toString());
			throw new RuntimeException();
		}
	}
}
