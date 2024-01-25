import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class291 {

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "Lclient!uf;")
	private final Class326 aClass326_47 = new Class326(64);

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "Lclient!ga;")
	private final Class111 aClass111_110;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!nq;ILclient!ga;)V")
	public Class291(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111 arg2) {
		this.aClass111_110 = arg2;
		this.aClass111_110.method2442(32);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	public void method6672() {
		@Pc(2) Class326 local2 = this.aClass326_47;
		synchronized (this.aClass326_47) {
			this.aClass326_47.method7234();
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BI)V")
	public void method6673() {
		@Pc(6) Class326 local6 = this.aClass326_47;
		synchronized (this.aClass326_47) {
			this.aClass326_47.method7241(5);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Lclient!hj;")
	public Class138 method6675(@OriginalArg(0) int arg0) {
		@Pc(6) Class326 local6 = this.aClass326_47;
		@Pc(16) Class138 local16;
		synchronized (this.aClass326_47) {
			local16 = (Class138) this.aClass326_47.method7238((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class111 local29 = this.aClass111_110;
		@Pc(38) byte[] local38;
		synchronized (this.aClass111_110) {
			local38 = this.aClass111_110.method2441(arg0, 32);
		}
		local16 = new Class138();
		if (local38 != null) {
			local16.method3399(new Class1_Sub20(local38));
		}
		@Pc(65) Class326 local65 = this.aClass326_47;
		synchronized (this.aClass326_47) {
			this.aClass326_47.method7236(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	public void method6676() {
		@Pc(2) Class326 local2 = this.aClass326_47;
		synchronized (this.aClass326_47) {
			this.aClass326_47.method7230();
		}
	}
}
