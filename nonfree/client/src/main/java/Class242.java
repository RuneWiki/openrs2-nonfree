import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class242 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "Lclient!kh;")
	private final Class134 aClass134_53 = new Class134(128);

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!ul;")
	private final Class246 aClass246_207;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;)V")
	public Class242(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_207 = arg2;
		if (this.aClass246_207 != null) {
			@Pc(20) int local20 = this.aClass246_207.method5502() - 1;
			this.aClass246_207.method5492(local20);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Lclient!mr;")
	public Class165 method5431(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_53;
		@Pc(16) Class165 local16;
		synchronized (this.aClass134_53) {
			local16 = (Class165) this.aClass134_53.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass246_207.method5477(Static264.method3897(arg0), Static111.method1985(arg0));
		local16 = new Class165();
		if (local44 != null) {
			local16.method3787(new Class1_Sub5(local44));
		}
		@Pc(60) Class134 local60 = this.aClass134_53;
		synchronized (this.aClass134_53) {
			this.aClass134_53.method3263((long) arg0, local16);
			return local16;
		}
	}
}
