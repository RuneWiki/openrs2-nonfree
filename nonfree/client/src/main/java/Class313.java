import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class313 {

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!vg;")
	private final Class342 aClass342_177 = new Class342(64);

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!ri;")
	private final Class284 aClass284_143;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class313(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_143 = arg2;
		this.aClass284_143.method6354(32);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lclient!hg;")
	public Class122 method6864(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_177;
		@Pc(24) Class122 local24;
		synchronized (this.aClass342_177) {
			local24 = (Class122) this.aClass342_177.method7684((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class284 local37 = this.aClass284_143;
		@Pc(46) byte[] local46;
		synchronized (this.aClass284_143) {
			local46 = this.aClass284_143.method6331(32, arg0);
		}
		local24 = new Class122();
		if (local46 != null) {
			local24.method3395(new Class3_Sub26(local46));
		}
		@Pc(68) Class342 local68 = this.aClass342_177;
		synchronized (this.aClass342_177) {
			this.aClass342_177.method7683(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public void method6866() {
		@Pc(2) Class342 local2 = this.aClass342_177;
		synchronized (this.aClass342_177) {
			this.aClass342_177.method7693();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	public void method6867() {
		@Pc(6) Class342 local6 = this.aClass342_177;
		synchronized (this.aClass342_177) {
			this.aClass342_177.method7697(5);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public void method6868() {
		@Pc(2) Class342 local2 = this.aClass342_177;
		synchronized (this.aClass342_177) {
			this.aClass342_177.method7687();
		}
	}
}
