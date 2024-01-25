import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class247 {

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "Lclient!fba;")
	private final Class102 aClass102_42 = new Class102(256);

	@OriginalMember(owner = "client!oga", name = "j", descriptor = "Lclient!la;")
	private final Class196 aClass196_82;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class247(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_82 = arg2;
		this.aClass196_82.method5118(26);
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public void method6442() {
		@Pc(6) Class102 local6 = this.aClass102_42;
		synchronized (this.aClass102_42) {
			this.aClass102_42.method2680();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Lclient!k;")
	public Class3_Sub4_Sub15 method6443(@OriginalArg(1) int arg0) {
		@Pc(14) Class102 local14 = this.aClass102_42;
		@Pc(24) Class3_Sub4_Sub15 local24;
		synchronized (this.aClass102_42) {
			local24 = (Class3_Sub4_Sub15) this.aClass102_42.method2677((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class196 local37 = this.aClass196_82;
		@Pc(46) byte[] local46;
		synchronized (this.aClass196_82) {
			local46 = this.aClass196_82.method5102(26, arg0);
		}
		local24 = new Class3_Sub4_Sub15();
		if (local46 != null) {
			local24.method4548(new Class3_Sub3(local46));
		}
		@Pc(68) Class102 local68 = this.aClass102_42;
		synchronized (this.aClass102_42) {
			this.aClass102_42.method2674((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
	public void method6446() {
		@Pc(6) Class102 local6 = this.aClass102_42;
		synchronized (this.aClass102_42) {
			this.aClass102_42.method2681();
		}
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(II)V")
	public void method6447() {
		@Pc(2) Class102 local2 = this.aClass102_42;
		synchronized (this.aClass102_42) {
			this.aClass102_42.method2668(5);
		}
	}
}
