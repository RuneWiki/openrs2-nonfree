import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class134 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!ff;")
	private final Class83 aClass83_33 = new Class83(16);

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!vh;")
	private final Class250 aClass250_44;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class134(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_44 = arg2;
		this.aClass250_44.method5653(30);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public void method3025() {
		@Pc(12) Class83 local12 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method1667();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)V")
	public void method3026() {
		@Pc(6) Class83 local6 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method1663(5);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Lclient!bo;")
	public Class31 method3028(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_33;
		@Pc(16) Class31 local16;
		synchronized (this.aClass83_33) {
			local16 = (Class31) this.aClass83_33.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass250_44.method5667(arg0, 30);
		local16 = new Class31();
		if (local33 != null) {
			local16.method623(new Class1_Sub1(local33));
		}
		@Pc(49) Class83 local49 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method3029() {
		@Pc(14) Class83 local14 = this.aClass83_33;
		synchronized (this.aClass83_33) {
			this.aClass83_33.method1669();
		}
	}
}
