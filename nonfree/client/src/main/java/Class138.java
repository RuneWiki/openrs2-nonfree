import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class138 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Lclient!ad;")
	private final Class6 aClass6_21 = new Class6(128);

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!tf;")
	private final Class322 aClass322_78;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class138(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_78 = arg2;
		if (this.aClass322_78 != null) {
			@Pc(20) int local20 = this.aClass322_78.method6825() - 1;
			this.aClass322_78.method6831(local20);
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)Lclient!oaa;")
	public Class233 method3398(@OriginalArg(0) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_21;
		@Pc(16) Class233 local16;
		synchronized (this.aClass6_21) {
			local16 = (Class233) this.aClass6_21.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass322_78.method6802(Static530.method7080(arg0), Static517.method6938(arg0));
		local16 = new Class233();
		if (local45 != null) {
			local16.method5420(new Class3_Sub11(local45));
		}
		@Pc(61) Class6 local61 = this.aClass6_21;
		synchronized (this.aClass6_21) {
			this.aClass6_21.method106((long) arg0, local16);
			return local16;
		}
	}
}
