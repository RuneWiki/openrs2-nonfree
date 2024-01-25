import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class83 {

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "Lclient!dc;")
	private final Class44 aClass44_10 = new Class44(64);

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Lclient!dc;")
	public final Class44 aClass44_11 = new Class44(2);

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Lclient!he;")
	public final Class100 aClass100_22;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "Lclient!he;")
	private final Class100 aClass100_21;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;Lclient!he;)V")
	public Class83(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) Class100 arg3) {
		this.aClass100_22 = arg3;
		this.aClass100_21 = arg2;
		this.aClass100_21.method2523(33);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BI)Lclient!jc;")
	public Class126 method2097(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_10;
		@Pc(18) Class126 local18;
		synchronized (this.aClass44_10) {
			local18 = (Class126) this.aClass44_10.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass100_21.method2520(arg0, 33);
		local18 = new Class126();
		local18.aClass83_2 = this;
		if (local35 != null) {
			local18.method2975(new Class6_Sub1(local35));
		}
		@Pc(59) Class44 local59 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1349(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(B)V")
	public void method2098() {
		@Pc(6) Class44 local6 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1348();
		}
		local6 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1348();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)V")
	public void method2100() {
		@Pc(2) Class44 local2 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1352(5);
		}
		local2 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1352(5);
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	public void method2102() {
		@Pc(2) Class44 local2 = this.aClass44_10;
		synchronized (this.aClass44_10) {
			this.aClass44_10.method1351();
		}
		@Pc(29) Class44 local29 = this.aClass44_11;
		synchronized (this.aClass44_11) {
			this.aClass44_11.method1351();
		}
	}
}
