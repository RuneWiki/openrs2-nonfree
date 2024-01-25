import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class261 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!fba;")
	private final Class102 aClass102_44 = new Class102(64);

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!la;")
	private final Class196 aClass196_86;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class261(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_86 = arg2;
		this.aClass196_86.method5118(32);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!hn;")
	public Class143 method6770(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_44;
		@Pc(16) Class143 local16;
		synchronized (this.aClass102_44) {
			local16 = (Class143) this.aClass102_44.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class196 local34 = this.aClass196_86;
		@Pc(43) byte[] local43;
		synchronized (this.aClass196_86) {
			local43 = this.aClass196_86.method5102(32, arg0);
		}
		local16 = new Class143();
		if (local43 != null) {
			local16.method3687(new Class3_Sub3(local43));
		}
		@Pc(65) Class102 local65 = this.aClass102_44;
		synchronized (this.aClass102_44) {
			this.aClass102_44.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public void method6772() {
		@Pc(2) Class102 local2 = this.aClass102_44;
		synchronized (this.aClass102_44) {
			this.aClass102_44.method2681();
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
	public void method6774() {
		@Pc(12) Class102 local12 = this.aClass102_44;
		synchronized (this.aClass102_44) {
			this.aClass102_44.method2668(5);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method6775() {
		@Pc(2) Class102 local2 = this.aClass102_44;
		synchronized (this.aClass102_44) {
			this.aClass102_44.method2680();
		}
	}
}
