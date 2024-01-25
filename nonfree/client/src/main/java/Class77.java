import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class77 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "Lclient!rl;")
	private final Class317 aClass317_11 = new Class317(64);

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!rg;")
	private final Class310 aClass310_25;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_24;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(ILclient!rg;Lclient!rg;)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class310 arg2) {
		this.aClass310_25 = arg2;
		this.aClass310_24 = arg1;
		if (this.aClass310_24 != null) {
			this.aClass310_24.method7773(0);
		}
		if (this.aClass310_25 != null) {
			this.aClass310_25.method7773(0);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)Lclient!uc;")
	public Class14_Sub2_Sub19 method1768(@OriginalArg(0) int arg0) {
		@Pc(11) Class14_Sub2_Sub19 local11 = (Class14_Sub2_Sub19) this.aClass317_11.method7882((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aClass310_24.method7803(arg0, 0);
		} else {
			local28 = this.aClass310_25.method7803(arg0 & 0x7FFF, 0);
		}
		local11 = new Class14_Sub2_Sub19();
		if (local28 != null) {
			local11.method8533(new Class14_Sub21(local28));
		}
		if (arg0 >= 32768) {
			local11.method8537();
		}
		this.aClass317_11.method7875((long) arg0, local11);
		return local11;
	}
}
