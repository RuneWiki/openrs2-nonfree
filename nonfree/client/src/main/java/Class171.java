import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class171 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!jg;")
	private final Class107 aClass107_43 = new Class107(256);

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_35;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!ec;")
	private final Interface3 anInterface3_6;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!cg;Lclient!ec;)V")
	public Class171(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass37_Sub1_35 = arg0;
		this.anInterface3_6 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)Lclient!pq;")
	public Class81_Sub4 method4777(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass107_43.method3021((long) arg0);
		if (local6 != null) {
			return (Class81_Sub4) local6;
		} else if (this.anInterface3_6.method167(arg0)) {
			@Pc(25) Class89 local25 = this.anInterface3_6.method166(arg0);
			@Pc(32) int local32 = local25.aBoolean249 ? 64 : 128;
			@Pc(70) Class81_Sub4 local70;
			if (local25.aBoolean246 && this.aClass37_Sub1_35.method3719()) {
				@Pc(81) float[] local81 = this.anInterface3_6.method163(local32, arg0, 0.7F, local32);
				local70 = new Class81_Sub4(this.aClass37_Sub1_35, 3553, 34842, local32, local32, local25.aByte31 != 0, local81, 6408);
			} else {
				@Pc(51) int[] local51 = this.anInterface3_6.method164(0.7F, local32, arg0, local32);
				local70 = new Class81_Sub4(this.aClass37_Sub1_35, 3553, 6408, local32, local32, local25.aByte31 != 0, local51, false);
			}
			local70.method4745(local25.aBoolean248, local25.aBoolean252);
			this.aClass107_43.method3018((long) arg0, local70);
			return local70;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method4778() {
		this.aClass107_43.method3015();
	}
}
