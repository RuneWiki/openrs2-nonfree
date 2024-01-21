import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQTOFCBD")
public final class Class35 {

	@OriginalMember(owner = "client!PQTOFCBD", name = "c", descriptor = "I")
	public static int anInt528;

	@OriginalMember(owner = "client!PQTOFCBD", name = "d", descriptor = "[Lclient!PQTOFCBD;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!PQTOFCBD", name = "f", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!PQTOFCBD", name = "b", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!PQTOFCBD", name = "e", descriptor = "I")
	public int anInt529 = -1;

	@OriginalMember(owner = "client!PQTOFCBD", name = "g", descriptor = "[I")
	private int[] anIntArray128 = new int[6];

	@OriginalMember(owner = "client!PQTOFCBD", name = "h", descriptor = "[I")
	private int[] anIntArray129 = new int[6];

	@OriginalMember(owner = "client!PQTOFCBD", name = "i", descriptor = "[I")
	private int[] anIntArray130 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!PQTOFCBD", name = "j", descriptor = "Z")
	public boolean aBoolean112 = false;

	@OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method364(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(10) Class1_Sub2_Sub3 local10 = new Class1_Sub2_Sub3(arg0.method352("idk.dat", null), -670);
			anInt528 = local10.method309();
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt528];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt528; local20++) {
				if (aClass35Array1[local20] == null) {
					aClass35Array1[local20] = new Class35();
				}
				aClass35Array1[local20].method365(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("24902, " + arg0 + ", " + 24570 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method365(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method307();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt529 = arg0.method307();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method307();
					this.anIntArray127 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray127[local34] = arg0.method309();
					}
				} else if (local10 == 3) {
					this.aBoolean112 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray128[local10 - 40] = arg0.method309();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray129[local10 - 50] = arg0.method309();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray130[local10 - 60] = arg0.method309();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("48637, " + arg0 + ", " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "a", descriptor = "(I)Z")
	public boolean method366() {
		try {
			if (this.anIntArray127 == null) {
				return true;
			}
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray127.length; local13++) {
				if (!Class1_Sub2_Sub2_Sub3.method197(this.anIntArray127[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("75015, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "b", descriptor = "(I)Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method367() {
		try {
			if (this.anIntArray127 == null) {
				return null;
			}
			@Pc(21) Class1_Sub2_Sub2_Sub3[] local21 = new Class1_Sub2_Sub2_Sub3[this.anIntArray127.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray127.length; local23++) {
				local21[local23] = Class1_Sub2_Sub2_Sub3.method196(this.anIntArray127[local23]);
			}
			@Pc(47) Class1_Sub2_Sub2_Sub3 local47;
			if (local21.length == 1) {
				local47 = local21[0];
			} else {
				local47 = new Class1_Sub2_Sub2_Sub3(local21.length, 473, local21);
			}
			for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray128[local59] != 0; local59++) {
				local47.method210(this.anIntArray128[local59], this.anIntArray129[local59]);
			}
			return local47;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("90580, " + 0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "c", descriptor = "(I)Z")
	public boolean method368() {
		try {
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray130[local18] != -1 && !Class1_Sub2_Sub2_Sub3.method197(this.anIntArray130[local18])) {
					local16 = false;
				}
			}
			return local16;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("2441, " + 3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQTOFCBD", name = "d", descriptor = "(I)Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method369(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) Class1_Sub2_Sub2_Sub3[] local4 = new Class1_Sub2_Sub2_Sub3[5];
			@Pc(6) int local6 = 0;
			@Pc(10) boolean local10 = false;
			for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
				if (this.anIntArray130[local12] != -1) {
					local4[local6++] = Class1_Sub2_Sub2_Sub3.method196(this.anIntArray130[local12]);
				}
			}
			@Pc(40) Class1_Sub2_Sub2_Sub3 local40 = new Class1_Sub2_Sub2_Sub3(local6, 473, local4);
			for (@Pc(42) int local42 = 0; local42 < 6 && this.anIntArray128[local42] != 0; local42++) {
				local40.method210(this.anIntArray128[local42], this.anIntArray129[local42]);
			}
			return local40;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("19634, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
