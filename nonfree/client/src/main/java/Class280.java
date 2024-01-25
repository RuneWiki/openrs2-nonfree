import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class280 {

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "Lclient!sw;")
	private final Class277 aClass277_64 = new Class277(16);

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "Lclient!dn;")
	private final Class69 aClass69_90;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class280(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_90 = arg2;
		this.aClass69_90.method1884(30);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)Lclient!eu;")
	public Class92 method7060(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_64;
		@Pc(16) Class92 local16;
		synchronized (this.aClass277_64) {
			local16 = (Class92) this.aClass277_64.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_90;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_90) {
			local38 = this.aClass69_90.method1888(arg0, 30);
		}
		local16 = new Class92();
		if (local38 != null) {
			local16.method2290(new Class1_Sub17(local38));
		}
		@Pc(60) Class277 local60 = this.aClass277_64;
		synchronized (this.aClass277_64) {
			this.aClass277_64.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	public void method7063() {
		@Pc(2) Class277 local2 = this.aClass277_64;
		synchronized (this.aClass277_64) {
			this.aClass277_64.method7026();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V")
	public void method7064() {
		@Pc(2) Class277 local2 = this.aClass277_64;
		synchronized (this.aClass277_64) {
			this.aClass277_64.method7019();
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)V")
	public void method7065() {
		@Pc(6) Class277 local6 = this.aClass277_64;
		synchronized (this.aClass277_64) {
			this.aClass277_64.method7018(5);
		}
	}
}
