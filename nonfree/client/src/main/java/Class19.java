import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private static int anInt529;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "B")
	private static byte aByte43 = 8;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "B")
	private static byte aByte44 = 4;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public int anInt530;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public int anInt531 = -1;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt532 = 5;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt533 = -1;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt534 = -1;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public int anInt535 = 99;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method366(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(11) Class1_Sub3_Sub3 local11 = new Class1_Sub3_Sub3(arg0.method528(aByte44, "seq.dat", null), 0);
			anInt529 = local11.method385();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt529];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt529; local21++) {
				if (aClass19Array1[local21] == null) {
					aClass19Array1[local21] = new Class19();
				}
				aClass19Array1[local21].method367(aByte43, local11);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("63359, " + 4 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method367(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(6) int local6;
			if (arg0 != 8) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			while (true) {
				while (true) {
					local6 = arg1.method383();
					if (local6 == 0) {
						if (this.anInt530 == 0) {
							this.anInt530 = 1;
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
					@Pc(41) int local41;
					if (local6 == 1) {
						this.anInt530 = arg1.method383();
						this.anIntArray186 = new int[this.anInt530];
						this.anIntArray187 = new int[this.anInt530];
						this.anIntArray188 = new int[this.anInt530];
						for (local41 = 0; local41 < this.anInt530; local41++) {
							this.anIntArray186[local41] = arg1.method385();
							this.anIntArray187[local41] = arg1.method385();
							if (this.anIntArray187[local41] == 65535) {
								this.anIntArray187[local41] = -1;
							}
							this.anIntArray188[local41] = arg1.method385();
							if (this.anIntArray188[local41] == 0) {
								this.anIntArray188[local41] = Class12.aClass12Array1[this.anIntArray186[local41]].anInt404;
							}
							if (this.anIntArray188[local41] == 0) {
								this.anIntArray188[local41] = 1;
							}
						}
					} else if (local6 == 2) {
						this.anInt531 = arg1.method385();
					} else if (local6 == 3) {
						local41 = arg1.method383();
						this.anIntArray189 = new int[local41 + 1];
						for (@Pc(128) int local128 = 0; local128 < local41; local128++) {
							this.anIntArray189[local128] = arg1.method383();
						}
						this.anIntArray189[local41] = 9999999;
					} else if (local6 == 4) {
						this.aBoolean133 = true;
					} else if (local6 == 5) {
						this.anInt532 = arg1.method383();
					} else if (local6 == 6) {
						this.anInt533 = arg1.method385();
					} else if (local6 == 7) {
						this.anInt534 = arg1.method385();
					} else if (local6 == 8) {
						this.anInt535 = arg1.method383();
					} else {
						System.out.println("Error unrecognised seq config code: " + local6);
					}
				}
			}
		} catch (@Pc(237) RuntimeException local237) {
			signlink.reporterror("12158, " + arg0 + ", " + arg1 + ", " + local237.toString());
			throw new RuntimeException();
		}
	}
}
