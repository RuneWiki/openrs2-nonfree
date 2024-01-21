import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt770 = 9;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt772 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean175 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method477(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(45427, arg0.method678("idk.dat", null));
			anInt771 = local8.method500();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt771];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt771; local21++) {
				if (aClass23Array1[local21] == null) {
					aClass23Array1[local21] = new Class23();
				}
				aClass23Array1[local21].method478(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("18708, " + arg0 + ", " + 680 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method478(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method498();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt772 = arg0.method498();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method498();
					this.anIntArray221 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray221[local34] = arg0.method500();
					}
				} else if (local10 == 3) {
					this.aBoolean175 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray222[local10 - 40] = arg0.method500();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray223[local10 - 50] = arg0.method500();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray224[local10 - 60] = arg0.method500();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("88503, " + arg0 + ", " + 66 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method479(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(22) boolean local22 = true;
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray221.length; local24++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray221[local24])) {
					local22 = false;
				}
			}
			return local22;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("42272, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(20) Class1_Sub1_Sub1_Sub5[] local20 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray221.length; local22++) {
				local20[local22] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray221[local22]);
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47;
			if (local20.length == 1) {
				local47 = local20[0];
			} else {
				local47 = new Class1_Sub1_Sub1_Sub5(local20.length, local20, -38792);
			}
			for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray222[local59] != 0; local59++) {
				local47.method302(this.anIntArray222[local59], this.anIntArray223[local59]);
			}
			return local47;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("49588, " + 0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method481() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray224[local3] != -1 && !Class1_Sub1_Sub1_Sub5.method289(this.anIntArray224[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("32559, " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method482() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
				if (this.anIntArray224[local18] != -1) {
					local4[local16++] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray224[local18]);
				}
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47 = new Class1_Sub1_Sub1_Sub5(local16, local4, -38792);
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray222[local49] != 0; local49++) {
				local47.method302(this.anIntArray222[local49], this.anIntArray223[local49]);
			}
			return local47;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("41027, " + false + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
