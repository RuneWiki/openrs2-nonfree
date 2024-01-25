import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class257 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!mf;")
	private Class222 aClass222_43 = new Class222(64);

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!mf;")
	public Class222 aClass222_44 = new Class222(64);

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!pu;")
	public final Class270 aClass270_79;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!pu;")
	private final Class270 aClass270_80;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;Lclient!pu;)V")
	public Class257(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Class270 arg3) {
		this.aClass270_79 = arg3;
		this.aClass270_80 = arg2;
		this.aClass270_80.method5685(34);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	public void method5587() {
		@Pc(6) Class222 local6 = this.aClass222_43;
		synchronized (this.aClass222_43) {
			this.aClass222_43.method4422();
		}
		local6 = this.aClass222_44;
		synchronized (this.aClass222_44) {
			this.aClass222_44.method4422();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
	public void method5588() {
		@Pc(2) Class222 local2 = this.aClass222_43;
		synchronized (this.aClass222_43) {
			this.aClass222_43.method4433(5);
		}
		local2 = this.aClass222_44;
		synchronized (this.aClass222_44) {
			this.aClass222_44.method4433(5);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lclient!raa;")
	public Class281 method5590(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_43;
		@Pc(16) Class281 local16;
		synchronized (this.aClass222_43) {
			local16 = (Class281) this.aClass222_43.method4430((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class270 local29 = this.aClass270_80;
		@Pc(38) byte[] local38;
		synchronized (this.aClass270_80) {
			local38 = this.aClass270_80.method5704(34, arg0);
		}
		local16 = new Class281();
		local16.aClass257_3 = this;
		if (local38 != null) {
			local16.method6115(new Class1_Sub35(local38));
		}
		@Pc(71) Class222 local71 = this.aClass222_43;
		synchronized (this.aClass222_43) {
			this.aClass222_43.method4434(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public void method5591() {
		@Pc(2) Class222 local2 = this.aClass222_43;
		synchronized (this.aClass222_43) {
			this.aClass222_43.method4428();
		}
		local2 = this.aClass222_44;
		synchronized (this.aClass222_44) {
			this.aClass222_44.method4428();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method5594(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass222_43 = new Class222(arg0);
		this.aClass222_44 = new Class222(arg1);
	}
}
