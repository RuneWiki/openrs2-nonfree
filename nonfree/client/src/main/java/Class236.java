import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class236 {

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!nfa", name = "m", descriptor = "Lclient!jda;")
	private final Class165 aClass165_43 = new Class165(64);

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "Lclient!jda;")
	public final Class165 aClass165_44 = new Class165(60);

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lclient!aj;")
	public final Class15 aClass15_104;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lclient!aj;")
	private final Class15 aClass15_105;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!aj;)V")
	public Class236(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class15 arg3) {
		this.aClass15_104 = arg3;
		this.aClass15_105 = arg2;
		@Pc(26) int local26 = this.aClass15_105.method516() - 1;
		this.aClass15_105.method512(local26);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5609() {
		@Pc(6) Class165 local6 = this.aClass165_43;
		synchronized (this.aClass165_43) {
			this.aClass165_43.method4400();
		}
		local6 = this.aClass165_44;
		synchronized (this.aClass165_44) {
			this.aClass165_44.method4400();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)V")
	public void method5610(@OriginalArg(0) int arg0) {
		this.anInt6251 = arg0;
		@Pc(9) Class165 local9 = this.aClass165_44;
		synchronized (this.aClass165_44) {
			this.aClass165_44.method4403();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
	public void method5611() {
		@Pc(10) Class165 local10 = this.aClass165_43;
		synchronized (this.aClass165_43) {
			this.aClass165_43.method4403();
		}
		local10 = this.aClass165_44;
		synchronized (this.aClass165_44) {
			this.aClass165_44.method4403();
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BI)V")
	public void method5614() {
		@Pc(2) Class165 local2 = this.aClass165_43;
		synchronized (this.aClass165_43) {
			this.aClass165_43.method4394(5);
		}
		local2 = this.aClass165_44;
		synchronized (this.aClass165_44) {
			this.aClass165_44.method4394(5);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(BI)Lclient!ht;")
	public Class144 method5615(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_43;
		@Pc(16) Class144 local16;
		synchronized (this.aClass165_43) {
			local16 = (Class144) this.aClass165_43.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_105;
		@Pc(42) byte[] local42;
		synchronized (this.aClass15_105) {
			local42 = this.aClass15_105.method517(Static51.method1158(arg0), Static411.method5860(arg0));
		}
		local16 = new Class144();
		local16.aClass236_1 = this;
		local16.anInt4326 = arg0;
		if (local42 != null) {
			local16.method3926(new Class3_Sub25(local42));
		}
		@Pc(75) Class165 local75 = this.aClass165_43;
		synchronized (this.aClass165_43) {
			this.aClass165_43.method4392(local16, (long) arg0);
			return local16;
		}
	}
}
