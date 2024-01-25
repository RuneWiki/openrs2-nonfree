import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class56 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "Lclient!uf;")
	private final Class326 aClass326_7 = new Class326(128);

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "Lclient!ga;")
	private final Class111 aClass111_16;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class56(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_16 = arg2;
		this.aClass111_16.method2442(1);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1614() {
		@Pc(10) Class326 local10 = this.aClass326_7;
		synchronized (this.aClass326_7) {
			this.aClass326_7.method7234();
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	public void method1615() {
		@Pc(6) Class326 local6 = this.aClass326_7;
		synchronized (this.aClass326_7) {
			this.aClass326_7.method7230();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lclient!je;")
	public Class166 method1618(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_7;
		@Pc(16) Class166 local16;
		synchronized (this.aClass326_7) {
			local16 = (Class166) this.aClass326_7.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_16;
		@Pc(40) byte[] local40;
		synchronized (this.aClass111_16) {
			local40 = this.aClass111_16.method2441(arg0, 1);
		}
		local16 = new Class166();
		if (local40 != null) {
			local16.method3959(new Class1_Sub20(local40));
		}
		@Pc(64) Class326 local64 = this.aClass326_7;
		synchronized (this.aClass326_7) {
			this.aClass326_7.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BI)V")
	public void method1619() {
		@Pc(6) Class326 local6 = this.aClass326_7;
		synchronized (this.aClass326_7) {
			this.aClass326_7.method7241(5);
		}
	}
}
