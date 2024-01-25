import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class214 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!pja;")
	private final Class279 aClass279_30 = new Class279(64);

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_79;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class214(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_79 = arg2;
		if (this.aClass143_79 != null) {
			this.aClass143_79.method3123(54);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public void method4995() {
		@Pc(2) Class279 local2 = this.aClass279_30;
		synchronized (this.aClass279_30) {
			this.aClass279_30.method6630(5);
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)Lclient!lfa;")
	public Class223 method4999(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_30;
		@Pc(16) Class223 local16;
		synchronized (this.aClass279_30) {
			local16 = (Class223) this.aClass279_30.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_79) {
			local38 = this.aClass143_79.method3125(arg0, 54);
		}
		local16 = new Class223();
		if (local38 != null) {
			local16.method5126(new Class3_Sub17(local38));
		}
		@Pc(65) Class279 local65 = this.aClass279_30;
		synchronized (this.aClass279_30) {
			this.aClass279_30.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
	public void method5000() {
		@Pc(2) Class279 local2 = this.aClass279_30;
		synchronized (this.aClass279_30) {
			this.aClass279_30.method6637();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
	public void method5001() {
		@Pc(2) Class279 local2 = this.aClass279_30;
		synchronized (this.aClass279_30) {
			this.aClass279_30.method6638();
		}
	}
}
