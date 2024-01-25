import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class151 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "Lclient!qr;")
	private final Class293 aClass293_27 = new Class293(64);

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!wu;")
	private final Class384 aClass384_55;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class151(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_55 = arg2;
		this.aClass384_55.method8862(32);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
	public void method3575() {
		@Pc(2) Class293 local2 = this.aClass293_27;
		synchronized (this.aClass293_27) {
			this.aClass293_27.method6930();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public void method3577() {
		@Pc(6) Class293 local6 = this.aClass293_27;
		synchronized (this.aClass293_27) {
			this.aClass293_27.method6922(5);
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Lclient!qu;")
	public Class295 method3578(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_27;
		@Pc(18) Class295 local18;
		synchronized (this.aClass293_27) {
			local18 = (Class295) this.aClass293_27.method6921((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class384 local31 = this.aClass384_55;
		@Pc(46) byte[] local46;
		synchronized (this.aClass384_55) {
			local46 = this.aClass384_55.method8885(32, arg0);
		}
		local18 = new Class295();
		if (local46 != null) {
			local18.method6940(new Class5_Sub12(local46));
		}
		@Pc(68) Class293 local68 = this.aClass293_27;
		synchronized (this.aClass293_27) {
			this.aClass293_27.method6925((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public void method3579() {
		@Pc(6) Class293 local6 = this.aClass293_27;
		synchronized (this.aClass293_27) {
			this.aClass293_27.method6927();
		}
	}
}
