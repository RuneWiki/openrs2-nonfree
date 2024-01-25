import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class32 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!uf;")
	private Class326 aClass326_2 = new Class326(64);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!ga;")
	private final Class111 aClass111_7;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class32(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_7 = arg2;
		if (this.aClass111_7 != null) {
			@Pc(20) int local20 = this.aClass111_7.method2436() - 1;
			this.aClass111_7.method2442(local20);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lclient!bs;")
	public Class38 method1001(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_2;
		@Pc(16) Class38 local16;
		synchronized (this.aClass326_2) {
			local16 = (Class38) this.aClass326_2.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class111 local37 = this.aClass111_7;
		@Pc(50) byte[] local50;
		synchronized (this.aClass111_7) {
			local50 = this.aClass111_7.method2441(Static466.method2184(arg0), Static593.method7898(arg0));
		}
		local16 = new Class38();
		if (local50 != null) {
			local16.method1138(new Class1_Sub20(local50));
		}
		@Pc(72) Class326 local72 = this.aClass326_2;
		synchronized (this.aClass326_2) {
			this.aClass326_2.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method1002() {
		@Pc(11) Class326 local11 = this.aClass326_2;
		synchronized (this.aClass326_2) {
			this.aClass326_2.method7234();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)V")
	public void method1004() {
		@Pc(6) Class326 local6 = this.aClass326_2;
		synchronized (this.aClass326_2) {
			this.aClass326_2.method7241(5);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V")
	public void method1005(@OriginalArg(1) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_2;
		synchronized (this.aClass326_2) {
			this.aClass326_2.method7230();
			this.aClass326_2 = new Class326(arg0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
	public void method1006() {
		@Pc(2) Class326 local2 = this.aClass326_2;
		synchronized (this.aClass326_2) {
			this.aClass326_2.method7230();
		}
	}
}
