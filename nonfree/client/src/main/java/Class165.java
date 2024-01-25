import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iia")
public final class Class165 {

	@OriginalMember(owner = "client!iia", name = "j", descriptor = "Lclient!aq;")
	private final Class22 aClass22_21 = new Class22(64);

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "Lclient!aq;")
	public final Class22 aClass22_22 = new Class22(2);

	@OriginalMember(owner = "client!iia", name = "i", descriptor = "Lclient!gga;")
	public final Class124 aClass124_57;

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_56;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class165(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_57 = arg3;
		this.aClass124_56 = arg2;
		this.aClass124_56.method3629(33);
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(I)V")
	public void method4436() {
		@Pc(12) Class22 local12 = this.aClass22_21;
		synchronized (this.aClass22_21) {
			this.aClass22_21.method461();
		}
		local12 = this.aClass22_22;
		synchronized (this.aClass22_22) {
			this.aClass22_22.method461();
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(I)V")
	public void method4437() {
		@Pc(2) Class22 local2 = this.aClass22_21;
		synchronized (this.aClass22_21) {
			this.aClass22_21.method473();
		}
		local2 = this.aClass22_22;
		synchronized (this.aClass22_22) {
			this.aClass22_22.method473();
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)V")
	public void method4441() {
		@Pc(6) Class22 local6 = this.aClass22_21;
		synchronized (this.aClass22_21) {
			this.aClass22_21.method468(5);
		}
		local6 = this.aClass22_22;
		synchronized (this.aClass22_22) {
			this.aClass22_22.method468(5);
		}
	}

	@OriginalMember(owner = "client!iia", name = "b", descriptor = "(II)Lclient!jha;")
	public Class181 method4442(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_21;
		@Pc(16) Class181 local16;
		synchronized (this.aClass22_21) {
			local16 = (Class181) this.aClass22_21.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_56;
		@Pc(40) byte[] local40;
		synchronized (this.aClass124_56) {
			local40 = this.aClass124_56.method3641(33, arg0);
		}
		local16 = new Class181();
		local16.aClass165_1 = this;
		if (local40 != null) {
			local16.method4757(new Class2_Sub8(local40));
		}
		@Pc(65) Class22 local65 = this.aClass22_21;
		synchronized (this.aClass22_21) {
			this.aClass22_21.method470((long) arg0, local16);
			return local16;
		}
	}
}
