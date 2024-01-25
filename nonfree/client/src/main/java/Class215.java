import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class215 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!hn;")
	private final Class102 aClass102_45 = new Class102(64);

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!fo;")
	private final Class82 aClass82_83;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!fo;")
	public final Class82 aClass82_82;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!d;ILclient!fo;Lclient!fo;)V")
	public Class215(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class82 arg3) {
		this.aClass82_83 = arg2;
		this.aClass82_82 = arg3;
		this.aClass82_83.method1823(3);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)Lclient!ki;")
	public Class133 method4766(@OriginalArg(1) int arg0) {
		@Pc(6) Class102 local6 = this.aClass102_45;
		@Pc(16) Class133 local16;
		synchronized (this.aClass102_45) {
			local16 = (Class133) this.aClass102_45.method2258((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class82 local29 = this.aClass82_83;
		@Pc(38) byte[] local38;
		synchronized (this.aClass82_83) {
			local38 = this.aClass82_83.method1817(3, arg0);
		}
		local16 = new Class133();
		local16.aClass215_1 = this;
		if (local38 != null) {
			local16.method3097(new Class1_Sub28(local38));
		}
		@Pc(63) Class102 local63 = this.aClass102_45;
		synchronized (this.aClass102_45) {
			this.aClass102_45.method2272((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)V")
	public void method4767() {
		@Pc(2) Class102 local2 = this.aClass102_45;
		synchronized (this.aClass102_45) {
			this.aClass102_45.method2262(5);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	public void method4768() {
		@Pc(10) Class102 local10 = this.aClass102_45;
		synchronized (this.aClass102_45) {
			this.aClass102_45.method2271();
		}
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V")
	public void method4769() {
		@Pc(12) Class102 local12 = this.aClass102_45;
		synchronized (this.aClass102_45) {
			this.aClass102_45.method2260();
		}
	}
}
