import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!z", name = "rb", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "qb", descriptor = "I")
	private int anInt1008 = 628;

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			if (this.aClass13_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub5 local8 = this.method675();
			if (local8 == null) {
				return null;
			}
			super.anInt1002 = local8.anInt959;
			if (super.anInt989 != -1 && super.anInt990 != -1) {
				@Pc(34) Class33 local34 = Class33.aClass33Array1[super.anInt989];
				@Pc(37) Class1_Sub1_Sub1_Sub5 local37 = local34.method515();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass27_2.anIntArray222[super.anInt990];
					@Pc(57) Class1_Sub1_Sub1_Sub5 local57 = new Class1_Sub1_Sub1_Sub5(false, true, local37, Class12.method303(local46, 681), 9);
					local57.method272(0, -super.anInt993, 0);
					local57.method266();
					local57.method267(local46);
					local57.anIntArrayArray9 = null;
					local57.anIntArrayArray8 = null;
					if (local34.anInt804 != 128 || local34.anInt805 != 128) {
						local57.method275(local34.anInt804, local34.anInt805, local34.anInt804);
					}
					local57.method276(local34.anInt807 + 64, local34.anInt808 + 850, -30, -50, -30, true);
					@Pc(120) Class1_Sub1_Sub1_Sub5[] local120 = new Class1_Sub1_Sub1_Sub5[] { local8, local57 };
					local8 = new Class1_Sub1_Sub1_Sub5(-638, true, local120, 2);
				}
			}
			if (this.aClass13_2.aByte19 == 1) {
				local8.aBoolean126 = true;
			}
			return local8;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("64621, " + 0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(B)Lclient!eb;")
	private Class1_Sub1_Sub1_Sub5 method675() {
		try {
			@Pc(14) int local14;
			if (super.anInt984 < 0 || super.anInt987 != 0) {
				local14 = -1;
				if (super.anInt981 >= 0) {
					local14 = Class27.aClass27Array1[super.anInt981].anIntArray222[super.anInt982];
				}
				return this.aClass13_2.method322(local14, null, -1);
			}
			local14 = Class27.aClass27Array1[super.anInt984].anIntArray222[super.anInt985];
			@Pc(16) int local16 = -1;
			if (super.anInt981 >= 0 && super.anInt981 != super.anInt965) {
				local16 = Class27.aClass27Array1[super.anInt981].anIntArray222[super.anInt982];
			}
			return this.aClass13_2.method322(local14, Class27.aClass27Array1[super.anInt984].anIntArray225, local16);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("76077, " + 40 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!z", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method673() {
		try {
			return this.aClass13_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("29256, " + -948 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}
}
