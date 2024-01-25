import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class274 {

	@OriginalMember(owner = "client!su", name = "c", descriptor = "Lclient!hp;")
	private final Class125 aClass125_53 = new Class125(16);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "Lclient!kea;")
	private final Class161 aClass161_97;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class274(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_97 = arg2;
		this.aClass161_97.method4266(30);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	public void method6826() {
		@Pc(2) Class125 local2 = this.aClass125_53;
		synchronized (this.aClass125_53) {
			this.aClass125_53.method3516();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	public void method6827() {
		@Pc(6) Class125 local6 = this.aClass125_53;
		synchronized (this.aClass125_53) {
			this.aClass125_53.method3522(5);
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(II)Lclient!eq;")
	public Class77 method6828(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_53;
		@Pc(16) Class77 local16;
		synchronized (this.aClass125_53) {
			local16 = (Class77) this.aClass125_53.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_97;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_97) {
			local38 = this.aClass161_97.method4243(arg0, 30);
		}
		local16 = new Class77();
		if (local38 != null) {
			local16.method2162(new Class3_Sub27(local38));
		}
		@Pc(68) Class125 local68 = this.aClass125_53;
		synchronized (this.aClass125_53) {
			this.aClass125_53.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public void method6829() {
		@Pc(6) Class125 local6 = this.aClass125_53;
		synchronized (this.aClass125_53) {
			this.aClass125_53.method3521();
		}
	}
}
