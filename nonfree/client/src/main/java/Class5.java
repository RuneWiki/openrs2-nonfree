import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean15;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private static boolean aBoolean16;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt66;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[Lclient!cc;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public int anInt67 = -1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	private int[] anIntArray14 = new int[6];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
	private int[] anIntArray15 = new int[6];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
	private int[] anIntArray16 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method52(@OriginalArg(0) Class34 arg0) {
		@Pc(18) Class1_Sub3_Sub3 local18 = new Class1_Sub3_Sub3(arg0.method428(null, "idk.dat"), (byte) 63);
		anInt66 = local18.method333();
		if (aClass5Array1 == null) {
			aClass5Array1 = new Class5[anInt66];
		}
		for (@Pc(28) int local28 = 0; local28 < anInt66; local28++) {
			if (aClass5Array1[local28] == null) {
				aClass5Array1[local28] = new Class5();
			}
			aClass5Array1[local28].method53(local18);
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!jb;)V")
	private void method53(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method331();
			if (local14 == 0) {
				return;
			}
			if (local14 == 1) {
				this.anInt67 = arg0.method331();
			} else if (local14 == 2) {
				@Pc(32) int local32 = arg0.method331();
				this.anIntArray13 = new int[local32];
				for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
					this.anIntArray13[local38] = arg0.method333();
				}
			} else if (local14 >= 40 && local14 < 50) {
				this.anIntArray14[local14 - 40] = arg0.method333();
			} else if (local14 >= 50 && local14 < 60) {
				this.anIntArray15[local14 - 50] = arg0.method333();
			} else if (local14 >= 60 && local14 < 70) {
				this.anIntArray16[local14 - 60] = arg0.method333();
			} else {
				System.out.println("Error unrecognised config code: " + local14);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()Lclient!db;")
	public Class1_Sub3_Sub1 method54() {
		if (this.anIntArray13 == null) {
			return null;
		}
		@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray13.length];
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray13.length; local13++) {
			local11[local13] = new Class1_Sub3_Sub1(this.anIntArray13[local13], aBoolean16);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(local11.length, false, local11);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray14[local52] != 0; local52++) {
			local40.method166(this.anIntArray14[local52], this.anIntArray15[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Lclient!db;")
	public Class1_Sub3_Sub1 method55() {
		@Pc(10) Class1_Sub3_Sub1[] local10 = new Class1_Sub3_Sub1[5];
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray16[local14] != -1) {
				local10[local12++] = new Class1_Sub3_Sub1(this.anIntArray16[local14], aBoolean16);
			}
		}
		@Pc(45) Class1_Sub3_Sub1 local45 = new Class1_Sub3_Sub1(local12, false, local10);
		for (@Pc(47) int local47 = 0; local47 < 6 && this.anIntArray14[local47] != 0; local47++) {
			local45.method166(this.anIntArray14[local47], this.anIntArray15[local47]);
		}
		return local45;
	}
}
