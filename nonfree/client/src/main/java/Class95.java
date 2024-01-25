import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class95 {

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!of;")
	private final Class236 aClass236_27 = new Class236(128);

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!oh;")
	private final Class237 aClass237_40;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class95(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_40 = arg2;
		if (this.aClass237_40 != null) {
			@Pc(20) int local20 = this.aClass237_40.method6311() - 1;
			this.aClass237_40.method6315(local20);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!sp;")
	public Class315 method2955(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_27;
		@Pc(16) Class315 local16;
		synchronized (this.aClass236_27) {
			local16 = (Class315) this.aClass236_27.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass237_40.method6314(Static570.method7928(arg0), Static9.method130(arg0));
		local16 = new Class315();
		if (local44 != null) {
			local16.method7458(new Class8_Sub8(local44));
		}
		@Pc(60) Class236 local60 = this.aClass236_27;
		synchronized (this.aClass236_27) {
			this.aClass236_27.method6241((long) arg0, local16);
			return local16;
		}
	}
}
