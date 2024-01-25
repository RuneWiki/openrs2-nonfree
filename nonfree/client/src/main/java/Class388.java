import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class388 {

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "Lclient!af;")
	private final Class10 aClass10_64 = new Class10(64);

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!ae;")
	private final Class8 aClass8_148;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!jk;ILclient!ae;)V")
	public Class388(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2) {
		this.aClass8_148 = arg2;
		this.aClass8_148.method280(5);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)Lclient!gh;")
	public Class6_Sub4_Sub6 method9031(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_64;
		@Pc(16) Class6_Sub4_Sub6 local16;
		synchronized (this.aClass10_64) {
			local16 = (Class6_Sub4_Sub6) this.aClass10_64.method373((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class8 local37 = this.aClass8_148;
		@Pc(46) byte[] local46;
		synchronized (this.aClass8_148) {
			local46 = this.aClass8_148.method262(arg0, 5);
		}
		local16 = new Class6_Sub4_Sub6();
		if (local46 != null) {
			local16.method2623(new Class6_Sub23(local46));
		}
		@Pc(68) Class10 local68 = this.aClass10_64;
		synchronized (this.aClass10_64) {
			this.aClass10_64.method366(local16, (long) arg0);
			return local16;
		}
	}
}
