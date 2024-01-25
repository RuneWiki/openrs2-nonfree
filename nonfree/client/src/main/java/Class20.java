import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class20 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Lclient!qr;")
	private final Class293 aClass293_6 = new Class293(16);

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Lclient!wu;")
	private final Class384 aClass384_13;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class20(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_13 = arg2;
		this.aClass384_13.method8862(30);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
	public void method488() {
		@Pc(2) Class293 local2 = this.aClass293_6;
		synchronized (this.aClass293_6) {
			this.aClass293_6.method6922(5);
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)Lclient!lca;")
	public Class202 method490(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_6;
		@Pc(18) Class202 local18;
		synchronized (this.aClass293_6) {
			local18 = (Class202) this.aClass293_6.method6921((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class384 local31 = this.aClass384_13;
		@Pc(40) byte[] local40;
		synchronized (this.aClass384_13) {
			local40 = this.aClass384_13.method8885(30, arg0);
		}
		local18 = new Class202();
		if (local40 != null) {
			local18.method4949(new Class5_Sub12(local40));
		}
		@Pc(69) Class293 local69 = this.aClass293_6;
		synchronized (this.aClass293_6) {
			this.aClass293_6.method6925((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
	public void method491() {
		@Pc(2) Class293 local2 = this.aClass293_6;
		synchronized (this.aClass293_6) {
			this.aClass293_6.method6927();
		}
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
	public void method492() {
		@Pc(6) Class293 local6 = this.aClass293_6;
		synchronized (this.aClass293_6) {
			this.aClass293_6.method6930();
		}
	}
}
