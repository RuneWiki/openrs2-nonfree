import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class75 {

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!jda;")
	private final Class165 aClass165_17 = new Class165(16);

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Lclient!aj;")
	private final Class15 aClass15_29;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class75(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_29 = arg2;
		this.aClass15_29.method512(30);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!hh;")
	public Class134 method2033(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_17;
		@Pc(16) Class134 local16;
		synchronized (this.aClass165_17) {
			local16 = (Class134) this.aClass165_17.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_29;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_29) {
			local38 = this.aClass15_29.method517(arg0, 30);
		}
		local16 = new Class134();
		if (local38 != null) {
			local16.method3821(new Class3_Sub25(local38));
		}
		@Pc(68) Class165 local68 = this.aClass165_17;
		synchronized (this.aClass165_17) {
			this.aClass165_17.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)V")
	public void method2034() {
		@Pc(2) Class165 local2 = this.aClass165_17;
		synchronized (this.aClass165_17) {
			this.aClass165_17.method4394(5);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public void method2035() {
		@Pc(10) Class165 local10 = this.aClass165_17;
		synchronized (this.aClass165_17) {
			this.aClass165_17.method4400();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public void method2036() {
		@Pc(6) Class165 local6 = this.aClass165_17;
		synchronized (this.aClass165_17) {
			this.aClass165_17.method4403();
		}
	}
}
