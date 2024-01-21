import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private static int anInt763 = 413;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean185 = true;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public int anInt765 = -1;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(false, arg1.method666("idk.dat", null));
			anInt764 = local8.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt764];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt764; local18++) {
				if (aClass23Array1[local18] == null) {
					aClass23Array1[local18] = new Class23();
				}
				aClass23Array1[local18].method497(local8);
			}
			if (arg0 != 35102) {
				anInt763 = -39;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("19548, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method497(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method480();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt765 = arg0.method480();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method480();
					this.anIntArray221 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray221[local34] = arg0.method482();
					}
				} else if (local10 == 3) {
					this.aBoolean187 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray222[local10 - 40] = arg0.method482();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray223[local10 - 50] = arg0.method482();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray224[local10 - 60] = arg0.method482();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("96534, " + arg0 + ", " + false + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method498() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray221.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("62483, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub5[] local22 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray221.length; local24++) {
				local22[local24] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local24]);
			}
			@Pc(49) Class1_Sub1_Sub1_Sub5 local49;
			if (local22.length == 1) {
				local49 = local22[0];
			} else {
				local49 = new Class1_Sub1_Sub1_Sub5(local22.length, local22, (byte) 1);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray222[local61] != 0; local61++) {
				local49.method275(this.anIntArray222[local61], this.anIntArray223[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("74914, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method500() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray224[local9] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("30890, " + 350 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray224[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(local6, local4, (byte) 1);
			for (@Pc(53) int local53 = 0; local53 < 6 && this.anIntArray222[local53] != 0; local53++) {
				local37.method275(this.anIntArray222[local53], this.anIntArray223[local53]);
			}
			return local37;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("17043, " + 4 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
