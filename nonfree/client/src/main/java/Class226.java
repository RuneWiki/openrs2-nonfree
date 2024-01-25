import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class226 {

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "Lclient!fa;")
	private final Class68 aClass68_46 = new Class68(16);

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_88;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class226(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_88 = arg2;
		this.aClass76_88.method2108(30);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public void method5020() {
		@Pc(10) Class68 local10 = this.aClass68_46;
		synchronized (this.aClass68_46) {
			this.aClass68_46.method1777();
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method5022() {
		@Pc(11) Class68 local11 = this.aClass68_46;
		synchronized (this.aClass68_46) {
			this.aClass68_46.method1791();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
	public void method5024() {
		@Pc(2) Class68 local2 = this.aClass68_46;
		synchronized (this.aClass68_46) {
			this.aClass68_46.method1788(5);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!eb;")
	public Class58 method5025(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_46;
		@Pc(16) Class58 local16;
		synchronized (this.aClass68_46) {
			local16 = (Class58) this.aClass68_46.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass76_88.method2104(arg0, 30);
		local16 = new Class58();
		if (local38 != null) {
			local16.method1509(new Class4_Sub12(local38));
		}
		@Pc(54) Class68 local54 = this.aClass68_46;
		synchronized (this.aClass68_46) {
			this.aClass68_46.method1779((long) arg0, local16);
			return local16;
		}
	}
}
