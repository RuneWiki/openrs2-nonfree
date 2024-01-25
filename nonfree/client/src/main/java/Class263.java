import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class263 {

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "Lclient!uf;")
	private final Class326 aClass326_40 = new Class326(16);

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Lclient!ga;")
	private final Class111 aClass111_98;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class263(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_98 = arg2;
		this.aClass111_98.method2442(30);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	public void method5839() {
		@Pc(6) Class326 local6 = this.aClass326_40;
		synchronized (this.aClass326_40) {
			this.aClass326_40.method7230();
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	public void method5840() {
		@Pc(2) Class326 local2 = this.aClass326_40;
		synchronized (this.aClass326_40) {
			this.aClass326_40.method7234();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V")
	public void method5841() {
		@Pc(2) Class326 local2 = this.aClass326_40;
		synchronized (this.aClass326_40) {
			this.aClass326_40.method7241(5);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)Lclient!tn;")
	public Class316 method5842(@OriginalArg(0) int arg0) {
		@Pc(13) Class326 local13 = this.aClass326_40;
		@Pc(23) Class316 local23;
		synchronized (this.aClass326_40) {
			local23 = (Class316) this.aClass326_40.method7238((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class111 local36 = this.aClass111_98;
		@Pc(45) byte[] local45;
		synchronized (this.aClass111_98) {
			local45 = this.aClass111_98.method2441(arg0, 30);
		}
		local23 = new Class316();
		if (local45 != null) {
			local23.method7039(new Class1_Sub20(local45));
		}
		@Pc(67) Class326 local67 = this.aClass326_40;
		synchronized (this.aClass326_40) {
			this.aClass326_40.method7236(local23, (long) arg0);
			return local23;
		}
	}
}
