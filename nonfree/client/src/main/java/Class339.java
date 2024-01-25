import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class339 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!pja;")
	private final Class279 aClass279_53 = new Class279(64);

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!gj;")
	private final Class143 aClass143_130;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!im;ILclient!gj;)V")
	public Class339(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		this.aClass143_130 = arg2;
		this.aClass143_130.method3123(5);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)Lclient!dv;")
	public Class3_Sub6_Sub8 method7795(@OriginalArg(1) int arg0) {
		@Pc(14) Class279 local14 = this.aClass279_53;
		@Pc(24) Class3_Sub6_Sub8 local24;
		synchronized (this.aClass279_53) {
			local24 = (Class3_Sub6_Sub8) this.aClass279_53.method6631((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class143 local37 = this.aClass143_130;
		@Pc(46) byte[] local46;
		synchronized (this.aClass143_130) {
			local46 = this.aClass143_130.method3125(arg0, 5);
		}
		local24 = new Class3_Sub6_Sub8();
		if (local46 != null) {
			local24.method2176(new Class3_Sub17(local46));
		}
		@Pc(68) Class279 local68 = this.aClass279_53;
		synchronized (this.aClass279_53) {
			this.aClass279_53.method6635(local24, (long) arg0);
			return local24;
		}
	}
}
