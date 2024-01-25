import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class76 {

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!fc;")
	private Class77 aClass77_17 = new Class77(64);

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!oi;")
	private final Class185 aClass185_35;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class76(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_35 = arg2;
		if (this.aClass185_35 != null) {
			@Pc(20) int local20 = this.aClass185_35.method4010() - 1;
			this.aClass185_35.method4011(local20);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)V")
	public void method1373(@OriginalArg(0) int arg0) {
		@Pc(2) Class77 local2 = this.aClass77_17;
		synchronized (this.aClass77_17) {
			this.aClass77_17.method1395();
			this.aClass77_17 = new Class77(arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!qg;")
	public Class207 method1374(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_17;
		@Pc(16) Class207 local16;
		synchronized (this.aClass77_17) {
			local16 = (Class207) this.aClass77_17.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(38) Class185 local38 = this.aClass185_35;
		@Pc(51) byte[] local51;
		synchronized (this.aClass185_35) {
			local51 = this.aClass185_35.method4002(Static391.method5080(arg0), Static388.method5412(arg0));
		}
		local16 = new Class207();
		if (local51 != null) {
			local16.method4402(new Class1_Sub19(local51));
		}
		@Pc(73) Class77 local73 = this.aClass77_17;
		synchronized (this.aClass77_17) {
			this.aClass77_17.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public void method1376() {
		@Pc(2) Class77 local2 = this.aClass77_17;
		synchronized (this.aClass77_17) {
			this.aClass77_17.method1386(5);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method1380() {
		@Pc(6) Class77 local6 = this.aClass77_17;
		synchronized (this.aClass77_17) {
			this.aClass77_17.method1395();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public void method1383() {
		@Pc(2) Class77 local2 = this.aClass77_17;
		synchronized (this.aClass77_17) {
			this.aClass77_17.method1394();
		}
	}
}
