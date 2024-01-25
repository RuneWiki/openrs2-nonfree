import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!vg;")
	private final Class342 aClass342_4 = new Class342(256);

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!ri;")
	private final Class284 aClass284_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class7(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_1 = arg2;
		this.aClass284_1.method6354(26);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Lclient!jv;")
	public Class3_Sub7_Sub10 method62(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_4;
		@Pc(16) Class3_Sub7_Sub10 local16;
		synchronized (this.aClass342_4) {
			local16 = (Class3_Sub7_Sub10) this.aClass342_4.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_1;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_1) {
			local38 = this.aClass284_1.method6331(26, arg0);
		}
		local16 = new Class3_Sub7_Sub10();
		if (local38 != null) {
			local16.method4070(new Class3_Sub26(local38));
		}
		@Pc(60) Class342 local60 = this.aClass342_4;
		synchronized (this.aClass342_4) {
			this.aClass342_4.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	public void method64() {
		@Pc(2) Class342 local2 = this.aClass342_4;
		synchronized (this.aClass342_4) {
			this.aClass342_4.method7697(5);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public void method65() {
		@Pc(8) Class342 local8 = this.aClass342_4;
		synchronized (this.aClass342_4) {
			this.aClass342_4.method7687();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public void method66() {
		@Pc(2) Class342 local2 = this.aClass342_4;
		synchronized (this.aClass342_4) {
			this.aClass342_4.method7693();
		}
	}
}
