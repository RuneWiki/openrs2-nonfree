import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub2_Sub26_Sub1 extends Class2_Sub2_Sub26 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3960(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass51_41.method1700(arg0);
		if (super.aClass51_41.aBoolean82 && this.method3301()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[0];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt4173 * (arg0 % super.anInt4173);
			for (@Pc(46) int local46 = 0; local46 < Static54.anInt953; local46++) {
				@Pc(59) int local59 = super.anIntArray681[local44 + local46 % super.anInt4183];
				local36[local46] = (local59 & 0xFF) << 4;
				local28[local46] = local59 >> 4 & 0xFF0;
				local32[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
