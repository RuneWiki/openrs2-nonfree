import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class317 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "Lclient!qr;")
	private final Class293 aClass293_60 = new Class293(64);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "Lclient!wu;")
	private final Class384 aClass384_116;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!ms;ILclient!wu;)V")
	public Class317(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class384 arg2) {
		this.aClass384_116 = arg2;
		if (this.aClass384_116 != null) {
			this.aClass384_116.method8862(35);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public void method7535() {
		@Pc(2) Class293 local2 = this.aClass293_60;
		synchronized (this.aClass293_60) {
			this.aClass293_60.method6927();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)V")
	public void method7537() {
		@Pc(7) Class293 local7 = this.aClass293_60;
		synchronized (this.aClass293_60) {
			this.aClass293_60.method6922(5);
		}
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	public void method7541() {
		@Pc(7) Class293 local7 = this.aClass293_60;
		synchronized (this.aClass293_60) {
			this.aClass293_60.method6930();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lclient!ls;")
	public Class217 method7543(@OriginalArg(1) int arg0) {
		@Pc(6) Class293 local6 = this.aClass293_60;
		@Pc(16) Class217 local16;
		synchronized (this.aClass293_60) {
			local16 = (Class217) this.aClass293_60.method6921((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class384 local29 = this.aClass384_116;
		@Pc(38) byte[] local38;
		synchronized (this.aClass384_116) {
			local38 = this.aClass384_116.method8885(35, arg0);
		}
		local16 = new Class217();
		if (local38 != null) {
			local16.method5164(new Class5_Sub12(local38));
		}
		local16.method5161();
		@Pc(65) Class293 local65 = this.aClass293_60;
		synchronized (this.aClass293_60) {
			this.aClass293_60.method6925((long) arg0, local16);
			return local16;
		}
	}
}
