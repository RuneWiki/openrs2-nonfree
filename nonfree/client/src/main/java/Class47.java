import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class47 {

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "Lclient!ka;")
	private final Class132 aClass132_8 = new Class132(64);

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Lclient!dk;")
	private final Class54 aClass54_23;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!dk;")
	public final Class54 aClass54_22;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;)V")
	public Class47(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3) {
		this.aClass54_23 = arg2;
		this.aClass54_22 = arg3;
		this.aClass54_23.method1123(3);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V")
	public void method957() {
		@Pc(6) Class132 local6 = this.aClass132_8;
		synchronized (this.aClass132_8) {
			this.aClass132_8.method2708();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BI)V")
	public void method958() {
		@Pc(2) Class132 local2 = this.aClass132_8;
		synchronized (this.aClass132_8) {
			this.aClass132_8.method2713(5);
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V")
	public void method961() {
		@Pc(9) Class132 local9 = this.aClass132_8;
		synchronized (this.aClass132_8) {
			this.aClass132_8.method2698();
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZ)Lclient!hc;")
	public Class98 method963(@OriginalArg(0) int arg0) {
		@Pc(12) Class132 local12 = this.aClass132_8;
		@Pc(22) Class98 local22;
		synchronized (this.aClass132_8) {
			local22 = (Class98) this.aClass132_8.method2701((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(35) Class54 local35 = this.aClass54_23;
		@Pc(44) byte[] local44;
		synchronized (this.aClass54_23) {
			local44 = this.aClass54_23.method1126(3, arg0);
		}
		local22 = new Class98();
		local22.aClass47_1 = this;
		if (local44 != null) {
			local22.method2141(new Class2_Sub13(local44));
		}
		@Pc(69) Class132 local69 = this.aClass132_8;
		synchronized (this.aClass132_8) {
			this.aClass132_8.method2711(local22, (long) arg0);
			return local22;
		}
	}
}
