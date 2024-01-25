import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class340 {

	@OriginalMember(owner = "client!uga", name = "i", descriptor = "Lclient!jr;")
	private final Class169 aClass169_63 = new Class169(64);

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_283;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class340(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_283 = arg2;
		this.aClass157_283.method4561(32);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)Lclient!sg;")
	public Class311 method8512(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_63;
		@Pc(16) Class311 local16;
		synchronized (this.aClass169_63) {
			local16 = (Class311) this.aClass169_63.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_283;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_283) {
			local38 = this.aClass157_283.method4564(32, arg0);
		}
		local16 = new Class311();
		if (local38 != null) {
			local16.method7837(new Class2_Sub11(local38));
		}
		@Pc(60) Class169 local60 = this.aClass169_63;
		synchronized (this.aClass169_63) {
			this.aClass169_63.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BI)V")
	public void method8513() {
		@Pc(2) Class169 local2 = this.aClass169_63;
		synchronized (this.aClass169_63) {
			this.aClass169_63.method4997(5);
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
	public void method8514() {
		@Pc(6) Class169 local6 = this.aClass169_63;
		synchronized (this.aClass169_63) {
			this.aClass169_63.method5009();
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
	public void method8515() {
		@Pc(2) Class169 local2 = this.aClass169_63;
		synchronized (this.aClass169_63) {
			this.aClass169_63.method5006();
		}
	}
}
