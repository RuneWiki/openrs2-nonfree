import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class92 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "Lclient!of;")
	private final Class236 aClass236_26 = new Class236(64);

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_39;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class92(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_39 = arg2;
		this.aClass237_39.method6315(5);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)Lclient!qga;")
	public Class8_Sub5_Sub15 method2947(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_26;
		@Pc(16) Class8_Sub5_Sub15 local16;
		synchronized (this.aClass236_26) {
			local16 = (Class8_Sub5_Sub15) this.aClass236_26.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class237 local37 = this.aClass237_39;
		@Pc(46) byte[] local46;
		synchronized (this.aClass237_39) {
			local46 = this.aClass237_39.method6314(5, arg0);
		}
		local16 = new Class8_Sub5_Sub15();
		if (local46 != null) {
			local16.method6887(new Class8_Sub8(local46));
		}
		@Pc(68) Class236 local68 = this.aClass236_26;
		synchronized (this.aClass236_26) {
			this.aClass236_26.method6241((long) arg0, local16);
			return local16;
		}
	}
}
