import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!mq;")
	private Class223 aClass223_1 = new Class223(64);

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_4;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_4 = arg2;
		if (this.aClass176_4 != null) {
			@Pc(20) int local20 = this.aClass176_4.method3973() - 1;
			this.aClass176_4.method3999(local20);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public void method61() {
		@Pc(6) Class223 local6 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5398();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public void method64() {
		@Pc(6) Class223 local6 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5399(5);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	public void method65(@OriginalArg(1) int arg0) {
		@Pc(2) Class223 local2 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5398();
			this.aClass223_1 = new Class223(arg0);
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)Lclient!aga;")
	public Class13 method67(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_1;
		@Pc(16) Class13 local16;
		synchronized (this.aClass223_1) {
			local16 = (Class13) this.aClass223_1.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_4;
		@Pc(42) byte[] local42;
		synchronized (this.aClass176_4) {
			local42 = this.aClass176_4.method3994(Static21.method260(arg0), Static145.method2791(arg0));
		}
		local16 = new Class13();
		if (local42 != null) {
			local16.method186(new Class4_Sub11(local42));
		}
		@Pc(71) Class223 local71 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method68() {
		@Pc(6) Class223 local6 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5400();
		}
	}
}
