import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class174 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!vh;")
	private final Class330 aClass330_30 = new Class330(64);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!pj;")
	private final Class248 aClass248_40;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public final int anInt4829;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class174(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_40 = arg2;
		this.anInt4829 = this.aClass248_40.method5793(19);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lclient!rba;")
	public Class272 method4091(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_30;
		@Pc(16) Class272 local16;
		synchronized (this.aClass330_30) {
			local16 = (Class272) this.aClass330_30.method7677((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class248 local29 = this.aClass248_40;
		@Pc(38) byte[] local38;
		synchronized (this.aClass248_40) {
			local38 = this.aClass248_40.method5797(19, arg0);
		}
		local16 = new Class272();
		if (local38 != null) {
			local16.method6212(new Class6_Sub12(local38));
		}
		@Pc(60) Class330 local60 = this.aClass330_30;
		synchronized (this.aClass330_30) {
			this.aClass330_30.method7676(local16, (long) arg0);
			return local16;
		}
	}
}
