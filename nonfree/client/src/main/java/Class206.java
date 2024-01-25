import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class206 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "Lclient!ub;")
	private final Class198 aClass198_237 = new Class198(256);

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!bk;")
	private final Interface3 anInterface3_7;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_37;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ig;Lclient!bk;)V")
	public Class206(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Interface3 arg1) {
		this.anInterface3_7 = arg1;
		this.aClass47_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!hf;")
	public Class52_Sub1 method5381(@OriginalArg(1) int arg0) {
		@Pc(6) Object local6 = this.aClass198_237.method5210((long) arg0);
		if (local6 != null) {
			return (Class52_Sub1) local6;
		} else if (this.anInterface3_7.method5439(arg0)) {
			@Pc(28) Class102 local28 = this.anInterface3_7.method5441(arg0);
			@Pc(35) int local35 = local28.aBoolean256 ? 64 : 128;
			@Pc(76) Class52_Sub1 local76;
			if (local28.aBoolean261 && this.aClass47_Sub2_37.method2757()) {
				@Pc(58) float[] local58 = this.anInterface3_7.method5438(arg0, 0.7F, local35, local35);
				local76 = new Class52_Sub1(this.aClass47_Sub2_37, 3553, 34842, local35, local35, local28.aByte42 != 0, local58, 6408);
			} else {
				@Pc(89) int[] local89 = this.anInterface3_7.method5440(0.7F, arg0, local35, local35);
				local76 = new Class52_Sub1(this.aClass47_Sub2_37, 3553, 6408, local35, local35, local28.aByte42 != 0, local89, false);
			}
			local76.method4734(local28.aBoolean262, local28.aBoolean259);
			this.aClass198_237.method5201(local76, (long) arg0);
			return local76;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public void method5382() {
		this.aClass198_237.method5213();
	}
}
