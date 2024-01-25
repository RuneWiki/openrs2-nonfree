import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class27 {

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "Lclient!dc;")
	private final Class44 aClass44_3 = new Class44(64);

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!he;")
	private final Class100 aClass100_5;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!ci;ILclient!he;)V")
	public Class27(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		this.aClass100_5 = arg2;
		this.aClass100_5.method2523(32);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)Lclient!up;")
	public Class246 method757(@OriginalArg(0) int arg0) {
		@Pc(11) Class44 local11 = this.aClass44_3;
		@Pc(21) Class246 local21;
		synchronized (this.aClass44_3) {
			local21 = (Class246) this.aClass44_3.method1353((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass100_5.method2520(arg0, 32);
		local21 = new Class246();
		if (local38 != null) {
			local21.method6010(new Class6_Sub1(local38));
		}
		@Pc(54) Class44 local54 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			this.aClass44_3.method1349(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public void method760() {
		@Pc(2) Class44 local2 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			this.aClass44_3.method1352(5);
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public void method762() {
		@Pc(6) Class44 local6 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			this.aClass44_3.method1348();
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
	public void method763() {
		@Pc(2) Class44 local2 = this.aClass44_3;
		synchronized (this.aClass44_3) {
			this.aClass44_3.method1351();
		}
	}
}
