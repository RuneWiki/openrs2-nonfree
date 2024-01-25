import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class199 {

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!fc;")
	private final Class77 aClass77_41 = new Class77(64);

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!oi;")
	private final Class185 aClass185_85;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class199(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_85 = arg2;
		this.aClass185_85.method4011(32);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public void method4203() {
		@Pc(2) Class77 local2 = this.aClass77_41;
		synchronized (this.aClass77_41) {
			this.aClass77_41.method1386(5);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!mr;")
	public Class164 method4206(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_41;
		@Pc(16) Class164 local16;
		synchronized (this.aClass77_41) {
			local16 = (Class164) this.aClass77_41.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_85;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_85) {
			local38 = this.aClass185_85.method4002(32, arg0);
		}
		local16 = new Class164();
		if (local38 != null) {
			local16.method3663(new Class1_Sub19(local38));
		}
		@Pc(68) Class77 local68 = this.aClass77_41;
		synchronized (this.aClass77_41) {
			this.aClass77_41.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
	public void method4207() {
		@Pc(2) Class77 local2 = this.aClass77_41;
		synchronized (this.aClass77_41) {
			this.aClass77_41.method1394();
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	public void method4208() {
		@Pc(6) Class77 local6 = this.aClass77_41;
		synchronized (this.aClass77_41) {
			this.aClass77_41.method1395();
		}
	}
}
