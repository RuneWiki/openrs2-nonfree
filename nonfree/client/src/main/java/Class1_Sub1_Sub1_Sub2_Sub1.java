import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FSNLAIJY")
public final class Class1_Sub1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!FSNLAIJY", name = "sb", descriptor = "Lclient!NHTDEVDA;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!FSNLAIJY", name = "rb", descriptor = "I")
	private int anInt292 = -39282;

	@OriginalMember(owner = "client!FSNLAIJY", name = "d", descriptor = "(I)Lclient!FUTAQMCE;")
	private Class1_Sub1_Sub1_Sub3 method173(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(18) int local18;
			if (super.anInt546 < 0 || super.anInt549 != 0) {
				local18 = -1;
				if (super.anInt542 >= 0) {
					local18 = Class16.aClass16Array1[super.anInt542].anIntArray78[super.anInt543];
				}
				return this.aClass27_1.method293(null, -1, local18);
			}
			local18 = Class16.aClass16Array1[super.anInt546].anIntArray78[super.anInt547];
			@Pc(20) int local20 = -1;
			if (super.anInt542 >= 0 && super.anInt542 != super.anInt529) {
				local20 = Class16.aClass16Array1[super.anInt542].anIntArray78[super.anInt543];
			}
			return this.aClass27_1.method293(Class16.aClass16Array1[super.anInt546].anIntArray81, local20, local18);
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("70143, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FSNLAIJY", name = "a", descriptor = "(I)Lclient!FUTAQMCE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method341() {
		try {
			if (this.aClass27_1 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub3 local8 = this.method173(291);
			if (this.anInt292 != -39282) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
			if (local8 == null) {
				return null;
			}
			super.anInt554 = local8.anInt597;
			if (super.anInt524 != -1 && super.anInt525 != -1) {
				@Pc(40) Class48 local40 = Class48.aClass48Array1[super.anInt524];
				@Pc(43) Class1_Sub1_Sub1_Sub3 local43 = local40.method481();
				if (local43 != null) {
					@Pc(52) int local52 = local40.aClass16_2.anIntArray78[super.anInt525];
					@Pc(63) Class1_Sub1_Sub1_Sub3 local63 = new Class1_Sub1_Sub1_Sub3(local43, false, (byte) 2, true, Class40.method367(local52));
					local63.method195(0, -super.anInt528, 292, 0);
					local63.method189(284);
					local63.method190(local52);
					local63.anIntArrayArray7 = null;
					local63.anIntArrayArray6 = null;
					if (local40.anInt785 != 128 || local40.anInt786 != 128) {
						local63.method198(local40.anInt785, local40.anInt786, local40.anInt785);
					}
					local63.method199(local40.anInt788 + 64, local40.anInt789 + 850, -30, -50, -30, true);
					@Pc(126) Class1_Sub1_Sub1_Sub3[] local126 = new Class1_Sub1_Sub1_Sub3[] { local8, local63 };
					local8 = new Class1_Sub1_Sub1_Sub3(2, false, local126, true);
				}
			}
			if (this.aClass27_1.aByte17 == 1) {
				local8.aBoolean70 = true;
			}
			return local8;
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("10602, " + -39282 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FSNLAIJY", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method322() {
		try {
			return this.aClass27_1 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("70111, " + 6 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}
}
