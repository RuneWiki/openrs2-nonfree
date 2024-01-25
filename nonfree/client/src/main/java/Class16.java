import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 {

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!rp;")
	private final Class220 aClass220_1 = new Class220(64);

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!lt;")
	private final Class158 aClass158_5;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class16(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_5 = arg2;
		this.aClass158_5.method3683(5);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)Lclient!v;")
	public Class6_Sub1_Sub17 method279(@OriginalArg(0) int arg0) {
		@Pc(14) Class220 local14 = this.aClass220_1;
		@Pc(24) Class6_Sub1_Sub17 local24;
		synchronized (this.aClass220_1) {
			local24 = (Class6_Sub1_Sub17) this.aClass220_1.method4990((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass158_5.method3672(arg0, 5);
		local24 = new Class6_Sub1_Sub17();
		if (local41 != null) {
			local24.method5624(new Class6_Sub15(local41));
		}
		@Pc(57) Class220 local57 = this.aClass220_1;
		synchronized (this.aClass220_1) {
			this.aClass220_1.method4996(local24, (long) arg0);
			return local24;
		}
	}
}
