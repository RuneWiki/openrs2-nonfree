import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "vb", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!z", name = "xb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "Z")
	private boolean aBoolean253 = true;

	@OriginalMember(owner = "client!z", name = "wb", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method682();
			if (local8 == null) {
				return null;
			}
			super.anInt1050 = local8.anInt1005;
			if (super.anInt1037 != -1 && super.anInt1038 != -1) {
				@Pc(39) Class33 local39 = Class33.aClass33Array1[super.anInt1037];
				@Pc(42) Class1_Sub1_Sub1_Sub5 local42 = local39.method523();
				if (local42 != null) {
					@Pc(51) int local51 = local39.aClass27_2.anIntArray225[super.anInt1038];
					@Pc(63) Class1_Sub1_Sub1_Sub5 local63 = new Class1_Sub1_Sub1_Sub5(false, -16051, local42, Class12.method306(local51, this.aBoolean253), true);
					local63.method274(-super.anInt1041, 0, 0);
					local63.method268();
					local63.method269(local51);
					local63.anIntArrayArray9 = null;
					local63.anIntArrayArray8 = null;
					if (local39.anInt847 != 128 || local39.anInt848 != 128) {
						local63.method277(local39.anInt847, local39.anInt847, local39.anInt848);
					}
					local63.method278(local39.anInt850 + 64, local39.anInt851 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub1_Sub1_Sub5[] local126 = new Class1_Sub1_Sub1_Sub5[] { local8, local63 };
					local8 = new Class1_Sub1_Sub1_Sub5(3, local126, true, 2);
				}
			}
			if (this.aClass13_2.aByte26 == 1) {
				local8.aBoolean123 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("59816, " + -47094 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method682() {
		try {
			@Pc(14) int local14;
			if (super.anInt1032 < 0 || super.anInt1035 != 0) {
				local14 = -1;
				if (super.anInt1029 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt1029].anIntArray225[super.anInt1030];
				}
				return this.aClass13_2.method325(local14, -1, null);
			}
			local14 = Class27.aClass27Array1[super.anInt1032].anIntArray225[super.anInt1033];
			@Pc(16) int local16 = -1;
			if (super.anInt1029 >= 0 && super.anInt1029 != super.anInt1013) {
				local16 = Class27.aClass27Array1[super.anInt1029].anIntArray225[super.anInt1030];
			}
			return this.aClass13_2.method325(local14, local16, Class27.aClass27Array1[super.anInt1032].anIntArray228);
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("65769, " + true + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method680() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("35001, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
