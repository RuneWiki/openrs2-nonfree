import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class290 {

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Lclient!pa;")
	private final Class265 aClass265_53 = new Class265(256);

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Lclient!cb;")
	private final Class50 aClass50_140;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!iv;ILclient!cb;)V")
	public Class290(@OriginalArg(0) Class174 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class50 arg2) {
		this.aClass50_140 = arg2;
		this.aClass50_140.method913(26);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)Lclient!wc;")
	public Class5_Sub2_Sub21 method7064(@OriginalArg(0) int arg0) {
		@Pc(6) Class265 local6 = this.aClass265_53;
		@Pc(16) Class5_Sub2_Sub21 local16;
		synchronized (this.aClass265_53) {
			local16 = (Class5_Sub2_Sub21) this.aClass265_53.method6577((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class50 local29 = this.aClass50_140;
		@Pc(38) byte[] local38;
		synchronized (this.aClass50_140) {
			local38 = this.aClass50_140.method916(arg0, 26);
		}
		local16 = new Class5_Sub2_Sub21();
		if (local38 != null) {
			local16.method8545(new Class5_Sub15(local38));
		}
		@Pc(60) Class265 local60 = this.aClass265_53;
		synchronized (this.aClass265_53) {
			this.aClass265_53.method6566(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IB)V")
	public void method7067() {
		@Pc(6) Class265 local6 = this.aClass265_53;
		synchronized (this.aClass265_53) {
			this.aClass265_53.method6570(5);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public void method7070() {
		@Pc(6) Class265 local6 = this.aClass265_53;
		synchronized (this.aClass265_53) {
			this.aClass265_53.method6568();
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	public void method7071() {
		@Pc(12) Class265 local12 = this.aClass265_53;
		synchronized (this.aClass265_53) {
			this.aClass265_53.method6573();
		}
	}
}
