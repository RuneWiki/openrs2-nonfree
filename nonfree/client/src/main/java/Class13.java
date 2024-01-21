import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	public static int anInt415;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "B")
	private static byte aByte17 = 6;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "Z")
	private static boolean aBoolean111 = true;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Z")
	private static boolean aBoolean112 = true;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	private int anInt414 = 638;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "I")
	public int anInt416 = -1;

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "[I")
	private int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method291(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method516("idk.dat", null), aBoolean112);
			anInt415 = local9.method374();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt415];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt415; local27++) {
				if (aClass13Array1[local27] == null) {
					aClass13Array1[local27] = new Class13();
				}
				aClass13Array1[local27].method292(aByte17, local9);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("63569, " + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method292(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method372();
					if (local11 == 0) {
						return;
					}
					if (local11 == 1) {
						this.anInt416 = arg1.method372();
					} else if (local11 == 2) {
						@Pc(29) int local29 = arg1.method372();
						this.anIntArray143 = new int[local29];
						for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
							this.anIntArray143[local35] = arg1.method374();
						}
					} else if (local11 >= 40 && local11 < 50) {
						this.anIntArray144[local11 - 40] = arg1.method374();
					} else if (local11 >= 50 && local11 < 60) {
						this.anIntArray145[local11 - 50] = arg1.method374();
					} else if (local11 >= 60 && local11 < 70) {
						this.anIntArray146[local11 - 60] = arg1.method374();
					} else {
						System.out.println("Error unrecognised config code: " + local11);
					}
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("39706, " + arg0 + ", " + arg1 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method293() {
		if (this.anIntArray143 == null) {
			return null;
		}
		@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray143.length];
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray143.length; local13++) {
			local11[local13] = new Class1_Sub3_Sub1(this.anIntArray143[local13], true);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(16925, local11.length, local11);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray144[local52] != 0; local52++) {
			local40.method225(this.anIntArray144[local52], this.anIntArray145[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub3_Sub1 method294() {
		try {
			@Pc(10) Class1_Sub3_Sub1[] local10 = new Class1_Sub3_Sub1[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray146[local14] != -1) {
					local10[local12++] = new Class1_Sub3_Sub1(this.anIntArray146[local14], true);
				}
			}
			@Pc(45) Class1_Sub3_Sub1 local45 = new Class1_Sub3_Sub1(16925, local12, local10);
			for (@Pc(47) int local47 = 0; local47 < 6 && this.anIntArray144[local47] != 0; local47++) {
				local45.method225(this.anIntArray144[local47], this.anIntArray145[local47]);
			}
			return local45;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("35441, " + 88 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
