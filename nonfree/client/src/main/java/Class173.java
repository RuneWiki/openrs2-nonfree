import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class173 {

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Lclient!jr;")
	private final Class169 aClass169_32 = new Class169(256);

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "Lclient!in;")
	private final Class157 aClass157_137;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class173(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_137 = arg2;
		this.aClass157_137.method4561(26);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method5111() {
		@Pc(14) Class169 local14 = this.aClass169_32;
		synchronized (this.aClass169_32) {
			this.aClass169_32.method5006();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method5112() {
		@Pc(7) Class169 local7 = this.aClass169_32;
		synchronized (this.aClass169_32) {
			this.aClass169_32.method5009();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public void method5114() {
		@Pc(10) Class169 local10 = this.aClass169_32;
		synchronized (this.aClass169_32) {
			this.aClass169_32.method4997(5);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)Lclient!bda;")
	public Class2_Sub6_Sub1 method5117(@OriginalArg(0) int arg0) {
		@Pc(14) Class169 local14 = this.aClass169_32;
		@Pc(24) Class2_Sub6_Sub1 local24;
		synchronized (this.aClass169_32) {
			local24 = (Class2_Sub6_Sub1) this.aClass169_32.method5002((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class157 local37 = this.aClass157_137;
		@Pc(46) byte[] local46;
		synchronized (this.aClass157_137) {
			local46 = this.aClass157_137.method4564(26, arg0);
		}
		local24 = new Class2_Sub6_Sub1();
		if (local46 != null) {
			local24.method825(new Class2_Sub11(local46));
		}
		@Pc(68) Class169 local68 = this.aClass169_32;
		synchronized (this.aClass169_32) {
			this.aClass169_32.method5001(local24, (long) arg0);
			return local24;
		}
	}
}
