import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class219 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!mq;")
	private final Class154 aClass154_50 = new Class154(256);

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!bc;")
	private final Interface1 anInterface1_6;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_37;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!qi;Lclient!bc;)V")
	public Class219(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Interface1 arg1) {
		this.anInterface1_6 = arg1;
		this.aClass82_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method5199() {
		this.aClass154_50.method3748();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lclient!ai;")
	public Class7_Sub1 method5200(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass154_50.method3751((long) arg0);
		if (local6 != null) {
			return (Class7_Sub1) local6;
		} else if (this.anInterface1_6.method2846(arg0)) {
			@Pc(26) Class182 local26 = this.anInterface1_6.method2849(arg0);
			@Pc(33) int local33 = local26.aBoolean361 ? 64 : 128;
			@Pc(68) Class7_Sub1 local68;
			if (local26.aBoolean364 && this.aClass82_Sub2_37.method4463()) {
				@Pc(50) float[] local50 = this.anInterface1_6.method2847(arg0, local33, 0.7F, local33);
				local68 = new Class7_Sub1(this.aClass82_Sub2_37, 3553, 34842, local33, local33, local26.aByte53 != 0, local50, 6408);
			} else {
				@Pc(81) int[] local81 = this.anInterface1_6.method2848(local33, 0.7F, arg0, local33);
				local68 = new Class7_Sub1(this.aClass82_Sub2_37, 3553, 6408, local33, local33, local26.aByte53 != 0, local81, false);
			}
			local68.method4749(local26.aBoolean367, local26.aBoolean368);
			this.aClass154_50.method3745((long) arg0, local68);
			return local68;
		} else {
			return null;
		}
	}
}
