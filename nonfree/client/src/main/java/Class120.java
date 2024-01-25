import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class120 {

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Lclient!ka;")
	private Class132 aClass132_21 = new Class132(128);

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "Lclient!ka;")
	public Class132 aClass132_22 = new Class132(64);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!dk;")
	private final Class54 aClass54_53;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Lclient!dk;")
	public final Class54 aClass54_54;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;)V")
	public Class120(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3) {
		this.aClass54_53 = arg2;
		this.aClass54_54 = arg3;
		this.aClass54_53.method1123(36);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
	public void method2507() {
		@Pc(2) Class132 local2 = this.aClass132_21;
		synchronized (this.aClass132_21) {
			this.aClass132_21.method2708();
		}
		local2 = this.aClass132_22;
		synchronized (this.aClass132_22) {
			this.aClass132_22.method2708();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZI)V")
	public void method2511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass132_21 = new Class132(arg1);
		this.aClass132_22 = new Class132(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(IB)Lclient!fk;")
	public Class78 method2512(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_21;
		@Pc(16) Class78 local16;
		synchronized (this.aClass132_21) {
			local16 = (Class78) this.aClass132_21.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_53;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_53) {
			local38 = this.aClass54_53.method1126(36, arg0);
		}
		local16 = new Class78();
		local16.anInt2162 = arg0;
		local16.aClass120_1 = this;
		if (local38 != null) {
			local16.method1756(new Class2_Sub13(local38));
		}
		local16.method1751();
		@Pc(69) Class132 local69 = this.aClass132_21;
		synchronized (this.aClass132_21) {
			this.aClass132_21.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(IB)V")
	public void method2513() {
		@Pc(2) Class132 local2 = this.aClass132_21;
		synchronized (this.aClass132_21) {
			this.aClass132_21.method2713(5);
		}
		local2 = this.aClass132_22;
		synchronized (this.aClass132_22) {
			this.aClass132_22.method2713(5);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public void method2515() {
		@Pc(14) Class132 local14 = this.aClass132_21;
		synchronized (this.aClass132_21) {
			this.aClass132_21.method2698();
		}
		local14 = this.aClass132_22;
		synchronized (this.aClass132_22) {
			this.aClass132_22.method2698();
		}
	}
}
