import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class110 {

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!mga;")
	private final Class223 aClass223_28 = new Class223(16);

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "Lclient!bi;")
	private final Class31 aClass31_34;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class110(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_34 = arg2;
		this.aClass31_34.method657(30);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)Lclient!uu;")
	public Class341 method3077(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_28;
		@Pc(16) Class341 local16;
		synchronized (this.aClass223_28) {
			local16 = (Class341) this.aClass223_28.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class31 local37 = this.aClass31_34;
		@Pc(46) byte[] local46;
		synchronized (this.aClass31_34) {
			local46 = this.aClass31_34.method667(30, arg0);
		}
		local16 = new Class341();
		if (local46 != null) {
			local16.method7530(new Class4_Sub9(local46));
		}
		@Pc(68) Class223 local68 = this.aClass223_28;
		synchronized (this.aClass223_28) {
			this.aClass223_28.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	public void method3078() {
		@Pc(2) Class223 local2 = this.aClass223_28;
		synchronized (this.aClass223_28) {
			this.aClass223_28.method4941();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZI)V")
	public void method3079() {
		@Pc(2) Class223 local2 = this.aClass223_28;
		synchronized (this.aClass223_28) {
			this.aClass223_28.method4933(5);
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	public void method3081() {
		@Pc(6) Class223 local6 = this.aClass223_28;
		synchronized (this.aClass223_28) {
			this.aClass223_28.method4932();
		}
	}
}
