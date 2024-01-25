import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class265 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "Lclient!jk;")
	private final Class137 aClass137_58 = new Class137(256);

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_43;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Lclient!ga;")
	private final Interface5 anInterface5_8;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ug;Lclient!ga;)V")
	public Class265(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) Interface5 arg1) {
		this.aClass135_Sub2_43 = arg0;
		this.anInterface5_8 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public void method5926() {
		this.aClass137_58.method2745(5);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method5927() {
		this.aClass137_58.method2739();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lclient!ml;")
	public Class65_Sub2 method5928(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass137_58.method2744((long) arg0);
		if (local12 != null) {
			return (Class65_Sub2) local12;
		} else if (this.anInterface5_8.method4075(arg0)) {
			@Pc(35) Class112 local35 = this.anInterface5_8.method4079(arg0);
			@Pc(52) int local52 = local35.aBoolean188 ? 64 : this.aClass135_Sub2_43.anInt6777;
			@Pc(87) Class65_Sub2 local87;
			if (local35.aBoolean193 && this.aClass135_Sub2_43.method5355()) {
				@Pc(69) float[] local69 = this.anInterface5_8.method4076(local52, local52, arg0, 0.7F);
				local87 = new Class65_Sub2(this.aClass135_Sub2_43, 3553, 34842, local52, local52, local35.aByte52 != 0, local69, 6408);
			} else {
				@Pc(99) short local99;
				@Pc(109) int[] local109;
				if (local35.aBoolean194 && Static99.method1502(local35.aByte57)) {
					local109 = this.anInterface5_8.method4078(false, local52, 0.7F, local52, arg0);
					local99 = 6407;
				} else {
					local99 = 6408;
					local109 = this.anInterface5_8.method4077(local52, 0.7F, local52, arg0);
				}
				local87 = new Class65_Sub2(this.aClass135_Sub2_43, 3553, local99, local52, local52, local35.aByte52 != 0, local109, false);
			}
			local87.method3589(local35.aBoolean195, local35.aBoolean191);
			this.aClass137_58.method2732((long) arg0, local87);
			return local87;
		} else {
			return null;
		}
	}
}
