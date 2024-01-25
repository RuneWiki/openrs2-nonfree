import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class288 {

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Lclient!vi;")
	private final Class332 aClass332_176 = new Class332(64);

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "Lclient!pq;")
	private final Class251 aClass251_128;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "Lclient!pq;")
	private final Class251 aClass251_127;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(ILclient!pq;Lclient!pq;)V")
	public Class288(@OriginalArg(0) int arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_128 = arg2;
		this.aClass251_127 = arg1;
		if (this.aClass251_127 != null) {
			this.aClass251_127.method5849(0);
		}
		if (this.aClass251_128 != null) {
			this.aClass251_128.method5849(0);
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(II)Lclient!dp;")
	public Class6_Sub1_Sub6 method6461(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub1_Sub6 local11 = (Class6_Sub1_Sub6) this.aClass332_176.method7502((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = this.aClass251_127.method5860(0, arg0);
		} else {
			local30 = this.aClass251_128.method5860(0, arg0 & 0x7FFF);
		}
		local11 = new Class6_Sub1_Sub6();
		if (local30 != null) {
			local11.method1471(new Class6_Sub14(local30));
		}
		if (arg0 >= 32768) {
			local11.method1474();
		}
		this.aClass332_176.method7498((long) arg0, local11);
		return local11;
	}
}
