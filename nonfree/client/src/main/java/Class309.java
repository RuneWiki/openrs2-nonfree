import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class309 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "Lclient!sw;")
	private final Class277 aClass277_66 = new Class277(64);

	@OriginalMember(owner = "client!vq", name = "h", descriptor = "Lclient!dn;")
	private final Class69 aClass69_95;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class309(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_95 = arg2;
		this.aClass69_95.method1884(31);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method7917() {
		@Pc(2) Class277 local2 = this.aClass277_66;
		synchronized (this.aClass277_66) {
			this.aClass277_66.method7018(5);
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
	public void method7919() {
		@Pc(11) Class277 local11 = this.aClass277_66;
		synchronized (this.aClass277_66) {
			this.aClass277_66.method7019();
		}
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(IZ)Lclient!jaa;")
	public Class145 method7920(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_66;
		@Pc(24) Class145 local24;
		synchronized (this.aClass277_66) {
			local24 = (Class145) this.aClass277_66.method7014((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class69 local37 = this.aClass69_95;
		@Pc(46) byte[] local46;
		synchronized (this.aClass69_95) {
			local46 = this.aClass69_95.method1888(arg0, 31);
		}
		local24 = new Class145();
		if (local46 != null) {
			local24.method3995(new Class1_Sub17(local46));
		}
		@Pc(68) Class277 local68 = this.aClass277_66;
		synchronized (this.aClass277_66) {
			this.aClass277_66.method7016(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method7921() {
		@Pc(6) Class277 local6 = this.aClass277_66;
		synchronized (this.aClass277_66) {
			this.aClass277_66.method7026();
		}
	}
}
