import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PEHNWFXK")
public final class Class1_Sub1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!PEHNWFXK", name = "sb", descriptor = "Lclient!PIPBZEOV;")
	public Class29 aClass29_2;

	@OriginalMember(owner = "client!PEHNWFXK", name = "qb", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!PEHNWFXK", name = "rb", descriptor = "I")
	private int anInt499 = -22770;

	@OriginalMember(owner = "client!PEHNWFXK", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method311() {
		try {
			return this.aClass29_2 != null;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("39408, " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PEHNWFXK", name = "b", descriptor = "(I)Lclient!IYSWJGDE;")
	private Class1_Sub1_Sub1_Sub3 method316() {
		try {
			@Pc(14) int local14;
			if (super.anInt491 < 0 || super.anInt494 != 0) {
				local14 = -1;
				if (super.anInt472 >= 0) {
					local14 = Class19.aClass19Array1[super.anInt472].anIntArray99[super.anInt473];
				}
				return this.aClass29_2.method329(this.anInt499, null, local14, -1);
			}
			local14 = Class19.aClass19Array1[super.anInt491].anIntArray99[super.anInt492];
			@Pc(16) int local16 = -1;
			if (super.anInt472 >= 0 && super.anInt472 != super.anInt453) {
				local16 = Class19.aClass19Array1[super.anInt472].anIntArray99[super.anInt473];
			}
			return this.aClass29_2.method329(this.anInt499, Class19.aClass19Array1[super.anInt491].anIntArray102, local14, local16);
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("26201, " + -37900 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PEHNWFXK", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			if (this.aClass29_2 == null) {
				return null;
			}
			@Pc(8) Class1_Sub1_Sub1_Sub3 local8 = this.method316();
			if (local8 == null) {
				return null;
			}
			super.anInt452 = local8.anInt724;
			if (super.anInt479 != -1 && super.anInt480 != -1) {
				@Pc(35) Class34 local35 = Class34.aClass34Array1[super.anInt479];
				@Pc(38) Class1_Sub1_Sub1_Sub3 local38 = local35.method390();
				if (local38 != null) {
					@Pc(47) int local47 = local35.aClass19_2.anIntArray99[super.anInt480];
					@Pc(58) Class1_Sub1_Sub1_Sub3 local58 = new Class1_Sub1_Sub1_Sub3(Class30.method334(local47), local38, 946, true, false);
					local58.method160(-super.anInt483, 0, 600, 0);
					local58.method154();
					local58.method155(local47);
					local58.anIntArrayArray8 = null;
					local58.anIntArrayArray7 = null;
					if (local35.anInt584 != 128 || local35.anInt585 != 128) {
						local58.method163(local35.anInt584, local35.anInt584, local35.anInt585);
					}
					local58.method164(local35.anInt587 + 64, local35.anInt588 + 850, -30, -50, -30, true);
					@Pc(121) Class1_Sub1_Sub1_Sub3[] local121 = new Class1_Sub1_Sub1_Sub3[] { local8, local58 };
					local8 = new Class1_Sub1_Sub1_Sub3(local121, 2, true, (byte) 2);
				}
			}
			if (this.aClass29_2.aByte13 == 1) {
				local8.aBoolean42 = true;
			}
			return local8;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("6202, " + true + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
