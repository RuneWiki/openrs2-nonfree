import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class207 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "Lclient!wm;")
	private final Class267 aClass267_63 = new Class267(128);

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!ph;")
	private final Class187 aClass187_109;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!kp;ILclient!ph;)V")
	public Class207(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class187 arg2) {
		this.aClass187_109 = arg2;
		this.aClass187_109.method4306(1);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
	public void method4746() {
		@Pc(15) Class267 local15 = this.aClass267_63;
		synchronized (this.aClass267_63) {
			this.aClass267_63.method6013();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!qc;")
	public Class198 method4749(@OriginalArg(1) int arg0) {
		@Pc(12) Class267 local12 = this.aClass267_63;
		@Pc(22) Class198 local22;
		synchronized (this.aClass267_63) {
			local22 = (Class198) this.aClass267_63.method6014((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class187 local35 = this.aClass187_109;
		@Pc(44) byte[] local44;
		synchronized (this.aClass187_109) {
			local44 = this.aClass187_109.method4300(1, arg0);
		}
		local22 = new Class198();
		if (local44 != null) {
			local22.method4422(new Class10_Sub8(local44));
		}
		@Pc(66) Class267 local66 = this.aClass267_63;
		synchronized (this.aClass267_63) {
			this.aClass267_63.method6008(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
	public void method4750() {
		@Pc(10) Class267 local10 = this.aClass267_63;
		synchronized (this.aClass267_63) {
			this.aClass267_63.method6007(5);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public void method4751() {
		@Pc(2) Class267 local2 = this.aClass267_63;
		synchronized (this.aClass267_63) {
			this.aClass267_63.method6011();
		}
	}
}
