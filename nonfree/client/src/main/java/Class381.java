import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class381 {

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Lclient!qr;")
	private final Class293 aClass293_76 = new Class293(64);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "Lclient!wu;")
	private final Class384 aClass384_138;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public final int anInt10359;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class381(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_138 = arg2;
		if (this.aClass384_138 == null) {
			this.anInt10359 = 0;
		} else {
			this.anInt10359 = this.aClass384_138.method8862(16);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public void method8800() {
		@Pc(2) Class293 local2 = this.aClass293_76;
		synchronized (this.aClass293_76) {
			this.aClass293_76.method6927();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)V")
	public void method8801() {
		@Pc(14) Class293 local14 = this.aClass293_76;
		synchronized (this.aClass293_76) {
			this.aClass293_76.method6922(5);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB)Lclient!kt;")
	public Class198 method8802(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_76;
		@Pc(16) Class198 local16;
		synchronized (this.aClass293_76) {
			local16 = (Class198) this.aClass293_76.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_138;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_138) {
			local38 = this.aClass384_138.method8885(16, arg0);
		}
		local16 = new Class198();
		if (local38 != null) {
			local16.method4405(new Class5_Sub12(local38));
		}
		@Pc(60) Class293 local60 = this.aClass293_76;
		synchronized (this.aClass293_76) {
			this.aClass293_76.method6925((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public void method8804() {
		@Pc(2) Class293 local2 = this.aClass293_76;
		synchronized (this.aClass293_76) {
			this.aClass293_76.method6930();
		}
	}
}
