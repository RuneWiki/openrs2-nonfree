import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class155 {

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!jo;")
	private final Class126 aClass126_35 = new Class126(64);

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public int anInt4243 = 0;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "Lclient!ok;")
	private final Class178 aClass178_73;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public final int anInt4241;

	static {
		new Class55("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!kr;ILclient!ok;)V")
	public Class155(@OriginalArg(0) Class137 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2) {
		this.aClass178_73 = arg2;
		this.anInt4241 = this.aClass178_73.method3833(4);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method3345() {
		@Pc(6) Class126 local6 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method2821();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
	public void method3346() {
		@Pc(6) Class126 local6 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method2828(5);
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public void method3347() {
		@Pc(6) Class126 local6 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method2827();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Lclient!ut;")
	public Class251 method3348(@OriginalArg(1) int arg0) {
		@Pc(6) Class126 local6 = this.aClass126_35;
		@Pc(18) Class251 local18;
		synchronized (this.aClass126_35) {
			local18 = (Class251) this.aClass126_35.method2822((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class178 local31 = this.aClass178_73;
		@Pc(40) byte[] local40;
		synchronized (this.aClass178_73) {
			local40 = this.aClass178_73.method3838(arg0, 4);
		}
		local18 = new Class251();
		local18.aClass155_6 = this;
		local18.anInt6597 = arg0;
		if (local40 != null) {
			local18.method5218(new Class7_Sub14(local40));
		}
		local18.method5219();
		@Pc(71) Class126 local71 = this.aClass126_35;
		synchronized (this.aClass126_35) {
			this.aClass126_35.method2824((long) arg0, local18);
			return local18;
		}
	}
}
