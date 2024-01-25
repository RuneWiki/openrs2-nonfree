import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class135 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!ka;")
	private final Class132 aClass132_26 = new Class132(64);

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "Lclient!dk;")
	private final Class54 aClass54_57;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class135(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_57 = arg2;
		if (this.aClass54_57 != null) {
			this.aClass54_57.method1123(11);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
	public void method2745() {
		@Pc(2) Class132 local2 = this.aClass132_26;
		synchronized (this.aClass132_26) {
			this.aClass132_26.method2708();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	public void method2746() {
		@Pc(2) Class132 local2 = this.aClass132_26;
		synchronized (this.aClass132_26) {
			this.aClass132_26.method2713(5);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public void method2747() {
		@Pc(7) Class132 local7 = this.aClass132_26;
		synchronized (this.aClass132_26) {
			this.aClass132_26.method2698();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Lclient!qf;")
	public Class200 method2749(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_26;
		@Pc(16) Class200 local16;
		synchronized (this.aClass132_26) {
			local16 = (Class200) this.aClass132_26.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_57;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_57) {
			local38 = this.aClass54_57.method1126(11, arg0);
		}
		local16 = new Class200();
		if (local38 != null) {
			local16.method4357(new Class2_Sub13(local38));
		}
		@Pc(60) Class132 local60 = this.aClass132_26;
		synchronized (this.aClass132_26) {
			this.aClass132_26.method2711(local16, (long) arg0);
			return local16;
		}
	}
}
