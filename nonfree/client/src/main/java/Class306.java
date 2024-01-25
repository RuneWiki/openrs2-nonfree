import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class306 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!jda;")
	private final Class165 aClass165_59 = new Class165(128);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!aj;")
	private final Class15 aClass15_134;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class306(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_134 = arg2;
		this.aClass15_134.method512(1);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Lclient!pja;")
	public Class271 method7676(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_59;
		@Pc(16) Class271 local16;
		synchronized (this.aClass165_59) {
			local16 = (Class271) this.aClass165_59.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_134;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_134) {
			local38 = this.aClass15_134.method517(arg0, 1);
		}
		local16 = new Class271();
		if (local38 != null) {
			local16.method6715(new Class3_Sub25(local38));
		}
		@Pc(60) Class165 local60 = this.aClass165_59;
		synchronized (this.aClass165_59) {
			this.aClass165_59.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)V")
	public void method7678() {
		@Pc(6) Class165 local6 = this.aClass165_59;
		synchronized (this.aClass165_59) {
			this.aClass165_59.method4394(5);
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	public void method7679() {
		@Pc(6) Class165 local6 = this.aClass165_59;
		synchronized (this.aClass165_59) {
			this.aClass165_59.method4400();
		}
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
	public void method7680() {
		@Pc(6) Class165 local6 = this.aClass165_59;
		synchronized (this.aClass165_59) {
			this.aClass165_59.method4403();
		}
	}
}
