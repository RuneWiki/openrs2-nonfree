import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class26 {

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Lclient!fc;")
	private final Class77 aClass77_7 = new Class77(64);

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!oi;")
	private final Class185 aClass185_8;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class26(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_8 = arg2;
		if (this.aClass185_8 != null) {
			this.aClass185_8.method4011(35);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lclient!iv;")
	public Class124 method356(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_7;
		@Pc(16) Class124 local16;
		synchronized (this.aClass77_7) {
			local16 = (Class124) this.aClass77_7.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_8;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_8) {
			local38 = this.aClass185_8.method4002(35, arg0);
		}
		local16 = new Class124();
		if (local38 != null) {
			local16.method2682(new Class1_Sub19(local38));
		}
		local16.method2683();
		@Pc(63) Class77 local63 = this.aClass77_7;
		synchronized (this.aClass77_7) {
			this.aClass77_7.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method358() {
		@Pc(2) Class77 local2 = this.aClass77_7;
		synchronized (this.aClass77_7) {
			this.aClass77_7.method1395();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method359() {
		@Pc(2) Class77 local2 = this.aClass77_7;
		synchronized (this.aClass77_7) {
			this.aClass77_7.method1394();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public void method361() {
		@Pc(10) Class77 local10 = this.aClass77_7;
		synchronized (this.aClass77_7) {
			this.aClass77_7.method1386(5);
		}
	}
}
