import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class115 {

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public int anInt3175;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!ff;")
	private final Class83 aClass83_27 = new Class83(64);

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!ff;")
	public final Class83 aClass83_28 = new Class83(30);

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "Lclient!vh;")
	private final Class250 aClass250_38;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!vh;")
	public final Class250 aClass250_37;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!lf;ILclient!vh;Lclient!vh;)V")
	public Class115(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class250 arg3) {
		this.aClass250_38 = arg2;
		this.aClass250_37 = arg3;
		@Pc(26) int local26 = this.aClass250_38.method5666() - 1;
		this.aClass250_38.method5653(local26);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public void method2712() {
		@Pc(2) Class83 local2 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method1669();
		}
		local2 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method1669();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public void method2713() {
		@Pc(2) Class83 local2 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method1663(5);
		}
		local2 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method1663(5);
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
	public void method2714(@OriginalArg(1) int arg0) {
		this.anInt3175 = arg0;
		@Pc(15) Class83 local15 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method1669();
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public void method2715() {
		@Pc(6) Class83 local6 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method1667();
		}
		local6 = this.aClass83_28;
		synchronized (this.aClass83_28) {
			this.aClass83_28.method1667();
		}
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)Lclient!cw;")
	public Class45 method2718(@OriginalArg(0) int arg0) {
		@Pc(6) Class83 local6 = this.aClass83_27;
		@Pc(18) Class45 local18;
		synchronized (this.aClass83_27) {
			local18 = (Class45) this.aClass83_27.method1658((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass250_38.method5667(Static306.method4376(arg0), Static2.method154(arg0));
		local18 = new Class45();
		local18.aClass115_1 = this;
		local18.anInt1322 = arg0;
		if (local41 != null) {
			local18.method1105(new Class1_Sub1(local41));
		}
		@Pc(63) Class83 local63 = this.aClass83_27;
		synchronized (this.aClass83_27) {
			this.aClass83_27.method1675((long) arg0, local18);
			return local18;
		}
	}
}
