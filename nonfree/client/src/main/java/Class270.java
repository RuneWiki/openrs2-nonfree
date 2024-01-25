import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class270 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!of;")
	private final Class236 aClass236_77 = new Class236(16);

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "Lclient!oh;")
	private final Class237 aClass237_113;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class270(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_113 = arg2;
		this.aClass237_113.method6315(30);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Lclient!sk;")
	public Class311 method6820(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_77;
		@Pc(16) Class311 local16;
		synchronized (this.aClass236_77) {
			local16 = (Class311) this.aClass236_77.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_113;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_113) {
			local38 = this.aClass237_113.method6314(30, arg0);
		}
		local16 = new Class311();
		if (local38 != null) {
			local16.method7420(new Class8_Sub8(local38));
		}
		@Pc(65) Class236 local65 = this.aClass236_77;
		synchronized (this.aClass236_77) {
			this.aClass236_77.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public void method6822() {
		@Pc(7) Class236 local7 = this.aClass236_77;
		synchronized (this.aClass236_77) {
			this.aClass236_77.method6243(5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	public void method6823() {
		@Pc(2) Class236 local2 = this.aClass236_77;
		synchronized (this.aClass236_77) {
			this.aClass236_77.method6253();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	public void method6824() {
		@Pc(10) Class236 local10 = this.aClass236_77;
		synchronized (this.aClass236_77) {
			this.aClass236_77.method6245();
		}
	}
}
