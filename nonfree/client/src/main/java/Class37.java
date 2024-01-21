import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RHGWIWMQ")
public final class Class37 {

	@OriginalMember(owner = "client!RHGWIWMQ", name = "b", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "c", descriptor = "[Lclient!RHGWIWMQ;")
	public static Class37[] aClass37Array1;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "a", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "e", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "d", descriptor = "I")
	public int anInt628 = -1;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "f", descriptor = "[I")
	private int[] anIntArray160 = new int[6];

	@OriginalMember(owner = "client!RHGWIWMQ", name = "g", descriptor = "[I")
	private int[] anIntArray161 = new int[6];

	@OriginalMember(owner = "client!RHGWIWMQ", name = "h", descriptor = "[I")
	private int[] anIntArray162 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!RHGWIWMQ", name = "i", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!RHGWIWMQ", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method405(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub2 local8 = new Class1_Sub1_Sub2(false, arg0.method340("idk.dat", null));
			anInt627 = local8.method24();
			if (aClass37Array1 == null) {
				aClass37Array1 = new Class37[anInt627];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt627; local21++) {
				if (aClass37Array1[local21] == null) {
					aClass37Array1[local21] = new Class37();
				}
				aClass37Array1[local21].method406(674, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("64904, " + arg0 + ", " + 0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "<init>", descriptor = "()V")
	private Class37() {
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private void method406(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method22();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt628 = arg1.method22();
					} else if (local8 == 2) {
						@Pc(26) int local26 = arg1.method22();
						this.anIntArray159 = new int[local26];
						for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
							this.anIntArray159[local32] = arg1.method24();
						}
					} else if (local8 == 3) {
						this.aBoolean148 = true;
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray160[local8 - 40] = arg1.method24();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray161[local8 - 50] = arg1.method24();
					} else if (local8 >= 60 && local8 < 70) {
						this.anIntArray162[local8 - 60] = arg1.method24();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("75463, " + arg0 + ", " + arg1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "a", descriptor = "(I)Z")
	public boolean method407() {
		try {
			if (this.anIntArray159 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray159.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub4.method240(this.anIntArray159[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("4498, " + 6 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "b", descriptor = "(I)Lclient!JLNSJQDR;")
	public Class1_Sub1_Sub1_Sub4 method408() {
		try {
			if (this.anIntArray159 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub4[] local11 = new Class1_Sub1_Sub1_Sub4[this.anIntArray159.length];
			for (@Pc(19) int local19 = 0; local19 < this.anIntArray159.length; local19++) {
				local11[local19] = Class1_Sub1_Sub1_Sub4.method239(this.anIntArray159[local19]);
			}
			@Pc(44) Class1_Sub1_Sub1_Sub4 local44;
			if (local11.length == 1) {
				local44 = local11[0];
			} else {
				local44 = new Class1_Sub1_Sub1_Sub4(9, local11.length, local11);
			}
			for (@Pc(56) int local56 = 0; local56 < 6 && this.anIntArray160[local56] != 0; local56++) {
				local44.method253(this.anIntArray160[local56], this.anIntArray161[local56]);
			}
			return local44;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("55381, " + -233 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "c", descriptor = "(I)Z")
	public boolean method409() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray162[local9] != -1 && !Class1_Sub1_Sub1_Sub4.method240(this.anIntArray162[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("36362, " + 584 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RHGWIWMQ", name = "d", descriptor = "(I)Lclient!JLNSJQDR;")
	public Class1_Sub1_Sub1_Sub4 method410() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub4[] local4 = new Class1_Sub1_Sub1_Sub4[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray162[local14] != -1) {
					local4[local12++] = Class1_Sub1_Sub1_Sub4.method239(this.anIntArray162[local14]);
				}
			}
			@Pc(43) Class1_Sub1_Sub1_Sub4 local43 = new Class1_Sub1_Sub1_Sub4(9, local12, local4);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray160[local45] != 0; local45++) {
				local43.method253(this.anIntArray160[local45], this.anIntArray161[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("31062, " + 719 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
