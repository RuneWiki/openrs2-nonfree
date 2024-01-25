import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class290 {

	@OriginalMember(owner = "client!rg", name = "o", descriptor = "Lclient!mq;")
	private final Class223 aClass223_57 = new Class223(64);

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "Lclient!jn;")
	public final Class176 aClass176_109;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "Lclient!jn;")
	private final Class176 aClass176_110;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;)V")
	public Class290(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3) {
		this.aClass176_109 = arg3;
		this.aClass176_110 = arg2;
		this.aClass176_110.method3999(3);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public void method6965() {
		@Pc(6) Class223 local6 = this.aClass223_57;
		synchronized (this.aClass223_57) {
			this.aClass223_57.method5399(5);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method6966() {
		@Pc(6) Class223 local6 = this.aClass223_57;
		synchronized (this.aClass223_57) {
			this.aClass223_57.method5400();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public void method6967() {
		@Pc(2) Class223 local2 = this.aClass223_57;
		synchronized (this.aClass223_57) {
			this.aClass223_57.method5398();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Lclient!tr;")
	public Class320 method6970(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_57;
		@Pc(24) Class320 local24;
		synchronized (this.aClass223_57) {
			local24 = (Class320) this.aClass223_57.method5388((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class176 local37 = this.aClass176_110;
		@Pc(46) byte[] local46;
		synchronized (this.aClass176_110) {
			local46 = this.aClass176_110.method3994(arg0, 3);
		}
		local24 = new Class320();
		local24.aClass290_5 = this;
		if (local46 != null) {
			local24.method7520(new Class4_Sub11(local46));
		}
		@Pc(71) Class223 local71 = this.aClass223_57;
		synchronized (this.aClass223_57) {
			this.aClass223_57.method5394(local24, (long) arg0);
			return local24;
		}
	}
}
