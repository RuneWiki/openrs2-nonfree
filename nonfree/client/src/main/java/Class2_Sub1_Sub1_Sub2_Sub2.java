import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZHNLOFBM")
public final class Class2_Sub1_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ZHNLOFBM", name = "pb", descriptor = "I")
	private int anInt815;

	@OriginalMember(owner = "client!ZHNLOFBM", name = "rb", descriptor = "Lclient!YXSRFNQD;")
	public Class48 aClass48_2;

	@OriginalMember(owner = "client!ZHNLOFBM", name = "qb", descriptor = "I")
	private int anInt816 = 8;

	@OriginalMember(owner = "client!ZHNLOFBM", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			if (this.aClass48_2 == null) {
				return null;
			}
			@Pc(8) Class2_Sub1_Sub1_Sub6 local8 = this.method571();
			if (local8 == null) {
				return null;
			}
			super.anInt800 = local8.anInt767;
			if (super.anInt768 != -1 && super.anInt769 != -1) {
				@Pc(34) Class16 local34 = Class16.aClass16Array1[super.anInt768];
				@Pc(37) Class2_Sub1_Sub1_Sub6 local37 = local34.method151();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass22_2.anIntArray92[super.anInt769];
					@Pc(57) Class2_Sub1_Sub1_Sub6 local57 = new Class2_Sub1_Sub1_Sub6(-18434, true, local37, Class29.method419(local46), false);
					local57.method398(-super.anInt772, this.anInt815, 0, 0);
					local57.method392();
					local57.method393((byte) 9, local46);
					local57.anIntArrayArray16 = null;
					local57.anIntArrayArray15 = null;
					if (local34.anInt241 != 128 || local34.anInt242 != 128) {
						local57.method401(local34.anInt241, local34.anInt241, local34.anInt242);
					}
					local57.method402(local34.anInt244 + 64, local34.anInt245 + 850, -30, -50, -30, true);
					@Pc(121) Class2_Sub1_Sub1_Sub6[] local121 = new Class2_Sub1_Sub1_Sub6[] { local8, local57 };
					local8 = new Class2_Sub1_Sub1_Sub6(2, true, 0, local121);
				}
			}
			if (this.aClass48_2.aByte25 == 1) {
				local8.aBoolean129 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("71243, " + 0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZHNLOFBM", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method568(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				throw new NullPointerException();
			}
			return this.aClass48_2 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("19793, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZHNLOFBM", name = "a", descriptor = "(B)Lclient!OGORHYVW;")
	private Class2_Sub1_Sub1_Sub6 method571() {
		try {
			@Pc(14) int local14;
			if (super.anInt791 < 0 || super.anInt794 != 0) {
				local14 = -1;
				if (super.anInt797 >= 0) {
					local14 = Class22.aClass22Array1[super.anInt797].anIntArray92[super.anInt798];
				}
				return this.aClass48_2.method557(null, -1, local14);
			}
			local14 = Class22.aClass22Array1[super.anInt791].anIntArray92[super.anInt792];
			@Pc(16) int local16 = -1;
			if (super.anInt797 >= 0 && super.anInt797 != super.anInt804) {
				local16 = Class22.aClass22Array1[super.anInt797].anIntArray92[super.anInt798];
			}
			return this.aClass48_2.method557(Class22.aClass22Array1[super.anInt791].anIntArray95, local16, local14);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("45659, " + -94 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
