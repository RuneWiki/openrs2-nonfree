import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private static int anInt744 = -474;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt747 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray219 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray220 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray221 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method490(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method660("idk.dat", null), 185);
			anInt746 = local12.method476();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt746];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt746; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method491(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("31135, " + arg0 + ", " + -474 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method491(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method474();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt747 = arg0.method474();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method474();
					this.anIntArray218 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray218[local35] = arg0.method476();
					}
				} else if (local11 == 3) {
					this.aBoolean196 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray219[local11 - 40] = arg0.method476();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray220[local11 - 50] = arg0.method476();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray221[local11 - 60] = arg0.method476();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("22718, " + arg0 + ", " + 81 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method492() {
		try {
			if (this.anIntArray218 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray218.length; local14++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray218[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("72155, " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method493() {
		try {
			if (this.anIntArray218 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray218.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray218.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray218[local13]);
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38;
			if (local11.length == 1) {
				local38 = local11[0];
			} else {
				local38 = new Class1_Sub1_Sub1_Sub5((byte) 3, local11.length, local11);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray219[local50] != 0; local50++) {
				local38.method274(this.anIntArray219[local50], this.anIntArray220[local50]);
			}
			return local38;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("26563, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method494() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray221[local8] != -1 && !Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local8])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("57133, " + 364 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method495() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray221[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray221[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5((byte) 3, local6, local4);
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray219[local49] != 0; local49++) {
				local37.method274(this.anIntArray219[local49], this.anIntArray220[local49]);
			}
			return local37;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("65665, " + -57 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
