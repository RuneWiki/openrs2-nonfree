import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Z")
	private static boolean aBoolean201;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt729;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt726 = 77;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt727 = 3;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private int anInt728 = -8322;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public int anInt730 = -1;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method496(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("idk.dat", null), (byte) -93);
			anInt729 = local8.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt729];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt729; local18++) {
				if (aClass23Array1[local18] == null) {
					aClass23Array1[local18] = new Class23();
				}
				aClass23Array1[local18].method497(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("18174, " + false + ", " + arg0 + ", " + local50.toString());
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
				@Pc(9) int local9 = arg0.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt730 = arg0.method480();
				} else if (local9 == 2) {
					@Pc(27) int local27 = arg0.method480();
					this.anIntArray221 = new int[local27];
					for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
						this.anIntArray221[local33] = arg0.method482();
					}
				} else if (local9 == 3) {
					this.aBoolean202 = true;
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray222[local9 - 40] = arg0.method482();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray223[local9 - 50] = arg0.method482();
				} else if (local9 >= 60 && local9 < 70) {
					this.anIntArray224[local9 - 60] = arg0.method482();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("3237, " + 210 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method498(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				aBoolean201 = !aBoolean201;
			}
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray221.length; local16++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local16])) {
					local14 = false;
				}
			}
			return local14;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("77189, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 1) {
				aBoolean201 = !aBoolean201;
			}
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(20) Class1_Sub1_Sub1_Sub5[] local20 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray221.length; local22++) {
				local20[local22] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local22]);
			}
			@Pc(47) Class1_Sub1_Sub1_Sub5 local47;
			if (local20.length == 1) {
				local47 = local20[0];
			} else {
				local47 = new Class1_Sub1_Sub1_Sub5(local20, local20.length, false);
			}
			for (@Pc(59) int local59 = 0; local59 < 6 && this.anIntArray222[local59] != 0; local59++) {
				local47.method275(this.anIntArray222[local59], this.anIntArray223[local59]);
			}
			return local47;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("48953, " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method500() {
		try {
			@Pc(1) boolean local1 = true;
			if (this.anInt727 != 3) {
				this.anInt728 = 216;
			}
			for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
				if (this.anIntArray224[local10] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local10])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("4579, " + 3 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(21) int local21 = 0; local21 < 5; local21++) {
				if (this.anIntArray224[local21] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local21]);
				}
			}
			@Pc(50) Class1_Sub1_Sub1_Sub5 local50 = new Class1_Sub1_Sub1_Sub5(local4, local6, false);
			for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray222[local52] != 0; local52++) {
				local50.method275(this.anIntArray222[local52], this.anIntArray223[local52]);
			}
			return local50;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("42683, " + 9 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
