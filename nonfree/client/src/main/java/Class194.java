import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class194 {

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
	public int anInt5674;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!fa;")
	private final Class68 aClass68_36 = new Class68(64);

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!fa;")
	public final Class68 aClass68_37 = new Class68(30);

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!fs;")
	private final Class76 aClass76_72;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Lclient!fs;")
	public final Class76 aClass76_71;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;)V")
	public Class194(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		this.aClass76_72 = arg2;
		this.aClass76_71 = arg3;
		@Pc(26) int local26 = this.aClass76_72.method2100() - 1;
		this.aClass76_72.method2108(local26);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	public void method4417(@OriginalArg(0) int arg0) {
		this.anInt5674 = arg0;
		@Pc(9) Class68 local9 = this.aClass68_37;
		synchronized (this.aClass68_37) {
			this.aClass68_37.method1777();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
	public void method4418() {
		@Pc(6) Class68 local6 = this.aClass68_36;
		synchronized (this.aClass68_36) {
			this.aClass68_36.method1788(5);
		}
		local6 = this.aClass68_37;
		synchronized (this.aClass68_37) {
			this.aClass68_37.method1788(5);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public void method4419() {
		@Pc(2) Class68 local2 = this.aClass68_36;
		synchronized (this.aClass68_36) {
			this.aClass68_36.method1791();
		}
		local2 = this.aClass68_37;
		synchronized (this.aClass68_37) {
			this.aClass68_37.method1791();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Lclient!nm;")
	public Class161 method4421(@OriginalArg(1) int arg0) {
		@Pc(12) Class68 local12 = this.aClass68_36;
		@Pc(22) Class161 local22;
		synchronized (this.aClass68_36) {
			local22 = (Class161) this.aClass68_36.method1787((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(43) byte[] local43 = this.aClass76_72.method2104(Static177.method2530(arg0), Static236.method3528(arg0));
		local22 = new Class161();
		local22.anInt5005 = arg0;
		local22.aClass194_1 = this;
		if (local43 != null) {
			local22.method3831(new Class4_Sub12(local43));
		}
		@Pc(65) Class68 local65 = this.aClass68_36;
		synchronized (this.aClass68_36) {
			this.aClass68_36.method1779((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public void method4423() {
		@Pc(6) Class68 local6 = this.aClass68_36;
		synchronized (this.aClass68_36) {
			this.aClass68_36.method1777();
		}
		local6 = this.aClass68_37;
		synchronized (this.aClass68_37) {
			this.aClass68_37.method1777();
		}
	}
}
