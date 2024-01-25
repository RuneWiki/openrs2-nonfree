import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class158 {

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!fa;")
	private final Class68 aClass68_28 = new Class68(128);

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!fs;")
	private final Class76 aClass76_53;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class158(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_53 = arg2;
		if (this.aClass76_53 != null) {
			@Pc(20) int local20 = this.aClass76_53.method2100() - 1;
			this.aClass76_53.method2108(local20);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)Lclient!qu;")
	public Class200 method3790(@OriginalArg(0) int arg0) {
		@Pc(14) Class68 local14 = this.aClass68_28;
		@Pc(24) Class200 local24;
		synchronized (this.aClass68_28) {
			local24 = (Class200) this.aClass68_28.method1787((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass76_53.method2104(Static167.method2739(arg0), Static7.method4190(arg0));
		local24 = new Class200();
		if (local45 != null) {
			local24.method4534(new Class4_Sub12(local45));
		}
		@Pc(61) Class68 local61 = this.aClass68_28;
		synchronized (this.aClass68_28) {
			this.aClass68_28.method1779((long) arg0, local24);
			return local24;
		}
	}
}
