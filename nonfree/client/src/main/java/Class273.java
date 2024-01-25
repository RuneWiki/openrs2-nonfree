import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class273 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!fc;")
	private final Class77 aClass77_65 = new Class77(128);

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Lclient!oi;")
	private final Class185 aClass185_120;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!le;ILclient!oi;)V")
	public Class273(@OriginalArg(0) Class148 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2) {
		this.aClass185_120 = arg2;
		if (this.aClass185_120 != null) {
			@Pc(20) int local20 = this.aClass185_120.method4010() - 1;
			this.aClass185_120.method4011(local20);
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)Lclient!oa;")
	public Class179 method5978(@OriginalArg(0) int arg0) {
		@Pc(6) Class77 local6 = this.aClass77_65;
		@Pc(16) Class179 local16;
		synchronized (this.aClass77_65) {
			local16 = (Class179) this.aClass77_65.method1387((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass185_120.method4002(Static87.method1051(arg0), Static115.method1422(arg0));
		local16 = new Class179();
		if (local37 != null) {
			local16.method3904(new Class1_Sub19(local37));
		}
		@Pc(53) Class77 local53 = this.aClass77_65;
		synchronized (this.aClass77_65) {
			this.aClass77_65.method1396(local16, (long) arg0);
			return local16;
		}
	}
}
