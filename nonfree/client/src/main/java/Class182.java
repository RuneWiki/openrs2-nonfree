import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class182 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Lclient!fa;")
	private Class68 aClass68_33 = new Class68(128);

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!fa;")
	public Class68 aClass68_34 = new Class68(64);

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "Lclient!fs;")
	private final Class76 aClass76_64;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!fs;")
	public final Class76 aClass76_63;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!jk;ILclient!fs;Lclient!fs;)V")
	public Class182(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3) {
		this.aClass76_64 = arg2;
		this.aClass76_63 = arg3;
		this.aClass76_64.method2108(36);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)Lclient!nf;")
	public Class157 method4124(@OriginalArg(0) int arg0) {
		@Pc(11) Class68 local11 = this.aClass68_33;
		@Pc(21) Class157 local21;
		synchronized (this.aClass68_33) {
			local21 = (Class157) this.aClass68_33.method1787((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(40) byte[] local40 = this.aClass76_64.method2104(arg0, 36);
		local21 = new Class157();
		local21.anInt4914 = arg0;
		local21.aClass182_2 = this;
		if (local40 != null) {
			local21.method3784(new Class4_Sub12(local40));
		}
		local21.method3781();
		@Pc(67) Class68 local67 = this.aClass68_33;
		synchronized (this.aClass68_33) {
			this.aClass68_33.method1779((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public void method4127() {
		@Pc(2) Class68 local2 = this.aClass68_33;
		synchronized (this.aClass68_33) {
			this.aClass68_33.method1777();
		}
		local2 = this.aClass68_34;
		synchronized (this.aClass68_34) {
			this.aClass68_34.method1777();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)V")
	public void method4128() {
		@Pc(6) Class68 local6 = this.aClass68_33;
		synchronized (this.aClass68_33) {
			this.aClass68_33.method1788(5);
		}
		local6 = this.aClass68_34;
		synchronized (this.aClass68_34) {
			this.aClass68_34.method1788(5);
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)V")
	public void method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass68_33 = new Class68(arg1);
		this.aClass68_34 = new Class68(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	public void method4132() {
		@Pc(2) Class68 local2 = this.aClass68_33;
		synchronized (this.aClass68_33) {
			this.aClass68_33.method1791();
		}
		local2 = this.aClass68_34;
		synchronized (this.aClass68_34) {
			this.aClass68_34.method1791();
		}
	}
}
