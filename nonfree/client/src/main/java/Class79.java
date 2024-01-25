import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class79 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!of;")
	private final Class236 aClass236_18 = new Class236(64);

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!oh;")
	public final Class237 aClass237_31;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!oh;")
	private final Class237 aClass237_29;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;)V")
	public Class79(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass237_31 = arg3;
		this.aClass237_29 = arg2;
		this.aClass237_29.method6315(3);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method2531() {
		@Pc(11) Class236 local11 = this.aClass236_18;
		synchronized (this.aClass236_18) {
			this.aClass236_18.method6245();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	public void method2532() {
		@Pc(2) Class236 local2 = this.aClass236_18;
		synchronized (this.aClass236_18) {
			this.aClass236_18.method6243(5);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public void method2534() {
		@Pc(2) Class236 local2 = this.aClass236_18;
		synchronized (this.aClass236_18) {
			this.aClass236_18.method6253();
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lclient!mv;")
	public Class215 method2535(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_18;
		@Pc(16) Class215 local16;
		synchronized (this.aClass236_18) {
			local16 = (Class215) this.aClass236_18.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_29;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_29) {
			local38 = this.aClass237_29.method6314(3, arg0);
		}
		local16 = new Class215();
		local16.aClass79_2 = this;
		if (local38 != null) {
			local16.method5563(new Class8_Sub8(local38));
		}
		@Pc(63) Class236 local63 = this.aClass236_18;
		synchronized (this.aClass236_18) {
			this.aClass236_18.method6241((long) arg0, local16);
			return local16;
		}
	}
}
