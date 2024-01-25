import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class208 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!fa;")
	private final Class68 aClass68_42 = new Class68(64);

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Lclient!fs;")
	private final Class76 aClass76_80;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class208(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_80 = arg2;
		if (this.aClass76_80 != null) {
			this.aClass76_80.method2108(35);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
	public void method4721() {
		@Pc(6) Class68 local6 = this.aClass68_42;
		synchronized (this.aClass68_42) {
			this.aClass68_42.method1777();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
	public void method4722() {
		@Pc(2) Class68 local2 = this.aClass68_42;
		synchronized (this.aClass68_42) {
			this.aClass68_42.method1791();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method4723() {
		@Pc(10) Class68 local10 = this.aClass68_42;
		synchronized (this.aClass68_42) {
			this.aClass68_42.method1788(5);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)Lclient!hv;")
	public Class101 method4725(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_42;
		@Pc(16) Class101 local16;
		synchronized (this.aClass68_42) {
			local16 = (Class101) this.aClass68_42.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_80.method2104(arg0, 35);
		local16 = new Class101();
		if (local33 != null) {
			local16.method2679(new Class4_Sub12(local33));
		}
		local16.method2676();
		@Pc(57) Class68 local57 = this.aClass68_42;
		synchronized (this.aClass68_42) {
			this.aClass68_42.method1779((long) arg0, local16);
			return local16;
		}
	}
}
