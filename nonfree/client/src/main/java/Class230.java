import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class230 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!qj;")
	private final Class295 aClass295_39 = new Class295(64);

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!uq;")
	private final Class362 aClass362_79;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class230(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_79 = arg2;
		this.aClass362_79.method8355(5);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!vj;")
	public Class3_Sub5_Sub19 method5294(@OriginalArg(0) int arg0) {
		@Pc(10) Class295 local10 = this.aClass295_39;
		@Pc(20) Class3_Sub5_Sub19 local20;
		synchronized (this.aClass295_39) {
			local20 = (Class3_Sub5_Sub19) this.aClass295_39.method6470((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class362 local33 = this.aClass362_79;
		@Pc(42) byte[] local42;
		synchronized (this.aClass362_79) {
			local42 = this.aClass362_79.method8368(5, arg0);
		}
		local20 = new Class3_Sub5_Sub19();
		if (local42 != null) {
			local20.method8641(new Class3_Sub4(local42));
		}
		@Pc(66) Class295 local66 = this.aClass295_39;
		synchronized (this.aClass295_39) {
			this.aClass295_39.method6469((long) arg0, local20);
			return local20;
		}
	}
}
