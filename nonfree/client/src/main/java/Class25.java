import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mc")
public final class Class25 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[Lclient!mc;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private static int anInt771 = 6771;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public int anInt773 = -1;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
	private int[] anIntArray234 = new int[6];

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
	private int[] anIntArray235 = new int[6];

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[I")
	private int[] anIntArray236 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method519(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method689("idk.dat", null), true);
			anInt772 = local8.method505();
			if (anInt771 != 6771) {
				anInt771 = 38;
			}
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt772];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt772; local23++) {
				if (aClass25Array1[local23] == null) {
					aClass25Array1[local23] = new Class25();
				}
				aClass25Array1[local23].method520(local8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("38480, " + 6771 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method520(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method503();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt773 = arg0.method503();
				} else if (local15 == 2) {
					@Pc(33) int local33 = arg0.method503();
					this.anIntArray233 = new int[local33];
					for (@Pc(39) int local39 = 0; local39 < local33; local39++) {
						this.anIntArray233[local39] = arg0.method505();
					}
				} else if (local15 == 3) {
					this.aBoolean187 = true;
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray234[local15 - 40] = arg0.method505();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray235[local15 - 50] = arg0.method505();
				} else if (local15 >= 60 && local15 < 70) {
					this.anIntArray236[local15 - 60] = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("66894, " + 44 + ", " + arg0 + ", " + local120.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z")
	public boolean method521() {
		try {
			if (this.anIntArray233 == null) {
				return true;
			}
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray233.length; local20++) {
				if (!Class1_Sub1_Sub1_Sub5.method257(this.anIntArray233[local20])) {
					local18 = false;
				}
			}
			return local18;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("70347, " + 5 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method522() {
		try {
			if (this.anIntArray233 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray233.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray233.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method256(this.anIntArray233[local13], 196);
			}
			@Pc(38) Class1_Sub1_Sub1_Sub5 local38;
			if (local11.length == 1) {
				local38 = local11[0];
			} else {
				local38 = new Class1_Sub1_Sub1_Sub5(172, local11, local11.length);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray234[local50] != 0; local50++) {
				local38.method270(this.anIntArray234[local50], this.anIntArray235[local50]);
			}
			return local38;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("30716, " + 2 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Z")
	public boolean method523() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
				if (this.anIntArray236[local10] != -1 && !Class1_Sub1_Sub1_Sub5.method257(this.anIntArray236[local10])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("99038, " + 26 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method524() {
		try {
			@Pc(10) Class1_Sub1_Sub1_Sub5[] local10 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray236[local14] != -1) {
					local10[local12++] = Class1_Sub1_Sub1_Sub5.method256(this.anIntArray236[local14], 196);
				}
			}
			@Pc(43) Class1_Sub1_Sub1_Sub5 local43 = new Class1_Sub1_Sub1_Sub5(172, local10, local12);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray234[local45] != 0; local45++) {
				local43.method270(this.anIntArray234[local45], this.anIntArray235[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("49559, " + true + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
