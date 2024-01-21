import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fa", name = "mb", descriptor = "I")
	private int anInt1220;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
	private int anInt1218;

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "I")
	private int anInt1215;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.anInt1218 = this.anInt1220 - this.anInt1215;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1215 = arg0.method878();
		} else if (arg1 == 1) {
			this.anInt1220 = arg0.method878();
		} else if (arg1 == 2) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(27) int[] local27 = this.method3130(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static110.anInt2825; local29++) {
				local17[local29] = (local27[local29] * this.anInt1218 >> 12) + this.anInt1215;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(22) int[][] local22 = this.method3118(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local12[0];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static110.anInt2825; local48++) {
				local38[local48] = (this.anInt1218 * local26[local48] >> 12) + this.anInt1215;
				local42[local48] = (this.anInt1218 * local30[local48] >> 12) + this.anInt1215;
				local46[local48] = (this.anInt1218 * local34[local48] >> 12) + this.anInt1215;
			}
		}
		return local12;
	}
}
