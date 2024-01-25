import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class253 {

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "Lclient!jda;")
	private final Class165 aClass165_48 = new Class165(64);

	@OriginalMember(owner = "client!oha", name = "j", descriptor = "Lclient!jda;")
	public final Class165 aClass165_49 = new Class165(2);

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "Lclient!aj;")
	private final Class15 aClass15_110;

	@OriginalMember(owner = "client!oha", name = "g", descriptor = "Lclient!aj;")
	public final Class15 aClass15_111;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class253(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_110 = arg2;
		this.aClass15_111 = arg3;
		this.aClass15_110.method512(33);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)V")
	public void method6176() {
		@Pc(6) Class165 local6 = this.aClass165_48;
		synchronized (this.aClass165_48) {
			this.aClass165_48.method4394(5);
		}
		local6 = this.aClass165_49;
		synchronized (this.aClass165_49) {
			this.aClass165_49.method4394(5);
		}
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	public void method6178() {
		@Pc(6) Class165 local6 = this.aClass165_48;
		synchronized (this.aClass165_48) {
			this.aClass165_48.method4400();
		}
		local6 = this.aClass165_49;
		synchronized (this.aClass165_49) {
			this.aClass165_49.method4400();
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)Lclient!qm;")
	public Class290 method6180(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_48;
		@Pc(16) Class290 local16;
		synchronized (this.aClass165_48) {
			local16 = (Class290) this.aClass165_48.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_110;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_110) {
			local38 = this.aClass15_110.method517(arg0, 33);
		}
		local16 = new Class290();
		local16.aClass253_1 = this;
		if (local38 != null) {
			local16.method7121(new Class3_Sub25(local38));
		}
		@Pc(63) Class165 local63 = this.aClass165_48;
		synchronized (this.aClass165_48) {
			this.aClass165_48.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(B)V")
	public void method6181() {
		@Pc(6) Class165 local6 = this.aClass165_48;
		synchronized (this.aClass165_48) {
			this.aClass165_48.method4403();
		}
		local6 = this.aClass165_49;
		synchronized (this.aClass165_49) {
			this.aClass165_49.method4403();
		}
	}
}
