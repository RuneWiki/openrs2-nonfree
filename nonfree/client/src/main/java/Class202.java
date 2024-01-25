import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class202 {

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!fba;")
	private Class102 aClass102_35 = new Class102(64);

	@OriginalMember(owner = "client!le", name = "l", descriptor = "Lclient!fba;")
	public Class102 aClass102_37 = new Class102(64);

	@OriginalMember(owner = "client!le", name = "h", descriptor = "Lclient!la;")
	public final Class196 aClass196_62;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Lclient!la;")
	private final Class196 aClass196_63;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;)V")
	public Class202(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass196_62 = arg3;
		this.aClass196_63 = arg2;
		this.aClass196_63.method5118(34);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Lclient!rn;")
	public Class296 method5162(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_35;
		@Pc(16) Class296 local16;
		synchronized (this.aClass102_35) {
			local16 = (Class296) this.aClass102_35.method2677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class196 local29 = this.aClass196_63;
		@Pc(38) byte[] local38;
		synchronized (this.aClass196_63) {
			local38 = this.aClass196_63.method5102(34, arg0);
		}
		local16 = new Class296();
		local16.aClass202_4 = this;
		if (local38 != null) {
			local16.method7391(new Class3_Sub3(local38));
		}
		@Pc(63) Class102 local63 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2674((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)V")
	public void method5164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_35 = new Class102(arg1);
		this.aClass102_37 = new Class102(arg0);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public void method5165() {
		@Pc(6) Class102 local6 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2681();
		}
		local6 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2681();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IZ)V")
	public void method5166() {
		@Pc(6) Class102 local6 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2668(5);
		}
		local6 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2668(5);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method5168() {
		@Pc(2) Class102 local2 = this.aClass102_35;
		synchronized (this.aClass102_35) {
			this.aClass102_35.method2680();
		}
		local2 = this.aClass102_37;
		synchronized (this.aClass102_37) {
			this.aClass102_37.method2680();
		}
	}
}
