import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(29) int[] local29 = this.method3130(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static110.anInt2825; local31++) {
				local19[local31] = 4096 - local29[local31];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(19) int[][] local19 = this.method3118(arg0, 0);
			@Pc(23) int[] local23 = local19[0];
			@Pc(27) int[] local27 = local19[1];
			@Pc(31) int[] local31 = local19[2];
			@Pc(35) int[] local35 = local9[0];
			@Pc(39) int[] local39 = local9[2];
			@Pc(43) int[] local43 = local9[1];
			for (@Pc(45) int local45 = 0; local45 < Static110.anInt2825; local45++) {
				local35[local45] = 4096 - local23[local45];
				local43[local45] = 4096 - local27[local45];
				local39[local45] = 4096 - local31[local45];
			}
		}
		return local9;
	}
}
