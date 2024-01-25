import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class193 {

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Lclient!ff;")
	private final Class83 aClass83_46 = new Class83(64);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!vh;")
	private final Class250 aClass250_65;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;)V")
	public Class193(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2) {
		this.aClass250_65 = arg2;
		this.aClass250_65.method5653(32);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method4644() {
		@Pc(12) Class83 local12 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method1669();
		}
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	public void method4646() {
		@Pc(2) Class83 local2 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method1667();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lclient!nc;")
	public Class164 method4647(@OriginalArg(1) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_46;
		@Pc(16) Class164 local16;
		synchronized (this.aClass83_46) {
			local16 = (Class164) this.aClass83_46.method1658((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass250_65.method5667(arg0, 32);
		local16 = new Class164();
		if (local40 != null) {
			local16.method3818(new Class1_Sub1(local40));
		}
		@Pc(56) Class83 local56 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method1675((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
	public void method4648() {
		@Pc(10) Class83 local10 = this.aClass83_46;
		synchronized (this.aClass83_46) {
			this.aClass83_46.method1663(5);
		}
	}
}
