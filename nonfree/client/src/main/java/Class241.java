import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class241 {

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!mf;")
	private Class222 aClass222_36 = new Class222(64);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!pu;")
	private final Class270 aClass270_70;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!kr;ILclient!pu;)V")
	public Class241(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class270 arg2) {
		this.aClass270_70 = arg2;
		if (this.aClass270_70 != null) {
			@Pc(20) int local20 = this.aClass270_70.method5674() - 1;
			this.aClass270_70.method5685(local20);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Lclient!cga;")
	public Class52 method4888(@OriginalArg(1) int arg0) {
		@Pc(6) Class222 local6 = this.aClass222_36;
		@Pc(25) Class52 local25;
		synchronized (this.aClass222_36) {
			local25 = (Class52) this.aClass222_36.method4430((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class270 local38 = this.aClass270_70;
		@Pc(51) byte[] local51;
		synchronized (this.aClass270_70) {
			local51 = this.aClass270_70.method5704(Static438.method6093(arg0), Static592.method7860(arg0));
		}
		local25 = new Class52();
		if (local51 != null) {
			local25.method1022(new Class1_Sub35(local51));
		}
		@Pc(73) Class222 local73 = this.aClass222_36;
		synchronized (this.aClass222_36) {
			this.aClass222_36.method4434(local25, (long) arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public void method4891() {
		@Pc(2) Class222 local2 = this.aClass222_36;
		synchronized (this.aClass222_36) {
			this.aClass222_36.method4428();
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
	public void method4893() {
		@Pc(6) Class222 local6 = this.aClass222_36;
		synchronized (this.aClass222_36) {
			this.aClass222_36.method4422();
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V")
	public void method4894() {
		@Pc(8) Class222 local8 = this.aClass222_36;
		synchronized (this.aClass222_36) {
			this.aClass222_36.method4433(5);
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
	public void method4895(@OriginalArg(0) int arg0) {
		@Pc(2) Class222 local2 = this.aClass222_36;
		synchronized (this.aClass222_36) {
			this.aClass222_36.method4428();
			this.aClass222_36 = new Class222(arg0);
		}
	}
}
