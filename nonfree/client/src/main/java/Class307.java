import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class307 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!jr;")
	public final Class169 aClass169_54 = new Class169(20);

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!jr;")
	private final Class169 aClass169_55 = new Class169(64);

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!in;")
	public final Class157 aClass157_249;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!in;")
	private final Class157 aClass157_248;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;Lclient!in;)V")
	public Class307(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3) {
		this.aClass157_249 = arg3;
		this.aClass157_248 = arg2;
		this.aClass157_248.method4561(46);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public void method7790() {
		@Pc(6) Class169 local6 = this.aClass169_55;
		synchronized (this.aClass169_55) {
			this.aClass169_55.method5006();
		}
		local6 = this.aClass169_54;
		synchronized (this.aClass169_54) {
			this.aClass169_54.method5006();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Lclient!ia;")
	public Class143 method7793(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_55;
		@Pc(18) Class143 local18;
		synchronized (this.aClass169_55) {
			local18 = (Class143) this.aClass169_55.method5002((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class157 local31 = this.aClass157_248;
		@Pc(40) byte[] local40;
		synchronized (this.aClass157_248) {
			local40 = this.aClass157_248.method4564(46, arg0);
		}
		local18 = new Class143();
		local18.aClass307_1 = this;
		if (local40 != null) {
			local18.method4367(new Class2_Sub11(local40));
		}
		@Pc(67) Class169 local67 = this.aClass169_55;
		synchronized (this.aClass169_55) {
			this.aClass169_55.method5001(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public void method7794() {
		@Pc(2) Class169 local2 = this.aClass169_55;
		synchronized (this.aClass169_55) {
			this.aClass169_55.method5009();
		}
		local2 = this.aClass169_54;
		synchronized (this.aClass169_54) {
			this.aClass169_54.method5009();
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	public void method7795() {
		@Pc(6) Class169 local6 = this.aClass169_55;
		synchronized (this.aClass169_55) {
			this.aClass169_55.method4997(5);
		}
		local6 = this.aClass169_54;
		synchronized (this.aClass169_54) {
			this.aClass169_54.method4997(5);
		}
	}
}
