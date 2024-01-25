import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class126 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!fc;")
	private final Class77 aClass77_27 = new Class77(16);

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_53;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class126(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_53 = arg2;
		this.aClass185_53.method4011(30);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!jv;")
	public Class134 method2690(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_27;
		@Pc(16) Class134 local16;
		synchronized (this.aClass77_27) {
			local16 = (Class134) this.aClass77_27.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_53;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_53) {
			local38 = this.aClass185_53.method4002(30, arg0);
		}
		local16 = new Class134();
		if (local38 != null) {
			local16.method2987(new Class1_Sub19(local38));
		}
		@Pc(60) Class77 local60 = this.aClass77_27;
		synchronized (this.aClass77_27) {
			this.aClass77_27.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public void method2691() {
		@Pc(2) Class77 local2 = this.aClass77_27;
		synchronized (this.aClass77_27) {
			this.aClass77_27.method1394();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
	public void method2692() {
		@Pc(8) Class77 local8 = this.aClass77_27;
		synchronized (this.aClass77_27) {
			this.aClass77_27.method1386(5);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public void method2694() {
		@Pc(2) Class77 local2 = this.aClass77_27;
		synchronized (this.aClass77_27) {
			this.aClass77_27.method1395();
		}
	}
}
