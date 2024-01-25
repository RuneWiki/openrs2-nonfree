import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class15 {

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!mga;")
	private final Class223 aClass223_5 = new Class223(64);

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Lclient!mga;")
	public final Class223 aClass223_6 = new Class223(2);

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!bi;")
	public final Class31 aClass31_5;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!bi;")
	private final Class31 aClass31_6;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;)V")
	public Class15(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3) {
		this.aClass31_5 = arg3;
		this.aClass31_6 = arg2;
		this.aClass31_6.method657(33);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	public void method304() {
		@Pc(6) Class223 local6 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method4941();
		}
		local6 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method4941();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)V")
	public void method305() {
		@Pc(2) Class223 local2 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method4933(5);
		}
		local2 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method4933(5);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public void method306() {
		@Pc(2) Class223 local2 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method4932();
		}
		local2 = this.aClass223_6;
		synchronized (this.aClass223_6) {
			this.aClass223_6.method4932();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Lclient!pc;")
	public Class262 method307(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_5;
		@Pc(16) Class262 local16;
		synchronized (this.aClass223_5) {
			local16 = (Class262) this.aClass223_5.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_6;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_6) {
			local38 = this.aClass31_6.method667(33, arg0);
		}
		local16 = new Class262();
		local16.aClass15_4 = this;
		if (local38 != null) {
			local16.method5799(new Class4_Sub9(local38));
		}
		@Pc(68) Class223 local68 = this.aClass223_5;
		synchronized (this.aClass223_5) {
			this.aClass223_5.method4938((long) arg0, local16);
			return local16;
		}
	}
}
