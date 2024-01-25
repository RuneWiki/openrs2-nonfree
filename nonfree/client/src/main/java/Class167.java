import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class167 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "Lclient!sw;")
	private final Class277 aClass277_38 = new Class277(64);

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!dn;")
	private final Class69 aClass69_52;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class167(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_52 = arg2;
		this.aClass69_52.method1884(32);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB)V")
	public void method4601() {
		@Pc(2) Class277 local2 = this.aClass277_38;
		synchronized (this.aClass277_38) {
			this.aClass277_38.method7018(5);
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public void method4602() {
		@Pc(2) Class277 local2 = this.aClass277_38;
		synchronized (this.aClass277_38) {
			this.aClass277_38.method7026();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	public void method4604() {
		@Pc(6) Class277 local6 = this.aClass277_38;
		synchronized (this.aClass277_38) {
			this.aClass277_38.method7019();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Lclient!uw;")
	public Class299 method4607(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_38;
		@Pc(16) Class299 local16;
		synchronized (this.aClass277_38) {
			local16 = (Class299) this.aClass277_38.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_52;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_52) {
			local38 = this.aClass69_52.method1888(arg0, 32);
		}
		local16 = new Class299();
		if (local38 != null) {
			local16.method7699(new Class1_Sub17(local38));
		}
		@Pc(60) Class277 local60 = this.aClass277_38;
		synchronized (this.aClass277_38) {
			this.aClass277_38.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
