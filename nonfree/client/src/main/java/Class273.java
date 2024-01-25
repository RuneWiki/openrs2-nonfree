import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class273 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "Lclient!sw;")
	private final Class277 aClass277_62 = new Class277(64);

	@OriginalMember(owner = "client!ss", name = "l", descriptor = "Lclient!sw;")
	public final Class277 aClass277_63 = new Class277(2);

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "Lclient!dn;")
	private final Class69 aClass69_87;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "Lclient!dn;")
	public final Class69 aClass69_88;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!re;ILclient!dn;Lclient!dn;)V")
	public Class273(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class69 arg3) {
		this.aClass69_87 = arg2;
		this.aClass69_88 = arg3;
		this.aClass69_87.method1884(33);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	public void method6994() {
		@Pc(2) Class277 local2 = this.aClass277_62;
		synchronized (this.aClass277_62) {
			this.aClass277_62.method7026();
		}
		local2 = this.aClass277_63;
		synchronized (this.aClass277_63) {
			this.aClass277_63.method7026();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public void method6995() {
		@Pc(6) Class277 local6 = this.aClass277_62;
		synchronized (this.aClass277_62) {
			this.aClass277_62.method7018(5);
		}
		local6 = this.aClass277_63;
		synchronized (this.aClass277_63) {
			this.aClass277_63.method7018(5);
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	public void method6998() {
		@Pc(9) Class277 local9 = this.aClass277_62;
		synchronized (this.aClass277_62) {
			this.aClass277_62.method7019();
		}
		local9 = this.aClass277_63;
		synchronized (this.aClass277_63) {
			this.aClass277_63.method7019();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)Lclient!tr;")
	public Class285 method6999(@OriginalArg(0) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_62;
		@Pc(16) Class285 local16;
		synchronized (this.aClass277_62) {
			local16 = (Class285) this.aClass277_62.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class69 local34 = this.aClass69_87;
		@Pc(43) byte[] local43;
		synchronized (this.aClass69_87) {
			local43 = this.aClass69_87.method1888(arg0, 33);
		}
		local16 = new Class285();
		local16.aClass273_2 = this;
		if (local43 != null) {
			local16.method7403(new Class1_Sub17(local43));
		}
		@Pc(68) Class277 local68 = this.aClass277_62;
		synchronized (this.aClass277_62) {
			this.aClass277_62.method7016(local16, (long) arg0);
			return local16;
		}
	}
}
