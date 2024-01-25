import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wla")
public final class Class405 {

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "Lclient!si;")
	private Class338 aClass338_63 = new Class338(64);

	@OriginalMember(owner = "client!wla", name = "e", descriptor = "Lclient!si;")
	public Class338 aClass338_64 = new Class338(64);

	@OriginalMember(owner = "client!wla", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_161;

	@OriginalMember(owner = "client!wla", name = "m", descriptor = "Lclient!lb;")
	public final Class221 aClass221_162;

	@OriginalMember(owner = "client!wla", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class405(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_161 = arg2;
		this.aClass221_162 = arg3;
		this.aClass221_161.method5065(34);
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(IZ)V")
	public void method9354() {
		@Pc(6) Class338 local6 = this.aClass338_63;
		synchronized (this.aClass338_63) {
			this.aClass338_63.method8052(5);
		}
		local6 = this.aClass338_64;
		synchronized (this.aClass338_64) {
			this.aClass338_64.method8052(5);
		}
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(I)V")
	public void method9355() {
		@Pc(6) Class338 local6 = this.aClass338_63;
		synchronized (this.aClass338_63) {
			this.aClass338_63.method8047();
		}
		local6 = this.aClass338_64;
		synchronized (this.aClass338_64) {
			this.aClass338_64.method8047();
		}
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(II)Lclient!wl;")
	public Class404 method9356(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_63;
		@Pc(16) Class404 local16;
		synchronized (this.aClass338_63) {
			local16 = (Class404) this.aClass338_63.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_161;
		@Pc(39) byte[] local39;
		synchronized (this.aClass221_161) {
			local39 = this.aClass221_161.method5089(arg0, 34);
		}
		local16 = new Class404();
		local16.aClass405_4 = this;
		if (local39 != null) {
			local16.method9347(new Class3_Sub28(local39));
		}
		@Pc(66) Class338 local66 = this.aClass338_63;
		synchronized (this.aClass338_63) {
			this.aClass338_63.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(BII)V")
	public void method9357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass338_63 = new Class338(arg0);
		this.aClass338_64 = new Class338(arg1);
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(B)V")
	public void method9358() {
		@Pc(2) Class338 local2 = this.aClass338_63;
		synchronized (this.aClass338_63) {
			this.aClass338_63.method8051();
		}
		local2 = this.aClass338_64;
		synchronized (this.aClass338_64) {
			this.aClass338_64.method8051();
		}
	}
}
