import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class60 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!hp;")
	private final Class125 aClass125_10 = new Class125(128);

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!kea;")
	private final Class161 aClass161_16;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class60(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_16 = arg2;
		if (this.aClass161_16 != null) {
			@Pc(20) int local20 = this.aClass161_16.method4239() - 1;
			this.aClass161_16.method4266(local20);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Lclient!uu;")
	public Class301 method1602(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_10;
		@Pc(23) Class301 local23;
		synchronized (this.aClass125_10) {
			local23 = (Class301) this.aClass125_10.method3512((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(44) byte[] local44 = this.aClass161_16.method4243(Static170.method3250(arg0), Static200.method7660(arg0));
		local23 = new Class301();
		if (local44 != null) {
			local23.method7223(new Class3_Sub27(local44));
		}
		@Pc(60) Class125 local60 = this.aClass125_10;
		synchronized (this.aClass125_10) {
			this.aClass125_10.method3519((long) arg0, local23);
			return local23;
		}
	}
}
