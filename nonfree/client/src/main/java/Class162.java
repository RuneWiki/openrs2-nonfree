import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class162 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!uaa;")
	private Class288 aClass288_35 = new Class288(64);

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "Lclient!gp;")
	private final Class117 aClass117_115;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class162(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_115 = arg2;
		if (this.aClass117_115 != null) {
			@Pc(20) int local20 = this.aClass117_115.method2972() - 1;
			this.aClass117_115.method2951(local20);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
	public void method4082(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_35;
		synchronized (this.aClass288_35) {
			this.aClass288_35.method6744();
			this.aClass288_35 = new Class288(arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)Lclient!ea;")
	public Class73 method4086(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_35;
		@Pc(16) Class73 local16;
		synchronized (this.aClass288_35) {
			local16 = (Class73) this.aClass288_35.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class117 local34 = this.aClass117_115;
		@Pc(47) byte[] local47;
		synchronized (this.aClass117_115) {
			local47 = this.aClass117_115.method2962(Static117.method2265(arg0), Static425.method6098(arg0));
		}
		local16 = new Class73();
		if (local47 != null) {
			local16.method2129(new Class5_Sub3(local47));
		}
		@Pc(69) Class288 local69 = this.aClass288_35;
		synchronized (this.aClass288_35) {
			this.aClass288_35.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)V")
	public void method4087() {
		@Pc(14) Class288 local14 = this.aClass288_35;
		synchronized (this.aClass288_35) {
			this.aClass288_35.method6744();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	public void method4088() {
		@Pc(6) Class288 local6 = this.aClass288_35;
		synchronized (this.aClass288_35) {
			this.aClass288_35.method6735(5);
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(B)V")
	public void method4090() {
		@Pc(10) Class288 local10 = this.aClass288_35;
		synchronized (this.aClass288_35) {
			this.aClass288_35.method6742();
		}
	}
}
