import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class171 {

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "Lclient!oo;")
	private final Class264 aClass264_29 = new Class264(256);

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_8;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lclient!d;")
	private final Interface3 anInterface3_4;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!pj;Lclient!d;)V")
	public Class171(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) Interface3 arg1) {
		this.aClass137_Sub1_8 = arg0;
		this.anInterface3_4 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public void method3748() {
		this.aClass264_29.method6366(5);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public void method3749() {
		this.aClass264_29.method6360();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lclient!oga;")
	public Interface21 method3750(@OriginalArg(1) int arg0) {
		@Pc(18) Object local18 = this.aClass264_29.method6367((long) arg0);
		if (local18 != null) {
			return (Interface21) local18;
		} else if (this.anInterface3_4.method6181(arg0)) {
			@Pc(37) Class224 local37 = this.anInterface3_4.method6177(arg0);
			@Pc(46) int local46 = local37.aBoolean455 ? 64 : this.aClass137_Sub1_8.anInt9736;
			@Pc(98) Interface21 local98;
			if (local37.aBoolean452 && this.aClass137_Sub1_8.method7880()) {
				@Pc(112) float[] local112 = this.anInterface3_4.method6179(arg0, local46, 0.7F, local46);
				local98 = this.aClass137_Sub1_8.method8055(local46, local46, Static238.aClass363_4, local112, local37.aByte95 != 0);
			} else {
				@Pc(72) int[] local72;
				if (local37.anInt6492 != 2 && Static220.method3435(local37.aByte96)) {
					local72 = this.anInterface3_4.method6180(local46, local46, true, arg0, 0.7F);
				} else {
					local72 = this.anInterface3_4.method6176(arg0, local46, local46, 0.7F);
				}
				local98 = this.aClass137_Sub1_8.method7982(local37.aByte95 != 0, local46, local72, local46);
			}
			local98.method9033(local37.aBoolean451, local37.aBoolean454);
			this.aClass264_29.method6364((long) arg0, local98);
			return local98;
		} else {
			return null;
		}
	}
}
