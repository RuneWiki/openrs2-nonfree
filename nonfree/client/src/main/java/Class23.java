import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt752;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public int anInt753 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	public boolean aBoolean190 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!yb;)V")
	public static void method477(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method678("idk.dat", null), (byte) 3);
			anInt752 = local8.method500();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt752];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt752; local21++) {
				if (aClass23Array1[local21] == null) {
					aClass23Array1[local21] = new Class23();
				}
				aClass23Array1[local21].method478(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25262, " + true + ", " + arg0 + ", " + local45.toString());
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
				@Pc(18) int local18 = arg0.method498();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt753 = arg0.method498();
				} else if (local18 == 2) {
					@Pc(36) int local36 = arg0.method498();
					this.anIntArray221 = new int[local36];
					for (@Pc(42) int local42 = 0; local42 < local36; local42++) {
						this.anIntArray221[local42] = arg0.method500();
					}
				} else if (local18 == 3) {
					this.aBoolean190 = true;
				} else if (local18 >= 40 && local18 < 50) {
					this.anIntArray222[local18 - 40] = arg0.method500();
				} else if (local18 >= 50 && local18 < 60) {
					this.anIntArray223[local18 - 50] = arg0.method500();
				} else if (local18 >= 60 && local18 < 70) {
					this.anIntArray224[local18 - 60] = arg0.method500();
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("29774, " + 9 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public boolean method479() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray221.length; local14++) {
				if (!Class1_Sub1_Sub1_Sub5.method289(this.anIntArray221[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78504, " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method480() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(21) Class1_Sub1_Sub1_Sub5[] local21 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray221.length; local23++) {
				local21[local23] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray221[local23]);
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48;
			if (local21.length == 1) {
				local48 = local21[0];
			} else {
				local48 = new Class1_Sub1_Sub1_Sub5(local21, local21.length, -928);
			}
			for (@Pc(60) int local60 = 0; local60 < 6 && this.anIntArray222[local60] != 0; local60++) {
				local48.method302(this.anIntArray222[local60], this.anIntArray223[local60]);
			}
			return local48;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("64902, " + true + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method481() {
		try {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray224[local14] != -1 && !Class1_Sub1_Sub1_Sub5.method289(this.anIntArray224[local14])) {
					local12 = false;
				}
			}
			return local12;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("46684, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method482() {
		try {
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(13) int local13 = 0;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray224[local15] != -1) {
					local11[local13++] = Class1_Sub1_Sub1_Sub5.method288(this.anIntArray224[local15]);
				}
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = new Class1_Sub1_Sub1_Sub5(local11, local13, -928);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray222[local46] != 0; local46++) {
				local44.method302(this.anIntArray222[local46], this.anIntArray223[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("44785, " + 9 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
