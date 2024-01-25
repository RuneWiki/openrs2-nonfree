import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class178 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!ng;")
	private final Class140 aClass140_142 = new Class140(256);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!sr;")
	private final Interface7 anInterface7_7;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_31;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!hj;Lclient!sr;)V")
	public Class178(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.anInterface7_7 = arg1;
		this.aClass2_Sub1_31 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!rq;")
	public Class18_Sub1 method4728(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass140_142.method3816((long) arg0);
		if (local6 != null) {
			return (Class18_Sub1) local6;
		} else if (this.anInterface7_7.method2789(arg0)) {
			@Pc(32) Class215 local32 = this.anInterface7_7.method2788(arg0);
			@Pc(39) int local39 = local32.aBoolean566 ? 64 : 128;
			@Pc(77) Class18_Sub1 local77;
			if (local32.aBoolean572 && this.aClass2_Sub1_31.method3295()) {
				@Pc(88) float[] local88 = this.anInterface7_7.method2787(local39, 0.7F, arg0, local39);
				local77 = new Class18_Sub1(this.aClass2_Sub1_31, 3553, 34842, local39, local39, local32.aByte68 != 0, local88, 6408);
			} else {
				@Pc(56) int[] local56 = this.anInterface7_7.method2790(arg0, 0.7F, local39, local39);
				local77 = new Class18_Sub1(this.aClass2_Sub1_31, 3553, 6408, local39, local39, local32.aByte68 != 0, local56, false);
			}
			local77.method500(local32.aBoolean573, local32.aBoolean567);
			this.aClass140_142.method3817((long) arg0, local77);
			return local77;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	public void method4729() {
		this.aClass140_142.method3819();
	}
}
