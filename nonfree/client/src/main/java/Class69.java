import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class69 {

	@OriginalMember(owner = "client!es", name = "k", descriptor = "I")
	public int anInt1838;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!hn;")
	private final Class102 aClass102_12 = new Class102(64);

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!hn;")
	public final Class102 aClass102_13 = new Class102(30);

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!fo;")
	private final Class82 aClass82_23;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!fo;")
	public final Class82 aClass82_22;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;)V")
	public Class69(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		this.aClass82_23 = arg2;
		this.aClass82_22 = arg3;
		@Pc(26) int local26 = this.aClass82_23.method1825() - 1;
		this.aClass82_23.method1823(local26);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public void method1552() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2271();
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2271();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)Lclient!kc;")
	public Class130 method1553(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_12;
		@Pc(18) Class130 local18;
		synchronized (this.aClass102_12) {
			local18 = (Class130) this.aClass102_12.method2258((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class82 local31 = this.aClass82_23;
		@Pc(44) byte[] local44;
		synchronized (this.aClass82_23) {
			local44 = this.aClass82_23.method1817(Static210.method3095(arg0), Static65.method1071(arg0));
		}
		local18 = new Class130();
		local18.aClass69_2 = this;
		local18.anInt3587 = arg0;
		if (local44 != null) {
			local18.method2915(new Class1_Sub28(local44));
		}
		@Pc(72) Class102 local72 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2272((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)V")
	public void method1554() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2260();
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2260();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
	public void method1555() {
		@Pc(2) Class102 local2 = this.aClass102_12;
		synchronized (this.aClass102_12) {
			this.aClass102_12.method2262(5);
		}
		local2 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2262(5);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public void method1556(@OriginalArg(0) int arg0) {
		this.anInt1838 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_13;
		synchronized (this.aClass102_13) {
			this.aClass102_13.method2271();
		}
	}
}
