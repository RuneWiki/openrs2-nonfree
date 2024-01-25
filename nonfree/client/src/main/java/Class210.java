import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class210 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "Lclient!de;")
	private final Class69 aClass69_31 = new Class69(64);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!nd;")
	private final Class238 aClass238_146;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;)V")
	public Class210(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_146 = arg2;
		if (this.aClass238_146 != null) {
			this.aClass238_146.method5592(35);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V")
	public void method4905() {
		@Pc(2) Class69 local2 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1905();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public void method4906() {
		@Pc(10) Class69 local10 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1910(5);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lclient!gw;")
	public Class138 method4908(@OriginalArg(0) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_31;
		@Pc(18) Class138 local18;
		synchronized (this.aClass69_31) {
			local18 = (Class138) this.aClass69_31.method1919((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class238 local31 = this.aClass238_146;
		@Pc(42) byte[] local42;
		synchronized (this.aClass238_146) {
			local42 = this.aClass238_146.method5567(arg0, 35);
		}
		local18 = new Class138();
		if (local42 != null) {
			local18.method3400(new Class2_Sub17(local42));
		}
		local18.method3398();
		@Pc(67) Class69 local67 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1917((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public void method4909() {
		@Pc(2) Class69 local2 = this.aClass69_31;
		synchronized (this.aClass69_31) {
			this.aClass69_31.method1904();
		}
	}
}
