import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class29 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!lg;")
	private final Class119 aClass119_23 = new Class119(256);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!ul;")
	private final Interface7 anInterface7_2;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ao;Lclient!ul;)V")
	public Class29(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Interface7 arg1) {
		this.aClass4_Sub1_2 = arg0;
		this.anInterface7_2 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method862() {
		this.aClass119_23.method3304();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!rj;")
	public Class124_Sub2 method863(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass119_23.method3311((long) arg0);
		if (local6 != null) {
			return (Class124_Sub2) local6;
		} else if (this.anInterface7_2.method5780(arg0)) {
			@Pc(27) Class213 local27 = this.anInterface7_2.method5778(arg0);
			@Pc(34) int local34 = local27.aBoolean609 ? 64 : 128;
			@Pc(72) Class124_Sub2 local72;
			if (local27.aBoolean611 && this.aClass4_Sub1_2.method4240()) {
				@Pc(53) float[] local53 = this.anInterface7_2.method5779(local34, arg0, local34, 0.7F);
				local72 = new Class124_Sub2(this.aClass4_Sub1_2, 3553, 34842, local34, local34, local27.aByte74 != 0, local53, 6408);
			} else {
				@Pc(85) int[] local85 = this.anInterface7_2.method5781(arg0, local34, 0.7F, local34);
				local72 = new Class124_Sub2(this.aClass4_Sub1_2, 3553, 6408, local34, local34, local27.aByte74 != 0, local85, false);
			}
			local72.method4995(local27.aBoolean610, local27.aBoolean613);
			this.aClass119_23.method3308(local72, (long) arg0);
			return local72;
		} else {
			return null;
		}
	}
}
