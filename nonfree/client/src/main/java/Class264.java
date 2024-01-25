import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class264 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!hm;")
	private final Class136 aClass136_80 = new Class136(256);

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_13;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_35;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!jaa;Lclient!e;)V")
	public Class264(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_13 = arg1;
		this.aClass14_Sub3_35 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public void method5973() {
		this.aClass136_80.method3474(5);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public void method5974() {
		this.aClass136_80.method3470();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Lclient!co;")
	public Class51_Sub1 method5976(@OriginalArg(1) int arg0) {
		@Pc(18) Object local18 = this.aClass136_80.method3473((long) arg0);
		if (local18 != null) {
			return (Class51_Sub1) local18;
		} else if (this.anInterface4_13.method4233(arg0)) {
			@Pc(37) Class313 local37 = this.anInterface4_13.method4234(arg0);
			@Pc(46) int local46 = local37.aBoolean595 ? 64 : this.aClass14_Sub3_35.anInt4543;
			@Pc(96) Class51_Sub1 local96;
			if (local37.aBoolean588 && this.aClass14_Sub3_35.method6887()) {
				@Pc(108) float[] local108 = this.anInterface4_13.method4232(local46, 0.7F, local46, arg0);
				local96 = new Class51_Sub1(this.aClass14_Sub3_35, 3553, 34842, local46, local46, local37.aByte103 != 0, local108, 6408);
			} else {
				@Pc(66) int[] local66;
				if (local37.aBoolean596) {
					local66 = this.anInterface4_13.method4231(local46, local46, arg0, 0.7F);
				} else {
					local66 = this.anInterface4_13.method4230(0.7F, arg0, local46, true, local46);
				}
				local96 = new Class51_Sub1(this.aClass14_Sub3_35, 3553, 6408, local46, local46, local37.aByte103 != 0, local66, false);
			}
			local96.method3535(local37.aBoolean589, local37.aBoolean591);
			this.aClass136_80.method3482((long) arg0, local96);
			return local96;
		} else {
			return null;
		}
	}
}
