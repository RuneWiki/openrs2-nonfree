import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class162 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Lclient!mga;")
	private final Class223 aClass223_35 = new Class223(128);

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "Lclient!bi;")
	private final Class31 aClass31_50;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class162(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_50 = arg2;
		this.aClass31_50.method657(1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3846() {
		@Pc(6) Class223 local6 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method4941();
		}
	}

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V")
	public void method3848() {
		@Pc(6) Class223 local6 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method4932();
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)Lclient!hr;")
	public Class149 method3849(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_35;
		@Pc(16) Class149 local16;
		synchronized (this.aClass223_35) {
			local16 = (Class149) this.aClass223_35.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_50;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_50) {
			local38 = this.aClass31_50.method667(1, arg0);
		}
		local16 = new Class149();
		if (local38 != null) {
			local16.method3604(new Class4_Sub9(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public void method3852() {
		@Pc(2) Class223 local2 = this.aClass223_35;
		synchronized (this.aClass223_35) {
			this.aClass223_35.method4933(5);
		}
	}
}
