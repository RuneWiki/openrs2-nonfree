import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class166 {

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "Lclient!of;")
	private final Class236 aClass236_49 = new Class236(64);

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "Lclient!of;")
	public final Class236 aClass236_50 = new Class236(2);

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!oh;")
	private final Class237 aClass237_71;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!oh;")
	public final Class237 aClass237_70;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;)V")
	public Class166(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass237_71 = arg2;
		this.aClass237_70 = arg3;
		this.aClass237_71.method6315(33);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Lclient!jw;")
	public Class167 method4635(@OriginalArg(0) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_49;
		@Pc(16) Class167 local16;
		synchronized (this.aClass236_49) {
			local16 = (Class167) this.aClass236_49.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_71;
		@Pc(38) byte[] local38;
		synchronized (this.aClass237_71) {
			local38 = this.aClass237_71.method6314(33, arg0);
		}
		local16 = new Class167();
		local16.aClass166_1 = this;
		if (local38 != null) {
			local16.method4641(new Class8_Sub8(local38));
		}
		@Pc(71) Class236 local71 = this.aClass236_49;
		synchronized (this.aClass236_49) {
			this.aClass236_49.method6241((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V")
	public void method4637() {
		@Pc(2) Class236 local2 = this.aClass236_49;
		synchronized (this.aClass236_49) {
			this.aClass236_49.method6243(5);
		}
		local2 = this.aClass236_50;
		synchronized (this.aClass236_50) {
			this.aClass236_50.method6243(5);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	public void method4639() {
		@Pc(2) Class236 local2 = this.aClass236_49;
		synchronized (this.aClass236_49) {
			this.aClass236_49.method6245();
		}
		local2 = this.aClass236_50;
		synchronized (this.aClass236_50) {
			this.aClass236_50.method6245();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public void method4640() {
		@Pc(6) Class236 local6 = this.aClass236_49;
		synchronized (this.aClass236_49) {
			this.aClass236_49.method6253();
		}
		local6 = this.aClass236_50;
		synchronized (this.aClass236_50) {
			this.aClass236_50.method6253();
		}
	}
}
