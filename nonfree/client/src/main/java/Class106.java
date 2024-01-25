import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class106 {

	@OriginalMember(owner = "client!hv", name = "d", descriptor = "Lclient!jv;")
	private final Class126 aClass126_19 = new Class126(128);

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "Lclient!bu;")
	private final Class32 aClass32_44;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class106(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_44 = arg2;
		this.aClass32_44.method790(1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
	public void method2685() {
		@Pc(6) Class126 local6 = this.aClass126_19;
		synchronized (this.aClass126_19) {
			this.aClass126_19.method3131();
		}
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
	public void method2688() {
		@Pc(2) Class126 local2 = this.aClass126_19;
		synchronized (this.aClass126_19) {
			this.aClass126_19.method3135();
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)V")
	public void method2689() {
		@Pc(12) Class126 local12 = this.aClass126_19;
		synchronized (this.aClass126_19) {
			this.aClass126_19.method3140(5);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BI)Lclient!sf;")
	public Class225 method2690(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_19;
		@Pc(16) Class225 local16;
		synchronized (this.aClass126_19) {
			local16 = (Class225) this.aClass126_19.method3141((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) byte[] local38 = this.aClass32_44.method785(arg0, 1);
		local16 = new Class225();
		if (local38 != null) {
			local16.method4816(new Class3_Sub7(local38));
		}
		@Pc(54) Class126 local54 = this.aClass126_19;
		synchronized (this.aClass126_19) {
			this.aClass126_19.method3132((long) arg0, local16);
			return local16;
		}
	}
}
