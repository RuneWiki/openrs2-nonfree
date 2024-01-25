import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class103 {

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!dc;")
	private Class44 aClass44_16 = new Class44(64);

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!he;")
	private final Class100 aClass100_25;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class103(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_25 = arg2;
		if (this.aClass100_25 != null) {
			@Pc(20) int local20 = this.aClass100_25.method2516() - 1;
			this.aClass100_25.method2523(local20);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)V")
	public void method2607() {
		@Pc(2) Class44 local2 = this.aClass44_16;
		synchronized (this.aClass44_16) {
			this.aClass44_16.method1352(5);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Lclient!cj;")
	public Class37 method2608(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_16;
		@Pc(16) Class37 local16;
		synchronized (this.aClass44_16) {
			local16 = (Class37) this.aClass44_16.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(42) byte[] local42 = this.aClass100_25.method2520(Static392.method4245(arg0), Static50.method1147(arg0));
		local16 = new Class37();
		if (local42 != null) {
			local16.method1030(new Class6_Sub1(local42));
		}
		@Pc(58) Class44 local58 = this.aClass44_16;
		synchronized (this.aClass44_16) {
			this.aClass44_16.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(BI)V")
	public void method2609(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_16;
		synchronized (this.aClass44_16) {
			this.aClass44_16.method1351();
			this.aClass44_16 = new Class44(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public void method2610() {
		@Pc(11) Class44 local11 = this.aClass44_16;
		synchronized (this.aClass44_16) {
			this.aClass44_16.method1351();
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public void method2611() {
		@Pc(8) Class44 local8 = this.aClass44_16;
		synchronized (this.aClass44_16) {
			this.aClass44_16.method1348();
		}
	}
}
