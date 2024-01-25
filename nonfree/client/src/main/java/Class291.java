import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class291 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!jn;")
	private final Class167 aClass167_46 = new Class167(128);

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "Lclient!vo;")
	private final Class348 aClass348_106;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!gn;ILclient!vo;)V")
	public Class291(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class348 arg2) {
		this.aClass348_106 = arg2;
		if (this.aClass348_106 != null) {
			@Pc(20) int local20 = this.aClass348_106.method7985() - 1;
			this.aClass348_106.method7981(local20);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)Lclient!jp;")
	public Class168 method6677(@OriginalArg(0) int arg0) {
		@Pc(6) Class167 local6 = this.aClass167_46;
		@Pc(16) Class168 local16;
		synchronized (this.aClass167_46) {
			local16 = (Class168) this.aClass167_46.method3966((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass348_106.method7964(Static416.method6244(arg0), Static232.method3761(arg0));
		local16 = new Class168();
		if (local45 != null) {
			local16.method3985(new Class4_Sub13(local45));
		}
		@Pc(61) Class167 local61 = this.aClass167_46;
		synchronized (this.aClass167_46) {
			this.aClass167_46.method3974((long) arg0, local16);
			return local16;
		}
	}
}
