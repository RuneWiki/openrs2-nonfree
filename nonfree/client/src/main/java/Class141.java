import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class141 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!mq;")
	private final Class223 aClass223_24 = new Class223(64);

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_54;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	public final int anInt3743;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class141(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_54 = arg2;
		if (this.aClass176_54 == null) {
			this.anInt3743 = 0;
		} else {
			this.anInt3743 = this.aClass176_54.method3999(16);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public void method3339() {
		@Pc(2) Class223 local2 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method5398();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public void method3341() {
		@Pc(6) Class223 local6 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method5399(5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public void method3344() {
		@Pc(6) Class223 local6 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method5400();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lclient!iba;")
	public Class150 method3346(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_24;
		@Pc(16) Class150 local16;
		synchronized (this.aClass223_24) {
			local16 = (Class150) this.aClass223_24.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_54;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_54) {
			local38 = this.aClass176_54.method3994(arg0, 16);
		}
		local16 = new Class150();
		if (local38 != null) {
			local16.method3463(new Class4_Sub11(local38));
		}
		@Pc(60) Class223 local60 = this.aClass223_24;
		synchronized (this.aClass223_24) {
			this.aClass223_24.method5394(local16, (long) arg0);
			return local16;
		}
	}
}
