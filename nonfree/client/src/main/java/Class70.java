import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class70 {

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!jda;")
	private final Class165 aClass165_16 = new Class165(64);

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_25;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public final int anInt1778;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class70(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_25 = arg2;
		if (this.aClass15_25 == null) {
			this.anInt1778 = 0;
		} else {
			this.anInt1778 = this.aClass15_25.method512(16);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!eka;")
	public Class91 method1705(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_16;
		@Pc(16) Class91 local16;
		synchronized (this.aClass165_16) {
			local16 = (Class91) this.aClass165_16.method4389((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class15 local34 = this.aClass15_25;
		@Pc(43) byte[] local43;
		synchronized (this.aClass15_25) {
			local43 = this.aClass15_25.method517(arg0, 16);
		}
		local16 = new Class91();
		if (local43 != null) {
			local16.method2535(new Class3_Sub25(local43));
		}
		@Pc(65) Class165 local65 = this.aClass165_16;
		synchronized (this.aClass165_16) {
			this.aClass165_16.method4392(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
	public void method1706() {
		@Pc(12) Class165 local12 = this.aClass165_16;
		synchronized (this.aClass165_16) {
			this.aClass165_16.method4394(5);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public void method1707() {
		@Pc(6) Class165 local6 = this.aClass165_16;
		synchronized (this.aClass165_16) {
			this.aClass165_16.method4403();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public void method1708() {
		@Pc(6) Class165 local6 = this.aClass165_16;
		synchronized (this.aClass165_16) {
			this.aClass165_16.method4400();
		}
	}
}
