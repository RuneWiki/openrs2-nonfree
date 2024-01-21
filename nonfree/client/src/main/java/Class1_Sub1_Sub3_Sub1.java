import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!y")
public final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!y", name = "hb", descriptor = "Lclient!yb;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!y", name = "fb", descriptor = "I")
	private int anInt726 = 3073;

	@OriginalMember(owner = "client!y", name = "gb", descriptor = "I")
	private int anInt727 = -1992;

	@OriginalMember(owner = "client!y", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method513() {
		try {
			if (this.aClass40_1 == null) {
				return null;
			} else if (super.anInt773 == -1 || super.anInt774 == -1) {
				return this.method505();
			} else {
				@Pc(20) Class1_Sub3_Sub1 local20 = this.method505();
				@Pc(25) Class15 local25 = Class15.aClass15Array1[super.anInt773];
				@Pc(41) Class1_Sub3_Sub1 local41 = new Class1_Sub3_Sub1(-428, true, local25.method292(), true, false, !local25.aBoolean102);
				local41.method212(0, 0, -super.anInt777);
				local41.method206();
				local41.method207(local25.aClass13_1.anIntArray130[super.anInt774]);
				local41.anIntArrayArray8 = null;
				local41.anIntArrayArray7 = null;
				local41.method216(64, 850, -30, -50, -30, true);
				@Pc(91) Class1_Sub3_Sub1[] local91 = new Class1_Sub3_Sub1[] { local20, local41 };
				@Pc(99) Class1_Sub3_Sub1 local99 = new Class1_Sub3_Sub1(true, true, local91, 2);
				if (this.aClass40_1.aByte28 == 1) {
					local99.aBoolean69 = true;
				}
				return local99;
			}
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("46619, " + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "c", descriptor = "(I)Lclient!eb;")
	private Class1_Sub3_Sub1 method505() {
		try {
			@Pc(14) int local14;
			if (super.anInt768 >= 0 && super.anInt771 == 0) {
				local14 = Class13.aClass13Array1[super.anInt768].anIntArray130[super.anInt769];
				@Pc(16) int local16 = -1;
				if (super.anInt765 >= 0 && super.anInt765 != super.anInt747) {
					local16 = Class13.aClass13Array1[super.anInt765].anIntArray130[super.anInt766];
				}
				return this.aClass40_1.method510(local14, local16, Class13.aClass13Array1[super.anInt768].anIntArray133);
			}
			local14 = -1;
			if (super.anInt765 >= 0) {
				local14 = Class13.aClass13Array1[super.anInt765].anIntArray130[super.anInt766];
			}
			@Pc(65) Class1_Sub3_Sub1 local65 = this.aClass40_1.method510(local14, -1, null);
			super.anInt786 = local65.anInt258;
			return local65;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("52198, " + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!y", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method516() {
		try {
			return this.aClass40_1 != null;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("10241, " + ", " + local12.toString());
			throw new RuntimeException();
		}
	}
}
