import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class97 {

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Lclient!ka;")
	private Class132 aClass132_16 = new Class132(64);

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!ka;")
	public Class132 aClass132_17 = new Class132(64);

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!dk;")
	public final Class54 aClass54_45;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!dk;")
	private final Class54 aClass54_46;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;Lclient!dk;)V")
	public Class97(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class54 arg3) {
		this.aClass54_45 = arg3;
		this.aClass54_46 = arg2;
		this.aClass54_46.method1123(34);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public void method2128() {
		@Pc(11) Class132 local11 = this.aClass132_16;
		synchronized (this.aClass132_16) {
			this.aClass132_16.method2713(5);
		}
		local11 = this.aClass132_17;
		synchronized (this.aClass132_17) {
			this.aClass132_17.method2713(5);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lclient!mv;")
	public Class165 method2130(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_16;
		@Pc(16) Class165 local16;
		synchronized (this.aClass132_16) {
			local16 = (Class165) this.aClass132_16.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_46;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_46) {
			local38 = this.aClass54_46.method1126(34, arg0);
		}
		local16 = new Class165();
		local16.aClass97_4 = this;
		if (local38 != null) {
			local16.method3505(new Class2_Sub13(local38));
		}
		@Pc(63) Class132 local63 = this.aClass132_16;
		synchronized (this.aClass132_16) {
			this.aClass132_16.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method2132() {
		@Pc(6) Class132 local6 = this.aClass132_16;
		synchronized (this.aClass132_16) {
			this.aClass132_16.method2708();
		}
		local6 = this.aClass132_17;
		synchronized (this.aClass132_17) {
			this.aClass132_17.method2708();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method2133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass132_16 = new Class132(arg1);
		this.aClass132_17 = new Class132(arg0);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public void method2134() {
		@Pc(6) Class132 local6 = this.aClass132_16;
		synchronized (this.aClass132_16) {
			this.aClass132_16.method2698();
		}
		local6 = this.aClass132_17;
		synchronized (this.aClass132_17) {
			this.aClass132_17.method2698();
		}
	}
}
