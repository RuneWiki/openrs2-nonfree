import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
	private int anInt1122;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
	private int anInt1120;

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "I")
	private int anInt1128;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt1122 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt1128 = arg1.method2933();
		} else if (arg0 == 2) {
			super.aBoolean175 = arg1.method2962() == 1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.anInt1120 = this.anInt1128 - this.anInt1122;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(26) int[][] local26 = this.method3017(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static53.anInt1184; local52++) {
				local38[local52] = this.anInt1122 + (this.anInt1120 * local30[local52] >> 12);
				local46[local52] = (local42[local52] * this.anInt1120 >> 12) + this.anInt1122;
				local50[local52] = this.anInt1122 + (local34[local52] * this.anInt1120 >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(29) int[] local29 = this.method3011(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static53.anInt1184; local31++) {
				local19[local31] = (this.anInt1120 * local29[local31] >> 12) + this.anInt1122;
			}
		}
		return local19;
	}
}
