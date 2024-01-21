import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WINORGIB")
public final class Class44 {

	@OriginalMember(owner = "client!WINORGIB", name = "c", descriptor = "I")
	public static int anInt751;

	@OriginalMember(owner = "client!WINORGIB", name = "d", descriptor = "[Lclient!WINORGIB;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "Z")
	private static boolean aBoolean164 = true;

	@OriginalMember(owner = "client!WINORGIB", name = "f", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "I")
	private int anInt750 = 178;

	@OriginalMember(owner = "client!WINORGIB", name = "e", descriptor = "I")
	public int anInt752 = -1;

	@OriginalMember(owner = "client!WINORGIB", name = "g", descriptor = "[I")
	private int[] anIntArray191 = new int[6];

	@OriginalMember(owner = "client!WINORGIB", name = "h", descriptor = "[I")
	private int[] anIntArray192 = new int[6];

	@OriginalMember(owner = "client!WINORGIB", name = "i", descriptor = "[I")
	private int[] anIntArray193 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!WINORGIB", name = "j", descriptor = "Z")
	public boolean aBoolean165 = false;

	@OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method479(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method14("idk.dat", null), 713);
			anInt751 = local8.method154();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt751];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt751; local18++) {
				if (aClass44Array1[local18] == null) {
					aClass44Array1[local18] = new Class44();
				}
				aClass44Array1[local18].method480(local8, (byte) 1);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("1922, " + arg0 + ", " + 0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WINORGIB", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method480(@OriginalArg(0) Class8_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(18) int local18 = arg0.method152();
					if (local18 == 0) {
						return;
					}
					if (local18 == 1) {
						this.anInt752 = arg0.method152();
					} else if (local18 == 2) {
						@Pc(36) int local36 = arg0.method152();
						this.anIntArray190 = new int[local36];
						for (@Pc(42) int local42 = 0; local42 < local36; local42++) {
							this.anIntArray190[local42] = arg0.method154();
						}
					} else if (local18 == 3) {
						this.aBoolean165 = true;
					} else if (local18 >= 40 && local18 < 50) {
						this.anIntArray191[local18 - 40] = arg0.method154();
					} else if (local18 >= 50 && local18 < 60) {
						this.anIntArray192[local18 - 50] = arg0.method154();
					} else if (local18 >= 60 && local18 < 70) {
						this.anIntArray193[local18 - 60] = arg0.method154();
					} else {
						System.out.println("Error unrecognised config code: " + local18);
					}
				}
			}
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("89380, " + arg0 + ", " + arg1 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(I)Z")
	public boolean method481() {
		try {
			if (this.anIntArray190 == null) {
				return true;
			}
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray190.length; local17++) {
				if (!Class8_Sub1_Sub1_Sub5.method211(this.anIntArray190[local17])) {
					local15 = false;
				}
			}
			return local15;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("15361, " + -331 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WINORGIB", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method482() {
		try {
			if (this.anIntArray190 == null) {
				return null;
			}
			@Pc(11) Class8_Sub1_Sub1_Sub5[] local11 = new Class8_Sub1_Sub1_Sub5[this.anIntArray190.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray190.length; local19++) {
				local11[local19] = Class8_Sub1_Sub1_Sub5.method210(this.anIntArray190[local19]);
			}
			@Pc(43) Class8_Sub1_Sub1_Sub5 local43;
			if (local11.length == 1) {
				local43 = local11[0];
			} else {
				local43 = new Class8_Sub1_Sub1_Sub5(local11, local11.length, -41715);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray191[local55] != 0; local55++) {
				local43.method224(this.anIntArray191[local55], this.anIntArray192[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("22376, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "(I)Z")
	public boolean method483(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
				if (this.anIntArray193[local7] != -1 && !Class8_Sub1_Sub1_Sub5.method211(this.anIntArray193[local7])) {
					local5 = false;
				}
			}
			return local5;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("63437, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WINORGIB", name = "b", descriptor = "(B)Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method484() {
		try {
			@Pc(4) Class8_Sub1_Sub1_Sub5[] local4 = new Class8_Sub1_Sub1_Sub5[5];
			@Pc(15) int local15 = 0;
			for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
				if (this.anIntArray193[local17] != -1) {
					local4[local15++] = Class8_Sub1_Sub1_Sub5.method210(this.anIntArray193[local17]);
				}
			}
			@Pc(45) Class8_Sub1_Sub1_Sub5 local45 = new Class8_Sub1_Sub1_Sub5(local4, local15, -41715);
			for (@Pc(47) int local47 = 0; local47 < 6 && this.anIntArray191[local47] != 0; local47++) {
				local45.method224(this.anIntArray191[local47], this.anIntArray192[local47]);
			}
			return local45;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("20371, " + 67 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
