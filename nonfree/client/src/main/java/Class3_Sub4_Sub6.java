import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(28) int[][] local28 = this.method5962(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static106.anInt2356; local42++) {
				local11[local42] = (local40[local42] + local32[local42] + local36[local42]) / 3;
			}
		}
		return local11;
	}
}
