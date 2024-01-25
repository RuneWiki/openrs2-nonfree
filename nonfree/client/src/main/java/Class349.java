import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class349 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!jr;")
	private final Class169 aClass169_68 = new Class169(64);

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "Lclient!in;")
	private final Class157 aClass157_289;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!sj;ILclient!in;)V")
	public Class349(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2) {
		this.aClass157_289 = arg2;
		this.aClass157_289.method4561(5);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Lclient!pv;")
	public Class2_Sub6_Sub18 method8645(@OriginalArg(1) int arg0) {
		@Pc(6) Class169 local6 = this.aClass169_68;
		@Pc(16) Class2_Sub6_Sub18 local16;
		synchronized (this.aClass169_68) {
			local16 = (Class2_Sub6_Sub18) this.aClass169_68.method5002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class157 local29 = this.aClass157_289;
		@Pc(38) byte[] local38;
		synchronized (this.aClass157_289) {
			local38 = this.aClass157_289.method4564(5, arg0);
		}
		local16 = new Class2_Sub6_Sub18();
		if (local38 != null) {
			local16.method6975(new Class2_Sub11(local38));
		}
		@Pc(64) Class169 local64 = this.aClass169_68;
		synchronized (this.aClass169_68) {
			this.aClass169_68.method5001(local16, (long) arg0);
			return local16;
		}
	}
}
