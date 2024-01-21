import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private static boolean aBoolean169;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt756 = 5;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt758 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray221 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray223 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean170 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method475(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method674("idk.dat", null), false);
			anInt757 = local8.method498();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt757];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt757; local18++) {
				if (aClass23Array1[local18] == null) {
					aClass23Array1[local18] = new Class23();
				}
				aClass23Array1[local18].method476(local8);
			}
			if (arg0 < 3 || arg0 > 3) {
				aBoolean169 = !aBoolean169;
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("63693, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method476(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method496();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt758 = arg0.method496();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method496();
					this.anIntArray220 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray220[local34] = arg0.method498();
					}
				} else if (local10 == 3) {
					this.aBoolean170 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray221[local10 - 40] = arg0.method498();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray222[local10 - 50] = arg0.method498();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray223[local10 - 60] = arg0.method498();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("3790, " + true + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method477() {
		try {
			if (this.anIntArray220 == null) {
				return true;
			}
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray220.length; local13++) {
				if (!Class1_Sub1_Sub1_Sub5.method288(this.anIntArray220[local13])) {
					local11 = false;
				}
			}
			return local11;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("74530, " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method478() {
		try {
			if (this.anIntArray220 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray220.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray220.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method287(this.anIntArray220[local13]);
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38;
			if (local11.length == 1) {
				local38 = local11[0];
			} else {
				local38 = new Class1_Sub1_Sub1_Sub5(false, local11, local11.length);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray221[local50] != 0; local50++) {
				local38.method301(this.anIntArray221[local50], this.anIntArray222[local50]);
			}
			return local38;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("87548, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method479() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
				if (this.anIntArray223[local10] != -1 && !Class1_Sub1_Sub1_Sub5.method288(this.anIntArray223[local10])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("41728, " + 8 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray223[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method287(this.anIntArray223[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5(false, local4, local6);
			for (@Pc(39) int local39 = 0; local39 < 6 && this.anIntArray221[local39] != 0; local39++) {
				local37.method301(this.anIntArray221[local39], this.anIntArray222[local39]);
			}
			return local37;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("65064, " + 7 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
