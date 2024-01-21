import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private static int anInt746 = 2;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public int anInt748 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean180 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method477(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method678("idk.dat", null), 337);
			anInt747 = local8.method500();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt747];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt747; local22++) {
				if (aClass23Array1[local22] == null) {
					aClass23Array1[local22] = new Class23();
				}
				aClass23Array1[local22].method478(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("43519, " + arg0 + ", " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method478(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method498();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt748 = arg0.method498();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method498();
					this.anIntArray221 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray221[local34] = arg0.method500();
					}
				} else if (local10 == 3) {
					this.aBoolean180 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray222[local10 - 40] = arg0.method500();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray223[local10 - 50] = arg0.method500();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray224[local10 - 60] = arg0.method500();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("85197, " + 0 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method479() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray221.length; local12++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray221[local12])) {
					local10 = false;
				}
			}
			return local10;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("33172, " + -417 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray221.length; local20++) {
				local11[local20] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray221[local20]);
			}
			@Pc(45) Class1_Sub1_Sub1_Sub5 local45;
			if (local11.length == 1) {
				local45 = local11[0];
			} else {
				local45 = new Class1_Sub1_Sub1_Sub5((byte) 1, local11.length, local11);
			}
			for (@Pc(57) int local57 = 0; local57 < 6 && this.anIntArray222[local57] != 0; local57++) {
				local45.method302(this.anIntArray222[local57], this.anIntArray223[local57]);
			}
			return local45;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("42255, " + 5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method481(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
				if (this.anIntArray224[local7] != -1 && !Class1_Sub1_Sub1_Sub5.method289(this.anIntArray224[local7])) {
					local5 = false;
				}
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("29192, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method482() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray224[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray224[local8]);
				}
			}
			@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = new Class1_Sub1_Sub1_Sub5((byte) 1, local6, local4);
			for (@Pc(39) int local39 = 0; local39 < 6 && this.anIntArray222[local39] != 0; local39++) {
				local37.method302(this.anIntArray222[local39], this.anIntArray223[local39]);
			}
			return local37;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("57320, " + -221 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
