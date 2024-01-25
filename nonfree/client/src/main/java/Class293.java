import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class293 {

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "Lclient!de;")
	private final Class69 aClass69_46 = new Class69(64);

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "Lclient!nd;")
	private final Class238 aClass238_221;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class293(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_221 = arg2;
		if (this.aClass238_221 != null) {
			this.aClass238_221.method5592(11);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)Lclient!tea;")
	public Class328 method6807(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_46;
		@Pc(24) Class328 local24;
		synchronized (this.aClass69_46) {
			local24 = (Class328) this.aClass69_46.method1919((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class238 local37 = this.aClass238_221;
		@Pc(46) byte[] local46;
		synchronized (this.aClass238_221) {
			local46 = this.aClass238_221.method5567(arg0, 11);
		}
		local24 = new Class328();
		if (local46 != null) {
			local24.method7526(new Class2_Sub17(local46));
		}
		@Pc(68) Class69 local68 = this.aClass69_46;
		synchronized (this.aClass69_46) {
			this.aClass69_46.method1917((long) arg0, local24);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public void method6808() {
		@Pc(6) Class69 local6 = this.aClass69_46;
		synchronized (this.aClass69_46) {
			this.aClass69_46.method1904();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public void method6812() {
		@Pc(10) Class69 local10 = this.aClass69_46;
		synchronized (this.aClass69_46) {
			this.aClass69_46.method1905();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
	public void method6814() {
		@Pc(6) Class69 local6 = this.aClass69_46;
		synchronized (this.aClass69_46) {
			this.aClass69_46.method1910(5);
		}
	}
}
