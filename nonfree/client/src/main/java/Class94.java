import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class94 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!pca;")
	private final Class245 aClass245_27 = new Class245(128);

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "Lclient!jo;")
	private final Class168 aClass168_34;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!jda;ILclient!jo;)V")
	public Class94(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_34 = arg2;
		if (this.aClass168_34 != null) {
			@Pc(20) int local20 = this.aClass168_34.method4456() - 1;
			this.aClass168_34.method4443(local20);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Lclient!pn;")
	public Class252 method2506(@OriginalArg(0) int arg0) {
		@Pc(6) Class245 local6 = this.aClass245_27;
		@Pc(16) Class252 local16;
		synchronized (this.aClass245_27) {
			local16 = (Class252) this.aClass245_27.method6082((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass168_34.method4435(Static232.method4115(arg0), Static522.method7632(arg0));
		local16 = new Class252();
		if (local37 != null) {
			local16.method6276(new Class6_Sub26(local37));
		}
		@Pc(53) Class245 local53 = this.aClass245_27;
		synchronized (this.aClass245_27) {
			this.aClass245_27.method6075(local16, (long) arg0);
			return local16;
		}
	}
}
