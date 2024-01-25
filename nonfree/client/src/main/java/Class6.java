import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!hq;")
	private final Class87 aClass87_2 = new Class87(256);

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Lclient!gd;")
	private final Interface2 anInterface2_1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_3;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!h;Lclient!gd;)V")
	public Class6(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInterface2_1 = arg1;
		this.aClass32_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public void method197() {
		this.aClass87_2.method2485();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lclient!bj;")
	public Class20_Sub1 method198(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass87_2.method2482((long) arg0);
		if (local6 != null) {
			return (Class20_Sub1) local6;
		} else if (this.anInterface2_1.method4241(arg0)) {
			@Pc(26) Class154 local26 = this.anInterface2_1.method4244(arg0);
			@Pc(33) int local33 = local26.aBoolean440 ? 64 : 128;
			@Pc(80) Class20_Sub1 local80;
			if (local26.aBoolean438 && this.aClass32_Sub2_3.method2166()) {
				@Pc(91) float[] local91 = this.anInterface2_1.method4240(0.7F, arg0, local33, local33);
				local80 = new Class20_Sub1(this.aClass32_Sub2_3, 3553, 34842, local33, local33, local26.aByte36 != 0, local91, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface2_1.method4242(arg0, local33, 0.7F, local33);
				local80 = new Class20_Sub1(this.aClass32_Sub2_3, 3553, 6408, local33, local33, local26.aByte36 != 0, local59, false);
			}
			local80.method1388(local26.aBoolean444, local26.aBoolean441);
			this.aClass87_2.method2481(local80, (long) arg0);
			return local80;
		} else {
			return null;
		}
	}
}
