import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gc")
public final class Class13 {

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!gc", name = "b", descriptor = "I")
	private static int anInt431;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	public static int anInt432;

	@OriginalMember(owner = "client!gc", name = "d", descriptor = "[Lclient!gc;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "[I")
	private int[] anIntArray143;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	public int anInt433 = -1;

	@OriginalMember(owner = "client!gc", name = "g", descriptor = "[I")
	private int[] anIntArray144 = new int[6];

	@OriginalMember(owner = "client!gc", name = "h", descriptor = "[I")
	private int[] anIntArray145 = new int[6];

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "[I")
	private int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!gc", name = "j", descriptor = "Z")
	public boolean aBoolean103 = false;

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method304(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(14) Class1_Sub3_Sub3 local14 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "idk.dat"));
			anInt432 = local14.method393();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt432];
			}
			for (@Pc(24) int local24 = 0; local24 < anInt432; local24++) {
				if (aClass13Array1[local24] == null) {
					aClass13Array1[local24] = new Class13();
				}
				aClass13Array1[local24].method305(local14);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("1209, " + -5880 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method305(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			while (true) {
				@Pc(12) int local12 = arg0.method391();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt433 = arg0.method391();
				} else if (local12 == 2) {
					@Pc(30) int local30 = arg0.method391();
					this.anIntArray143 = new int[local30];
					for (@Pc(36) int local36 = 0; local36 < local30; local36++) {
						this.anIntArray143[local36] = arg0.method393();
					}
				} else if (local12 == 3) {
					this.aBoolean103 = true;
				} else if (local12 >= 40 && local12 < 50) {
					this.anIntArray144[local12 - 40] = arg0.method393();
				} else if (local12 >= 50 && local12 < 60) {
					this.anIntArray145[local12 - 50] = arg0.method393();
				} else if (local12 >= 60 && local12 < 70) {
					this.anIntArray146[local12 - 60] = arg0.method393();
				} else {
					System.out.println("Error unrecognised config code: " + local12);
				}
			}
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("85080, " + arg0 + ", " + true + ", " + local117.toString());
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
			local11[local13] = new Class1_Sub3_Sub1(this.anIntArray143[local13], (byte) 1);
		}
		@Pc(40) Class1_Sub3_Sub1 local40;
		if (local11.length == 1) {
			local40 = local11[0];
		} else {
			local40 = new Class1_Sub3_Sub1(-406, local11, local11.length);
		}
		for (@Pc(52) int local52 = 0; local52 < 6 && this.anIntArray144[local52] != 0; local52++) {
			local40.method237(this.anIntArray144[local52], this.anIntArray145[local52]);
		}
		return local40;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub1 method307() {
		try {
			@Pc(4) Class1_Sub3_Sub1[] local4 = new Class1_Sub3_Sub1[5];
			@Pc(6) int local6 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray146[local14] != -1) {
					local4[local6++] = new Class1_Sub3_Sub1(this.anIntArray146[local14], (byte) 1);
				}
			}
			@Pc(45) Class1_Sub3_Sub1 local45 = new Class1_Sub3_Sub1(-406, local4, local6);
			for (@Pc(47) int local47 = 0; local47 < 6 && this.anIntArray144[local47] != 0; local47++) {
				local45.method237(this.anIntArray144[local47], this.anIntArray145[local47]);
			}
			return local45;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("68027, " + -284 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}
}
