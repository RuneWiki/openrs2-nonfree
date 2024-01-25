import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class40 {

	@OriginalMember(owner = "client!br", name = "j", descriptor = "Lclient!aq;")
	private final Class22 aClass22_3 = new Class22(64);

	@OriginalMember(owner = "client!br", name = "k", descriptor = "Lclient!aq;")
	private final Class22 aClass22_4 = new Class22(100);

	@OriginalMember(owner = "client!br", name = "f", descriptor = "Lclient!gga;")
	private final Class124 aClass124_16;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!mca;ILclient!gga;Lclient!gga;Lclient!gga;)V")
	public Class40(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) Class124 arg4) {
		this.aClass124_16 = arg2;
		if (this.aClass124_16 != null) {
			@Pc(26) int local26 = this.aClass124_16.method3633() - 1;
			this.aClass124_16.method3629(local26);
		}
		Static293.method6714(arg4, arg3);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lclient!sk;")
	public Class2_Sub1_Sub18 method1120(@OriginalArg(0) int arg0) {
		@Pc(13) Class22 local13 = this.aClass22_4;
		synchronized (this.aClass22_4) {
			@Pc(23) Class2_Sub1_Sub18 local23 = (Class2_Sub1_Sub18) this.aClass22_4.method462((long) arg0);
			if (local23 == null) {
				local23 = new Class2_Sub1_Sub18(arg0);
				this.aClass22_4.method470((long) arg0, local23);
			}
			return local23.method8435() ? local23 : null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	public void method1121() {
		@Pc(2) Class22 local2 = this.aClass22_3;
		synchronized (this.aClass22_3) {
			this.aClass22_3.method461();
		}
		local2 = this.aClass22_4;
		synchronized (this.aClass22_4) {
			this.aClass22_4.method461();
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IB)V")
	public void method1122() {
		@Pc(2) Class22 local2 = this.aClass22_3;
		synchronized (this.aClass22_3) {
			this.aClass22_3.method468(5);
		}
		local2 = this.aClass22_4;
		synchronized (this.aClass22_4) {
			this.aClass22_4.method468(5);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lclient!je;")
	public Class178 method1123(@OriginalArg(1) int arg0) {
		@Pc(6) Class22 local6 = this.aClass22_3;
		@Pc(16) Class178 local16;
		synchronized (this.aClass22_3) {
			local16 = (Class178) this.aClass22_3.method462((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class124 local29 = this.aClass124_16;
		@Pc(42) byte[] local42;
		synchronized (this.aClass124_16) {
			local42 = this.aClass124_16.method3641(Static459.method7363(arg0), Static595.method8931(arg0));
		}
		local16 = new Class178();
		local16.aClass40_1 = this;
		local16.anInt5144 = arg0;
		if (local42 != null) {
			local16.method4678(new Class2_Sub8(local42));
		}
		local16.method4683();
		@Pc(78) Class22 local78 = this.aClass22_3;
		synchronized (this.aClass22_3) {
			this.aClass22_3.method470((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method1126() {
		@Pc(14) Class22 local14 = this.aClass22_3;
		synchronized (this.aClass22_3) {
			this.aClass22_3.method473();
		}
		local14 = this.aClass22_4;
		synchronized (this.aClass22_4) {
			this.aClass22_4.method473();
		}
	}
}
