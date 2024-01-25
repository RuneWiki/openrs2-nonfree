import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class263 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!fba;")
	private final Class102 aClass102_46 = new Class102(64);

	@OriginalMember(owner = "client!po", name = "k", descriptor = "Lclient!fba;")
	public final Class102 aClass102_47 = new Class102(2);

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!la;")
	public final Class196 aClass196_92;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!la;")
	private final Class196 aClass196_93;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;)V")
	public Class263(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass196_92 = arg3;
		this.aClass196_93 = arg2;
		this.aClass196_93.method5118(33);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public void method6849() {
		@Pc(2) Class102 local2 = this.aClass102_46;
		synchronized (this.aClass102_46) {
			this.aClass102_46.method2681();
		}
		local2 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2681();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public void method6850() {
		@Pc(2) Class102 local2 = this.aClass102_46;
		synchronized (this.aClass102_46) {
			this.aClass102_46.method2680();
		}
		local2 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2680();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Lclient!qg;")
	public Class275 method6852(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_46;
		@Pc(16) Class275 local16;
		synchronized (this.aClass102_46) {
			local16 = (Class275) this.aClass102_46.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class196 local34 = this.aClass196_93;
		@Pc(43) byte[] local43;
		synchronized (this.aClass196_93) {
			local43 = this.aClass196_93.method5102(33, arg0);
		}
		local16 = new Class275();
		local16.aClass263_29 = this;
		if (local43 != null) {
			local16.method7009(new Class3_Sub3(local43));
		}
		@Pc(68) Class102 local68 = this.aClass102_46;
		synchronized (this.aClass102_46) {
			this.aClass102_46.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
	public void method6853() {
		@Pc(6) Class102 local6 = this.aClass102_46;
		synchronized (this.aClass102_46) {
			this.aClass102_46.method2668(5);
		}
		local6 = this.aClass102_47;
		synchronized (this.aClass102_47) {
			this.aClass102_47.method2668(5);
		}
	}
}
