import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class86 {

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "Lclient!jda;")
	private final Class165 aClass165_19 = new Class165(64);

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "Lclient!aj;")
	private final Class15 aClass15_39;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;)V")
	public Class86(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		this.aClass15_39 = arg2;
		this.aClass15_39.method512(31);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IB)Lclient!nca;")
	public Class234 method2440(@OriginalArg(0) int arg0) {
		@Pc(6) Class165 local6 = this.aClass165_19;
		@Pc(21) Class234 local21;
		synchronized (this.aClass165_19) {
			local21 = (Class234) this.aClass165_19.method4389((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class15 local34 = this.aClass15_39;
		@Pc(45) byte[] local45;
		synchronized (this.aClass15_39) {
			local45 = this.aClass15_39.method517(arg0, 31);
		}
		local21 = new Class234();
		if (local45 != null) {
			local21.method5545(new Class3_Sub25(local45));
		}
		@Pc(67) Class165 local67 = this.aClass165_19;
		synchronized (this.aClass165_19) {
			this.aClass165_19.method4392(local21, (long) arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZ)V")
	public void method2443() {
		@Pc(2) Class165 local2 = this.aClass165_19;
		synchronized (this.aClass165_19) {
			this.aClass165_19.method4394(5);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	public void method2444() {
		@Pc(6) Class165 local6 = this.aClass165_19;
		synchronized (this.aClass165_19) {
			this.aClass165_19.method4403();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)V")
	public void method2445() {
		@Pc(6) Class165 local6 = this.aClass165_19;
		synchronized (this.aClass165_19) {
			this.aClass165_19.method4400();
		}
	}
}
