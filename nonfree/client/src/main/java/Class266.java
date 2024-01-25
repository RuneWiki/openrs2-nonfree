import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class266 {

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!sw;")
	private final Class277 aClass277_60 = new Class277(64);

	@OriginalMember(owner = "client!si", name = "i", descriptor = "Lclient!dn;")
	private final Class69 aClass69_84;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class266(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_84 = arg2;
		if (this.aClass69_84 != null) {
			this.aClass69_84.method1884(11);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public void method6925() {
		@Pc(2) Class277 local2 = this.aClass277_60;
		synchronized (this.aClass277_60) {
			this.aClass277_60.method7019();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public void method6926() {
		@Pc(13) Class277 local13 = this.aClass277_60;
		synchronized (this.aClass277_60) {
			this.aClass277_60.method7018(5);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
	public void method6928() {
		@Pc(6) Class277 local6 = this.aClass277_60;
		synchronized (this.aClass277_60) {
			this.aClass277_60.method7026();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lclient!cq;")
	public Class53 method6930(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_60;
		@Pc(16) Class53 local16;
		synchronized (this.aClass277_60) {
			local16 = (Class53) this.aClass277_60.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_84;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_84) {
			local38 = this.aClass69_84.method1888(arg0, 11);
		}
		local16 = new Class53();
		if (local38 != null) {
			local16.method1655(new Class1_Sub17(local38));
		}
		@Pc(60) Class277 local60 = this.aClass277_60;
		synchronized (this.aClass277_60) {
			this.aClass277_60.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
