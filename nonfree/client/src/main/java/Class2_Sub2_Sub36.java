import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82) {
			@Pc(26) int[][] local26 = this.method3952(0, arg0);
			@Pc(30) int[] local30 = local26[2];
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local26[1];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local26[0];
			for (@Pc(52) int local52 = 0; local52 < Static54.anInt953; local52++) {
				local34[local52] = 4096 - local50[local52];
				local38[local52] = 4096 - local42[local52];
				local46[local52] = 4096 - local30[local52];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(26) int[] local26 = this.method3955(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static54.anInt953; local28++) {
				local11[local28] = 4096 - local26[local28];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean212 = arg0.method2122() == 1;
		}
	}
}
