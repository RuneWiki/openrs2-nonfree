import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class52 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Lclient!jda;")
	private final Class165 aClass165_13 = new Class165(64);

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!aj;")
	private final Class15 aClass15_18;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!dd;")
	public final Class72 aClass72_1;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!gia;ILclient!aj;Lclient!dd;)V")
	public Class52(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) Class72 arg3) {
		this.aClass15_18 = arg2;
		this.aClass15_18.method512(32);
		this.aClass72_1 = arg3;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public void method1307() {
		@Pc(2) Class165 local2 = this.aClass165_13;
		synchronized (this.aClass165_13) {
			this.aClass165_13.method4403();
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
	public void method1311() {
		@Pc(6) Class165 local6 = this.aClass165_13;
		synchronized (this.aClass165_13) {
			this.aClass165_13.method4400();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V")
	public void method1312() {
		@Pc(10) Class165 local10 = this.aClass165_13;
		synchronized (this.aClass165_13) {
			this.aClass165_13.method4394(5);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)Lclient!vb;")
	public Class359 method1313(@OriginalArg(1) int arg0) {
		@Pc(14) Class165 local14 = this.aClass165_13;
		@Pc(24) Class359 local24;
		synchronized (this.aClass165_13) {
			local24 = (Class359) this.aClass165_13.method4389((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class15 local37 = this.aClass15_18;
		@Pc(46) byte[] local46;
		synchronized (this.aClass15_18) {
			local46 = this.aClass15_18.method517(arg0, 32);
		}
		local24 = new Class359();
		local24.aClass52_2 = this;
		if (local46 != null) {
			local24.method8769(new Class3_Sub25(local46));
		}
		@Pc(71) Class165 local71 = this.aClass165_13;
		synchronized (this.aClass165_13) {
			this.aClass165_13.method4392(local24, (long) arg0);
			return local24;
		}
	}
}
