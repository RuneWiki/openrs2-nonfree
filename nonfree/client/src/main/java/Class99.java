import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fga")
public final class Class99 {

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "Lclient!fc;")
	private final Class94 aClass94_17 = new Class94(64);

	@OriginalMember(owner = "client!fga", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_44;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Lclient!ni;")
	public final Class223 aClass223_43;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!rga;ILclient!ni;Lclient!ni;)V")
	public Class99(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class223 arg2, @OriginalArg(3) Class223 arg3) {
		this.aClass223_44 = arg2;
		this.aClass223_43 = arg3;
		this.aClass223_44.method5970(3);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)Lclient!ke;")
	public Class166 method3059(@OriginalArg(0) int arg0) {
		@Pc(6) Class94 local6 = this.aClass94_17;
		@Pc(18) Class166 local18;
		synchronized (this.aClass94_17) {
			local18 = (Class166) this.aClass94_17.method2960((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class223 local31 = this.aClass223_44;
		@Pc(40) byte[] local40;
		synchronized (this.aClass223_44) {
			local40 = this.aClass223_44.method5954(arg0, 3);
		}
		local18 = new Class166();
		local18.aClass99_2 = this;
		if (local40 != null) {
			local18.method5011(new Class6_Sub8(local40));
		}
		@Pc(65) Class94 local65 = this.aClass94_17;
		synchronized (this.aClass94_17) {
			this.aClass94_17.method2963((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(BI)V")
	public void method3060() {
		@Pc(10) Class94 local10 = this.aClass94_17;
		synchronized (this.aClass94_17) {
			this.aClass94_17.method2958(5);
		}
	}

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "(I)V")
	public void method3061() {
		@Pc(2) Class94 local2 = this.aClass94_17;
		synchronized (this.aClass94_17) {
			this.aClass94_17.method2964();
		}
	}

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "(I)V")
	public void method3062() {
		@Pc(2) Class94 local2 = this.aClass94_17;
		synchronized (this.aClass94_17) {
			this.aClass94_17.method2952();
		}
	}
}
