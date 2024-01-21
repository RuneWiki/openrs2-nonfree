import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	private static boolean aBoolean200;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "B")
	private byte aByte45 = 4;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt742 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray221 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private int[] anIntArray223 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method492(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method662("idk.dat", null), 15787);
			anInt741 = local8.method478();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt741];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt741; local26++) {
				if (aClass23Array1[local26] == null) {
					aClass23Array1[local26] = new Class23();
				}
				aClass23Array1[local26].method493(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("42475, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method493(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method476();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt742 = arg0.method476();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method476();
					this.anIntArray220 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray220[local34] = arg0.method478();
					}
				} else if (local10 == 3) {
					this.aBoolean201 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray221[local10 - 40] = arg0.method478();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray222[local10 - 50] = arg0.method478();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray223[local10 - 60] = arg0.method478();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("93901, " + false + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method494() {
		try {
			if (this.anIntArray220 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray220.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray220[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47258, " + 9 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method495() {
		try {
			if (this.anIntArray220 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray220.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray220.length; local18++) {
				local11[local18] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray220[local18], this.aByte45);
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44;
			if (local11.length == 1) {
				local44 = local11[0];
			} else {
				local44 = new Class1_Sub1_Sub1_Sub5(local11, local11.length, -33019);
			}
			for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray221[local56] != 0; local56++) {
				local44.method274(this.anIntArray221[local56], this.anIntArray222[local56]);
			}
			return local44;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("95134, " + 0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method496() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray223[local9] != -1 && !Class1_Sub1_Sub1_Sub5.method261(this.anIntArray223[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("34430, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method497() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray223[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray223[local8], this.aByte45);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(local4, local6, -33019);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray221[local50] != 0; local50++) {
				local48.method274(this.anIntArray221[local50], this.anIntArray222[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("40216, " + -45 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
