import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
	private static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt748 = 440;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public int anInt750 = -1;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method496(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("idk.dat", null), 58);
			anInt749 = local8.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt749];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt749; local18++) {
				if (aClass23Array1[local18] == null) {
					aClass23Array1[local18] = new Class23();
				}
				aClass23Array1[local18].method497(local8, 913);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("48629, " + arg0 + ", " + -30 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method497(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method480();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt750 = arg0.method480();
					} else if (local8 == 2) {
						@Pc(26) int local26 = arg0.method480();
						this.anIntArray221 = new int[local26];
						for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
							this.anIntArray221[local32] = arg0.method482();
						}
					} else if (local8 == 3) {
						this.aBoolean190 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray222[local8 - 40] = arg0.method482();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray223[local8 - 50] = arg0.method482();
					} else if (local8 >= 60 && local8 < 70) {
						this.anIntArray224[local8 - 60] = arg0.method482();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("74148, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public boolean method498() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray221.length; local13++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local13])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("65277, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray221.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local13]);
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38;
			if (local11.length == 1) {
				local38 = local11[0];
			} else {
				local38 = new Class1_Sub1_Sub1_Sub5((byte) 2, local11, local11.length);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray222[local50] != 0; local50++) {
				local38.method275(this.anIntArray222[local50], this.anIntArray223[local50]);
			}
			return local38;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("2163, " + false + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method500() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local14])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("3649, " + 7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray224[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5((byte) 2, local4, local6);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray222[local44] != 0; local44++) {
				local37.method275(this.anIntArray222[local44], this.anIntArray223[local44]);
			}
			return local37;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("98007, " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
