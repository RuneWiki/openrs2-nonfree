import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class271 {

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!fc;")
	private final Class94 aClass94_41 = new Class94(64);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_103;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class271(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_103 = arg2;
		this.aClass223_103.method5970(32);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
	public void method6869() {
		@Pc(6) Class94 local6 = this.aClass94_41;
		synchronized (this.aClass94_41) {
			this.aClass94_41.method2958(5);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)Lclient!sc;")
	public Class303 method6871(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_41;
		@Pc(16) Class303 local16;
		synchronized (this.aClass94_41) {
			local16 = (Class303) this.aClass94_41.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class223 local29 = this.aClass223_103;
		@Pc(38) byte[] local38;
		synchronized (this.aClass223_103) {
			local38 = this.aClass223_103.method5954(arg0, 32);
		}
		local16 = new Class303();
		if (local38 != null) {
			local16.method7362(new Class6_Sub8(local38));
		}
		@Pc(60) Class94 local60 = this.aClass94_41;
		synchronized (this.aClass94_41) {
			this.aClass94_41.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public void method6872() {
		@Pc(2) Class94 local2 = this.aClass94_41;
		synchronized (this.aClass94_41) {
			this.aClass94_41.method2952();
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public void method6874() {
		@Pc(2) Class94 local2 = this.aClass94_41;
		synchronized (this.aClass94_41) {
			this.aClass94_41.method2964();
		}
	}
}
