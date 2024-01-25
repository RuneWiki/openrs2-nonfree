import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class137 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!jr;")
	private final Class169 aClass169_29 = new Class169(16);

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_110;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class137(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_110 = arg2;
		this.aClass157_110.method4561(30);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method4255() {
		@Pc(8) Class169 local8 = this.aClass169_29;
		synchronized (this.aClass169_29) {
			this.aClass169_29.method4997(5);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method4256() {
		@Pc(14) Class169 local14 = this.aClass169_29;
		synchronized (this.aClass169_29) {
			this.aClass169_29.method5009();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Lclient!iea;")
	public Class149 method4257(@OriginalArg(0) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_29;
		@Pc(16) Class149 local16;
		synchronized (this.aClass169_29) {
			local16 = (Class149) this.aClass169_29.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_110;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_110) {
			local38 = this.aClass157_110.method4564(30, arg0);
		}
		local16 = new Class149();
		if (local38 != null) {
			local16.method4458(new Class2_Sub11(local38));
		}
		@Pc(66) Class169 local66 = this.aClass169_29;
		synchronized (this.aClass169_29) {
			this.aClass169_29.method5001(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method4258() {
		@Pc(2) Class169 local2 = this.aClass169_29;
		synchronized (this.aClass169_29) {
			this.aClass169_29.method5006();
		}
	}
}
