import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class1_Sub4_Sub39 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(26) int[][] local26 = this.method5696(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static395.anInt6592; local52++) {
				local42[local52] = 4096 - local30[local52];
				local46[local52] = 4096 - local34[local52];
				local50[local52] = 4096 - local38[local52];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(29) int[] local29 = this.method5695(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static395.anInt6592; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}
}
