import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class87 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!mq;")
	private final Class223 aClass223_15 = new Class223(128);

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!jn;")
	private final Class176 aClass176_37;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class87(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_37 = arg2;
		if (this.aClass176_37 != null) {
			@Pc(20) int local20 = this.aClass176_37.method3973() - 1;
			this.aClass176_37.method3999(local20);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Lclient!bt;")
	public Class40 method2467(@OriginalArg(1) int arg0) {
		@Pc(11) Class223 local11 = this.aClass223_15;
		@Pc(21) Class40 local21;
		synchronized (this.aClass223_15) {
			local21 = (Class40) this.aClass223_15.method5388((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass176_37.method3994(Static458.method6987(arg0), Static182.method3242(arg0));
		local21 = new Class40();
		if (local42 != null) {
			local21.method677(new Class4_Sub11(local42));
		}
		@Pc(60) Class223 local60 = this.aClass223_15;
		synchronized (this.aClass223_15) {
			this.aClass223_15.method5394(local21, (long) arg0);
			return local21;
		}
	}
}
