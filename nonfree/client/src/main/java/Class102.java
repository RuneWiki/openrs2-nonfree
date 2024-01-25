import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class102 {

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!aq;")
	public final Class22 aClass22_14 = new Class22(20);

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!aq;")
	private final Class22 aClass22_15 = new Class22(64);

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!gga;")
	public final Class124 aClass124_43;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!gga;")
	private final Class124 aClass124_44;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class102(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_43 = arg3;
		this.aClass124_44 = arg2;
		this.aClass124_44.method3629(46);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public void method3162() {
		@Pc(2) Class22 local2 = this.aClass22_15;
		synchronized (this.aClass22_15) {
			this.aClass22_15.method461();
		}
		local2 = this.aClass22_14;
		synchronized (this.aClass22_14) {
			this.aClass22_14.method461();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public void method3165() {
		@Pc(14) Class22 local14 = this.aClass22_15;
		synchronized (this.aClass22_15) {
			this.aClass22_15.method473();
		}
		local14 = this.aClass22_14;
		synchronized (this.aClass22_14) {
			this.aClass22_14.method473();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lclient!lg;")
	public Class213 method3166(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_15;
		@Pc(16) Class213 local16;
		synchronized (this.aClass22_15) {
			local16 = (Class213) this.aClass22_15.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_44;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_44) {
			local38 = this.aClass124_44.method3641(46, arg0);
		}
		local16 = new Class213();
		local16.aClass102_2 = this;
		if (local38 != null) {
			local16.method5699(new Class2_Sub8(local38));
		}
		@Pc(63) Class22 local63 = this.aClass22_15;
		synchronized (this.aClass22_15) {
			this.aClass22_15.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V")
	public void method3167() {
		@Pc(2) Class22 local2 = this.aClass22_15;
		synchronized (this.aClass22_15) {
			this.aClass22_15.method468(5);
		}
		local2 = this.aClass22_14;
		synchronized (this.aClass22_14) {
			this.aClass22_14.method468(5);
		}
	}
}
