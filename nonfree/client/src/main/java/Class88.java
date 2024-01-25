import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class88 {

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!pja;")
	private final Class279 aClass279_12 = new Class279(64);

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "Lclient!gj;")
	private final Class143 aClass143_27;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!l;")
	public final Class217 aClass217_1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!l;)V")
	public Class88(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class217 arg3) {
		this.aClass143_27 = arg2;
		this.aClass143_27.method3123(32);
		this.aClass217_1 = arg3;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V")
	public void method2129() {
		@Pc(2) Class279 local2 = this.aClass279_12;
		synchronized (this.aClass279_12) {
			this.aClass279_12.method6630(5);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	public void method2130() {
		@Pc(2) Class279 local2 = this.aClass279_12;
		synchronized (this.aClass279_12) {
			this.aClass279_12.method6638();
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)Lclient!uca;")
	public Class351 method2132(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_12;
		@Pc(16) Class351 local16;
		synchronized (this.aClass279_12) {
			local16 = (Class351) this.aClass279_12.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_27;
		@Pc(40) byte[] local40;
		synchronized (this.aClass143_27) {
			local40 = this.aClass143_27.method3125(arg0, 32);
		}
		local16 = new Class351();
		local16.aClass88_1 = this;
		if (local40 != null) {
			local16.method7963(new Class3_Sub17(local40));
		}
		@Pc(71) Class279 local71 = this.aClass279_12;
		synchronized (this.aClass279_12) {
			this.aClass279_12.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	public void method2136() {
		@Pc(6) Class279 local6 = this.aClass279_12;
		synchronized (this.aClass279_12) {
			this.aClass279_12.method6637();
		}
	}
}
