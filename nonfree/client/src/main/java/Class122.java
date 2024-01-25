import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class122 {

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "Lclient!si;")
	private final Class338 aClass338_17 = new Class338(64);

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!lb;")
	private final Class221 aClass221_52;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class122(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_52 = arg2;
		this.aClass221_52.method5065(31);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method2900() {
		@Pc(6) Class338 local6 = this.aClass338_17;
		synchronized (this.aClass338_17) {
			this.aClass338_17.method8047();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Lclient!dv;")
	public Class82 method2901(@OriginalArg(0) int arg0) {
		@Pc(13) Class338 local13 = this.aClass338_17;
		@Pc(23) Class82 local23;
		synchronized (this.aClass338_17) {
			local23 = (Class82) this.aClass338_17.method8049((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Class221 local37 = this.aClass221_52;
		@Pc(46) byte[] local46;
		synchronized (this.aClass221_52) {
			local46 = this.aClass221_52.method5089(arg0, 31);
		}
		local23 = new Class82();
		if (local46 != null) {
			local23.method2158(new Class3_Sub28(local46));
		}
		@Pc(70) Class338 local70 = this.aClass338_17;
		synchronized (this.aClass338_17) {
			this.aClass338_17.method8044((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IB)V")
	public void method2902() {
		@Pc(6) Class338 local6 = this.aClass338_17;
		synchronized (this.aClass338_17) {
			this.aClass338_17.method8052(5);
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	public void method2904() {
		@Pc(14) Class338 local14 = this.aClass338_17;
		synchronized (this.aClass338_17) {
			this.aClass338_17.method8051();
		}
	}
}
