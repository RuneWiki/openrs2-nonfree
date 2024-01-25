import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class94 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!vh;")
	private final Class330 aClass330_18 = new Class330(128);

	@OriginalMember(owner = "client!er", name = "m", descriptor = "Lclient!pj;")
	private final Class248 aClass248_21;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!dd;ILclient!pj;)V")
	public Class94(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class248 arg2) {
		this.aClass248_21 = arg2;
		if (this.aClass248_21 != null) {
			@Pc(20) int local20 = this.aClass248_21.method5774() - 1;
			this.aClass248_21.method5793(local20);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)Lclient!dj;")
	public Class75 method2175(@OriginalArg(1) int arg0) {
		@Pc(6) Class330 local6 = this.aClass330_18;
		@Pc(21) Class75 local21;
		synchronized (this.aClass330_18) {
			local21 = (Class75) this.aClass330_18.method7677((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(44) byte[] local44 = this.aClass248_21.method5797(Static201.method3334(arg0), Static102.method1459(arg0));
		local21 = new Class75();
		if (local44 != null) {
			local21.method1454(new Class6_Sub12(local44));
		}
		@Pc(60) Class330 local60 = this.aClass330_18;
		synchronized (this.aClass330_18) {
			this.aClass330_18.method7676(local21, (long) arg0);
			return local21;
		}
	}
}
