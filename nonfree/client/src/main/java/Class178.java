import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class178 {

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "Lclient!mq;")
	private final Class223 aClass223_33 = new Class223(64);

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_66;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class178(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_66 = arg2;
		this.aClass176_66.method3999(32);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	public void method4034() {
		@Pc(6) Class223 local6 = this.aClass223_33;
		synchronized (this.aClass223_33) {
			this.aClass223_33.method5398();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Lclient!tl;")
	public Class316 method4035(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_33;
		@Pc(16) Class316 local16;
		synchronized (this.aClass223_33) {
			local16 = (Class316) this.aClass223_33.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class176 local35 = this.aClass176_66;
		@Pc(44) byte[] local44;
		synchronized (this.aClass176_66) {
			local44 = this.aClass176_66.method3994(arg0, 32);
		}
		local16 = new Class316();
		if (local44 != null) {
			local16.method7463(new Class4_Sub11(local44));
		}
		@Pc(66) Class223 local66 = this.aClass223_33;
		synchronized (this.aClass223_33) {
			this.aClass223_33.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
	public void method4036() {
		@Pc(6) Class223 local6 = this.aClass223_33;
		synchronized (this.aClass223_33) {
			this.aClass223_33.method5400();
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB)V")
	public void method4037() {
		@Pc(6) Class223 local6 = this.aClass223_33;
		synchronized (this.aClass223_33) {
			this.aClass223_33.method5399(5);
		}
	}
}
