import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class4_Sub2_Sub33 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(28) int[][] local28 = this.method8202(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static417.anInt5248; local42++) {
				local11[local42] = (local40[local42] + local32[local42] + local36[local42]) / 3;
			}
		}
		return local11;
	}
}
