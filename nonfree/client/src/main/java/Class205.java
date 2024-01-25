import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class205 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "Lclient!mga;")
	private final Class223 aClass223_41 = new Class223(128);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_65;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class205(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_65 = arg2;
		if (this.aClass31_65 != null) {
			@Pc(20) int local20 = this.aClass31_65.method675() - 1;
			this.aClass31_65.method657(local20);
		}
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(BI)Lclient!hn;")
	public Class146 method4571(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_41;
		@Pc(16) Class146 local16;
		synchronized (this.aClass223_41) {
			local16 = (Class146) this.aClass223_41.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass31_65.method667(Static414.method5935(arg0), Static576.method7839(arg0));
		local16 = new Class146();
		if (local37 != null) {
			local16.method3570(new Class4_Sub9(local37));
		}
		@Pc(61) Class223 local61 = this.aClass223_41;
		synchronized (this.aClass223_41) {
			this.aClass223_41.method4938((long) arg0, local16);
			return local16;
		}
	}
}
