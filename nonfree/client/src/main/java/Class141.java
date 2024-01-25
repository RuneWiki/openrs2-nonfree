import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class141 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "Lclient!sw;")
	private final Class277 aClass277_31 = new Class277(256);

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_39;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;)V")
	public Class141(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2) {
		this.aClass69_39 = arg2;
		this.aClass69_39.method1884(26);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
	public void method3829() {
		@Pc(10) Class277 local10 = this.aClass277_31;
		synchronized (this.aClass277_31) {
			this.aClass277_31.method7026();
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)Lclient!iba;")
	public Class1_Sub2_Sub9 method3830(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_31;
		@Pc(16) Class1_Sub2_Sub9 local16;
		synchronized (this.aClass277_31) {
			local16 = (Class1_Sub2_Sub9) this.aClass277_31.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_39;
		@Pc(38) byte[] local38;
		synchronized (this.aClass69_39) {
			local38 = this.aClass69_39.method1888(arg0, 26);
		}
		local16 = new Class1_Sub2_Sub9();
		if (local38 != null) {
			local16.method3694(new Class1_Sub17(local38));
		}
		@Pc(65) Class277 local65 = this.aClass277_31;
		synchronized (this.aClass277_31) {
			this.aClass277_31.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)V")
	public void method3832() {
		@Pc(12) Class277 local12 = this.aClass277_31;
		synchronized (this.aClass277_31) {
			this.aClass277_31.method7018(5);
		}
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public void method3833() {
		@Pc(2) Class277 local2 = this.aClass277_31;
		synchronized (this.aClass277_31) {
			this.aClass277_31.method7019();
		}
	}
}
