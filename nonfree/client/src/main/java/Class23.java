import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean205 = true;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt721 = 4697;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private int anInt723 = 5;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt725 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray219 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray220 = new int[6];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private int[] anIntArray221 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	public boolean aBoolean206 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 3, arg1.method658("idk.dat", null));
			@Pc(12) boolean local12 = false;
			anInt724 = local8.method474();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt724];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt724; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method489(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("68489, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method489(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method472();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt725 = arg0.method472();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method472();
					this.anIntArray218 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray218[local34] = arg0.method474();
					}
				} else if (local10 == 3) {
					this.aBoolean206 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray219[local10 - 40] = arg0.method474();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray220[local10 - 50] = arg0.method474();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray221[local10 - 60] = arg0.method474();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("6268, " + arg0 + ", " + -32477 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method490() {
		try {
			if (this.anIntArray218 == null) {
				return true;
			}
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray218.length; local19++) {
				if (!Class1_Sub1_Sub1_Sub5.method260(this.anIntArray218[local19])) {
					local17 = false;
				}
			}
			return local17;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("31489, " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method491() {
		try {
			if (this.anIntArray218 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray218.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray218.length; local13++) {
				local11[local13] = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean205, this.anIntArray218[local13]);
			}
			@Pc(39) Class1_Sub1_Sub1_Sub5 local39;
			if (local11.length == 1) {
				local39 = local11[0];
			} else {
				local39 = new Class1_Sub1_Sub1_Sub5(local11.length, local11, this.anInt721);
			}
			for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray219[local52] != 0; local52++) {
				local39.method273(this.anIntArray219[local52], this.anIntArray220[local52]);
			}
			return local39;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("52448, " + 68 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Z")
	public boolean method492() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
				if (this.anIntArray221[local3] != -1 && !Class1_Sub1_Sub1_Sub5.method260(this.anIntArray221[local3])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("98943, " + 3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method493() {
		try {
			@Pc(13) Class1_Sub1_Sub1_Sub5[] local13 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
				if (this.anIntArray221[local17] != -1) {
					local13[local15++] = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean205, this.anIntArray221[local17]);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(local15, local13, this.anInt721);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray219[local50] != 0; local50++) {
				local48.method273(this.anIntArray219[local50], this.anIntArray220[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("89539, " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
