import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class96 {

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!aq;")
	private final Class22 aClass22_12 = new Class22(64);

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Lclient!gga;")
	private final Class124 aClass124_38;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!gga;")
	public final Class124 aClass124_37;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class96(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_38 = arg2;
		this.aClass124_37 = arg3;
		this.aClass124_38.method3629(3);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
	public void method2463() {
		@Pc(6) Class22 local6 = this.aClass22_12;
		synchronized (this.aClass22_12) {
			this.aClass22_12.method468(5);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IB)Lclient!bda;")
	public Class28 method2464(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_12;
		@Pc(16) Class28 local16;
		synchronized (this.aClass22_12) {
			local16 = (Class28) this.aClass22_12.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_38;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_38) {
			local38 = this.aClass124_38.method3641(3, arg0);
		}
		local16 = new Class28();
		local16.aClass96_1 = this;
		if (local38 != null) {
			local16.method816(new Class2_Sub8(local38));
		}
		@Pc(69) Class22 local69 = this.aClass22_12;
		synchronized (this.aClass22_12) {
			this.aClass22_12.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	public void method2465() {
		@Pc(2) Class22 local2 = this.aClass22_12;
		synchronized (this.aClass22_12) {
			this.aClass22_12.method473();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method2467() {
		@Pc(6) Class22 local6 = this.aClass22_12;
		synchronized (this.aClass22_12) {
			this.aClass22_12.method461();
		}
	}
}
