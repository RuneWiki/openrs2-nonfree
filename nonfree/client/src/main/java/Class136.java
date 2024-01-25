import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class136 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!fc;")
	private final Class77 aClass77_31 = new Class77(64);

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!oi;")
	private final Class185 aClass185_61;

	static {
		new Class142(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class136(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_61 = arg2;
		if (this.aClass185_61 != null) {
			this.aClass185_61.method4011(11);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method3013() {
		@Pc(14) Class77 local14 = this.aClass77_31;
		synchronized (this.aClass77_31) {
			this.aClass77_31.method1395();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Lclient!cr;")
	public Class45 method3016(@OriginalArg(1) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_31;
		@Pc(16) Class45 local16;
		synchronized (this.aClass77_31) {
			local16 = (Class45) this.aClass77_31.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class185 local34 = this.aClass185_61;
		@Pc(43) byte[] local43;
		synchronized (this.aClass185_61) {
			local43 = this.aClass185_61.method4002(11, arg0);
		}
		local16 = new Class45();
		if (local43 != null) {
			local16.method841(new Class1_Sub19(local43));
		}
		@Pc(65) Class77 local65 = this.aClass77_31;
		synchronized (this.aClass77_31) {
			this.aClass77_31.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public void method3018() {
		@Pc(2) Class77 local2 = this.aClass77_31;
		synchronized (this.aClass77_31) {
			this.aClass77_31.method1394();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	public void method3020() {
		@Pc(12) Class77 local12 = this.aClass77_31;
		synchronized (this.aClass77_31) {
			this.aClass77_31.method1386(5);
		}
	}
}
