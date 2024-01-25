import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class379 {

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Lclient!oo;")
	private final Class264 aClass264_65 = new Class264(256);

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_12;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_43;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!qfa;Lclient!d;)V")
	public Class379(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_12 = arg1;
		this.aClass137_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)Lclient!km;")
	public Class66_Sub1 method9073(@OriginalArg(0) int arg0) {
		@Pc(17) Object local17 = this.aClass264_65.method6367((long) arg0);
		if (local17 != null) {
			return (Class66_Sub1) local17;
		} else if (this.anInterface3_12.method6181(arg0)) {
			@Pc(36) Class224 local36 = this.anInterface3_12.method6177(arg0);
			@Pc(45) int local45 = local36.aBoolean455 ? 64 : this.aClass137_Sub3_43.anInt8531;
			@Pc(80) Class66_Sub1 local80;
			if (local36.aBoolean452 && this.aClass137_Sub3_43.method7880()) {
				@Pc(62) float[] local62 = this.anInterface3_12.method6179(arg0, local45, 0.7F, local45);
				local80 = new Class66_Sub1(this.aClass137_Sub3_43, 3553, 34842, local45, local45, local36.aByte95 != 0, local62, 6408);
			} else {
				@Pc(101) int[] local101;
				if (local36.anInt6492 != 2 && Static220.method3435(local36.aByte96)) {
					local101 = this.anInterface3_12.method6180(local45, local45, true, arg0, 0.7F);
				} else {
					local101 = this.anInterface3_12.method6176(arg0, local45, local45, 0.7F);
				}
				local80 = new Class66_Sub1(this.aClass137_Sub3_43, 3553, 6408, local45, local45, local36.aByte95 != 0, local101, 0, 0, false);
			}
			local80.method1669(local36.aBoolean454, local36.aBoolean451);
			this.aClass264_65.method6364((long) arg0, local80);
			return local80;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)V")
	public void method9074() {
		this.aClass264_65.method6366(5);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public void method9076() {
		this.aClass264_65.method6360();
	}
}
