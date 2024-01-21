import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TAVAECED")
public final class Class39 {

	@OriginalMember(owner = "client!TAVAECED", name = "b", descriptor = "I")
	public static int anInt683;

	@OriginalMember(owner = "client!TAVAECED", name = "c", descriptor = "[Lclient!TAVAECED;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!TAVAECED", name = "e", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "I")
	private int anInt682 = 9;

	@OriginalMember(owner = "client!TAVAECED", name = "d", descriptor = "I")
	public int anInt684 = -1;

	@OriginalMember(owner = "client!TAVAECED", name = "f", descriptor = "[I")
	private int[] anIntArray126 = new int[6];

	@OriginalMember(owner = "client!TAVAECED", name = "g", descriptor = "[I")
	private int[] anIntArray127 = new int[6];

	@OriginalMember(owner = "client!TAVAECED", name = "h", descriptor = "[I")
	private int[] anIntArray128 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!TAVAECED", name = "i", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method465(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method484("idk.dat", null), 891);
			anInt683 = local8.method270();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt683];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt683; local18++) {
				if (aClass39Array1[local18] == null) {
					aClass39Array1[local18] = new Class39();
				}
				aClass39Array1[local18].method466(local8);
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("19348, " + 0 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TAVAECED", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method466(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method268();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt684 = arg0.method268();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method268();
					this.anIntArray125 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray125[local34] = arg0.method270();
					}
				} else if (local10 == 3) {
					this.aBoolean172 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray126[local10 - 40] = arg0.method270();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray127[local10 - 50] = arg0.method270();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray128[local10 - 60] = arg0.method270();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("91892, " + true + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "(B)Z")
	public boolean method467(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray125 == null) {
				return true;
			}
			@Pc(8) boolean local8 = true;
			@Pc(13) boolean local13 = false;
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray125.length; local24++) {
				if (!Class1_Sub1_Sub2_Sub6.method535(this.anIntArray125[local24])) {
					local8 = false;
				}
			}
			return local8;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("9202, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "(Z)Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method468() {
		try {
			if (this.anIntArray125 == null) {
				return null;
			}
			@Pc(17) Class1_Sub1_Sub2_Sub6[] local17 = new Class1_Sub1_Sub2_Sub6[this.anIntArray125.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray125.length; local19++) {
				local17[local19] = Class1_Sub1_Sub2_Sub6.method534(this.anInt682, this.anIntArray125[local19]);
			}
			@Pc(45) Class1_Sub1_Sub2_Sub6 local45;
			if (local17.length == 1) {
				local45 = local17[0];
			} else {
				local45 = new Class1_Sub1_Sub2_Sub6(local17.length, local17, -38);
			}
			for (@Pc(57) int local57 = 0; local57 < 6 && this.anIntArray126[local57] != 0; local57++) {
				local45.method548(this.anIntArray126[local57], this.anIntArray127[local57]);
			}
			return local45;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("82138, " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TAVAECED", name = "b", descriptor = "(Z)Z")
	public boolean method469() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray128[local9] != -1 && !Class1_Sub1_Sub2_Sub6.method535(this.anIntArray128[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("71412, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TAVAECED", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method470() {
		try {
			@Pc(10) Class1_Sub1_Sub2_Sub6[] local10 = new Class1_Sub1_Sub2_Sub6[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray128[local14] != -1) {
					local10[local12++] = Class1_Sub1_Sub2_Sub6.method534(this.anInt682, this.anIntArray128[local14]);
				}
			}
			@Pc(44) Class1_Sub1_Sub2_Sub6 local44 = new Class1_Sub1_Sub2_Sub6(local12, local10, -38);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray126[local46] != 0; local46++) {
				local44.method548(this.anIntArray126[local46], this.anIntArray127[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("82628, " + 0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
