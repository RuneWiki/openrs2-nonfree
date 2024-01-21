import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(31) int[] local31 = this.method3580(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static115.anInt2578; local33++) {
				local19[local33] = 4096 - local31[local33];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(22) int[][] local22 = this.method3579(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local22[2];
			@Pc(38) int[] local38 = local12[0];
			@Pc(42) int[] local42 = local12[1];
			@Pc(46) int[] local46 = local12[2];
			for (@Pc(48) int local48 = 0; local48 < Static115.anInt2578; local48++) {
				local38[local48] = 4096 - local26[local48];
				local42[local48] = 4096 - local30[local48];
				local46[local48] = 4096 - local34[local48];
			}
		}
		return local12;
	}
}
