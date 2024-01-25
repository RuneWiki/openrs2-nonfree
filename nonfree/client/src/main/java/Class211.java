import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class211 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!jv;")
	private final Class126 aClass126_45 = new Class126(128);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!bu;")
	private final Class32 aClass32_73;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!oq;ILclient!bu;)V")
	public Class211(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2) {
		this.aClass32_73 = arg2;
		if (this.aClass32_73 != null) {
			@Pc(20) int local20 = this.aClass32_73.method809() - 1;
			this.aClass32_73.method790(local20);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lclient!pr;")
	public Class197 method4512(@OriginalArg(0) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_45;
		@Pc(18) Class197 local18;
		synchronized (this.aClass126_45) {
			local18 = (Class197) this.aClass126_45.method3141((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass32_73.method785(Static252.method3754(arg0), Static293.method4128(arg0));
		local18 = new Class197();
		if (local39 != null) {
			local18.method4326(new Class3_Sub7(local39));
		}
		@Pc(63) Class126 local63 = this.aClass126_45;
		synchronized (this.aClass126_45) {
			this.aClass126_45.method3132((long) arg0, local18);
			return local18;
		}
	}
}
