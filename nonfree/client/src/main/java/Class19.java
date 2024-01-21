import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jc")
public final class Class19 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	private static int anInt519;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	private static int anInt520;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[Lclient!jc;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "B")
	private static byte aByte29 = 6;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
	private static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
	public int[] anIntArray186;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
	public int[] anIntArray188;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "[I")
	public int[] anIntArray189;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public int anInt522 = -1;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
	public int anInt523 = 5;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
	public int anInt524 = -1;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public int anInt525 = -1;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public int anInt526 = 99;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method355(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method516("seq.dat", null), aBoolean140);
			anInt520 = local9.method374();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt520];
			}
			for (@Pc(19) int local19 = 0; local19 < anInt520; local19++) {
				if (aClass19Array1[local19] == null) {
					aClass19Array1[local19] = new Class19();
				}
				aClass19Array1[local19].method356(aByte29, local9);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("47899, " + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method356(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				anInt519 = -449;
			}
			while (true) {
				while (true) {
					@Pc(13) int local13 = arg1.method372();
					if (local13 == 0) {
						if (this.anInt521 == 0) {
							this.anInt521 = 1;
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
						this.anInt521 = arg1.method372();
						this.anIntArray186 = new int[this.anInt521];
						this.anIntArray187 = new int[this.anInt521];
						this.anIntArray188 = new int[this.anInt521];
						for (local40 = 0; local40 < this.anInt521; local40++) {
							this.anIntArray186[local40] = arg1.method374();
							this.anIntArray187[local40] = arg1.method374();
							if (this.anIntArray187[local40] == 65535) {
								this.anIntArray187[local40] = -1;
							}
							this.anIntArray188[local40] = arg1.method374();
							if (this.anIntArray188[local40] == 0) {
								this.anIntArray188[local40] = Class12.aClass12Array1[this.anIntArray186[local40]].anInt389;
							}
							if (this.anIntArray188[local40] == 0) {
								this.anIntArray188[local40] = 1;
							}
						}
					} else if (local13 == 2) {
						this.anInt522 = arg1.method374();
					} else if (local13 == 3) {
						local40 = arg1.method372();
						this.anIntArray189 = new int[local40 + 1];
						for (@Pc(127) int local127 = 0; local127 < local40; local127++) {
							this.anIntArray189[local127] = arg1.method372();
						}
						this.anIntArray189[local40] = 9999999;
					} else if (local13 == 4) {
						this.aBoolean141 = true;
					} else if (local13 == 5) {
						this.anInt523 = arg1.method372();
					} else if (local13 == 6) {
						this.anInt524 = arg1.method374();
					} else if (local13 == 7) {
						this.anInt525 = arg1.method374();
					} else if (local13 == 8) {
						this.anInt526 = arg1.method372();
					} else {
						System.out.println("Error unrecognised seq config code: " + local13);
					}
				}
			}
		} catch (@Pc(236) RuntimeException local236) {
			signlink.reporterror("10542, " + arg0 + ", " + arg1 + ", " + local236.toString());
			throw new RuntimeException();
		}
	}
}
