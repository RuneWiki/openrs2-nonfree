import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class206 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!er;")
	private final Class69 aClass69_59 = new Class69(128);

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Lclient!ns;")
	private final Class166 aClass166_238;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class206(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_238 = arg2;
		if (this.aClass166_238 != null) {
			@Pc(20) int local20 = this.aClass166_238.method3695() - 1;
			this.aClass166_238.method3691(local20);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Lclient!nv;")
	public Class168 method4794(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_59;
		@Pc(16) Class168 local16;
		synchronized (this.aClass69_59) {
			local16 = (Class168) this.aClass69_59.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass166_238.method3696(Static63.method1230(arg0), Static25.method523(arg0));
		local16 = new Class168();
		if (local37 != null) {
			local16.method3715(new Class4_Sub30(local37));
		}
		@Pc(53) Class69 local53 = this.aClass69_59;
		synchronized (this.aClass69_59) {
			this.aClass69_59.method1590((long) arg0, local16);
			return local16;
		}
	}
}
