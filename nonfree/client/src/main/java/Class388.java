import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class388 {

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "Lclient!pja;")
	private Class279 aClass279_66 = new Class279(64);

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "Lclient!gj;")
	private final Class143 aClass143_145;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class388(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_145 = arg2;
		if (this.aClass143_145 != null) {
			@Pc(20) int local20 = this.aClass143_145.method3116() - 1;
			this.aClass143_145.method3123(local20);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public void method8663() {
		@Pc(6) Class279 local6 = this.aClass279_66;
		synchronized (this.aClass279_66) {
			this.aClass279_66.method6638();
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(II)V")
	public void method8665() {
		@Pc(6) Class279 local6 = this.aClass279_66;
		synchronized (this.aClass279_66) {
			this.aClass279_66.method6630(5);
		}
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
	public void method8666() {
		@Pc(6) Class279 local6 = this.aClass279_66;
		synchronized (this.aClass279_66) {
			this.aClass279_66.method6637();
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(II)Lclient!sda;")
	public Class319 method8667(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_66;
		@Pc(16) Class319 local16;
		synchronized (this.aClass279_66) {
			local16 = (Class319) this.aClass279_66.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_145;
		@Pc(42) byte[] local42;
		synchronized (this.aClass143_145) {
			local42 = this.aClass143_145.method3125(Static617.method8094(arg0), Static640.method8402(arg0));
		}
		local16 = new Class319();
		if (local42 != null) {
			local16.method7473(new Class3_Sub17(local42));
		}
		@Pc(64) Class279 local64 = this.aClass279_66;
		synchronized (this.aClass279_66) {
			this.aClass279_66.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(II)V")
	public void method8668(@OriginalArg(0) int arg0) {
		@Pc(8) Class279 local8 = this.aClass279_66;
		synchronized (this.aClass279_66) {
			this.aClass279_66.method6638();
			this.aClass279_66 = new Class279(arg0);
		}
	}
}
