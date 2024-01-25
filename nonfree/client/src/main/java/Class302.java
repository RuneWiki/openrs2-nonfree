import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class302 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!aj;")
	private final Class10 aClass10_54 = new Class10(64);

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!om;")
	private final Class246 aClass246_223;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!mea;ILclient!om;)V")
	public Class302(@OriginalArg(0) Class211 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2) {
		this.aClass246_223 = arg2;
		this.aClass246_223.method5673(5);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Lclient!bea;")
	public Class3_Sub3_Sub5 method6511(@OriginalArg(0) int arg0) {
		@Pc(6) Class10 local6 = this.aClass10_54;
		@Pc(16) Class3_Sub3_Sub5 local16;
		synchronized (this.aClass10_54) {
			local16 = (Class3_Sub3_Sub5) this.aClass10_54.method250((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_223;
		@Pc(38) byte[] local38;
		synchronized (this.aClass246_223) {
			local38 = this.aClass246_223.method5653(5, arg0);
		}
		local16 = new Class3_Sub3_Sub5();
		if (local38 != null) {
			local16.method635(new Class3_Sub11(local38));
		}
		@Pc(70) Class10 local70 = this.aClass10_54;
		synchronized (this.aClass10_54) {
			this.aClass10_54.method254(local16, (long) arg0);
			return local16;
		}
	}
}
