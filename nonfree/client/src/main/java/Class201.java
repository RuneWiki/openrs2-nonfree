import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class201 {

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Lclient!ka;")
	private final Class132 aClass132_50 = new Class132(64);

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!ka;")
	public final Class132 aClass132_51 = new Class132(2);

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "Lclient!dk;")
	public final Class54 aClass54_89;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "Lclient!dk;")
	private final Class54 aClass54_90;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;)V")
	public Class201(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3) {
		this.aClass54_89 = arg3;
		this.aClass54_90 = arg2;
		this.aClass54_90.method1123(33);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!hh;")
	public Class101 method4379(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_50;
		@Pc(16) Class101 local16;
		synchronized (this.aClass132_50) {
			local16 = (Class101) this.aClass132_50.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_90;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_90) {
			local38 = this.aClass54_90.method1126(33, arg0);
		}
		local16 = new Class101();
		local16.aClass201_1 = this;
		if (local38 != null) {
			local16.method2185(new Class2_Sub13(local38));
		}
		@Pc(68) Class132 local68 = this.aClass132_50;
		synchronized (this.aClass132_50) {
			this.aClass132_50.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
	public void method4380() {
		@Pc(6) Class132 local6 = this.aClass132_50;
		synchronized (this.aClass132_50) {
			this.aClass132_50.method2713(5);
		}
		local6 = this.aClass132_51;
		synchronized (this.aClass132_51) {
			this.aClass132_51.method2713(5);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public void method4381() {
		@Pc(2) Class132 local2 = this.aClass132_50;
		synchronized (this.aClass132_50) {
			this.aClass132_50.method2698();
		}
		local2 = this.aClass132_51;
		synchronized (this.aClass132_51) {
			this.aClass132_51.method2698();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	public void method4382() {
		@Pc(6) Class132 local6 = this.aClass132_50;
		synchronized (this.aClass132_50) {
			this.aClass132_50.method2708();
		}
		local6 = this.aClass132_51;
		synchronized (this.aClass132_51) {
			this.aClass132_51.method2708();
		}
	}
}
