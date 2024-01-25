import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class278 {

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "Lclient!jr;")
	private final Class169 aClass169_49 = new Class169(64);

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Lclient!in;")
	private final Class157 aClass157_230;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class278(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_230 = arg2;
		if (this.aClass157_230 != null) {
			this.aClass157_230.method4561(35);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method7119() {
		@Pc(2) Class169 local2 = this.aClass169_49;
		synchronized (this.aClass169_49) {
			this.aClass169_49.method5009();
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lclient!cq;")
	public Class64 method7123(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_49;
		@Pc(16) Class64 local16;
		synchronized (this.aClass169_49) {
			local16 = (Class64) this.aClass169_49.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_230;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_230) {
			local38 = this.aClass157_230.method4564(35, arg0);
		}
		local16 = new Class64();
		if (local38 != null) {
			local16.method2330(new Class2_Sub11(local38));
		}
		local16.method2327();
		@Pc(69) Class169 local69 = this.aClass169_49;
		synchronized (this.aClass169_49) {
			this.aClass169_49.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)V")
	public void method7124() {
		@Pc(2) Class169 local2 = this.aClass169_49;
		synchronized (this.aClass169_49) {
			this.aClass169_49.method4997(5);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method7125() {
		@Pc(2) Class169 local2 = this.aClass169_49;
		synchronized (this.aClass169_49) {
			this.aClass169_49.method5006();
		}
	}
}
