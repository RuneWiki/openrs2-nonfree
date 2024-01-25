import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class184 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!vg;")
	private final Class342 aClass342_117 = new Class342(256);

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!fa;")
	private final Interface4 anInterface4_9;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_27;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!er;Lclient!fa;)V")
	public Class184(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_9 = arg1;
		this.aClass31_Sub2_27 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public void method4594() {
		this.aClass342_117.method7697(5);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public void method4596() {
		this.aClass342_117.method7693();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lclient!wh;")
	public Class50_Sub1 method4598(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass342_117.method7684((long) arg0);
		if (local12 != null) {
			return (Class50_Sub1) local12;
		} else if (this.anInterface4_9.method7227(arg0)) {
			@Pc(31) Class172 local31 = this.anInterface4_9.method7229(arg0);
			@Pc(40) int local40 = local31.aBoolean358 ? 64 : this.aClass31_Sub2_27.anInt3130;
			@Pc(75) Class50_Sub1 local75;
			if (local31.aBoolean356 && this.aClass31_Sub2_27.method8085()) {
				@Pc(57) float[] local57 = this.anInterface4_9.method7230(local40, local40, 0.7F, arg0);
				local75 = new Class50_Sub1(this.aClass31_Sub2_27, 3553, 34842, local40, local40, local31.aByte59 != 0, local57, 6408);
			} else {
				@Pc(95) int[] local95;
				if (!local31.aBoolean351 && Static537.method7342(local31.aByte62)) {
					local95 = this.anInterface4_9.method7226(local40, arg0, true, local40, 0.7F);
				} else {
					local95 = this.anInterface4_9.method7228(0.7F, arg0, local40, local40);
				}
				local75 = new Class50_Sub1(this.aClass31_Sub2_27, 3553, 6408, local40, local40, local31.aByte59 != 0, local95, 0, 0, false);
			}
			local75.method1507(local31.aBoolean354, local31.aBoolean353);
			this.aClass342_117.method7683(local75, (long) arg0);
			return local75;
		} else {
			return null;
		}
	}
}
