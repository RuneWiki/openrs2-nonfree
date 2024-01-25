import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class265 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!fa;")
	private Class68 aClass68_59 = new Class68(64);

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Lclient!fa;")
	public Class68 aClass68_60 = new Class68(64);

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!fs;")
	public final Class76 aClass76_103;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_102;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;)V")
	public Class265(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		this.aClass76_103 = arg3;
		this.aClass76_102 = arg2;
		this.aClass76_102.method2108(34);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public void method5587() {
		@Pc(2) Class68 local2 = this.aClass68_59;
		synchronized (this.aClass68_59) {
			this.aClass68_59.method1777();
		}
		local2 = this.aClass68_60;
		synchronized (this.aClass68_60) {
			this.aClass68_60.method1777();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Lclient!co;")
	public Class41 method5588(@OriginalArg(1) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_59;
		@Pc(16) Class41 local16;
		synchronized (this.aClass68_59) {
			local16 = (Class41) this.aClass68_59.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass76_102.method2104(arg0, 34);
		local16 = new Class41();
		local16.aClass265_1 = this;
		if (local38 != null) {
			local16.method938(new Class4_Sub12(local38));
		}
		@Pc(57) Class68 local57 = this.aClass68_59;
		synchronized (this.aClass68_59) {
			this.aClass68_59.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V")
	public void method5591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass68_59 = new Class68(arg1);
		this.aClass68_60 = new Class68(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)V")
	public void method5594() {
		@Pc(6) Class68 local6 = this.aClass68_59;
		synchronized (this.aClass68_59) {
			this.aClass68_59.method1788(5);
		}
		local6 = this.aClass68_60;
		synchronized (this.aClass68_60) {
			this.aClass68_60.method1788(5);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public void method5596() {
		@Pc(6) Class68 local6 = this.aClass68_59;
		synchronized (this.aClass68_59) {
			this.aClass68_59.method1791();
		}
		local6 = this.aClass68_60;
		synchronized (this.aClass68_60) {
			this.aClass68_60.method1791();
		}
	}
}
