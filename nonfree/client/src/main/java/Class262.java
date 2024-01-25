import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class262 {

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!er;")
	private final Class69 aClass69_71 = new Class69(64);

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!ns;")
	private final Class166 aClass166_296;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class262(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_296 = arg2;
		if (this.aClass166_296 != null) {
			this.aClass166_296.method3691(11);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	public void method5688() {
		@Pc(6) Class69 local6 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1594(5);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!v;")
	public Class247 method5689(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_71;
		@Pc(16) Class247 local16;
		synchronized (this.aClass69_71) {
			local16 = (Class247) this.aClass69_71.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_296.method3696(arg0, 11);
		local16 = new Class247();
		if (local33 != null) {
			local16.method5428(new Class4_Sub30(local33));
		}
		@Pc(49) Class69 local49 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public void method5690() {
		@Pc(2) Class69 local2 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1600();
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public void method5692() {
		@Pc(6) Class69 local6 = this.aClass69_71;
		synchronized (this.aClass69_71) {
			this.aClass69_71.method1593();
		}
	}
}
