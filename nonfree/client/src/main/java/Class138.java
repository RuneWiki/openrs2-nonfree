import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class138 {

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Lclient!ka;")
	private final Class132 aClass132_28 = new Class132(64);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!dk;")
	private final Class54 aClass54_62;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
	public final int anInt3503;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class138(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_62 = arg2;
		if (this.aClass54_62 == null) {
			this.anInt3503 = 0;
		} else {
			this.anInt3503 = this.aClass54_62.method1123(16);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lclient!gl;")
	public Class88 method2812(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_28;
		@Pc(16) Class88 local16;
		synchronized (this.aClass132_28) {
			local16 = (Class88) this.aClass132_28.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_62;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_62) {
			local38 = this.aClass54_62.method1126(16, arg0);
		}
		local16 = new Class88();
		if (local38 != null) {
			local16.method1998(new Class2_Sub13(local38));
		}
		@Pc(60) Class132 local60 = this.aClass132_28;
		synchronized (this.aClass132_28) {
			this.aClass132_28.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)V")
	public void method2813() {
		@Pc(6) Class132 local6 = this.aClass132_28;
		synchronized (this.aClass132_28) {
			this.aClass132_28.method2713(5);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public void method2815() {
		@Pc(10) Class132 local10 = this.aClass132_28;
		synchronized (this.aClass132_28) {
			this.aClass132_28.method2708();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public void method2816() {
		@Pc(12) Class132 local12 = this.aClass132_28;
		synchronized (this.aClass132_28) {
			this.aClass132_28.method2698();
		}
	}
}
