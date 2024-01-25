import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class158 {

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!kh;")
	private final Class134 aClass134_37 = new Class134(64);

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "Lclient!ul;")
	public final Class246 aClass246_135;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!ul;")
	private final Class246 aClass246_134;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!ee;ILclient!ul;Lclient!ul;)V")
	public Class158(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Class246 arg3) {
		this.aClass246_135 = arg3;
		this.aClass246_134 = arg2;
		this.aClass246_134.method5492(3);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Lclient!ne;")
	public Class169 method3687(@OriginalArg(1) int arg0) {
		@Pc(6) Class134 local6 = this.aClass134_37;
		@Pc(16) Class169 local16;
		synchronized (this.aClass134_37) {
			local16 = (Class169) this.aClass134_37.method3266((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class246 local29 = this.aClass246_134;
		@Pc(40) byte[] local40;
		synchronized (this.aClass246_134) {
			local40 = this.aClass246_134.method5477(3, arg0);
		}
		local16 = new Class169();
		local16.aClass158_2 = this;
		if (local40 != null) {
			local16.method3867(new Class1_Sub5(local40));
		}
		@Pc(65) Class134 local65 = this.aClass134_37;
		synchronized (this.aClass134_37) {
			this.aClass134_37.method3263((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public void method3689() {
		@Pc(12) Class134 local12 = this.aClass134_37;
		synchronized (this.aClass134_37) {
			this.aClass134_37.method3270(5);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method3690() {
		@Pc(6) Class134 local6 = this.aClass134_37;
		synchronized (this.aClass134_37) {
			this.aClass134_37.method3267();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public void method3692() {
		@Pc(6) Class134 local6 = this.aClass134_37;
		synchronized (this.aClass134_37) {
			this.aClass134_37.method3272();
		}
	}
}
