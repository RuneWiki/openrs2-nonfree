import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private static boolean aBoolean203;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt739 = 16935;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt741 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean204 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method496(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("idk.dat", null), aBoolean203);
			anInt740 = local8.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt740];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt740; local26++) {
				if (aClass23Array1[local26] == null) {
					aClass23Array1[local26] = new Class23();
				}
				aClass23Array1[local26].method497(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("12637, " + arg0 + ", " + 5 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method497(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt741 = arg0.method480();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method480();
					this.anIntArray221 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray221[local37] = arg0.method482();
					}
				} else if (local13 == 3) {
					this.aBoolean204 = true;
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
			signlink.reporterror("99409, " + false + ", " + arg0 + ", " + local118.toString());
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
			signlink.reporterror("84129, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			@Pc(16) boolean local16 = false;
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray221.length; local24++) {
				local11[local24] = Class1_Sub1_Sub1_Sub5.method261((byte) 4, this.anIntArray221[local24]);
			}
			@Pc(49) Class1_Sub1_Sub1_Sub5 local49;
			if (local11.length == 1) {
				local49 = local11[0];
			} else {
				local49 = new Class1_Sub1_Sub1_Sub5(local11, anInt739, local11.length);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray222[local61] != 0; local61++) {
				local49.method275(this.anIntArray222[local61], this.anIntArray223[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("85453, " + arg0 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
	public boolean method500() {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray224[local13] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local13])) {
					local3 = false;
				}
			}
			return local3;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("21101, " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
				if (this.anIntArray224[local17] != -1) {
					local4[local15++] = Class1_Sub1_Sub1_Sub5.method261((byte) 4, this.anIntArray224[local17]);
				}
			}
			@Pc(46) Class1_Sub1_Sub1_Sub5 local46 = new Class1_Sub1_Sub1_Sub5(local4, anInt739, local15);
			for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray222[local48] != 0; local48++) {
				local46.method275(this.anIntArray222[local48], this.anIntArray223[local48]);
			}
			return local46;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("8704, " + 35721 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
