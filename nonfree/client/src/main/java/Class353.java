import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class353 {

	@OriginalMember(owner = "client!u", name = "h", descriptor = "Lclient!aq;")
	private Class22 aClass22_59 = new Class22(64);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!aq;")
	public Class22 aClass22_60 = new Class22(64);

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Lclient!gga;")
	public final Class124 aClass124_121;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "Lclient!gga;")
	private final Class124 aClass124_122;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class353(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_121 = arg3;
		this.aClass124_122 = arg2;
		this.aClass124_122.method3629(34);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)V")
	public void method8897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass22_59 = new Class22(arg0);
		this.aClass22_60 = new Class22(arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public void method8898() {
		@Pc(6) Class22 local6 = this.aClass22_59;
		synchronized (this.aClass22_59) {
			this.aClass22_59.method468(5);
		}
		local6 = this.aClass22_60;
		synchronized (this.aClass22_60) {
			this.aClass22_60.method468(5);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public void method8901() {
		@Pc(6) Class22 local6 = this.aClass22_59;
		synchronized (this.aClass22_59) {
			this.aClass22_59.method473();
		}
		local6 = this.aClass22_60;
		synchronized (this.aClass22_60) {
			this.aClass22_60.method473();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!ff;")
	public Class104 method8902(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_59;
		@Pc(16) Class104 local16;
		synchronized (this.aClass22_59) {
			local16 = (Class104) this.aClass22_59.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_122;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_122) {
			local38 = this.aClass124_122.method3641(34, arg0);
		}
		local16 = new Class104();
		local16.aClass353_2 = this;
		if (local38 != null) {
			local16.method3188(new Class2_Sub8(local38));
		}
		@Pc(68) Class22 local68 = this.aClass22_59;
		synchronized (this.aClass22_59) {
			this.aClass22_59.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public void method8903() {
		@Pc(6) Class22 local6 = this.aClass22_59;
		synchronized (this.aClass22_59) {
			this.aClass22_59.method461();
		}
		local6 = this.aClass22_60;
		synchronized (this.aClass22_60) {
			this.aClass22_60.method461();
		}
	}
}
