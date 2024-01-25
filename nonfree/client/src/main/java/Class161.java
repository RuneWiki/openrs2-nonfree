import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class161 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!ad;")
	private final Class6 aClass6_27 = new Class6(256);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_29;

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!fa;")
	private final Interface3 anInterface3_8;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!vj;Lclient!fa;)V")
	public Class161(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass45_Sub3_29 = arg0;
		this.anInterface3_8 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public void method3884() {
		this.aClass6_27.method97(5);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Lclient!g;")
	public Class24_Sub1 method3886(@OriginalArg(0) int arg0) {
		@Pc(12) Object local12 = this.aClass6_27.method92((long) arg0);
		if (local12 != null) {
			return (Class24_Sub1) local12;
		} else if (this.anInterface3_8.method4774(arg0)) {
			@Pc(31) Class55 local31 = this.anInterface3_8.method4776(arg0);
			@Pc(40) int local40 = local31.aBoolean141 ? 64 : this.aClass45_Sub3_29.anInt9035;
			@Pc(95) Class24_Sub1 local95;
			if (local31.aBoolean146 && this.aClass45_Sub3_29.method7363()) {
				@Pc(107) float[] local107 = this.anInterface3_8.method4775(local40, local40, 0.7F, arg0);
				local95 = new Class24_Sub1(this.aClass45_Sub3_29, 3553, 34842, local40, local40, local31.aByte19 != 0, local107, 6408);
			} else {
				@Pc(65) int[] local65;
				if (!local31.aBoolean140 && Static375.method5509(local31.aByte16)) {
					local65 = this.anInterface3_8.method4779(local40, true, 0.7F, local40, arg0);
				} else {
					local65 = this.anInterface3_8.method4777(arg0, local40, 0.7F, local40);
				}
				local95 = new Class24_Sub1(this.aClass45_Sub3_29, 3553, 6408, local40, local40, local31.aByte19 != 0, local65, false);
			}
			local95.method824(local31.aBoolean148, local31.aBoolean145);
			this.aClass6_27.method106((long) arg0, local95);
			return local95;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	public void method3887() {
		this.aClass6_27.method102();
	}
}
