import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class67 {

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!qfa;")
	private final Class307 aClass307_22 = new Class307(64);

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "Lclient!ik;")
	private final Class182 aClass182_28;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!qh;ILclient!ik;)V")
	public Class67(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2) {
		this.aClass182_28 = arg2;
		if (this.aClass182_28 != null) {
			this.aClass182_28.method3970(54);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public void method1948() {
		@Pc(6) Class307 local6 = this.aClass307_22;
		synchronized (this.aClass307_22) {
			this.aClass307_22.method6998();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)Lclient!rla;")
	public Class329 method1952(@OriginalArg(1) int arg0) {
		@Pc(14) Class307 local14 = this.aClass307_22;
		@Pc(24) Class329 local24;
		synchronized (this.aClass307_22) {
			local24 = (Class329) this.aClass307_22.method7002((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class182 local38 = this.aClass182_28;
		@Pc(47) byte[] local47;
		synchronized (this.aClass182_28) {
			local47 = this.aClass182_28.method3985(arg0, 54);
		}
		local24 = new Class329();
		if (local47 != null) {
			local24.method7368(new Class3_Sub2(local47));
		}
		@Pc(71) Class307 local71 = this.aClass307_22;
		synchronized (this.aClass307_22) {
			this.aClass307_22.method7000(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	public void method1953() {
		@Pc(6) Class307 local6 = this.aClass307_22;
		synchronized (this.aClass307_22) {
			this.aClass307_22.method6995(5);
		}
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
	public void method1954() {
		@Pc(2) Class307 local2 = this.aClass307_22;
		synchronized (this.aClass307_22) {
			this.aClass307_22.method7006();
		}
	}
}
