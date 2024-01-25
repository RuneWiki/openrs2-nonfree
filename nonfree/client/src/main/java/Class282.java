import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class282 {

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "Lclient!fc;")
	private final Class94 aClass94_44 = new Class94(64);

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "Lclient!ni;")
	private final Class223 aClass223_110;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;)V")
	public Class282(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2) {
		this.aClass223_110 = arg2;
		this.aClass223_110.method5970(31);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	public void method7024() {
		@Pc(2) Class94 local2 = this.aClass94_44;
		synchronized (this.aClass94_44) {
			this.aClass94_44.method2952();
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lclient!ww;")
	public Class382 method7027(@OriginalArg(1) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_44;
		@Pc(16) Class382 local16;
		synchronized (this.aClass94_44) {
			local16 = (Class382) this.aClass94_44.method2960((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class223 local35 = this.aClass223_110;
		@Pc(44) byte[] local44;
		synchronized (this.aClass223_110) {
			local44 = this.aClass223_110.method5954(arg0, 31);
		}
		local16 = new Class382();
		if (local44 != null) {
			local16.method8788(new Class6_Sub8(local44));
		}
		@Pc(66) Class94 local66 = this.aClass94_44;
		synchronized (this.aClass94_44) {
			this.aClass94_44.method2963((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
	public void method7030() {
		@Pc(2) Class94 local2 = this.aClass94_44;
		synchronized (this.aClass94_44) {
			this.aClass94_44.method2964();
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
	public void method7031() {
		@Pc(2) Class94 local2 = this.aClass94_44;
		synchronized (this.aClass94_44) {
			this.aClass94_44.method2958(5);
		}
	}
}
