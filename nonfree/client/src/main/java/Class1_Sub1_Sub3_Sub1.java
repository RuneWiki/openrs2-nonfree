import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "gb", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!y", name = "ib", descriptor = "Lclient!bc;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!y", name = "hb", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method568() {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt920 == -1 || super.anInt921 == -1) {
				return this.method560();
			} else {
				@Pc(20) Class1_Sub3_Sub1 local20 = this.method560();
				@Pc(25) Class21 local25 = Class21.aClass21Array1[super.anInt920];
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(local25.method409(), true, !local25.aBoolean131, this.anInt884, false);
				local41.method236(-super.anInt924, 0, 0);
				local41.method230();
				local41.method231(local25.aClass19_1.anIntArray186[super.anInt921]);
				local41.anIntArrayArray7 = null;
				local41.anIntArrayArray6 = null;
				if (local25.anInt571 != 128 || local25.anInt572 != 128) {
					local41.method239(local25.anInt571, local25.anInt572, local25.anInt571);
				}
				local41.method240(local25.anInt574 + 64, local25.anInt575 + 850, -30, -50, -30, true);
				@Pc(115) Class1_Sub3_Sub1[] local115 = new Class1_Sub3_Sub1[] { local20, local41 };
				@Pc(123) Class1_Sub3_Sub1 local123 = new Class1_Sub3_Sub1(local115, (byte) -31, 2, true);
				if (this.aClass3_1.aByte4 == 1) {
					local123.aBoolean84 = true;
				}
				return local123;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("64857, " + true + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "c", descriptor = "(Z)Lclient!eb;")
	private Class1_Sub3_Sub1 method560() {
		try {
			@Pc(14) int local14;
			if (super.anInt915 >= 0 && super.anInt918 == 0) {
				local14 = Class19.aClass19Array1[super.anInt915].anIntArray186[super.anInt916];
				@Pc(16) int local16 = -1;
				if (super.anInt912 >= 0 && super.anInt912 != super.anInt894) {
					local16 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
				}
				return this.aClass3_1.method34(local14, local16, Class19.aClass19Array1[super.anInt915].anIntArray189);
			}
			local14 = -1;
			if (super.anInt912 >= 0) {
				local14 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
			}
			@Pc(71) Class1_Sub3_Sub1 local71 = this.aClass3_1.method34(local14, -1, null);
			super.anInt933 = local71.anInt368;
			return local71;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("9268, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method571() {
		try {
			return this.aClass3_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("55429, " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
