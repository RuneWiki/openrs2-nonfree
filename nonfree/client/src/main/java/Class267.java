import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class267 {

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "Lclient!pja;")
	private final Class279 aClass279_41 = new Class279(64);

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_108;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class267(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_108 = arg2;
		if (this.aClass143_108 != null) {
			this.aClass143_108.method3123(35);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public void method6380() {
		@Pc(2) Class279 local2 = this.aClass279_41;
		synchronized (this.aClass279_41) {
			this.aClass279_41.method6638();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Lclient!cj;")
	public Class61 method6384(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_41;
		@Pc(16) Class61 local16;
		synchronized (this.aClass279_41) {
			local16 = (Class61) this.aClass279_41.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_108;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_108) {
			local38 = this.aClass143_108.method3125(arg0, 35);
		}
		local16 = new Class61();
		if (local38 != null) {
			local16.method1677(new Class3_Sub17(local38));
		}
		local16.method1678();
		@Pc(69) Class279 local69 = this.aClass279_41;
		synchronized (this.aClass279_41) {
			this.aClass279_41.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)V")
	public void method6385() {
		@Pc(2) Class279 local2 = this.aClass279_41;
		synchronized (this.aClass279_41) {
			this.aClass279_41.method6630(5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method6386() {
		@Pc(2) Class279 local2 = this.aClass279_41;
		synchronized (this.aClass279_41) {
			this.aClass279_41.method6637();
		}
	}
}
