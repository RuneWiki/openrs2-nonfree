import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fka")
public final class Class116 {

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "Lclient!qj;")
	private final Class295 aClass295_13 = new Class295(64);

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_37;

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_38;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(ILclient!uq;Lclient!uq;)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class362 arg2) {
		this.aClass362_37 = arg2;
		this.aClass362_38 = arg1;
		if (this.aClass362_38 != null) {
			this.aClass362_38.method8355(0);
		}
		if (this.aClass362_37 != null) {
			this.aClass362_37.method8355(0);
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)Lclient!lca;")
	public Class3_Sub5_Sub12 method2749(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub5_Sub12 local11 = (Class3_Sub5_Sub12) this.aClass295_13.method6470((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass362_38.method8368(0, arg0);
		} else {
			local27 = this.aClass362_37.method8368(0, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub5_Sub12();
		if (local27 != null) {
			local11.method4702(new Class3_Sub4(local27));
		}
		if (arg0 >= 32768) {
			local11.method4705();
		}
		this.aClass295_13.method6469((long) arg0, local11);
		return local11;
	}
}
