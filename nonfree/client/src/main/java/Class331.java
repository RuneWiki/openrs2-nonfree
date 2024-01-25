import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class331 {

	@OriginalMember(owner = "client!um", name = "g", descriptor = "Lclient!jn;")
	private final Class167 aClass167_60 = new Class167(256);

	@OriginalMember(owner = "client!um", name = "i", descriptor = "Lclient!nh;")
	private final Class7_Sub1 aClass7_Sub1_21;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!fa;")
	private final Interface7 anInterface7_11;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!nh;Lclient!fa;)V")
	public Class331(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass7_Sub1_21 = arg0;
		this.anInterface7_11 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)Lclient!dca;")
	public Interface4 method7533(@OriginalArg(0) int arg0) {
		@Pc(16) Object local16 = this.aClass167_60.method3966((long) arg0);
		if (local16 != null) {
			return (Interface4) local16;
		} else if (this.anInterface7_11.method4463(arg0)) {
			@Pc(35) Class69 local35 = this.anInterface7_11.method4460(arg0);
			@Pc(44) int local44 = local35.aBoolean179 ? 64 : this.aClass7_Sub1_21.anInt7344;
			@Pc(79) Interface4 local79;
			if (local35.aBoolean184 && this.aClass7_Sub1_21.method7850()) {
				@Pc(61) float[] local61 = this.anInterface7_11.method4459(0.7F, local44, local44, arg0);
				local79 = this.aClass7_Sub1_21.method5740(Static151.aClass161_6, local35.aByte45 != 0, local44, local44, local61);
			} else {
				@Pc(109) int[] local109 = !local35.aBoolean180 && Static251.method4000(local35.aByte40) ? this.anInterface7_11.method4462(local44, true, arg0, 0.7F, local44) : this.anInterface7_11.method4464(local44, arg0, 0.7F, local44);
				local79 = this.aClass7_Sub1_21.method5699(local44, local35.aByte45 != 0, local44, local109);
			}
			local79.method7375(local35.aBoolean183, local35.aBoolean178);
			this.aClass167_60.method3974((long) arg0, local79);
			return local79;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method7536() {
		this.aClass167_60.method3964(5);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	public void method7537() {
		this.aClass167_60.method3961();
	}
}
