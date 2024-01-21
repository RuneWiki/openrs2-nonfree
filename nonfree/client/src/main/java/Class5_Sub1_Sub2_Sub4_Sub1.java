import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PDAYFSBN")
public final class Class5_Sub1_Sub2_Sub4_Sub1 extends Class5_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!PDAYFSBN", name = "sb", descriptor = "Lclient!YIBRLAQY;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!PDAYFSBN", name = "rb", descriptor = "I")
	private int anInt412 = -47097;

	@OriginalMember(owner = "client!PDAYFSBN", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			if (this.aClass49_1 == null) {
				return null;
			}
			@Pc(15) Class5_Sub1_Sub2_Sub5 local15 = this.method225();
			if (local15 == null) {
				return null;
			}
			super.anInt522 = local15.anInt633;
			if (super.anInt533 != -1 && super.anInt534 != -1) {
				@Pc(36) Class20 local36 = Class20.aClass20Array1[super.anInt533];
				@Pc(39) Class5_Sub1_Sub2_Sub5 local39 = local36.method132();
				if (local39 != null) {
					@Pc(48) int local48 = local36.aClass11_1.anIntArray25[super.anInt534];
					@Pc(59) Class5_Sub1_Sub2_Sub5 local59 = new Class5_Sub1_Sub2_Sub5(local39, -42752, Class3.method5(local48), true, false);
					local59.method337(-super.anInt537, 0, 0);
					local59.method331();
					local59.method332(local48);
					local59.anIntArrayArray11 = null;
					local59.anIntArrayArray10 = null;
					if (local36.anInt209 != 128 || local36.anInt210 != 128) {
						local59.method340(local36.anInt210, local36.anInt209, local36.anInt209);
					}
					local59.method341(local36.anInt212 + 64, local36.anInt213 + 850, -30, -50, -30, true);
					@Pc(122) Class5_Sub1_Sub2_Sub5[] local122 = new Class5_Sub1_Sub2_Sub5[] { local15, local59 };
					local15 = new Class5_Sub1_Sub2_Sub5(2, local122, true, true);
				}
			}
			if (this.aClass49_1.aByte20 == 1) {
				local15.aBoolean125 = true;
			}
			return local15;
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("22532, " + 27243 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDAYFSBN", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method372() {
		try {
			return this.aClass49_1 != null;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("15218, " + 127 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PDAYFSBN", name = "b", descriptor = "(I)Lclient!PSGMMDJS;")
	private Class5_Sub1_Sub2_Sub5 method225() {
		try {
			@Pc(24) int local24;
			if (super.anInt501 < 0 || super.anInt504 != 0) {
				local24 = -1;
				if (super.anInt527 >= 0) {
					local24 = Class11.aClass11Array1[super.anInt527].anIntArray25[super.anInt528];
				}
				return this.aClass49_1.method539(local24, -1, null, this.anInt412);
			}
			local24 = Class11.aClass11Array1[super.anInt501].anIntArray25[super.anInt502];
			@Pc(26) int local26 = -1;
			if (super.anInt527 >= 0 && super.anInt527 != super.anInt494) {
				local26 = Class11.aClass11Array1[super.anInt527].anIntArray25[super.anInt528];
			}
			return this.aClass49_1.method539(local24, local26, Class11.aClass11Array1[super.anInt501].anIntArray28, this.anInt412);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("99803, " + -3861 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
