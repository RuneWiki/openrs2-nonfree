import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class223 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!h;")
	private final Class125 aClass125_49 = new Class125(64);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!an;")
	private final Class16 aClass16_85;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!hu;ILclient!an;)V")
	public Class223(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_85 = arg2;
		this.aClass16_85.method399(5);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lclient!fu;")
	public Class12_Sub4_Sub8 method5415(@OriginalArg(0) int arg0) {
		@Pc(6) Class125 local6 = this.aClass125_49;
		@Pc(22) Class12_Sub4_Sub8 local22;
		synchronized (this.aClass125_49) {
			local22 = (Class12_Sub4_Sub8) this.aClass125_49.method3446((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class16 local35 = this.aClass16_85;
		@Pc(44) byte[] local44;
		synchronized (this.aClass16_85) {
			local44 = this.aClass16_85.method408(5, arg0);
		}
		local22 = new Class12_Sub4_Sub8();
		if (local44 != null) {
			local22.method2905(new Class12_Sub8(local44));
		}
		@Pc(66) Class125 local66 = this.aClass125_49;
		synchronized (this.aClass125_49) {
			this.aClass125_49.method3437(local22, (long) arg0);
			return local22;
		}
	}
}
