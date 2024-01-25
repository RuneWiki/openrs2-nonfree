import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sea")
public final class Class321 {

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "Lclient!pja;")
	private Class279 aClass279_48 = new Class279(128);

	@OriginalMember(owner = "client!sea", name = "l", descriptor = "Lclient!pja;")
	public Class279 aClass279_49 = new Class279(64);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "Lclient!gj;")
	private final Class143 aClass143_122;

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "Lclient!gj;")
	public final Class143 aClass143_123;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;Lclient!gj;)V")
	public Class321(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) Class143 arg3) {
		this.aClass143_122 = arg2;
		this.aClass143_123 = arg3;
		this.aClass143_122.method3123(36);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZI)V")
	public void method7481() {
		@Pc(2) Class279 local2 = this.aClass279_48;
		synchronized (this.aClass279_48) {
			this.aClass279_48.method6630(5);
		}
		local2 = this.aClass279_49;
		synchronized (this.aClass279_49) {
			this.aClass279_49.method6630(5);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
	public void method7482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass279_48 = new Class279(arg0);
		this.aClass279_49 = new Class279(arg1);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Lclient!gka;")
	public Class145 method7485(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_48;
		@Pc(16) Class145 local16;
		synchronized (this.aClass279_48) {
			local16 = (Class145) this.aClass279_48.method6631((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class143 local29 = this.aClass143_122;
		@Pc(38) byte[] local38;
		synchronized (this.aClass143_122) {
			local38 = this.aClass143_122.method3125(arg0, 36);
		}
		local16 = new Class145();
		local16.anInt3619 = arg0;
		local16.aClass321_1 = this;
		if (local38 != null) {
			local16.method3157(new Class3_Sub17(local38));
		}
		local16.method3151();
		@Pc(69) Class279 local69 = this.aClass279_48;
		synchronized (this.aClass279_48) {
			this.aClass279_48.method6635(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public void method7486() {
		@Pc(6) Class279 local6 = this.aClass279_48;
		synchronized (this.aClass279_48) {
			this.aClass279_48.method6638();
		}
		local6 = this.aClass279_49;
		synchronized (this.aClass279_49) {
			this.aClass279_49.method6638();
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
	public void method7487() {
		@Pc(2) Class279 local2 = this.aClass279_48;
		synchronized (this.aClass279_48) {
			this.aClass279_48.method6637();
		}
		@Pc(29) Class279 local29 = this.aClass279_49;
		synchronized (this.aClass279_49) {
			this.aClass279_49.method6637();
		}
	}
}
