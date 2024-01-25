import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class200 {

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!h;")
	private final Class125 aClass125_43 = new Class125(256);

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_19;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!n;")
	private final Interface11 anInterface11_10;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!gi;Lclient!n;)V")
	public Class200(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Interface11 arg1) {
		this.aClass42_Sub3_19 = arg0;
		this.anInterface11_10 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public void method4834() {
		this.aClass125_43.method3440();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method4836() {
		this.aClass125_43.method3447(5);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lclient!ob;")
	public Class79_Sub2 method4838(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass125_43.method3446((long) arg0);
		if (local12 != null) {
			return (Class79_Sub2) local12;
		} else if (this.anInterface11_10.method6213(arg0)) {
			@Pc(39) Class278 local39 = this.anInterface11_10.method6215(arg0);
			@Pc(48) int local48 = local39.aBoolean567 ? 64 : this.aClass42_Sub3_19.anInt3668;
			@Pc(101) Class79_Sub2 local101;
			if (local39.aBoolean575 && this.aClass42_Sub3_19.method5836()) {
				@Pc(113) float[] local113 = this.anInterface11_10.method6212(arg0, local48, local48, 0.7F);
				local101 = new Class79_Sub2(this.aClass42_Sub3_19, 3553, 34842, local48, local48, local39.aByte86 != 0, local113, 6408);
			} else {
				@Pc(68) int[] local68;
				if (local39.aBoolean569) {
					local68 = this.anInterface11_10.method6210(0.7F, local48, arg0, local48);
				} else {
					local68 = this.anInterface11_10.method6211(true, arg0, local48, local48, 0.7F);
				}
				local101 = new Class79_Sub2(this.aClass42_Sub3_19, 3553, 6408, local48, local48, local39.aByte86 != 0, local68, false);
			}
			local101.method2529(local39.aBoolean574, local39.aBoolean570);
			this.aClass125_43.method3437(local101, (long) arg0);
			return local101;
		} else {
			return null;
		}
	}
}
