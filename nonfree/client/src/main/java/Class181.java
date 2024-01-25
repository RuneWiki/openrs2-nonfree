import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class181 {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "Lclient!dc;")
	private final Class44 aClass44_39 = new Class44(64);

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!he;")
	private final Class100 aClass100_52;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class181(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_52 = arg2;
		if (this.aClass100_52 != null) {
			this.aClass100_52.method2523(11);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Lclient!nk;")
	public Class171 method4294(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_39;
		@Pc(16) Class171 local16;
		synchronized (this.aClass44_39) {
			local16 = (Class171) this.aClass44_39.method1353((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39 = this.aClass100_52.method2520(arg0, 11);
		local16 = new Class171();
		if (local39 != null) {
			local16.method4086(new Class6_Sub1(local39));
		}
		@Pc(55) Class44 local55 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1349(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public void method4295() {
		@Pc(2) Class44 local2 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1351();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public void method4297() {
		@Pc(2) Class44 local2 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1348();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
	public void method4298() {
		@Pc(6) Class44 local6 = this.aClass44_39;
		synchronized (this.aClass44_39) {
			this.aClass44_39.method1352(5);
		}
	}
}
