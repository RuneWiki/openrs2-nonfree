import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NTHXISGN")
public final class Class27 {

	@OriginalMember(owner = "client!NTHXISGN", name = "b", descriptor = "I")
	public static int anInt481;

	@OriginalMember(owner = "client!NTHXISGN", name = "c", descriptor = "[Lclient!NTHXISGN;")
	public static Class27[] aClass27Array1;

	@OriginalMember(owner = "client!NTHXISGN", name = "e", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "I")
	private int anInt480 = 8;

	@OriginalMember(owner = "client!NTHXISGN", name = "d", descriptor = "I")
	public int anInt482 = -1;

	@OriginalMember(owner = "client!NTHXISGN", name = "f", descriptor = "[I")
	private int[] anIntArray107 = new int[6];

	@OriginalMember(owner = "client!NTHXISGN", name = "g", descriptor = "[I")
	private int[] anIntArray108 = new int[6];

	@OriginalMember(owner = "client!NTHXISGN", name = "h", descriptor = "[I")
	private int[] anIntArray109 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!NTHXISGN", name = "i", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method371(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(859, arg0.method275("idk.dat", null));
			anInt481 = local10.method494();
			if (aClass27Array1 == null) {
				aClass27Array1 = new Class27[anInt481];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt481; local30++) {
				if (aClass27Array1[local30] == null) {
					aClass27Array1[local30] = new Class27();
				}
				aClass27Array1[local30].method372(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("95224, " + -3 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "<init>", descriptor = "()V")
	private Class27() {
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	private void method372(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method492();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt482 = arg0.method492();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method492();
					this.anIntArray106 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray106[local38] = arg0.method494();
					}
				} else if (local14 == 3) {
					this.aBoolean123 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray107[local14 - 40] = arg0.method494();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray108[local14 - 50] = arg0.method494();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray109[local14 - 60] = arg0.method494();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("72460, " + arg0 + ", " + 4 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(B)Z")
	public boolean method373() {
		try {
			if (this.anIntArray106 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray106.length; local14++) {
				if (!Class2_Sub1_Sub1_Sub6.method386(this.anIntArray106[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("41992, " + -32 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	public Class2_Sub1_Sub1_Sub6 method374() {
		try {
			if (this.anIntArray106 == null) {
				return null;
			}
			@Pc(17) Class2_Sub1_Sub1_Sub6[] local17 = new Class2_Sub1_Sub1_Sub6[this.anIntArray106.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray106.length; local19++) {
				local17[local19] = Class2_Sub1_Sub1_Sub6.method385(this.anIntArray106[local19]);
			}
			@Pc(43) Class2_Sub1_Sub1_Sub6 local43;
			if (local17.length == 1) {
				local43 = local17[0];
			} else {
				local43 = new Class2_Sub1_Sub1_Sub6(local17.length, (byte) -112, local17);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray107[local55] != 0; local55++) {
				local43.method399(this.anIntArray107[local55], this.anIntArray108[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("92923, " + 937 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "b", descriptor = "(B)Z")
	public boolean method375() {
		try {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray109[local15] != -1 && !Class2_Sub1_Sub1_Sub6.method386(this.anIntArray109[local15])) {
					local13 = false;
				}
			}
			return local13;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("76124, " + -94 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTHXISGN", name = "a", descriptor = "(Z)Lclient!OGORHYVW;")
	public Class2_Sub1_Sub1_Sub6 method376() {
		try {
			@Pc(4) Class2_Sub1_Sub1_Sub6[] local4 = new Class2_Sub1_Sub1_Sub6[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray109[local8] != -1) {
					local4[local6++] = Class2_Sub1_Sub1_Sub6.method385(this.anIntArray109[local8]);
				}
			}
			@Pc(41) Class2_Sub1_Sub1_Sub6 local41 = new Class2_Sub1_Sub1_Sub6(local6, (byte) -112, local4);
			for (@Pc(43) int local43 = 0; local43 < 6 && this.anIntArray107[local43] != 0; local43++) {
				local41.method399(this.anIntArray107[local43], this.anIntArray108[local43]);
			}
			return local41;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("65813, " + false + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
