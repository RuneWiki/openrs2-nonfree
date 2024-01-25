import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class237 {

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "Lclient!mq;")
	private Class223 aClass223_45 = new Class223(64);

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Lclient!mq;")
	public Class223 aClass223_46 = new Class223(64);

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "Lclient!jn;")
	public final Class176 aClass176_92;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "Lclient!jn;")
	private final Class176 aClass176_91;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!er;ILclient!jn;Lclient!jn;)V")
	public Class237(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) Class176 arg3) {
		this.aClass176_92 = arg3;
		this.aClass176_91 = arg2;
		this.aClass176_91.method3999(34);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V")
	public void method5789() {
		@Pc(2) Class223 local2 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method5399(5);
		}
		local2 = this.aClass223_46;
		synchronized (this.aClass223_46) {
			this.aClass223_46.method5399(5);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)V")
	public void method5790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass223_45 = new Class223(arg1);
		this.aClass223_46 = new Class223(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public void method5791() {
		@Pc(6) Class223 local6 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method5400();
		}
		local6 = this.aClass223_46;
		synchronized (this.aClass223_46) {
			this.aClass223_46.method5400();
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public void method5793() {
		@Pc(2) Class223 local2 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method5398();
		}
		local2 = this.aClass223_46;
		synchronized (this.aClass223_46) {
			this.aClass223_46.method5398();
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)Lclient!rn;")
	public Class293 method5794(@OriginalArg(1) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_45;
		@Pc(16) Class293 local16;
		synchronized (this.aClass223_45) {
			local16 = (Class293) this.aClass223_45.method5388((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class176 local29 = this.aClass176_91;
		@Pc(38) byte[] local38;
		synchronized (this.aClass176_91) {
			local38 = this.aClass176_91.method3994(arg0, 34);
		}
		local16 = new Class293();
		local16.aClass237_4 = this;
		if (local38 != null) {
			local16.method6991(new Class4_Sub11(local38));
		}
		@Pc(68) Class223 local68 = this.aClass223_45;
		synchronized (this.aClass223_45) {
			this.aClass223_45.method5394(local16, (long) arg0);
			return local16;
		}
	}
}
