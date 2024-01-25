import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class274 {

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "Lclient!of;")
	private final Class236 aClass236_79 = new Class236(64);

	@OriginalMember(owner = "client!qia", name = "d", descriptor = "Lclient!oh;")
	private final Class237 aClass237_115;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;)V")
	public Class274(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2) {
		this.aClass237_115 = arg2;
		if (this.aClass237_115 != null) {
			this.aClass237_115.method6315(11);
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
	public void method6930() {
		@Pc(2) Class236 local2 = this.aClass236_79;
		synchronized (this.aClass236_79) {
			this.aClass236_79.method6245();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(II)V")
	public void method6931() {
		@Pc(2) Class236 local2 = this.aClass236_79;
		synchronized (this.aClass236_79) {
			this.aClass236_79.method6243(5);
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
	public void method6932() {
		@Pc(2) Class236 local2 = this.aClass236_79;
		synchronized (this.aClass236_79) {
			this.aClass236_79.method6253();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZI)Lclient!ed;")
	public Class82 method6933(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_79;
		@Pc(16) Class82 local16;
		synchronized (this.aClass236_79) {
			local16 = (Class82) this.aClass236_79.method6242((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class237 local29 = this.aClass237_115;
		@Pc(44) byte[] local44;
		synchronized (this.aClass237_115) {
			local44 = this.aClass237_115.method6314(11, arg0);
		}
		local16 = new Class82();
		if (local44 != null) {
			local16.method2611(new Class8_Sub8(local44));
		}
		@Pc(66) Class236 local66 = this.aClass236_79;
		synchronized (this.aClass236_79) {
			this.aClass236_79.method6241((long) arg0, local16);
			return local16;
		}
	}
}
