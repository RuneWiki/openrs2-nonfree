import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class151 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!rp;")
	private final Class220 aClass220_31 = new Class220(64);

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Lclient!lt;")
	private final Class158 aClass158_54;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Lclient!lt;")
	private final Class158 aClass158_53;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILclient!lt;Lclient!lt;)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_54 = arg2;
		this.aClass158_53 = arg1;
		if (this.aClass158_53 != null) {
			this.aClass158_53.method3683(0);
		}
		if (this.aClass158_54 != null) {
			this.aClass158_54.method3683(0);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)Lclient!bk;")
	public Class6_Sub1_Sub3 method3417(@OriginalArg(0) int arg0) {
		@Pc(11) Class6_Sub1_Sub3 local11 = (Class6_Sub1_Sub3) this.aClass220_31.method4990((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass158_54.method3672(arg0 & 0x7FFF, 0);
		} else {
			local27 = this.aClass158_53.method3672(arg0, 0);
		}
		local11 = new Class6_Sub1_Sub3();
		if (local27 != null) {
			local11.method421(new Class6_Sub15(local27));
		}
		if (arg0 >= 32768) {
			local11.method426();
		}
		this.aClass220_31.method4996(local11, (long) arg0);
		return local11;
	}
}
