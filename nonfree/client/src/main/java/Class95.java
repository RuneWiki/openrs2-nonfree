import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class95 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "I")
	public int anInt2535;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "Lclient!sw;")
	private final Class277 aClass277_18 = new Class277(64);

	@OriginalMember(owner = "client!fba", name = "r", descriptor = "Lclient!sw;")
	public final Class277 aClass277_19 = new Class277(50);

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "Lclient!sw;")
	public final Class277 aClass277_20 = new Class277(5);

	@OriginalMember(owner = "client!fba", name = "m", descriptor = "Lclient!re;")
	public final Class250 aClass250_3;

	@OriginalMember(owner = "client!fba", name = "c", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "Lclient!dn;")
	public final Class69 aClass69_27;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "Lclient!dn;")
	private final Class69 aClass69_28;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!re;IZLclient!dn;Lclient!dn;)V")
	public Class95(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class69 arg3, @OriginalArg(4) Class69 arg4) {
		this.aClass250_3 = arg0;
		this.aBoolean216 = arg2;
		this.aClass69_27 = arg4;
		this.aClass69_28 = arg3;
		if (this.aClass69_28 != null) {
			@Pc(41) int local41 = this.aClass69_28.method1895() - 1;
			this.aClass69_28.method1884(local41);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V")
	public void method2355(@OriginalArg(0) int arg0) {
		this.anInt2535 = arg0;
		@Pc(9) Class277 local9 = this.aClass277_19;
		synchronized (this.aClass277_19) {
			this.aClass277_19.method7019();
		}
		local9 = this.aClass277_20;
		synchronized (this.aClass277_20) {
			this.aClass277_20.method7019();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V")
	public void method2358() {
		@Pc(2) Class277 local2 = this.aClass277_18;
		synchronized (this.aClass277_18) {
			this.aClass277_18.method7026();
		}
		local2 = this.aClass277_19;
		synchronized (this.aClass277_19) {
			this.aClass277_19.method7026();
		}
		local2 = this.aClass277_20;
		synchronized (this.aClass277_20) {
			this.aClass277_20.method7026();
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(II)V")
	public void method2359() {
		@Pc(2) Class277 local2 = this.aClass277_18;
		synchronized (this.aClass277_18) {
			this.aClass277_18.method7018(5);
		}
		local2 = this.aClass277_19;
		synchronized (this.aClass277_19) {
			this.aClass277_19.method7018(5);
		}
		local2 = this.aClass277_20;
		synchronized (this.aClass277_20) {
			this.aClass277_20.method7018(5);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public void method2360() {
		@Pc(2) Class277 local2 = this.aClass277_18;
		synchronized (this.aClass277_18) {
			this.aClass277_18.method7019();
		}
		local2 = this.aClass277_19;
		synchronized (this.aClass277_19) {
			this.aClass277_19.method7019();
		}
		local2 = this.aClass277_20;
		synchronized (this.aClass277_20) {
			this.aClass277_20.method7019();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BZ)V")
	public void method2361(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean216 != arg0) {
			this.aBoolean216 = arg0;
			this.method2360();
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)Lclient!tn;")
	public Class283 method2362(@OriginalArg(1) int arg0) {
		@Pc(6) Class277 local6 = this.aClass277_18;
		@Pc(16) Class283 local16;
		synchronized (this.aClass277_18) {
			local16 = (Class283) this.aClass277_18.method7014((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class69 local29 = this.aClass69_28;
		@Pc(42) byte[] local42;
		synchronized (this.aClass69_28) {
			local42 = this.aClass69_28.method1888(Static268.method4780(arg0), Static10.method479(arg0));
		}
		local16 = new Class283();
		local16.aClass95_2 = this;
		local16.anInt8422 = arg0;
		if (local42 != null) {
			local16.method7369(new Class1_Sub17(local42));
		}
		local16.method7374();
		@Pc(73) Class277 local73 = this.aClass277_18;
		synchronized (this.aClass277_18) {
			this.aClass277_18.method7016(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V")
	public void method2363() {
		@Pc(11) Class277 local11 = this.aClass277_19;
		synchronized (this.aClass277_19) {
			this.aClass277_19.method7019();
		}
		local11 = this.aClass277_20;
		synchronized (this.aClass277_20) {
			this.aClass277_20.method7019();
		}
	}
}
