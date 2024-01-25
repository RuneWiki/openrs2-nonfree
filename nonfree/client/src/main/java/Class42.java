import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class42 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!vi;")
	private final Class332 aClass332_29 = new Class332(64);

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!pq;")
	private final Class251 aClass251_18;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class42(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_18 = arg2;
		this.aClass251_18.method5849(5);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!rd;")
	public Class6_Sub1_Sub15 method688(@OriginalArg(1) int arg0) {
		@Pc(12) Class332 local12 = this.aClass332_29;
		@Pc(22) Class6_Sub1_Sub15 local22;
		synchronized (this.aClass332_29) {
			local22 = (Class6_Sub1_Sub15) this.aClass332_29.method7502((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class251 local35 = this.aClass251_18;
		@Pc(44) byte[] local44;
		synchronized (this.aClass251_18) {
			local44 = this.aClass251_18.method5860(5, arg0);
		}
		local22 = new Class6_Sub1_Sub15();
		if (local44 != null) {
			local22.method6312(new Class6_Sub14(local44));
		}
		@Pc(68) Class332 local68 = this.aClass332_29;
		synchronized (this.aClass332_29) {
			this.aClass332_29.method7498((long) arg0, local22);
			return local22;
		}
	}
}
