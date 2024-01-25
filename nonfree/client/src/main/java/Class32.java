import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class32 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!jda;")
	private final Class165 aClass165_6 = new Class165(64);

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!aj;")
	private final Class15 aClass15_13;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	public final int anInt837;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class32(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_13 = arg2;
		this.anInt837 = this.aClass15_13.method512(19);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lclient!mi;")
	public Class220 method939(@OriginalArg(1) int arg0) {
		@Pc(14) Class165 local14 = this.aClass165_6;
		@Pc(24) Class220 local24;
		synchronized (this.aClass165_6) {
			local24 = (Class220) this.aClass165_6.method4389((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class15 local37 = this.aClass15_13;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_13) {
			local46 = this.aClass15_13.method517(arg0, 19);
		}
		local24 = new Class220();
		if (local46 != null) {
			local24.method5410(new Class3_Sub25(local46));
		}
		@Pc(68) Class165 local68 = this.aClass165_6;
		synchronized (this.aClass165_6) {
			this.aClass165_6.method4392(local24, (long) arg0);
			return local24;
		}
	}
}
