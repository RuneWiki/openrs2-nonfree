import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class138 {

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "Lclient!ui;")
	private final Class359 aClass359_22 = new Class359(256);

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_17;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!d;")
	private final Interface11 anInterface11_5;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ml;Lclient!d;)V")
	public Class138(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass75_Sub3_17 = arg0;
		this.anInterface11_5 = arg1;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public void method3710() {
		this.aClass359_22.method8502(5);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public void method3711() {
		this.aClass359_22.method8507();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lclient!bp;")
	public Class44_Sub1 method3712(@OriginalArg(0) int arg0) {
		@Pc(18) Object local18 = this.aClass359_22.method8517((long) arg0);
		if (local18 != null) {
			return (Class44_Sub1) local18;
		} else if (this.anInterface11_5.method6032(arg0)) {
			@Pc(39) Class297 local39 = this.anInterface11_5.method6027(arg0);
			@Pc(49) int local49 = local39.aBoolean630 ? 64 : this.aClass75_Sub3_17.anInt6526;
			@Pc(114) Class44_Sub1 local114;
			if (local39.aBoolean626 && this.aClass75_Sub3_17.method6705()) {
				@Pc(126) float[] local126 = this.anInterface11_5.method6030(local49, arg0, local49, 0.7F);
				local114 = new Class44_Sub1(this.aClass75_Sub3_17, 3553, 34842, local49, local49, local39.aByte120 != 0, local126, 6408);
			} else {
				@Pc(81) int[] local81;
				if (local39.anInt8252 != 2 && Static11.method172(local39.aByte124)) {
					local81 = this.anInterface11_5.method6031(0.7F, local49, local49, arg0, true);
				} else {
					local81 = this.anInterface11_5.method6029(local49, local49, 0.7F, arg0);
				}
				local114 = new Class44_Sub1(this.aClass75_Sub3_17, 3553, 6408, local49, local49, local39.aByte120 != 0, local81, 0, 0, false);
			}
			local114.method3476(local39.aBoolean631, local39.aBoolean629);
			this.aClass359_22.method8515((long) arg0, local114);
			return local114;
		} else {
			return null;
		}
	}
}
