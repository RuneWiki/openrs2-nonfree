import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3 {

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "Lclient!hm;")
	private Class136 aClass136_1 = new Class136(64);

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Lclient!hm;")
	public Class136 aClass136_2 = new Class136(64);

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_2;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_3;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;)V")
	public Class3(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_2 = arg2;
		this.aClass251_3 = arg3;
		this.aClass251_2.method5768(34);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public void method58() {
		@Pc(14) Class136 local14 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3470();
		}
		local14 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3470();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IB)Lclient!km;")
	public Class179 method60(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_1;
		@Pc(16) Class179 local16;
		synchronized (this.aClass136_1) {
			local16 = (Class179) this.aClass136_1.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_2;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_2) {
			local38 = this.aClass251_2.method5772(arg0, 34);
		}
		local16 = new Class179();
		local16.aClass3_3 = this;
		if (local38 != null) {
			local16.method4417(new Class6_Sub21(local38));
		}
		@Pc(71) Class136 local71 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V")
	public void method62(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass136_1 = new Class136(arg1);
		this.aClass136_2 = new Class136(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)V")
	public void method63() {
		@Pc(6) Class136 local6 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3476();
		}
		local6 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3476();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)V")
	public void method64() {
		@Pc(2) Class136 local2 = this.aClass136_1;
		synchronized (this.aClass136_1) {
			this.aClass136_1.method3474(5);
		}
		local2 = this.aClass136_2;
		synchronized (this.aClass136_2) {
			this.aClass136_2.method3474(5);
		}
	}
}
