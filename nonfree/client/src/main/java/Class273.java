import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class273 {

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!qj;")
	private final Class295 aClass295_47 = new Class295(256);

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Lclient!uq;")
	private final Class362 aClass362_98;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;)V")
	public Class273(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_98 = arg2;
		this.aClass362_98.method8355(26);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lclient!hu;")
	public Class3_Sub5_Sub9 method6039(@OriginalArg(0) int arg0) {
		@Pc(11) Class295 local11 = this.aClass295_47;
		@Pc(21) Class3_Sub5_Sub9 local21;
		synchronized (this.aClass295_47) {
			local21 = (Class3_Sub5_Sub9) this.aClass295_47.method6470((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class362 local34 = this.aClass362_98;
		@Pc(45) byte[] local45;
		synchronized (this.aClass362_98) {
			local45 = this.aClass362_98.method8368(26, arg0);
		}
		local21 = new Class3_Sub5_Sub9();
		if (local45 != null) {
			local21.method3581(new Class3_Sub4(local45));
		}
		@Pc(67) Class295 local67 = this.aClass295_47;
		synchronized (this.aClass295_47) {
			this.aClass295_47.method6469((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)V")
	public void method6040() {
		@Pc(6) Class295 local6 = this.aClass295_47;
		synchronized (this.aClass295_47) {
			this.aClass295_47.method6462(5);
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	public void method6042() {
		@Pc(2) Class295 local2 = this.aClass295_47;
		synchronized (this.aClass295_47) {
			this.aClass295_47.method6464();
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public void method6044() {
		@Pc(6) Class295 local6 = this.aClass295_47;
		synchronized (this.aClass295_47) {
			this.aClass295_47.method6474();
		}
	}
}
