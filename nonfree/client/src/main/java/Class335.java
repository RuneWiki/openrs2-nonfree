import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class335 {

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!uf;")
	private final Class326 aClass326_53 = new Class326(64);

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "Lclient!ga;")
	private final Class111 aClass111_118;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class335(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_118 = arg2;
		this.aClass111_118.method2442(31);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public void method7408() {
		@Pc(2) Class326 local2 = this.aClass326_53;
		synchronized (this.aClass326_53) {
			this.aClass326_53.method7241(5);
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)Lclient!wu;")
	public Class364 method7409(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_53;
		@Pc(16) Class364 local16;
		synchronized (this.aClass326_53) {
			local16 = (Class364) this.aClass326_53.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class111 local34 = this.aClass111_118;
		@Pc(43) byte[] local43;
		synchronized (this.aClass111_118) {
			local43 = this.aClass111_118.method2441(arg0, 31);
		}
		local16 = new Class364();
		if (local43 != null) {
			local16.method7901(new Class1_Sub20(local43));
		}
		@Pc(65) Class326 local65 = this.aClass326_53;
		synchronized (this.aClass326_53) {
			this.aClass326_53.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method7411() {
		@Pc(6) Class326 local6 = this.aClass326_53;
		synchronized (this.aClass326_53) {
			this.aClass326_53.method7234();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	public void method7414() {
		@Pc(2) Class326 local2 = this.aClass326_53;
		synchronized (this.aClass326_53) {
			this.aClass326_53.method7230();
		}
	}
}
