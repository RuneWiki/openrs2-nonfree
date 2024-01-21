import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "B")
	private byte aByte35 = 0;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt750 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray219 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray220 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray221 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method489(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("idk.dat", null), (byte) 1);
			anInt749 = local8.method475();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt749];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt749; local21++) {
				if (aClass23Array1[local21] == null) {
					aClass23Array1[local21] = new Class23();
				}
				aClass23Array1[local21].method490(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("48202, " + false + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method490(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method473();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt750 = arg0.method473();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method473();
					this.anIntArray218 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray218[local35] = arg0.method475();
					}
				} else if (local11 == 3) {
					this.aBoolean187 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray219[local11 - 40] = arg0.method475();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray220[local11 - 50] = arg0.method475();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray221[local11 - 60] = arg0.method475();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("4080, " + 2 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z")
	public boolean method491() {
		try {
			if (this.anIntArray218 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray218.length; local15++) {
				if (!Class1_Sub1_Sub1_Sub5.method261(this.anIntArray218[local15])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("63953, " + 3 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method492() {
		try {
			if (this.aByte35 != 0) {
				this.aBoolean186 = !this.aBoolean186;
			}
			if (this.anIntArray218 == null) {
				return null;
			}
			@Pc(23) Class1_Sub1_Sub1_Sub5[] local23 = new Class1_Sub1_Sub1_Sub5[this.anIntArray218.length];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray218.length; local25++) {
				local23[local25] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray218[local25]);
			}
			@Pc(50) Class1_Sub1_Sub1_Sub5 local50;
			if (local23.length == 1) {
				local50 = local23[0];
			} else {
				local50 = new Class1_Sub1_Sub1_Sub5(local23.length, -643, local23);
			}
			for (@Pc(62) int local62 = 0; local62 < 6 && this.anIntArray219[local62] != 0; local62++) {
				local50.method274(this.anIntArray219[local62], this.anIntArray220[local62]);
			}
			return local50;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("72858, " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method493() {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
				if (this.anIntArray221[local5] != -1 && !Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local5])) {
					local3 = false;
				}
			}
			return local3;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("84548, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method494(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			@Pc(11) boolean local11 = false;
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray221[local19] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method260(this.anIntArray221[local19]);
				}
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(local6, -643, local4);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray219[local50] != 0; local50++) {
				local48.method274(this.anIntArray219[local50], this.anIntArray220[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("19900, " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
