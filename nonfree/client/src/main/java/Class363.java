import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class363 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "Lclient!wq;")
	private final Class391 aClass391_64 = new Class391(64);

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "Lclient!la;")
	private final Class208 aClass208_142;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class363(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_142 = arg2;
		this.aClass208_142.method5005(31);
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)Lclient!wi;")
	public Class386 method8765(@OriginalArg(0) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_64;
		@Pc(16) Class386 local16;
		synchronized (this.aClass391_64) {
			local16 = (Class386) this.aClass391_64.method9275((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_142;
		@Pc(39) byte[] local39;
		synchronized (this.aClass208_142) {
			local39 = this.aClass208_142.method4991(31, arg0, -9);
		}
		local16 = new Class386();
		if (local39 != null) {
			local16.method9170(new Class5_Sub23(local39));
		}
		@Pc(63) Class391 local63 = this.aClass391_64;
		synchronized (this.aClass391_64) {
			this.aClass391_64.method9273((long) arg0, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	public void method8766() {
		@Pc(2) Class391 local2 = this.aClass391_64;
		synchronized (this.aClass391_64) {
			this.aClass391_64.method9276(0);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BI)V")
	public void method8768() {
		@Pc(6) Class391 local6 = this.aClass391_64;
		synchronized (this.aClass391_64) {
			this.aClass391_64.method9274(5);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
	public void method8769() {
		@Pc(6) Class391 local6 = this.aClass391_64;
		synchronized (this.aClass391_64) {
			this.aClass391_64.method9286();
		}
	}
}
