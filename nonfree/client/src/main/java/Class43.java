import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class43 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!pja;")
	private final Class279 aClass279_5 = new Class279(64);

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!gj;")
	public final Class143 aClass143_12;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "Lclient!gj;")
	private final Class143 aClass143_13;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class43(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_12 = arg3;
		this.aClass143_13 = arg2;
		this.aClass143_13.method3123(3);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method1377() {
		@Pc(6) Class279 local6 = this.aClass279_5;
		synchronized (this.aClass279_5) {
			this.aClass279_5.method6637();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lclient!wca;")
	public Class385 method1378(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_5;
		@Pc(16) Class385 local16;
		synchronized (this.aClass279_5) {
			local16 = (Class385) this.aClass279_5.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_13;
		@Pc(44) byte[] local44;
		synchronized (this.aClass143_13) {
			local44 = this.aClass143_13.method3125(arg0, 3);
		}
		local16 = new Class385();
		local16.aClass43_2 = this;
		if (local44 != null) {
			local16.method8564(new Class3_Sub17(local44));
		}
		@Pc(69) Class279 local69 = this.aClass279_5;
		synchronized (this.aClass279_5) {
			this.aClass279_5.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	public void method1379() {
		@Pc(2) Class279 local2 = this.aClass279_5;
		synchronized (this.aClass279_5) {
			this.aClass279_5.method6630(5);
		}
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public void method1381() {
		@Pc(2) Class279 local2 = this.aClass279_5;
		synchronized (this.aClass279_5) {
			this.aClass279_5.method6638();
		}
	}
}
