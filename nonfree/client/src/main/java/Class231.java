import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class231 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_47 = new Class288(64);

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_48 = new Class288(2);

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!gp;")
	private final Class117 aClass117_159;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!gp;")
	public final Class117 aClass117_160;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;Lclient!gp;)V")
	public Class231(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) Class117 arg3) {
		this.aClass117_159 = arg2;
		this.aClass117_160 = arg3;
		this.aClass117_159.method2951(33);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	public void method5640() {
		@Pc(2) Class288 local2 = this.aClass288_47;
		synchronized (this.aClass288_47) {
			this.aClass288_47.method6735(5);
		}
		local2 = this.aClass288_48;
		synchronized (this.aClass288_48) {
			this.aClass288_48.method6735(5);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public void method5641() {
		@Pc(2) Class288 local2 = this.aClass288_47;
		synchronized (this.aClass288_47) {
			this.aClass288_47.method6744();
		}
		local2 = this.aClass288_48;
		synchronized (this.aClass288_48) {
			this.aClass288_48.method6744();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lclient!pm;")
	public Class235 method5642(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_47;
		@Pc(16) Class235 local16;
		synchronized (this.aClass288_47) {
			local16 = (Class235) this.aClass288_47.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_159;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_159) {
			local38 = this.aClass117_159.method2962(arg0, 33);
		}
		local16 = new Class235();
		local16.aClass231_1 = this;
		if (local38 != null) {
			local16.method5674(new Class5_Sub3(local38));
		}
		@Pc(63) Class288 local63 = this.aClass288_47;
		synchronized (this.aClass288_47) {
			this.aClass288_47.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method5643() {
		@Pc(2) Class288 local2 = this.aClass288_47;
		synchronized (this.aClass288_47) {
			this.aClass288_47.method6742();
		}
		local2 = this.aClass288_48;
		synchronized (this.aClass288_48) {
			this.aClass288_48.method6742();
		}
	}
}
