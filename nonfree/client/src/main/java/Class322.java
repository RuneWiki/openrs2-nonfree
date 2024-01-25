import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class322 {

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient!pja;")
	private final Class279 aClass279_50 = new Class279(16);

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "Lclient!gj;")
	private final Class143 aClass143_124;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class322(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_124 = arg2;
		this.aClass143_124.method3123(30);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	public void method7488() {
		@Pc(10) Class279 local10 = this.aClass279_50;
		synchronized (this.aClass279_50) {
			this.aClass279_50.method6637();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)Lclient!ao;")
	public Class22 method7489(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_50;
		@Pc(16) Class22 local16;
		synchronized (this.aClass279_50) {
			local16 = (Class22) this.aClass279_50.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_124;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_124) {
			local38 = this.aClass143_124.method3125(arg0, 30);
		}
		local16 = new Class22();
		if (local38 != null) {
			local16.method772(new Class3_Sub17(local38));
		}
		@Pc(62) Class279 local62 = this.aClass279_50;
		synchronized (this.aClass279_50) {
			this.aClass279_50.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(I)V")
	public void method7491() {
		@Pc(2) Class279 local2 = this.aClass279_50;
		synchronized (this.aClass279_50) {
			this.aClass279_50.method6638();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(II)V")
	public void method7492() {
		@Pc(2) Class279 local2 = this.aClass279_50;
		synchronized (this.aClass279_50) {
			this.aClass279_50.method6630(5);
		}
	}
}
