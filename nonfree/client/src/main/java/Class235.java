import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class235 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!mo;")
	private final Class160 aClass160_59 = new Class160(128);

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Lclient!nl;")
	private final Class171 aClass171_95;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;)V")
	public Class235(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_95 = arg2;
		if (this.aClass171_95 != null) {
			@Pc(20) int local20 = this.aClass171_95.method3770() - 1;
			this.aClass171_95.method3750(local20);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)Lclient!mj;")
	public Class159 method5390(@OriginalArg(0) int arg0) {
		@Pc(6) Class160 local6 = this.aClass160_59;
		@Pc(16) Class159 local16;
		synchronized (this.aClass160_59) {
			local16 = (Class159) this.aClass160_59.method3599((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(45) byte[] local45 = this.aClass171_95.method3745(Static259.method4012(arg0), Static85.method1518(arg0));
		local16 = new Class159();
		if (local45 != null) {
			local16.method3550(new Class2_Sub16(local45));
		}
		@Pc(61) Class160 local61 = this.aClass160_59;
		synchronized (this.aClass160_59) {
			this.aClass160_59.method3602((long) arg0, local16);
			return local16;
		}
	}
}
