import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class51 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "Lclient!pja;")
	public final Class279 aClass279_7 = new Class279(20);

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!pja;")
	private final Class279 aClass279_8 = new Class279(64);

	@OriginalMember(owner = "client!cba", name = "f", descriptor = "Lclient!gj;")
	public final Class143 aClass143_16;

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "Lclient!gj;")
	private final Class143 aClass143_15;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class51(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_16 = arg3;
		this.aClass143_15 = arg2;
		this.aClass143_15.method3123(46);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V")
	public void method1543() {
		@Pc(6) Class279 local6 = this.aClass279_8;
		synchronized (this.aClass279_8) {
			this.aClass279_8.method6630(5);
		}
		local6 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			this.aClass279_7.method6630(5);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public void method1544() {
		@Pc(2) Class279 local2 = this.aClass279_8;
		synchronized (this.aClass279_8) {
			this.aClass279_8.method6637();
		}
		local2 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			this.aClass279_7.method6637();
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	public void method1546() {
		@Pc(6) Class279 local6 = this.aClass279_8;
		synchronized (this.aClass279_8) {
			this.aClass279_8.method6638();
		}
		local6 = this.aClass279_7;
		synchronized (this.aClass279_7) {
			this.aClass279_7.method6638();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)Lclient!hha;")
	public Class158 method1547(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_8;
		@Pc(16) Class158 local16;
		synchronized (this.aClass279_8) {
			local16 = (Class158) this.aClass279_8.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class143 local35 = this.aClass143_15;
		@Pc(44) byte[] local44;
		synchronized (this.aClass143_15) {
			local44 = this.aClass143_15.method3125(arg0, 46);
		}
		local16 = new Class158();
		local16.aClass51_2 = this;
		if (local44 != null) {
			local16.method3477(new Class3_Sub17(local44));
		}
		@Pc(69) Class279 local69 = this.aClass279_8;
		synchronized (this.aClass279_8) {
			this.aClass279_8.method6635(local16, (long) arg0);
			return local16;
		}
	}
}
