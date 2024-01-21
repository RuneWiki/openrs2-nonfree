import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt769;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "B")
	private byte aByte34 = -41;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public int anInt770 = -1;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!xb;Z)V")
	public static void method496(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(16) Class1_Sub1_Sub3 local16 = new Class1_Sub1_Sub3(-49365, arg0.method666("idk.dat", null));
			anInt769 = local16.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt769];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt769; local26++) {
				if (aClass23Array1[local26] == null) {
					aClass23Array1[local26] = new Class23();
				}
				aClass23Array1[local26].method497(local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("63674, " + arg0 + ", " + false + ", " + local50.toString());
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
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt770 = arg0.method480();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method480();
					this.anIntArray221 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray221[local37] = arg0.method482();
					}
				} else if (local13 == 3) {
					this.aBoolean199 = true;
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray222[local13 - 40] = arg0.method482();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray223[local13 - 50] = arg0.method482();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray224[local13 - 60] = arg0.method482();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("66313, " + arg0 + ", " + false + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method498() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray221.length; local19++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local19])) {
					local17 = false;
				}
			}
			return local17;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("62385, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub1_Sub5[] local21 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray221.length; local23++) {
				local21[local23] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local23]);
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48;
			if (local21.length == 1) {
				local48 = local21[0];
			} else {
				local48 = new Class1_Sub1_Sub1_Sub5(local21, this.aByte34, local21.length);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray222[local61] != 0; local61++) {
				local48.method275(this.anIntArray222[local61], this.anIntArray223[local61]);
			}
			return local48;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("24429, " + 5 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public boolean method500() {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("13821, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray224[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local8]);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(local4, this.aByte34, local6);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray222[local50] != 0; local50++) {
				local48.method275(this.anIntArray222[local50], this.anIntArray223[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("3580, " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
