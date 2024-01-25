import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class266 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!aq;")
	private final Class22 aClass22_39 = new Class22(64);

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public int anInt7956 = 0;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "Lclient!gga;")
	private final Class124 aClass124_87;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public final int anInt7955;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class266(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_87 = arg2;
		this.anInt7955 = this.aClass124_87.method3629(4);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public void method7111() {
		@Pc(6) Class22 local6 = this.aClass22_39;
		synchronized (this.aClass22_39) {
			this.aClass22_39.method473();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Lclient!hca;")
	public Class137 method7114(@OriginalArg(0) int arg0) {
		@Pc(10) Class22 local10 = this.aClass22_39;
		@Pc(20) Class137 local20;
		synchronized (this.aClass22_39) {
			local20 = (Class137) this.aClass22_39.method462((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class124 local33 = this.aClass124_87;
		@Pc(42) byte[] local42;
		synchronized (this.aClass124_87) {
			local42 = this.aClass124_87.method3641(4, arg0);
		}
		local20 = new Class137();
		local20.anInt4442 = arg0;
		local20.aClass266_2 = this;
		if (local42 != null) {
			local20.method4021(new Class2_Sub8(local42));
		}
		local20.method4022();
		@Pc(73) Class22 local73 = this.aClass22_39;
		synchronized (this.aClass22_39) {
			this.aClass22_39.method470((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public void method7116() {
		@Pc(10) Class22 local10 = this.aClass22_39;
		synchronized (this.aClass22_39) {
			this.aClass22_39.method461();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IB)V")
	public void method7117() {
		@Pc(2) Class22 local2 = this.aClass22_39;
		synchronized (this.aClass22_39) {
			this.aClass22_39.method468(5);
		}
	}
}
