import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public final class Class127 {

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!mga;")
	private final Class223 aClass223_29 = new Class223(64);

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!bi;")
	private final Class31 aClass31_38;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class127(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_38 = arg2;
		this.aClass31_38.method657(32);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Lclient!gu;")
	public Class130 method3342(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_29;
		@Pc(16) Class130 local16;
		synchronized (this.aClass223_29) {
			local16 = (Class130) this.aClass223_29.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class31 local35 = this.aClass31_38;
		@Pc(44) byte[] local44;
		synchronized (this.aClass31_38) {
			local44 = this.aClass31_38.method667(32, arg0);
		}
		local16 = new Class130();
		if (local44 != null) {
			local16.method3355(new Class4_Sub9(local44));
		}
		@Pc(66) Class223 local66 = this.aClass223_29;
		synchronized (this.aClass223_29) {
			this.aClass223_29.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public void method3343() {
		@Pc(6) Class223 local6 = this.aClass223_29;
		synchronized (this.aClass223_29) {
			this.aClass223_29.method4941();
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZ)V")
	public void method3344() {
		@Pc(6) Class223 local6 = this.aClass223_29;
		synchronized (this.aClass223_29) {
			this.aClass223_29.method4933(5);
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
	public void method3346() {
		@Pc(2) Class223 local2 = this.aClass223_29;
		synchronized (this.aClass223_29) {
			this.aClass223_29.method4932();
		}
	}
}
