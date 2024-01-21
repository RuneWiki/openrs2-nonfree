import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PVFNGMTQ")
public final class Class3_Sub3_Sub2_Sub1_Sub1 extends Class3_Sub3_Sub2_Sub1 {

	@OriginalMember(owner = "client!PVFNGMTQ", name = "ub", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!PVFNGMTQ", name = "vb", descriptor = "Lclient!PJGEBWSY;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!PVFNGMTQ", name = "sb", descriptor = "I")
	private int anInt564 = -25668;

	@OriginalMember(owner = "client!PVFNGMTQ", name = "tb", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!PVFNGMTQ", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method400() {
		try {
			return this.aClass30_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("79040, " + 5 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PVFNGMTQ", name = "a", descriptor = "(I)Lclient!FCIDIKVY;")
	@Override
	protected Class3_Sub3_Sub2_Sub3 method525() {
		try {
			if (this.aClass30_1 == null) {
				return null;
			}
			@Pc(8) Class3_Sub3_Sub2_Sub3 local8 = this.method335();
			if (local8 == null) {
				return null;
			}
			super.anInt684 = local8.anInt793;
			if (super.anInt663 != -1 && super.anInt664 != -1) {
				@Pc(34) Class43 local34 = Class43.aClass43Array1[super.anInt663];
				@Pc(37) Class3_Sub3_Sub2_Sub3 local37 = local34.method516();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass46_1.anIntArray198[super.anInt664];
					@Pc(57) Class3_Sub3_Sub2_Sub3 local57 = new Class3_Sub3_Sub2_Sub3(false, Class12.method116(local46), true, local37, true);
					local57.method93(0, -super.anInt667, 0);
					local57.method87();
					local57.method88(local46);
					local57.anIntArrayArray3 = null;
					local57.anIntArrayArray2 = null;
					if (local34.anInt758 != 128 || local34.anInt759 != 128) {
						local57.method96(local34.anInt758, local34.anInt758, this.aBoolean136, local34.anInt759);
					}
					local57.method97(local34.anInt761 + 64, local34.anInt762 + 850, -30, -50, -30, true);
					@Pc(121) Class3_Sub3_Sub2_Sub3[] local121 = new Class3_Sub3_Sub2_Sub3[] { local8, local57 };
					local8 = new Class3_Sub3_Sub2_Sub3(true, local121, true, 2);
				}
			}
			if (this.aClass30_1.aByte21 == 1) {
				local8.aBoolean44 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("2053, " + 0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PVFNGMTQ", name = "a", descriptor = "(B)Lclient!FCIDIKVY;")
	private Class3_Sub3_Sub2_Sub3 method335() {
		try {
			@Pc(14) int local14;
			if (super.anInt678 < 0 || super.anInt681 != 0) {
				local14 = -1;
				if (super.anInt644 >= 0) {
					local14 = Class46.aClass46Array1[super.anInt644].anIntArray198[super.anInt645];
				}
				return this.aClass30_1.method325(null, local14, -1);
			}
			local14 = Class46.aClass46Array1[super.anInt678].anIntArray198[super.anInt679];
			@Pc(16) int local16 = -1;
			if (super.anInt644 >= 0 && super.anInt644 != super.anInt689) {
				local16 = Class46.aClass46Array1[super.anInt644].anIntArray198[super.anInt645];
			}
			return this.aClass30_1.method325(Class46.aClass46Array1[super.anInt678].anIntArray201, local14, local16);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("91691, " + 8 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
