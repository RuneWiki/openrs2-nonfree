import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class71 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!vg;")
	private final Class342 aClass342_44 = new Class342(128);

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "Lclient!ri;")
	private final Class284 aClass284_33;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class71(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_33 = arg2;
		this.aClass284_33.method6354(1);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public void method2104() {
		@Pc(12) Class342 local12 = this.aClass342_44;
		synchronized (this.aClass342_44) {
			this.aClass342_44.method7693();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)V")
	public void method2106() {
		@Pc(6) Class342 local6 = this.aClass342_44;
		synchronized (this.aClass342_44) {
			this.aClass342_44.method7697(5);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)Lclient!lj;")
	public Class188 method2109(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_44;
		@Pc(16) Class188 local16;
		synchronized (this.aClass342_44) {
			local16 = (Class188) this.aClass342_44.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_33;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_33) {
			local38 = this.aClass284_33.method6331(1, arg0);
		}
		local16 = new Class188();
		if (local38 != null) {
			local16.method4637(new Class3_Sub26(local38));
		}
		@Pc(60) Class342 local60 = this.aClass342_44;
		synchronized (this.aClass342_44) {
			this.aClass342_44.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)V")
	public void method2110() {
		@Pc(6) Class342 local6 = this.aClass342_44;
		synchronized (this.aClass342_44) {
			this.aClass342_44.method7687();
		}
	}
}
