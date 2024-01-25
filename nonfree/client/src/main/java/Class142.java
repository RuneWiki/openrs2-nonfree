import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class142 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!mq;")
	private Class223 aClass223_25 = new Class223(128);

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!mq;")
	public Class223 aClass223_26 = new Class223(64);

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!jn;")
	private final Class176 aClass176_56;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!jn;")
	public final Class176 aClass176_57;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;)V")
	public Class142(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3) {
		this.aClass176_56 = arg2;
		this.aClass176_57 = arg3;
		this.aClass176_56.method3999(36);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V")
	public void method3365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass223_25 = new Class223(arg0);
		this.aClass223_26 = new Class223(arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lclient!vc;")
	public Class338 method3366(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_25;
		@Pc(16) Class338 local16;
		synchronized (this.aClass223_25) {
			local16 = (Class338) this.aClass223_25.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_56;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_56) {
			local38 = this.aClass176_56.method3994(arg0, 36);
		}
		local16 = new Class338();
		local16.aClass142_4 = this;
		local16.anInt9766 = arg0;
		if (local38 != null) {
			local16.method7977(new Class4_Sub11(local38));
		}
		local16.method7972();
		@Pc(77) Class223 local77 = this.aClass223_25;
		synchronized (this.aClass223_25) {
			this.aClass223_25.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V")
	public void method3367() {
		@Pc(6) Class223 local6 = this.aClass223_25;
		synchronized (this.aClass223_25) {
			this.aClass223_25.method5399(5);
		}
		local6 = this.aClass223_26;
		synchronized (this.aClass223_26) {
			this.aClass223_26.method5399(5);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public void method3368() {
		@Pc(2) Class223 local2 = this.aClass223_25;
		synchronized (this.aClass223_25) {
			this.aClass223_25.method5398();
		}
		local2 = this.aClass223_26;
		synchronized (this.aClass223_26) {
			this.aClass223_26.method5398();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public void method3369() {
		@Pc(2) Class223 local2 = this.aClass223_25;
		synchronized (this.aClass223_25) {
			this.aClass223_25.method5400();
		}
		local2 = this.aClass223_26;
		synchronized (this.aClass223_26) {
			this.aClass223_26.method5400();
		}
	}
}
