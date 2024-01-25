import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class302 {

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Lclient!pca;")
	private final Class245 aClass245_62 = new Class245(64);

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Lclient!jo;")
	private final Class168 aClass168_113;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
	public final int anInt8823;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class302(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_113 = arg2;
		this.anInt8823 = this.aClass168_113.method4443(19);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Lclient!tu;")
	public Class309 method7382(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_62;
		@Pc(16) Class309 local16;
		synchronized (this.aClass245_62) {
			local16 = (Class309) this.aClass245_62.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class168 local29 = this.aClass168_113;
		@Pc(38) byte[] local38;
		synchronized (this.aClass168_113) {
			local38 = this.aClass168_113.method4435(arg0, 19);
		}
		local16 = new Class309();
		if (local38 != null) {
			local16.method7471(new Class6_Sub26(local38));
		}
		@Pc(60) Class245 local60 = this.aClass245_62;
		synchronized (this.aClass245_62) {
			this.aClass245_62.method6075(local16, (long) arg0);
			return local16;
		}
	}
}
