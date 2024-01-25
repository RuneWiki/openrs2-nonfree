import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class218 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "Lclient!mo;")
	private final Class160 aClass160_51 = new Class160(256);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Lclient!tq;")
	private final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_37;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!fu;Lclient!tq;)V")
	public Class218(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Interface9 arg1) {
		this.anInterface9_5 = arg1;
		this.aClass63_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Lclient!uo;")
	public Class20_Sub4 method4664(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass160_51.method3599((long) arg0);
		if (local6 != null) {
			return (Class20_Sub4) local6;
		} else if (this.anInterface9_5.method142(arg0)) {
			@Pc(26) Class132 local26 = this.anInterface9_5.method139(arg0);
			@Pc(33) int local33 = local26.aBoolean249 ? 64 : 128;
			@Pc(68) Class20_Sub4 local68;
			if (local26.aBoolean254 && this.aClass63_Sub2_37.method1974()) {
				@Pc(50) float[] local50 = this.anInterface9_5.method140(local33, arg0, local33, 0.7F);
				local68 = new Class20_Sub4(this.aClass63_Sub2_37, 3553, 34842, local33, local33, local26.aByte30 != 0, local50, 6408);
			} else {
				@Pc(81) int[] local81 = this.anInterface9_5.method141(local33, 0.7F, local33, arg0);
				local68 = new Class20_Sub4(this.aClass63_Sub2_37, 3553, 6408, local33, local33, local26.aByte30 != 0, local81, false);
			}
			local68.method5511(local26.aBoolean250, local26.aBoolean257);
			this.aClass160_51.method3602((long) arg0, local68);
			return local68;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method4665() {
		this.aClass160_51.method3595();
	}
}
