import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class144 {

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "Lclient!mq;")
	private final Class223 aClass223_27 = new Class223(64);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!jn;")
	private final Class176 aClass176_58;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;)V")
	public Class144(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2) {
		this.aClass176_58 = arg2;
		if (this.aClass176_58 != null) {
			this.aClass176_58.method3999(35);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public void method3374() {
		@Pc(6) Class223 local6 = this.aClass223_27;
		synchronized (this.aClass223_27) {
			this.aClass223_27.method5398();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lclient!gr;")
	public Class125 method3378(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_27;
		@Pc(16) Class125 local16;
		synchronized (this.aClass223_27) {
			local16 = (Class125) this.aClass223_27.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_58;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_58) {
			local38 = this.aClass176_58.method3994(arg0, 35);
		}
		local16 = new Class125();
		if (local38 != null) {
			local16.method3151(new Class4_Sub11(local38));
		}
		local16.method3150();
		@Pc(65) Class223 local65 = this.aClass223_27;
		synchronized (this.aClass223_27) {
			this.aClass223_27.method5394(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BI)V")
	public void method3379() {
		@Pc(2) Class223 local2 = this.aClass223_27;
		synchronized (this.aClass223_27) {
			this.aClass223_27.method5399(5);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
	public void method3382() {
		@Pc(15) Class223 local15 = this.aClass223_27;
		synchronized (this.aClass223_27) {
			this.aClass223_27.method5400();
		}
	}
}
