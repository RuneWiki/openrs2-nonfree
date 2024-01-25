import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class107 {

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!of;")
	private final Class236 aClass236_29 = new Class236(128);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "Lclient!oh;")
	private final Class237 aClass237_51;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class107(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_51 = arg2;
		this.aClass237_51.method6315(1);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method3242() {
		@Pc(2) Class236 local2 = this.aClass236_29;
		synchronized (this.aClass236_29) {
			this.aClass236_29.method6245();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	public void method3243() {
		@Pc(11) Class236 local11 = this.aClass236_29;
		synchronized (this.aClass236_29) {
			this.aClass236_29.method6253();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V")
	public void method3244() {
		@Pc(6) Class236 local6 = this.aClass236_29;
		synchronized (this.aClass236_29) {
			this.aClass236_29.method6243(5);
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IB)Lclient!rq;")
	public Class298 method3246(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_29;
		@Pc(16) Class298 local16;
		synchronized (this.aClass236_29) {
			local16 = (Class298) this.aClass236_29.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_51;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_51) {
			local38 = this.aClass237_51.method6314(1, arg0);
		}
		local16 = new Class298();
		if (local38 != null) {
			local16.method7232(new Class8_Sub8(local38));
		}
		@Pc(66) Class236 local66 = this.aClass236_29;
		synchronized (this.aClass236_29) {
			this.aClass236_29.method6241((long) arg0, local16);
			return local16;
		}
	}
}
