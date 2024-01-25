import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class140 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!mga;")
	private final Class223 aClass223_30 = new Class223(64);

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!bi;")
	private final Class31 aClass31_40;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!pca;ILclient!bi;)V")
	public Class140(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2) {
		this.aClass31_40 = arg2;
		if (this.aClass31_40 != null) {
			this.aClass31_40.method657(35);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lclient!iq;")
	public Class164 method3540(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_30;
		@Pc(16) Class164 local16;
		synchronized (this.aClass223_30) {
			local16 = (Class164) this.aClass223_30.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_40;
		@Pc(38) byte[] local38;
		synchronized (this.aClass31_40) {
			local38 = this.aClass31_40.method667(35, arg0);
		}
		local16 = new Class164();
		if (local38 != null) {
			local16.method3968(new Class4_Sub9(local38));
		}
		local16.method3970();
		@Pc(63) Class223 local63 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public void method3541() {
		@Pc(2) Class223 local2 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method4933(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public void method3543() {
		@Pc(6) Class223 local6 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method4941();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public void method3544() {
		@Pc(13) Class223 local13 = this.aClass223_30;
		synchronized (this.aClass223_30) {
			this.aClass223_30.method4932();
		}
	}
}
