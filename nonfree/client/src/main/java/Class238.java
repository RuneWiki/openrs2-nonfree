import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mga")
public final class Class238 {

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "Lclient!si;")
	private final Class338 aClass338_37 = new Class338(64);

	@OriginalMember(owner = "client!mga", name = "j", descriptor = "Lclient!lb;")
	private final Class221 aClass221_112;

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "Lclient!kw;")
	public final Class218 aClass218_1;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!kw;)V")
	public Class238(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class218 arg3) {
		this.aClass221_112 = arg2;
		this.aClass221_112.method5065(32);
		this.aClass218_1 = arg3;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V")
	public void method5900() {
		@Pc(2) Class338 local2 = this.aClass338_37;
		synchronized (this.aClass338_37) {
			this.aClass338_37.method8047();
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)V")
	public void method5901() {
		@Pc(6) Class338 local6 = this.aClass338_37;
		synchronized (this.aClass338_37) {
			this.aClass338_37.method8052(5);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IB)Lclient!oo;")
	public Class274 method5902(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_37;
		@Pc(16) Class274 local16;
		synchronized (this.aClass338_37) {
			local16 = (Class274) this.aClass338_37.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_112;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_112) {
			local39 = this.aClass221_112.method5089(arg0, 32);
		}
		local16 = new Class274();
		local16.aClass238_2 = this;
		if (local39 != null) {
			local16.method6905(new Class3_Sub28(local39));
		}
		@Pc(66) Class338 local66 = this.aClass338_37;
		synchronized (this.aClass338_37) {
			this.aClass338_37.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V")
	public void method5903() {
		@Pc(6) Class338 local6 = this.aClass338_37;
		synchronized (this.aClass338_37) {
			this.aClass338_37.method8051();
		}
	}
}
