import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class155 {

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "Lclient!jda;")
	private final Class165 aClass165_31 = new Class165(256);

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_11;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "Lclient!d;")
	private final Interface4 anInterface4_8;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!ai;Lclient!d;)V")
	public Class155(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.aClass13_Sub1_11 = arg0;
		this.anInterface4_8 = arg1;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	public void method4116() {
		this.aClass165_31.method4394(5);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZI)Lclient!ec;")
	public Interface7 method4117(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass165_31.method4389((long) arg0);
		if (local12 != null) {
			return (Interface7) local12;
		} else if (this.anInterface4_8.method4672(arg0)) {
			@Pc(38) Class119 local38 = this.anInterface4_8.method4673(arg0);
			@Pc(47) int local47 = local38.aBoolean292 ? 64 : this.aClass13_Sub1_11.anInt8604;
			@Pc(79) Interface7 local79;
			if (local38.aBoolean297 && this.aClass13_Sub1_11.method8451()) {
				@Pc(64) float[] local64 = this.anInterface4_8.method4675(local47, 0.7F, arg0, local47);
				local79 = this.aClass13_Sub1_11.method7478(local47, local47, Static419.aClass327_2, local64, local38.aByte58 != 0);
			} else {
				@Pc(100) int[] local100;
				if (local38.anInt3894 != 2 && Static5.method131(local38.aByte54)) {
					local100 = this.anInterface4_8.method4676(local47, true, local47, 0.7F, arg0);
				} else {
					local100 = this.anInterface4_8.method4677(local47, arg0, 0.7F, local47);
				}
				local79 = this.aClass13_Sub1_11.method7526(local47, local47, local38.aByte58 != 0, local100);
			}
			local79.method5805(local38.aBoolean293, local38.aBoolean296);
			this.aClass165_31.method4392(local79, (long) arg0);
			return local79;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
	public void method4119() {
		this.aClass165_31.method4403();
	}
}
