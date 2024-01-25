import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class27 {

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "Lclient!vg;")
	private final Class342 aClass342_18 = new Class342(64);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "Lclient!ri;")
	private final Class284 aClass284_12;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!ei;ILclient!ri;)V")
	public Class27(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class284 arg2) {
		this.aClass284_12 = arg2;
		if (this.aClass284_12 != null) {
			this.aClass284_12.method6354(11);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	public void method482() {
		@Pc(2) Class342 local2 = this.aClass342_18;
		synchronized (this.aClass342_18) {
			this.aClass342_18.method7693();
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Lclient!bs;")
	public Class41 method483(@OriginalArg(0) int arg0) {
		@Pc(6) Class342 local6 = this.aClass342_18;
		@Pc(16) Class41 local16;
		synchronized (this.aClass342_18) {
			local16 = (Class41) this.aClass342_18.method7684((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class284 local29 = this.aClass284_12;
		@Pc(38) byte[] local38;
		synchronized (this.aClass284_12) {
			local38 = this.aClass284_12.method6331(11, arg0);
		}
		local16 = new Class41();
		if (local38 != null) {
			local16.method1206(new Class3_Sub26(local38));
		}
		@Pc(71) Class342 local71 = this.aClass342_18;
		synchronized (this.aClass342_18) {
			this.aClass342_18.method7683(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(I)V")
	public void method486() {
		@Pc(6) Class342 local6 = this.aClass342_18;
		synchronized (this.aClass342_18) {
			this.aClass342_18.method7687();
		}
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
	public void method488() {
		@Pc(12) Class342 local12 = this.aClass342_18;
		synchronized (this.aClass342_18) {
			this.aClass342_18.method7697(5);
		}
	}
}
