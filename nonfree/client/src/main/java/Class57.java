import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class57 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!tb;")
	private final Class313 aClass313_13 = new Class313(64);

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Lclient!pl;")
	public final Class259 aClass259_30;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_31;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;Lclient!pl;)V")
	public Class57(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		this.aClass259_30 = arg3;
		this.aClass259_31 = arg2;
		this.aClass259_31.method5969(3);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1127() {
		@Pc(2) Class313 local2 = this.aClass313_13;
		synchronized (this.aClass313_13) {
			this.aClass313_13.method6977();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method1128() {
		@Pc(2) Class313 local2 = this.aClass313_13;
		synchronized (this.aClass313_13) {
			this.aClass313_13.method6983();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Lclient!dn;")
	public Class81 method1129(@OriginalArg(1) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_13;
		@Pc(16) Class81 local16;
		synchronized (this.aClass313_13) {
			local16 = (Class81) this.aClass313_13.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class259 local35 = this.aClass259_31;
		@Pc(44) byte[] local44;
		synchronized (this.aClass259_31) {
			local44 = this.aClass259_31.method5985(arg0, 3);
		}
		local16 = new Class81();
		local16.aClass57_2 = this;
		if (local44 != null) {
			local16.method1488(new Class2_Sub15(local44));
		}
		@Pc(69) Class313 local69 = this.aClass313_13;
		synchronized (this.aClass313_13) {
			this.aClass313_13.method6980((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(BI)V")
	public void method1130() {
		@Pc(6) Class313 local6 = this.aClass313_13;
		synchronized (this.aClass313_13) {
			this.aClass313_13.method6982(5);
		}
	}
}
