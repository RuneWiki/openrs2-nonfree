import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class237 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "Lclient!mf;")
	private final Class222 aClass222_35 = new Class222(256);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_23;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!fa;")
	private final Interface7 anInterface7_7;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!ok;Lclient!fa;)V")
	public Class237(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass134_Sub2_23 = arg0;
		this.anInterface7_7 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method4833() {
		this.aClass222_35.method4428();
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)Lclient!wn;")
	public Class40_Sub3 method4834(@OriginalArg(1) int arg0) {
		@Pc(12) Object local12 = this.aClass222_35.method4430((long) arg0);
		if (local12 != null) {
			return (Class40_Sub3) local12;
		} else if (this.anInterface7_7.method3871(arg0)) {
			@Pc(36) Class3 local36 = this.anInterface7_7.method3874(arg0);
			@Pc(45) int local45 = local36.aBoolean13 ? 64 : this.aClass134_Sub2_23.anInt6546;
			@Pc(103) Class40_Sub3 local103;
			if (local36.aBoolean6 && this.aClass134_Sub2_23.method6917()) {
				@Pc(117) float[] local117 = this.anInterface7_7.method3873(local45, 0.7F, arg0, local45);
				local103 = new Class40_Sub3(this.aClass134_Sub2_23, 3553, 34842, local45, local45, local36.aByte4 != 0, local117, 6408);
			} else {
				@Pc(70) int[] local70;
				if (!local36.aBoolean10 && Static471.method6446(local36.aByte7)) {
					local70 = this.anInterface7_7.method3869(local45, arg0, 0.7F, local45, true);
				} else {
					local70 = this.anInterface7_7.method3872(local45, local45, arg0, 0.7F);
				}
				local103 = new Class40_Sub3(this.aClass134_Sub2_23, 3553, 6408, local45, local45, local36.aByte4 != 0, local70, false);
			}
			local103.method5391(local36.aBoolean12, local36.aBoolean5);
			this.aClass222_35.method4434(local103, (long) arg0);
			return local103;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V")
	public void method4836() {
		this.aClass222_35.method4433(5);
	}
}
