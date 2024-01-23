import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(22) int[][] local22 = this.method4600(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local22[1];
			@Pc(38) int[] local38 = local11[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			for (@Pc(48) int local48 = 0; local48 < Static281.anInt5558; local48++) {
				local42[local48] = 4096 - local26[local48];
				local46[local48] = 4096 - local34[local48];
				local38[local48] = 4096 - local30[local48];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(19) int[] local19 = this.method4601(arg0, 0);
			for (@Pc(21) int local21 = 0; local21 < Static281.anInt5558; local21++) {
				local7[local21] = 4096 - local19[local21];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}
}
