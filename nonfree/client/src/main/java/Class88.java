import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class88 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "Lclient!mga;")
	private final Class223 aClass223_14 = new Class223(64);

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_24;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class88(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_24 = arg2;
		this.aClass31_24.method657(31);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	public void method2417() {
		@Pc(2) Class223 local2 = this.aClass223_14;
		synchronized (this.aClass223_14) {
			this.aClass223_14.method4933(5);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public void method2418() {
		@Pc(8) Class223 local8 = this.aClass223_14;
		synchronized (this.aClass223_14) {
			this.aClass223_14.method4941();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lclient!vw;")
	public Class350 method2419(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_14;
		@Pc(16) Class350 local16;
		synchronized (this.aClass223_14) {
			local16 = (Class350) this.aClass223_14.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_24;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_24) {
			local38 = this.aClass31_24.method667(31, arg0);
		}
		local16 = new Class350();
		if (local38 != null) {
			local16.method7822(new Class4_Sub9(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_14;
		synchronized (this.aClass223_14) {
			this.aClass223_14.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	public void method2422() {
		@Pc(6) Class223 local6 = this.aClass223_14;
		synchronized (this.aClass223_14) {
			this.aClass223_14.method4932();
		}
	}
}
