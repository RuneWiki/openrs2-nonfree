import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method4955(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3994(arg0);
		if (this.aClass150_41.aBoolean319) {
			@Pc(22) int[][] local22 = this.method4965(arg0, 0);
			@Pc(26) int[] local26 = local22[0];
			@Pc(30) int[] local30 = local22[1];
			@Pc(34) int[] local34 = local11[0];
			@Pc(38) int[] local38 = local22[2];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			for (@Pc(48) int local48 = 0; local48 < Static22.anInt421; local48++) {
				local34[local48] = 4096 - local26[local48];
				local42[local48] = 4096 - local30[local48];
				local46[local48] = 4096 - local38[local48];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.aBoolean430 = arg1.method3915() == 1;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(18) int[] local18 = this.method4954(arg0, 0);
			for (@Pc(20) int local20 = 0; local20 < Static22.anInt421; local20++) {
				local7[local20] = 4096 - local18[local20];
			}
		}
		return local7;
	}
}
