import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class165 {

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!pja;")
	private final Class279 aClass279_23 = new Class279(64);

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_58;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class165(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_58 = arg2;
		if (this.aClass143_58 != null) {
			this.aClass143_58.method3123(11);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public void method3810() {
		@Pc(2) Class279 local2 = this.aClass279_23;
		synchronized (this.aClass279_23) {
			this.aClass279_23.method6638();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public void method3811() {
		@Pc(6) Class279 local6 = this.aClass279_23;
		synchronized (this.aClass279_23) {
			this.aClass279_23.method6630(5);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BI)Lclient!sl;")
	public Class328 method3812(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_23;
		@Pc(16) Class328 local16;
		synchronized (this.aClass279_23) {
			local16 = (Class328) this.aClass279_23.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_58;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_58) {
			local38 = this.aClass143_58.method3125(arg0, 11);
		}
		local16 = new Class328();
		if (local38 != null) {
			local16.method7562(new Class3_Sub17(local38));
		}
		@Pc(65) Class279 local65 = this.aClass279_23;
		synchronized (this.aClass279_23) {
			this.aClass279_23.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	public void method3813() {
		@Pc(6) Class279 local6 = this.aClass279_23;
		synchronized (this.aClass279_23) {
			this.aClass279_23.method6637();
		}
	}
}
