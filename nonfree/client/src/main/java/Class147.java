import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class147 {

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "Lclient!de;")
	private final Class69 aClass69_23 = new Class69(64);

	@OriginalMember(owner = "client!hia", name = "h", descriptor = "Lclient!nd;")
	private final Class238 aClass238_101;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class147(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_101 = arg2;
		this.aClass238_101.method5592(31);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	public void method3534() {
		@Pc(6) Class69 local6 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1905();
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)Lclient!vaa;")
	public Class359 method3535(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_23;
		@Pc(18) Class359 local18;
		synchronized (this.aClass69_23) {
			local18 = (Class359) this.aClass69_23.method1919((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class238 local31 = this.aClass238_101;
		@Pc(40) byte[] local40;
		synchronized (this.aClass238_101) {
			local40 = this.aClass238_101.method5567(arg0, 31);
		}
		local18 = new Class359();
		if (local40 != null) {
			local18.method8434(new Class2_Sub17(local40));
		}
		@Pc(64) Class69 local64 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1917((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
	public void method3536() {
		@Pc(12) Class69 local12 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1904();
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BI)V")
	public void method3538() {
		@Pc(2) Class69 local2 = this.aClass69_23;
		synchronized (this.aClass69_23) {
			this.aClass69_23.method1910(5);
		}
	}
}
