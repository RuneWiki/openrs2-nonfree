import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class2_Sub4_Sub18 extends Class2_Sub4 {

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(26) int[][] local26 = this.method5591(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static76.anInt1458; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(29) int[] local29 = this.method5600(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static76.anInt1458; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
