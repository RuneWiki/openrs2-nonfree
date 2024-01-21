import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	private int anInt1041;

	@OriginalMember(owner = "client!z", name = "sb", descriptor = "Lclient!hc;")
	public Class15 aClass15_2;

	@OriginalMember(owner = "client!z", name = "pb", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			if (this.aClass15_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method699();
			if (local8 == null) {
				return null;
			}
			super.anInt1035 = local8.anInt992;
			if (super.anInt1022 != -1 && super.anInt1023 != -1) {
				@Pc(36) Class35 local36 = Class35.aClass35Array1[super.anInt1022];
				@Pc(39) Class1_Sub1_Sub1_Sub5 local39 = local36.method546();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass29_2.anIntArray237[super.anInt1023];
					@Pc(59) Class1_Sub1_Sub1_Sub5 local59 = new Class1_Sub1_Sub1_Sub5(false, -164, local39, true, Class12.method304(local48));
					local59.method269(-super.anInt1026, 0, 0);
					local59.method263(this.anInt1041);
					local59.method264(local48);
					local59.anIntArrayArray9 = null;
					local59.anIntArrayArray8 = null;
					if (local36.anInt845 != 128 || local36.anInt846 != 128) {
						local59.method272(local36.anInt845, local36.anInt845, local36.anInt846);
					}
					local59.method273(local36.anInt848 + 64, local36.anInt849 + 850, -30, -50, -30, true);
					@Pc(123) Class1_Sub1_Sub1_Sub5[] local123 = new Class1_Sub1_Sub1_Sub5[] { local8, local59 };
					local8 = new Class1_Sub1_Sub1_Sub5(2, true, local123, 144);
				}
			}
			if (this.aClass15_2.aByte26 == 1) {
				local8.aBoolean109 = true;
			}
			return local8;
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("81625, " + -21173 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "b", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method699() {
		try {
			@Pc(24) int local24;
			if (super.anInt1017 < 0 || super.anInt1020 != 0) {
				local24 = -1;
				if (super.anInt1014 >= 0) {
					local24 = Class29.aClass29Array1[super.anInt1014].anIntArray237[super.anInt1015];
				}
				return this.aClass15_2.method354(this.aBoolean241, -1, local24, null);
			}
			local24 = Class29.aClass29Array1[super.anInt1017].anIntArray237[super.anInt1018];
			@Pc(26) int local26 = -1;
			if (super.anInt1014 >= 0 && super.anInt1014 != super.anInt998) {
				local26 = Class29.aClass29Array1[super.anInt1014].anIntArray237[super.anInt1015];
			}
			return this.aClass15_2.method354(this.aBoolean241, local26, local24, Class29.aClass29Array1[super.anInt1017].anIntArray240);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("71479, " + true + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method697() {
		try {
			return this.aClass15_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("69090, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
