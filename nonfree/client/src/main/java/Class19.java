import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private static int anInt542;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Z")
	private static boolean aBoolean125 = true;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private static int anInt541 = 473;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public int anInt544 = -1;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt545 = 5;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt546 = -1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt547 = -1;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public int anInt548 = 99;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method374(@OriginalArg(0) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(363, arg0.method536("seq.dat", null));
			anInt542 = local9.method393();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt542];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt542; local27++) {
				if (aClass19Array1[local27] == null) {
					aClass19Array1[local27] = new Class19();
				}
				aClass19Array1[local27].method375(local9);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("35892, " + arg0 + ", " + 473 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method375(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method391();
				if (local13 == 0) {
					if (this.anInt543 == 0) {
						this.anInt543 = 1;
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
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt543 = arg0.method391();
					this.anIntArray186 = new int[this.anInt543];
					this.anIntArray187 = new int[this.anInt543];
					this.anIntArray188 = new int[this.anInt543];
					for (local40 = 0; local40 < this.anInt543; local40++) {
						this.anIntArray186[local40] = arg0.method393();
						this.anIntArray187[local40] = arg0.method393();
						if (this.anIntArray187[local40] == 65535) {
							this.anIntArray187[local40] = -1;
						}
						this.anIntArray188[local40] = arg0.method393();
						if (this.anIntArray188[local40] == 0) {
							this.anIntArray188[local40] = Class12.aClass12Array1[this.anIntArray186[local40]].anInt411;
						}
						if (this.anIntArray188[local40] == 0) {
							this.anIntArray188[local40] = 1;
						}
					}
				} else if (local13 == 2) {
					this.anInt544 = arg0.method393();
				} else if (local13 == 3) {
					local40 = arg0.method391();
					this.anIntArray189 = new int[local40 + 1];
					for (@Pc(127) int local127 = 0; local127 < local40; local127++) {
						this.anIntArray189[local127] = arg0.method391();
					}
					this.anIntArray189[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean126 = true;
				} else if (local13 == 5) {
					this.anInt545 = arg0.method391();
				} else if (local13 == 6) {
					this.anInt546 = arg0.method393();
				} else if (local13 == 7) {
					this.anInt547 = arg0.method393();
				} else if (local13 == 8) {
					this.anInt548 = arg0.method391();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("38080, " + false + ", " + arg0 + ", " + local236.toString());
			throw new RuntimeException();
		}
	}
}
