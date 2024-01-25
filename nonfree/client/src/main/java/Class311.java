import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class311 {

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "Lclient!qj;")
	private final Class295 aClass295_53 = new Class295(128);

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_113;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class311(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_113 = arg2;
		if (this.aClass362_113 != null) {
			@Pc(20) int local20 = this.aClass362_113.method8373() - 1;
			this.aClass362_113.method8355(local20);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lclient!bc;")
	public Class25 method6836(@OriginalArg(1) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_53;
		@Pc(16) Class25 local16;
		synchronized (this.aClass295_53) {
			local16 = (Class25) this.aClass295_53.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass362_113.method8368(Static662.method8830(arg0), Static394.method5495(arg0));
		local16 = new Class25();
		if (local37 != null) {
			local16.method732(new Class3_Sub4(local37));
		}
		@Pc(58) Class295 local58 = this.aClass295_53;
		synchronized (this.aClass295_53) {
			this.aClass295_53.method6469((long) arg0, local16);
			return local16;
		}
	}
}
