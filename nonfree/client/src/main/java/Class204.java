import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class204 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!fa;")
	private final Class68 aClass68_39 = new Class68(64);

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!fs;")
	private final Class76 aClass76_76;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;)V")
	public Class204(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2) {
		this.aClass76_76 = arg2;
		this.aClass76_76.method2108(31);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method4672() {
		@Pc(6) Class68 local6 = this.aClass68_39;
		synchronized (this.aClass68_39) {
			this.aClass68_39.method1777();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public void method4673() {
		@Pc(2) Class68 local2 = this.aClass68_39;
		synchronized (this.aClass68_39) {
			this.aClass68_39.method1791();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public void method4676() {
		@Pc(2) Class68 local2 = this.aClass68_39;
		synchronized (this.aClass68_39) {
			this.aClass68_39.method1788(5);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Lclient!pu;")
	public Class190 method4677(@OriginalArg(0) int arg0) {
		@Pc(15) Class68 local15 = this.aClass68_39;
		@Pc(25) Class190 local25;
		synchronized (this.aClass68_39) {
			local25 = (Class190) this.aClass68_39.method1787((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(42) byte[] local42 = this.aClass76_76.method2104(arg0, 31);
		local25 = new Class190();
		if (local42 != null) {
			local25.method4218(new Class4_Sub12(local42));
		}
		@Pc(58) Class68 local58 = this.aClass68_39;
		synchronized (this.aClass68_39) {
			this.aClass68_39.method1779((long) arg0, local25);
			return local25;
		}
	}
}
