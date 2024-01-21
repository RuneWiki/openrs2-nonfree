import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SBPCMLRM")
public final class Class2_Sub1_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!SBPCMLRM", name = "pb", descriptor = "Lclient!YGGALXYD;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!SBPCMLRM", name = "ob", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(Z)Lclient!CYPZUKMB;")
	private Class2_Sub1_Sub1_Sub2 method436() {
		try {
			@Pc(14) int local14;
			if (super.anInt573 < 0 || super.anInt576 != 0) {
				local14 = -1;
				if (super.anInt562 >= 0) {
					local14 = Class10.aClass10Array1[super.anInt562].anIntArray68[super.anInt563];
				}
				return this.aClass45_1.method510(-1, local14, null);
			}
			local14 = Class10.aClass10Array1[super.anInt573].anIntArray68[super.anInt574];
			@Pc(16) int local16 = -1;
			if (super.anInt562 >= 0 && super.anInt562 != super.anInt549) {
				local16 = Class10.aClass10Array1[super.anInt562].anIntArray68[super.anInt563];
			}
			return this.aClass45_1.method510(local16, local14, Class10.aClass10Array1[super.anInt573].anIntArray71);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("72079, " + true + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(B)Lclient!CYPZUKMB;")
	@Override
	protected Class2_Sub1_Sub1_Sub2 method455() {
		try {
			if (this.aClass45_1 == null) {
				return null;
			}
			@Pc(8) Class2_Sub1_Sub1_Sub2 local8 = this.method436();
			if (local8 == null) {
				return null;
			}
			super.anInt554 = local8.anInt599;
			if (super.anInt535 != -1 && super.anInt536 != -1) {
				@Pc(36) Class4 local36 = Class4.aClass4Array1[super.anInt535];
				@Pc(39) Class2_Sub1_Sub1_Sub2 local39 = local36.method19();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass10_1.anIntArray68[super.anInt536];
					@Pc(59) Class2_Sub1_Sub1_Sub2 local59 = new Class2_Sub1_Sub1_Sub2(Class32.method374(local48), local39, false, false, true);
					local59.method104(0, -super.anInt539, 0);
					local59.method98();
					local59.method99(257, local48);
					local59.anIntArrayArray6 = null;
					local59.anIntArrayArray5 = null;
					if (local36.anInt44 != 128 || local36.anInt45 != 128) {
						local59.method107(local36.anInt44, local36.anInt45, local36.anInt44);
					}
					local59.method108(local36.anInt47 + 64, local36.anInt48 + 850, -30, -50, -30, true);
					@Pc(122) Class2_Sub1_Sub1_Sub2[] local122 = new Class2_Sub1_Sub1_Sub2[] { local8, local59 };
					local8 = new Class2_Sub1_Sub1_Sub2(153, true, 2, local122);
				}
			}
			if (this.aClass45_1.aByte22 == 1) {
				local8.aBoolean33 = true;
			}
			return local8;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("77205, " + -99 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SBPCMLRM", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method446() {
		try {
			return this.aClass45_1 != null;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("29578, " + 21781 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}
}
