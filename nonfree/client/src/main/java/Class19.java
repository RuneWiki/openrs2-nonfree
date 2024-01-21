import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	private static int anInt537;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
	private static int anInt536 = -23163;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt538;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public int anInt539 = -1;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public int anInt540 = 5;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt541 = -1;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt542 = -1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt543 = 99;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method374(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(13) Class1_Sub3_Sub3 local13 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "seq.dat"));
			anInt537 = local13.method393();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt537];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt537; local23++) {
				if (aClass19Array1[local23] == null) {
					aClass19Array1[local23] = new Class19();
				}
				aClass19Array1[local23].method375(local13);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("65483, " + -5880 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method375(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method391();
				if (local8 == 0) {
					if (this.anInt538 == 0) {
						this.anInt538 = 1;
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
				@Pc(35) int local35;
				if (local8 == 1) {
					this.anInt538 = arg0.method391();
					this.anIntArray186 = new int[this.anInt538];
					this.anIntArray187 = new int[this.anInt538];
					this.anIntArray188 = new int[this.anInt538];
					for (local35 = 0; local35 < this.anInt538; local35++) {
						this.anIntArray186[local35] = arg0.method393();
						this.anIntArray187[local35] = arg0.method393();
						if (this.anIntArray187[local35] == 65535) {
							this.anIntArray187[local35] = -1;
						}
						this.anIntArray188[local35] = arg0.method393();
						if (this.anIntArray188[local35] == 0) {
							this.anIntArray188[local35] = Class12.aClass12Array1[this.anIntArray186[local35]].anInt407;
						}
						if (this.anIntArray188[local35] == 0) {
							this.anIntArray188[local35] = 1;
						}
					}
				} else if (local8 == 2) {
					this.anInt539 = arg0.method393();
				} else if (local8 == 3) {
					local35 = arg0.method391();
					this.anIntArray189 = new int[local35 + 1];
					for (@Pc(122) int local122 = 0; local122 < local35; local122++) {
						this.anIntArray189[local122] = arg0.method391();
					}
					this.anIntArray189[local35] = 9999999;
				} else if (local8 == 4) {
					this.aBoolean127 = true;
				} else if (local8 == 5) {
					this.anInt540 = arg0.method391();
				} else if (local8 == 6) {
					this.anInt541 = arg0.method393();
				} else if (local8 == 7) {
					this.anInt542 = arg0.method393();
				} else if (local8 == 8) {
					this.anInt543 = arg0.method391();
				} else {
					System.out.println("Error unrecognised seq config code: " + local8);
				}
			}
		} catch (@Pc(231) RuntimeException local231) {
			signlink.reporterror("51488, " + arg0 + ", " + true + ", " + local231.toString());
			throw new RuntimeException();
		}
	}
}
