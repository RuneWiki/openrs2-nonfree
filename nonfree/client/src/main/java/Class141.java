import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class141 {

	@OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!dc;")
	private final Class44 aClass44_28 = new Class44(64);

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!dc;")
	public final Class44 aClass44_29 = new Class44(30);

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!he;")
	public final Class100 aClass100_38;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!he;")
	private final Class100 aClass100_37;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;)V")
	public Class141(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		this.aClass100_38 = arg3;
		this.aClass100_37 = arg2;
		@Pc(26) int local26 = this.aClass100_37.method2516() - 1;
		this.aClass100_37.method2523(local26);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method3176() {
		@Pc(6) Class44 local6 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1348();
		}
		local6 = this.aClass44_29;
		synchronized (this.aClass44_29) {
			this.aClass44_29.method1348();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lclient!ea;")
	public Class58 method3177(@OriginalArg(0) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_28;
		@Pc(23) Class58 local23;
		synchronized (this.aClass44_28) {
			local23 = (Class58) this.aClass44_28.method1353((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(44) byte[] local44 = this.aClass100_37.method2520(Static194.method3065(arg0), Static164.method2713(arg0));
		local23 = new Class58();
		local23.aClass141_3 = this;
		local23.anInt2025 = arg0;
		if (local44 != null) {
			local23.method1569(new Class6_Sub1(local44));
		}
		@Pc(68) Class44 local68 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1349(local23, (long) arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V")
	public void method3179(@OriginalArg(0) int arg0) {
		this.anInt3862 = arg0;
		@Pc(15) Class44 local15 = this.aClass44_29;
		synchronized (this.aClass44_29) {
			this.aClass44_29.method1351();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public void method3182() {
		@Pc(2) Class44 local2 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1351();
		}
		local2 = this.aClass44_29;
		synchronized (this.aClass44_29) {
			this.aClass44_29.method1351();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	public void method3186() {
		@Pc(6) Class44 local6 = this.aClass44_28;
		synchronized (this.aClass44_28) {
			this.aClass44_28.method1352(5);
		}
		local6 = this.aClass44_29;
		synchronized (this.aClass44_29) {
			this.aClass44_29.method1352(5);
		}
	}
}
