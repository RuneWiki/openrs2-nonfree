import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class275 {

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!jda;")
	private final Class165 aClass165_56 = new Class165(256);

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!aj;")
	private final Class15 aClass15_116;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class275(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_116 = arg2;
		this.aClass15_116.method512(26);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
	public void method6768() {
		@Pc(2) Class165 local2 = this.aClass165_56;
		synchronized (this.aClass165_56) {
			this.aClass165_56.method4400();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
	public void method6769() {
		@Pc(2) Class165 local2 = this.aClass165_56;
		synchronized (this.aClass165_56) {
			this.aClass165_56.method4394(5);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public void method6771() {
		@Pc(2) Class165 local2 = this.aClass165_56;
		synchronized (this.aClass165_56) {
			this.aClass165_56.method4403();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lclient!kka;")
	public Class3_Sub11_Sub11 method6772(@OriginalArg(0) int arg0) {
		@Pc(14) Class165 local14 = this.aClass165_56;
		@Pc(24) Class3_Sub11_Sub11 local24;
		synchronized (this.aClass165_56) {
			local24 = (Class3_Sub11_Sub11) this.aClass165_56.method4389((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class15 local37 = this.aClass15_116;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_116) {
			local46 = this.aClass15_116.method517(arg0, 26);
		}
		local24 = new Class3_Sub11_Sub11();
		if (local46 != null) {
			local24.method4811(new Class3_Sub25(local46));
		}
		@Pc(68) Class165 local68 = this.aClass165_56;
		synchronized (this.aClass165_56) {
			this.aClass165_56.method4392(local24, (long) arg0);
			return local24;
		}
	}
}
