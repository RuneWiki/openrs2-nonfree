import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class190 {

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!mga;")
	private Class223 aClass223_38 = new Class223(64);

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!mga;")
	public Class223 aClass223_39 = new Class223(64);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!bi;")
	public final Class31 aClass31_57;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!bi;")
	private final Class31 aClass31_58;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;Lclient!bi;)V")
	public Class190(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class31 arg3) {
		this.aClass31_57 = arg3;
		this.aClass31_58 = arg2;
		this.aClass31_58.method657(34);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public void method4347() {
		@Pc(2) Class223 local2 = this.aClass223_38;
		synchronized (this.aClass223_38) {
			this.aClass223_38.method4933(5);
		}
		local2 = this.aClass223_39;
		synchronized (this.aClass223_39) {
			this.aClass223_39.method4933(5);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public void method4348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass223_38 = new Class223(arg0);
		this.aClass223_39 = new Class223(arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public void method4350() {
		@Pc(6) Class223 local6 = this.aClass223_38;
		synchronized (this.aClass223_38) {
			this.aClass223_38.method4932();
		}
		local6 = this.aClass223_39;
		synchronized (this.aClass223_39) {
			this.aClass223_39.method4932();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method4351() {
		@Pc(6) Class223 local6 = this.aClass223_38;
		synchronized (this.aClass223_38) {
			this.aClass223_38.method4941();
		}
		local6 = this.aClass223_39;
		synchronized (this.aClass223_39) {
			this.aClass223_39.method4941();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)Lclient!bn;")
	public Class34 method4353(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_38;
		@Pc(16) Class34 local16;
		synchronized (this.aClass223_38) {
			local16 = (Class34) this.aClass223_38.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_58;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_58) {
			local38 = this.aClass31_58.method667(34, arg0);
		}
		local16 = new Class34();
		local16.aClass190_1 = this;
		if (local38 != null) {
			local16.method728(new Class4_Sub9(local38));
		}
		@Pc(70) Class223 local70 = this.aClass223_38;
		synchronized (this.aClass223_38) {
			this.aClass223_38.method4938((long) arg0, local16);
			return local16;
		}
	}
}
