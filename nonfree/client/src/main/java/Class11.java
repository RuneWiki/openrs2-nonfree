import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class11 {

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!de;")
	private final Class69 aClass69_2 = new Class69(256);

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!d;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_3;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!bi;Lclient!d;)V")
	public Class11(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_2 = arg1;
		this.aClass13_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public void method147() {
		this.aClass69_2.method1905();
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
	public void method153() {
		this.aClass69_2.method1910(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!bq;")
	public Class10_Sub2 method154(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass69_2.method1919((long) arg0);
		if (local18 != null) {
			return (Class10_Sub2) local18;
		} else if (this.anInterface2_2.method6026(arg0)) {
			@Pc(37) Class271 local37 = this.anInterface2_2.method6027(arg0);
			@Pc(46) int local46 = local37.aBoolean516 ? 64 : this.aClass13_Sub2_3.anInt1073;
			@Pc(81) Class10_Sub2 local81;
			if (local37.aBoolean511 && this.aClass13_Sub2_3.method8093()) {
				@Pc(63) float[] local63 = this.anInterface2_2.method6022(0.7F, arg0, local46, local46);
				local81 = new Class10_Sub2(this.aClass13_Sub2_3, 3553, 34842, local46, local46, local37.aByte96 != 0, local63, 6408);
			} else {
				@Pc(103) int[] local103;
				if (local37.anInt7162 != 2 && Static265.method4367(local37.aByte94)) {
					local103 = this.anInterface2_2.method6024(local46, arg0, true, local46, 0.7F);
				} else {
					local103 = this.anInterface2_2.method6023(local46, 0.7F, arg0, local46);
				}
				local81 = new Class10_Sub2(this.aClass13_Sub2_3, 3553, 6408, local46, local46, local37.aByte96 != 0, local103, 0, 0, false);
			}
			local81.method720(local37.aBoolean510, local37.aBoolean513);
			this.aClass69_2.method1917((long) arg0, local81);
			return local81;
		} else {
			return null;
		}
	}
}
