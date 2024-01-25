import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class132 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!fc;")
	private final Class94 aClass94_18 = new Class94(16);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!ni;")
	private final Class223 aClass223_51;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class132(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_51 = arg2;
		this.aClass223_51.method5970(30);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method3805() {
		@Pc(2) Class94 local2 = this.aClass94_18;
		synchronized (this.aClass94_18) {
			this.aClass94_18.method2952();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)V")
	public void method3806() {
		@Pc(2) Class94 local2 = this.aClass94_18;
		synchronized (this.aClass94_18) {
			this.aClass94_18.method2958(5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IB)Lclient!ql;")
	public Class280 method3810(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_18;
		@Pc(16) Class280 local16;
		synchronized (this.aClass94_18) {
			local16 = (Class280) this.aClass94_18.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class223 local35 = this.aClass223_51;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_51) {
			local44 = this.aClass223_51.method5954(arg0, 30);
		}
		local16 = new Class280();
		if (local44 != null) {
			local16.method6993(new Class6_Sub8(local44));
		}
		@Pc(66) Class94 local66 = this.aClass94_18;
		synchronized (this.aClass94_18) {
			this.aClass94_18.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	public void method3811() {
		@Pc(10) Class94 local10 = this.aClass94_18;
		synchronized (this.aClass94_18) {
			this.aClass94_18.method2964();
		}
	}
}
