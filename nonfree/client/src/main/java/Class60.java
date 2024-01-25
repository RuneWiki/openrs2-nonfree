import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class60 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "Lclient!de;")
	private final Class69 aClass69_9 = new Class69(256);

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "Lclient!nd;")
	private final Class238 aClass238_45;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class60(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_45 = arg2;
		this.aClass238_45.method5592(26);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V")
	public void method1792() {
		@Pc(6) Class69 local6 = this.aClass69_9;
		synchronized (this.aClass69_9) {
			this.aClass69_9.method1904();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lclient!hq;")
	public Class2_Sub7_Sub5 method1793(@OriginalArg(0) int arg0) {
		@Pc(13) Class69 local13 = this.aClass69_9;
		@Pc(23) Class2_Sub7_Sub5 local23;
		synchronized (this.aClass69_9) {
			local23 = (Class2_Sub7_Sub5) this.aClass69_9.method1919((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(36) Class238 local36 = this.aClass238_45;
		@Pc(47) byte[] local47;
		synchronized (this.aClass238_45) {
			local47 = this.aClass238_45.method5567(arg0, 26);
		}
		local23 = new Class2_Sub7_Sub5();
		if (local47 != null) {
			local23.method3602(new Class2_Sub17(local47));
		}
		@Pc(71) Class69 local71 = this.aClass69_9;
		synchronized (this.aClass69_9) {
			this.aClass69_9.method1917((long) arg0, local23);
			return local23;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V")
	public void method1796() {
		@Pc(14) Class69 local14 = this.aClass69_9;
		synchronized (this.aClass69_9) {
			this.aClass69_9.method1910(5);
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public void method1797() {
		@Pc(2) Class69 local2 = this.aClass69_9;
		synchronized (this.aClass69_9) {
			this.aClass69_9.method1905();
		}
	}
}
