import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class261 {

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Lclient!vg;")
	private final Class342 aClass342_145 = new Class342(64);

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Lclient!ri;")
	private final Class284 aClass284_119;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class261(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_119 = arg2;
		this.aClass284_119.method6354(31);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)Lclient!rt;")
	public Class292 method5826(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_145;
		@Pc(20) Class292 local20;
		synchronized (this.aClass342_145) {
			local20 = (Class292) this.aClass342_145.method7684((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(38) Class284 local38 = this.aClass284_119;
		@Pc(47) byte[] local47;
		synchronized (this.aClass284_119) {
			local47 = this.aClass284_119.method6331(31, arg0);
		}
		local20 = new Class292();
		if (local47 != null) {
			local20.method6426(new Class3_Sub26(local47));
		}
		@Pc(69) Class342 local69 = this.aClass342_145;
		synchronized (this.aClass342_145) {
			this.aClass342_145.method7683(local20, (long) arg0);
			return local20;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
	public void method5827() {
		@Pc(2) Class342 local2 = this.aClass342_145;
		synchronized (this.aClass342_145) {
			this.aClass342_145.method7687();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	public void method5828() {
		@Pc(6) Class342 local6 = this.aClass342_145;
		synchronized (this.aClass342_145) {
			this.aClass342_145.method7693();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public void method5829() {
		@Pc(2) Class342 local2 = this.aClass342_145;
		synchronized (this.aClass342_145) {
			this.aClass342_145.method7697(5);
		}
	}
}
