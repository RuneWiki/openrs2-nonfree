import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class11 {

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "Lclient!bh;")
	private final Class32 aClass32_1 = new Class32(64);

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!wu;")
	private final Class380 aClass380_5;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!wj;ILclient!wu;)V")
	public Class11(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class380 arg2) {
		this.aClass380_5 = arg2;
		this.aClass380_5.method8631(5);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Lclient!bca;")
	public Class2_Sub2_Sub3 method189(@OriginalArg(0) int arg0) {
		@Pc(6) Class32 local6 = this.aClass32_1;
		@Pc(16) Class2_Sub2_Sub3 local16;
		synchronized (this.aClass32_1) {
			local16 = (Class2_Sub2_Sub3) this.aClass32_1.method630((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class380 local29 = this.aClass380_5;
		@Pc(38) byte[] local38;
		synchronized (this.aClass380_5) {
			local38 = this.aClass380_5.method8620(5, arg0);
		}
		local16 = new Class2_Sub2_Sub3();
		if (local38 != null) {
			local16.method586(new Class2_Sub22(local38));
		}
		@Pc(68) Class32 local68 = this.aClass32_1;
		synchronized (this.aClass32_1) {
			this.aClass32_1.method629(local16, (long) arg0);
			return local16;
		}
	}
}
