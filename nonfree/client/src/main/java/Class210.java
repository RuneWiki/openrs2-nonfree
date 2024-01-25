import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class210 {

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!qr;")
	private final Class293 aClass293_40 = new Class293(128);

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "Lclient!wu;")
	private final Class384 aClass384_81;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class210(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_81 = arg2;
		this.aClass384_81.method8862(1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	public void method4989() {
		@Pc(6) Class293 local6 = this.aClass293_40;
		synchronized (this.aClass293_40) {
			this.aClass293_40.method6930();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
	public void method4992() {
		@Pc(10) Class293 local10 = this.aClass293_40;
		synchronized (this.aClass293_40) {
			this.aClass293_40.method6922(5);
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
	public void method4994() {
		@Pc(6) Class293 local6 = this.aClass293_40;
		synchronized (this.aClass293_40) {
			this.aClass293_40.method6927();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)Lclient!ib;")
	public Class149 method4995(@OriginalArg(0) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_40;
		@Pc(21) Class149 local21;
		synchronized (this.aClass293_40) {
			local21 = (Class149) this.aClass293_40.method6921((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class384 local34 = this.aClass384_81;
		@Pc(43) byte[] local43;
		synchronized (this.aClass384_81) {
			local43 = this.aClass384_81.method8885(1, arg0);
		}
		local21 = new Class149();
		if (local43 != null) {
			local21.method3514(new Class5_Sub12(local43));
		}
		@Pc(65) Class293 local65 = this.aClass293_40;
		synchronized (this.aClass293_40) {
			this.aClass293_40.method6925((long) arg0, local21);
			return local21;
		}
	}
}
