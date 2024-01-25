import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afa")
public final class Class12 {

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "Lclient!of;")
	private Class236 aClass236_1 = new Class236(128);

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "Lclient!of;")
	public Class236 aClass236_2 = new Class236(64);

	@OriginalMember(owner = "client!afa", name = "h", descriptor = "Lclient!oh;")
	private final Class237 aClass237_6;

	@OriginalMember(owner = "client!afa", name = "n", descriptor = "Lclient!oh;")
	public final Class237 aClass237_7;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lclient!nb;ILclient!oh;Lclient!oh;)V")
	public Class12(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) Class237 arg3) {
		this.aClass237_6 = arg2;
		this.aClass237_7 = arg3;
		this.aClass237_6.method6315(36);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
	public void method134() {
		@Pc(2) Class236 local2 = this.aClass236_1;
		synchronized (this.aClass236_1) {
			this.aClass236_1.method6243(5);
		}
		local2 = this.aClass236_2;
		synchronized (this.aClass236_2) {
			this.aClass236_2.method6243(5);
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
	public void method135() {
		@Pc(6) Class236 local6 = this.aClass236_1;
		synchronized (this.aClass236_1) {
			this.aClass236_1.method6245();
		}
		local6 = this.aClass236_2;
		synchronized (this.aClass236_2) {
			this.aClass236_2.method6245();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Lclient!aia;")
	public Class17 method136(@OriginalArg(1) int arg0) {
		@Pc(6) Class236 local6 = this.aClass236_1;
		@Pc(18) Class17 local18;
		synchronized (this.aClass236_1) {
			local18 = (Class17) this.aClass236_1.method6242((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class237 local31 = this.aClass237_6;
		@Pc(40) byte[] local40;
		synchronized (this.aClass237_6) {
			local40 = this.aClass237_6.method6314(36, arg0);
		}
		local18 = new Class17();
		local18.aClass12_1 = this;
		local18.anInt818 = arg0;
		if (local40 != null) {
			local18.method761(new Class8_Sub8(local40));
		}
		local18.method766();
		@Pc(71) Class236 local71 = this.aClass236_1;
		synchronized (this.aClass236_1) {
			this.aClass236_1.method6241((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
	public void method137() {
		@Pc(10) Class236 local10 = this.aClass236_1;
		synchronized (this.aClass236_1) {
			this.aClass236_1.method6253();
		}
		local10 = this.aClass236_2;
		synchronized (this.aClass236_2) {
			this.aClass236_2.method6253();
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZII)V")
	public void method138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass236_1 = new Class236(arg1);
		this.aClass236_2 = new Class236(arg0);
	}
}
