import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class106 {

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Lclient!h;")
	private final Class125 aClass125_17 = new Class125(64);

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!an;")
	private final Class16 aClass16_39;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class106(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_39 = arg2;
		if (this.aClass16_39 != null) {
			this.aClass16_39.method399(35);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method2872() {
		@Pc(6) Class125 local6 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3440();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public void method2874() {
		@Pc(2) Class125 local2 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3442();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lclient!qu;")
	public Class259 method2875(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_17;
		@Pc(16) Class259 local16;
		synchronized (this.aClass125_17) {
			local16 = (Class259) this.aClass125_17.method3446((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class16 local29 = this.aClass16_39;
		@Pc(38) byte[] local38;
		synchronized (this.aClass16_39) {
			local38 = this.aClass16_39.method408(35, arg0);
		}
		local16 = new Class259();
		if (local38 != null) {
			local16.method6434(new Class12_Sub8(local38));
		}
		local16.method6435();
		@Pc(63) Class125 local63 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3437(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V")
	public void method2876() {
		@Pc(2) Class125 local2 = this.aClass125_17;
		synchronized (this.aClass125_17) {
			this.aClass125_17.method3447(5);
		}
	}
}
