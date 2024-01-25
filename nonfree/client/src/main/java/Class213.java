import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class213 {

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "Lclient!uf;")
	private final Class326 aClass326_28 = new Class326(256);

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "Lclient!fa;")
	private final Interface5 anInterface5_7;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_24;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Lclient!ag;Lclient!fa;)V")
	public Class213(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Interface5 arg1) {
		this.anInterface5_7 = arg1;
		this.aClass12_Sub1_24 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
	public void method4885() {
		this.aClass326_28.method7230();
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)V")
	public void method4886() {
		this.aClass326_28.method7241(5);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZI)Lclient!dga;")
	public Class52_Sub1 method4887(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass326_28.method7238((long) arg0);
		if (local12 != null) {
			return (Class52_Sub1) local12;
		} else if (this.anInterface5_7.method4045(arg0)) {
			@Pc(31) Class45 local31 = this.anInterface5_7.method4043(arg0);
			@Pc(40) int local40 = local31.aBoolean124 ? 64 : this.aClass12_Sub1_24.anInt441;
			@Pc(75) Class52_Sub1 local75;
			if (local31.aBoolean120 && this.aClass12_Sub1_24.method6451()) {
				@Pc(57) float[] local57 = this.anInterface5_7.method4044(local40, 0.7F, arg0, local40);
				local75 = new Class52_Sub1(this.aClass12_Sub1_24, 3553, 34842, local40, local40, local31.aByte27 != 0, local57, 6408);
			} else {
				@Pc(95) int[] local95;
				if (!local31.aBoolean121 && Static97.method5064(local31.aByte25)) {
					local95 = this.anInterface5_7.method4048(arg0, local40, true, 0.7F, local40);
				} else {
					local95 = this.anInterface5_7.method4047(local40, local40, 0.7F, arg0);
				}
				local75 = new Class52_Sub1(this.aClass12_Sub1_24, 3553, 6408, local40, local40, local31.aByte27 != 0, local95, false);
			}
			local75.method1504(local31.aBoolean122, local31.aBoolean125);
			this.aClass326_28.method7236(local75, (long) arg0);
			return local75;
		} else {
			return null;
		}
	}
}
