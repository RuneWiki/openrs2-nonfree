import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class260 {

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!jr;")
	private final Class169 aClass169_45 = new Class169(64);

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!jr;")
	public final Class169 aClass169_46 = new Class169(2);

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!in;")
	private final Class157 aClass157_218;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!in;")
	public final Class157 aClass157_217;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class260(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_218 = arg2;
		this.aClass157_217 = arg3;
		this.aClass157_218.method4561(33);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public void method6820() {
		@Pc(2) Class169 local2 = this.aClass169_45;
		synchronized (this.aClass169_45) {
			this.aClass169_45.method5006();
		}
		local2 = this.aClass169_46;
		synchronized (this.aClass169_46) {
			this.aClass169_46.method5006();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public void method6822() {
		@Pc(6) Class169 local6 = this.aClass169_45;
		synchronized (this.aClass169_45) {
			this.aClass169_45.method4997(5);
		}
		local6 = this.aClass169_46;
		synchronized (this.aClass169_46) {
			this.aClass169_46.method4997(5);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lclient!sda;")
	public Class310 method6824(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_45;
		@Pc(18) Class310 local18;
		synchronized (this.aClass169_45) {
			local18 = (Class310) this.aClass169_45.method5002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(37) Class157 local37 = this.aClass157_218;
		@Pc(46) byte[] local46;
		synchronized (this.aClass157_218) {
			local46 = this.aClass157_218.method4564(33, arg0);
		}
		local18 = new Class310();
		local18.aClass260_25 = this;
		if (local46 != null) {
			local18.method7821(new Class2_Sub11(local46));
		}
		@Pc(71) Class169 local71 = this.aClass169_45;
		synchronized (this.aClass169_45) {
			this.aClass169_45.method5001(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public void method6827() {
		@Pc(6) Class169 local6 = this.aClass169_45;
		synchronized (this.aClass169_45) {
			this.aClass169_45.method5009();
		}
		local6 = this.aClass169_46;
		synchronized (this.aClass169_46) {
			this.aClass169_46.method5009();
		}
	}
}
