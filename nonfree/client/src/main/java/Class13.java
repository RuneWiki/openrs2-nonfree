import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "I")
	private static int anInt435;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "I")
	public static int anInt437;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private static int anInt436 = 473;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "I")
	public int anInt438 = -1;

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "[I")
	private int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gc", name = "k", descriptor = "Z")
	public boolean aBoolean101 = false;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method304(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(363, arg0.method536("idk.dat", null));
			anInt437 = local9.method393();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt437];
			}
			for (@Pc(19) int local19 = 0; local19 < anInt437; local19++) {
				if (aClass13Array1[local19] == null) {
					aClass13Array1[local19] = new Class13();
				}
				aClass13Array1[local19].method305(local9);
			}
			@Pc(45) boolean local45 = false;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("89502, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method305(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method391();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt438 = arg0.method391();
				} else if (local8 == 2) {
					@Pc(26) int local26 = arg0.method391();
					this.anIntArray143 = new int[local26];
					for (@Pc(32) int local32 = 0; local32 < local26; local32++) {
						this.anIntArray143[local32] = arg0.method393();
					}
				} else if (local8 == 3) {
					this.aBoolean101 = true;
				} else if (local8 >= 40 && local8 < 50) {
					this.anIntArray144[local8 - 40] = arg0.method393();
				} else if (local8 >= 50 && local8 < 60) {
					this.anIntArray145[local8 - 50] = arg0.method393();
				} else if (local8 >= 60 && local8 < 70) {
					this.anIntArray146[local8 - 60] = arg0.method393();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("61151, " + false + ", " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub3_Sub1 method306() {
		if (this.anIntArray143 == null) {
			return null;
		}
		@Pc(11) Class1_Sub3_Sub1[] local11 = new Class1_Sub3_Sub1[this.anIntArray143.length];
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray143.length; local13++) {
			local11[local13] = new Class1_Sub3_Sub1(false, this.anIntArray143[local13]);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(0, local11, local11.length);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray144[local52] != 0; local52++) {
			local40.method237(this.anIntArray144[local52], this.anIntArray145[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub3_Sub1 method307() {
		try {
			@Pc(4) Class1_Sub3_Sub1[] local4 = new Class1_Sub3_Sub1[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray146[local8] != -1) {
					local4[local6++] = new Class1_Sub3_Sub1(false, this.anIntArray146[local8]);
				}
			}
			@Pc(39) Class1_Sub3_Sub1 local39 = new Class1_Sub3_Sub1(0, local4, local6);
			for (@Pc(41) int local41 = 0; local41 < 6 && this.anIntArray144[local41] != 0; local41++) {
				local39.method237(this.anIntArray144[local41], this.anIntArray145[local41]);
			}
			return local39;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("19364, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
