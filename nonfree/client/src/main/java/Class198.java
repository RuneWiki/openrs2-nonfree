import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class198 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!ui;")
	private final Class359 aClass359_41 = new Class359(256);

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!d;")
	private final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "Lclient!jj;")
	private final Class75_Sub1 aClass75_Sub1_13;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!jj;Lclient!d;)V")
	public Class198(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) Interface11 arg1) {
		this.anInterface11_6 = arg1;
		this.aClass75_Sub1_13 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	public void method4800() {
		this.aClass359_41.method8507();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
	public void method4801() {
		this.aClass359_41.method8502(5);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Lclient!cf;")
	public Interface7 method4803(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass359_41.method8517((long) arg0);
		if (local12 != null) {
			return (Interface7) local12;
		} else if (this.anInterface11_6.method6032(arg0)) {
			@Pc(35) Class297 local35 = this.anInterface11_6.method6027(arg0);
			@Pc(45) int local45 = local35.aBoolean630 ? 64 : this.aClass75_Sub1_13.anInt7671;
			@Pc(114) Interface7 local114;
			if (local35.aBoolean626 && this.aClass75_Sub1_13.method6705()) {
				@Pc(126) float[] local126 = this.anInterface11_6.method6030(local45, arg0, local45, 0.7F);
				local114 = this.aClass75_Sub1_13.method6813(local45, local35.aByte120 != 0, local126, Static432.aClass155_45, local45);
			} else {
				@Pc(85) int[] local85;
				if (local35.anInt8252 != 2 && Static11.method172(local35.aByte124)) {
					local85 = this.anInterface11_6.method6031(0.7F, local45, local45, arg0, true);
				} else {
					local85 = this.anInterface11_6.method6029(local45, local45, 0.7F, arg0);
				}
				local114 = this.aClass75_Sub1_13.method6727(local45, local35.aByte120 != 0, local85, local45);
			}
			local114.method8723(local35.aBoolean631, local35.aBoolean629);
			this.aClass359_41.method8515((long) arg0, local114);
			return local114;
		} else {
			return null;
		}
	}
}
