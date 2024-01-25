import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class32 {

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "Lclient!ad;")
	private final Class6 aClass6_3 = new Class6(64);

	@OriginalMember(owner = "client!bfa", name = "i", descriptor = "Lclient!tf;")
	private final Class322 aClass322_15;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
	public final int anInt756;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!qh;ILclient!tf;)V")
	public Class32(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class322 arg2) {
		this.aClass322_15 = arg2;
		this.anInt756 = this.aClass322_15.method6831(19);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)Lclient!a;")
	public Class1 method655(@OriginalArg(0) int arg0) {
		@Pc(14) Class6 local14 = this.aClass6_3;
		@Pc(24) Class1 local24;
		synchronized (this.aClass6_3) {
			local24 = (Class1) this.aClass6_3.method92((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class322 local37 = this.aClass322_15;
		@Pc(46) byte[] local46;
		synchronized (this.aClass322_15) {
			local46 = this.aClass322_15.method6802(19, arg0);
		}
		local24 = new Class1();
		if (local46 != null) {
			local24.method2(new Class3_Sub11(local46));
		}
		@Pc(68) Class6 local68 = this.aClass6_3;
		synchronized (this.aClass6_3) {
			this.aClass6_3.method106((long) arg0, local24);
			return local24;
		}
	}
}
