import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ev")
public final class Class70 {

	@OriginalMember(owner = "client!ev", name = "i", descriptor = "Lclient!dc;")
	private final Class44 aClass44_9 = new Class44(16);

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Lclient!he;")
	private final Class100 aClass100_14;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class70(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_14 = arg2;
		this.aClass100_14.method2523(30);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BI)Lclient!bd;")
	public Class20 method1825(@OriginalArg(1) int arg0) {
		@Pc(14) Class44 local14 = this.aClass44_9;
		@Pc(24) Class20 local24;
		synchronized (this.aClass44_9) {
			local24 = (Class20) this.aClass44_9.method1353((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(41) byte[] local41 = this.aClass100_14.method2520(arg0, 30);
		local24 = new Class20();
		if (local41 != null) {
			local24.method655(new Class6_Sub1(local41));
		}
		@Pc(57) Class44 local57 = this.aClass44_9;
		synchronized (this.aClass44_9) {
			this.aClass44_9.method1349(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IB)V")
	public void method1826() {
		@Pc(6) Class44 local6 = this.aClass44_9;
		synchronized (this.aClass44_9) {
			this.aClass44_9.method1352(5);
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)V")
	public void method1827() {
		@Pc(6) Class44 local6 = this.aClass44_9;
		synchronized (this.aClass44_9) {
			this.aClass44_9.method1351();
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public void method1828() {
		@Pc(13) Class44 local13 = this.aClass44_9;
		synchronized (this.aClass44_9) {
			this.aClass44_9.method1348();
		}
	}
}
