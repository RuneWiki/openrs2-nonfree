import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class189 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!mq;")
	private final Class223 aClass223_37 = new Class223(64);

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public int anInt5265 = 0;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!jn;")
	private final Class176 aClass176_73;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
	public final int anInt5263;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class189(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_73 = arg2;
		this.anInt5263 = this.aClass176_73.method3999(4);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)V")
	public void method4518() {
		@Pc(2) Class223 local2 = this.aClass223_37;
		synchronized (this.aClass223_37) {
			this.aClass223_37.method5399(5);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public void method4519() {
		@Pc(2) Class223 local2 = this.aClass223_37;
		synchronized (this.aClass223_37) {
			this.aClass223_37.method5400();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Lclient!qm;")
	public Class274 method4520(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_37;
		@Pc(16) Class274 local16;
		synchronized (this.aClass223_37) {
			local16 = (Class274) this.aClass223_37.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_73;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_73) {
			local38 = this.aClass176_73.method3994(arg0, 4);
		}
		local16 = new Class274();
		local16.anInt8103 = arg0;
		local16.aClass189_7 = this;
		if (local38 != null) {
			local16.method6746(new Class4_Sub11(local38));
		}
		local16.method6744();
		@Pc(69) Class223 local69 = this.aClass223_37;
		synchronized (this.aClass223_37) {
			this.aClass223_37.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public void method4522() {
		@Pc(6) Class223 local6 = this.aClass223_37;
		synchronized (this.aClass223_37) {
			this.aClass223_37.method5398();
		}
	}
}
