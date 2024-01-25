import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class301 {

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!si;")
	private final Class338 aClass338_43 = new Class338(64);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Lclient!lb;")
	private final Class221 aClass221_132;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class301(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_132 = arg2;
		this.aClass221_132.method5065(5);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lclient!gca;")
	public Class3_Sub4_Sub8 method7377(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_43;
		@Pc(16) Class3_Sub4_Sub8 local16;
		synchronized (this.aClass338_43) {
			local16 = (Class3_Sub4_Sub8) this.aClass338_43.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_132;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_132) {
			local39 = this.aClass221_132.method5089(arg0, 5);
		}
		local16 = new Class3_Sub4_Sub8();
		if (local39 != null) {
			local16.method3003(new Class3_Sub28(local39));
		}
		@Pc(71) Class338 local71 = this.aClass338_43;
		synchronized (this.aClass338_43) {
			this.aClass338_43.method8044((long) arg0, local16);
			return local16;
		}
	}
}
