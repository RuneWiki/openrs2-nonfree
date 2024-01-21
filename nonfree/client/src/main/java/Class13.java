import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	public static int anInt436;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private static int anInt435 = 3;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	public int anInt437 = -1;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[I")
	private int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method302(@OriginalArg(0) Class39 arg0) {
		try {
			if (anInt435 != 3) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(21) Class1_Sub3_Sub3 local21 = new Class1_Sub3_Sub3(0, arg0.method528("idk.dat", null));
			anInt436 = local21.method385();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt436];
			}
			for (@Pc(31) int local31 = 0; local31 < anInt436; local31++) {
				if (aClass13Array1[local31] == null) {
					aClass13Array1[local31] = new Class13();
				}
				aClass13Array1[local31].method303(local21);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("40661, " + arg0 + ", " + 3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!kb;I)V")
	private void method303(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method383();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt437 = arg0.method383();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method383();
					this.anIntArray143 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray143[local37] = arg0.method385();
					}
				} else if (local13 == 3) {
					this.aBoolean98 = true;
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray144[local13 - 40] = arg0.method385();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray145[local13 - 50] = arg0.method385();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray146[local13 - 60] = arg0.method385();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("73104, " + arg0 + ", " + 0 + ", " + local118.toString());
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
			local11[local13] = new Class1_Sub3_Sub1(0, this.anIntArray143[local13]);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(6, local11.length, local11);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray144[local52] != 0; local52++) {
			local40.method236(this.anIntArray144[local52], this.anIntArray145[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method305() {
		try {
			@Pc(4) Class1_Sub3_Sub1[] local4 = new Class1_Sub3_Sub1[5];
			@Pc(6) int local6 = 0;
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray146[local15] != -1) {
					local4[local6++] = new Class1_Sub3_Sub1(0, this.anIntArray146[local15]);
				}
			}
			@Pc(46) Class1_Sub3_Sub1 local46 = new Class1_Sub3_Sub1(6, local6, local4);
			for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray144[local48] != 0; local48++) {
				local46.method236(this.anIntArray144[local48], this.anIntArray145[local48]);
			}
			return local46;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("32230, " + 2 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
