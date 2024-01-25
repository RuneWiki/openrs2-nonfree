import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class118 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_24 = new Class288(16);

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!gp;")
	private final Class117 aClass117_94;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class118(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_94 = arg2;
		this.aClass117_94.method2951(30);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
	public void method3004() {
		@Pc(6) Class288 local6 = this.aClass288_24;
		synchronized (this.aClass288_24) {
			this.aClass288_24.method6735(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V")
	public void method3005() {
		@Pc(14) Class288 local14 = this.aClass288_24;
		synchronized (this.aClass288_24) {
			this.aClass288_24.method6742();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Lclient!dr;")
	public Class69 method3007(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_24;
		@Pc(16) Class69 local16;
		synchronized (this.aClass288_24) {
			local16 = (Class69) this.aClass288_24.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_94;
		@Pc(38) byte[] local38;
		synchronized (this.aClass117_94) {
			local38 = this.aClass117_94.method2962(arg0, 30);
		}
		local16 = new Class69();
		if (local38 != null) {
			local16.method2039(new Class5_Sub3(local38));
		}
		@Pc(65) Class288 local65 = this.aClass288_24;
		synchronized (this.aClass288_24) {
			this.aClass288_24.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method3009() {
		@Pc(14) Class288 local14 = this.aClass288_24;
		synchronized (this.aClass288_24) {
			this.aClass288_24.method6744();
		}
	}
}
