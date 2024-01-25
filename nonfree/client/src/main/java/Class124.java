import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class124 {

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!vg;")
	private final Class342 aClass342_79 = new Class342(64);

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ri;")
	private final Class284 aClass284_61;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class124(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_61 = arg2;
		if (this.aClass284_61 != null) {
			this.aClass284_61.method6354(35);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)V")
	public void method3404() {
		@Pc(2) Class342 local2 = this.aClass342_79;
		synchronized (this.aClass342_79) {
			this.aClass342_79.method7697(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3406() {
		@Pc(6) Class342 local6 = this.aClass342_79;
		synchronized (this.aClass342_79) {
			this.aClass342_79.method7687();
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)Lclient!iba;")
	public Class135 method3409(@OriginalArg(1) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_79;
		@Pc(16) Class135 local16;
		synchronized (this.aClass342_79) {
			local16 = (Class135) this.aClass342_79.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_61;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_61) {
			local38 = this.aClass284_61.method6331(35, arg0);
		}
		local16 = new Class135();
		if (local38 != null) {
			local16.method3566(new Class3_Sub26(local38));
		}
		local16.method3569();
		@Pc(71) Class342 local71 = this.aClass342_79;
		synchronized (this.aClass342_79) {
			this.aClass342_79.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public void method3410() {
		@Pc(2) Class342 local2 = this.aClass342_79;
		synchronized (this.aClass342_79) {
			this.aClass342_79.method7693();
		}
	}
}
