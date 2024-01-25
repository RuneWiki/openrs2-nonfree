import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oja")
public final class Class260 {

	@OriginalMember(owner = "client!oja", name = "g", descriptor = "Lclient!pa;")
	private final Class265 aClass265_46 = new Class265(64);

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "Lclient!cb;")
	private final Class50 aClass50_122;

	@OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
	public final int anInt7572;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class260(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_122 = arg2;
		if (this.aClass50_122 == null) {
			this.anInt7572 = 0;
		} else {
			this.anInt7572 = this.aClass50_122.method913(16);
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)Lclient!maa;")
	public Class229 method6449(@OriginalArg(0) int arg0) {
		@Pc(12) Class265 local12 = this.aClass265_46;
		@Pc(22) Class229 local22;
		synchronized (this.aClass265_46) {
			local22 = (Class229) this.aClass265_46.method6577((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class50 local35 = this.aClass50_122;
		@Pc(44) byte[] local44;
		synchronized (this.aClass50_122) {
			local44 = this.aClass50_122.method916(arg0, 16);
		}
		local22 = new Class229();
		if (local44 != null) {
			local22.method5243(new Class5_Sub15(local44));
		}
		@Pc(66) Class265 local66 = this.aClass265_46;
		synchronized (this.aClass265_46) {
			this.aClass265_46.method6566(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(Z)V")
	public void method6450() {
		@Pc(6) Class265 local6 = this.aClass265_46;
		synchronized (this.aClass265_46) {
			this.aClass265_46.method6573();
		}
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
	public void method6451() {
		@Pc(12) Class265 local12 = this.aClass265_46;
		synchronized (this.aClass265_46) {
			this.aClass265_46.method6568();
		}
	}

	@OriginalMember(owner = "client!oja", name = "b", descriptor = "(II)V")
	public void method6452() {
		@Pc(6) Class265 local6 = this.aClass265_46;
		synchronized (this.aClass265_46) {
			this.aClass265_46.method6570(5);
		}
	}
}
