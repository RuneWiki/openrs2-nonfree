import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class252 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!er;")
	private Class69 aClass69_70 = new Class69(64);

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!ns;")
	private final Class166 aClass166_280;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class252(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_280 = arg2;
		if (this.aClass166_280 != null) {
			@Pc(20) int local20 = this.aClass166_280.method3695() - 1;
			this.aClass166_280.method3691(local20);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public void method5478() {
		@Pc(6) Class69 local6 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1593();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lclient!gu;")
	public Class100 method5480(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_70;
		@Pc(16) Class100 local16;
		synchronized (this.aClass69_70) {
			local16 = (Class100) this.aClass69_70.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(44) byte[] local44 = this.aClass166_280.method3696(Static92.method1508(arg0), Static198.method2844(arg0));
		local16 = new Class100();
		if (local44 != null) {
			local16.method2015(new Class4_Sub30(local44));
		}
		@Pc(60) Class69 local60 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	public void method5481(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1593();
			this.aClass69_70 = new Class69(arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V")
	public void method5482() {
		@Pc(6) Class69 local6 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1594(5);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
	public void method5484() {
		@Pc(2) Class69 local2 = this.aClass69_70;
		synchronized (this.aClass69_70) {
			this.aClass69_70.method1600();
		}
	}
}
