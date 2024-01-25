import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class130 {

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!mq;")
	private final Class223 aClass223_19 = new Class223(64);

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_49;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "I")
	public final int anInt3612;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class130(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_49 = arg2;
		this.anInt3612 = this.aClass176_49.method3999(19);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)Lclient!af;")
	public Class10 method3225(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_19;
		@Pc(16) Class10 local16;
		synchronized (this.aClass223_19) {
			local16 = (Class10) this.aClass223_19.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(35) Class176 local35 = this.aClass176_49;
		@Pc(44) byte[] local44;
		synchronized (this.aClass176_49) {
			local44 = this.aClass176_49.method3994(arg0, 19);
		}
		local16 = new Class10();
		if (local44 != null) {
			local16.method174(new Class4_Sub11(local44));
		}
		@Pc(66) Class223 local66 = this.aClass223_19;
		synchronized (this.aClass223_19) {
			this.aClass223_19.method5394(local16, (long) arg0);
			return local16;
		}
	}
}
