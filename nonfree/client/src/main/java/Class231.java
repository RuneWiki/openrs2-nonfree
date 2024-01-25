import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class231 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "Lclient!jda;")
	private final Class165 aClass165_42 = new Class165(128);

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_102;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class231(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_102 = arg2;
		if (this.aClass15_102 != null) {
			@Pc(20) int local20 = this.aClass15_102.method516() - 1;
			this.aClass15_102.method512(local20);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)Lclient!tc;")
	public Class330 method5518(@OriginalArg(1) int arg0) {
		@Pc(14) Class165 local14 = this.aClass165_42;
		@Pc(24) Class330 local24;
		synchronized (this.aClass165_42) {
			local24 = (Class330) this.aClass165_42.method4389((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(45) byte[] local45 = this.aClass15_102.method517(Static523.method7311(arg0), Static56.method1213(arg0));
		local24 = new Class330();
		if (local45 != null) {
			local24.method8021(new Class3_Sub25(local45));
		}
		@Pc(61) Class165 local61 = this.aClass165_42;
		synchronized (this.aClass165_42) {
			this.aClass165_42.method4392(local24, (long) arg0);
			return local24;
		}
	}
}
