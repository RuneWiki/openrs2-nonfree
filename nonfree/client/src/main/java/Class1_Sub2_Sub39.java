import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	private int anInt4719 = 1024;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	private int anInt4717 = 2048;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
	private int anInt4718 = 3072;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(28) int[] local28 = this.method3514(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static105.anInt2391; local30++) {
				local12[local30] = this.anInt4719 + (local28[local30] * this.anInt4717 >> 12);
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4719 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt4718 = arg0.method946();
		} else if (arg1 == 2) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(26) int[][] local26 = this.method3501(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static105.anInt2391; local52++) {
				local42[local52] = (this.anInt4717 * local30[local52] >> 12) + this.anInt4719;
				local50[local52] = (this.anInt4717 * local34[local52] >> 12) + this.anInt4719;
				local46[local52] = (this.anInt4717 * local38[local52] >> 12) + this.anInt4719;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.anInt4717 = this.anInt4718 - this.anInt4719;
	}
}
