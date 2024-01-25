import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class233 {

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!fc;")
	private final Class77 aClass77_50 = new Class77(64);

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!oi;")
	private final Class185 aClass185_100;

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
	public final int anInt6078;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class233(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_100 = arg2;
		if (this.aClass185_100 == null) {
			this.anInt6078 = 0;
		} else {
			this.anInt6078 = this.aClass185_100.method4011(16);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lclient!uv;")
	public Class258 method4876(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_50;
		@Pc(16) Class258 local16;
		synchronized (this.aClass77_50) {
			local16 = (Class258) this.aClass77_50.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class185 local29 = this.aClass185_100;
		@Pc(38) byte[] local38;
		synchronized (this.aClass185_100) {
			local38 = this.aClass185_100.method4002(16, arg0);
		}
		local16 = new Class258();
		if (local38 != null) {
			local16.method5399(new Class1_Sub19(local38));
		}
		@Pc(70) Class77 local70 = this.aClass77_50;
		synchronized (this.aClass77_50) {
			this.aClass77_50.method1396(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	public void method4877() {
		@Pc(2) Class77 local2 = this.aClass77_50;
		synchronized (this.aClass77_50) {
			this.aClass77_50.method1394();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)V")
	public void method4878() {
		@Pc(14) Class77 local14 = this.aClass77_50;
		synchronized (this.aClass77_50) {
			this.aClass77_50.method1386(5);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	public void method4879() {
		@Pc(2) Class77 local2 = this.aClass77_50;
		synchronized (this.aClass77_50) {
			this.aClass77_50.method1395();
		}
	}
}
