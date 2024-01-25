import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class125 {

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!mo;")
	private final Class160 aClass160_28 = new Class160(64);

	@OriginalMember(owner = "client!jo", name = "m", descriptor = "Lclient!nl;")
	private final Class171 aClass171_42;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class125(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_42 = arg2;
		if (this.aClass171_42 != null) {
			this.aClass171_42.method3750(11);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public void method2921() {
		@Pc(2) Class160 local2 = this.aClass160_28;
		synchronized (this.aClass160_28) {
			this.aClass160_28.method3595();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)Lclient!lg;")
	public Class144 method2922(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_28;
		@Pc(21) Class144 local21;
		synchronized (this.aClass160_28) {
			local21 = (Class144) this.aClass160_28.method3599((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(38) byte[] local38 = this.aClass171_42.method3745(11, arg0);
		local21 = new Class144();
		if (local38 != null) {
			local21.method3302(new Class2_Sub16(local38));
		}
		@Pc(54) Class160 local54 = this.aClass160_28;
		synchronized (this.aClass160_28) {
			this.aClass160_28.method3602((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public void method2924() {
		@Pc(11) Class160 local11 = this.aClass160_28;
		synchronized (this.aClass160_28) {
			this.aClass160_28.method3605();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V")
	public void method2925() {
		@Pc(6) Class160 local6 = this.aClass160_28;
		synchronized (this.aClass160_28) {
			this.aClass160_28.method3606(5);
		}
	}
}
