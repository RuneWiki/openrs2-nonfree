import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class263 {

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	public int anInt7852;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!dc;")
	private final Class44 aClass44_56 = new Class44(64);

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "Lclient!dc;")
	public final Class44 aClass44_57 = new Class44(50);

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "Lclient!dc;")
	public final Class44 aClass44_58 = new Class44(5);

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "Lclient!he;")
	public final Class100 aClass100_96;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "Lclient!he;")
	private final Class100 aClass100_95;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!ci;IZLclient!he;Lclient!he;)V")
	public Class263(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) Class100 arg4) {
		this.aBoolean493 = arg2;
		this.aClass100_96 = arg4;
		this.aClass100_95 = arg3;
		if (this.aClass100_95 != null) {
			@Pc(38) int local38 = this.aClass100_95.method2516() - 1;
			this.aClass100_95.method2523(local38);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public void method6410(@OriginalArg(1) int arg0) {
		this.anInt7852 = arg0;
		@Pc(9) Class44 local9 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1351();
		}
		local9 = this.aClass44_58;
		synchronized (this.aClass44_58) {
			this.aClass44_58.method1351();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public void method6412() {
		@Pc(2) Class44 local2 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1348();
		}
		local2 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1348();
		}
		local2 = this.aClass44_58;
		synchronized (this.aClass44_58) {
			this.aClass44_58.method1348();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	public void method6413() {
		@Pc(2) Class44 local2 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1351();
		}
		local2 = this.aClass44_58;
		synchronized (this.aClass44_58) {
			this.aClass44_58.method1351();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public void method6414() {
		@Pc(6) Class44 local6 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1351();
		}
		local6 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1351();
		}
		local6 = this.aClass44_58;
		synchronized (this.aClass44_58) {
			this.aClass44_58.method1351();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZI)V")
	public void method6415(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean493) {
			this.aBoolean493 = arg0;
			this.method6414();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Lclient!dg;")
	public Class48 method6416(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_56;
		@Pc(16) Class48 local16;
		synchronized (this.aClass44_56) {
			local16 = (Class48) this.aClass44_56.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass100_95.method2520(Static107.method1885(arg0), Static271.method4041(arg0));
		local16 = new Class48();
		local16.aClass263_1 = this;
		local16.anInt1777 = arg0;
		if (local37 != null) {
			local16.method1379(new Class6_Sub1(local37));
		}
		local16.method1387();
		@Pc(68) Class44 local68 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(II)V")
	public void method6418() {
		@Pc(6) Class44 local6 = this.aClass44_56;
		synchronized (this.aClass44_56) {
			this.aClass44_56.method1352(5);
		}
		local6 = this.aClass44_57;
		synchronized (this.aClass44_57) {
			this.aClass44_57.method1352(5);
		}
		local6 = this.aClass44_58;
		synchronized (this.aClass44_58) {
			this.aClass44_58.method1352(5);
		}
	}
}
