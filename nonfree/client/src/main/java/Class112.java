import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class112 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "Lclient!hm;")
	private final Class136 aClass136_37 = new Class136(64);

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!hm;")
	public final Class136 aClass136_38 = new Class136(2);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_51;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!pfa;")
	public final Class251 aClass251_52;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;Lclient!pfa;)V")
	public Class112(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2, @OriginalArg(3) Class251 arg3) {
		this.aClass251_51 = arg2;
		this.aClass251_52 = arg3;
		this.aClass251_51.method5768(33);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2955() {
		@Pc(2) Class136 local2 = this.aClass136_37;
		synchronized (this.aClass136_37) {
			this.aClass136_37.method3470();
		}
		local2 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3470();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Lclient!uk;")
	public Class336 method2956(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_37;
		@Pc(16) Class336 local16;
		synchronized (this.aClass136_37) {
			local16 = (Class336) this.aClass136_37.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_51;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_51) {
			local38 = this.aClass251_51.method5772(arg0, 33);
		}
		local16 = new Class336();
		local16.aClass112_1 = this;
		if (local38 != null) {
			local16.method7316(new Class6_Sub21(local38));
		}
		@Pc(69) Class136 local69 = this.aClass136_37;
		synchronized (this.aClass136_37) {
			this.aClass136_37.method3482((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
	public void method2958() {
		@Pc(2) Class136 local2 = this.aClass136_37;
		synchronized (this.aClass136_37) {
			this.aClass136_37.method3476();
		}
		local2 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3476();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public void method2959() {
		@Pc(2) Class136 local2 = this.aClass136_37;
		synchronized (this.aClass136_37) {
			this.aClass136_37.method3474(5);
		}
		local2 = this.aClass136_38;
		synchronized (this.aClass136_38) {
			this.aClass136_38.method3474(5);
		}
	}
}
