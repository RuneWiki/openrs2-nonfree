import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cca", name = "E", descriptor = "I")
	private int anInt983 = 0;

	@OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
	private int anInt986 = 4096;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(26) int[] local26 = this.method8821(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static314.anInt6320; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt983 && local34 <= this.anInt986 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt983 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt986 = arg0.method8631();
		}
	}
}
