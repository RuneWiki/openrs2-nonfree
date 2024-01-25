import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5 {

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!aq;")
	private Class22 aClass22_1 = new Class22(128);

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!aq;")
	public Class22 aClass22_2 = new Class22(64);

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!gga;")
	public final Class124 aClass124_1;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!gga;")
	private final Class124 aClass124_2;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class5(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_1 = arg3;
		this.aClass124_2 = arg2;
		this.aClass124_2.method3629(36);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public void method92() {
		@Pc(2) Class22 local2 = this.aClass22_1;
		synchronized (this.aClass22_1) {
			this.aClass22_1.method473();
		}
		local2 = this.aClass22_2;
		synchronized (this.aClass22_2) {
			this.aClass22_2.method473();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Lclient!ll;")
	public Class218 method94(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_1;
		@Pc(16) Class218 local16;
		synchronized (this.aClass22_1) {
			local16 = (Class218) this.aClass22_1.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_2;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_2) {
			local38 = this.aClass124_2.method3641(36, arg0);
		}
		local16 = new Class218();
		local16.anInt6688 = arg0;
		local16.aClass5_2 = this;
		if (local38 != null) {
			local16.method6007(new Class2_Sub8(local38));
		}
		local16.method6001();
		@Pc(69) Class22 local69 = this.aClass22_1;
		synchronized (this.aClass22_1) {
			this.aClass22_1.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public void method96(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass22_1 = new Class22(arg1);
		this.aClass22_2 = new Class22(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
	public void method97() {
		@Pc(6) Class22 local6 = this.aClass22_1;
		synchronized (this.aClass22_1) {
			this.aClass22_1.method468(5);
		}
		local6 = this.aClass22_2;
		synchronized (this.aClass22_2) {
			this.aClass22_2.method468(5);
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public void method99() {
		@Pc(6) Class22 local6 = this.aClass22_1;
		synchronized (this.aClass22_1) {
			this.aClass22_1.method461();
		}
		local6 = this.aClass22_2;
		synchronized (this.aClass22_2) {
			this.aClass22_2.method461();
		}
	}
}
