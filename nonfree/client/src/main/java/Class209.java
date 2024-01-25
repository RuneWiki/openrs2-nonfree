import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class209 {

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "Lclient!vh;")
	private final Class330 aClass330_33 = new Class330(64);

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!pj;")
	private final Class248 aClass248_51;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_52;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILclient!pj;Lclient!pj;)V")
	public Class209(@OriginalArg(0) int arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_51 = arg1;
		this.aClass248_52 = arg2;
		if (this.aClass248_51 != null) {
			this.aClass248_51.method5793(0);
		}
		if (this.aClass248_52 != null) {
			this.aClass248_52.method5793(0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Lclient!vq;")
	public Class6_Sub5_Sub18 method5026(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub5_Sub18 local11 = (Class6_Sub5_Sub18) this.aClass330_33.method7677((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass248_51.method5797(0, arg0);
		} else {
			local27 = this.aClass248_52.method5797(0, arg0 & 0x7FFF);
		}
		local11 = new Class6_Sub5_Sub18();
		if (local27 != null) {
			local11.method7744(new Class6_Sub12(local27));
		}
		if (arg0 >= 32768) {
			local11.method7743();
		}
		this.aClass330_33.method7676(local11, (long) arg0);
		return local11;
	}
}
