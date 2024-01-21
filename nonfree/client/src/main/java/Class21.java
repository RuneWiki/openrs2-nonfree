import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	private int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	private int[] anIntArray203 = new int[6];

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray204 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!yb;B)V")
	public static void method424(@OriginalArg(0) Class45 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(699, arg0.method639("idk.dat", null));
			anInt723 = local10.method469();
			@Pc(18) boolean local18 = false;
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt723];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt723; local28++) {
				if (aClass21Array1[local28] == null) {
					aClass21Array1[local28] = new Class21();
				}
				aClass21Array1[local28].method425(local10);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("91491, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method425(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method467();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt724 = arg0.method467();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method467();
					this.anIntArray201 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray201[local38] = arg0.method469();
					}
				} else if (local14 == 3) {
					this.aBoolean146 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray202[local14 - 40] = arg0.method469();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray203[local14 - 50] = arg0.method469();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray204[local14 - 60] = arg0.method469();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("57049, " + false + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
	public boolean method426() {
		try {
			if (this.anIntArray201 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray201.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub5.method279(this.anIntArray201[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("45915, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method427() {
		try {
			if (this.anIntArray201 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray201.length];
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray201.length; local22++) {
				local11[local22] = Class1_Sub1_Sub1_Sub5.method278(this.anIntArray201[local22]);
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47;
			if (local11.length == 1) {
				local47 = local11[0];
			} else {
				local47 = new Class1_Sub1_Sub1_Sub5(local11.length, false, local11);
			}
			for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray202[local59] != 0; local59++) {
				local47.method292(this.anIntArray202[local59], this.anIntArray203[local59]);
			}
			return local47;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("77943, " + 0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Z")
	public boolean method428() {
		try {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray204[local13] != -1 && !Class1_Sub1_Sub1_Sub5.method279(this.anIntArray204[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("86953, " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method429(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray204[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method278(this.anIntArray204[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(local6, false, local4);
			@Pc(42) boolean local42 = false;
			for (@Pc(54) int local54 = 0; local54 < 6 && this.anIntArray202[local54] != 0; local54++) {
				local37.method292(this.anIntArray202[local54], this.anIntArray203[local54]);
			}
			return local37;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("60420, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
