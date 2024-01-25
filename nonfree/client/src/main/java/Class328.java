import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class328 {

	@OriginalMember(owner = "client!so", name = "e", descriptor = "Lclient!qj;")
	private final Class295 aClass295_58 = new Class295(64);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_127;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public final int anInt9065;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class328(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_127 = arg2;
		this.anInt9065 = this.aClass362_127.method8355(19);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)Lclient!pi;")
	public Class282 method7384(@OriginalArg(0) int arg0) {
		@Pc(11) Class295 local11 = this.aClass295_58;
		@Pc(21) Class282 local21;
		synchronized (this.aClass295_58) {
			local21 = (Class282) this.aClass295_58.method6470((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class362 local34 = this.aClass362_127;
		@Pc(43) byte[] local43;
		synchronized (this.aClass362_127) {
			local43 = this.aClass362_127.method8368(19, arg0);
		}
		local21 = new Class282();
		if (local43 != null) {
			local21.method6187(new Class3_Sub4(local43));
		}
		@Pc(65) Class295 local65 = this.aClass295_58;
		synchronized (this.aClass295_58) {
			this.aClass295_58.method6469((long) arg0, local21);
			return local21;
		}
	}
}
