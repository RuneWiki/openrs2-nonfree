import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NQIAMATB")
public final class Class20 {

	@OriginalMember(owner = "client!NQIAMATB", name = "e", descriptor = "I")
	public static int anInt440;

	@OriginalMember(owner = "client!NQIAMATB", name = "f", descriptor = "[Lclient!NQIAMATB;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!NQIAMATB", name = "d", descriptor = "I")
	private static int anInt439 = -389;

	@OriginalMember(owner = "client!NQIAMATB", name = "c", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!NQIAMATB", name = "h", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!NQIAMATB", name = "a", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!NQIAMATB", name = "b", descriptor = "B")
	private byte aByte18 = 9;

	@OriginalMember(owner = "client!NQIAMATB", name = "g", descriptor = "I")
	public int anInt441 = -1;

	@OriginalMember(owner = "client!NQIAMATB", name = "i", descriptor = "[I")
	private int[] anIntArray131 = new int[6];

	@OriginalMember(owner = "client!NQIAMATB", name = "j", descriptor = "[I")
	private int[] anIntArray132 = new int[6];

	@OriginalMember(owner = "client!NQIAMATB", name = "k", descriptor = "[I")
	private int[] anIntArray133 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!NQIAMATB", name = "l", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!NQIAMATB", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method242(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub2 local8 = new Class3_Sub1_Sub2(true, arg0.method140("idk.dat", null));
			anInt440 = local8.method202();
			if (aClass20Array1 == null) {
				aClass20Array1 = new Class20[anInt440];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt440; local23++) {
				if (aClass20Array1[local23] == null) {
					aClass20Array1[local23] = new Class20();
				}
				aClass20Array1[local23].method243(local8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("65862, " + arg0 + ", " + 3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "<init>", descriptor = "()V")
	private Class20() {
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method243(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method200();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt441 = arg0.method200();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method200();
					this.anIntArray130 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray130[local35] = arg0.method202();
					}
				} else if (local11 == 3) {
					this.aBoolean118 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray131[local11 - 40] = arg0.method202();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray132[local11 - 50] = arg0.method202();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray133[local11 - 60] = arg0.method202();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("86997, " + arg0 + ", " + 2 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "a", descriptor = "(I)Z")
	public boolean method244() {
		try {
			if (this.anIntArray130 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray130.length; local17++) {
				if (!Class3_Sub1_Sub1_Sub1.method23(this.anIntArray130[local17])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("91652, " + -908 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "b", descriptor = "(I)Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method245() {
		try {
			if (this.anIntArray130 == null) {
				return null;
			}
			@Pc(16) Class3_Sub1_Sub1_Sub1[] local16 = new Class3_Sub1_Sub1_Sub1[this.anIntArray130.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray130.length; local18++) {
				local16[local18] = Class3_Sub1_Sub1_Sub1.method22(this.anIntArray130[local18]);
			}
			@Pc(42) Class3_Sub1_Sub1_Sub1 local42;
			if (local16.length == 1) {
				local42 = local16[0];
			} else {
				local42 = new Class3_Sub1_Sub1_Sub1(local16, local16.length, 337);
			}
			for (@Pc(54) int local54 = 0; local54 < 6 && this.anIntArray131[local54] != 0; local54++) {
				local42.method36(this.anIntArray131[local54], this.anIntArray132[local54]);
			}
			return local42;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("35101, " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "c", descriptor = "(I)Z")
	public boolean method246(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
				if (this.anIntArray133[local7] != -1 && !Class3_Sub1_Sub1_Sub1.method23(this.anIntArray133[local7])) {
					local5 = false;
				}
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("8947, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQIAMATB", name = "a", descriptor = "(B)Lclient!CADBNSXE;")
	public Class3_Sub1_Sub1_Sub1 method247(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Class3_Sub1_Sub1_Sub1[] local4 = new Class3_Sub1_Sub1_Sub1[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray133[local8] != -1) {
					local4[local6++] = Class3_Sub1_Sub1_Sub1.method22(this.anIntArray133[local8]);
				}
			}
			if (this.aByte18 == 9) {
				@Pc(35) boolean local35 = false;
			} else {
				this.aBoolean117 = !this.aBoolean117;
			}
			@Pc(52) Class3_Sub1_Sub1_Sub1 local52 = new Class3_Sub1_Sub1_Sub1(local4, local6, 337);
			for (@Pc(54) int local54 = 0; local54 < 6 && this.anIntArray131[local54] != 0; local54++) {
				local52.method36(this.anIntArray131[local54], this.anIntArray132[local54]);
			}
			return local52;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("53282, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
