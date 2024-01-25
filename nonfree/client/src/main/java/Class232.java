import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class232 {

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "Lclient!tl;")
	private final Class227 aClass227_45 = new Class227(64);

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "Lclient!ui;")
	private final Class230 aClass230_81;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!gp;ILclient!ui;)V")
	public Class232(@OriginalArg(0) Class94 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class230 arg2) {
		this.aClass230_81 = arg2;
		if (this.aClass230_81 != null) {
			this.aClass230_81.method4956(35);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public void method5046() {
		@Pc(2) Class227 local2 = this.aClass227_45;
		synchronized (this.aClass227_45) {
			this.aClass227_45.method4871();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)Lclient!kr;")
	public Class138 method5047(@OriginalArg(1) int arg0) {
		@Pc(12) Class227 local12 = this.aClass227_45;
		@Pc(22) Class138 local22;
		synchronized (this.aClass227_45) {
			local22 = (Class138) this.aClass227_45.method4863((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(39) byte[] local39 = this.aClass230_81.method4985(arg0, 35);
		local22 = new Class138();
		if (local39 != null) {
			local22.method2850(new Class1_Sub33(local39));
		}
		local22.method2852();
		@Pc(58) Class227 local58 = this.aClass227_45;
		synchronized (this.aClass227_45) {
			this.aClass227_45.method4865(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	public void method5048() {
		@Pc(2) Class227 local2 = this.aClass227_45;
		synchronized (this.aClass227_45) {
			this.aClass227_45.method4859(5);
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
	public void method5051() {
		@Pc(12) Class227 local12 = this.aClass227_45;
		synchronized (this.aClass227_45) {
			this.aClass227_45.method4858();
		}
	}
}
