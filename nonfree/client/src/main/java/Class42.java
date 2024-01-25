import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class42 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Lclient!jt;")
	private final Class166 aClass166_5 = new Class166(256);

	@OriginalMember(owner = "client!br", name = "e", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_9;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!wh;Lclient!d;)V")
	public Class42(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass100_Sub3_9 = arg0;
		this.anInterface4_1 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method912() {
		this.aClass166_5.method4811();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Lclient!aw;")
	public Class3_Sub2 method914(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass166_5.method4805((long) arg0);
		if (local18 != null) {
			return (Class3_Sub2) local18;
		} else if (this.anInterface4_1.method892(arg0)) {
			@Pc(37) Class325 local37 = this.anInterface4_1.method895(arg0);
			@Pc(46) int local46 = local37.aBoolean633 ? 64 : this.aClass100_Sub3_9.anInt10583;
			@Pc(81) Class3_Sub2 local81;
			if (local37.aBoolean635 && this.aClass100_Sub3_9.method8784()) {
				@Pc(63) float[] local63 = this.anInterface4_1.method893(arg0, local46, local46, 0.7F);
				local81 = new Class3_Sub2(this.aClass100_Sub3_9, 3553, 34842, local46, local46, local37.aByte114 != 0, local63, 6408);
			} else {
				@Pc(102) int[] local102;
				if (local37.anInt9371 != 2 && Static167.method3083(local37.aByte115)) {
					local102 = this.anInterface4_1.method894(0.7F, true, arg0, local46, local46);
				} else {
					local102 = this.anInterface4_1.method897(arg0, 0.7F, local46, local46);
				}
				local81 = new Class3_Sub2(this.aClass100_Sub3_9, 3553, 6408, local46, local46, local37.aByte114 != 0, local102, 0, 0, false);
			}
			local81.method3904(local37.aBoolean637, local37.aBoolean639);
			this.aClass166_5.method4803(local81, (long) arg0);
			return local81;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public void method915() {
		this.aClass166_5.method4809(5);
	}
}
