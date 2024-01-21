import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	public static int anInt427;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "B")
	private static byte aByte33 = 8;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "B")
	private static byte aByte34 = 4;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	public int anInt428 = -1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[I")
	private int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Z")
	public boolean aBoolean106 = false;

	static {
		aBoolean105 = true;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method302(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method528(aByte34, "idk.dat", null), 0);
			anInt427 = local9.method385();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt427];
			}
			for (@Pc(23) int local23 = 0; local23 < anInt427; local23++) {
				if (aClass13Array1[local23] == null) {
					aClass13Array1[local23] = new Class13();
				}
				aClass13Array1[local23].method303(aByte33, local9);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("93832, " + 4 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method303(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0 == 8) {
				@Pc(6) boolean local6 = false;
			}
			while (true) {
				while (true) {
					@Pc(17) int local17 = arg1.method383();
					if (local17 == 0) {
						return;
					}
					if (local17 == 1) {
						this.anInt428 = arg1.method383();
					} else if (local17 == 2) {
						@Pc(35) int local35 = arg1.method383();
						this.anIntArray143 = new int[local35];
						for (@Pc(41) int local41 = 0; local41 < local35; local41++) {
							this.anIntArray143[local41] = arg1.method385();
						}
					} else if (local17 == 3) {
						this.aBoolean106 = true;
					} else if (local17 >= 40 && local17 < 50) {
						this.anIntArray144[local17 - 40] = arg1.method385();
					} else if (local17 >= 50 && local17 < 60) {
						this.anIntArray145[local17 - 50] = arg1.method385();
					} else if (local17 >= 60 && local17 < 70) {
						this.anIntArray146[local17 - 60] = arg1.method385();
					} else {
						System.out.println("Error unrecognised config code: " + local17);
					}
				}
			}
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("5456, " + arg0 + ", " + arg1 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method304() {
		if (this.anIntArray143 == null) {
			return null;
		}
		@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray143.length];
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray143.length; local13++) {
			local11[local13] = new Class1_Sub3_Sub1(this.anIntArray143[local13], 6);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(20363, local11, local11.length);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray144[local52] != 0; local52++) {
			local40.method236(this.anIntArray144[local52], this.anIntArray145[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method305(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(8) Class1_Sub3_Sub1[] local8 = new Class1_Sub3_Sub1[5];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
				if (this.anIntArray146[local12] != -1) {
					local8[local10++] = new Class1_Sub3_Sub1(this.anIntArray146[local12], 6);
				}
			}
			@Pc(43) Class1_Sub3_Sub1 local43 = new Class1_Sub3_Sub1(20363, local8, local10);
			for (@Pc(45) int local45 = 0; local45 < 6 && this.anIntArray144[local45] != 0; local45++) {
				local43.method236(this.anIntArray144[local45], this.anIntArray145[local45]);
			}
			return local43;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("31899, " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
