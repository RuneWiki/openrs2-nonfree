import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class315 {

	@OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
	public int anInt8774;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "Lclient!pja;")
	private final Class279 aClass279_46 = new Class279(64);

	@OriginalMember(owner = "client!saa", name = "q", descriptor = "Lclient!pja;")
	public final Class279 aClass279_47 = new Class279(60);

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "Lclient!gj;")
	private final Class143 aClass143_120;

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "Lclient!gj;")
	public final Class143 aClass143_119;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class315(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_120 = arg2;
		this.aClass143_119 = arg3;
		@Pc(26) int local26 = this.aClass143_120.method3116() - 1;
		this.aClass143_120.method3123(local26);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)V")
	public void method7417() {
		@Pc(2) Class279 local2 = this.aClass279_46;
		synchronized (this.aClass279_46) {
			this.aClass279_46.method6630(5);
		}
		local2 = this.aClass279_47;
		synchronized (this.aClass279_47) {
			this.aClass279_47.method6630(5);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
	public void method7418() {
		@Pc(2) Class279 local2 = this.aClass279_46;
		synchronized (this.aClass279_46) {
			this.aClass279_46.method6637();
		}
		local2 = this.aClass279_47;
		synchronized (this.aClass279_47) {
			this.aClass279_47.method6637();
		}
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)Lclient!bg;")
	public Class34 method7420(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_46;
		@Pc(16) Class34 local16;
		synchronized (this.aClass279_46) {
			local16 = (Class34) this.aClass279_46.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class143 local35 = this.aClass143_120;
		@Pc(50) byte[] local50;
		synchronized (this.aClass143_120) {
			local50 = this.aClass143_120.method3125(Static99.method1966(arg0), Static622.method8246(arg0));
		}
		local16 = new Class34();
		local16.anInt1213 = arg0;
		local16.aClass315_1 = this;
		if (local50 != null) {
			local16.method1224(new Class3_Sub17(local50));
		}
		@Pc(78) Class279 local78 = this.aClass279_46;
		synchronized (this.aClass279_46) {
			this.aClass279_46.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
	public void method7421() {
		@Pc(2) Class279 local2 = this.aClass279_46;
		synchronized (this.aClass279_46) {
			this.aClass279_46.method6638();
		}
		local2 = this.aClass279_47;
		synchronized (this.aClass279_47) {
			this.aClass279_47.method6638();
		}
	}

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "(II)V")
	public void method7422(@OriginalArg(0) int arg0) {
		this.anInt8774 = arg0;
		@Pc(13) Class279 local13 = this.aClass279_47;
		synchronized (this.aClass279_47) {
			this.aClass279_47.method6638();
		}
	}
}
