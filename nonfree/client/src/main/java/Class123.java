import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class123 {

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!wq;")
	private final Class391 aClass391_15 = new Class391(64);

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Lclient!la;")
	private final Class208 aClass208_40;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "Lclient!la;")
	private final Class208 aClass208_41;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ILclient!la;Lclient!la;)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_40 = arg1;
		this.aClass208_41 = arg2;
		if (this.aClass208_40 != null) {
			this.aClass208_40.method5005(0);
		}
		if (this.aClass208_41 != null) {
			this.aClass208_41.method5005(0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Lclient!wja;")
	public Class5_Sub5_Sub21 method2213(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub5_Sub21 local11 = (Class5_Sub5_Sub21) this.aClass391_15.method9275((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(36) byte[] local36;
		if (arg0 >= 32768) {
			local36 = this.aClass208_41.method4991(0, arg0 & 0x7FFF, 127);
		} else {
			local36 = this.aClass208_40.method4991(0, arg0, -124);
		}
		local11 = new Class5_Sub5_Sub21();
		if (local36 != null) {
			local11.method9196(new Class5_Sub23(local36));
		}
		if (arg0 >= 32768) {
			local11.method9190();
		}
		this.aClass391_15.method9273((long) arg0, local11, 1);
		return local11;
	}
}
