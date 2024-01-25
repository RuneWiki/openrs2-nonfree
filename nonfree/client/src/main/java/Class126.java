import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class126 {

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "Lclient!hm;")
	private final Class136 aClass136_42 = new Class136(128);

	@OriginalMember(owner = "client!hba", name = "i", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_55;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class126(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_55 = arg2;
		this.aClass251_55.method5768(1);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Lclient!jl;")
	public Class158 method3236(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_42;
		@Pc(16) Class158 local16;
		synchronized (this.aClass136_42) {
			local16 = (Class158) this.aClass136_42.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_55;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_55) {
			local38 = this.aClass251_55.method5772(arg0, 1);
		}
		local16 = new Class158();
		if (local38 != null) {
			local16.method4081(new Class6_Sub21(local38));
		}
		@Pc(66) Class136 local66 = this.aClass136_42;
		synchronized (this.aClass136_42) {
			this.aClass136_42.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	public void method3238() {
		@Pc(2) Class136 local2 = this.aClass136_42;
		synchronized (this.aClass136_42) {
			this.aClass136_42.method3476();
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
	public void method3239() {
		@Pc(2) Class136 local2 = this.aClass136_42;
		synchronized (this.aClass136_42) {
			this.aClass136_42.method3474(5);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	public void method3241() {
		@Pc(2) Class136 local2 = this.aClass136_42;
		synchronized (this.aClass136_42) {
			this.aClass136_42.method3470();
		}
	}
}
