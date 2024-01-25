import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class59 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "Lclient!jt;")
	private final Class166 aClass166_11 = new Class166(128);

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "Lclient!vd;")
	private final Class353 aClass353_19;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class59(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_19 = arg2;
		if (this.aClass353_19 != null) {
			@Pc(20) int local20 = this.aClass353_19.method8415() - 1;
			this.aClass353_19.method8422(local20);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)Lclient!ra;")
	public Class281 method1520(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_11;
		@Pc(16) Class281 local16;
		synchronized (this.aClass166_11) {
			local16 = (Class281) this.aClass166_11.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass353_19.method8404(Static646.method6043(arg0), Static297.method6208(arg0));
		local16 = new Class281();
		if (local37 != null) {
			local16.method7168(new Class6_Sub40(local37));
		}
		@Pc(53) Class166 local53 = this.aClass166_11;
		synchronized (this.aClass166_11) {
			this.aClass166_11.method4803(local16, (long) arg0);
			return local16;
		}
	}
}
