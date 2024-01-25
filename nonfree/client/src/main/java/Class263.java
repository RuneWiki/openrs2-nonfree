import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class263 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public int anInt6997;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!de;")
	private final Class69 aClass69_41 = new Class69(64);

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!de;")
	public final Class69 aClass69_42 = new Class69(60);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_188;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Lclient!nd;")
	public final Class238 aClass238_189;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class263(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_188 = arg2;
		this.aClass238_189 = arg3;
		@Pc(26) int local26 = this.aClass238_188.method5569() - 1;
		this.aClass238_188.method5592(local26);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
	public void method6106(@OriginalArg(1) int arg0) {
		this.anInt6997 = arg0;
		@Pc(9) Class69 local9 = this.aClass69_42;
		synchronized (this.aClass69_42) {
			this.aClass69_42.method1905();
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)V")
	public void method6108() {
		@Pc(6) Class69 local6 = this.aClass69_41;
		synchronized (this.aClass69_41) {
			this.aClass69_41.method1910(5);
		}
		local6 = this.aClass69_42;
		synchronized (this.aClass69_42) {
			this.aClass69_42.method1910(5);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public void method6109() {
		@Pc(6) Class69 local6 = this.aClass69_41;
		synchronized (this.aClass69_41) {
			this.aClass69_41.method1905();
		}
		local6 = this.aClass69_42;
		synchronized (this.aClass69_42) {
			this.aClass69_42.method1905();
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)V")
	public void method6111() {
		@Pc(6) Class69 local6 = this.aClass69_41;
		synchronized (this.aClass69_41) {
			this.aClass69_41.method1904();
		}
		local6 = this.aClass69_42;
		synchronized (this.aClass69_42) {
			this.aClass69_42.method1904();
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(IB)Lclient!uq;")
	public Class354 method6113(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_41;
		@Pc(16) Class354 local16;
		synchronized (this.aClass69_41) {
			local16 = (Class354) this.aClass69_41.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class238 local37 = this.aClass238_188;
		@Pc(50) byte[] local50;
		synchronized (this.aClass238_188) {
			local50 = this.aClass238_188.method5567(Static172.method2995(arg0), Static550.method7585(arg0));
		}
		local16 = new Class354();
		local16.aClass263_2 = this;
		local16.anInt9843 = arg0;
		if (local50 != null) {
			local16.method8351(new Class2_Sub17(local50));
		}
		@Pc(78) Class69 local78 = this.aClass69_41;
		synchronized (this.aClass69_41) {
			this.aClass69_41.method1917((long) arg0, local16);
			return local16;
		}
	}
}
