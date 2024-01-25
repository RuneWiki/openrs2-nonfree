import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class110 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!jda;")
	private Class165 aClass165_22 = new Class165(64);

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!aj;")
	private final Class15 aClass15_53;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class110(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_53 = arg2;
		if (this.aClass15_53 != null) {
			@Pc(20) int local20 = this.aClass15_53.method516() - 1;
			this.aClass15_53.method512(local20);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)V")
	public void method3158() {
		@Pc(6) Class165 local6 = this.aClass165_22;
		synchronized (this.aClass165_22) {
			this.aClass165_22.method4394(5);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public void method3159() {
		@Pc(2) Class165 local2 = this.aClass165_22;
		synchronized (this.aClass165_22) {
			this.aClass165_22.method4400();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)Lclient!cca;")
	public Class51 method3160(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_22;
		@Pc(16) Class51 local16;
		synchronized (this.aClass165_22) {
			local16 = (Class51) this.aClass165_22.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_53;
		@Pc(42) byte[] local42;
		synchronized (this.aClass15_53) {
			local42 = this.aClass15_53.method517(Static589.method8288(arg0), Static17.method511(arg0));
		}
		local16 = new Class51();
		if (local42 != null) {
			local16.method1306(new Class3_Sub25(local42));
		}
		@Pc(71) Class165 local71 = this.aClass165_22;
		synchronized (this.aClass165_22) {
			this.aClass165_22.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	public void method3161(@OriginalArg(0) int arg0) {
		@Pc(10) Class165 local10 = this.aClass165_22;
		synchronized (this.aClass165_22) {
			this.aClass165_22.method4403();
			this.aClass165_22 = new Class165(arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method3164() {
		@Pc(7) Class165 local7 = this.aClass165_22;
		synchronized (this.aClass165_22) {
			this.aClass165_22.method4403();
		}
	}
}
