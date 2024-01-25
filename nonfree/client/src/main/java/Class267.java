import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class267 {

	@OriginalMember(owner = "client!os", name = "i", descriptor = "Lclient!aq;")
	private final Class22 aClass22_40 = new Class22(64);

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_89;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "Lclient!om;")
	public final Class265 aClass265_2;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!om;)V")
	public Class267(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class265 arg3) {
		this.aClass124_89 = arg2;
		this.aClass124_89.method3629(32);
		this.aClass265_2 = arg3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V")
	public void method7155() {
		@Pc(2) Class22 local2 = this.aClass22_40;
		synchronized (this.aClass22_40) {
			this.aClass22_40.method461();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
	public void method7157() {
		@Pc(2) Class22 local2 = this.aClass22_40;
		synchronized (this.aClass22_40) {
			this.aClass22_40.method468(5);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method7158() {
		@Pc(2) Class22 local2 = this.aClass22_40;
		synchronized (this.aClass22_40) {
			this.aClass22_40.method473();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)Lclient!nia;")
	public Class248 method7159(@OriginalArg(0) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_40;
		@Pc(16) Class248 local16;
		synchronized (this.aClass22_40) {
			local16 = (Class248) this.aClass22_40.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_89;
		@Pc(45) byte[] local45;
		synchronized (this.aClass124_89) {
			local45 = this.aClass124_89.method3641(32, arg0);
		}
		local16 = new Class248();
		local16.aClass267_1 = this;
		if (local45 != null) {
			local16.method6621(new Class2_Sub8(local45));
		}
		@Pc(70) Class22 local70 = this.aClass22_40;
		synchronized (this.aClass22_40) {
			this.aClass22_40.method470((long) arg0, local16);
			return local16;
		}
	}
}
