import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QRYQWAHS")
public final class Class30 {

	@OriginalMember(owner = "client!QRYQWAHS", name = "e", descriptor = "I")
	public static int anInt371;

	@OriginalMember(owner = "client!QRYQWAHS", name = "f", descriptor = "[Lclient!QRYQWAHS;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!QRYQWAHS", name = "h", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "I")
	private int anInt368 = 8;

	@OriginalMember(owner = "client!QRYQWAHS", name = "b", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!QRYQWAHS", name = "c", descriptor = "I")
	private int anInt369 = 9;

	@OriginalMember(owner = "client!QRYQWAHS", name = "d", descriptor = "I")
	private int anInt370 = 155;

	@OriginalMember(owner = "client!QRYQWAHS", name = "g", descriptor = "I")
	public int anInt372 = -1;

	@OriginalMember(owner = "client!QRYQWAHS", name = "i", descriptor = "[I")
	private int[] anIntArray127 = new int[6];

	@OriginalMember(owner = "client!QRYQWAHS", name = "j", descriptor = "[I")
	private int[] anIntArray128 = new int[6];

	@OriginalMember(owner = "client!QRYQWAHS", name = "k", descriptor = "[I")
	private int[] anIntArray129 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!QRYQWAHS", name = "l", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(ILclient!MAARFNGV;)V")
	public static void method286(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(10) Class2_Sub1_Sub3 local10 = new Class2_Sub1_Sub3(arg0.method218("idk.dat", null), true);
			anInt371 = local10.method99();
			if (aClass30Array1 == null) {
				aClass30Array1 = new Class30[anInt371];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt371; local29++) {
				if (aClass30Array1[local29] == null) {
					aClass30Array1[local29] = new Class30();
				}
				aClass30Array1[local29].method287(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("29083, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "<init>", descriptor = "()V")
	private Class30() {
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	private void method287(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method97();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt372 = arg0.method97();
				} else if (local11 == 2) {
					@Pc(29) int local29 = arg0.method97();
					this.anIntArray126 = new int[local29];
					for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
						this.anIntArray126[local35] = arg0.method99();
					}
				} else if (local11 == 3) {
					this.aBoolean142 = true;
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray127[local11 - 40] = arg0.method99();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray128[local11 - 50] = arg0.method99();
				} else if (local11 >= 60 && local11 < 70) {
					this.anIntArray129[local11 - 60] = arg0.method99();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("1362, " + 1016 + ", " + arg0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "a", descriptor = "(I)Z")
	public boolean method288() {
		try {
			if (this.anIntArray126 == null) {
				return true;
			}
			@Pc(16) boolean local16 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray126.length; local18++) {
				if (!Class2_Sub1_Sub2_Sub2.method152(this.anIntArray126[local18])) {
					local16 = false;
				}
			}
			return local16;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("43783, " + 7 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "b", descriptor = "(I)Lclient!IEHKDFMR;")
	public Class2_Sub1_Sub2_Sub2 method289() {
		try {
			if (this.anIntArray126 == null) {
				return null;
			}
			@Pc(11) Class2_Sub1_Sub2_Sub2[] local11 = new Class2_Sub1_Sub2_Sub2[this.anIntArray126.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray126.length; local13++) {
				local11[local13] = Class2_Sub1_Sub2_Sub2.method151(this.anIntArray126[local13]);
			}
			@Pc(37) Class2_Sub1_Sub2_Sub2 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class2_Sub1_Sub2_Sub2(local11, this.anInt368, local11.length);
			}
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray127[local50] != 0; local50++) {
				local37.method165(this.anIntArray127[local50], this.anIntArray128[local50]);
			}
			if (this.anInt369 != 9) {
				throw new NullPointerException();
			}
			return local37;
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("80219, " + 9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "c", descriptor = "(I)Z")
	public boolean method290() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray129[local9] != -1 && !Class2_Sub1_Sub2_Sub2.method152(this.anIntArray129[local9])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("96063, " + 155 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRYQWAHS", name = "d", descriptor = "(I)Lclient!IEHKDFMR;")
	public Class2_Sub1_Sub2_Sub2 method291() {
		try {
			@Pc(4) Class2_Sub1_Sub2_Sub2[] local4 = new Class2_Sub1_Sub2_Sub2[5];
			@Pc(17) int local17 = 0;
			for (@Pc(19) int local19 = 0; local19 < 5; local19++) {
				if (this.anIntArray129[local19] != -1) {
					local4[local17++] = Class2_Sub1_Sub2_Sub2.method151(this.anIntArray129[local19]);
				}
			}
			@Pc(48) Class2_Sub1_Sub2_Sub2 local48 = new Class2_Sub1_Sub2_Sub2(local4, this.anInt368, local17);
			for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray127[local50] != 0; local50++) {
				local48.method165(this.anIntArray127[local50], this.anIntArray128[local50]);
			}
			return local48;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("38841, " + 37587 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
