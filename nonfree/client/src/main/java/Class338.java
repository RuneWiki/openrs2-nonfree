import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class338 {

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "Lclient!vi;")
	private final Class332 aClass332_200 = new Class332(128);

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "Lclient!pq;")
	private final Class251 aClass251_154;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class338(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_154 = arg2;
		if (this.aClass251_154 != null) {
			@Pc(20) int local20 = this.aClass251_154.method5847() - 1;
			this.aClass251_154.method5849(local20);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Lclient!kt;")
	public Class177 method7594(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_200;
		@Pc(16) Class177 local16;
		synchronized (this.aClass332_200) {
			local16 = (Class177) this.aClass332_200.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass251_154.method5860(Static518.method2903(arg0), Static316.method4907(arg0));
		local16 = new Class177();
		if (local44 != null) {
			local16.method3827(new Class6_Sub14(local44));
		}
		@Pc(60) Class332 local60 = this.aClass332_200;
		synchronized (this.aClass332_200) {
			this.aClass332_200.method7498((long) arg0, local16);
			return local16;
		}
	}
}
