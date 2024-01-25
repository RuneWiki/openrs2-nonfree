import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class335 {

	@OriginalMember(owner = "client!uda", name = "k", descriptor = "Lclient!fba;")
	private Class102 aClass102_60 = new Class102(128);

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "Lclient!fba;")
	public Class102 aClass102_61 = new Class102(64);

	@OriginalMember(owner = "client!uda", name = "h", descriptor = "Lclient!la;")
	public final Class196 aClass196_117;

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "Lclient!la;")
	private final Class196 aClass196_118;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;Lclient!la;)V")
	public Class335(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2, @OriginalArg(3) Class196 arg3) {
		this.aClass196_117 = arg3;
		this.aClass196_118 = arg2;
		this.aClass196_118.method5118(36);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
	public void method8124() {
		@Pc(6) Class102 local6 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2681();
		}
		local6 = this.aClass102_61;
		synchronized (this.aClass102_61) {
			this.aClass102_61.method2681();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lclient!bm;")
	public Class36 method8125(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_60;
		@Pc(18) Class36 local18;
		synchronized (this.aClass102_60) {
			local18 = (Class36) this.aClass102_60.method2677((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class196 local31 = this.aClass196_118;
		@Pc(40) byte[] local40;
		synchronized (this.aClass196_118) {
			local40 = this.aClass196_118.method5102(36, arg0);
		}
		local18 = new Class36();
		local18.anInt1354 = arg0;
		local18.aClass335_1 = this;
		if (local40 != null) {
			local18.method1415(new Class3_Sub3(local40));
		}
		local18.method1412();
		@Pc(73) Class102 local73 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2674((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public void method8126() {
		@Pc(10) Class102 local10 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2680();
		}
		local10 = this.aClass102_61;
		synchronized (this.aClass102_61) {
			this.aClass102_61.method2680();
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)V")
	public void method8128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass102_60 = new Class102(arg0);
		this.aClass102_61 = new Class102(arg1);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(II)V")
	public void method8130() {
		@Pc(6) Class102 local6 = this.aClass102_60;
		synchronized (this.aClass102_60) {
			this.aClass102_60.method2668(5);
		}
		local6 = this.aClass102_61;
		synchronized (this.aClass102_61) {
			this.aClass102_61.method2668(5);
		}
	}
}
