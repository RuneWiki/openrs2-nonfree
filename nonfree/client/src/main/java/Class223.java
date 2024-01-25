import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class223 {

	@OriginalMember(owner = "client!mba", name = "k", descriptor = "Lclient!qj;")
	private final Class295 aClass295_36 = new Class295(64);

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "Lclient!uq;")
	private final Class362 aClass362_74;

	@OriginalMember(owner = "client!mba", name = "n", descriptor = "Lclient!pf;")
	public final Class279 aClass279_2;

	static {
		new Class343("", 73);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!kw;ILclient!uq;Lclient!pf;)V")
	public Class223(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Class279 arg3) {
		this.aClass362_74 = arg2;
		this.aClass362_74.method8355(32);
		this.aClass279_2 = arg3;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IB)Lclient!pu;")
	public Class286 method5169(@OriginalArg(0) int arg0) {
		@Pc(6) Class295 local6 = this.aClass295_36;
		@Pc(16) Class286 local16;
		synchronized (this.aClass295_36) {
			local16 = (Class286) this.aClass295_36.method6470((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class362 local29 = this.aClass362_74;
		@Pc(40) byte[] local40;
		synchronized (this.aClass362_74) {
			local40 = this.aClass362_74.method8368(32, arg0);
		}
		local16 = new Class286();
		local16.aClass223_26 = this;
		if (local40 != null) {
			local16.method6300(new Class3_Sub4(local40));
		}
		@Pc(65) Class295 local65 = this.aClass295_36;
		synchronized (this.aClass295_36) {
			this.aClass295_36.method6469((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public void method5171() {
		@Pc(6) Class295 local6 = this.aClass295_36;
		synchronized (this.aClass295_36) {
			this.aClass295_36.method6464();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BI)V")
	public void method5174() {
		@Pc(6) Class295 local6 = this.aClass295_36;
		synchronized (this.aClass295_36) {
			this.aClass295_36.method6462(5);
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
	public void method5175() {
		@Pc(2) Class295 local2 = this.aClass295_36;
		synchronized (this.aClass295_36) {
			this.aClass295_36.method6474();
		}
	}
}
