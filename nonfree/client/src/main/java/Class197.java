import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class197 {

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "Lclient!aq;")
	private final Class22 aClass22_27 = new Class22(256);

	@OriginalMember(owner = "client!kga", name = "h", descriptor = "Lclient!gga;")
	private final Class124 aClass124_68;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;)V")
	public Class197(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2) {
		this.aClass124_68 = arg2;
		this.aClass124_68.method3629(26);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
	public void method5092() {
		@Pc(6) Class22 local6 = this.aClass22_27;
		synchronized (this.aClass22_27) {
			this.aClass22_27.method461();
		}
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
	public void method5093() {
		@Pc(2) Class22 local2 = this.aClass22_27;
		synchronized (this.aClass22_27) {
			this.aClass22_27.method473();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)Lclient!tw;")
	public Class2_Sub1_Sub20 method5094(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_27;
		@Pc(16) Class2_Sub1_Sub20 local16;
		synchronized (this.aClass22_27) {
			local16 = (Class2_Sub1_Sub20) this.aClass22_27.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_68;
		@Pc(38) byte[] local38;
		synchronized (this.aClass124_68) {
			local38 = this.aClass124_68.method3641(26, arg0);
		}
		local16 = new Class2_Sub1_Sub20();
		if (local38 != null) {
			local16.method8892(new Class2_Sub8(local38));
		}
		@Pc(65) Class22 local65 = this.aClass22_27;
		synchronized (this.aClass22_27) {
			this.aClass22_27.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
	public void method5097() {
		@Pc(6) Class22 local6 = this.aClass22_27;
		synchronized (this.aClass22_27) {
			this.aClass22_27.method468(5);
		}
	}
}
