import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	public static int anInt240;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "[Lclient!dc;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public int anInt241 = -1;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
	private int[] anIntArray66 = new int[6];

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[I")
	private int[] anIntArray67 = new int[6];

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
	private int[] anIntArray68 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method181(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "idk.dat"), 4);
			anInt240 = local9.method382();
			if (aClass7Array1 == null) {
				aClass7Array1 = new Class7[anInt240];
			}
			for (@Pc(19) int local19 = 0; local19 < anInt240; local19++) {
				if (aClass7Array1[local19] == null) {
					aClass7Array1[local19] = new Class7();
				}
				aClass7Array1[local19].method182(local9);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25914, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!kb;)V")
	private void method182(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method380();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt241 = arg0.method380();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method380();
					this.anIntArray65 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray65[local37] = arg0.method382();
					}
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray66[local13 - 40] = arg0.method382();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray67[local13 - 50] = arg0.method382();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray68[local13 - 60] = arg0.method382();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("45577, " + 213 + ", " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method183() {
		if (this.anIntArray65 == null) {
			return null;
		}
		@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray65.length];
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray65.length; local13++) {
			local11[local13] = new Class1_Sub3_Sub1(this.anIntArray65[local13], 298);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(false, local11.length, local11);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray66[local52] != 0; local52++) {
			local40.method213(this.anIntArray66[local52], this.anIntArray67[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method184() {
		try {
			@Pc(10) Class1_Sub3_Sub1[] local10 = new Class1_Sub3_Sub1[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray68[local14] != -1) {
					local10[local12++] = new Class1_Sub3_Sub1(this.anIntArray68[local14], 298);
				}
			}
			@Pc(45) Class1_Sub3_Sub1 local45 = new Class1_Sub3_Sub1(false, local12, local10);
			for (@Pc(47) int local47 = 0; local47 < 6 && this.anIntArray66[local47] != 0; local47++) {
				local45.method213(this.anIntArray66[local47], this.anIntArray67[local47]);
			}
			return local45;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("66148, " + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
