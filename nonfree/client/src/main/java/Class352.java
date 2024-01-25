import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class352 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!pja;")
	private final Class279 aClass279_55 = new Class279(64);

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
	public int anInt9429 = 0;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "Lclient!gj;")
	private final Class143 aClass143_131;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public final int anInt9427;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class352(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_131 = arg2;
		this.anInt9427 = this.aClass143_131.method3123(4);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public void method7967() {
		@Pc(2) Class279 local2 = this.aClass279_55;
		synchronized (this.aClass279_55) {
			this.aClass279_55.method6630(5);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public void method7968() {
		@Pc(2) Class279 local2 = this.aClass279_55;
		synchronized (this.aClass279_55) {
			this.aClass279_55.method6637();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lclient!cda;")
	public Class55 method7969(@OriginalArg(0) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_55;
		@Pc(16) Class55 local16;
		synchronized (this.aClass279_55) {
			local16 = (Class55) this.aClass279_55.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_131;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_131) {
			local38 = this.aClass143_131.method3125(arg0, 4);
		}
		local16 = new Class55();
		local16.aClass352_1 = this;
		local16.anInt1614 = arg0;
		if (local38 != null) {
			local16.method1565(new Class3_Sub17(local38));
		}
		local16.method1568();
		@Pc(75) Class279 local75 = this.aClass279_55;
		synchronized (this.aClass279_55) {
			this.aClass279_55.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method7970() {
		@Pc(2) Class279 local2 = this.aClass279_55;
		synchronized (this.aClass279_55) {
			this.aClass279_55.method6638();
		}
	}
}
