import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class113 {

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!jr;")
	private final Class169 aClass169_26 = new Class169(256);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_7;

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_7;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!wga;Lclient!d;)V")
	public Class113(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass20_Sub2_7 = arg0;
		this.anInterface4_7 = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public void method3601() {
		this.aClass169_26.method5009();
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	public void method3602() {
		this.aClass169_26.method4997(5);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)Lclient!wfa;")
	public Interface27 method3603(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass169_26.method5002((long) arg0);
		if (local12 != null) {
			return (Interface27) local12;
		} else if (this.anInterface4_7.method8049(arg0)) {
			@Pc(36) Class127 local36 = this.anInterface4_7.method8048(arg0);
			@Pc(45) int local45 = local36.aBoolean335 ? 64 : this.aClass20_Sub2_7.anInt1565;
			@Pc(80) Interface27 local80;
			if (local36.aBoolean342 && this.aClass20_Sub2_7.method7269()) {
				@Pc(62) float[] local62 = this.anInterface4_7.method8046(local45, 0.7F, local45, arg0);
				local80 = this.aClass20_Sub2_7.method1525(local62, local45, local45, Static354.aClass375_31, local36.aByte76 != 0);
			} else {
				@Pc(101) int[] local101;
				if (local36.anInt4659 != 2 && Static553.method8247(local36.aByte78)) {
					local101 = this.anInterface4_7.method8050(true, arg0, 0.7F, local45, local45);
				} else {
					local101 = this.anInterface4_7.method8051(local45, 0.7F, arg0, local45);
				}
				local80 = this.aClass20_Sub2_7.method1473(local45, local45, local36.aByte76 != 0, local101);
			}
			local80.method8300(local36.aBoolean341, local36.aBoolean340);
			this.aClass169_26.method5001(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}
}
