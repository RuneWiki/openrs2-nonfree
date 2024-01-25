import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class237 {

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!mga;")
	private final Class223 aClass223_45 = new Class223(64);

	@OriginalMember(owner = "client!naa", name = "e", descriptor = "Lclient!bi;")
	private final Class31 aClass31_72;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "Lclient!bi;")
	public final Class31 aClass31_73;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;)V")
	public Class237(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3) {
		this.aClass31_72 = arg2;
		this.aClass31_73 = arg3;
		this.aClass31_72.method657(3);
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(II)V")
	public void method5095() {
		@Pc(2) Class223 local2 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method4933(5);
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I)V")
	public void method5096() {
		@Pc(12) Class223 local12 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method4941();
		}
	}

	@OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
	public void method5098() {
		@Pc(6) Class223 local6 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method4932();
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)Lclient!md;")
	public Class218 method5101(@OriginalArg(1) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_45;
		@Pc(21) Class218 local21;
		synchronized (this.aClass223_45) {
			local21 = (Class218) this.aClass223_45.method4943((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class31 local34 = this.aClass31_72;
		@Pc(43) byte[] local43;
		synchronized (this.aClass31_72) {
			local43 = this.aClass31_72.method667(3, arg0);
		}
		local21 = new Class218();
		local21.aClass237_1 = this;
		if (local43 != null) {
			local21.method4884(new Class4_Sub9(local43));
		}
		@Pc(68) Class223 local68 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method4938((long) arg0, local21);
			return local21;
		}
	}
}
