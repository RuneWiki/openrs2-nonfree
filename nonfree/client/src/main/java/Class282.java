import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class282 {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!tb;")
	private Class313 aClass313_46 = new Class313(64);

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_142;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class282(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_142 = arg2;
		if (this.aClass259_142 != null) {
			@Pc(20) int local20 = this.aClass259_142.method5962() - 1;
			this.aClass259_142.method5969(local20);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Lclient!qb;")
	public Class264 method6474(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_46;
		@Pc(16) Class264 local16;
		synchronized (this.aClass313_46) {
			local16 = (Class264) this.aClass313_46.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class259 local37 = this.aClass259_142;
		@Pc(50) byte[] local50;
		synchronized (this.aClass259_142) {
			local50 = this.aClass259_142.method5985(Static515.method7136(arg0), Static351.method5219(arg0));
		}
		local16 = new Class264();
		if (local50 != null) {
			local16.method6084(new Class2_Sub15(local50));
		}
		@Pc(72) Class313 local72 = this.aClass313_46;
		synchronized (this.aClass313_46) {
			this.aClass313_46.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method6475() {
		@Pc(2) Class313 local2 = this.aClass313_46;
		synchronized (this.aClass313_46) {
			this.aClass313_46.method6983();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
	public void method6476() {
		@Pc(6) Class313 local6 = this.aClass313_46;
		synchronized (this.aClass313_46) {
			this.aClass313_46.method6982(5);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public void method6477(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_46;
		synchronized (this.aClass313_46) {
			this.aClass313_46.method6977();
			this.aClass313_46 = new Class313(arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public void method6478() {
		@Pc(2) Class313 local2 = this.aClass313_46;
		synchronized (this.aClass313_46) {
			this.aClass313_46.method6977();
		}
	}
}
