import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
	private int anInt1788 = 4096;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1788 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(30) int[] local30 = this.method3514(Static92.anInt2170 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method3514(arg0, 0);
			@Pc(48) int[] local48 = this.method3514(arg0 + 1 & Static92.anInt2170, 0);
			for (@Pc(50) int local50 = 0; local50 < Static105.anInt2391; local50++) {
				@Pc(72) int local72 = this.anInt1788 * (local36[local50 + 1 & Static32.anInt814] - local36[local50 - 1 & Static32.anInt814]);
				@Pc(83) int local83 = this.anInt1788 * (local48[local50] - local30[local50]);
				@Pc(87) int local87 = local72 >> 12;
				@Pc(91) int local91 = local83 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local97 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(129) int local129 = local118 == 0 ? 0 : 16777216 / local118;
				local11[local50] = 4096 - local129;
			}
		}
		return local11;
	}
}
