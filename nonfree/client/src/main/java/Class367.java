import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class367 {

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "Lclient!jda;")
	private final Class165 aClass165_74 = new Class165(64);

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "Lclient!aj;")
	private final Class15 aClass15_156;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class367(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_156 = arg2;
		if (this.aClass15_156 != null) {
			this.aClass15_156.method512(11);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)Lclient!sl;")
	public Class322 method8812(@OriginalArg(1) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_74;
		@Pc(16) Class322 local16;
		synchronized (this.aClass165_74) {
			local16 = (Class322) this.aClass165_74.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class15 local29 = this.aClass15_156;
		@Pc(38) byte[] local38;
		synchronized (this.aClass15_156) {
			local38 = this.aClass15_156.method517(arg0, 11);
		}
		local16 = new Class322();
		if (local38 != null) {
			local16.method7883(new Class3_Sub25(local38));
		}
		@Pc(60) Class165 local60 = this.aClass165_74;
		synchronized (this.aClass165_74) {
			this.aClass165_74.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
	public void method8813() {
		@Pc(6) Class165 local6 = this.aClass165_74;
		synchronized (this.aClass165_74) {
			this.aClass165_74.method4403();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)V")
	public void method8815() {
		@Pc(6) Class165 local6 = this.aClass165_74;
		synchronized (this.aClass165_74) {
			this.aClass165_74.method4400();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	public void method8817() {
		@Pc(6) Class165 local6 = this.aClass165_74;
		synchronized (this.aClass165_74) {
			this.aClass165_74.method4394(5);
		}
	}
}
