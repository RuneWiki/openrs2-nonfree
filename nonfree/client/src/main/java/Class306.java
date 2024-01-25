import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class306 {

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Lclient!hm;")
	private final Class136 aClass136_89 = new Class136(16);

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_114;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!bs;ILclient!pfa;)V")
	public Class306(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_114 = arg2;
		this.aClass251_114.method5768(30);
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	public void method6627() {
		@Pc(6) Class136 local6 = this.aClass136_89;
		synchronized (this.aClass136_89) {
			this.aClass136_89.method3476();
		}
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
	public void method6628() {
		@Pc(6) Class136 local6 = this.aClass136_89;
		synchronized (this.aClass136_89) {
			this.aClass136_89.method3470();
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public void method6629() {
		@Pc(10) Class136 local10 = this.aClass136_89;
		synchronized (this.aClass136_89) {
			this.aClass136_89.method3474(5);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)Lclient!rv;")
	public Class295 method6630(@OriginalArg(0) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_89;
		@Pc(16) Class295 local16;
		synchronized (this.aClass136_89) {
			local16 = (Class295) this.aClass136_89.method3473((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_114;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_114) {
			local38 = this.aClass251_114.method5772(arg0, 30);
		}
		local16 = new Class295();
		if (local38 != null) {
			local16.method6505(new Class6_Sub21(local38));
		}
		@Pc(65) Class136 local65 = this.aClass136_89;
		synchronized (this.aClass136_89) {
			this.aClass136_89.method3482((long) arg0, local16);
			return local16;
		}
	}
}
