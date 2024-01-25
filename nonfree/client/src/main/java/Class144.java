import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class144 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!al;")
	private final Class11 aClass11_89 = new Class11(256);

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_25;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!ah;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!sq;Lclient!ah;)V")
	public Class144(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Interface2 arg1) {
		this.aClass46_Sub2_25 = arg0;
		this.anInterface2_3 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method3784() {
		this.aClass11_89.method213();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lclient!ai;")
	public Class8_Sub1 method3785(@OriginalArg(0) int arg0) {
		@Pc(6) Object local6 = this.aClass11_89.method209((long) arg0);
		if (local6 != null) {
			return (Class8_Sub1) local6;
		} else if (this.anInterface2_3.method117(arg0)) {
			@Pc(33) Class154 local33 = this.anInterface2_3.method116(arg0);
			@Pc(40) int local40 = local33.aBoolean292 ? 64 : 128;
			@Pc(78) Class8_Sub1 local78;
			if (local33.aBoolean287 && this.aClass46_Sub2_25.method5151()) {
				@Pc(89) float[] local89 = this.anInterface2_3.method118(arg0, local40, 0.7F, local40);
				local78 = new Class8_Sub1(this.aClass46_Sub2_25, 3553, 34842, local40, local40, local33.aByte47 != 0, local89, 6408);
			} else {
				@Pc(59) int[] local59 = this.anInterface2_3.method115(arg0, local40, 0.7F, local40);
				local78 = new Class8_Sub1(this.aClass46_Sub2_25, 3553, 6408, local40, local40, local33.aByte47 != 0, local59, false);
			}
			local78.method3370(local33.aBoolean290, local33.aBoolean288);
			this.aClass11_89.method219((long) arg0, local78);
			return local78;
		} else {
			return null;
		}
	}
}
