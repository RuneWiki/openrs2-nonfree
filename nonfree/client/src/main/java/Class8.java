import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class8 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!ka;")
	private Class132 aClass132_1 = new Class132(64);

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!dk;")
	private final Class54 aClass54_2;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class8(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_2 = arg2;
		if (this.aClass54_2 != null) {
			@Pc(20) int local20 = this.aClass54_2.method1107() - 1;
			this.aClass54_2.method1123(local20);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)V")
	public void method144(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_1;
		synchronized (this.aClass132_1) {
			this.aClass132_1.method2698();
			this.aClass132_1 = new Class132(arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)V")
	public void method145() {
		@Pc(6) Class132 local6 = this.aClass132_1;
		synchronized (this.aClass132_1) {
			this.aClass132_1.method2713(5);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method146() {
		@Pc(2) Class132 local2 = this.aClass132_1;
		synchronized (this.aClass132_1) {
			this.aClass132_1.method2698();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public void method147() {
		@Pc(2) Class132 local2 = this.aClass132_1;
		synchronized (this.aClass132_1) {
			this.aClass132_1.method2708();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)Lclient!hd;")
	public Class99 method148(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_1;
		@Pc(16) Class99 local16;
		synchronized (this.aClass132_1) {
			local16 = (Class99) this.aClass132_1.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_2;
		@Pc(42) byte[] local42;
		synchronized (this.aClass54_2) {
			local42 = this.aClass54_2.method1126(Static387.method4965(arg0), Static284.method3770(arg0));
		}
		local16 = new Class99();
		if (local42 != null) {
			local16.method2148(new Class2_Sub13(local42));
		}
		@Pc(64) Class132 local64 = this.aClass132_1;
		synchronized (this.aClass132_1) {
			this.aClass132_1.method2711(local16, (long) arg0);
			return local16;
		}
	}
}
