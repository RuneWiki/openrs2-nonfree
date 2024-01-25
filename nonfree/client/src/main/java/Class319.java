import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class319 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public int anInt9184;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "Lclient!aq;")
	private final Class22 aClass22_46 = new Class22(64);

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!aq;")
	public final Class22 aClass22_47 = new Class22(60);

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!gga;")
	public final Class124 aClass124_109;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Lclient!gga;")
	private final Class124 aClass124_108;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;)V")
	public Class319(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3) {
		this.aClass124_109 = arg3;
		this.aClass124_108 = arg2;
		@Pc(26) int local26 = this.aClass124_108.method3633() - 1;
		this.aClass124_108.method3629(local26);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	public void method8035() {
		@Pc(6) Class22 local6 = this.aClass22_46;
		synchronized (this.aClass22_46) {
			this.aClass22_46.method461();
		}
		local6 = this.aClass22_47;
		synchronized (this.aClass22_47) {
			this.aClass22_47.method461();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
	public void method8038() {
		@Pc(2) Class22 local2 = this.aClass22_46;
		synchronized (this.aClass22_46) {
			this.aClass22_46.method468(5);
		}
		local2 = this.aClass22_47;
		synchronized (this.aClass22_47) {
			this.aClass22_47.method468(5);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
	public void method8039(@OriginalArg(1) int arg0) {
		this.anInt9184 = arg0;
		@Pc(9) Class22 local9 = this.aClass22_47;
		synchronized (this.aClass22_47) {
			this.aClass22_47.method461();
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public void method8040() {
		@Pc(2) Class22 local2 = this.aClass22_46;
		synchronized (this.aClass22_46) {
			this.aClass22_46.method473();
		}
		local2 = this.aClass22_47;
		synchronized (this.aClass22_47) {
			this.aClass22_47.method473();
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lclient!sm;")
	public Class336 method8041(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_46;
		@Pc(16) Class336 local16;
		synchronized (this.aClass22_46) {
			local16 = (Class336) this.aClass22_46.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_108;
		@Pc(42) byte[] local42;
		synchronized (this.aClass124_108) {
			local42 = this.aClass124_108.method3641(Static407.method6709(arg0), Static448.method7280(arg0));
		}
		local16 = new Class336();
		local16.anInt9663 = arg0;
		local16.aClass319_2 = this;
		if (local42 != null) {
			local16.method8458(new Class2_Sub8(local42));
		}
		@Pc(78) Class22 local78 = this.aClass22_46;
		synchronized (this.aClass22_46) {
			this.aClass22_46.method470((long) arg0, local16);
			return local16;
		}
	}
}
