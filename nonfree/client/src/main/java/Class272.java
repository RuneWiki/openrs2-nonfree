import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class272 {

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "Lclient!aq;")
	private final Class22 aClass22_41 = new Class22(64);

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Lclient!aq;")
	public final Class22 aClass22_42 = new Class22(50);

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "Lclient!aq;")
	public final Class22 aClass22_43 = new Class22(5);

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!mca;")
	public final Class229 aClass229_13;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
	public boolean aBoolean596;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "Lclient!gga;")
	private final Class124 aClass124_91;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!gga;")
	public final Class124 aClass124_90;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!mca;IZLclient!gga;Lclient!gga;)V")
	public Class272(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) Class124 arg4) {
		this.aClass229_13 = arg0;
		this.aBoolean596 = arg2;
		this.aClass124_91 = arg3;
		this.aClass124_90 = arg4;
		if (this.aClass124_91 != null) {
			@Pc(41) int local41 = this.aClass124_91.method3633() - 1;
			this.aClass124_91.method3629(local41);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
	public void method7196() {
		@Pc(2) Class22 local2 = this.aClass22_41;
		synchronized (this.aClass22_41) {
			this.aClass22_41.method473();
		}
		local2 = this.aClass22_42;
		synchronized (this.aClass22_42) {
			this.aClass22_42.method473();
		}
		local2 = this.aClass22_43;
		synchronized (this.aClass22_43) {
			this.aClass22_43.method473();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
	public void method7197() {
		@Pc(2) Class22 local2 = this.aClass22_41;
		synchronized (this.aClass22_41) {
			this.aClass22_41.method468(5);
		}
		local2 = this.aClass22_42;
		synchronized (this.aClass22_42) {
			this.aClass22_42.method468(5);
		}
		local2 = this.aClass22_43;
		synchronized (this.aClass22_43) {
			this.aClass22_43.method468(5);
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method7198() {
		@Pc(2) Class22 local2 = this.aClass22_41;
		synchronized (this.aClass22_41) {
			this.aClass22_41.method461();
		}
		local2 = this.aClass22_42;
		synchronized (this.aClass22_42) {
			this.aClass22_42.method461();
		}
		local2 = this.aClass22_43;
		synchronized (this.aClass22_43) {
			this.aClass22_43.method461();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
	public void method7199() {
		@Pc(14) Class22 local14 = this.aClass22_42;
		synchronized (this.aClass22_42) {
			this.aClass22_42.method461();
		}
		local14 = this.aClass22_43;
		synchronized (this.aClass22_43) {
			this.aClass22_43.method461();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lclient!rf;")
	public Class312 method7200(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_41;
		@Pc(22) Class312 local22;
		synchronized (this.aClass22_41) {
			local22 = (Class312) this.aClass22_41.method462((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class124 local35 = this.aClass124_91;
		@Pc(48) byte[] local48;
		synchronized (this.aClass124_91) {
			local48 = this.aClass124_91.method3641(Static434.method5220(arg0), Static146.method9618(arg0));
		}
		local22 = new Class312();
		local22.aClass272_1 = this;
		local22.anInt9090 = arg0;
		if (local48 != null) {
			local22.method7952(new Class2_Sub8(local48));
		}
		local22.method7949();
		@Pc(79) Class22 local79 = this.aClass22_41;
		synchronized (this.aClass22_41) {
			this.aClass22_41.method470((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB)V")
	public void method7201(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean596 != arg0) {
			this.aBoolean596 = arg0;
			this.method7198();
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)V")
	public void method7202(@OriginalArg(0) int arg0) {
		this.anInt8052 = arg0;
		@Pc(9) Class22 local9 = this.aClass22_42;
		synchronized (this.aClass22_42) {
			this.aClass22_42.method461();
		}
		local9 = this.aClass22_43;
		synchronized (this.aClass22_43) {
			this.aClass22_43.method461();
		}
	}
}
