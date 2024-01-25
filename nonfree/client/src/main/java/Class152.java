import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class152 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!mga;")
	private final Class223 aClass223_34 = new Class223(64);

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_44;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class152(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_44 = arg2;
		if (this.aClass31_44 != null) {
			this.aClass31_44.method657(11);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method3674() {
		@Pc(10) Class223 local10 = this.aClass223_34;
		synchronized (this.aClass223_34) {
			this.aClass223_34.method4932();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public void method3675() {
		@Pc(10) Class223 local10 = this.aClass223_34;
		synchronized (this.aClass223_34) {
			this.aClass223_34.method4941();
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public void method3676() {
		@Pc(2) Class223 local2 = this.aClass223_34;
		synchronized (this.aClass223_34) {
			this.aClass223_34.method4933(5);
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lclient!cr;")
	public Class59 method3679(@OriginalArg(1) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_34;
		@Pc(21) Class59 local21;
		synchronized (this.aClass223_34) {
			local21 = (Class59) this.aClass223_34.method4943((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class31 local34 = this.aClass31_44;
		@Pc(43) byte[] local43;
		synchronized (this.aClass31_44) {
			local43 = this.aClass31_44.method667(11, arg0);
		}
		local21 = new Class59();
		if (local43 != null) {
			local21.method1338(new Class4_Sub9(local43));
		}
		@Pc(65) Class223 local65 = this.aClass223_34;
		synchronized (this.aClass223_34) {
			this.aClass223_34.method4938((long) arg0, local21);
			return local21;
		}
	}
}
