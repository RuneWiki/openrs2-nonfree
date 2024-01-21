import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!z", name = "ub", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "I")
	private int anInt1028 = 8;

	@OriginalMember(owner = "client!z", name = "tb", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method672() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method678();
			if (local8 == null) {
				return null;
			}
			super.anInt1021 = local8.anInt979;
			if (super.anInt1008 != -1 && super.anInt1009 != -1) {
				@Pc(36) Class33 local36 = Class33.aClass33Array1[super.anInt1008];
				@Pc(39) Class1_Sub1_Sub1_Sub5 local39 = local36.method519();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass27_2.anIntArray224[super.anInt1009];
					@Pc(60) Class1_Sub1_Sub1_Sub5 local60 = new Class1_Sub1_Sub1_Sub5(local39, Class12.method304(local48), false, this.anInt1027, true);
					local60.method273(-super.anInt1012, 0, (byte) 2, 0);
					local60.method267((byte) 3);
					local60.method268(local48, 188);
					local60.anIntArrayArray9 = null;
					local60.anIntArrayArray8 = null;
					if (local36.anInt819 != 128 || local36.anInt820 != 128) {
						local60.method276(local36.anInt819, local36.anInt819, local36.anInt820);
					}
					local60.method277(local36.anInt822 + 64, local36.anInt823 + 850, -30, -50, -30, true);
					@Pc(123) Class1_Sub1_Sub1_Sub5[] local123 = new Class1_Sub1_Sub1_Sub5[] { local8, local60 };
					local8 = new Class1_Sub1_Sub1_Sub5(true, 0, local123, 2);
				}
			}
			if (this.aClass13_2.aByte25 == 1) {
				local8.aBoolean120 = true;
			}
			return local8;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("15988, " + -37770 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method678() {
		try {
			@Pc(24) int local24;
			if (super.anInt1003 < 0 || super.anInt1006 != 0) {
				local24 = -1;
				if (super.anInt1000 >= 0) {
					local24 = Class27.aClass27Array1[super.anInt1000].anIntArray224[super.anInt1001];
				}
				return this.aClass13_2.method323(-1, local24, null);
			}
			local24 = Class27.aClass27Array1[super.anInt1003].anIntArray224[super.anInt1004];
			@Pc(26) int local26 = -1;
			if (super.anInt1000 >= 0 && super.anInt1000 != super.anInt984) {
				local26 = Class27.aClass27Array1[super.anInt1000].anIntArray224[super.anInt1001];
			}
			return this.aClass13_2.method323(local26, local24, Class27.aClass27Array1[super.anInt1003].anIntArray227);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("99332, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method676() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("4937, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
