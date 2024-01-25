import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class232 {

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!tb;")
	private final Class313 aClass313_40 = new Class313(16);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!pl;")
	private final Class259 aClass259_116;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!rf;ILclient!pl;)V")
	public Class232(@OriginalArg(0) Class284 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class259 arg2) {
		this.aClass259_116 = arg2;
		this.aClass259_116.method5969(30);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method5408() {
		@Pc(2) Class313 local2 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method6977();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	public void method5409() {
		@Pc(2) Class313 local2 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method6983();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
	public void method5410() {
		@Pc(6) Class313 local6 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method6982(5);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lclient!dba;")
	public Class69 method5413(@OriginalArg(0) int arg0) {
		@Pc(6) Class313 local6 = this.aClass313_40;
		@Pc(16) Class69 local16;
		synchronized (this.aClass313_40) {
			local16 = (Class69) this.aClass313_40.method6989((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class259 local29 = this.aClass259_116;
		@Pc(45) byte[] local45;
		synchronized (this.aClass259_116) {
			local45 = this.aClass259_116.method5985(arg0, 30);
		}
		local16 = new Class69();
		if (local45 != null) {
			local16.method1274(new Class2_Sub15(local45));
		}
		@Pc(67) Class313 local67 = this.aClass313_40;
		synchronized (this.aClass313_40) {
			this.aClass313_40.method6980((long) arg0, local16);
			return local16;
		}
	}
}
