import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class129 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "Lclient!ka;")
	private final Class132 aClass132_25 = new Class132(16);

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!dk;")
	private final Class54 aClass54_56;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class129(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_56 = arg2;
		this.aClass54_56.method1123(30);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!bw;")
	public Class30 method2649(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_25;
		@Pc(16) Class30 local16;
		synchronized (this.aClass132_25) {
			local16 = (Class30) this.aClass132_25.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_56;
		@Pc(44) byte[] local44;
		synchronized (this.aClass54_56) {
			local44 = this.aClass54_56.method1126(30, arg0);
		}
		local16 = new Class30();
		if (local44 != null) {
			local16.method649(new Class2_Sub13(local44));
		}
		@Pc(66) Class132 local66 = this.aClass132_25;
		synchronized (this.aClass132_25) {
			this.aClass132_25.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)V")
	public void method2650() {
		@Pc(12) Class132 local12 = this.aClass132_25;
		synchronized (this.aClass132_25) {
			this.aClass132_25.method2713(5);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method2651() {
		@Pc(2) Class132 local2 = this.aClass132_25;
		synchronized (this.aClass132_25) {
			this.aClass132_25.method2698();
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method2652() {
		@Pc(6) Class132 local6 = this.aClass132_25;
		synchronized (this.aClass132_25) {
			this.aClass132_25.method2708();
		}
	}
}
