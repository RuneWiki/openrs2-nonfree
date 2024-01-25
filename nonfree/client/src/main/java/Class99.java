import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class99 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!hm;")
	private final Class136 aClass136_35 = new Class136(256);

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_39;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class99(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_39 = arg2;
		this.aClass251_39.method5768(26);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Lclient!th;")
	public Class6_Sub2_Sub18 method2779(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_35;
		@Pc(22) Class6_Sub2_Sub18 local22;
		synchronized (this.aClass136_35) {
			local22 = (Class6_Sub2_Sub18) this.aClass136_35.method3473((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class251 local35 = this.aClass251_39;
		@Pc(44) byte[] local44;
		synchronized (this.aClass251_39) {
			local44 = this.aClass251_39.method5772(arg0, 26);
		}
		local22 = new Class6_Sub2_Sub18();
		if (local44 != null) {
			local22.method7063(new Class6_Sub21(local44));
		}
		@Pc(68) Class136 local68 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3482((long) arg0, local22);
			return local22;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	public void method2780() {
		@Pc(6) Class136 local6 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3470();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	public void method2782() {
		@Pc(6) Class136 local6 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3474(5);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	public void method2783() {
		@Pc(13) Class136 local13 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3476();
		}
	}
}
