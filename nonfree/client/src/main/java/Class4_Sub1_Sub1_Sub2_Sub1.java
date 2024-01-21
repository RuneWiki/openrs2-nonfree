import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GBGUDIMT")
public final class Class4_Sub1_Sub1_Sub2_Sub1 extends Class4_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!GBGUDIMT", name = "sb", descriptor = "Lclient!WZSDIPBR;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!GBGUDIMT", name = "qb", descriptor = "I")
	private int anInt239 = -273;

	@OriginalMember(owner = "client!GBGUDIMT", name = "rb", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!GBGUDIMT", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method562() {
		try {
			return this.aClass40_1 != null;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("23909, " + 15 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBGUDIMT", name = "c", descriptor = "(Z)Lclient!POJFANDE;")
	private Class4_Sub1_Sub1_Sub4 method180() {
		try {
			@Pc(20) int local20;
			if (super.anInt777 < 0 || super.anInt780 != 0) {
				local20 = -1;
				if (super.anInt752 >= 0) {
					local20 = Class21.aClass21Array1[super.anInt752].anIntArray69[super.anInt753];
				}
				return this.aClass40_1.method483(null, local20, -1);
			}
			local20 = Class21.aClass21Array1[super.anInt777].anIntArray69[super.anInt778];
			@Pc(22) int local22 = -1;
			if (super.anInt752 >= 0 && super.anInt752 != super.anInt787) {
				local22 = Class21.aClass21Array1[super.anInt752].anIntArray69[super.anInt753];
			}
			return this.aClass40_1.method483(Class21.aClass21Array1[super.anInt777].anIntArray72, local20, local22);
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("41857, " + false + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBGUDIMT", name = "a", descriptor = "(Z)Lclient!POJFANDE;")
	@Override
	protected Class4_Sub1_Sub1_Sub4 method559() {
		try {
			if (this.aClass40_1 == null) {
				return null;
			}
			@Pc(8) Class4_Sub1_Sub1_Sub4 local8 = this.method180();
			if (local8 == null) {
				return null;
			}
			super.anInt775 = local8.anInt742;
			if (super.anInt759 != -1 && super.anInt760 != -1) {
				@Pc(34) Class6 local34 = Class6.aClass6Array1[super.anInt759];
				@Pc(37) Class4_Sub1_Sub1_Sub4 local37 = local34.method72();
				if (local37 != null) {
					@Pc(46) int local46 = local34.aClass21_1.anIntArray69[super.anInt760];
					@Pc(57) Class4_Sub1_Sub1_Sub4 local57 = new Class4_Sub1_Sub1_Sub4(Class16.method193(local46), true, false, -785, local37);
					local57.method412(-super.anInt763, 0, 0);
					local57.method406();
					local57.method407(local46);
					local57.anIntArrayArray12 = null;
					local57.anIntArrayArray11 = null;
					if (local34.anInt34 != 128 || local34.anInt35 != 128) {
						local57.method415(local34.anInt35, local34.anInt34, local34.anInt34);
					}
					local57.method416(local34.anInt37 + 64, local34.anInt38 + 850, -30, -50, -30, true);
					@Pc(120) Class4_Sub1_Sub1_Sub4[] local120 = new Class4_Sub1_Sub1_Sub4[] { local8, local57 };
					local8 = new Class4_Sub1_Sub1_Sub4(true, local120, 2, true);
				}
			}
			if (this.aClass40_1.aByte25 == 1) {
				local8.aBoolean138 = true;
			}
			return local8;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("9006, " + true + ", " + local139.toString());
			throw new RuntimeException();
		}
	}
}
