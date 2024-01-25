import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class180 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!fa;")
	private final Class68 aClass68_32 = new Class68(64);

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!fs;")
	private final Class76 aClass76_62;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class180(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_62 = arg2;
		if (this.aClass76_62 != null) {
			this.aClass76_62.method2108(11);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	public void method4116() {
		@Pc(14) Class68 local14 = this.aClass68_32;
		synchronized (this.aClass68_32) {
			this.aClass68_32.method1777();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public void method4118() {
		@Pc(2) Class68 local2 = this.aClass68_32;
		synchronized (this.aClass68_32) {
			this.aClass68_32.method1791();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public void method4120() {
		@Pc(2) Class68 local2 = this.aClass68_32;
		synchronized (this.aClass68_32) {
			this.aClass68_32.method1788(5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)Lclient!lg;")
	public Class133 method4121(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_32;
		@Pc(24) Class133 local24;
		synchronized (this.aClass68_32) {
			local24 = (Class133) this.aClass68_32.method1787((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass76_62.method2104(arg0, 11);
		local24 = new Class133();
		if (local41 != null) {
			local24.method3354(new Class4_Sub12(local41));
		}
		@Pc(57) Class68 local57 = this.aClass68_32;
		synchronized (this.aClass68_32) {
			this.aClass68_32.method1779((long) arg0, local24);
			return local24;
		}
	}
}
