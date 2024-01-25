import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class58 {

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "Lclient!hp;")
	private final Class125 aClass125_9 = new Class125(128);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!kea;")
	private final Class161 aClass161_15;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!cda;ILclient!kea;)V")
	public Class58(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2) {
		this.aClass161_15 = arg2;
		this.aClass161_15.method4266(1);
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)V")
	public void method1558() {
		@Pc(6) Class125 local6 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3522(5);
		}
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(Z)V")
	public void method1560() {
		@Pc(6) Class125 local6 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3521();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)Lclient!sca;")
	public Class266 method1561(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_9;
		@Pc(16) Class266 local16;
		synchronized (this.aClass125_9) {
			local16 = (Class266) this.aClass125_9.method3512((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class161 local29 = this.aClass161_15;
		@Pc(38) byte[] local38;
		synchronized (this.aClass161_15) {
			local38 = this.aClass161_15.method4243(arg0, 1);
		}
		local16 = new Class266();
		if (local38 != null) {
			local16.method6633(new Class3_Sub27(local38));
		}
		@Pc(60) Class125 local60 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3519((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "(Z)V")
	public void method1562() {
		@Pc(2) Class125 local2 = this.aClass125_9;
		synchronized (this.aClass125_9) {
			this.aClass125_9.method3516();
		}
	}
}
