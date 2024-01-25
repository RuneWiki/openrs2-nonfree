import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class153 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!ka;")
	private final Class132 aClass132_32 = new Class132(128);

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!dk;")
	private final Class54 aClass54_71;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class153(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_71 = arg2;
		this.aClass54_71.method1123(1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public void method3076() {
		@Pc(6) Class132 local6 = this.aClass132_32;
		synchronized (this.aClass132_32) {
			this.aClass132_32.method2698();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public void method3078() {
		@Pc(12) Class132 local12 = this.aClass132_32;
		synchronized (this.aClass132_32) {
			this.aClass132_32.method2713(5);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public void method3080() {
		@Pc(10) Class132 local10 = this.aClass132_32;
		synchronized (this.aClass132_32) {
			this.aClass132_32.method2708();
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Lclient!wm;")
	public Class269 method3081(@OriginalArg(0) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_32;
		@Pc(16) Class269 local16;
		synchronized (this.aClass132_32) {
			local16 = (Class269) this.aClass132_32.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class54 local34 = this.aClass54_71;
		@Pc(43) byte[] local43;
		synchronized (this.aClass54_71) {
			local43 = this.aClass54_71.method1126(1, arg0);
		}
		local16 = new Class269();
		if (local43 != null) {
			local16.method5662(new Class2_Sub13(local43));
		}
		@Pc(65) Class132 local65 = this.aClass132_32;
		synchronized (this.aClass132_32) {
			this.aClass132_32.method2711(local16, (long) arg0);
			return local16;
		}
	}
}
