import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IGOBKPZP")
public final class Class1_Sub1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!IGOBKPZP", name = "sb", descriptor = "Lclient!TQRZOVPP;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!IGOBKPZP", name = "qb", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!IGOBKPZP", name = "rb", descriptor = "I")
	private int anInt297 = -131;

	@OriginalMember(owner = "client!IGOBKPZP", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			if (this.aClass37_1 == null) {
				return null;
			}
			@Pc(13) Class1_Sub1_Sub1_Sub2 local13 = this.method206((byte) 7);
			if (local13 == null) {
				return null;
			}
			super.anInt430 = local13.anInt784;
			if (super.anInt398 != -1 && super.anInt399 != -1) {
				@Pc(34) Class18 local34 = Class18.aClass18Array1[super.anInt398];
				@Pc(37) Class1_Sub1_Sub1_Sub2 local37 = local34.method234();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass46_2.anIntArray198[super.anInt399];
					@Pc(58) Class1_Sub1_Sub1_Sub2 local58 = new Class1_Sub1_Sub1_Sub2(0, local37, true, Class31.method388(this.aBoolean65, local46), false);
					local58.method156(-super.anInt402, 0, 0);
					local58.method150();
					local58.method151(local46);
					local58.anIntArrayArray5 = null;
					local58.anIntArrayArray4 = null;
					if (local34.anInt317 != 128 || local34.anInt318 != 128) {
						local58.method159(local34.anInt317, local34.anInt317, local34.anInt318);
					}
					local58.method160(local34.anInt320 + 64, local34.anInt321 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub2[] local121 = new Class1_Sub1_Sub1_Sub2[] { local13, local58 };
					local13 = new Class1_Sub1_Sub1_Sub2(true, local121, -4860, 2);
				}
			}
			if (this.aClass37_1.aByte17 == 1) {
				local13.aBoolean46 = true;
			}
			return local13;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("20226, " + false + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGOBKPZP", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method264() {
		try {
			return this.aClass37_1 != null;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("73559, " + 38 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGOBKPZP", name = "b", descriptor = "(B)Lclient!GCSAWSJV;")
	private Class1_Sub1_Sub1_Sub2 method206(@OriginalArg(0) byte arg0) {
		try {
			@Pc(14) int local14;
			if (super.anInt419 < 0 || super.anInt422 != 0) {
				local14 = -1;
				@Pc(52) boolean local52 = false;
				if (super.anInt416 >= 0) {
					local14 = Class46.aClass46Array1[super.anInt416].anIntArray198[super.anInt417];
				}
				return this.aClass37_1.method486(-1, null, local14);
			}
			local14 = Class46.aClass46Array1[super.anInt419].anIntArray198[super.anInt420];
			@Pc(16) int local16 = -1;
			if (super.anInt416 >= 0 && super.anInt416 != super.anInt411) {
				local16 = Class46.aClass46Array1[super.anInt416].anIntArray198[super.anInt417];
			}
			return this.aClass37_1.method486(local16, Class46.aClass46Array1[super.anInt419].anIntArray201, local14);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("99029, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
