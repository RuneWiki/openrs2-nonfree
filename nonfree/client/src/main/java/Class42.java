import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class42 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient!fc;")
	private final Class77 aClass77_13 = new Class77(64);

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_18;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class42(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_18 = arg2;
		this.aClass185_18.method4011(31);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method807() {
		@Pc(6) Class77 local6 = this.aClass77_13;
		synchronized (this.aClass77_13) {
			this.aClass77_13.method1395();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
	public void method808() {
		@Pc(6) Class77 local6 = this.aClass77_13;
		synchronized (this.aClass77_13) {
			this.aClass77_13.method1394();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Lclient!ji;")
	public Class129 method812(@OriginalArg(0) int arg0) {
		@Pc(14) Class77 local14 = this.aClass77_13;
		@Pc(24) Class129 local24;
		synchronized (this.aClass77_13) {
			local24 = (Class129) this.aClass77_13.method1387((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class185 local37 = this.aClass185_18;
		@Pc(46) byte[] local46;
		synchronized (this.aClass185_18) {
			local46 = this.aClass185_18.method4002(31, arg0);
		}
		local24 = new Class129();
		if (local46 != null) {
			local24.method2808(new Class1_Sub19(local46));
		}
		@Pc(68) Class77 local68 = this.aClass77_13;
		synchronized (this.aClass77_13) {
			this.aClass77_13.method1396(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)V")
	public void method813() {
		@Pc(6) Class77 local6 = this.aClass77_13;
		synchronized (this.aClass77_13) {
			this.aClass77_13.method1386(5);
		}
	}
}
