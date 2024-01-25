import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class196 {

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_61 = new Class136(64);

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_69;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class196(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_69 = arg2;
		this.aClass251_69.method5768(31);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	public void method4680() {
		@Pc(6) Class136 local6 = this.aClass136_61;
		synchronized (this.aClass136_61) {
			this.aClass136_61.method3474(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IB)Lclient!so;")
	public Class309 method4681(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_61;
		@Pc(16) Class309 local16;
		synchronized (this.aClass136_61) {
			local16 = (Class309) this.aClass136_61.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_69;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_69) {
			local38 = this.aClass251_69.method5772(arg0, 31);
		}
		local16 = new Class309();
		if (local38 != null) {
			local16.method6670(new Class6_Sub21(local38));
		}
		@Pc(68) Class136 local68 = this.aClass136_61;
		synchronized (this.aClass136_61) {
			this.aClass136_61.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method4682() {
		@Pc(7) Class136 local7 = this.aClass136_61;
		synchronized (this.aClass136_61) {
			this.aClass136_61.method3470();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public void method4684() {
		@Pc(6) Class136 local6 = this.aClass136_61;
		synchronized (this.aClass136_61) {
			this.aClass136_61.method3476();
		}
	}
}
