import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class331 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!fba;")
	private final Class102 aClass102_59 = new Class102(64);

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!la;")
	private final Class196 aClass196_114;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!mp;ILclient!la;)V")
	public Class331(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class196 arg2) {
		this.aClass196_114 = arg2;
		this.aClass196_114.method5118(31);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public void method8106() {
		@Pc(6) Class102 local6 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2681();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V")
	public void method8107() {
		@Pc(2) Class102 local2 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2668(5);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!uw;")
	public Class348 method8108(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_59;
		@Pc(25) Class348 local25;
		synchronized (this.aClass102_59) {
			local25 = (Class348) this.aClass102_59.method2677((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class196 local38 = this.aClass196_114;
		@Pc(47) byte[] local47;
		synchronized (this.aClass196_114) {
			local47 = this.aClass196_114.method5102(31, arg0);
		}
		local25 = new Class348();
		if (local47 != null) {
			local25.method8277(new Class3_Sub3(local47));
		}
		local6 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2674((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method8109() {
		@Pc(7) Class102 local7 = this.aClass102_59;
		synchronized (this.aClass102_59) {
			this.aClass102_59.method2680();
		}
	}
}
