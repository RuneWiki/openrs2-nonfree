import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class101 {

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "Lclient!mga;")
	private Class223 aClass223_24 = new Class223(64);

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "Lclient!bi;")
	private final Class31 aClass31_30;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class101(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_30 = arg2;
		if (this.aClass31_30 != null) {
			@Pc(20) int local20 = this.aClass31_30.method675() - 1;
			this.aClass31_30.method657(local20);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZ)Lclient!wj;")
	public Class356 method2819(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_24;
		@Pc(16) Class356 local16;
		synchronized (this.aClass223_24) {
			local16 = (Class356) this.aClass223_24.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_30;
		@Pc(42) byte[] local42;
		synchronized (this.aClass31_30) {
			local42 = this.aClass31_30.method667(Static553.method7633(arg0), Static23.method436(arg0));
		}
		local16 = new Class356();
		if (local42 != null) {
			local16.method7937(new Class4_Sub9(local42));
		}
		@Pc(64) Class223 local64 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
	public void method2820() {
		@Pc(2) Class223 local2 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method4941();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V")
	public void method2821() {
		@Pc(6) Class223 local6 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method4932();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)V")
	public void method2822() {
		@Pc(10) Class223 local10 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method4933(5);
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)V")
	public void method2823(@OriginalArg(0) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method4932();
			this.aClass223_24 = new Class223(arg0);
		}
	}
}
