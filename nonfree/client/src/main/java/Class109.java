import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class109 {

	@OriginalMember(owner = "client!in", name = "h", descriptor = "Lclient!fa;")
	private final Class68 aClass68_17 = new Class68(64);

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!fs;")
	public final Class76 aClass76_41;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!fs;")
	private final Class76 aClass76_40;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;)V")
	public Class109(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		this.aClass76_41 = arg3;
		this.aClass76_40 = arg2;
		this.aClass76_40.method2108(3);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
	public void method2756() {
		@Pc(6) Class68 local6 = this.aClass68_17;
		synchronized (this.aClass68_17) {
			this.aClass68_17.method1777();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lclient!pd;")
	public Class178 method2758(@OriginalArg(0) int arg0) {
		@Pc(6) Class68 local6 = this.aClass68_17;
		@Pc(16) Class178 local16;
		synchronized (this.aClass68_17) {
			local16 = (Class178) this.aClass68_17.method1787((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass76_40.method2104(arg0, 3);
		local16 = new Class178();
		local16.aClass109_1 = this;
		if (local33 != null) {
			local16.method4091(new Class4_Sub12(local33));
		}
		@Pc(52) Class68 local52 = this.aClass68_17;
		synchronized (this.aClass68_17) {
			this.aClass68_17.method1779((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)V")
	public void method2759() {
		@Pc(13) Class68 local13 = this.aClass68_17;
		synchronized (this.aClass68_17) {
			this.aClass68_17.method1788(5);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	public void method2760() {
		@Pc(6) Class68 local6 = this.aClass68_17;
		synchronized (this.aClass68_17) {
			this.aClass68_17.method1791();
		}
	}
}
