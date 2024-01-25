import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class213 {

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public int anInt6225;

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "Lclient!mq;")
	private final Class223 aClass223_41 = new Class223(64);

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "Lclient!mq;")
	public final Class223 aClass223_42 = new Class223(60);

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!jn;")
	private final Class176 aClass176_82;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!jn;")
	public final Class176 aClass176_83;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;)V")
	public Class213(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3) {
		this.aClass176_82 = arg2;
		this.aClass176_83 = arg3;
		@Pc(26) int local26 = this.aClass176_82.method3973() - 1;
		this.aClass176_82.method3999(local26);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V")
	public void method5289() {
		@Pc(6) Class223 local6 = this.aClass223_41;
		synchronized (this.aClass223_41) {
			this.aClass223_41.method5399(5);
		}
		local6 = this.aClass223_42;
		synchronized (this.aClass223_42) {
			this.aClass223_42.method5399(5);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public void method5290() {
		@Pc(2) Class223 local2 = this.aClass223_41;
		synchronized (this.aClass223_41) {
			this.aClass223_41.method5400();
		}
		local2 = this.aClass223_42;
		synchronized (this.aClass223_42) {
			this.aClass223_42.method5400();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Lclient!lca;")
	public Class200 method5291(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_41;
		@Pc(16) Class200 local16;
		synchronized (this.aClass223_41) {
			local16 = (Class200) this.aClass223_41.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class176 local35 = this.aClass176_82;
		@Pc(48) byte[] local48;
		synchronized (this.aClass176_82) {
			local48 = this.aClass176_82.method3994(Static293.method5080(arg0), Static343.method5578(arg0));
		}
		local16 = new Class200();
		local16.anInt5922 = arg0;
		local16.aClass213_1 = this;
		if (local48 != null) {
			local16.method5066(new Class4_Sub11(local48));
		}
		@Pc(76) Class223 local76 = this.aClass223_41;
		synchronized (this.aClass223_41) {
			this.aClass223_41.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	public void method5294(@OriginalArg(1) int arg0) {
		this.anInt6225 = arg0;
		@Pc(15) Class223 local15 = this.aClass223_42;
		synchronized (this.aClass223_42) {
			this.aClass223_42.method5398();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public void method5295() {
		@Pc(6) Class223 local6 = this.aClass223_41;
		synchronized (this.aClass223_41) {
			this.aClass223_41.method5398();
		}
		local6 = this.aClass223_42;
		synchronized (this.aClass223_42) {
			this.aClass223_42.method5398();
		}
	}
}
