import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class134 {

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_27 = new Class288(64);

	@OriginalMember(owner = "client!hu", name = "g", descriptor = "Lclient!gp;")
	private final Class117 aClass117_105;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class134(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_105 = arg2;
		this.aClass117_105.method2951(5);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!ll;")
	public Class5_Sub2_Sub14 method3273(@OriginalArg(0) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_27;
		@Pc(16) Class5_Sub2_Sub14 local16;
		synchronized (this.aClass288_27) {
			local16 = (Class5_Sub2_Sub14) this.aClass288_27.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class117 local34 = this.aClass117_105;
		@Pc(43) byte[] local43;
		synchronized (this.aClass117_105) {
			local43 = this.aClass117_105.method2962(arg0, 5);
		}
		local16 = new Class5_Sub2_Sub14();
		if (local43 != null) {
			local16.method4826(new Class5_Sub3(local43));
		}
		@Pc(65) Class288 local65 = this.aClass288_27;
		synchronized (this.aClass288_27) {
			this.aClass288_27.method6746(local16, (long) arg0);
			return local16;
		}
	}
}
