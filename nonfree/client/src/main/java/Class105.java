import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class105 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Lclient!hn;")
	private Class102 aClass102_21 = new Class102(64);

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!fo;")
	private final Class82 aClass82_42;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;)V")
	public Class105(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		this.aClass82_42 = arg2;
		if (this.aClass82_42 != null) {
			@Pc(20) int local20 = this.aClass82_42.method1825() - 1;
			this.aClass82_42.method1823(local20);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method2288(@OriginalArg(1) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_21;
		synchronized (this.aClass102_21) {
			this.aClass102_21.method2271();
			this.aClass102_21 = new Class102(arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method2289() {
		@Pc(10) Class102 local10 = this.aClass102_21;
		synchronized (this.aClass102_21) {
			this.aClass102_21.method2271();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	public void method2291() {
		@Pc(6) Class102 local6 = this.aClass102_21;
		synchronized (this.aClass102_21) {
			this.aClass102_21.method2260();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Lclient!cu;")
	public Class46 method2293(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_21;
		@Pc(18) Class46 local18;
		synchronized (this.aClass102_21) {
			local18 = (Class46) this.aClass102_21.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_42;
		@Pc(46) byte[] local46;
		synchronized (this.aClass82_42) {
			local46 = this.aClass82_42.method1817(Static300.method4098(arg0), Static216.method3146(arg0));
		}
		local18 = new Class46();
		if (local46 != null) {
			local18.method1048(new Class1_Sub28(local46));
		}
		@Pc(73) Class102 local73 = this.aClass102_21;
		synchronized (this.aClass102_21) {
			this.aClass102_21.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)V")
	public void method2294() {
		@Pc(11) Class102 local11 = this.aClass102_21;
		synchronized (this.aClass102_21) {
			this.aClass102_21.method2262(5);
		}
	}
}
