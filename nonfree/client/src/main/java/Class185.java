import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class185 {

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "Lclient!hm;")
	private final Class136 aClass136_59 = new Class136(64);

	@OriginalMember(owner = "client!kw", name = "e", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_67;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class185(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_67 = arg2;
		if (this.aClass251_67 != null) {
			this.aClass251_67.method5768(11);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Lclient!tm;")
	public Class320 method4519(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_59;
		@Pc(16) Class320 local16;
		synchronized (this.aClass136_59) {
			local16 = (Class320) this.aClass136_59.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_67;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_67) {
			local38 = this.aClass251_67.method5772(arg0, 11);
		}
		local16 = new Class320();
		if (local38 != null) {
			local16.method7082(new Class6_Sub21(local38));
		}
		@Pc(66) Class136 local66 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)V")
	public void method4521() {
		@Pc(2) Class136 local2 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3474(5);
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	public void method4523() {
		@Pc(2) Class136 local2 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3476();
		}
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	public void method4524() {
		@Pc(12) Class136 local12 = this.aClass136_59;
		synchronized (this.aClass136_59) {
			this.aClass136_59.method3470();
		}
	}
}
