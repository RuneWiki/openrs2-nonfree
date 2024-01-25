import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class282 {

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "Lclient!hp;")
	private final Class125 aClass125_56 = new Class125(64);

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "Lclient!kea;")
	private final Class161 aClass161_100;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class282(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_100 = arg2;
		if (this.aClass161_100 != null) {
			this.aClass161_100.method4266(35);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Lclient!m;")
	public Class187 method6983(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_56;
		@Pc(16) Class187 local16;
		synchronized (this.aClass125_56) {
			local16 = (Class187) this.aClass125_56.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_100;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_100) {
			local38 = this.aClass161_100.method4243(arg0, 35);
		}
		local16 = new Class187();
		if (local38 != null) {
			local16.method4870(new Class3_Sub27(local38));
		}
		local16.method4872();
		@Pc(70) Class125 local70 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public void method6985() {
		@Pc(7) Class125 local7 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3522(5);
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method6986() {
		@Pc(6) Class125 local6 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3521();
		}
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)V")
	public void method6987() {
		@Pc(11) Class125 local11 = this.aClass125_56;
		synchronized (this.aClass125_56) {
			this.aClass125_56.method3516();
		}
	}
}
