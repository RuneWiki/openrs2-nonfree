import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private static int anInt757 = 1000;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt758 = 926;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt759 = -22323;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	private boolean aBoolean197 = true;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt761 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	public boolean aBoolean198 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method496(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt757, arg0.method666("idk.dat", null));
			anInt760 = local8.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt760];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt760; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method497(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("99823, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method497(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method480();
				if (local17 == 0) {
					return;
				}
				if (local17 == 1) {
					this.anInt761 = arg0.method480();
				} else if (local17 == 2) {
					@Pc(35) int local35 = arg0.method480();
					this.anIntArray221 = new int[local35];
					for (@Pc(41) int local41 = 0; local41 < local35; local41++) {
						this.anIntArray221[local41] = arg0.method482();
					}
				} else if (local17 == 3) {
					this.aBoolean198 = true;
				} else if (local17 >= 40 && local17 < 50) {
					this.anIntArray222[local17 - 40] = arg0.method482();
				} else if (local17 >= 50 && local17 < 60) {
					this.anIntArray223[local17 - 50] = arg0.method482();
				} else if (local17 >= 60 && local17 < 70) {
					this.anIntArray224[local17 - 60] = arg0.method482();
				} else {
					System.out.println("Error unrecognised config code: " + local17);
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("96953, " + 8 + ", " + arg0 + ", " + local122.toString());
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
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray221.length; local19++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local19])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("74781, " + 8 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub1_Sub5[] local21 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray221.length; local23++) {
				local21[local23] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local23], this.anInt759);
			}
			@Pc(49) Class1_Sub1_Sub1_Sub5 local49;
			if (local21.length == 1) {
				local49 = local21[0];
			} else {
				local49 = new Class1_Sub1_Sub1_Sub5(local21.length, -550, local21);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray222[local61] != 0; local61++) {
				local49.method275(this.anIntArray222[local61], this.anIntArray223[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("93626, " + false + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method500() {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local14])) {
					local3 = false;
				}
			}
			return local3;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("98084, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(10) Class1_Sub1_Sub1_Sub5[] local10 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1) {
					local10[local12++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local14], this.anInt759);
				}
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = new Class1_Sub1_Sub1_Sub5(local12, -550, local10);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray222[local46] != 0; local46++) {
				local44.method275(this.anIntArray222[local46], this.anIntArray223[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("29575, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
