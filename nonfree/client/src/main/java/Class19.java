import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class19 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!fc;")
	private final Class94 aClass94_2 = new Class94(64);

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "Lclient!fc;")
	public final Class94 aClass94_3 = new Class94(2);

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Lclient!ni;")
	private final Class223 aClass223_6;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "Lclient!ni;")
	public final Class223 aClass223_7;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class19(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_6 = arg2;
		this.aClass223_7 = arg3;
		this.aClass223_6.method5970(33);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public void method642() {
		@Pc(2) Class94 local2 = this.aClass94_2;
		synchronized (this.aClass94_2) {
			this.aClass94_2.method2964();
		}
		local2 = this.aClass94_3;
		synchronized (this.aClass94_3) {
			this.aClass94_3.method2964();
		}
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	public void method643() {
		@Pc(6) Class94 local6 = this.aClass94_2;
		synchronized (this.aClass94_2) {
			this.aClass94_2.method2952();
		}
		local6 = this.aClass94_3;
		synchronized (this.aClass94_3) {
			this.aClass94_3.method2952();
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)Lclient!op;")
	public Class247 method644(@OriginalArg(0) int arg0) {
		@Pc(12) Class94 local12 = this.aClass94_2;
		@Pc(22) Class247 local22;
		synchronized (this.aClass94_2) {
			local22 = (Class247) this.aClass94_2.method2960((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class223 local35 = this.aClass223_6;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_6) {
			local44 = this.aClass223_6.method5954(arg0, 33);
		}
		local22 = new Class247();
		local22.aClass19_2 = this;
		if (local44 != null) {
			local22.method6455(new Class6_Sub8(local44));
		}
		@Pc(69) Class94 local69 = this.aClass94_2;
		synchronized (this.aClass94_2) {
			this.aClass94_2.method2963((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
	public void method645() {
		@Pc(2) Class94 local2 = this.aClass94_2;
		synchronized (this.aClass94_2) {
			this.aClass94_2.method2958(5);
		}
		local2 = this.aClass94_3;
		synchronized (this.aClass94_3) {
			this.aClass94_3.method2958(5);
		}
	}
}
