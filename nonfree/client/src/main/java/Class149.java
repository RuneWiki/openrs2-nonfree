import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class149 {

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Lclient!hm;")
	private final Class136 aClass136_52 = new Class136(64);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_61;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class149(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_61 = arg2;
		this.aClass251_61.method5768(32);
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	public void method3767() {
		@Pc(2) Class136 local2 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3476();
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
	public void method3768() {
		@Pc(2) Class136 local2 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3470();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
	public void method3769() {
		@Pc(6) Class136 local6 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3474(5);
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)Lclient!gr;")
	public Class118 method3770(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_52;
		@Pc(16) Class118 local16;
		synchronized (this.aClass136_52) {
			local16 = (Class118) this.aClass136_52.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_61;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_61) {
			local38 = this.aClass251_61.method5772(arg0, 32);
		}
		local16 = new Class118();
		if (local38 != null) {
			local16.method3171(new Class6_Sub21(local38));
		}
		@Pc(68) Class136 local68 = this.aClass136_52;
		synchronized (this.aClass136_52) {
			this.aClass136_52.method3482((long) arg0, local16);
			return local16;
		}
	}
}
