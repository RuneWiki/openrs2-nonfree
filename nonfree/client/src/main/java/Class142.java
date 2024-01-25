import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class142 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!mga;")
	private final Class223 aClass223_31 = new Class223(64);

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!bi;")
	private final Class31 aClass31_41;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class142(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_41 = arg2;
		this.aClass31_41.method657(5);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Lclient!rk;")
	public Class4_Sub7_Sub14 method3547(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_31;
		@Pc(16) Class4_Sub7_Sub14 local16;
		synchronized (this.aClass223_31) {
			local16 = (Class4_Sub7_Sub14) this.aClass223_31.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_41;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_41) {
			local38 = this.aClass31_41.method667(5, arg0);
		}
		local16 = new Class4_Sub7_Sub14();
		if (local38 != null) {
			local16.method6486(new Class4_Sub9(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_31;
		synchronized (this.aClass223_31) {
			this.aClass223_31.method4938((long) arg0, local16);
			return local16;
		}
	}
}
