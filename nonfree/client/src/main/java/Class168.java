import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class168 {

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "Lclient!si;")
	private final Class338 aClass338_23 = new Class338(64);

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_81;

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
	public final int anInt4867;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class168(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_81 = arg2;
		this.anInt4867 = this.aClass221_81.method5065(19);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)Lclient!o;")
	public Class265 method4111(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_23;
		@Pc(16) Class265 local16;
		synchronized (this.aClass338_23) {
			local16 = (Class265) this.aClass338_23.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_81;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_81) {
			local39 = this.aClass221_81.method5089(arg0, 19);
		}
		local16 = new Class265();
		if (local39 != null) {
			local16.method6435(new Class3_Sub28(local39));
		}
		@Pc(63) Class338 local63 = this.aClass338_23;
		synchronized (this.aClass338_23) {
			this.aClass338_23.method8044((long) arg0, local16);
			return local16;
		}
	}
}
