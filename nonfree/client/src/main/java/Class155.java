import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class155 {

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Lclient!aj;")
	private final Class10 aClass10_21 = new Class10(128);

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!om;")
	private final Class246 aClass246_112;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class155(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_112 = arg2;
		if (this.aClass246_112 != null) {
			@Pc(20) int local20 = this.aClass246_112.method5682() - 1;
			this.aClass246_112.method5673(local20);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)Lclient!hfa;")
	public Class129 method3928(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_21;
		@Pc(16) Class129 local16;
		synchronized (this.aClass10_21) {
			local16 = (Class129) this.aClass10_21.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass246_112.method5653(Static193.method3299(arg0), Static458.method6368(arg0));
		local16 = new Class129();
		if (local37 != null) {
			local16.method3302(new Class3_Sub11(local37));
		}
		@Pc(53) Class10 local53 = this.aClass10_21;
		synchronized (this.aClass10_21) {
			this.aClass10_21.method254(local16, (long) arg0);
			return local16;
		}
	}
}
