import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OTOMPFCI")
public final class Class3_Sub1_Sub2_Sub1_Sub1 extends Class3_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!OTOMPFCI", name = "ub", descriptor = "Lclient!WHKCNEXD;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!OTOMPFCI", name = "sb", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!OTOMPFCI", name = "tb", descriptor = "Z")
	private boolean aBoolean124 = true;

	@OriginalMember(owner = "client!OTOMPFCI", name = "a", descriptor = "(Z)Lclient!YABPKWWG;")
	@Override
	protected Class3_Sub1_Sub2_Sub6 method505() {
		try {
			if (this.aClass42_1 == null) {
				return null;
			}
			@Pc(17) Class3_Sub1_Sub2_Sub6 local17 = this.method301();
			if (local17 == null) {
				return null;
			}
			super.anInt539 = local17.anInt732;
			if (super.anInt561 != -1 && super.anInt562 != -1) {
				@Pc(38) Class7 local38 = Class7.aClass7Array1[super.anInt561];
				@Pc(41) Class3_Sub1_Sub2_Sub6 local41 = local38.method69();
				if (local41 != null) {
					@Pc(50) int local50 = local38.aClass49_1.anIntArray206[super.anInt562];
					@Pc(61) Class3_Sub1_Sub2_Sub6 local61 = new Class3_Sub1_Sub2_Sub6(660, local41, Class15.method125(local50), true, false);
					local61.method523(0, 0, -super.anInt565);
					local61.method517();
					local61.method518(598, local50);
					local61.anIntArrayArray18 = null;
					local61.anIntArrayArray17 = null;
					if (local38.anInt124 != 128 || local38.anInt125 != 128) {
						local61.method526(local38.anInt125, local38.anInt124, local38.anInt124);
					}
					local61.method527(local38.anInt127 + 64, local38.anInt128 + 850, -30, -50, -30, true);
					@Pc(124) Class3_Sub1_Sub2_Sub6[] local124 = new Class3_Sub1_Sub2_Sub6[] { local17, local61 };
					local17 = new Class3_Sub1_Sub2_Sub6(2, local124, 0, true);
				}
			}
			if (this.aClass42_1.aByte18 == 1) {
				local17.aBoolean227 = true;
			}
			return local17;
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("75215, " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTOMPFCI", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method387() {
		try {
			return this.aClass42_1 != null;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("55494, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OTOMPFCI", name = "c", descriptor = "(I)Lclient!YABPKWWG;")
	private Class3_Sub1_Sub2_Sub6 method301() {
		try {
			@Pc(14) int local14;
			if (super.anInt526 < 0 || super.anInt529 != 0) {
				local14 = -1;
				if (super.anInt549 >= 0) {
					local14 = Class49.aClass49Array1[super.anInt549].anIntArray206[super.anInt550];
				}
				return this.aClass42_1.method480(null, local14, -1);
			}
			local14 = Class49.aClass49Array1[super.anInt526].anIntArray206[super.anInt527];
			@Pc(16) int local16 = -1;
			if (super.anInt549 >= 0 && super.anInt549 != super.anInt567) {
				local16 = Class49.aClass49Array1[super.anInt549].anIntArray206[super.anInt550];
			}
			return this.aClass42_1.method480(Class49.aClass49Array1[super.anInt526].anIntArray209, local14, local16);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("16492, " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
